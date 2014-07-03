/**
 */
package stateAnalysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateAnalysis.Device;
import stateAnalysis.DeviceCommand;
import stateAnalysis.DeviceMeasurement;
import stateAnalysis.HardwareAdapter;
import stateAnalysis.HardwareCommand;
import stateAnalysis.HardwareMeasurement;
import stateAnalysis.StateAnalysisPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link stateAnalysis.impl.HardwareAdapterImpl#getHardwareCommands <em>Hardware Commands</em>}</li>
 *   <li>{@link stateAnalysis.impl.HardwareAdapterImpl#getHardwareMeasurements <em>Hardware Measurements</em>}</li>
 *   <li>{@link stateAnalysis.impl.HardwareAdapterImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareAdapterImpl extends ComponentImpl implements HardwareAdapter
{
  /**
   * The cached value of the '{@link #getHardwareCommands() <em>Hardware Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardwareCommands()
   * @generated
   * @ordered
   */
  protected EList<HardwareCommand> hardwareCommands;

  /**
   * The cached value of the '{@link #getHardwareMeasurements() <em>Hardware Measurements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardwareMeasurements()
   * @generated
   * @ordered
   */
  protected EList<HardwareMeasurement> hardwareMeasurements;

  /**
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<Device> devices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HardwareAdapterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StateAnalysisPackage.Literals.HARDWARE_ADAPTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HardwareCommand> getHardwareCommands()
  {
    if (hardwareCommands == null)
    {
      hardwareCommands = new EObjectContainmentEList<HardwareCommand>(HardwareCommand.class, this, StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS);
    }
    return hardwareCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HardwareMeasurement> getHardwareMeasurements()
  {
    if (hardwareMeasurements == null)
    {
      hardwareMeasurements = new EObjectContainmentEList<HardwareMeasurement>(HardwareMeasurement.class, this, StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS);
    }
    return hardwareMeasurements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Device> getDevices()
  {
    if (devices == null)
    {
      devices = new EObjectContainmentEList<Device>(Device.class, this, StateAnalysisPackage.HARDWARE_ADAPTER__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        return ((InternalEList<?>)getHardwareCommands()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        return ((InternalEList<?>)getHardwareMeasurements()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICES:
        return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        return getHardwareCommands();
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        return getHardwareMeasurements();
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICES:
        return getDevices();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        getHardwareCommands().clear();
        getHardwareCommands().addAll((Collection<? extends HardwareCommand>)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        getHardwareMeasurements().clear();
        getHardwareMeasurements().addAll((Collection<? extends HardwareMeasurement>)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Device>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        getHardwareCommands().clear();
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        getHardwareMeasurements().clear();
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICES:
        getDevices().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        return hardwareCommands != null && !hardwareCommands.isEmpty();
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        return hardwareMeasurements != null && !hardwareMeasurements.isEmpty();
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICES:
        return devices != null && !devices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HardwareAdapterImpl
