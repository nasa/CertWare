/**
 * 
 */
package net.certware.evidence.hugin.view.handlers;

import java.lang.reflect.InvocationTargetException;

import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.ViewTree;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.io.NetworkIO;


/**
 * Handler for the save view model to file command.
 * @author mrb
 * @since 1.2.1
 */
public class SaveHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final ViewTree vl = (ViewTree)HandlerUtil.getActivePartChecked(event);
		if ( vl != null ) {

			final BeliefNetwork bn = vl.getSelectedNetwork();
			final IFile ifile = vl.getSelectedFile();
			
			if ( bn != null && ifile != null) {
				
				// do the work within an operation because this is a long running activity that modifies the workbench
				WorkspaceModifyOperation operation = new WorkspaceModifyOperation()  {

					// save the resources to the file system.
					public void execute(IProgressMonitor monitor) {
							try {
								NetworkIO.writeNetwork(bn, ifile.getFullPath().toFile());
								vl.setDirty(false);
								CertWareLog.logInfo(String.format("%s %s","Saved",ifile.getName()));
							} catch (Exception exception) {
								CertWareLog.logError(String.format("%s %s","Saving",ifile.getName()), exception);
							}
					}};

					try  {
						// this runs the options, and shows progress
						IWorkbench wb = PlatformUI.getWorkbench();
						if ( wb != null )
							wb.getProgressService().run(true, false, operation);
					} catch (InvocationTargetException ite) {
						CertWareLog.logError("Writing network", ite);
					} catch (InterruptedException ie) {
						CertWareLog.logError("Writing network", ie);
					}
			}
		}
		
		return null;
		/*
		if ( vl != null ) {
			ReadModelFile.writeChecklist(vl.getSelectedFile(), vl.getSelectedNetwork() );
			vl.setDirty(false);
		} else {
			CertWareLog.logWarning("Could not find list view to handle command");
		}
		return null;
		*/
		// throw new UnsupportedOperationException("Save not yet implemented");
	}

}
