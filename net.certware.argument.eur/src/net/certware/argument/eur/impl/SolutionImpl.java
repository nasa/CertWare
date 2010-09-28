/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur.impl;

import java.util.Collection;

import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.impl.AssertedEvidenceImpl;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Solution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.eur.impl.SolutionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.SolutionImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.eur.impl.SolutionImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolutionImpl extends AssertedEvidenceImpl implements Solution {
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
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected InformationElement evidence;

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
		return EurPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContext() {
		if (context == null) {
			context = new EObjectResolvingEList<Context>(Context.class, this, EurPackage.SOLUTION__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationElement getEvidence() {
		if (evidence != null && evidence.eIsProxy()) {
			InternalEObject oldEvidence = (InternalEObject)evidence;
			evidence = (InformationElement)eResolveProxy(oldEvidence);
			if (evidence != oldEvidence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EurPackage.SOLUTION__EVIDENCE, oldEvidence, evidence));
			}
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationElement basicGetEvidence() {
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidence(InformationElement newEvidence) {
		InformationElement oldEvidence = evidence;
		evidence = newEvidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EurPackage.SOLUTION__EVIDENCE, oldEvidence, evidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getCriteria() {
		if (criteria == null) {
			criteria = new EObjectResolvingEList<Criteria>(Criteria.class, this, EurPackage.SOLUTION__CRITERIA);
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EurPackage.SOLUTION__CONTEXT:
				return getContext();
			case EurPackage.SOLUTION__EVIDENCE:
				if (resolve) return getEvidence();
				return basicGetEvidence();
			case EurPackage.SOLUTION__CRITERIA:
				return getCriteria();
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
			case EurPackage.SOLUTION__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends Context>)newValue);
				return;
			case EurPackage.SOLUTION__EVIDENCE:
				setEvidence((InformationElement)newValue);
				return;
			case EurPackage.SOLUTION__CRITERIA:
				getCriteria().clear();
				getCriteria().addAll((Collection<? extends Criteria>)newValue);
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
			case EurPackage.SOLUTION__CONTEXT:
				getContext().clear();
				return;
			case EurPackage.SOLUTION__EVIDENCE:
				setEvidence((InformationElement)null);
				return;
			case EurPackage.SOLUTION__CRITERIA:
				getCriteria().clear();
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
			case EurPackage.SOLUTION__CONTEXT:
				return context != null && !context.isEmpty();
			case EurPackage.SOLUTION__EVIDENCE:
				return evidence != null;
			case EurPackage.SOLUTION__CRITERIA:
				return criteria != null && !criteria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionImpl
