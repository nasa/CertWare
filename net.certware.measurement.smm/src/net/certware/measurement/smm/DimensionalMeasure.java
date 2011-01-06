/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.DimensionalMeasure#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getDimensionalMeasure()
 * @model
 * @generated
 */
public interface DimensionalMeasure extends Measure {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see net.certware.measurement.smm.SmmPackage#getDimensionalMeasure_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.DimensionalMeasure#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // DimensionalMeasure
