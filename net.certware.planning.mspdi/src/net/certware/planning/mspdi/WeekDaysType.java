/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week Days Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WeekDaysType#getWeekDay <em>Week Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDaysType()
 * @model extendedMetaData="name='WeekDays_._type' kind='elementOnly'"
 * @generated
 */
public interface WeekDaysType extends EObject {
	/**
	 * Returns the value of the '<em><b>Week Day</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.WeekDayType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A weekday either defines regular days of the week or exception days in the calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Week Day</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getWeekDaysType_WeekDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeekDay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeekDayType1> getWeekDay();

} // WeekDaysType
