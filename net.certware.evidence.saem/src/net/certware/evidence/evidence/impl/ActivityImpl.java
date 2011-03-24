/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.impl;

import java.util.Collection;

import net.certware.evidence.evidence.Activity;
import net.certware.evidence.evidence.ActivityProperty;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.Provenance;
import net.certware.evidence.evidence.TimingProperty;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.ActivityImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.ActivityImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.ActivityImpl#getProvenance <em>Provenance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends AdministrativeElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityProperty> property;

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
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ActivityProperty>(ActivityProperty.class, this, EvidencePackage.ACTIVITY__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimingProperty> getTiming() {
		if (timing == null) {
			timing = new EObjectContainmentEList<TimingProperty>(TimingProperty.class, this, EvidencePackage.ACTIVITY__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provenance> getProvenance() {
		if (provenance == null) {
			provenance = new EObjectContainmentEList<Provenance>(Provenance.class, this, EvidencePackage.ACTIVITY__PROVENANCE);
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
			case EvidencePackage.ACTIVITY__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ACTIVITY__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case EvidencePackage.ACTIVITY__PROVENANCE:
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
			case EvidencePackage.ACTIVITY__PROPERTY:
				return getProperty();
			case EvidencePackage.ACTIVITY__TIMING:
				return getTiming();
			case EvidencePackage.ACTIVITY__PROVENANCE:
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
			case EvidencePackage.ACTIVITY__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ActivityProperty>)newValue);
				return;
			case EvidencePackage.ACTIVITY__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.ACTIVITY__PROVENANCE:
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
			case EvidencePackage.ACTIVITY__PROPERTY:
				getProperty().clear();
				return;
			case EvidencePackage.ACTIVITY__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.ACTIVITY__PROVENANCE:
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
			case EvidencePackage.ACTIVITY__PROPERTY:
				return property != null && !property.isEmpty();
			case EvidencePackage.ACTIVITY__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.ACTIVITY__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
