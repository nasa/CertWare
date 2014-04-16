/**
 */
package net.certware.state.stateAnalysis.impl;

import java.util.Collection;

import net.certware.state.stateAnalysis.StateAnalysisPackage;
import net.certware.state.stateAnalysis.StateConstraint;
import net.certware.state.stateAnalysis.StateUpdate;
import net.certware.state.stateAnalysis.StateVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.StateVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.StateVariableImpl#getStateConstraints <em>State Constraints</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.StateVariableImpl#getStateUpdates <em>State Updates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateVariableImpl extends MinimalEObjectImpl.Container implements StateVariable
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
   * The cached value of the '{@link #getStateConstraints() <em>State Constraints</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateConstraints()
   * @generated
   * @ordered
   */
  protected EList<StateConstraint> stateConstraints;

  /**
   * The cached value of the '{@link #getStateUpdates() <em>State Updates</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateUpdates()
   * @generated
   * @ordered
   */
  protected EList<StateUpdate> stateUpdates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateVariableImpl()
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
    return StateAnalysisPackage.Literals.STATE_VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.STATE_VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateConstraint> getStateConstraints()
  {
    if (stateConstraints == null)
    {
      stateConstraints = new EObjectResolvingEList<StateConstraint>(StateConstraint.class, this, StateAnalysisPackage.STATE_VARIABLE__STATE_CONSTRAINTS);
    }
    return stateConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateUpdate> getStateUpdates()
  {
    if (stateUpdates == null)
    {
      stateUpdates = new EObjectResolvingEList<StateUpdate>(StateUpdate.class, this, StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES);
    }
    return stateUpdates;
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        return getName();
      case StateAnalysisPackage.STATE_VARIABLE__STATE_CONSTRAINTS:
        return getStateConstraints();
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        return getStateUpdates();
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__STATE_CONSTRAINTS:
        getStateConstraints().clear();
        getStateConstraints().addAll((Collection<? extends StateConstraint>)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        getStateUpdates().clear();
        getStateUpdates().addAll((Collection<? extends StateUpdate>)newValue);
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__STATE_CONSTRAINTS:
        getStateConstraints().clear();
        return;
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        getStateUpdates().clear();
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.STATE_VARIABLE__STATE_CONSTRAINTS:
        return stateConstraints != null && !stateConstraints.isEmpty();
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        return stateUpdates != null && !stateUpdates.isEmpty();
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

} //StateVariableImpl
