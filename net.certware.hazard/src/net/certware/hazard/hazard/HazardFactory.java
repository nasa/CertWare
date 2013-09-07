/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.hazard.HazardPackage
 * @generated
 */
public interface HazardFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazardFactory eINSTANCE = net.certware.hazard.hazard.impl.HazardFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Comparative Risk Assessment Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparative Risk Assessment Form</em>'.
	 * @generated
	 */
	ComparativeRiskAssessmentForm createComparativeRiskAssessmentForm();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	HazardList createHazardList();

	/**
	 * Returns a new object of class '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard</em>'.
	 * @generated
	 */
	Hazard createHazard();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment</em>'.
	 * @generated
	 */
	RiskAssessment createRiskAssessment();

	/**
	 * Returns a new object of class '<em>Risk Assessment Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment Code</em>'.
	 * @generated
	 */
	RiskAssessmentCode createRiskAssessmentCode();

	/**
	 * Returns a new object of class '<em>Classification Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification Rationale</em>'.
	 * @generated
	 */
	HazardClassificationRationale createHazardClassificationRationale();

	/**
	 * Returns an instance of data type '<em>Severity FAA</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Severity_FAA createSeverity_FAA(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Severity FAA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertSeverity_FAA(Severity_FAA instanceValue);

	/**
	 * Returns an instance of data type '<em>Likelihood FAA</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Likelihood_FAA createLikelihood_FAA(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Likelihood FAA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertLikelihood_FAA(Likelihood_FAA instanceValue);

	/**
	 * Returns an instance of data type '<em>Severity MIL STD 882D</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Severity_MIL_STD_882D createSeverity_MIL_STD_882D(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Severity MIL STD 882D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertSeverity_MIL_STD_882D(Severity_MIL_STD_882D instanceValue);

	/**
	 * Returns an instance of data type '<em>Likelihood MIL STD 882D</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Likelihood_MIL_STD_882D createLikelihood_MIL_STD_882D(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Likelihood MIL STD 882D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertLikelihood_MIL_STD_882D(Likelihood_MIL_STD_882D instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HazardPackage getHazardPackage();

} //HazardFactory
