/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.BasicPredicateAtom;
import net.certware.argument.language.l.BasicTerms;
import net.certware.argument.language.l.LPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Predicate Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.BasicPredicateAtomImpl#getFid <em>Fid</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.BasicPredicateAtomImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicPredicateAtomImpl extends BasicAtomImpl implements BasicPredicateAtom
{
  /**
   * The default value of the '{@link #getFid() <em>Fid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFid()
   * @generated
   * @ordered
   */
  protected static final String FID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFid() <em>Fid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFid()
   * @generated
   * @ordered
   */
  protected String fid = FID_EDEFAULT;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected BasicTerms terms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicPredicateAtomImpl()
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
    return LPackage.Literals.BASIC_PREDICATE_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFid()
  {
    return fid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFid(String newFid)
  {
    String oldFid = fid;
    fid = newFid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.BASIC_PREDICATE_ATOM__FID, oldFid, fid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicTerms getTerms()
  {
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerms(BasicTerms newTerms, NotificationChain msgs)
  {
    BasicTerms oldTerms = terms;
    terms = newTerms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.BASIC_PREDICATE_ATOM__TERMS, oldTerms, newTerms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerms(BasicTerms newTerms)
  {
    if (newTerms != terms)
    {
      NotificationChain msgs = null;
      if (terms != null)
        msgs = ((InternalEObject)terms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.BASIC_PREDICATE_ATOM__TERMS, null, msgs);
      if (newTerms != null)
        msgs = ((InternalEObject)newTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.BASIC_PREDICATE_ATOM__TERMS, null, msgs);
      msgs = basicSetTerms(newTerms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.BASIC_PREDICATE_ATOM__TERMS, newTerms, newTerms));
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
      case LPackage.BASIC_PREDICATE_ATOM__TERMS:
        return basicSetTerms(null, msgs);
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
      case LPackage.BASIC_PREDICATE_ATOM__FID:
        return getFid();
      case LPackage.BASIC_PREDICATE_ATOM__TERMS:
        return getTerms();
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
      case LPackage.BASIC_PREDICATE_ATOM__FID:
        setFid((String)newValue);
        return;
      case LPackage.BASIC_PREDICATE_ATOM__TERMS:
        setTerms((BasicTerms)newValue);
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
      case LPackage.BASIC_PREDICATE_ATOM__FID:
        setFid(FID_EDEFAULT);
        return;
      case LPackage.BASIC_PREDICATE_ATOM__TERMS:
        setTerms((BasicTerms)null);
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
      case LPackage.BASIC_PREDICATE_ATOM__FID:
        return FID_EDEFAULT == null ? fid != null : !FID_EDEFAULT.equals(fid);
      case LPackage.BASIC_PREDICATE_ATOM__TERMS:
        return terms != null;
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
    result.append(" (fid: ");
    result.append(fid);
    result.append(')');
    return result.toString();
  }

} //BasicPredicateAtomImpl
