/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz;

import net.certware.argument.arm.ReasoningElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.caz.Strategy#getStrategyArguments <em>Strategy Arguments</em>}</li>
 *   <li>{@link net.certware.argument.caz.Strategy#getStrategyJustifications <em>Strategy Justifications</em>}</li>
 *   <li>{@link net.certware.argument.caz.Strategy#getStrategyCriteria <em>Strategy Criteria</em>}</li>
 *   <li>{@link net.certware.argument.caz.Strategy#getStrategyAssumptions <em>Strategy Assumptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.caz.EuzPackage#getStrategy()
 * @model annotation="gmf.node label='identifier' label.pattern='Strategy {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='net.certware.argument.diagram.figures.ParallelogramFigure' border.style='solid' size='100,60' color='250,250,250' tool.name='Strategy Node' tool.description='Creates a strategy node on the diagram canvas' tool.small.path='icons/obj16/parallelogram.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/parallelogram.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Strategy extends ReasoningElement {
	/**
	 * Returns the value of the '<em><b>Strategy Arguments</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Arguments</em>' reference list.
	 * @see net.certware.argument.caz.EuzPackage#getStrategy_StrategyArguments()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Strategy with Argument' tool.description='Links a strategy with its argument' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Argument> getStrategyArguments();

	/**
	 * Returns the value of the '<em><b>Strategy Justifications</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Justifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Justifications</em>' reference list.
	 * @see net.certware.argument.caz.EuzPackage#getStrategy_StrategyJustifications()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Strategy with Justification' tool.description='Links and argument with its strategy' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Justification> getStrategyJustifications();

	/**
	 * Returns the value of the '<em><b>Strategy Criteria</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Criteria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Criteria</em>' reference list.
	 * @see net.certware.argument.caz.EuzPackage#getStrategy_StrategyCriteria()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Strategy with Criteria' tool.description='Links a strategy with its criteria' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Criteria> getStrategyCriteria();

	/**
	 * Returns the value of the '<em><b>Strategy Assumptions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Assumptions</em>' reference list.
	 * @see net.certware.argument.caz.EuzPackage#getStrategy_StrategyAssumptions()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Strategy with Assumption' tool.description='Links a strategy with its assumption' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Assumption> getStrategyAssumptions();

} // Strategy
