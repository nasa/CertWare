/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collective Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getCollectiveMeasure()
 * @model
 * @generated
 */
public interface CollectiveMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure</em>' reference.
	 * @see #setBaseMeasure(DimensionalMeasure)
	 * @see net.certware.measurement.smm.SmmPackage#getCollectiveMeasure_BaseMeasure()
	 * @model required="true"
	 * @generated
	 */
	DimensionalMeasure getBaseMeasure();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure</em>' reference.
	 * @see #getBaseMeasure()
	 * @generated
	 */
	void setBaseMeasure(DimensionalMeasure value);

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
	 * @see net.certware.measurement.smm.SmmPackage#getCollectiveMeasure_Accumulator()
	 * @model required="true"
	 * @generated
	 */
	Accumulator getAccumulator();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' attribute.
	 * @see net.certware.measurement.smm.Accumulator
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Accumulator value);

} // CollectiveMeasure
