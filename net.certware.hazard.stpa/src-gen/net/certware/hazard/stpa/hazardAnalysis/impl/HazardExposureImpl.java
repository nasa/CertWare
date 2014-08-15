/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.HazardExposure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Exposure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardExposureImpl#getExposure <em>Exposure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardExposureImpl extends MinimalEObjectImpl.Container implements HazardExposure
{
  /**
   * The default value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExposure()
   * @generated
   * @ordered
   */
  protected static final String EXPOSURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExposure()
   * @generated
   * @ordered
   */
  protected String exposure = EXPOSURE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardExposureImpl()
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
    return HazardAnalysisPackage.Literals.HAZARD_EXPOSURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExposure()
  {
    return exposure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExposure(String newExposure)
  {
    String oldExposure = exposure;
    exposure = newExposure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD_EXPOSURE__EXPOSURE, oldExposure, exposure));
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
      case HazardAnalysisPackage.HAZARD_EXPOSURE__EXPOSURE:
        return getExposure();
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
      case HazardAnalysisPackage.HAZARD_EXPOSURE__EXPOSURE:
        setExposure((String)newValue);
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
      case HazardAnalysisPackage.HAZARD_EXPOSURE__EXPOSURE:
        setExposure(EXPOSURE_EDEFAULT);
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
      case HazardAnalysisPackage.HAZARD_EXPOSURE__EXPOSURE:
        return EXPOSURE_EDEFAULT == null ? exposure != null : !EXPOSURE_EDEFAULT.equals(exposure);
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
    result.append(" (exposure: ");
    result.append(exposure);
    result.append(')');
    return result.toString();
  }

} //HazardExposureImpl
