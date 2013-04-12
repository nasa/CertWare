/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completeness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Completeness#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getCompleteness()
 * @model
 * @generated
 */
public interface Completeness extends DocumentAttribute {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.evidence.evidence.CompletenessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.certware.evidence.evidence.CompletenessLevel
	 * @see #setStatus(CompletenessLevel)
	 * @see net.certware.evidence.evidence.EvidencePackage#getCompleteness_Status()
	 * @model
	 * @generated
	 */
	CompletenessLevel getStatus();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Completeness#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.certware.evidence.evidence.CompletenessLevel
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CompletenessLevel value);

} // Completeness
