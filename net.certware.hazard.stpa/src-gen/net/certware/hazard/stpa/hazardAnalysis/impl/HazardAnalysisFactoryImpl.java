/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import net.certware.hazard.stpa.hazardAnalysis.*;

import org.eclipse.emf.ecore.EClass;
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
public class HazardAnalysisFactoryImpl extends EFactoryImpl implements HazardAnalysisFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HazardAnalysisFactory init()
  {
    try
    {
      HazardAnalysisFactory theHazardAnalysisFactory = (HazardAnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(HazardAnalysisPackage.eNS_URI);
      if (theHazardAnalysisFactory != null)
      {
        return theHazardAnalysisFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HazardAnalysisFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardAnalysisFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HazardAnalysisPackage.MODEL: return createModel();
      case HazardAnalysisPackage.ACCIDENT: return createAccident();
      case HazardAnalysisPackage.INCIDENT: return createIncident();
      case HazardAnalysisPackage.HAZARD: return createHazard();
      case HazardAnalysisPackage.RISK_LEVEL: return createRiskLevel();
      case HazardAnalysisPackage.HAZARD_LEVEL: return createHazardLevel();
      case HazardAnalysisPackage.HAZARD_EXPOSURE: return createHazardExposure();
      case HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD: return createHazardAccidentLikelihood();
      case HazardAnalysisPackage.HAZARD_SEVERITY: return createHazardSeverity();
      case HazardAnalysisPackage.HAZARD_LIKELIHOOD: return createHazardLikelihood();
      case HazardAnalysisPackage.CONSTRAINT: return createConstraint();
      case HazardAnalysisPackage.REQUIREMENT: return createRequirement();
      case HazardAnalysisPackage.DESIGN: return createDesign();
      case HazardAnalysisPackage.SCENARIO: return createScenario();
      case HazardAnalysisPackage.CONTROL: return createControl();
      case HazardAnalysisPackage.NOTE: return createNote();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Accident createAccident()
  {
    AccidentImpl accident = new AccidentImpl();
    return accident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Incident createIncident()
  {
    IncidentImpl incident = new IncidentImpl();
    return incident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hazard createHazard()
  {
    HazardImpl hazard = new HazardImpl();
    return hazard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskLevel createRiskLevel()
  {
    RiskLevelImpl riskLevel = new RiskLevelImpl();
    return riskLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardLevel createHazardLevel()
  {
    HazardLevelImpl hazardLevel = new HazardLevelImpl();
    return hazardLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardExposure createHazardExposure()
  {
    HazardExposureImpl hazardExposure = new HazardExposureImpl();
    return hazardExposure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardAccidentLikelihood createHazardAccidentLikelihood()
  {
    HazardAccidentLikelihoodImpl hazardAccidentLikelihood = new HazardAccidentLikelihoodImpl();
    return hazardAccidentLikelihood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardSeverity createHazardSeverity()
  {
    HazardSeverityImpl hazardSeverity = new HazardSeverityImpl();
    return hazardSeverity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardLikelihood createHazardLikelihood()
  {
    HazardLikelihoodImpl hazardLikelihood = new HazardLikelihoodImpl();
    return hazardLikelihood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Design createDesign()
  {
    DesignImpl design = new DesignImpl();
    return design;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control createControl()
  {
    ControlImpl control = new ControlImpl();
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardAnalysisPackage getHazardAnalysisPackage()
  {
    return (HazardAnalysisPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HazardAnalysisPackage getPackage()
  {
    return HazardAnalysisPackage.eINSTANCE;
  }

} //HazardAnalysisFactoryImpl
