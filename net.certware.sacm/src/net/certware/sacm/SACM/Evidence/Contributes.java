/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.Contributes#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.Contributes#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getContributes()
 * @model abstract="true"
 * @generated
 */
public interface Contributes extends EvidenceObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(EvidenceRelation)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getContributes_Subject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EvidenceRelation getSubject();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.Contributes#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(EvidenceRelation value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(EvidenceRelation)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getContributes_Relation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EvidenceRelation getRelation();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.Contributes#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(EvidenceRelation value);

} // Contributes
