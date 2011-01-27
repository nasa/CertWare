/**
 * 
 */
package net.certware.measurement.sco.navigator;

import org.eclipse.core.resources.IFile;

/**
 * @author mrb
 * @since 1.0
 */
public class TreeData
{
	/** artifact count */
	public static final int ARTIFACT_COUNT = 0;
	/** baselined lines count */
	public static final int BASELINED_COUNT = 1;
	/** current lines count */
	public static final int CURRENT_COUNT = 2;
	/** critical change count */
	public static final int CRITICAL_COUNT = 3;
	/** normal change count */
	public static final int NORMAL_COUNT = 4;
	/** improvement change count */
	public static final int IMPROVEMENT_COUNT = 5;
	/** new feature change count */
	public static final int NEW_FEATURE_COUNT = 6;
	/** total change count */
	public static final int TOTAL_COUNT = 7;
	/** file reference */
	IFile ifile = null;
	/** node description */
	String description = null;
	/** count value */
	int count = 0;
	/** type identifier */
	int type = 0;

	/**
	 * Tree data constructor. 
	 */
	public TreeData() {
	}

	/**
	 * Tree data constructor, loading all fields.
	 * @param ifile file
	 * @param description description
	 * @param count node count value
	 * @param type node type
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
