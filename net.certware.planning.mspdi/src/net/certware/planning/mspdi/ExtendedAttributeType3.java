/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Attribute Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCFType <em>CF Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getGuid <em>Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getElemType <em>Elem Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getMaxMultiValues <em>Max Multi Values</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#isUserDef <em>User Def</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getSecondaryPID <em>Secondary PID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAutoRollDown <em>Auto Roll Down</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getDefaultGuid <em>Default Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getLtuid <em>Ltuid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getPhoneticAlias <em>Phonetic Alias</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getRollupType <em>Rollup Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCalculationType <em>Calculation Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFormula <em>Formula</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#isRestrictValues <em>Restrict Values</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValuelistSortOrder <em>Valuelist Sort Order</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAppendNewValues <em>Append New Values</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getDefault <em>Default</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValueList <em>Value List</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3()
 * @model extendedMetaData="name='ExtendedAttribute_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtendedAttributeType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This corresponds to the PID of the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field ID</em>' attribute.
	 * @see #setFieldID(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_FieldID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FieldID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFieldID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFieldID <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field ID</em>' attribute.
	 * @see #getFieldID()
	 * @generated
	 */
	void setFieldID(String value);

	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_FieldName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FieldName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>CF Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.CFTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The custom field type. Values are: 0=Cost, 1=Date, 2=Duration, 3=Finish, 4=Flag, 5=Number, 6=Start, 7=Text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CF Type</em>' attribute.
	 * @see net.certware.planning.mspdi.CFTypeType
	 * @see #isSetCFType()
	 * @see #unsetCFType()
	 * @see #setCFType(CFTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_CFType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CFType' namespace='##targetNamespace'"
	 * @generated
	 */
	CFTypeType getCFType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCFType <em>CF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CF Type</em>' attribute.
	 * @see net.certware.planning.mspdi.CFTypeType
	 * @see #isSetCFType()
	 * @see #unsetCFType()
	 * @see #getCFType()
	 * @generated
	 */
	void setCFType(CFTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCFType <em>CF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCFType()
	 * @see #getCFType()
	 * @see #setCFType(CFTypeType)
	 * @generated
	 */
	void unsetCFType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCFType <em>CF Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CF Type</em>' attribute is set.
	 * @see #unsetCFType()
	 * @see #getCFType()
	 * @see #setCFType(CFTypeType)
	 * @generated
	 */
	boolean isSetCFType();

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_Guid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Guid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(String value);

	/**
	 * Returns the value of the '<em><b>Elem Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.ElemTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the extended attribute is associated with a task, a resource, or an assignment. Values are: 20=Task, 21=Resource, 22=Calendar, 23=Assignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elem Type</em>' attribute.
	 * @see net.certware.planning.mspdi.ElemTypeType
	 * @see #isSetElemType()
	 * @see #unsetElemType()
	 * @see #setElemType(ElemTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_ElemType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ElemType' namespace='##targetNamespace'"
	 * @generated
	 */
	ElemTypeType getElemType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getElemType <em>Elem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elem Type</em>' attribute.
	 * @see net.certware.planning.mspdi.ElemTypeType
	 * @see #isSetElemType()
	 * @see #unsetElemType()
	 * @see #getElemType()
	 * @generated
	 */
	void setElemType(ElemTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getElemType <em>Elem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElemType()
	 * @see #getElemType()
	 * @see #setElemType(ElemTypeType)
	 * @generated
	 */
	void unsetElemType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getElemType <em>Elem Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elem Type</em>' attribute is set.
	 * @see #unsetElemType()
	 * @see #getElemType()
	 * @see #setElemType(ElemTypeType)
	 * @generated
	 */
	boolean isSetElemType();

	/**
	 * Returns the value of the '<em><b>Max Multi Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of values you can set in a picklist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Multi Values</em>' attribute.
	 * @see #setMaxMultiValues(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_MaxMultiValues()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='MaxMultiValues' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxMultiValues();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getMaxMultiValues <em>Max Multi Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Multi Values</em>' attribute.
	 * @see #getMaxMultiValues()
	 * @generated
	 */
	void setMaxMultiValues(BigInteger value);

	/**
	 * Returns the value of the '<em><b>User Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the custom field is user defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Def</em>' attribute.
	 * @see #isSetUserDef()
	 * @see #unsetUserDef()
	 * @see #setUserDef(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_UserDef()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='UserDef' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUserDef();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isUserDef <em>User Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Def</em>' attribute.
	 * @see #isSetUserDef()
	 * @see #unsetUserDef()
	 * @see #isUserDef()
	 * @generated
	 */
	void setUserDef(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isUserDef <em>User Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDef()
	 * @see #isUserDef()
	 * @see #setUserDef(boolean)
	 * @generated
	 */
	void unsetUserDef();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isUserDef <em>User Def</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Def</em>' attribute is set.
	 * @see #unsetUserDef()
	 * @see #isUserDef()
	 * @see #setUserDef(boolean)
	 * @generated
	 */
	boolean isSetUserDef();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The alias of the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_Alias()
	 * @model dataType="net.certware.planning.mspdi.AliasType"
	 *        extendedMetaData="kind='element' name='Alias' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Secondary PID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The secondary PID of the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary PID</em>' attribute.
	 * @see #setSecondaryPID(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_SecondaryPID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SecondaryPID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSecondaryPID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getSecondaryPID <em>Secondary PID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary PID</em>' attribute.
	 * @see #getSecondaryPID()
	 * @generated
	 */
	void setSecondaryPID(String value);

	/**
	 * Returns the value of the '<em><b>Auto Roll Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether automatic rolldown to assignments is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Roll Down</em>' attribute.
	 * @see #isSetAutoRollDown()
	 * @see #unsetAutoRollDown()
	 * @see #setAutoRollDown(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_AutoRollDown()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AutoRollDown' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAutoRollDown();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAutoRollDown <em>Auto Roll Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Roll Down</em>' attribute.
	 * @see #isSetAutoRollDown()
	 * @see #unsetAutoRollDown()
	 * @see #isAutoRollDown()
	 * @generated
	 */
	void setAutoRollDown(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAutoRollDown <em>Auto Roll Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoRollDown()
	 * @see #isAutoRollDown()
	 * @see #setAutoRollDown(boolean)
	 * @generated
	 */
	void unsetAutoRollDown();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAutoRollDown <em>Auto Roll Down</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Roll Down</em>' attribute is set.
	 * @see #unsetAutoRollDown()
	 * @see #isAutoRollDown()
	 * @see #setAutoRollDown(boolean)
	 * @generated
	 */
	boolean isSetAutoRollDown();

	/**
	 * Returns the value of the '<em><b>Default Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the default lookup table entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Guid</em>' attribute.
	 * @see #setDefaultGuid(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_DefaultGuid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DefaultGuid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultGuid();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getDefaultGuid <em>Default Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Guid</em>' attribute.
	 * @see #getDefaultGuid()
	 * @generated
	 */
	void setDefaultGuid(String value);

	/**
	 * Returns the value of the '<em><b>Ltuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the lookup table associated with the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ltuid</em>' attribute.
	 * @see #setLtuid(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_Ltuid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Ltuid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLtuid();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getLtuid <em>Ltuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ltuid</em>' attribute.
	 * @see #getLtuid()
	 * @generated
	 */
	void setLtuid(String value);

	/**
	 * Returns the value of the '<em><b>Phonetic Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The phonetic pronunciation of the alias of the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phonetic Alias</em>' attribute.
	 * @see #setPhoneticAlias(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_PhoneticAlias()
	 * @model dataType="net.certware.planning.mspdi.PhoneticAliasType"
	 *        extendedMetaData="kind='element' name='PhoneticAlias' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhoneticAlias();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getPhoneticAlias <em>Phonetic Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phonetic Alias</em>' attribute.
	 * @see #getPhoneticAlias()
	 * @generated
	 */
	void setPhoneticAlias(String value);

	/**
	 * Returns the value of the '<em><b>Rollup Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.RollupTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way rollups are calculated. Values are: 0=Maximum (OR for flag fields), 1=Minimum (AND for flag fields), 2=Count all, 3=Sum, 4=Average, 5=Average First Sublevel, 6=Count First Sublevel, 7=Count Nonsummaries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rollup Type</em>' attribute.
	 * @see net.certware.planning.mspdi.RollupTypeType
	 * @see #isSetRollupType()
	 * @see #unsetRollupType()
	 * @see #setRollupType(RollupTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_RollupType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RollupType' namespace='##targetNamespace'"
	 * @generated
	 */
	RollupTypeType getRollupType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getRollupType <em>Rollup Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollup Type</em>' attribute.
	 * @see net.certware.planning.mspdi.RollupTypeType
	 * @see #isSetRollupType()
	 * @see #unsetRollupType()
	 * @see #getRollupType()
	 * @generated
	 */
	void setRollupType(RollupTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getRollupType <em>Rollup Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRollupType()
	 * @see #getRollupType()
	 * @see #setRollupType(RollupTypeType)
	 * @generated
	 */
	void unsetRollupType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getRollupType <em>Rollup Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rollup Type</em>' attribute is set.
	 * @see #unsetRollupType()
	 * @see #getRollupType()
	 * @see #setRollupType(RollupTypeType)
	 * @generated
	 */
	boolean isSetRollupType();

	/**
	 * Returns the value of the '<em><b>Calculation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.CalculationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether rollups are calculated for task and group summary rows. Values are: 0=None, 1=Rollup, 2=Calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculation Type</em>' attribute.
	 * @see net.certware.planning.mspdi.CalculationTypeType
	 * @see #isSetCalculationType()
	 * @see #unsetCalculationType()
	 * @see #setCalculationType(CalculationTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_CalculationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CalculationType' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculationTypeType getCalculationType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCalculationType <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Type</em>' attribute.
	 * @see net.certware.planning.mspdi.CalculationTypeType
	 * @see #isSetCalculationType()
	 * @see #unsetCalculationType()
	 * @see #getCalculationType()
	 * @generated
	 */
	void setCalculationType(CalculationTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCalculationType <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalculationType()
	 * @see #getCalculationType()
	 * @see #setCalculationType(CalculationTypeType)
	 * @generated
	 */
	void unsetCalculationType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getCalculationType <em>Calculation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calculation Type</em>' attribute is set.
	 * @see #unsetCalculationType()
	 * @see #getCalculationType()
	 * @see #setCalculationType(CalculationTypeType)
	 * @generated
	 */
	boolean isSetCalculationType();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formula that Microsoft Project uses to populate the custom task field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_Formula()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Formula' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>Restrict Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether only values in the list are allowed in the file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restrict Values</em>' attribute.
	 * @see #isSetRestrictValues()
	 * @see #unsetRestrictValues()
	 * @see #setRestrictValues(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_RestrictValues()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='RestrictValues' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRestrictValues();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isRestrictValues <em>Restrict Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrict Values</em>' attribute.
	 * @see #isSetRestrictValues()
	 * @see #unsetRestrictValues()
	 * @see #isRestrictValues()
	 * @generated
	 */
	void setRestrictValues(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isRestrictValues <em>Restrict Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestrictValues()
	 * @see #isRestrictValues()
	 * @see #setRestrictValues(boolean)
	 * @generated
	 */
	void unsetRestrictValues();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isRestrictValues <em>Restrict Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Restrict Values</em>' attribute is set.
	 * @see #unsetRestrictValues()
	 * @see #isRestrictValues()
	 * @see #setRestrictValues(boolean)
	 * @generated
	 */
	boolean isSetRestrictValues();

	/**
	 * Returns the value of the '<em><b>Valuelist Sort Order</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.ValuelistSortOrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way value lists are sorted. Values are: 0=Descending, 1=Ascending.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valuelist Sort Order</em>' attribute.
	 * @see net.certware.planning.mspdi.ValuelistSortOrderType
	 * @see #isSetValuelistSortOrder()
	 * @see #unsetValuelistSortOrder()
	 * @see #setValuelistSortOrder(ValuelistSortOrderType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_ValuelistSortOrder()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ValuelistSortOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	ValuelistSortOrderType getValuelistSortOrder();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValuelistSortOrder <em>Valuelist Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuelist Sort Order</em>' attribute.
	 * @see net.certware.planning.mspdi.ValuelistSortOrderType
	 * @see #isSetValuelistSortOrder()
	 * @see #unsetValuelistSortOrder()
	 * @see #getValuelistSortOrder()
	 * @generated
	 */
	void setValuelistSortOrder(ValuelistSortOrderType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValuelistSortOrder <em>Valuelist Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValuelistSortOrder()
	 * @see #getValuelistSortOrder()
	 * @see #setValuelistSortOrder(ValuelistSortOrderType)
	 * @generated
	 */
	void unsetValuelistSortOrder();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValuelistSortOrder <em>Valuelist Sort Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valuelist Sort Order</em>' attribute is set.
	 * @see #unsetValuelistSortOrder()
	 * @see #getValuelistSortOrder()
	 * @see #setValuelistSortOrder(ValuelistSortOrderType)
	 * @generated
	 */
	boolean isSetValuelistSortOrder();

	/**
	 * Returns the value of the '<em><b>Append New Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether new values added to the project are automatically added to the list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append New Values</em>' attribute.
	 * @see #isSetAppendNewValues()
	 * @see #unsetAppendNewValues()
	 * @see #setAppendNewValues(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_AppendNewValues()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AppendNewValues' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAppendNewValues();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAppendNewValues <em>Append New Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append New Values</em>' attribute.
	 * @see #isSetAppendNewValues()
	 * @see #unsetAppendNewValues()
	 * @see #isAppendNewValues()
	 * @generated
	 */
	void setAppendNewValues(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAppendNewValues <em>Append New Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppendNewValues()
	 * @see #isAppendNewValues()
	 * @see #setAppendNewValues(boolean)
	 * @generated
	 */
	void unsetAppendNewValues();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#isAppendNewValues <em>Append New Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Append New Values</em>' attribute is set.
	 * @see #unsetAppendNewValues()
	 * @see #isAppendNewValues()
	 * @see #setAppendNewValues(boolean)
	 * @generated
	 */
	boolean isSetAppendNewValues();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default value in the list.  Not present if no default is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_Default()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Default' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Value List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When values of extended attributes are specified as properties of elements in the schema, they may either be specified by values or by references to the values contained in this list.  Applications may assume ordering of the list by ordering specified here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value List</em>' containment reference.
	 * @see #setValueList(ValueListType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType3_ValueList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueList' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueListType getValueList();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType3#getValueList <em>Value List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value List</em>' containment reference.
	 * @see #getValueList()
	 * @generated
	 */
	void setValueList(ValueListType value);

} // ExtendedAttributeType3
