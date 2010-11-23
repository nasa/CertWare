/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn;

import net.certware.argument.arm.AssertedEvidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.Solution#getSolutionEvidence <em>Solution Evidence</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Solution#getSolutionContexts <em>Solution Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends AssertedEvidence {
	/**
	 * Returns the value of the '<em><b>Solution Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Evidence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Evidence</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getSolution_SolutionEvidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evidence> getSolutionEvidence();

	/**
	 * Returns the value of the '<em><b>Solution Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Contexts</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getSolution_SolutionContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getSolutionContexts();

} // Solution
