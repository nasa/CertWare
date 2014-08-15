/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.util.Collection;

import net.certware.intent.state.stateSpecification.ModeElement;
import net.certware.intent.state.stateSpecification.ModeElementType;
import net.certware.intent.state.stateSpecification.ModeVariable;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;

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
 * An implementation of the model object '<em><b>Mode Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ModeElementImpl#isInferred <em>Inferred</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ModeElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ModeElementImpl#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeElementImpl extends MinimalEObjectImpl.Container implements ModeElement
{
  /**
   * The default value of the '{@link #isInferred() <em>Inferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInferred()
   * @generated
   * @ordered
   */
  protected static final boolean INFERRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInferred() <em>Inferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInferred()
   * @generated
   * @ordered
   */
  protected boolean inferred = INFERRED_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ModeElementType type;

  /**
   * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModes()
   * @generated
   * @ordered
   */
  protected EList<ModeVariable> modes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeElementImpl()
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
    return StateSpecificationPackage.Literals.MODE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInferred()
  {
    return inferred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInferred(boolean newInferred)
  {
    boolean oldInferred = inferred;
    inferred = newInferred;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.MODE_ELEMENT__INFERRED, oldInferred, inferred));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModeElementType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(ModeElementType newType, NotificationChain msgs)
  {
    ModeElementType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.MODE_ELEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ModeElementType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.MODE_ELEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.MODE_ELEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.MODE_ELEMENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModeVariable> getModes()
  {
    if (modes == null)
    {
      modes = new EObjectContainmentEList<ModeVariable>(ModeVariable.class, this, StateSpecificationPackage.MODE_ELEMENT__MODES);
    }
    return modes;
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
      case StateSpecificationPackage.MODE_ELEMENT__TYPE:
        return basicSetType(null, msgs);
      case StateSpecificationPackage.MODE_ELEMENT__MODES:
        return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
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
      case StateSpecificationPackage.MODE_ELEMENT__INFERRED:
        return isInferred();
      case StateSpecificationPackage.MODE_ELEMENT__TYPE:
        return getType();
      case StateSpecificationPackage.MODE_ELEMENT__MODES:
        return getModes();
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
      case StateSpecificationPackage.MODE_ELEMENT__INFERRED:
        setInferred((Boolean)newValue);
        return;
      case StateSpecificationPackage.MODE_ELEMENT__TYPE:
        setType((ModeElementType)newValue);
        return;
      case StateSpecificationPackage.MODE_ELEMENT__MODES:
        getModes().clear();
        getModes().addAll((Collection<? extends ModeVariable>)newValue);
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
      case StateSpecificationPackage.MODE_ELEMENT__INFERRED:
        setInferred(INFERRED_EDEFAULT);
        return;
      case StateSpecificationPackage.MODE_ELEMENT__TYPE:
        setType((ModeElementType)null);
        return;
      case StateSpecificationPackage.MODE_ELEMENT__MODES:
        getModes().clear();
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
      case StateSpecificationPackage.MODE_ELEMENT__INFERRED:
        return inferred != INFERRED_EDEFAULT;
      case StateSpecificationPackage.MODE_ELEMENT__TYPE:
        return type != null;
      case StateSpecificationPackage.MODE_ELEMENT__MODES:
        return modes != null && !modes.isEmpty();
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
    result.append(" (inferred: ");
    result.append(inferred);
    result.append(')');
    return result.toString();
  }

} //ModeElementImpl
