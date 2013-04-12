/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ClassInstance#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ClassInstance#getClassName <em>Class Name</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ClassInstance#getInput <em>Input</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ClassInstance#getOutput <em>Output</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.ClassInstance#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getClassInstance()
 * @model
 * @generated
 */
public interface ClassInstance extends ClassElement
{
  /**
   * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Name</em>' attribute.
   * @see #setInstanceName(String)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getClassInstance_InstanceName()
   * @model
   * @generated
   */
  String getInstanceName();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getInstanceName <em>Instance Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Name</em>' attribute.
   * @see #getInstanceName()
   * @generated
   */
  void setInstanceName(String value);

  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getClassInstance_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(InputBindings)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getClassInstance_Input()
   * @model containment="true"
   * @generated
   */
  InputBindings getInput();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(InputBindings value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(OutputBindings)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getClassInstance_Output()
   * @model containment="true"
   * @generated
   */
  OutputBindings getOutput();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(OutputBindings value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(NodeAttributes)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getClassInstance_Attributes()
   * @model containment="true"
   * @generated
   */
  NodeAttributes getAttributes();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(NodeAttributes value);

} // ClassInstance
