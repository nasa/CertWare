/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceEvaluation;
import net.certware.sacm.SACM.Evidence.EvidenceItem;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.ProjectElement;
import net.certware.sacm.SACM.Evidence.ProjectProperty;

import net.certware.sacm.SACM.TaggedValue;

import net.certware.sacm.SACM.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl#getItem <em>Item</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceContainerImpl extends ModelElementImpl implements EvidenceContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceEvaluation> evaluation;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceItem> item;

	/**
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final String GID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected String gid = GID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectProperty> property;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectElement> element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EVIDENCE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceEvaluation> getEvaluation() {
		if (evaluation == null) {
			evaluation = new EObjectContainmentEList<EvidenceEvaluation>(EvidenceEvaluation.class, this, EvidencePackage.EVIDENCE_CONTAINER__EVALUATION);
		}
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<EvidenceItem>(EvidenceItem.class, this, EvidencePackage.EVIDENCE_CONTAINER__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGid(String newGid) {
		String oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_CONTAINER__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ProjectProperty>(ProjectProperty.class, this, EvidencePackage.EVIDENCE_CONTAINER__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EVIDENCE_CONTAINER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectElement> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<ProjectElement>(ProjectElement.class, this, EvidencePackage.EVIDENCE_CONTAINER__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_CONTAINER__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_CONTAINER__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_CONTAINER__EVALUATION:
				return ((InternalEList<?>)getEvaluation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_CONTAINER__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_CONTAINER__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EVIDENCE_CONTAINER__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_CONTAINER__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EVIDENCE_CONTAINER__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EVIDENCE_CONTAINER__ID:
				return getId();
			case EvidencePackage.EVIDENCE_CONTAINER__NAME:
				return getName();
			case EvidencePackage.EVIDENCE_CONTAINER__EVALUATION:
				return getEvaluation();
			case EvidencePackage.EVIDENCE_CONTAINER__ITEM:
				return getItem();
			case EvidencePackage.EVIDENCE_CONTAINER__GID:
				return getGid();
			case EvidencePackage.EVIDENCE_CONTAINER__PROPERTY:
				return getProperty();
			case EvidencePackage.EVIDENCE_CONTAINER__VERSION:
				return getVersion();
			case EvidencePackage.EVIDENCE_CONTAINER__ELEMENT:
				return getElement();
		}
		return eDynamicGet(featureID, resolve, coreType);
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
			case EvidencePackage.EVIDENCE_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__EVALUATION:
				getEvaluation().clear();
				getEvaluation().addAll((Collection<? extends EvidenceEvaluation>)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends EvidenceItem>)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__GID:
				setGid((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ProjectProperty>)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__VERSION:
				setVersion((String)newValue);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ProjectElement>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_CONTAINER__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__EVALUATION:
				getEvaluation().clear();
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ITEM:
				getItem().clear();
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__GID:
				setGid(GID_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__PROPERTY:
				getProperty().clear();
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__ELEMENT:
				getElement().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvidencePackage.EVIDENCE_CONTAINER__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EVIDENCE_CONTAINER__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EVIDENCE_CONTAINER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EVIDENCE_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.EVIDENCE_CONTAINER__EVALUATION:
				return evaluation != null && !evaluation.isEmpty();
			case EvidencePackage.EVIDENCE_CONTAINER__ITEM:
				return item != null && !item.isEmpty();
			case EvidencePackage.EVIDENCE_CONTAINER__GID:
				return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
			case EvidencePackage.EVIDENCE_CONTAINER__PROPERTY:
				return property != null && !property.isEmpty();
			case EvidencePackage.EVIDENCE_CONTAINER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EvidencePackage.EVIDENCE_CONTAINER__ELEMENT:
				return element != null && !element.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", gid: "); //$NON-NLS-1$
		result.append(gid);
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //EvidenceContainerImpl
