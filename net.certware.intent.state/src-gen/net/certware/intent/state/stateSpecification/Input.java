/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getRange <em>Range</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getValueHandling <em>Value Handling</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateAvg <em>Arrival Rate Avg</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateMinimum <em>Arrival Rate Minimum</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateMaximum <em>Arrival Rate Maximum</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getObsolescence <em>Obsolescence</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getAppearsIn <em>Appears In</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getComments <em>Comments</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.Input#getStructure <em>Structure</em>}</li>
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
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(ValueRange)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Range()
   * @model containment="true"
   * @generated
   */
  ValueRange getRange();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getRange <em>Range</em>}' containment reference.
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_ValueList()
   * @model containment="true"
   * @generated
   */
  ValueList getValueList();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getValueList <em>Value List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value List</em>' containment reference.
   * @see #getValueList()
   * @generated
   */
  void setValueList(ValueList value);

  /**
   * Returns the value of the '<em><b>Value Handling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Handling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Handling</em>' attribute.
   * @see #setValueHandling(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_ValueHandling()
   * @model
   * @generated
   */
  String getValueHandling();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getValueHandling <em>Value Handling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Handling</em>' attribute.
   * @see #getValueHandling()
   * @generated
   */
  void setValueHandling(String value);

  /**
   * Returns the value of the '<em><b>Granularity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Granularity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Granularity</em>' containment reference.
   * @see #setGranularity(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Granularity()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getGranularity();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getGranularity <em>Granularity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Granularity</em>' containment reference.
   * @see #getGranularity()
   * @generated
   */
  void setGranularity(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Arrival Rate Avg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrival Rate Avg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrival Rate Avg</em>' containment reference.
   * @see #setArrivalRateAvg(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_ArrivalRateAvg()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getArrivalRateAvg();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateAvg <em>Arrival Rate Avg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrival Rate Avg</em>' containment reference.
   * @see #getArrivalRateAvg()
   * @generated
   */
  void setArrivalRateAvg(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Arrival Rate Minimum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrival Rate Minimum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrival Rate Minimum</em>' containment reference.
   * @see #setArrivalRateMinimum(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_ArrivalRateMinimum()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getArrivalRateMinimum();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateMinimum <em>Arrival Rate Minimum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrival Rate Minimum</em>' containment reference.
   * @see #getArrivalRateMinimum()
   * @generated
   */
  void setArrivalRateMinimum(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Arrival Rate Maximum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrival Rate Maximum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrival Rate Maximum</em>' containment reference.
   * @see #setArrivalRateMaximum(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_ArrivalRateMaximum()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getArrivalRateMaximum();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getArrivalRateMaximum <em>Arrival Rate Maximum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arrival Rate Maximum</em>' containment reference.
   * @see #getArrivalRateMaximum()
   * @generated
   */
  void setArrivalRateMaximum(BigUnitValue value);

  /**
   * Returns the value of the '<em><b>Obsolescence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obsolescence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obsolescence</em>' containment reference.
   * @see #setObsolescence(BigUnitValue)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Obsolescence()
   * @model containment="true"
   * @generated
   */
  BigUnitValue getObsolescence();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getObsolescence <em>Obsolescence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obsolescence</em>' containment reference.
   * @see #getObsolescence()
   * @generated
   */
  void setObsolescence(BigUnitValue value);

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
   * Returns the value of the '<em><b>Appears In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Appears In</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Appears In</em>' attribute.
   * @see #setAppearsIn(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_AppearsIn()
   * @model
   * @generated
   */
  String getAppearsIn();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getAppearsIn <em>Appears In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Appears In</em>' attribute.
   * @see #getAppearsIn()
   * @generated
   */
  void setAppearsIn(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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

  /**
   * Returns the value of the '<em><b>Structure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structure</em>' containment reference.
   * @see #setStructure(TriggerTable)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getInput_Structure()
   * @model containment="true"
   * @generated
   */
  TriggerTable getStructure();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.Input#getStructure <em>Structure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structure</em>' containment reference.
   * @see #getStructure()
   * @generated
   */
  void setStructure(TriggerTable value);

} // Input
