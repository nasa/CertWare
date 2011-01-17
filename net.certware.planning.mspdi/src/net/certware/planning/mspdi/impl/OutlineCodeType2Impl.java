/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.MasksType;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.OutlineCodeType2;
import net.certware.planning.mspdi.ValuesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outline Code Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getGuid <em>Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getPhoneticAlias <em>Phonetic Alias</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getValues <em>Values</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#isEnterprise <em>Enterprise</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getEnterpriseOutlineCodeAlias <em>Enterprise Outline Code Alias</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#isResourceSubstitutionEnabled <em>Resource Substitution Enabled</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#isLeafOnly <em>Leaf Only</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#isAllLevelsRequired <em>All Levels Required</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#isOnlyTableValuesAllowed <em>Only Table Values Allowed</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodeType2Impl#getMasks <em>Masks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutlineCodeType2Impl extends EObjectImpl implements OutlineCodeType2 {
	/**
	 * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuid()
	 * @generated
	 * @ordered
	 */
	protected String guid = GUID_EDEFAULT;

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
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected String fieldName = FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneticAlias() <em>Phonetic Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneticAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONETIC_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneticAlias() <em>Phonetic Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneticAlias()
	 * @generated
	 * @ordered
	 */
	protected String phoneticAlias = PHONETIC_ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected ValuesType values;

	/**
	 * The default value of the '{@link #isEnterprise() <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnterprise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTERPRISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnterprise() <em>Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnterprise()
	 * @generated
	 * @ordered
	 */
	protected boolean enterprise = ENTERPRISE_EDEFAULT;

	/**
	 * This is true if the Enterprise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enterpriseESet;

	/**
	 * The default value of the '{@link #getEnterpriseOutlineCodeAlias() <em>Enterprise Outline Code Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseOutlineCodeAlias()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ENTERPRISE_OUTLINE_CODE_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnterpriseOutlineCodeAlias() <em>Enterprise Outline Code Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseOutlineCodeAlias()
	 * @generated
	 * @ordered
	 */
	protected BigInteger enterpriseOutlineCodeAlias = ENTERPRISE_OUTLINE_CODE_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isResourceSubstitutionEnabled() <em>Resource Substitution Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResourceSubstitutionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCE_SUBSTITUTION_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResourceSubstitutionEnabled() <em>Resource Substitution Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResourceSubstitutionEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean resourceSubstitutionEnabled = RESOURCE_SUBSTITUTION_ENABLED_EDEFAULT;

	/**
	 * This is true if the Resource Substitution Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resourceSubstitutionEnabledESet;

	/**
	 * The default value of the '{@link #isLeafOnly() <em>Leaf Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeafOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEAF_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeafOnly() <em>Leaf Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeafOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean leafOnly = LEAF_ONLY_EDEFAULT;

	/**
	 * This is true if the Leaf Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leafOnlyESet;

	/**
	 * The default value of the '{@link #isAllLevelsRequired() <em>All Levels Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllLevelsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_LEVELS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllLevelsRequired() <em>All Levels Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllLevelsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean allLevelsRequired = ALL_LEVELS_REQUIRED_EDEFAULT;

	/**
	 * This is true if the All Levels Required attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allLevelsRequiredESet;

	/**
	 * The default value of the '{@link #isOnlyTableValuesAllowed() <em>Only Table Values Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyTableValuesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_TABLE_VALUES_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyTableValuesAllowed() <em>Only Table Values Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyTableValuesAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyTableValuesAllowed = ONLY_TABLE_VALUES_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Only Table Values Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onlyTableValuesAllowedESet;

	/**
	 * The cached value of the '{@link #getMasks() <em>Masks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasks()
	 * @generated
	 * @ordered
	 */
	protected MasksType masks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlineCodeType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.OUTLINE_CODE_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuid(String newGuid) {
		String oldGuid = guid;
		guid = newGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__GUID, oldGuid, guid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_ID, oldFieldID, fieldID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		String oldFieldName = fieldName;
		fieldName = newFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_NAME, oldFieldName, fieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneticAlias() {
		return phoneticAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneticAlias(String newPhoneticAlias) {
		String oldPhoneticAlias = phoneticAlias;
		phoneticAlias = newPhoneticAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__PHONETIC_ALIAS, oldPhoneticAlias, phoneticAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesType getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValues(ValuesType newValues, NotificationChain msgs) {
		ValuesType oldValues = values;
		values = newValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__VALUES, oldValues, newValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(ValuesType newValues) {
		if (newValues != values) {
			NotificationChain msgs = null;
			if (values != null)
				msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.OUTLINE_CODE_TYPE2__VALUES, null, msgs);
			if (newValues != null)
				msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.OUTLINE_CODE_TYPE2__VALUES, null, msgs);
			msgs = basicSetValues(newValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__VALUES, newValues, newValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnterprise() {
		return enterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterprise(boolean newEnterprise) {
		boolean oldEnterprise = enterprise;
		enterprise = newEnterprise;
		boolean oldEnterpriseESet = enterpriseESet;
		enterpriseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE, oldEnterprise, enterprise, !oldEnterpriseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnterprise() {
		boolean oldEnterprise = enterprise;
		boolean oldEnterpriseESet = enterpriseESet;
		enterprise = ENTERPRISE_EDEFAULT;
		enterpriseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE, oldEnterprise, ENTERPRISE_EDEFAULT, oldEnterpriseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnterprise() {
		return enterpriseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEnterpriseOutlineCodeAlias() {
		return enterpriseOutlineCodeAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterpriseOutlineCodeAlias(BigInteger newEnterpriseOutlineCodeAlias) {
		BigInteger oldEnterpriseOutlineCodeAlias = enterpriseOutlineCodeAlias;
		enterpriseOutlineCodeAlias = newEnterpriseOutlineCodeAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS, oldEnterpriseOutlineCodeAlias, enterpriseOutlineCodeAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResourceSubstitutionEnabled() {
		return resourceSubstitutionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSubstitutionEnabled(boolean newResourceSubstitutionEnabled) {
		boolean oldResourceSubstitutionEnabled = resourceSubstitutionEnabled;
		resourceSubstitutionEnabled = newResourceSubstitutionEnabled;
		boolean oldResourceSubstitutionEnabledESet = resourceSubstitutionEnabledESet;
		resourceSubstitutionEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED, oldResourceSubstitutionEnabled, resourceSubstitutionEnabled, !oldResourceSubstitutionEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceSubstitutionEnabled() {
		boolean oldResourceSubstitutionEnabled = resourceSubstitutionEnabled;
		boolean oldResourceSubstitutionEnabledESet = resourceSubstitutionEnabledESet;
		resourceSubstitutionEnabled = RESOURCE_SUBSTITUTION_ENABLED_EDEFAULT;
		resourceSubstitutionEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED, oldResourceSubstitutionEnabled, RESOURCE_SUBSTITUTION_ENABLED_EDEFAULT, oldResourceSubstitutionEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceSubstitutionEnabled() {
		return resourceSubstitutionEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeafOnly() {
		return leafOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeafOnly(boolean newLeafOnly) {
		boolean oldLeafOnly = leafOnly;
		leafOnly = newLeafOnly;
		boolean oldLeafOnlyESet = leafOnlyESet;
		leafOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__LEAF_ONLY, oldLeafOnly, leafOnly, !oldLeafOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLeafOnly() {
		boolean oldLeafOnly = leafOnly;
		boolean oldLeafOnlyESet = leafOnlyESet;
		leafOnly = LEAF_ONLY_EDEFAULT;
		leafOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.OUTLINE_CODE_TYPE2__LEAF_ONLY, oldLeafOnly, LEAF_ONLY_EDEFAULT, oldLeafOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLeafOnly() {
		return leafOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllLevelsRequired() {
		return allLevelsRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllLevelsRequired(boolean newAllLevelsRequired) {
		boolean oldAllLevelsRequired = allLevelsRequired;
		allLevelsRequired = newAllLevelsRequired;
		boolean oldAllLevelsRequiredESet = allLevelsRequiredESet;
		allLevelsRequiredESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED, oldAllLevelsRequired, allLevelsRequired, !oldAllLevelsRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllLevelsRequired() {
		boolean oldAllLevelsRequired = allLevelsRequired;
		boolean oldAllLevelsRequiredESet = allLevelsRequiredESet;
		allLevelsRequired = ALL_LEVELS_REQUIRED_EDEFAULT;
		allLevelsRequiredESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED, oldAllLevelsRequired, ALL_LEVELS_REQUIRED_EDEFAULT, oldAllLevelsRequiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllLevelsRequired() {
		return allLevelsRequiredESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyTableValuesAllowed() {
		return onlyTableValuesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyTableValuesAllowed(boolean newOnlyTableValuesAllowed) {
		boolean oldOnlyTableValuesAllowed = onlyTableValuesAllowed;
		onlyTableValuesAllowed = newOnlyTableValuesAllowed;
		boolean oldOnlyTableValuesAllowedESet = onlyTableValuesAllowedESet;
		onlyTableValuesAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED, oldOnlyTableValuesAllowed, onlyTableValuesAllowed, !oldOnlyTableValuesAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnlyTableValuesAllowed() {
		boolean oldOnlyTableValuesAllowed = onlyTableValuesAllowed;
		boolean oldOnlyTableValuesAllowedESet = onlyTableValuesAllowedESet;
		onlyTableValuesAllowed = ONLY_TABLE_VALUES_ALLOWED_EDEFAULT;
		onlyTableValuesAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED, oldOnlyTableValuesAllowed, ONLY_TABLE_VALUES_ALLOWED_EDEFAULT, oldOnlyTableValuesAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnlyTableValuesAllowed() {
		return onlyTableValuesAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasksType getMasks() {
		return masks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasks(MasksType newMasks, NotificationChain msgs) {
		MasksType oldMasks = masks;
		masks = newMasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__MASKS, oldMasks, newMasks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasks(MasksType newMasks) {
		if (newMasks != masks) {
			NotificationChain msgs = null;
			if (masks != null)
				msgs = ((InternalEObject)masks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.OUTLINE_CODE_TYPE2__MASKS, null, msgs);
			if (newMasks != null)
				msgs = ((InternalEObject)newMasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.OUTLINE_CODE_TYPE2__MASKS, null, msgs);
			msgs = basicSetMasks(newMasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.OUTLINE_CODE_TYPE2__MASKS, newMasks, newMasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.OUTLINE_CODE_TYPE2__VALUES:
				return basicSetValues(null, msgs);
			case MspdiPackage.OUTLINE_CODE_TYPE2__MASKS:
				return basicSetMasks(null, msgs);
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
			case MspdiPackage.OUTLINE_CODE_TYPE2__GUID:
				return getGuid();
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_ID:
				return getFieldID();
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_NAME:
				return getFieldName();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALIAS:
				return getAlias();
			case MspdiPackage.OUTLINE_CODE_TYPE2__PHONETIC_ALIAS:
				return getPhoneticAlias();
			case MspdiPackage.OUTLINE_CODE_TYPE2__VALUES:
				return getValues();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE:
				return isEnterprise();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS:
				return getEnterpriseOutlineCodeAlias();
			case MspdiPackage.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED:
				return isResourceSubstitutionEnabled();
			case MspdiPackage.OUTLINE_CODE_TYPE2__LEAF_ONLY:
				return isLeafOnly();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED:
				return isAllLevelsRequired();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED:
				return isOnlyTableValuesAllowed();
			case MspdiPackage.OUTLINE_CODE_TYPE2__MASKS:
				return getMasks();
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
			case MspdiPackage.OUTLINE_CODE_TYPE2__GUID:
				setGuid((String)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_ID:
				setFieldID((String)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALIAS:
				setAlias((String)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__PHONETIC_ALIAS:
				setPhoneticAlias((String)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__VALUES:
				setValues((ValuesType)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE:
				setEnterprise((Boolean)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS:
				setEnterpriseOutlineCodeAlias((BigInteger)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED:
				setResourceSubstitutionEnabled((Boolean)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__LEAF_ONLY:
				setLeafOnly((Boolean)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED:
				setAllLevelsRequired((Boolean)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED:
				setOnlyTableValuesAllowed((Boolean)newValue);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__MASKS:
				setMasks((MasksType)newValue);
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
			case MspdiPackage.OUTLINE_CODE_TYPE2__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_ID:
				setFieldID(FIELD_ID_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__PHONETIC_ALIAS:
				setPhoneticAlias(PHONETIC_ALIAS_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__VALUES:
				setValues((ValuesType)null);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE:
				unsetEnterprise();
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS:
				setEnterpriseOutlineCodeAlias(ENTERPRISE_OUTLINE_CODE_ALIAS_EDEFAULT);
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED:
				unsetResourceSubstitutionEnabled();
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__LEAF_ONLY:
				unsetLeafOnly();
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED:
				unsetAllLevelsRequired();
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED:
				unsetOnlyTableValuesAllowed();
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__MASKS:
				setMasks((MasksType)null);
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
			case MspdiPackage.OUTLINE_CODE_TYPE2__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_ID:
				return FIELD_ID_EDEFAULT == null ? fieldID != null : !FIELD_ID_EDEFAULT.equals(fieldID);
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case MspdiPackage.OUTLINE_CODE_TYPE2__PHONETIC_ALIAS:
				return PHONETIC_ALIAS_EDEFAULT == null ? phoneticAlias != null : !PHONETIC_ALIAS_EDEFAULT.equals(phoneticAlias);
			case MspdiPackage.OUTLINE_CODE_TYPE2__VALUES:
				return values != null;
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE:
				return isSetEnterprise();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS:
				return ENTERPRISE_OUTLINE_CODE_ALIAS_EDEFAULT == null ? enterpriseOutlineCodeAlias != null : !ENTERPRISE_OUTLINE_CODE_ALIAS_EDEFAULT.equals(enterpriseOutlineCodeAlias);
			case MspdiPackage.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED:
				return isSetResourceSubstitutionEnabled();
			case MspdiPackage.OUTLINE_CODE_TYPE2__LEAF_ONLY:
				return isSetLeafOnly();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED:
				return isSetAllLevelsRequired();
			case MspdiPackage.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED:
				return isSetOnlyTableValuesAllowed();
			case MspdiPackage.OUTLINE_CODE_TYPE2__MASKS:
				return masks != null;
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
		result.append(" (guid: ");
		result.append(guid);
		result.append(", fieldID: ");
		result.append(fieldID);
		result.append(", fieldName: ");
		result.append(fieldName);
		result.append(", alias: ");
		result.append(alias);
		result.append(", phoneticAlias: ");
		result.append(phoneticAlias);
		result.append(", enterprise: ");
		if (enterpriseESet) result.append(enterprise); else result.append("<unset>");
		result.append(", enterpriseOutlineCodeAlias: ");
		result.append(enterpriseOutlineCodeAlias);
		result.append(", resourceSubstitutionEnabled: ");
		if (resourceSubstitutionEnabledESet) result.append(resourceSubstitutionEnabled); else result.append("<unset>");
		result.append(", leafOnly: ");
		if (leafOnlyESet) result.append(leafOnly); else result.append("<unset>");
		result.append(", allLevelsRequired: ");
		if (allLevelsRequiredESet) result.append(allLevelsRequired); else result.append("<unset>");
		result.append(", onlyTableValuesAllowed: ");
		if (onlyTableValuesAllowedESet) result.append(onlyTableValuesAllowed); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutlineCodeType2Impl
