/**
 */
package stateAnalysis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import stateAnalysis.StateAnalysisFactory;
import stateAnalysis.StateAnalysisPackage;
import stateAnalysis.StateConstraint;
import stateAnalysis.StateUpdate;
import stateAnalysis.StateVariable;
import stateAnalysis.Subsystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateAnalysisFactoryImpl extends EFactoryImpl implements StateAnalysisFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StateAnalysisFactory init()
  {
    try
    {
      StateAnalysisFactory theStateAnalysisFactory = (StateAnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(StateAnalysisPackage.eNS_URI);
      if (theStateAnalysisFactory != null)
      {
        return theStateAnalysisFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StateAnalysisFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAnalysisFactoryImpl()
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
      case StateAnalysisPackage.SYSTEM: return createSystem();
      case StateAnalysisPackage.SUBSYSTEM: return createSubsystem();
      case StateAnalysisPackage.DEPLOYMENT_SET: return createDeploymentSet();
      case StateAnalysisPackage.DEPLOYMENT: return createDeployment();
      case StateAnalysisPackage.DATA_COLLECTION: return createDataCollection();
      case StateAnalysisPackage.QOS_POLICY: return createQosPolicy();
      case StateAnalysisPackage.DATA_PRODUCT: return createDataProduct();
      case StateAnalysisPackage.STATE_VARIABLE: return createStateVariable();
      case StateAnalysisPackage.CONTROLLER: return createController();
      case StateAnalysisPackage.ESTIMATOR: return createEstimator();
      case StateAnalysisPackage.HARDWARE_ADAPTER: return createHardwareAdapter();
      case StateAnalysisPackage.DEVICE: return createDevice();
      case StateAnalysisPackage.STATE_CONSTRAINT: return createStateConstraint();
      case StateAnalysisPackage.STATE_UPDATE: return createStateUpdate();
      case StateAnalysisPackage.HARDWARE_COMMAND: return createHardwareCommand();
      case StateAnalysisPackage.HARDWARE_MEASUREMENT: return createHardwareMeasurement();
      case StateAnalysisPackage.DEVICE_COMMAND: return createDeviceCommand();
      case StateAnalysisPackage.DEVICE_MEASUREMENT: return createDeviceMeasurement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stateAnalysis.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subsystem createSubsystem()
  {
    SubsystemImpl subsystem = new SubsystemImpl();
    return subsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentSet createDeploymentSet()
  {
    DeploymentSetImpl deploymentSet = new DeploymentSetImpl();
    return deploymentSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QosPolicy createQosPolicy()
  {
    QosPolicyImpl qosPolicy = new QosPolicyImpl();
    return qosPolicy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataProduct createDataProduct()
  {
    DataProductImpl dataProduct = new DataProductImpl();
    return dataProduct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection createDataCollection()
  {
    DataCollectionImpl dataCollection = new DataCollectionImpl();
    return dataCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment createDeployment()
  {
    DeploymentImpl deployment = new DeploymentImpl();
    return deployment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateVariable createStateVariable()
  {
    StateVariableImpl stateVariable = new StateVariableImpl();
    return stateVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controller createController()
  {
    ControllerImpl controller = new ControllerImpl();
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estimator createEstimator()
  {
    EstimatorImpl estimator = new EstimatorImpl();
    return estimator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateConstraint createStateConstraint()
  {
    StateConstraintImpl stateConstraint = new StateConstraintImpl();
    return stateConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateUpdate createStateUpdate()
  {
    StateUpdateImpl stateUpdate = new StateUpdateImpl();
    return stateUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareCommand createHardwareCommand()
  {
    HardwareCommandImpl hardwareCommand = new HardwareCommandImpl();
    return hardwareCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareMeasurement createHardwareMeasurement()
  {
    HardwareMeasurementImpl hardwareMeasurement = new HardwareMeasurementImpl();
    return hardwareMeasurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceCommand createDeviceCommand()
  {
    DeviceCommandImpl deviceCommand = new DeviceCommandImpl();
    return deviceCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviceMeasurement createDeviceMeasurement()
  {
    DeviceMeasurementImpl deviceMeasurement = new DeviceMeasurementImpl();
    return deviceMeasurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareAdapter createHardwareAdapter()
  {
    HardwareAdapterImpl hardwareAdapter = new HardwareAdapterImpl();
    return hardwareAdapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAnalysisPackage getStateAnalysisPackage()
  {
    return (StateAnalysisPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StateAnalysisPackage getPackage()
  {
    return StateAnalysisPackage.eINSTANCE;
  }

} //StateAnalysisFactoryImpl
