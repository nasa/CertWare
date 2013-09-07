/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CompliesTo;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.StandardOfProof;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complies To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.CompliesToImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompliesToImpl extends ProjectPropertyImpl implements CompliesTo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final StandardOfProof CRITERIA_EDEFAULT = StandardOfProof.UNKNOWN;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected StandardOfProof criteria = CRITERIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompliesToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.COMPLIES_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardOfProof getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(StandardOfProof newCriteria) {
		StandardOfProof oldCriteria = criteria;
		criteria = newCriteria == null ? CRITERIA_EDEFAULT : newCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.COMPLIES_TO__CRITERIA, oldCriteria, criteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.COMPLIES_TO__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.COMPLIES_TO__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.COMPLIES_TO__ID:
				return getId();
			case EvidencePackage.COMPLIES_TO__TIMING:
				return getTiming();
			case EvidencePackage.COMPLIES_TO__CUSTODY:
				return getCustody();
			case EvidencePackage.COMPLIES_TO__PROVENANCE:
				return getProvenance();
			case EvidencePackage.COMPLIES_TO__EVENT:
				return getEvent();
			case EvidencePackage.COMPLIES_TO__CRITERIA:
				return getCriteria();
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
			case EvidencePackage.COMPLIES_TO__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.COMPLIES_TO__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.COMPLIES_TO__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.COMPLIES_TO__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.COMPLIES_TO__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.COMPLIES_TO__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.COMPLIES_TO__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.COMPLIES_TO__CRITERIA:
				setCriteria((StandardOfProof)newValue);
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
			case EvidencePackage.COMPLIES_TO__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.COMPLIES_TO__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.COMPLIES_TO__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.COMPLIES_TO__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.COMPLIES_TO__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.COMPLIES_TO__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.COMPLIES_TO__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.COMPLIES_TO__CRITERIA:
				setCriteria(CRITERIA_EDEFAULT);
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
			case EvidencePackage.COMPLIES_TO__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.COMPLIES_TO__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.COMPLIES_TO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.COMPLIES_TO__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.COMPLIES_TO__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.COMPLIES_TO__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.COMPLIES_TO__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.COMPLIES_TO__CRITERIA:
				return criteria != CRITERIA_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (criteria: "); //$NON-NLS-1$
		result.append(criteria);
		result.append(')');
		return result.toString();
	}

} //CompliesToImpl
