/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.util.Collection;

import net.certware.intent.state.stateSpecification.StateList;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.StateValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.StateListImpl#getStateList <em>State List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateListImpl extends MinimalEObjectImpl.Container implements StateList
{
  /**
   * The cached value of the '{@link #getStateList() <em>State List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateList()
   * @generated
   * @ordered
   */
  protected EList<StateValue> stateList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateListImpl()
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
    return StateSpecificationPackage.Literals.STATE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateValue> getStateList()
  {
    if (stateList == null)
    {
      stateList = new EObjectContainmentEList<StateValue>(StateValue.class, this, StateSpecificationPackage.STATE_LIST__STATE_LIST);
    }
    return stateList;
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
      case StateSpecificationPackage.STATE_LIST__STATE_LIST:
        return ((InternalEList<?>)getStateList()).basicRemove(otherEnd, msgs);
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
      case StateSpecificationPackage.STATE_LIST__STATE_LIST:
        return getStateList();
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
      case StateSpecificationPackage.STATE_LIST__STATE_LIST:
        getStateList().clear();
        getStateList().addAll((Collection<? extends StateValue>)newValue);
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
      case StateSpecificationPackage.STATE_LIST__STATE_LIST:
        getStateList().clear();
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
      case StateSpecificationPackage.STATE_LIST__STATE_LIST:
        return stateList != null && !stateList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateListImpl
