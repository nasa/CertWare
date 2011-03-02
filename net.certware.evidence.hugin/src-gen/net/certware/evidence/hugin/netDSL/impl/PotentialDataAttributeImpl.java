/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.PotentialDataAttribute;
import net.certware.evidence.hugin.netDSL.StructuredDataList;
import net.certware.evidence.hugin.netDSL.UnstructuredDataList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl#getUnstructured <em>Unstructured</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl#getStructured <em>Structured</em>}</li>
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
   * The cached value of the '{@link #getStructured() <em>Structured</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructured()
   * @generated
   * @ordered
   */
  protected StructuredDataList structured;

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
  public StructuredDataList getStructured()
  {
    return structured;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructured(StructuredDataList newStructured, NotificationChain msgs)
  {
    StructuredDataList oldStructured = structured;
    structured = newStructured;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED, oldStructured, newStructured);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructured(StructuredDataList newStructured)
  {
    if (newStructured != structured)
    {
      NotificationChain msgs = null;
      if (structured != null)
        msgs = ((InternalEObject)structured).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED, null, msgs);
      if (newStructured != null)
        msgs = ((InternalEObject)newStructured).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED, null, msgs);
      msgs = basicSetStructured(newStructured, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED, newStructured, newStructured));
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED:
        return basicSetStructured(null, msgs);
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED:
        return getStructured();
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED:
        setUnstructured((UnstructuredDataList)newValue);
        return;
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED:
        setStructured((StructuredDataList)newValue);
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED:
        setStructured((StructuredDataList)null);
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
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE__STRUCTURED:
        return structured != null;
    }
    return super.eIsSet(featureID);
  }

} //PotentialDataAttributeImpl
