/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.ArgumentTemplate;
import net.certware.argument.aml.DiscoveryMethod;
import net.certware.argument.aml.Type;

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
 * An implementation of the model object '<em><b>Discovery Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getArgumentTemplate <em>Argument Template</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getAutoTrigger <em>Auto Trigger</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getImportType <em>Import Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.DiscoveryMethodImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscoveryMethodImpl extends EObjectImpl implements DiscoveryMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The default value of the '{@link #getAutoTrigger() <em>Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoTrigger() <em>Auto Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoTrigger()
	 * @generated
	 * @ordered
	 */
	protected String autoTrigger = AUTO_TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected String importType = IMPORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.URL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoveryMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.DISCOVERY_METHOD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE, oldArgumentTemplate, newArgumentTemplate);
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
				msgs = ((InternalEObject)argumentTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE, null, msgs);
			if (newArgumentTemplate != null)
				msgs = ((InternalEObject)newArgumentTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE, null, msgs);
			msgs = basicSetArgumentTemplate(newArgumentTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE, newArgumentTemplate, newArgumentTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, AmlPackage.DISCOVERY_METHOD__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoTrigger() {
		return autoTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoTrigger(String newAutoTrigger) {
		String oldAutoTrigger = autoTrigger;
		autoTrigger = newAutoTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__AUTO_TRIGGER, oldAutoTrigger, autoTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportType() {
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportType(String newImportType) {
		String oldImportType = importType;
		importType = newImportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__IMPORT_TYPE, oldImportType, importType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DISCOVERY_METHOD__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		Type oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AmlPackage.DISCOVERY_METHOD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE:
				return basicSetArgumentTemplate(null, msgs);
			case AmlPackage.DISCOVERY_METHOD__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE:
				return getArgumentTemplate();
			case AmlPackage.DISCOVERY_METHOD__URL:
				return getUrl();
			case AmlPackage.DISCOVERY_METHOD__ANNOTATION:
				return getAnnotation();
			case AmlPackage.DISCOVERY_METHOD__AUTO_TRIGGER:
				return getAutoTrigger();
			case AmlPackage.DISCOVERY_METHOD__DESCRIPTION:
				return getDescription();
			case AmlPackage.DISCOVERY_METHOD__ID:
				return getId();
			case AmlPackage.DISCOVERY_METHOD__IMPORT_TYPE:
				return getImportType();
			case AmlPackage.DISCOVERY_METHOD__LABEL:
				return getLabel();
			case AmlPackage.DISCOVERY_METHOD__TYPE:
				return getType();
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
			case AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE:
				setArgumentTemplate((ArgumentTemplate)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__URL:
				setUrl((String)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__AUTO_TRIGGER:
				setAutoTrigger((String)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__ID:
				setId((String)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__IMPORT_TYPE:
				setImportType((String)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__LABEL:
				setLabel((String)newValue);
				return;
			case AmlPackage.DISCOVERY_METHOD__TYPE:
				setType((Type)newValue);
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
			case AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE:
				setArgumentTemplate((ArgumentTemplate)null);
				return;
			case AmlPackage.DISCOVERY_METHOD__URL:
				setUrl(URL_EDEFAULT);
				return;
			case AmlPackage.DISCOVERY_METHOD__ANNOTATION:
				getAnnotation().clear();
				return;
			case AmlPackage.DISCOVERY_METHOD__AUTO_TRIGGER:
				setAutoTrigger(AUTO_TRIGGER_EDEFAULT);
				return;
			case AmlPackage.DISCOVERY_METHOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmlPackage.DISCOVERY_METHOD__ID:
				setId(ID_EDEFAULT);
				return;
			case AmlPackage.DISCOVERY_METHOD__IMPORT_TYPE:
				setImportType(IMPORT_TYPE_EDEFAULT);
				return;
			case AmlPackage.DISCOVERY_METHOD__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AmlPackage.DISCOVERY_METHOD__TYPE:
				unsetType();
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
			case AmlPackage.DISCOVERY_METHOD__ARGUMENT_TEMPLATE:
				return argumentTemplate != null;
			case AmlPackage.DISCOVERY_METHOD__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case AmlPackage.DISCOVERY_METHOD__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case AmlPackage.DISCOVERY_METHOD__AUTO_TRIGGER:
				return AUTO_TRIGGER_EDEFAULT == null ? autoTrigger != null : !AUTO_TRIGGER_EDEFAULT.equals(autoTrigger);
			case AmlPackage.DISCOVERY_METHOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AmlPackage.DISCOVERY_METHOD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AmlPackage.DISCOVERY_METHOD__IMPORT_TYPE:
				return IMPORT_TYPE_EDEFAULT == null ? importType != null : !IMPORT_TYPE_EDEFAULT.equals(importType);
			case AmlPackage.DISCOVERY_METHOD__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case AmlPackage.DISCOVERY_METHOD__TYPE:
				return isSetType();
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
		result.append(" (url: "); //$NON-NLS-1$
		result.append(url);
		result.append(", autoTrigger: "); //$NON-NLS-1$
		result.append(autoTrigger);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", importType: "); //$NON-NLS-1$
		result.append(importType);
		result.append(", label: "); //$NON-NLS-1$
		result.append(label);
		result.append(", type: "); //$NON-NLS-1$
		if (typeESet) result.append(type); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //DiscoveryMethodImpl
