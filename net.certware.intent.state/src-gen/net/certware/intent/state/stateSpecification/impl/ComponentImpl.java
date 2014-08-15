/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.util.Collection;

import net.certware.intent.state.stateSpecification.Component;
import net.certware.intent.state.stateSpecification.ComponentInput;
import net.certware.intent.state.stateSpecification.ComponentOutput;
import net.certware.intent.state.stateSpecification.ModeElement;
import net.certware.intent.state.stateSpecification.StateElement;
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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ComponentImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ComponentImpl#getStates <em>States</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ComponentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ComponentImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component
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
   * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModes()
   * @generated
   * @ordered
   */
  protected EList<ModeElement> modes;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<StateElement> states;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<ComponentInput> inputs;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EList<ComponentOutput> outputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return StateSpecificationPackage.Literals.COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModeElement> getModes()
  {
    if (modes == null)
    {
      modes = new EObjectContainmentEList<ModeElement>(ModeElement.class, this, StateSpecificationPackage.COMPONENT__MODES);
    }
    return modes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateElement> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<StateElement>(StateElement.class, this, StateSpecificationPackage.COMPONENT__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentInput> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<ComponentInput>(ComponentInput.class, this, StateSpecificationPackage.COMPONENT__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentOutput> getOutputs()
  {
    if (outputs == null)
    {
      outputs = new EObjectContainmentEList<ComponentOutput>(ComponentOutput.class, this, StateSpecificationPackage.COMPONENT__OUTPUTS);
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
      case StateSpecificationPackage.COMPONENT__MODES:
        return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
      case StateSpecificationPackage.COMPONENT__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case StateSpecificationPackage.COMPONENT__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case StateSpecificationPackage.COMPONENT__OUTPUTS:
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
      case StateSpecificationPackage.COMPONENT__NAME:
        return getName();
      case StateSpecificationPackage.COMPONENT__MODES:
        return getModes();
      case StateSpecificationPackage.COMPONENT__STATES:
        return getStates();
      case StateSpecificationPackage.COMPONENT__INPUTS:
        return getInputs();
      case StateSpecificationPackage.COMPONENT__OUTPUTS:
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
      case StateSpecificationPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case StateSpecificationPackage.COMPONENT__MODES:
        getModes().clear();
        getModes().addAll((Collection<? extends ModeElement>)newValue);
        return;
      case StateSpecificationPackage.COMPONENT__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends StateElement>)newValue);
        return;
      case StateSpecificationPackage.COMPONENT__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends ComponentInput>)newValue);
        return;
      case StateSpecificationPackage.COMPONENT__OUTPUTS:
        getOutputs().clear();
        getOutputs().addAll((Collection<? extends ComponentOutput>)newValue);
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
      case StateSpecificationPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateSpecificationPackage.COMPONENT__MODES:
        getModes().clear();
        return;
      case StateSpecificationPackage.COMPONENT__STATES:
        getStates().clear();
        return;
      case StateSpecificationPackage.COMPONENT__INPUTS:
        getInputs().clear();
        return;
      case StateSpecificationPackage.COMPONENT__OUTPUTS:
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
      case StateSpecificationPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateSpecificationPackage.COMPONENT__MODES:
        return modes != null && !modes.isEmpty();
      case StateSpecificationPackage.COMPONENT__STATES:
        return states != null && !states.isEmpty();
      case StateSpecificationPackage.COMPONENT__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case StateSpecificationPackage.COMPONENT__OUTPUTS:
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
    result.append(')');
    return result.toString();
  }

} //ComponentImpl
