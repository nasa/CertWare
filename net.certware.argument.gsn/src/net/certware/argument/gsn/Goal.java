/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn;

import net.certware.argument.arm.Claim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.Goal#getSubGoals <em>Sub Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getGoalContexts <em>Goal Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getGoalSolutions <em>Goal Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Claim {
	/**
	 * Returns the value of the '<em><b>Sub Goals</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Goals</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_SubGoals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getSubGoals();

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_Strategies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Strategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Goal Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Contexts</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_GoalContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getGoalContexts();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_Assumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Goal Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Solutions</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_GoalSolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getGoalSolutions();

} // Goal
