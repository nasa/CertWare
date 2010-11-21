/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsz.impl;

import java.util.Collection;
import net.certware.argument.arm.impl.ReasoningElementImpl;

import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Goal;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.Justification;
import net.certware.argument.gsz.Solution;
import net.certware.argument.gsz.Strategy;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsz.impl.StrategyImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.StrategyImpl#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.StrategyImpl#getStrategyContexts <em>Strategy Contexts</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.StrategyImpl#getStrategySolutions <em>Strategy Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends ReasoningElementImpl implements Strategy {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getJustifications() <em>Justifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> justifications;

	/**
	 * The cached value of the '{@link #getStrategyContexts() <em>Strategy Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> strategyContexts;

	/**
	 * The cached value of the '{@link #getStrategySolutions() <em>Strategy Solutions</em>}' reference list.
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
		return GszPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectResolvingEList<Goal>(Goal.class, this, GszPackage.STRATEGY__GOALS);
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
			justifications = new EObjectResolvingEList<Justification>(Justification.class, this, GszPackage.STRATEGY__JUSTIFICATIONS);
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
			strategyContexts = new EObjectResolvingEList<Context>(Context.class, this, GszPackage.STRATEGY__STRATEGY_CONTEXTS);
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
			strategySolutions = new EObjectResolvingEList<Solution>(Solution.class, this, GszPackage.STRATEGY__STRATEGY_SOLUTIONS);
		}
		return strategySolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GszPackage.STRATEGY__GOALS:
				return getGoals();
			case GszPackage.STRATEGY__JUSTIFICATIONS:
				return getJustifications();
			case GszPackage.STRATEGY__STRATEGY_CONTEXTS:
				return getStrategyContexts();
			case GszPackage.STRATEGY__STRATEGY_SOLUTIONS:
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
			case GszPackage.STRATEGY__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case GszPackage.STRATEGY__JUSTIFICATIONS:
				getJustifications().clear();
				getJustifications().addAll((Collection<? extends Justification>)newValue);
				return;
			case GszPackage.STRATEGY__STRATEGY_CONTEXTS:
				getStrategyContexts().clear();
				getStrategyContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case GszPackage.STRATEGY__STRATEGY_SOLUTIONS:
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
			case GszPackage.STRATEGY__GOALS:
				getGoals().clear();
				return;
			case GszPackage.STRATEGY__JUSTIFICATIONS:
				getJustifications().clear();
				return;
			case GszPackage.STRATEGY__STRATEGY_CONTEXTS:
				getStrategyContexts().clear();
				return;
			case GszPackage.STRATEGY__STRATEGY_SOLUTIONS:
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
			case GszPackage.STRATEGY__GOALS:
				return goals != null && !goals.isEmpty();
			case GszPackage.STRATEGY__JUSTIFICATIONS:
				return justifications != null && !justifications.isEmpty();
			case GszPackage.STRATEGY__STRATEGY_CONTEXTS:
				return strategyContexts != null && !strategyContexts.isEmpty();
			case GszPackage.STRATEGY__STRATEGY_SOLUTIONS:
				return strategySolutions != null && !strategySolutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategyImpl
