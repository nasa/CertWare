package net.certware.planning.cpn.view.actions;

import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;

/**
 * An action to translate a selected CPN file into equivalent MSPDI file.
 * @author mrb
 * @since 1.1.0
 */
public class CreateProjectAction implements IObjectActionDelegate {

	/** current selection */
	private ISelection currentSelection;
	/** latest part selection */
	@SuppressWarnings("unused")
	private IWorkbenchPart activePart;

	/**
	 * Constructor simply calls super.
	 */
	public CreateProjectAction() {
		super();
		
	}

	@Override
	public void run(IAction action) {
		// process the selection; call for each project in the selection 
		final IStructuredSelection iss = (IStructuredSelection)currentSelection;

		IWorkbench wb = PlatformUI.getWorkbench();
		IProgressService ps = wb.getProgressService();
		
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


	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

}
