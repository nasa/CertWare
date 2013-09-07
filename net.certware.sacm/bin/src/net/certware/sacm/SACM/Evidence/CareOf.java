/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.CareOf#getCustodian <em>Custodian</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getCareOf()
 * @model
 * @generated
 */
public interface CareOf extends CustodyProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Custodian</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custodian</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custodian</em>' reference.
	 * @see #setCustodian(Person)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getCareOf_Custodian()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Person getCustodian();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.CareOf#getCustodian <em>Custodian</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian</em>' reference.
	 * @see #getCustodian()
	 * @generated
	 */
	void setCustodian(Person value);

} // CareOf
