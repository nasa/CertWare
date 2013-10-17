/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceAttribute;
import net.certware.sacm.SACM.Evidence.EvidenceEvaluation;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceEvaluationImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EvidenceEvaluationImpl extends EvidenceAssertionImpl implements EvidenceEvaluation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceAttribute> attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceAttribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<EvidenceAttribute>(EvidenceAttribute.class, this, EvidencePackage.EVIDENCE_EVALUATION__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_EVALUATION__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_EVALUATION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_EVALUATION__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_EVALUATION__CUSTODY:
				return ((InternalEList<?>)getCustody()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_EVALUATION__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_EVALUATION__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_EVALUATION__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_EVALUATION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EVIDENCE_EVALUATION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EVIDENCE_EVALUATION__ID:
				return getId();
			case EvidencePackage.EVIDENCE_EVALUATION__TIMING:
				return getTiming();
			case EvidencePackage.EVIDENCE_EVALUATION__CUSTODY:
				return getCustody();
			case EvidencePackage.EVIDENCE_EVALUATION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EVIDENCE_EVALUATION__EVENT:
				return getEvent();
			case EvidencePackage.EVIDENCE_EVALUATION__ATTRIBUTE:
				return getAttribute();
		}
		return eDynamicGet(featureID, resolve, coreType);
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
			case EvidencePackage.EVIDENCE_EVALUATION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_EVALUATION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.EVIDENCE_EVALUATION__ATTRIBUTE:
				getAttribute().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_EVALUATION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EVIDENCE_EVALUATION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EVIDENCE_EVALUATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EVIDENCE_EVALUATION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.EVIDENCE_EVALUATION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.EVIDENCE_EVALUATION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EVIDENCE_EVALUATION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.EVIDENCE_EVALUATION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //EvidenceEvaluationImpl
