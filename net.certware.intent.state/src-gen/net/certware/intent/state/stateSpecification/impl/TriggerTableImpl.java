/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.util.Collection;

import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.Trigger;
import net.certware.intent.state.stateSpecification.TriggerTable;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.TriggerTableImpl#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerTableImpl extends MinimalEObjectImpl.Container implements TriggerTable
{
  /**
   * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRows()
   * @generated
   * @ordered
   */
  protected EList<Trigger> rows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerTableImpl()
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
    return StateSpecificationPackage.Literals.TRIGGER_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Trigger> getRows()
  {
    if (rows == null)
    {
      rows = new EObjectContainmentEList<Trigger>(Trigger.class, this, StateSpecificationPackage.TRIGGER_TABLE__ROWS);
    }
    return rows;
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
      case StateSpecificationPackage.TRIGGER_TABLE__ROWS:
        return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
      case StateSpecificationPackage.TRIGGER_TABLE__ROWS:
        return getRows();
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
      case StateSpecificationPackage.TRIGGER_TABLE__ROWS:
        getRows().clear();
        getRows().addAll((Collection<? extends Trigger>)newValue);
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
      case StateSpecificationPackage.TRIGGER_TABLE__ROWS:
        getRows().clear();
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
      case StateSpecificationPackage.TRIGGER_TABLE__ROWS:
        return rows != null && !rows.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TriggerTableImpl
