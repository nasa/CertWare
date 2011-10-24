/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.CollectionItem#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link net.certware.argument.aml.CollectionItem#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.CollectionItem#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getCollectionItem()
 * @model extendedMetaData="name='collectionItem_._type' kind='empty'"
 * @generated
 */
public interface CollectionItem extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

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
	 * @see net.certware.argument.aml.AmlPackage#getCollectionItem_IdRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='idRef' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.CollectionItem#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.argument.aml.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see net.certware.argument.aml.ObjectType
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #setObjectType(ObjectType)
	 * @see net.certware.argument.aml.AmlPackage#getCollectionItem_ObjectType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='object-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType getObjectType();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.CollectionItem#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see net.certware.argument.aml.ObjectType
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(ObjectType value);

	/**
	 * Unsets the value of the '{@link net.certware.argument.aml.CollectionItem#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(ObjectType)
	 * @generated
	 */
	void unsetObjectType();

	/**
	 * Returns whether the value of the '{@link net.certware.argument.aml.CollectionItem#getObjectType <em>Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Type</em>' attribute is set.
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(ObjectType)
	 * @generated
	 */
	boolean isSetObjectType();

	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #setOrdinal(String)
	 * @see net.certware.argument.aml.AmlPackage#getCollectionItem_Ordinal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ordinal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrdinal();

	/**
	 * Sets the value of the '{@link net.certware.argument.aml.CollectionItem#getOrdinal <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal</em>' attribute.
	 * @see #getOrdinal()
	 * @generated
	 */
	void setOrdinal(String value);

} // CollectionItem
