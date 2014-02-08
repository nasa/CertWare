/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.HazardExposure;
import net.certware.hazard.stpa.hazardAnalysis.RiskLevel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.RiskLevelImpl#getExposure <em>Exposure</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.RiskLevelImpl#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RiskLevelImpl extends MinimalEObjectImpl.Container implements RiskLevel
{
  /**
   * The cached value of the '{@link #getExposure() <em>Exposure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExposure()
   * @generated
   * @ordered
   */
  protected HazardExposure exposure;

  /**
   * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLikelihood()
   * @generated
   * @ordered
   */
  protected HazardAccidentLikelihood likelihood;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RiskLevelImpl()
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
    return HazardAnalysisPackage.Literals.RISK_LEVEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardExposure getExposure()
  {
    return exposure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExposure(HazardExposure newExposure, NotificationChain msgs)
  {
    HazardExposure oldExposure = exposure;
    exposure = newExposure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.RISK_LEVEL__EXPOSURE, oldExposure, newExposure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExposure(HazardExposure newExposure)
  {
    if (newExposure != exposure)
    {
      NotificationChain msgs = null;
      if (exposure != null)
        msgs = ((InternalEObject)exposure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.RISK_LEVEL__EXPOSURE, null, msgs);
      if (newExposure != null)
        msgs = ((InternalEObject)newExposure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.RISK_LEVEL__EXPOSURE, null, msgs);
      msgs = basicSetExposure(newExposure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.RISK_LEVEL__EXPOSURE, newExposure, newExposure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardAccidentLikelihood getLikelihood()
  {
    return likelihood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLikelihood(HazardAccidentLikelihood newLikelihood, NotificationChain msgs)
  {
    HazardAccidentLikelihood oldLikelihood = likelihood;
    likelihood = newLikelihood;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD, oldLikelihood, newLikelihood);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLikelihood(HazardAccidentLikelihood newLikelihood)
  {
    if (newLikelihood != likelihood)
    {
      NotificationChain msgs = null;
      if (likelihood != null)
        msgs = ((InternalEObject)likelihood).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD, null, msgs);
      if (newLikelihood != null)
        msgs = ((InternalEObject)newLikelihood).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD, null, msgs);
      msgs = basicSetLikelihood(newLikelihood, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD, newLikelihood, newLikelihood));
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
      case HazardAnalysisPackage.RISK_LEVEL__EXPOSURE:
        return basicSetExposure(null, msgs);
      case HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD:
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
      case HazardAnalysisPackage.RISK_LEVEL__EXPOSURE:
        return getExposure();
      case HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD:
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
      case HazardAnalysisPackage.RISK_LEVEL__EXPOSURE:
        setExposure((HazardExposure)newValue);
        return;
      case HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD:
        setLikelihood((HazardAccidentLikelihood)newValue);
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
      case HazardAnalysisPackage.RISK_LEVEL__EXPOSURE:
        setExposure((HazardExposure)null);
        return;
      case HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD:
        setLikelihood((HazardAccidentLikelihood)null);
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
      case HazardAnalysisPackage.RISK_LEVEL__EXPOSURE:
        return exposure != null;
      case HazardAnalysisPackage.RISK_LEVEL__LIKELIHOOD:
        return likelihood != null;
    }
    return super.eIsSet(featureID);
  }

} //RiskLevelImpl
