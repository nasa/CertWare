/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.EvidenceResolution#getRationale <em>Rationale</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.EvidenceResolution#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceResolution()
 * @model abstract="true"
 * @generated
 */
public interface EvidenceResolution extends EvidenceEvaluation {
	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' containment reference.
	 * @see #setRationale(Rationale)
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceResolution_Rationale()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rationale getRationale();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.EvidenceResolution#getRationale <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' containment reference.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(Rationale value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(EvidenceGroup)
	 * @see net.certware.evidence.evidence.EvidencePackage#getEvidenceResolution_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvidenceGroup getContext();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.EvidenceResolution#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EvidenceGroup value);

} // EvidenceResolution
