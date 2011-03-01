/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.CreatingTool;
import net.certware.argument.aml.MetaData;
import net.certware.argument.aml.Question;
import net.certware.argument.aml.Template;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.TemplateImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.TemplateImpl#getCreatingTool <em>Creating Tool</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.TemplateImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.TemplateImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.TemplateImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends EObjectImpl implements Template {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.TEMPLATE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.TEMPLATE__META_DATA, oldMetaData, newMetaData);
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
				msgs = ((InternalEObject)metaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.TEMPLATE__META_DATA, null, msgs);
			if (newMetaData != null)
				msgs = ((InternalEObject)newMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.TEMPLATE__META_DATA, null, msgs);
			msgs = basicSetMetaData(newMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.TEMPLATE__META_DATA, newMetaData, newMetaData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.TEMPLATE__CREATING_TOOL, oldCreatingTool, newCreatingTool);
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
				msgs = ((InternalEObject)creatingTool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.TEMPLATE__CREATING_TOOL, null, msgs);
			if (newCreatingTool != null)
				msgs = ((InternalEObject)newCreatingTool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.TEMPLATE__CREATING_TOOL, null, msgs);
			msgs = basicSetCreatingTool(newCreatingTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.TEMPLATE__CREATING_TOOL, newCreatingTool, newCreatingTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, AmlPackage.TEMPLATE__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this, AmlPackage.TEMPLATE__QUESTION);
		}
		return question;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.TEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.TEMPLATE__META_DATA:
				return basicSetMetaData(null, msgs);
			case AmlPackage.TEMPLATE__CREATING_TOOL:
				return basicSetCreatingTool(null, msgs);
			case AmlPackage.TEMPLATE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case AmlPackage.TEMPLATE__QUESTION:
				return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.TEMPLATE__META_DATA:
				return getMetaData();
			case AmlPackage.TEMPLATE__CREATING_TOOL:
				return getCreatingTool();
			case AmlPackage.TEMPLATE__ANNOTATION:
				return getAnnotation();
			case AmlPackage.TEMPLATE__QUESTION:
				return getQuestion();
			case AmlPackage.TEMPLATE__ID:
				return getId();
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
			case AmlPackage.TEMPLATE__META_DATA:
				setMetaData((MetaData)newValue);
				return;
			case AmlPackage.TEMPLATE__CREATING_TOOL:
				setCreatingTool((CreatingTool)newValue);
				return;
			case AmlPackage.TEMPLATE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AmlPackage.TEMPLATE__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends Question>)newValue);
				return;
			case AmlPackage.TEMPLATE__ID:
				setId((String)newValue);
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
			case AmlPackage.TEMPLATE__META_DATA:
				setMetaData((MetaData)null);
				return;
			case AmlPackage.TEMPLATE__CREATING_TOOL:
				setCreatingTool((CreatingTool)null);
				return;
			case AmlPackage.TEMPLATE__ANNOTATION:
				getAnnotation().clear();
				return;
			case AmlPackage.TEMPLATE__QUESTION:
				getQuestion().clear();
				return;
			case AmlPackage.TEMPLATE__ID:
				setId(ID_EDEFAULT);
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
			case AmlPackage.TEMPLATE__META_DATA:
				return metaData != null;
			case AmlPackage.TEMPLATE__CREATING_TOOL:
				return creatingTool != null;
			case AmlPackage.TEMPLATE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case AmlPackage.TEMPLATE__QUESTION:
				return question != null && !question.isEmpty();
			case AmlPackage.TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TemplateImpl
