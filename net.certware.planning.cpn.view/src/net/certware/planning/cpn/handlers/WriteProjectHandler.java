package net.certware.planning.cpn.handlers;

import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;

/**
 * Runs a background task to write CPN model to MSPDI format.
 * @author mrb
 * @since 2.0.0
 */
public class WriteProjectHandler extends AbstractHandler {

	/**
	 * Handles the write project. 
	 * Presumes the command came from a popup menu selection of file name.
	 * @param event used to find file
	 * @return always returns null  
	 * @throws ExecutionException if open fails  
	 * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			// fetch workbench context
			// IWorkbenchPart latestPart = HandlerUtil.getActivePartChecked(event);
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			IWorkbench wb = HandlerUtil.getActiveWorkbenchWindowChecked(event).getWorkbench();
			ISelectionService service = window.getSelectionService();
			IProgressService ps = wb.getProgressService();
			final IStructuredSelection iss = (IStructuredSelection)service.getSelection();
			
			try {
				IRunnableWithProgress runnable = new IRunnableWithProgress() {
					public void run(IProgressMonitor monitor) {
						for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
							process((IFile)iterator.next(),monitor);
							if ( monitor.isCanceled() ) {
								CertWareLog.logWarning("Processing plan canceled");
								return;
							}
						}
					}
				};
				ps.busyCursorWhile(runnable);
			} catch (Exception e) {
				CertWareLog.logError("Processing plan selection",e);
			}
			
			

		} catch (ExecutionException e) {
			CertWareLog.logError("Writing plan to MSPDI", e);
		}

		return null;
	}

	/**
	 * Process the selected file
	 * @param selectedFile selected file from action object contribution
	 * @param monitor progress monitor
	 */
	protected void process(IFile selectedFile, IProgressMonitor monitor) {
		if ( selectedFile.isAccessible() == false ) {
			CertWareLog.logWarning(String.format("%s:%s","Skipped plan processing for inaccessible file",
					selectedFile.getName()));
			return;
		}

		// create a history processor and pass it the project
		try {
			TranslatePlanningContent translateContent = new TranslatePlanningContent();
			translateContent.processPlan(selectedFile,monitor);
		} catch (Exception exception) {
			CertWareLog.logError(String.format("%s:%s","Processing plan",
					selectedFile.getName()),
					exception);
		}
	}


}
