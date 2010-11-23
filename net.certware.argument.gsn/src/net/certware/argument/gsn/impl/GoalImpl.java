/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ClaimImpl;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getSubGoals <em>Sub Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getGoalContexts <em>Goal Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getGoalSolutions <em>Goal Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends ClaimImpl implements Goal {
	/**
	 * The cached value of the '{@link #getSubGoals() <em>Sub Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> subGoals;

	/**
	 * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> strategies;

	/**
	 * The cached value of the '{@link #getGoalContexts() <em>Goal Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> goalContexts;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumptions;

	/**
	 * The cached value of the '{@link #getGoalSolutions() <em>Goal Solutions</em>}' containment reference list.
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
		return GsnPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getSubGoals() {
		if (subGoals == null) {
			subGoals = new EObjectContainmentEList<Goal>(Goal.class, this, GsnPackage.GOAL__SUB_GOALS);
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
			strategies = new EObjectContainmentEList<Strategy>(Strategy.class, this, GsnPackage.GOAL__STRATEGIES);
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
			goalContexts = new EObjectContainmentEList<Context>(Context.class, this, GsnPackage.GOAL__GOAL_CONTEXTS);
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
			assumptions = new EObjectContainmentEList<Assumption>(Assumption.class, this, GsnPackage.GOAL__ASSUMPTIONS);
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
			goalSolutions = new EObjectContainmentEList<Solution>(Solution.class, this, GsnPackage.GOAL__GOAL_SOLUTIONS);
		}
		return goalSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsnPackage.GOAL__SUB_GOALS:
				return ((InternalEList<?>)getSubGoals()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__GOAL_CONTEXTS:
				return ((InternalEList<?>)getGoalContexts()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__ASSUMPTIONS:
				return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__GOAL_SOLUTIONS:
				return ((InternalEList<?>)getGoalSolutions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GsnPackage.GOAL__SUB_GOALS:
				return getSubGoals();
			case GsnPackage.GOAL__STRATEGIES:
				return getStrategies();
			case GsnPackage.GOAL__GOAL_CONTEXTS:
				return getGoalContexts();
			case GsnPackage.GOAL__ASSUMPTIONS:
				return getAssumptions();
			case GsnPackage.GOAL__GOAL_SOLUTIONS:
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
			case GsnPackage.GOAL__SUB_GOALS:
				getSubGoals().clear();
				getSubGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case GsnPackage.GOAL__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends Strategy>)newValue);
				return;
			case GsnPackage.GOAL__GOAL_CONTEXTS:
				getGoalContexts().clear();
				getGoalContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case GsnPackage.GOAL__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case GsnPackage.GOAL__GOAL_SOLUTIONS:
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
			case GsnPackage.GOAL__SUB_GOALS:
				getSubGoals().clear();
				return;
			case GsnPackage.GOAL__STRATEGIES:
				getStrategies().clear();
				return;
			case GsnPackage.GOAL__GOAL_CONTEXTS:
				getGoalContexts().clear();
				return;
			case GsnPackage.GOAL__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case GsnPackage.GOAL__GOAL_SOLUTIONS:
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
			case GsnPackage.GOAL__SUB_GOALS:
				return subGoals != null && !subGoals.isEmpty();
			case GsnPackage.GOAL__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
			case GsnPackage.GOAL__GOAL_CONTEXTS:
				return goalContexts != null && !goalContexts.isEmpty();
			case GsnPackage.GOAL__ASSUMPTIONS:
				return assumptions != null && !assumptions.isEmpty();
			case GsnPackage.GOAL__GOAL_SOLUTIONS:
				return goalSolutions != null && !goalSolutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
