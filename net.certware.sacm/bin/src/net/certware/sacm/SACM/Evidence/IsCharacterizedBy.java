/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Characterized By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.IsCharacterizedBy#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getIsCharacterizedBy()
 * @model
 * @generated
 */
public interface IsCharacterizedBy extends EvidenceInterpretation {
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
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getIsCharacterizedBy_Assertion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FormalAssertion getAssertion();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.IsCharacterizedBy#getAssertion <em>Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(FormalAssertion value);

} // IsCharacterizedBy
