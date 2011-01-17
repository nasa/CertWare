/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Period Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.TimePeriodType#getFromDate <em>From Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TimePeriodType#getToDate <em>To Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getTimePeriodType()
 * @model extendedMetaData="name='TimePeriod_._type' kind='elementOnly'"
 * @generated
 */
public interface TimePeriodType extends EObject {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The beginning of the exception time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimePeriodType_FromDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='FromDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFromDate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimePeriodType#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end of the exception time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 * @see #setToDate(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimePeriodType_ToDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ToDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getToDate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimePeriodType#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(XMLGregorianCalendar value);

} // TimePeriodType
