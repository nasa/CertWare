/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.DigitalSwitch#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.DigitalSwitch#getSetPort <em>Set Port</em>}</li>
 *   <li>{@link ftp.DigitalSwitch#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getDigitalSwitch()
 * @model
 * @generated
 */
public interface DigitalSwitch extends PrimitiveComponent {

	/**
	 * Returns the value of the '<em><b>In Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' containment reference.
	 * @see #setInPort(SignalPort)
	 * @see ftp.FtpPackage#getDigitalSwitch_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalSwitch#getInPort <em>In Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' containment reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(SignalPort value);

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
	 * @see ftp.FtpPackage#getDigitalSwitch_SetPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getSetPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalSwitch#getSetPort <em>Set Port</em>}' containment reference.
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
	 * @see #setOutPort(SignalPort)
	 * @see ftp.FtpPackage#getDigitalSwitch_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalSwitch#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(SignalPort value);
} // DigitalSwitch
