/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.Collection#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getCreatingTool <em>Creating Tool</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getQuestion <em>Question</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getArgumentTemplate <em>Argument Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getCollectionItem <em>Collection Item</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getLabel1 <em>Label1</em>}</li>
 *   <li>{@link net.certware.argument.aml.Collection#getObjectType <em>Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getCollection()
 * @model extendedMetaData="name='collection_._type' kind='elementOnly'"
 * @generated
 */
public interface Collection extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;These terms come from Dublin core work - http://dublincore.org/documents/dces/"&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference.
	 * @see #setMetaData(MetaData)
	 * @see net.certware.argument.aml.AmlPackage#getCollection_MetaData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metaData' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaData getMetaData();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Collection#getMetaData <em>Meta Data</em>}' containment reference.
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
	 * @see net.certware.argument.aml.AmlPackage#getCollection_CreatingTool()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creatingTool' namespace='##targetNamespace'"
	 * @generated
	 */
	CreatingTool getCreatingTool();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Collection#getCreatingTool <em>Creating Tool</em>}' containment reference.
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
	 * @see net.certware.argument.aml.AmlPackage#getCollection_Annotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(Question)
	 * @see net.certware.argument.aml.AmlPackage#getCollection_Question()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Collection#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

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
	 * @see net.certware.argument.aml.AmlPackage#getCollection_ArgumentTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='argumentTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgumentTemplate getArgumentTemplate();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Collection#getArgumentTemplate <em>Argument Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Template</em>' containment reference.
	 * @see #getArgumentTemplate()
	 * @generated
	 */
	void setArgumentTemplate(ArgumentTemplate value);

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
	 * @see net.certware.argument.aml.AmlPackage#getCollection_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getCollection_Label()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='group:5'"
	 * @generated
	 */
	EList<String> getLabel();

	/**
	 * Returns the value of the '<em><b>Collection Item</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.CollectionItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Item</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getCollection_CollectionItem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collectionItem' namespace='##targetNamespace' group='group:5'"
	 * @generated
	 */
	EList<CollectionItem> getCollectionItem();

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
	 * @see net.certware.argument.aml.AmlPackage#getCollection_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Collection#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Label1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label1</em>' attribute.
	 * @see #setLabel1(String)
	 * @see net.certware.argument.aml.AmlPackage#getCollection_Label1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel1();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Collection#getLabel1 <em>Label1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label1</em>' attribute.
	 * @see #getLabel1()
	 * @generated
	 */
	void setLabel1(String value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.argument.aml.ObjectType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see net.certware.argument.aml.ObjectType2
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #setObjectType(ObjectType2)
	 * @see net.certware.argument.aml.AmlPackage#getCollection_ObjectType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='object-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType2 getObjectType();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Collection#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see net.certware.argument.aml.ObjectType2
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(ObjectType2 value);

	/**
	 * Unsets the value of the '{@link net.certware.argument.aml.Collection#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(ObjectType2)
	 * @generated
	 */
	void unsetObjectType();

	/**
	 * Returns whether the value of the '{@link net.certware.argument.aml.Collection#getObjectType <em>Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Type</em>' attribute is set.
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(ObjectType2)
	 * @generated
	 */
	boolean isSetObjectType();

} // Collection
