/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;



// End of user code

/**
 * 
 * 
 */
public interface ItemPropertiesEditionPart {

	/**
	 * @return the identifier
	 * 
	 */
	public String getIdentifier();

	/**
	 * Defines a new identifier
	 * @param newValue the new identifier to set
	 * 
	 */
	public void setIdentifier(String newValue);


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
	 * @return the reference
	 * 
	 */
	public String getReference();

	/**
	 * Defines a new reference
	 * @param newValue the new reference to set
	 * 
	 */
	public void setReference(String newValue);


	/**
	 * @return the result
	 * 
	 */
	public Enumerator getResult();

	/**
	 * Init the result
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initResult(Object input, Enumerator current);

	/**
	 * Defines a new result
	 * @param newValue the new result to set
	 * 
	 */
	public void setResult(Enumerator newValue);


	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);





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
