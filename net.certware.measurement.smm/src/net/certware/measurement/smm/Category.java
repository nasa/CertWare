/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.Category#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Category#getCategory <em>Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Category#getCategoryElement <em>Category Element</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Category#getOutCategory <em>Out Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Category#getInCategory <em>In Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Category#getCategoryMeasure <em>Category Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends SmmElement {
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
	 * @see net.certware.measurement.smm.SmmPackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Category}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Category#getCategoryElement <em>Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getCategory_Category()
	 * @see net.certware.measurement.smm.Category#getCategoryElement
	 * @model opposite="categoryElement"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Category Element</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Category}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Category#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Element</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getCategory_CategoryElement()
	 * @see net.certware.measurement.smm.Category#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<Category> getCategoryElement();

	/**
	 * Returns the value of the '<em><b>Out Category</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.CategoryRelationship}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.CategoryRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Category</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getCategory_OutCategory()
	 * @see net.certware.measurement.smm.CategoryRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<CategoryRelationship> getOutCategory();

	/**
	 * Returns the value of the '<em><b>In Category</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.CategoryRelationship}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.CategoryRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Category</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getCategory_InCategory()
	 * @see net.certware.measurement.smm.CategoryRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<CategoryRelationship> getInCategory();

	/**
	 * Returns the value of the '<em><b>Category Measure</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measure#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Measure</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getCategory_CategoryMeasure()
	 * @see net.certware.measurement.smm.Measure#getCategory
	 * @model opposite="category"
	 * @generated
	 */
	EList<Measure> getCategoryMeasure();

} // Category
