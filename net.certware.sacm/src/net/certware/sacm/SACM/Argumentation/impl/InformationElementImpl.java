/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.InformationElement;

import net.certware.sacm.SACM.Evidence.EvidenceItem;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.InformationElementImpl#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.InformationElementImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationElementImpl extends ArgumentElementImpl implements InformationElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceItem> evidence;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.INFORMATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceItem> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectResolvingEList<EvidenceItem>(EvidenceItem.class, this, ArgumentationPackage.INFORMATION_ELEMENT__EVIDENCE);
		}
		return evidence;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentationPackage.INFORMATION_ELEMENT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.INFORMATION_ELEMENT__TAGGED_VALUE:
				return getTaggedValue();
			case ArgumentationPackage.INFORMATION_ELEMENT__ANNOTATION:
				return getAnnotation();
			case ArgumentationPackage.INFORMATION_ELEMENT__ID:
				return getId();
			case ArgumentationPackage.INFORMATION_ELEMENT__DESCRIPTION:
				return getDescription();
			case ArgumentationPackage.INFORMATION_ELEMENT__CONTENT:
				return getContent();
			case ArgumentationPackage.INFORMATION_ELEMENT__EVIDENCE:
				return getEvidence();
			case ArgumentationPackage.INFORMATION_ELEMENT__URL:
				return getUrl();
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
			case ArgumentationPackage.INFORMATION_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__ID:
				setId((String)newValue);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__CONTENT:
				setContent((String)newValue);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends EvidenceItem>)newValue);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__URL:
				setUrl((String)newValue);
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
			case ArgumentationPackage.INFORMATION_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__EVIDENCE:
				getEvidence().clear();
				return;
			case ArgumentationPackage.INFORMATION_ELEMENT__URL:
				setUrl(URL_EDEFAULT);
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
			case ArgumentationPackage.INFORMATION_ELEMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ArgumentationPackage.INFORMATION_ELEMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case ArgumentationPackage.INFORMATION_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ArgumentationPackage.INFORMATION_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArgumentationPackage.INFORMATION_ELEMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case ArgumentationPackage.INFORMATION_ELEMENT__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
			case ArgumentationPackage.INFORMATION_ELEMENT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (url: "); //$NON-NLS-1$
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //InformationElementImpl
