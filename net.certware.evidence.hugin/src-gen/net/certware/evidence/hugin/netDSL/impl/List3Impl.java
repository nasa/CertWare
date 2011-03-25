/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import java.util.Collection;

import net.certware.evidence.hugin.netDSL.List3;
import net.certware.evidence.hugin.netDSL.MatrixRow;
import net.certware.evidence.hugin.netDSL.NetDSLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.List3Impl#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class List3Impl extends MatrixRowImpl implements List3
{
  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected EList<MatrixRow> list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected List3Impl()
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
    return NetDSLPackage.Literals.LIST3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatrixRow> getList()
  {
    if (list == null)
    {
      list = new EObjectContainmentEList<MatrixRow>(MatrixRow.class, this, NetDSLPackage.LIST3__LIST);
    }
    return list;
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
      case NetDSLPackage.LIST3__LIST:
        return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
      case NetDSLPackage.LIST3__LIST:
        return getList();
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
      case NetDSLPackage.LIST3__LIST:
        getList().clear();
        getList().addAll((Collection<? extends MatrixRow>)newValue);
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
      case NetDSLPackage.LIST3__LIST:
        getList().clear();
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
      case NetDSLPackage.LIST3__LIST:
        return list != null && !list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //List3Impl
