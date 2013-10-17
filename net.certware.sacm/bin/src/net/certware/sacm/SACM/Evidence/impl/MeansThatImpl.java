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
import net.certware.sacm.SACM.Evidence.MeansThat;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Means That</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.MeansThatImpl#getMeaning <em>Meaning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeansThatImpl extends EvidenceInterpretationImpl implements MeansThat {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected FormalAssertion meaning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeansThatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.MEANS_THAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion getMeaning() {
		if (meaning != null && meaning.eIsProxy()) {
			InternalEObject oldMeaning = (InternalEObject)meaning;
			meaning = (FormalAssertion)eResolveProxy(oldMeaning);
			if (meaning != oldMeaning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.MEANS_THAT__MEANING, oldMeaning, meaning));
			}
		}
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalAssertion basicGetMeaning() {
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaning(FormalAssertion newMeaning) {
		FormalAssertion oldMeaning = meaning;
		meaning = newMeaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.MEANS_THAT__MEANING, oldMeaning, meaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.MEANS_THAT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.MEANS_THAT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.MEANS_THAT__ID:
				return getId();
			case EvidencePackage.MEANS_THAT__TIMING:
				return getTiming();
			case EvidencePackage.MEANS_THAT__CUSTODY:
				return getCustody();
			case EvidencePackage.MEANS_THAT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.MEANS_THAT__EVENT:
				return getEvent();
			case EvidencePackage.MEANS_THAT__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.MEANS_THAT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case EvidencePackage.MEANS_THAT__MEANING:
				if (resolve) return getMeaning();
				return basicGetMeaning();
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
			case EvidencePackage.MEANS_THAT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.MEANS_THAT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.MEANS_THAT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.MEANS_THAT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.MEANS_THAT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.MEANS_THAT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.MEANS_THAT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.MEANS_THAT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.MEANS_THAT__SUBJECT:
				setSubject((EvidenceElement)newValue);
				return;
			case EvidencePackage.MEANS_THAT__MEANING:
				setMeaning((FormalAssertion)newValue);
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
			case EvidencePackage.MEANS_THAT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.MEANS_THAT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.MEANS_THAT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.MEANS_THAT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.MEANS_THAT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.MEANS_THAT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.MEANS_THAT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.MEANS_THAT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.MEANS_THAT__SUBJECT:
				setSubject((EvidenceElement)null);
				return;
			case EvidencePackage.MEANS_THAT__MEANING:
				setMeaning((FormalAssertion)null);
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
			case EvidencePackage.MEANS_THAT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.MEANS_THAT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.MEANS_THAT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.MEANS_THAT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.MEANS_THAT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.MEANS_THAT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.MEANS_THAT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.MEANS_THAT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.MEANS_THAT__SUBJECT:
				return subject != null;
			case EvidencePackage.MEANS_THAT__MEANING:
				return meaning != null;
		}
		return eDynamicIsSet(featureID);
	}

} //MeansThatImpl
