/**
 */
package ftp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.SignalValue#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getSignalValue()
 * @model
 * @generated
 */
public interface SignalValue extends TypedPortValue {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * The literals are from the enumeration {@link ftp.SignalValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see ftp.SignalValues
	 * @see #setSignal(SignalValues)
	 * @see ftp.FtpPackage#getSignalValue_Signal()
	 * @model required="true"
	 * @generated
	 */
	SignalValues getSignal();

	/**
	 * Sets the value of the '{@link ftp.SignalValue#getSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see ftp.SignalValues
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(SignalValues value);

} // SignalValue
