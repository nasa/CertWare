/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsz;

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
 *   <li>{@link net.certware.argument.gsz.Goal#getSubGoals <em>Sub Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsz.Goal#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link net.certware.argument.gsz.Goal#getGoalContexts <em>Goal Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsz.Goal#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.gsz.Goal#getGoalSolutions <em>Goal Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsz.GszPackage#getGoal()
 * @model annotation="gmf.node label='identifier' label.pattern='Goal {0}' figure='ellipse' border.color='0,0,0' border.width='2' border.style='solid' size='100,60'"
 * @generated
 */
public interface Goal extends Claim {
	/**
	 * Returns the value of the '<em><b>Sub Goals</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.gsz.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Goals</em>' reference list.
	 * @see net.certware.argument.gsz.GszPackage#getGoal_SubGoals()
	 * @model annotation="gmf.link label='sub-goal' width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid'"
	 * @generated
	 */
	EList<Goal> getSubGoals();

	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.gsz.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' reference list.
	 * @see net.certware.argument.gsz.GszPackage#getGoal_Strategies()
	 * @model annotation="gmf.link label='is solved by' width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid'"
	 * @generated
	 */
	EList<Strategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Goal Contexts</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.gsz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Contexts</em>' reference list.
	 * @see net.certware.argument.gsz.GszPackage#getGoal_GoalContexts()
	 * @model annotation="gmf.link label='in context' width='1' color='0,0,0' target.decoration='closedarrow' style='solid'"
	 * @generated
	 */
	EList<Context> getGoalContexts();

	/**
	 * Returns the value of the '<em><b>Assumptions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.gsz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumptions</em>' reference list.
	 * @see net.certware.argument.gsz.GszPackage#getGoal_Assumptions()
	 * @model annotation="gmf.link label='assumption' width='1' color='0,0,0' target.decoration='closedarrow' style='solid'"
	 * @generated
	 */
	EList<Assumption> getAssumptions();

	/**
	 * Returns the value of the '<em><b>Goal Solutions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.gsz.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Solutions</em>' reference list.
	 * @see net.certware.argument.gsz.GszPackage#getGoal_GoalSolutions()
	 * @model annotation="gmf.link label='is solved by' width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid'"
	 * @generated
	 */
	EList<Solution> getGoalSolutions();

} // Goal
