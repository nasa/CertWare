/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.RatesType#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getRatesType()
 * @model extendedMetaData="name='Rates_._type' kind='elementOnly'"
 * @generated
 */
public interface RatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.RateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definition of a time period, and the rates applicable for the resource during that period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getRatesType_Rate()
	 * @model containment="true" upper="25"
	 *        extendedMetaData="kind='element' name='Rate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RateType> getRate();

} // RatesType
