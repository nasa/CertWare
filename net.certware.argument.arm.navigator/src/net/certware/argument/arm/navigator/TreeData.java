/**
 * 
 */
package net.certware.argument.arm.navigator;

import org.eclipse.core.resources.IFile;

/**
 * Tree data class for content provider.
 * @author mrb
 * @since 1.0
 */
public class TreeData
{
  /**
   * Field COUNT_TYPE_ERROR.
   * (value is 0)
   */
  public static final int COUNT_TYPE_ERROR = 0;
  /**
   * Field COUNT_TYPE_OPEN.
   * (value is 1)
   */
  public static final int COUNT_TYPE_OPEN = 1;
  /**
   * Field COUNT_TYPE_CLOSED.
   * (value is 2)
   */
  public static final int COUNT_TYPE_CLOSED = 2;
  
  /** resource file reference */
  IFile ifile = null;
  /** description */
  String description = null;
  /** count */
  int count = 0;
  /** type */
  int type = 0;

  /**
   * Constructor empty.
   */
  public TreeData() {

  }

  /**
   * Constructor with full specification.
   * @param ifile resource file
   * @param description description
   * @param count count
   * @param type type
   */
  public TreeData(IFile ifile, String description, int count, int type) {
    this.ifile = ifile;
    this.description = description;
    this.count = count;
    this.type = type;
  }


  /**
   * Gets the resource file.
   * @return the resource file
   */
  public IFile getIfile()
  {
    return ifile;
  }

  /**
   * Gets the item description.
   * @return the description 
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Gets the condition count value.
   * @return condition count 
   */
  public int getCount() {
    return count;
  }

  /**
   * Gets the item type. 
   * @return one of the class constants of COUNT_TYPE 
   */
  public int getType() {
    return type;
  }
}
