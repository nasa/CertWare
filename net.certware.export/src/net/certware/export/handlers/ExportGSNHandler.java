/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.handlers;

import net.certware.argument.gsn.Goal;
import net.certware.export.jobs.ExportGSNJob;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

/**
 * Handles the command to export a GSN model node (and its subordinates).
 * @author mrb
 * @since 1.0
 */
public class ExportGSNHandler extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get the selection and ensure its from a GSN model element
		// uses only the first element of a structured selection
		ISelection iselection = HandlerUtil.getCurrentSelectionChecked(event);
		if ( iselection instanceof IStructuredSelection ) {
			IStructuredSelection iss = (IStructuredSelection)iselection;
			if (iss.getFirstElement() != null ) {
				
				// find the model root of the selection
				if ( iss.getFirstElement() instanceof EObject ) {
					EObject eo = (EObject)iss.getFirstElement();
					EObject root = EcoreUtil.getRootContainer(eo, true);
					if ( root == null && eo instanceof Goal ) {
						root = eo;
					}
					
					// if the root is a GSN goal, then export of selection is okay
					// perform the export using its job
					if ( root instanceof Goal ) {
						final String jobTitle = "Export GSN selection";
						Job job = new ExportGSNJob(jobTitle, eo);
						job.addJobChangeListener(new JobChangeAdapter() {
							public void done(IJobChangeEvent event) {
								// TODO job reports its own message; what else do we need?
							}
						});
						job.setPriority(Job.LONG);
						job.setUser(true);
						job.schedule();
					}
				}
			}
		}
		return null;
	}

}
