/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import net.certware.hazard.stpa.hazardAnalysis.Design;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.DesignImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.DesignImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.DesignImpl#getRationale <em>Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignImpl extends MinimalEObjectImpl.Container implements Design
{
  /**
   * The default value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllocation()
   * @generated
   * @ordered
   */
  protected static final String ALLOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllocation()
   * @generated
   * @ordered
   */
  protected String allocation = ALLOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getAnalysis() <em>Analysis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalysis()
   * @generated
   * @ordered
   */
  protected static final String ANALYSIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnalysis()
   * @generated
   * @ordered
   */
  protected String analysis = ANALYSIS_EDEFAULT;

  /**
   * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected static final String RATIONALE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected String rationale = RATIONALE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DesignImpl()
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
    return HazardAnalysisPackage.Literals.DESIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAllocation()
  {
    return allocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllocation(String newAllocation)
  {
    String oldAllocation = allocation;
    allocation = newAllocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.DESIGN__ALLOCATION, oldAllocation, allocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnalysis()
  {
    return analysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnalysis(String newAnalysis)
  {
    String oldAnalysis = analysis;
    analysis = newAnalysis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.DESIGN__ANALYSIS, oldAnalysis, analysis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRationale()
  {
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRationale(String newRationale)
  {
    String oldRationale = rationale;
    rationale = newRationale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.DESIGN__RATIONALE, oldRationale, rationale));
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
      case HazardAnalysisPackage.DESIGN__ALLOCATION:
        return getAllocation();
      case HazardAnalysisPackage.DESIGN__ANALYSIS:
        return getAnalysis();
      case HazardAnalysisPackage.DESIGN__RATIONALE:
        return getRationale();
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
      case HazardAnalysisPackage.DESIGN__ALLOCATION:
        setAllocation((String)newValue);
        return;
      case HazardAnalysisPackage.DESIGN__ANALYSIS:
        setAnalysis((String)newValue);
        return;
      case HazardAnalysisPackage.DESIGN__RATIONALE:
        setRationale((String)newValue);
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
      case HazardAnalysisPackage.DESIGN__ALLOCATION:
        setAllocation(ALLOCATION_EDEFAULT);
        return;
      case HazardAnalysisPackage.DESIGN__ANALYSIS:
        setAnalysis(ANALYSIS_EDEFAULT);
        return;
      case HazardAnalysisPackage.DESIGN__RATIONALE:
        setRationale(RATIONALE_EDEFAULT);
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
      case HazardAnalysisPackage.DESIGN__ALLOCATION:
        return ALLOCATION_EDEFAULT == null ? allocation != null : !ALLOCATION_EDEFAULT.equals(allocation);
      case HazardAnalysisPackage.DESIGN__ANALYSIS:
        return ANALYSIS_EDEFAULT == null ? analysis != null : !ANALYSIS_EDEFAULT.equals(analysis);
      case HazardAnalysisPackage.DESIGN__RATIONALE:
        return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
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
    result.append(" (allocation: ");
    result.append(allocation);
    result.append(", analysis: ");
    result.append(analysis);
    result.append(", rationale: ");
    result.append(rationale);
    result.append(')');
    return result.toString();
  }

} //DesignImpl
