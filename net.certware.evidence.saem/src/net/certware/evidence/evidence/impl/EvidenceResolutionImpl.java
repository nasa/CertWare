/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.impl;

import net.certware.evidence.evidence.EvidenceGroup;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.EvidenceResolution;
import net.certware.evidence.evidence.Rationale;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.EvidenceResolutionImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.EvidenceResolutionImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EvidenceResolutionImpl extends EvidenceEvaluationImpl implements EvidenceResolution {
	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected Rationale rationale;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EvidenceGroup context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rationale getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationale(Rationale newRationale, NotificationChain msgs) {
		Rationale oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE, oldRationale, newRationale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(Rationale newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null)
				msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE, null, msgs);
			if (newRationale != null)
				msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE, null, msgs);
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE, newRationale, newRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceGroup getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(EvidenceGroup newContext, NotificationChain msgs) {
		EvidenceGroup oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(EvidenceGroup newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE:
				return basicSetRationale(null, msgs);
			case EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT:
				return basicSetContext(null, msgs);
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
			case EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE:
				return getRationale();
			case EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT:
				return getContext();
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
			case EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE:
				setRationale((Rationale)newValue);
				return;
			case EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT:
				setContext((EvidenceGroup)newValue);
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
			case EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE:
				setRationale((Rationale)null);
				return;
			case EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT:
				setContext((EvidenceGroup)null);
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
			case EvidencePackage.EVIDENCE_RESOLUTION__RATIONALE:
				return rationale != null;
			case EvidencePackage.EVIDENCE_RESOLUTION__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //EvidenceResolutionImpl
