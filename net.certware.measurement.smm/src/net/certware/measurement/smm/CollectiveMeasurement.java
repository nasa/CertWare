/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link net.certware.measurement.smm.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link net.certware.measurement.smm.CollectiveMeasurement#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getCollectiveMeasurement()
 * @model
 * @generated
 */
public interface CollectiveMeasurement extends DimensionalMeasurement {
	/**
	 * Returns the value of the '<em><b>Accumulator</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.measurement.smm.Accumulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulator</em>' attribute.
	 * @see net.certware.measurement.smm.Accumulator
	 * @see #setAccumulator(Accumulator)
	 * @see net.certware.measurement.smm.SmmPackage#getCollectiveMeasurement_Accumulator()
	 * @model required="true"
	 * @generated
	 */
	Accumulator getAccumulator();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' attribute.
	 * @see net.certware.measurement.smm.Accumulator
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Accumulator value);

	/**
	 * Returns the value of the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Base Supplied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #setIsBaseSupplied(boolean)
	 * @see net.certware.measurement.smm.SmmPackage#getCollectiveMeasurement_IsBaseSupplied()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsBaseSupplied();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Base Supplied</em>' attribute.
	 * @see #isIsBaseSupplied()
	 * @generated
	 */
	void setIsBaseSupplied(boolean value);

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
	 * @see net.certware.measurement.smm.SmmPackage#getCollectiveMeasurement_BaseMeasurement()
	 * @model
	 * @generated
	 */
	EList<DimensionalMeasurement> getBaseMeasurement();

} // CollectiveMeasurement
