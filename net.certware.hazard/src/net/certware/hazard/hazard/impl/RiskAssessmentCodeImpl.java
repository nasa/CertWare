/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.impl;

import net.certware.hazard.hazard.HazardPackage;
import net.certware.hazard.hazard.RiskAssessmentCode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl#getOptionB <em>Option B</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl#getOptionC <em>Option C</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl#getOptionD <em>Option D</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl#getOptionE <em>Option E</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskAssessmentCodeImpl extends EObjectImpl implements RiskAssessmentCode {
	/**
	 * The default value of the '{@link #getBaseline() <em>Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected static final String BASELINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected String baseline = BASELINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionB() <em>Option B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionB()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionB() <em>Option B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionB()
	 * @generated
	 * @ordered
	 */
	protected String optionB = OPTION_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionC() <em>Option C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionC()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionC() <em>Option C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionC()
	 * @generated
	 * @ordered
	 */
	protected String optionC = OPTION_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionD() <em>Option D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionD()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionD() <em>Option D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionD()
	 * @generated
	 * @ordered
	 */
	protected String optionD = OPTION_D_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionE() <em>Option E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionE()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_E_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionE() <em>Option E</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionE()
	 * @generated
	 * @ordered
	 */
	protected String optionE = OPTION_E_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.RISK_ASSESSMENT_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseline() {
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseline(String newBaseline) {
		String oldBaseline = baseline;
		baseline = newBaseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT_CODE__BASELINE, oldBaseline, baseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionB() {
		return optionB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionB(String newOptionB) {
		String oldOptionB = optionB;
		optionB = newOptionB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT_CODE__OPTION_B, oldOptionB, optionB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionC() {
		return optionC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionC(String newOptionC) {
		String oldOptionC = optionC;
		optionC = newOptionC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT_CODE__OPTION_C, oldOptionC, optionC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionD() {
		return optionD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionD(String newOptionD) {
		String oldOptionD = optionD;
		optionD = newOptionD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT_CODE__OPTION_D, oldOptionD, optionD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionE() {
		return optionE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionE(String newOptionE) {
		String oldOptionE = optionE;
		optionE = newOptionE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT_CODE__OPTION_E, oldOptionE, optionE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HazardPackage.RISK_ASSESSMENT_CODE__BASELINE:
				return getBaseline();
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_B:
				return getOptionB();
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_C:
				return getOptionC();
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_D:
				return getOptionD();
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_E:
				return getOptionE();
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
			case HazardPackage.RISK_ASSESSMENT_CODE__BASELINE:
				setBaseline((String)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_B:
				setOptionB((String)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_C:
				setOptionC((String)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_D:
				setOptionD((String)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_E:
				setOptionE((String)newValue);
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
			case HazardPackage.RISK_ASSESSMENT_CODE__BASELINE:
				setBaseline(BASELINE_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_B:
				setOptionB(OPTION_B_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_C:
				setOptionC(OPTION_C_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_D:
				setOptionD(OPTION_D_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_E:
				setOptionE(OPTION_E_EDEFAULT);
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
			case HazardPackage.RISK_ASSESSMENT_CODE__BASELINE:
				return BASELINE_EDEFAULT == null ? baseline != null : !BASELINE_EDEFAULT.equals(baseline);
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_B:
				return OPTION_B_EDEFAULT == null ? optionB != null : !OPTION_B_EDEFAULT.equals(optionB);
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_C:
				return OPTION_C_EDEFAULT == null ? optionC != null : !OPTION_C_EDEFAULT.equals(optionC);
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_D:
				return OPTION_D_EDEFAULT == null ? optionD != null : !OPTION_D_EDEFAULT.equals(optionD);
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_E:
				return OPTION_E_EDEFAULT == null ? optionE != null : !OPTION_E_EDEFAULT.equals(optionE);
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
		result.append(" (baseline: "); //$NON-NLS-1$
		result.append(baseline);
		result.append(", optionB: "); //$NON-NLS-1$
		result.append(optionB);
		result.append(", optionC: "); //$NON-NLS-1$
		result.append(optionC);
		result.append(", optionD: "); //$NON-NLS-1$
		result.append(optionD);
		result.append(", optionE: "); //$NON-NLS-1$
		result.append(optionE);
		result.append(')');
		return result.toString();
	}

} //RiskAssessmentCodeImpl
