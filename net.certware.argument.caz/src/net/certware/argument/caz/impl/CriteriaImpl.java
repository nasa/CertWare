/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.InformationElementImpl;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Criteria;
import net.certware.argument.caz.EuzPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.caz.impl.CriteriaImpl#getCriteriaContexts <em>Criteria Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.CriteriaImpl#getCriteriaAssumptions <em>Criteria Assumptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriteriaImpl extends InformationElementImpl implements Criteria {
	/**
	 * The cached value of the '{@link #getCriteriaContexts() <em>Criteria Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> criteriaContexts;

	/**
	 * The cached value of the '{@link #getCriteriaAssumptions() <em>Criteria Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> criteriaAssumptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EuzPackage.Literals.CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getCriteriaContexts() {
		if (criteriaContexts == null) {
			criteriaContexts = new EObjectResolvingEList<Context>(Context.class, this, EuzPackage.CRITERIA__CRITERIA_CONTEXTS);
		}
		return criteriaContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getCriteriaAssumptions() {
		if (criteriaAssumptions == null) {
			criteriaAssumptions = new EObjectResolvingEList<Assumption>(Assumption.class, this, EuzPackage.CRITERIA__CRITERIA_ASSUMPTIONS);
		}
		return criteriaAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuzPackage.CRITERIA__CRITERIA_CONTEXTS:
				return getCriteriaContexts();
			case EuzPackage.CRITERIA__CRITERIA_ASSUMPTIONS:
				return getCriteriaAssumptions();
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
			case EuzPackage.CRITERIA__CRITERIA_CONTEXTS:
				getCriteriaContexts().clear();
				getCriteriaContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case EuzPackage.CRITERIA__CRITERIA_ASSUMPTIONS:
				getCriteriaAssumptions().clear();
				getCriteriaAssumptions().addAll((Collection<? extends Assumption>)newValue);
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
			case EuzPackage.CRITERIA__CRITERIA_CONTEXTS:
				getCriteriaContexts().clear();
				return;
			case EuzPackage.CRITERIA__CRITERIA_ASSUMPTIONS:
				getCriteriaAssumptions().clear();
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
			case EuzPackage.CRITERIA__CRITERIA_CONTEXTS:
				return criteriaContexts != null && !criteriaContexts.isEmpty();
			case EuzPackage.CRITERIA__CRITERIA_ASSUMPTIONS:
				return criteriaAssumptions != null && !criteriaAssumptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CriteriaImpl
