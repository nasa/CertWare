/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Means That</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.MeansThat#getMeaning <em>Meaning</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getMeansThat()
 * @model
 * @generated
 */
public interface MeansThat extends EvidenceInterpretation {
	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' reference.
	 * @see #setMeaning(DomainAssertion)
	 * @see net.certware.evidence.evidence.EvidencePackage#getMeansThat_Meaning()
	 * @model required="true"
	 * @generated
	 */
	DomainAssertion getMeaning();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.MeansThat#getMeaning <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(DomainAssertion value);

} // MeansThat
