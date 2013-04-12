/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability Periods Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.AvailabilityPeriodsType#getAvailabilityPeriod <em>Availability Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getAvailabilityPeriodsType()
 * @model extendedMetaData="name='AvailabilityPeriods_._type' kind='elementOnly'"
 * @generated
 */
public interface AvailabilityPeriodsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Availability Period</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.AvailabilityPeriodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period the resource is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Period</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getAvailabilityPeriodsType_AvailabilityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AvailabilityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AvailabilityPeriodType> getAvailabilityPeriod();

} // AvailabilityPeriodsType
