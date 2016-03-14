/**
 */
package ftp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTransistor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.NTransistor#getGate <em>Gate</em>}</li>
 *   <li>{@link ftp.NTransistor#getSource <em>Source</em>}</li>
 *   <li>{@link ftp.NTransistor#getDrain <em>Drain</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getNTransistor()
 * @model
 * @generated
 */
public interface NTransistor extends PrimitiveComponent {

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' containment reference.
	 * @see #setGate(SignalPort)
	 * @see ftp.FtpPackage#getNTransistor_Gate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getGate();

	/**
	 * Sets the value of the '{@link ftp.NTransistor#getGate <em>Gate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gate</em>' containment reference.
	 * @see #getGate()
	 * @generated
	 */
	void setGate(SignalPort value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SignalPort)
	 * @see ftp.FtpPackage#getNTransistor_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getSource();

	/**
	 * Sets the value of the '{@link ftp.NTransistor#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SignalPort value);

	/**
	 * Returns the value of the '<em><b>Drain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drain</em>' containment reference.
	 * @see #setDrain(SignalPort)
	 * @see ftp.FtpPackage#getNTransistor_Drain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getDrain();

	/**
	 * Sets the value of the '{@link ftp.NTransistor#getDrain <em>Drain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drain</em>' containment reference.
	 * @see #getDrain()
	 * @generated
	 */
	void setDrain(SignalPort value);
} // NTransistor
