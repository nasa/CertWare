/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.argument.cae.impl;

import java.util.Collection;

import net.certware.argument.cae.Argument;
import net.certware.argument.cae.Assumption;
import net.certware.argument.cae.CaePackage;
import net.certware.argument.cae.Claim;
import net.certware.argument.cae.Context;
import net.certware.argument.cae.Evidence;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.cae.impl.ClaimImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.certware.argument.cae.impl.ClaimImpl#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link net.certware.argument.cae.impl.ClaimImpl#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.cae.impl.ClaimImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends net.certware.argument.arm.impl.ClaimImpl implements Claim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> strategy;

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
	protected EList<Evidence> solution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaePackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getStrategy() {
		if (strategy == null) {
			strategy = new EObjectContainmentEList<Argument>(Argument.class, this, CaePackage.CLAIM__STRATEGY);
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
			assumption = new EObjectContainmentEList<Assumption>(Assumption.class, this, CaePackage.CLAIM__ASSUMPTION);
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
			context = new EObjectContainmentEList<Context>(Context.class, this, CaePackage.CLAIM__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getSolution() {
		if (solution == null) {
			solution = new EObjectContainmentEList<Evidence>(Evidence.class, this, CaePackage.CLAIM__SOLUTION);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaePackage.CLAIM__STRATEGY:
				return ((InternalEList<?>)getStrategy()).basicRemove(otherEnd, msgs);
			case CaePackage.CLAIM__ASSUMPTION:
				return ((InternalEList<?>)getAssumption()).basicRemove(otherEnd, msgs);
			case CaePackage.CLAIM__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case CaePackage.CLAIM__SOLUTION:
				return ((InternalEList<?>)getSolution()).basicRemove(otherEnd, msgs);
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
			case CaePackage.CLAIM__STRATEGY:
				return getStrategy();
			case CaePackage.CLAIM__ASSUMPTION:
				return getAssumption();
			case CaePackage.CLAIM__CONTEXT:
				return getContext();
			case CaePackage.CLAIM__SOLUTION:
				return getSolution();
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
			case CaePackage.CLAIM__STRATEGY:
				getStrategy().clear();
				getStrategy().addAll((Collection<? extends Argument>)newValue);
				return;
			case CaePackage.CLAIM__ASSUMPTION:
				getAssumption().clear();
				getAssumption().addAll((Collection<? extends Assumption>)newValue);
				return;
			case CaePackage.CLAIM__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends Context>)newValue);
				return;
			case CaePackage.CLAIM__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends Evidence>)newValue);
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
			case CaePackage.CLAIM__STRATEGY:
				getStrategy().clear();
				return;
			case CaePackage.CLAIM__ASSUMPTION:
				getAssumption().clear();
				return;
			case CaePackage.CLAIM__CONTEXT:
				getContext().clear();
				return;
			case CaePackage.CLAIM__SOLUTION:
				getSolution().clear();
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
			case CaePackage.CLAIM__STRATEGY:
				return strategy != null && !strategy.isEmpty();
			case CaePackage.CLAIM__ASSUMPTION:
				return assumption != null && !assumption.isEmpty();
			case CaePackage.CLAIM__CONTEXT:
				return context != null && !context.isEmpty();
			case CaePackage.CLAIM__SOLUTION:
				return solution != null && !solution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
