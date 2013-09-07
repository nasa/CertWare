/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Means That</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.MeansThat#getMeaning <em>Meaning</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getMeansThat()
 * @model
 * @generated
 */
public interface MeansThat extends EvidenceInterpretation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' reference.
	 * @see #setMeaning(FormalAssertion)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getMeansThat_Meaning()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FormalAssertion getMeaning();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.MeansThat#getMeaning <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(FormalAssertion value);

} // MeansThat
