package net.certware.history.egit.actions;

import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IProject;
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
 * An action to dump the history of the selected projects to the console.
 * Presumes the history is provided by a Git team provider and uses the {@code DumpHistory} class for processing.
 * @author mrb
 * @since 1.1.0
 */
public class DumpProjectAction implements IObjectActionDelegate {

	/** current selection */
	private ISelection currentSelection;
	/** latest part selection */
	@SuppressWarnings("unused")
	private IWorkbenchPart activePart;

	/**
	 * Constructor simply calls super.
	 */
	public DumpProjectAction() {
		super();
		
	}

	@Override
	public void run(IAction action) {
		// process the selection; call for each project in the selection 
		final IStructuredSelection iss = (IStructuredSelection)currentSelection;

		IWorkbench wb = PlatformUI.getWorkbench();
		IProgressService ps = wb.getProgressService();
		// ps.registerIconForFamily(CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.JOB_IMAGE), family);
		
		try {
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
		} catch (Exception e) {
			CertWareLog.logError("Processing project history selection",e);
		}
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

		// create a dump history processor and pass it the project
		try {
			DumpHistory dumpHistory = new DumpHistory();
			dumpHistory.processHistory(selectedProject,monitor);
		} catch (Exception exception) {
			CertWareLog.logError(String.format("%s:%s","Processing project history",
					selectedProject.getName()),
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
