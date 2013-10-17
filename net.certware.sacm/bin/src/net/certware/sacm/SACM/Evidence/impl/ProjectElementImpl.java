/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.ProjectElement;
import net.certware.sacm.SACM.Evidence.ProjectProperty;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

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
 * An implementation of the model object '<em><b>Project Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ProjectElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ProjectElementImpl#getContent <em>Content</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ProjectElementImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProjectElementImpl extends EvidenceElementImpl implements ProjectElement {
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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.PROJECT_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PROJECT_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PROJECT_ELEMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ProjectProperty>(ProjectProperty.class, this, EvidencePackage.PROJECT_ELEMENT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.PROJECT_ELEMENT__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PROJECT_ELEMENT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PROJECT_ELEMENT__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PROJECT_ELEMENT__CUSTODY:
				return ((InternalEList<?>)getCustody()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PROJECT_ELEMENT__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PROJECT_ELEMENT__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PROJECT_ELEMENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
			case EvidencePackage.PROJECT_ELEMENT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.PROJECT_ELEMENT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.PROJECT_ELEMENT__ID:
				return getId();
			case EvidencePackage.PROJECT_ELEMENT__TIMING:
				return getTiming();
			case EvidencePackage.PROJECT_ELEMENT__CUSTODY:
				return getCustody();
			case EvidencePackage.PROJECT_ELEMENT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.PROJECT_ELEMENT__EVENT:
				return getEvent();
			case EvidencePackage.PROJECT_ELEMENT__NAME:
				return getName();
			case EvidencePackage.PROJECT_ELEMENT__CONTENT:
				return getContent();
			case EvidencePackage.PROJECT_ELEMENT__PROPERTY:
				return getProperty();
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
			case EvidencePackage.PROJECT_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__CONTENT:
				setContent((String)newValue);
				return;
			case EvidencePackage.PROJECT_ELEMENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ProjectProperty>)newValue);
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
			case EvidencePackage.PROJECT_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.PROJECT_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.PROJECT_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.PROJECT_ELEMENT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.PROJECT_ELEMENT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.PROJECT_ELEMENT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.PROJECT_ELEMENT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.PROJECT_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.PROJECT_ELEMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EvidencePackage.PROJECT_ELEMENT__PROPERTY:
				getProperty().clear();
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
			case EvidencePackage.PROJECT_ELEMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.PROJECT_ELEMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.PROJECT_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.PROJECT_ELEMENT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.PROJECT_ELEMENT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.PROJECT_ELEMENT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.PROJECT_ELEMENT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.PROJECT_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.PROJECT_ELEMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EvidencePackage.PROJECT_ELEMENT__PROPERTY:
				return property != null && !property.isEmpty();
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
		result.append(", content: "); //$NON-NLS-1$
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //ProjectElementImpl
