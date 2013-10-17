/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceAttribute;
import net.certware.sacm.SACM.Evidence.EvidenceElement;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.EvidenceRelation;
import net.certware.sacm.SACM.Evidence.Negates;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.NegatesImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegatesImpl extends EvidenceResolutionImpl implements Negates {
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
	protected EvidenceRelation element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.NEGATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (EvidenceRelation)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.NEGATES__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EvidenceRelation newElement) {
		EvidenceRelation oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.NEGATES__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.NEGATES__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.NEGATES__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.NEGATES__ID:
				return getId();
			case EvidencePackage.NEGATES__TIMING:
				return getTiming();
			case EvidencePackage.NEGATES__CUSTODY:
				return getCustody();
			case EvidencePackage.NEGATES__PROVENANCE:
				return getProvenance();
			case EvidencePackage.NEGATES__EVENT:
				return getEvent();
			case EvidencePackage.NEGATES__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.NEGATES__SUBJECT:
				return getSubject();
			case EvidencePackage.NEGATES__ELEMENT:
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
			case EvidencePackage.NEGATES__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.NEGATES__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.NEGATES__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.NEGATES__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.NEGATES__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.NEGATES__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.NEGATES__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.NEGATES__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.NEGATES__SUBJECT:
				setSubject((EvidenceElement)newValue);
				return;
			case EvidencePackage.NEGATES__ELEMENT:
				setElement((EvidenceRelation)newValue);
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
			case EvidencePackage.NEGATES__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.NEGATES__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.NEGATES__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.NEGATES__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.NEGATES__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.NEGATES__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.NEGATES__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.NEGATES__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.NEGATES__SUBJECT:
				setSubject((EvidenceElement)null);
				return;
			case EvidencePackage.NEGATES__ELEMENT:
				setElement((EvidenceRelation)null);
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
			case EvidencePackage.NEGATES__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.NEGATES__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.NEGATES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.NEGATES__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.NEGATES__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.NEGATES__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.NEGATES__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.NEGATES__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.NEGATES__SUBJECT:
				return subject != null;
			case EvidencePackage.NEGATES__ELEMENT:
				return element != null;
		}
		return eDynamicIsSet(featureID);
	}

} //NegatesImpl
