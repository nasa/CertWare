/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.verification.checklist.navigator;

import org.eclipse.core.resources.IFile;

/**
 * Tree content data for navigator contribution.
 * @author mrb
 * @since 1.0
 */
public class TreeData
{
	/** key for item node count */
	public static final int COUNT_TYPE_ITEM = 0;
	/** key for yes result count */
	public static final int COUNT_TYPE_YES_RESULT = 1;
	/** key for no result count */
	public static final int COUNT_TYPE_NO_RESULT = 2;
	/** key for not applicable result count */
	public static final int COUNT_TYPE_NA_RESULT = 3;
	/** key for unknown result count */
	public static final int COUNT_TYPE_UNKNOWN_RESULT = 4;
	/** reference resource file */
	IFile ifile = null;
	/** item description */
	String description = null;
	/** item count */
	int count = 0;
	/** item type, one of the keys */
	int type = 0;

	/**
	 * Constructor, nothing else performed. 
	 */
	public TreeData() {
	}

	/**
	 * Constructor with full field specification.
	 * @param ifile reference file
	 * @param description item description
	 * @param count item count value
	 * @param type item key value
	 */
	public TreeData(IFile ifile, String description, int count, int type) {
		this.ifile = ifile;
		this.description = description;
		this.count = count;
		this.type = type;
	}


	/**
	 * Get the resource file.
	 * @return the resource file
	 */
	public IFile getIfile()
	{
		return ifile;
	}

	/**
	 * Get the item description.
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
