/**
 */
package net.certware.argument.language.l.impl;

import java.util.Collection;

import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.TVar;
import net.certware.argument.language.l.TVars;

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
 * An implementation of the model object '<em><b>TVars</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.TVarsImpl#getCar <em>Car</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.TVarsImpl#getCdr <em>Cdr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TVarsImpl extends MinimalEObjectImpl.Container implements TVars
{
  /**
   * The cached value of the '{@link #getCar() <em>Car</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCar()
   * @generated
   * @ordered
   */
  protected TVar car;

  /**
   * The cached value of the '{@link #getCdr() <em>Cdr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCdr()
   * @generated
   * @ordered
   */
  protected EList<TVar> cdr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TVarsImpl()
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
    return LPackage.Literals.TVARS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TVar getCar()
  {
    return car;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCar(TVar newCar, NotificationChain msgs)
  {
    TVar oldCar = car;
    car = newCar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.TVARS__CAR, oldCar, newCar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCar(TVar newCar)
  {
    if (newCar != car)
    {
      NotificationChain msgs = null;
      if (car != null)
        msgs = ((InternalEObject)car).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.TVARS__CAR, null, msgs);
      if (newCar != null)
        msgs = ((InternalEObject)newCar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.TVARS__CAR, null, msgs);
      msgs = basicSetCar(newCar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.TVARS__CAR, newCar, newCar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TVar> getCdr()
  {
    if (cdr == null)
    {
      cdr = new EObjectContainmentEList<TVar>(TVar.class, this, LPackage.TVARS__CDR);
    }
    return cdr;
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
      case LPackage.TVARS__CAR:
        return basicSetCar(null, msgs);
      case LPackage.TVARS__CDR:
        return ((InternalEList<?>)getCdr()).basicRemove(otherEnd, msgs);
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
      case LPackage.TVARS__CAR:
        return getCar();
      case LPackage.TVARS__CDR:
        return getCdr();
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
      case LPackage.TVARS__CAR:
        setCar((TVar)newValue);
        return;
      case LPackage.TVARS__CDR:
        getCdr().clear();
        getCdr().addAll((Collection<? extends TVar>)newValue);
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
      case LPackage.TVARS__CAR:
        setCar((TVar)null);
        return;
      case LPackage.TVARS__CDR:
        getCdr().clear();
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
      case LPackage.TVARS__CAR:
        return car != null;
      case LPackage.TVARS__CDR:
        return cdr != null && !cdr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TVarsImpl
