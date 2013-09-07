/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.Contributes;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceAttribute;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.EvidenceRelation;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ContributesImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ContributesImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContributesImpl extends EvidenceObservationImpl implements Contributes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EvidenceRelation subject;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EvidenceRelation relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.CONTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (EvidenceRelation)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONTRIBUTES__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(EvidenceRelation newSubject) {
		EvidenceRelation oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONTRIBUTES__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (EvidenceRelation)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.CONTRIBUTES__RELATION, oldRelation, relation));
			}
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceRelation basicGetRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(EvidenceRelation newRelation) {
		EvidenceRelation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.CONTRIBUTES__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.CONTRIBUTES__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.CONTRIBUTES__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.CONTRIBUTES__ID:
				return getId();
			case EvidencePackage.CONTRIBUTES__TIMING:
				return getTiming();
			case EvidencePackage.CONTRIBUTES__CUSTODY:
				return getCustody();
			case EvidencePackage.CONTRIBUTES__PROVENANCE:
				return getProvenance();
			case EvidencePackage.CONTRIBUTES__EVENT:
				return getEvent();
			case EvidencePackage.CONTRIBUTES__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.CONTRIBUTES__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case EvidencePackage.CONTRIBUTES__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
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
			case EvidencePackage.CONTRIBUTES__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__SUBJECT:
				setSubject((EvidenceRelation)newValue);
				return;
			case EvidencePackage.CONTRIBUTES__RELATION:
				setRelation((EvidenceRelation)newValue);
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
			case EvidencePackage.CONTRIBUTES__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.CONTRIBUTES__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.CONTRIBUTES__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.CONTRIBUTES__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.CONTRIBUTES__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.CONTRIBUTES__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.CONTRIBUTES__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.CONTRIBUTES__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.CONTRIBUTES__SUBJECT:
				setSubject((EvidenceRelation)null);
				return;
			case EvidencePackage.CONTRIBUTES__RELATION:
				setRelation((EvidenceRelation)null);
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
			case EvidencePackage.CONTRIBUTES__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.CONTRIBUTES__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.CONTRIBUTES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.CONTRIBUTES__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.CONTRIBUTES__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.CONTRIBUTES__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.CONTRIBUTES__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.CONTRIBUTES__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.CONTRIBUTES__SUBJECT:
				return subject != null;
			case EvidencePackage.CONTRIBUTES__RELATION:
				return relation != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ContributesImpl
