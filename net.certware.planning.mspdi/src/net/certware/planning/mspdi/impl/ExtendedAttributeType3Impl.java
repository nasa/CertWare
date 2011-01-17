/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.CFTypeType;
import net.certware.planning.mspdi.CalculationTypeType;
import net.certware.planning.mspdi.ElemTypeType;
import net.certware.planning.mspdi.ExtendedAttributeType3;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.RollupTypeType;
import net.certware.planning.mspdi.ValueListType;
import net.certware.planning.mspdi.ValuelistSortOrderType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Attribute Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getCFType <em>CF Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getGuid <em>Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getElemType <em>Elem Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getMaxMultiValues <em>Max Multi Values</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#isUserDef <em>User Def</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getSecondaryPID <em>Secondary PID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#isAutoRollDown <em>Auto Roll Down</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getDefaultGuid <em>Default Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getLtuid <em>Ltuid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getPhoneticAlias <em>Phonetic Alias</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getRollupType <em>Rollup Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getCalculationType <em>Calculation Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getFormula <em>Formula</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#isRestrictValues <em>Restrict Values</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getValuelistSortOrder <em>Valuelist Sort Order</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#isAppendNewValues <em>Append New Values</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeType3Impl#getValueList <em>Value List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedAttributeType3Impl extends EObjectImpl implements ExtendedAttributeType3 {
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
	 * The default value of the '{@link #getCFType() <em>CF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFType()
	 * @generated
	 * @ordered
	 */
	protected static final CFTypeType CF_TYPE_EDEFAULT = CFTypeType._0;

	/**
	 * The cached value of the '{@link #getCFType() <em>CF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFType()
	 * @generated
	 * @ordered
	 */
	protected CFTypeType cFType = CF_TYPE_EDEFAULT;

	/**
	 * This is true if the CF Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cFTypeESet;

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
	 * The default value of the '{@link #getElemType() <em>Elem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemType()
	 * @generated
	 * @ordered
	 */
	protected static final ElemTypeType ELEM_TYPE_EDEFAULT = ElemTypeType._20;

	/**
	 * The cached value of the '{@link #getElemType() <em>Elem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemType()
	 * @generated
	 * @ordered
	 */
	protected ElemTypeType elemType = ELEM_TYPE_EDEFAULT;

	/**
	 * This is true if the Elem Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elemTypeESet;

	/**
	 * The default value of the '{@link #getMaxMultiValues() <em>Max Multi Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiValues()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_MULTI_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMultiValues() <em>Max Multi Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiValues()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxMultiValues = MAX_MULTI_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserDef() <em>User Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDef()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_DEF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserDef() <em>User Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDef()
	 * @generated
	 * @ordered
	 */
	protected boolean userDef = USER_DEF_EDEFAULT;

	/**
	 * This is true if the User Def attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefESet;

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
	 * The default value of the '{@link #getSecondaryPID() <em>Secondary PID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryPID()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDARY_PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondaryPID() <em>Secondary PID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryPID()
	 * @generated
	 * @ordered
	 */
	protected String secondaryPID = SECONDARY_PID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoRollDown() <em>Auto Roll Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRollDown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_ROLL_DOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoRollDown() <em>Auto Roll Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRollDown()
	 * @generated
	 * @ordered
	 */
	protected boolean autoRollDown = AUTO_ROLL_DOWN_EDEFAULT;

	/**
	 * This is true if the Auto Roll Down attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoRollDownESet;

	/**
	 * The default value of the '{@link #getDefaultGuid() <em>Default Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultGuid() <em>Default Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGuid()
	 * @generated
	 * @ordered
	 */
	protected String defaultGuid = DEFAULT_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLtuid() <em>Ltuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtuid()
	 * @generated
	 * @ordered
	 */
	protected static final String LTUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLtuid() <em>Ltuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtuid()
	 * @generated
	 * @ordered
	 */
	protected String ltuid = LTUID_EDEFAULT;

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
	 * The default value of the '{@link #getRollupType() <em>Rollup Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollupType()
	 * @generated
	 * @ordered
	 */
	protected static final RollupTypeType ROLLUP_TYPE_EDEFAULT = RollupTypeType._0;

	/**
	 * The cached value of the '{@link #getRollupType() <em>Rollup Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollupType()
	 * @generated
	 * @ordered
	 */
	protected RollupTypeType rollupType = ROLLUP_TYPE_EDEFAULT;

	/**
	 * This is true if the Rollup Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rollupTypeESet;

	/**
	 * The default value of the '{@link #getCalculationType() <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationType()
	 * @generated
	 * @ordered
	 */
	protected static final CalculationTypeType CALCULATION_TYPE_EDEFAULT = CalculationTypeType._0;

	/**
	 * The cached value of the '{@link #getCalculationType() <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationType()
	 * @generated
	 * @ordered
	 */
	protected CalculationTypeType calculationType = CALCULATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Calculation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calculationTypeESet;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

	/**
	 * The default value of the '{@link #isRestrictValues() <em>Restrict Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRestrictValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESTRICT_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRestrictValues() <em>Restrict Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRestrictValues()
	 * @generated
	 * @ordered
	 */
	protected boolean restrictValues = RESTRICT_VALUES_EDEFAULT;

	/**
	 * This is true if the Restrict Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restrictValuesESet;

	/**
	 * The default value of the '{@link #getValuelistSortOrder() <em>Valuelist Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuelistSortOrder()
	 * @generated
	 * @ordered
	 */
	protected static final ValuelistSortOrderType VALUELIST_SORT_ORDER_EDEFAULT = ValuelistSortOrderType._0;

	/**
	 * The cached value of the '{@link #getValuelistSortOrder() <em>Valuelist Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuelistSortOrder()
	 * @generated
	 * @ordered
	 */
	protected ValuelistSortOrderType valuelistSortOrder = VALUELIST_SORT_ORDER_EDEFAULT;

	/**
	 * This is true if the Valuelist Sort Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valuelistSortOrderESet;

	/**
	 * The default value of the '{@link #isAppendNewValues() <em>Append New Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppendNewValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPEND_NEW_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAppendNewValues() <em>Append New Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppendNewValues()
	 * @generated
	 * @ordered
	 */
	protected boolean appendNewValues = APPEND_NEW_VALUES_EDEFAULT;

	/**
	 * This is true if the Append New Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appendNewValuesESet;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueList() <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueList()
	 * @generated
	 * @ordered
	 */
	protected ValueListType valueList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedAttributeType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID, oldFieldID, fieldID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME, oldFieldName, fieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFTypeType getCFType() {
		return cFType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFType(CFTypeType newCFType) {
		CFTypeType oldCFType = cFType;
		cFType = newCFType == null ? CF_TYPE_EDEFAULT : newCFType;
		boolean oldCFTypeESet = cFTypeESet;
		cFTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE, oldCFType, cFType, !oldCFTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCFType() {
		CFTypeType oldCFType = cFType;
		boolean oldCFTypeESet = cFTypeESet;
		cFType = CF_TYPE_EDEFAULT;
		cFTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE, oldCFType, CF_TYPE_EDEFAULT, oldCFTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCFType() {
		return cFTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__GUID, oldGuid, guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemTypeType getElemType() {
		return elemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemType(ElemTypeType newElemType) {
		ElemTypeType oldElemType = elemType;
		elemType = newElemType == null ? ELEM_TYPE_EDEFAULT : newElemType;
		boolean oldElemTypeESet = elemTypeESet;
		elemTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE, oldElemType, elemType, !oldElemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElemType() {
		ElemTypeType oldElemType = elemType;
		boolean oldElemTypeESet = elemTypeESet;
		elemType = ELEM_TYPE_EDEFAULT;
		elemTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE, oldElemType, ELEM_TYPE_EDEFAULT, oldElemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElemType() {
		return elemTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxMultiValues() {
		return maxMultiValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMultiValues(BigInteger newMaxMultiValues) {
		BigInteger oldMaxMultiValues = maxMultiValues;
		maxMultiValues = newMaxMultiValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES, oldMaxMultiValues, maxMultiValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserDef() {
		return userDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDef(boolean newUserDef) {
		boolean oldUserDef = userDef;
		userDef = newUserDef;
		boolean oldUserDefESet = userDefESet;
		userDefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF, oldUserDef, userDef, !oldUserDefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDef() {
		boolean oldUserDef = userDef;
		boolean oldUserDefESet = userDefESet;
		userDef = USER_DEF_EDEFAULT;
		userDefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF, oldUserDef, USER_DEF_EDEFAULT, oldUserDefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDef() {
		return userDefESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondaryPID() {
		return secondaryPID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryPID(String newSecondaryPID) {
		String oldSecondaryPID = secondaryPID;
		secondaryPID = newSecondaryPID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID, oldSecondaryPID, secondaryPID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoRollDown() {
		return autoRollDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoRollDown(boolean newAutoRollDown) {
		boolean oldAutoRollDown = autoRollDown;
		autoRollDown = newAutoRollDown;
		boolean oldAutoRollDownESet = autoRollDownESet;
		autoRollDownESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN, oldAutoRollDown, autoRollDown, !oldAutoRollDownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoRollDown() {
		boolean oldAutoRollDown = autoRollDown;
		boolean oldAutoRollDownESet = autoRollDownESet;
		autoRollDown = AUTO_ROLL_DOWN_EDEFAULT;
		autoRollDownESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN, oldAutoRollDown, AUTO_ROLL_DOWN_EDEFAULT, oldAutoRollDownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoRollDown() {
		return autoRollDownESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultGuid() {
		return defaultGuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultGuid(String newDefaultGuid) {
		String oldDefaultGuid = defaultGuid;
		defaultGuid = newDefaultGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID, oldDefaultGuid, defaultGuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLtuid() {
		return ltuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLtuid(String newLtuid) {
		String oldLtuid = ltuid;
		ltuid = newLtuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__LTUID, oldLtuid, ltuid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS, oldPhoneticAlias, phoneticAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollupTypeType getRollupType() {
		return rollupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollupType(RollupTypeType newRollupType) {
		RollupTypeType oldRollupType = rollupType;
		rollupType = newRollupType == null ? ROLLUP_TYPE_EDEFAULT : newRollupType;
		boolean oldRollupTypeESet = rollupTypeESet;
		rollupTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE, oldRollupType, rollupType, !oldRollupTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRollupType() {
		RollupTypeType oldRollupType = rollupType;
		boolean oldRollupTypeESet = rollupTypeESet;
		rollupType = ROLLUP_TYPE_EDEFAULT;
		rollupTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE, oldRollupType, ROLLUP_TYPE_EDEFAULT, oldRollupTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRollupType() {
		return rollupTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationTypeType getCalculationType() {
		return calculationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationType(CalculationTypeType newCalculationType) {
		CalculationTypeType oldCalculationType = calculationType;
		calculationType = newCalculationType == null ? CALCULATION_TYPE_EDEFAULT : newCalculationType;
		boolean oldCalculationTypeESet = calculationTypeESet;
		calculationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE, oldCalculationType, calculationType, !oldCalculationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCalculationType() {
		CalculationTypeType oldCalculationType = calculationType;
		boolean oldCalculationTypeESet = calculationTypeESet;
		calculationType = CALCULATION_TYPE_EDEFAULT;
		calculationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE, oldCalculationType, CALCULATION_TYPE_EDEFAULT, oldCalculationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalculationType() {
		return calculationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FORMULA, oldFormula, formula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRestrictValues() {
		return restrictValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictValues(boolean newRestrictValues) {
		boolean oldRestrictValues = restrictValues;
		restrictValues = newRestrictValues;
		boolean oldRestrictValuesESet = restrictValuesESet;
		restrictValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES, oldRestrictValues, restrictValues, !oldRestrictValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRestrictValues() {
		boolean oldRestrictValues = restrictValues;
		boolean oldRestrictValuesESet = restrictValuesESet;
		restrictValues = RESTRICT_VALUES_EDEFAULT;
		restrictValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES, oldRestrictValues, RESTRICT_VALUES_EDEFAULT, oldRestrictValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRestrictValues() {
		return restrictValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuelistSortOrderType getValuelistSortOrder() {
		return valuelistSortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuelistSortOrder(ValuelistSortOrderType newValuelistSortOrder) {
		ValuelistSortOrderType oldValuelistSortOrder = valuelistSortOrder;
		valuelistSortOrder = newValuelistSortOrder == null ? VALUELIST_SORT_ORDER_EDEFAULT : newValuelistSortOrder;
		boolean oldValuelistSortOrderESet = valuelistSortOrderESet;
		valuelistSortOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER, oldValuelistSortOrder, valuelistSortOrder, !oldValuelistSortOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValuelistSortOrder() {
		ValuelistSortOrderType oldValuelistSortOrder = valuelistSortOrder;
		boolean oldValuelistSortOrderESet = valuelistSortOrderESet;
		valuelistSortOrder = VALUELIST_SORT_ORDER_EDEFAULT;
		valuelistSortOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER, oldValuelistSortOrder, VALUELIST_SORT_ORDER_EDEFAULT, oldValuelistSortOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValuelistSortOrder() {
		return valuelistSortOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppendNewValues() {
		return appendNewValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppendNewValues(boolean newAppendNewValues) {
		boolean oldAppendNewValues = appendNewValues;
		appendNewValues = newAppendNewValues;
		boolean oldAppendNewValuesESet = appendNewValuesESet;
		appendNewValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES, oldAppendNewValues, appendNewValues, !oldAppendNewValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppendNewValues() {
		boolean oldAppendNewValues = appendNewValues;
		boolean oldAppendNewValuesESet = appendNewValuesESet;
		appendNewValues = APPEND_NEW_VALUES_EDEFAULT;
		appendNewValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES, oldAppendNewValues, APPEND_NEW_VALUES_EDEFAULT, oldAppendNewValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppendNewValues() {
		return appendNewValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListType getValueList() {
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueList(ValueListType newValueList, NotificationChain msgs) {
		ValueListType oldValueList = valueList;
		valueList = newValueList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST, oldValueList, newValueList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueList(ValueListType newValueList) {
		if (newValueList != valueList) {
			NotificationChain msgs = null;
			if (valueList != null)
				msgs = ((InternalEObject)valueList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST, null, msgs);
			if (newValueList != null)
				msgs = ((InternalEObject)newValueList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST, null, msgs);
			msgs = basicSetValueList(newValueList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST, newValueList, newValueList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST:
				return basicSetValueList(null, msgs);
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
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID:
				return getFieldID();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME:
				return getFieldName();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE:
				return getCFType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__GUID:
				return getGuid();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE:
				return getElemType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES:
				return getMaxMultiValues();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF:
				return isUserDef();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ALIAS:
				return getAlias();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID:
				return getSecondaryPID();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN:
				return isAutoRollDown();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID:
				return getDefaultGuid();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__LTUID:
				return getLtuid();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS:
				return getPhoneticAlias();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE:
				return getRollupType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE:
				return getCalculationType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FORMULA:
				return getFormula();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES:
				return isRestrictValues();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER:
				return getValuelistSortOrder();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES:
				return isAppendNewValues();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT:
				return getDefault();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST:
				return getValueList();
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
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID:
				setFieldID((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE:
				setCFType((CFTypeType)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__GUID:
				setGuid((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE:
				setElemType((ElemTypeType)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES:
				setMaxMultiValues((BigInteger)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF:
				setUserDef((Boolean)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ALIAS:
				setAlias((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID:
				setSecondaryPID((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN:
				setAutoRollDown((Boolean)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID:
				setDefaultGuid((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__LTUID:
				setLtuid((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS:
				setPhoneticAlias((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE:
				setRollupType((RollupTypeType)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE:
				setCalculationType((CalculationTypeType)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FORMULA:
				setFormula((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES:
				setRestrictValues((Boolean)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER:
				setValuelistSortOrder((ValuelistSortOrderType)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES:
				setAppendNewValues((Boolean)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT:
				setDefault((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST:
				setValueList((ValueListType)newValue);
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
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID:
				setFieldID(FIELD_ID_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE:
				unsetCFType();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__GUID:
				setGuid(GUID_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE:
				unsetElemType();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES:
				setMaxMultiValues(MAX_MULTI_VALUES_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF:
				unsetUserDef();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID:
				setSecondaryPID(SECONDARY_PID_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN:
				unsetAutoRollDown();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID:
				setDefaultGuid(DEFAULT_GUID_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__LTUID:
				setLtuid(LTUID_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS:
				setPhoneticAlias(PHONETIC_ALIAS_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE:
				unsetRollupType();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE:
				unsetCalculationType();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES:
				unsetRestrictValues();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER:
				unsetValuelistSortOrder();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES:
				unsetAppendNewValues();
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST:
				setValueList((ValueListType)null);
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
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID:
				return FIELD_ID_EDEFAULT == null ? fieldID != null : !FIELD_ID_EDEFAULT.equals(fieldID);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE:
				return isSetCFType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE:
				return isSetElemType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES:
				return MAX_MULTI_VALUES_EDEFAULT == null ? maxMultiValues != null : !MAX_MULTI_VALUES_EDEFAULT.equals(maxMultiValues);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF:
				return isSetUserDef();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID:
				return SECONDARY_PID_EDEFAULT == null ? secondaryPID != null : !SECONDARY_PID_EDEFAULT.equals(secondaryPID);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN:
				return isSetAutoRollDown();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID:
				return DEFAULT_GUID_EDEFAULT == null ? defaultGuid != null : !DEFAULT_GUID_EDEFAULT.equals(defaultGuid);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__LTUID:
				return LTUID_EDEFAULT == null ? ltuid != null : !LTUID_EDEFAULT.equals(ltuid);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS:
				return PHONETIC_ALIAS_EDEFAULT == null ? phoneticAlias != null : !PHONETIC_ALIAS_EDEFAULT.equals(phoneticAlias);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE:
				return isSetRollupType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE:
				return isSetCalculationType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES:
				return isSetRestrictValues();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER:
				return isSetValuelistSortOrder();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES:
				return isSetAppendNewValues();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST:
				return valueList != null;
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
		result.append(", fieldName: ");
		result.append(fieldName);
		result.append(", cFType: ");
		if (cFTypeESet) result.append(cFType); else result.append("<unset>");
		result.append(", guid: ");
		result.append(guid);
		result.append(", elemType: ");
		if (elemTypeESet) result.append(elemType); else result.append("<unset>");
		result.append(", maxMultiValues: ");
		result.append(maxMultiValues);
		result.append(", userDef: ");
		if (userDefESet) result.append(userDef); else result.append("<unset>");
		result.append(", alias: ");
		result.append(alias);
		result.append(", secondaryPID: ");
		result.append(secondaryPID);
		result.append(", autoRollDown: ");
		if (autoRollDownESet) result.append(autoRollDown); else result.append("<unset>");
		result.append(", defaultGuid: ");
		result.append(defaultGuid);
		result.append(", ltuid: ");
		result.append(ltuid);
		result.append(", phoneticAlias: ");
		result.append(phoneticAlias);
		result.append(", rollupType: ");
		if (rollupTypeESet) result.append(rollupType); else result.append("<unset>");
		result.append(", calculationType: ");
		if (calculationTypeESet) result.append(calculationType); else result.append("<unset>");
		result.append(", formula: ");
		result.append(formula);
		result.append(", restrictValues: ");
		if (restrictValuesESet) result.append(restrictValues); else result.append("<unset>");
		result.append(", valuelistSortOrder: ");
		if (valuelistSortOrderESet) result.append(valuelistSortOrder); else result.append("<unset>");
		result.append(", appendNewValues: ");
		if (appendNewValuesESet) result.append(appendNewValues); else result.append("<unset>");
		result.append(", default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //ExtendedAttributeType3Impl
