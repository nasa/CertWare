/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.eur.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ReasoningElementImpl;
import net.certware.argument.eur.Argument;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Justification;
import net.certware.argument.eur.Solution;
import net.certware.argument.eur.Strategy;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.eur.impl.StrategyImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.StrategyImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.StrategyImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.StrategyImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.StrategyImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.StrategyImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.StrategyImpl#getStrategies <em>Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends ReasoningElementImpl implements Strategy {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> justification;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solution;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criteria> criteria;

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
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

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
		return EurPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Argument>(Argument.class, this, EurPackage.STRATEGY__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getJustification() {
		if (justification == null) {
			justification = new EObjectContainmentEList<Justification>(Justification.class, this, EurPackage.STRATEGY__JUSTIFICATION);
		}
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolution() {
		if (solution == null) {
			solution = new EObjectResolvingEList<Solution>(Solution.class, this, EurPackage.STRATEGY__SOLUTION);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectResolvingEList<Criteria>(Criteria.class, this, EurPackage.STRATEGY__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getAssumption() {
		if (assumption == null) {
			assumption = new EObjectContainmentEList<Assumption>(Assumption.class, this, EurPackage.STRATEGY__ASSUMPTION);
		}
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, EurPackage.STRATEGY__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getStrategies() {
		if (strategies == null) {
			strategies = new EObjectContainmentEList<Strategy>(Strategy.class, this, EurPackage.STRATEGY__STRATEGIES);
		}
		return strategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EurPackage.STRATEGY__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case EurPackage.STRATEGY__JUSTIFICATION:
				return ((InternalEList<?>)getJustification()).basicRemove(otherEnd, msgs);
			case EurPackage.STRATEGY__ASSUMPTION:
				return ((InternalEList<?>)getAssumption()).basicRemove(otherEnd, msgs);
			case EurPackage.STRATEGY__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case EurPackage.STRATEGY__STRATEGIES:
				return ((InternalEList<?>)getStrategies()).basicRemove(otherEnd, msgs);
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
			case EurPackage.STRATEGY__ARGUMENT:
				return getArgument();
			case EurPackage.STRATEGY__JUSTIFICATION:
				return getJustification();
			case EurPackage.STRATEGY__SOLUTION:
				return getSolution();
			case EurPackage.STRATEGY__CRITERIA:
				return getCriteria();
			case EurPackage.STRATEGY__ASSUMPTION:
				return getAssumption();
			case EurPackage.STRATEGY__CONTEXTS:
				return getContexts();
			case EurPackage.STRATEGY__STRATEGIES:
				return getStrategies();
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
			case EurPackage.STRATEGY__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Argument>)newValue);
				return;
			case EurPackage.STRATEGY__JUSTIFICATION:
				getJustification().clear();
				getJustification().addAll((Collection<? extends Justification>)newValue);
				return;
			case EurPackage.STRATEGY__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends Solution>)newValue);
				return;
			case EurPackage.STRATEGY__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criteria>)newValue);
				return;
			case EurPackage.STRATEGY__ASSUMPTION:
				getAssumption().clear();
				getAssumption().addAll((Collection<? extends Assumption>)newValue);
				return;
			case EurPackage.STRATEGY__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case EurPackage.STRATEGY__STRATEGIES:
				getStrategies().clear();
				getStrategies().addAll((Collection<? extends Strategy>)newValue);
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
			case EurPackage.STRATEGY__ARGUMENT:
				getArgument().clear();
				return;
			case EurPackage.STRATEGY__JUSTIFICATION:
				getJustification().clear();
				return;
			case EurPackage.STRATEGY__SOLUTION:
				getSolution().clear();
				return;
			case EurPackage.STRATEGY__CRITERIA:
				getCriteria().clear();
				return;
			case EurPackage.STRATEGY__ASSUMPTION:
				getAssumption().clear();
				return;
			case EurPackage.STRATEGY__CONTEXTS:
				getContexts().clear();
				return;
			case EurPackage.STRATEGY__STRATEGIES:
				getStrategies().clear();
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
			case EurPackage.STRATEGY__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case EurPackage.STRATEGY__JUSTIFICATION:
				return justification != null && !justification.isEmpty();
			case EurPackage.STRATEGY__SOLUTION:
				return solution != null && !solution.isEmpty();
			case EurPackage.STRATEGY__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case EurPackage.STRATEGY__ASSUMPTION:
				return assumption != null && !assumption.isEmpty();
			case EurPackage.STRATEGY__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case EurPackage.STRATEGY__STRATEGIES:
				return strategies != null && !strategies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategyImpl
