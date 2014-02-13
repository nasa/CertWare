/**
 */
package net.certware.intent.state.stateSpecification.impl;

import java.math.BigDecimal;

import java.util.Collection;

import net.certware.intent.state.stateSpecification.BigUnitValue;
import net.certware.intent.state.stateSpecification.Input;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getRangeUnits <em>Range Units</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getValues <em>Values</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.InputImpl#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input
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
   * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<String> values;

  /**
   * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRate()
   * @generated
   * @ordered
   */
  protected BigUnitValue rate;

  /**
   * The default value of the '{@link #getVariables() <em>Variables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected static final String VARIABLES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected String variables = VARIABLES_EDEFAULT;

  /**
   * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected static final String REFERENCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected String references = REFERENCES_EDEFAULT;

  /**
   * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected static final String COMMENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComments()
   * @generated
   * @ordered
   */
  protected String comments = COMMENTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputImpl()
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
    return StateSpecificationPackage.Literals.INPUT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__LOWER, oldLower, lower));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__UPPER, oldUpper, upper));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__RANGE_TYPE, oldRangeType, rangeType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__RANGE_UNITS, oldRangeUnits, rangeUnits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getValues()
  {
    if (values == null)
    {
      values = new EDataTypeEList<String>(String.class, this, StateSpecificationPackage.INPUT__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigUnitValue getRate()
  {
    return rate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRate(BigUnitValue newRate, NotificationChain msgs)
  {
    BigUnitValue oldRate = rate;
    rate = newRate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__RATE, oldRate, newRate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRate(BigUnitValue newRate)
  {
    if (newRate != rate)
    {
      NotificationChain msgs = null;
      if (rate != null)
        msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__RATE, null, msgs);
      if (newRate != null)
        msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateSpecificationPackage.INPUT__RATE, null, msgs);
      msgs = basicSetRate(newRate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__RATE, newRate, newRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariables()
  {
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariables(String newVariables)
  {
    String oldVariables = variables;
    variables = newVariables;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__VARIABLES, oldVariables, variables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferences()
  {
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferences(String newReferences)
  {
    String oldReferences = references;
    references = newReferences;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__REFERENCES, oldReferences, references));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComments()
  {
    return comments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComments(String newComments)
  {
    String oldComments = comments;
    comments = newComments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.INPUT__COMMENTS, oldComments, comments));
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
      case StateSpecificationPackage.INPUT__RATE:
        return basicSetRate(null, msgs);
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
      case StateSpecificationPackage.INPUT__LOWER:
        return getLower();
      case StateSpecificationPackage.INPUT__UPPER:
        return getUpper();
      case StateSpecificationPackage.INPUT__RANGE_TYPE:
        return getRangeType();
      case StateSpecificationPackage.INPUT__RANGE_UNITS:
        return getRangeUnits();
      case StateSpecificationPackage.INPUT__VALUES:
        return getValues();
      case StateSpecificationPackage.INPUT__RATE:
        return getRate();
      case StateSpecificationPackage.INPUT__VARIABLES:
        return getVariables();
      case StateSpecificationPackage.INPUT__REFERENCES:
        return getReferences();
      case StateSpecificationPackage.INPUT__COMMENTS:
        return getComments();
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
      case StateSpecificationPackage.INPUT__LOWER:
        setLower((BigDecimal)newValue);
        return;
      case StateSpecificationPackage.INPUT__UPPER:
        setUpper((BigDecimal)newValue);
        return;
      case StateSpecificationPackage.INPUT__RANGE_TYPE:
        setRangeType((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__RANGE_UNITS:
        setRangeUnits((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends String>)newValue);
        return;
      case StateSpecificationPackage.INPUT__RATE:
        setRate((BigUnitValue)newValue);
        return;
      case StateSpecificationPackage.INPUT__VARIABLES:
        setVariables((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__REFERENCES:
        setReferences((String)newValue);
        return;
      case StateSpecificationPackage.INPUT__COMMENTS:
        setComments((String)newValue);
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
      case StateSpecificationPackage.INPUT__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__UPPER:
        setUpper(UPPER_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__RANGE_TYPE:
        setRangeType(RANGE_TYPE_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__RANGE_UNITS:
        setRangeUnits(RANGE_UNITS_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__VALUES:
        getValues().clear();
        return;
      case StateSpecificationPackage.INPUT__RATE:
        setRate((BigUnitValue)null);
        return;
      case StateSpecificationPackage.INPUT__VARIABLES:
        setVariables(VARIABLES_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__REFERENCES:
        setReferences(REFERENCES_EDEFAULT);
        return;
      case StateSpecificationPackage.INPUT__COMMENTS:
        setComments(COMMENTS_EDEFAULT);
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
      case StateSpecificationPackage.INPUT__LOWER:
        return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
      case StateSpecificationPackage.INPUT__UPPER:
        return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
      case StateSpecificationPackage.INPUT__RANGE_TYPE:
        return RANGE_TYPE_EDEFAULT == null ? rangeType != null : !RANGE_TYPE_EDEFAULT.equals(rangeType);
      case StateSpecificationPackage.INPUT__RANGE_UNITS:
        return RANGE_UNITS_EDEFAULT == null ? rangeUnits != null : !RANGE_UNITS_EDEFAULT.equals(rangeUnits);
      case StateSpecificationPackage.INPUT__VALUES:
        return values != null && !values.isEmpty();
      case StateSpecificationPackage.INPUT__RATE:
        return rate != null;
      case StateSpecificationPackage.INPUT__VARIABLES:
        return VARIABLES_EDEFAULT == null ? variables != null : !VARIABLES_EDEFAULT.equals(variables);
      case StateSpecificationPackage.INPUT__REFERENCES:
        return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
      case StateSpecificationPackage.INPUT__COMMENTS:
        return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
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
    result.append(", values: ");
    result.append(values);
    result.append(", variables: ");
    result.append(variables);
    result.append(", references: ");
    result.append(references);
    result.append(", comments: ");
    result.append(comments);
    result.append(')');
    return result.toString();
  }

} //InputImpl
