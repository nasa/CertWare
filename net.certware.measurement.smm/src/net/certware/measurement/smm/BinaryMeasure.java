/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.BinaryMeasure#getFunctor <em>Functor</em>}</li>
 *   <li>{@link net.certware.measurement.smm.BinaryMeasure#getBaseMeasure1 <em>Base Measure1</em>}</li>
 *   <li>{@link net.certware.measurement.smm.BinaryMeasure#getBaseMeasure2 <em>Base Measure2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getBinaryMeasure()
 * @model
 * @generated
 */
public interface BinaryMeasure extends DimensionalMeasure {
	/**
	 * Returns the value of the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functor</em>' attribute.
	 * @see #setFunctor(String)
	 * @see net.certware.measurement.smm.SmmPackage#getBinaryMeasure_Functor()
	 * @model required="true"
	 * @generated
	 */
	String getFunctor();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.BinaryMeasure#getFunctor <em>Functor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functor</em>' attribute.
	 * @see #getFunctor()
	 * @generated
	 */
	void setFunctor(String value);

	/**
	 * Returns the value of the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure1</em>' reference.
	 * @see #setBaseMeasure1(DimensionalMeasure)
	 * @see net.certware.measurement.smm.SmmPackage#getBinaryMeasure_BaseMeasure1()
	 * @model required="true"
	 * @generated
	 */
	DimensionalMeasure getBaseMeasure1();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.BinaryMeasure#getBaseMeasure1 <em>Base Measure1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure1</em>' reference.
	 * @see #getBaseMeasure1()
	 * @generated
	 */
	void setBaseMeasure1(DimensionalMeasure value);

	/**
	 * Returns the value of the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Measure2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Measure2</em>' reference.
	 * @see #setBaseMeasure2(DimensionalMeasure)
	 * @see net.certware.measurement.smm.SmmPackage#getBinaryMeasure_BaseMeasure2()
	 * @model required="true"
	 * @generated
	 */
	DimensionalMeasure getBaseMeasure2();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.BinaryMeasure#getBaseMeasure2 <em>Base Measure2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Measure2</em>' reference.
	 * @see #getBaseMeasure2()
	 * @generated
	 */
	void setBaseMeasure2(DimensionalMeasure value);

} // BinaryMeasure
