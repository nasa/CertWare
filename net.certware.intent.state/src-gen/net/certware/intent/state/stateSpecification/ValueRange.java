/**
 */
package net.certware.intent.state.stateSpecification;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.ValueRange#getLower <em>Lower</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ValueRange#getUpper <em>Upper</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ValueRange#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ValueRange#getRangeUnits <em>Range Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getValueRange()
 * @model
 * @generated
 */
public interface ValueRange extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(BigDecimal)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getValueRange_Lower()
   * @model
   * @generated
   */
  BigDecimal getLower();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ValueRange#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(BigDecimal)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getValueRange_Upper()
   * @model
   * @generated
   */
  BigDecimal getUpper();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ValueRange#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Range Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Type</em>' attribute.
   * @see #setRangeType(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getValueRange_RangeType()
   * @model
   * @generated
   */
  String getRangeType();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ValueRange#getRangeType <em>Range Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Type</em>' attribute.
   * @see #getRangeType()
   * @generated
   */
  void setRangeType(String value);

  /**
   * Returns the value of the '<em><b>Range Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range Units</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Units</em>' attribute.
   * @see #setRangeUnits(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getValueRange_RangeUnits()
   * @model
   * @generated
   */
  String getRangeUnits();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ValueRange#getRangeUnits <em>Range Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Units</em>' attribute.
   * @see #getRangeUnits()
   * @generated
   */
  void setRangeUnits(String value);

} // ValueRange
