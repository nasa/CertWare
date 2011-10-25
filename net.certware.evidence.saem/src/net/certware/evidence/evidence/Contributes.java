/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Contributes#getRelation1 <em>Relation1</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Contributes#getRelation2 <em>Relation2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getContributes()
 * @model abstract="true"
 * @generated
 */
public interface Contributes extends EvidenceObservation {
	/**
	 * Returns the value of the '<em><b>Relation1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation1</em>' reference.
	 * @see #setRelation1(EvidenceRelation)
	 * @see net.certware.evidence.evidence.EvidencePackage#getContributes_Relation1()
	 * @model required="true"
	 * @generated
	 */
	EvidenceRelation getRelation1();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Contributes#getRelation1 <em>Relation1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation1</em>' reference.
	 * @see #getRelation1()
	 * @generated
	 */
	void setRelation1(EvidenceRelation value);

	/**
	 * Returns the value of the '<em><b>Relation2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation2</em>' reference.
	 * @see #setRelation2(EvidenceRelation)
	 * @see net.certware.evidence.evidence.EvidencePackage#getContributes_Relation2()
	 * @model required="true"
	 * @generated
	 */
	EvidenceRelation getRelation2();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Contributes#getRelation2 <em>Relation2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation2</em>' reference.
	 * @see #getRelation2()
	 * @generated
	 */
	void setRelation2(EvidenceRelation value);

} // Contributes
