/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;



// End of user code

/**
 * 
 * 
 */
public interface ImprovementChangeOrdersPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


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
	 * @return the type
	 * 
	 */
	public Enumerator getType();

	/**
	 * Init the type
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initType(Object input, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);


	/**
	 * @return the brokenLines
	 * 
	 */
	public String getBrokenLines();

	/**
	 * Defines a new brokenLines
	 * @param newValue the new brokenLines to set
	 * 
	 */
	public void setBrokenLines(String newValue);


	/**
	 * @return the fixedLines
	 * 
	 */
	public String getFixedLines();

	/**
	 * Defines a new fixedLines
	 * @param newValue the new fixedLines to set
	 * 
	 */
	public void setFixedLines(String newValue);


	/**
	 * @return the repairEffort
	 * 
	 */
	public String getRepairEffort();

	/**
	 * Defines a new repairEffort
	 * @param newValue the new repairEffort to set
	 * 
	 */
	public void setRepairEffort(String newValue);





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
