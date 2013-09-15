/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.sacm.handlers;

import java.util.Collection;

import net.certware.core.ui.log.CertWareLog;
import net.certware.export.jobs.AbstractExportJob;
import net.certware.export.sacm.jobs.ExportSACMJob;

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
 * Handles the command to export a SACM model node (and its subordinates).
 * @author mrb
 * @since 1.0
 */
public class ExportSACMHandler extends AbstractHandler {
	/**
	 * Method execute.
	 * @param event execution event associated with job
	 * @return always returns null
	 * @throws ExecutionException
	 * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// get the selection and ensure its from a GSN model element
		// uses only the first element of a structured selection
		final ISelection iselection = HandlerUtil.getCurrentSelectionChecked(event);
		if ( iselection instanceof IStructuredSelection ) {
			final IStructuredSelection iss = (IStructuredSelection)iselection;
			if (null != iss.getFirstElement() ) {

				// determine the kind of selection
				// use various job constructors according to selection
				Collection collection = null;
				AbstractExportJob job = null;
				final String jobTitle = "Export SACM model elements";

				if ( iss.size() > 1 ) {
					collection = iss.toList();
					job = new ExportSACMJob(jobTitle, collection);
				} else {
					if ( iss.getFirstElement() instanceof Resource ) {
						job = new ExportSACMJob(jobTitle, (Resource)iss.getFirstElement());
					}
					else if ( iss.getFirstElement() instanceof EObject ) {
						job = new ExportSACMJob(jobTitle, (EObject)iss.getFirstElement());
					}
					else {
						CertWareLog.logWarning("Unknown selection for SACM export");
						return null;
					}
				}
				
				// prompt for file name
				job.promptFileName(HandlerUtil.getActiveShellChecked(event));

				// perform the export using its job
				job.addJobChangeListener(new JobChangeAdapter() {
					public void done(IJobChangeEvent event) { // $codepro.audit.disable emptyMethod
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
