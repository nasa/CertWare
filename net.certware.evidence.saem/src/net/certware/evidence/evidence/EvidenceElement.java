/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.EvidenceElement#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.EvidenceElement#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.EvidenceElement#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.EvidenceElement#getTiming <em>Timing</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceElement()
 * @model abstract="true"
 * @generated
 */
public interface EvidenceElement extends Element {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.EvidenceElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceElement_Description()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description> getDescription();

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.Provenance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provenance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceElement_Provenance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provenance> getProvenance();

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.TimingProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceElement_Timing()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingProperty> getTiming();

} // EvidenceElement
