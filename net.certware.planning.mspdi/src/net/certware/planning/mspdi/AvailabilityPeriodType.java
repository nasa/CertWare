/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability Period Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableFrom <em>Available From</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableTo <em>Available To</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableUnits <em>Available Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getAvailabilityPeriodType()
 * @model extendedMetaData="name='AvailabilityPeriod_._type' kind='elementOnly'"
 * @generated
 */
public interface AvailabilityPeriodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Available From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the resource becomes available for the specified period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available From</em>' attribute.
	 * @see #setAvailableFrom(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAvailabilityPeriodType_AvailableFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AvailableFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAvailableFrom();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableFrom <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available From</em>' attribute.
	 * @see #getAvailableFrom()
	 * @generated
	 */
	void setAvailableFrom(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Available To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The last date that the resource is available for the specified period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available To</em>' attribute.
	 * @see #setAvailableTo(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAvailabilityPeriodType_AvailableTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AvailableTo' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAvailableTo();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableTo <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To</em>' attribute.
	 * @see #getAvailableTo()
	 * @generated
	 */
	void setAvailableTo(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Available Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage that the resource is available during the specified period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Units</em>' attribute.
	 * @see #isSetAvailableUnits()
	 * @see #unsetAvailableUnits()
	 * @see #setAvailableUnits(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getAvailabilityPeriodType_AvailableUnits()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='AvailableUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	float getAvailableUnits();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableUnits <em>Available Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Units</em>' attribute.
	 * @see #isSetAvailableUnits()
	 * @see #unsetAvailableUnits()
	 * @see #getAvailableUnits()
	 * @generated
	 */
	void setAvailableUnits(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableUnits <em>Available Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvailableUnits()
	 * @see #getAvailableUnits()
	 * @see #setAvailableUnits(float)
	 * @generated
	 */
	void unsetAvailableUnits();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.AvailabilityPeriodType#getAvailableUnits <em>Available Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Available Units</em>' attribute is set.
	 * @see #unsetAvailableUnits()
	 * @see #getAvailableUnits()
	 * @see #setAvailableUnits(float)
	 * @generated
	 */
	boolean isSetAvailableUnits();

} // AvailabilityPeriodType
