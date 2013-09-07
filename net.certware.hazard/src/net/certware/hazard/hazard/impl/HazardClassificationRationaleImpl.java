/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.impl;

import net.certware.hazard.hazard.HazardClassificationRationale;
import net.certware.hazard.hazard.HazardPackage;
import net.certware.hazard.hazard.RiskAssessment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification Rationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl#getHazardId <em>Hazard Id</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl#getOption <em>Option</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl#getRiskAssessment <em>Risk Assessment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardClassificationRationaleImpl extends EObjectImpl implements HazardClassificationRationale {
	/**
	 * The default value of the '{@link #getHazardId() <em>Hazard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardId()
	 * @generated
	 * @ordered
	 */
	protected static final String HAZARD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHazardId() <em>Hazard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardId()
	 * @generated
	 * @ordered
	 */
	protected String hazardId = HAZARD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected String option = OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRiskAssessment() <em>Risk Assessment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected RiskAssessment riskAssessment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardClassificationRationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.HAZARD_CLASSIFICATION_RATIONALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHazardId() {
		return hazardId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardId(String newHazardId) {
		String oldHazardId = hazardId;
		hazardId = newHazardId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID, oldHazardId, hazardId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(String newOption) {
		String oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment getRiskAssessment() {
		if (riskAssessment != null && riskAssessment.eIsProxy()) {
			InternalEObject oldRiskAssessment = (InternalEObject)riskAssessment;
			riskAssessment = (RiskAssessment)eResolveProxy(oldRiskAssessment);
			if (riskAssessment != oldRiskAssessment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT, oldRiskAssessment, riskAssessment));
			}
		}
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment basicGetRiskAssessment() {
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAssessment(RiskAssessment newRiskAssessment) {
		RiskAssessment oldRiskAssessment = riskAssessment;
		riskAssessment = newRiskAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT, oldRiskAssessment, riskAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID:
				return getHazardId();
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__SUMMARY:
				return getSummary();
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__OPTION:
				return getOption();
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT:
				if (resolve) return getRiskAssessment();
				return basicGetRiskAssessment();
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
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID:
				setHazardId((String)newValue);
				return;
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__SUMMARY:
				setSummary((String)newValue);
				return;
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__OPTION:
				setOption((String)newValue);
				return;
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)newValue);
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
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID:
				setHazardId(HAZARD_ID_EDEFAULT);
				return;
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__OPTION:
				setOption(OPTION_EDEFAULT);
				return;
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)null);
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
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID:
				return HAZARD_ID_EDEFAULT == null ? hazardId != null : !HAZARD_ID_EDEFAULT.equals(hazardId);
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__OPTION:
				return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT:
				return riskAssessment != null;
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
		result.append(" (hazardId: "); //$NON-NLS-1$
		result.append(hazardId);
		result.append(", summary: "); //$NON-NLS-1$
		result.append(summary);
		result.append(", option: "); //$NON-NLS-1$
		result.append(option);
		result.append(')');
		return result.toString();
	}

} //HazardClassificationRationaleImpl
