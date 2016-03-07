/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.BasicTerm;
import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.SetConstruct;
import net.certware.argument.language.l.TVars;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.SetConstructImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.SetConstructImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetConstructImpl extends SetExpressionImpl implements SetConstruct
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected BasicTerm lhs;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected TVars rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetConstructImpl()
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
    return LPackage.Literals.SET_CONSTRUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicTerm getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(BasicTerm newLhs, NotificationChain msgs)
  {
    BasicTerm oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.SET_CONSTRUCT__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(BasicTerm newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.SET_CONSTRUCT__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.SET_CONSTRUCT__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.SET_CONSTRUCT__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TVars getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(TVars newRhs, NotificationChain msgs)
  {
    TVars oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.SET_CONSTRUCT__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(TVars newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.SET_CONSTRUCT__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.SET_CONSTRUCT__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.SET_CONSTRUCT__RHS, newRhs, newRhs));
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
      case LPackage.SET_CONSTRUCT__LHS:
        return basicSetLhs(null, msgs);
      case LPackage.SET_CONSTRUCT__RHS:
        return basicSetRhs(null, msgs);
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
      case LPackage.SET_CONSTRUCT__LHS:
        return getLhs();
      case LPackage.SET_CONSTRUCT__RHS:
        return getRhs();
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
      case LPackage.SET_CONSTRUCT__LHS:
        setLhs((BasicTerm)newValue);
        return;
      case LPackage.SET_CONSTRUCT__RHS:
        setRhs((TVars)newValue);
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
      case LPackage.SET_CONSTRUCT__LHS:
        setLhs((BasicTerm)null);
        return;
      case LPackage.SET_CONSTRUCT__RHS:
        setRhs((TVars)null);
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
      case LPackage.SET_CONSTRUCT__LHS:
        return lhs != null;
      case LPackage.SET_CONSTRUCT__RHS:
        return rhs != null;
    }
    return super.eIsSet(featureID);
  }

} //SetConstructImpl
