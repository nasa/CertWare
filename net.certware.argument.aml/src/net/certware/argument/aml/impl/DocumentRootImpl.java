/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.argument.aml.AggregationRule;
import net.certware.argument.aml.AmlDocument;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Answer;
import net.certware.argument.aml.Argument;
import net.certware.argument.aml.ArgumentTemplate;
import net.certware.argument.aml.Belief;
import net.certware.argument.aml.Choice;
import net.certware.argument.aml.Collection;
import net.certware.argument.aml.CollectionItem;
import net.certware.argument.aml.Coverage;
import net.certware.argument.aml.CreatingTool;
import net.certware.argument.aml.Creator;
import net.certware.argument.aml.Dependent;
import net.certware.argument.aml.DiscoveryMethod;
import net.certware.argument.aml.DocumentRoot;
import net.certware.argument.aml.End;
import net.certware.argument.aml.Evidence;
import net.certware.argument.aml.EvidenceExhibit;
import net.certware.argument.aml.Exhibit;
import net.certware.argument.aml.Flag;
import net.certware.argument.aml.Interval;
import net.certware.argument.aml.List;
import net.certware.argument.aml.Memo;
import net.certware.argument.aml.MetaData;
import net.certware.argument.aml.NationState;
import net.certware.argument.aml.Parameter;
import net.certware.argument.aml.Period;
import net.certware.argument.aml.Person;
import net.certware.argument.aml.Publisher;
import net.certware.argument.aml.Question;
import net.certware.argument.aml.QuestionRelationships;
import net.certware.argument.aml.Reader;
import net.certware.argument.aml.Relevance;
import net.certware.argument.aml.Reliability;
import net.certware.argument.aml.Start;
import net.certware.argument.aml.Template;
import net.certware.argument.aml.Value;
import net.certware.argument.aml.Witness;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getAggregationRule <em>Aggregation Rule</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getAmlDocument <em>Aml Document</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getArgumentTemplate <em>Argument Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getBelief <em>Belief</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getBody <em>Body</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getCollectionItem <em>Collection Item</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getCreatingTool <em>Creating Tool</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getEvidenceExhibit <em>Evidence Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getExhibit <em>Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getMemo <em>Memo</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getNationState <em>Nation State</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getNickName <em>Nick Name</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getQuestionRelationships <em>Question Relationships</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getRelevance <em>Relevance</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getSecurityMarking <em>Security Marking</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getWitness <em>Witness</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getDescription1 <em>Description1</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DocumentRootImpl#getLabel1 <em>Label1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getActor() <em>Actor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickName()
	 * @generated
	 * @ordered
	 */
	protected static final String NICK_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPerspective() <em>Perspective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspective()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSecurityMarking() <em>Security Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityMarking()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_MARKING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription1() <em>Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription1()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription1() <em>Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription1()
	 * @generated
	 * @ordered
	 */
	protected String description1 = DESCRIPTION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected String idRef = ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel1() <em>Label1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel1()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel1() <em>Label1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel1()
	 * @generated
	 * @ordered
	 */
	protected String label1 = LABEL1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AmlPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActor() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__ACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(String newActor) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__ACTOR, newActor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationRule getAggregationRule() {
		return (AggregationRule)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__AGGREGATION_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationRule(AggregationRule newAggregationRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__AGGREGATION_RULE, newAggregationRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationRule(AggregationRule newAggregationRule) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__AGGREGATION_RULE, newAggregationRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlDocument getAmlDocument() {
		return (AmlDocument)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__AML_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmlDocument(AmlDocument newAmlDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__AML_DOCUMENT, newAmlDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmlDocument(AmlDocument newAmlDocument) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__AML_DOCUMENT, newAmlDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation() {
		return (Annotation)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__ANNOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__ANNOTATION, newAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__ANNOTATION, newAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getAnswer() {
		return (Answer)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__ANSWER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswer(Answer newAnswer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__ANSWER, newAnswer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswer(Answer newAnswer) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__ANSWER, newAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getArchive() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__ARCHIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchive(EObject newArchive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__ARCHIVE, newArchive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchive(EObject newArchive) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__ARCHIVE, newArchive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getArgument() {
		return (Argument)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(Argument newArgument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT, newArgument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(Argument newArgument) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT, newArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTemplate getArgumentTemplate() {
		return (ArgumentTemplate)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentTemplate(ArgumentTemplate newArgumentTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT_TEMPLATE, newArgumentTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentTemplate(ArgumentTemplate newArgumentTemplate) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT_TEMPLATE, newArgumentTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Belief getBelief() {
		return (Belief)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__BELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelief(Belief newBelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__BELIEF, newBelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelief(Belief newBelief) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__BELIEF, newBelief);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getChoice() {
		return (Choice)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__CHOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoice(Choice newChoice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__CHOICE, newChoice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(Choice newChoice) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__CHOICE, newChoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getCollection() {
		return (Collection)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(Collection newCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION, newCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(Collection newCollection) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION, newCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionItem getCollectionItem() {
		return (CollectionItem)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionItem(CollectionItem newCollectionItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION_ITEM, newCollectionItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionItem(CollectionItem newCollectionItem) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION_ITEM, newCollectionItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContributor() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributor(EObject newContributor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR, newContributor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributor(EObject newContributor) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR, newContributor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		return (Coverage)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__COVERAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Coverage newCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__COVERAGE, newCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__COVERAGE, newCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatingTool getCreatingTool() {
		return (CreatingTool)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__CREATING_TOOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatingTool(CreatingTool newCreatingTool, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__CREATING_TOOL, newCreatingTool, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingTool(CreatingTool newCreatingTool) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__CREATING_TOOL, newCreatingTool);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator getCreator() {
		return (Creator)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__CREATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Creator newCreator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__CREATOR, newCreator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Creator newCreator) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__CREATOR, newCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDate() {
		return (XMLGregorianCalendar)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(XMLGregorianCalendar newDate) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartment() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__DEPARTMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(String newDepartment) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__DEPARTMENT, newDepartment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependent getDependent() {
		return (Dependent)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__DEPENDENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependent(Dependent newDependent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__DEPENDENT, newDependent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependent(Dependent newDependent) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__DEPENDENT, newDependent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryMethod getDiscoveryMethod() {
		return (DiscoveryMethod)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__DISCOVERY_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoveryMethod(DiscoveryMethod newDiscoveryMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__DISCOVERY_METHOD, newDiscoveryMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryMethod(DiscoveryMethod newDiscoveryMethod) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__DISCOVERY_METHOD, newDiscoveryMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__EMAIL, newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End getEnd() {
		return (End)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__END, newEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(End newEnd) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evidence getEvidence() {
		return (Evidence)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidence(Evidence newEvidence, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE, newEvidence, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidence(Evidence newEvidence) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE, newEvidence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceExhibit getEvidenceExhibit() {
		return (EvidenceExhibit)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE_EXHIBIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidenceExhibit(EvidenceExhibit newEvidenceExhibit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE_EXHIBIT, newEvidenceExhibit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidenceExhibit(EvidenceExhibit newEvidenceExhibit) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE_EXHIBIT, newEvidenceExhibit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exhibit getExhibit() {
		return (Exhibit)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__EXHIBIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExhibit(Exhibit newExhibit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__EXHIBIT, newExhibit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExhibit(Exhibit newExhibit) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__EXHIBIT, newExhibit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__FIRST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__FIRST_NAME, newFirstName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag getFlag() {
		return (Flag)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlag(Flag newFlag, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__FLAG, newFlag, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(Flag newFlag) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__FLAG, newFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getFormat() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(EObject newFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__FORMAT, newFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(EObject newFormat) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getIdentifier() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(EObject newIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(EObject newIdentifier) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getImage() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__IMAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(EObject newImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__IMAGE, newImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(EObject newImage) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval getInterval() {
		return (Interval)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__INTERVAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterval(Interval newInterval, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__INTERVAL, newInterval, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(Interval newInterval) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__INTERVAL, newInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLanguage() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(EObject newLanguage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(EObject newLanguage) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__LAST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__LAST_NAME, newLastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		return (List)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__LIST, newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memo getMemo() {
		return (Memo)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__MEMO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemo(Memo newMemo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__MEMO, newMemo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemo(Memo newMemo) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__MEMO, newMemo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData getMetaData() {
		return (MetaData)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__META_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaData(MetaData newMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__META_DATA, newMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(MetaData newMetaData) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__META_DATA, newMetaData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMethod() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(EObject newMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__METHOD, newMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(EObject newMethod) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiddleName() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__MIDDLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddleName(String newMiddleName) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__MIDDLE_NAME, newMiddleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationState getNationState() {
		return (NationState)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__NATION_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNationState(NationState newNationState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__NATION_STATE, newNationState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationState(NationState newNationState) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__NATION_STATE, newNationState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickName() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__NICK_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickName(String newNickName) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__NICK_NAME, newNickName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganization() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(String newOrganization) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		return (Parameter)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__PARAMETER, newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__PARAMETER, newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return (Period)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__PERIOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__PERIOD, newPeriod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__PERIOD, newPeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		return (Person)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__PERSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__PERSON, newPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__PERSON, newPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerspective() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__PERSPECTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspective(String newPerspective) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__PERSPECTIVE, newPerspective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		return (Publisher)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Publisher newPublisher, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER, newPublisher);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestion() {
		return (Question)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(Question newQuestion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION, newQuestion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(Question newQuestion) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION, newQuestion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionRelationships getQuestionRelationships() {
		return (QuestionRelationships)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionRelationships(QuestionRelationships newQuestionRelationships, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS, newQuestionRelationships, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionRelationships(QuestionRelationships newQuestionRelationships) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS, newQuestionRelationships);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__RATIONALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__RATIONALE, newRationale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reader getReader() {
		return (Reader)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__READER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReader(Reader newReader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__READER, newReader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReader(Reader newReader) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__READER, newReader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__REGION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__REGION, newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRelation() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(EObject newRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(EObject newRelation) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relevance getRelevance() {
		return (Relevance)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__RELEVANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelevance(Relevance newRelevance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__RELEVANCE, newRelevance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelevance(Relevance newRelevance) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__RELEVANCE, newRelevance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliability getReliability() {
		return (Reliability)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__RELIABILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliability(Reliability newReliability, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__RELIABILITY, newReliability, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(Reliability newReliability) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__RELIABILITY, newReliability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRights() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__RIGHTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRights(EObject newRights, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__RIGHTS, newRights, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRights(EObject newRights) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__RIGHTS, newRights);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityMarking() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__SECURITY_MARKING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityMarking(String newSecurityMarking) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__SECURITY_MARKING, newSecurityMarking);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSource() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(EObject newSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EObject newSource) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getStart() {
		return (Start)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Start newStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__START, newStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Start newStart) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__SYMBOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__SYMBOL, newSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		return (Template)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(Template newTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getType() {
		return (EObject)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(EObject newType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__TYPE, newType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EObject newType) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return (Value)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__VALUE, newValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Witness getWitness() {
		return (Witness)getMixed().get(AmlPackage.Literals.DOCUMENT_ROOT__WITNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWitness(Witness newWitness, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AmlPackage.Literals.DOCUMENT_ROOT__WITNESS, newWitness, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWitness(Witness newWitness) {
		((FeatureMap.Internal)getMixed()).set(AmlPackage.Literals.DOCUMENT_ROOT__WITNESS, newWitness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription1() {
		return description1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription1(String newDescription1) {
		String oldDescription1 = description1;
		description1 = newDescription1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DOCUMENT_ROOT__DESCRIPTION1, oldDescription1, description1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdRef() {
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRef(String newIdRef) {
		String oldIdRef = idRef;
		idRef = newIdRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DOCUMENT_ROOT__ID_REF, oldIdRef, idRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel1() {
		return label1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel1(String newLabel1) {
		String oldLabel1 = label1;
		label1 = newLabel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DOCUMENT_ROOT__LABEL1, oldLabel1, label1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AmlPackage.DOCUMENT_ROOT__AGGREGATION_RULE:
				return basicSetAggregationRule(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__AML_DOCUMENT:
				return basicSetAmlDocument(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__ANSWER:
				return basicSetAnswer(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__ARCHIVE:
				return basicSetArchive(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT:
				return basicSetArgument(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT_TEMPLATE:
				return basicSetArgumentTemplate(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__BELIEF:
				return basicSetBelief(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__CHOICE:
				return basicSetChoice(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__COLLECTION:
				return basicSetCollection(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__COLLECTION_ITEM:
				return basicSetCollectionItem(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__CONTRIBUTOR:
				return basicSetContributor(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__COVERAGE:
				return basicSetCoverage(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__CREATING_TOOL:
				return basicSetCreatingTool(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__CREATOR:
				return basicSetCreator(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__DEPENDENT:
				return basicSetDependent(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__DISCOVERY_METHOD:
				return basicSetDiscoveryMethod(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__END:
				return basicSetEnd(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE:
				return basicSetEvidence(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE_EXHIBIT:
				return basicSetEvidenceExhibit(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__EXHIBIT:
				return basicSetExhibit(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__FLAG:
				return basicSetFlag(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__FORMAT:
				return basicSetFormat(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__IMAGE:
				return basicSetImage(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__INTERVAL:
				return basicSetInterval(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__MEMO:
				return basicSetMemo(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__META_DATA:
				return basicSetMetaData(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__METHOD:
				return basicSetMethod(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__NATION_STATE:
				return basicSetNationState(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__PERIOD:
				return basicSetPeriod(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__PERSON:
				return basicSetPerson(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__QUESTION:
				return basicSetQuestion(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS:
				return basicSetQuestionRelationships(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__READER:
				return basicSetReader(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__RELATION:
				return basicSetRelation(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__RELEVANCE:
				return basicSetRelevance(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__RELIABILITY:
				return basicSetReliability(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__RIGHTS:
				return basicSetRights(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__SOURCE:
				return basicSetSource(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__START:
				return basicSetStart(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__TYPE:
				return basicSetType(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__VALUE:
				return basicSetValue(null, msgs);
			case AmlPackage.DOCUMENT_ROOT__WITNESS:
				return basicSetWitness(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AmlPackage.DOCUMENT_ROOT__ACTOR:
				return getActor();
			case AmlPackage.DOCUMENT_ROOT__AGGREGATION_RULE:
				return getAggregationRule();
			case AmlPackage.DOCUMENT_ROOT__AML_DOCUMENT:
				return getAmlDocument();
			case AmlPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation();
			case AmlPackage.DOCUMENT_ROOT__ANSWER:
				return getAnswer();
			case AmlPackage.DOCUMENT_ROOT__ARCHIVE:
				return getArchive();
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT:
				return getArgument();
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT_TEMPLATE:
				return getArgumentTemplate();
			case AmlPackage.DOCUMENT_ROOT__BELIEF:
				return getBelief();
			case AmlPackage.DOCUMENT_ROOT__BODY:
				return getBody();
			case AmlPackage.DOCUMENT_ROOT__CHOICE:
				return getChoice();
			case AmlPackage.DOCUMENT_ROOT__COLLECTION:
				return getCollection();
			case AmlPackage.DOCUMENT_ROOT__COLLECTION_ITEM:
				return getCollectionItem();
			case AmlPackage.DOCUMENT_ROOT__CONTRIBUTOR:
				return getContributor();
			case AmlPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage();
			case AmlPackage.DOCUMENT_ROOT__CREATING_TOOL:
				return getCreatingTool();
			case AmlPackage.DOCUMENT_ROOT__CREATOR:
				return getCreator();
			case AmlPackage.DOCUMENT_ROOT__DATE:
				return getDate();
			case AmlPackage.DOCUMENT_ROOT__DEPARTMENT:
				return getDepartment();
			case AmlPackage.DOCUMENT_ROOT__DEPENDENT:
				return getDependent();
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case AmlPackage.DOCUMENT_ROOT__DISCOVERY_METHOD:
				return getDiscoveryMethod();
			case AmlPackage.DOCUMENT_ROOT__EMAIL:
				return getEmail();
			case AmlPackage.DOCUMENT_ROOT__END:
				return getEnd();
			case AmlPackage.DOCUMENT_ROOT__EVENT:
				return getEvent();
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE:
				return getEvidence();
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE_EXHIBIT:
				return getEvidenceExhibit();
			case AmlPackage.DOCUMENT_ROOT__EXHIBIT:
				return getExhibit();
			case AmlPackage.DOCUMENT_ROOT__FIRST_NAME:
				return getFirstName();
			case AmlPackage.DOCUMENT_ROOT__FLAG:
				return getFlag();
			case AmlPackage.DOCUMENT_ROOT__FORMAT:
				return getFormat();
			case AmlPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier();
			case AmlPackage.DOCUMENT_ROOT__IMAGE:
				return getImage();
			case AmlPackage.DOCUMENT_ROOT__INTERVAL:
				return getInterval();
			case AmlPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case AmlPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case AmlPackage.DOCUMENT_ROOT__LAST_NAME:
				return getLastName();
			case AmlPackage.DOCUMENT_ROOT__LIST:
				return getList();
			case AmlPackage.DOCUMENT_ROOT__MEMO:
				return getMemo();
			case AmlPackage.DOCUMENT_ROOT__META_DATA:
				return getMetaData();
			case AmlPackage.DOCUMENT_ROOT__METHOD:
				return getMethod();
			case AmlPackage.DOCUMENT_ROOT__MIDDLE_NAME:
				return getMiddleName();
			case AmlPackage.DOCUMENT_ROOT__NATION_STATE:
				return getNationState();
			case AmlPackage.DOCUMENT_ROOT__NICK_NAME:
				return getNickName();
			case AmlPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case AmlPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter();
			case AmlPackage.DOCUMENT_ROOT__PERIOD:
				return getPeriod();
			case AmlPackage.DOCUMENT_ROOT__PERSON:
				return getPerson();
			case AmlPackage.DOCUMENT_ROOT__PERSPECTIVE:
				return getPerspective();
			case AmlPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher();
			case AmlPackage.DOCUMENT_ROOT__QUESTION:
				return getQuestion();
			case AmlPackage.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS:
				return getQuestionRelationships();
			case AmlPackage.DOCUMENT_ROOT__RATIONALE:
				return getRationale();
			case AmlPackage.DOCUMENT_ROOT__READER:
				return getReader();
			case AmlPackage.DOCUMENT_ROOT__REGION:
				return getRegion();
			case AmlPackage.DOCUMENT_ROOT__RELATION:
				return getRelation();
			case AmlPackage.DOCUMENT_ROOT__RELEVANCE:
				return getRelevance();
			case AmlPackage.DOCUMENT_ROOT__RELIABILITY:
				return getReliability();
			case AmlPackage.DOCUMENT_ROOT__RIGHTS:
				return getRights();
			case AmlPackage.DOCUMENT_ROOT__SECURITY_MARKING:
				return getSecurityMarking();
			case AmlPackage.DOCUMENT_ROOT__SOURCE:
				return getSource();
			case AmlPackage.DOCUMENT_ROOT__START:
				return getStart();
			case AmlPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject();
			case AmlPackage.DOCUMENT_ROOT__SYMBOL:
				return getSymbol();
			case AmlPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate();
			case AmlPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case AmlPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case AmlPackage.DOCUMENT_ROOT__URL:
				return getUrl();
			case AmlPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case AmlPackage.DOCUMENT_ROOT__WITNESS:
				return getWitness();
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION1:
				return getDescription1();
			case AmlPackage.DOCUMENT_ROOT__ID:
				return getId();
			case AmlPackage.DOCUMENT_ROOT__ID_REF:
				return getIdRef();
			case AmlPackage.DOCUMENT_ROOT__LABEL1:
				return getLabel1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ACTOR:
				setActor((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__AGGREGATION_RULE:
				setAggregationRule((AggregationRule)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__AML_DOCUMENT:
				setAmlDocument((AmlDocument)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ANSWER:
				setAnswer((Answer)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ARCHIVE:
				setArchive((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT:
				setArgument((Argument)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT_TEMPLATE:
				setArgumentTemplate((ArgumentTemplate)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__BELIEF:
				setBelief((Belief)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__BODY:
				setBody((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__CHOICE:
				setChoice((Choice)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__COLLECTION:
				setCollection((Collection)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__COLLECTION_ITEM:
				setCollectionItem((CollectionItem)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__CONTRIBUTOR:
				setContributor((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__CREATING_TOOL:
				setCreatingTool((CreatingTool)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__CREATOR:
				setCreator((Creator)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__DEPARTMENT:
				setDepartment((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__DEPENDENT:
				setDependent((Dependent)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__DISCOVERY_METHOD:
				setDiscoveryMethod((DiscoveryMethod)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__EMAIL:
				setEmail((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__END:
				setEnd((End)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__EVENT:
				setEvent((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE:
				setEvidence((Evidence)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE_EXHIBIT:
				setEvidenceExhibit((EvidenceExhibit)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__EXHIBIT:
				setExhibit((Exhibit)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__FLAG:
				setFlag((Flag)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__FORMAT:
				setFormat((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__IMAGE:
				setImage((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__INTERVAL:
				setInterval((Interval)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__LABEL:
				setLabel((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__LAST_NAME:
				setLastName((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__LIST:
				setList((List)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__MEMO:
				setMemo((Memo)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__META_DATA:
				setMetaData((MetaData)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__METHOD:
				setMethod((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__NATION_STATE:
				setNationState((NationState)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__NICK_NAME:
				setNickName((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__PERIOD:
				setPeriod((Period)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__PERSPECTIVE:
				setPerspective((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__QUESTION:
				setQuestion((Question)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS:
				setQuestionRelationships((QuestionRelationships)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__RATIONALE:
				setRationale((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__READER:
				setReader((Reader)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__REGION:
				setRegion((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__RELATION:
				setRelation((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__RELEVANCE:
				setRelevance((Relevance)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__RELIABILITY:
				setReliability((Reliability)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__RIGHTS:
				setRights((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__SECURITY_MARKING:
				setSecurityMarking((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__SOURCE:
				setSource((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__START:
				setStart((Start)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__SYMBOL:
				setSymbol((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((Template)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__TYPE:
				setType((EObject)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__URL:
				setUrl((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__VALUE:
				setValue((Value)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__WITNESS:
				setWitness((Witness)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION1:
				setDescription1((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__ID_REF:
				setIdRef((String)newValue);
				return;
			case AmlPackage.DOCUMENT_ROOT__LABEL1:
				setLabel1((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AmlPackage.DOCUMENT_ROOT__ACTOR:
				setActor(ACTOR_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__AGGREGATION_RULE:
				setAggregationRule((AggregationRule)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__AML_DOCUMENT:
				setAmlDocument((AmlDocument)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__ANSWER:
				setAnswer((Answer)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__ARCHIVE:
				setArchive((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT:
				setArgument((Argument)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT_TEMPLATE:
				setArgumentTemplate((ArgumentTemplate)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__BELIEF:
				setBelief((Belief)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__CHOICE:
				setChoice((Choice)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__COLLECTION:
				setCollection((Collection)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__COLLECTION_ITEM:
				setCollectionItem((CollectionItem)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__CONTRIBUTOR:
				setContributor((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__CREATING_TOOL:
				setCreatingTool((CreatingTool)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__CREATOR:
				setCreator((Creator)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__DEPARTMENT:
				setDepartment(DEPARTMENT_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__DEPENDENT:
				setDependent((Dependent)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__DISCOVERY_METHOD:
				setDiscoveryMethod((DiscoveryMethod)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__END:
				setEnd((End)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE:
				setEvidence((Evidence)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE_EXHIBIT:
				setEvidenceExhibit((EvidenceExhibit)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__EXHIBIT:
				setExhibit((Exhibit)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__FLAG:
				setFlag((Flag)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__FORMAT:
				setFormat((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__IMAGE:
				setImage((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__INTERVAL:
				setInterval((Interval)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__LIST:
				setList((List)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__MEMO:
				setMemo((Memo)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__META_DATA:
				setMetaData((MetaData)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__METHOD:
				setMethod((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__MIDDLE_NAME:
				setMiddleName(MIDDLE_NAME_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__NATION_STATE:
				setNationState((NationState)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__NICK_NAME:
				setNickName(NICK_NAME_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((Parameter)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__PERIOD:
				setPeriod((Period)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__PERSPECTIVE:
				setPerspective(PERSPECTIVE_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__QUESTION:
				setQuestion((Question)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS:
				setQuestionRelationships((QuestionRelationships)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__READER:
				setReader((Reader)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__RELATION:
				setRelation((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__RELEVANCE:
				setRelevance((Relevance)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__RELIABILITY:
				setReliability((Reliability)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__RIGHTS:
				setRights((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__SECURITY_MARKING:
				setSecurityMarking(SECURITY_MARKING_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__SOURCE:
				setSource((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__START:
				setStart((Start)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((Template)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__TYPE:
				setType((EObject)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__VALUE:
				setValue((Value)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__WITNESS:
				setWitness((Witness)null);
				return;
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION1:
				setDescription1(DESCRIPTION1_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__ID_REF:
				setIdRef(ID_REF_EDEFAULT);
				return;
			case AmlPackage.DOCUMENT_ROOT__LABEL1:
				setLabel1(LABEL1_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AmlPackage.DOCUMENT_ROOT__ACTOR:
				return ACTOR_EDEFAULT == null ? getActor() != null : !ACTOR_EDEFAULT.equals(getActor());
			case AmlPackage.DOCUMENT_ROOT__AGGREGATION_RULE:
				return getAggregationRule() != null;
			case AmlPackage.DOCUMENT_ROOT__AML_DOCUMENT:
				return getAmlDocument() != null;
			case AmlPackage.DOCUMENT_ROOT__ANNOTATION:
				return getAnnotation() != null;
			case AmlPackage.DOCUMENT_ROOT__ANSWER:
				return getAnswer() != null;
			case AmlPackage.DOCUMENT_ROOT__ARCHIVE:
				return getArchive() != null;
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT:
				return getArgument() != null;
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT_TEMPLATE:
				return getArgumentTemplate() != null;
			case AmlPackage.DOCUMENT_ROOT__BELIEF:
				return getBelief() != null;
			case AmlPackage.DOCUMENT_ROOT__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
			case AmlPackage.DOCUMENT_ROOT__CHOICE:
				return getChoice() != null;
			case AmlPackage.DOCUMENT_ROOT__COLLECTION:
				return getCollection() != null;
			case AmlPackage.DOCUMENT_ROOT__COLLECTION_ITEM:
				return getCollectionItem() != null;
			case AmlPackage.DOCUMENT_ROOT__CONTRIBUTOR:
				return getContributor() != null;
			case AmlPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage() != null;
			case AmlPackage.DOCUMENT_ROOT__CREATING_TOOL:
				return getCreatingTool() != null;
			case AmlPackage.DOCUMENT_ROOT__CREATOR:
				return getCreator() != null;
			case AmlPackage.DOCUMENT_ROOT__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case AmlPackage.DOCUMENT_ROOT__DEPARTMENT:
				return DEPARTMENT_EDEFAULT == null ? getDepartment() != null : !DEPARTMENT_EDEFAULT.equals(getDepartment());
			case AmlPackage.DOCUMENT_ROOT__DEPENDENT:
				return getDependent() != null;
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AmlPackage.DOCUMENT_ROOT__DISCOVERY_METHOD:
				return getDiscoveryMethod() != null;
			case AmlPackage.DOCUMENT_ROOT__EMAIL:
				return EMAIL_EDEFAULT == null ? getEmail() != null : !EMAIL_EDEFAULT.equals(getEmail());
			case AmlPackage.DOCUMENT_ROOT__END:
				return getEnd() != null;
			case AmlPackage.DOCUMENT_ROOT__EVENT:
				return EVENT_EDEFAULT == null ? getEvent() != null : !EVENT_EDEFAULT.equals(getEvent());
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE:
				return getEvidence() != null;
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE_EXHIBIT:
				return getEvidenceExhibit() != null;
			case AmlPackage.DOCUMENT_ROOT__EXHIBIT:
				return getExhibit() != null;
			case AmlPackage.DOCUMENT_ROOT__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? getFirstName() != null : !FIRST_NAME_EDEFAULT.equals(getFirstName());
			case AmlPackage.DOCUMENT_ROOT__FLAG:
				return getFlag() != null;
			case AmlPackage.DOCUMENT_ROOT__FORMAT:
				return getFormat() != null;
			case AmlPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier() != null;
			case AmlPackage.DOCUMENT_ROOT__IMAGE:
				return getImage() != null;
			case AmlPackage.DOCUMENT_ROOT__INTERVAL:
				return getInterval() != null;
			case AmlPackage.DOCUMENT_ROOT__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case AmlPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage() != null;
			case AmlPackage.DOCUMENT_ROOT__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? getLastName() != null : !LAST_NAME_EDEFAULT.equals(getLastName());
			case AmlPackage.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case AmlPackage.DOCUMENT_ROOT__MEMO:
				return getMemo() != null;
			case AmlPackage.DOCUMENT_ROOT__META_DATA:
				return getMetaData() != null;
			case AmlPackage.DOCUMENT_ROOT__METHOD:
				return getMethod() != null;
			case AmlPackage.DOCUMENT_ROOT__MIDDLE_NAME:
				return MIDDLE_NAME_EDEFAULT == null ? getMiddleName() != null : !MIDDLE_NAME_EDEFAULT.equals(getMiddleName());
			case AmlPackage.DOCUMENT_ROOT__NATION_STATE:
				return getNationState() != null;
			case AmlPackage.DOCUMENT_ROOT__NICK_NAME:
				return NICK_NAME_EDEFAULT == null ? getNickName() != null : !NICK_NAME_EDEFAULT.equals(getNickName());
			case AmlPackage.DOCUMENT_ROOT__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? getOrganization() != null : !ORGANIZATION_EDEFAULT.equals(getOrganization());
			case AmlPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
			case AmlPackage.DOCUMENT_ROOT__PERIOD:
				return getPeriod() != null;
			case AmlPackage.DOCUMENT_ROOT__PERSON:
				return getPerson() != null;
			case AmlPackage.DOCUMENT_ROOT__PERSPECTIVE:
				return PERSPECTIVE_EDEFAULT == null ? getPerspective() != null : !PERSPECTIVE_EDEFAULT.equals(getPerspective());
			case AmlPackage.DOCUMENT_ROOT__PUBLISHER:
				return getPublisher() != null;
			case AmlPackage.DOCUMENT_ROOT__QUESTION:
				return getQuestion() != null;
			case AmlPackage.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS:
				return getQuestionRelationships() != null;
			case AmlPackage.DOCUMENT_ROOT__RATIONALE:
				return RATIONALE_EDEFAULT == null ? getRationale() != null : !RATIONALE_EDEFAULT.equals(getRationale());
			case AmlPackage.DOCUMENT_ROOT__READER:
				return getReader() != null;
			case AmlPackage.DOCUMENT_ROOT__REGION:
				return REGION_EDEFAULT == null ? getRegion() != null : !REGION_EDEFAULT.equals(getRegion());
			case AmlPackage.DOCUMENT_ROOT__RELATION:
				return getRelation() != null;
			case AmlPackage.DOCUMENT_ROOT__RELEVANCE:
				return getRelevance() != null;
			case AmlPackage.DOCUMENT_ROOT__RELIABILITY:
				return getReliability() != null;
			case AmlPackage.DOCUMENT_ROOT__RIGHTS:
				return getRights() != null;
			case AmlPackage.DOCUMENT_ROOT__SECURITY_MARKING:
				return SECURITY_MARKING_EDEFAULT == null ? getSecurityMarking() != null : !SECURITY_MARKING_EDEFAULT.equals(getSecurityMarking());
			case AmlPackage.DOCUMENT_ROOT__SOURCE:
				return getSource() != null;
			case AmlPackage.DOCUMENT_ROOT__START:
				return getStart() != null;
			case AmlPackage.DOCUMENT_ROOT__SUBJECT:
				return SUBJECT_EDEFAULT == null ? getSubject() != null : !SUBJECT_EDEFAULT.equals(getSubject());
			case AmlPackage.DOCUMENT_ROOT__SYMBOL:
				return SYMBOL_EDEFAULT == null ? getSymbol() != null : !SYMBOL_EDEFAULT.equals(getSymbol());
			case AmlPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate() != null;
			case AmlPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case AmlPackage.DOCUMENT_ROOT__TYPE:
				return getType() != null;
			case AmlPackage.DOCUMENT_ROOT__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case AmlPackage.DOCUMENT_ROOT__VALUE:
				return getValue() != null;
			case AmlPackage.DOCUMENT_ROOT__WITNESS:
				return getWitness() != null;
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION1:
				return DESCRIPTION1_EDEFAULT == null ? description1 != null : !DESCRIPTION1_EDEFAULT.equals(description1);
			case AmlPackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AmlPackage.DOCUMENT_ROOT__ID_REF:
				return ID_REF_EDEFAULT == null ? idRef != null : !ID_REF_EDEFAULT.equals(idRef);
			case AmlPackage.DOCUMENT_ROOT__LABEL1:
				return LABEL1_EDEFAULT == null ? label1 != null : !LABEL1_EDEFAULT.equals(label1);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: "); //$NON-NLS-1$
		result.append(mixed);
		result.append(", description1: "); //$NON-NLS-1$
		result.append(description1);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", idRef: "); //$NON-NLS-1$
		result.append(idRef);
		result.append(", label1: "); //$NON-NLS-1$
		result.append(label1);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
