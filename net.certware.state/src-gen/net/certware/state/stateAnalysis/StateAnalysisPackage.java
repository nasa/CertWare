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
   * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SUBSYSTEMS = 0;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Deployment Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM__DEPLOYMENT_SETS = 1;

  /**
   * The number of structural features of the '<em>Subsystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSYSTEM_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SET__DEPLOYMENTS = 1;

  /**
   * The number of structural features of the '<em>Deployment Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_SET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeploymentImpl <em>Deployment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeploymentImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeployment()
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
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__COMPONENTS = 1;

  /**
   * The number of structural features of the '<em>Deployment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.ComponentImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getComponent()
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
   * The feature id for the '<em><b>Sv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__SV = 1;

  /**
   * The feature id for the '<em><b>Controller</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CONTROLLER = 2;

  /**
   * The feature id for the '<em><b>Estimator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ESTIMATOR = 3;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.StateVariableImpl <em>State Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.StateVariableImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateVariable()
   * @generated
   */
  int STATE_VARIABLE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>State Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__STATE_CONSTRAINTS = 1;

  /**
   * The feature id for the '<em><b>State Updates</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE__STATE_UPDATES = 2;

  /**
   * The number of structural features of the '<em>State Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VARIABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.ControllerImpl <em>Controller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.ControllerImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getController()
   * @generated
   */
  int CONTROLLER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__NAME = 0;

  /**
   * The feature id for the '<em><b>State Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__STATE_CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Hardware Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__HARDWARE_COMMAND = 2;

  /**
   * The number of structural features of the '<em>Controller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.EstimatorImpl <em>Estimator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.EstimatorImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getEstimator()
   * @generated
   */
  int ESTIMATOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Hardware Measurement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR__HARDWARE_MEASUREMENT = 1;

  /**
   * The number of structural features of the '<em>Estimator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTIMATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.StateConstraintImpl <em>State Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.StateConstraintImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateConstraint()
   * @generated
   */
  int STATE_CONSTRAINT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONSTRAINT__NAME = 0;

  /**
   * The feature id for the '<em><b>Controllers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONSTRAINT__CONTROLLERS = 1;

  /**
   * The feature id for the '<em><b>Estimators</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONSTRAINT__ESTIMATORS = 2;

  /**
   * The number of structural features of the '<em>State Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.StateUpdateImpl <em>State Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.StateUpdateImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getStateUpdate()
   * @generated
   */
  int STATE_UPDATE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_UPDATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Controllers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_UPDATE__CONTROLLERS = 1;

  /**
   * The feature id for the '<em><b>Estimators</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_UPDATE__ESTIMATORS = 2;

  /**
   * The number of structural features of the '<em>State Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_UPDATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.HardwareCommandImpl <em>Hardware Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.HardwareCommandImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareCommand()
   * @generated
   */
  int HARDWARE_COMMAND = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Controller</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_COMMAND__CONTROLLER = 1;

  /**
   * The feature id for the '<em><b>Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_COMMAND__ADAPTER = 2;

  /**
   * The number of structural features of the '<em>Hardware Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_COMMAND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl <em>Hardware Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareMeasurement()
   * @generated
   */
  int HARDWARE_MEASUREMENT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_MEASUREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_MEASUREMENT__ADAPTER = 1;

  /**
   * The feature id for the '<em><b>Estimator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_MEASUREMENT__ESTIMATOR = 2;

  /**
   * The number of structural features of the '<em>Hardware Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_MEASUREMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeviceImpl <em>Device</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeviceImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDevice()
   * @generated
   */
  int DEVICE = 12;

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
   * The number of structural features of the '<em>Device</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeviceCommandImpl <em>Device Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeviceCommandImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceCommand()
   * @generated
   */
  int DEVICE_COMMAND = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_COMMAND__ADAPTER = 1;

  /**
   * The feature id for the '<em><b>Device</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_COMMAND__DEVICE = 2;

  /**
   * The number of structural features of the '<em>Device Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_COMMAND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.DeviceMeasurementImpl <em>Device Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.DeviceMeasurementImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getDeviceMeasurement()
   * @generated
   */
  int DEVICE_MEASUREMENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEASUREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEASUREMENT__ADAPTER = 1;

  /**
   * The feature id for the '<em><b>Device</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEASUREMENT__DEVICE = 2;

  /**
   * The number of structural features of the '<em>Device Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEASUREMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl <em>Hardware Adapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.state.stateAnalysis.impl.HardwareAdapterImpl
   * @see net.certware.state.stateAnalysis.impl.StateAnalysisPackageImpl#getHardwareAdapter()
   * @generated
   */
  int HARDWARE_ADAPTER = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Hardware Commands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__HARDWARE_COMMANDS = 1;

  /**
   * The feature id for the '<em><b>Hardware Measurements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS = 2;

  /**
   * The feature id for the '<em><b>Device Commands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__DEVICE_COMMANDS = 3;

  /**
   * The feature id for the '<em><b>Device Measurements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER__DEVICE_MEASUREMENTS = 4;

  /**
   * The number of structural features of the '<em>Hardware Adapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HARDWARE_ADAPTER_FEATURE_COUNT = 5;


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
   * Returns the meta object for the containment reference '{@link net.certware.state.stateAnalysis.Component#getSv <em>Sv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sv</em>'.
   * @see net.certware.state.stateAnalysis.Component#getSv()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Sv();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Component#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controller</em>'.
   * @see net.certware.state.stateAnalysis.Component#getController()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Controller();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.state.stateAnalysis.Component#getEstimator <em>Estimator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Estimator</em>'.
   * @see net.certware.state.stateAnalysis.Component#getEstimator()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Estimator();

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
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.StateVariable#getStateConstraints <em>State Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>State Constraints</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getStateConstraints()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_StateConstraints();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.StateVariable#getStateUpdates <em>State Updates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>State Updates</em>'.
   * @see net.certware.state.stateAnalysis.StateVariable#getStateUpdates()
   * @see #getStateVariable()
   * @generated
   */
  EReference getStateVariable_StateUpdates();

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
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.StateConstraint#getControllers <em>Controllers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Controllers</em>'.
   * @see net.certware.state.stateAnalysis.StateConstraint#getControllers()
   * @see #getStateConstraint()
   * @generated
   */
  EReference getStateConstraint_Controllers();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.StateConstraint#getEstimators <em>Estimators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Estimators</em>'.
   * @see net.certware.state.stateAnalysis.StateConstraint#getEstimators()
   * @see #getStateConstraint()
   * @generated
   */
  EReference getStateConstraint_Estimators();

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
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.StateUpdate#getControllers <em>Controllers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Controllers</em>'.
   * @see net.certware.state.stateAnalysis.StateUpdate#getControllers()
   * @see #getStateUpdate()
   * @generated
   */
  EReference getStateUpdate_Controllers();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.StateUpdate#getEstimators <em>Estimators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Estimators</em>'.
   * @see net.certware.state.stateAnalysis.StateUpdate#getEstimators()
   * @see #getStateUpdate()
   * @generated
   */
  EReference getStateUpdate_Estimators();

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
   * Returns the meta object for the reference '{@link net.certware.state.stateAnalysis.HardwareCommand#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Controller</em>'.
   * @see net.certware.state.stateAnalysis.HardwareCommand#getController()
   * @see #getHardwareCommand()
   * @generated
   */
  EReference getHardwareCommand_Controller();

  /**
   * Returns the meta object for the reference '{@link net.certware.state.stateAnalysis.HardwareCommand#getAdapter <em>Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Adapter</em>'.
   * @see net.certware.state.stateAnalysis.HardwareCommand#getAdapter()
   * @see #getHardwareCommand()
   * @generated
   */
  EReference getHardwareCommand_Adapter();

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
   * Returns the meta object for the reference '{@link net.certware.state.stateAnalysis.HardwareMeasurement#getAdapter <em>Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Adapter</em>'.
   * @see net.certware.state.stateAnalysis.HardwareMeasurement#getAdapter()
   * @see #getHardwareMeasurement()
   * @generated
   */
  EReference getHardwareMeasurement_Adapter();

  /**
   * Returns the meta object for the reference '{@link net.certware.state.stateAnalysis.HardwareMeasurement#getEstimator <em>Estimator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Estimator</em>'.
   * @see net.certware.state.stateAnalysis.HardwareMeasurement#getEstimator()
   * @see #getHardwareMeasurement()
   * @generated
   */
  EReference getHardwareMeasurement_Estimator();

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
   * Returns the meta object for the reference '{@link net.certware.state.stateAnalysis.DeviceCommand#getAdapter <em>Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Adapter</em>'.
   * @see net.certware.state.stateAnalysis.DeviceCommand#getAdapter()
   * @see #getDeviceCommand()
   * @generated
   */
  EReference getDeviceCommand_Adapter();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.state.stateAnalysis.DeviceCommand#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Device</em>'.
   * @see net.certware.state.stateAnalysis.DeviceCommand#getDevice()
   * @see #getDeviceCommand()
   * @generated
   */
  EReference getDeviceCommand_Device();

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
   * Returns the meta object for the reference '{@link net.certware.state.stateAnalysis.DeviceMeasurement#getAdapter <em>Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Adapter</em>'.
   * @see net.certware.state.stateAnalysis.DeviceMeasurement#getAdapter()
   * @see #getDeviceMeasurement()
   * @generated
   */
  EReference getDeviceMeasurement_Adapter();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.state.stateAnalysis.DeviceMeasurement#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Device</em>'.
   * @see net.certware.state.stateAnalysis.DeviceMeasurement#getDevice()
   * @see #getDeviceMeasurement()
   * @generated
   */
  EReference getDeviceMeasurement_Device();

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
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getHardwareCommands <em>Hardware Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Hardware Commands</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getHardwareCommands()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_HardwareCommands();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getHardwareMeasurements <em>Hardware Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Hardware Measurements</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getHardwareMeasurements()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_HardwareMeasurements();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getDeviceCommands <em>Device Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Device Commands</em>'.
   * @see net.certware.state.stateAnalysis.HardwareAdapter#getDeviceCommands()
   * @see #getHardwareAdapter()
   * @generated
   */
  EReference getHardwareAdapter_DeviceCommands();

  /**
   * Returns the meta object for the reference list '{@link net.certware.state.stateAnalysis.HardwareAdapter#getDeviceMeasurements <em>Device Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Device Measurements</em>'.
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
     * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_SET__DEPLOYMENTS = eINSTANCE.getDeploymentSet_Deployments();

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
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__COMPONENTS = eINSTANCE.getDeployment_Components();

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
     * The meta object literal for the '<em><b>Sv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__SV = eINSTANCE.getComponent_Sv();

    /**
     * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__CONTROLLER = eINSTANCE.getComponent_Controller();

    /**
     * The meta object literal for the '<em><b>Estimator</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ESTIMATOR = eINSTANCE.getComponent_Estimator();

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
     * The meta object literal for the '<em><b>State Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VARIABLE__STATE_CONSTRAINTS = eINSTANCE.getStateVariable_StateConstraints();

    /**
     * The meta object literal for the '<em><b>State Updates</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_VARIABLE__STATE_UPDATES = eINSTANCE.getStateVariable_StateUpdates();

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
     * The meta object literal for the '<em><b>Controllers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONSTRAINT__CONTROLLERS = eINSTANCE.getStateConstraint_Controllers();

    /**
     * The meta object literal for the '<em><b>Estimators</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONSTRAINT__ESTIMATORS = eINSTANCE.getStateConstraint_Estimators();

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
     * The meta object literal for the '<em><b>Controllers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_UPDATE__CONTROLLERS = eINSTANCE.getStateUpdate_Controllers();

    /**
     * The meta object literal for the '<em><b>Estimators</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_UPDATE__ESTIMATORS = eINSTANCE.getStateUpdate_Estimators();

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
     * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_COMMAND__CONTROLLER = eINSTANCE.getHardwareCommand_Controller();

    /**
     * The meta object literal for the '<em><b>Adapter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_COMMAND__ADAPTER = eINSTANCE.getHardwareCommand_Adapter();

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
     * The meta object literal for the '<em><b>Adapter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_MEASUREMENT__ADAPTER = eINSTANCE.getHardwareMeasurement_Adapter();

    /**
     * The meta object literal for the '<em><b>Estimator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_MEASUREMENT__ESTIMATOR = eINSTANCE.getHardwareMeasurement_Estimator();

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
     * The meta object literal for the '<em><b>Adapter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_COMMAND__ADAPTER = eINSTANCE.getDeviceCommand_Adapter();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_COMMAND__DEVICE = eINSTANCE.getDeviceCommand_Device();

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
     * The meta object literal for the '<em><b>Adapter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_MEASUREMENT__ADAPTER = eINSTANCE.getDeviceMeasurement_Adapter();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_MEASUREMENT__DEVICE = eINSTANCE.getDeviceMeasurement_Device();

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
     * The meta object literal for the '<em><b>Hardware Commands</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__HARDWARE_COMMANDS = eINSTANCE.getHardwareAdapter_HardwareCommands();

    /**
     * The meta object literal for the '<em><b>Hardware Measurements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS = eINSTANCE.getHardwareAdapter_HardwareMeasurements();

    /**
     * The meta object literal for the '<em><b>Device Commands</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__DEVICE_COMMANDS = eINSTANCE.getHardwareAdapter_DeviceCommands();

    /**
     * The meta object literal for the '<em><b>Device Measurements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HARDWARE_ADAPTER__DEVICE_MEASUREMENTS = eINSTANCE.getHardwareAdapter_DeviceMeasurements();

  }

} //StateAnalysisPackage
