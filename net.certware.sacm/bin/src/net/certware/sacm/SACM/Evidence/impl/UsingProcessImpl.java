/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CollectionMethod;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;
import net.certware.sacm.SACM.Evidence.UsingProcess;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Using Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.UsingProcessImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsingProcessImpl extends CustodyPropertyImpl implements UsingProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CollectionMethod method;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsingProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.USING_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionMethod getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (CollectionMethod)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.USING_PROCESS__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionMethod basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CollectionMethod newMethod) {
		CollectionMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.USING_PROCESS__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.USING_PROCESS__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.USING_PROCESS__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.USING_PROCESS__ID:
				return getId();
			case EvidencePackage.USING_PROCESS__TIMING:
				return getTiming();
			case EvidencePackage.USING_PROCESS__CUSTODY:
				return getCustody();
			case EvidencePackage.USING_PROCESS__PROVENANCE:
				return getProvenance();
			case EvidencePackage.USING_PROCESS__EVENT:
				return getEvent();
			case EvidencePackage.USING_PROCESS__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
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
			case EvidencePackage.USING_PROCESS__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.USING_PROCESS__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.USING_PROCESS__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.USING_PROCESS__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.USING_PROCESS__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.USING_PROCESS__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.USING_PROCESS__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.USING_PROCESS__METHOD:
				setMethod((CollectionMethod)newValue);
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
			case EvidencePackage.USING_PROCESS__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.USING_PROCESS__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.USING_PROCESS__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.USING_PROCESS__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.USING_PROCESS__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.USING_PROCESS__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.USING_PROCESS__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.USING_PROCESS__METHOD:
				setMethod((CollectionMethod)null);
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
			case EvidencePackage.USING_PROCESS__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.USING_PROCESS__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.USING_PROCESS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.USING_PROCESS__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.USING_PROCESS__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.USING_PROCESS__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.USING_PROCESS__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.USING_PROCESS__METHOD:
				return method != null;
		}
		return eDynamicIsSet(featureID);
	}

} //UsingProcessImpl
