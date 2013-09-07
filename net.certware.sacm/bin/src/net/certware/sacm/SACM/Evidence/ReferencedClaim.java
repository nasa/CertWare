/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import net.certware.sacm.SACM.Argumentation.Claim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.ReferencedClaim#getClaim <em>Claim</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getReferencedClaim()
 * @model
 * @generated
 */
public interface ReferencedClaim extends FormalAssertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' reference.
	 * @see #setClaim(Claim)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getReferencedClaim_Claim()
	 * @model ordered="false"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.ReferencedClaim#getClaim <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

} // ReferencedClaim
