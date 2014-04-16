/**
 */
package net.certware.state.stateAnalysis.impl;

import net.certware.state.stateAnalysis.Device;
import net.certware.state.stateAnalysis.DeviceCommand;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.StateAnalysisPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DeviceCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DeviceCommandImpl#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DeviceCommandImpl#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceCommandImpl extends MinimalEObjectImpl.Container implements DeviceCommand
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
   * The cached value of the '{@link #getAdapter() <em>Adapter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapter()
   * @generated
   * @ordered
   */
  protected HardwareAdapter adapter;

  /**
   * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevice()
   * @generated
   * @ordered
   */
  protected Device device;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceCommandImpl()
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
    return StateAnalysisPackage.Literals.DEVICE_COMMAND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEVICE_COMMAND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareAdapter getAdapter()
  {
    if (adapter != null && adapter.eIsProxy())
    {
      InternalEObject oldAdapter = (InternalEObject)adapter;
      adapter = (HardwareAdapter)eResolveProxy(oldAdapter);
      if (adapter != oldAdapter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateAnalysisPackage.DEVICE_COMMAND__ADAPTER, oldAdapter, adapter));
      }
    }
    return adapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareAdapter basicGetAdapter()
  {
    return adapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdapter(HardwareAdapter newAdapter)
  {
    HardwareAdapter oldAdapter = adapter;
    adapter = newAdapter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEVICE_COMMAND__ADAPTER, oldAdapter, adapter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device getDevice()
  {
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs)
  {
    Device oldDevice = device;
    device = newDevice;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEVICE_COMMAND__DEVICE, oldDevice, newDevice);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDevice(Device newDevice)
  {
    if (newDevice != device)
    {
      NotificationChain msgs = null;
      if (device != null)
        msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateAnalysisPackage.DEVICE_COMMAND__DEVICE, null, msgs);
      if (newDevice != null)
        msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateAnalysisPackage.DEVICE_COMMAND__DEVICE, null, msgs);
      msgs = basicSetDevice(newDevice, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEVICE_COMMAND__DEVICE, newDevice, newDevice));
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
      case StateAnalysisPackage.DEVICE_COMMAND__DEVICE:
        return basicSetDevice(null, msgs);
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
      case StateAnalysisPackage.DEVICE_COMMAND__NAME:
        return getName();
      case StateAnalysisPackage.DEVICE_COMMAND__ADAPTER:
        if (resolve) return getAdapter();
        return basicGetAdapter();
      case StateAnalysisPackage.DEVICE_COMMAND__DEVICE:
        return getDevice();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DEVICE_COMMAND__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.DEVICE_COMMAND__ADAPTER:
        setAdapter((HardwareAdapter)newValue);
        return;
      case StateAnalysisPackage.DEVICE_COMMAND__DEVICE:
        setDevice((Device)newValue);
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
      case StateAnalysisPackage.DEVICE_COMMAND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.DEVICE_COMMAND__ADAPTER:
        setAdapter((HardwareAdapter)null);
        return;
      case StateAnalysisPackage.DEVICE_COMMAND__DEVICE:
        setDevice((Device)null);
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
      case StateAnalysisPackage.DEVICE_COMMAND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.DEVICE_COMMAND__ADAPTER:
        return adapter != null;
      case StateAnalysisPackage.DEVICE_COMMAND__DEVICE:
        return device != null;
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
    result.append(')');
    return result.toString();
  }

} //DeviceCommandImpl
