/**
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.QuotedAssertion;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl#isHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl#isEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl#getNumeral <em>Numeral</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationImpl#getEntailment <em>Entailment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JustificationImpl extends MinimalEObjectImpl.Container implements Justification
{
  /**
   * The default value of the '{@link #isHypothesis() <em>Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHypothesis()
   * @generated
   * @ordered
   */
  protected static final boolean HYPOTHESIS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHypothesis() <em>Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHypothesis()
   * @generated
   * @ordered
   */
  protected boolean hypothesis = HYPOTHESIS_EDEFAULT;

  /**
   * The default value of the '{@link #isEpsilon() <em>Epsilon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEpsilon()
   * @generated
   * @ordered
   */
  protected static final boolean EPSILON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEpsilon() <em>Epsilon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEpsilon()
   * @generated
   * @ordered
   */
  protected boolean epsilon = EPSILON_EDEFAULT;

  /**
   * The default value of the '{@link #getNumeral() <em>Numeral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumeral()
   * @generated
   * @ordered
   */
  protected static final String NUMERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumeral() <em>Numeral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumeral()
   * @generated
   * @ordered
   */
  protected String numeral = NUMERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertion()
   * @generated
   * @ordered
   */
  protected QuotedAssertion assertion;

  /**
   * The cached value of the '{@link #getEntailment() <em>Entailment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntailment()
   * @generated
   * @ordered
   */
  protected Entailment entailment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JustificationImpl()
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
    return SemiFormalProofPackage.Literals.JUSTIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHypothesis()
  {
    return hypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHypothesis(boolean newHypothesis)
  {
    boolean oldHypothesis = hypothesis;
    hypothesis = newHypothesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATION__HYPOTHESIS, oldHypothesis, hypothesis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEpsilon()
  {
    return epsilon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpsilon(boolean newEpsilon)
  {
    boolean oldEpsilon = epsilon;
    epsilon = newEpsilon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATION__EPSILON, oldEpsilon, epsilon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumeral()
  {
    return numeral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumeral(String newNumeral)
  {
    String oldNumeral = numeral;
    numeral = newNumeral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATION__NUMERAL, oldNumeral, numeral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuotedAssertion getAssertion()
  {
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertion(QuotedAssertion newAssertion, NotificationChain msgs)
  {
    QuotedAssertion oldAssertion = assertion;
    assertion = newAssertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATION__ASSERTION, oldAssertion, newAssertion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertion(QuotedAssertion newAssertion)
  {
    if (newAssertion != assertion)
    {
      NotificationChain msgs = null;
      if (assertion != null)
        msgs = ((InternalEObject)assertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.JUSTIFICATION__ASSERTION, null, msgs);
      if (newAssertion != null)
        msgs = ((InternalEObject)newAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.JUSTIFICATION__ASSERTION, null, msgs);
      msgs = basicSetAssertion(newAssertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATION__ASSERTION, newAssertion, newAssertion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entailment getEntailment()
  {
    return entailment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntailment(Entailment newEntailment, NotificationChain msgs)
  {
    Entailment oldEntailment = entailment;
    entailment = newEntailment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT, oldEntailment, newEntailment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntailment(Entailment newEntailment)
  {
    if (newEntailment != entailment)
    {
      NotificationChain msgs = null;
      if (entailment != null)
        msgs = ((InternalEObject)entailment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT, null, msgs);
      if (newEntailment != null)
        msgs = ((InternalEObject)newEntailment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT, null, msgs);
      msgs = basicSetEntailment(newEntailment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT, newEntailment, newEntailment));
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
      case SemiFormalProofPackage.JUSTIFICATION__ASSERTION:
        return basicSetAssertion(null, msgs);
      case SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT:
        return basicSetEntailment(null, msgs);
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
      case SemiFormalProofPackage.JUSTIFICATION__HYPOTHESIS:
        return isHypothesis();
      case SemiFormalProofPackage.JUSTIFICATION__EPSILON:
        return isEpsilon();
      case SemiFormalProofPackage.JUSTIFICATION__NUMERAL:
        return getNumeral();
      case SemiFormalProofPackage.JUSTIFICATION__ASSERTION:
        return getAssertion();
      case SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT:
        return getEntailment();
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
      case SemiFormalProofPackage.JUSTIFICATION__HYPOTHESIS:
        setHypothesis((Boolean)newValue);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__EPSILON:
        setEpsilon((Boolean)newValue);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__NUMERAL:
        setNumeral((String)newValue);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__ASSERTION:
        setAssertion((QuotedAssertion)newValue);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT:
        setEntailment((Entailment)newValue);
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
      case SemiFormalProofPackage.JUSTIFICATION__HYPOTHESIS:
        setHypothesis(HYPOTHESIS_EDEFAULT);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__EPSILON:
        setEpsilon(EPSILON_EDEFAULT);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__NUMERAL:
        setNumeral(NUMERAL_EDEFAULT);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__ASSERTION:
        setAssertion((QuotedAssertion)null);
        return;
      case SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT:
        setEntailment((Entailment)null);
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
      case SemiFormalProofPackage.JUSTIFICATION__HYPOTHESIS:
        return hypothesis != HYPOTHESIS_EDEFAULT;
      case SemiFormalProofPackage.JUSTIFICATION__EPSILON:
        return epsilon != EPSILON_EDEFAULT;
      case SemiFormalProofPackage.JUSTIFICATION__NUMERAL:
        return NUMERAL_EDEFAULT == null ? numeral != null : !NUMERAL_EDEFAULT.equals(numeral);
      case SemiFormalProofPackage.JUSTIFICATION__ASSERTION:
        return assertion != null;
      case SemiFormalProofPackage.JUSTIFICATION__ENTAILMENT:
        return entailment != null;
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
    result.append(" (hypothesis: ");
    result.append(hypothesis);
    result.append(", epsilon: ");
    result.append(epsilon);
    result.append(", numeral: ");
    result.append(numeral);
    result.append(')');
    return result.toString();
  }

} //JustificationImpl
