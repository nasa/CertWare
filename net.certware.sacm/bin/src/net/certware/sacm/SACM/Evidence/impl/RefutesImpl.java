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
import net.certware.sacm.SACM.Evidence.FormalAssertion;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.Refutes;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refutes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.RefutesImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefutesImpl extends EvidenceResolutionImpl implements Refutes {
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
	protected FormalAssertion element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefutesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.REFUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (FormalAssertion)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.REFUTES__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(FormalAssertion newElement) {
		FormalAssertion oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.REFUTES__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.REFUTES__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.REFUTES__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.REFUTES__ID:
				return getId();
			case EvidencePackage.REFUTES__TIMING:
				return getTiming();
			case EvidencePackage.REFUTES__CUSTODY:
				return getCustody();
			case EvidencePackage.REFUTES__PROVENANCE:
				return getProvenance();
			case EvidencePackage.REFUTES__EVENT:
				return getEvent();
			case EvidencePackage.REFUTES__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.REFUTES__SUBJECT:
				return getSubject();
			case EvidencePackage.REFUTES__ELEMENT:
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
			case EvidencePackage.REFUTES__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.REFUTES__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.REFUTES__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.REFUTES__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.REFUTES__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.REFUTES__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.REFUTES__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.REFUTES__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.REFUTES__SUBJECT:
				setSubject((EvidenceElement)newValue);
				return;
			case EvidencePackage.REFUTES__ELEMENT:
				setElement((FormalAssertion)newValue);
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
			case EvidencePackage.REFUTES__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.REFUTES__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.REFUTES__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.REFUTES__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.REFUTES__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.REFUTES__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.REFUTES__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.REFUTES__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.REFUTES__SUBJECT:
				setSubject((EvidenceElement)null);
				return;
			case EvidencePackage.REFUTES__ELEMENT:
				setElement((FormalAssertion)null);
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
			case EvidencePackage.REFUTES__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.REFUTES__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.REFUTES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.REFUTES__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.REFUTES__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.REFUTES__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.REFUTES__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.REFUTES__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.REFUTES__SUBJECT:
				return subject != null;
			case EvidencePackage.REFUTES__ELEMENT:
				return element != null;
		}
		return eDynamicIsSet(featureID);
	}

} //RefutesImpl
