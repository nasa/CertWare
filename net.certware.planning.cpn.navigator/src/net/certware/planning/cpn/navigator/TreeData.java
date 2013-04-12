/**
 * 
 */
package net.certware.planning.cpn.navigator;

import org.eclipse.core.resources.IFile;

/**
 * @author mrb
 * @since 1.0
 */
public class TreeData
{
	/** plan line count */
	public static final int COUNT_TYPE_PLAN = 0;
	/** import line count */
	public static final int COUNT_TYPE_IMPORT = 1;

	IFile ifile = null;
	String description = null;
	int count = 0;
	int type = 0;

	/**
	 * 
	 */
	public TreeData() {
	}

	/**
	 * @param ifile
	 * @param description
	 * @param count
	 * @param type
	 */
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
