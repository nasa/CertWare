/**
 */
package net.certware.state.stateAnalysis.impl;

import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.HardwareCommand;
import net.certware.state.stateAnalysis.StateAnalysisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareCommandImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareCommandImpl#getController <em>Controller</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareCommandImpl#getAdapter <em>Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareCommandImpl extends MinimalEObjectImpl.Container implements HardwareCommand
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
   * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected Controller controller;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HardwareCommandImpl()
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
    return StateAnalysisPackage.Literals.HARDWARE_COMMAND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_COMMAND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controller getController()
  {
    if (controller != null && controller.eIsProxy())
    {
      InternalEObject oldController = (InternalEObject)controller;
      controller = (Controller)eResolveProxy(oldController);
      if (controller != oldController)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateAnalysisPackage.HARDWARE_COMMAND__CONTROLLER, oldController, controller));
      }
    }
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Controller basicGetController()
  {
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setController(Controller newController)
  {
    Controller oldController = controller;
    controller = newController;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_COMMAND__CONTROLLER, oldController, controller));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateAnalysisPackage.HARDWARE_COMMAND__ADAPTER, oldAdapter, adapter));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_COMMAND__ADAPTER, oldAdapter, adapter));
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
      case StateAnalysisPackage.HARDWARE_COMMAND__NAME:
        return getName();
      case StateAnalysisPackage.HARDWARE_COMMAND__CONTROLLER:
        if (resolve) return getController();
        return basicGetController();
      case StateAnalysisPackage.HARDWARE_COMMAND__ADAPTER:
        if (resolve) return getAdapter();
        return basicGetAdapter();
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
      case StateAnalysisPackage.HARDWARE_COMMAND__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_COMMAND__CONTROLLER:
        setController((Controller)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_COMMAND__ADAPTER:
        setAdapter((HardwareAdapter)newValue);
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
      case StateAnalysisPackage.HARDWARE_COMMAND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.HARDWARE_COMMAND__CONTROLLER:
        setController((Controller)null);
        return;
      case StateAnalysisPackage.HARDWARE_COMMAND__ADAPTER:
        setAdapter((HardwareAdapter)null);
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
      case StateAnalysisPackage.HARDWARE_COMMAND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.HARDWARE_COMMAND__CONTROLLER:
        return controller != null;
      case StateAnalysisPackage.HARDWARE_COMMAND__ADAPTER:
        return adapter != null;
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

} //HardwareCommandImpl
