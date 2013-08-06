/**
 * 
 */
package net.certware.sacm.navigator;

import org.eclipse.core.resources.IFile;

/**
 * @author mrb
 * @since 1.0
 */
public class TreeData
{
	/** annotation count type */
	public static final int COUNT_TYPE_ANNOTATIONS = 0;
	/** assurance case count type */
	public static final int COUNT_TYPE_ASSURANCE_CASES = 1;
	/** date time count type */
	public static final int COUNT_TYPE_DATE_TIMES = 2;
	/** model elements count type */
	public static final int COUNT_TYPE_MODEL_ELEMENTS = 3;
	/** SACM elements count type */
	public static final int COUNT_TYPE_SACM_ELEMENTS = 4;
	/** tagged values count type */
	public static final int COUNT_TYPE_TAGGED_VALUES = 5;
	/** utility elements count type */
	public static final int COUNT_TYPE_UTILITY_ELEMENTS = 6;
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
