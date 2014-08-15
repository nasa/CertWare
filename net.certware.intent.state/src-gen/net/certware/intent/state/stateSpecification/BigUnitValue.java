/**
 */
package net.certware.intent.state.stateSpecification;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Unit Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.BigUnitValue#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.BigUnitValue#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getBigUnitValue()
 * @model
 * @generated
 */
public interface BigUnitValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(BigDecimal)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getBigUnitValue_Value()
   * @model
   * @generated
   */
  BigDecimal getValue();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.BigUnitValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Units</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' attribute.
   * @see #setUnits(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getBigUnitValue_Units()
   * @model
   * @generated
   */
  String getUnits();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.BigUnitValue#getUnits <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Units</em>' attribute.
   * @see #getUnits()
   * @generated
   */
  void setUnits(String value);

} // BigUnitValue
