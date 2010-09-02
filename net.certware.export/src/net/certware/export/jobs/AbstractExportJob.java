/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import net.certware.core.ui.log.CertWareLog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;

/**
 * Exports a selected argument model element to a document file.
 * @author mrb
 * @since 1.0
 */
abstract public class AbstractExportJob extends Job {

	protected EObject node = null;
	protected int steps = 1;
	
	/**
	 * Create the export job with a name.
	 * @param name
	 */
	public AbstractExportJob(String name) {
		super(name);
	}

	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export
	 */
	public AbstractExportJob(String name, EObject node) {
		this(name);
		this.node = node;
	}
	
	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export
	 * @param steps production step count for progress monitor
	 */
	public AbstractExportJob(String name, EObject node, int steps) {
		this(name,node);
		this.steps = steps;
	}
	
	public void setSteps(int count) {
		steps = count;
	}
	
	public int getSteps() {
		return steps;
	}
	
	abstract IStatus produce(IProgressMonitor monitor);

	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask( getName(), getSteps() );
		IStatus rv = produce(monitor);
		monitor.done();
		return rv;
	}

	/**
	 * Sets the node for export.  
	 * Typically used if a selection is not available when creating the job.
	 * @param node GSN model element
	 */
	public void setNode(EObject node) {
		this.node = node;
	}
	
	/**
	 * Returns the model element intended for export.
	 * @return node for export
	 */
	public EObject getNode() {
		return node;
	}

	/**
	 * Performs standard clean-up after job.
	 * Writes log message according to completion status.
	 * Performs the done method on the progress monitor.
	 * @param monitor progress monitor
	 * @param rv job completion status
	 */
	public void cleanupJob(IProgressMonitor monitor, IStatus rv) {
		monitor.done();
		if ( rv.isOK() ) {
			CertWareLog.logInfo(getName() + ' ' + "completed.");
		} else {
			CertWareLog.logWarning(getName() + ' ' + "not completed.");
		}
	}
	
}
