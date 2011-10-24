/*
 * Copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */
package net.certware.argument.arm.parts;

// Start of user code for imports




// End of user code

/**
 * @author
 * 
 */
public interface TaggedValuePropertiesEditionPart {

	/**
	 * @return the key
	 * 
	 */
	public String getKey();

	/**
	 * Defines a new key
	 * @param newValue the new key to set
	 * 
	 */
	public void setKey(String newValue);


	/**
	 * @return the value
	 * 
	 */
	public String getValue();

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * 
	 */
	public void setValue(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods

// End of user code

}
