/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Assertion#getUrl <em>Url</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Assertion#getFacttype <em>Facttype</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Assertion#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends DomainAssertion {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see net.certware.evidence.evidence.EvidencePackage#getAssertion_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Assertion#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * @see net.certware.evidence.evidence.EvidencePackage#getAssertion_Facttype()
	 * @model
	 * @generated
	 */
	String getFacttype();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Assertion#getFacttype <em>Facttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facttype</em>' attribute.
	 * @see #getFacttype()
	 * @generated
	 */
	void setFacttype(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.RoleBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getAssertion_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleBinding> getRole();

} // Assertion
