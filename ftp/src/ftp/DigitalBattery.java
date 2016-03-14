/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.DigitalBattery#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.DigitalBattery#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getDigitalBattery()
 * @model
 * @generated
 */
public interface DigitalBattery extends PrimitiveComponent {

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
	 * @see ftp.FtpPackage#getDigitalBattery_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalBattery#getInPort <em>In Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' containment reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(SignalPort value);

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
	 * @see ftp.FtpPackage#getDigitalBattery_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalBattery#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(SignalPort value);
} // DigitalBattery
