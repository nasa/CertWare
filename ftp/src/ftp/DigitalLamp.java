/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Lamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.DigitalLamp#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.DigitalLamp#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link ftp.DigitalLamp#getLightPort <em>Light Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getDigitalLamp()
 * @model
 * @generated
 */
public interface DigitalLamp extends PrimitiveComponent {

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
	 * @see ftp.FtpPackage#getDigitalLamp_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalLamp#getInPort <em>In Port</em>}' containment reference.
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
	 * @see ftp.FtpPackage#getDigitalLamp_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalLamp#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(SignalPort value);

	/**
	 * Returns the value of the '<em><b>Light Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Port</em>' containment reference.
	 * @see #setLightPort(VisualPort)
	 * @see ftp.FtpPackage#getDigitalLamp_LightPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VisualPort getLightPort();

	/**
	 * Sets the value of the '{@link ftp.DigitalLamp#getLightPort <em>Light Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Port</em>' containment reference.
	 * @see #getLightPort()
	 * @generated
	 */
	void setLightPort(VisualPort value);
} // DigitalLamp
