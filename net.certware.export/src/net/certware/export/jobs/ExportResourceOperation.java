/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.export.jobs;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.certware.core.ui.log.CertWareLog;
import net.certware.export.ExportContributions;
import net.certware.export.ExportOperation;
import net.certware.export.wizards.Messages;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.operation.ModalContext;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.IOverwriteQuery;

/**
 * Operation for exporting the contents of a resource to the local file system.
 * @author mrb
 * See IBM original for data transfer internal use
 * @since 1.0 
 */
public class ExportResourceOperation implements IRunnableWithProgress { // $codepro.audit.disable declareDefaultConstructors

	/** destination path */
	private IPath path;
	/** progress monitor */
	private IProgressMonitor monitor;
	/** list of resources to export */
	private List<IResource> resourcesToExport;
	/** whether to overwrite existing resources */
	private IOverwriteQuery overwriteCallback;
	/** resource */
	private IResource resource;
	/** list of errors status */
	private final List<IStatus> errorTable = new ArrayList<IStatus>(1);
	/** constant for overwrite not set */
	private static final int OVERWRITE_NOT_SET = 0;
	/** constant for overwrite none */
	private static final int OVERWRITE_NONE = 1;
	/** constant for overwrite all */
	private static final int OVERWRITE_ALL = 2;
	/** current value of overwrite state */
	private int overwriteState = OVERWRITE_NOT_SET;
	/** whether to create the lead-up path structure */
	private boolean createLeadupStructure = true;
	/** whether to create container directories */
	private boolean createContainerDirectories = true;
	/** plugin extension point contributions */
	private ExportContributions ec = null;

	/**
	 * Create an instance of this class.  Use this constructor if you wish to
	 * recursively export a single resource
	 * @param res IResource
	 * @param destinationPath String
	 * @param overwriteImplementor IOverwriteQuery
	 */
	public ExportResourceOperation(IResource res, String destinationPath, IOverwriteQuery overwriteImplementor) {
		super();
		resource = res;
		path = new Path(destinationPath);
		overwriteCallback = overwriteImplementor;
		ec = new ExportContributions();
		ec.initialize();
	}

	/**
	 * Create an instance of this class.  Use this constructor if you wish to
	 * export specific resources with a common parent resource (affects container directory creation)
	 * @param res IResource
	 * @param resources List<IResource>
	 * @param destinationPath String
	 * @param overwriteImplementor IOverwriteQuery
	 */
	public ExportResourceOperation(IResource res, List<IResource> resources,
			String destinationPath, IOverwriteQuery overwriteImplementor) {
		this(res, destinationPath, overwriteImplementor);
		resourcesToExport = resources;
	}

	/**
	 *  Creates the specified file system directory at <code>destinationPath.
	 *  This creates a new file system directory.
	 *  @param destinationPath location to which files will be written
	 */
	public void createFolder(IPath destinationPath) {
		boolean rv = new File(destinationPath.toPortableString()).mkdir();
		if ( !(rv) ) {
			CertWareLog.logWarning("Exporting path not created");
		}
	}
	
	/**
	 * Answer the total number of file resources that exist at or below self in the resources hierarchy.
	 * @param parentResource parent whose children we are counting
	 * @return number of children 
	 * @throws CoreException
	 */
	protected int countChildrenOf(IResource parentResource)
	throws CoreException {
		if (parentResource.getType() == IResource.FILE) {
			return 1;
		}

		int count = 0;
		if (parentResource.isAccessible()) {
			final IResource[] children = ((IContainer) parentResource).members();
			for (int i = 0; i < children.length; i++) {
				count += countChildrenOf(children[i]);
			}
		}

		return count;
	}

	/**
	 * Answer indicating the number of file resources that were specified for export.
	 * @return number of selected resources  
	 * @throws CoreException
	 */
	protected int countSelectedResources() throws CoreException {
		int result = 0;
		final Iterator<IResource> resources = resourcesToExport.iterator();

		while (resources.hasNext()) {
			result += countChildrenOf(resources.next());
		}

		return result;
	}

	/**
	 * Create the directories required for exporting the passed resource,
	 * based upon its container hierarchy
	 * @param childResource child resource for path lead-up
	 */
	protected void createLeadupDirectoriesFor(IResource childResource) {
		final IPath resourcePath = childResource.getFullPath().removeLastSegments(1);
		final int segmentCount = resourcePath.segmentCount();
		for (int i = 0; i < segmentCount; i++) {
			path = path.append(resourcePath.segment(i));
			createFolder(path);
		}
	}

	/**
	 * Recursively export the previously-specified resource
	 * @param monitor progress monitor.
	 * @throws InterruptedException 
	 */
	protected void exportAllResources(IProgressMonitor monitor) throws InterruptedException {
		if (resource.getType() == IResource.FILE) {
			exportFile((IFile) resource, path, monitor);
		} else {
			try {
				exportChildren(((IContainer) resource).members(), path, monitor);
			} catch (CoreException e) {
				// not safe to show a dialog
				// should never happen because the file system export wizard ensures that the
				// single resource chosen for export is both existent and accessible
				errorTable.add(e.getStatus());
			}
		}
	}

	/**
	 * Export all of the resources contained in the passed collection
	 * @param children children to export
	 * @param currentPath current path
	 * @param monitor progress monitor
	 * @throws InterruptedException 
	 */
	protected void exportChildren(IResource[] children, IPath currentPath, IProgressMonitor monitor)
	throws InterruptedException 
	{
		for (int i = 0; i < children.length; i++) {
			IResource child = children[i]; // $codepro.audit.disable variableDeclaredInLoop
			if (!child.isAccessible()) {
				continue;
			}

			if (child.getType() == IResource.FILE) {
				exportFile((IFile) child, currentPath, monitor);
			} else {
				IPath destination = currentPath.append(child.getName()); // $codepro.audit.disable variableDeclaredInLoop
				createFolder(destination);
				try {
					exportChildren(((IContainer) child).members(), destination, monitor);
				} catch (CoreException e) {
					// not safe to show a dialog
					// should never happen because:
					// i. this method is called recursively iterating over the result of #members,
					//      which only answers existing children
					// ii. there is an #isAccessible check done before #members is invoked
					errorTable.add(e.getStatus());
				}
			}
		}
	}

	/**
	 * Export the passed file to the specified location.
	 * @param file file name for full path
	 * @param location export location path
	 * @param monitor progress monitor
	 * @throws InterruptedException 
	 */
	protected void exportFile(IFile file, IPath location, IProgressMonitor monitor)
		throws InterruptedException 
	{
		final IPath fullPath = location.append(file.getName());
		monitor.subTask(file.getFullPath().toString());
		final String properPathString = fullPath.toPortableString();
		final File targetFile = new File(properPathString);

		if (targetFile.exists()) {
			if (!targetFile.canWrite()) {
				errorTable.add(new Status(IStatus.ERROR, 
						PlatformUI.PLUGIN_ID,
						0, 
						MessageFormat.format(Messages.ExportResourceOperation_0, Messages.ExportResourceOperation_1, targetFile.getAbsolutePath()),
						null));
				monitor.worked(1);
				return;
			}

			if (overwriteState == OVERWRITE_NONE) {
				return;
			}

			if (overwriteState != OVERWRITE_ALL) {
				final String overwriteAnswer = overwriteCallback.queryOverwrite(properPathString);

				if (overwriteAnswer.equals(IOverwriteQuery.CANCEL)) {
					throw new InterruptedException(MessageFormat.format(Messages.ExportResourceOperation_6, file.getName()));
				}

				if (overwriteAnswer.equals(IOverwriteQuery.NO)) {
					monitor.worked(1);
					return;
				}

				if (overwriteAnswer.equals(IOverwriteQuery.NO_ALL)) {
					monitor.worked(1);
					overwriteState = OVERWRITE_NONE;
					return;
				}

				if (overwriteAnswer.equals(IOverwriteQuery.ALL)) {
					overwriteState = OVERWRITE_ALL;
				}
			}
		}

		System.err.println("export file " + file + " extension " + file.getFileExtension() + " to " + fullPath);
		// find a matching exporter contribution for this file extension
		// TODO this uses the first one it finds
		for ( ExportOperation eo : ec.getExportOperations() ) {
			System.err.println("contributed operation for " + eo + " operation " + eo.getOperation() ); // TODO testing
			if ( eo.getFileExtension().equals( file.getFileExtension() )) {
				System.err.println("performing contributed operation for " + file); // TODO testing
				eo.getOperation().writeFile(file,fullPath,monitor);
			}
		}
		
		monitor.worked(1);
		ModalContext.checkCanceled(monitor);
	}

	/**
	 * Export the resources contained in the previously-defined resourcesToExport collection.
	 * @param monitor progress monitor
	 * @throws InterruptedException 
	 */
	protected void exportSpecifiedResources(IProgressMonitor monitor) throws InterruptedException {
		final Iterator<IResource> resources = resourcesToExport.iterator();
		final IPath initPath = (IPath) path.clone();

		while (resources.hasNext()) {
			IResource currentResource = resources.next(); // $codepro.audit.disable variableDeclaredInLoop
			if (!currentResource.isAccessible()) {
				continue;
			}

			path = initPath;

			if (null == resource) {
				// No root resource specified and creation of containment directories
				// is required.  Create containers from depth 2 onwards (ie.- project's
				// child inclusive) for each resource being exported.
				if (createLeadupStructure) {
					createLeadupDirectoriesFor(currentResource);
				}

			} else {
				// Root resource specified.  Must create containment directories
				// from this point onwards for each resource being exported
				IPath containersToCreate = currentResource.getFullPath() // $codepro.audit.disable variableDeclaredInLoop
				.removeFirstSegments(
						resource.getFullPath().segmentCount())
						.removeLastSegments(1);
				final int segmentCount = containersToCreate.segmentCount(); // $codepro.audit.disable variableDeclaredInLoop
				for (int i = 0; i < segmentCount; i++) {
					path = path.append(containersToCreate.segment(i));
					createFolder(path);
				}
			}

			if (currentResource.getType() == IResource.FILE) {
				exportFile((IFile) currentResource, path, monitor);
			} else {
				if (createContainerDirectories) {
					path = path.append(currentResource.getName());
					createFolder(path);
				}

				try {
					exportChildren(((IContainer) currentResource).members(), path, monitor);
				} catch (CoreException e) {
					// should never happen because #isAccessible is called before #members is invoked,
					// which implicitly does an existence check
					errorTable.add(e.getStatus());
				}
			}
		}
	}

	/**
	 * Returns the status of the export operation.
	 * If there were any errors, the result is a status object containing
	 * individual status objects for each error.
	 * If there were no errors, the result is a status object with error code <code>OK.
	 * @return the status 
	 */
	public IStatus getStatus() {
		final IStatus[] errors = new IStatus[errorTable.size()];
		errorTable.toArray(errors);
		return new MultiStatus(
				PlatformUI.PLUGIN_ID,
				IStatus.OK,
				errors,
				Messages.ExportResourceOperation_4,
				null);
	}

	/**
	 * Answer a boolean indicating whether the passed child is a descendant
	 * of one or more members of the passed resources collection
	 * @param resources list of ancestor resources
	 * @param child child to find in ancestors
	 * @return boolean  true if child is in resources list and is not a project
	 */
	protected boolean isDescendent(List<?> resources, IResource child) {
		if (child.getType() == IResource.PROJECT) {
			return false;
		}

		final IResource parent = child.getParent();
		if (resources.contains(parent)) {
			return true;
		}

		return isDescendent(resources, parent);
	}

	/**
	 * Export the resources that were previously specified for export
	 * (or if a single resource was specified then export it recursively)
	 * @param progressMonitor progress monitor
	 * @throws InterruptedException 
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(IProgressMonitor)
	 */
	public void run(IProgressMonitor progressMonitor)
	throws InterruptedException {
		monitor = progressMonitor;

		if (null != resource) {
			if (createLeadupStructure) {
				createLeadupDirectoriesFor(resource);
			}

			if (createContainerDirectories && resource.getType() != IResource.FILE) {
				// ensure it's a container
				path = path.append(resource.getName());
				createFolder(path);
			}
		}

		try {
			int totalWork = IProgressMonitor.UNKNOWN;
			try {
				if (null == resourcesToExport) {
					totalWork = countChildrenOf(resource);
				} else {
					totalWork = countSelectedResources();
				}
			} catch (CoreException e) {
				// Should not happen
				errorTable.add(e.getStatus());
			}
			monitor.beginTask(Messages.ExportResourceOperation_5, totalWork);
			if (null == resourcesToExport) {
				exportAllResources(monitor);
			} else {
				exportSpecifiedResources(progressMonitor);
			}
		} finally {
			monitor.done();
		}
	}

	/**
	 * Set this boolean indicating whether a directory should be created for
	 * Folder resources that are explicitly passed for export
	 * @param value whether to create container directories
	 */
	public void setCreateContainerDirectories(boolean value) {
		createContainerDirectories = value;
	}

	/**
	 * Set this boolean indicating whether each exported resource's complete path should
	 * include containment hierarchies as dictated by its parents
	 * @param value whether to create lead-up structure
	 */
	public void setCreateLeadupStructure(boolean value) {
		createLeadupStructure = value;
	}

	/**
	 * Set this boolean indicating whether exported resources should automatically
	 * overwrite existing files when a conflict occurs. If not, query the user.
	 * @param value whether to overwrite existing files
	 */
	public void setOverwriteFiles(boolean value) {
		if (value) {
			overwriteState = OVERWRITE_ALL;
		}
	}
}