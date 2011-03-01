/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.Creator#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.Creator#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link net.certware.argument.aml.Creator#getObjectType <em>Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getCreator()
 * @model extendedMetaData="name='creator_._type' kind='empty'"
 * @generated
 */
public interface Creator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.certware.argument.aml.AmlPackage#getCreator_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Creator#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ref</em>' attribute.
	 * @see #setIdRef(String)
	 * @see net.certware.argument.aml.AmlPackage#getCreator_IdRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='idRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Creator#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.argument.aml.ObjectType3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see net.certware.argument.aml.ObjectType3
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #setObjectType(ObjectType3)
	 * @see net.certware.argument.aml.AmlPackage#getCreator_ObjectType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='object-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType3 getObjectType();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.Creator#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see net.certware.argument.aml.ObjectType3
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(ObjectType3 value);

	/**
	 * Unsets the value of the '{@link net.certware.argument.aml.Creator#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(ObjectType3)
	 * @generated
	 */
	void unsetObjectType();

	/**
	 * Returns whether the value of the '{@link net.certware.argument.aml.Creator#getObjectType <em>Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Type</em>' attribute is set.
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(ObjectType3)
	 * @generated
	 */
	boolean isSetObjectType();

} // Creator
