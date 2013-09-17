/**
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import java.util.Collection;

import net.certware.argument.sfp.semiFormalProof.ProofSteps;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;
import net.certware.argument.sfp.semiFormalProof.Statement;

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
 * An implementation of the model object '<em><b>Proof Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ProofStepsImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ProofStepsImpl#isEpsilon <em>Epsilon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProofStepsImpl extends MinimalEObjectImpl.Container implements ProofSteps
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProofStepsImpl()
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
    return SemiFormalProofPackage.Literals.PROOF_STEPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, SemiFormalProofPackage.PROOF_STEPS__STATEMENTS);
    }
    return statements;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.PROOF_STEPS__EPSILON, oldEpsilon, epsilon));
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
      case SemiFormalProofPackage.PROOF_STEPS__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case SemiFormalProofPackage.PROOF_STEPS__STATEMENTS:
        return getStatements();
      case SemiFormalProofPackage.PROOF_STEPS__EPSILON:
        return isEpsilon();
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
      case SemiFormalProofPackage.PROOF_STEPS__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case SemiFormalProofPackage.PROOF_STEPS__EPSILON:
        setEpsilon((Boolean)newValue);
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
      case SemiFormalProofPackage.PROOF_STEPS__STATEMENTS:
        getStatements().clear();
        return;
      case SemiFormalProofPackage.PROOF_STEPS__EPSILON:
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
      case SemiFormalProofPackage.PROOF_STEPS__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case SemiFormalProofPackage.PROOF_STEPS__EPSILON:
        return epsilon != EPSILON_EDEFAULT;
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
    result.append(" (epsilon: ");
    result.append(epsilon);
    result.append(')');
    return result.toString();
  }

} //ProofStepsImpl
