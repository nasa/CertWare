// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.parts;

// Start of user code for imports


// End of user code

/**
 * @author Kestrel Technology LLC
 * 
 */
public interface ClaimPropertiesEditionPart {

	/**
	 * @return the id
	 * 
	 */
	public String getId();

	/**
	 * Defines a new id
	 * @param newValue the new id to set
	 * 
	 */
	public void setId(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the content
	 * 
	 */
	public String getContent();

	/**
	 * Defines a new content
	 * @param newValue the new content to set
	 * 
	 */
	public void setContent(String newValue);


	/**
	 * @return the assumed
	 * 
	 */
	public Boolean getAssumed();

	/**
	 * Defines a new assumed
	 * @param newValue the new assumed to set
	 * 
	 */
	public void setAssumed(Boolean newValue);


	/**
	 * @return the toBeSupported
	 * 
	 */
	public Boolean getToBeSupported();

	/**
	 * Defines a new toBeSupported
	 * @param newValue the new toBeSupported to set
	 * 
	 */
	public void setToBeSupported(Boolean newValue);





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
