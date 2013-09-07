/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Part Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.IsPartOf#getWhole <em>Whole</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getIsPartOf()
 * @model
 * @generated
 */
public interface IsPartOf extends ExhibitProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Whole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole</em>' reference.
	 * @see #setWhole(Exhibit)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getIsPartOf_Whole()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Exhibit getWhole();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.IsPartOf#getWhole <em>Whole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole</em>' reference.
	 * @see #getWhole()
	 * @generated
	 */
	void setWhole(Exhibit value);

} // IsPartOf
