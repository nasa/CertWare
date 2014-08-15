/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.HazardLevel;
import net.certware.hazard.stpa.hazardAnalysis.HazardLikelihood;
import net.certware.hazard.stpa.hazardAnalysis.HazardSeverity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardLevelImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardLevelImpl#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardLevelImpl extends MinimalEObjectImpl.Container implements HazardLevel
{
  /**
   * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeverity()
   * @generated
   * @ordered
   */
  protected HazardSeverity severity;

  /**
   * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLikelihood()
   * @generated
   * @ordered
   */
  protected HazardLikelihood likelihood;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardLevelImpl()
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
    return HazardAnalysisPackage.Literals.HAZARD_LEVEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardSeverity getSeverity()
  {
    return severity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeverity(HazardSeverity newSeverity, NotificationChain msgs)
  {
    HazardSeverity oldSeverity = severity;
    severity = newSeverity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY, oldSeverity, newSeverity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeverity(HazardSeverity newSeverity)
  {
    if (newSeverity != severity)
    {
      NotificationChain msgs = null;
      if (severity != null)
        msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY, null, msgs);
      if (newSeverity != null)
        msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY, null, msgs);
      msgs = basicSetSeverity(newSeverity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY, newSeverity, newSeverity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardLikelihood getLikelihood()
  {
    return likelihood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLikelihood(HazardLikelihood newLikelihood, NotificationChain msgs)
  {
    HazardLikelihood oldLikelihood = likelihood;
    likelihood = newLikelihood;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD, oldLikelihood, newLikelihood);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLikelihood(HazardLikelihood newLikelihood)
  {
    if (newLikelihood != likelihood)
    {
      NotificationChain msgs = null;
      if (likelihood != null)
        msgs = ((InternalEObject)likelihood).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD, null, msgs);
      if (newLikelihood != null)
        msgs = ((InternalEObject)newLikelihood).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD, null, msgs);
      msgs = basicSetLikelihood(newLikelihood, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD, newLikelihood, newLikelihood));
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
      case HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY:
        return basicSetSeverity(null, msgs);
      case HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD:
        return basicSetLikelihood(null, msgs);
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
      case HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY:
        return getSeverity();
      case HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD:
        return getLikelihood();
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
      case HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY:
        setSeverity((HazardSeverity)newValue);
        return;
      case HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD:
        setLikelihood((HazardLikelihood)newValue);
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
      case HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY:
        setSeverity((HazardSeverity)null);
        return;
      case HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD:
        setLikelihood((HazardLikelihood)null);
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
      case HazardAnalysisPackage.HAZARD_LEVEL__SEVERITY:
        return severity != null;
      case HazardAnalysisPackage.HAZARD_LEVEL__LIKELIHOOD:
        return likelihood != null;
    }
    return super.eIsSet(featureID);
  }

} //HazardLevelImpl
