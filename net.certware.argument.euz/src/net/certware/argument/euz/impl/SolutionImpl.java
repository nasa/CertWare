/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.AssertedEvidenceImpl;

import net.certware.argument.euz.Context;
import net.certware.argument.euz.Criteria;
import net.certware.argument.euz.EuzPackage;
import net.certware.argument.euz.Evidence;
import net.certware.argument.euz.Solution;

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
 *   <li>{@link net.certware.argument.euz.impl.SolutionImpl#getSolutionContexts <em>Solution Contexts</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.SolutionImpl#getSolutionEvidence <em>Solution Evidence</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.SolutionImpl#getSolutionCriteria <em>Solution Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolutionImpl extends AssertedEvidenceImpl implements Solution {
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
	 * The cached value of the '{@link #getSolutionEvidence() <em>Solution Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> solutionEvidence;

	/**
	 * The cached value of the '{@link #getSolutionCriteria() <em>Solution Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criteria> solutionCriteria;

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
		return EuzPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getSolutionContexts() {
		if (solutionContexts == null) {
			solutionContexts = new EObjectResolvingEList<Context>(Context.class, this, EuzPackage.SOLUTION__SOLUTION_CONTEXTS);
		}
		return solutionContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getSolutionEvidence() {
		if (solutionEvidence == null) {
			solutionEvidence = new EObjectResolvingEList<Evidence>(Evidence.class, this, EuzPackage.SOLUTION__SOLUTION_EVIDENCE);
		}
		return solutionEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getSolutionCriteria() {
		if (solutionCriteria == null) {
			solutionCriteria = new EObjectResolvingEList<Criteria>(Criteria.class, this, EuzPackage.SOLUTION__SOLUTION_CRITERIA);
		}
		return solutionCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuzPackage.SOLUTION__SOLUTION_CONTEXTS:
				return getSolutionContexts();
			case EuzPackage.SOLUTION__SOLUTION_EVIDENCE:
				return getSolutionEvidence();
			case EuzPackage.SOLUTION__SOLUTION_CRITERIA:
				return getSolutionCriteria();
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
			case EuzPackage.SOLUTION__SOLUTION_CONTEXTS:
				getSolutionContexts().clear();
				getSolutionContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case EuzPackage.SOLUTION__SOLUTION_EVIDENCE:
				getSolutionEvidence().clear();
				getSolutionEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case EuzPackage.SOLUTION__SOLUTION_CRITERIA:
				getSolutionCriteria().clear();
				getSolutionCriteria().addAll((Collection<? extends Criteria>)newValue);
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
			case EuzPackage.SOLUTION__SOLUTION_CONTEXTS:
				getSolutionContexts().clear();
				return;
			case EuzPackage.SOLUTION__SOLUTION_EVIDENCE:
				getSolutionEvidence().clear();
				return;
			case EuzPackage.SOLUTION__SOLUTION_CRITERIA:
				getSolutionCriteria().clear();
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
			case EuzPackage.SOLUTION__SOLUTION_CONTEXTS:
				return solutionContexts != null && !solutionContexts.isEmpty();
			case EuzPackage.SOLUTION__SOLUTION_EVIDENCE:
				return solutionEvidence != null && !solutionEvidence.isEmpty();
			case EuzPackage.SOLUTION__SOLUTION_CRITERIA:
				return solutionCriteria != null && !solutionCriteria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionImpl
