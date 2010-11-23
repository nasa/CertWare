/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ReasoningElementImpl;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Justification;
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
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.impl.StrategyImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.StrategyImpl#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.StrategyImpl#getStrategyContexts <em>Strategy Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.StrategyImpl#getStrategySolutions <em>Strategy Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends ReasoningElementImpl implements Strategy {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getJustifications() <em>Justifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> justifications;

	/**
	 * The cached value of the '{@link #getStrategyContexts() <em>Strategy Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> strategyContexts;

	/**
	 * The cached value of the '{@link #getStrategySolutions() <em>Strategy Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategySolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> strategySolutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GsnPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, GsnPackage.STRATEGY__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getJustifications() {
		if (justifications == null) {
			justifications = new EObjectContainmentEList<Justification>(Justification.class, this, GsnPackage.STRATEGY__JUSTIFICATIONS);
		}
		return justifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getStrategyContexts() {
		if (strategyContexts == null) {
			strategyContexts = new EObjectContainmentEList<Context>(Context.class, this, GsnPackage.STRATEGY__STRATEGY_CONTEXTS);
		}
		return strategyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getStrategySolutions() {
		if (strategySolutions == null) {
			strategySolutions = new EObjectContainmentEList<Solution>(Solution.class, this, GsnPackage.STRATEGY__STRATEGY_SOLUTIONS);
		}
		return strategySolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsnPackage.STRATEGY__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case GsnPackage.STRATEGY__JUSTIFICATIONS:
				return ((InternalEList<?>)getJustifications()).basicRemove(otherEnd, msgs);
			case GsnPackage.STRATEGY__STRATEGY_CONTEXTS:
				return ((InternalEList<?>)getStrategyContexts()).basicRemove(otherEnd, msgs);
			case GsnPackage.STRATEGY__STRATEGY_SOLUTIONS:
				return ((InternalEList<?>)getStrategySolutions()).basicRemove(otherEnd, msgs);
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
			case GsnPackage.STRATEGY__GOALS:
				return getGoals();
			case GsnPackage.STRATEGY__JUSTIFICATIONS:
				return getJustifications();
			case GsnPackage.STRATEGY__STRATEGY_CONTEXTS:
				return getStrategyContexts();
			case GsnPackage.STRATEGY__STRATEGY_SOLUTIONS:
				return getStrategySolutions();
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
			case GsnPackage.STRATEGY__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case GsnPackage.STRATEGY__JUSTIFICATIONS:
				getJustifications().clear();
				getJustifications().addAll((Collection<? extends Justification>)newValue);
				return;
			case GsnPackage.STRATEGY__STRATEGY_CONTEXTS:
				getStrategyContexts().clear();
				getStrategyContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case GsnPackage.STRATEGY__STRATEGY_SOLUTIONS:
				getStrategySolutions().clear();
				getStrategySolutions().addAll((Collection<? extends Solution>)newValue);
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
			case GsnPackage.STRATEGY__GOALS:
				getGoals().clear();
				return;
			case GsnPackage.STRATEGY__JUSTIFICATIONS:
				getJustifications().clear();
				return;
			case GsnPackage.STRATEGY__STRATEGY_CONTEXTS:
				getStrategyContexts().clear();
				return;
			case GsnPackage.STRATEGY__STRATEGY_SOLUTIONS:
				getStrategySolutions().clear();
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
			case GsnPackage.STRATEGY__GOALS:
				return goals != null && !goals.isEmpty();
			case GsnPackage.STRATEGY__JUSTIFICATIONS:
				return justifications != null && !justifications.isEmpty();
			case GsnPackage.STRATEGY__STRATEGY_CONTEXTS:
				return strategyContexts != null && !strategyContexts.isEmpty();
			case GsnPackage.STRATEGY__STRATEGY_SOLUTIONS:
				return strategySolutions != null && !strategySolutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategyImpl
