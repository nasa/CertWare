package net.certware.export.sacm.jobs;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import net.certware.core.ICertWareConstants;
import net.certware.export.IExportResourceOperation;
import net.certware.export.jobs.AbstractFileSystemExporter;

public class FileSystemExporter extends AbstractFileSystemExporter implements IExportResourceOperation {

	/**
	 * Writes the file according to its CertWare model data type.
	 * @param file selected file
	 * @param destinationPath selected destination including original file name
	 * @param monitor progress monitor for reporting work
	 */
	public IStatus writeFile(IFile file, IPath destinationPath, IProgressMonitor monitor)
	{
		// IPath destinationWithoutExtension = destinationPath.removeFileExtension();
		// leaving on the original extension because results files share common roots
		// destination files change result.xvt and result.xbo into result.xvt.docx and result.xbo.docx 
		final IPath destinationWithExtension = destinationPath.addFileExtension(EXPORT_EXTENSION);
		@SuppressWarnings("unused")
		final String destinationFile = destinationWithExtension.toPortableString(); 

		// TODO redundant because wizard should have performed this filter
		// if the file is the right type, open it and update the view
		final String extension = file.getFileExtension();
		if ( null != extension ) {
			// create the generic document target
			if ( ICertWareConstants.SACM_EXTENSION.equals(extension)) {
				final EObject eo = readModel(file);
				final ExportSACMJob ej = new ExportSACMJob("Export argument",eo);
				return ej.produce(monitor);
			}
		}
		
		return Status.CANCEL_STATUS;
	}


}
