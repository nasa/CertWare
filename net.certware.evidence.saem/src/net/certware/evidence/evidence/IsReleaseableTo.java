/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Releaseable To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.IsReleaseableTo#getReleasability <em>Releasability</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getIsReleaseableTo()
 * @model
 * @generated
 */
public interface IsReleaseableTo extends DocumentProperty {
	/**
	 * Returns the value of the '<em><b>Releasability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releasability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releasability</em>' attribute.
	 * @see #setReleasability(String)
	 * @see net.certware.evidence.evidence.EvidencePackage#getIsReleaseableTo_Releasability()
	 * @model
	 * @generated
	 */
	String getReleasability();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.IsReleaseableTo#getReleasability <em>Releasability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Releasability</em>' attribute.
	 * @see #getReleasability()
	 * @generated
	 */
	void setReleasability(String value);

} // IsReleaseableTo
