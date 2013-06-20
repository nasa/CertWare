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
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.ProvidesContext;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ProvidesContextImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidesContextImpl extends EvidenceInterpretationImpl implements ProvidesContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EvidenceElement context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.PROVIDES_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceElement getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (EvidenceElement)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.PROVIDES_CONTEXT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceElement basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(EvidenceElement newContext) {
		EvidenceElement oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PROVIDES_CONTEXT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.PROVIDES_CONTEXT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.PROVIDES_CONTEXT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.PROVIDES_CONTEXT__ID:
				return getId();
			case EvidencePackage.PROVIDES_CONTEXT__TIMING:
				return getTiming();
			case EvidencePackage.PROVIDES_CONTEXT__CUSTODY:
				return getCustody();
			case EvidencePackage.PROVIDES_CONTEXT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.PROVIDES_CONTEXT__EVENT:
				return getEvent();
			case EvidencePackage.PROVIDES_CONTEXT__ATTRIBUTE:
				return getAttribute();
			case EvidencePackage.PROVIDES_CONTEXT__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case EvidencePackage.PROVIDES_CONTEXT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case EvidencePackage.PROVIDES_CONTEXT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends EvidenceAttribute>)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__SUBJECT:
				setSubject((EvidenceElement)newValue);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__CONTEXT:
				setContext((EvidenceElement)newValue);
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
			case EvidencePackage.PROVIDES_CONTEXT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.PROVIDES_CONTEXT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.PROVIDES_CONTEXT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.PROVIDES_CONTEXT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.PROVIDES_CONTEXT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.PROVIDES_CONTEXT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.PROVIDES_CONTEXT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case EvidencePackage.PROVIDES_CONTEXT__SUBJECT:
				setSubject((EvidenceElement)null);
				return;
			case EvidencePackage.PROVIDES_CONTEXT__CONTEXT:
				setContext((EvidenceElement)null);
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
			case EvidencePackage.PROVIDES_CONTEXT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.PROVIDES_CONTEXT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.PROVIDES_CONTEXT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.PROVIDES_CONTEXT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.PROVIDES_CONTEXT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.PROVIDES_CONTEXT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.PROVIDES_CONTEXT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.PROVIDES_CONTEXT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case EvidencePackage.PROVIDES_CONTEXT__SUBJECT:
				return subject != null;
			case EvidencePackage.PROVIDES_CONTEXT__CONTEXT:
				return context != null;
		}
		return eDynamicIsSet(featureID);
	}

} //ProvidesContextImpl
