/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Security Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.HasSecurityClassification#getSecurityClassification <em>Security Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getHasSecurityClassification()
 * @model
 * @generated
 */
public interface HasSecurityClassification extends DocumentProperty {
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
	 * @see net.certware.evidence.evidence.EvidencePackage#getHasSecurityClassification_SecurityClassification()
	 * @model
	 * @generated
	 */
	String getSecurityClassification();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.HasSecurityClassification#getSecurityClassification <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Classification</em>' attribute.
	 * @see #getSecurityClassification()
	 * @generated
	 */
	void setSecurityClassification(String value);

} // HasSecurityClassification
