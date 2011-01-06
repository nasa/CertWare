/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.MeasurementRelationship#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.smm.MeasurementRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link net.certware.measurement.smm.MeasurementRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getMeasurementRelationship()
 * @model abstract="true"
 * @generated
 */
public interface MeasurementRelationship extends SmmRelationship {
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
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurementRelationship_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.MeasurementRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measurement#getOutMeasurement <em>Out Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Measurement)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurementRelationship_From()
	 * @see net.certware.measurement.smm.Measurement#getOutMeasurement
	 * @model opposite="outMeasurement" required="true"
	 * @generated
	 */
	Measurement getFrom();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.MeasurementRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Measurement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measurement#getInMeasurement <em>In Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Measurement)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurementRelationship_To()
	 * @see net.certware.measurement.smm.Measurement#getInMeasurement
	 * @model opposite="inMeasurement" required="true"
	 * @generated
	 */
	Measurement getTo();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.MeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Measurement value);

} // MeasurementRelationship
