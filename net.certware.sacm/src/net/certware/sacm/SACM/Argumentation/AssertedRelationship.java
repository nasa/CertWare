/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.AssertedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.AssertedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getAssertedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface AssertedRelationship extends Assertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.ArgumentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getAssertedRelationship_Source()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArgumentElement> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.ArgumentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getAssertedRelationship_Target()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArgumentElement> getTarget();

} // AssertedRelationship
