/**
 */
package net.certware.intent.intentSpecification.impl;

import java.util.Collection;

import net.certware.intent.intentSpecification.Decomposition;
import net.certware.intent.intentSpecification.Intent;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.IntentType;

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
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.impl.IntentImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.IntentImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.IntentImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.IntentImpl#getDecompositions <em>Decompositions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentImpl extends MinimalEObjectImpl.Container implements Intent
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected IntentType type;

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
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The cached value of the '{@link #getDecompositions() <em>Decompositions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositions()
   * @generated
   * @ordered
   */
  protected EList<Decomposition> decompositions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntentImpl()
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
    return IntentSpecificationPackage.Literals.INTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(IntentType newType, NotificationChain msgs)
  {
    IntentType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.INTENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(IntentType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntentSpecificationPackage.INTENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntentSpecificationPackage.INTENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.INTENT__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.INTENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.INTENT__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Decomposition> getDecompositions()
  {
    if (decompositions == null)
    {
      decompositions = new EObjectContainmentEList<Decomposition>(Decomposition.class, this, IntentSpecificationPackage.INTENT__DECOMPOSITIONS);
    }
    return decompositions;
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
      case IntentSpecificationPackage.INTENT__TYPE:
        return basicSetType(null, msgs);
      case IntentSpecificationPackage.INTENT__DECOMPOSITIONS:
        return ((InternalEList<?>)getDecompositions()).basicRemove(otherEnd, msgs);
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
      case IntentSpecificationPackage.INTENT__TYPE:
        return getType();
      case IntentSpecificationPackage.INTENT__NAME:
        return getName();
      case IntentSpecificationPackage.INTENT__DESC:
        return getDesc();
      case IntentSpecificationPackage.INTENT__DECOMPOSITIONS:
        return getDecompositions();
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
      case IntentSpecificationPackage.INTENT__TYPE:
        setType((IntentType)newValue);
        return;
      case IntentSpecificationPackage.INTENT__NAME:
        setName((String)newValue);
        return;
      case IntentSpecificationPackage.INTENT__DESC:
        setDesc((String)newValue);
        return;
      case IntentSpecificationPackage.INTENT__DECOMPOSITIONS:
        getDecompositions().clear();
        getDecompositions().addAll((Collection<? extends Decomposition>)newValue);
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
      case IntentSpecificationPackage.INTENT__TYPE:
        setType((IntentType)null);
        return;
      case IntentSpecificationPackage.INTENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IntentSpecificationPackage.INTENT__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case IntentSpecificationPackage.INTENT__DECOMPOSITIONS:
        getDecompositions().clear();
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
      case IntentSpecificationPackage.INTENT__TYPE:
        return type != null;
      case IntentSpecificationPackage.INTENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IntentSpecificationPackage.INTENT__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case IntentSpecificationPackage.INTENT__DECOMPOSITIONS:
        return decompositions != null && !decompositions.isEmpty();
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
    result.append(", desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //IntentImpl
