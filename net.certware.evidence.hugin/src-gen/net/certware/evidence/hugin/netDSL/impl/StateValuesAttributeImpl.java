/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import java.lang.Integer;

import java.util.Collection;

import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.StateValuesAttribute;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Values Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.StateValuesAttributeImpl#getNumbers <em>Numbers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateValuesAttributeImpl extends AttributeImpl implements StateValuesAttribute
{
  /**
   * The cached value of the '{@link #getNumbers() <em>Numbers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumbers()
   * @generated
   * @ordered
   */
  protected EList<Integer> numbers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateValuesAttributeImpl()
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
    return NetDSLPackage.Literals.STATE_VALUES_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getNumbers()
  {
    if (numbers == null)
    {
      numbers = new EDataTypeEList<Integer>(Integer.class, this, NetDSLPackage.STATE_VALUES_ATTRIBUTE__NUMBERS);
    }
    return numbers;
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
      case NetDSLPackage.STATE_VALUES_ATTRIBUTE__NUMBERS:
        return getNumbers();
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
      case NetDSLPackage.STATE_VALUES_ATTRIBUTE__NUMBERS:
        getNumbers().clear();
        getNumbers().addAll((Collection<? extends Integer>)newValue);
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
      case NetDSLPackage.STATE_VALUES_ATTRIBUTE__NUMBERS:
        getNumbers().clear();
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
      case NetDSLPackage.STATE_VALUES_ATTRIBUTE__NUMBERS:
        return numbers != null && !numbers.isEmpty();
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
    result.append(" (numbers: ");
    result.append(numbers);
    result.append(')');
    return result.toString();
  }

} //StateValuesAttributeImpl
