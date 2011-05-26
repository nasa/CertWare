/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.EvidenceRequest#getItem <em>Item</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.EvidenceRequest#getProvenance <em>Provenance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceRequest()
 * @model
 * @generated
 */
public interface EvidenceRequest extends AdministrativeElement {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.EvidenceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceRequest_Item()
	 * @model
	 * @generated
	 */
	EList<EvidenceItem> getItem();

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
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceRequest_Provenance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provenance> getProvenance();

} // EvidenceRequest
