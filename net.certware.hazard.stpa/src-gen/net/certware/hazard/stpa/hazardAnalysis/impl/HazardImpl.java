/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import java.util.Collection;

import net.certware.hazard.stpa.hazardAnalysis.Constraint;
import net.certware.hazard.stpa.hazardAnalysis.Hazard;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.HazardLevel;
import net.certware.hazard.stpa.hazardAnalysis.RiskLevel;

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
 * An implementation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.HazardImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HazardImpl extends MinimalEObjectImpl.Container implements Hazard
{
  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected HazardLevel level;

  /**
   * The cached value of the '{@link #getRisk() <em>Risk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRisk()
   * @generated
   * @ordered
   */
  protected RiskLevel risk;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HazardImpl()
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
    return HazardAnalysisPackage.Literals.HAZARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HazardLevel getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLevel(HazardLevel newLevel, NotificationChain msgs)
  {
    HazardLevel oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD__LEVEL, oldLevel, newLevel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(HazardLevel newLevel)
  {
    if (newLevel != level)
    {
      NotificationChain msgs = null;
      if (level != null)
        msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD__LEVEL, null, msgs);
      if (newLevel != null)
        msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD__LEVEL, null, msgs);
      msgs = basicSetLevel(newLevel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD__LEVEL, newLevel, newLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RiskLevel getRisk()
  {
    return risk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRisk(RiskLevel newRisk, NotificationChain msgs)
  {
    RiskLevel oldRisk = risk;
    risk = newRisk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD__RISK, oldRisk, newRisk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRisk(RiskLevel newRisk)
  {
    if (newRisk != risk)
    {
      NotificationChain msgs = null;
      if (risk != null)
        msgs = ((InternalEObject)risk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD__RISK, null, msgs);
      if (newRisk != null)
        msgs = ((InternalEObject)newRisk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HazardAnalysisPackage.HAZARD__RISK, null, msgs);
      msgs = basicSetRisk(newRisk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.HAZARD__RISK, newRisk, newRisk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, HazardAnalysisPackage.HAZARD__CONSTRAINTS);
    }
    return constraints;
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
      case HazardAnalysisPackage.HAZARD__LEVEL:
        return basicSetLevel(null, msgs);
      case HazardAnalysisPackage.HAZARD__RISK:
        return basicSetRisk(null, msgs);
      case HazardAnalysisPackage.HAZARD__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
      case HazardAnalysisPackage.HAZARD__DESC:
        return getDesc();
      case HazardAnalysisPackage.HAZARD__LEVEL:
        return getLevel();
      case HazardAnalysisPackage.HAZARD__RISK:
        return getRisk();
      case HazardAnalysisPackage.HAZARD__CONSTRAINTS:
        return getConstraints();
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
      case HazardAnalysisPackage.HAZARD__DESC:
        setDesc((String)newValue);
        return;
      case HazardAnalysisPackage.HAZARD__LEVEL:
        setLevel((HazardLevel)newValue);
        return;
      case HazardAnalysisPackage.HAZARD__RISK:
        setRisk((RiskLevel)newValue);
        return;
      case HazardAnalysisPackage.HAZARD__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
      case HazardAnalysisPackage.HAZARD__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case HazardAnalysisPackage.HAZARD__LEVEL:
        setLevel((HazardLevel)null);
        return;
      case HazardAnalysisPackage.HAZARD__RISK:
        setRisk((RiskLevel)null);
        return;
      case HazardAnalysisPackage.HAZARD__CONSTRAINTS:
        getConstraints().clear();
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
      case HazardAnalysisPackage.HAZARD__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case HazardAnalysisPackage.HAZARD__LEVEL:
        return level != null;
      case HazardAnalysisPackage.HAZARD__RISK:
        return risk != null;
      case HazardAnalysisPackage.HAZARD__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
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
    result.append(" (desc: ");
    result.append(desc);
    result.append(')');
    return result.toString();
  }

} //HazardImpl
