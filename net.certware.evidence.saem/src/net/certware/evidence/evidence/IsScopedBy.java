/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Scoped By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.IsScopedBy#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getIsScopedBy()
 * @model
 * @generated
 */
public interface IsScopedBy extends EvidenceInterpretation {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(net.certware.evidence.evidence.Object)
	 * @see net.certware.evidence.evidence.EvidencePackage#getIsScopedBy_Scope()
	 * @model required="true"
	 * @generated
	 */
	net.certware.evidence.evidence.Object getScope();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.IsScopedBy#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(net.certware.evidence.evidence.Object value);

} // IsScopedBy
