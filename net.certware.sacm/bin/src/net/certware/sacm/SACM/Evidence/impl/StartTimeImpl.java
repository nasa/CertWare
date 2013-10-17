/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;
import net.certware.sacm.SACM.Datetime;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.StartTime;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.StartTimeImpl#getDatetime <em>Datetime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartTimeImpl extends EffectiveTimeImpl implements StartTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDatetime() <em>Datetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected Datetime datetime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.START_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datetime getDatetime() {
		if (datetime != null && datetime.eIsProxy()) {
			InternalEObject oldDatetime = (InternalEObject)datetime;
			datetime = (Datetime)eResolveProxy(oldDatetime);
			if (datetime != oldDatetime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.START_TIME__DATETIME, oldDatetime, datetime));
			}
		}
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datetime basicGetDatetime() {
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatetime(Datetime newDatetime) {
		Datetime oldDatetime = datetime;
		datetime = newDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.START_TIME__DATETIME, oldDatetime, datetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.START_TIME__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.START_TIME__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.START_TIME__ID:
				return getId();
			case EvidencePackage.START_TIME__TIMING:
				return getTiming();
			case EvidencePackage.START_TIME__CUSTODY:
				return getCustody();
			case EvidencePackage.START_TIME__PROVENANCE:
				return getProvenance();
			case EvidencePackage.START_TIME__EVENT:
				return getEvent();
			case EvidencePackage.START_TIME__DATETIME:
				if (resolve) return getDatetime();
				return basicGetDatetime();
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
			case EvidencePackage.START_TIME__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.START_TIME__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.START_TIME__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.START_TIME__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.START_TIME__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.START_TIME__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.START_TIME__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.START_TIME__DATETIME:
				setDatetime((Datetime)newValue);
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
			case EvidencePackage.START_TIME__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.START_TIME__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.START_TIME__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.START_TIME__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.START_TIME__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.START_TIME__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.START_TIME__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.START_TIME__DATETIME:
				setDatetime((Datetime)null);
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
			case EvidencePackage.START_TIME__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.START_TIME__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.START_TIME__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.START_TIME__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.START_TIME__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.START_TIME__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.START_TIME__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.START_TIME__DATETIME:
				return datetime != null;
		}
		return eDynamicIsSet(featureID);
	}

} //StartTimeImpl
