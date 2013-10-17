/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.Document;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.ExhibitProperty;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.DocumentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.DocumentImpl#getCitation <em>Citation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends ExhibitImpl implements Document {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCitation() <em>Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected static final String CITATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected String citation = CITATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.DOCUMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitation(String newCitation) {
		String oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.DOCUMENT__CITATION, oldCitation, citation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.DOCUMENT__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.DOCUMENT__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.DOCUMENT__ID:
				return getId();
			case EvidencePackage.DOCUMENT__TIMING:
				return getTiming();
			case EvidencePackage.DOCUMENT__CUSTODY:
				return getCustody();
			case EvidencePackage.DOCUMENT__PROVENANCE:
				return getProvenance();
			case EvidencePackage.DOCUMENT__EVENT:
				return getEvent();
			case EvidencePackage.DOCUMENT__NAME:
				return getName();
			case EvidencePackage.DOCUMENT__URL:
				return getUrl();
			case EvidencePackage.DOCUMENT__PROPERTY:
				return getProperty();
			case EvidencePackage.DOCUMENT__TITLE:
				return getTitle();
			case EvidencePackage.DOCUMENT__CITATION:
				return getCitation();
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
			case EvidencePackage.DOCUMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.DOCUMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.DOCUMENT__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.DOCUMENT__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.DOCUMENT__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.DOCUMENT__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.DOCUMENT__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case EvidencePackage.DOCUMENT__URL:
				setUrl((String)newValue);
				return;
			case EvidencePackage.DOCUMENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ExhibitProperty>)newValue);
				return;
			case EvidencePackage.DOCUMENT__TITLE:
				setTitle((String)newValue);
				return;
			case EvidencePackage.DOCUMENT__CITATION:
				setCitation((String)newValue);
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
			case EvidencePackage.DOCUMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.DOCUMENT__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.DOCUMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.DOCUMENT__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.DOCUMENT__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.DOCUMENT__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.DOCUMENT__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EvidencePackage.DOCUMENT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case EvidencePackage.DOCUMENT__PROPERTY:
				getProperty().clear();
				return;
			case EvidencePackage.DOCUMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case EvidencePackage.DOCUMENT__CITATION:
				setCitation(CITATION_EDEFAULT);
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
			case EvidencePackage.DOCUMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.DOCUMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.DOCUMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.DOCUMENT__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.DOCUMENT__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.DOCUMENT__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.DOCUMENT__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EvidencePackage.DOCUMENT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case EvidencePackage.DOCUMENT__PROPERTY:
				return property != null && !property.isEmpty();
			case EvidencePackage.DOCUMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case EvidencePackage.DOCUMENT__CITATION:
				return CITATION_EDEFAULT == null ? citation != null : !CITATION_EDEFAULT.equals(citation);
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
		result.append(" (title: "); //$NON-NLS-1$
		result.append(title);
		result.append(", citation: "); //$NON-NLS-1$
		result.append(citation);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
