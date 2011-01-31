package net.certware.core.ui.resources;

import java.util.ArrayList;
import java.util.List;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

/**
 * Provides a visitor to scan the workspace for files by name or path.
 * @author mrb
 */
public class FileFinder
{
  /** the file found in the scan, or null */
  private static IFile foundFile = null;

  /**
   * Sets the file found in the scan.
   * @param f file resource identifier
   */
  public static void setFoundFile(IFile f) { 
    foundFile = f; 
  }
  
  /**
   * Gets the file found in the scan.
   * @return the file resource identifier
   */
  public static IFile getFoundFile() { 
    return foundFile; 
  }
  
  /**
   * Finds a file by its name starting at the given project.
   * Uses a visitor to walk the resource tree.
   * @param name name of file to find in workspace
   * @return first file match found or null 
   */
  public static IFile findResourceByName(IProject project, final String name) {
    // if no project given, use the workspace root
    if ( project == null )
      return findResourceByName(name);

    // if project given, search just within that project
    setFoundFile(null);
    try  {
      project.accept(new IResourceVisitor(){
        public boolean visit(IResource resource) throws CoreException
        {
          if ( resource.getType() == IResource.FILE && resource.getName().equals(name)) {
            setFoundFile ((IFile)resource);
            return false;
          }
            return true;
        }});
    }
    catch (CoreException e) {
    	CertWareLog.logError(String.format("%s %s","Searching for",name),e);
    }
    return getFoundFile();
  }
  
  /**
   * Finds all files in the workspace with the given extension.
   * Uses the resources plugin and a visitor pattern.
   * @param extension extension to find on files, not including the period
   * @param project containing project name, or null for all projects
   * @param folder containing folder name, or null for all folders
   * @return array of files found with matching extension
   */
  public static List<IFile> findResourcesByExtension(final String extension, final String project, final String folder) {
    List<String>extensions = new ArrayList<String>();
    extensions.add(extension);
    return findResourcesByExtension(extensions,project,folder);
  }

  /**
   * Finds all files in the workspace with any of the given extensions.
   * Uses the resources plugin and a visitor pattern.
   * @param extensions extensions list for matching files, not including the period
   * @param project containing project, or null for all instances
   * @param folder containing folder, or null for all instances
   * @return array of files found with matching extension
   */
  public static List<IFile> findResourcesByExtension(final List<String> extensions, final String project, final String folder) 
  {
    final List<IFile> foundFiles = new ArrayList<IFile>();
    try {
      ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {
        public boolean visit(IResource resource) throws CoreException
        {
          // if a project is given and it does not match, skip the project contents
          if ( resource.getType() == IResource.PROJECT && project != null ) {
            if ( resource.getName().equals(project))
              return true;
            return false;
          }
          // if a folder is given and it does not match, skip the folder contents
          if ( resource.getType() == IResource.FOLDER && folder != null ) {
            if ( resource.getName().equals(folder))
              return true;
            return false;
          }
          if ( resource.getType() == IResource.FILE ) {
            String rfe = resource.getFileExtension();
            if ( rfe != null) {
              if ( extensions.contains(rfe))
                foundFiles.add((IFile)resource);
            }
          }
          return true;
        }});
    }
    catch (CoreException e) {
    	CertWareLog.logError(String.format("%s","Searching for extensions"),e);
    }

    return foundFiles;
  }
  
  /**
   * Finds a file by its name starting at the workspace root.
   * Uses a visitor to walk the resource tree.
   * @param name name of file to find in workspace
   * @return first file match found or null 
   */
  public static IFile findResourceByName(final String name) {
    setFoundFile(null);
    try {
      ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor(){
        public boolean visit(IResource resource) throws CoreException
        {
          if ( resource.getType() == IResource.FILE && resource.getName().equals(name)) {
            setFoundFile ((IFile)resource);
            return false;
          }
            return true;
        }});
    }
    catch (CoreException e) {
    	CertWareLog.logError(String.format("%s %s","Searching for",name),e);
    }
    return getFoundFile();
  }
  
  
  /**
   * Finds a file by its name starting at the workspace root.
   * Uses a visitor to walk the resource tree.
   * @param path within workspace, so as to compare with <code>getFullPath()</code>
   * @return first file match found or null 
   */
  public static IFile findResourceByPath(final String path) {
    setFoundFile(null);
    try {
      ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor(){
        public boolean visit(IResource resource) throws CoreException
        {
          if ( resource.getType() == IResource.FILE && resource.getFullPath().toPortableString().equals(path)) {
            setFoundFile ((IFile)resource);
            return false;
          }
            return true;
        }});
    }
    catch (CoreException e) {
    	CertWareLog.logError(String.format("%s %s","Searching for",path),e);
    }
    return getFoundFile();
  }
  
}
