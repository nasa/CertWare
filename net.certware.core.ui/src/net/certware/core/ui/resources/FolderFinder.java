package net.certware.core.ui.resources;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;

/**
 * Finds a workspace folder by name.
 * Uses the resources plugin and a visitor pattern.
 * @author mrb
 * @since 3.3
 */
public class FolderFinder
{
	/** the folder found by the search */
	private static IFolder foundFolder = null;

	/**
	 * Sets the folder found by the search.
	 * @param f folder resource
	 */
	public static void setFoundFolder(IFolder f) {
		foundFolder = f;
	}

	/**
	 * Returns the folder found by the search.
	 * @return folder resource or null
	 */
	public static IFolder getFoundFolder() {
		return foundFolder;
	}

	/**
	 * Finds a folder by its name starting at the workspace root.
	 * Uses a visitor to walk the resource tree.
	 * Always sets the found folder to null at the beginning of each call.
	 * @param name name of file to find in workspace
	 * @return first folder match found or null 
	 */
	public static IFolder findResourceByName(final String name) {
		setFoundFolder(null);
		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor(){
				public boolean visit(IResource resource) throws CoreException
				{
					if ( resource.getType() == IResource.FOLDER && resource.getName().equals(name)) {
						setFoundFolder ((IFolder)resource);
						return false;
					}
					return true;
				}});
		}
		catch (CoreException e)	{
			CertWareLog.logError(String.format("%s %s","Searching for",name), e);
		}
		return getFoundFolder();
	}

	/**
	 * Finds a folder by its name starting at the workspace root.
	 * Uses a visitor to walk the resource tree.
	 * @param path within workspace, so as to compare with <code>getFullPath()</code> with portable string
	 * @return first file match found or null 
	 */
	public static IFolder findResourceByPath(final String path) {
		setFoundFolder(null);
		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor(){
				public boolean visit(IResource resource) throws CoreException
				{
					if ( resource.getType() == IResource.FOLDER && resource.getFullPath().toPortableString().equals(path)) {
						setFoundFolder ((IFolder)resource);
						return false;
					}
					return true;
				}});
		}
		catch (CoreException e)	{
			CertWareLog.logError(String.format("%s %s","Searching for",path), e);
		}
		return getFoundFolder();
	}

	/**
	 * Create a folder given its handle.
	 * Copied and modified from <code>WizardNewFolderMainPage, not visible there.
	 * @param folderHandle
	 * @param monitor
	 * @throws CoreException
	 */
	public static void createFolder(IFolder folderHandle, IProgressMonitor monitor)
	throws CoreException {
		try {
			// Create the folder resource in the workspace
			// Update: Recursive to create any folders which do not already exist
			if (!folderHandle.exists()) {
				IPath path = folderHandle.getFullPath();
				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
				int numSegments = path.segmentCount();
				if (numSegments > 2 && !root.getFolder(path.removeLastSegments(1)).exists()) {
					// if the direct parent of the path doesn't exist, try to create the the directories
					for (int i = numSegments - 2; i > 0; i--) {
						IFolder folder = root.getFolder(path.removeLastSegments(i));
						if (!folder.exists()) {
							folder.create(false, true, monitor);
						}
					}
				}
				folderHandle.create(false, true, monitor);
			} // exists

		} catch (CoreException e) {
			// if the folder already existed locally, just refresh to get contents
			if (e.getStatus().getCode() == IResourceStatus.PATH_OCCUPIED) {
				folderHandle.refreshLocal(IResource.DEPTH_INFINITE,
						new SubProgressMonitor(monitor, 500));
			} else {
				throw e;
			}
		}

		if (monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
	}

	/**
	 * Creates a folder resource handle for the folder with the given workspace
	 * path. This method does not create the folder resource; this is the
	 * responsibility of <code>createFolder</code>.
	 * @param folderPath the path of the folder resource to create a handle for
	 * @return the new folder resource handle
	 * @see #createFolder
	 */
	public static IFolder createFolderHandle(IPath folderPath) {
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(folderPath);
	}

}
