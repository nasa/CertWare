/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.PerformedBy;
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
 * An implementation of the model object '<em><b>Performed By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.PerformedByImpl#getExecutor <em>Executor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformedByImpl extends ProvenanceImpl implements PerformedBy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Stakeholder executor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.PERFORMED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder getExecutor() {
		if (executor != null && executor.eIsProxy()) {
			InternalEObject oldExecutor = (InternalEObject)executor;
			executor = (Stakeholder)eResolveProxy(oldExecutor);
			if (executor != oldExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.PERFORMED_BY__EXECUTOR, oldExecutor, executor));
			}
		}
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder basicGetExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Stakeholder newExecutor) {
		Stakeholder oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PERFORMED_BY__EXECUTOR, oldExecutor, executor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.PERFORMED_BY__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.PERFORMED_BY__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.PERFORMED_BY__ID:
				return getId();
			case EvidencePackage.PERFORMED_BY__TIMING:
				return getTiming();
			case EvidencePackage.PERFORMED_BY__CUSTODY:
				return getCustody();
			case EvidencePackage.PERFORMED_BY__PROVENANCE:
				return getProvenance();
			case EvidencePackage.PERFORMED_BY__EVENT:
				return getEvent();
			case EvidencePackage.PERFORMED_BY__EXECUTOR:
				if (resolve) return getExecutor();
				return basicGetExecutor();
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
			case EvidencePackage.PERFORMED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.PERFORMED_BY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.PERFORMED_BY__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.PERFORMED_BY__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.PERFORMED_BY__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.PERFORMED_BY__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.PERFORMED_BY__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.PERFORMED_BY__EXECUTOR:
				setExecutor((Stakeholder)newValue);
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
			case EvidencePackage.PERFORMED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.PERFORMED_BY__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.PERFORMED_BY__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.PERFORMED_BY__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.PERFORMED_BY__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.PERFORMED_BY__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.PERFORMED_BY__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.PERFORMED_BY__EXECUTOR:
				setExecutor((Stakeholder)null);
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
			case EvidencePackage.PERFORMED_BY__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.PERFORMED_BY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.PERFORMED_BY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.PERFORMED_BY__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.PERFORMED_BY__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.PERFORMED_BY__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.PERFORMED_BY__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.PERFORMED_BY__EXECUTOR:
				return executor != null;
		}
		return eDynamicIsSet(featureID);
	}

} //PerformedByImpl
