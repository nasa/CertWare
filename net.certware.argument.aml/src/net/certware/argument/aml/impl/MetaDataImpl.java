/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Coverage;
import net.certware.argument.aml.Creator;
import net.certware.argument.aml.MetaData;
import net.certware.argument.aml.Publisher;
import net.certware.argument.aml.Reader;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getSecurityMarking <em>Security Marking</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.MetaDataImpl#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaDataImpl extends EObjectImpl implements MetaData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.META_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AmlPackage.META_DATA__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTitle() {
		return getGroup().list(AmlPackage.Literals.META_DATA__TITLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSecurityMarking() {
		return getGroup().list(AmlPackage.Literals.META_DATA__SECURITY_MARKING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Creator> getCreator() {
		return getGroup().list(AmlPackage.Literals.META_DATA__CREATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reader> getReader() {
		return getGroup().list(AmlPackage.Literals.META_DATA__READER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubject() {
		return getGroup().list(AmlPackage.Literals.META_DATA__SUBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescription() {
		return getGroup().list(AmlPackage.Literals.META_DATA__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublisher() {
		return getGroup().list(AmlPackage.Literals.META_DATA__PUBLISHER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getContributor() {
		return getGroup().list(AmlPackage.Literals.META_DATA__CONTRIBUTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XMLGregorianCalendar> getDate() {
		return getGroup().list(AmlPackage.Literals.META_DATA__DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getType() {
		return getGroup().list(AmlPackage.Literals.META_DATA__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFormat() {
		return getGroup().list(AmlPackage.Literals.META_DATA__FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIdentifier() {
		return getGroup().list(AmlPackage.Literals.META_DATA__IDENTIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSource() {
		return getGroup().list(AmlPackage.Literals.META_DATA__SOURCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLanguage() {
		return getGroup().list(AmlPackage.Literals.META_DATA__LANGUAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRelation() {
		return getGroup().list(AmlPackage.Literals.META_DATA__RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coverage> getCoverage() {
		return getGroup().list(AmlPackage.Literals.META_DATA__COVERAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRights() {
		return getGroup().list(AmlPackage.Literals.META_DATA__RIGHTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getImage() {
		return getGroup().list(AmlPackage.Literals.META_DATA__IMAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.META_DATA__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__CREATOR:
				return ((InternalEList<?>)getCreator()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__READER:
				return ((InternalEList<?>)getReader()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__PUBLISHER:
				return ((InternalEList<?>)getPublisher()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__CONTRIBUTOR:
				return ((InternalEList<?>)getContributor()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__FORMAT:
				return ((InternalEList<?>)getFormat()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__LANGUAGE:
				return ((InternalEList<?>)getLanguage()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__RIGHTS:
				return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
			case AmlPackage.META_DATA__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.META_DATA__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AmlPackage.META_DATA__TITLE:
				return getTitle();
			case AmlPackage.META_DATA__SECURITY_MARKING:
				return getSecurityMarking();
			case AmlPackage.META_DATA__CREATOR:
				return getCreator();
			case AmlPackage.META_DATA__READER:
				return getReader();
			case AmlPackage.META_DATA__SUBJECT:
				return getSubject();
			case AmlPackage.META_DATA__DESCRIPTION:
				return getDescription();
			case AmlPackage.META_DATA__PUBLISHER:
				return getPublisher();
			case AmlPackage.META_DATA__CONTRIBUTOR:
				return getContributor();
			case AmlPackage.META_DATA__DATE:
				return getDate();
			case AmlPackage.META_DATA__TYPE:
				return getType();
			case AmlPackage.META_DATA__FORMAT:
				return getFormat();
			case AmlPackage.META_DATA__IDENTIFIER:
				return getIdentifier();
			case AmlPackage.META_DATA__SOURCE:
				return getSource();
			case AmlPackage.META_DATA__LANGUAGE:
				return getLanguage();
			case AmlPackage.META_DATA__RELATION:
				return getRelation();
			case AmlPackage.META_DATA__COVERAGE:
				return getCoverage();
			case AmlPackage.META_DATA__RIGHTS:
				return getRights();
			case AmlPackage.META_DATA__IMAGE:
				return getImage();
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
			case AmlPackage.META_DATA__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AmlPackage.META_DATA__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.META_DATA__SECURITY_MARKING:
				getSecurityMarking().clear();
				getSecurityMarking().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.META_DATA__CREATOR:
				getCreator().clear();
				getCreator().addAll((Collection<? extends Creator>)newValue);
				return;
			case AmlPackage.META_DATA__READER:
				getReader().clear();
				getReader().addAll((Collection<? extends Reader>)newValue);
				return;
			case AmlPackage.META_DATA__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.META_DATA__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.META_DATA__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends Publisher>)newValue);
				return;
			case AmlPackage.META_DATA__CONTRIBUTOR:
				getContributor().clear();
				getContributor().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends XMLGregorianCalendar>)newValue);
				return;
			case AmlPackage.META_DATA__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__FORMAT:
				getFormat().clear();
				getFormat().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends Coverage>)newValue);
				return;
			case AmlPackage.META_DATA__RIGHTS:
				getRights().clear();
				getRights().addAll((Collection<? extends EObject>)newValue);
				return;
			case AmlPackage.META_DATA__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends EObject>)newValue);
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
			case AmlPackage.META_DATA__GROUP:
				getGroup().clear();
				return;
			case AmlPackage.META_DATA__TITLE:
				getTitle().clear();
				return;
			case AmlPackage.META_DATA__SECURITY_MARKING:
				getSecurityMarking().clear();
				return;
			case AmlPackage.META_DATA__CREATOR:
				getCreator().clear();
				return;
			case AmlPackage.META_DATA__READER:
				getReader().clear();
				return;
			case AmlPackage.META_DATA__SUBJECT:
				getSubject().clear();
				return;
			case AmlPackage.META_DATA__DESCRIPTION:
				getDescription().clear();
				return;
			case AmlPackage.META_DATA__PUBLISHER:
				getPublisher().clear();
				return;
			case AmlPackage.META_DATA__CONTRIBUTOR:
				getContributor().clear();
				return;
			case AmlPackage.META_DATA__DATE:
				getDate().clear();
				return;
			case AmlPackage.META_DATA__TYPE:
				getType().clear();
				return;
			case AmlPackage.META_DATA__FORMAT:
				getFormat().clear();
				return;
			case AmlPackage.META_DATA__IDENTIFIER:
				getIdentifier().clear();
				return;
			case AmlPackage.META_DATA__SOURCE:
				getSource().clear();
				return;
			case AmlPackage.META_DATA__LANGUAGE:
				getLanguage().clear();
				return;
			case AmlPackage.META_DATA__RELATION:
				getRelation().clear();
				return;
			case AmlPackage.META_DATA__COVERAGE:
				getCoverage().clear();
				return;
			case AmlPackage.META_DATA__RIGHTS:
				getRights().clear();
				return;
			case AmlPackage.META_DATA__IMAGE:
				getImage().clear();
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
			case AmlPackage.META_DATA__GROUP:
				return group != null && !group.isEmpty();
			case AmlPackage.META_DATA__TITLE:
				return !getTitle().isEmpty();
			case AmlPackage.META_DATA__SECURITY_MARKING:
				return !getSecurityMarking().isEmpty();
			case AmlPackage.META_DATA__CREATOR:
				return !getCreator().isEmpty();
			case AmlPackage.META_DATA__READER:
				return !getReader().isEmpty();
			case AmlPackage.META_DATA__SUBJECT:
				return !getSubject().isEmpty();
			case AmlPackage.META_DATA__DESCRIPTION:
				return !getDescription().isEmpty();
			case AmlPackage.META_DATA__PUBLISHER:
				return !getPublisher().isEmpty();
			case AmlPackage.META_DATA__CONTRIBUTOR:
				return !getContributor().isEmpty();
			case AmlPackage.META_DATA__DATE:
				return !getDate().isEmpty();
			case AmlPackage.META_DATA__TYPE:
				return !getType().isEmpty();
			case AmlPackage.META_DATA__FORMAT:
				return !getFormat().isEmpty();
			case AmlPackage.META_DATA__IDENTIFIER:
				return !getIdentifier().isEmpty();
			case AmlPackage.META_DATA__SOURCE:
				return !getSource().isEmpty();
			case AmlPackage.META_DATA__LANGUAGE:
				return !getLanguage().isEmpty();
			case AmlPackage.META_DATA__RELATION:
				return !getRelation().isEmpty();
			case AmlPackage.META_DATA__COVERAGE:
				return !getCoverage().isEmpty();
			case AmlPackage.META_DATA__RIGHTS:
				return !getRights().isEmpty();
			case AmlPackage.META_DATA__IMAGE:
				return !getImage().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //MetaDataImpl
