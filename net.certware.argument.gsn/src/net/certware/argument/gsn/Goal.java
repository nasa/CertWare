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
 *   <li>{@link net.certware.argument.gsn.Goal#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getSolution <em>Solution</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Goal#getSubgoal <em>Subgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Claim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Kestrel Technology LLC"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_Strategy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Strategy> getStrategy();

	/**
	 * Returns the value of the '<em><b>Assumption</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_Assumption()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumption();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_Solution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolution();

	/**
	 * Returns the value of the '<em><b>Subgoal</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgoal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgoal</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getGoal_Subgoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getSubgoal();

} // Goal
