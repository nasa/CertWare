/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Lamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.AnalogLamp#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.AnalogLamp#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link ftp.AnalogLamp#getLightPort <em>Light Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getAnalogLamp()
 * @model
 * @generated
 */
public interface AnalogLamp extends PrimitiveComponent {

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
	 * @see ftp.FtpPackage#getAnalogLamp_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogLamp#getInPort <em>In Port</em>}' containment reference.
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
	 * @see ftp.FtpPackage#getAnalogLamp_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElectricalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogLamp#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(ElectricalPort value);

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
	 * @see ftp.FtpPackage#getAnalogLamp_LightPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VisualPort getLightPort();

	/**
	 * Sets the value of the '{@link ftp.AnalogLamp#getLightPort <em>Light Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Port</em>' containment reference.
	 * @see #getLightPort()
	 * @generated
	 */
	void setLightPort(VisualPort value);
} // AnalogLamp
