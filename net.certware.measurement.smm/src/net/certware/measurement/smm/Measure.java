/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.Measure#getCategory <em>Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getLibrary <em>Library</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getOutMeasure <em>Out Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getInMeasure <em>In Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getTrait <em>Trait</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measure#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getMeasure()
 * @model abstract="true"
 * @generated
 */
public interface Measure extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Category}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Category#getCategoryMeasure <em>Category Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_Category()
	 * @see net.certware.measurement.smm.Category#getCategoryMeasure
	 * @model opposite="categoryMeasure"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_Library()
	 * @model
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Measure#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

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
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Measure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Equivalent From</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measure#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent From</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_EquivalentFrom()
	 * @see net.certware.measurement.smm.Measure#getEquivalentTo
	 * @model opposite="equivalentTo"
	 * @generated
	 */
	EList<Measure> getEquivalentFrom();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measure#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_EquivalentTo()
	 * @see net.certware.measurement.smm.Measure#getEquivalentFrom
	 * @model opposite="equivalentFrom"
	 * @generated
	 */
	EList<Measure> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_Refinement()
	 * @model
	 * @generated
	 */
	EList<Measure> getRefinement();

	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.Measurement}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measurement#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' containment reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_Measurement()
	 * @see net.certware.measurement.smm.Measurement#getMeasure
	 * @model opposite="measure" containment="true"
	 * @generated
	 */
	EList<Measurement> getMeasurement();

	/**
	 * Returns the value of the '<em><b>Out Measure</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Measure</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_OutMeasure()
	 * @see net.certware.measurement.smm.MeasureRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<MeasureRelationship> getOutMeasure();

	/**
	 * Returns the value of the '<em><b>In Measure</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.MeasureRelationship}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Measure</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Measure</em>' containment reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_InMeasure()
	 * @see net.certware.measurement.smm.MeasureRelationship#getTo
	 * @model opposite="to" containment="true"
	 * @generated
	 */
	EList<MeasureRelationship> getInMeasure();

	/**
	 * Returns the value of the '<em><b>Trait</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Characteristic#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trait</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trait</em>' container reference.
	 * @see #setTrait(Characteristic)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_Trait()
	 * @see net.certware.measurement.smm.Characteristic#getCharacteristics
	 * @model opposite="characteristics" required="true" transient="false"
	 * @generated
	 */
	Characteristic getTrait();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Measure#getTrait <em>Trait</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trait</em>' container reference.
	 * @see #getTrait()
	 * @generated
	 */
	void setTrait(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Scope#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(Scope)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasure_Scope()
	 * @see net.certware.measurement.smm.Scope#getMeasures
	 * @model opposite="measures" required="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Measure#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // Measure
