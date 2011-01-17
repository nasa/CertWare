/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week Day Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WeekDayType1#getDayType <em>Day Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WeekDayType1#isDayWorking <em>Day Working</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WeekDayType1#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WeekDayType1#getWorkingTimes <em>Working Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType1()
 * @model extendedMetaData="name='WeekDay_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface WeekDayType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Day Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.DayTypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of day. Values are: 0=Exception, 1=Sunday, 2=Monday, 3=Tuesday, 4=Wednesday, 5=Thursday, 6=Friday, 7=Saturday.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Day Type</em>' attribute.
	 * @see net.certware.planning.mspdi.DayTypeType1
	 * @see #isSetDayType()
	 * @see #unsetDayType()
	 * @see #setDayType(DayTypeType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType1_DayType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DayType' namespace='##targetNamespace'"
	 * @generated
	 */
	DayTypeType1 getDayType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WeekDayType1#getDayType <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Type</em>' attribute.
	 * @see net.certware.planning.mspdi.DayTypeType1
	 * @see #isSetDayType()
	 * @see #unsetDayType()
	 * @see #getDayType()
	 * @generated
	 */
	void setDayType(DayTypeType1 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.WeekDayType1#getDayType <em>Day Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayType()
	 * @see #getDayType()
	 * @see #setDayType(DayTypeType1)
	 * @generated
	 */
	void unsetDayType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.WeekDayType1#getDayType <em>Day Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Type</em>' attribute is set.
	 * @see #unsetDayType()
	 * @see #getDayType()
	 * @see #setDayType(DayTypeType1)
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
	 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType1_DayWorking()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DayWorking' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDayWorking();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WeekDayType1#isDayWorking <em>Day Working</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.WeekDayType1#isDayWorking <em>Day Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayWorking()
	 * @see #isDayWorking()
	 * @see #setDayWorking(boolean)
	 * @generated
	 */
	void unsetDayWorking();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.WeekDayType1#isDayWorking <em>Day Working</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Working</em>' attribute is set.
	 * @see #unsetDayWorking()
	 * @see #isDayWorking()
	 * @see #setDayWorking(boolean)
	 * @generated
	 */
	boolean isSetDayWorking();

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a contiguous set of exception days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(TimePeriodType2)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType1_TimePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePeriodType2 getTimePeriod();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WeekDayType1#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(TimePeriodType2 value);

	/**
	 * Returns the value of the '<em><b>Working Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of working times that define the time worked on the weekday. One of these must be present, and there can be no more than five.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Working Times</em>' containment reference.
	 * @see #setWorkingTimes(WorkingTimesType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDayType1_WorkingTimes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WorkingTimes' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkingTimesType1 getWorkingTimes();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WeekDayType1#getWorkingTimes <em>Working Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Times</em>' containment reference.
	 * @see #getWorkingTimes()
	 * @generated
	 */
	void setWorkingTimes(WorkingTimesType1 value);

} // WeekDayType1
