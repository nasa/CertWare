/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.Characteristic#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Characteristic#getParent <em>Parent</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Characteristic#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getCharacteristic()
 * @model
 * @generated
 */
public interface Characteristic extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.measurement.smm.SmmPackage#getCharacteristic_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Characteristic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Characteristic)
	 * @see net.certware.measurement.smm.SmmPackage#getCharacteristic_Parent()
	 * @model
	 * @generated
	 */
	Characteristic getParent();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Characteristic#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measure#getTrait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' containment reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getCharacteristic_Characteristics()
	 * @see net.certware.measurement.smm.Measure#getTrait
	 * @model opposite="trait" containment="true"
	 * @generated
	 */
	EList<Measure> getCharacteristics();

} // Characteristic
