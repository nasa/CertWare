/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import net.certware.evidence.hugin.netDSL.ModelDataAttribute;
import net.certware.evidence.hugin.netDSL.ModelNodesAttribute;
import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.PotentialTableAttribute;
import net.certware.evidence.hugin.netDSL.SamplesAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Table Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotentialTableAttributeImpl extends PotentialAttributeImpl implements PotentialTableAttribute
{
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected ModelNodesAttribute nodes;

  /**
   * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSamples()
   * @generated
   * @ordered
   */
  protected SamplesAttribute samples;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected ModelDataAttribute data;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PotentialTableAttributeImpl()
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
    return NetDSLPackage.Literals.POTENTIAL_TABLE_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelNodesAttribute getNodes()
  {
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodes(ModelNodesAttribute newNodes, NotificationChain msgs)
  {
    ModelNodesAttribute oldNodes = nodes;
    nodes = newNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES, oldNodes, newNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodes(ModelNodesAttribute newNodes)
  {
    if (newNodes != nodes)
    {
      NotificationChain msgs = null;
      if (nodes != null)
        msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES, null, msgs);
      if (newNodes != null)
        msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES, null, msgs);
      msgs = basicSetNodes(newNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES, newNodes, newNodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamplesAttribute getSamples()
  {
    return samples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSamples(SamplesAttribute newSamples, NotificationChain msgs)
  {
    SamplesAttribute oldSamples = samples;
    samples = newSamples;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES, oldSamples, newSamples);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSamples(SamplesAttribute newSamples)
  {
    if (newSamples != samples)
    {
      NotificationChain msgs = null;
      if (samples != null)
        msgs = ((InternalEObject)samples).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES, null, msgs);
      if (newSamples != null)
        msgs = ((InternalEObject)newSamples).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES, null, msgs);
      msgs = basicSetSamples(newSamples, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES, newSamples, newSamples));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDataAttribute getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(ModelDataAttribute newData, NotificationChain msgs)
  {
    ModelDataAttribute oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA, oldData, newData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(ModelDataAttribute newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA, newData, newData));
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
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES:
        return basicSetNodes(null, msgs);
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES:
        return basicSetSamples(null, msgs);
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA:
        return basicSetData(null, msgs);
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
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES:
        return getNodes();
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES:
        return getSamples();
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA:
        return getData();
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
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES:
        setNodes((ModelNodesAttribute)newValue);
        return;
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES:
        setSamples((SamplesAttribute)newValue);
        return;
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA:
        setData((ModelDataAttribute)newValue);
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
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES:
        setNodes((ModelNodesAttribute)null);
        return;
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES:
        setSamples((SamplesAttribute)null);
        return;
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA:
        setData((ModelDataAttribute)null);
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
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__NODES:
        return nodes != null;
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__SAMPLES:
        return samples != null;
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE__DATA:
        return data != null;
    }
    return super.eIsSet(featureID);
  }

} //PotentialTableAttributeImpl
