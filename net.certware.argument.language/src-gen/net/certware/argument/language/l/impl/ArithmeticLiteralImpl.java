/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.ArithmeticLiteral;
import net.certware.argument.language.l.LPackage;
import net.certware.argument.language.l.TypedVariable;
import net.certware.argument.language.l.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.ArithmeticLiteralImpl#getV <em>V</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.ArithmeticLiteralImpl#getTv <em>Tv</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.ArithmeticLiteralImpl#getConst <em>Const</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.ArithmeticLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArithmeticLiteralImpl extends MinimalEObjectImpl.Container implements ArithmeticLiteral
{
  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Variable v;

  /**
   * The cached value of the '{@link #getTv() <em>Tv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTv()
   * @generated
   * @ordered
   */
  protected TypedVariable tv;

  /**
   * The default value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected static final String CONST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConst() <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConst()
   * @generated
   * @ordered
   */
  protected String const_ = CONST_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArithmeticLiteralImpl()
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
    return LPackage.Literals.ARITHMETIC_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(Variable newV, NotificationChain msgs)
  {
    Variable oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.ARITHMETIC_LITERAL__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Variable newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.ARITHMETIC_LITERAL__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.ARITHMETIC_LITERAL__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.ARITHMETIC_LITERAL__V, newV, newV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedVariable getTv()
  {
    return tv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTv(TypedVariable newTv, NotificationChain msgs)
  {
    TypedVariable oldTv = tv;
    tv = newTv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.ARITHMETIC_LITERAL__TV, oldTv, newTv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTv(TypedVariable newTv)
  {
    if (newTv != tv)
    {
      NotificationChain msgs = null;
      if (tv != null)
        msgs = ((InternalEObject)tv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.ARITHMETIC_LITERAL__TV, null, msgs);
      if (newTv != null)
        msgs = ((InternalEObject)newTv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.ARITHMETIC_LITERAL__TV, null, msgs);
      msgs = basicSetTv(newTv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.ARITHMETIC_LITERAL__TV, newTv, newTv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConst()
  {
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConst(String newConst)
  {
    String oldConst = const_;
    const_ = newConst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.ARITHMETIC_LITERAL__CONST, oldConst, const_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.ARITHMETIC_LITERAL__VALUE, oldValue, value));
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
      case LPackage.ARITHMETIC_LITERAL__V:
        return basicSetV(null, msgs);
      case LPackage.ARITHMETIC_LITERAL__TV:
        return basicSetTv(null, msgs);
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
      case LPackage.ARITHMETIC_LITERAL__V:
        return getV();
      case LPackage.ARITHMETIC_LITERAL__TV:
        return getTv();
      case LPackage.ARITHMETIC_LITERAL__CONST:
        return getConst();
      case LPackage.ARITHMETIC_LITERAL__VALUE:
        return getValue();
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
      case LPackage.ARITHMETIC_LITERAL__V:
        setV((Variable)newValue);
        return;
      case LPackage.ARITHMETIC_LITERAL__TV:
        setTv((TypedVariable)newValue);
        return;
      case LPackage.ARITHMETIC_LITERAL__CONST:
        setConst((String)newValue);
        return;
      case LPackage.ARITHMETIC_LITERAL__VALUE:
        setValue((String)newValue);
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
      case LPackage.ARITHMETIC_LITERAL__V:
        setV((Variable)null);
        return;
      case LPackage.ARITHMETIC_LITERAL__TV:
        setTv((TypedVariable)null);
        return;
      case LPackage.ARITHMETIC_LITERAL__CONST:
        setConst(CONST_EDEFAULT);
        return;
      case LPackage.ARITHMETIC_LITERAL__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case LPackage.ARITHMETIC_LITERAL__V:
        return v != null;
      case LPackage.ARITHMETIC_LITERAL__TV:
        return tv != null;
      case LPackage.ARITHMETIC_LITERAL__CONST:
        return CONST_EDEFAULT == null ? const_ != null : !CONST_EDEFAULT.equals(const_);
      case LPackage.ARITHMETIC_LITERAL__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (const: ");
    result.append(const_);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //ArithmeticLiteralImpl
