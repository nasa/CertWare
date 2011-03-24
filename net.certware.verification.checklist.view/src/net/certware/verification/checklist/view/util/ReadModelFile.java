package net.certware.verification.checklist.view.util;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import net.certware.core.ui.log.CertWareLog;
import net.certware.verification.checklist.Checklist;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;


/**
 * Reads the results file using the model package loader. 
 * @author mrb
 * @since 1.2.1
 */
public class ReadModelFile
{
	/**
	 * Reads checklist content from given resource file.  Uses EMF resource loaders.
	 * @param ifile file to read
	 * @return results object from document root  
	 */
	static public Checklist readChecklist(final IFile ifile) {

		// load the XML file through the EMF resource set implementation
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
			Checklist checklist = (Checklist)resource.getContents().get(0);
			return checklist;
		} catch( Exception e ) {
			CertWareLog.logWarning(String.format("%s %s","Loading checklist resource",ifile.getName()));
			return null;
		}
	}

	/**
	 * Writes the specification object to the given workspace resource file.
	 * Uses a workspace modify operation.  Reports to application log.
	 * @param ifile workspace resource
	 * @param checklist checklist object to write
	 */
	static public void writeChecklist(final IFile ifile, Checklist checklist) {
		//@SuppressWarnings("unused") // ensures the package is registered
		//ChecklistPackage checklistPackage = ChecklistPackage.eINSTANCE;

		// ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = checklist.eResource();

		if ( resource == null || resource.getContents() == null || resource.getContents().isEmpty() )
			return;

		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		// saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER); // possible

		// do the work within an operation because this is a long running activity that modifies the workbench
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation()  {

			// save the resources to the file system.
			public void execute(IProgressMonitor monitor) {
				if ( !resource.getContents().isEmpty() ) {
					try {
						resource.save(saveOptions);
						CertWareLog.logInfo(String.format("%s %s","Saved",ifile.getName()));
					} catch (Exception exception) {
						CertWareLog.logError(String.format("%s %s","Saving",resource.toString()), exception);
					}
				}
			}};

			try  {
				// this runs the options, and shows progress
				IWorkbench wb = PlatformUI.getWorkbench();
				if ( wb != null )
					wb.getProgressService().run(true, false, operation);
			} catch (InvocationTargetException ite) {
				CertWareLog.logError("Writing specification", ite);
			} catch (InterruptedException ie) {
				CertWareLog.logError("Writing specification", ie);
			}

			// Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
	}
}
