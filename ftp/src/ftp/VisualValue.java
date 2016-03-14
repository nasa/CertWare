/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.VisualValue#getBulb <em>Bulb</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getVisualValue()
 * @model
 * @generated
 */
public interface VisualValue extends TypedPortValue {
	/**
	 * Returns the value of the '<em><b>Bulb</b></em>' attribute.
	 * The literals are from the enumeration {@link ftp.VisualValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulb</em>' attribute.
	 * @see ftp.VisualValues
	 * @see #setBulb(VisualValues)
	 * @see ftp.FtpPackage#getVisualValue_Bulb()
	 * @model required="true"
	 * @generated
	 */
	VisualValues getBulb();

	/**
	 * Sets the value of the '{@link ftp.VisualValue#getBulb <em>Bulb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulb</em>' attribute.
	 * @see ftp.VisualValues
	 * @see #getBulb()
	 * @generated
	 */
	void setBulb(VisualValues value);

} // VisualValue
