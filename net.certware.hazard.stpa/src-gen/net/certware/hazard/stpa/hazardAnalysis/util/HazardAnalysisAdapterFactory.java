/**
 */
package net.certware.hazard.stpa.hazardAnalysis.util;

import net.certware.hazard.stpa.hazardAnalysis.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage
 * @generated
 */
public class HazardAnalysisAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HazardAnalysisPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardAnalysisAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HazardAnalysisPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardAnalysisSwitch<Adapter> modelSwitch =
    new HazardAnalysisSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseAccident(Accident object)
      {
        return createAccidentAdapter();
      }
      @Override
      public Adapter caseIncident(Incident object)
      {
        return createIncidentAdapter();
      }
      @Override
      public Adapter caseHazard(Hazard object)
      {
        return createHazardAdapter();
      }
      @Override
      public Adapter caseRiskLevel(RiskLevel object)
      {
        return createRiskLevelAdapter();
      }
      @Override
      public Adapter caseHazardLevel(HazardLevel object)
      {
        return createHazardLevelAdapter();
      }
      @Override
      public Adapter caseHazardExposure(HazardExposure object)
      {
        return createHazardExposureAdapter();
      }
      @Override
      public Adapter caseHazardAccidentLikelihood(HazardAccidentLikelihood object)
      {
        return createHazardAccidentLikelihoodAdapter();
      }
      @Override
      public Adapter caseHazardSeverity(HazardSeverity object)
      {
        return createHazardSeverityAdapter();
      }
      @Override
      public Adapter caseHazardLikelihood(HazardLikelihood object)
      {
        return createHazardLikelihoodAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseRequirement(Requirement object)
      {
        return createRequirementAdapter();
      }
      @Override
      public Adapter caseDesign(Design object)
      {
        return createDesignAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseControl(Control object)
      {
        return createControlAdapter();
      }
      @Override
      public Adapter caseNote(Note object)
      {
        return createNoteAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Accident <em>Accident</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Accident
   * @generated
   */
  public Adapter createAccidentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Incident <em>Incident</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Incident
   * @generated
   */
  public Adapter createIncidentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard <em>Hazard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Hazard
   * @generated
   */
  public Adapter createHazardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel <em>Risk Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.RiskLevel
   * @generated
   */
  public Adapter createRiskLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel <em>Hazard Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardLevel
   * @generated
   */
  public Adapter createHazardLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardExposure <em>Hazard Exposure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardExposure
   * @generated
   */
  public Adapter createHazardExposureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood <em>Hazard Accident Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood
   * @generated
   */
  public Adapter createHazardAccidentLikelihoodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardSeverity <em>Hazard Severity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardSeverity
   * @generated
   */
  public Adapter createHazardSeverityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood <em>Hazard Likelihood</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood
   * @generated
   */
  public Adapter createHazardLikelihoodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Requirement
   * @generated
   */
  public Adapter createRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Design <em>Design</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Design
   * @generated
   */
  public Adapter createDesignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Control <em>Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Control
   * @generated
   */
  public Adapter createControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.hazard.stpa.hazardAnalysis.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.hazard.stpa.hazardAnalysis.Note
   * @generated
   */
  public Adapter createNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HazardAnalysisAdapterFactory
