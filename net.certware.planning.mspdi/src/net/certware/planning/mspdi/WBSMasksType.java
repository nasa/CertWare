/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WBS Masks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WBSMasksType#isVerifyUniqueCodes <em>Verify Unique Codes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WBSMasksType#isGenerateCodes <em>Generate Codes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WBSMasksType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WBSMasksType#getWBSMask <em>WBS Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMasksType()
 * @model extendedMetaData="name='WBSMasks_._type' kind='elementOnly'"
 * @generated
 */
public interface WBSMasksType extends EObject {
	/**
	 * Returns the value of the '<em><b>Verify Unique Codes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether WBS codes are unique for new tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verify Unique Codes</em>' attribute.
	 * @see #isSetVerifyUniqueCodes()
	 * @see #unsetVerifyUniqueCodes()
	 * @see #setVerifyUniqueCodes(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMasksType_VerifyUniqueCodes()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='VerifyUniqueCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVerifyUniqueCodes();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WBSMasksType#isVerifyUniqueCodes <em>Verify Unique Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Unique Codes</em>' attribute.
	 * @see #isSetVerifyUniqueCodes()
	 * @see #unsetVerifyUniqueCodes()
	 * @see #isVerifyUniqueCodes()
	 * @generated
	 */
	void setVerifyUniqueCodes(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.WBSMasksType#isVerifyUniqueCodes <em>Verify Unique Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerifyUniqueCodes()
	 * @see #isVerifyUniqueCodes()
	 * @see #setVerifyUniqueCodes(boolean)
	 * @generated
	 */
	void unsetVerifyUniqueCodes();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.WBSMasksType#isVerifyUniqueCodes <em>Verify Unique Codes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verify Unique Codes</em>' attribute is set.
	 * @see #unsetVerifyUniqueCodes()
	 * @see #isVerifyUniqueCodes()
	 * @see #setVerifyUniqueCodes(boolean)
	 * @generated
	 */
	boolean isSetVerifyUniqueCodes();

	/**
	 * Returns the value of the '<em><b>Generate Codes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether WBS codes are generated for new tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generate Codes</em>' attribute.
	 * @see #isSetGenerateCodes()
	 * @see #unsetGenerateCodes()
	 * @see #setGenerateCodes(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMasksType_GenerateCodes()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='GenerateCodes' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGenerateCodes();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WBSMasksType#isGenerateCodes <em>Generate Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Codes</em>' attribute.
	 * @see #isSetGenerateCodes()
	 * @see #unsetGenerateCodes()
	 * @see #isGenerateCodes()
	 * @generated
	 */
	void setGenerateCodes(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.WBSMasksType#isGenerateCodes <em>Generate Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenerateCodes()
	 * @see #isGenerateCodes()
	 * @see #setGenerateCodes(boolean)
	 * @generated
	 */
	void unsetGenerateCodes();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.WBSMasksType#isGenerateCodes <em>Generate Codes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generate Codes</em>' attribute is set.
	 * @see #unsetGenerateCodes()
	 * @see #isGenerateCodes()
	 * @see #setGenerateCodes(boolean)
	 * @generated
	 */
	boolean isSetGenerateCodes();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefix for all WBS codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMasksType_Prefix()
	 * @model dataType="net.certware.planning.mspdi.PrefixType"
	 *        extendedMetaData="kind='element' name='Prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WBSMasksType#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>WBS Mask</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.WBSMaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The WBS Mask that is applied to all tasks in the Project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WBS Mask</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getWBSMasksType_WBSMask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WBSMask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WBSMaskType> getWBSMask();

} // WBSMasksType
