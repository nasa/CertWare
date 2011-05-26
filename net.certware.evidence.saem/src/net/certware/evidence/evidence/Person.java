/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Person#getAffiliation <em>Affiliation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Originator {
	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.HasRoleIn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliation</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPerson_Affiliation()
	 * @model containment="true"
	 * @generated
	 */
	EList<HasRoleIn> getAffiliation();

} // Person
