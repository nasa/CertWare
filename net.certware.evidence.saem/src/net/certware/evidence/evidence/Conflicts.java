/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflicts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Conflicts#getAssertion1 <em>Assertion1</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Conflicts#getAssertion2 <em>Assertion2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getConflicts()
 * @model
 * @generated
 */
public interface Conflicts extends EvidenceObservation {
	/**
	 * Returns the value of the '<em><b>Assertion1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion1</em>' reference.
	 * @see #setAssertion1(DomainAssertion)
	 * @see net.certware.evidence.evidence.EvidencePackage#getConflicts_Assertion1()
	 * @model required="true"
	 * @generated
	 */
	DomainAssertion getAssertion1();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Conflicts#getAssertion1 <em>Assertion1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion1</em>' reference.
	 * @see #getAssertion1()
	 * @generated
	 */
	void setAssertion1(DomainAssertion value);

	/**
	 * Returns the value of the '<em><b>Assertion2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion2</em>' reference.
	 * @see #setAssertion2(DomainAssertion)
	 * @see net.certware.evidence.evidence.EvidencePackage#getConflicts_Assertion2()
	 * @model required="true"
	 * @generated
	 */
	DomainAssertion getAssertion2();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Conflicts#getAssertion2 <em>Assertion2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion2</em>' reference.
	 * @see #getAssertion2()
	 * @generated
	 */
	void setAssertion2(DomainAssertion value);

} // Conflicts
