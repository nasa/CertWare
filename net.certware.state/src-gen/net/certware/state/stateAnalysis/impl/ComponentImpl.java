/**
 */
package net.certware.state.stateAnalysis.impl;

import java.util.Collection;

import net.certware.state.stateAnalysis.Component;
import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.Estimator;
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
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getSv <em>Sv</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getController <em>Controller</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.ComponentImpl#getEstimator <em>Estimator</em>}</li>
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
   * The cached value of the '{@link #getSv() <em>Sv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSv()
   * @generated
   * @ordered
   */
  protected StateVariable sv;

  /**
   * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getController()
   * @generated
   * @ordered
   */
  protected EList<Controller> controller;

  /**
   * The cached value of the '{@link #getEstimator() <em>Estimator</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimator()
   * @generated
   * @ordered
   */
  protected EList<Estimator> estimator;

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
  public StateVariable getSv()
  {
    return sv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSv(StateVariable newSv, NotificationChain msgs)
  {
    StateVariable oldSv = sv;
    sv = newSv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.COMPONENT__SV, oldSv, newSv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSv(StateVariable newSv)
  {
    if (newSv != sv)
    {
      NotificationChain msgs = null;
      if (sv != null)
        msgs = ((InternalEObject)sv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateAnalysisPackage.COMPONENT__SV, null, msgs);
      if (newSv != null)
        msgs = ((InternalEObject)newSv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateAnalysisPackage.COMPONENT__SV, null, msgs);
      msgs = basicSetSv(newSv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.COMPONENT__SV, newSv, newSv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Controller> getController()
  {
    if (controller == null)
    {
      controller = new EObjectContainmentEList<Controller>(Controller.class, this, StateAnalysisPackage.COMPONENT__CONTROLLER);
    }
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Estimator> getEstimator()
  {
    if (estimator == null)
    {
      estimator = new EObjectContainmentEList<Estimator>(Estimator.class, this, StateAnalysisPackage.COMPONENT__ESTIMATOR);
    }
    return estimator;
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
      case StateAnalysisPackage.COMPONENT__SV:
        return basicSetSv(null, msgs);
      case StateAnalysisPackage.COMPONENT__CONTROLLER:
        return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.COMPONENT__ESTIMATOR:
        return ((InternalEList<?>)getEstimator()).basicRemove(otherEnd, msgs);
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
      case StateAnalysisPackage.COMPONENT__SV:
        return getSv();
      case StateAnalysisPackage.COMPONENT__CONTROLLER:
        return getController();
      case StateAnalysisPackage.COMPONENT__ESTIMATOR:
        return getEstimator();
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
      case StateAnalysisPackage.COMPONENT__SV:
        setSv((StateVariable)newValue);
        return;
      case StateAnalysisPackage.COMPONENT__CONTROLLER:
        getController().clear();
        getController().addAll((Collection<? extends Controller>)newValue);
        return;
      case StateAnalysisPackage.COMPONENT__ESTIMATOR:
        getEstimator().clear();
        getEstimator().addAll((Collection<? extends Estimator>)newValue);
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
      case StateAnalysisPackage.COMPONENT__SV:
        setSv((StateVariable)null);
        return;
      case StateAnalysisPackage.COMPONENT__CONTROLLER:
        getController().clear();
        return;
      case StateAnalysisPackage.COMPONENT__ESTIMATOR:
        getEstimator().clear();
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
      case StateAnalysisPackage.COMPONENT__SV:
        return sv != null;
      case StateAnalysisPackage.COMPONENT__CONTROLLER:
        return controller != null && !controller.isEmpty();
      case StateAnalysisPackage.COMPONENT__ESTIMATOR:
        return estimator != null && !estimator.isEmpty();
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
