/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.DomainAssertion#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getDomainAssertion()
 * @model abstract="true"
 * @generated
 */
public interface DomainAssertion extends Meaning, Element {
	/**
	 * Returns the value of the '<em><b>Stmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stmt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stmt</em>' attribute.
	 * @see #setStmt(String)
	 * @see net.certware.evidence.evidence.EvidencePackage#getDomainAssertion_Stmt()
	 * @model
	 * @generated
	 */
	String getStmt();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.DomainAssertion#getStmt <em>Stmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stmt</em>' attribute.
	 * @see #getStmt()
	 * @generated
	 */
	void setStmt(String value);

} // DomainAssertion
