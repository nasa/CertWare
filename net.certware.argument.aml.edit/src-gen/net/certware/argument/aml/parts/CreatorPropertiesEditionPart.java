/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface CreatorPropertiesEditionPart {

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
	 * @return the idRef
	 * 
	 */
	public String getIdRef();

	/**
	 * Defines a new idRef
	 * @param newValue the new idRef to set
	 * 
	 */
	public void setIdRef(String newValue);


	/**
	 * @return the objectType
	 * 
	 */
	public Enumerator getObjectType();

	/**
	 * Init the objectType
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initObjectType(EEnum eenum, Enumerator current);

	/**
	 * Defines a new objectType
	 * @param newValue the new objectType to set
	 * 
	 */
	public void setObjectType(Enumerator newValue);





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
