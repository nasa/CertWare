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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.GoalImpl#getSubgoal <em>Subgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends ClaimImpl implements Goal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Kestrel Technology LLC"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> strategy;

	/**
	 * The cached value of the '{@link #getAssumption() <em>Assumption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumption()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumption;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> context;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solution;

	/**
	 * The cached value of the '{@link #getSubgoal() <em>Subgoal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> subgoal;

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
	public EList<Strategy> getStrategy() {
		if (strategy == null) {
			strategy = new EObjectContainmentEList<Strategy>(Strategy.class, this, GsnPackage.GOAL__STRATEGY);
		}
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getAssumption() {
		if (assumption == null) {
			assumption = new EObjectContainmentEList<Assumption>(Assumption.class, this, GsnPackage.GOAL__ASSUMPTION);
		}
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<Context>(Context.class, this, GsnPackage.GOAL__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolution() {
		if (solution == null) {
			solution = new EObjectContainmentEList<Solution>(Solution.class, this, GsnPackage.GOAL__SOLUTION);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getSubgoal() {
		if (subgoal == null) {
			subgoal = new EObjectContainmentEList<Goal>(Goal.class, this, GsnPackage.GOAL__SUBGOAL);
		}
		return subgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsnPackage.GOAL__STRATEGY:
				return ((InternalEList<?>)getStrategy()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__ASSUMPTION:
				return ((InternalEList<?>)getAssumption()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__SOLUTION:
				return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
			case GsnPackage.GOAL__SUBGOAL:
				return ((InternalEList<?>)getSubgoal()).basicRemove(otherEnd, msgs);
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
			case GsnPackage.GOAL__STRATEGY:
				return getStrategy();
			case GsnPackage.GOAL__ASSUMPTION:
				return getAssumption();
			case GsnPackage.GOAL__CONTEXT:
				return getContext();
			case GsnPackage.GOAL__SOLUTION:
				return getSolution();
			case GsnPackage.GOAL__SUBGOAL:
				return getSubgoal();
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
			case GsnPackage.GOAL__STRATEGY:
				getStrategy().clear();
				getStrategy().addAll((Collection<? extends Strategy>)newValue);
				return;
			case GsnPackage.GOAL__ASSUMPTION:
				getAssumption().clear();
				getAssumption().addAll((Collection<? extends Assumption>)newValue);
				return;
			case GsnPackage.GOAL__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends Context>)newValue);
				return;
			case GsnPackage.GOAL__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends Solution>)newValue);
				return;
			case GsnPackage.GOAL__SUBGOAL:
				getSubgoal().clear();
				getSubgoal().addAll((Collection<? extends Goal>)newValue);
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
			case GsnPackage.GOAL__STRATEGY:
				getStrategy().clear();
				return;
			case GsnPackage.GOAL__ASSUMPTION:
				getAssumption().clear();
				return;
			case GsnPackage.GOAL__CONTEXT:
				getContext().clear();
				return;
			case GsnPackage.GOAL__SOLUTION:
				getSolution().clear();
				return;
			case GsnPackage.GOAL__SUBGOAL:
				getSubgoal().clear();
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
			case GsnPackage.GOAL__STRATEGY:
				return strategy != null && !strategy.isEmpty();
			case GsnPackage.GOAL__ASSUMPTION:
				return assumption != null && !assumption.isEmpty();
			case GsnPackage.GOAL__CONTEXT:
				return context != null && !context.isEmpty();
			case GsnPackage.GOAL__SOLUTION:
				return solution != null && !solution.isEmpty();
			case GsnPackage.GOAL__SUBGOAL:
				return subgoal != null && !subgoal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
