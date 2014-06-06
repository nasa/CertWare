/**
 */
package net.certware.state.stateAnalysis.impl;

import java.util.Collection;

import net.certware.state.stateAnalysis.DeviceCommand;
import net.certware.state.stateAnalysis.DeviceMeasurement;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.HardwareCommand;
import net.certware.state.stateAnalysis.HardwareMeasurement;
import net.certware.state.stateAnalysis.StateAnalysisPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl#getHardwareCommands <em>Hardware Commands</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl#getHardwareMeasurements <em>Hardware Measurements</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl#getDeviceCommands <em>Device Commands</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareAdapterImpl#getDeviceMeasurements <em>Device Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareAdapterImpl extends MinimalEObjectImpl.Container implements HardwareAdapter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

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
   * The cached value of the '{@link #getDeviceCommands() <em>Device Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceCommands()
   * @generated
   * @ordered
   */
  protected EList<DeviceCommand> deviceCommands;

  /**
   * The cached value of the '{@link #getDeviceMeasurements() <em>Device Measurements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceMeasurements()
   * @generated
   * @ordered
   */
  protected EList<DeviceMeasurement> deviceMeasurements;

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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_ADAPTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_ADAPTER__DESCRIPTION, oldDescription, description));
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
  public EList<DeviceCommand> getDeviceCommands()
  {
    if (deviceCommands == null)
    {
      deviceCommands = new EObjectContainmentEList<DeviceCommand>(DeviceCommand.class, this, StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_COMMANDS);
    }
    return deviceCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceMeasurement> getDeviceMeasurements()
  {
    if (deviceMeasurements == null)
    {
      deviceMeasurements = new EObjectContainmentEList<DeviceMeasurement>(DeviceMeasurement.class, this, StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_MEASUREMENTS);
    }
    return deviceMeasurements;
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
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_COMMANDS:
        return ((InternalEList<?>)getDeviceCommands()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_MEASUREMENTS:
        return ((InternalEList<?>)getDeviceMeasurements()).basicRemove(otherEnd, msgs);
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
      case StateAnalysisPackage.HARDWARE_ADAPTER__NAME:
        return getName();
      case StateAnalysisPackage.HARDWARE_ADAPTER__DESCRIPTION:
        return getDescription();
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        return getHardwareCommands();
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        return getHardwareMeasurements();
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_COMMANDS:
        return getDeviceCommands();
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_MEASUREMENTS:
        return getDeviceMeasurements();
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
      case StateAnalysisPackage.HARDWARE_ADAPTER__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        getHardwareCommands().clear();
        getHardwareCommands().addAll((Collection<? extends HardwareCommand>)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        getHardwareMeasurements().clear();
        getHardwareMeasurements().addAll((Collection<? extends HardwareMeasurement>)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_COMMANDS:
        getDeviceCommands().clear();
        getDeviceCommands().addAll((Collection<? extends DeviceCommand>)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_MEASUREMENTS:
        getDeviceMeasurements().clear();
        getDeviceMeasurements().addAll((Collection<? extends DeviceMeasurement>)newValue);
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
      case StateAnalysisPackage.HARDWARE_ADAPTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        getHardwareCommands().clear();
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        getHardwareMeasurements().clear();
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_COMMANDS:
        getDeviceCommands().clear();
        return;
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_MEASUREMENTS:
        getDeviceMeasurements().clear();
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
      case StateAnalysisPackage.HARDWARE_ADAPTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.HARDWARE_ADAPTER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_COMMANDS:
        return hardwareCommands != null && !hardwareCommands.isEmpty();
      case StateAnalysisPackage.HARDWARE_ADAPTER__HARDWARE_MEASUREMENTS:
        return hardwareMeasurements != null && !hardwareMeasurements.isEmpty();
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_COMMANDS:
        return deviceCommands != null && !deviceCommands.isEmpty();
      case StateAnalysisPackage.HARDWARE_ADAPTER__DEVICE_MEASUREMENTS:
        return deviceMeasurements != null && !deviceMeasurements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //HardwareAdapterImpl
