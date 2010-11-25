/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz;

import net.certware.argument.arm.Claim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.euz.Argument#getArgumentStrategies <em>Argument Strategies</em>}</li>
 *   <li>{@link net.certware.argument.euz.Argument#getArgumentAssumptions <em>Argument Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.euz.Argument#getArgumentContexts <em>Argument Contexts</em>}</li>
 *   <li>{@link net.certware.argument.euz.Argument#getArgumentSolutions <em>Argument Solutions</em>}</li>
 *   <li>{@link net.certware.argument.euz.Argument#getArgumentCriteria <em>Argument Criteria</em>}</li>
 *   <li>{@link net.certware.argument.euz.Argument#getArgumentJustifications <em>Argument Justifications</em>}</li>
 *   <li>{@link net.certware.argument.euz.Argument#getSubArguments <em>Sub Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.euz.EuzPackage#getArgument()
 * @model annotation="gmf.node label='identifier' label.pattern='Argument {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='rectangle' border.style='solid' size='100,60' color='152,251,152' tool.name='Argument Node' tool.description='Creates an argument node on the diagram canvas' tool.small.path='icons/obj16/rectangle.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/rectangle.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Argument extends Claim {
	/**
	 * Returns the value of the '<em><b>Argument Strategies</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Strategies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Strategies</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getArgument_ArgumentStrategies()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Argument with Strategy' tool.description='Links an argument with its strategy' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Strategy> getArgumentStrategies();

	/**
	 * Returns the value of the '<em><b>Argument Assumptions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Assumptions</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getArgument_ArgumentAssumptions()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Argument with Assumption' tool.description='Links an argument with its assumption' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Assumption> getArgumentAssumptions();

	/**
	 * Returns the value of the '<em><b>Argument Contexts</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Contexts</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getArgument_ArgumentContexts()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Argument with Context' tool.description='Links an argument with its context' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Context> getArgumentContexts();

	/**
	 * Returns the value of the '<em><b>Argument Solutions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Solutions</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getArgument_ArgumentSolutions()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Argument with Solution' tool.description='Links an argument with its solution' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Solution> getArgumentSolutions();

	/**
	 * Returns the value of the '<em><b>Argument Criteria</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Criteria</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getArgument_ArgumentCriteria()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Argument with Criteria' tool.description='Links an argument with its criteria' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Criteria> getArgumentCriteria();

	/**
	 * Returns the value of the '<em><b>Argument Justifications</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Justifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Justifications</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getArgument_ArgumentJustifications()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Argument with Justification' tool.description='Links an argument with its justification' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Justification> getArgumentJustifications();

	/**
	 * Returns the value of the '<em><b>Sub Arguments</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Arguments</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getArgument_SubArguments()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Argument with Sub-Argument' tool.description='Links an argument with its sub-argument' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Argument> getSubArguments();

} // Argument
