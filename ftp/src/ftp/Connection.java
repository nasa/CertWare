/**
 */
package ftp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.Connection#getFromPort <em>From Port</em>}</li>
 *   <li>{@link ftp.Connection#getToPort <em>To Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends CompositionElement {
	/**
	 * Returns the value of the '<em><b>From Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port</em>' reference.
	 * @see #setFromPort(Port)
	 * @see ftp.FtpPackage#getConnection_FromPort()
	 * @model required="true"
	 * @generated
	 */
	Port getFromPort();

	/**
	 * Sets the value of the '{@link ftp.Connection#getFromPort <em>From Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' reference.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(Port value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port</em>' reference.
	 * @see #setToPort(Port)
	 * @see ftp.FtpPackage#getConnection_ToPort()
	 * @model required="true"
	 * @generated
	 */
	Port getToPort();

	/**
	 * Sets the value of the '{@link ftp.Connection#getToPort <em>To Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' reference.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(Port value);

} // Connection
