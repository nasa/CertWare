/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outline Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.OutlineCodeType#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.OutlineCodeType#getValueID <em>Value ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.OutlineCodeType#getValueGUID <em>Value GUID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getOutlineCodeType()
 * @model extendedMetaData="name='OutlineCode_._type' kind='elementOnly'"
 * @generated
 */
public interface OutlineCodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number value of the custom field project ID (PID).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field ID</em>' attribute.
	 * @see #setFieldID(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getOutlineCodeType_FieldID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FieldID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFieldID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.OutlineCodeType#getFieldID <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field ID</em>' attribute.
	 * @see #getFieldID()
	 * @generated
	 */
	void setFieldID(String value);

	/**
	 * Returns the value of the '<em><b>Value ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID in the value list associated with the definition in the outline code collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value ID</em>' attribute.
	 * @see #setValueID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getOutlineCodeType_ValueID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ValueID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getValueID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.OutlineCodeType#getValueID <em>Value ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value ID</em>' attribute.
	 * @see #getValueID()
	 * @generated
	 */
	void setValueID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Value GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the value in the value list. The ValueGUID matches the FieldGUID in the value list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value GUID</em>' attribute.
	 * @see #setValueGUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getOutlineCodeType_ValueGUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ValueGUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getValueGUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.OutlineCodeType#getValueGUID <em>Value GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value GUID</em>' attribute.
	 * @see #getValueGUID()
	 * @generated
	 */
	void setValueGUID(BigInteger value);

} // OutlineCodeType
