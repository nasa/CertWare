/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.InformationElementImpl;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.EurPackage;

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
 *   <li>{@link net.certware.argument.eur.impl.ContextImpl#getAssumption <em>Assumption</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends InformationElementImpl implements Context {
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
		return EurPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getAssumption() {
		if (assumption == null) {
			assumption = new EObjectResolvingEList<Assumption>(Assumption.class, this, EurPackage.CONTEXT__ASSUMPTION);
		}
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurPackage.CONTEXT__ASSUMPTION:
				return getAssumption();
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
			case EurPackage.CONTEXT__ASSUMPTION:
				getAssumption().clear();
				getAssumption().addAll((Collection<? extends Assumption>)newValue);
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
			case EurPackage.CONTEXT__ASSUMPTION:
				getAssumption().clear();
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
			case EurPackage.CONTEXT__ASSUMPTION:
				return assumption != null && !assumption.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
