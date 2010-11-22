/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsz;

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
 *   <li>{@link net.certware.argument.gsz.Solution#getSolutionEvidence <em>Solution Evidence</em>}</li>
 *   <li>{@link net.certware.argument.gsz.Solution#getSolutionContexts <em>Solution Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsz.GszPackage#getSolution()
 * @model annotation="gmf.node label='identifier' label.pattern='Solution {0}' figure='ellipse' border.color='0,0,0' border.width='2' border.style='solid' size='100,100'"
 * @generated
 */
public interface Solution extends AssertedEvidence {
	/**
	 * Returns the value of the '<em><b>Solution Evidence</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.gsz.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Evidence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Evidence</em>' reference list.
	 * @see net.certware.argument.gsz.GszPackage#getSolution_SolutionEvidence()
	 * @model annotation="gmf.link width='1' color='0,0,0' label='evidence' source.decoration='filledrhomb' style='solid'"
	 * @generated
	 */
	EList<Evidence> getSolutionEvidence();

	/**
	 * Returns the value of the '<em><b>Solution Contexts</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.gsz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Contexts</em>' reference list.
	 * @see net.certware.argument.gsz.GszPackage#getSolution_SolutionContexts()
	 * @model annotation="gmf.link label='in context' width='1' color='0,0,0' target.decoration='closedarrow' style='solid'"
	 * @generated
	 */
	EList<Context> getSolutionContexts();

} // Solution
