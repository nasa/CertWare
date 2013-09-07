/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completeness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.Completeness#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getCompleteness()
 * @model
 * @generated
 */
public interface Completeness extends DocumentProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.sacm.SACM.Evidence.CompletenessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.certware.sacm.SACM.Evidence.CompletenessLevel
	 * @see #setStatus(CompletenessLevel)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getCompleteness_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CompletenessLevel getStatus();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.Completeness#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.certware.sacm.SACM.Evidence.CompletenessLevel
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CompletenessLevel value);

} // Completeness
