/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.CollectionItem;
import net.certware.argument.aml.ObjectType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.CollectionItemImpl#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionItemImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.CollectionItemImpl#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionItemImpl extends EObjectImpl implements CollectionItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

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
	protected static final ObjectType OBJECT_TYPE_EDEFAULT = ObjectType.TEMPLATE;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected ObjectType objectType = OBJECT_TYPE_EDEFAULT;

	/**
	 * This is true if the Object Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectTypeESet;

	/**
	 * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected String ordinal = ORDINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.COLLECTION_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION_ITEM__ID_REF, oldIdRef, idRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(ObjectType newObjectType) {
		ObjectType oldObjectType = objectType;
		objectType = newObjectType == null ? OBJECT_TYPE_EDEFAULT : newObjectType;
		boolean oldObjectTypeESet = objectTypeESet;
		objectTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION_ITEM__OBJECT_TYPE, oldObjectType, objectType, !oldObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectType() {
		ObjectType oldObjectType = objectType;
		boolean oldObjectTypeESet = objectTypeESet;
		objectType = OBJECT_TYPE_EDEFAULT;
		objectTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AmlPackage.COLLECTION_ITEM__OBJECT_TYPE, oldObjectType, OBJECT_TYPE_EDEFAULT, oldObjectTypeESet));
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
	public String getOrdinal() {
		return ordinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdinal(String newOrdinal) {
		String oldOrdinal = ordinal;
		ordinal = newOrdinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.COLLECTION_ITEM__ORDINAL, oldOrdinal, ordinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.COLLECTION_ITEM__ID_REF:
				return getIdRef();
			case AmlPackage.COLLECTION_ITEM__OBJECT_TYPE:
				return getObjectType();
			case AmlPackage.COLLECTION_ITEM__ORDINAL:
				return getOrdinal();
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
			case AmlPackage.COLLECTION_ITEM__ID_REF:
				setIdRef((String)newValue);
				return;
			case AmlPackage.COLLECTION_ITEM__OBJECT_TYPE:
				setObjectType((ObjectType)newValue);
				return;
			case AmlPackage.COLLECTION_ITEM__ORDINAL:
				setOrdinal((String)newValue);
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
			case AmlPackage.COLLECTION_ITEM__ID_REF:
				setIdRef(ID_REF_EDEFAULT);
				return;
			case AmlPackage.COLLECTION_ITEM__OBJECT_TYPE:
				unsetObjectType();
				return;
			case AmlPackage.COLLECTION_ITEM__ORDINAL:
				setOrdinal(ORDINAL_EDEFAULT);
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
			case AmlPackage.COLLECTION_ITEM__ID_REF:
				return ID_REF_EDEFAULT == null ? idRef != null : !ID_REF_EDEFAULT.equals(idRef);
			case AmlPackage.COLLECTION_ITEM__OBJECT_TYPE:
				return isSetObjectType();
			case AmlPackage.COLLECTION_ITEM__ORDINAL:
				return ORDINAL_EDEFAULT == null ? ordinal != null : !ORDINAL_EDEFAULT.equals(ordinal);
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
		result.append(" (idRef: "); //$NON-NLS-1$
		result.append(idRef);
		result.append(", objectType: "); //$NON-NLS-1$
		if (objectTypeESet) result.append(objectType); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", ordinal: "); //$NON-NLS-1$
		result.append(ordinal);
		result.append(')');
		return result.toString();
	}

} //CollectionItemImpl
