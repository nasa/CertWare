/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Masks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.MasksType#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getMasksType()
 * @model extendedMetaData="name='Masks_._type' kind='elementOnly'"
 * @generated
 */
public interface MasksType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mask</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.MaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The four elements of the mask constitute the format in which the outline code must appear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mask</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getMasksType_Mask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Mask' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MaskType> getMask();

} // MasksType
