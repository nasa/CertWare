/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.AssertedEvidenceImpl;

import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Evidence;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.Solution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsz.impl.SolutionImpl#getSolutionEvidence <em>Solution Evidence</em>}</li>
 *   <li>{@link net.certware.argument.gsz.impl.SolutionImpl#getSolutionContexts <em>Solution Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolutionImpl extends AssertedEvidenceImpl implements Solution {
	/**
	 * The cached value of the '{@link #getSolutionEvidence() <em>Solution Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> solutionEvidence;

	/**
	 * The cached value of the '{@link #getSolutionContexts() <em>Solution Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> solutionContexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GszPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getSolutionEvidence() {
		if (solutionEvidence == null) {
			solutionEvidence = new EObjectResolvingEList<Evidence>(Evidence.class, this, GszPackage.SOLUTION__SOLUTION_EVIDENCE);
		}
		return solutionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getSolutionContexts() {
		if (solutionContexts == null) {
			solutionContexts = new EObjectResolvingEList<Context>(Context.class, this, GszPackage.SOLUTION__SOLUTION_CONTEXTS);
		}
		return solutionContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GszPackage.SOLUTION__SOLUTION_EVIDENCE:
				return getSolutionEvidence();
			case GszPackage.SOLUTION__SOLUTION_CONTEXTS:
				return getSolutionContexts();
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
			case GszPackage.SOLUTION__SOLUTION_EVIDENCE:
				getSolutionEvidence().clear();
				getSolutionEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case GszPackage.SOLUTION__SOLUTION_CONTEXTS:
				getSolutionContexts().clear();
				getSolutionContexts().addAll((Collection<? extends Context>)newValue);
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
			case GszPackage.SOLUTION__SOLUTION_EVIDENCE:
				getSolutionEvidence().clear();
				return;
			case GszPackage.SOLUTION__SOLUTION_CONTEXTS:
				getSolutionContexts().clear();
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
			case GszPackage.SOLUTION__SOLUTION_EVIDENCE:
				return solutionEvidence != null && !solutionEvidence.isEmpty();
			case GszPackage.SOLUTION__SOLUTION_CONTEXTS:
				return solutionContexts != null && !solutionContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionImpl
