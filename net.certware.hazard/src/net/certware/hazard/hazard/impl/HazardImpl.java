/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.impl;

import net.certware.hazard.hazard.Hazard;
import net.certware.hazard.hazard.HazardClassificationRationale;
import net.certware.hazard.hazard.HazardPackage;
import net.certware.hazard.hazard.RiskAssessmentCode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardImpl#getHazardCondition <em>Hazard Condition</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardImpl#getRiskAssessmentCode <em>Risk Assessment Code</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardImpl#getHazardClassificationRationale <em>Hazard Classification Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardImpl extends EObjectImpl implements Hazard {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHazardCondition() <em>Hazard Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String HAZARD_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHazardCondition() <em>Hazard Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCondition()
	 * @generated
	 * @ordered
	 */
	protected String hazardCondition = HAZARD_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRiskAssessmentCode() <em>Risk Assessment Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAssessmentCode()
	 * @generated
	 * @ordered
	 */
	protected RiskAssessmentCode riskAssessmentCode;

	/**
	 * The cached value of the '{@link #getHazardClassificationRationale() <em>Hazard Classification Rationale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardClassificationRationale()
	 * @generated
	 * @ordered
	 */
	protected HazardClassificationRationale hazardClassificationRationale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHazardCondition() {
		return hazardCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardCondition(String newHazardCondition) {
		String oldHazardCondition = hazardCondition;
		hazardCondition = newHazardCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD__HAZARD_CONDITION, oldHazardCondition, hazardCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentCode getRiskAssessmentCode() {
		return riskAssessmentCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAssessmentCode(RiskAssessmentCode newRiskAssessmentCode, NotificationChain msgs) {
		RiskAssessmentCode oldRiskAssessmentCode = riskAssessmentCode;
		riskAssessmentCode = newRiskAssessmentCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD__RISK_ASSESSMENT_CODE, oldRiskAssessmentCode, newRiskAssessmentCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAssessmentCode(RiskAssessmentCode newRiskAssessmentCode) {
		if (newRiskAssessmentCode != riskAssessmentCode) {
			NotificationChain msgs = null;
			if (riskAssessmentCode != null)
				msgs = ((InternalEObject)riskAssessmentCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardPackage.HAZARD__RISK_ASSESSMENT_CODE, null, msgs);
			if (newRiskAssessmentCode != null)
				msgs = ((InternalEObject)newRiskAssessmentCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardPackage.HAZARD__RISK_ASSESSMENT_CODE, null, msgs);
			msgs = basicSetRiskAssessmentCode(newRiskAssessmentCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD__RISK_ASSESSMENT_CODE, newRiskAssessmentCode, newRiskAssessmentCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardClassificationRationale getHazardClassificationRationale() {
		if (hazardClassificationRationale != null && hazardClassificationRationale.eIsProxy()) {
			InternalEObject oldHazardClassificationRationale = (InternalEObject)hazardClassificationRationale;
			hazardClassificationRationale = (HazardClassificationRationale)eResolveProxy(oldHazardClassificationRationale);
			if (hazardClassificationRationale != oldHazardClassificationRationale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HazardPackage.HAZARD__HAZARD_CLASSIFICATION_RATIONALE, oldHazardClassificationRationale, hazardClassificationRationale));
			}
		}
		return hazardClassificationRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardClassificationRationale basicGetHazardClassificationRationale() {
		return hazardClassificationRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardClassificationRationale(HazardClassificationRationale newHazardClassificationRationale) {
		HazardClassificationRationale oldHazardClassificationRationale = hazardClassificationRationale;
		hazardClassificationRationale = newHazardClassificationRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD__HAZARD_CLASSIFICATION_RATIONALE, oldHazardClassificationRationale, hazardClassificationRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazardPackage.HAZARD__RISK_ASSESSMENT_CODE:
				return basicSetRiskAssessmentCode(null, msgs);
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
			case HazardPackage.HAZARD__NUMBER:
				return getNumber();
			case HazardPackage.HAZARD__HAZARD_CONDITION:
				return getHazardCondition();
			case HazardPackage.HAZARD__RISK_ASSESSMENT_CODE:
				return getRiskAssessmentCode();
			case HazardPackage.HAZARD__HAZARD_CLASSIFICATION_RATIONALE:
				if (resolve) return getHazardClassificationRationale();
				return basicGetHazardClassificationRationale();
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
			case HazardPackage.HAZARD__NUMBER:
				setNumber((Integer)newValue);
				return;
			case HazardPackage.HAZARD__HAZARD_CONDITION:
				setHazardCondition((String)newValue);
				return;
			case HazardPackage.HAZARD__RISK_ASSESSMENT_CODE:
				setRiskAssessmentCode((RiskAssessmentCode)newValue);
				return;
			case HazardPackage.HAZARD__HAZARD_CLASSIFICATION_RATIONALE:
				setHazardClassificationRationale((HazardClassificationRationale)newValue);
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
			case HazardPackage.HAZARD__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case HazardPackage.HAZARD__HAZARD_CONDITION:
				setHazardCondition(HAZARD_CONDITION_EDEFAULT);
				return;
			case HazardPackage.HAZARD__RISK_ASSESSMENT_CODE:
				setRiskAssessmentCode((RiskAssessmentCode)null);
				return;
			case HazardPackage.HAZARD__HAZARD_CLASSIFICATION_RATIONALE:
				setHazardClassificationRationale((HazardClassificationRationale)null);
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
			case HazardPackage.HAZARD__NUMBER:
				return number != NUMBER_EDEFAULT;
			case HazardPackage.HAZARD__HAZARD_CONDITION:
				return HAZARD_CONDITION_EDEFAULT == null ? hazardCondition != null : !HAZARD_CONDITION_EDEFAULT.equals(hazardCondition);
			case HazardPackage.HAZARD__RISK_ASSESSMENT_CODE:
				return riskAssessmentCode != null;
			case HazardPackage.HAZARD__HAZARD_CLASSIFICATION_RATIONALE:
				return hazardClassificationRationale != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (number: "); //$NON-NLS-1$
		result.append(number);
		result.append(", hazardCondition: "); //$NON-NLS-1$
		result.append(hazardCondition);
		result.append(')');
		return result.toString();
	}

} //HazardImpl
