/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.NormalDistribution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.NormalDistributionImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.NormalDistributionImpl#getVariance <em>Variance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalDistributionImpl extends MinimalEObjectImpl.Container implements NormalDistribution
{
  /**
   * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMean()
   * @generated
   * @ordered
   */
  protected static final String MEAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMean()
   * @generated
   * @ordered
   */
  protected String mean = MEAN_EDEFAULT;

  /**
   * The default value of the '{@link #getVariance() <em>Variance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariance()
   * @generated
   * @ordered
   */
  protected static final String VARIANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariance() <em>Variance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariance()
   * @generated
   * @ordered
   */
  protected String variance = VARIANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NormalDistributionImpl()
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
    return NetDSLPackage.Literals.NORMAL_DISTRIBUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMean()
  {
    return mean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMean(String newMean)
  {
    String oldMean = mean;
    mean = newMean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.NORMAL_DISTRIBUTION__MEAN, oldMean, mean));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariance()
  {
    return variance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariance(String newVariance)
  {
    String oldVariance = variance;
    variance = newVariance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.NORMAL_DISTRIBUTION__VARIANCE, oldVariance, variance));
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
      case NetDSLPackage.NORMAL_DISTRIBUTION__MEAN:
        return getMean();
      case NetDSLPackage.NORMAL_DISTRIBUTION__VARIANCE:
        return getVariance();
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
      case NetDSLPackage.NORMAL_DISTRIBUTION__MEAN:
        setMean((String)newValue);
        return;
      case NetDSLPackage.NORMAL_DISTRIBUTION__VARIANCE:
        setVariance((String)newValue);
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
      case NetDSLPackage.NORMAL_DISTRIBUTION__MEAN:
        setMean(MEAN_EDEFAULT);
        return;
      case NetDSLPackage.NORMAL_DISTRIBUTION__VARIANCE:
        setVariance(VARIANCE_EDEFAULT);
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
      case NetDSLPackage.NORMAL_DISTRIBUTION__MEAN:
        return MEAN_EDEFAULT == null ? mean != null : !MEAN_EDEFAULT.equals(mean);
      case NetDSLPackage.NORMAL_DISTRIBUTION__VARIANCE:
        return VARIANCE_EDEFAULT == null ? variance != null : !VARIANCE_EDEFAULT.equals(variance);
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
    result.append(" (mean: ");
    result.append(mean);
    result.append(", variance: ");
    result.append(variance);
    result.append(')');
    return result.toString();
  }

} //NormalDistributionImpl
