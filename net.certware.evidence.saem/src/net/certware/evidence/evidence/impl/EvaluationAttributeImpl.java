/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.impl;

import java.util.Collection;

import net.certware.evidence.evidence.EvaluationAttribute;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.Provenance;
import net.certware.evidence.evidence.TimingProperty;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.EvaluationAttributeImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.EvaluationAttributeImpl#getTiming <em>Timing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationAttributeImpl extends ElementImpl implements EvaluationAttribute {
	/**
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected EList<Provenance> provenance;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingProperty> timing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVALUATION_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provenance> getProvenance() {
		if (provenance == null) {
			provenance = new EObjectContainmentEList<Provenance>(Provenance.class, this, EvidencePackage.EVALUATION_ATTRIBUTE__PROVENANCE);
		}
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingProperty> getTiming() {
		if (timing == null) {
			timing = new EObjectContainmentEList<TimingProperty>(TimingProperty.class, this, EvidencePackage.EVALUATION_ATTRIBUTE__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.EVALUATION_ATTRIBUTE__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVALUATION_ATTRIBUTE__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
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
			case EvidencePackage.EVALUATION_ATTRIBUTE__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EVALUATION_ATTRIBUTE__TIMING:
				return getTiming();
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
			case EvidencePackage.EVALUATION_ATTRIBUTE__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EVALUATION_ATTRIBUTE__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
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
			case EvidencePackage.EVALUATION_ATTRIBUTE__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EVALUATION_ATTRIBUTE__TIMING:
				getTiming().clear();
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
			case EvidencePackage.EVALUATION_ATTRIBUTE__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EVALUATION_ATTRIBUTE__TIMING:
				return timing != null && !timing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluationAttributeImpl
