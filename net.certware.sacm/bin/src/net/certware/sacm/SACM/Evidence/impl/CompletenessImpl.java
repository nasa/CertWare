/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.Completeness;
import net.certware.sacm.SACM.Evidence.CompletenessLevel;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completeness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.CompletenessImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompletenessImpl extends DocumentPropertyImpl implements Completeness {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CompletenessLevel STATUS_EDEFAULT = CompletenessLevel.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CompletenessLevel status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.COMPLETENESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessLevel getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CompletenessLevel newStatus) {
		CompletenessLevel oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.COMPLETENESS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.COMPLETENESS__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.COMPLETENESS__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.COMPLETENESS__ID:
				return getId();
			case EvidencePackage.COMPLETENESS__TIMING:
				return getTiming();
			case EvidencePackage.COMPLETENESS__CUSTODY:
				return getCustody();
			case EvidencePackage.COMPLETENESS__PROVENANCE:
				return getProvenance();
			case EvidencePackage.COMPLETENESS__EVENT:
				return getEvent();
			case EvidencePackage.COMPLETENESS__STATUS:
				return getStatus();
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
			case EvidencePackage.COMPLETENESS__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.COMPLETENESS__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.COMPLETENESS__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.COMPLETENESS__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.COMPLETENESS__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.COMPLETENESS__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.COMPLETENESS__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.COMPLETENESS__STATUS:
				setStatus((CompletenessLevel)newValue);
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
			case EvidencePackage.COMPLETENESS__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.COMPLETENESS__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.COMPLETENESS__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.COMPLETENESS__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.COMPLETENESS__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.COMPLETENESS__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.COMPLETENESS__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.COMPLETENESS__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case EvidencePackage.COMPLETENESS__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.COMPLETENESS__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.COMPLETENESS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.COMPLETENESS__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.COMPLETENESS__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.COMPLETENESS__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.COMPLETENESS__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.COMPLETENESS__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (status: "); //$NON-NLS-1$
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CompletenessImpl
