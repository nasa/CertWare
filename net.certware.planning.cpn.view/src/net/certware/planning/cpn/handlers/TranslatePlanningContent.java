package net.certware.planning.cpn.handlers;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.planning.cpn.cpnDsl.Allocation;
import net.certware.planning.cpn.cpnDsl.Plan;
import net.certware.planning.cpn.cpnDsl.Plans;
import net.certware.planning.cpn.view.Activator;
import net.certware.planning.cpn.view.preferences.PreferenceConstants;
import net.certware.planning.mspdi.AssignmentType;
import net.certware.planning.mspdi.AssignmentsType;
import net.certware.planning.mspdi.ConstraintTypeType;
import net.certware.planning.mspdi.DocumentRoot;
import net.certware.planning.mspdi.DurationFormatType4;
import net.certware.planning.mspdi.EarnedValueMethodType;
import net.certware.planning.mspdi.FixedCostAccrualType;
import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.OvertimeRateFormatType1;
import net.certware.planning.mspdi.ProjectType;
import net.certware.planning.mspdi.ResourceType;
import net.certware.planning.mspdi.ResourcesType;
import net.certware.planning.mspdi.StandardRateFormatType1;
import net.certware.planning.mspdi.TaskType;
import net.certware.planning.mspdi.TasksType;
import net.certware.planning.mspdi.TypeType2;
import net.certware.planning.mspdi.TypeType3;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * Translate CPN planning tasks and resources into Microsoft Project MSPDI format.
 * Presumes the input selection is a CPN file resource.
 * Output goes to MSPDI resource with {@code *.mspdi} extension.
 * @author mrb
 * @since 1.1
 */
public class TranslatePlanningContent implements ICertWareConstants {

	/** model file encoding as XML resource */
	private static final String FILE_ENCODING = "UTF-8";
	/** default author tag for output */
	private static final String AUTHOR_TAG = "CertWare Conversion from CPN";
	/** default resource tag for output */
	private static final String RESOURCE_NOTES_TAG = "CertWare Conversion from CPN";
	/** default assignment tag for output */
	private static final String ASSIGNMENT_NOTES_TAG = "CertWare Conversion from CPN";
	/** default task notes tag for output */
	private static final String TASK_NOTES_TAG = "Generated without calendars";
	/** default task priority, based on OP example */
	private static final int TASK_PRIORITY = 500;
	/** data type factory for XML durations */
	DatatypeFactory datatypeFactory;
	/** task counter, reset with each construction */
	private int taskCounter = 1;
	/** resource counter, reset with each construction */
	private int resourceCounter = 1;
	/** assignment counter, reset with each construction */
	private int assignmentCounter = 1;

	/**
	 * Constructor creates the data type factory for XML fields.
	 */
	public TranslatePlanningContent() {
		taskCounter = 1;
		resourceCounter = 1;
		assignmentCounter = 1;
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			CertWareLog.logError("Configuring planning translator datatype factory", e);
		}
	}


	/**
	 * Creates a project type record from the factory.
	 * Populates it with default values from this action.
	 * @param selectedFile selected CPN source file to translate
	 * @return project type
	 */
	private ProjectType createProjectType(IFile selectedFile) {
		ProjectType projectType = MspdiFactory.eINSTANCE.createProjectType();
		projectType.setActualsInSync(false);
		projectType.setAuthor(AUTHOR_TAG);
		projectType.setName(selectedFile.getName());
		projectType.setProjectExternallyEdited(true);
		return projectType;
	}

	/**
	 * Process the planning notation content.
	 * @param selectedProject selected project, presumably an object contribution selection
	 * @throws CoreException 
	 * @throws IOException
	 */
	public void processPlan(IFile selectedFile,IProgressMonitor monitor) throws CoreException, IOException {

		Plans selectedPlans = null;

		// check that input is provided
		if ( selectedFile == null ) {
			CertWareLog.logWarning("Selected file not provided to plan conversion action.");
			return;
		}

		// create an empty MSPDI model then populate it
		final DocumentRoot outputPlan = MspdiFactory.eINSTANCE.createDocumentRoot();
		final ProjectType outputProject = createProjectType(selectedFile);
		outputPlan.setProject(outputProject);

		// load the selected model
		try {
			// load the XML file through the EMF resource set implementation
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true), true);
			selectedPlans = (Plans)resource.getContents().get(0);
		} catch( Exception exception ) {
			CertWareLog.logError(String.format("%s %s", 
					"Document root null loading" + selectedFile.getName()), 
					exception);
			return;
		}

		// iterate over the selected CPN model to populate the MSPDI model
		if ( selectedPlans.getPlans() == null || selectedPlans.getPlans().size() < 1 ) {
			CertWareLog.logWarning(String.format("%s %s","Selected CPN file contains no plans",selectedFile.getName()));
			return;
		}

		monitor.beginTask("Processing plan tasks and resources", selectedPlans.getPlans().size());
		for ( Plan inputPlan : selectedPlans.getPlans() ) {
			processInputPlan(inputPlan,outputProject,monitor);
			monitor.worked(1);
			if ( monitor.isCanceled() ) {
				return;
			}
		} 

		// write the resulting model to an MSP file
		// expecting preference to have no extension, so add it if necessary
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String fileName = store.getString(PreferenceConstants.P_FILENAME_MSP);
		if ( fileName == null || fileName.isEmpty() ) {
			fileName = selectedFile.getName();
			int lio = fileName.lastIndexOf('.');
			if ( lio > 0 ) {
				fileName = fileName.substring(0,lio);
			}
		}
		if ( fileName.endsWith( ICertWareConstants.MSPDI_EXTENSION) == false ) {
			fileName = fileName + '.' + ICertWareConstants.MSPDI_EXTENSION;
		}

		// fully specify the path to the new file given the container
		IContainer selectedContainer = selectedFile.getParent();
		final String modelFile = 
			selectedContainer.getFullPath().toPortableString() + IPath.SEPARATOR + fileName; 

		// create the resource in a workspace modify operation
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor progressMonitor) {
				try {
					// create a resource set and resource for a new file
					ResourceSet resourceSet = new ResourceSetImpl();
					URI fileURI = URI.createPlatformResourceURI(modelFile, true);
					Resource resource = resourceSet.createResource(fileURI);
					resource.getContents().add(outputPlan);

					// save the contents of the resource to the file system
					Map<Object, Object> options = new HashMap<Object, Object>();
					options.put(XMLResource.OPTION_ENCODING, FILE_ENCODING);
					resource.save(options);
				}
				catch (Exception e) {
					CertWareLog.logError(String.format("%s %s","Saving MSPDI file",modelFile),e);
				}
			}
		};

		// modify the workspace
		try {
			operation.run(monitor);
		} catch (Exception e) {
			CertWareLog.logError(String.format("%s %s","Modifying workspace for",
					selectedFile.getName()),e);
		}

		monitor.done();
	}

	/**
	 * Process a plan.  For each resource and task add it to the output model.
	 * @param inputPlan from selected file
	 * @param outputProject destination project model
	 * @param monitor progress monitor
	 */
	private void processInputPlan(Plan inputPlan, ProjectType outputProject, IProgressMonitor monitor) {
		if (inputPlan == null || outputProject == null ) {
			return;
		}

		processTasks(inputPlan,outputProject,monitor);
		processResources(inputPlan,outputProject,monitor);
		processAssignments(inputPlan,outputProject,monitor);
	}

	/**
	 * Process resource to task assignments.  For each assignment add it to the output model.
	 * Uses actual resource record for the assignment.
	 * @param inputPlan input plan with both tasks and resources
	 * @param outputProject output plan, updated to also contain assignments if necessary
	 * @param monitor progress monitor
	 */
	private void processAssignments(Plan inputPlan, ProjectType outputProject, IProgressMonitor monitor) {
		if ( inputPlan == null || outputProject == null ) {
			return;
		}
		
		AssignmentsType assignments = outputProject.getAssignments();
		if ( assignments == null ) {
			assignments = MspdiFactory.eINSTANCE.createAssignmentsType();
			outputProject.setAssignments(assignments);
		}

		// assignments made with actuals records
		Allocation actual = inputPlan.getActual();
		String facility = actual.getFacility();
		String team = actual.getTeam();
		String id = inputPlan.getId();
		
		addAssignment(id,facility,outputProject);
		addAssignment(id,team,outputProject);
	}

	/**
	 * Adds an assignment between task and resource.
	 * Increments assignment counter if new assignment added to model.
	 * @param taskName task name, used to find UID
	 * @param resourceName resource name, used to find UID
	 * @param outputProject project model
	 */
	private void addAssignment(String taskName, String resourceName,ProjectType outputProject) {
		ResourceType r = findResourceByName(resourceName,outputProject);
		TaskType t = findTaskByName(taskName,outputProject);
		if ( r != null && t != null ) {
			
			// if assignment already made, move on without creating new assignment
			for ( AssignmentType a : outputProject.getAssignments().getAssignment() ) {
				if ( a.getResourceUID().equals(r.getUID()) && a.getTaskUID().equals(t.getUID())) {
					return;
				}
			}
			
			// create new assignment
			AssignmentType assignment = MspdiFactory.eINSTANCE.createAssignmentType();
			assignment.setUID(BigInteger.valueOf(assignmentCounter));
			assignment.setResourceUID(r.getUID());
			assignment.setTaskUID(t.getUID());
			assignment.setNotes(ASSIGNMENT_NOTES_TAG);
			outputProject.getAssignments().getAssignment().add(assignment);
			assignmentCounter++;
		}
	}

	/**
	 * Searches resource list for resource by name.
	 * @param name resource name
	 * @param outputProject project container with resources
	 * @return resource object or null
	 */
	private ResourceType findResourceByName(String name,ProjectType outputProject) {
		if ( outputProject == null || name == null || outputProject.getResources() == null ) {
			return null;
		}
		for ( ResourceType r : outputProject.getResources().getResource() ) {
			if ( name.equalsIgnoreCase(r.getName())) {
				return r;
			}
		}
		return null;
	}
	
	/**
	 * Searches tasks list for task by name.
	 * @param name task name
	 * @param outputProject project container with tasks
	 * @return task object or null
	 */
	private TaskType findTaskByName(String name,ProjectType outputProject) {
		if ( outputProject == null || name == null || outputProject.getTasks() == null ) {
			return null;
		}
		for ( TaskType t : outputProject.getTasks().getTask() ) {
			if ( name.equalsIgnoreCase(t.getName())) {
				return t;
			}
		}
		return null;
		
	}
	
	/**
	 * Process a plan task.
	 * Uses the cost and duration fields as targets for the estimated cost and duration input.
	 * Uses the actual cost and actual duration fields as targets for the actual cost and actual duration input.
	 * @param inputPlan from selected file
	 * @param outputProject destination project model
	 * @param monitor progress monitor
	 */
	private void processTasks(Plan inputPlan, ProjectType outputProject, IProgressMonitor monitor) {
		// ensure the output has a tasks collector
		TasksType outputTasks = outputProject.getTasks();
		if ( outputTasks == null ) {
			outputTasks = MspdiFactory.eINSTANCE.createTasksType();
			outputProject.setTasks( outputTasks );
		}

		// create a new task
		TaskType outputTask = MspdiFactory.eINSTANCE.createTaskType();

		// estimate content
		Allocation estimated = inputPlan.getEstimated();
		if ( estimated != null ) {
			Duration duration = datatypeFactory.newDurationDayTime(true, 0, estimated.getDuration(), 0, 0);
			outputTask.setEstimated(true);
			outputTask.setCost(BigDecimal.valueOf( estimated.getCost() ));
			outputTask.setDuration( duration );
		}

		// actual content
		Allocation actual = inputPlan.getActual();
		if ( actual != null ) {
			Duration duration = datatypeFactory.newDurationDayTime(true, 0, actual.getDuration(), 0, 0);
			Duration none = datatypeFactory.newDurationDayTime(true, 0, 0, 0, 0);
			outputTask.setActualCost( BigDecimal.valueOf(actual.getCost()) );
			outputTask.setActualDuration( duration );
			outputTask.setActualOvertimeCost(BigDecimal.valueOf(0));
			outputTask.setActualOvertimeWork(none);
		}

		// other task attributes
		outputTask.setUID(BigInteger.valueOf(taskCounter));
		outputTask.setID(BigInteger.valueOf(taskCounter));
		outputTask.setName( inputPlan.getId() );
		outputTask.setType(TypeType3._0); // based on OP export
		outputTask.setIsNull(false);
		outputTask.setOutlineLevel(BigInteger.valueOf(1));
		outputTask.setPriority(BigInteger.valueOf(TASK_PRIORITY));
		//outputTask.setStart(value); no calendars available
		//outputTask.setDuration(value); done in the actuals calc
		outputTask.setDurationFormat(DurationFormatType4._5); // based on OP export
		// outputTask.setWork(value);
		outputTask.setResumeValid(false);
		outputTask.setEffortDriven(false);
		outputTask.setRecurring(false);
		outputTask.setOverAllocated(false);
		// outputTask.setEstimated(true); done in the estimated calc
		outputTask.setMilestone(false);
		outputTask.setSummary(false);
		outputTask.setCritical(true);
		outputTask.setIsSubproject(false);
		outputTask.setIsSubprojectReadOnly(false);
		outputTask.setExternalTask(false);
		outputTask.setStartVariance(BigInteger.valueOf(5280000));
		outputTask.setFinishVariance(BigInteger.valueOf(0));
		outputTask.setWorkVariance(0.0f);
		outputTask.setFreeSlack(BigInteger.valueOf(0));
		outputTask.setTotalSlack(BigInteger.valueOf(0));
		outputTask.setFixedCost(0.0f);
		outputTask.setFixedCostAccrual(FixedCostAccrualType._3); // based on OP export
		outputTask.setPercentComplete(BigInteger.valueOf(0));
		outputTask.setPercentWorkComplete(BigInteger.valueOf(0));
		// outputTask.setCost(value); done in cost calcs
		outputTask.setOvertimeCost(BigDecimal.valueOf(0));
		outputTask.setOvertimeWork(datatypeFactory.newDurationDayTime(true, 0, 0, 0, 0));
		// outputTask.setActualStart(value); no calendars available
		// outputTask.setActualDuration(value); done in actual calc
		// outputTask.setActualCost(value); done in actual calc
		// outputTask.setActualOvertimeCost(BigDecimal.valueOf(0)); done in actual cost
		// outputTask.setActualWork(value);
		// outputTask.setActualOvertimeWork(value); done in actual calc
		outputTask.setRegularWork(datatypeFactory.newDuration(0));
		outputTask.setRemainingDuration(datatypeFactory.newDuration(0));
		outputTask.setRemainingCost(BigDecimal.valueOf(0));
		outputTask.setRemainingWork(datatypeFactory.newDuration(0));
		outputTask.setRemainingOvertimeCost(BigDecimal.valueOf(0));
		outputTask.setRemainingWork(datatypeFactory.newDuration(0));
		outputTask.setActualCost(BigDecimal.valueOf(0));
		outputTask.setCV(0.0f);
		outputTask.setConstraintType(ConstraintTypeType._7); // based on OP
		outputTask.setCalendarUID(BigInteger.valueOf(-1)); // based on OP
		// outputTask.setConstraintDate(value); // no calendars
		outputTask.setLevelAssignments(false);
		outputTask.setLevelingCanSplit(false);
		outputTask.setIgnoreResourceCalendar(false);
		outputTask.setNotes(TASK_NOTES_TAG);
		outputTask.setHideBar(false);
		outputTask.setRollup(false);
		outputTask.setBCWS(0.0f);
		outputTask.setBCWP(0.0f);
		outputTask.setEarnedValueMethod(EarnedValueMethodType._0); // based on OP
		outputTask.setActualWorkProtected(datatypeFactory.newDuration(0));
		outputTask.setActualOvertimeWorkProtected(datatypeFactory.newDuration(0));
		// no baselines added

		taskCounter++;

		// add it to the list
		outputTasks.getTask().add(outputTask);
	}

	/**
	 * Process a plan resource.
	 * @param inputPlan from selected file
	 * @param outputProject destination project model
	 * @param monitor progress monitor
	 */
	private void processResources(Plan inputPlan, ProjectType outputProject, IProgressMonitor monitor) {
		// ensure the output has a resources collector
		ResourcesType outputResources = outputProject.getResources();
		if ( outputResources == null ) {
			outputResources = MspdiFactory.eINSTANCE.createResourcesType();
			outputProject.setResources( outputResources );
		}

		// add actual and estimated resources to the resource list
		processResourceAllocation(inputPlan.getActual(),outputResources);
		processResourceAllocation(inputPlan.getEstimated(),outputResources);
	}

	/**
	 * Creates a new resource using the factory, populates its fields.
	 * If resource name is already in the resources list, or the name is empty, returns without doing anything.
	 * Adds the new resource to the given resources list.
	 * @param name resource name
	 * @param resources resources list
	 */
	private void processNewResource(String name, ResourcesType resources) {
		if ( resourceExists(name,resources) == true ) {
			return;
		}

		ResourceType outputResource = MspdiFactory.eINSTANCE.createResourceType();

		outputResource.setUID(BigInteger.valueOf(resourceCounter));
		outputResource.setID(BigInteger.valueOf(resourceCounter));
		outputResource.setName(name); // set resource type TypeType2 as well?
		outputResource.setMaxUnits(1.0f);
		outputResource.setPeakUnits(1.0f);
		outputResource.setCanLevel(false);
		outputResource.setType(TypeType2._0); // based on OP export
		outputResource.setIsNull(false);
		outputResource.setOverAllocated(false);
		outputResource.setStandardRateFormat(StandardRateFormatType1._3); // based on OP export
		outputResource.setOvertimeRateFormat(OvertimeRateFormatType1._3); // based on OP export
		outputResource.setWork(datatypeFactory.newDuration(0));
		outputResource.setWorkVariance(0.0f);
		outputResource.setPercentWorkComplete(BigInteger.valueOf(0));
		outputResource.setOvertimeCost(BigDecimal.valueOf(0));
		outputResource.setOvertimeWork(datatypeFactory.newDurationDayTime(true, 0, 0, 0, 0));
		outputResource.setRegularWork(datatypeFactory.newDuration(0));
		outputResource.setRemainingCost(BigDecimal.valueOf(0));
		outputResource.setRemainingWork(datatypeFactory.newDuration(0));
		outputResource.setRemainingOvertimeCost(BigDecimal.valueOf(0));
		outputResource.setRemainingWork(datatypeFactory.newDuration(0));
		outputResource.setActualCost(BigDecimal.valueOf(0));
		outputResource.setCost(BigDecimal.valueOf(0));
		outputResource.setCostPerUse(BigDecimal.valueOf(0));
		outputResource.setACWP(0.0f);
		outputResource.setSV(0.0f);
		outputResource.setCV(0.0f);
		outputResource.setBCWS(0.0f);
		outputResource.setBCWP(0.0f);
		outputResource.setCalendarUID(BigInteger.valueOf(2)); // based on OP
		outputResource.setNotes(RESOURCE_NOTES_TAG);
		outputResource.setActualWorkProtected(datatypeFactory.newDuration(0));
		outputResource.setActualOvertimeWorkProtected(datatypeFactory.newDuration(0));
		outputResource.setIsGeneric(false);
		outputResource.setIsInactive(false);
		// no baselines added

		resources.getResource().add(outputResource);
		resourceCounter++; 
	}

	/**
	 * Given an allocation, create resource records for the team and facility.
	 * @param a allocation
	 * @param resources resource list, adding new resources to the list if allocation fields missing
	 */
	private void processResourceAllocation(Allocation a, ResourcesType resources) {
		if ( a != null ) {
			processNewResource(a.getFacility(),resources);
			processNewResource(a.getTeam(),resources);
		}
	}

	/**
	 * Determines whether resource name is already in the resources list, matching name field.
	 * @param name resource name, returns true if name is null or empty
	 * @param resources resource list
	 * @return true if name string matches, ignoring case
	 */
	private boolean resourceExists(String name, ResourcesType resources) {
		if ( name == null || name.isEmpty() )
			return true;
		for ( ResourceType r : resources.getResource()) {
			if ( name.equalsIgnoreCase(r.getName())) {
				return true;
			}
		}
		return false;
	}

}
