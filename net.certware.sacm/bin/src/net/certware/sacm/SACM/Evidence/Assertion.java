/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.Assertion#getFacttype <em>Facttype</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.Assertion#getRole <em>Role</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.Assertion#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends FormalAssertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Facttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facttype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facttype</em>' attribute.
	 * @see #setFacttype(String)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getAssertion_Facttype()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getFacttype();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.Assertion#getFacttype <em>Facttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facttype</em>' attribute.
	 * @see #getFacttype()
	 * @generated
	 */
	void setFacttype(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.RoleBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getAssertion_Role()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RoleBinding> getRole();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(EObject)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getAssertion_Definition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EObject getDefinition();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.Assertion#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(EObject value);

} // Assertion
