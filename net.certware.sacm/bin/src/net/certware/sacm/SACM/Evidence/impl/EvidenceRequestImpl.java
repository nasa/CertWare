/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidenceItem;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.EvidenceRequest;
import net.certware.sacm.SACM.Evidence.ProjectProperty;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceRequestImpl#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceRequestImpl extends ProjectElementImpl implements EvidenceRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceItem> getItem() {
		if (item == null) {
			item = new EObjectResolvingEList<EvidenceItem>(EvidenceItem.class, this, EvidencePackage.EVIDENCE_REQUEST__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_REQUEST__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EVIDENCE_REQUEST__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EVIDENCE_REQUEST__ID:
				return getId();
			case EvidencePackage.EVIDENCE_REQUEST__TIMING:
				return getTiming();
			case EvidencePackage.EVIDENCE_REQUEST__CUSTODY:
				return getCustody();
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EVIDENCE_REQUEST__EVENT:
				return getEvent();
			case EvidencePackage.EVIDENCE_REQUEST__NAME:
				return getName();
			case EvidencePackage.EVIDENCE_REQUEST__CONTENT:
				return getContent();
			case EvidencePackage.EVIDENCE_REQUEST__PROPERTY:
				return getProperty();
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				return getItem();
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
			case EvidencePackage.EVIDENCE_REQUEST__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__CONTENT:
				setContent((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ProjectProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends EvidenceItem>)newValue);
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
			case EvidencePackage.EVIDENCE_REQUEST__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__PROPERTY:
				getProperty().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				getItem().clear();
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
			case EvidencePackage.EVIDENCE_REQUEST__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EVIDENCE_REQUEST__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.EVIDENCE_REQUEST__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EvidencePackage.EVIDENCE_REQUEST__PROPERTY:
				return property != null && !property.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				return item != null && !item.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //EvidenceRequestImpl
