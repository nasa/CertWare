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
import net.certware.sacm.SACM.Evidence.HasMedia;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.HasMediaImpl#getMedia <em>Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasMediaImpl extends ExhibitPropertyImpl implements HasMedia {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getMedia() <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected String media = MEDIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.HAS_MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(String newMedia) {
		String oldMedia = media;
		media = newMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.HAS_MEDIA__MEDIA, oldMedia, media));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.HAS_MEDIA__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.HAS_MEDIA__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.HAS_MEDIA__ID:
				return getId();
			case EvidencePackage.HAS_MEDIA__TIMING:
				return getTiming();
			case EvidencePackage.HAS_MEDIA__CUSTODY:
				return getCustody();
			case EvidencePackage.HAS_MEDIA__PROVENANCE:
				return getProvenance();
			case EvidencePackage.HAS_MEDIA__EVENT:
				return getEvent();
			case EvidencePackage.HAS_MEDIA__MEDIA:
				return getMedia();
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
			case EvidencePackage.HAS_MEDIA__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.HAS_MEDIA__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.HAS_MEDIA__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.HAS_MEDIA__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.HAS_MEDIA__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.HAS_MEDIA__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.HAS_MEDIA__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.HAS_MEDIA__MEDIA:
				setMedia((String)newValue);
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
			case EvidencePackage.HAS_MEDIA__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.HAS_MEDIA__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.HAS_MEDIA__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.HAS_MEDIA__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.HAS_MEDIA__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.HAS_MEDIA__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.HAS_MEDIA__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.HAS_MEDIA__MEDIA:
				setMedia(MEDIA_EDEFAULT);
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
			case EvidencePackage.HAS_MEDIA__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.HAS_MEDIA__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.HAS_MEDIA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.HAS_MEDIA__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.HAS_MEDIA__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.HAS_MEDIA__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.HAS_MEDIA__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.HAS_MEDIA__MEDIA:
				return MEDIA_EDEFAULT == null ? media != null : !MEDIA_EDEFAULT.equals(media);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (media: "); //$NON-NLS-1$
		result.append(media);
		result.append(')');
		return result.toString();
	}

} //HasMediaImpl
