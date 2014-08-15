/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.util.Collection;

import net.certware.intent.state.stateSpecification.Device;
import net.certware.intent.state.stateSpecification.DeviceInput;
import net.certware.intent.state.stateSpecification.DeviceOutput;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;

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
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.DeviceImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.DeviceImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.DeviceImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device
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
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<DeviceInput> inputs;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EList<DeviceOutput> outputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceImpl()
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
    return StateSpecificationPackage.Literals.DEVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.DEVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.DEVICE__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceInput> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<DeviceInput>(DeviceInput.class, this, StateSpecificationPackage.DEVICE__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceOutput> getOutputs()
  {
    if (outputs == null)
    {
      outputs = new EObjectContainmentEList<DeviceOutput>(DeviceOutput.class, this, StateSpecificationPackage.DEVICE__OUTPUTS);
    }
    return outputs;
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
      case StateSpecificationPackage.DEVICE__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case StateSpecificationPackage.DEVICE__OUTPUTS:
        return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
      case StateSpecificationPackage.DEVICE__NAME:
        return getName();
      case StateSpecificationPackage.DEVICE__DESC:
        return getDesc();
      case StateSpecificationPackage.DEVICE__INPUTS:
        return getInputs();
      case StateSpecificationPackage.DEVICE__OUTPUTS:
        return getOutputs();
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
      case StateSpecificationPackage.DEVICE__NAME:
        setName((String)newValue);
        return;
      case StateSpecificationPackage.DEVICE__DESC:
        setDesc((String)newValue);
        return;
      case StateSpecificationPackage.DEVICE__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends DeviceInput>)newValue);
        return;
      case StateSpecificationPackage.DEVICE__OUTPUTS:
        getOutputs().clear();
        getOutputs().addAll((Collection<? extends DeviceOutput>)newValue);
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
      case StateSpecificationPackage.DEVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateSpecificationPackage.DEVICE__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case StateSpecificationPackage.DEVICE__INPUTS:
        getInputs().clear();
        return;
      case StateSpecificationPackage.DEVICE__OUTPUTS:
        getOutputs().clear();
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
      case StateSpecificationPackage.DEVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateSpecificationPackage.DEVICE__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case StateSpecificationPackage.DEVICE__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case StateSpecificationPackage.DEVICE__OUTPUTS:
        return outputs != null && !outputs.isEmpty();
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
    result.append(", desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //DeviceImpl
