/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.EvidenceRelation#getItem <em>Item</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.EvidenceRelation#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceRelation()
 * @model abstract="true"
 * @generated
 */
public interface EvidenceRelation extends EvidenceEvaluation {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(EvidenceItem)
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceRelation_Item()
	 * @model required="true"
	 * @generated
	 */
	EvidenceItem getItem();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.EvidenceRelation#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(EvidenceItem value);

	/**
	 * Returns the value of the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion</em>' reference.
	 * @see #setAssertion(DomainAssertion)
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceRelation_Assertion()
	 * @model required="true"
	 * @generated
	 */
	DomainAssertion getAssertion();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.EvidenceRelation#getAssertion <em>Assertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion</em>' reference.
	 * @see #getAssertion()
	 * @generated
	 */
	void setAssertion(DomainAssertion value);

} // EvidenceRelation
