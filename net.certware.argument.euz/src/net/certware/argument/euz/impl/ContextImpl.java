/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.InformationElementImpl;

import net.certware.argument.euz.Assumption;
import net.certware.argument.euz.Context;
import net.certware.argument.euz.EuzPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.euz.impl.ContextImpl#getContextAssumptions <em>Context Assumptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends InformationElementImpl implements Context {
	/**
	 * The cached value of the '{@link #getContextAssumptions() <em>Context Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> contextAssumptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuzPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getContextAssumptions() {
		if (contextAssumptions == null) {
			contextAssumptions = new EObjectResolvingEList<Assumption>(Assumption.class, this, EuzPackage.CONTEXT__CONTEXT_ASSUMPTIONS);
		}
		return contextAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuzPackage.CONTEXT__CONTEXT_ASSUMPTIONS:
				return getContextAssumptions();
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
			case EuzPackage.CONTEXT__CONTEXT_ASSUMPTIONS:
				getContextAssumptions().clear();
				getContextAssumptions().addAll((Collection<? extends Assumption>)newValue);
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
			case EuzPackage.CONTEXT__CONTEXT_ASSUMPTIONS:
				getContextAssumptions().clear();
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
			case EuzPackage.CONTEXT__CONTEXT_ASSUMPTIONS:
				return contextAssumptions != null && !contextAssumptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
