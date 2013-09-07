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
import net.certware.sacm.SACM.Evidence.ProjectProperty;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;
import net.certware.sacm.SACM.Evidence.Tool;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.ToolImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToolImpl extends CollectionMethodImpl implements Tool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.TOOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.TOOL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.TOOL__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.TOOL__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.TOOL__ID:
				return getId();
			case EvidencePackage.TOOL__TIMING:
				return getTiming();
			case EvidencePackage.TOOL__CUSTODY:
				return getCustody();
			case EvidencePackage.TOOL__PROVENANCE:
				return getProvenance();
			case EvidencePackage.TOOL__EVENT:
				return getEvent();
			case EvidencePackage.TOOL__NAME:
				return getName();
			case EvidencePackage.TOOL__CONTENT:
				return getContent();
			case EvidencePackage.TOOL__PROPERTY:
				return getProperty();
			case EvidencePackage.TOOL__VERSION:
				return getVersion();
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
			case EvidencePackage.TOOL__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.TOOL__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.TOOL__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.TOOL__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.TOOL__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.TOOL__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.TOOL__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.TOOL__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.TOOL__CONTENT:
				setContent((String)newValue);
				return;
			case EvidencePackage.TOOL__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ProjectProperty>)newValue);
				return;
			case EvidencePackage.TOOL__VERSION:
				setVersion((String)newValue);
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
			case EvidencePackage.TOOL__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.TOOL__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.TOOL__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.TOOL__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.TOOL__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.TOOL__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.TOOL__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.TOOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.TOOL__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case EvidencePackage.TOOL__PROPERTY:
				getProperty().clear();
				return;
			case EvidencePackage.TOOL__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case EvidencePackage.TOOL__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.TOOL__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.TOOL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.TOOL__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.TOOL__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.TOOL__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.TOOL__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.TOOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.TOOL__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case EvidencePackage.TOOL__PROPERTY:
				return property != null && !property.isEmpty();
			case EvidencePackage.TOOL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ToolImpl
