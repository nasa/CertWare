/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage
 * @generated
 */
public interface StateAnalysisFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StateAnalysisFactory eINSTANCE = net.certware.state.stateAnalysis.impl.StateAnalysisFactoryImpl.init();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>Subsystem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subsystem</em>'.
   * @generated
   */
  Subsystem createSubsystem();

  /**
   * Returns a new object of class '<em>Deployment Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Set</em>'.
   * @generated
   */
  DeploymentSet createDeploymentSet();

  /**
   * Returns a new object of class '<em>Qos Policy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qos Policy</em>'.
   * @generated
   */
  QosPolicy createQosPolicy();

  /**
   * Returns a new object of class '<em>Data Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Product</em>'.
   * @generated
   */
  DataProduct createDataProduct();

  /**
   * Returns a new object of class '<em>Data Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Collection</em>'.
   * @generated
   */
  DataCollection createDataCollection();

  /**
   * Returns a new object of class '<em>Deployment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment</em>'.
   * @generated
   */
  Deployment createDeployment();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>State Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Variable</em>'.
   * @generated
   */
  StateVariable createStateVariable();

  /**
   * Returns a new object of class '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Controller</em>'.
   * @generated
   */
  Controller createController();

  /**
   * Returns a new object of class '<em>Estimator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Estimator</em>'.
   * @generated
   */
  Estimator createEstimator();

  /**
   * Returns a new object of class '<em>State Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Constraint</em>'.
   * @generated
   */
  StateConstraint createStateConstraint();

  /**
   * Returns a new object of class '<em>State Update</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Update</em>'.
   * @generated
   */
  StateUpdate createStateUpdate();

  /**
   * Returns a new object of class '<em>Hardware Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hardware Command</em>'.
   * @generated
   */
  HardwareCommand createHardwareCommand();

  /**
   * Returns a new object of class '<em>Hardware Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hardware Measurement</em>'.
   * @generated
   */
  HardwareMeasurement createHardwareMeasurement();

  /**
   * Returns a new object of class '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device</em>'.
   * @generated
   */
  Device createDevice();

  /**
   * Returns a new object of class '<em>Device Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Command</em>'.
   * @generated
   */
  DeviceCommand createDeviceCommand();

  /**
   * Returns a new object of class '<em>Device Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Measurement</em>'.
   * @generated
   */
  DeviceMeasurement createDeviceMeasurement();

  /**
   * Returns a new object of class '<em>Hardware Adapter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hardware Adapter</em>'.
   * @generated
   */
  HardwareAdapter createHardwareAdapter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StateAnalysisPackage getStateAnalysisPackage();

} //StateAnalysisFactory
