/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.Template#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.certware.argument.aml.Template#getCreatingTool <em>Creating Tool</em>}</li>
 *   <li>{@link net.certware.argument.aml.Template#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.Template#getQuestion <em>Question</em>}</li>
 *   <li>{@link net.certware.argument.aml.Template#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getTemplate()
 * @model extendedMetaData="name='template_._type' kind='elementOnly'"
 * @generated
 */
public interface Template extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;These terms come from Dublin core work - http://dublincore.org/documents/dces/"&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference.
	 * @see #setMetaData(MetaData)
	 * @see net.certware.argument.aml.AmlPackage#getTemplate_MetaData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metaData' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaData getMetaData();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Template#getMetaData <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' containment reference.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(MetaData value);

	/**
	 * Returns the value of the '<em><b>Creating Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creating Tool</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creating Tool</em>' containment reference.
	 * @see #setCreatingTool(CreatingTool)
	 * @see net.certware.argument.aml.AmlPackage#getTemplate_CreatingTool()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creatingTool' namespace='##targetNamespace'"
	 * @generated
	 */
	CreatingTool getCreatingTool();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Template#getCreatingTool <em>Creating Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creating Tool</em>' containment reference.
	 * @see #getCreatingTool()
	 * @generated
	 */
	void setCreatingTool(CreatingTool value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;A note attached to an object. One example of an annotation is a memo. Alternatively you could just have free text&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getTemplate_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getTemplate_Question()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Question> getQuestion();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.certware.argument.aml.AmlPackage#getTemplate_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Template#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Template
