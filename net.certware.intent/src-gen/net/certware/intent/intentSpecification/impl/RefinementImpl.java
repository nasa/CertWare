/**
 */
package net.certware.intent.intentSpecification.impl;

import java.util.Collection;

import net.certware.intent.intentSpecification.Intent;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.Refinement;

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
 * An implementation of the model object '<em><b>Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.intentSpecification.impl.RefinementImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.RefinementImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.intentSpecification.impl.RefinementImpl#getIntents <em>Intents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinementImpl extends MinimalEObjectImpl.Container implements Refinement
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
   * The cached value of the '{@link #getIntents() <em>Intents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntents()
   * @generated
   * @ordered
   */
  protected EList<Intent> intents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefinementImpl()
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
    return IntentSpecificationPackage.Literals.REFINEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.REFINEMENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IntentSpecificationPackage.REFINEMENT__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Intent> getIntents()
  {
    if (intents == null)
    {
      intents = new EObjectContainmentEList<Intent>(Intent.class, this, IntentSpecificationPackage.REFINEMENT__INTENTS);
    }
    return intents;
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
      case IntentSpecificationPackage.REFINEMENT__INTENTS:
        return ((InternalEList<?>)getIntents()).basicRemove(otherEnd, msgs);
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
      case IntentSpecificationPackage.REFINEMENT__NAME:
        return getName();
      case IntentSpecificationPackage.REFINEMENT__DESC:
        return getDesc();
      case IntentSpecificationPackage.REFINEMENT__INTENTS:
        return getIntents();
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
      case IntentSpecificationPackage.REFINEMENT__NAME:
        setName((String)newValue);
        return;
      case IntentSpecificationPackage.REFINEMENT__DESC:
        setDesc((String)newValue);
        return;
      case IntentSpecificationPackage.REFINEMENT__INTENTS:
        getIntents().clear();
        getIntents().addAll((Collection<? extends Intent>)newValue);
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
      case IntentSpecificationPackage.REFINEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IntentSpecificationPackage.REFINEMENT__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case IntentSpecificationPackage.REFINEMENT__INTENTS:
        getIntents().clear();
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
      case IntentSpecificationPackage.REFINEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IntentSpecificationPackage.REFINEMENT__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case IntentSpecificationPackage.REFINEMENT__INTENTS:
        return intents != null && !intents.isEmpty();
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

} //RefinementImpl
