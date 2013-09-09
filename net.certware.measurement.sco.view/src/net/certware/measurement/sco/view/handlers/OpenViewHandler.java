package net.certware.measurement.sco.view.handlers;

import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.sco.view.ScoViewMasterDetails;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Opens the master-details view on a selection.
 * @author mrb
 * @since 2.0.0
 */
public class OpenViewHandler extends AbstractHandler {

	static private final String PROJECT_VIEW_ID = "net.certware.measurement.sco.view.masterdetailsview"; //$NON-NLS-1$

	/**
	 * Handles the open view command request.  
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
			ISelectionService service = window.getSelectionService();
			IStructuredSelection structured = (IStructuredSelection)service.getSelection();

			// if we have a file selected, show view then load file
			if ( structured.getFirstElement() instanceof IFile) {
				IViewPart viewPart = window.getActivePage().showView(PROJECT_VIEW_ID);
				// IViewPart viewPart = latestPart.getSite().getPage().showView(PROJECT_VIEW_ID);
				IFile ifile = (IFile)structured.getFirstElement();
				ScoViewMasterDetails view = (ScoViewMasterDetails)viewPart;
				view.setSelectedFile(ifile);
			}
		} catch (PartInitException e) {
			CertWareLog.logError("Opening SCO view", e);
		} catch (ExecutionException e) {
			CertWareLog.logError("Opening SCO view", e);
		}

		return null;
	}


}
