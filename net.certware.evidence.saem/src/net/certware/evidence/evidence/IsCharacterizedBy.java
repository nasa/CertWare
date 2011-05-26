/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Characterized By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.IsCharacterizedBy#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getIsCharacterizedBy()
 * @model
 * @generated
 */
public interface IsCharacterizedBy extends EvidenceInterpretation {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(DomainAssertion)
	 * @see net.certware.evidence.evidence.EvidencePackage#getIsCharacterizedBy_Property()
	 * @model required="true"
	 * @generated
	 */
	DomainAssertion getProperty();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.IsCharacterizedBy#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DomainAssertion value);

} // IsCharacterizedBy
