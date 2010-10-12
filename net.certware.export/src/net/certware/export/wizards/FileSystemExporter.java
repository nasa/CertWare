/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.export.wizards;

import java.io.File;
import java.io.IOException;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.cae.CaePackage;
import net.certware.argument.gsn.GsnPackage;
import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.export.jobs.ExportARMJob;
import net.certware.export.jobs.ExportGSNJob;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Helper class for exporting resources to the file system.
 * Originally part of the data transfer internal code.  
 * @author mrb
 * @see Copied here from Eclipse and modified for use in CertWare plugins.
 */
public class FileSystemExporter implements ICertWareConstants {

	/** file extension for targets to Word documents */
	protected static final String EXPORT_EXTENSION = Messages.FileSystemExporter_0;

	/**
	 * Constructor initializes the packages.
	 */
	public FileSystemExporter() {
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
	 */
	@SuppressWarnings("unused")
	protected void writeFile(IFile file, IPath destinationPath, IProgressMonitor monitor)
	{
		// IPath destinationWithoutExtension = destinationPath.removeFileExtension();
		// leaving on the original extension because results files share common roots
		// destination files change result.xvt and result.xbo into result.xvt.docx and result.xbo.docx 
		final IPath destinationWithExtension = destinationPath.addFileExtension(EXPORT_EXTENSION);
		final String destinationFile = destinationWithExtension.toPortableString(); // $codepro.audit.disable variableUsage

		// if the file is the right type, open it and update the view
		final String extension = file.getFileExtension();
		if ( null == extension ) {
			return;
		}

		// create the generic document target
		/*
    	WriteExcel excel = new WriteExcel();
    	excel.setDestinationFile(destinationFile);
		 */
		if ( ICertWareConstants.GSN_EXTENSION.equals(extension)) {
 			// TODO pass the destination file
			final EObject eo = readModel(file);
			final ExportGSNJob ej = new ExportGSNJob(Messages.FileSystemExporter_1,eo);
			ej.produce(monitor);
			return;
		}
		if ( ICertWareConstants.ARM_EXTENSION.equals(extension)) {
 			// TODO pass the destination file
			final EObject eo = readModel(file);
			final ExportARMJob ej = new ExportARMJob(Messages.FileSystemExporter_2,eo);
			ej.produce(monitor);
			return;
		}
		
		// TODO CAE export
	}

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
	 * Initializes the model packages to ensure they are registered for resource opening.
	 */
	@SuppressWarnings("unused")
	public void init() {
		final GsnPackage gp = GsnPackage.eINSTANCE; // $codepro.audit.disable variableUsage
		final CaePackage cp = CaePackage.eINSTANCE; // $codepro.audit.disable variableUsage
		final ArmPackage ap = ArmPackage.eINSTANCE; // $codepro.audit.disable variableUsage
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