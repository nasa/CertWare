/**
 */
package net.certware.argument.analysis.analysisDSL.impl;

import net.certware.argument.analysis.analysisDSL.AnalysisDSLPackage;
import net.certware.argument.analysis.analysisDSL.Term;
import net.certware.argument.analysis.analysisDSL.Terms;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.impl.TermImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.impl.TermImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.impl.TermImpl#getN <em>N</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.impl.TermImpl#getFs <em>Fs</em>}</li>
 *   <li>{@link net.certware.argument.analysis.analysisDSL.impl.TermImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term
{
  /**
   * The default value of the '{@link #getCs() <em>Cs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCs()
   * @generated
   * @ordered
   */
  protected static final String CS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCs() <em>Cs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCs()
   * @generated
   * @ordered
   */
  protected String cs = CS_EDEFAULT;

  /**
   * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected static final String SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected String sign = SIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final String N_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected String n = N_EDEFAULT;

  /**
   * The default value of the '{@link #getFs() <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFs()
   * @generated
   * @ordered
   */
  protected static final String FS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFs() <em>Fs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFs()
   * @generated
   * @ordered
   */
  protected String fs = FS_EDEFAULT;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected Terms terms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return AnalysisDSLPackage.Literals.TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCs()
  {
    return cs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCs(String newCs)
  {
    String oldCs = cs;
    cs = newCs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.TERM__CS, oldCs, cs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSign()
  {
    return sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign(String newSign)
  {
    String oldSign = sign;
    sign = newSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.TERM__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(String newN)
  {
    String oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.TERM__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFs()
  {
    return fs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFs(String newFs)
  {
    String oldFs = fs;
    fs = newFs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.TERM__FS, oldFs, fs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terms getTerms()
  {
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerms(Terms newTerms, NotificationChain msgs)
  {
    Terms oldTerms = terms;
    terms = newTerms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.TERM__TERMS, oldTerms, newTerms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerms(Terms newTerms)
  {
    if (newTerms != terms)
    {
      NotificationChain msgs = null;
      if (terms != null)
        msgs = ((InternalEObject)terms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysisDSLPackage.TERM__TERMS, null, msgs);
      if (newTerms != null)
        msgs = ((InternalEObject)newTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysisDSLPackage.TERM__TERMS, null, msgs);
      msgs = basicSetTerms(newTerms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnalysisDSLPackage.TERM__TERMS, newTerms, newTerms));
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
      case AnalysisDSLPackage.TERM__TERMS:
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
      case AnalysisDSLPackage.TERM__CS:
        return getCs();
      case AnalysisDSLPackage.TERM__SIGN:
        return getSign();
      case AnalysisDSLPackage.TERM__N:
        return getN();
      case AnalysisDSLPackage.TERM__FS:
        return getFs();
      case AnalysisDSLPackage.TERM__TERMS:
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
      case AnalysisDSLPackage.TERM__CS:
        setCs((String)newValue);
        return;
      case AnalysisDSLPackage.TERM__SIGN:
        setSign((String)newValue);
        return;
      case AnalysisDSLPackage.TERM__N:
        setN((String)newValue);
        return;
      case AnalysisDSLPackage.TERM__FS:
        setFs((String)newValue);
        return;
      case AnalysisDSLPackage.TERM__TERMS:
        setTerms((Terms)newValue);
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
      case AnalysisDSLPackage.TERM__CS:
        setCs(CS_EDEFAULT);
        return;
      case AnalysisDSLPackage.TERM__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case AnalysisDSLPackage.TERM__N:
        setN(N_EDEFAULT);
        return;
      case AnalysisDSLPackage.TERM__FS:
        setFs(FS_EDEFAULT);
        return;
      case AnalysisDSLPackage.TERM__TERMS:
        setTerms((Terms)null);
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
      case AnalysisDSLPackage.TERM__CS:
        return CS_EDEFAULT == null ? cs != null : !CS_EDEFAULT.equals(cs);
      case AnalysisDSLPackage.TERM__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case AnalysisDSLPackage.TERM__N:
        return N_EDEFAULT == null ? n != null : !N_EDEFAULT.equals(n);
      case AnalysisDSLPackage.TERM__FS:
        return FS_EDEFAULT == null ? fs != null : !FS_EDEFAULT.equals(fs);
      case AnalysisDSLPackage.TERM__TERMS:
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
    result.append(" (cs: ");
    result.append(cs);
    result.append(", sign: ");
    result.append(sign);
    result.append(", n: ");
    result.append(n);
    result.append(", fs: ");
    result.append(fs);
    result.append(')');
    return result.toString();
  }

} //TermImpl
