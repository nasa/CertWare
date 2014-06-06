/**
 */
package stateAnalysis;

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
 * @see stateAnalysis.StateAnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface StateAnalysisPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "stateAnalysis";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/state/StateAnalysisGui";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "net.certware.state.gui";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateAnalysisPackage eINSTANCE = stateAnalysis.impl.StateAnalysisPackageImpl.init();

  /**
   * The meta object id for the '{@link stateAnalysis.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.SystemImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SUBSYSTEMS = 2;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.SubsystemImpl <em>Subsystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.SubsystemImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getSubsystem()
   * @generated
   */
  int SUBSYSTEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Deployment Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__DEPLOYMENT_SETS = 2;

  /**
   * The number of structural features of the '<em>Subsystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.DeploymentSetImpl <em>Deployment Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.DeploymentSetImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeploymentSet()
   * @generated
   */
  int DEPLOYMENT_SET = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SET__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SET__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SET__DEPLOYMENTS = 2;

  /**
   * The number of structural features of the '<em>Deployment Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.QosPolicyImpl <em>Qos Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.QosPolicyImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getQosPolicy()
   * @generated
   */
  int QOS_POLICY = 6;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.DataProductImpl <em>Data Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.DataProductImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDataProduct()
   * @generated
   */
  int DATA_PRODUCT = 7;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.DataCollectionImpl <em>Data Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.DataCollectionImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDataCollection()
   * @generated
   */
  int DATA_COLLECTION = 5;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.DeploymentImpl <em>Deployment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.DeploymentImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeployment()
   * @generated
   */
  int DEPLOYMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__COMPONENTS = 2;

  /**
   * The feature id for the '<em><b>Catalogs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__CATALOGS = 3;

  /**
   * The number of structural features of the '<em>Deployment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.ComponentImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>State Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__STATE_VARIABLES = 2;

  /**
   * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CONTROLLERS = 3;

  /**
   * The feature id for the '<em><b>Estimators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ESTIMATORS = 4;

  /**
   * The feature id for the '<em><b>Adapters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ADAPTERS = 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Policies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__POLICIES = 2;

  /**
   * The feature id for the '<em><b>Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION__PRODUCTS = 3;

  /**
   * The number of structural features of the '<em>Data Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COLLECTION_FEATURE_COUNT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOS_POLICY__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOS_POLICY__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOS_POLICY__POLICY = 2;

  /**
   * The number of structural features of the '<em>Qos Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOS_POLICY_FEATURE_COUNT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRODUCT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRODUCT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRODUCT__CONTENT = 2;

  /**
   * The number of structural features of the '<em>Data Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PRODUCT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.StateVariableImpl <em>State Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.StateVariableImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getStateVariable()
   * @generated
   */
  int STATE_VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Representation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__REPRESENTATION_TYPE = 2;

  /**
   * The feature id for the '<em><b>In State Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__IN_STATE_CONSTRAINTS = 3;

  /**
   * The feature id for the '<em><b>Out State Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__OUT_STATE_CONSTRAINTS = 4;

  /**
   * The feature id for the '<em><b>State Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__STATE_UPDATES = 5;

  /**
   * The feature id for the '<em><b>Influenced By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__INFLUENCED_BY = 6;

  /**
   * The number of structural features of the '<em>State Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.ControllerImpl <em>Controller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.ControllerImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getController()
   * @generated
   */
  int CONTROLLER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Delegates</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__DELEGATES = 2;

  /**
   * The feature id for the '<em><b>State Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__STATE_CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Hardware Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__HARDWARE_COMMAND = 4;

  /**
   * The number of structural features of the '<em>Controller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.EstimatorImpl <em>Estimator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.EstimatorImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getEstimator()
   * @generated
   */
  int ESTIMATOR = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Distilled Measurements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__DISTILLED_MEASUREMENTS = 2;

  /**
   * The feature id for the '<em><b>State Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__STATE_CONSTRAINTS = 3;

  /**
   * The feature id for the '<em><b>State Updates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__STATE_UPDATES = 4;

  /**
   * The feature id for the '<em><b>Hardware Measurement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__HARDWARE_MEASUREMENT = 5;

  /**
   * The number of structural features of the '<em>Estimator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.StateConstraintImpl <em>State Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.StateConstraintImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getStateConstraint()
   * @generated
   */
  int STATE_CONSTRAINT = 13;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.StateUpdateImpl <em>State Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.StateUpdateImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getStateUpdate()
   * @generated
   */
  int STATE_UPDATE = 14;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.HardwareCommandImpl <em>Hardware Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.HardwareCommandImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareCommand()
   * @generated
   */
  int HARDWARE_COMMAND = 15;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.HardwareMeasurementImpl <em>Hardware Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.HardwareMeasurementImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareMeasurement()
   * @generated
   */
  int HARDWARE_MEASUREMENT = 16;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.DeviceImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 12;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.DeviceCommandImpl <em>Device Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.DeviceCommandImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceCommand()
   * @generated
   */
  int DEVICE_COMMAND = 17;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.DeviceMeasurementImpl <em>Device Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.DeviceMeasurementImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceMeasurement()
   * @generated
   */
  int DEVICE_MEASUREMENT = 18;

  /**
   * The meta object id for the '{@link stateAnalysis.impl.HardwareAdapterImpl <em>Hardware Adapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see stateAnalysis.impl.HardwareAdapterImpl
   * @see stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareAdapter()
   * @generated
   */
  int HARDWARE_ADAPTER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Hardware Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__HARDWARE_COMMANDS = 2;

  /**
   * The feature id for the '<em><b>Hardware Measurements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS = 3;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__DEVICES = 4;

  /**
   * The number of structural features of the '<em>Hardware Adapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER_FEATURE_COUNT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Device Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICE_COMMANDS = 2;

  /**
   * The feature id for the '<em><b>Device Measurements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE__DEVICE_MEASUREMENTS = 3;

  /**
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONSTRAINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONSTRAINT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>State Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_UPDATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_UPDATE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>State Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_UPDATE_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_COMMAND__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Hardware Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_COMMAND_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_MEASUREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_MEASUREMENT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Hardware Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_MEASUREMENT_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_COMMAND__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Device Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_COMMAND_FEATURE_COUNT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEASUREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEASUREMENT__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Device Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEASUREMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link stateAnalysis.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see stateAnalysis.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.System#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.System#getDescription()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.System#getSubsystems <em>Subsystems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsystems</em>'.
   * @see stateAnalysis.System#getSubsystems()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Subsystems();

  /**
   * Returns the meta object for class '{@link stateAnalysis.Subsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsystem</em>'.
   * @see stateAnalysis.Subsystem
   * @generated
   */
  EClass getSubsystem();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Subsystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.Subsystem#getName()
   * @see #getSubsystem()
   * @generated
   */
  EAttribute getSubsystem_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Subsystem#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.Subsystem#getDescription()
   * @see #getSubsystem()
   * @generated
   */
  EAttribute getSubsystem_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Subsystem#getDeploymentSets <em>Deployment Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployment Sets</em>'.
   * @see stateAnalysis.Subsystem#getDeploymentSets()
   * @see #getSubsystem()
   * @generated
   */
  EReference getSubsystem_DeploymentSets();

  /**
   * Returns the meta object for class '{@link stateAnalysis.DeploymentSet <em>Deployment Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Set</em>'.
   * @see stateAnalysis.DeploymentSet
   * @generated
   */
  EClass getDeploymentSet();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DeploymentSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.DeploymentSet#getName()
   * @see #getDeploymentSet()
   * @generated
   */
  EAttribute getDeploymentSet_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DeploymentSet#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.DeploymentSet#getDescription()
   * @see #getDeploymentSet()
   * @generated
   */
  EAttribute getDeploymentSet_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.DeploymentSet#getDeployments <em>Deployments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployments</em>'.
   * @see stateAnalysis.DeploymentSet#getDeployments()
   * @see #getDeploymentSet()
   * @generated
   */
  EReference getDeploymentSet_Deployments();

  /**
   * Returns the meta object for class '{@link stateAnalysis.QosPolicy <em>Qos Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qos Policy</em>'.
   * @see stateAnalysis.QosPolicy
   * @generated
   */
  EClass getQosPolicy();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.QosPolicy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.QosPolicy#getName()
   * @see #getQosPolicy()
   * @generated
   */
  EAttribute getQosPolicy_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.QosPolicy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.QosPolicy#getDescription()
   * @see #getQosPolicy()
   * @generated
   */
  EAttribute getQosPolicy_Description();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.QosPolicy#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Policy</em>'.
   * @see stateAnalysis.QosPolicy#getPolicy()
   * @see #getQosPolicy()
   * @generated
   */
  EAttribute getQosPolicy_Policy();

  /**
   * Returns the meta object for class '{@link stateAnalysis.DataProduct <em>Data Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Product</em>'.
   * @see stateAnalysis.DataProduct
   * @generated
   */
  EClass getDataProduct();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DataProduct#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.DataProduct#getName()
   * @see #getDataProduct()
   * @generated
   */
  EAttribute getDataProduct_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DataProduct#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.DataProduct#getDescription()
   * @see #getDataProduct()
   * @generated
   */
  EAttribute getDataProduct_Description();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DataProduct#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see stateAnalysis.DataProduct#getContent()
   * @see #getDataProduct()
   * @generated
   */
  EAttribute getDataProduct_Content();

  /**
   * Returns the meta object for class '{@link stateAnalysis.DataCollection <em>Data Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Collection</em>'.
   * @see stateAnalysis.DataCollection
   * @generated
   */
  EClass getDataCollection();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DataCollection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.DataCollection#getName()
   * @see #getDataCollection()
   * @generated
   */
  EAttribute getDataCollection_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DataCollection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.DataCollection#getDescription()
   * @see #getDataCollection()
   * @generated
   */
  EAttribute getDataCollection_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.DataCollection#getPolicies <em>Policies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Policies</em>'.
   * @see stateAnalysis.DataCollection#getPolicies()
   * @see #getDataCollection()
   * @generated
   */
  EReference getDataCollection_Policies();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.DataCollection#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Products</em>'.
   * @see stateAnalysis.DataCollection#getProducts()
   * @see #getDataCollection()
   * @generated
   */
  EReference getDataCollection_Products();

  /**
   * Returns the meta object for class '{@link stateAnalysis.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment</em>'.
   * @see stateAnalysis.Deployment
   * @generated
   */
  EClass getDeployment();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Deployment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.Deployment#getName()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Deployment#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.Deployment#getDescription()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Deployment#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see stateAnalysis.Deployment#getComponents()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Components();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Deployment#getCatalogs <em>Catalogs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catalogs</em>'.
   * @see stateAnalysis.Deployment#getCatalogs()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Catalogs();

  /**
   * Returns the meta object for class '{@link stateAnalysis.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see stateAnalysis.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Component#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.Component#getDescription()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Component#getStateVariables <em>State Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Variables</em>'.
   * @see stateAnalysis.Component#getStateVariables()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_StateVariables();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Component#getControllers <em>Controllers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controllers</em>'.
   * @see stateAnalysis.Component#getControllers()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Controllers();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Component#getEstimators <em>Estimators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Estimators</em>'.
   * @see stateAnalysis.Component#getEstimators()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Estimators();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Component#getAdapters <em>Adapters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Adapters</em>'.
   * @see stateAnalysis.Component#getAdapters()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Adapters();

  /**
   * Returns the meta object for class '{@link stateAnalysis.StateVariable <em>State Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Variable</em>'.
   * @see stateAnalysis.StateVariable
   * @generated
   */
  EClass getStateVariable();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.StateVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.StateVariable#getName()
   * @see #getStateVariable()
   * @generated
   */
  EAttribute getStateVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.StateVariable#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.StateVariable#getDescription()
   * @see #getStateVariable()
   * @generated
   */
  EAttribute getStateVariable_Description();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.StateVariable#getRepresentationType <em>Representation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Representation Type</em>'.
   * @see stateAnalysis.StateVariable#getRepresentationType()
   * @see #getStateVariable()
   * @generated
   */
  EAttribute getStateVariable_RepresentationType();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.StateVariable#getInStateConstraints <em>In State Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>In State Constraints</em>'.
   * @see stateAnalysis.StateVariable#getInStateConstraints()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_InStateConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.StateVariable#getOutStateConstraints <em>Out State Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Out State Constraints</em>'.
   * @see stateAnalysis.StateVariable#getOutStateConstraints()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_OutStateConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.StateVariable#getStateUpdates <em>State Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Updates</em>'.
   * @see stateAnalysis.StateVariable#getStateUpdates()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_StateUpdates();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.StateVariable#getInfluencedBy <em>Influenced By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Influenced By</em>'.
   * @see stateAnalysis.StateVariable#getInfluencedBy()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_InfluencedBy();

  /**
   * Returns the meta object for class '{@link stateAnalysis.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller</em>'.
   * @see stateAnalysis.Controller
   * @generated
   */
  EClass getController();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Controller#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.Controller#getName()
   * @see #getController()
   * @generated
   */
  EAttribute getController_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Controller#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.Controller#getDescription()
   * @see #getController()
   * @generated
   */
  EAttribute getController_Description();

  /**
   * Returns the meta object for the reference list '{@link stateAnalysis.Controller#getDelegates <em>Delegates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Delegates</em>'.
   * @see stateAnalysis.Controller#getDelegates()
   * @see #getController()
   * @generated
   */
  EReference getController_Delegates();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Controller#getStateConstraint <em>State Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Constraint</em>'.
   * @see stateAnalysis.Controller#getStateConstraint()
   * @see #getController()
   * @generated
   */
  EReference getController_StateConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Controller#getHardwareCommand <em>Hardware Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Command</em>'.
   * @see stateAnalysis.Controller#getHardwareCommand()
   * @see #getController()
   * @generated
   */
  EReference getController_HardwareCommand();

  /**
   * Returns the meta object for class '{@link stateAnalysis.Estimator <em>Estimator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Estimator</em>'.
   * @see stateAnalysis.Estimator
   * @generated
   */
  EClass getEstimator();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Estimator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.Estimator#getName()
   * @see #getEstimator()
   * @generated
   */
  EAttribute getEstimator_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Estimator#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.Estimator#getDescription()
   * @see #getEstimator()
   * @generated
   */
  EAttribute getEstimator_Description();

  /**
   * Returns the meta object for the reference list '{@link stateAnalysis.Estimator#getDistilledMeasurements <em>Distilled Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Distilled Measurements</em>'.
   * @see stateAnalysis.Estimator#getDistilledMeasurements()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_DistilledMeasurements();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Estimator#getStateConstraints <em>State Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Constraints</em>'.
   * @see stateAnalysis.Estimator#getStateConstraints()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_StateConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Estimator#getStateUpdates <em>State Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Updates</em>'.
   * @see stateAnalysis.Estimator#getStateUpdates()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_StateUpdates();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Estimator#getHardwareMeasurement <em>Hardware Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Measurement</em>'.
   * @see stateAnalysis.Estimator#getHardwareMeasurement()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_HardwareMeasurement();

  /**
   * Returns the meta object for class '{@link stateAnalysis.StateConstraint <em>State Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Constraint</em>'.
   * @see stateAnalysis.StateConstraint
   * @generated
   */
  EClass getStateConstraint();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.StateConstraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.StateConstraint#getName()
   * @see #getStateConstraint()
   * @generated
   */
  EAttribute getStateConstraint_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.StateConstraint#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.StateConstraint#getDescription()
   * @see #getStateConstraint()
   * @generated
   */
  EAttribute getStateConstraint_Description();

  /**
   * Returns the meta object for class '{@link stateAnalysis.StateUpdate <em>State Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Update</em>'.
   * @see stateAnalysis.StateUpdate
   * @generated
   */
  EClass getStateUpdate();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.StateUpdate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.StateUpdate#getName()
   * @see #getStateUpdate()
   * @generated
   */
  EAttribute getStateUpdate_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.StateUpdate#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.StateUpdate#getDescription()
   * @see #getStateUpdate()
   * @generated
   */
  EAttribute getStateUpdate_Description();

  /**
   * Returns the meta object for class '{@link stateAnalysis.HardwareCommand <em>Hardware Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hardware Command</em>'.
   * @see stateAnalysis.HardwareCommand
   * @generated
   */
  EClass getHardwareCommand();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.HardwareCommand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.HardwareCommand#getName()
   * @see #getHardwareCommand()
   * @generated
   */
  EAttribute getHardwareCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.HardwareCommand#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.HardwareCommand#getDescription()
   * @see #getHardwareCommand()
   * @generated
   */
  EAttribute getHardwareCommand_Description();

  /**
   * Returns the meta object for class '{@link stateAnalysis.HardwareMeasurement <em>Hardware Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hardware Measurement</em>'.
   * @see stateAnalysis.HardwareMeasurement
   * @generated
   */
  EClass getHardwareMeasurement();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.HardwareMeasurement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.HardwareMeasurement#getName()
   * @see #getHardwareMeasurement()
   * @generated
   */
  EAttribute getHardwareMeasurement_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.HardwareMeasurement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.HardwareMeasurement#getDescription()
   * @see #getHardwareMeasurement()
   * @generated
   */
  EAttribute getHardwareMeasurement_Description();

  /**
   * Returns the meta object for class '{@link stateAnalysis.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see stateAnalysis.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Device#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.Device#getName()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.Device#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.Device#getDescription()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Device#getDeviceCommands <em>Device Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Commands</em>'.
   * @see stateAnalysis.Device#getDeviceCommands()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceCommands();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.Device#getDeviceMeasurements <em>Device Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Measurements</em>'.
   * @see stateAnalysis.Device#getDeviceMeasurements()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceMeasurements();

  /**
   * Returns the meta object for class '{@link stateAnalysis.DeviceCommand <em>Device Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Command</em>'.
   * @see stateAnalysis.DeviceCommand
   * @generated
   */
  EClass getDeviceCommand();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DeviceCommand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.DeviceCommand#getName()
   * @see #getDeviceCommand()
   * @generated
   */
  EAttribute getDeviceCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DeviceCommand#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.DeviceCommand#getDescription()
   * @see #getDeviceCommand()
   * @generated
   */
  EAttribute getDeviceCommand_Description();

  /**
   * Returns the meta object for class '{@link stateAnalysis.DeviceMeasurement <em>Device Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Measurement</em>'.
   * @see stateAnalysis.DeviceMeasurement
   * @generated
   */
  EClass getDeviceMeasurement();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DeviceMeasurement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.DeviceMeasurement#getName()
   * @see #getDeviceMeasurement()
   * @generated
   */
  EAttribute getDeviceMeasurement_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.DeviceMeasurement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.DeviceMeasurement#getDescription()
   * @see #getDeviceMeasurement()
   * @generated
   */
  EAttribute getDeviceMeasurement_Description();

  /**
   * Returns the meta object for class '{@link stateAnalysis.HardwareAdapter <em>Hardware Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hardware Adapter</em>'.
   * @see stateAnalysis.HardwareAdapter
   * @generated
   */
  EClass getHardwareAdapter();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.HardwareAdapter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see stateAnalysis.HardwareAdapter#getName()
   * @see #getHardwareAdapter()
   * @generated
   */
  EAttribute getHardwareAdapter_Name();

  /**
   * Returns the meta object for the attribute '{@link stateAnalysis.HardwareAdapter#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see stateAnalysis.HardwareAdapter#getDescription()
   * @see #getHardwareAdapter()
   * @generated
   */
  EAttribute getHardwareAdapter_Description();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.HardwareAdapter#getHardwareCommands <em>Hardware Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Commands</em>'.
   * @see stateAnalysis.HardwareAdapter#getHardwareCommands()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_HardwareCommands();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.HardwareAdapter#getHardwareMeasurements <em>Hardware Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Measurements</em>'.
   * @see stateAnalysis.HardwareAdapter#getHardwareMeasurements()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_HardwareMeasurements();

  /**
   * Returns the meta object for the containment reference list '{@link stateAnalysis.HardwareAdapter#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see stateAnalysis.HardwareAdapter#getDevices()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_Devices();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StateAnalysisFactory getStateAnalysisFactory();

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
     * The meta object literal for the '{@link stateAnalysis.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.SystemImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__DESCRIPTION = eINSTANCE.getSystem_Description();

    /**
     * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__SUBSYSTEMS = eINSTANCE.getSystem_Subsystems();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.SubsystemImpl <em>Subsystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.SubsystemImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getSubsystem()
     * @generated
     */
    EClass SUBSYSTEM = eINSTANCE.getSubsystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBSYSTEM__NAME = eINSTANCE.getSubsystem_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBSYSTEM__DESCRIPTION = eINSTANCE.getSubsystem_Description();

    /**
     * The meta object literal for the '<em><b>Deployment Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSYSTEM__DEPLOYMENT_SETS = eINSTANCE.getSubsystem_DeploymentSets();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.DeploymentSetImpl <em>Deployment Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.DeploymentSetImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeploymentSet()
     * @generated
     */
    EClass DEPLOYMENT_SET = eINSTANCE.getDeploymentSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_SET__NAME = eINSTANCE.getDeploymentSet_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_SET__DESCRIPTION = eINSTANCE.getDeploymentSet_Description();

    /**
     * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_SET__DEPLOYMENTS = eINSTANCE.getDeploymentSet_Deployments();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.QosPolicyImpl <em>Qos Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.QosPolicyImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getQosPolicy()
     * @generated
     */
    EClass QOS_POLICY = eINSTANCE.getQosPolicy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QOS_POLICY__NAME = eINSTANCE.getQosPolicy_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QOS_POLICY__DESCRIPTION = eINSTANCE.getQosPolicy_Description();

    /**
     * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QOS_POLICY__POLICY = eINSTANCE.getQosPolicy_Policy();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.DataProductImpl <em>Data Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.DataProductImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDataProduct()
     * @generated
     */
    EClass DATA_PRODUCT = eINSTANCE.getDataProduct();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_PRODUCT__NAME = eINSTANCE.getDataProduct_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_PRODUCT__DESCRIPTION = eINSTANCE.getDataProduct_Description();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_PRODUCT__CONTENT = eINSTANCE.getDataProduct_Content();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.DataCollectionImpl <em>Data Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.DataCollectionImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDataCollection()
     * @generated
     */
    EClass DATA_COLLECTION = eINSTANCE.getDataCollection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_COLLECTION__NAME = eINSTANCE.getDataCollection_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_COLLECTION__DESCRIPTION = eINSTANCE.getDataCollection_Description();

    /**
     * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COLLECTION__POLICIES = eINSTANCE.getDataCollection_Policies();

    /**
     * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COLLECTION__PRODUCTS = eINSTANCE.getDataCollection_Products();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.DeploymentImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeployment()
     * @generated
     */
    EClass DEPLOYMENT = eINSTANCE.getDeployment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__DESCRIPTION = eINSTANCE.getDeployment_Description();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__COMPONENTS = eINSTANCE.getDeployment_Components();

    /**
     * The meta object literal for the '<em><b>Catalogs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__CATALOGS = eINSTANCE.getDeployment_Catalogs();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.ComponentImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

    /**
     * The meta object literal for the '<em><b>State Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__STATE_VARIABLES = eINSTANCE.getComponent_StateVariables();

    /**
     * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__CONTROLLERS = eINSTANCE.getComponent_Controllers();

    /**
     * The meta object literal for the '<em><b>Estimators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ESTIMATORS = eINSTANCE.getComponent_Estimators();

    /**
     * The meta object literal for the '<em><b>Adapters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ADAPTERS = eINSTANCE.getComponent_Adapters();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.StateVariableImpl <em>State Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.StateVariableImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getStateVariable()
     * @generated
     */
    EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE__NAME = eINSTANCE.getStateVariable_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE__DESCRIPTION = eINSTANCE.getStateVariable_Description();

    /**
     * The meta object literal for the '<em><b>Representation Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VARIABLE__REPRESENTATION_TYPE = eINSTANCE.getStateVariable_RepresentationType();

    /**
     * The meta object literal for the '<em><b>In State Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VARIABLE__IN_STATE_CONSTRAINTS = eINSTANCE.getStateVariable_InStateConstraints();

    /**
     * The meta object literal for the '<em><b>Out State Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VARIABLE__OUT_STATE_CONSTRAINTS = eINSTANCE.getStateVariable_OutStateConstraints();

    /**
     * The meta object literal for the '<em><b>State Updates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VARIABLE__STATE_UPDATES = eINSTANCE.getStateVariable_StateUpdates();

    /**
     * The meta object literal for the '<em><b>Influenced By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VARIABLE__INFLUENCED_BY = eINSTANCE.getStateVariable_InfluencedBy();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.ControllerImpl <em>Controller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.ControllerImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getController()
     * @generated
     */
    EClass CONTROLLER = eINSTANCE.getController();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROLLER__DESCRIPTION = eINSTANCE.getController_Description();

    /**
     * The meta object literal for the '<em><b>Delegates</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__DELEGATES = eINSTANCE.getController_Delegates();

    /**
     * The meta object literal for the '<em><b>State Constraint</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__STATE_CONSTRAINT = eINSTANCE.getController_StateConstraint();

    /**
     * The meta object literal for the '<em><b>Hardware Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__HARDWARE_COMMAND = eINSTANCE.getController_HardwareCommand();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.EstimatorImpl <em>Estimator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.EstimatorImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getEstimator()
     * @generated
     */
    EClass ESTIMATOR = eINSTANCE.getEstimator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTIMATOR__NAME = eINSTANCE.getEstimator_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTIMATOR__DESCRIPTION = eINSTANCE.getEstimator_Description();

    /**
     * The meta object literal for the '<em><b>Distilled Measurements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTIMATOR__DISTILLED_MEASUREMENTS = eINSTANCE.getEstimator_DistilledMeasurements();

    /**
     * The meta object literal for the '<em><b>State Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTIMATOR__STATE_CONSTRAINTS = eINSTANCE.getEstimator_StateConstraints();

    /**
     * The meta object literal for the '<em><b>State Updates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTIMATOR__STATE_UPDATES = eINSTANCE.getEstimator_StateUpdates();

    /**
     * The meta object literal for the '<em><b>Hardware Measurement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTIMATOR__HARDWARE_MEASUREMENT = eINSTANCE.getEstimator_HardwareMeasurement();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.StateConstraintImpl <em>State Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.StateConstraintImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getStateConstraint()
     * @generated
     */
    EClass STATE_CONSTRAINT = eINSTANCE.getStateConstraint();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_CONSTRAINT__NAME = eINSTANCE.getStateConstraint_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_CONSTRAINT__DESCRIPTION = eINSTANCE.getStateConstraint_Description();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.StateUpdateImpl <em>State Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.StateUpdateImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getStateUpdate()
     * @generated
     */
    EClass STATE_UPDATE = eINSTANCE.getStateUpdate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_UPDATE__NAME = eINSTANCE.getStateUpdate_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_UPDATE__DESCRIPTION = eINSTANCE.getStateUpdate_Description();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.HardwareCommandImpl <em>Hardware Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.HardwareCommandImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareCommand()
     * @generated
     */
    EClass HARDWARE_COMMAND = eINSTANCE.getHardwareCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HARDWARE_COMMAND__NAME = eINSTANCE.getHardwareCommand_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HARDWARE_COMMAND__DESCRIPTION = eINSTANCE.getHardwareCommand_Description();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.HardwareMeasurementImpl <em>Hardware Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.HardwareMeasurementImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareMeasurement()
     * @generated
     */
    EClass HARDWARE_MEASUREMENT = eINSTANCE.getHardwareMeasurement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HARDWARE_MEASUREMENT__NAME = eINSTANCE.getHardwareMeasurement_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HARDWARE_MEASUREMENT__DESCRIPTION = eINSTANCE.getHardwareMeasurement_Description();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.DeviceImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDevice()
     * @generated
     */
    EClass DEVICE = eINSTANCE.getDevice();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE__DESCRIPTION = eINSTANCE.getDevice_Description();

    /**
     * The meta object literal for the '<em><b>Device Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__DEVICE_COMMANDS = eINSTANCE.getDevice_DeviceCommands();

    /**
     * The meta object literal for the '<em><b>Device Measurements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE__DEVICE_MEASUREMENTS = eINSTANCE.getDevice_DeviceMeasurements();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.DeviceCommandImpl <em>Device Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.DeviceCommandImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceCommand()
     * @generated
     */
    EClass DEVICE_COMMAND = eINSTANCE.getDeviceCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_COMMAND__NAME = eINSTANCE.getDeviceCommand_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_COMMAND__DESCRIPTION = eINSTANCE.getDeviceCommand_Description();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.DeviceMeasurementImpl <em>Device Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.DeviceMeasurementImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceMeasurement()
     * @generated
     */
    EClass DEVICE_MEASUREMENT = eINSTANCE.getDeviceMeasurement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_MEASUREMENT__NAME = eINSTANCE.getDeviceMeasurement_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_MEASUREMENT__DESCRIPTION = eINSTANCE.getDeviceMeasurement_Description();

    /**
     * The meta object literal for the '{@link stateAnalysis.impl.HardwareAdapterImpl <em>Hardware Adapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see stateAnalysis.impl.HardwareAdapterImpl
     * @see stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareAdapter()
     * @generated
     */
    EClass HARDWARE_ADAPTER = eINSTANCE.getHardwareAdapter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HARDWARE_ADAPTER__NAME = eINSTANCE.getHardwareAdapter_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HARDWARE_ADAPTER__DESCRIPTION = eINSTANCE.getHardwareAdapter_Description();

    /**
     * The meta object literal for the '<em><b>Hardware Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__HARDWARE_COMMANDS = eINSTANCE.getHardwareAdapter_HardwareCommands();

    /**
     * The meta object literal for the '<em><b>Hardware Measurements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS = eINSTANCE.getHardwareAdapter_HardwareMeasurements();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__DEVICES = eINSTANCE.getHardwareAdapter_Devices();

  }

} //StateAnalysisPackage
