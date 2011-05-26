/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz.impl;

import java.util.Collection;

import net.certware.argument.caz.Argument;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Evidence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.caz.impl.ClaimImpl#getClaimStrategies <em>Claim Strategies</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ClaimImpl#getClaimAssumptions <em>Claim Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ClaimImpl#getClaimContexts <em>Claim Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ClaimImpl#getClaimSolutions <em>Claim Solutions</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ClaimImpl#getSubClaims <em>Sub Claims</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends net.certware.argument.arm.impl.ClaimImpl implements Claim {
	/**
	 * The cached value of the '{@link #getClaimStrategies() <em>Claim Strategies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> claimStrategies;

	/**
	 * The cached value of the '{@link #getClaimAssumptions() <em>Claim Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> claimAssumptions;

	/**
	 * The cached value of the '{@link #getClaimContexts() <em>Claim Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> claimContexts;

	/**
	 * The cached value of the '{@link #getClaimSolutions() <em>Claim Solutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> claimSolutions;

	/**
	 * The cached value of the '{@link #getSubClaims() <em>Sub Claims</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClaims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> subClaims;

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
		return CazPackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getClaimStrategies() {
		if (claimStrategies == null) {
			claimStrategies = new EObjectResolvingEList<Argument>(Argument.class, this, CazPackage.CLAIM__CLAIM_STRATEGIES);
		}
		return claimStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getClaimAssumptions() {
		if (claimAssumptions == null) {
			claimAssumptions = new EObjectResolvingEList<Assumption>(Assumption.class, this, CazPackage.CLAIM__CLAIM_ASSUMPTIONS);
		}
		return claimAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getClaimContexts() {
		if (claimContexts == null) {
			claimContexts = new EObjectResolvingEList<Context>(Context.class, this, CazPackage.CLAIM__CLAIM_CONTEXTS);
		}
		return claimContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getClaimSolutions() {
		if (claimSolutions == null) {
			claimSolutions = new EObjectResolvingEList<Evidence>(Evidence.class, this, CazPackage.CLAIM__CLAIM_SOLUTIONS);
		}
		return claimSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getSubClaims() {
		if (subClaims == null) {
			subClaims = new EObjectResolvingEList<Claim>(Claim.class, this, CazPackage.CLAIM__SUB_CLAIMS);
		}
		return subClaims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CazPackage.CLAIM__CLAIM_STRATEGIES:
				return getClaimStrategies();
			case CazPackage.CLAIM__CLAIM_ASSUMPTIONS:
				return getClaimAssumptions();
			case CazPackage.CLAIM__CLAIM_CONTEXTS:
				return getClaimContexts();
			case CazPackage.CLAIM__CLAIM_SOLUTIONS:
				return getClaimSolutions();
			case CazPackage.CLAIM__SUB_CLAIMS:
				return getSubClaims();
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
			case CazPackage.CLAIM__CLAIM_STRATEGIES:
				getClaimStrategies().clear();
				getClaimStrategies().addAll((Collection<? extends Argument>)newValue);
				return;
			case CazPackage.CLAIM__CLAIM_ASSUMPTIONS:
				getClaimAssumptions().clear();
				getClaimAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case CazPackage.CLAIM__CLAIM_CONTEXTS:
				getClaimContexts().clear();
				getClaimContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case CazPackage.CLAIM__CLAIM_SOLUTIONS:
				getClaimSolutions().clear();
				getClaimSolutions().addAll((Collection<? extends Evidence>)newValue);
				return;
			case CazPackage.CLAIM__SUB_CLAIMS:
				getSubClaims().clear();
				getSubClaims().addAll((Collection<? extends Claim>)newValue);
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
			case CazPackage.CLAIM__CLAIM_STRATEGIES:
				getClaimStrategies().clear();
				return;
			case CazPackage.CLAIM__CLAIM_ASSUMPTIONS:
				getClaimAssumptions().clear();
				return;
			case CazPackage.CLAIM__CLAIM_CONTEXTS:
				getClaimContexts().clear();
				return;
			case CazPackage.CLAIM__CLAIM_SOLUTIONS:
				getClaimSolutions().clear();
				return;
			case CazPackage.CLAIM__SUB_CLAIMS:
				getSubClaims().clear();
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
			case CazPackage.CLAIM__CLAIM_STRATEGIES:
				return claimStrategies != null && !claimStrategies.isEmpty();
			case CazPackage.CLAIM__CLAIM_ASSUMPTIONS:
				return claimAssumptions != null && !claimAssumptions.isEmpty();
			case CazPackage.CLAIM__CLAIM_CONTEXTS:
				return claimContexts != null && !claimContexts.isEmpty();
			case CazPackage.CLAIM__CLAIM_SOLUTIONS:
				return claimSolutions != null && !claimSolutions.isEmpty();
			case CazPackage.CLAIM__SUB_CLAIMS:
				return subClaims != null && !subClaims.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
