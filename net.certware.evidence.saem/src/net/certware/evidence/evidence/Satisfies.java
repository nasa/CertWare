/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Satisfies#getObjective <em>Objective</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getSatisfies()
 * @model
 * @generated
 */
public interface Satisfies extends ActivityProperty {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' reference.
	 * @see #setObjective(ProjectObjective)
	 * @see net.certware.evidence.evidence.EvidencePackage#getSatisfies_Objective()
	 * @model required="true"
	 * @generated
	 */
	ProjectObjective getObjective();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Satisfies#getObjective <em>Objective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(ProjectObjective value);

} // Satisfies
