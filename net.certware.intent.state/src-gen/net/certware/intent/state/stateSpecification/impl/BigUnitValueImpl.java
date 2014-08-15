/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.math.BigDecimal;

import net.certware.intent.state.stateSpecification.BigUnitValue;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big Unit Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.BigUnitValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.BigUnitValueImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BigUnitValueImpl extends MinimalEObjectImpl.Container implements BigUnitValue
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final BigDecimal VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected BigDecimal value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected static final String UNITS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnits()
   * @generated
   * @ordered
   */
  protected String units = UNITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BigUnitValueImpl()
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
    return StateSpecificationPackage.Literals.BIG_UNIT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(BigDecimal newValue)
  {
    BigDecimal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.BIG_UNIT_VALUE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnits()
  {
    return units;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnits(String newUnits)
  {
    String oldUnits = units;
    units = newUnits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.BIG_UNIT_VALUE__UNITS, oldUnits, units));
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
      case StateSpecificationPackage.BIG_UNIT_VALUE__VALUE:
        return getValue();
      case StateSpecificationPackage.BIG_UNIT_VALUE__UNITS:
        return getUnits();
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
      case StateSpecificationPackage.BIG_UNIT_VALUE__VALUE:
        setValue((BigDecimal)newValue);
        return;
      case StateSpecificationPackage.BIG_UNIT_VALUE__UNITS:
        setUnits((String)newValue);
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
      case StateSpecificationPackage.BIG_UNIT_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case StateSpecificationPackage.BIG_UNIT_VALUE__UNITS:
        setUnits(UNITS_EDEFAULT);
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
      case StateSpecificationPackage.BIG_UNIT_VALUE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case StateSpecificationPackage.BIG_UNIT_VALUE__UNITS:
        return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
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
    result.append(" (value: ");
    result.append(value);
    result.append(", units: ");
    result.append(units);
    result.append(')');
    return result.toString();
  }

} //BigUnitValueImpl
