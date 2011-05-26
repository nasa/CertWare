/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supercedes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Supercedes#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Supercedes#getOldAttribute <em>Old Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getSupercedes()
 * @model
 * @generated
 */
public interface Supercedes extends EvidenceEvaluation {
	/**
	 * Returns the value of the '<em><b>New Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute</em>' reference.
	 * @see #setNewAttribute(EvaluationAttribute)
	 * @see net.certware.evidence.evidence.EvidencePackage#getSupercedes_NewAttribute()
	 * @model required="true"
	 * @generated
	 */
	EvaluationAttribute getNewAttribute();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Supercedes#getNewAttribute <em>New Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute</em>' reference.
	 * @see #getNewAttribute()
	 * @generated
	 */
	void setNewAttribute(EvaluationAttribute value);

	/**
	 * Returns the value of the '<em><b>Old Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Attribute</em>' reference.
	 * @see #setOldAttribute(EvaluationAttribute)
	 * @see net.certware.evidence.evidence.EvidencePackage#getSupercedes_OldAttribute()
	 * @model required="true"
	 * @generated
	 */
	EvaluationAttribute getOldAttribute();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Supercedes#getOldAttribute <em>Old Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Attribute</em>' reference.
	 * @see #getOldAttribute()
	 * @generated
	 */
	void setOldAttribute(EvaluationAttribute value);

} // Supercedes
