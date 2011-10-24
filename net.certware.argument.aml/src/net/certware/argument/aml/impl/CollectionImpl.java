/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml.impl;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.ArgumentTemplate;
import net.certware.argument.aml.Collection;
import net.certware.argument.aml.CollectionItem;
import net.certware.argument.aml.CreatingTool;
import net.certware.argument.aml.MetaData;
import net.certware.argument.aml.ObjectType2;
import net.certware.argument.aml.Question;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getCreatingTool <em>Creating Tool</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getArgumentTemplate <em>Argument Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getCollectionItem <em>Collection Item</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getLabel1 <em>Label1</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionImpl#getObjectType <em>Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionImpl extends EObjectImpl implements Collection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected MetaData metaData;

	/**
	 * The cached value of the '{@link #getCreatingTool() <em>Creating Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatingTool()
	 * @generated
	 * @ordered
	 */
	protected CreatingTool creatingTool;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question question;

	/**
	 * The cached value of the '{@link #getArgumentTemplate() <em>Argument Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentTemplate()
	 * @generated
	 * @ordered
	 */
	protected ArgumentTemplate argumentTemplate;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectType2 OBJECT_TYPE_EDEFAULT = ObjectType2.MISC;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected ObjectType2 objectType = OBJECT_TYPE_EDEFAULT;

	/**
	 * This is true if the Object Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaData(MetaData newMetaData, NotificationChain msgs) {
		MetaData oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__META_DATA, oldMetaData, newMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(MetaData newMetaData) {
		if (newMetaData != metaData) {
			NotificationChain msgs = null;
			if (metaData != null)
				msgs = ((InternalEObject)metaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__META_DATA, null, msgs);
			if (newMetaData != null)
				msgs = ((InternalEObject)newMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__META_DATA, null, msgs);
			msgs = basicSetMetaData(newMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__META_DATA, newMetaData, newMetaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatingTool getCreatingTool() {
		return creatingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatingTool(CreatingTool newCreatingTool, NotificationChain msgs) {
		CreatingTool oldCreatingTool = creatingTool;
		creatingTool = newCreatingTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__CREATING_TOOL, oldCreatingTool, newCreatingTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingTool(CreatingTool newCreatingTool) {
		if (newCreatingTool != creatingTool) {
			NotificationChain msgs = null;
			if (creatingTool != null)
				msgs = ((InternalEObject)creatingTool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__CREATING_TOOL, null, msgs);
			if (newCreatingTool != null)
				msgs = ((InternalEObject)newCreatingTool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__CREATING_TOOL, null, msgs);
			msgs = basicSetCreatingTool(newCreatingTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__CREATING_TOOL, newCreatingTool, newCreatingTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, AmlPackage.COLLECTION__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(Question newQuestion, NotificationChain msgs) {
		Question oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__QUESTION, oldQuestion, newQuestion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(Question newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__QUESTION, newQuestion, newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTemplate getArgumentTemplate() {
		return argumentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentTemplate(ArgumentTemplate newArgumentTemplate, NotificationChain msgs) {
		ArgumentTemplate oldArgumentTemplate = argumentTemplate;
		argumentTemplate = newArgumentTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__ARGUMENT_TEMPLATE, oldArgumentTemplate, newArgumentTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentTemplate(ArgumentTemplate newArgumentTemplate) {
		if (newArgumentTemplate != argumentTemplate) {
			NotificationChain msgs = null;
			if (argumentTemplate != null)
				msgs = ((InternalEObject)argumentTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__ARGUMENT_TEMPLATE, null, msgs);
			if (newArgumentTemplate != null)
				msgs = ((InternalEObject)newArgumentTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.COLLECTION__ARGUMENT_TEMPLATE, null, msgs);
			msgs = basicSetArgumentTemplate(newArgumentTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__ARGUMENT_TEMPLATE, newArgumentTemplate, newArgumentTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AmlPackage.COLLECTION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLabel() {
		return getGroup().list(AmlPackage.Literals.COLLECTION__LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionItem> getCollectionItem() {
		return getGroup().list(AmlPackage.Literals.COLLECTION__COLLECTION_ITEM);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__LABEL1, oldLabel1, label1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType2 getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(ObjectType2 newObjectType) {
		ObjectType2 oldObjectType = objectType;
		objectType = newObjectType == null ? OBJECT_TYPE_EDEFAULT : newObjectType;
		boolean oldObjectTypeESet = objectTypeESet;
		objectTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION__OBJECT_TYPE, oldObjectType, objectType, !oldObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectType() {
		ObjectType2 oldObjectType = objectType;
		boolean oldObjectTypeESet = objectTypeESet;
		objectType = OBJECT_TYPE_EDEFAULT;
		objectTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AmlPackage.COLLECTION__OBJECT_TYPE, oldObjectType, OBJECT_TYPE_EDEFAULT, oldObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectType() {
		return objectTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.COLLECTION__META_DATA:
				return basicSetMetaData(null, msgs);
			case AmlPackage.COLLECTION__CREATING_TOOL:
				return basicSetCreatingTool(null, msgs);
			case AmlPackage.COLLECTION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case AmlPackage.COLLECTION__QUESTION:
				return basicSetQuestion(null, msgs);
			case AmlPackage.COLLECTION__ARGUMENT_TEMPLATE:
				return basicSetArgumentTemplate(null, msgs);
			case AmlPackage.COLLECTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AmlPackage.COLLECTION__COLLECTION_ITEM:
				return ((InternalEList<?>)getCollectionItem()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.COLLECTION__META_DATA:
				return getMetaData();
			case AmlPackage.COLLECTION__CREATING_TOOL:
				return getCreatingTool();
			case AmlPackage.COLLECTION__ANNOTATION:
				return getAnnotation();
			case AmlPackage.COLLECTION__QUESTION:
				return getQuestion();
			case AmlPackage.COLLECTION__ARGUMENT_TEMPLATE:
				return getArgumentTemplate();
			case AmlPackage.COLLECTION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AmlPackage.COLLECTION__LABEL:
				return getLabel();
			case AmlPackage.COLLECTION__COLLECTION_ITEM:
				return getCollectionItem();
			case AmlPackage.COLLECTION__ID:
				return getId();
			case AmlPackage.COLLECTION__LABEL1:
				return getLabel1();
			case AmlPackage.COLLECTION__OBJECT_TYPE:
				return getObjectType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmlPackage.COLLECTION__META_DATA:
				setMetaData((MetaData)newValue);
				return;
			case AmlPackage.COLLECTION__CREATING_TOOL:
				setCreatingTool((CreatingTool)newValue);
				return;
			case AmlPackage.COLLECTION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((java.util.Collection<? extends Annotation>)newValue);
				return;
			case AmlPackage.COLLECTION__QUESTION:
				setQuestion((Question)newValue);
				return;
			case AmlPackage.COLLECTION__ARGUMENT_TEMPLATE:
				setArgumentTemplate((ArgumentTemplate)newValue);
				return;
			case AmlPackage.COLLECTION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AmlPackage.COLLECTION__LABEL:
				getLabel().clear();
				getLabel().addAll((java.util.Collection<? extends String>)newValue);
				return;
			case AmlPackage.COLLECTION__COLLECTION_ITEM:
				getCollectionItem().clear();
				getCollectionItem().addAll((java.util.Collection<? extends CollectionItem>)newValue);
				return;
			case AmlPackage.COLLECTION__ID:
				setId((String)newValue);
				return;
			case AmlPackage.COLLECTION__LABEL1:
				setLabel1((String)newValue);
				return;
			case AmlPackage.COLLECTION__OBJECT_TYPE:
				setObjectType((ObjectType2)newValue);
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
			case AmlPackage.COLLECTION__META_DATA:
				setMetaData((MetaData)null);
				return;
			case AmlPackage.COLLECTION__CREATING_TOOL:
				setCreatingTool((CreatingTool)null);
				return;
			case AmlPackage.COLLECTION__ANNOTATION:
				getAnnotation().clear();
				return;
			case AmlPackage.COLLECTION__QUESTION:
				setQuestion((Question)null);
				return;
			case AmlPackage.COLLECTION__ARGUMENT_TEMPLATE:
				setArgumentTemplate((ArgumentTemplate)null);
				return;
			case AmlPackage.COLLECTION__GROUP:
				getGroup().clear();
				return;
			case AmlPackage.COLLECTION__LABEL:
				getLabel().clear();
				return;
			case AmlPackage.COLLECTION__COLLECTION_ITEM:
				getCollectionItem().clear();
				return;
			case AmlPackage.COLLECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case AmlPackage.COLLECTION__LABEL1:
				setLabel1(LABEL1_EDEFAULT);
				return;
			case AmlPackage.COLLECTION__OBJECT_TYPE:
				unsetObjectType();
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
			case AmlPackage.COLLECTION__META_DATA:
				return metaData != null;
			case AmlPackage.COLLECTION__CREATING_TOOL:
				return creatingTool != null;
			case AmlPackage.COLLECTION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case AmlPackage.COLLECTION__QUESTION:
				return question != null;
			case AmlPackage.COLLECTION__ARGUMENT_TEMPLATE:
				return argumentTemplate != null;
			case AmlPackage.COLLECTION__GROUP:
				return group != null && !group.isEmpty();
			case AmlPackage.COLLECTION__LABEL:
				return !getLabel().isEmpty();
			case AmlPackage.COLLECTION__COLLECTION_ITEM:
				return !getCollectionItem().isEmpty();
			case AmlPackage.COLLECTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AmlPackage.COLLECTION__LABEL1:
				return LABEL1_EDEFAULT == null ? label1 != null : !LABEL1_EDEFAULT.equals(label1);
			case AmlPackage.COLLECTION__OBJECT_TYPE:
				return isSetObjectType();
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", label1: "); //$NON-NLS-1$
		result.append(label1);
		result.append(", objectType: "); //$NON-NLS-1$
		if (objectTypeESet) result.append(objectType); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //CollectionImpl
