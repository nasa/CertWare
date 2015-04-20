/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.argument.cae;

import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.InformationElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.cae.Evidence#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.cae.Evidence#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.cae.CaePackage#getEvidence()
 * @model
 * @generated
 */
public interface Evidence extends AssertedEvidence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.cae.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see net.certware.argument.cae.CaePackage#getEvidence_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.arm.InformationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' reference list.
	 * @see net.certware.argument.cae.CaePackage#getEvidence_Evidence()
	 * @model required="true"
	 * @generated
	 */
	EList<InformationElement> getEvidence();

} // Evidence
