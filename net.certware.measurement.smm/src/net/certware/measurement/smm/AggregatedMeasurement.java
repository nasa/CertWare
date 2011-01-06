/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.AggregatedMeasurement#isIsBaseSuppled <em>Is Base Suppled</em>}</li>
 *   <li>{@link net.certware.measurement.smm.AggregatedMeasurement#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getAggregatedMeasurement()
 * @model
 * @generated
 */
public interface AggregatedMeasurement extends DimensionalMeasurement {
	/**
	 * Returns the value of the '<em><b>Is Base Suppled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Suppled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Suppled</em>' attribute.
	 * @see #setIsBaseSuppled(boolean)
	 * @see net.certware.measurement.smm.SmmPackage#getAggregatedMeasurement_IsBaseSuppled()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBaseSuppled();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.AggregatedMeasurement#isIsBaseSuppled <em>Is Base Suppled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Suppled</em>' attribute.
	 * @see #isIsBaseSuppled()
	 * @generated
	 */
	void setIsBaseSuppled(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Measurement</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.DimensionalMeasurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measurement</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getAggregatedMeasurement_BaseMeasurement()
	 * @model
	 * @generated
	 */
	EList<DimensionalMeasurement> getBaseMeasurement();

} // AggregatedMeasurement
