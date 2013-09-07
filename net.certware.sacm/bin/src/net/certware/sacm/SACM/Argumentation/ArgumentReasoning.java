/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getStructure <em>Structure</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getDescribedInference <em>Described Inference</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getDescribedChallenge <em>Described Challenge</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getArgumentReasoning()
 * @model
 * @generated
 */
public interface ArgumentReasoning extends ReasoningElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.Argumentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getArgumentReasoning_Structure()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Argumentation> getStructure();

	/**
	 * Returns the value of the '<em><b>Described Inference</b></em>' reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.AssertedInference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described Inference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described Inference</em>' reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getArgumentReasoning_DescribedInference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AssertedInference> getDescribedInference();

	/**
	 * Returns the value of the '<em><b>Described Challenge</b></em>' reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.AssertedChallenge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described Challenge</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described Challenge</em>' reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getArgumentReasoning_DescribedChallenge()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AssertedChallenge> getDescribedChallenge();

} // ArgumentReasoning
