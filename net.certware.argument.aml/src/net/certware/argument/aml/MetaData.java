/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.MetaData#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getSecurityMarking <em>Security Marking</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getCreator <em>Creator</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getReader <em>Reader</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getContributor <em>Contributor</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getDate <em>Date</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getFormat <em>Format</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getRelation <em>Relation</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getRights <em>Rights</em>}</li>
 *   <li>{@link net.certware.argument.aml.MetaData#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getMetaData()
 * @model extendedMetaData="name='metaData_._type' kind='elementOnly'"
 * @generated
 */
public interface MetaData extends EObject {
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
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getTitle();

	/**
	 * Returns the value of the '<em><b>Security Marking</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Marking</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Marking</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_SecurityMarking()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='securityMarking' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getSecurityMarking();

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Creator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Creator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Creator> getCreator();

	/**
	 * Returns the value of the '<em><b>Reader</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Reader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Reader()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reader' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Reader> getReader();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Subject()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getSubject();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Publisher()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Publisher> getPublisher();

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Contributor()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getContributor();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.XMLGregorianCalendar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Date()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<XMLGregorianCalendar> getDate();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Type()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getType();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Format()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getFormat();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Identifier()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Source()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getSource();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Language()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getLanguage();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Relation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getRelation();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Coverage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Coverage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Coverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Rights()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getRights();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getMetaData_Image()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getImage();

} // MetaData
