/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import net.certware.sacm.SACM.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getTiming <em>Timing</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getCustody <em>Custody</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceElement()
 * @model abstract="true"
 * @generated
 */
public interface EvidenceElement extends ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.TimingProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceElement_Timing()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TimingProperty> getTiming();

	/**
	 * Returns the value of the '<em><b>Custody</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.CustodyProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custody</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custody</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceElement_Custody()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CustodyProperty> getCustody();

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.Provenance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provenance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceElement_Provenance()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Provenance> getProvenance();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.EvidenceEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceElement_Event()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EvidenceEvent> getEvent();

} // EvidenceElement
