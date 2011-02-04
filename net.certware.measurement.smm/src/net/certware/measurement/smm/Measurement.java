/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.Measurement#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measurement#getObservation <em>Observation</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measurement#getError <em>Error</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measurement#getOutMeasurement <em>Out Measurement</em>}</li>
 *   <li>{@link net.certware.measurement.smm.Measurement#getInMeasurement <em>In Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.smm.SmmPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.Measure#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' container reference.
	 * @see #setMeasure(Measure)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurement_Measure()
	 * @see net.certware.measurement.smm.Measure#getMeasurement
	 * @model opposite="measurement" required="true" transient="false"
	 * @generated
	 */
	Measure getMeasure();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Measurement#getMeasure <em>Measure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' container reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Measure value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurement_Observation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Measurement#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurement_Error()
	 * @model
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link net.certware.measurement.smm.Measurement#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

	/**
	 * Returns the value of the '<em><b>Out Measurement</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Measurement</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurement_OutMeasurement()
	 * @see net.certware.measurement.smm.MeasurementRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<MeasurementRelationship> getOutMeasurement();

	/**
	 * Returns the value of the '<em><b>In Measurement</b></em>' reference list.
	 * The list contents are of type {@link net.certware.measurement.smm.MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link net.certware.measurement.smm.MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Measurement</em>' reference list.
	 * @see net.certware.measurement.smm.SmmPackage#getMeasurement_InMeasurement()
	 * @see net.certware.measurement.smm.MeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<MeasurementRelationship> getInMeasurement();

} // Measurement
