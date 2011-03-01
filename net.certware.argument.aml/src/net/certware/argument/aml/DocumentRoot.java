/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getActor <em>Actor</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getAggregationRule <em>Aggregation Rule</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getAmlDocument <em>Aml Document</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getAnswer <em>Answer</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getArchive <em>Archive</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getArgumentTemplate <em>Argument Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getBelief <em>Belief</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getBody <em>Body</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getChoice <em>Choice</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getCollectionItem <em>Collection Item</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getContributor <em>Contributor</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getCreatingTool <em>Creating Tool</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getCreator <em>Creator</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getDate <em>Date</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getDepartment <em>Department</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getDependent <em>Dependent</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getEmail <em>Email</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getEvent <em>Event</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getEvidenceExhibit <em>Evidence Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getExhibit <em>Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getFirstName <em>First Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getFlag <em>Flag</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getFormat <em>Format</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getImage <em>Image</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getInterval <em>Interval</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getLastName <em>Last Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getList <em>List</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getMemo <em>Memo</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getMethod <em>Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getNationState <em>Nation State</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getNickName <em>Nick Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getPeriod <em>Period</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getPerson <em>Person</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getQuestion <em>Question</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getQuestionRelationships <em>Question Relationships</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getRationale <em>Rationale</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getReader <em>Reader</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getRegion <em>Region</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getRelation <em>Relation</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getRelevance <em>Relevance</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getReliability <em>Reliability</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getRights <em>Rights</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getSecurityMarking <em>Security Marking</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getTemplate <em>Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getUrl <em>Url</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getWitness <em>Witness</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getDescription1 <em>Description1</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link net.certware.argument.aml.DocumentRoot#getLabel1 <em>Label1</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' attribute.
	 * @see #setActor(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Actor()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActor();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getActor <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' attribute.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Rule</em>' containment reference.
	 * @see #setAggregationRule(AggregationRule)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_AggregationRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregationRule' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregationRule getAggregationRule();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getAggregationRule <em>Aggregation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Rule</em>' containment reference.
	 * @see #getAggregationRule()
	 * @generated
	 */
	void setAggregationRule(AggregationRule value);

	/**
	 * Returns the value of the '<em><b>Aml Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt; This is the definition for an AML document&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aml Document</em>' containment reference.
	 * @see #setAmlDocument(AmlDocument)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_AmlDocument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='amlDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	AmlDocument getAmlDocument();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getAmlDocument <em>Aml Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aml Document</em>' containment reference.
	 * @see #getAmlDocument()
	 * @generated
	 */
	void setAmlDocument(AmlDocument value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;A note attached to an object. One example of an annotation is a memo. Alternatively you could just have free text&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Annotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference.
	 * @see #setAnswer(Answer)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Answer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='answer' namespace='##targetNamespace'"
	 * @generated
	 */
	Answer getAnswer();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getAnswer <em>Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' containment reference.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(Answer value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' containment reference.
	 * @see #setArchive(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Archive()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='archive' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getArchive();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getArchive <em>Archive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' containment reference.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(EObject value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt; This is the definition for an AML argument&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Argument)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Argument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='argument' namespace='##targetNamespace'"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_ArgumentTemplate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='argumentTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	ArgumentTemplate getArgumentTemplate();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getArgumentTemplate <em>Argument Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Template</em>' containment reference.
	 * @see #getArgumentTemplate()
	 * @generated
	 */
	void setArgumentTemplate(ArgumentTemplate value);

	/**
	 * Returns the value of the '<em><b>Belief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belief</em>' containment reference.
	 * @see #setBelief(Belief)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Belief()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='belief' namespace='##targetNamespace'"
	 * @generated
	 */
	Belief getBelief();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getBelief <em>Belief</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belief</em>' containment reference.
	 * @see #getBelief()
	 * @generated
	 */
	void setBelief(Belief value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Body()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference.
	 * @see #setChoice(Choice)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Choice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
	 * @generated
	 */
	Choice getChoice();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getChoice <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' containment reference.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(Choice value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(Collection)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Collection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

	/**
	 * Returns the value of the '<em><b>Collection Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Item</em>' containment reference.
	 * @see #setCollectionItem(CollectionItem)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_CollectionItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='collectionItem' namespace='##targetNamespace'"
	 * @generated
	 */
	CollectionItem getCollectionItem();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getCollectionItem <em>Collection Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Item</em>' containment reference.
	 * @see #getCollectionItem()
	 * @generated
	 */
	void setCollectionItem(CollectionItem value);

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' containment reference.
	 * @see #setContributor(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Contributor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getContributor();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getContributor <em>Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' containment reference.
	 * @see #getContributor()
	 * @generated
	 */
	void setContributor(EObject value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Coverage)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Coverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_CreatingTool()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creatingTool' namespace='##targetNamespace'"
	 * @generated
	 */
	CreatingTool getCreatingTool();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getCreatingTool <em>Creating Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creating Tool</em>' containment reference.
	 * @see #getCreatingTool()
	 * @generated
	 */
	void setCreatingTool(CreatingTool value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Creator)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Creator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	Creator getCreator();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Creator value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Date()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Department()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='department' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference.
	 * @see #setDependent(Dependent)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Dependent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependent' namespace='##targetNamespace'"
	 * @generated
	 */
	Dependent getDependent();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getDependent <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' containment reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(Dependent value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Discovery Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Method</em>' containment reference.
	 * @see #setDiscoveryMethod(DiscoveryMethod)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_DiscoveryMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='discoveryMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	DiscoveryMethod getDiscoveryMethod();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getDiscoveryMethod <em>Discovery Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Method</em>' containment reference.
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	void setDiscoveryMethod(DiscoveryMethod value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Email()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(End)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_End()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	End getEnd();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(End value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Event()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference.
	 * @see #setEvidence(Evidence)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Evidence()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	Evidence getEvidence();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getEvidence <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' containment reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(Evidence value);

	/**
	 * Returns the value of the '<em><b>Evidence Exhibit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence Exhibit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence Exhibit</em>' containment reference.
	 * @see #setEvidenceExhibit(EvidenceExhibit)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_EvidenceExhibit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='evidenceExhibit' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceExhibit getEvidenceExhibit();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getEvidenceExhibit <em>Evidence Exhibit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence Exhibit</em>' containment reference.
	 * @see #getEvidenceExhibit()
	 * @generated
	 */
	void setEvidenceExhibit(EvidenceExhibit value);

	/**
	 * Returns the value of the '<em><b>Exhibit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt; This is the definition for an AML exhibit&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exhibit</em>' containment reference.
	 * @see #setExhibit(Exhibit)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Exhibit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exhibit' namespace='##targetNamespace'"
	 * @generated
	 */
	Exhibit getExhibit();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getExhibit <em>Exhibit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exhibit</em>' containment reference.
	 * @see #getExhibit()
	 * @generated
	 */
	void setExhibit(Exhibit value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_FirstName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='firstName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(Flag)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Flag()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='flag' namespace='##targetNamespace'"
	 * @generated
	 */
	Flag getFlag();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(Flag value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Format()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getFormat();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(EObject value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getIdentifier();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(EObject value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Image()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getImage();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(EObject value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' containment reference.
	 * @see #setInterval(Interval)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Interval()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interval' namespace='##targetNamespace'"
	 * @generated
	 */
	Interval getInterval();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getInterval <em>Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' containment reference.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Interval value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Label()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Language()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getLanguage();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(EObject value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_LastName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='lastName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace'"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List value);

	/**
	 * Returns the value of the '<em><b>Memo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memo</em>' containment reference.
	 * @see #setMemo(Memo)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Memo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='memo' namespace='##targetNamespace'"
	 * @generated
	 */
	Memo getMemo();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getMemo <em>Memo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memo</em>' containment reference.
	 * @see #getMemo()
	 * @generated
	 */
	void setMemo(Memo value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;These terms come from Dublin core work - http://dublincore.org/documents/dces/"&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference.
	 * @see #setMetaData(MetaData)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_MetaData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='metaData' namespace='##targetNamespace'"
	 * @generated
	 */
	MetaData getMetaData();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getMetaData <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' containment reference.
	 * @see #getMetaData()
	 * @generated
	 */
	void setMetaData(MetaData value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt;Alows methods such as conjunction or disjunction, or just free text&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Method()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getMethod();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(EObject value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_MiddleName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='middleName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>Nation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nation State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nation State</em>' containment reference.
	 * @see #setNationState(NationState)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_NationState()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nationState' namespace='##targetNamespace'"
	 * @generated
	 */
	NationState getNationState();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getNationState <em>Nation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nation State</em>' containment reference.
	 * @see #getNationState()
	 * @generated
	 */
	void setNationState(NationState value);

	/**
	 * Returns the value of the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nick Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nick Name</em>' attribute.
	 * @see #setNickName(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_NickName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nickName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNickName();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getNickName <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nick Name</em>' attribute.
	 * @see #getNickName()
	 * @generated
	 */
	void setNickName(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Organization()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Parameter)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Parameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Period()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Person()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='person' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Perspective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspective</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective</em>' attribute.
	 * @see #setPerspective(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Perspective()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='perspective' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPerspective();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getPerspective <em>Perspective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective</em>' attribute.
	 * @see #getPerspective()
	 * @generated
	 */
	void setPerspective(String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Publisher)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Publisher()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	Publisher getPublisher();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Question()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='question' namespace='##targetNamespace'"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

	/**
	 * Returns the value of the '<em><b>Question Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Relationships</em>' containment reference.
	 * @see #setQuestionRelationships(QuestionRelationships)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_QuestionRelationships()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='questionRelationships' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionRelationships getQuestionRelationships();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getQuestionRelationships <em>Question Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Relationships</em>' containment reference.
	 * @see #getQuestionRelationships()
	 * @generated
	 */
	void setQuestionRelationships(QuestionRelationships value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Rationale()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rationale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Reader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' containment reference.
	 * @see #setReader(Reader)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Reader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reader' namespace='##targetNamespace'"
	 * @generated
	 */
	Reader getReader();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getReader <em>Reader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader</em>' containment reference.
	 * @see #getReader()
	 * @generated
	 */
	void setReader(Reader value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Region()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='region' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Relation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getRelation();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(EObject value);

	/**
	 * Returns the value of the '<em><b>Relevance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevance</em>' containment reference.
	 * @see #setRelevance(Relevance)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Relevance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relevance' namespace='##targetNamespace'"
	 * @generated
	 */
	Relevance getRelevance();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getRelevance <em>Relevance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance</em>' containment reference.
	 * @see #getRelevance()
	 * @generated
	 */
	void setRelevance(Relevance value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' containment reference.
	 * @see #setReliability(Reliability)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Reliability()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reliability' namespace='##targetNamespace'"
	 * @generated
	 */
	Reliability getReliability();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getReliability <em>Reliability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' containment reference.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(Reliability value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference.
	 * @see #setRights(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Rights()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getRights();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(EObject value);

	/**
	 * Returns the value of the '<em><b>Security Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Marking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Marking</em>' attribute.
	 * @see #setSecurityMarking(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_SecurityMarking()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='securityMarking' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecurityMarking();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getSecurityMarking <em>Security Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Marking</em>' attribute.
	 * @see #getSecurityMarking()
	 * @generated
	 */
	void setSecurityMarking(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Source()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Start()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Subject()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Symbol()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='symbol' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * &lt;p&gt; This is the definition for an AML argument template&lt;/p&gt;
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(Template)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Template()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template' namespace='##targetNamespace'"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(EObject)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Type()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getType();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EObject value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Url()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Value()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Witness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Witness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Witness</em>' containment reference.
	 * @see #setWitness(Witness)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Witness()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='witness' namespace='##targetNamespace'"
	 * @generated
	 */
	Witness getWitness();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getWitness <em>Witness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Witness</em>' containment reference.
	 * @see #getWitness()
	 * @generated
	 */
	void setWitness(Witness value);

	/**
	 * Returns the value of the '<em><b>Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description1</em>' attribute.
	 * @see #setDescription1(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Description1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription1();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getDescription1 <em>Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description1</em>' attribute.
	 * @see #getDescription1()
	 * @generated
	 */
	void setDescription1(String value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ref</em>' attribute.
	 * @see #setIdRef(String)
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_IdRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='idRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

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
	 * @see net.certware.argument.aml.AmlPackage#getDocumentRoot_Label1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel1();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.DocumentRoot#getLabel1 <em>Label1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label1</em>' attribute.
	 * @see #getLabel1()
	 * @generated
	 */
	void setLabel1(String value);

} // DocumentRoot
