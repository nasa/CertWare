/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.EvidenceEvent#getCustody <em>Custody</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceEvent()
 * @model abstract="true"
 * @generated
 */
public interface EvidenceEvent extends EvidenceElement {
	/**
	 * Returns the value of the '<em><b>Custody</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.CustodyProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custody</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custody</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceEvent_Custody()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustodyProperty> getCustody();

} // EvidenceEvent
