/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz;

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
 *   <li>{@link net.certware.argument.caz.Solution#getSolutionContexts <em>Solution Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.Solution#getSolutionEvidence <em>Solution Evidence</em>}</li>
 *   <li>{@link net.certware.argument.caz.Solution#getSolutionCriteria <em>Solution Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.caz.EuzPackage#getSolution()
 * @model annotation="gmf.node label='identifier' label.pattern='Solution {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='ellipse' border.style='solid' size='100,60' color='250,250,250' tool.name='Solution Node' tool.description='Creates a solution node on the diagram canvas' tool.small.path='icons/obj16/circle.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/circle.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Solution extends AssertedEvidence {
	/**
	 * Returns the value of the '<em><b>Solution Contexts</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Contexts</em>' reference list.
	 * @see net.certware.argument.caz.EuzPackage#getSolution_SolutionContexts()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Solution with Context' tool.description='Links a solution with its context' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Context> getSolutionContexts();

	/**
	 * Returns the value of the '<em><b>Solution Evidence</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Evidence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Evidence</em>' reference list.
	 * @see net.certware.argument.caz.EuzPackage#getSolution_SolutionEvidence()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Solution with Evidence' tool.description='Links a solution with its evidence' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Evidence> getSolutionEvidence();

	/**
	 * Returns the value of the '<em><b>Solution Criteria</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Criteria</em>' reference list.
	 * @see net.certware.argument.caz.EuzPackage#getSolution_SolutionCriteria()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Solution with Criteria' tool.description='Links a solution with its context' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Criteria> getSolutionCriteria();

} // Solution
