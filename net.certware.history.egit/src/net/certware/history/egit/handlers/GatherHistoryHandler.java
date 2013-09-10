package net.certware.history.egit.handlers;

import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;

/**
 * Runs history gathering to SCO file.
 * @author mrb
 * @since 2.0.0
 */
public class GatherHistoryHandler extends AbstractHandler {

	/**
	 * Handles the gather history command request.  
	 * Presumes the command came from a popup menu selection of model elements.
	 * @param event used to find context
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
			IWorkbench wb = HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
			ISelectionService service = window.getSelectionService();
			IProgressService ps = wb.getProgressService();
			final IStructuredSelection iss = (IStructuredSelection)service.getSelection();

			// ps.registerIconForFamily(CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.JOB_IMAGE), family);

			IRunnableWithProgress runnable = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
						process((IProject)iterator.next(),monitor);
						if ( monitor.isCanceled() ) {
							CertWareLog.logWarning("Processing project history canceled");
							return;
						}
					}
				}
			};
			ps.busyCursorWhile(runnable);
		} catch (ExecutionException e) {
			CertWareLog.logError("Gathering history", e);
		} catch (Exception e) {
			CertWareLog.logError("Processing project history selection",e);
		}	

		return null;
	}

	/**
	 * Process the selected project.
	 * @param selectedProject
	 */
	protected void process(IProject selectedProject, IProgressMonitor monitor) {
		if ( selectedProject.isOpen() == false ) {
			CertWareLog.logWarning(String.format("%s:%s","Skipped history processing for closed project",
					selectedProject.getName()));
			return;
		}

		// create a history processor and pass it the project
		try {
			GatherHistory gatherHistory = new GatherHistory();
			gatherHistory.processHistory(selectedProject,monitor);
		} catch (Exception exception) {
			CertWareLog.logError(String.format("%s:%s","Processing project history",
					selectedProject.getName()),
					exception);
		}
	}


}
