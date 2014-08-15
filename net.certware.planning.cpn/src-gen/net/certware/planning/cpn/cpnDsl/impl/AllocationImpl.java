/**
 */
package net.certware.planning.cpn.cpnDsl.impl;

import net.certware.planning.cpn.cpnDsl.Allocation;
import net.certware.planning.cpn.cpnDsl.CpnDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.AllocationImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.AllocationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.AllocationImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.AllocationImpl#getFacility <em>Facility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocationImpl extends MinimalEObjectImpl.Container implements Allocation
{
  /**
   * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected static final int COST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected int cost = COST_EDEFAULT;

  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getTeam() <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected static final String TEAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTeam() <em>Team</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected String team = TEAM_EDEFAULT;

  /**
   * The default value of the '{@link #getFacility() <em>Facility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacility()
   * @generated
   * @ordered
   */
  protected static final String FACILITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFacility() <em>Facility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFacility()
   * @generated
   * @ordered
   */
  protected String facility = FACILITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllocationImpl()
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
    return CpnDslPackage.Literals.ALLOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(int newCost)
  {
    int oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.ALLOCATION__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.ALLOCATION__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTeam()
  {
    return team;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeam(String newTeam)
  {
    String oldTeam = team;
    team = newTeam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.ALLOCATION__TEAM, oldTeam, team));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFacility()
  {
    return facility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFacility(String newFacility)
  {
    String oldFacility = facility;
    facility = newFacility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CpnDslPackage.ALLOCATION__FACILITY, oldFacility, facility));
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
      case CpnDslPackage.ALLOCATION__COST:
        return getCost();
      case CpnDslPackage.ALLOCATION__DURATION:
        return getDuration();
      case CpnDslPackage.ALLOCATION__TEAM:
        return getTeam();
      case CpnDslPackage.ALLOCATION__FACILITY:
        return getFacility();
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
      case CpnDslPackage.ALLOCATION__COST:
        setCost((Integer)newValue);
        return;
      case CpnDslPackage.ALLOCATION__DURATION:
        setDuration((Integer)newValue);
        return;
      case CpnDslPackage.ALLOCATION__TEAM:
        setTeam((String)newValue);
        return;
      case CpnDslPackage.ALLOCATION__FACILITY:
        setFacility((String)newValue);
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
      case CpnDslPackage.ALLOCATION__COST:
        setCost(COST_EDEFAULT);
        return;
      case CpnDslPackage.ALLOCATION__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case CpnDslPackage.ALLOCATION__TEAM:
        setTeam(TEAM_EDEFAULT);
        return;
      case CpnDslPackage.ALLOCATION__FACILITY:
        setFacility(FACILITY_EDEFAULT);
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
      case CpnDslPackage.ALLOCATION__COST:
        return cost != COST_EDEFAULT;
      case CpnDslPackage.ALLOCATION__DURATION:
        return duration != DURATION_EDEFAULT;
      case CpnDslPackage.ALLOCATION__TEAM:
        return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
      case CpnDslPackage.ALLOCATION__FACILITY:
        return FACILITY_EDEFAULT == null ? facility != null : !FACILITY_EDEFAULT.equals(facility);
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
    result.append(" (cost: ");
    result.append(cost);
    result.append(", duration: ");
    result.append(duration);
    result.append(", team: ");
    result.append(team);
    result.append(", facility: ");
    result.append(facility);
    result.append(')');
    return result.toString();
  }

} //AllocationImpl
