/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.math.BigDecimal;

import net.certware.intent.state.stateSpecification.StateSpecificationPackage;
import net.certware.intent.state.stateSpecification.ValueRange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ValueRangeImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ValueRangeImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ValueRangeImpl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ValueRangeImpl#getRangeUnits <em>Range Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueRangeImpl extends MinimalEObjectImpl.Container implements ValueRange
{
  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final BigDecimal LOWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected BigDecimal lower = LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected static final BigDecimal UPPER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpper()
   * @generated
   * @ordered
   */
  protected BigDecimal upper = UPPER_EDEFAULT;

  /**
   * The default value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeType()
   * @generated
   * @ordered
   */
  protected static final String RANGE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeType()
   * @generated
   * @ordered
   */
  protected String rangeType = RANGE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getRangeUnits() <em>Range Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeUnits()
   * @generated
   * @ordered
   */
  protected static final String RANGE_UNITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRangeUnits() <em>Range Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangeUnits()
   * @generated
   * @ordered
   */
  protected String rangeUnits = RANGE_UNITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueRangeImpl()
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
    return StateSpecificationPackage.Literals.VALUE_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getLower()
  {
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(BigDecimal newLower)
  {
    BigDecimal oldLower = lower;
    lower = newLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.VALUE_RANGE__LOWER, oldLower, lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getUpper()
  {
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(BigDecimal newUpper)
  {
    BigDecimal oldUpper = upper;
    upper = newUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.VALUE_RANGE__UPPER, oldUpper, upper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRangeType()
  {
    return rangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeType(String newRangeType)
  {
    String oldRangeType = rangeType;
    rangeType = newRangeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.VALUE_RANGE__RANGE_TYPE, oldRangeType, rangeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRangeUnits()
  {
    return rangeUnits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRangeUnits(String newRangeUnits)
  {
    String oldRangeUnits = rangeUnits;
    rangeUnits = newRangeUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.VALUE_RANGE__RANGE_UNITS, oldRangeUnits, rangeUnits));
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
      case StateSpecificationPackage.VALUE_RANGE__LOWER:
        return getLower();
      case StateSpecificationPackage.VALUE_RANGE__UPPER:
        return getUpper();
      case StateSpecificationPackage.VALUE_RANGE__RANGE_TYPE:
        return getRangeType();
      case StateSpecificationPackage.VALUE_RANGE__RANGE_UNITS:
        return getRangeUnits();
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
      case StateSpecificationPackage.VALUE_RANGE__LOWER:
        setLower((BigDecimal)newValue);
        return;
      case StateSpecificationPackage.VALUE_RANGE__UPPER:
        setUpper((BigDecimal)newValue);
        return;
      case StateSpecificationPackage.VALUE_RANGE__RANGE_TYPE:
        setRangeType((String)newValue);
        return;
      case StateSpecificationPackage.VALUE_RANGE__RANGE_UNITS:
        setRangeUnits((String)newValue);
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
      case StateSpecificationPackage.VALUE_RANGE__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case StateSpecificationPackage.VALUE_RANGE__UPPER:
        setUpper(UPPER_EDEFAULT);
        return;
      case StateSpecificationPackage.VALUE_RANGE__RANGE_TYPE:
        setRangeType(RANGE_TYPE_EDEFAULT);
        return;
      case StateSpecificationPackage.VALUE_RANGE__RANGE_UNITS:
        setRangeUnits(RANGE_UNITS_EDEFAULT);
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
      case StateSpecificationPackage.VALUE_RANGE__LOWER:
        return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
      case StateSpecificationPackage.VALUE_RANGE__UPPER:
        return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
      case StateSpecificationPackage.VALUE_RANGE__RANGE_TYPE:
        return RANGE_TYPE_EDEFAULT == null ? rangeType != null : !RANGE_TYPE_EDEFAULT.equals(rangeType);
      case StateSpecificationPackage.VALUE_RANGE__RANGE_UNITS:
        return RANGE_UNITS_EDEFAULT == null ? rangeUnits != null : !RANGE_UNITS_EDEFAULT.equals(rangeUnits);
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
    result.append(" (lower: ");
    result.append(lower);
    result.append(", upper: ");
    result.append(upper);
    result.append(", rangeType: ");
    result.append(rangeType);
    result.append(", rangeUnits: ");
    result.append(rangeUnits);
    result.append(')');
    return result.toString();
  }

} //ValueRangeImpl
