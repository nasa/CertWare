/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.ArithmeticTerm;
import net.certware.argument.language.l.Bound;
import net.certware.argument.language.l.LPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.BoundImpl#getAv <em>Av</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundImpl extends MinimalEObjectImpl.Container implements Bound
{
  /**
   * The cached value of the '{@link #getAv() <em>Av</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAv()
   * @generated
   * @ordered
   */
  protected ArithmeticTerm av;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoundImpl()
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
    return LPackage.Literals.BOUND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticTerm getAv()
  {
    return av;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAv(ArithmeticTerm newAv, NotificationChain msgs)
  {
    ArithmeticTerm oldAv = av;
    av = newAv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.BOUND__AV, oldAv, newAv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAv(ArithmeticTerm newAv)
  {
    if (newAv != av)
    {
      NotificationChain msgs = null;
      if (av != null)
        msgs = ((InternalEObject)av).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.BOUND__AV, null, msgs);
      if (newAv != null)
        msgs = ((InternalEObject)newAv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.BOUND__AV, null, msgs);
      msgs = basicSetAv(newAv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.BOUND__AV, newAv, newAv));
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
      case LPackage.BOUND__AV:
        return basicSetAv(null, msgs);
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
      case LPackage.BOUND__AV:
        return getAv();
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
      case LPackage.BOUND__AV:
        setAv((ArithmeticTerm)newValue);
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
      case LPackage.BOUND__AV:
        setAv((ArithmeticTerm)null);
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
      case LPackage.BOUND__AV:
        return av != null;
    }
    return super.eIsSet(featureID);
  }

} //BoundImpl
