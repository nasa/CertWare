/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Week Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WorkWeekType#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WorkWeekType#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WorkWeekType#getWeekDay <em>Week Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWorkWeekType()
 * @model extendedMetaData="name='WorkWeek_._type' kind='elementOnly'"
 * @generated
 */
public interface WorkWeekType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a contiguous set of exception days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Period</em>' containment reference.
	 * @see #setTimePeriod(TimePeriodType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWorkWeekType_TimePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePeriodType getTimePeriod();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WorkWeekType#getTimePeriod <em>Time Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' containment reference.
	 * @see #getTimePeriod()
	 * @generated
	 */
	void setTimePeriod(TimePeriodType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the effective week.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWorkWeekType_Name()
	 * @model dataType="net.certware.planning.mspdi.NameType2"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WorkWeekType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Week Day</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.WeekDayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A weekday either defines regular days of the week or exception days in the calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Week Day</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getWorkWeekType_WeekDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeekDay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeekDayType> getWeekDay();

} // WorkWeekType
