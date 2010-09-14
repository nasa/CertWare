/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.jobs;

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
abstract public class AbstractExportJob extends Job {

	/** for exporting a single node and its descendants */  
	protected EObject node = null;
	/** for exporting a selection of nodes only */
	protected Collection nodeCollection = null;
	/** for exporting an entire resource */
	protected Resource resource = null;
	/** number of production steps for progress monitor */
	protected int steps = 1;
	/** previously-selected destination file name */
	protected String previousFileName = "";
	
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
	 * @param node model element to export including its descendants
	 */
	public AbstractExportJob(String name, EObject node) {
		this(name);
		this.node = node;
		this.nodeCollection = null;
		this.resource = null;
	}
	
	/**
	 * Create the export job with a given collection of model nodes.
	 * @param name job name
	 * @param nodes collection of nodes to export
	 */
	public AbstractExportJob(String name, Collection nodes) {
		this(name);
		this.node = null;
		this.nodeCollection = nodes;
		this.resource = null;
	}
	
	/**
	 * Create the export job with a given model resource.
	 * @param name job name
	 * @param resource model resource
	 */
	public AbstractExportJob(String name, Resource resource) {
		this(name);
		this.node = null;
		this.nodeCollection = null;
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
	 * @return total progress monitoring steps
	 */
	public int getSteps() {
		return steps;
	}

	/**
	 * Prompts the user for a destination file name.
	 * @param shell shell for dialog
	 * @return filename or null if canceled
	 */
	public String promptFileName(Shell shell) {
		String fileName = previousFileName;
		FileDialog fsd = new FileDialog(shell,SWT.SAVE);
		fsd.setOverwrite(true);
		fsd.setFileName(fileName);
		fsd.setFilterExtensions(new String[] {"*.docx"});
		fsd.setText("Select document file...");
		fileName = fsd.open();
		if ( fileName != null )
			previousFileName = fileName;
		return fileName;
	}
	
	/**
	 * Do the work of exporting while in the run method.
	 * @param monitor progress monitor
	 * @return status indication, passed on to run method return
	 */
	abstract IStatus produce(IProgressMonitor monitor);

	
	/**
	 * Runs the job, starting the progress monitor and performing done after the
	 * produce() method returns.
	 * @param monitor progress monitor
	 * @return same status value from produce() method
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// set some indicator of progress count
		// increment the work accomplished in the produce() method
		if ( resource != null )
			setSteps( resource.getContents().size() );
		else if ( nodeCollection != null )
			setSteps( nodeCollection.size() );
		else
			setSteps( node.eContents().size() );

		// begin the task and produce the content
		monitor.beginTask( getName(), getSteps() );
		IStatus rv = produce(monitor);
		if ( monitor.isCanceled() == false )
			monitor.done();
		return rv;
	}

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
	 * @return the nodeCollection
	 */
	public Collection getNodeCollection() {
		return nodeCollection;
	}

	/**
	 * @param nodeCollection the nodeCollection to set
	 */
	public void setNodeCollection(Collection nodeCollection) {
		this.nodeCollection = nodeCollection;
	}

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
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
			CertWareLog.logInfo(getName() + ' ' + "completed.");
		} else {
			CertWareLog.logWarning(getName() + ' ' + "not completed.");
		}
	}
	
}
