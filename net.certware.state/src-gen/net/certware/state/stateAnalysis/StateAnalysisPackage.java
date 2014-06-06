/**
 */
package net.certware.state.stateAnalysis;

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
 * @see net.certware.state.stateAnalysis.StateAnalysisFactory
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
  String eNS_URI = "http://www.certware.net/state/StateAnalysis";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "stateAnalysis";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateAnalysisPackage eINSTANCE = net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.SystemImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getSystem()
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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.SubsystemImpl <em>Subsystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.SubsystemImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getSubsystem()
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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeploymentSetImpl <em>Deployment Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeploymentSetImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeploymentSet()
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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.QosPolicyImpl <em>Qos Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.QosPolicyImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getQosPolicy()
   * @generated
   */
  int QOS_POLICY = 3;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DataProductImpl <em>Data Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DataProductImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDataProduct()
   * @generated
   */
  int DATA_PRODUCT = 4;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DataCollectionImpl <em>Data Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DataCollectionImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDataCollection()
   * @generated
   */
  int DATA_COLLECTION = 5;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeploymentImpl <em>Deployment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeploymentImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeployment()
   * @generated
   */
  int DEPLOYMENT = 6;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.ComponentImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 7;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.StateVariableImpl <em>State Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.StateVariableImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateVariable()
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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.ControllerImpl <em>Controller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.ControllerImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getController()
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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.EstimatorImpl <em>Estimator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.EstimatorImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getEstimator()
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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.StateConstraintImpl <em>State Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.StateConstraintImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateConstraint()
   * @generated
   */
  int STATE_CONSTRAINT = 11;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.StateUpdateImpl <em>State Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.StateUpdateImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateUpdate()
   * @generated
   */
  int STATE_UPDATE = 12;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.HardwareCommandImpl <em>Hardware Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.HardwareCommandImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareCommand()
   * @generated
   */
  int HARDWARE_COMMAND = 13;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl <em>Hardware Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareMeasurement()
   * @generated
   */
  int HARDWARE_MEASUREMENT = 14;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeviceImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 15;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeviceCommandImpl <em>Device Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeviceCommandImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceCommand()
   * @generated
   */
  int DEVICE_COMMAND = 16;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeviceMeasurementImpl <em>Device Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeviceMeasurementImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceMeasurement()
   * @generated
   */
  int DEVICE_MEASUREMENT = 17;

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
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl <em>Hardware Adapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.HardwareAdapterImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareAdapter()
   * @generated
   */
  int HARDWARE_ADAPTER = 18;

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
   * The feature id for the '<em><b>Device Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__DEVICE_COMMANDS = 4;

  /**
   * The feature id for the '<em><b>Device Measurements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__DEVICE_MEASUREMENTS = 5;

  /**
   * The number of structural features of the '<em>Hardware Adapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER_FEATURE_COUNT = 6;


  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see net.certware.state.stateAnalysis.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.System#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.System#getDescription()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.System#getSubsystems <em>Subsystems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsystems</em>'.
   * @see net.certware.state.stateAnalysis.System#getSubsystems()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Subsystems();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.Subsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subsystem</em>'.
   * @see net.certware.state.stateAnalysis.Subsystem
   * @generated
   */
  EClass getSubsystem();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Subsystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.Subsystem#getName()
   * @see #getSubsystem()
   * @generated
   */
  EAttribute getSubsystem_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Subsystem#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.Subsystem#getDescription()
   * @see #getSubsystem()
   * @generated
   */
  EAttribute getSubsystem_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Subsystem#getDeploymentSets <em>Deployment Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployment Sets</em>'.
   * @see net.certware.state.stateAnalysis.Subsystem#getDeploymentSets()
   * @see #getSubsystem()
   * @generated
   */
  EReference getSubsystem_DeploymentSets();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.DeploymentSet <em>Deployment Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Set</em>'.
   * @see net.certware.state.stateAnalysis.DeploymentSet
   * @generated
   */
  EClass getDeploymentSet();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DeploymentSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.DeploymentSet#getName()
   * @see #getDeploymentSet()
   * @generated
   */
  EAttribute getDeploymentSet_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DeploymentSet#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.DeploymentSet#getDescription()
   * @see #getDeploymentSet()
   * @generated
   */
  EAttribute getDeploymentSet_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.DeploymentSet#getDeployments <em>Deployments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployments</em>'.
   * @see net.certware.state.stateAnalysis.DeploymentSet#getDeployments()
   * @see #getDeploymentSet()
   * @generated
   */
  EReference getDeploymentSet_Deployments();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.QosPolicy <em>Qos Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qos Policy</em>'.
   * @see net.certware.state.stateAnalysis.QosPolicy
   * @generated
   */
  EClass getQosPolicy();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.QosPolicy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.QosPolicy#getName()
   * @see #getQosPolicy()
   * @generated
   */
  EAttribute getQosPolicy_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.QosPolicy#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.QosPolicy#getDescription()
   * @see #getQosPolicy()
   * @generated
   */
  EAttribute getQosPolicy_Description();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.QosPolicy#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Policy</em>'.
   * @see net.certware.state.stateAnalysis.QosPolicy#getPolicy()
   * @see #getQosPolicy()
   * @generated
   */
  EAttribute getQosPolicy_Policy();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.DataProduct <em>Data Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Product</em>'.
   * @see net.certware.state.stateAnalysis.DataProduct
   * @generated
   */
  EClass getDataProduct();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DataProduct#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.DataProduct#getName()
   * @see #getDataProduct()
   * @generated
   */
  EAttribute getDataProduct_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DataProduct#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.DataProduct#getDescription()
   * @see #getDataProduct()
   * @generated
   */
  EAttribute getDataProduct_Description();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DataProduct#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see net.certware.state.stateAnalysis.DataProduct#getContent()
   * @see #getDataProduct()
   * @generated
   */
  EAttribute getDataProduct_Content();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.DataCollection <em>Data Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Collection</em>'.
   * @see net.certware.state.stateAnalysis.DataCollection
   * @generated
   */
  EClass getDataCollection();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DataCollection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.DataCollection#getName()
   * @see #getDataCollection()
   * @generated
   */
  EAttribute getDataCollection_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DataCollection#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.DataCollection#getDescription()
   * @see #getDataCollection()
   * @generated
   */
  EAttribute getDataCollection_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.DataCollection#getPolicies <em>Policies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Policies</em>'.
   * @see net.certware.state.stateAnalysis.DataCollection#getPolicies()
   * @see #getDataCollection()
   * @generated
   */
  EReference getDataCollection_Policies();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.DataCollection#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Products</em>'.
   * @see net.certware.state.stateAnalysis.DataCollection#getProducts()
   * @see #getDataCollection()
   * @generated
   */
  EReference getDataCollection_Products();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment</em>'.
   * @see net.certware.state.stateAnalysis.Deployment
   * @generated
   */
  EClass getDeployment();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Deployment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.Deployment#getName()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Deployment#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.Deployment#getDescription()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Deployment#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see net.certware.state.stateAnalysis.Deployment#getComponents()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Components();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Deployment#getCatalogs <em>Catalogs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catalogs</em>'.
   * @see net.certware.state.stateAnalysis.Deployment#getCatalogs()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Catalogs();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see net.certware.state.stateAnalysis.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Component#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.Component#getDescription()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Component#getStateVariables <em>State Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Variables</em>'.
   * @see net.certware.state.stateAnalysis.Component#getStateVariables()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_StateVariables();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Component#getControllers <em>Controllers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controllers</em>'.
   * @see net.certware.state.stateAnalysis.Component#getControllers()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Controllers();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Component#getEstimators <em>Estimators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Estimators</em>'.
   * @see net.certware.state.stateAnalysis.Component#getEstimators()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Estimators();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Component#getAdapters <em>Adapters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Adapters</em>'.
   * @see net.certware.state.stateAnalysis.Component#getAdapters()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Adapters();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.StateVariable <em>State Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Variable</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable
   * @generated
   */
  EClass getStateVariable();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.StateVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getName()
   * @see #getStateVariable()
   * @generated
   */
  EAttribute getStateVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.StateVariable#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getDescription()
   * @see #getStateVariable()
   * @generated
   */
  EAttribute getStateVariable_Description();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.StateVariable#getRepresentationType <em>Representation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Representation Type</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getRepresentationType()
   * @see #getStateVariable()
   * @generated
   */
  EAttribute getStateVariable_RepresentationType();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.StateVariable#getInStateConstraints <em>In State Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>In State Constraints</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getInStateConstraints()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_InStateConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.StateVariable#getOutStateConstraints <em>Out State Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Out State Constraints</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getOutStateConstraints()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_OutStateConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.StateVariable#getStateUpdates <em>State Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Updates</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getStateUpdates()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_StateUpdates();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.StateVariable#getInfluencedBy <em>Influenced By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Influenced By</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getInfluencedBy()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_InfluencedBy();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller</em>'.
   * @see net.certware.state.stateAnalysis.Controller
   * @generated
   */
  EClass getController();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Controller#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.Controller#getName()
   * @see #getController()
   * @generated
   */
  EAttribute getController_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Controller#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.Controller#getDescription()
   * @see #getController()
   * @generated
   */
  EAttribute getController_Description();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.Controller#getDelegates <em>Delegates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Delegates</em>'.
   * @see net.certware.state.stateAnalysis.Controller#getDelegates()
   * @see #getController()
   * @generated
   */
  EReference getController_Delegates();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Controller#getStateConstraint <em>State Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Constraint</em>'.
   * @see net.certware.state.stateAnalysis.Controller#getStateConstraint()
   * @see #getController()
   * @generated
   */
  EReference getController_StateConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Controller#getHardwareCommand <em>Hardware Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Command</em>'.
   * @see net.certware.state.stateAnalysis.Controller#getHardwareCommand()
   * @see #getController()
   * @generated
   */
  EReference getController_HardwareCommand();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.Estimator <em>Estimator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Estimator</em>'.
   * @see net.certware.state.stateAnalysis.Estimator
   * @generated
   */
  EClass getEstimator();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Estimator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.Estimator#getName()
   * @see #getEstimator()
   * @generated
   */
  EAttribute getEstimator_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Estimator#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.Estimator#getDescription()
   * @see #getEstimator()
   * @generated
   */
  EAttribute getEstimator_Description();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.Estimator#getDistilledMeasurements <em>Distilled Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Distilled Measurements</em>'.
   * @see net.certware.state.stateAnalysis.Estimator#getDistilledMeasurements()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_DistilledMeasurements();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Estimator#getStateConstraints <em>State Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Constraints</em>'.
   * @see net.certware.state.stateAnalysis.Estimator#getStateConstraints()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_StateConstraints();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Estimator#getStateUpdates <em>State Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State Updates</em>'.
   * @see net.certware.state.stateAnalysis.Estimator#getStateUpdates()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_StateUpdates();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Estimator#getHardwareMeasurement <em>Hardware Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Measurement</em>'.
   * @see net.certware.state.stateAnalysis.Estimator#getHardwareMeasurement()
   * @see #getEstimator()
   * @generated
   */
  EReference getEstimator_HardwareMeasurement();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.StateConstraint <em>State Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Constraint</em>'.
   * @see net.certware.state.stateAnalysis.StateConstraint
   * @generated
   */
  EClass getStateConstraint();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.StateConstraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.StateConstraint#getName()
   * @see #getStateConstraint()
   * @generated
   */
  EAttribute getStateConstraint_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.StateConstraint#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.StateConstraint#getDescription()
   * @see #getStateConstraint()
   * @generated
   */
  EAttribute getStateConstraint_Description();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.StateUpdate <em>State Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Update</em>'.
   * @see net.certware.state.stateAnalysis.StateUpdate
   * @generated
   */
  EClass getStateUpdate();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.StateUpdate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.StateUpdate#getName()
   * @see #getStateUpdate()
   * @generated
   */
  EAttribute getStateUpdate_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.StateUpdate#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.StateUpdate#getDescription()
   * @see #getStateUpdate()
   * @generated
   */
  EAttribute getStateUpdate_Description();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.HardwareCommand <em>Hardware Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hardware Command</em>'.
   * @see net.certware.state.stateAnalysis.HardwareCommand
   * @generated
   */
  EClass getHardwareCommand();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.HardwareCommand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.HardwareCommand#getName()
   * @see #getHardwareCommand()
   * @generated
   */
  EAttribute getHardwareCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.HardwareCommand#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.HardwareCommand#getDescription()
   * @see #getHardwareCommand()
   * @generated
   */
  EAttribute getHardwareCommand_Description();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.HardwareMeasurement <em>Hardware Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hardware Measurement</em>'.
   * @see net.certware.state.stateAnalysis.HardwareMeasurement
   * @generated
   */
  EClass getHardwareMeasurement();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.HardwareMeasurement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.HardwareMeasurement#getName()
   * @see #getHardwareMeasurement()
   * @generated
   */
  EAttribute getHardwareMeasurement_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.HardwareMeasurement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.HardwareMeasurement#getDescription()
   * @see #getHardwareMeasurement()
   * @generated
   */
  EAttribute getHardwareMeasurement_Description();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device</em>'.
   * @see net.certware.state.stateAnalysis.Device
   * @generated
   */
  EClass getDevice();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Device#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.Device#getName()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.Device#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.Device#getDescription()
   * @see #getDevice()
   * @generated
   */
  EAttribute getDevice_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Device#getDeviceCommands <em>Device Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Commands</em>'.
   * @see net.certware.state.stateAnalysis.Device#getDeviceCommands()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceCommands();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Device#getDeviceMeasurements <em>Device Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Measurements</em>'.
   * @see net.certware.state.stateAnalysis.Device#getDeviceMeasurements()
   * @see #getDevice()
   * @generated
   */
  EReference getDevice_DeviceMeasurements();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.DeviceCommand <em>Device Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Command</em>'.
   * @see net.certware.state.stateAnalysis.DeviceCommand
   * @generated
   */
  EClass getDeviceCommand();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DeviceCommand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.DeviceCommand#getName()
   * @see #getDeviceCommand()
   * @generated
   */
  EAttribute getDeviceCommand_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DeviceCommand#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.DeviceCommand#getDescription()
   * @see #getDeviceCommand()
   * @generated
   */
  EAttribute getDeviceCommand_Description();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.DeviceMeasurement <em>Device Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Measurement</em>'.
   * @see net.certware.state.stateAnalysis.DeviceMeasurement
   * @generated
   */
  EClass getDeviceMeasurement();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DeviceMeasurement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.DeviceMeasurement#getName()
   * @see #getDeviceMeasurement()
   * @generated
   */
  EAttribute getDeviceMeasurement_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.DeviceMeasurement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.DeviceMeasurement#getDescription()
   * @see #getDeviceMeasurement()
   * @generated
   */
  EAttribute getDeviceMeasurement_Description();

  /**
   * Returns the meta object for class '{@link net.certware.state.stateAnalysis.HardwareAdapter <em>Hardware Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hardware Adapter</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter
   * @generated
   */
  EClass getHardwareAdapter();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.HardwareAdapter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getName()
   * @see #getHardwareAdapter()
   * @generated
   */
  EAttribute getHardwareAdapter_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.state.stateAnalysis.HardwareAdapter#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getDescription()
   * @see #getHardwareAdapter()
   * @generated
   */
  EAttribute getHardwareAdapter_Description();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getHardwareCommands <em>Hardware Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Commands</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getHardwareCommands()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_HardwareCommands();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getHardwareMeasurements <em>Hardware Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hardware Measurements</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getHardwareMeasurements()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_HardwareMeasurements();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getDeviceCommands <em>Device Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Commands</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getDeviceCommands()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_DeviceCommands();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getDeviceMeasurements <em>Device Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Device Measurements</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getDeviceMeasurements()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_DeviceMeasurements();

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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.SystemImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getSystem()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.SubsystemImpl <em>Subsystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.SubsystemImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getSubsystem()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.DeploymentSetImpl <em>Deployment Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.DeploymentSetImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeploymentSet()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.QosPolicyImpl <em>Qos Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.QosPolicyImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getQosPolicy()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.DataProductImpl <em>Data Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.DataProductImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDataProduct()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.DataCollectionImpl <em>Data Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.DataCollectionImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDataCollection()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.DeploymentImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeployment()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.ComponentImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getComponent()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.StateVariableImpl <em>State Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.StateVariableImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateVariable()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.ControllerImpl <em>Controller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.ControllerImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getController()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.EstimatorImpl <em>Estimator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.EstimatorImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getEstimator()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.StateConstraintImpl <em>State Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.StateConstraintImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateConstraint()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.StateUpdateImpl <em>State Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.StateUpdateImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateUpdate()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.HardwareCommandImpl <em>Hardware Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.HardwareCommandImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareCommand()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl <em>Hardware Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareMeasurement()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.DeviceImpl <em>Device</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.DeviceImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDevice()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.DeviceCommandImpl <em>Device Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.DeviceCommandImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceCommand()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.DeviceMeasurementImpl <em>Device Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.DeviceMeasurementImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceMeasurement()
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
     * The meta object literal for the '{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl <em>Hardware Adapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.state.stateAnalysis.impl.HardwareAdapterImpl
     * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareAdapter()
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
     * The meta object literal for the '<em><b>Device Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__DEVICE_COMMANDS = eINSTANCE.getHardwareAdapter_DeviceCommands();

    /**
     * The meta object literal for the '<em><b>Device Measurements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__DEVICE_MEASUREMENTS = eINSTANCE.getHardwareAdapter_DeviceMeasurements();

  }

} //StateAnalysisPackage
