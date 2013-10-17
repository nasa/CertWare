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
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import net.certware.sacm.SACM.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl#getCustody <em>Custody</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EvidenceElementImpl extends ModelElementImpl implements EvidenceElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingProperty> timing;

	/**
	 * The cached value of the '{@link #getCustody() <em>Custody</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustody()
	 * @generated
	 * @ordered
	 */
	protected EList<CustodyProperty> custody;

	/**
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected EList<Provenance> provenance;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceEvent> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingProperty> getTiming() {
		if (timing == null) {
			timing = new EObjectContainmentEList<TimingProperty>(TimingProperty.class, this, EvidencePackage.EVIDENCE_ELEMENT__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustodyProperty> getCustody() {
		if (custody == null) {
			custody = new EObjectContainmentEList<CustodyProperty>(CustodyProperty.class, this, EvidencePackage.EVIDENCE_ELEMENT__CUSTODY);
		}
		return custody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provenance> getProvenance() {
		if (provenance == null) {
			provenance = new EObjectContainmentEList<Provenance>(Provenance.class, this, EvidencePackage.EVIDENCE_ELEMENT__PROVENANCE);
		}
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<EvidenceEvent>(EvidenceEvent.class, this, EvidencePackage.EVIDENCE_ELEMENT__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_ELEMENT__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_ELEMENT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_ELEMENT__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_ELEMENT__CUSTODY:
				return ((InternalEList<?>)getCustody()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_ELEMENT__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_ELEMENT__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_ELEMENT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EVIDENCE_ELEMENT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EVIDENCE_ELEMENT__ID:
				return getId();
			case EvidencePackage.EVIDENCE_ELEMENT__TIMING:
				return getTiming();
			case EvidencePackage.EVIDENCE_ELEMENT__CUSTODY:
				return getCustody();
			case EvidencePackage.EVIDENCE_ELEMENT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EVIDENCE_ELEMENT__EVENT:
				return getEvent();
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
			case EvidencePackage.EVIDENCE_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
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
			case EvidencePackage.EVIDENCE_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EVIDENCE_ELEMENT__EVENT:
				getEvent().clear();
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
			case EvidencePackage.EVIDENCE_ELEMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EVIDENCE_ELEMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EVIDENCE_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EVIDENCE_ELEMENT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.EVIDENCE_ELEMENT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.EVIDENCE_ELEMENT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EVIDENCE_ELEMENT__EVENT:
				return event != null && !event.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //EvidenceElementImpl
