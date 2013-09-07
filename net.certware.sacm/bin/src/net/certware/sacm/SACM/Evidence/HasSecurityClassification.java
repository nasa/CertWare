/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Security Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.HasSecurityClassification#getSecurityClassification <em>Security Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getHasSecurityClassification()
 * @model
 * @generated
 */
public interface HasSecurityClassification extends DocumentProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Security Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Classification</em>' attribute.
	 * @see #setSecurityClassification(String)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getHasSecurityClassification_SecurityClassification()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getSecurityClassification();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.HasSecurityClassification#getSecurityClassification <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Classification</em>' attribute.
	 * @see #getSecurityClassification()
	 * @generated
	 */
	void setSecurityClassification(String value);

} // HasSecurityClassification
