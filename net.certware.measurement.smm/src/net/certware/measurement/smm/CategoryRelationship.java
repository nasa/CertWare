/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.CategoryRelationship#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.smm.CategoryRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link net.certware.measurement.smm.CategoryRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getCategoryRelationship()
 * @model
 * @generated
 */
public interface CategoryRelationship extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.measurement.smm.SmmPackage#getCategoryRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.CategoryRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Category#getOutCategory <em>Out Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Category)
	 * @see net.certware.measurement.smm.SmmPackage#getCategoryRelationship_From()
	 * @see net.certware.measurement.smm.Category#getOutCategory
	 * @model opposite="outCategory" required="true"
	 * @generated
	 */
	Category getFrom();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.CategoryRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Category value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Category#getInCategory <em>In Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Category)
	 * @see net.certware.measurement.smm.SmmPackage#getCategoryRelationship_To()
	 * @see net.certware.measurement.smm.Category#getInCategory
	 * @model opposite="inCategory" required="true"
	 * @generated
	 */
	Category getTo();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.CategoryRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Category value);

} // CategoryRelationship
