/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.ProvidesContext#getElement <em>Element</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.ProvidesContext#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getProvidesContext()
 * @model
 * @generated
 */
public interface ProvidesContext extends EvidenceEvaluation {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EvidenceElement)
	 * @see net.certware.evidence.evidence.EvidencePackage#getProvidesContext_Element()
	 * @model required="true"
	 * @generated
	 */
	EvidenceElement getElement();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.ProvidesContext#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EvidenceElement value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(EvidenceGroup)
	 * @see net.certware.evidence.evidence.EvidencePackage#getProvidesContext_Context()
	 * @model required="true"
	 * @generated
	 */
	EvidenceGroup getContext();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.ProvidesContext#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EvidenceGroup value);

} // ProvidesContext
