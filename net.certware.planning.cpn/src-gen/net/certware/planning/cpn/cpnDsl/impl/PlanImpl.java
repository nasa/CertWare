/**
 */
package net.certware.planning.cpn.cpnDsl.impl;

import net.certware.planning.cpn.cpnDsl.Allocation;
import net.certware.planning.cpn.cpnDsl.CpnDslPackage;
import net.certware.planning.cpn.cpnDsl.Plan;

import net.certware.sacm.SACM.ModelElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.PlanImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.PlanImpl#getElement <em>Element</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.PlanImpl#getEstimated <em>Estimated</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.PlanImpl#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanImpl extends MinimalEObjectImpl.Container implements Plan
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected ModelElement element;

  /**
   * The cached value of the '{@link #getEstimated() <em>Estimated</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimated()
   * @generated
   * @ordered
   */
  protected Allocation estimated;

  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected Allocation actual;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlanImpl()
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
    return CpnDslPackage.Literals.PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.PLAN__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement getElement()
  {
    if (element != null && element.eIsProxy())
    {
      InternalEObject oldElement = (InternalEObject)element;
      element = (ModelElement)eResolveProxy(oldElement);
      if (element != oldElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpnDslPackage.PLAN__ELEMENT, oldElement, element));
      }
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement basicGetElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(ModelElement newElement)
  {
    ModelElement oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.PLAN__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Allocation getEstimated()
  {
    return estimated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEstimated(Allocation newEstimated, NotificationChain msgs)
  {
    Allocation oldEstimated = estimated;
    estimated = newEstimated;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpnDslPackage.PLAN__ESTIMATED, oldEstimated, newEstimated);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstimated(Allocation newEstimated)
  {
    if (newEstimated != estimated)
    {
      NotificationChain msgs = null;
      if (estimated != null)
        msgs = ((InternalEObject)estimated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpnDslPackage.PLAN__ESTIMATED, null, msgs);
      if (newEstimated != null)
        msgs = ((InternalEObject)newEstimated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpnDslPackage.PLAN__ESTIMATED, null, msgs);
      msgs = basicSetEstimated(newEstimated, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.PLAN__ESTIMATED, newEstimated, newEstimated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Allocation getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(Allocation newActual, NotificationChain msgs)
  {
    Allocation oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpnDslPackage.PLAN__ACTUAL, oldActual, newActual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual(Allocation newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpnDslPackage.PLAN__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpnDslPackage.PLAN__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.PLAN__ACTUAL, newActual, newActual));
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
      case CpnDslPackage.PLAN__ESTIMATED:
        return basicSetEstimated(null, msgs);
      case CpnDslPackage.PLAN__ACTUAL:
        return basicSetActual(null, msgs);
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
      case CpnDslPackage.PLAN__ID:
        return getId();
      case CpnDslPackage.PLAN__ELEMENT:
        if (resolve) return getElement();
        return basicGetElement();
      case CpnDslPackage.PLAN__ESTIMATED:
        return getEstimated();
      case CpnDslPackage.PLAN__ACTUAL:
        return getActual();
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
      case CpnDslPackage.PLAN__ID:
        setId((String)newValue);
        return;
      case CpnDslPackage.PLAN__ELEMENT:
        setElement((ModelElement)newValue);
        return;
      case CpnDslPackage.PLAN__ESTIMATED:
        setEstimated((Allocation)newValue);
        return;
      case CpnDslPackage.PLAN__ACTUAL:
        setActual((Allocation)newValue);
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
      case CpnDslPackage.PLAN__ID:
        setId(ID_EDEFAULT);
        return;
      case CpnDslPackage.PLAN__ELEMENT:
        setElement((ModelElement)null);
        return;
      case CpnDslPackage.PLAN__ESTIMATED:
        setEstimated((Allocation)null);
        return;
      case CpnDslPackage.PLAN__ACTUAL:
        setActual((Allocation)null);
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
      case CpnDslPackage.PLAN__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case CpnDslPackage.PLAN__ELEMENT:
        return element != null;
      case CpnDslPackage.PLAN__ESTIMATED:
        return estimated != null;
      case CpnDslPackage.PLAN__ACTUAL:
        return actual != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //PlanImpl
