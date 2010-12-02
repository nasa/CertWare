/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz.impl;

import java.util.Collection;

import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.impl.AssertedEvidenceImpl;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Evidence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.caz.impl.EvidenceImpl#getEvidenceContexts <em>Evidence Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.EvidenceImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceImpl extends AssertedEvidenceImpl implements Evidence {
	/**
	 * The cached value of the '{@link #getEvidenceContexts() <em>Evidence Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> evidenceContexts;
	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationElement> evidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CazPackage.Literals.EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getEvidenceContexts() {
		if (evidenceContexts == null) {
			evidenceContexts = new EObjectResolvingEList<Context>(Context.class, this, CazPackage.EVIDENCE__EVIDENCE_CONTEXTS);
		}
		return evidenceContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationElement> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectResolvingEList<InformationElement>(InformationElement.class, this, CazPackage.EVIDENCE__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CazPackage.EVIDENCE__EVIDENCE_CONTEXTS:
				return getEvidenceContexts();
			case CazPackage.EVIDENCE__EVIDENCE:
				return getEvidence();
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
			case CazPackage.EVIDENCE__EVIDENCE_CONTEXTS:
				getEvidenceContexts().clear();
				getEvidenceContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case CazPackage.EVIDENCE__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends InformationElement>)newValue);
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
			case CazPackage.EVIDENCE__EVIDENCE_CONTEXTS:
				getEvidenceContexts().clear();
				return;
			case CazPackage.EVIDENCE__EVIDENCE:
				getEvidence().clear();
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
			case CazPackage.EVIDENCE__EVIDENCE_CONTEXTS:
				return evidenceContexts != null && !evidenceContexts.isEmpty();
			case CazPackage.EVIDENCE__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceImpl
