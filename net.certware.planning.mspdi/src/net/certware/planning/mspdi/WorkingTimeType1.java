/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working Time Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.WorkingTimeType1#getFromTime <em>From Time</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.WorkingTimeType1#getToTime <em>To Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getWorkingTimeType1()
 * @model extendedMetaData="name='WorkingTime_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface WorkingTimeType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The beginning of the working time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Time</em>' attribute.
	 * @see #setFromTime(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWorkingTimeType1_FromTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='FromTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFromTime();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WorkingTimeType1#getFromTime <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Time</em>' attribute.
	 * @see #getFromTime()
	 * @generated
	 */
	void setFromTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end of the working time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Time</em>' attribute.
	 * @see #setToTime(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getWorkingTimeType1_ToTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='element' name='ToTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getToTime();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.WorkingTimeType1#getToTime <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Time</em>' attribute.
	 * @see #getToTime()
	 * @generated
	 */
	void setToTime(XMLGregorianCalendar value);

} // WorkingTimeType1
