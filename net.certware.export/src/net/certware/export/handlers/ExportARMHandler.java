/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.handlers;

import java.util.Collection;

import net.certware.core.ui.log.CertWareLog;
import net.certware.export.jobs.ExportARMJob;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handles the command to export a ARM model node (and its subordinates).
 * @author mrb
 * @since 1.0
 */
public class ExportARMHandler extends AbstractHandler {

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

				// determine the kind of selection
				// use various job constructors according to selection
				Collection collection = null;
				ExportARMJob job = null;
				final String jobTitle = "Export ARM model elements";

				if ( iss.size() > 1 ) {
					collection = iss.toList();
					job = new ExportARMJob(jobTitle, collection);
				} else {
					if ( iss.getFirstElement() instanceof Resource )
						job = new ExportARMJob(jobTitle, (Resource)iss.getFirstElement());
					else if ( iss.getFirstElement() instanceof EObject )
						job = new ExportARMJob(jobTitle, (EObject)iss.getFirstElement());
					else {
						CertWareLog.logWarning("Unknown selection for ARM export");
						return null;
					}
				}
				
				// prompt for file name
				job.promptFileName(HandlerUtil.getActiveShellChecked(event));

				// perform the export using its job
				job.addJobChangeListener(new JobChangeAdapter() {
					public void done(IJobChangeEvent event) {
						// job reports its own message; what else do we need?
					}
				});
				job.setPriority(Job.LONG);
				job.setUser(true);
				job.schedule();
			}
		}
		return null;
	}
}
