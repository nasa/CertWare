/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.TypeType7;
import net.certware.planning.mspdi.ValueType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.ValueType1Impl#getValueID <em>Value ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ValueType1Impl#getFieldGUID <em>Field GUID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ValueType1Impl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ValueType1Impl#getParentValueID <em>Parent Value ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ValueType1Impl#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ValueType1Impl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueType1Impl extends EObjectImpl implements ValueType1 {
	/**
	 * The default value of the '{@link #getValueID() <em>Value ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueID() <em>Value ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger valueID = VALUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldGUID() <em>Field GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldGUID() <em>Field GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldGUID()
	 * @generated
	 * @ordered
	 */
	protected String fieldGUID = FIELD_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType7 TYPE_EDEFAULT = TypeType7._4;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType7 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getParentValueID() <em>Parent Value ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentValueID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PARENT_VALUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentValueID() <em>Parent Value ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentValueID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger parentValueID = PARENT_VALUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.VALUE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValueID() {
		return valueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueID(BigInteger newValueID) {
		BigInteger oldValueID = valueID;
		valueID = newValueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.VALUE_TYPE1__VALUE_ID, oldValueID, valueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldGUID() {
		return fieldGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldGUID(String newFieldGUID) {
		String oldFieldGUID = fieldGUID;
		fieldGUID = newFieldGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.VALUE_TYPE1__FIELD_GUID, oldFieldGUID, fieldGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType7 newType) {
		TypeType7 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.VALUE_TYPE1__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType7 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.VALUE_TYPE1__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public BigInteger getParentValueID() {
		return parentValueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentValueID(BigInteger newParentValueID) {
		BigInteger oldParentValueID = parentValueID;
		parentValueID = newParentValueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.VALUE_TYPE1__PARENT_VALUE_ID, oldParentValueID, parentValueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.VALUE_TYPE1__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.VALUE_TYPE1__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.VALUE_TYPE1__VALUE_ID:
				return getValueID();
			case MspdiPackage.VALUE_TYPE1__FIELD_GUID:
				return getFieldGUID();
			case MspdiPackage.VALUE_TYPE1__TYPE:
				return getType();
			case MspdiPackage.VALUE_TYPE1__PARENT_VALUE_ID:
				return getParentValueID();
			case MspdiPackage.VALUE_TYPE1__VALUE:
				return getValue();
			case MspdiPackage.VALUE_TYPE1__DESCRIPTION:
				return getDescription();
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
			case MspdiPackage.VALUE_TYPE1__VALUE_ID:
				setValueID((BigInteger)newValue);
				return;
			case MspdiPackage.VALUE_TYPE1__FIELD_GUID:
				setFieldGUID((String)newValue);
				return;
			case MspdiPackage.VALUE_TYPE1__TYPE:
				setType((TypeType7)newValue);
				return;
			case MspdiPackage.VALUE_TYPE1__PARENT_VALUE_ID:
				setParentValueID((BigInteger)newValue);
				return;
			case MspdiPackage.VALUE_TYPE1__VALUE:
				setValue((String)newValue);
				return;
			case MspdiPackage.VALUE_TYPE1__DESCRIPTION:
				setDescription((String)newValue);
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
			case MspdiPackage.VALUE_TYPE1__VALUE_ID:
				setValueID(VALUE_ID_EDEFAULT);
				return;
			case MspdiPackage.VALUE_TYPE1__FIELD_GUID:
				setFieldGUID(FIELD_GUID_EDEFAULT);
				return;
			case MspdiPackage.VALUE_TYPE1__TYPE:
				unsetType();
				return;
			case MspdiPackage.VALUE_TYPE1__PARENT_VALUE_ID:
				setParentValueID(PARENT_VALUE_ID_EDEFAULT);
				return;
			case MspdiPackage.VALUE_TYPE1__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MspdiPackage.VALUE_TYPE1__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case MspdiPackage.VALUE_TYPE1__VALUE_ID:
				return VALUE_ID_EDEFAULT == null ? valueID != null : !VALUE_ID_EDEFAULT.equals(valueID);
			case MspdiPackage.VALUE_TYPE1__FIELD_GUID:
				return FIELD_GUID_EDEFAULT == null ? fieldGUID != null : !FIELD_GUID_EDEFAULT.equals(fieldGUID);
			case MspdiPackage.VALUE_TYPE1__TYPE:
				return isSetType();
			case MspdiPackage.VALUE_TYPE1__PARENT_VALUE_ID:
				return PARENT_VALUE_ID_EDEFAULT == null ? parentValueID != null : !PARENT_VALUE_ID_EDEFAULT.equals(parentValueID);
			case MspdiPackage.VALUE_TYPE1__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MspdiPackage.VALUE_TYPE1__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (valueID: ");
		result.append(valueID);
		result.append(", fieldGUID: ");
		result.append(fieldGUID);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", parentValueID: ");
		result.append(parentValueID);
		result.append(", value: ");
		result.append(value);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ValueType1Impl
