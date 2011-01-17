/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.ValueType1#getValueID <em>Value ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ValueType1#getFieldGUID <em>Field GUID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ValueType1#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ValueType1#getParentValueID <em>Parent Value ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ValueType1#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ValueType1#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getValueType1()
 * @model extendedMetaData="name='Value_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface ValueType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique ID of the outline code value within the project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value ID</em>' attribute.
	 * @see #setValueID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getValueType1_ValueID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ValueID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getValueID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ValueType1#getValueID <em>Value ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value ID</em>' attribute.
	 * @see #getValueID()
	 * @generated
	 */
	void setValueID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Field GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the outline code value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field GUID</em>' attribute.
	 * @see #setFieldGUID(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getValueType1_FieldGUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='FieldGUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFieldGUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ValueType1#getFieldGUID <em>Field GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field GUID</em>' attribute.
	 * @see #getFieldGUID()
	 * @generated
	 */
	void setFieldGUID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.TypeType7}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outline code type. Values are: 4=Date, 6=Duration, 9=Cost, 15=Number, 17=Flag, 21=Text, 27=Finish date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType7
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType7)
	 * @see net.certware.planning.mspdi.MspdiPackage#getValueType1_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType7 getType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ValueType1#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType7
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType7 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ValueType1#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType7)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ValueType1#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType7)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Parent Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the parent node of the outline code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Value ID</em>' attribute.
	 * @see #setParentValueID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getValueType1_ParentValueID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ParentValueID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getParentValueID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ValueType1#getParentValueID <em>Parent Value ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Value ID</em>' attribute.
	 * @see #getParentValueID()
	 * @generated
	 */
	void setParentValueID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getValueType1_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ValueType1#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of this value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getValueType1_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ValueType1#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ValueType1
