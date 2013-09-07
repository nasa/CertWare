/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.impl;

import net.certware.hazard.hazard.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardFactoryImpl extends EFactoryImpl implements HazardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HazardFactory init() {
		try {
			HazardFactory theHazardFactory = (HazardFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/hazard"); //$NON-NLS-1$ 
			if (theHazardFactory != null) {
				return theHazardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HazardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM: return createComparativeRiskAssessmentForm();
			case HazardPackage.HAZARD_LIST: return createHazardList();
			case HazardPackage.HAZARD: return createHazard();
			case HazardPackage.REFERENCE: return createReference();
			case HazardPackage.RISK_ASSESSMENT: return createRiskAssessment();
			case HazardPackage.RISK_ASSESSMENT_CODE: return createRiskAssessmentCode();
			case HazardPackage.HAZARD_CLASSIFICATION_RATIONALE: return createHazardClassificationRationale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HazardPackage.SEVERITY_FAA:
				return createSeverity_FAAFromString(eDataType, initialValue);
			case HazardPackage.LIKELIHOOD_FAA:
				return createLikelihood_FAAFromString(eDataType, initialValue);
			case HazardPackage.SEVERITY_MIL_STD_882D:
				return createSeverity_MIL_STD_882DFromString(eDataType, initialValue);
			case HazardPackage.LIKELIHOOD_MIL_STD_882D:
				return createLikelihood_MIL_STD_882DFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HazardPackage.SEVERITY_FAA:
				return convertSeverity_FAAToString(eDataType, instanceValue);
			case HazardPackage.LIKELIHOOD_FAA:
				return convertLikelihood_FAAToString(eDataType, instanceValue);
			case HazardPackage.SEVERITY_MIL_STD_882D:
				return convertSeverity_MIL_STD_882DToString(eDataType, instanceValue);
			case HazardPackage.LIKELIHOOD_MIL_STD_882D:
				return convertLikelihood_MIL_STD_882DToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparativeRiskAssessmentForm createComparativeRiskAssessmentForm() {
		ComparativeRiskAssessmentFormImpl comparativeRiskAssessmentForm = new ComparativeRiskAssessmentFormImpl();
		return comparativeRiskAssessmentForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardList createHazardList() {
		HazardListImpl hazardList = new HazardListImpl();
		return hazardList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard createHazard() {
		HazardImpl hazard = new HazardImpl();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment createRiskAssessment() {
		RiskAssessmentImpl riskAssessment = new RiskAssessmentImpl();
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessmentCode createRiskAssessmentCode() {
		RiskAssessmentCodeImpl riskAssessmentCode = new RiskAssessmentCodeImpl();
		return riskAssessmentCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardClassificationRationale createHazardClassificationRationale() {
		HazardClassificationRationaleImpl hazardClassificationRationale = new HazardClassificationRationaleImpl();
		return hazardClassificationRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity_FAA createSeverity_FAA(String literal) {
		Severity_FAA result = Severity_FAA.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + HazardPackage.Literals.SEVERITY_FAA.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity_FAA createSeverity_FAAFromString(EDataType eDataType, String initialValue) {
		return createSeverity_FAA(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverity_FAA(Severity_FAA instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverity_FAAToString(EDataType eDataType, Object instanceValue) {
		return convertSeverity_FAA((Severity_FAA)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_FAA createLikelihood_FAA(String literal) {
		Likelihood_FAA result = Likelihood_FAA.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + HazardPackage.Literals.LIKELIHOOD_FAA.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_FAA createLikelihood_FAAFromString(EDataType eDataType, String initialValue) {
		return createLikelihood_FAA(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikelihood_FAA(Likelihood_FAA instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikelihood_FAAToString(EDataType eDataType, Object instanceValue) {
		return convertLikelihood_FAA((Likelihood_FAA)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity_MIL_STD_882D createSeverity_MIL_STD_882D(String literal) {
		Severity_MIL_STD_882D result = Severity_MIL_STD_882D.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + HazardPackage.Literals.SEVERITY_MIL_STD_882D.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity_MIL_STD_882D createSeverity_MIL_STD_882DFromString(EDataType eDataType, String initialValue) {
		return createSeverity_MIL_STD_882D(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverity_MIL_STD_882D(Severity_MIL_STD_882D instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverity_MIL_STD_882DToString(EDataType eDataType, Object instanceValue) {
		return convertSeverity_MIL_STD_882D((Severity_MIL_STD_882D)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_MIL_STD_882D createLikelihood_MIL_STD_882D(String literal) {
		Likelihood_MIL_STD_882D result = Likelihood_MIL_STD_882D.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + HazardPackage.Literals.LIKELIHOOD_MIL_STD_882D.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Likelihood_MIL_STD_882D createLikelihood_MIL_STD_882DFromString(EDataType eDataType, String initialValue) {
		return createLikelihood_MIL_STD_882D(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikelihood_MIL_STD_882D(Likelihood_MIL_STD_882D instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLikelihood_MIL_STD_882DToString(EDataType eDataType, Object instanceValue) {
		return convertLikelihood_MIL_STD_882D((Likelihood_MIL_STD_882D)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardPackage getHazardPackage() {
		return (HazardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HazardPackage getPackage() {
		return HazardPackage.eINSTANCE;
	}

} //HazardFactoryImpl
