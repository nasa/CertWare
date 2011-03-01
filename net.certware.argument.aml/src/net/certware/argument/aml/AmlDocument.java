/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getTemplate <em>Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getExhibit <em>Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getPerson <em>Person</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getMemo <em>Memo</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.AmlDocument#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getAmlDocument()
 * @model extendedMetaData="name='amlDocument_._type' kind='elementOnly'"
 * @generated
 */
public interface AmlDocument extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Template}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt; This is the definition for an AML argument template&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Template()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Template> getTemplate();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt; This is the definition for an AML argument&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Argument()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='argument' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Argument> getArgument();

	/**
	 * Returns the value of the '<em><b>Exhibit</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Exhibit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt; This is the definition for an AML exhibit&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exhibit</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Exhibit()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exhibit' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Exhibit> getExhibit();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Collection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Collection> getCollection();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Person()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Memo</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Memo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memo</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Memo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='memo' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Memo> getMemo();

	/**
	 * Returns the value of the '<em><b>Discovery Method</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.DiscoveryMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Method</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_DiscoveryMethod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='discoveryMethod' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DiscoveryMethod> getDiscoveryMethod();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.certware.argument.aml.AmlPackage#getAmlDocument_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.AmlDocument#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // AmlDocument
