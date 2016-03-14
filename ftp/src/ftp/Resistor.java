/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resistor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.Resistor#getResistance <em>Resistance</em>}</li>
 *   <li>{@link ftp.Resistor#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.Resistor#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getResistor()
 * @model
 * @generated
 */
public interface Resistor extends PrimitiveComponent {

	/**
	 * Returns the value of the '<em><b>Resistance</b></em>' attribute.
	 * The default value is <code>"6.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance</em>' attribute.
	 * @see #setResistance(float)
	 * @see ftp.FtpPackage#getResistor_Resistance()
	 * @model default="6.0" required="true"
	 * @generated
	 */
	float getResistance();

	/**
	 * Sets the value of the '{@link ftp.Resistor#getResistance <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance</em>' attribute.
	 * @see #getResistance()
	 * @generated
	 */
	void setResistance(float value);

	/**
	 * Returns the value of the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' containment reference.
	 * @see #setInPort(ElectricalPort)
	 * @see ftp.FtpPackage#getResistor_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.Resistor#getInPort <em>In Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' containment reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(ElectricalPort value);

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' containment reference.
	 * @see #setOutPort(ElectricalPort)
	 * @see ftp.FtpPackage#getResistor_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.Resistor#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(ElectricalPort value);
} // Resistor
