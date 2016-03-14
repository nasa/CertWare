/**
 */
package ftp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.ElectricalValue#getCurrent <em>Current</em>}</li>
 *   <li>{@link ftp.ElectricalValue#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link ftp.ElectricalValue#isAnyCurrent <em>Any Current</em>}</li>
 *   <li>{@link ftp.ElectricalValue#isAnyVoltage <em>Any Voltage</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getElectricalValue()
 * @model
 * @generated
 */
public interface ElectricalValue extends TypedPortValue {
	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(float)
	 * @see ftp.FtpPackage#getElectricalValue_Current()
	 * @model required="true"
	 * @generated
	 */
	float getCurrent();

	/**
	 * Sets the value of the '{@link ftp.ElectricalValue#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(float value);

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #setVoltage(float)
	 * @see ftp.FtpPackage#getElectricalValue_Voltage()
	 * @model required="true"
	 * @generated
	 */
	float getVoltage();

	/**
	 * Sets the value of the '{@link ftp.ElectricalValue#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Any Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Current</em>' attribute.
	 * @see #setAnyCurrent(boolean)
	 * @see ftp.FtpPackage#getElectricalValue_AnyCurrent()
	 * @model required="true"
	 * @generated
	 */
	boolean isAnyCurrent();

	/**
	 * Sets the value of the '{@link ftp.ElectricalValue#isAnyCurrent <em>Any Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Current</em>' attribute.
	 * @see #isAnyCurrent()
	 * @generated
	 */
	void setAnyCurrent(boolean value);

	/**
	 * Returns the value of the '<em><b>Any Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Voltage</em>' attribute.
	 * @see #setAnyVoltage(boolean)
	 * @see ftp.FtpPackage#getElectricalValue_AnyVoltage()
	 * @model required="true"
	 * @generated
	 */
	boolean isAnyVoltage();

	/**
	 * Sets the value of the '{@link ftp.ElectricalValue#isAnyVoltage <em>Any Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Voltage</em>' attribute.
	 * @see #isAnyVoltage()
	 * @generated
	 */
	void setAnyVoltage(boolean value);

} // ElectricalValue
