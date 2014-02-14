/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getRange <em>Range</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getRate <em>Rate</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getDelay <em>Delay</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getCompletionHandling <em>Completion Handling</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getVariables <em>Variables</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getMinResponse <em>Min Response</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getMaxResponse <em>Max Response</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getFeebackHandling <em>Feeback Handling</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getReversed <em>Reversed</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getComments <em>Comments</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getContents <em>Contents</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Output#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(ValueRange)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Range()
   * @model containment="true"
   * @generated
   */
  ValueRange getRange();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(ValueRange value);

  /**
   * Returns the value of the '<em><b>Value List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value List</em>' containment reference.
   * @see #setValueList(ValueList)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_ValueList()
   * @model containment="true"
   * @generated
   */
  ValueList getValueList();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getValueList <em>Value List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value List</em>' containment reference.
   * @see #getValueList()
   * @generated
   */
  void setValueList(ValueList value);

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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Rate()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getRate();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getRate <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' containment reference.
   * @see #getRate()
   * @generated
   */
  void setRate(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference.
   * @see #setDelay(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Delay()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getDelay();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Deadline</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deadline</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deadline</em>' containment reference.
   * @see #setDeadline(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Deadline()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getDeadline();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getDeadline <em>Deadline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deadline</em>' containment reference.
   * @see #getDeadline()
   * @generated
   */
  void setDeadline(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Completion Handling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Completion Handling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Completion Handling</em>' attribute.
   * @see #setCompletionHandling(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_CompletionHandling()
   * @model
   * @generated
   */
  String getCompletionHandling();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getCompletionHandling <em>Completion Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Completion Handling</em>' attribute.
   * @see #getCompletionHandling()
   * @generated
   */
  void setCompletionHandling(String value);

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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Variables()
   * @model
   * @generated
   */
  String getVariables();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getVariables <em>Variables</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' attribute.
   * @see #getVariables()
   * @generated
   */
  void setVariables(String value);

  /**
   * Returns the value of the '<em><b>Relationship</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship</em>' attribute.
   * @see #setRelationship(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Relationship()
   * @model
   * @generated
   */
  String getRelationship();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getRelationship <em>Relationship</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship</em>' attribute.
   * @see #getRelationship()
   * @generated
   */
  void setRelationship(String value);

  /**
   * Returns the value of the '<em><b>Min Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Response</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Response</em>' containment reference.
   * @see #setMinResponse(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_MinResponse()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getMinResponse();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getMinResponse <em>Min Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Response</em>' containment reference.
   * @see #getMinResponse()
   * @generated
   */
  void setMinResponse(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Max Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Response</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Response</em>' containment reference.
   * @see #setMaxResponse(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_MaxResponse()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getMaxResponse();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getMaxResponse <em>Max Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Response</em>' containment reference.
   * @see #getMaxResponse()
   * @generated
   */
  void setMaxResponse(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Feeback Handling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feeback Handling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feeback Handling</em>' attribute.
   * @see #setFeebackHandling(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_FeebackHandling()
   * @model
   * @generated
   */
  String getFeebackHandling();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getFeebackHandling <em>Feeback Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feeback Handling</em>' attribute.
   * @see #getFeebackHandling()
   * @generated
   */
  void setFeebackHandling(String value);

  /**
   * Returns the value of the '<em><b>Reversed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reversed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reversed</em>' attribute.
   * @see #setReversed(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Reversed()
   * @model
   * @generated
   */
  String getReversed();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getReversed <em>Reversed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reversed</em>' attribute.
   * @see #getReversed()
   * @generated
   */
  void setReversed(String value);

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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_References()
   * @model
   * @generated
   */
  String getReferences();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getReferences <em>References</em>}' attribute.
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Comments()
   * @model
   * @generated
   */
  String getComments();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getComments <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comments</em>' attribute.
   * @see #getComments()
   * @generated
   */
  void setComments(String value);

  /**
   * Returns the value of the '<em><b>Contents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' attribute.
   * @see #setContents(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Contents()
   * @model
   * @generated
   */
  String getContents();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getContents <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contents</em>' attribute.
   * @see #getContents()
   * @generated
   */
  void setContents(String value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(TriggerTable)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getOutput_Table()
   * @model containment="true"
   * @generated
   */
  TriggerTable getTable();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Output#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TriggerTable value);

} // Output
