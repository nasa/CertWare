/**
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.ProofSteps;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proof</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ProofImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ProofImpl#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ProofImpl#getProofSteps <em>Proof Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProofImpl extends MinimalEObjectImpl.Container implements Proof
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getJustifications() <em>Justifications</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJustifications()
   * @generated
   * @ordered
   */
  protected Justifications justifications;

  /**
   * The cached value of the '{@link #getProofSteps() <em>Proof Steps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProofSteps()
   * @generated
   * @ordered
   */
  protected ProofSteps proofSteps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProofImpl()
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
    return SemiFormalProofPackage.Literals.PROOF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.PROOF__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Justifications getJustifications()
  {
    return justifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJustifications(Justifications newJustifications, NotificationChain msgs)
  {
    Justifications oldJustifications = justifications;
    justifications = newJustifications;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.PROOF__JUSTIFICATIONS, oldJustifications, newJustifications);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJustifications(Justifications newJustifications)
  {
    if (newJustifications != justifications)
    {
      NotificationChain msgs = null;
      if (justifications != null)
        msgs = ((InternalEObject)justifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.PROOF__JUSTIFICATIONS, null, msgs);
      if (newJustifications != null)
        msgs = ((InternalEObject)newJustifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.PROOF__JUSTIFICATIONS, null, msgs);
      msgs = basicSetJustifications(newJustifications, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.PROOF__JUSTIFICATIONS, newJustifications, newJustifications));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProofSteps getProofSteps()
  {
    return proofSteps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProofSteps(ProofSteps newProofSteps, NotificationChain msgs)
  {
    ProofSteps oldProofSteps = proofSteps;
    proofSteps = newProofSteps;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.PROOF__PROOF_STEPS, oldProofSteps, newProofSteps);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProofSteps(ProofSteps newProofSteps)
  {
    if (newProofSteps != proofSteps)
    {
      NotificationChain msgs = null;
      if (proofSteps != null)
        msgs = ((InternalEObject)proofSteps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.PROOF__PROOF_STEPS, null, msgs);
      if (newProofSteps != null)
        msgs = ((InternalEObject)newProofSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.PROOF__PROOF_STEPS, null, msgs);
      msgs = basicSetProofSteps(newProofSteps, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.PROOF__PROOF_STEPS, newProofSteps, newProofSteps));
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
      case SemiFormalProofPackage.PROOF__JUSTIFICATIONS:
        return basicSetJustifications(null, msgs);
      case SemiFormalProofPackage.PROOF__PROOF_STEPS:
        return basicSetProofSteps(null, msgs);
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
      case SemiFormalProofPackage.PROOF__TITLE:
        return getTitle();
      case SemiFormalProofPackage.PROOF__JUSTIFICATIONS:
        return getJustifications();
      case SemiFormalProofPackage.PROOF__PROOF_STEPS:
        return getProofSteps();
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
      case SemiFormalProofPackage.PROOF__TITLE:
        setTitle((String)newValue);
        return;
      case SemiFormalProofPackage.PROOF__JUSTIFICATIONS:
        setJustifications((Justifications)newValue);
        return;
      case SemiFormalProofPackage.PROOF__PROOF_STEPS:
        setProofSteps((ProofSteps)newValue);
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
      case SemiFormalProofPackage.PROOF__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case SemiFormalProofPackage.PROOF__JUSTIFICATIONS:
        setJustifications((Justifications)null);
        return;
      case SemiFormalProofPackage.PROOF__PROOF_STEPS:
        setProofSteps((ProofSteps)null);
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
      case SemiFormalProofPackage.PROOF__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case SemiFormalProofPackage.PROOF__JUSTIFICATIONS:
        return justifications != null;
      case SemiFormalProofPackage.PROOF__PROOF_STEPS:
        return proofSteps != null;
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
    result.append(" (title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //ProofImpl
