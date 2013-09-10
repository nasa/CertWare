package net.certware.measurement.spm.view.handlers;

import java.util.ArrayList;
import java.util.List;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.dialog.ISelectionValidator;
import net.certware.core.ui.dialog.ResourceSelectionDialog2;
import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.sco.ArtifactCommit;
import net.certware.measurement.sco.CommitHistory;
import net.certware.measurement.sco.CriticalDefectChangeOrders;
import net.certware.measurement.sco.ImprovementChangeOrders;
import net.certware.measurement.sco.NewFeatureChangeOrders;
import net.certware.measurement.sco.NormalDefectChangeOrders;
import net.certware.measurement.sco.TotalChangeOrders;
import net.certware.measurement.smm.Accumulator;
import net.certware.measurement.smm.Annotation;
import net.certware.measurement.spm.BaselineCaseSizeMeasure;
import net.certware.measurement.spm.CriticalAndNormalChangeOrderCount;
import net.certware.measurement.spm.CriticalDefectChangeOrderCount;
import net.certware.measurement.spm.EndProductQuality;
import net.certware.measurement.spm.ImprovementChangeOrderCount;
import net.certware.measurement.spm.InProgressIndicator;
import net.certware.measurement.spm.NewFeatureChangeOrderCount;
import net.certware.measurement.spm.NormalDefectChangeOrderCount;
import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.ProjectModel;
import net.certware.measurement.spm.ProjectScope;
import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.TotalCaseSizeMeasure;
import net.certware.measurement.spm.TotalChangeOrderCount;
import net.certware.measurement.spm.UsageTimeMeasure;
import net.certware.measurement.spm.view.Activator;
import net.certware.measurement.spm.view.preferences.PreferenceConstants;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Gathers change orders.
 * @author mrb
 * @since 2.0.0
 */
public class GatherOrdersHandler extends AbstractHandler {


	/**
	 * Handles the gather orders command request.  
	 * @param event used to provide context
	 * @return always returns null  
	 * @throws ExecutionException if context fails  
	 * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			// fetch workbench context
			IWorkbenchPart latestPart = HandlerUtil.getActivePartChecked(event);
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			ISelectionService service = window.getSelectionService();
			IStructuredSelection iss = (IStructuredSelection)service.getSelection();

			// the selection is an SPM project model or project commit
			if ( iss == null ) {
				return null;
			}

			Object first = iss.getFirstElement();

			// get the SCO resource by prompting the user
			// presumes the action is run in the UI thread
			// using the CertWare version of the JFace dialog so we can apply a validator filter
			ResourceSelectionDialog2 dialog = 
				new ResourceSelectionDialog2(latestPart.getSite().getShell(),
					ResourcesPlugin.getWorkspace().getRoot(), 
					"Select SCO file:");
			dialog.setTitle("Change Order File Selection");
			dialog.setBlockOnOpen(true);
			dialog.setHelpAvailable(true);
			dialog.setValidator(new ISelectionValidator() {
				@Override
				public boolean isValid(IResource resource) {
					if ( resource instanceof IProject ) {
						return true;
					}
					if ( resource instanceof IFolder ) {
						return true;
					}
					if ( resource instanceof IFile ) {
						IFile ifile = (IFile)resource;
						if ( ifile.getFileExtension().equals( ICertWareConstants.SCO_EXTENSION) ) {
							return true;
						}
					}
					return false;
				}});
			if ( dialog.open() == Dialog.CANCEL ) {
				return null;
			}
			
			Object results[] = dialog.getResult();

			List<CommitHistory> listOfHistories = new ArrayList<CommitHistory>();

			// collect change order artifact lists from the selected files
			for ( Object o : results ) {
				if ( o instanceof IFile ) {
					IFile f = (IFile)o;
					if ( f.getFileExtension().equals( ICertWareConstants.SCO_EXTENSION ) == false ) {
						CertWareLog.logWarning(String.format("%s %s","Skipped processing change orders from invalid file",f.getName()));
						continue;
					}
					CommitHistory commitHistory = loadOrdersFromFile(f);
					if ( commitHistory != null ) {
						listOfHistories.add(commitHistory);
						CertWareLog.logInfo(String.format("%s %s","Processing change orders from file",f.getName()));
					}
				}
			}

			// find preference to determine whether to match commit IDs in the files

			// project commit
			if ( first instanceof ProjectCommit ) {
				ProjectCommit pc = (ProjectCommit)first;
				if ( computeOrders(pc,listOfHistories) == true ) {
					return null;
				}
			}
			
			// project model selection, do for each commit
			if ( first instanceof ProjectModel ) {
				// check raw statistics and compute metrics
				ProjectModel pm = (ProjectModel)first;
				for ( ProjectCommit pc : pm.getCommits() ) {
						if ( computeOrders(pc,listOfHistories) == true ) {
							// nothing logged per commit
						}
				}
				return null;
			}

		} catch (ExecutionException e) {
			CertWareLog.logError("Gathering orders", e);
		}

		return null;
	}

	/**
	 * Gets a list of the annotations attached to a project commit element.
	 * Builds the list with each annotation separated by a comma character.
	 * @param pc project commit
	 * @return string delimited by commas
	 */
	private String getName(ProjectCommit pc) {
		EList<Annotation> annotations = pc.getAnnotation();
		StringBuffer sb = new StringBuffer();
		boolean subsequentPass = false;
		for ( Annotation a : annotations ) { 
			if ( subsequentPass ) {
				sb.append( ',' );
			}
			sb.append( a.getText() );
			subsequentPass = true;
		}
		return sb.toString();
	}
	
	/**
	 * Compute the metrics given a project commit.
	 * Check whether the raw statistics are present.
	 * Updates the model elements in the given commit.
	 * @param pc project commit to check
	 * @param histories list of history lists to process from change orders
	 * @return true if orders were successfully gathered
	 */
	public boolean computeOrders(ProjectCommit pc, List<CommitHistory> histories) {
		CriticalDefectChangeOrderCount cdcoc = null;
		NormalDefectChangeOrderCount ndcoc = null;
		ImprovementChangeOrderCount icoc = null;
		NewFeatureChangeOrderCount nfcoc = null;
		TotalChangeOrderCount tcoc = null;
		CriticalAndNormalChangeOrderCount cncoc = null;
		BaselineCaseSizeMeasure bcs = null;
		TotalCaseSizeMeasure tcs = null;
		UsageTimeMeasure ut = null;
		EndProductQuality endProductQuality = null;
		InProgressIndicator inProgressIndicator = null;
		ProjectScope projectScope = null;
		
		// preference store fetch
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean matchCommitIds = store.getBoolean( PreferenceConstants.P_MATCH_COMMITS );
		boolean includeLineCounts = store.getBoolean( PreferenceConstants.P_INCLUDE_LINE_COUNTS );
		boolean clearMeasurements = store.getBoolean(PreferenceConstants.P_CLEAR_MEASUREMENTS);
		
		// gather individual statistics by iterating over all commit elements
		TreeIterator<?> ti = pc.eAllContents();
		while( ti.hasNext() ) {
			EObject eo = (EObject)ti.next();

			// scopes
			if ( eo instanceof ProjectScope ) {
				projectScope = (ProjectScope)eo;
				continue;
			}
			
			// statistics
			if ( eo instanceof CriticalDefectChangeOrderCount ) {
				cdcoc = (CriticalDefectChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof NormalDefectChangeOrderCount ) {
				ndcoc = (NormalDefectChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof ImprovementChangeOrderCount ) {
				icoc = (ImprovementChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof NewFeatureChangeOrderCount ) {
				nfcoc = (NewFeatureChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof TotalChangeOrderCount ) {
				tcoc = (TotalChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof CriticalAndNormalChangeOrderCount ) {
				cncoc = (CriticalAndNormalChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof BaselineCaseSizeMeasure ) {
				bcs = (BaselineCaseSizeMeasure)eo;
				continue;
			}
			if ( eo instanceof TotalCaseSizeMeasure ) {
				tcs = (TotalCaseSizeMeasure)eo;
				continue;
			}
			if ( eo instanceof UsageTimeMeasure ) {
				ut = (UsageTimeMeasure)eo;
				continue;
			}

			// categories
			if ( eo instanceof EndProductQuality) {
				endProductQuality = (EndProductQuality)eo;
				continue;
			}
			if ( eo instanceof InProgressIndicator) {
				inProgressIndicator = (InProgressIndicator)eo;
			}

		} // for commit

		// check input statistics
		// creates a list of missing items, if any
		StringBuffer sb = new StringBuffer();
		
		if ( projectScope == null ) {
			// try to find in parent model
			projectScope = findProjectScopeFromCommit(pc);
			if ( projectScope == null ) {
				sb.append("Project scope").append('\n');
			}
		}
		
		// check whether categories are already present
		// if not, create them and add to the project commit
		if ( endProductQuality == null ) {
			endProductQuality = SpmFactory.eINSTANCE.createEndProductQuality();
			endProductQuality.setName("End Product Quality");
			pc.getModelElement().add(endProductQuality);
			CertWareLog.logInfo("Added end product quality characteristic to project commit");
		}
		if ( inProgressIndicator == null ) {
			inProgressIndicator = SpmFactory.eINSTANCE.createInProgressIndicator();
			inProgressIndicator.setName("In-Progress Indicator");
			pc.getModelElement().add(inProgressIndicator);
			CertWareLog.logInfo("Added in-progress indicator characteristic to project commit");
		}

		// create missing statistics
		if ( cdcoc == null ) {
			cdcoc = SpmFactory.eINSTANCE.createCriticalDefectChangeOrderCount();
			cdcoc.setAccumulator(Accumulator.SUM);
			cdcoc.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			cdcoc.setName("Critical Defect Change Order Count)");
			cdcoc.setScope(projectScope);
			cdcoc.setTrait(endProductQuality);
			cdcoc.setUnit("orders");
			pc.getModelElement().add(cdcoc);
			CertWareLog.logInfo("Added critical defect change order statistic to project commit");
		}
		if ( ndcoc == null ) {
			ndcoc = SpmFactory.eINSTANCE.createNormalDefectChangeOrderCount();
			ndcoc.setAccumulator(Accumulator.SUM);
			ndcoc.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			ndcoc.setName("Normal Defect Change Order Count)");
			ndcoc.setScope(projectScope);
			ndcoc.setTrait(endProductQuality);
			ndcoc.setUnit("orders");
			pc.getModelElement().add(ndcoc);
			CertWareLog.logInfo("Added normal defect change order statistic to project commit");
		}
		if ( icoc == null ) {
			icoc = SpmFactory.eINSTANCE.createImprovementChangeOrderCount();
			icoc.setAccumulator(Accumulator.SUM);
			icoc.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			icoc.setName("Improvement Change Order Count)");
			icoc.setScope(projectScope);
			icoc.setTrait(endProductQuality);
			icoc.setUnit("orders");
			pc.getModelElement().add(icoc);
			CertWareLog.logInfo("Added improvement change order statistic to project commit");
		}
		if ( nfcoc == null ) {
			nfcoc = SpmFactory.eINSTANCE.createNewFeatureChangeOrderCount();
			nfcoc.setAccumulator(Accumulator.SUM);
			nfcoc.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			nfcoc.setName("New Feature Change Order Count)");
			nfcoc.setScope(projectScope);
			nfcoc.setTrait(endProductQuality);
			nfcoc.setUnit("orders");
			pc.getModelElement().add(nfcoc);
			CertWareLog.logInfo("Added new feature change order statistic to project commit");
		}
		if ( tcoc == null ) {
			tcoc = SpmFactory.eINSTANCE.createTotalChangeOrderCount();
			tcoc.setAccumulator(Accumulator.SUM);
			tcoc.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			tcoc.setName("Total Change Order Count)");
			tcoc.setScope(projectScope);
			tcoc.setTrait(endProductQuality);
			tcoc.setUnit("orders");
			pc.getModelElement().add(tcoc);
			CertWareLog.logInfo("Added total change order statistic to project commit");
		}
		if ( cncoc == null ) {
			cncoc = SpmFactory.eINSTANCE.createCriticalAndNormalChangeOrderCount();
			cncoc.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			cncoc.setName("Critical and Normal Change Order Count)");
			cncoc.setScope(projectScope);
			cncoc.setTrait(endProductQuality);
			cncoc.setUnit("orders");
			cncoc.setBaseMeasure1(cdcoc);
			cncoc.setBaseMeasure2(ndcoc);
			cncoc.setFunctor(ComputeMetricsHandler.FUNCTOR_ADD);
			pc.getModelElement().add(cncoc);
			CertWareLog.logInfo("Added total change order statistic to project commit");
		}
		if ( bcs == null ) {
			bcs = SpmFactory.eINSTANCE.createBaselineCaseSizeMeasure();
			bcs.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			bcs.setName("Baseline Case Size");
			bcs.setScope(projectScope);
			bcs.setTrait(endProductQuality);
			bcs.setUnit("SLOC");
			pc.getModelElement().add(bcs);
			CertWareLog.logInfo("Added baseline case size statistic to project commit");
		}
		if ( tcs == null ) {
			tcs = SpmFactory.eINSTANCE.createTotalCaseSizeMeasure();
			tcs.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			tcs.setName("Total Case Size");
			tcs.setScope(projectScope);
			tcs.setTrait(endProductQuality);
			tcs.setUnit("SLOC");
			pc.getModelElement().add(tcs);
			CertWareLog.logInfo("Added total case size statistic to project commit");
		}
		if ( ut == null ) {
			ut = SpmFactory.eINSTANCE.createUsageTimeMeasure();
			ut.setLibrary(ComputeMetricsHandler.LIBRARY_TAG);
			ut.setName("Usage Time");
			ut.setScope(projectScope);
			ut.setTrait(endProductQuality);
			ut.setUnit("hrs");
			pc.getModelElement().add(ut);
			CertWareLog.logInfo("Added usage time statistic to project commit");
		}

		// at this point we have all statistics, and the categories and metrics are in the commit
		// compute statistics, putting the measurement values into the front of the measurement list
		int baselinedCount = 0;
		int currentCount = 0;
		int criticalChangeCount = 0;
		int normalChangeCount = 0;
		int improvementChangeCount = 0;
		int newFeatureChangeCount = 0;
		int totalChangeOrderCount = 0;
		double totalUsageTime = 0.0;
		
		// the project commit ID is presumed to be the first annotation
		// might change his index to a preference later...
		String commitId = null;
		if ( pc.getAnnotation() != null && pc.getAnnotation().size() > 0 ) 
			commitId = pc.getAnnotation().get(0).getText();

		// for each history artifact set in the list
		for ( CommitHistory ch : histories ) {

			for ( ArtifactCommit ac : ch.getCommitRecord() ) {

				// match commit ID test
			String changeCommitId = ac.getCommitIdentifier();
			if ( matchCommitIds ) {
				if ( commitId == null || changeCommitId == null ) {
					continue;
				}
				if ( commitId.equals(changeCommitId) == false ) {
					continue;
				}
				// drop through is a match
			}
			
			// critical changes
			CriticalDefectChangeOrders cc = ac.getAllCriticalDefectChangeOrders();
			if ( cc != null )
				criticalChangeCount += cc.getValue();
			
			// normal changes
			NormalDefectChangeOrders nc = ac.getAllNormalDefectChangeOrders();
			if ( nc != null )
				normalChangeCount += nc.getValue();
			
			// improvement changes
			ImprovementChangeOrders ic = ac.getAllImprovementChangeOrders();
			if ( ic != null )
				improvementChangeCount += ic.getValue();
			
			// new feature changes
			NewFeatureChangeOrders fc = ac.getAllNewFeatureChangeOrders();
			if ( fc != null )
				newFeatureChangeCount += fc.getValue();

			// total change orders
			TotalChangeOrders xo = ac.getAllTotalChangeOrders();
			if ( xo != null )
				totalChangeOrderCount += xo.getValue();
		
			// usage time
			totalUsageTime += ac.getUsageTime();
			
			// baselined and current lines
			baselinedCount += ac.getAllBaselinedLineCount();
			currentCount += ac.getAllCurrentLineCount();
			} // artifact commits
		} // commit histories
		
		// compute the combined metric
		ComputeMetricsHandler computeMetrics = new ComputeMetricsHandler();
		
		// insert into statistics as measurements
		// one of them is a combined metric
		computeMetrics.setStatistic(tcoc, totalChangeOrderCount, clearMeasurements);
		computeMetrics.setStatistic(nfcoc, newFeatureChangeCount,  clearMeasurements);
		computeMetrics.setStatistic(icoc, improvementChangeCount,  clearMeasurements);
		computeMetrics.setStatistic(ndcoc, normalChangeCount, clearMeasurements);
		computeMetrics.setStatistic(cdcoc, criticalChangeCount, clearMeasurements);
		computeMetrics.setStatistic(ut, totalUsageTime, clearMeasurements);
		computeMetrics.computeMetric(cncoc, clearMeasurements);

		// line counts, if selected
		if ( includeLineCounts ) {
			computeMetrics.setStatistic(tcs, currentCount, clearMeasurements);
			computeMetrics.setStatistic(bcs, baselinedCount, clearMeasurements);
		}

		// report completion
		String name = getName(pc);
		CertWareLog.logInfo(String.format("%s %s","Computed change order statistics for commit",name));
		return true;
	}

	/**
	 * Finds the project scope element in the project model container.
	 * @param pc project commit, presumed to be contained by a project model element
	 * @return project scope element or null if not found searching the project model
	 */
	private ProjectScope findProjectScopeFromCommit(ProjectCommit pc) {
		ProjectModel pm = (ProjectModel)pc.eContainer();
		TreeIterator<?> ti = pm.eAllContents();
		while( ti.hasNext() ) {
			EObject eo = (EObject)ti.next();
			if ( eo instanceof ProjectScope ) {
				return (ProjectScope)eo;
			}
		}
		return null;
	}

	/**
	 * Open a selected SCO file.
	 * @param ifile file selection from resources
	 * @return artifact list or null
	 */
	private CommitHistory loadOrdersFromFile(IFile ifile) {
		
		try {
	        // load the SCO file through the EMF resource set implementation
	        ResourceSet resourceSet = new ResourceSetImpl();
	        Resource resource = resourceSet.getResource( 
	        		URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
	        
	        CommitHistory documentRoot = (CommitHistory)resource.getContents().get(0);
	        if ( documentRoot != null ) {
	          return documentRoot;
	        }
	      } catch( Exception exception ) {
	        CertWareLog.logError(String.format("%s %s", 
	        		"Document root null loading" + ifile.getName()), exception);
	      }
	      
	      return null;
	}

}
