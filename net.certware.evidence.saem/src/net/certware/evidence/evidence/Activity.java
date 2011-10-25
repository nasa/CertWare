/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Activity#getProperty <em>Property</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Activity#getTiming <em>Timing</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Activity#getProvenance <em>Provenance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends AdministrativeElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.ActivityProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getActivity_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityProperty> getProperty();

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
	 * @see net.certware.evidence.evidence.EvidencePackage#getActivity_Timing()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingProperty> getTiming();

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
	 * @see net.certware.evidence.evidence.EvidencePackage#getActivity_Provenance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provenance> getProvenance();

} // Activity
