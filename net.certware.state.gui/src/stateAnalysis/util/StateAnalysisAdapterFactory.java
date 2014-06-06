/**
 */
package stateAnalysis.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import stateAnalysis.Component;
import stateAnalysis.Controller;
import stateAnalysis.DataCollection;
import stateAnalysis.DataProduct;
import stateAnalysis.Deployment;
import stateAnalysis.DeploymentSet;
import stateAnalysis.Device;
import stateAnalysis.DeviceCommand;
import stateAnalysis.DeviceMeasurement;
import stateAnalysis.Estimator;
import stateAnalysis.HardwareAdapter;
import stateAnalysis.HardwareCommand;
import stateAnalysis.HardwareMeasurement;
import stateAnalysis.QosPolicy;
import stateAnalysis.StateAnalysisPackage;
import stateAnalysis.StateConstraint;
import stateAnalysis.StateUpdate;
import stateAnalysis.StateVariable;
import stateAnalysis.Subsystem;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see stateAnalysis.StateAnalysisPackage
 * @generated
 */
public class StateAnalysisAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StateAnalysisPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAnalysisAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StateAnalysisPackage.eINSTANCE;
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
  protected StateAnalysisSwitch<Adapter> modelSwitch =
    new StateAnalysisSwitch<Adapter>()
    {
      @Override
      public Adapter caseSystem(stateAnalysis.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseSubsystem(Subsystem object)
      {
        return createSubsystemAdapter();
      }
      @Override
      public Adapter caseDeploymentSet(DeploymentSet object)
      {
        return createDeploymentSetAdapter();
      }
      @Override
      public Adapter caseDeployment(Deployment object)
      {
        return createDeploymentAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseDataCollection(DataCollection object)
      {
        return createDataCollectionAdapter();
      }
      @Override
      public Adapter caseQosPolicy(QosPolicy object)
      {
        return createQosPolicyAdapter();
      }
      @Override
      public Adapter caseDataProduct(DataProduct object)
      {
        return createDataProductAdapter();
      }
      @Override
      public Adapter caseStateVariable(StateVariable object)
      {
        return createStateVariableAdapter();
      }
      @Override
      public Adapter caseController(Controller object)
      {
        return createControllerAdapter();
      }
      @Override
      public Adapter caseEstimator(Estimator object)
      {
        return createEstimatorAdapter();
      }
      @Override
      public Adapter caseHardwareAdapter(HardwareAdapter object)
      {
        return createHardwareAdapterAdapter();
      }
      @Override
      public Adapter caseDevice(Device object)
      {
        return createDeviceAdapter();
      }
      @Override
      public Adapter caseStateConstraint(StateConstraint object)
      {
        return createStateConstraintAdapter();
      }
      @Override
      public Adapter caseStateUpdate(StateUpdate object)
      {
        return createStateUpdateAdapter();
      }
      @Override
      public Adapter caseHardwareCommand(HardwareCommand object)
      {
        return createHardwareCommandAdapter();
      }
      @Override
      public Adapter caseHardwareMeasurement(HardwareMeasurement object)
      {
        return createHardwareMeasurementAdapter();
      }
      @Override
      public Adapter caseDeviceCommand(DeviceCommand object)
      {
        return createDeviceCommandAdapter();
      }
      @Override
      public Adapter caseDeviceMeasurement(DeviceMeasurement object)
      {
        return createDeviceMeasurementAdapter();
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
   * Creates a new adapter for an object of class '{@link stateAnalysis.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.Subsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.Subsystem
   * @generated
   */
  public Adapter createSubsystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.DeploymentSet <em>Deployment Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.DeploymentSet
   * @generated
   */
  public Adapter createDeploymentSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.QosPolicy <em>Qos Policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.QosPolicy
   * @generated
   */
  public Adapter createQosPolicyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.DataProduct <em>Data Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.DataProduct
   * @generated
   */
  public Adapter createDataProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.DataCollection <em>Data Collection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.DataCollection
   * @generated
   */
  public Adapter createDataCollectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.Deployment
   * @generated
   */
  public Adapter createDeploymentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.StateVariable <em>State Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.StateVariable
   * @generated
   */
  public Adapter createStateVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.Controller
   * @generated
   */
  public Adapter createControllerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.Estimator <em>Estimator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.Estimator
   * @generated
   */
  public Adapter createEstimatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.StateConstraint <em>State Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.StateConstraint
   * @generated
   */
  public Adapter createStateConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.StateUpdate <em>State Update</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.StateUpdate
   * @generated
   */
  public Adapter createStateUpdateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.HardwareCommand <em>Hardware Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.HardwareCommand
   * @generated
   */
  public Adapter createHardwareCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.HardwareMeasurement <em>Hardware Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.HardwareMeasurement
   * @generated
   */
  public Adapter createHardwareMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.Device
   * @generated
   */
  public Adapter createDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.DeviceCommand <em>Device Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.DeviceCommand
   * @generated
   */
  public Adapter createDeviceCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.DeviceMeasurement <em>Device Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.DeviceMeasurement
   * @generated
   */
  public Adapter createDeviceMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link stateAnalysis.HardwareAdapter <em>Hardware Adapter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see stateAnalysis.HardwareAdapter
   * @generated
   */
  public Adapter createHardwareAdapterAdapter()
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

} //StateAnalysisAdapterFactory
