/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import net.certware.evidence.hugin.netDSL.FloatDataList;
import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.NormalDistribution;
import net.certware.evidence.hugin.netDSL.UnstructuredDataList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Data List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.UnstructuredDataListImpl#getList <em>List</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.UnstructuredDataListImpl#getNormal <em>Normal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnstructuredDataListImpl extends MinimalEObjectImpl.Container implements UnstructuredDataList
{
  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected FloatDataList list;

  /**
   * The cached value of the '{@link #getNormal() <em>Normal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNormal()
   * @generated
   * @ordered
   */
  protected NormalDistribution normal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnstructuredDataListImpl()
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
    return NetDSLPackage.Literals.UNSTRUCTURED_DATA_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatDataList getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(FloatDataList newList, NotificationChain msgs)
  {
    FloatDataList oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(FloatDataList newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST, newList, newList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalDistribution getNormal()
  {
    return normal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNormal(NormalDistribution newNormal, NotificationChain msgs)
  {
    NormalDistribution oldNormal = normal;
    normal = newNormal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL, oldNormal, newNormal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNormal(NormalDistribution newNormal)
  {
    if (newNormal != normal)
    {
      NotificationChain msgs = null;
      if (normal != null)
        msgs = ((InternalEObject)normal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL, null, msgs);
      if (newNormal != null)
        msgs = ((InternalEObject)newNormal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL, null, msgs);
      msgs = basicSetNormal(newNormal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL, newNormal, newNormal));
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
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST:
        return basicSetList(null, msgs);
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL:
        return basicSetNormal(null, msgs);
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
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST:
        return getList();
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL:
        return getNormal();
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
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST:
        setList((FloatDataList)newValue);
        return;
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL:
        setNormal((NormalDistribution)newValue);
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
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST:
        setList((FloatDataList)null);
        return;
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL:
        setNormal((NormalDistribution)null);
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
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__LIST:
        return list != null;
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST__NORMAL:
        return normal != null;
    }
    return super.eIsSet(featureID);
  }

} //UnstructuredDataListImpl
