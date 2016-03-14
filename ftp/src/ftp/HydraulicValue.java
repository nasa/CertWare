/**
 */
package ftp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydraulic Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftp.HydraulicValue#getFlow <em>Flow</em>}</li>
 *   <li>{@link ftp.HydraulicValue#getPressure <em>Pressure</em>}</li>
 *   <li>{@link ftp.HydraulicValue#isAnyFlow <em>Any Flow</em>}</li>
 *   <li>{@link ftp.HydraulicValue#isAnyPressure <em>Any Pressure</em>}</li>
 * </ul>
 *
 * @see ftp.FtpPackage#getHydraulicValue()
 * @model
 * @generated
 */
public interface HydraulicValue extends TypedPortValue {
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see #setFlow(float)
	 * @see ftp.FtpPackage#getHydraulicValue_Flow()
	 * @model required="true"
	 * @generated
	 */
	float getFlow();

	/**
	 * Sets the value of the '{@link ftp.HydraulicValue#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(float value);

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(float)
	 * @see ftp.FtpPackage#getHydraulicValue_Pressure()
	 * @model required="true"
	 * @generated
	 */
	float getPressure();

	/**
	 * Sets the value of the '{@link ftp.HydraulicValue#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(float value);

	/**
	 * Returns the value of the '<em><b>Any Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Flow</em>' attribute.
	 * @see #setAnyFlow(boolean)
	 * @see ftp.FtpPackage#getHydraulicValue_AnyFlow()
	 * @model required="true"
	 * @generated
	 */
	boolean isAnyFlow();

	/**
	 * Sets the value of the '{@link ftp.HydraulicValue#isAnyFlow <em>Any Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Flow</em>' attribute.
	 * @see #isAnyFlow()
	 * @generated
	 */
	void setAnyFlow(boolean value);

	/**
	 * Returns the value of the '<em><b>Any Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Pressure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Pressure</em>' attribute.
	 * @see #setAnyPressure(boolean)
	 * @see ftp.FtpPackage#getHydraulicValue_AnyPressure()
	 * @model required="true"
	 * @generated
	 */
	boolean isAnyPressure();

	/**
	 * Sets the value of the '{@link ftp.HydraulicValue#isAnyPressure <em>Any Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Pressure</em>' attribute.
	 * @see #isAnyPressure()
	 * @generated
	 */
	void setAnyPressure(boolean value);

} // HydraulicValue
