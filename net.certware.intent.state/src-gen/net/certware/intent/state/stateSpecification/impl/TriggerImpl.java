/**
 */
package net.certware.intent.state.stateSpecification.impl;

import net.certware.intent.state.stateSpecification.Mode;
import net.certware.intent.state.stateSpecification.State;
import net.certware.intent.state.stateSpecification.StateList;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.StateVariable;
import net.certware.intent.state.stateSpecification.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.TriggerImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.TriggerImpl#getList <em>List</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.TriggerImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.TriggerImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger
{
  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected Mode mode;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected StateList list;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected StateVariable variable;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected State value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerImpl()
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
    return StateSpecificationPackage.Literals.TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode getMode()
  {
    if (mode != null && mode.eIsProxy())
    {
      InternalEObject oldMode = (InternalEObject)mode;
      mode = (Mode)eResolveProxy(oldMode);
      if (mode != oldMode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateSpecificationPackage.TRIGGER__MODE, oldMode, mode));
      }
    }
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode basicGetMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode(Mode newMode)
  {
    Mode oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.TRIGGER__MODE, oldMode, mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateList getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(StateList newList, NotificationChain msgs)
  {
    StateList oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.TRIGGER__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(StateList newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.TRIGGER__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.TRIGGER__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.TRIGGER__LIST, newList, newList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateVariable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (StateVariable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateSpecificationPackage.TRIGGER__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateVariable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(StateVariable newVariable)
  {
    StateVariable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.TRIGGER__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (State)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateSpecificationPackage.TRIGGER__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(State newValue)
  {
    State oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.TRIGGER__VALUE, oldValue, value));
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
      case StateSpecificationPackage.TRIGGER__LIST:
        return basicSetList(null, msgs);
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
      case StateSpecificationPackage.TRIGGER__MODE:
        if (resolve) return getMode();
        return basicGetMode();
      case StateSpecificationPackage.TRIGGER__LIST:
        return getList();
      case StateSpecificationPackage.TRIGGER__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case StateSpecificationPackage.TRIGGER__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
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
      case StateSpecificationPackage.TRIGGER__MODE:
        setMode((Mode)newValue);
        return;
      case StateSpecificationPackage.TRIGGER__LIST:
        setList((StateList)newValue);
        return;
      case StateSpecificationPackage.TRIGGER__VARIABLE:
        setVariable((StateVariable)newValue);
        return;
      case StateSpecificationPackage.TRIGGER__VALUE:
        setValue((State)newValue);
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
      case StateSpecificationPackage.TRIGGER__MODE:
        setMode((Mode)null);
        return;
      case StateSpecificationPackage.TRIGGER__LIST:
        setList((StateList)null);
        return;
      case StateSpecificationPackage.TRIGGER__VARIABLE:
        setVariable((StateVariable)null);
        return;
      case StateSpecificationPackage.TRIGGER__VALUE:
        setValue((State)null);
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
      case StateSpecificationPackage.TRIGGER__MODE:
        return mode != null;
      case StateSpecificationPackage.TRIGGER__LIST:
        return list != null;
      case StateSpecificationPackage.TRIGGER__VARIABLE:
        return variable != null;
      case StateSpecificationPackage.TRIGGER__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //TriggerImpl
