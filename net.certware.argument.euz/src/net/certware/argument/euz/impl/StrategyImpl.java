/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ReasoningElementImpl;

import net.certware.argument.euz.Argument;
import net.certware.argument.euz.Assumption;
import net.certware.argument.euz.Context;
import net.certware.argument.euz.Criteria;
import net.certware.argument.euz.EuzPackage;
import net.certware.argument.euz.Justification;
import net.certware.argument.euz.Strategy;

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
 *   <li>{@link net.certware.argument.euz.impl.StrategyImpl#getStrategyArguments <em>Strategy Arguments</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.StrategyImpl#getStrategyJustifications <em>Strategy Justifications</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.StrategyImpl#getStrategyCriteria <em>Strategy Criteria</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.StrategyImpl#getStrategyAssumptions <em>Strategy Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.StrategyImpl#getStrategyStrategies <em>Strategy Strategies</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.StrategyImpl#getStrategyContexts <em>Strategy Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends ReasoningElementImpl implements Strategy {
	/**
	 * The cached value of the '{@link #getStrategyArguments() <em>Strategy Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> strategyArguments;

	/**
	 * The cached value of the '{@link #getStrategyJustifications() <em>Strategy Justifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyJustifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> strategyJustifications;

	/**
	 * The cached value of the '{@link #getStrategyCriteria() <em>Strategy Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criteria> strategyCriteria;

	/**
	 * The cached value of the '{@link #getStrategyAssumptions() <em>Strategy Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> strategyAssumptions;

	/**
	 * The cached value of the '{@link #getStrategyStrategies() <em>Strategy Strategies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> strategyStrategies;

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
		return EuzPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getStrategyArguments() {
		if (strategyArguments == null) {
			strategyArguments = new EObjectResolvingEList<Argument>(Argument.class, this, EuzPackage.STRATEGY__STRATEGY_ARGUMENTS);
		}
		return strategyArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getStrategyJustifications() {
		if (strategyJustifications == null) {
			strategyJustifications = new EObjectResolvingEList<Justification>(Justification.class, this, EuzPackage.STRATEGY__STRATEGY_JUSTIFICATIONS);
		}
		return strategyJustifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getStrategyCriteria() {
		if (strategyCriteria == null) {
			strategyCriteria = new EObjectResolvingEList<Criteria>(Criteria.class, this, EuzPackage.STRATEGY__STRATEGY_CRITERIA);
		}
		return strategyCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getStrategyAssumptions() {
		if (strategyAssumptions == null) {
			strategyAssumptions = new EObjectResolvingEList<Assumption>(Assumption.class, this, EuzPackage.STRATEGY__STRATEGY_ASSUMPTIONS);
		}
		return strategyAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getStrategyStrategies() {
		if (strategyStrategies == null) {
			strategyStrategies = new EObjectResolvingEList<Strategy>(Strategy.class, this, EuzPackage.STRATEGY__STRATEGY_STRATEGIES);
		}
		return strategyStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getStrategyContexts() {
		if (strategyContexts == null) {
			strategyContexts = new EObjectResolvingEList<Context>(Context.class, this, EuzPackage.STRATEGY__STRATEGY_CONTEXTS);
		}
		return strategyContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuzPackage.STRATEGY__STRATEGY_ARGUMENTS:
				return getStrategyArguments();
			case EuzPackage.STRATEGY__STRATEGY_JUSTIFICATIONS:
				return getStrategyJustifications();
			case EuzPackage.STRATEGY__STRATEGY_CRITERIA:
				return getStrategyCriteria();
			case EuzPackage.STRATEGY__STRATEGY_ASSUMPTIONS:
				return getStrategyAssumptions();
			case EuzPackage.STRATEGY__STRATEGY_STRATEGIES:
				return getStrategyStrategies();
			case EuzPackage.STRATEGY__STRATEGY_CONTEXTS:
				return getStrategyContexts();
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
			case EuzPackage.STRATEGY__STRATEGY_ARGUMENTS:
				getStrategyArguments().clear();
				getStrategyArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case EuzPackage.STRATEGY__STRATEGY_JUSTIFICATIONS:
				getStrategyJustifications().clear();
				getStrategyJustifications().addAll((Collection<? extends Justification>)newValue);
				return;
			case EuzPackage.STRATEGY__STRATEGY_CRITERIA:
				getStrategyCriteria().clear();
				getStrategyCriteria().addAll((Collection<? extends Criteria>)newValue);
				return;
			case EuzPackage.STRATEGY__STRATEGY_ASSUMPTIONS:
				getStrategyAssumptions().clear();
				getStrategyAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case EuzPackage.STRATEGY__STRATEGY_STRATEGIES:
				getStrategyStrategies().clear();
				getStrategyStrategies().addAll((Collection<? extends Strategy>)newValue);
				return;
			case EuzPackage.STRATEGY__STRATEGY_CONTEXTS:
				getStrategyContexts().clear();
				getStrategyContexts().addAll((Collection<? extends Context>)newValue);
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
			case EuzPackage.STRATEGY__STRATEGY_ARGUMENTS:
				getStrategyArguments().clear();
				return;
			case EuzPackage.STRATEGY__STRATEGY_JUSTIFICATIONS:
				getStrategyJustifications().clear();
				return;
			case EuzPackage.STRATEGY__STRATEGY_CRITERIA:
				getStrategyCriteria().clear();
				return;
			case EuzPackage.STRATEGY__STRATEGY_ASSUMPTIONS:
				getStrategyAssumptions().clear();
				return;
			case EuzPackage.STRATEGY__STRATEGY_STRATEGIES:
				getStrategyStrategies().clear();
				return;
			case EuzPackage.STRATEGY__STRATEGY_CONTEXTS:
				getStrategyContexts().clear();
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
			case EuzPackage.STRATEGY__STRATEGY_ARGUMENTS:
				return strategyArguments != null && !strategyArguments.isEmpty();
			case EuzPackage.STRATEGY__STRATEGY_JUSTIFICATIONS:
				return strategyJustifications != null && !strategyJustifications.isEmpty();
			case EuzPackage.STRATEGY__STRATEGY_CRITERIA:
				return strategyCriteria != null && !strategyCriteria.isEmpty();
			case EuzPackage.STRATEGY__STRATEGY_ASSUMPTIONS:
				return strategyAssumptions != null && !strategyAssumptions.isEmpty();
			case EuzPackage.STRATEGY__STRATEGY_STRATEGIES:
				return strategyStrategies != null && !strategyStrategies.isEmpty();
			case EuzPackage.STRATEGY__STRATEGY_CONTEXTS:
				return strategyContexts != null && !strategyContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategyImpl
