/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.EvaluationAttribute;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.Supercedes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supercedes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.SupercedesImpl#getNewAttribute <em>New Attribute</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.SupercedesImpl#getOldAttribute <em>Old Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupercedesImpl extends EvidenceEvaluationImpl implements Supercedes {
	/**
	 * The cached value of the '{@link #getNewAttribute() <em>New Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttribute()
	 * @generated
	 * @ordered
	 */
	protected EvaluationAttribute newAttribute;

	/**
	 * The cached value of the '{@link #getOldAttribute() <em>Old Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldAttribute()
	 * @generated
	 * @ordered
	 */
	protected EvaluationAttribute oldAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupercedesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.SUPERCEDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationAttribute getNewAttribute() {
		if (newAttribute != null && newAttribute.eIsProxy()) {
			InternalEObject oldNewAttribute = (InternalEObject)newAttribute;
			newAttribute = (EvaluationAttribute)eResolveProxy(oldNewAttribute);
			if (newAttribute != oldNewAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.SUPERCEDES__NEW_ATTRIBUTE, oldNewAttribute, newAttribute));
			}
		}
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationAttribute basicGetNewAttribute() {
		return newAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttribute(EvaluationAttribute newNewAttribute) {
		EvaluationAttribute oldNewAttribute = newAttribute;
		newAttribute = newNewAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.SUPERCEDES__NEW_ATTRIBUTE, oldNewAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationAttribute getOldAttribute() {
		if (oldAttribute != null && oldAttribute.eIsProxy()) {
			InternalEObject oldOldAttribute = (InternalEObject)oldAttribute;
			oldAttribute = (EvaluationAttribute)eResolveProxy(oldOldAttribute);
			if (oldAttribute != oldOldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvidencePackage.SUPERCEDES__OLD_ATTRIBUTE, oldOldAttribute, oldAttribute));
			}
		}
		return oldAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationAttribute basicGetOldAttribute() {
		return oldAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldAttribute(EvaluationAttribute newOldAttribute) {
		EvaluationAttribute oldOldAttribute = oldAttribute;
		oldAttribute = newOldAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.SUPERCEDES__OLD_ATTRIBUTE, oldOldAttribute, oldAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.SUPERCEDES__NEW_ATTRIBUTE:
				if (resolve) return getNewAttribute();
				return basicGetNewAttribute();
			case EvidencePackage.SUPERCEDES__OLD_ATTRIBUTE:
				if (resolve) return getOldAttribute();
				return basicGetOldAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvidencePackage.SUPERCEDES__NEW_ATTRIBUTE:
				setNewAttribute((EvaluationAttribute)newValue);
				return;
			case EvidencePackage.SUPERCEDES__OLD_ATTRIBUTE:
				setOldAttribute((EvaluationAttribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvidencePackage.SUPERCEDES__NEW_ATTRIBUTE:
				setNewAttribute((EvaluationAttribute)null);
				return;
			case EvidencePackage.SUPERCEDES__OLD_ATTRIBUTE:
				setOldAttribute((EvaluationAttribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvidencePackage.SUPERCEDES__NEW_ATTRIBUTE:
				return newAttribute != null;
			case EvidencePackage.SUPERCEDES__OLD_ATTRIBUTE:
				return oldAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //SupercedesImpl
