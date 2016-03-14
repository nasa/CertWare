/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.AnalogBattery#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.AnalogBattery#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link ftp.AnalogBattery#getVoltage <em>Voltage</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getAnalogBattery()
 * @model
 * @generated
 */
public interface AnalogBattery extends PrimitiveComponent {

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
	 * @see ftp.FtpPackage#getAnalogBattery_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogBattery#getInPort <em>In Port</em>}' containment reference.
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
	 * @see ftp.FtpPackage#getAnalogBattery_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogBattery#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(ElectricalPort value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * The default value is <code>"12.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(float)
	 * @see ftp.FtpPackage#getAnalogBattery_Voltage()
	 * @model default="12.0" required="true"
	 * @generated
	 */
	float getVoltage();

	/**
	 * Sets the value of the '{@link ftp.AnalogBattery#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(float value);
} // AnalogBattery
