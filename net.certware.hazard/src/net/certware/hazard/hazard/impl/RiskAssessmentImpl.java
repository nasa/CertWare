/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.impl;

import net.certware.hazard.hazard.HazardPackage;
import net.certware.hazard.hazard.Likelihood_FAA;
import net.certware.hazard.hazard.RiskAssessment;
import net.certware.hazard.hazard.Severity_FAA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentImpl#getSeverityRationale <em>Severity Rationale</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.RiskAssessmentImpl#getProbabilityRationale <em>Probability Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskAssessmentImpl extends EObjectImpl implements RiskAssessment {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity_FAA SEVERITY_EDEFAULT = Severity_FAA.NO_SAFETY_EFFECT;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity_FAA severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Likelihood_FAA PROBABILITY_EDEFAULT = Likelihood_FAA.EXTREMELY_IMPROBABLE_D;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected Likelihood_FAA probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessment() <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected String assessment = ASSESSMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverityRationale() <em>Severity Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverityRationale() <em>Severity Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityRationale()
	 * @generated
	 * @ordered
	 */
	protected String severityRationale = SEVERITY_RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbabilityRationale() <em>Probability Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBABILITY_RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbabilityRationale() <em>Probability Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityRationale()
	 * @generated
	 * @ordered
	 */
	protected String probabilityRationale = PROBABILITY_RATIONALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.RISK_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity_FAA getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Severity_FAA newSeverity) {
		Severity_FAA oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_FAA getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(Likelihood_FAA newProbability) {
		Likelihood_FAA oldProbability = probability;
		probability = newProbability == null ? PROBABILITY_EDEFAULT : newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssessment() {
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessment(String newAssessment) {
		String oldAssessment = assessment;
		assessment = newAssessment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT__ASSESSMENT, oldAssessment, assessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverityRationale() {
		return severityRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverityRationale(String newSeverityRationale) {
		String oldSeverityRationale = severityRationale;
		severityRationale = newSeverityRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT__SEVERITY_RATIONALE, oldSeverityRationale, severityRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProbabilityRationale() {
		return probabilityRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabilityRationale(String newProbabilityRationale) {
		String oldProbabilityRationale = probabilityRationale;
		probabilityRationale = newProbabilityRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.RISK_ASSESSMENT__PROBABILITY_RATIONALE, oldProbabilityRationale, probabilityRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HazardPackage.RISK_ASSESSMENT__SEVERITY:
				return getSeverity();
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY:
				return getProbability();
			case HazardPackage.RISK_ASSESSMENT__ASSESSMENT:
				return getAssessment();
			case HazardPackage.RISK_ASSESSMENT__SEVERITY_RATIONALE:
				return getSeverityRationale();
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY_RATIONALE:
				return getProbabilityRationale();
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
			case HazardPackage.RISK_ASSESSMENT__SEVERITY:
				setSeverity((Severity_FAA)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY:
				setProbability((Likelihood_FAA)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT__ASSESSMENT:
				setAssessment((String)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT__SEVERITY_RATIONALE:
				setSeverityRationale((String)newValue);
				return;
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY_RATIONALE:
				setProbabilityRationale((String)newValue);
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
			case HazardPackage.RISK_ASSESSMENT__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT__ASSESSMENT:
				setAssessment(ASSESSMENT_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT__SEVERITY_RATIONALE:
				setSeverityRationale(SEVERITY_RATIONALE_EDEFAULT);
				return;
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY_RATIONALE:
				setProbabilityRationale(PROBABILITY_RATIONALE_EDEFAULT);
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
			case HazardPackage.RISK_ASSESSMENT__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case HazardPackage.RISK_ASSESSMENT__ASSESSMENT:
				return ASSESSMENT_EDEFAULT == null ? assessment != null : !ASSESSMENT_EDEFAULT.equals(assessment);
			case HazardPackage.RISK_ASSESSMENT__SEVERITY_RATIONALE:
				return SEVERITY_RATIONALE_EDEFAULT == null ? severityRationale != null : !SEVERITY_RATIONALE_EDEFAULT.equals(severityRationale);
			case HazardPackage.RISK_ASSESSMENT__PROBABILITY_RATIONALE:
				return PROBABILITY_RATIONALE_EDEFAULT == null ? probabilityRationale != null : !PROBABILITY_RATIONALE_EDEFAULT.equals(probabilityRationale);
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
		result.append(" (severity: "); //$NON-NLS-1$
		result.append(severity);
		result.append(", probability: "); //$NON-NLS-1$
		result.append(probability);
		result.append(", assessment: "); //$NON-NLS-1$
		result.append(assessment);
		result.append(", severityRationale: "); //$NON-NLS-1$
		result.append(severityRationale);
		result.append(", probabilityRationale: "); //$NON-NLS-1$
		result.append(probabilityRationale);
		result.append(')');
		return result.toString();
	}

} //RiskAssessmentImpl
