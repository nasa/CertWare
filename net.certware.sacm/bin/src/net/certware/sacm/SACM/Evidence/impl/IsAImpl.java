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
import net.certware.sacm.SACM.Evidence.FormalElement;
import net.certware.sacm.SACM.Evidence.IsA;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.IsAImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsAImpl extends EvidenceInterpretationImpl implements IsA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected FormalElement definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.IS_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalElement getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (FormalElement)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.IS_A__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalElement basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(FormalElement newDefinition) {
		FormalElement oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.IS_A__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.IS_A__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.IS_A__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.IS_A__ID:
				return getId();
			case EvidencePackage.IS_A__TIMING:
				return getTiming();
			case EvidencePackage.IS_A__CUSTODY:
				return getCustody();
			case EvidencePackage.IS_A__PROVENANCE:
				return getProvenance();
			case EvidencePackage.IS_A__EVENT:
				return getEvent();
			case EvidencePackage.IS_A__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.IS_A__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case EvidencePackage.IS_A__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case EvidencePackage.IS_A__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.IS_A__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.IS_A__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.IS_A__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.IS_A__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.IS_A__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.IS_A__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.IS_A__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.IS_A__SUBJECT:
				setSubject((EvidenceElement)newValue);
				return;
			case EvidencePackage.IS_A__DEFINITION:
				setDefinition((FormalElement)newValue);
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
			case EvidencePackage.IS_A__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.IS_A__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.IS_A__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.IS_A__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.IS_A__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.IS_A__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.IS_A__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.IS_A__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.IS_A__SUBJECT:
				setSubject((EvidenceElement)null);
				return;
			case EvidencePackage.IS_A__DEFINITION:
				setDefinition((FormalElement)null);
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
			case EvidencePackage.IS_A__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.IS_A__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.IS_A__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.IS_A__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.IS_A__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.IS_A__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.IS_A__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.IS_A__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.IS_A__SUBJECT:
				return subject != null;
			case EvidencePackage.IS_A__DEFINITION:
				return definition != null;
		}
		return eDynamicIsSet(featureID);
	}

} //IsAImpl
