/**
 */
package net.certware.hazard.stpa.hazardAnalysis.util;

import net.certware.hazard.stpa.hazardAnalysis.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage
 * @generated
 */
public class HazardAnalysisSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HazardAnalysisPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardAnalysisSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = HazardAnalysisPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case HazardAnalysisPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.ACCIDENT:
      {
        Accident accident = (Accident)theEObject;
        T result = caseAccident(accident);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.INCIDENT:
      {
        Incident incident = (Incident)theEObject;
        T result = caseIncident(incident);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.HAZARD:
      {
        Hazard hazard = (Hazard)theEObject;
        T result = caseHazard(hazard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.RISK_LEVEL:
      {
        RiskLevel riskLevel = (RiskLevel)theEObject;
        T result = caseRiskLevel(riskLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.HAZARD_LEVEL:
      {
        HazardLevel hazardLevel = (HazardLevel)theEObject;
        T result = caseHazardLevel(hazardLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.HAZARD_EXPOSURE:
      {
        HazardExposure hazardExposure = (HazardExposure)theEObject;
        T result = caseHazardExposure(hazardExposure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD:
      {
        HazardAccidentLikelihood hazardAccidentLikelihood = (HazardAccidentLikelihood)theEObject;
        T result = caseHazardAccidentLikelihood(hazardAccidentLikelihood);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.HAZARD_SEVERITY:
      {
        HazardSeverity hazardSeverity = (HazardSeverity)theEObject;
        T result = caseHazardSeverity(hazardSeverity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.HAZARD_LIKELIHOOD:
      {
        HazardLikelihood hazardLikelihood = (HazardLikelihood)theEObject;
        T result = caseHazardLikelihood(hazardLikelihood);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.DESIGN:
      {
        Design design = (Design)theEObject;
        T result = caseDesign(design);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.CONTROL:
      {
        Control control = (Control)theEObject;
        T result = caseControl(control);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HazardAnalysisPackage.NOTE:
      {
        Note note = (Note)theEObject;
        T result = caseNote(note);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accident</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accident</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccident(Accident object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Incident</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Incident</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncident(Incident object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHazard(Hazard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Risk Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Risk Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRiskLevel(RiskLevel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHazardLevel(HazardLevel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard Exposure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard Exposure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHazardExposure(HazardExposure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard Accident Likelihood</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard Accident Likelihood</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHazardAccidentLikelihood(HazardAccidentLikelihood object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard Severity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard Severity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHazardSeverity(HazardSeverity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hazard Likelihood</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hazard Likelihood</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHazardLikelihood(HazardLikelihood object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Design</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Design</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesign(Design object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControl(Control object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Note</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNote(Note object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //HazardAnalysisSwitch
