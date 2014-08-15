/**
 */
package net.certware.intent.state.stateSpecification.impl;

import net.certware.intent.state.stateSpecification.Component;
import net.certware.intent.state.stateSpecification.DeviceInput;
import net.certware.intent.state.stateSpecification.Input;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.DeviceInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.DeviceInputImpl#getIo <em>Io</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.DeviceInputImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceInputImpl extends MinimalEObjectImpl.Container implements DeviceInput
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
   * The cached value of the '{@link #getIo() <em>Io</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIo()
   * @generated
   * @ordered
   */
  protected Input io;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Component source;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceInputImpl()
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
    return StateSpecificationPackage.Literals.DEVICE_INPUT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.DEVICE_INPUT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getIo()
  {
    return io;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIo(Input newIo, NotificationChain msgs)
  {
    Input oldIo = io;
    io = newIo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.DEVICE_INPUT__IO, oldIo, newIo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIo(Input newIo)
  {
    if (newIo != io)
    {
      NotificationChain msgs = null;
      if (io != null)
        msgs = ((InternalEObject)io).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.DEVICE_INPUT__IO, null, msgs);
      if (newIo != null)
        msgs = ((InternalEObject)newIo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.DEVICE_INPUT__IO, null, msgs);
      msgs = basicSetIo(newIo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.DEVICE_INPUT__IO, newIo, newIo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Component)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateSpecificationPackage.DEVICE_INPUT__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Component newSource)
  {
    Component oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.DEVICE_INPUT__SOURCE, oldSource, source));
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
      case StateSpecificationPackage.DEVICE_INPUT__IO:
        return basicSetIo(null, msgs);
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
      case StateSpecificationPackage.DEVICE_INPUT__NAME:
        return getName();
      case StateSpecificationPackage.DEVICE_INPUT__IO:
        return getIo();
      case StateSpecificationPackage.DEVICE_INPUT__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
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
      case StateSpecificationPackage.DEVICE_INPUT__NAME:
        setName((String)newValue);
        return;
      case StateSpecificationPackage.DEVICE_INPUT__IO:
        setIo((Input)newValue);
        return;
      case StateSpecificationPackage.DEVICE_INPUT__SOURCE:
        setSource((Component)newValue);
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
      case StateSpecificationPackage.DEVICE_INPUT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateSpecificationPackage.DEVICE_INPUT__IO:
        setIo((Input)null);
        return;
      case StateSpecificationPackage.DEVICE_INPUT__SOURCE:
        setSource((Component)null);
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
      case StateSpecificationPackage.DEVICE_INPUT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateSpecificationPackage.DEVICE_INPUT__IO:
        return io != null;
      case StateSpecificationPackage.DEVICE_INPUT__SOURCE:
        return source != null;
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

} //DeviceInputImpl
