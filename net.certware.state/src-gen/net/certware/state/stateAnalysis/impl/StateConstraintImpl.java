/**
 */
package net.certware.state.stateAnalysis.impl;

import java.util.Collection;

import net.certware.state.stateAnalysis.Controller;
import net.certware.state.stateAnalysis.Estimator;
import net.certware.state.stateAnalysis.StateAnalysisPackage;
import net.certware.state.stateAnalysis.StateConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.StateConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.StateConstraintImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.StateConstraintImpl#getEstimators <em>Estimators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateConstraintImpl extends MinimalEObjectImpl.Container implements StateConstraint
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
   * The cached value of the '{@link #getControllers() <em>Controllers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControllers()
   * @generated
   * @ordered
   */
  protected EList<Controller> controllers;

  /**
   * The cached value of the '{@link #getEstimators() <em>Estimators</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimators()
   * @generated
   * @ordered
   */
  protected EList<Estimator> estimators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateConstraintImpl()
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
    return StateAnalysisPackage.Literals.STATE_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.STATE_CONSTRAINT__NAME, oldName, name));
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
      controllers = new EObjectResolvingEList<Controller>(Controller.class, this, StateAnalysisPackage.STATE_CONSTRAINT__CONTROLLERS);
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
      estimators = new EObjectResolvingEList<Estimator>(Estimator.class, this, StateAnalysisPackage.STATE_CONSTRAINT__ESTIMATORS);
    }
    return estimators;
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
      case StateAnalysisPackage.STATE_CONSTRAINT__NAME:
        return getName();
      case StateAnalysisPackage.STATE_CONSTRAINT__CONTROLLERS:
        return getControllers();
      case StateAnalysisPackage.STATE_CONSTRAINT__ESTIMATORS:
        return getEstimators();
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
      case StateAnalysisPackage.STATE_CONSTRAINT__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.STATE_CONSTRAINT__CONTROLLERS:
        getControllers().clear();
        getControllers().addAll((Collection<? extends Controller>)newValue);
        return;
      case StateAnalysisPackage.STATE_CONSTRAINT__ESTIMATORS:
        getEstimators().clear();
        getEstimators().addAll((Collection<? extends Estimator>)newValue);
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
      case StateAnalysisPackage.STATE_CONSTRAINT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.STATE_CONSTRAINT__CONTROLLERS:
        getControllers().clear();
        return;
      case StateAnalysisPackage.STATE_CONSTRAINT__ESTIMATORS:
        getEstimators().clear();
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
      case StateAnalysisPackage.STATE_CONSTRAINT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.STATE_CONSTRAINT__CONTROLLERS:
        return controllers != null && !controllers.isEmpty();
      case StateAnalysisPackage.STATE_CONSTRAINT__ESTIMATORS:
        return estimators != null && !estimators.isEmpty();
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

} //StateConstraintImpl
