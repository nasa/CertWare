/**
 */
package net.certware.argument.analysis.analysisDSL.impl;

import net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage;
import net.certware.argument.analysis.analysisDSL.Atom;
import net.certware.argument.analysis.analysisDSL.ClassicLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classic Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.impl.ClassicLiteralImpl#getNeg <em>Neg</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.impl.ClassicLiteralImpl#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassicLiteralImpl extends MinimalEObjectImpl.Container implements ClassicLiteral
{
  /**
   * The default value of the '{@link #getNeg() <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeg()
   * @generated
   * @ordered
   */
  protected static final String NEG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNeg() <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeg()
   * @generated
   * @ordered
   */
  protected String neg = NEG_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtom() <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom()
   * @generated
   * @ordered
   */
  protected Atom atom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassicLiteralImpl()
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
    return AnalysisDSLPackage.Literals.CLASSIC_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNeg()
  {
    return neg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeg(String newNeg)
  {
    String oldNeg = neg;
    neg = newNeg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.CLASSIC_LITERAL__NEG, oldNeg, neg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getAtom()
  {
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtom(Atom newAtom, NotificationChain msgs)
  {
    Atom oldAtom = atom;
    atom = newAtom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.CLASSIC_LITERAL__ATOM, oldAtom, newAtom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtom(Atom newAtom)
  {
    if (newAtom != atom)
    {
      NotificationChain msgs = null;
      if (atom != null)
        msgs = ((InternalEObject)atom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisDSLPackage.CLASSIC_LITERAL__ATOM, null, msgs);
      if (newAtom != null)
        msgs = ((InternalEObject)newAtom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisDSLPackage.CLASSIC_LITERAL__ATOM, null, msgs);
      msgs = basicSetAtom(newAtom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.CLASSIC_LITERAL__ATOM, newAtom, newAtom));
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
      case AnalysisDSLPackage.CLASSIC_LITERAL__ATOM:
        return basicSetAtom(null, msgs);
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
      case AnalysisDSLPackage.CLASSIC_LITERAL__NEG:
        return getNeg();
      case AnalysisDSLPackage.CLASSIC_LITERAL__ATOM:
        return getAtom();
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
      case AnalysisDSLPackage.CLASSIC_LITERAL__NEG:
        setNeg((String)newValue);
        return;
      case AnalysisDSLPackage.CLASSIC_LITERAL__ATOM:
        setAtom((Atom)newValue);
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
      case AnalysisDSLPackage.CLASSIC_LITERAL__NEG:
        setNeg(NEG_EDEFAULT);
        return;
      case AnalysisDSLPackage.CLASSIC_LITERAL__ATOM:
        setAtom((Atom)null);
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
      case AnalysisDSLPackage.CLASSIC_LITERAL__NEG:
        return NEG_EDEFAULT == null ? neg != null : !NEG_EDEFAULT.equals(neg);
      case AnalysisDSLPackage.CLASSIC_LITERAL__ATOM:
        return atom != null;
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
    result.append(" (neg: ");
    result.append(neg);
    result.append(')');
    return result.toString();
  }

} //ClassicLiteralImpl
