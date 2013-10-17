/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.DependsOn;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.ProjectElement;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.DependsOnImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependsOnImpl extends ProjectPropertyImpl implements DependsOn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected ProjectElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependsOnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.DEPENDS_ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (ProjectElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.DEPENDS_ON__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ProjectElement newElement) {
		ProjectElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.DEPENDS_ON__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.DEPENDS_ON__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.DEPENDS_ON__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.DEPENDS_ON__ID:
				return getId();
			case EvidencePackage.DEPENDS_ON__TIMING:
				return getTiming();
			case EvidencePackage.DEPENDS_ON__CUSTODY:
				return getCustody();
			case EvidencePackage.DEPENDS_ON__PROVENANCE:
				return getProvenance();
			case EvidencePackage.DEPENDS_ON__EVENT:
				return getEvent();
			case EvidencePackage.DEPENDS_ON__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
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
			case EvidencePackage.DEPENDS_ON__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.DEPENDS_ON__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.DEPENDS_ON__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.DEPENDS_ON__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.DEPENDS_ON__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.DEPENDS_ON__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.DEPENDS_ON__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.DEPENDS_ON__ELEMENT:
				setElement((ProjectElement)newValue);
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
			case EvidencePackage.DEPENDS_ON__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.DEPENDS_ON__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.DEPENDS_ON__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.DEPENDS_ON__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.DEPENDS_ON__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.DEPENDS_ON__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.DEPENDS_ON__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.DEPENDS_ON__ELEMENT:
				setElement((ProjectElement)null);
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
			case EvidencePackage.DEPENDS_ON__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.DEPENDS_ON__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.DEPENDS_ON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.DEPENDS_ON__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.DEPENDS_ON__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.DEPENDS_ON__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.DEPENDS_ON__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.DEPENDS_ON__ELEMENT:
				return element != null;
		}
		return eDynamicIsSet(featureID);
	}

} //DependsOnImpl
