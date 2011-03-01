/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getArgumentTemplate <em>Argument Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getUrl <em>Url</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getAutoTrigger <em>Auto Trigger</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getImportType <em>Import Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.DiscoveryMethod#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod()
 * @model extendedMetaData="name='discoveryMethod_._type' kind='elementOnly'"
 * @generated
 */
public interface DiscoveryMethod extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Argument Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Template</em>' containment reference.
	 * @see #setArgumentTemplate(ArgumentTemplate)
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_ArgumentTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='argumentTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgumentTemplate getArgumentTemplate();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getArgumentTemplate <em>Argument Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Template</em>' containment reference.
	 * @see #getArgumentTemplate()
	 * @generated
	 */
	void setArgumentTemplate(ArgumentTemplate value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;A note attached to an object. One example of an annotation is a memo. Alternatively you could just have free text&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Auto Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Trigger</em>' attribute.
	 * @see #setAutoTrigger(String)
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_AutoTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='autoTrigger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAutoTrigger();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getAutoTrigger <em>Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Trigger</em>' attribute.
	 * @see #getAutoTrigger()
	 * @generated
	 */
	void setAutoTrigger(String value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Type</em>' attribute.
	 * @see #setImportType(String)
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_ImportType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='importType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImportType();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getImportType <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Type</em>' attribute.
	 * @see #getImportType()
	 * @generated
	 */
	void setImportType(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.argument.aml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.argument.aml.Type
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(Type)
	 * @see net.certware.argument.aml.AmlPackage#getDiscoveryMethod_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.argument.aml.Type
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Unsets the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.argument.aml.DiscoveryMethod#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(Type)
	 * @generated
	 */
	boolean isSetType();

} // DiscoveryMethod
