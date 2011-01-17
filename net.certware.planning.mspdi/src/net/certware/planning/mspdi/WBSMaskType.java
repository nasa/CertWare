/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WBS Mask Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WBSMaskType#getLevel <em>Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WBSMaskType#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WBSMaskType#getLength <em>Length</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WBSMaskType#getSeparator <em>Separator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMaskType()
 * @model extendedMetaData="name='WBSMask_._type' kind='elementOnly'"
 * @generated
 */
public interface WBSMaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The level of the mask.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMaskType_Level()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLevel();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WBSMaskType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.TypeType6}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the node value.  The values are: 0=Numbers, 1=Uppercase Letters, 2=Lowercase Letters, 3=Characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType6
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType6)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMaskType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType6 getType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WBSMaskType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType6
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType6 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.WBSMaskType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType6)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.WBSMaskType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType6)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum length in characters.  This element is omitted when length is "any".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMaskType_Length()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Length' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WBSMaskType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The separator character of the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMaskType_Separator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Separator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WBSMaskType#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

} // WBSMaskType
