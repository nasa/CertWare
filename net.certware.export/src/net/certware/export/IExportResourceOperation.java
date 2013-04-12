/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

/**
 * Export a selected resource to the file system.
 * Meant for use with the CertWare export summary wizard.
 * Plugin extension point contributions point to this interface for discovery during generic export.
 * @author mrb
 * @since 1.0.3
 */
public interface IExportResourceOperation {

	/**
	 * Write the given file to the given location.
	 * Job container already created, use the give progress monitor for messages.
	 * @param file source file from workspace resources, including file extension
	 * @param fullPath destination location on file system
	 * @param monitor progress monitor
	 */
	IStatus writeFile(IFile file, IPath fullPath, IProgressMonitor monitor);

}
