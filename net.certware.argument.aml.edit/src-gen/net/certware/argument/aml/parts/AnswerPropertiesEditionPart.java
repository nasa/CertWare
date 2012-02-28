/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;



// End of user code

/**
 * 
 * 
 */
public interface AnswerPropertiesEditionPart {

	/**
	 * @return the group
	 * 
	 */
	public EList getGroup();

	/**
	 * Defines a new group
	 * @param newValue the new group to set
	 * 
	 */
	public void setGroup(EList newValue);

	/**
	 * Add a value to the group multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToGroup(Object newValue);

	/**
	 * Remove a value to the group multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToGroup(Object newValue);


	/**
	 * @return the questionId
	 * 
	 */
	public String getQuestionId();

	/**
	 * Defines a new questionId
	 * @param newValue the new questionId to set
	 * 
	 */
	public void setQuestionId(String newValue);





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
