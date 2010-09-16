/**
 * 
 */
package net.certware.argument.arm.navigator;

import org.eclipse.core.resources.IFile;

/**
 * @author mrb
 * @since 1.0
 */
public class TreeData
{
  public static final int COUNT_TYPE_ERROR = 0;
  public static final int COUNT_TYPE_OPEN = 1;
  public static final int COUNT_TYPE_CLOSED = 2;
  
  IFile ifile = null;
  String description = null;
  int count = 0;
  int type = 0;

  public TreeData() {

  }

  public TreeData(IFile ifile, String description, int count, int type) {
    this.ifile = ifile;
    this.description = description;
    this.count = count;
    this.type = type;
  }


  /**
   * @return the file interface
   */
  public IFile getIfile()
  {
    return ifile;
  }

  /**
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Get the condition count value.
   * @return condition count
   */
  public int getCount() {
    return count;
  }

  /**
   * Gets the count type. 
   * @return one of the class constants
   */
  public int getType() {
    return type;
  }
}
