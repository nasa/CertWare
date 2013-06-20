/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CompositeObject;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.FormalObject;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.CompositeObjectImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeObjectImpl extends FormalObjectImpl implements CompositeObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalObject> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.COMPOSITE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalObject> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<FormalObject>(FormalObject.class, this, EvidencePackage.COMPOSITE_OBJECT__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.COMPOSITE_OBJECT__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EvidencePackage.COMPOSITE_OBJECT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.COMPOSITE_OBJECT__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case EvidencePackage.COMPOSITE_OBJECT__CUSTODY:
				return ((InternalEList<?>)getCustody()).basicRemove(otherEnd, msgs);
			case EvidencePackage.COMPOSITE_OBJECT__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
			case EvidencePackage.COMPOSITE_OBJECT__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case EvidencePackage.COMPOSITE_OBJECT__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
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
			case EvidencePackage.COMPOSITE_OBJECT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.COMPOSITE_OBJECT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.COMPOSITE_OBJECT__ID:
				return getId();
			case EvidencePackage.COMPOSITE_OBJECT__TIMING:
				return getTiming();
			case EvidencePackage.COMPOSITE_OBJECT__CUSTODY:
				return getCustody();
			case EvidencePackage.COMPOSITE_OBJECT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.COMPOSITE_OBJECT__EVENT:
				return getEvent();
			case EvidencePackage.COMPOSITE_OBJECT__NAME:
				return getName();
			case EvidencePackage.COMPOSITE_OBJECT__ELEMENT:
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
			case EvidencePackage.COMPOSITE_OBJECT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends FormalObject>)newValue);
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
			case EvidencePackage.COMPOSITE_OBJECT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.COMPOSITE_OBJECT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.COMPOSITE_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.COMPOSITE_OBJECT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.COMPOSITE_OBJECT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.COMPOSITE_OBJECT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.COMPOSITE_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.COMPOSITE_OBJECT__ELEMENT:
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
			case EvidencePackage.COMPOSITE_OBJECT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.COMPOSITE_OBJECT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.COMPOSITE_OBJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.COMPOSITE_OBJECT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.COMPOSITE_OBJECT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.COMPOSITE_OBJECT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.COMPOSITE_OBJECT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.COMPOSITE_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.COMPOSITE_OBJECT__ELEMENT:
				return element != null && !element.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CompositeObjectImpl
