/**
 */
package net.certware.intent.state.stateSpecification;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getLower <em>Lower</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getUpper <em>Upper</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getRangeUnits <em>Range Units</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getValues <em>Values</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getRate <em>Rate</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getVariables <em>Variables</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Lower()
   * @model
   * @generated
   */
  BigDecimal getLower();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getLower <em>Lower</em>}' attribute.
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Upper()
   * @model
   * @generated
   */
  BigDecimal getUpper();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getUpper <em>Upper</em>}' attribute.
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_RangeType()
   * @model
   * @generated
   */
  String getRangeType();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getRangeType <em>Range Type</em>}' attribute.
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_RangeUnits()
   * @model
   * @generated
   */
  String getRangeUnits();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getRangeUnits <em>Range Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Units</em>' attribute.
   * @see #getRangeUnits()
   * @generated
   */
  void setRangeUnits(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

  /**
   * Returns the value of the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' containment reference.
   * @see #setRate(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Rate()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getRate();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getRate <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' containment reference.
   * @see #getRate()
   * @generated
   */
  void setRate(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute.
   * @see #setVariables(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Variables()
   * @model
   * @generated
   */
  String getVariables();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getVariables <em>Variables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' attribute.
   * @see #getVariables()
   * @generated
   */
  void setVariables(String value);

  /**
   * Returns the value of the '<em><b>References</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' attribute.
   * @see #setReferences(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_References()
   * @model
   * @generated
   */
  String getReferences();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getReferences <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>References</em>' attribute.
   * @see #getReferences()
   * @generated
   */
  void setReferences(String value);

  /**
   * Returns the value of the '<em><b>Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' attribute.
   * @see #setComments(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Comments()
   * @model
   * @generated
   */
  String getComments();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getComments <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comments</em>' attribute.
   * @see #getComments()
   * @generated
   */
  void setComments(String value);

} // Input
