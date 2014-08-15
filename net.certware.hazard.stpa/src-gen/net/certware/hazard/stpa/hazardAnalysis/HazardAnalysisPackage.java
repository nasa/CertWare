/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface HazardAnalysisPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hazardAnalysis";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/hazard/stpa/HazardAnalysis";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hazardAnalysis";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HazardAnalysisPackage eINSTANCE = net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.ModelImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Accidents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACCIDENTS = 0;

  /**
   * The feature id for the '<em><b>Indicents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INDICENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.AccidentImpl <em>Accident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.AccidentImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getAccident()
   * @generated
   */
  int ACCIDENT = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIDENT__DESC = 0;

  /**
   * The feature id for the '<em><b>Ranking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIDENT__RANKING = 1;

  /**
   * The feature id for the '<em><b>Hazards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIDENT__HAZARDS = 2;

  /**
   * The feature id for the '<em><b>Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIDENT__NOTES = 3;

  /**
   * The number of structural features of the '<em>Accident</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIDENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl <em>Incident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getIncident()
   * @generated
   */
  int INCIDENT = 2;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCIDENT__DESC = 0;

  /**
   * The feature id for the '<em><b>Ranking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCIDENT__RANKING = 1;

  /**
   * The feature id for the '<em><b>Hazards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCIDENT__HAZARDS = 2;

  /**
   * The feature id for the '<em><b>Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCIDENT__NOTES = 3;

  /**
   * The number of structural features of the '<em>Incident</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCIDENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl <em>Hazard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazard()
   * @generated
   */
  int HAZARD = 3;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__DESC = 0;

  /**
   * The feature id for the '<em><b>Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__LEVEL = 1;

  /**
   * The feature id for the '<em><b>Risk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__RISK = 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__CONSTRAINTS = 3;

  /**
   * The number of structural features of the '<em>Hazard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.RiskLevelImpl <em>Risk Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.RiskLevelImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getRiskLevel()
   * @generated
   */
  int RISK_LEVEL = 4;

  /**
   * The feature id for the '<em><b>Exposure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RISK_LEVEL__EXPOSURE = 0;

  /**
   * The feature id for the '<em><b>Likelihood</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RISK_LEVEL__LIKELIHOOD = 1;

  /**
   * The number of structural features of the '<em>Risk Level</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RISK_LEVEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardLevelImpl <em>Hazard Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardLevelImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardLevel()
   * @generated
   */
  int HAZARD_LEVEL = 5;

  /**
   * The feature id for the '<em><b>Severity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_LEVEL__SEVERITY = 0;

  /**
   * The feature id for the '<em><b>Likelihood</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_LEVEL__LIKELIHOOD = 1;

  /**
   * The number of structural features of the '<em>Hazard Level</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_LEVEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardExposureImpl <em>Hazard Exposure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardExposureImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardExposure()
   * @generated
   */
  int HAZARD_EXPOSURE = 6;

  /**
   * The feature id for the '<em><b>Exposure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_EXPOSURE__EXPOSURE = 0;

  /**
   * The number of structural features of the '<em>Hazard Exposure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_EXPOSURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardAccidentLikelihoodImpl <em>Hazard Accident Likelihood</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAccidentLikelihoodImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardAccidentLikelihood()
   * @generated
   */
  int HAZARD_ACCIDENT_LIKELIHOOD = 7;

  /**
   * The feature id for the '<em><b>Likelihood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD = 0;

  /**
   * The number of structural features of the '<em>Hazard Accident Likelihood</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_ACCIDENT_LIKELIHOOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardSeverityImpl <em>Hazard Severity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardSeverityImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardSeverity()
   * @generated
   */
  int HAZARD_SEVERITY = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_SEVERITY__VALUE = 0;

  /**
   * The number of structural features of the '<em>Hazard Severity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_SEVERITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardLikelihoodImpl <em>Hazard Likelihood</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardLikelihoodImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardLikelihood()
   * @generated
   */
  int HAZARD_LIKELIHOOD = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_LIKELIHOOD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Hazard Likelihood</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_LIKELIHOOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 10;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__CONSTRAINT = 0;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__REQUIREMENTS = 1;

  /**
   * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__SCENARIOS = 2;

  /**
   * The feature id for the '<em><b>Controls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__CONTROLS = 3;

  /**
   * The feature id for the '<em><b>Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__NOTES = 4;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.RequirementImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 11;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REQUIREMENT = 0;

  /**
   * The feature id for the '<em><b>Designs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESIGNS = 1;

  /**
   * The feature id for the '<em><b>Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NOTES = 2;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.DesignImpl <em>Design</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.DesignImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getDesign()
   * @generated
   */
  int DESIGN = 12;

  /**
   * The feature id for the '<em><b>Allocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__ALLOCATION = 0;

  /**
   * The feature id for the '<em><b>Analysis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__ANALYSIS = 1;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN__RATIONALE = 2;

  /**
   * The number of structural features of the '<em>Design</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.ScenarioImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 13;

  /**
   * The feature id for the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__SCENARIO = 0;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ControlImpl <em>Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.ControlImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getControl()
   * @generated
   */
  int CONTROL = 14;

  /**
   * The feature id for the '<em><b>Control</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL__CONTROL = 0;

  /**
   * The number of structural features of the '<em>Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.NoteImpl
   * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getNote()
   * @generated
   */
  int NOTE = 15;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__NOTE = 0;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Model#getAccidents <em>Accidents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accidents</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Model#getAccidents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Accidents();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Model#getIndicents <em>Indicents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indicents</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Model#getIndicents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Indicents();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Accident <em>Accident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accident</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Accident
   * @generated
   */
  EClass getAccident();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Accident#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Accident#getDesc()
   * @see #getAccident()
   * @generated
   */
  EAttribute getAccident_Desc();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Accident#getRanking <em>Ranking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ranking</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Accident#getRanking()
   * @see #getAccident()
   * @generated
   */
  EAttribute getAccident_Ranking();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Accident#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hazards</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Accident#getHazards()
   * @see #getAccident()
   * @generated
   */
  EReference getAccident_Hazards();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Accident#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Accident#getNotes()
   * @see #getAccident()
   * @generated
   */
  EReference getAccident_Notes();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Incident <em>Incident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Incident</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Incident
   * @generated
   */
  EClass getIncident();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Incident#getDesc()
   * @see #getIncident()
   * @generated
   */
  EAttribute getIncident_Desc();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getRanking <em>Ranking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ranking</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Incident#getRanking()
   * @see #getIncident()
   * @generated
   */
  EAttribute getIncident_Ranking();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getHazards <em>Hazards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hazards</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Incident#getHazards()
   * @see #getIncident()
   * @generated
   */
  EReference getIncident_Hazards();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Incident#getNotes()
   * @see #getIncident()
   * @generated
   */
  EReference getIncident_Notes();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard <em>Hazard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Hazard
   * @generated
   */
  EClass getHazard();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Hazard#getDesc()
   * @see #getHazard()
   * @generated
   */
  EAttribute getHazard_Desc();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Level</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Hazard#getLevel()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_Level();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getRisk <em>Risk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Risk</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Hazard#getRisk()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_Risk();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Hazard#getConstraints()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_Constraints();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel <em>Risk Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Risk Level</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.RiskLevel
   * @generated
   */
  EClass getRiskLevel();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getExposure <em>Exposure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exposure</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getExposure()
   * @see #getRiskLevel()
   * @generated
   */
  EReference getRiskLevel_Exposure();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getLikelihood <em>Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Likelihood</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getLikelihood()
   * @see #getRiskLevel()
   * @generated
   */
  EReference getRiskLevel_Likelihood();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel <em>Hazard Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Level</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardLevel
   * @generated
   */
  EClass getHazardLevel();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getSeverity <em>Severity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Severity</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getSeverity()
   * @see #getHazardLevel()
   * @generated
   */
  EReference getHazardLevel_Severity();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getLikelihood <em>Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Likelihood</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getLikelihood()
   * @see #getHazardLevel()
   * @generated
   */
  EReference getHazardLevel_Likelihood();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardExposure <em>Hazard Exposure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Exposure</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardExposure
   * @generated
   */
  EClass getHazardExposure();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.HazardExposure#getExposure <em>Exposure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exposure</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardExposure#getExposure()
   * @see #getHazardExposure()
   * @generated
   */
  EAttribute getHazardExposure_Exposure();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood <em>Hazard Accident Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Accident Likelihood</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood
   * @generated
   */
  EClass getHazardAccidentLikelihood();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood#getLikelihood <em>Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Likelihood</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood#getLikelihood()
   * @see #getHazardAccidentLikelihood()
   * @generated
   */
  EAttribute getHazardAccidentLikelihood_Likelihood();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardSeverity <em>Hazard Severity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Severity</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardSeverity
   * @generated
   */
  EClass getHazardSeverity();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.HazardSeverity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardSeverity#getValue()
   * @see #getHazardSeverity()
   * @generated
   */
  EAttribute getHazardSeverity_Value();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood <em>Hazard Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Likelihood</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood
   * @generated
   */
  EClass getHazardLikelihood();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood#getValue()
   * @see #getHazardLikelihood()
   * @generated
   */
  EAttribute getHazardLikelihood_Value();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Constraint#getConstraint()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Constraint();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Constraint#getRequirements()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Requirements();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getScenarios <em>Scenarios</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scenarios</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Constraint#getScenarios()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Scenarios();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controls</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Constraint#getControls()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Controls();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Constraint#getNotes()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Notes();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Requirement#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requirement</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Requirement#getRequirement()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Requirement();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Requirement#getDesigns <em>Designs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Designs</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Requirement#getDesigns()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Designs();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.hazard.stpa.hazardAnalysis.Requirement#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Requirement#getNotes()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Notes();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Design <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Design</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Design
   * @generated
   */
  EClass getDesign();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Design#getAllocation <em>Allocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allocation</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Design#getAllocation()
   * @see #getDesign()
   * @generated
   */
  EAttribute getDesign_Allocation();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Design#getAnalysis <em>Analysis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Analysis</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Design#getAnalysis()
   * @see #getDesign()
   * @generated
   */
  EAttribute getDesign_Analysis();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Design#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Design#getRationale()
   * @see #getDesign()
   * @generated
   */
  EAttribute getDesign_Rationale();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Scenario#getScenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scenario</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Scenario#getScenario()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Scenario();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Control <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Control
   * @generated
   */
  EClass getControl();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Control#getControl <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Control</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Control#getControl()
   * @see #getControl()
   * @generated
   */
  EAttribute getControl_Control();

  /**
   * Returns the meta object for class '{@link net.certware.hazard.stpa.hazardAnalysis.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the attribute '{@link net.certware.hazard.stpa.hazardAnalysis.Note#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see net.certware.hazard.stpa.hazardAnalysis.Note#getNote()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Note();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HazardAnalysisFactory getHazardAnalysisFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.ModelImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Accidents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ACCIDENTS = eINSTANCE.getModel_Accidents();

    /**
     * The meta object literal for the '<em><b>Indicents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INDICENTS = eINSTANCE.getModel_Indicents();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.AccidentImpl <em>Accident</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.AccidentImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getAccident()
     * @generated
     */
    EClass ACCIDENT = eINSTANCE.getAccident();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCIDENT__DESC = eINSTANCE.getAccident_Desc();

    /**
     * The meta object literal for the '<em><b>Ranking</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCIDENT__RANKING = eINSTANCE.getAccident_Ranking();

    /**
     * The meta object literal for the '<em><b>Hazards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCIDENT__HAZARDS = eINSTANCE.getAccident_Hazards();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCIDENT__NOTES = eINSTANCE.getAccident_Notes();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl <em>Incident</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getIncident()
     * @generated
     */
    EClass INCIDENT = eINSTANCE.getIncident();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCIDENT__DESC = eINSTANCE.getIncident_Desc();

    /**
     * The meta object literal for the '<em><b>Ranking</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCIDENT__RANKING = eINSTANCE.getIncident_Ranking();

    /**
     * The meta object literal for the '<em><b>Hazards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCIDENT__HAZARDS = eINSTANCE.getIncident_Hazards();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCIDENT__NOTES = eINSTANCE.getIncident_Notes();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl <em>Hazard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazard()
     * @generated
     */
    EClass HAZARD = eINSTANCE.getHazard();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD__DESC = eINSTANCE.getHazard_Desc();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__LEVEL = eINSTANCE.getHazard_Level();

    /**
     * The meta object literal for the '<em><b>Risk</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__RISK = eINSTANCE.getHazard_Risk();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__CONSTRAINTS = eINSTANCE.getHazard_Constraints();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.RiskLevelImpl <em>Risk Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.RiskLevelImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getRiskLevel()
     * @generated
     */
    EClass RISK_LEVEL = eINSTANCE.getRiskLevel();

    /**
     * The meta object literal for the '<em><b>Exposure</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RISK_LEVEL__EXPOSURE = eINSTANCE.getRiskLevel_Exposure();

    /**
     * The meta object literal for the '<em><b>Likelihood</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RISK_LEVEL__LIKELIHOOD = eINSTANCE.getRiskLevel_Likelihood();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardLevelImpl <em>Hazard Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardLevelImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardLevel()
     * @generated
     */
    EClass HAZARD_LEVEL = eINSTANCE.getHazardLevel();

    /**
     * The meta object literal for the '<em><b>Severity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_LEVEL__SEVERITY = eINSTANCE.getHazardLevel_Severity();

    /**
     * The meta object literal for the '<em><b>Likelihood</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_LEVEL__LIKELIHOOD = eINSTANCE.getHazardLevel_Likelihood();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardExposureImpl <em>Hazard Exposure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardExposureImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardExposure()
     * @generated
     */
    EClass HAZARD_EXPOSURE = eINSTANCE.getHazardExposure();

    /**
     * The meta object literal for the '<em><b>Exposure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_EXPOSURE__EXPOSURE = eINSTANCE.getHazardExposure_Exposure();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardAccidentLikelihoodImpl <em>Hazard Accident Likelihood</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAccidentLikelihoodImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardAccidentLikelihood()
     * @generated
     */
    EClass HAZARD_ACCIDENT_LIKELIHOOD = eINSTANCE.getHazardAccidentLikelihood();

    /**
     * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD = eINSTANCE.getHazardAccidentLikelihood_Likelihood();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardSeverityImpl <em>Hazard Severity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardSeverityImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardSeverity()
     * @generated
     */
    EClass HAZARD_SEVERITY = eINSTANCE.getHazardSeverity();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_SEVERITY__VALUE = eINSTANCE.getHazardSeverity_Value();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardLikelihoodImpl <em>Hazard Likelihood</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardLikelihoodImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getHazardLikelihood()
     * @generated
     */
    EClass HAZARD_LIKELIHOOD = eINSTANCE.getHazardLikelihood();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_LIKELIHOOD__VALUE = eINSTANCE.getHazardLikelihood_Value();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__CONSTRAINT = eINSTANCE.getConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__REQUIREMENTS = eINSTANCE.getConstraint_Requirements();

    /**
     * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__SCENARIOS = eINSTANCE.getConstraint_Scenarios();

    /**
     * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__CONTROLS = eINSTANCE.getConstraint_Controls();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__NOTES = eINSTANCE.getConstraint_Notes();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.RequirementImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__REQUIREMENT = eINSTANCE.getRequirement_Requirement();

    /**
     * The meta object literal for the '<em><b>Designs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__DESIGNS = eINSTANCE.getRequirement_Designs();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__NOTES = eINSTANCE.getRequirement_Notes();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.DesignImpl <em>Design</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.DesignImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getDesign()
     * @generated
     */
    EClass DESIGN = eINSTANCE.getDesign();

    /**
     * The meta object literal for the '<em><b>Allocation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGN__ALLOCATION = eINSTANCE.getDesign_Allocation();

    /**
     * The meta object literal for the '<em><b>Analysis</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGN__ANALYSIS = eINSTANCE.getDesign_Analysis();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIGN__RATIONALE = eINSTANCE.getDesign_Rationale();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.ScenarioImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Scenario</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__SCENARIO = eINSTANCE.getScenario_Scenario();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.ControlImpl <em>Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.ControlImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getControl()
     * @generated
     */
    EClass CONTROL = eINSTANCE.getControl();

    /**
     * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL__CONTROL = eINSTANCE.getControl_Control();

    /**
     * The meta object literal for the '{@link net.certware.hazard.stpa.hazardAnalysis.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.NoteImpl
     * @see net.certware.hazard.stpa.hazardAnalysis.impl.HazardAnalysisPackageImpl#getNote()
     * @generated
     */
    EClass NOTE = eINSTANCE.getNote();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__NOTE = eINSTANCE.getNote_Note();

  }

} //HazardAnalysisPackage
