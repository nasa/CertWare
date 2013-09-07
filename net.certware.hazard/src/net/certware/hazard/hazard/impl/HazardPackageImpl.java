/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.impl;

import net.certware.hazard.hazard.ComparativeRiskAssessmentForm;
import net.certware.hazard.hazard.Hazard;
import net.certware.hazard.hazard.HazardClassificationRationale;
import net.certware.hazard.hazard.HazardFactory;
import net.certware.hazard.hazard.HazardList;
import net.certware.hazard.hazard.HazardPackage;
import net.certware.hazard.hazard.Likelihood_FAA;
import net.certware.hazard.hazard.Likelihood_MIL_STD_882D;
import net.certware.hazard.hazard.Reference;
import net.certware.hazard.hazard.RiskAssessment;
import net.certware.hazard.hazard.RiskAssessmentCode;
import net.certware.hazard.hazard.Severity_FAA;
import net.certware.hazard.hazard.Severity_MIL_STD_882D;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardPackageImpl extends EPackageImpl implements HazardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparativeRiskAssessmentFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardClassificationRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severity_FAAEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum likelihood_FAAEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severity_MIL_STD_882DEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum likelihood_MIL_STD_882DEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.certware.hazard.hazard.HazardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HazardPackageImpl() {
		super(eNS_URI, HazardFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HazardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HazardPackage init() {
		if (isInited) return (HazardPackage)EPackage.Registry.INSTANCE.getEPackage(HazardPackage.eNS_URI);

		// Obtain or create and register package
		HazardPackageImpl theHazardPackage = (HazardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HazardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HazardPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHazardPackage.createPackageContents();

		// Initialize created meta-data
		theHazardPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHazardPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HazardPackage.eNS_URI, theHazardPackage);
		return theHazardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparativeRiskAssessmentForm() {
		return comparativeRiskAssessmentFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_SecTrackingNumber() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_CraTitle() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_System() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparativeRiskAssessmentForm_References() {
		return (EReference)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_Summary() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_Baseline() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_ProposedChange() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_Description() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparativeRiskAssessmentForm_RiskAssessment() {
		return (EReference)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparativeRiskAssessmentForm_HazardList() {
		return (EReference)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparativeRiskAssessmentForm_AssessmentSummary() {
		return (EAttribute)comparativeRiskAssessmentFormEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardList() {
		return hazardListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardList_Hazards() {
		return (EReference)hazardListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazard() {
		return hazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazard_Number() {
		return (EAttribute)hazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazard_HazardCondition() {
		return (EAttribute)hazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_RiskAssessmentCode() {
		return (EReference)hazardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_HazardClassificationRationale() {
		return (EReference)hazardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Name() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessment() {
		return riskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessment_Severity() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessment_Probability() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessment_Assessment() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessment_SeverityRationale() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessment_ProbabilityRationale() {
		return (EAttribute)riskAssessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessmentCode() {
		return riskAssessmentCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessmentCode_Baseline() {
		return (EAttribute)riskAssessmentCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessmentCode_OptionB() {
		return (EAttribute)riskAssessmentCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessmentCode_OptionC() {
		return (EAttribute)riskAssessmentCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessmentCode_OptionD() {
		return (EAttribute)riskAssessmentCodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskAssessmentCode_OptionE() {
		return (EAttribute)riskAssessmentCodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardClassificationRationale() {
		return hazardClassificationRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardClassificationRationale_HazardId() {
		return (EAttribute)hazardClassificationRationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardClassificationRationale_Summary() {
		return (EAttribute)hazardClassificationRationaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardClassificationRationale_Option() {
		return (EAttribute)hazardClassificationRationaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardClassificationRationale_RiskAssessment() {
		return (EReference)hazardClassificationRationaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity_FAA() {
		return severity_FAAEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLikelihood_FAA() {
		return likelihood_FAAEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity_MIL_STD_882D() {
		return severity_MIL_STD_882DEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLikelihood_MIL_STD_882D() {
		return likelihood_MIL_STD_882DEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardFactory getHazardFactory() {
		return (HazardFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		comparativeRiskAssessmentFormEClass = createEClass(COMPARATIVE_RISK_ASSESSMENT_FORM);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM);
		createEReference(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION);
		createEReference(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT);
		createEReference(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST);
		createEAttribute(comparativeRiskAssessmentFormEClass, COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY);

		hazardListEClass = createEClass(HAZARD_LIST);
		createEReference(hazardListEClass, HAZARD_LIST__HAZARDS);

		hazardEClass = createEClass(HAZARD);
		createEAttribute(hazardEClass, HAZARD__NUMBER);
		createEAttribute(hazardEClass, HAZARD__HAZARD_CONDITION);
		createEReference(hazardEClass, HAZARD__RISK_ASSESSMENT_CODE);
		createEReference(hazardEClass, HAZARD__HAZARD_CLASSIFICATION_RATIONALE);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NAME);

		riskAssessmentEClass = createEClass(RISK_ASSESSMENT);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__SEVERITY);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__PROBABILITY);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__ASSESSMENT);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__SEVERITY_RATIONALE);
		createEAttribute(riskAssessmentEClass, RISK_ASSESSMENT__PROBABILITY_RATIONALE);

		riskAssessmentCodeEClass = createEClass(RISK_ASSESSMENT_CODE);
		createEAttribute(riskAssessmentCodeEClass, RISK_ASSESSMENT_CODE__BASELINE);
		createEAttribute(riskAssessmentCodeEClass, RISK_ASSESSMENT_CODE__OPTION_B);
		createEAttribute(riskAssessmentCodeEClass, RISK_ASSESSMENT_CODE__OPTION_C);
		createEAttribute(riskAssessmentCodeEClass, RISK_ASSESSMENT_CODE__OPTION_D);
		createEAttribute(riskAssessmentCodeEClass, RISK_ASSESSMENT_CODE__OPTION_E);

		hazardClassificationRationaleEClass = createEClass(HAZARD_CLASSIFICATION_RATIONALE);
		createEAttribute(hazardClassificationRationaleEClass, HAZARD_CLASSIFICATION_RATIONALE__HAZARD_ID);
		createEAttribute(hazardClassificationRationaleEClass, HAZARD_CLASSIFICATION_RATIONALE__SUMMARY);
		createEAttribute(hazardClassificationRationaleEClass, HAZARD_CLASSIFICATION_RATIONALE__OPTION);
		createEReference(hazardClassificationRationaleEClass, HAZARD_CLASSIFICATION_RATIONALE__RISK_ASSESSMENT);

		// Create enums
		severity_FAAEEnum = createEEnum(SEVERITY_FAA);
		likelihood_FAAEEnum = createEEnum(LIKELIHOOD_FAA);
		severity_MIL_STD_882DEEnum = createEEnum(SEVERITY_MIL_STD_882D);
		likelihood_MIL_STD_882DEEnum = createEEnum(LIKELIHOOD_MIL_STD_882D);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(comparativeRiskAssessmentFormEClass, ComparativeRiskAssessmentForm.class, "ComparativeRiskAssessmentForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_SecTrackingNumber(), ecorePackage.getEString(), "secTrackingNumber", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_CraTitle(), ecorePackage.getEString(), "craTitle", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_System(), ecorePackage.getEString(), "system", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComparativeRiskAssessmentForm_References(), this.getReference(), null, "references", null, 0, -1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_Baseline(), ecorePackage.getEString(), "baseline", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_ProposedChange(), ecorePackage.getEString(), "proposedChange", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_Description(), ecorePackage.getEString(), "description", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComparativeRiskAssessmentForm_RiskAssessment(), this.getRiskAssessment(), null, "riskAssessment", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getComparativeRiskAssessmentForm_HazardList(), this.getHazardList(), null, "hazardList", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getComparativeRiskAssessmentForm_AssessmentSummary(), ecorePackage.getEString(), "assessmentSummary", null, 0, 1, ComparativeRiskAssessmentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hazardListEClass, HazardList.class, "HazardList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHazardList_Hazards(), this.getHazard(), null, "hazards", null, 0, -1, HazardList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hazardEClass, Hazard.class, "Hazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHazard_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getHazard_HazardCondition(), ecorePackage.getEString(), "hazardCondition", null, 0, 1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getHazard_RiskAssessmentCode(), this.getRiskAssessmentCode(), null, "riskAssessmentCode", null, 0, 1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getHazard_HazardClassificationRationale(), this.getHazardClassificationRationale(), null, "hazardClassificationRationale", null, 0, 1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(riskAssessmentEClass, RiskAssessment.class, "RiskAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRiskAssessment_Severity(), this.getSeverity_FAA(), "severity", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessment_Probability(), this.getLikelihood_FAA(), "probability", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessment_Assessment(), ecorePackage.getEString(), "assessment", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessment_SeverityRationale(), ecorePackage.getEString(), "severityRationale", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessment_ProbabilityRationale(), ecorePackage.getEString(), "probabilityRationale", null, 0, 1, RiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(riskAssessmentCodeEClass, RiskAssessmentCode.class, "RiskAssessmentCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRiskAssessmentCode_Baseline(), ecorePackage.getEString(), "baseline", null, 0, 1, RiskAssessmentCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessmentCode_OptionB(), ecorePackage.getEString(), "optionB", null, 0, 1, RiskAssessmentCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessmentCode_OptionC(), ecorePackage.getEString(), "optionC", null, 0, 1, RiskAssessmentCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessmentCode_OptionD(), ecorePackage.getEString(), "optionD", null, 0, 1, RiskAssessmentCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRiskAssessmentCode_OptionE(), ecorePackage.getEString(), "optionE", null, 0, 1, RiskAssessmentCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(hazardClassificationRationaleEClass, HazardClassificationRationale.class, "HazardClassificationRationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getHazardClassificationRationale_HazardId(), ecorePackage.getEString(), "hazardId", null, 0, 1, HazardClassificationRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getHazardClassificationRationale_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, HazardClassificationRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getHazardClassificationRationale_Option(), ecorePackage.getEString(), "option", null, 0, 1, HazardClassificationRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getHazardClassificationRationale_RiskAssessment(), this.getRiskAssessment(), null, "riskAssessment", null, 0, 1, HazardClassificationRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(severity_FAAEEnum, Severity_FAA.class, "Severity_FAA"); //$NON-NLS-1$
		addEEnumLiteral(severity_FAAEEnum, Severity_FAA.NO_SAFETY_EFFECT);
		addEEnumLiteral(severity_FAAEEnum, Severity_FAA.MINOR);
		addEEnumLiteral(severity_FAAEEnum, Severity_FAA.MAJOR);
		addEEnumLiteral(severity_FAAEEnum, Severity_FAA.HAZARDOUS);
		addEEnumLiteral(severity_FAAEEnum, Severity_FAA.CATASTROPHIC);

		initEEnum(likelihood_FAAEEnum, Likelihood_FAA.class, "Likelihood_FAA"); //$NON-NLS-1$
		addEEnumLiteral(likelihood_FAAEEnum, Likelihood_FAA.EXTREMELY_IMPROBABLE_D);
		addEEnumLiteral(likelihood_FAAEEnum, Likelihood_FAA.EXTREMELY_REMOTE_C);
		addEEnumLiteral(likelihood_FAAEEnum, Likelihood_FAA.REMOTE_B);
		addEEnumLiteral(likelihood_FAAEEnum, Likelihood_FAA.PROBABLE_A);

		initEEnum(severity_MIL_STD_882DEEnum, Severity_MIL_STD_882D.class, "Severity_MIL_STD_882D"); //$NON-NLS-1$
		addEEnumLiteral(severity_MIL_STD_882DEEnum, Severity_MIL_STD_882D.NEGLIGIBLE_IV);
		addEEnumLiteral(severity_MIL_STD_882DEEnum, Severity_MIL_STD_882D.MARGINAL_III);
		addEEnumLiteral(severity_MIL_STD_882DEEnum, Severity_MIL_STD_882D.CRITICAL_II);
		addEEnumLiteral(severity_MIL_STD_882DEEnum, Severity_MIL_STD_882D.CATASTROPHIC_I);

		initEEnum(likelihood_MIL_STD_882DEEnum, Likelihood_MIL_STD_882D.class, "Likelihood_MIL_STD_882D"); //$NON-NLS-1$
		addEEnumLiteral(likelihood_MIL_STD_882DEEnum, Likelihood_MIL_STD_882D.IMPROBABLE_E);
		addEEnumLiteral(likelihood_MIL_STD_882DEEnum, Likelihood_MIL_STD_882D.REMOTE_D);
		addEEnumLiteral(likelihood_MIL_STD_882DEEnum, Likelihood_MIL_STD_882D.OCCASIONAL_C);
		addEEnumLiteral(likelihood_MIL_STD_882DEEnum, Likelihood_MIL_STD_882D.PROBABLE_B);
		addEEnumLiteral(likelihood_MIL_STD_882DEEnum, Likelihood_MIL_STD_882D.FREQUENT_A);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// MIL_STD_882D
		createMIL_STD_882DAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;		
		addAnnotation
		  (severity_FAAEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "definition", "Has no effect on safety." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_FAA/NO_SAFETY_EFFECT") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_FAAEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "definition", "Does not significantly reduce system safety. Actions required by operators are well within their capabilities. Include:\n- Slight reduction in safety margin or functional capabilities\n- Slight increase in workload such as routine flight plan changes\n- Some physical discomfort to occupants or aircraft (except operators)\n- Minor occupational illness and/or minor environmental damage, and/or minor property damage" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_FAA/MINOR") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_FAAEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "definition", "Reduces the capability of the system or the operators to cope with adverse operating conditions to the extent that there would be:\n- Significant reduction in safety margin or functional capability\n- Significant increase in operator workload\n- Conditions impairing operator efficiency or creating significant discomfort\n- Physical distress to occupants of aircraft (except operator) including injuries\n- Major occupational illness and/or major environmental damage, and/or major property damage" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_FAA/MAJOR") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_FAAEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "definition", "Reduces the capability of the system or the operator ability to cope with adverse conditions to the extent that there would be:\n- Large reduction in safety margin or functional capability\n- Crew physical distress/excessive workload such that operators cannot be relied upon to perform required tasks accurately or completely\n- Serious or fatal injury to small number of occupants of aircraft (except operators)\n- Fatal injury to ground personnel and/or general public" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_FAA/HAZARDOUS") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_FAAEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "definition", "Results in multiple fatalities and/or loss of the system" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_FAA/CATASTROPHIC") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_FAAEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "definition", "Probability of occurrence per operational hour less than 1E10-9" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_FAA/EXTREMELY_IMPROBABLE_D") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_FAAEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "definition", "Probability of occurrence per operational hour less than 1E10-7 but greater than 1E10-9" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_FAA/EXTREMELY_REMOTE_C") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_FAAEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "definition", "Probability of occurrence per operational hour less than 1E10-5 but greater than 1E10-7" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_FAA/REMOTE_B") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_FAAEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "definition", "Probability of occurrence per operational hour greater than 1E10-5" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_FAA/PROBABLE_A") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_MIL_STD_882DEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "definition", "Could result in injury or illness not resulting in a lost work day, loss exceeding $2K but less than $10K, or minimal environmental damage not violating law or regulation." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_MIL_STD_882D/NEGLIGIBLE_IV") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_MIL_STD_882DEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "definition", "Could result in injury or occupational illness resulting in one or more lost work days(s), loss exceeding $10K but less than $200K, or mitigatible environmental damage without violation of law or regulation where restoration activities can be accomplished." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_MIL_STD_882D/MARGINAL_III") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_MIL_STD_882DEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "definition", "Could result in permanent partial disability, injuries or occupational illness that may result in hospitalization of at least three personnel, loss exceeding $200K but less than $1M, or reversible environmental damage causing a violation of law or regulation." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_MIL_STD_882D/CRITICAL_II") //$NON-NLS-1$
		   });		
		addAnnotation
		  (severity_MIL_STD_882DEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "definition", "Could result in death, permanent total disability, loss exceeding $1M, or irreversible severe environmental damage that violates law or regulation." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Severity_MIL_STD_882D/CATASTROPHIC_I") //$NON-NLS-1$
		   });					
	}

	/**
	 * Initializes the annotations for <b>MIL_STD_882D</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMIL_STD_882DAnnotations() {
		String source = "MIL_STD_882D"; //$NON-NLS-1$															
		addAnnotation
		  (likelihood_MIL_STD_882DEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "individual", "So unlikely, it can be assumed occurrence may not be experienced, with a probability of occurrence less than 10E-6 in that life.", //$NON-NLS-1$ //$NON-NLS-2$
			 "inventory", "Unlikely to occur, but possible" //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_MIL_STD_882D/IMPROBABLE_E") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_MIL_STD_882DEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "individual", "Unlikely but possible to occur in the life of an item, with a probability of occurrence less\r10E-3 but greater than 10E-6 in that life.", //$NON-NLS-1$ //$NON-NLS-2$
			 "inventory", "Unlikely, but can reasonably be expected to occur." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_MIL_STD_882D/REMOTE_D") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_MIL_STD_882DEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "individual", "Likely to occur some time in the life of an item, with a probability of occurrence less\rthan 10E-2 but greater than 10E-3 in that life.", //$NON-NLS-1$ //$NON-NLS-2$
			 "inventory", "Will occur several times." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_MIL_STD_882D/OCCASIONAL_C") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_MIL_STD_882DEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "individual", "Will occur several times in the life of an item, with a probability of occurrence less than 10E-1 but greater than 10E-2 in that life.", //$NON-NLS-1$ //$NON-NLS-2$
			 "inventory", "Will occur frequently." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_MIL_STD_882D/PROBABLE_B") //$NON-NLS-1$
		   });		
		addAnnotation
		  (likelihood_MIL_STD_882DEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "individual", "Likely to occur often in the life of an item, with a probability of occurrence greater than 10E-1 in that life.", //$NON-NLS-1$ //$NON-NLS-2$
			 "inventory", "Continuously experienced." //$NON-NLS-1$ //$NON-NLS-2$
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Likelihood_MIL_STD_882D/FREQUENT_A") //$NON-NLS-1$
		   });
	}

} //HazardPackageImpl
