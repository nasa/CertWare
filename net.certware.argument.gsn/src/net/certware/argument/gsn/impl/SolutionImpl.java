/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.AssertedEvidenceImpl;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Evidence;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Solution;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.impl.SolutionImpl#getSolutionEvidence <em>Solution Evidence</em>}</li>
 *   <li>{@link net.certware.argument.gsn.impl.SolutionImpl#getSolutionContexts <em>Solution Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolutionImpl extends AssertedEvidenceImpl implements Solution {
	/**
	 * The cached value of the '{@link #getSolutionEvidence() <em>Solution Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> solutionEvidence;

	/**
	 * The cached value of the '{@link #getSolutionContexts() <em>Solution Contexts</em>}' containment reference list.
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
		return GsnPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getSolutionEvidence() {
		if (solutionEvidence == null) {
			solutionEvidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, GsnPackage.SOLUTION__SOLUTION_EVIDENCE);
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
			solutionContexts = new EObjectContainmentEList<Context>(Context.class, this, GsnPackage.SOLUTION__SOLUTION_CONTEXTS);
		}
		return solutionContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GsnPackage.SOLUTION__SOLUTION_EVIDENCE:
				return ((InternalEList<?>)getSolutionEvidence()).basicRemove(otherEnd, msgs);
			case GsnPackage.SOLUTION__SOLUTION_CONTEXTS:
				return ((InternalEList<?>)getSolutionContexts()).basicRemove(otherEnd, msgs);
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
			case GsnPackage.SOLUTION__SOLUTION_EVIDENCE:
				return getSolutionEvidence();
			case GsnPackage.SOLUTION__SOLUTION_CONTEXTS:
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
			case GsnPackage.SOLUTION__SOLUTION_EVIDENCE:
				getSolutionEvidence().clear();
				getSolutionEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case GsnPackage.SOLUTION__SOLUTION_CONTEXTS:
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
			case GsnPackage.SOLUTION__SOLUTION_EVIDENCE:
				getSolutionEvidence().clear();
				return;
			case GsnPackage.SOLUTION__SOLUTION_CONTEXTS:
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
			case GsnPackage.SOLUTION__SOLUTION_EVIDENCE:
				return solutionEvidence != null && !solutionEvidence.isEmpty();
			case GsnPackage.SOLUTION__SOLUTION_CONTEXTS:
				return solutionContexts != null && !solutionContexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionImpl
