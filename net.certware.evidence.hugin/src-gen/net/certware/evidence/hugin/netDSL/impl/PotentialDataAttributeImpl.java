/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import java.util.Collection;

import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.PotentialDataAttribute;
import net.certware.evidence.hugin.netDSL.StructuredDataList;
import net.certware.evidence.hugin.netDSL.UnstructuredDataList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl#getUnstructured <em>Unstructured</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotentialDataAttributeImpl extends PotentialAttributeImpl implements PotentialDataAttribute
{
  /**
   * The cached value of the '{@link #getUnstructured() <em>Unstructured</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnstructured()
   * @generated
   * @ordered
   */
  protected UnstructuredDataList unstructured;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<StructuredDataList> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PotentialDataAttributeImpl()
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
    return NetDSLPackage.Literals.POTENTIAL_DATA_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnstructuredDataList getUnstructured()
  {
    return unstructured;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnstructured(UnstructuredDataList newUnstructured, NotificationChain msgs)
  {
    UnstructuredDataList oldUnstructured = unstructured;
    unstructured = newUnstructured;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED, oldUnstructured, newUnstructured);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnstructured(UnstructuredDataList newUnstructured)
  {
    if (newUnstructured != unstructured)
    {
      NotificationChain msgs = null;
      if (unstructured != null)
        msgs = ((InternalEObject)unstructured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED, null, msgs);
      if (newUnstructured != null)
        msgs = ((InternalEObject)newUnstructured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED, null, msgs);
      msgs = basicSetUnstructured(newUnstructured, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED, newUnstructured, newUnstructured));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StructuredDataList> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<StructuredDataList>(StructuredDataList.class, this, NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__ITEMS);
    }
    return items;
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED:
        return basicSetUnstructured(null, msgs);
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED:
        return getUnstructured();
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__ITEMS:
        return getItems();
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED:
        setUnstructured((UnstructuredDataList)newValue);
        return;
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends StructuredDataList>)newValue);
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED:
        setUnstructured((UnstructuredDataList)null);
        return;
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__ITEMS:
        getItems().clear();
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED:
        return unstructured != null;
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PotentialDataAttributeImpl
