/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence.impl;

import java.util.Collection;

import net.certware.evidence.evidence.EvidenceItem;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.EvidenceRequest;
import net.certware.evidence.evidence.Provenance;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.EvidenceRequestImpl#getItem <em>Item</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.EvidenceRequestImpl#getProvenance <em>Provenance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceRequestImpl extends AdministrativeElementImpl implements EvidenceRequest {
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
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected EList<Provenance> provenance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceRequestImpl() {
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
	public EList<Provenance> getProvenance() {
		if (provenance == null) {
			provenance = new EObjectContainmentEList<Provenance>(Provenance.class, this, EvidencePackage.EVIDENCE_REQUEST__PROVENANCE);
		}
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				return getItem();
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				return getProvenance();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends EvidenceItem>)newValue);
				return;
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
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
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				getItem().clear();
				return;
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				getProvenance().clear();
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
			case EvidencePackage.EVIDENCE_REQUEST__ITEM:
				return item != null && !item.isEmpty();
			case EvidencePackage.EVIDENCE_REQUEST__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvidenceRequestImpl
