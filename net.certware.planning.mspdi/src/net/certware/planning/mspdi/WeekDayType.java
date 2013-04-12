/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week Day Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WeekDayType#getDayType <em>Day Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WeekDayType#isDayWorking <em>Day Working</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType()
 * @model extendedMetaData="name='WeekDay_._type' kind='elementOnly'"
 * @generated
 */
public interface WeekDayType extends EObject {
	/**
	 * Returns the value of the '<em><b>Day Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.DayTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of day. Values are: 0=Exception, 1=Sunday, 2=Monday, 3=Tuesday, 4=Wednesday, 5=Thursday, 6=Friday, 7=Saturday.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Type</em>' attribute.
	 * @see net.certware.planning.mspdi.DayTypeType
	 * @see #isSetDayType()
	 * @see #unsetDayType()
	 * @see #setDayType(DayTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType_DayType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DayType' namespace='##targetNamespace'"
	 * @generated
	 */
	DayTypeType getDayType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WeekDayType#getDayType <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Type</em>' attribute.
	 * @see net.certware.planning.mspdi.DayTypeType
	 * @see #isSetDayType()
	 * @see #unsetDayType()
	 * @see #getDayType()
	 * @generated
	 */
	void setDayType(DayTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.WeekDayType#getDayType <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayType()
	 * @see #getDayType()
	 * @see #setDayType(DayTypeType)
	 * @generated
	 */
	void unsetDayType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.WeekDayType#getDayType <em>Day Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Type</em>' attribute is set.
	 * @see #unsetDayType()
	 * @see #getDayType()
	 * @see #setDayType(DayTypeType)
	 * @generated
	 */
	boolean isSetDayType();

	/**
	 * Returns the value of the '<em><b>Day Working</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the specified date or day type is working.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Working</em>' attribute.
	 * @see #isSetDayWorking()
	 * @see #unsetDayWorking()
	 * @see #setDayWorking(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType_DayWorking()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DayWorking' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDayWorking();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WeekDayType#isDayWorking <em>Day Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Working</em>' attribute.
	 * @see #isSetDayWorking()
	 * @see #unsetDayWorking()
	 * @see #isDayWorking()
	 * @generated
	 */
	void setDayWorking(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.WeekDayType#isDayWorking <em>Day Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayWorking()
	 * @see #isDayWorking()
	 * @see #setDayWorking(boolean)
	 * @generated
	 */
	void unsetDayWorking();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.WeekDayType#isDayWorking <em>Day Working</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Working</em>' attribute is set.
	 * @see #unsetDayWorking()
	 * @see #isDayWorking()
	 * @see #setDayWorking(boolean)
	 * @generated
	 */
	boolean isSetDayWorking();

} // WeekDayType
