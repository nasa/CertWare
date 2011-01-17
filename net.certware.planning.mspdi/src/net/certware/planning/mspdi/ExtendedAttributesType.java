/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Attributes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.ExtendedAttributesType#getExtendedAttribute <em>Extended Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributesType()
 * @model extendedMetaData="name='ExtendedAttributes_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtendedAttributesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.ExtendedAttributeType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each of the individual entries in the extended attributes definition collection.  There are no limits to the number of children that may appear, but Project only understands Flag1-Flag10, etc.  There must be at least one ExtendedAttribute in each ExtendedAttributes collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attribute</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getExtendedAttributesType_ExtendedAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtendedAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtendedAttributeType3> getExtendedAttribute();

} // ExtendedAttributesType
