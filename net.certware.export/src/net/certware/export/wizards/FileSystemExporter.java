package net.certware.export.wizards;

import java.io.File;
import java.io.IOException;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.cae.CaePackage;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.presentation.GsnModelWizard;
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
public class FileSystemExporter {

	/** file extension for targets to Word documents */
	protected static final String EXPORT_EXTENSION = "docx";

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
		new File(destinationPath.toPortableString()).mkdir();
	}

	/**
	 * Writes the passed resource to the specified location recursively.
	 * @param resource the resource to write out to the file system
	 * @param destinationPath location where the resource will be written
	 * @param monitor progress monitor
	 * @exception CoreException if the operation fails 
	 * @exception IOException if an I/O error occurs when writing files
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
	 * @param monitor 
	 */
	protected void writeChildren(IContainer folder, IPath destinationPath, IProgressMonitor monitor)
	throws CoreException, IOException {
		if (folder.isAccessible()) {
			IResource[] children = folder.members();
			for (int i = 0; i < children.length; i++) {
				IResource child = children[i];
				writeResource(child, destinationPath.append(child.getName()),monitor);
			}
		}
	}

	/**
	 * Writes the file according to its CertWare model data type.
	 * @param file selected file
	 * @param destinationPath selected destination including original file name
	 * @param monitor progress monitor for reporting work
	 * @throws IOException
	 * @throws CoreException
	 */
	@SuppressWarnings("unused")
	protected void writeFile(IFile file, IPath destinationPath, IProgressMonitor monitor)
	throws IOException, CoreException 
	{
		// IPath destinationWithoutExtension = destinationPath.removeFileExtension();
		// leaving on the original extension because results files share common roots
		// destination files change result.xvt and result.xbo into result.xvt.docx and result.xbo.docx 
		IPath destinationWithExtension = destinationPath.addFileExtension(EXPORT_EXTENSION);
		String destinationFile = destinationWithExtension.toPortableString();

		// if the file is the right type, open it and update the view
		String extension = file.getFileExtension();
		if ( extension == null )
			return;

		// create the generic document target
		/*
    	WriteExcel excel = new WriteExcel();
    	excel.setDestinationFile(destinationFile);
		 */
		if ( GsnModelWizard.FILE_EXTENSIONS.contains(extension) ) {
 			// TODO pass the destination file
			EObject eo = readModel(file);
			ExportGSNJob ej = new ExportGSNJob("Export GSN model file",eo);
			ej.produce(monitor);
			return;
		}
		// TODO CAE export
		// TODO ARM export
	}

	/**
	 *  Writes the passed resource to the specified location recursively
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
		GsnPackage gp = GsnPackage.eINSTANCE;
		CaePackage cp = CaePackage.eINSTANCE;
		ArmPackage ap = ArmPackage.eINSTANCE;
	}

	public EObject readModel(final IFile ifile) {
		// load the XML file through the EMF resource set implementation
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
		EObject documentRoot = (EObject)resource.getContents().get(0);
		return documentRoot;
	}
}