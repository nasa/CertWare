/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.ApprovedBy;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.Stakeholder;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approved By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ApprovedByImpl#getSupervisor <em>Supervisor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApprovedByImpl extends ProvenanceImpl implements ApprovedBy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisor()
	 * @generated
	 * @ordered
	 */
	protected Stakeholder supervisor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApprovedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.APPROVED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder getSupervisor() {
		if (supervisor != null && supervisor.eIsProxy()) {
			InternalEObject oldSupervisor = (InternalEObject)supervisor;
			supervisor = (Stakeholder)eResolveProxy(oldSupervisor);
			if (supervisor != oldSupervisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.APPROVED_BY__SUPERVISOR, oldSupervisor, supervisor));
			}
		}
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder basicGetSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisor(Stakeholder newSupervisor) {
		Stakeholder oldSupervisor = supervisor;
		supervisor = newSupervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.APPROVED_BY__SUPERVISOR, oldSupervisor, supervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.APPROVED_BY__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.APPROVED_BY__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.APPROVED_BY__ID:
				return getId();
			case EvidencePackage.APPROVED_BY__TIMING:
				return getTiming();
			case EvidencePackage.APPROVED_BY__CUSTODY:
				return getCustody();
			case EvidencePackage.APPROVED_BY__PROVENANCE:
				return getProvenance();
			case EvidencePackage.APPROVED_BY__EVENT:
				return getEvent();
			case EvidencePackage.APPROVED_BY__SUPERVISOR:
				if (resolve) return getSupervisor();
				return basicGetSupervisor();
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
			case EvidencePackage.APPROVED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.APPROVED_BY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.APPROVED_BY__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.APPROVED_BY__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.APPROVED_BY__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.APPROVED_BY__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.APPROVED_BY__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.APPROVED_BY__SUPERVISOR:
				setSupervisor((Stakeholder)newValue);
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
			case EvidencePackage.APPROVED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.APPROVED_BY__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.APPROVED_BY__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.APPROVED_BY__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.APPROVED_BY__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.APPROVED_BY__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.APPROVED_BY__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.APPROVED_BY__SUPERVISOR:
				setSupervisor((Stakeholder)null);
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
			case EvidencePackage.APPROVED_BY__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.APPROVED_BY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.APPROVED_BY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.APPROVED_BY__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.APPROVED_BY__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.APPROVED_BY__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.APPROVED_BY__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.APPROVED_BY__SUPERVISOR:
				return supervisor != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ApprovedByImpl
