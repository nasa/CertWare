/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.RequiresContainer;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.RequiresContainerImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiresContainerImpl extends ProjectPropertyImpl implements RequiresContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EvidenceContainer container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.REQUIRES_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceContainer getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (EvidenceContainer)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.REQUIRES_CONTAINER__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceContainer basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(EvidenceContainer newContainer) {
		EvidenceContainer oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.REQUIRES_CONTAINER__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.REQUIRES_CONTAINER__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.REQUIRES_CONTAINER__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.REQUIRES_CONTAINER__ID:
				return getId();
			case EvidencePackage.REQUIRES_CONTAINER__TIMING:
				return getTiming();
			case EvidencePackage.REQUIRES_CONTAINER__CUSTODY:
				return getCustody();
			case EvidencePackage.REQUIRES_CONTAINER__PROVENANCE:
				return getProvenance();
			case EvidencePackage.REQUIRES_CONTAINER__EVENT:
				return getEvent();
			case EvidencePackage.REQUIRES_CONTAINER__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
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
			case EvidencePackage.REQUIRES_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__CONTAINER:
				setContainer((EvidenceContainer)newValue);
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
			case EvidencePackage.REQUIRES_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.REQUIRES_CONTAINER__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.REQUIRES_CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.REQUIRES_CONTAINER__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.REQUIRES_CONTAINER__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.REQUIRES_CONTAINER__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.REQUIRES_CONTAINER__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.REQUIRES_CONTAINER__CONTAINER:
				setContainer((EvidenceContainer)null);
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
			case EvidencePackage.REQUIRES_CONTAINER__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.REQUIRES_CONTAINER__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.REQUIRES_CONTAINER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.REQUIRES_CONTAINER__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.REQUIRES_CONTAINER__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.REQUIRES_CONTAINER__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.REQUIRES_CONTAINER__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.REQUIRES_CONTAINER__CONTAINER:
				return container != null;
		}
		return eDynamicIsSet(featureID);
	}

} //RequiresContainerImpl
