/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ReasoningElementImpl;

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
 *   <li>{@link net.certware.argument.gsn.impl.StrategyImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.StrategyImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends ReasoningElementImpl implements Strategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Kestrel Technology LLC"; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solution;

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
	public EList<Justification> getJustification() {
		if (justification == null) {
			justification = new EObjectContainmentEList<Justification>(Justification.class, this, GsnPackage.STRATEGY__JUSTIFICATION);
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
			solution = new EObjectContainmentEList<Solution>(Solution.class, this, GsnPackage.STRATEGY__SOLUTION);
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
			case GsnPackage.STRATEGY__JUSTIFICATION:
				return ((InternalEList<?>)getJustification()).basicRemove(otherEnd, msgs);
			case GsnPackage.STRATEGY__SOLUTION:
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
			case GsnPackage.STRATEGY__JUSTIFICATION:
				return getJustification();
			case GsnPackage.STRATEGY__SOLUTION:
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
			case GsnPackage.STRATEGY__JUSTIFICATION:
				getJustification().clear();
				getJustification().addAll((Collection<? extends Justification>)newValue);
				return;
			case GsnPackage.STRATEGY__SOLUTION:
				getSolution().clear();
				getSolution().addAll((Collection<? extends Solution>)newValue);
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
			case GsnPackage.STRATEGY__JUSTIFICATION:
				getJustification().clear();
				return;
			case GsnPackage.STRATEGY__SOLUTION:
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
			case GsnPackage.STRATEGY__JUSTIFICATION:
				return justification != null && !justification.isEmpty();
			case GsnPackage.STRATEGY__SOLUTION:
				return solution != null && !solution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategyImpl
