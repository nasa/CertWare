/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mask Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.MaskType#getLevel <em>Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.MaskType#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.MaskType#getLength <em>Length</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.MaskType#getSeparator <em>Separator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getMaskType()
 * @model extendedMetaData="name='Mask_._type' kind='elementOnly'"
 * @generated
 */
public interface MaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The level of the mask.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getMaskType_Level()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.MaskType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.TypeType5}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of mask. Values are: 0=Numbers, 1=Upper Case Letters, 2=Lower Case Letters, 3=Characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType5
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType5)
	 * @see net.certware.planning.mspdi.MspdiPackage#getMaskType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType5 getType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.MaskType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType5
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType5 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.MaskType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType5)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.MaskType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType5)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum length in characters of the outline code values.  If length is any, the value is zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getMaskType_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Length' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLength();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.MaskType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The separator value of the code values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getMaskType_Separator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Separator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.MaskType#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

} // MaskType
