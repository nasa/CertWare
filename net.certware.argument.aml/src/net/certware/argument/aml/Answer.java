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
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.Answer#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getBelief <em>Belief</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getWitness <em>Witness</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getRationale <em>Rationale</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getAggregationRule <em>Aggregation Rule</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.Answer#getQuestionId <em>Question Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getAnswer()
 * @model extendedMetaData="name='answer_._type' kind='elementOnly'"
 * @generated
 */
public interface Answer extends EObject {
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
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Belief</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Belief}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belief</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belief</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_Belief()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='belief' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Belief> getBelief();

	/**
	 * Returns the value of the '<em><b>Witness</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Witness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Witness</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Witness</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_Witness()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='witness' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Witness> getWitness();

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_Rationale()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getRationale();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;A note attached to an object. One example of an annotation is a memo. Alternatively you could just have free text&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

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
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_AggregationRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregationRule' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<AggregationRule> getAggregationRule();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_Evidence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Evidence> getEvidence();

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
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_DiscoveryMethod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='discoveryMethod' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DiscoveryMethod> getDiscoveryMethod();

	/**
	 * Returns the value of the '<em><b>Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Id</em>' attribute.
	 * @see #setQuestionId(String)
	 * @see net.certware.argument.aml.AmlPackage#getAnswer_QuestionId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='questionId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getQuestionId();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Answer#getQuestionId <em>Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Id</em>' attribute.
	 * @see #getQuestionId()
	 * @generated
	 */
	void setQuestionId(String value);

} // Answer
