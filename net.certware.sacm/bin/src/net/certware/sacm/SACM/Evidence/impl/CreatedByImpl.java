/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CreatedBy;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
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
 * An implementation of the model object '<em><b>Created By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.CreatedByImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatedByImpl extends ProvenanceImpl implements CreatedBy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Stakeholder source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.CREATED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Stakeholder)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CREATED_BY__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Stakeholder newSource) {
		Stakeholder oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CREATED_BY__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.CREATED_BY__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.CREATED_BY__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.CREATED_BY__ID:
				return getId();
			case EvidencePackage.CREATED_BY__TIMING:
				return getTiming();
			case EvidencePackage.CREATED_BY__CUSTODY:
				return getCustody();
			case EvidencePackage.CREATED_BY__PROVENANCE:
				return getProvenance();
			case EvidencePackage.CREATED_BY__EVENT:
				return getEvent();
			case EvidencePackage.CREATED_BY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case EvidencePackage.CREATED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.CREATED_BY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.CREATED_BY__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.CREATED_BY__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.CREATED_BY__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.CREATED_BY__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.CREATED_BY__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.CREATED_BY__SOURCE:
				setSource((Stakeholder)newValue);
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
			case EvidencePackage.CREATED_BY__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.CREATED_BY__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.CREATED_BY__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.CREATED_BY__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.CREATED_BY__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.CREATED_BY__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.CREATED_BY__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.CREATED_BY__SOURCE:
				setSource((Stakeholder)null);
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
			case EvidencePackage.CREATED_BY__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.CREATED_BY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.CREATED_BY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.CREATED_BY__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.CREATED_BY__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.CREATED_BY__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.CREATED_BY__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.CREATED_BY__SOURCE:
				return source != null;
		}
		return eDynamicIsSet(featureID);
	}

} //CreatedByImpl
