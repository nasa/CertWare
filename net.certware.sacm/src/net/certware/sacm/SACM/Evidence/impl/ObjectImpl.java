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
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ObjectImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ObjectImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends FormalObjectImpl implements net.certware.sacm.SACM.Evidence.Object {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getConcept() <em>Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected String concept = CONCEPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EObject definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(String newConcept) {
		String oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.OBJECT__CONCEPT, oldConcept, concept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.OBJECT__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(EObject newDefinition) {
		EObject oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.OBJECT__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.OBJECT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.OBJECT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.OBJECT__ID:
				return getId();
			case EvidencePackage.OBJECT__TIMING:
				return getTiming();
			case EvidencePackage.OBJECT__CUSTODY:
				return getCustody();
			case EvidencePackage.OBJECT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.OBJECT__EVENT:
				return getEvent();
			case EvidencePackage.OBJECT__NAME:
				return getName();
			case EvidencePackage.OBJECT__CONCEPT:
				return getConcept();
			case EvidencePackage.OBJECT__DEFINITION:
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
			case EvidencePackage.OBJECT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.OBJECT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.OBJECT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.OBJECT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.OBJECT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.OBJECT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.OBJECT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.OBJECT__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.OBJECT__CONCEPT:
				setConcept((String)newValue);
				return;
			case EvidencePackage.OBJECT__DEFINITION:
				setDefinition((EObject)newValue);
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
			case EvidencePackage.OBJECT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.OBJECT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.OBJECT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.OBJECT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.OBJECT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.OBJECT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.OBJECT__CONCEPT:
				setConcept(CONCEPT_EDEFAULT);
				return;
			case EvidencePackage.OBJECT__DEFINITION:
				setDefinition((EObject)null);
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
			case EvidencePackage.OBJECT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.OBJECT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.OBJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.OBJECT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.OBJECT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.OBJECT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.OBJECT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.OBJECT__CONCEPT:
				return CONCEPT_EDEFAULT == null ? concept != null : !CONCEPT_EDEFAULT.equals(concept);
			case EvidencePackage.OBJECT__DEFINITION:
				return definition != null;
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
		result.append(" (concept: "); //$NON-NLS-1$
		result.append(concept);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
