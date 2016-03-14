/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.SignalConstant#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link ftp.SignalConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getSignalConstant()
 * @model
 * @generated
 */
public interface SignalConstant extends PrimitiveComponent {
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
	 * @see ftp.FtpPackage#getSignalConstant_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.SignalConstant#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(SignalPort value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link ftp.SignalValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see ftp.SignalValues
	 * @see #setValue(SignalValues)
	 * @see ftp.FtpPackage#getSignalConstant_Value()
	 * @model required="true"
	 * @generated
	 */
	SignalValues getValue();

	/**
	 * Sets the value of the '{@link ftp.SignalConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see ftp.SignalValues
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SignalValues value);

} // SignalConstant
