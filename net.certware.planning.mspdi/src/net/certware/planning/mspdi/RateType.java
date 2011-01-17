/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.RateType#getRatesFrom <em>Rates From</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.RateType#getRatesTo <em>Rates To</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.RateType#getRateTable <em>Rate Table</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.RateType#getStandardRate <em>Standard Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.RateType#getStandardRateFormat <em>Standard Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.RateType#getOvertimeRate <em>Overtime Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.RateType#getOvertimeRateFormat <em>Overtime Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.RateType#getCostPerUse <em>Cost Per Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getRateType()
 * @model extendedMetaData="name='Rate_._type' kind='elementOnly'"
 * @generated
 */
public interface RateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rates From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the rate becomes effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rates From</em>' attribute.
	 * @see #setRatesFrom(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_RatesFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='RatesFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRatesFrom();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getRatesFrom <em>Rates From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rates From</em>' attribute.
	 * @see #getRatesFrom()
	 * @generated
	 */
	void setRatesFrom(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Rates To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The last date that the rate is effective.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rates To</em>' attribute.
	 * @see #setRatesTo(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_RatesTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='RatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRatesTo();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getRatesTo <em>Rates To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rates To</em>' attribute.
	 * @see #getRatesTo()
	 * @generated
	 */
	void setRatesTo(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Rate Table</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.RateTableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the rate table for the resource. Values are: 0=A, 1=B, 2=C, 3=D, 4=E.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Table</em>' attribute.
	 * @see net.certware.planning.mspdi.RateTableType
	 * @see #isSetRateTable()
	 * @see #unsetRateTable()
	 * @see #setRateTable(RateTableType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_RateTable()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RateTable' namespace='##targetNamespace'"
	 * @generated
	 */
	RateTableType getRateTable();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getRateTable <em>Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Table</em>' attribute.
	 * @see net.certware.planning.mspdi.RateTableType
	 * @see #isSetRateTable()
	 * @see #unsetRateTable()
	 * @see #getRateTable()
	 * @generated
	 */
	void setRateTable(RateTableType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.RateType#getRateTable <em>Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRateTable()
	 * @see #getRateTable()
	 * @see #setRateTable(RateTableType)
	 * @generated
	 */
	void unsetRateTable();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.RateType#getRateTable <em>Rate Table</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rate Table</em>' attribute is set.
	 * @see #unsetRateTable()
	 * @see #getRateTable()
	 * @see #setRateTable(RateTableType)
	 * @generated
	 */
	boolean isSetRateTable();

	/**
	 * Returns the value of the '<em><b>Standard Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The standard rate for the resource for the period specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Rate</em>' attribute.
	 * @see #setStandardRate(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_StandardRate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='StandardRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStandardRate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getStandardRate <em>Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Rate</em>' attribute.
	 * @see #getStandardRate()
	 * @generated
	 */
	void setStandardRate(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Standard Rate Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.StandardRateFormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units used by Microsoft Project to display the standard rate.  1=m, 2=h, 3=d, 4=w, 5=mo, 7=y.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.StandardRateFormatType
	 * @see #isSetStandardRateFormat()
	 * @see #unsetStandardRateFormat()
	 * @see #setStandardRateFormat(StandardRateFormatType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_StandardRateFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StandardRateFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardRateFormatType getStandardRateFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getStandardRateFormat <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.StandardRateFormatType
	 * @see #isSetStandardRateFormat()
	 * @see #unsetStandardRateFormat()
	 * @see #getStandardRateFormat()
	 * @generated
	 */
	void setStandardRateFormat(StandardRateFormatType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.RateType#getStandardRateFormat <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandardRateFormat()
	 * @see #getStandardRateFormat()
	 * @see #setStandardRateFormat(StandardRateFormatType)
	 * @generated
	 */
	void unsetStandardRateFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.RateType#getStandardRateFormat <em>Standard Rate Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standard Rate Format</em>' attribute is set.
	 * @see #unsetStandardRateFormat()
	 * @see #getStandardRateFormat()
	 * @see #setStandardRateFormat(StandardRateFormatType)
	 * @generated
	 */
	boolean isSetStandardRateFormat();

	/**
	 * Returns the value of the '<em><b>Overtime Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overtime rate for the resource for the period specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Rate</em>' attribute.
	 * @see #setOvertimeRate(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_OvertimeRate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='OvertimeRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOvertimeRate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getOvertimeRate <em>Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Rate</em>' attribute.
	 * @see #getOvertimeRate()
	 * @generated
	 */
	void setOvertimeRate(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Overtime Rate Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.OvertimeRateFormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units used by Microsoft Project to display the overtime rate.  1=m, 2=h, 3=d, 4=w, 5=mo, 7=y.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType
	 * @see #isSetOvertimeRateFormat()
	 * @see #unsetOvertimeRateFormat()
	 * @see #setOvertimeRateFormat(OvertimeRateFormatType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_OvertimeRateFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='OvertimeRateFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	OvertimeRateFormatType getOvertimeRateFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getOvertimeRateFormat <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType
	 * @see #isSetOvertimeRateFormat()
	 * @see #unsetOvertimeRateFormat()
	 * @see #getOvertimeRateFormat()
	 * @generated
	 */
	void setOvertimeRateFormat(OvertimeRateFormatType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.RateType#getOvertimeRateFormat <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOvertimeRateFormat()
	 * @see #getOvertimeRateFormat()
	 * @see #setOvertimeRateFormat(OvertimeRateFormatType)
	 * @generated
	 */
	void unsetOvertimeRateFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.RateType#getOvertimeRateFormat <em>Overtime Rate Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overtime Rate Format</em>' attribute is set.
	 * @see #unsetOvertimeRateFormat()
	 * @see #getOvertimeRateFormat()
	 * @see #setOvertimeRateFormat(OvertimeRateFormatType)
	 * @generated
	 */
	boolean isSetOvertimeRateFormat();

	/**
	 * Returns the value of the '<em><b>Cost Per Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost per use of the resource. This value is as of the current date if a rate table exists for the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Per Use</em>' attribute.
	 * @see #setCostPerUse(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getRateType_CostPerUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='CostPerUse' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCostPerUse();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.RateType#getCostPerUse <em>Cost Per Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Use</em>' attribute.
	 * @see #getCostPerUse()
	 * @generated
	 */
	void setCostPerUse(BigDecimal value);

} // RateType
