/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Expressed In Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getIsPrimary <em>Is Primary</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getIsExpressedInLanguage()
 * @model
 * @generated
 */
public interface IsExpressedInLanguage extends DocumentProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getIsExpressedInLanguage_Language()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(Boolean)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getIsExpressedInLanguage_IsPrimary()
	 * @model dataType="net.certware.sacm.SACM.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsPrimary();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #getIsPrimary()
	 * @generated
	 */
	void setIsPrimary(Boolean value);

} // IsExpressedInLanguage
