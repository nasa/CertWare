/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working Times Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WorkingTimesType#getWorkingTime <em>Working Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWorkingTimesType()
 * @model extendedMetaData="name='WorkingTimes_._type' kind='elementOnly'"
 * @generated
 */
public interface WorkingTimesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Working Time</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.WorkingTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the working time during the weekday.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Working Time</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getWorkingTimesType_WorkingTime()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='WorkingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WorkingTimeType> getWorkingTime();

} // WorkingTimesType
