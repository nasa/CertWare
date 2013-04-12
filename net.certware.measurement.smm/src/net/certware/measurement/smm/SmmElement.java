/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.SmmElement#getModel <em>Model</em>}</li>
 *   <li>{@link net.certware.measurement.smm.SmmElement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link net.certware.measurement.smm.SmmElement#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getSmmElement()
 * @model abstract="true"
 * @generated
 */
public interface SmmElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.SmmModel#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(SmmModel)
	 * @see net.certware.measurement.smm.SmmPackage#getSmmElement_Model()
	 * @see net.certware.measurement.smm.SmmModel#getModelElement
	 * @model opposite="modelElement" transient="false"
	 * @generated
	 */
	SmmModel getModel();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.SmmElement#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(SmmModel value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Attribute}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getSmmElement_Attribute()
	 * @see net.certware.measurement.smm.Attribute#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Annotation}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Annotation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getSmmElement_Annotation()
	 * @see net.certware.measurement.smm.Annotation#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SmmRelationship> getInbound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<SmmRelationship> getOutbound();

} // SmmElement
