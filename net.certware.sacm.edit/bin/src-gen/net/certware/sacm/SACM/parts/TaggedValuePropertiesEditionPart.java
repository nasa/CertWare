// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.parts;

// Start of user code for imports



// End of user code

/**
 * @author Kestrel Technology LLC
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
