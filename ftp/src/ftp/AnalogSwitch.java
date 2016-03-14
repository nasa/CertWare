/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.AnalogSwitch#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.AnalogSwitch#getSetPort <em>Set Port</em>}</li>
 *   <li>{@link ftp.AnalogSwitch#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getAnalogSwitch()
 * @model
 * @generated
 */
public interface AnalogSwitch extends PrimitiveComponent {

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
	 * @see ftp.FtpPackage#getAnalogSwitch_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogSwitch#getInPort <em>In Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' containment reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(ElectricalPort value);

	/**
	 * Returns the value of the '<em><b>Set Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Port</em>' containment reference.
	 * @see #setSetPort(SignalPort)
	 * @see ftp.FtpPackage#getAnalogSwitch_SetPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getSetPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogSwitch#getSetPort <em>Set Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Port</em>' containment reference.
	 * @see #getSetPort()
	 * @generated
	 */
	void setSetPort(SignalPort value);

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
	 * @see ftp.FtpPackage#getAnalogSwitch_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogSwitch#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(ElectricalPort value);
} // AnalogSwitch
