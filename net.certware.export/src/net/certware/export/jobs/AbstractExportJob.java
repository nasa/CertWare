/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.jobs;

import java.text.MessageFormat;
import java.util.Collection;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Exports a selected argument model element to a document file.
 * @author mrb
 * @since 1.0
 */
public abstract class AbstractExportJob extends Job {

	/** for exporting a single node and its descendants */  
	protected EObject node = null;
	/** for exporting a selection of nodes only */
	protected Collection nodeCollection = null;
	/** for exporting an entire resource */
	protected Resource resource = null;
	/** number of production steps for progress monitor */
	protected int steps = 1;
	/** previously-selected destination file name */
	protected String previousFileName = Messages.AbstractExportJob_0;
	
	/**
	 * Default constructor uses default job name.
	 */
	protected AbstractExportJob() {
		super(Messages.AbstractExportJob_1);
	}
	
	/**
	 * Create the export job with a name.
	 * @param name
	 */
	protected AbstractExportJob(String name) {
		super(name);
	}

	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export including its descendants
	 */
	protected AbstractExportJob(String name, EObject node) {
		this(name);
		this.node = node;
		nodeCollection = null;
		resource = null;
	}
	
	/**
	 * Create the export job with a given collection of model nodes.
	 * @param name job name
	 * @param nodes collection of nodes to export
	 */
	protected AbstractExportJob(String name, Collection nodes) {
		this(name);
		node = null;
		nodeCollection = nodes;
		resource = null;
	}
	
	/**
	 * Create the export job with a given model resource.
	 * @param name job name
	 * @param resource model resource
	 */
	protected AbstractExportJob(String name, Resource resource) {
		this(name);
		node = null;
		nodeCollection = null;
		this.resource = resource;
	}
	
	/**
	 * Sets the number of steps for progress monitoring. 
	 * @param count step count
	 */
	public void setSteps(int count) {
		steps = count;
	}
	
	/**
	 * Gets the number of steps for progress monitoring.
	
	 * @return total progress monitoring steps */
	public int getSteps() {
		return steps;
	}

	/**
	 * Prompts the user for a destination file name.
	 * @param shell shell for dialog
	
	 * @return filename or null if canceled */
	public String promptFileName(Shell shell) {
		String fileName = previousFileName;
		final FileDialog fsd = new FileDialog(shell,SWT.SAVE);
		fsd.setOverwrite(true);
		fsd.setFileName(fileName);
		fsd.setFilterExtensions(new String[] {Messages.AbstractExportJob_2});
		fsd.setText(Messages.AbstractExportJob_3);
		fileName = fsd.open();
		if ( null != fileName ) {
			previousFileName = fileName;
		}
		return fileName;
	}
	
	/**
	 * Do the work of exporting while in the run method.
	 * @param monitor progress monitor
	
	 * @return status indication, passed on to run method return */
	abstract IStatus produce(IProgressMonitor monitor);

	
	/**
	 * Runs the job, starting the progress monitor and performing done after the
	 * produce() method returns.
	 * @param monitor progress monitor
	
	
	 * @return same status value from produce() method * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor) */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// set some indicator of progress count
		// increment the work accomplished in the produce() method
		if ( null != resource ) {
			setSteps( resource.getContents().size() );
		}
		else if ( null != nodeCollection ) {
			setSteps( nodeCollection.size() );
		}
		else {
			setSteps( node.eContents().size() );
		}

		// begin the task and produce the content
		monitor.beginTask( getName(), getSteps() );
		final IStatus rv = produce(monitor);
		if ( ! monitor.isCanceled() ) {
			monitor.done();
		}
		return rv;
	}

	/**
	 * Method getFileName.
	 * @return returns the file name 
	 */
	public String getFileName() {
		return previousFileName;
	}
	
	/**
	 * Sets the node for export.  
	 * Typically used if a selection is not available when creating the job.
	 * If null, implementation should export the entire resource.
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
	 * Get the node collection selected for export.
	 * @return the nodeCollection 
	 */
	public Collection getNodeCollection() {
		return nodeCollection;
	}

	/**
	 * Sets the node collection for export.
	 * @param nodeCollection the nodeCollection to set
	 */
	public void setNodeCollection(Collection nodeCollection) {
		this.nodeCollection = nodeCollection;
	}

	/**
	 * Gets the resource selected for export.
	 * @return the resource 
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * Sets the resource for export.
	 * @param resource the resource to set for export
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
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
			CertWareLog.logInfo(MessageFormat.format(Messages.AbstractExportJob_4, getName(), Messages.AbstractExportJob_5));
		} else {
			CertWareLog.logInfo(MessageFormat.format(Messages.AbstractExportJob_6, getName(), Messages.AbstractExportJob_7));
		}
	}
	
}
