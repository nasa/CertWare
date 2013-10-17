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
import net.certware.sacm.SACM.Evidence.Exhibit;
import net.certware.sacm.SACM.Evidence.ExhibitProperty;
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
 * An implementation of the model object '<em><b>Exhibit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ExhibitImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ExhibitImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ExhibitImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExhibitImpl extends EvidenceItemImpl implements Exhibit {
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ExhibitProperty> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhibitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.EXHIBIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EXHIBIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.EXHIBIT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExhibitProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ExhibitProperty>(ExhibitProperty.class, this, EvidencePackage.EXHIBIT__PROPERTY);
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
			case EvidencePackage.EXHIBIT__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EXHIBIT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EXHIBIT__TIMING:
				return ((InternalEList<?>)getTiming()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EXHIBIT__CUSTODY:
				return ((InternalEList<?>)getCustody()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EXHIBIT__PROVENANCE:
				return ((InternalEList<?>)getProvenance()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EXHIBIT__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case EvidencePackage.EXHIBIT__PROPERTY:
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
			case EvidencePackage.EXHIBIT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.EXHIBIT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.EXHIBIT__ID:
				return getId();
			case EvidencePackage.EXHIBIT__TIMING:
				return getTiming();
			case EvidencePackage.EXHIBIT__CUSTODY:
				return getCustody();
			case EvidencePackage.EXHIBIT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.EXHIBIT__EVENT:
				return getEvent();
			case EvidencePackage.EXHIBIT__NAME:
				return getName();
			case EvidencePackage.EXHIBIT__URL:
				return getUrl();
			case EvidencePackage.EXHIBIT__PROPERTY:
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
			case EvidencePackage.EXHIBIT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.EXHIBIT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.EXHIBIT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.EXHIBIT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.EXHIBIT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.EXHIBIT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.EXHIBIT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.EXHIBIT__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.EXHIBIT__URL:
				setUrl((String)newValue);
				return;
			case EvidencePackage.EXHIBIT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ExhibitProperty>)newValue);
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
			case EvidencePackage.EXHIBIT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.EXHIBIT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.EXHIBIT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.EXHIBIT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.EXHIBIT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.EXHIBIT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.EXHIBIT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.EXHIBIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.EXHIBIT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case EvidencePackage.EXHIBIT__PROPERTY:
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
			case EvidencePackage.EXHIBIT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.EXHIBIT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.EXHIBIT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.EXHIBIT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.EXHIBIT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.EXHIBIT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.EXHIBIT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.EXHIBIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.EXHIBIT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case EvidencePackage.EXHIBIT__PROPERTY:
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
		result.append(", url: "); //$NON-NLS-1$
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ExhibitImpl
