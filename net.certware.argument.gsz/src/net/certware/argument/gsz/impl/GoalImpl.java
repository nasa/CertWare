/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ClaimImpl;
import net.certware.argument.gsz.Assumption;
import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Goal;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.Solution;
import net.certware.argument.gsz.Strategy;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsz.impl.GoalImpl#getSubGoals <em>Sub Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.GoalImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.GoalImpl#getGoalContexts <em>Goal Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.GoalImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.GoalImpl#getGoalSolutions <em>Goal Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends ClaimImpl implements Goal {
	/**
	 * The cached value of the '{@link #getSubGoals() <em>Sub Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> subGoals;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> strategies;

	/**
	 * The cached value of the '{@link #getGoalContexts() <em>Goal Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> goalContexts;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumptions;

	/**
	 * The cached value of the '{@link #getGoalSolutions() <em>Goal Solutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> goalSolutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GszPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getSubGoals() {
		if (subGoals == null) {
			subGoals = new EObjectResolvingEList<Goal>(Goal.class, this, GszPackage.GOAL__SUB_GOALS);
		}
		return subGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectResolvingEList<Strategy>(Strategy.class, this, GszPackage.GOAL__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getGoalContexts() {
		if (goalContexts == null) {
			goalContexts = new EObjectResolvingEList<Context>(Context.class, this, GszPackage.GOAL__GOAL_CONTEXTS);
		}
		return goalContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getAssumptions() {
		if (assumptions == null) {
			assumptions = new EObjectResolvingEList<Assumption>(Assumption.class, this, GszPackage.GOAL__ASSUMPTIONS);
		}
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getGoalSolutions() {
		if (goalSolutions == null) {
			goalSolutions = new EObjectResolvingEList<Solution>(Solution.class, this, GszPackage.GOAL__GOAL_SOLUTIONS);
		}
		return goalSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GszPackage.GOAL__SUB_GOALS:
				return getSubGoals();
			case GszPackage.GOAL__STRATEGIES:
				return getStrategies();
			case GszPackage.GOAL__GOAL_CONTEXTS:
				return getGoalContexts();
			case GszPackage.GOAL__ASSUMPTIONS:
				return getAssumptions();
			case GszPackage.GOAL__GOAL_SOLUTIONS:
				return getGoalSolutions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GszPackage.GOAL__SUB_GOALS:
				getSubGoals().clear();
				getSubGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case GszPackage.GOAL__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends Strategy>)newValue);
				return;
			case GszPackage.GOAL__GOAL_CONTEXTS:
				getGoalContexts().clear();
				getGoalContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case GszPackage.GOAL__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case GszPackage.GOAL__GOAL_SOLUTIONS:
				getGoalSolutions().clear();
				getGoalSolutions().addAll((Collection<? extends Solution>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GszPackage.GOAL__SUB_GOALS:
				getSubGoals().clear();
				return;
			case GszPackage.GOAL__STRATEGIES:
				getStrategies().clear();
				return;
			case GszPackage.GOAL__GOAL_CONTEXTS:
				getGoalContexts().clear();
				return;
			case GszPackage.GOAL__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case GszPackage.GOAL__GOAL_SOLUTIONS:
				getGoalSolutions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GszPackage.GOAL__SUB_GOALS:
				return subGoals != null && !subGoals.isEmpty();
			case GszPackage.GOAL__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case GszPackage.GOAL__GOAL_CONTEXTS:
				return goalContexts != null && !goalContexts.isEmpty();
			case GszPackage.GOAL__ASSUMPTIONS:
				return assumptions != null && !assumptions.isEmpty();
			case GszPackage.GOAL__GOAL_SOLUTIONS:
				return goalSolutions != null && !goalSolutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
