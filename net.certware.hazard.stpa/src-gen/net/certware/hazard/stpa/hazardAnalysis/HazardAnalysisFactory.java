/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage
 * @generated
 */
public interface HazardAnalysisFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HazardAnalysisFactory eINSTANCE = net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Accident</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accident</em>'.
   * @generated
   */
  Accident createAccident();

  /**
   * Returns a new object of class '<em>Incident</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Incident</em>'.
   * @generated
   */
  Incident createIncident();

  /**
   * Returns a new object of class '<em>Hazard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard</em>'.
   * @generated
   */
  Hazard createHazard();

  /**
   * Returns a new object of class '<em>Risk Level</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Risk Level</em>'.
   * @generated
   */
  RiskLevel createRiskLevel();

  /**
   * Returns a new object of class '<em>Hazard Level</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard Level</em>'.
   * @generated
   */
  HazardLevel createHazardLevel();

  /**
   * Returns a new object of class '<em>Hazard Exposure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard Exposure</em>'.
   * @generated
   */
  HazardExposure createHazardExposure();

  /**
   * Returns a new object of class '<em>Hazard Accident Likelihood</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard Accident Likelihood</em>'.
   * @generated
   */
  HazardAccidentLikelihood createHazardAccidentLikelihood();

  /**
   * Returns a new object of class '<em>Hazard Severity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard Severity</em>'.
   * @generated
   */
  HazardSeverity createHazardSeverity();

  /**
   * Returns a new object of class '<em>Hazard Likelihood</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hazard Likelihood</em>'.
   * @generated
   */
  HazardLikelihood createHazardLikelihood();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement</em>'.
   * @generated
   */
  Requirement createRequirement();

  /**
   * Returns a new object of class '<em>Design</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Design</em>'.
   * @generated
   */
  Design createDesign();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control</em>'.
   * @generated
   */
  Control createControl();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HazardAnalysisPackage getHazardAnalysisPackage();

} //HazardAnalysisFactory
