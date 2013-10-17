/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceElement;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidenceGroup;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceGroupImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceGroupImpl extends EvidenceItemImpl implements EvidenceGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceElement> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceElement> getElement() {
		if (element == null) {
			element = new EObjectResolvingEList<EvidenceElement>(EvidenceElement.class, this, EvidencePackage.EVIDENCE_GROUP__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_GROUP__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EVIDENCE_GROUP__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EVIDENCE_GROUP__ID:
				return getId();
			case EvidencePackage.EVIDENCE_GROUP__TIMING:
				return getTiming();
			case EvidencePackage.EVIDENCE_GROUP__CUSTODY:
				return getCustody();
			case EvidencePackage.EVIDENCE_GROUP__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EVIDENCE_GROUP__EVENT:
				return getEvent();
			case EvidencePackage.EVIDENCE_GROUP__NAME:
				return getName();
			case EvidencePackage.EVIDENCE_GROUP__ELEMENT:
				return getElement();
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
			case EvidencePackage.EVIDENCE_GROUP__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_GROUP__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends EvidenceElement>)newValue);
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
			case EvidencePackage.EVIDENCE_GROUP__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EVIDENCE_GROUP__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EVIDENCE_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_GROUP__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.EVIDENCE_GROUP__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.EVIDENCE_GROUP__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EVIDENCE_GROUP__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.EVIDENCE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_GROUP__ELEMENT:
				getElement().clear();
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
			case EvidencePackage.EVIDENCE_GROUP__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EVIDENCE_GROUP__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EVIDENCE_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EVIDENCE_GROUP__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.EVIDENCE_GROUP__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.EVIDENCE_GROUP__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EVIDENCE_GROUP__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.EVIDENCE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.EVIDENCE_GROUP__ELEMENT:
				return element != null && !element.isEmpty();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EvidenceGroupImpl
