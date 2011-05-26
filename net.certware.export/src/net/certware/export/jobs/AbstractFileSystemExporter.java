/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.export.jobs;

import java.io.File;
import java.io.IOException;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.export.wizards.Messages;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Helper class for exporting resources to the file system.
 * Originally part of the data transfer internal code.  
 * Copied here from Eclipse and modified for use in CertWare plugins.
 * @author mrb
 * @since 1.0.3
 */
public abstract class AbstractFileSystemExporter implements ICertWareConstants {

	/** file extension for targets to Word documents */
	protected static final String EXPORT_EXTENSION = Messages.FileSystemExporter_0;

	/**
	 * Constructor initializes the packages.
	 */
	public AbstractFileSystemExporter() {
		init();
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
	 * Writes the passed resource to the specified location recursively.
	 * @param resource the resource to write out to the file system
	 * @param destinationPath location where the resource will be written
	 * @param monitor progress monitor
	 * @throws CoreException if the operation fails
	 * @throws IOException if an I/O error occurs when writing files
	 */
	public void write(IResource resource, IPath destinationPath, IProgressMonitor monitor)
	throws CoreException, IOException {
		if (resource.getType() == IResource.FILE) {
			writeFile((IFile) resource, destinationPath, monitor);
		} else {
			writeChildren((IContainer) resource, destinationPath, monitor);
		}
	}

	/**
	 * Exports the passed container's children
	 * @param folder destination container
	 * @param destinationPath IPath
	 * @param monitor progress monitor 
	 * @throws CoreException 
	 * @throws IOException
	 */
	protected void writeChildren(IContainer folder, IPath destinationPath, IProgressMonitor monitor)
	throws CoreException, IOException {
		if (folder.isAccessible()) {
			final IResource[] children = folder.members();
			for (int i = 0; i < children.length; i++) {
				IResource child = children[i]; // $codepro.audit.disable variableDeclaredInLoop
				writeResource(child, destinationPath.append(child.getName()),monitor);
			}
		}
	}

	/**
	 * Writes the file according to its CertWare model data type.
	 * @param file selected file
	 * @param destinationPath selected destination including original file name
	 * @param monitor progress monitor for reporting work
	 * @return 
	 */
	abstract public IStatus writeFile(IFile file, IPath destinationPath, IProgressMonitor monitor);

	/**
	 * Writes the passed resource to the specified location recursively.
	 * @param resource resource selected to write
	 * @param destinationPath destination path
	 * @param monitor progress monitor
	 * @throws CoreException 
	 * @throws IOException 
	 */
	protected void writeResource(IResource resource, IPath destinationPath, IProgressMonitor monitor)
	throws CoreException, IOException 
	{
		if (resource.getType() == IResource.FILE) {
			writeFile((IFile) resource, destinationPath, monitor);
		} else {
			createFolder(destinationPath);
			writeChildren((IContainer) resource, destinationPath, monitor);
		}
	}

	/**
	 * Initialize exporter.
	 */
	public void init() {
	}

	/**
	 * Read the model using the EMF resource processing classes.
	 * @param ifile file to read
	 * @return the first EObject of the resource contents 
	 */
	public EObject readModel(final IFile ifile) {
		// load the XML file through the EMF resource set implementation
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
		final EObject documentRoot = resource.getContents().get(0);
		return documentRoot;
	}
}