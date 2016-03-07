/**
 */
package net.certware.argument.language.l.impl;

import java.util.Collection;

import net.certware.argument.language.l.GroundTerm;
import net.certware.argument.language.l.GroundTerms;
import net.certware.argument.language.l.LPackage;

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
 * An implementation of the model object '<em><b>Ground Terms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.GroundTermsImpl#getCar <em>Car</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.GroundTermsImpl#getCdr <em>Cdr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundTermsImpl extends GroundFunctionalTermImpl implements GroundTerms
{
  /**
   * The cached value of the '{@link #getCar() <em>Car</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCar()
   * @generated
   * @ordered
   */
  protected GroundTerm car;

  /**
   * The cached value of the '{@link #getCdr() <em>Cdr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCdr()
   * @generated
   * @ordered
   */
  protected EList<GroundTerm> cdr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroundTermsImpl()
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
    return LPackage.Literals.GROUND_TERMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroundTerm getCar()
  {
    return car;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCar(GroundTerm newCar, NotificationChain msgs)
  {
    GroundTerm oldCar = car;
    car = newCar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.GROUND_TERMS__CAR, oldCar, newCar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCar(GroundTerm newCar)
  {
    if (newCar != car)
    {
      NotificationChain msgs = null;
      if (car != null)
        msgs = ((InternalEObject)car).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.GROUND_TERMS__CAR, null, msgs);
      if (newCar != null)
        msgs = ((InternalEObject)newCar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.GROUND_TERMS__CAR, null, msgs);
      msgs = basicSetCar(newCar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.GROUND_TERMS__CAR, newCar, newCar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroundTerm> getCdr()
  {
    if (cdr == null)
    {
      cdr = new EObjectContainmentEList<GroundTerm>(GroundTerm.class, this, LPackage.GROUND_TERMS__CDR);
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
      case LPackage.GROUND_TERMS__CAR:
        return basicSetCar(null, msgs);
      case LPackage.GROUND_TERMS__CDR:
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
      case LPackage.GROUND_TERMS__CAR:
        return getCar();
      case LPackage.GROUND_TERMS__CDR:
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
      case LPackage.GROUND_TERMS__CAR:
        setCar((GroundTerm)newValue);
        return;
      case LPackage.GROUND_TERMS__CDR:
        getCdr().clear();
        getCdr().addAll((Collection<? extends GroundTerm>)newValue);
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
      case LPackage.GROUND_TERMS__CAR:
        setCar((GroundTerm)null);
        return;
      case LPackage.GROUND_TERMS__CDR:
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
      case LPackage.GROUND_TERMS__CAR:
        return car != null;
      case LPackage.GROUND_TERMS__CDR:
        return cdr != null && !cdr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GroundTermsImpl
