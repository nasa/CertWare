/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.GroundArithmeticTerm;
import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.Limit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.LimitImpl#getCv <em>Cv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitImpl extends MinimalEObjectImpl.Container implements Limit
{
  /**
   * The cached value of the '{@link #getCv() <em>Cv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCv()
   * @generated
   * @ordered
   */
  protected GroundArithmeticTerm cv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LimitImpl()
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
    return LPackage.Literals.LIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroundArithmeticTerm getCv()
  {
    return cv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCv(GroundArithmeticTerm newCv, NotificationChain msgs)
  {
    GroundArithmeticTerm oldCv = cv;
    cv = newCv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.LIMIT__CV, oldCv, newCv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCv(GroundArithmeticTerm newCv)
  {
    if (newCv != cv)
    {
      NotificationChain msgs = null;
      if (cv != null)
        msgs = ((InternalEObject)cv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.LIMIT__CV, null, msgs);
      if (newCv != null)
        msgs = ((InternalEObject)newCv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.LIMIT__CV, null, msgs);
      msgs = basicSetCv(newCv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.LIMIT__CV, newCv, newCv));
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
      case LPackage.LIMIT__CV:
        return basicSetCv(null, msgs);
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
      case LPackage.LIMIT__CV:
        return getCv();
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
      case LPackage.LIMIT__CV:
        setCv((GroundArithmeticTerm)newValue);
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
      case LPackage.LIMIT__CV:
        setCv((GroundArithmeticTerm)null);
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
      case LPackage.LIMIT__CV:
        return cv != null;
    }
    return super.eIsSet(featureID);
  }

} //LimitImpl
