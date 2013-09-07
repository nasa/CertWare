/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceRelation#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceRelation#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceRelation()
 * @model abstract="true"
 * @generated
 */
public interface EvidenceRelation extends EvidenceEvaluation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion</em>' reference.
	 * @see #setAssertion(FormalAssertion)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceRelation_Assertion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FormalAssertion getAssertion();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.EvidenceRelation#getAssertion <em>Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(FormalAssertion value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(EvidenceItem)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceRelation_Subject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EvidenceItem getSubject();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.EvidenceRelation#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(EvidenceItem value);

} // EvidenceRelation
