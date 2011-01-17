/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.OutlineCodeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outline Code Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeTypeImpl#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeTypeImpl#getValueID <em>Value ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeTypeImpl#getValueGUID <em>Value GUID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutlineCodeTypeImpl extends EObjectImpl implements OutlineCodeType {
	/**
	 * The default value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected String fieldID = FIELD_ID_EDEFAULT;

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
	 * The default value of the '{@link #getValueGUID() <em>Value GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueGUID() <em>Value GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger valueGUID = VALUE_GUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlineCodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.OUTLINE_CODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldID() {
		return fieldID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldID(String newFieldID) {
		String oldFieldID = fieldID;
		fieldID = newFieldID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE__FIELD_ID, oldFieldID, fieldID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE__VALUE_ID, oldValueID, valueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValueGUID() {
		return valueGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueGUID(BigInteger newValueGUID) {
		BigInteger oldValueGUID = valueGUID;
		valueGUID = newValueGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE__VALUE_GUID, oldValueGUID, valueGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.OUTLINE_CODE_TYPE__FIELD_ID:
				return getFieldID();
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_ID:
				return getValueID();
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_GUID:
				return getValueGUID();
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
			case MspdiPackage.OUTLINE_CODE_TYPE__FIELD_ID:
				setFieldID((String)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_ID:
				setValueID((BigInteger)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_GUID:
				setValueGUID((BigInteger)newValue);
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
			case MspdiPackage.OUTLINE_CODE_TYPE__FIELD_ID:
				setFieldID(FIELD_ID_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_ID:
				setValueID(VALUE_ID_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_GUID:
				setValueGUID(VALUE_GUID_EDEFAULT);
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
			case MspdiPackage.OUTLINE_CODE_TYPE__FIELD_ID:
				return FIELD_ID_EDEFAULT == null ? fieldID != null : !FIELD_ID_EDEFAULT.equals(fieldID);
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_ID:
				return VALUE_ID_EDEFAULT == null ? valueID != null : !VALUE_ID_EDEFAULT.equals(valueID);
			case MspdiPackage.OUTLINE_CODE_TYPE__VALUE_GUID:
				return VALUE_GUID_EDEFAULT == null ? valueGUID != null : !VALUE_GUID_EDEFAULT.equals(valueGUID);
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
		result.append(" (fieldID: ");
		result.append(fieldID);
		result.append(", valueID: ");
		result.append(valueID);
		result.append(", valueGUID: ");
		result.append(valueGUID);
		result.append(')');
		return result.toString();
	}

} //OutlineCodeTypeImpl
