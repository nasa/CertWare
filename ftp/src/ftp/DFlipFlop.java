/**
 */
package ftp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFlip Flop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.DFlipFlop#getInPort <em>In Port</em>}</li>
 *   <li>{@link ftp.DFlipFlop#getClockPort <em>Clock Port</em>}</li>
 *   <li>{@link ftp.DFlipFlop#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link ftp.DFlipFlop#getStatePort <em>State Port</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getDFlipFlop()
 * @model
 * @generated
 */
public interface DFlipFlop extends PrimitiveComponent {

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
	 * @see ftp.FtpPackage#getDFlipFlop_InPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getInPort();

	/**
	 * Sets the value of the '{@link ftp.DFlipFlop#getInPort <em>In Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' containment reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(SignalPort value);

	/**
	 * Returns the value of the '<em><b>Clock Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Port</em>' containment reference.
	 * @see #setClockPort(SignalPort)
	 * @see ftp.FtpPackage#getDFlipFlop_ClockPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getClockPort();

	/**
	 * Sets the value of the '{@link ftp.DFlipFlop#getClockPort <em>Clock Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Port</em>' containment reference.
	 * @see #getClockPort()
	 * @generated
	 */
	void setClockPort(SignalPort value);

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
	 * @see ftp.FtpPackage#getDFlipFlop_OutPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getOutPort();

	/**
	 * Sets the value of the '{@link ftp.DFlipFlop#getOutPort <em>Out Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' containment reference.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(SignalPort value);

	/**
	 * Returns the value of the '<em><b>State Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Port</em>' containment reference.
	 * @see #setStatePort(SignalPort)
	 * @see ftp.FtpPackage#getDFlipFlop_StatePort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SignalPort getStatePort();

	/**
	 * Sets the value of the '{@link ftp.DFlipFlop#getStatePort <em>State Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Port</em>' containment reference.
	 * @see #getStatePort()
	 * @generated
	 */
	void setStatePort(SignalPort value);
} // DFlipFlop
