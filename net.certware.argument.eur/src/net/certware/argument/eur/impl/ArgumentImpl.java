/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ClaimImpl;
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
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.eur.impl.ArgumentImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.ArgumentImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.ArgumentImpl#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.ArgumentImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.ArgumentImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.ArgumentImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.ArgumentImpl#getJustification <em>Justification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends ClaimImpl implements Argument {
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
	 * The cached value of the '{@link #getAssumption() <em>Assumption</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumption()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumption;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
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
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

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
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> justification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EurPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getStrategy() {
		if (strategy == null) {
			strategy = new EObjectContainmentEList<Strategy>(Strategy.class, this, EurPackage.ARGUMENT__STRATEGY);
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
			assumption = new EObjectResolvingEList<Assumption>(Assumption.class, this, EurPackage.ARGUMENT__ASSUMPTION);
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
			context = new EObjectResolvingEList<Context>(Context.class, this, EurPackage.ARGUMENT__CONTEXT);
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
			solution = new EObjectContainmentEList<Solution>(Solution.class, this, EurPackage.ARGUMENT__SOLUTION);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Argument>(Argument.class, this, EurPackage.ARGUMENT__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectResolvingEList<Criteria>(Criteria.class, this, EurPackage.ARGUMENT__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getJustification() {
		if (justification == null) {
			justification = new EObjectContainmentEList<Justification>(Justification.class, this, EurPackage.ARGUMENT__JUSTIFICATION);
		}
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EurPackage.ARGUMENT__STRATEGY:
				return ((InternalEList<?>)getStrategy()).basicRemove(otherEnd, msgs);
			case EurPackage.ARGUMENT__SOLUTION:
				return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
			case EurPackage.ARGUMENT__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case EurPackage.ARGUMENT__JUSTIFICATION:
				return ((InternalEList<?>)getJustification()).basicRemove(otherEnd, msgs);
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
			case EurPackage.ARGUMENT__STRATEGY:
				return getStrategy();
			case EurPackage.ARGUMENT__ASSUMPTION:
				return getAssumption();
			case EurPackage.ARGUMENT__CONTEXT:
				return getContext();
			case EurPackage.ARGUMENT__SOLUTION:
				return getSolution();
			case EurPackage.ARGUMENT__ARGUMENT:
				return getArgument();
			case EurPackage.ARGUMENT__CRITERIA:
				return getCriteria();
			case EurPackage.ARGUMENT__JUSTIFICATION:
				return getJustification();
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
			case EurPackage.ARGUMENT__STRATEGY:
				getStrategy().clear();
				getStrategy().addAll((Collection<? extends Strategy>)newValue);
				return;
			case EurPackage.ARGUMENT__ASSUMPTION:
				getAssumption().clear();
				getAssumption().addAll((Collection<? extends Assumption>)newValue);
				return;
			case EurPackage.ARGUMENT__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends Context>)newValue);
				return;
			case EurPackage.ARGUMENT__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends Solution>)newValue);
				return;
			case EurPackage.ARGUMENT__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Argument>)newValue);
				return;
			case EurPackage.ARGUMENT__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criteria>)newValue);
				return;
			case EurPackage.ARGUMENT__JUSTIFICATION:
				getJustification().clear();
				getJustification().addAll((Collection<? extends Justification>)newValue);
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
			case EurPackage.ARGUMENT__STRATEGY:
				getStrategy().clear();
				return;
			case EurPackage.ARGUMENT__ASSUMPTION:
				getAssumption().clear();
				return;
			case EurPackage.ARGUMENT__CONTEXT:
				getContext().clear();
				return;
			case EurPackage.ARGUMENT__SOLUTION:
				getSolution().clear();
				return;
			case EurPackage.ARGUMENT__ARGUMENT:
				getArgument().clear();
				return;
			case EurPackage.ARGUMENT__CRITERIA:
				getCriteria().clear();
				return;
			case EurPackage.ARGUMENT__JUSTIFICATION:
				getJustification().clear();
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
			case EurPackage.ARGUMENT__STRATEGY:
				return strategy != null && !strategy.isEmpty();
			case EurPackage.ARGUMENT__ASSUMPTION:
				return assumption != null && !assumption.isEmpty();
			case EurPackage.ARGUMENT__CONTEXT:
				return context != null && !context.isEmpty();
			case EurPackage.ARGUMENT__SOLUTION:
				return solution != null && !solution.isEmpty();
			case EurPackage.ARGUMENT__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case EurPackage.ARGUMENT__CRITERIA:
				return criteria != null && !criteria.isEmpty();
			case EurPackage.ARGUMENT__JUSTIFICATION:
				return justification != null && !justification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentImpl
