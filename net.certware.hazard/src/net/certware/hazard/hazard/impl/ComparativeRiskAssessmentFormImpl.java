/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.impl;

import java.util.Collection;

import net.certware.hazard.hazard.ComparativeRiskAssessmentForm;
import net.certware.hazard.hazard.HazardList;
import net.certware.hazard.hazard.HazardPackage;
import net.certware.hazard.hazard.Reference;
import net.certware.hazard.hazard.RiskAssessment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparative Risk Assessment Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getSecTrackingNumber <em>Sec Tracking Number</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getCraTitle <em>Cra Title</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getSystem <em>System</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getProposedChange <em>Proposed Change</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getHazardList <em>Hazard List</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl#getAssessmentSummary <em>Assessment Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparativeRiskAssessmentFormImpl extends EObjectImpl implements ComparativeRiskAssessmentForm {
	/**
	 * The default value of the '{@link #getSecTrackingNumber() <em>Sec Tracking Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecTrackingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SEC_TRACKING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecTrackingNumber() <em>Sec Tracking Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecTrackingNumber()
	 * @generated
	 * @ordered
	 */
	protected String secTrackingNumber = SEC_TRACKING_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCraTitle() <em>Cra Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCraTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CRA_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCraTitle() <em>Cra Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCraTitle()
	 * @generated
	 * @ordered
	 */
	protected String craTitle = CRA_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected String system = SYSTEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

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
	 * The default value of the '{@link #getProposedChange() <em>Proposed Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposedChange()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPOSED_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProposedChange() <em>Proposed Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProposedChange()
	 * @generated
	 * @ordered
	 */
	protected String proposedChange = PROPOSED_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRiskAssessment() <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected RiskAssessment riskAssessment;

	/**
	 * The cached value of the '{@link #getHazardList() <em>Hazard List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardList()
	 * @generated
	 * @ordered
	 */
	protected HazardList hazardList;

	/**
	 * The default value of the '{@link #getAssessmentSummary() <em>Assessment Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSMENT_SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessmentSummary() <em>Assessment Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSummary()
	 * @generated
	 * @ordered
	 */
	protected String assessmentSummary = ASSESSMENT_SUMMARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeRiskAssessmentFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecTrackingNumber() {
		return secTrackingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecTrackingNumber(String newSecTrackingNumber) {
		String oldSecTrackingNumber = secTrackingNumber;
		secTrackingNumber = newSecTrackingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER, oldSecTrackingNumber, secTrackingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCraTitle() {
		return craTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCraTitle(String newCraTitle) {
		String oldCraTitle = craTitle;
		craTitle = newCraTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE, oldCraTitle, craTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(String newSystem) {
		String oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Reference>(Reference.class, this, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES);
		}
		return references;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE, oldBaseline, baseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProposedChange() {
		return proposedChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProposedChange(String newProposedChange) {
		String oldProposedChange = proposedChange;
		proposedChange = newProposedChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE, oldProposedChange, proposedChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment getRiskAssessment() {
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAssessment(RiskAssessment newRiskAssessment, NotificationChain msgs) {
		RiskAssessment oldRiskAssessment = riskAssessment;
		riskAssessment = newRiskAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT, oldRiskAssessment, newRiskAssessment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAssessment(RiskAssessment newRiskAssessment) {
		if (newRiskAssessment != riskAssessment) {
			NotificationChain msgs = null;
			if (riskAssessment != null)
				msgs = ((InternalEObject)riskAssessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT, null, msgs);
			if (newRiskAssessment != null)
				msgs = ((InternalEObject)newRiskAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT, null, msgs);
			msgs = basicSetRiskAssessment(newRiskAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT, newRiskAssessment, newRiskAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardList getHazardList() {
		return hazardList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazardList(HazardList newHazardList, NotificationChain msgs) {
		HazardList oldHazardList = hazardList;
		hazardList = newHazardList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST, oldHazardList, newHazardList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardList(HazardList newHazardList) {
		if (newHazardList != hazardList) {
			NotificationChain msgs = null;
			if (hazardList != null)
				msgs = ((InternalEObject)hazardList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST, null, msgs);
			if (newHazardList != null)
				msgs = ((InternalEObject)newHazardList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST, null, msgs);
			msgs = basicSetHazardList(newHazardList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST, newHazardList, newHazardList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssessmentSummary() {
		return assessmentSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessmentSummary(String newAssessmentSummary) {
		String oldAssessmentSummary = assessmentSummary;
		assessmentSummary = newAssessmentSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY, oldAssessmentSummary, assessmentSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT:
				return basicSetRiskAssessment(null, msgs);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST:
				return basicSetHazardList(null, msgs);
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
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER:
				return getSecTrackingNumber();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE:
				return getCraTitle();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM:
				return getSystem();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES:
				return getReferences();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY:
				return getSummary();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE:
				return getBaseline();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE:
				return getProposedChange();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION:
				return getDescription();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT:
				return getRiskAssessment();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST:
				return getHazardList();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY:
				return getAssessmentSummary();
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
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER:
				setSecTrackingNumber((String)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE:
				setCraTitle((String)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM:
				setSystem((String)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY:
				setSummary((String)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE:
				setBaseline((String)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE:
				setProposedChange((String)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST:
				setHazardList((HazardList)newValue);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY:
				setAssessmentSummary((String)newValue);
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
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER:
				setSecTrackingNumber(SEC_TRACKING_NUMBER_EDEFAULT);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE:
				setCraTitle(CRA_TITLE_EDEFAULT);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES:
				getReferences().clear();
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE:
				setBaseline(BASELINE_EDEFAULT);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE:
				setProposedChange(PROPOSED_CHANGE_EDEFAULT);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)null);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST:
				setHazardList((HazardList)null);
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY:
				setAssessmentSummary(ASSESSMENT_SUMMARY_EDEFAULT);
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
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER:
				return SEC_TRACKING_NUMBER_EDEFAULT == null ? secTrackingNumber != null : !SEC_TRACKING_NUMBER_EDEFAULT.equals(secTrackingNumber);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE:
				return CRA_TITLE_EDEFAULT == null ? craTitle != null : !CRA_TITLE_EDEFAULT.equals(craTitle);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES:
				return references != null && !references.isEmpty();
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE:
				return BASELINE_EDEFAULT == null ? baseline != null : !BASELINE_EDEFAULT.equals(baseline);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE:
				return PROPOSED_CHANGE_EDEFAULT == null ? proposedChange != null : !PROPOSED_CHANGE_EDEFAULT.equals(proposedChange);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT:
				return riskAssessment != null;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST:
				return hazardList != null;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY:
				return ASSESSMENT_SUMMARY_EDEFAULT == null ? assessmentSummary != null : !ASSESSMENT_SUMMARY_EDEFAULT.equals(assessmentSummary);
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
		result.append(" (secTrackingNumber: "); //$NON-NLS-1$
		result.append(secTrackingNumber);
		result.append(", craTitle: "); //$NON-NLS-1$
		result.append(craTitle);
		result.append(", system: "); //$NON-NLS-1$
		result.append(system);
		result.append(", summary: "); //$NON-NLS-1$
		result.append(summary);
		result.append(", baseline: "); //$NON-NLS-1$
		result.append(baseline);
		result.append(", proposedChange: "); //$NON-NLS-1$
		result.append(proposedChange);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", assessmentSummary: "); //$NON-NLS-1$
		result.append(assessmentSummary);
		result.append(')');
		return result.toString();
	}

} //ComparativeRiskAssessmentFormImpl
