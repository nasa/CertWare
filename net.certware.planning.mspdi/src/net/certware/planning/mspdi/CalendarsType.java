/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendars Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.CalendarsType#getCalendar <em>Calendar</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarsType()
 * @model extendedMetaData="name='Calendars_._type' kind='elementOnly'"
 * @generated
 */
public interface CalendarsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.CalendarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calendars are used to define standard working and non-working times. Projects must have one base calendar. Tasks and resources can have their own non-base calendars that are based on a base calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calendar</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getCalendarsType_Calendar()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Calendar' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CalendarType> getCalendar();

} // CalendarsType
