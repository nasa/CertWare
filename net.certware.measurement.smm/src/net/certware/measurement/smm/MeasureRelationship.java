/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.MeasureRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link net.certware.measurement.smm.MeasureRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getMeasureRelationship()
 * @model
 * @generated
 */
public interface MeasureRelationship extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measure#getOutMeasure <em>Out Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Measure)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasureRelationship_From()
	 * @see net.certware.measurement.smm.Measure#getOutMeasure
	 * @model opposite="outMeasure" required="true"
	 * @generated
	 */
	Measure getFrom();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.MeasureRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Measure value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measure#getInMeasure <em>In Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' container reference.
	 * @see #setTo(Measure)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasureRelationship_To()
	 * @see net.certware.measurement.smm.Measure#getInMeasure
	 * @model opposite="inMeasure" required="true" transient="false"
	 * @generated
	 */
	Measure getTo();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.MeasureRelationship#getTo <em>To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' container reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Measure value);

} // MeasureRelationship
