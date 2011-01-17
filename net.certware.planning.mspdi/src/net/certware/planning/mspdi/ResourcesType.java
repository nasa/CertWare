/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.ResourcesType#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getResourcesType()
 * @model extendedMetaData="name='Resources_._type' kind='elementOnly'"
 * @generated
 */
public interface ResourcesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There must be at least one resource in each Resources collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourcesType_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceType> getResource();

} // ResourcesType
