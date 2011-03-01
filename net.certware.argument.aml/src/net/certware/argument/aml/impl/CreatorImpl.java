/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Creator;
import net.certware.argument.aml.ObjectType3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.CreatorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CreatorImpl#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CreatorImpl#getObjectType <em>Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatorImpl extends EObjectImpl implements Creator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

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
	 * The default value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdRef() <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected String idRef = ID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectType3 OBJECT_TYPE_EDEFAULT = ObjectType3.TEMPLATE;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected ObjectType3 objectType = OBJECT_TYPE_EDEFAULT;

	/**
	 * This is true if the Object Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.CREATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.CREATOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdRef() {
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRef(String newIdRef) {
		String oldIdRef = idRef;
		idRef = newIdRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.CREATOR__ID_REF, oldIdRef, idRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType3 getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(ObjectType3 newObjectType) {
		ObjectType3 oldObjectType = objectType;
		objectType = newObjectType == null ? OBJECT_TYPE_EDEFAULT : newObjectType;
		boolean oldObjectTypeESet = objectTypeESet;
		objectTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.CREATOR__OBJECT_TYPE, oldObjectType, objectType, !oldObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectType() {
		ObjectType3 oldObjectType = objectType;
		boolean oldObjectTypeESet = objectTypeESet;
		objectType = OBJECT_TYPE_EDEFAULT;
		objectTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AmlPackage.CREATOR__OBJECT_TYPE, oldObjectType, OBJECT_TYPE_EDEFAULT, oldObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectType() {
		return objectTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.CREATOR__DESCRIPTION:
				return getDescription();
			case AmlPackage.CREATOR__ID_REF:
				return getIdRef();
			case AmlPackage.CREATOR__OBJECT_TYPE:
				return getObjectType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmlPackage.CREATOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmlPackage.CREATOR__ID_REF:
				setIdRef((String)newValue);
				return;
			case AmlPackage.CREATOR__OBJECT_TYPE:
				setObjectType((ObjectType3)newValue);
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
			case AmlPackage.CREATOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmlPackage.CREATOR__ID_REF:
				setIdRef(ID_REF_EDEFAULT);
				return;
			case AmlPackage.CREATOR__OBJECT_TYPE:
				unsetObjectType();
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
			case AmlPackage.CREATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AmlPackage.CREATOR__ID_REF:
				return ID_REF_EDEFAULT == null ? idRef != null : !ID_REF_EDEFAULT.equals(idRef);
			case AmlPackage.CREATOR__OBJECT_TYPE:
				return isSetObjectType();
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
		result.append(" (description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", idRef: "); //$NON-NLS-1$
		result.append(idRef);
		result.append(", objectType: "); //$NON-NLS-1$
		if (objectTypeESet) result.append(objectType); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //CreatorImpl
