/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#isEnteredByOccurrences <em>Entered By Occurrences</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getPeriod <em>Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getDaysOfWeek <em>Days Of Week</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getMonthItem <em>Month Item</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getMonthPosition <em>Month Position</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getMonth <em>Month</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getMonthDay <em>Month Day</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#isDayWorking <em>Day Working</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExceptionType#getWorkingTimes <em>Working Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType()
 * @model extendedMetaData="name='Exception_._type' kind='elementOnly'"
 * @generated
 */
public interface ExceptionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entered By Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the range of recurrence is defined by entering a number of occurrences. False specifies that the range of recurrence is defined by entering a finish date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entered By Occurrences</em>' attribute.
	 * @see #isSetEnteredByOccurrences()
	 * @see #unsetEnteredByOccurrences()
	 * @see #setEnteredByOccurrences(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_EnteredByOccurrences()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='EnteredByOccurrences' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnteredByOccurrences();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#isEnteredByOccurrences <em>Entered By Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered By Occurrences</em>' attribute.
	 * @see #isSetEnteredByOccurrences()
	 * @see #unsetEnteredByOccurrences()
	 * @see #isEnteredByOccurrences()
	 * @generated
	 */
	void setEnteredByOccurrences(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExceptionType#isEnteredByOccurrences <em>Entered By Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnteredByOccurrences()
	 * @see #isEnteredByOccurrences()
	 * @see #setEnteredByOccurrences(boolean)
	 * @generated
	 */
	void unsetEnteredByOccurrences();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExceptionType#isEnteredByOccurrences <em>Entered By Occurrences</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entered By Occurrences</em>' attribute is set.
	 * @see #unsetEnteredByOccurrences()
	 * @see #isEnteredByOccurrences()
	 * @see #setEnteredByOccurrences(boolean)
	 * @generated
	 */
	boolean isSetEnteredByOccurrences();

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a contiguous set of exception days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(TimePeriodType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_TimePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePeriodType1 getTimePeriod();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(TimePeriodType1 value);

	/**
	 * Returns the value of the '<em><b>Occurrences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of occurrences for which the calendar exception is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrences</em>' attribute.
	 * @see #setOccurrences(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_Occurrences()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Occurrences' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOccurrences();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getOccurrences <em>Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrences</em>' attribute.
	 * @see #getOccurrences()
	 * @generated
	 */
	void setOccurrences(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_Name()
	 * @model dataType="net.certware.planning.mspdi.NameType1"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exception type. Values are: 1=Daily, 2=Yearly by day of the month, 3=Yearly by position, 4=Monthly by day of the month, 5=Monthly by position, 6=Weekly, 7=By day count, 8=By weekday count, 9=No exception type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExceptionType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of recurrence for the exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_Period()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Period' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPeriod();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Days Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The days of the week on which the exception is valid. Values are: 1=Sunday, 2=Monday, 4=Tuesday, 8=Wednesday, 16=Thursday, 32=Friday, 64=Saturday.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Days Of Week</em>' attribute.
	 * @see #setDaysOfWeek(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_DaysOfWeek()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DaysOfWeek' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDaysOfWeek();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getDaysOfWeek <em>Days Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days Of Week</em>' attribute.
	 * @see #getDaysOfWeek()
	 * @generated
	 */
	void setDaysOfWeek(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Month Item</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.MonthItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The month item for which an exception recurrence is scheduled. Values are: 0=Day, 1=Weekday, 2=WeekendDay, 3=Sunday, 4=Monday, 5=Tuesday, 6=Wednesday, 7=Thursday, 8=Friday, 9=Saturday.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month Item</em>' attribute.
	 * @see net.certware.planning.mspdi.MonthItemType
	 * @see #isSetMonthItem()
	 * @see #unsetMonthItem()
	 * @see #setMonthItem(MonthItemType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_MonthItem()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MonthItem' namespace='##targetNamespace'"
	 * @generated
	 */
	MonthItemType getMonthItem();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonthItem <em>Month Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month Item</em>' attribute.
	 * @see net.certware.planning.mspdi.MonthItemType
	 * @see #isSetMonthItem()
	 * @see #unsetMonthItem()
	 * @see #getMonthItem()
	 * @generated
	 */
	void setMonthItem(MonthItemType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonthItem <em>Month Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonthItem()
	 * @see #getMonthItem()
	 * @see #setMonthItem(MonthItemType)
	 * @generated
	 */
	void unsetMonthItem();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonthItem <em>Month Item</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Month Item</em>' attribute is set.
	 * @see #unsetMonthItem()
	 * @see #getMonthItem()
	 * @see #setMonthItem(MonthItemType)
	 * @generated
	 */
	boolean isSetMonthItem();

	/**
	 * Returns the value of the '<em><b>Month Position</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.MonthPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of a month item within a month. Values are: 0=First position, 1=Second position, 2=Third position, 3=Fourth position, 4=Last position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month Position</em>' attribute.
	 * @see net.certware.planning.mspdi.MonthPositionType
	 * @see #isSetMonthPosition()
	 * @see #unsetMonthPosition()
	 * @see #setMonthPosition(MonthPositionType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_MonthPosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MonthPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	MonthPositionType getMonthPosition();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonthPosition <em>Month Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month Position</em>' attribute.
	 * @see net.certware.planning.mspdi.MonthPositionType
	 * @see #isSetMonthPosition()
	 * @see #unsetMonthPosition()
	 * @see #getMonthPosition()
	 * @generated
	 */
	void setMonthPosition(MonthPositionType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonthPosition <em>Month Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonthPosition()
	 * @see #getMonthPosition()
	 * @see #setMonthPosition(MonthPositionType)
	 * @generated
	 */
	void unsetMonthPosition();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonthPosition <em>Month Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Month Position</em>' attribute is set.
	 * @see #unsetMonthPosition()
	 * @see #getMonthPosition()
	 * @see #setMonthPosition(MonthPositionType)
	 * @generated
	 */
	boolean isSetMonthPosition();

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.MonthType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The month for which an exception recurrence is scheduled. Values are: 0=January, 1=February, 2=March, 3=April, 4=May, 5=June, 6=July, 7=August, 8=September, 9=October, 10=November, 11=December.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see net.certware.planning.mspdi.MonthType
	 * @see #isSetMonth()
	 * @see #unsetMonth()
	 * @see #setMonth(MonthType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_Month()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Month' namespace='##targetNamespace'"
	 * @generated
	 */
	MonthType getMonth();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see net.certware.planning.mspdi.MonthType
	 * @see #isSetMonth()
	 * @see #unsetMonth()
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(MonthType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonth()
	 * @see #getMonth()
	 * @see #setMonth(MonthType)
	 * @generated
	 */
	void unsetMonth();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonth <em>Month</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Month</em>' attribute is set.
	 * @see #unsetMonth()
	 * @see #getMonth()
	 * @see #setMonth(MonthType)
	 * @generated
	 */
	boolean isSetMonth();

	/**
	 * Returns the value of the '<em><b>Month Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The day of the month on which an exception recurrence is scheduled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Month Day</em>' attribute.
	 * @see #setMonthDay(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_MonthDay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MonthDay' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMonthDay();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getMonthDay <em>Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month Day</em>' attribute.
	 * @see #getMonthDay()
	 * @generated
	 */
	void setMonthDay(BigInteger value);

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
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_DayWorking()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DayWorking' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDayWorking();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#isDayWorking <em>Day Working</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExceptionType#isDayWorking <em>Day Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayWorking()
	 * @see #isDayWorking()
	 * @see #setDayWorking(boolean)
	 * @generated
	 */
	void unsetDayWorking();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExceptionType#isDayWorking <em>Day Working</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Working Times</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of working times that define the time worked on the weekday.  One of these must be present, and there can be no more than five.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Working Times</em>' containment reference.
	 * @see #setWorkingTimes(WorkingTimesType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExceptionType_WorkingTimes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WorkingTimes' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkingTimesType getWorkingTimes();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExceptionType#getWorkingTimes <em>Working Times</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Times</em>' containment reference.
	 * @see #getWorkingTimes()
	 * @generated
	 */
	void setWorkingTimes(WorkingTimesType value);

} // ExceptionType
