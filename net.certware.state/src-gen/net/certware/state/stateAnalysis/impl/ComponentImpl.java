/**
 */
package net.certware.state.stateAnalysis.impl;

import java.util.Collection;

import net.certware.state.stateAnalysis.Component;
import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.Estimator;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.StateAnalysisPackage;
import net.certware.state.stateAnalysis.StateVariable;

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
 * </p>
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getEstimators <em>Estimators</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getAdapters <em>Adapters</em>}</li>
 * </ul>
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
   * The cached value of the '{@link #getStateVariables() <em>State Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateVariables()
   * @generated
   * @ordered
   */
  protected EList<StateVariable> stateVariables;

  /**
   * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControllers()
   * @generated
   * @ordered
   */
  protected EList<Controller> controllers;

  /**
   * The cached value of the '{@link #getEstimators() <em>Estimators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimators()
   * @generated
   * @ordered
   */
  protected EList<Estimator> estimators;

  /**
   * The cached value of the '{@link #getAdapters() <em>Adapters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapters()
   * @generated
   * @ordered
   */
  protected EList<HardwareAdapter> adapters;

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
    return StateAnalysisPackage.Literals.COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.COMPONENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.COMPONENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateVariable> getStateVariables()
  {
    if (stateVariables == null)
    {
      stateVariables = new EObjectContainmentEList<StateVariable>(StateVariable.class, this, StateAnalysisPackage.COMPONENT__STATE_VARIABLES);
    }
    return stateVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Controller> getControllers()
  {
    if (controllers == null)
    {
      controllers = new EObjectContainmentEList<Controller>(Controller.class, this, StateAnalysisPackage.COMPONENT__CONTROLLERS);
    }
    return controllers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Estimator> getEstimators()
  {
    if (estimators == null)
    {
      estimators = new EObjectContainmentEList<Estimator>(Estimator.class, this, StateAnalysisPackage.COMPONENT__ESTIMATORS);
    }
    return estimators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HardwareAdapter> getAdapters()
  {
    if (adapters == null)
    {
      adapters = new EObjectContainmentEList<HardwareAdapter>(HardwareAdapter.class, this, StateAnalysisPackage.COMPONENT__ADAPTERS);
    }
    return adapters;
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
      case StateAnalysisPackage.COMPONENT__STATE_VARIABLES:
        return ((InternalEList<?>)getStateVariables()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.COMPONENT__CONTROLLERS:
        return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.COMPONENT__ESTIMATORS:
        return ((InternalEList<?>)getEstimators()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.COMPONENT__ADAPTERS:
        return ((InternalEList<?>)getAdapters()).basicRemove(otherEnd, msgs);
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
      case StateAnalysisPackage.COMPONENT__NAME:
        return getName();
      case StateAnalysisPackage.COMPONENT__DESCRIPTION:
        return getDescription();
      case StateAnalysisPackage.COMPONENT__STATE_VARIABLES:
        return getStateVariables();
      case StateAnalysisPackage.COMPONENT__CONTROLLERS:
        return getControllers();
      case StateAnalysisPackage.COMPONENT__ESTIMATORS:
        return getEstimators();
      case StateAnalysisPackage.COMPONENT__ADAPTERS:
        return getAdapters();
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
      case StateAnalysisPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.COMPONENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateAnalysisPackage.COMPONENT__STATE_VARIABLES:
        getStateVariables().clear();
        getStateVariables().addAll((Collection<? extends StateVariable>)newValue);
        return;
      case StateAnalysisPackage.COMPONENT__CONTROLLERS:
        getControllers().clear();
        getControllers().addAll((Collection<? extends Controller>)newValue);
        return;
      case StateAnalysisPackage.COMPONENT__ESTIMATORS:
        getEstimators().clear();
        getEstimators().addAll((Collection<? extends Estimator>)newValue);
        return;
      case StateAnalysisPackage.COMPONENT__ADAPTERS:
        getAdapters().clear();
        getAdapters().addAll((Collection<? extends HardwareAdapter>)newValue);
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
      case StateAnalysisPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.COMPONENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateAnalysisPackage.COMPONENT__STATE_VARIABLES:
        getStateVariables().clear();
        return;
      case StateAnalysisPackage.COMPONENT__CONTROLLERS:
        getControllers().clear();
        return;
      case StateAnalysisPackage.COMPONENT__ESTIMATORS:
        getEstimators().clear();
        return;
      case StateAnalysisPackage.COMPONENT__ADAPTERS:
        getAdapters().clear();
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
      case StateAnalysisPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.COMPONENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateAnalysisPackage.COMPONENT__STATE_VARIABLES:
        return stateVariables != null && !stateVariables.isEmpty();
      case StateAnalysisPackage.COMPONENT__CONTROLLERS:
        return controllers != null && !controllers.isEmpty();
      case StateAnalysisPackage.COMPONENT__ESTIMATORS:
        return estimators != null && !estimators.isEmpty();
      case StateAnalysisPackage.COMPONENT__ADAPTERS:
        return adapters != null && !adapters.isEmpty();
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

} //ComponentImpl
