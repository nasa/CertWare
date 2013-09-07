/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.certware.hazard.hazard.HazardFactory
 * @model kind="package"
 * @generated
 */
public interface HazardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hazard"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/hazard"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hazard"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazardPackage eINSTANCE = net.certware.hazard.hazard.impl.HazardPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl <em>Comparative Risk Assessment Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getComparativeRiskAssessmentForm()
	 * @generated
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM = 0;

	/**
	 * The feature id for the '<em><b>Sec Tracking Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Cra Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE = 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY = 4;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE = 5;

	/**
	 * The feature id for the '<em><b>Proposed Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Risk Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT = 8;

	/**
	 * The feature id for the '<em><b>Hazard List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST = 9;

	/**
	 * The feature id for the '<em><b>Assessment Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY = 10;

	/**
	 * The number of structural features of the '<em>Comparative Risk Assessment Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_RISK_ASSESSMENT_FORM_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.impl.HazardListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.impl.HazardListImpl
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getHazardList()
	 * @generated
	 */
	int HAZARD_LIST = 1;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_LIST__HAZARDS = 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.impl.HazardImpl
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Hazard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__HAZARD_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Risk Assessment Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__RISK_ASSESSMENT_CODE = 2;

	/**
	 * The feature id for the '<em><b>Hazard Classification Rationale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__HAZARD_CLASSIFICATION_RATIONALE = 3;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.impl.ReferenceImpl
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.impl.RiskAssessmentImpl <em>Risk Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.impl.RiskAssessmentImpl
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getRiskAssessment()
	 * @generated
	 */
	int RISK_ASSESSMENT = 4;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__SEVERITY = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__PROBABILITY = 1;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__ASSESSMENT = 2;

	/**
	 * The feature id for the '<em><b>Severity Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__SEVERITY_RATIONALE = 3;

	/**
	 * The feature id for the '<em><b>Probability Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT__PROBABILITY_RATIONALE = 4;

	/**
	 * The number of structural features of the '<em>Risk Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl <em>Risk Assessment Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getRiskAssessmentCode()
	 * @generated
	 */
	int RISK_ASSESSMENT_CODE = 5;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_CODE__BASELINE = 0;

	/**
	 * The feature id for the '<em><b>Option B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_CODE__OPTION_B = 1;

	/**
	 * The feature id for the '<em><b>Option C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_CODE__OPTION_C = 2;

	/**
	 * The feature id for the '<em><b>Option D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_CODE__OPTION_D = 3;

	/**
	 * The feature id for the '<em><b>Option E</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_CODE__OPTION_E = 4;

	/**
	 * The number of structural features of the '<em>Risk Assessment Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_ASSESSMENT_CODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl <em>Classification Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getHazardClassificationRationale()
	 * @generated
	 */
	int HAZARD_CLASSIFICATION_RATIONALE = 6;

	/**
	 * The feature id for the '<em><b>Hazard Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID = 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CLASSIFICATION_RATIONALE__SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CLASSIFICATION_RATIONALE__OPTION = 2;

	/**
	 * The feature id for the '<em><b>Risk Assessment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT = 3;

	/**
	 * The number of structural features of the '<em>Classification Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CLASSIFICATION_RATIONALE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.Severity_FAA <em>Severity FAA</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.Severity_FAA
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getSeverity_FAA()
	 * @generated
	 */
	int SEVERITY_FAA = 7;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.Likelihood_FAA <em>Likelihood FAA</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.Likelihood_FAA
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getLikelihood_FAA()
	 * @generated
	 */
	int LIKELIHOOD_FAA = 8;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.Severity_MIL_STD_882D <em>Severity MIL STD 882D</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.Severity_MIL_STD_882D
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getSeverity_MIL_STD_882D()
	 * @generated
	 */
	int SEVERITY_MIL_STD_882D = 9;

	/**
	 * The meta object id for the '{@link net.certware.hazard.hazard.Likelihood_MIL_STD_882D <em>Likelihood MIL STD 882D</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.hazard.hazard.Likelihood_MIL_STD_882D
	 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getLikelihood_MIL_STD_882D()
	 * @generated
	 */
	int LIKELIHOOD_MIL_STD_882D = 10;


	/**
	 * Returns the meta object for class '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm <em>Comparative Risk Assessment Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparative Risk Assessment Form</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm
	 * @generated
	 */
	EClass getComparativeRiskAssessmentForm();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSecTrackingNumber <em>Sec Tracking Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec Tracking Number</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSecTrackingNumber()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_SecTrackingNumber();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getCraTitle <em>Cra Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cra Title</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getCraTitle()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_CraTitle();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSystem()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_System();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getReferences()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EReference getComparativeRiskAssessmentForm_References();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSummary()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_Summary();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseline</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getBaseline()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_Baseline();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getProposedChange <em>Proposed Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposed Change</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getProposedChange()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_ProposedChange();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getDescription()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_Description();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getRiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Risk Assessment</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getRiskAssessment()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EReference getComparativeRiskAssessmentForm_RiskAssessment();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getHazardList <em>Hazard List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hazard List</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getHazardList()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EReference getComparativeRiskAssessmentForm_HazardList();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getAssessmentSummary <em>Assessment Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment Summary</em>'.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getAssessmentSummary()
	 * @see #getComparativeRiskAssessmentForm()
	 * @generated
	 */
	EAttribute getComparativeRiskAssessmentForm_AssessmentSummary();

	/**
	 * Returns the meta object for class '{@link net.certware.hazard.hazard.HazardList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see net.certware.hazard.hazard.HazardList
	 * @generated
	 */
	EClass getHazardList();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.hazard.hazard.HazardList#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazards</em>'.
	 * @see net.certware.hazard.hazard.HazardList#getHazards()
	 * @see #getHazardList()
	 * @generated
	 */
	EReference getHazardList_Hazards();

	/**
	 * Returns the meta object for class '{@link net.certware.hazard.hazard.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see net.certware.hazard.hazard.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.Hazard#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.certware.hazard.hazard.Hazard#getNumber()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.Hazard#getHazardCondition <em>Hazard Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Condition</em>'.
	 * @see net.certware.hazard.hazard.Hazard#getHazardCondition()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_HazardCondition();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.hazard.hazard.Hazard#getRiskAssessmentCode <em>Risk Assessment Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Risk Assessment Code</em>'.
	 * @see net.certware.hazard.hazard.Hazard#getRiskAssessmentCode()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_RiskAssessmentCode();

	/**
	 * Returns the meta object for the reference '{@link net.certware.hazard.hazard.Hazard#getHazardClassificationRationale <em>Hazard Classification Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hazard Classification Rationale</em>'.
	 * @see net.certware.hazard.hazard.Hazard#getHazardClassificationRationale()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_HazardClassificationRationale();

	/**
	 * Returns the meta object for class '{@link net.certware.hazard.hazard.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see net.certware.hazard.hazard.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.hazard.hazard.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for class '{@link net.certware.hazard.hazard.RiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Assessment</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessment
	 * @generated
	 */
	EClass getRiskAssessment();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessment#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessment#getSeverity()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_Severity();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessment#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessment#getProbability()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_Probability();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessment#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessment#getAssessment()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_Assessment();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessment#getSeverityRationale <em>Severity Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity Rationale</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessment#getSeverityRationale()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_SeverityRationale();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessment#getProbabilityRationale <em>Probability Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability Rationale</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessment#getProbabilityRationale()
	 * @see #getRiskAssessment()
	 * @generated
	 */
	EAttribute getRiskAssessment_ProbabilityRationale();

	/**
	 * Returns the meta object for class '{@link net.certware.hazard.hazard.RiskAssessmentCode <em>Risk Assessment Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Assessment Code</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessmentCode
	 * @generated
	 */
	EClass getRiskAssessmentCode();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessmentCode#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseline</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessmentCode#getBaseline()
	 * @see #getRiskAssessmentCode()
	 * @generated
	 */
	EAttribute getRiskAssessmentCode_Baseline();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessmentCode#getOptionB <em>Option B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option B</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessmentCode#getOptionB()
	 * @see #getRiskAssessmentCode()
	 * @generated
	 */
	EAttribute getRiskAssessmentCode_OptionB();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessmentCode#getOptionC <em>Option C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option C</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessmentCode#getOptionC()
	 * @see #getRiskAssessmentCode()
	 * @generated
	 */
	EAttribute getRiskAssessmentCode_OptionC();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessmentCode#getOptionD <em>Option D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option D</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessmentCode#getOptionD()
	 * @see #getRiskAssessmentCode()
	 * @generated
	 */
	EAttribute getRiskAssessmentCode_OptionD();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.RiskAssessmentCode#getOptionE <em>Option E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option E</em>'.
	 * @see net.certware.hazard.hazard.RiskAssessmentCode#getOptionE()
	 * @see #getRiskAssessmentCode()
	 * @generated
	 */
	EAttribute getRiskAssessmentCode_OptionE();

	/**
	 * Returns the meta object for class '{@link net.certware.hazard.hazard.HazardClassificationRationale <em>Classification Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Rationale</em>'.
	 * @see net.certware.hazard.hazard.HazardClassificationRationale
	 * @generated
	 */
	EClass getHazardClassificationRationale();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.HazardClassificationRationale#getHazardId <em>Hazard Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Id</em>'.
	 * @see net.certware.hazard.hazard.HazardClassificationRationale#getHazardId()
	 * @see #getHazardClassificationRationale()
	 * @generated
	 */
	EAttribute getHazardClassificationRationale_HazardId();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.HazardClassificationRationale#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see net.certware.hazard.hazard.HazardClassificationRationale#getSummary()
	 * @see #getHazardClassificationRationale()
	 * @generated
	 */
	EAttribute getHazardClassificationRationale_Summary();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.hazard.hazard.HazardClassificationRationale#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option</em>'.
	 * @see net.certware.hazard.hazard.HazardClassificationRationale#getOption()
	 * @see #getHazardClassificationRationale()
	 * @generated
	 */
	EAttribute getHazardClassificationRationale_Option();

	/**
	 * Returns the meta object for the reference '{@link net.certware.hazard.hazard.HazardClassificationRationale#getRiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk Assessment</em>'.
	 * @see net.certware.hazard.hazard.HazardClassificationRationale#getRiskAssessment()
	 * @see #getHazardClassificationRationale()
	 * @generated
	 */
	EReference getHazardClassificationRationale_RiskAssessment();

	/**
	 * Returns the meta object for enum '{@link net.certware.hazard.hazard.Severity_FAA <em>Severity FAA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity FAA</em>'.
	 * @see net.certware.hazard.hazard.Severity_FAA
	 * @generated
	 */
	EEnum getSeverity_FAA();

	/**
	 * Returns the meta object for enum '{@link net.certware.hazard.hazard.Likelihood_FAA <em>Likelihood FAA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Likelihood FAA</em>'.
	 * @see net.certware.hazard.hazard.Likelihood_FAA
	 * @generated
	 */
	EEnum getLikelihood_FAA();

	/**
	 * Returns the meta object for enum '{@link net.certware.hazard.hazard.Severity_MIL_STD_882D <em>Severity MIL STD 882D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity MIL STD 882D</em>'.
	 * @see net.certware.hazard.hazard.Severity_MIL_STD_882D
	 * @generated
	 */
	EEnum getSeverity_MIL_STD_882D();

	/**
	 * Returns the meta object for enum '{@link net.certware.hazard.hazard.Likelihood_MIL_STD_882D <em>Likelihood MIL STD 882D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Likelihood MIL STD 882D</em>'.
	 * @see net.certware.hazard.hazard.Likelihood_MIL_STD_882D
	 * @generated
	 */
	EEnum getLikelihood_MIL_STD_882D();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HazardFactory getHazardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl <em>Comparative Risk Assessment Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.impl.ComparativeRiskAssessmentFormImpl
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getComparativeRiskAssessmentForm()
		 * @generated
		 */
		EClass COMPARATIVE_RISK_ASSESSMENT_FORM = eINSTANCE.getComparativeRiskAssessmentForm();

		/**
		 * The meta object literal for the '<em><b>Sec Tracking Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER = eINSTANCE.getComparativeRiskAssessmentForm_SecTrackingNumber();

		/**
		 * The meta object literal for the '<em><b>Cra Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE = eINSTANCE.getComparativeRiskAssessmentForm_CraTitle();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM = eINSTANCE.getComparativeRiskAssessmentForm_System();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES = eINSTANCE.getComparativeRiskAssessmentForm_References();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY = eINSTANCE.getComparativeRiskAssessmentForm_Summary();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE = eINSTANCE.getComparativeRiskAssessmentForm_Baseline();

		/**
		 * The meta object literal for the '<em><b>Proposed Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE = eINSTANCE.getComparativeRiskAssessmentForm_ProposedChange();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION = eINSTANCE.getComparativeRiskAssessmentForm_Description();

		/**
		 * The meta object literal for the '<em><b>Risk Assessment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT = eINSTANCE.getComparativeRiskAssessmentForm_RiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Hazard List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST = eINSTANCE.getComparativeRiskAssessmentForm_HazardList();

		/**
		 * The meta object literal for the '<em><b>Assessment Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY = eINSTANCE.getComparativeRiskAssessmentForm_AssessmentSummary();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.impl.HazardListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.impl.HazardListImpl
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getHazardList()
		 * @generated
		 */
		EClass HAZARD_LIST = eINSTANCE.getHazardList();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_LIST__HAZARDS = eINSTANCE.getHazardList_Hazards();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.impl.HazardImpl
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__NUMBER = eINSTANCE.getHazard_Number();

		/**
		 * The meta object literal for the '<em><b>Hazard Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__HAZARD_CONDITION = eINSTANCE.getHazard_HazardCondition();

		/**
		 * The meta object literal for the '<em><b>Risk Assessment Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__RISK_ASSESSMENT_CODE = eINSTANCE.getHazard_RiskAssessmentCode();

		/**
		 * The meta object literal for the '<em><b>Hazard Classification Rationale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__HAZARD_CLASSIFICATION_RATIONALE = eINSTANCE.getHazard_HazardClassificationRationale();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.impl.ReferenceImpl
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.impl.RiskAssessmentImpl <em>Risk Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.impl.RiskAssessmentImpl
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getRiskAssessment()
		 * @generated
		 */
		EClass RISK_ASSESSMENT = eINSTANCE.getRiskAssessment();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__SEVERITY = eINSTANCE.getRiskAssessment_Severity();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__PROBABILITY = eINSTANCE.getRiskAssessment_Probability();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__ASSESSMENT = eINSTANCE.getRiskAssessment_Assessment();

		/**
		 * The meta object literal for the '<em><b>Severity Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__SEVERITY_RATIONALE = eINSTANCE.getRiskAssessment_SeverityRationale();

		/**
		 * The meta object literal for the '<em><b>Probability Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT__PROBABILITY_RATIONALE = eINSTANCE.getRiskAssessment_ProbabilityRationale();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl <em>Risk Assessment Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.impl.RiskAssessmentCodeImpl
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getRiskAssessmentCode()
		 * @generated
		 */
		EClass RISK_ASSESSMENT_CODE = eINSTANCE.getRiskAssessmentCode();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT_CODE__BASELINE = eINSTANCE.getRiskAssessmentCode_Baseline();

		/**
		 * The meta object literal for the '<em><b>Option B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT_CODE__OPTION_B = eINSTANCE.getRiskAssessmentCode_OptionB();

		/**
		 * The meta object literal for the '<em><b>Option C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT_CODE__OPTION_C = eINSTANCE.getRiskAssessmentCode_OptionC();

		/**
		 * The meta object literal for the '<em><b>Option D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT_CODE__OPTION_D = eINSTANCE.getRiskAssessmentCode_OptionD();

		/**
		 * The meta object literal for the '<em><b>Option E</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_ASSESSMENT_CODE__OPTION_E = eINSTANCE.getRiskAssessmentCode_OptionE();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl <em>Classification Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.impl.HazardClassificationRationaleImpl
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getHazardClassificationRationale()
		 * @generated
		 */
		EClass HAZARD_CLASSIFICATION_RATIONALE = eINSTANCE.getHazardClassificationRationale();

		/**
		 * The meta object literal for the '<em><b>Hazard Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID = eINSTANCE.getHazardClassificationRationale_HazardId();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CLASSIFICATION_RATIONALE__SUMMARY = eINSTANCE.getHazardClassificationRationale_Summary();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CLASSIFICATION_RATIONALE__OPTION = eINSTANCE.getHazardClassificationRationale_Option();

		/**
		 * The meta object literal for the '<em><b>Risk Assessment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT = eINSTANCE.getHazardClassificationRationale_RiskAssessment();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.Severity_FAA <em>Severity FAA</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.Severity_FAA
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getSeverity_FAA()
		 * @generated
		 */
		EEnum SEVERITY_FAA = eINSTANCE.getSeverity_FAA();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.Likelihood_FAA <em>Likelihood FAA</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.Likelihood_FAA
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getLikelihood_FAA()
		 * @generated
		 */
		EEnum LIKELIHOOD_FAA = eINSTANCE.getLikelihood_FAA();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.Severity_MIL_STD_882D <em>Severity MIL STD 882D</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.Severity_MIL_STD_882D
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getSeverity_MIL_STD_882D()
		 * @generated
		 */
		EEnum SEVERITY_MIL_STD_882D = eINSTANCE.getSeverity_MIL_STD_882D();

		/**
		 * The meta object literal for the '{@link net.certware.hazard.hazard.Likelihood_MIL_STD_882D <em>Likelihood MIL STD 882D</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.hazard.hazard.Likelihood_MIL_STD_882D
		 * @see net.certware.hazard.hazard.impl.HazardPackageImpl#getLikelihood_MIL_STD_882D()
		 * @generated
		 */
		EEnum LIKELIHOOD_MIL_STD_882D = eINSTANCE.getLikelihood_MIL_STD_882D();

	}

} //HazardPackage
