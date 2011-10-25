/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.EvaluationAttribute#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.EvaluationAttribute#getTiming <em>Timing</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getEvaluationAttribute()
 * @model
 * @generated
 */
public interface EvaluationAttribute extends Element {
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
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvaluationAttribute_Provenance()
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
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvaluationAttribute_Timing()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingProperty> getTiming();

} // EvaluationAttribute
