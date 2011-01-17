/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.CalendarType#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.CalendarType#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.CalendarType#isIsBaseCalendar <em>Is Base Calendar</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.CalendarType#getBaseCalendarUID <em>Base Calendar UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.CalendarType#getWeekDays <em>Week Days</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.CalendarType#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.CalendarType#getWorkWeeks <em>Work Weeks</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType()
 * @model extendedMetaData="name='Calendar_._type' kind='elementOnly'"
 * @generated
 */
public interface CalendarType extends EObject {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType_UID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='UID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.CalendarType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType_Name()
	 * @model dataType="net.certware.planning.mspdi.NameType3"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.CalendarType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Base Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the calendar is a base calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Base Calendar</em>' attribute.
	 * @see #isSetIsBaseCalendar()
	 * @see #unsetIsBaseCalendar()
	 * @see #setIsBaseCalendar(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType_IsBaseCalendar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsBaseCalendar' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsBaseCalendar();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.CalendarType#isIsBaseCalendar <em>Is Base Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Calendar</em>' attribute.
	 * @see #isSetIsBaseCalendar()
	 * @see #unsetIsBaseCalendar()
	 * @see #isIsBaseCalendar()
	 * @generated
	 */
	void setIsBaseCalendar(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.CalendarType#isIsBaseCalendar <em>Is Base Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBaseCalendar()
	 * @see #isIsBaseCalendar()
	 * @see #setIsBaseCalendar(boolean)
	 * @generated
	 */
	void unsetIsBaseCalendar();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.CalendarType#isIsBaseCalendar <em>Is Base Calendar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Base Calendar</em>' attribute is set.
	 * @see #unsetIsBaseCalendar()
	 * @see #isIsBaseCalendar()
	 * @see #setIsBaseCalendar(boolean)
	 * @generated
	 */
	boolean isSetIsBaseCalendar();

	/**
	 * Returns the value of the '<em><b>Base Calendar UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the base calendar on which this calendar depends. Only applicable if the calendar is not a base calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Calendar UID</em>' attribute.
	 * @see #setBaseCalendarUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType_BaseCalendarUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='BaseCalendarUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getBaseCalendarUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.CalendarType#getBaseCalendarUID <em>Base Calendar UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Calendar UID</em>' attribute.
	 * @see #getBaseCalendarUID()
	 * @generated
	 */
	void setBaseCalendarUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Week Days</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of weekdays that defines this calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Week Days</em>' containment reference.
	 * @see #setWeekDays(WeekDaysType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType_WeekDays()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeekDays' namespace='##targetNamespace'"
	 * @generated
	 */
	WeekDaysType getWeekDays();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.CalendarType#getWeekDays <em>Week Days</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Week Days</em>' containment reference.
	 * @see #getWeekDays()
	 * @generated
	 */
	void setWeekDays(WeekDaysType value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of exceptions that is associated with the calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference.
	 * @see #setExceptions(ExceptionsType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType_Exceptions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Exceptions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionsType getExceptions();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.CalendarType#getExceptions <em>Exceptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exceptions</em>' containment reference.
	 * @see #getExceptions()
	 * @generated
	 */
	void setExceptions(ExceptionsType value);

	/**
	 * Returns the value of the '<em><b>Work Weeks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of effective work weeks associated with the calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Weeks</em>' containment reference.
	 * @see #setWorkWeeks(WorkWeeksType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarType_WorkWeeks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WorkWeeks' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkWeeksType getWorkWeeks();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.CalendarType#getWorkWeeks <em>Work Weeks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Weeks</em>' containment reference.
	 * @see #getWorkWeeks()
	 * @generated
	 */
	void setWorkWeeks(WorkWeeksType value);

} // CalendarType
