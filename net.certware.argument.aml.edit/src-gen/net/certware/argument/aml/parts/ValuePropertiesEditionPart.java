
package net.certware.argument.aml.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;



// End of user code

/**
 * @author mrb
 * 
 */
public interface ValuePropertiesEditionPart {

	/**
	 * @return the mixed
	 * 
	 */
	public EList getMixed();

	/**
	 * Defines a new mixed
	 * @param newValue the new mixed to set
	 * 
	 */
	public void setMixed(EList newValue);

	/**
	 * Add a value to the mixed multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue);

	/**
	 * Remove a value to the mixed multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue);


	/**
	 * @return the type
	 * 
	 */
	public String getType();

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(String newValue);


	/**
	 * @return the unit
	 * 
	 */
	public String getUnit();

	/**
	 * Defines a new unit
	 * @param newValue the new unit to set
	 * 
	 */
	public void setUnit(String newValue);





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
