/**
 */
package net.certware.state.stateAnalysis.util;

import net.certware.state.stateAnalysis.Component;
import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.Deployment;
import net.certware.state.stateAnalysis.DeploymentSet;
import net.certware.state.stateAnalysis.Device;
import net.certware.state.stateAnalysis.DeviceCommand;
import net.certware.state.stateAnalysis.DeviceMeasurement;
import net.certware.state.stateAnalysis.Estimator;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.HardwareCommand;
import net.certware.state.stateAnalysis.HardwareMeasurement;
import net.certware.state.stateAnalysis.StateAnalysisPackage;
import net.certware.state.stateAnalysis.StateConstraint;
import net.certware.state.stateAnalysis.StateUpdate;
import net.certware.state.stateAnalysis.StateVariable;
import net.certware.state.stateAnalysis.Subsystem;

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
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage
 * @generated
 */
public class StateAnalysisSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StateAnalysisPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateAnalysisSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StateAnalysisPackage.eINSTANCE;
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
      case StateAnalysisPackage.SYSTEM:
      {
        net.certware.state.stateAnalysis.System system = (net.certware.state.stateAnalysis.System)theEObject;
        T result = caseSystem(system);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.SUBSYSTEM:
      {
        Subsystem subsystem = (Subsystem)theEObject;
        T result = caseSubsystem(subsystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.DEPLOYMENT_SET:
      {
        DeploymentSet deploymentSet = (DeploymentSet)theEObject;
        T result = caseDeploymentSet(deploymentSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.DEPLOYMENT:
      {
        Deployment deployment = (Deployment)theEObject;
        T result = caseDeployment(deployment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.STATE_VARIABLE:
      {
        StateVariable stateVariable = (StateVariable)theEObject;
        T result = caseStateVariable(stateVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.CONTROLLER:
      {
        Controller controller = (Controller)theEObject;
        T result = caseController(controller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.ESTIMATOR:
      {
        Estimator estimator = (Estimator)theEObject;
        T result = caseEstimator(estimator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.STATE_CONSTRAINT:
      {
        StateConstraint stateConstraint = (StateConstraint)theEObject;
        T result = caseStateConstraint(stateConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.STATE_UPDATE:
      {
        StateUpdate stateUpdate = (StateUpdate)theEObject;
        T result = caseStateUpdate(stateUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.HARDWARE_COMMAND:
      {
        HardwareCommand hardwareCommand = (HardwareCommand)theEObject;
        T result = caseHardwareCommand(hardwareCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.HARDWARE_MEASUREMENT:
      {
        HardwareMeasurement hardwareMeasurement = (HardwareMeasurement)theEObject;
        T result = caseHardwareMeasurement(hardwareMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.DEVICE:
      {
        Device device = (Device)theEObject;
        T result = caseDevice(device);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.DEVICE_COMMAND:
      {
        DeviceCommand deviceCommand = (DeviceCommand)theEObject;
        T result = caseDeviceCommand(deviceCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.DEVICE_MEASUREMENT:
      {
        DeviceMeasurement deviceMeasurement = (DeviceMeasurement)theEObject;
        T result = caseDeviceMeasurement(deviceMeasurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StateAnalysisPackage.HARDWARE_ADAPTER:
      {
        HardwareAdapter hardwareAdapter = (HardwareAdapter)theEObject;
        T result = caseHardwareAdapter(hardwareAdapter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(net.certware.state.stateAnalysis.System object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubsystem(Subsystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentSet(DeploymentSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployment(Deployment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateVariable(StateVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseController(Controller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Estimator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estimator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEstimator(Estimator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateConstraint(StateConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateUpdate(StateUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hardware Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hardware Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardwareCommand(HardwareCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hardware Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hardware Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardwareMeasurement(HardwareMeasurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDevice(Device object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceCommand(DeviceCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceMeasurement(DeviceMeasurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hardware Adapter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hardware Adapter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHardwareAdapter(HardwareAdapter object)
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

} //StateAnalysisSwitch
