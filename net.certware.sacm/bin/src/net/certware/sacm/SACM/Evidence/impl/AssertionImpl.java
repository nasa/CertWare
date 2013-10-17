/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.Assertion;
import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.RoleBinding;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.AssertionImpl#getFacttype <em>Facttype</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.AssertionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.AssertionImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionImpl extends FormalAssertionImpl implements Assertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getFacttype() <em>Facttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacttype()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacttype() <em>Facttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacttype()
	 * @generated
	 * @ordered
	 */
	protected String facttype = FACTTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleBinding> role;

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
	public AssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFacttype() {
		return facttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacttype(String newFacttype) {
		String oldFacttype = facttype;
		facttype = newFacttype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.ASSERTION__FACTTYPE, oldFacttype, facttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleBinding> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<RoleBinding>(RoleBinding.class, this, EvidencePackage.ASSERTION__ROLE);
		}
		return role;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.ASSERTION__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.ASSERTION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.ASSERTION__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ASSERTION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ASSERTION__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ASSERTION__CUSTODY:
				return ((InternalEList<?>)getCustody()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ASSERTION__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ASSERTION__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ASSERTION__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
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
			case EvidencePackage.ASSERTION__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.ASSERTION__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.ASSERTION__ID:
				return getId();
			case EvidencePackage.ASSERTION__TIMING:
				return getTiming();
			case EvidencePackage.ASSERTION__CUSTODY:
				return getCustody();
			case EvidencePackage.ASSERTION__PROVENANCE:
				return getProvenance();
			case EvidencePackage.ASSERTION__EVENT:
				return getEvent();
			case EvidencePackage.ASSERTION__CONTENT:
				return getContent();
			case EvidencePackage.ASSERTION__FACTTYPE:
				return getFacttype();
			case EvidencePackage.ASSERTION__ROLE:
				return getRole();
			case EvidencePackage.ASSERTION__DEFINITION:
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
			case EvidencePackage.ASSERTION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.ASSERTION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.ASSERTION__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.ASSERTION__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.ASSERTION__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.ASSERTION__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.ASSERTION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.ASSERTION__CONTENT:
				setContent((String)newValue);
				return;
			case EvidencePackage.ASSERTION__FACTTYPE:
				setFacttype((String)newValue);
				return;
			case EvidencePackage.ASSERTION__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleBinding>)newValue);
				return;
			case EvidencePackage.ASSERTION__DEFINITION:
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
			case EvidencePackage.ASSERTION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.ASSERTION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.ASSERTION__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.ASSERTION__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.ASSERTION__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.ASSERTION__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.ASSERTION__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.ASSERTION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EvidencePackage.ASSERTION__FACTTYPE:
				setFacttype(FACTTYPE_EDEFAULT);
				return;
			case EvidencePackage.ASSERTION__ROLE:
				getRole().clear();
				return;
			case EvidencePackage.ASSERTION__DEFINITION:
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
			case EvidencePackage.ASSERTION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.ASSERTION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.ASSERTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.ASSERTION__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.ASSERTION__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.ASSERTION__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.ASSERTION__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.ASSERTION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EvidencePackage.ASSERTION__FACTTYPE:
				return FACTTYPE_EDEFAULT == null ? facttype != null : !FACTTYPE_EDEFAULT.equals(facttype);
			case EvidencePackage.ASSERTION__ROLE:
				return role != null && !role.isEmpty();
			case EvidencePackage.ASSERTION__DEFINITION:
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
		result.append(" (facttype: "); //$NON-NLS-1$
		result.append(facttype);
		result.append(')');
		return result.toString();
	}

} //AssertionImpl
