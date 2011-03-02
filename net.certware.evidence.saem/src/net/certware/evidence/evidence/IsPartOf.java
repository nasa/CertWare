/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Part Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.IsPartOf#getWhole <em>Whole</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getIsPartOf()
 * @model
 * @generated
 */
public interface IsPartOf extends ExhibitProperty {
	/**
	 * Returns the value of the '<em><b>Whole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole</em>' reference.
	 * @see #setWhole(Exhibit)
	 * @see net.certware.evidence.evidence.EvidencePackage#getIsPartOf_Whole()
	 * @model required="true"
	 * @generated
	 */
	Exhibit getWhole();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.IsPartOf#getWhole <em>Whole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole</em>' reference.
	 * @see #getWhole()
	 * @generated
	 */
	void setWhole(Exhibit value);

} // IsPartOf
