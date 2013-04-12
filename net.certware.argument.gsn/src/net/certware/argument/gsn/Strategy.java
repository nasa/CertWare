/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn;

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
 *   <li>{@link net.certware.argument.gsn.Strategy#getGoals <em>Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Strategy#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Strategy#getStrategyContexts <em>Strategy Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Strategy#getStrategySolutions <em>Strategy Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends ReasoningElement {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Justifications</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justifications</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_Justifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Justification> getJustifications();

	/**
	 * Returns the value of the '<em><b>Strategy Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Contexts</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_StrategyContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getStrategyContexts();

	/**
	 * Returns the value of the '<em><b>Strategy Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Solutions</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_StrategySolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getStrategySolutions();

} // Strategy
