/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import net.certware.argument.aml.AmlDocument;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Argument;
import net.certware.argument.aml.Collection;
import net.certware.argument.aml.DiscoveryMethod;
import net.certware.argument.aml.Exhibit;
import net.certware.argument.aml.Memo;
import net.certware.argument.aml.Person;
import net.certware.argument.aml.Template;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getExhibit <em>Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getMemo <em>Memo</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getDiscoveryMethod <em>Discovery Method</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.AmlDocumentImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AmlDocumentImpl extends EObjectImpl implements AmlDocument {
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
	protected AmlDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.AML_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AmlPackage.AML_DOCUMENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getTemplate() {
		return getGroup().list(AmlPackage.Literals.AML_DOCUMENT__TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		return getGroup().list(AmlPackage.Literals.AML_DOCUMENT__ARGUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exhibit> getExhibit() {
		return getGroup().list(AmlPackage.Literals.AML_DOCUMENT__EXHIBIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collection> getCollection() {
		return getGroup().list(AmlPackage.Literals.AML_DOCUMENT__COLLECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		return getGroup().list(AmlPackage.Literals.AML_DOCUMENT__PERSON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memo> getMemo() {
		return getGroup().list(AmlPackage.Literals.AML_DOCUMENT__MEMO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscoveryMethod> getDiscoveryMethod() {
		return getGroup().list(AmlPackage.Literals.AML_DOCUMENT__DISCOVERY_METHOD);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.AML_DOCUMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.AML_DOCUMENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_DOCUMENT__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_DOCUMENT__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_DOCUMENT__EXHIBIT:
				return ((InternalEList<?>)getExhibit()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_DOCUMENT__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_DOCUMENT__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_DOCUMENT__MEMO:
				return ((InternalEList<?>)getMemo()).basicRemove(otherEnd, msgs);
			case AmlPackage.AML_DOCUMENT__DISCOVERY_METHOD:
				return ((InternalEList<?>)getDiscoveryMethod()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.AML_DOCUMENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AmlPackage.AML_DOCUMENT__TEMPLATE:
				return getTemplate();
			case AmlPackage.AML_DOCUMENT__ARGUMENT:
				return getArgument();
			case AmlPackage.AML_DOCUMENT__EXHIBIT:
				return getExhibit();
			case AmlPackage.AML_DOCUMENT__COLLECTION:
				return getCollection();
			case AmlPackage.AML_DOCUMENT__PERSON:
				return getPerson();
			case AmlPackage.AML_DOCUMENT__MEMO:
				return getMemo();
			case AmlPackage.AML_DOCUMENT__DISCOVERY_METHOD:
				return getDiscoveryMethod();
			case AmlPackage.AML_DOCUMENT__VERSION:
				return getVersion();
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
			case AmlPackage.AML_DOCUMENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AmlPackage.AML_DOCUMENT__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((java.util.Collection<? extends Template>)newValue);
				return;
			case AmlPackage.AML_DOCUMENT__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((java.util.Collection<? extends Argument>)newValue);
				return;
			case AmlPackage.AML_DOCUMENT__EXHIBIT:
				getExhibit().clear();
				getExhibit().addAll((java.util.Collection<? extends Exhibit>)newValue);
				return;
			case AmlPackage.AML_DOCUMENT__COLLECTION:
				getCollection().clear();
				getCollection().addAll((java.util.Collection<? extends Collection>)newValue);
				return;
			case AmlPackage.AML_DOCUMENT__PERSON:
				getPerson().clear();
				getPerson().addAll((java.util.Collection<? extends Person>)newValue);
				return;
			case AmlPackage.AML_DOCUMENT__MEMO:
				getMemo().clear();
				getMemo().addAll((java.util.Collection<? extends Memo>)newValue);
				return;
			case AmlPackage.AML_DOCUMENT__DISCOVERY_METHOD:
				getDiscoveryMethod().clear();
				getDiscoveryMethod().addAll((java.util.Collection<? extends DiscoveryMethod>)newValue);
				return;
			case AmlPackage.AML_DOCUMENT__VERSION:
				setVersion((String)newValue);
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
			case AmlPackage.AML_DOCUMENT__GROUP:
				getGroup().clear();
				return;
			case AmlPackage.AML_DOCUMENT__TEMPLATE:
				getTemplate().clear();
				return;
			case AmlPackage.AML_DOCUMENT__ARGUMENT:
				getArgument().clear();
				return;
			case AmlPackage.AML_DOCUMENT__EXHIBIT:
				getExhibit().clear();
				return;
			case AmlPackage.AML_DOCUMENT__COLLECTION:
				getCollection().clear();
				return;
			case AmlPackage.AML_DOCUMENT__PERSON:
				getPerson().clear();
				return;
			case AmlPackage.AML_DOCUMENT__MEMO:
				getMemo().clear();
				return;
			case AmlPackage.AML_DOCUMENT__DISCOVERY_METHOD:
				getDiscoveryMethod().clear();
				return;
			case AmlPackage.AML_DOCUMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case AmlPackage.AML_DOCUMENT__GROUP:
				return group != null && !group.isEmpty();
			case AmlPackage.AML_DOCUMENT__TEMPLATE:
				return !getTemplate().isEmpty();
			case AmlPackage.AML_DOCUMENT__ARGUMENT:
				return !getArgument().isEmpty();
			case AmlPackage.AML_DOCUMENT__EXHIBIT:
				return !getExhibit().isEmpty();
			case AmlPackage.AML_DOCUMENT__COLLECTION:
				return !getCollection().isEmpty();
			case AmlPackage.AML_DOCUMENT__PERSON:
				return !getPerson().isEmpty();
			case AmlPackage.AML_DOCUMENT__MEMO:
				return !getMemo().isEmpty();
			case AmlPackage.AML_DOCUMENT__DISCOVERY_METHOD:
				return !getDiscoveryMethod().isEmpty();
			case AmlPackage.AML_DOCUMENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //AmlDocumentImpl
