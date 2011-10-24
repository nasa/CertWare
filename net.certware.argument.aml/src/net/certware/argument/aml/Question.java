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
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.Question#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getChoice <em>Choice</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getQuestionRelationships <em>Question Relationships</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getAggregationRule <em>Aggregation Rule</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getAmplification <em>Amplification</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.Question#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getQuestion()
 * @model extendedMetaData="name='question_._type' kind='elementOnly'"
 * @generated
 */
public interface Question extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

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
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Type()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EObject> getType();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Choice()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Choice> getChoice();

	/**
	 * Returns the value of the '<em><b>Question Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.QuestionRelationships}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Relationships</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_QuestionRelationships()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='questionRelationships' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<QuestionRelationships> getQuestionRelationships();

	/**
	 * Returns the value of the '<em><b>Aggregation Rule</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.AggregationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Rule</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_AggregationRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregationRule' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<AggregationRule> getAggregationRule();

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
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_DiscoveryMethod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='discoveryMethod' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DiscoveryMethod> getDiscoveryMethod();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;A note attached to an object. One example of an annotation is a memo. Alternatively you could just have free text&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Amplification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amplification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplification</em>' attribute.
	 * @see #setAmplification(String)
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Amplification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='amplification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAmplification();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Question#getAmplification <em>Amplification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplification</em>' attribute.
	 * @see #getAmplification()
	 * @generated
	 */
	void setAmplification(String value);

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
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Question#getDescription <em>Description</em>}' attribute.
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
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Question#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see net.certware.argument.aml.AmlPackage#getQuestion_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Question#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Question
