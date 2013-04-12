/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType#getValueGUID <em>Value GUID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributeType#getDurationFormat <em>Duration Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType()
 * @model extendedMetaData="name='ExtendedAttribute_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtendedAttributeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Field ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The project ID (PID) of the custom field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field ID</em>' attribute.
	 * @see #setFieldID(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType_FieldID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FieldID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFieldID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType#getFieldID <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field ID</em>' attribute.
	 * @see #getFieldID()
	 * @generated
	 */
	void setFieldID(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual value of the extended attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Value GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the value in the extended attribute lookup table.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value GUID</em>' attribute.
	 * @see #setValueGUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType_ValueGUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ValueGUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getValueGUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType#getValueGUID <em>Value GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value GUID</em>' attribute.
	 * @see #getValueGUID()
	 * @generated
	 */
	void setValueGUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Duration Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.DurationFormatType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format for expressing the bulk duration.  Values are: 3=m, 4=em, 5=h, 6=eh, 7=d, 8=ed, 9=w, 10=ew, 11=mo, 12=emo, 19=%, 20=e%, 21=null, 35=m?, 36=em?, 37=h?, 38=eh?, 39=d?, 40=ed?, 41=w?, 42=ew?, 43=mo?, 44=emo?, 51=%?, 52=e%? and 53=null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Format</em>' attribute.
	 * @see net.certware.planning.mspdi.DurationFormatType2
	 * @see #isSetDurationFormat()
	 * @see #unsetDurationFormat()
	 * @see #setDurationFormat(DurationFormatType2)
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributeType_DurationFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DurationFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationFormatType2 getDurationFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType#getDurationFormat <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Format</em>' attribute.
	 * @see net.certware.planning.mspdi.DurationFormatType2
	 * @see #isSetDurationFormat()
	 * @see #unsetDurationFormat()
	 * @see #getDurationFormat()
	 * @generated
	 */
	void setDurationFormat(DurationFormatType2 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType#getDurationFormat <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurationFormat()
	 * @see #getDurationFormat()
	 * @see #setDurationFormat(DurationFormatType2)
	 * @generated
	 */
	void unsetDurationFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ExtendedAttributeType#getDurationFormat <em>Duration Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration Format</em>' attribute is set.
	 * @see #unsetDurationFormat()
	 * @see #getDurationFormat()
	 * @see #setDurationFormat(DurationFormatType2)
	 * @generated
	 */
	boolean isSetDurationFormat();

} // ExtendedAttributeType
