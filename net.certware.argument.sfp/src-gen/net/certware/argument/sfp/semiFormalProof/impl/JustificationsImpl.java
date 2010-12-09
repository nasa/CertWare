/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import java.util.Collection;

import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;

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
 * An implementation of the model object '<em><b>Justifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationsImpl#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationsImpl#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.JustificationsImpl#getEpsilon <em>Epsilon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JustificationsImpl extends MinimalEObjectImpl.Container implements Justifications
{
  /**
   * The cached value of the '{@link #getJustifications() <em>Justifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJustifications()
   * @generated
   * @ordered
   */
  protected EList<Justification> justifications;

  /**
   * The default value of the '{@link #getHypothesis() <em>Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHypothesis()
   * @generated
   * @ordered
   */
  protected static final String HYPOTHESIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHypothesis() <em>Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHypothesis()
   * @generated
   * @ordered
   */
  protected String hypothesis = HYPOTHESIS_EDEFAULT;

  /**
   * The default value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpsilon()
   * @generated
   * @ordered
   */
  protected static final String EPSILON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpsilon()
   * @generated
   * @ordered
   */
  protected String epsilon = EPSILON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JustificationsImpl()
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
    return SemiFormalProofPackage.Literals.JUSTIFICATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Justification> getJustifications()
  {
    if (justifications == null)
    {
      justifications = new EObjectContainmentEList<Justification>(Justification.class, this, SemiFormalProofPackage.JUSTIFICATIONS__JUSTIFICATIONS);
    }
    return justifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHypothesis()
  {
    return hypothesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHypothesis(String newHypothesis)
  {
    String oldHypothesis = hypothesis;
    hypothesis = newHypothesis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATIONS__HYPOTHESIS, oldHypothesis, hypothesis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEpsilon()
  {
    return epsilon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpsilon(String newEpsilon)
  {
    String oldEpsilon = epsilon;
    epsilon = newEpsilon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.JUSTIFICATIONS__EPSILON, oldEpsilon, epsilon));
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
      case SemiFormalProofPackage.JUSTIFICATIONS__JUSTIFICATIONS:
        return ((InternalEList<?>)getJustifications()).basicRemove(otherEnd, msgs);
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
      case SemiFormalProofPackage.JUSTIFICATIONS__JUSTIFICATIONS:
        return getJustifications();
      case SemiFormalProofPackage.JUSTIFICATIONS__HYPOTHESIS:
        return getHypothesis();
      case SemiFormalProofPackage.JUSTIFICATIONS__EPSILON:
        return getEpsilon();
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
      case SemiFormalProofPackage.JUSTIFICATIONS__JUSTIFICATIONS:
        getJustifications().clear();
        getJustifications().addAll((Collection<? extends Justification>)newValue);
        return;
      case SemiFormalProofPackage.JUSTIFICATIONS__HYPOTHESIS:
        setHypothesis((String)newValue);
        return;
      case SemiFormalProofPackage.JUSTIFICATIONS__EPSILON:
        setEpsilon((String)newValue);
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
      case SemiFormalProofPackage.JUSTIFICATIONS__JUSTIFICATIONS:
        getJustifications().clear();
        return;
      case SemiFormalProofPackage.JUSTIFICATIONS__HYPOTHESIS:
        setHypothesis(HYPOTHESIS_EDEFAULT);
        return;
      case SemiFormalProofPackage.JUSTIFICATIONS__EPSILON:
        setEpsilon(EPSILON_EDEFAULT);
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
      case SemiFormalProofPackage.JUSTIFICATIONS__JUSTIFICATIONS:
        return justifications != null && !justifications.isEmpty();
      case SemiFormalProofPackage.JUSTIFICATIONS__HYPOTHESIS:
        return HYPOTHESIS_EDEFAULT == null ? hypothesis != null : !HYPOTHESIS_EDEFAULT.equals(hypothesis);
      case SemiFormalProofPackage.JUSTIFICATIONS__EPSILON:
        return EPSILON_EDEFAULT == null ? epsilon != null : !EPSILON_EDEFAULT.equals(epsilon);
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
    result.append(')');
    return result.toString();
  }

} //JustificationsImpl
