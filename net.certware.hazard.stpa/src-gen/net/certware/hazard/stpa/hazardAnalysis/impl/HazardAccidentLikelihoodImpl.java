/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Accident Likelihood</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardAccidentLikelihoodImpl#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardAccidentLikelihoodImpl extends MinimalEObjectImpl.Container implements HazardAccidentLikelihood
{
  /**
   * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLikelihood()
   * @generated
   * @ordered
   */
  protected static final String LIKELIHOOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLikelihood()
   * @generated
   * @ordered
   */
  protected String likelihood = LIKELIHOOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardAccidentLikelihoodImpl()
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
    return HazardAnalysisPackage.Literals.HAZARD_ACCIDENT_LIKELIHOOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLikelihood()
  {
    return likelihood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLikelihood(String newLikelihood)
  {
    String oldLikelihood = likelihood;
    likelihood = newLikelihood;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD, oldLikelihood, likelihood));
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
      case HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD:
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
      case HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD:
        setLikelihood((String)newValue);
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
      case HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD:
        setLikelihood(LIKELIHOOD_EDEFAULT);
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
      case HazardAnalysisPackage.HAZARD_ACCIDENT_LIKELIHOOD__LIKELIHOOD:
        return LIKELIHOOD_EDEFAULT == null ? likelihood != null : !LIKELIHOOD_EDEFAULT.equals(likelihood);
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
    result.append(" (likelihood: ");
    result.append(likelihood);
    result.append(')');
    return result.toString();
  }

} //HazardAccidentLikelihoodImpl
