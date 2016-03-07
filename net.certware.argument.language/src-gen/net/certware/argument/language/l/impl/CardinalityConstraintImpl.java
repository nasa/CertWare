/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.BasicPredicateAtom;
import net.certware.argument.language.l.Bound;
import net.certware.argument.language.l.CardinalityConstraint;
import net.certware.argument.language.l.LPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.CardinalityConstraintImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.CardinalityConstraintImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.CardinalityConstraintImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalityConstraintImpl extends HeadImpl implements CardinalityConstraint
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Bound lhs;

  /**
   * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom()
   * @generated
   * @ordered
   */
  protected BasicPredicateAtom atom;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected Bound rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CardinalityConstraintImpl()
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
    return LPackage.Literals.CARDINALITY_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bound getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Bound newLhs, NotificationChain msgs)
  {
    Bound oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.CARDINALITY_CONSTRAINT__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Bound newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.CARDINALITY_CONSTRAINT__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.CARDINALITY_CONSTRAINT__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.CARDINALITY_CONSTRAINT__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicPredicateAtom getAtom()
  {
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtom(BasicPredicateAtom newAtom, NotificationChain msgs)
  {
    BasicPredicateAtom oldAtom = atom;
    atom = newAtom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.CARDINALITY_CONSTRAINT__ATOM, oldAtom, newAtom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtom(BasicPredicateAtom newAtom)
  {
    if (newAtom != atom)
    {
      NotificationChain msgs = null;
      if (atom != null)
        msgs = ((InternalEObject)atom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.CARDINALITY_CONSTRAINT__ATOM, null, msgs);
      if (newAtom != null)
        msgs = ((InternalEObject)newAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.CARDINALITY_CONSTRAINT__ATOM, null, msgs);
      msgs = basicSetAtom(newAtom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.CARDINALITY_CONSTRAINT__ATOM, newAtom, newAtom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bound getRhs()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRhs(Bound newRhs, NotificationChain msgs)
  {
    Bound oldRhs = rhs;
    rhs = newRhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.CARDINALITY_CONSTRAINT__RHS, oldRhs, newRhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRhs(Bound newRhs)
  {
    if (newRhs != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.CARDINALITY_CONSTRAINT__RHS, null, msgs);
      if (newRhs != null)
        msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.CARDINALITY_CONSTRAINT__RHS, null, msgs);
      msgs = basicSetRhs(newRhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.CARDINALITY_CONSTRAINT__RHS, newRhs, newRhs));
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
      case LPackage.CARDINALITY_CONSTRAINT__LHS:
        return basicSetLhs(null, msgs);
      case LPackage.CARDINALITY_CONSTRAINT__ATOM:
        return basicSetAtom(null, msgs);
      case LPackage.CARDINALITY_CONSTRAINT__RHS:
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
      case LPackage.CARDINALITY_CONSTRAINT__LHS:
        return getLhs();
      case LPackage.CARDINALITY_CONSTRAINT__ATOM:
        return getAtom();
      case LPackage.CARDINALITY_CONSTRAINT__RHS:
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
      case LPackage.CARDINALITY_CONSTRAINT__LHS:
        setLhs((Bound)newValue);
        return;
      case LPackage.CARDINALITY_CONSTRAINT__ATOM:
        setAtom((BasicPredicateAtom)newValue);
        return;
      case LPackage.CARDINALITY_CONSTRAINT__RHS:
        setRhs((Bound)newValue);
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
      case LPackage.CARDINALITY_CONSTRAINT__LHS:
        setLhs((Bound)null);
        return;
      case LPackage.CARDINALITY_CONSTRAINT__ATOM:
        setAtom((BasicPredicateAtom)null);
        return;
      case LPackage.CARDINALITY_CONSTRAINT__RHS:
        setRhs((Bound)null);
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
      case LPackage.CARDINALITY_CONSTRAINT__LHS:
        return lhs != null;
      case LPackage.CARDINALITY_CONSTRAINT__ATOM:
        return atom != null;
      case LPackage.CARDINALITY_CONSTRAINT__RHS:
        return rhs != null;
    }
    return super.eIsSet(featureID);
  }

} //CardinalityConstraintImpl
