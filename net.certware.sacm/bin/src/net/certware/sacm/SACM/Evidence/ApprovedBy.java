/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approved By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.ApprovedBy#getSupervisor <em>Supervisor</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getApprovedBy()
 * @model
 * @generated
 */
public interface ApprovedBy extends Provenance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' reference.
	 * @see #setSupervisor(Stakeholder)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getApprovedBy_Supervisor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Stakeholder getSupervisor();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.ApprovedBy#getSupervisor <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Stakeholder value);

} // ApprovedBy
