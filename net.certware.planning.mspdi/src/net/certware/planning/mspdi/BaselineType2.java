/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baseline Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getTimephasedData <em>Timephased Data</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getNumber <em>Number</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#isInterim <em>Interim</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getDurationFormat <em>Duration Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#isEstimatedDuration <em>Estimated Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.BaselineType2#getFixedCost <em>Fixed Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2()
 * @model extendedMetaData="name='Baseline_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface BaselineType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Timephased Data</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.TimephasedDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time phased data block associated with the task baseline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timephased Data</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_TimephasedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimephasedData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimephasedDataType> getTimephasedData();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique number of the baseline data record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Number' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Interim</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this is an Interim Baseline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interim</em>' attribute.
	 * @see #isSetInterim()
	 * @see #unsetInterim()
	 * @see #setInterim(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_Interim()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Interim' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isInterim();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#isInterim <em>Interim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interim</em>' attribute.
	 * @see #isSetInterim()
	 * @see #unsetInterim()
	 * @see #isInterim()
	 * @generated
	 */
	void setInterim(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.BaselineType2#isInterim <em>Interim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterim()
	 * @see #isInterim()
	 * @see #setInterim(boolean)
	 * @generated
	 */
	void unsetInterim();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.BaselineType2#isInterim <em>Interim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interim</em>' attribute is set.
	 * @see #unsetInterim()
	 * @see #isInterim()
	 * @see #setInterim(boolean)
	 * @generated
	 */
	boolean isSetInterim();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled start date of the task when the baseline was saved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled finish date of the task when the baseline was saved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' attribute.
	 * @see #setFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_Finish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Finish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getFinish <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' attribute.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled duration of the task when the baseline was saved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Duration Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.DurationFormatType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format for expressing the Duration of the Task baseline.  Values are: 3=m, 4=em, 5=h, 6=eh, 7=d, 8=ed, 9=w, 10=ew, 11=mo, 12=emo, 19=%, 20=e%, 21=null, 35=m?, 36=em?, 37=h?, 38=eh?, 39=d?, 40=ed?, 41=w?, 42=ew?, 43=mo?, 44=emo?, 51=%?, 52=e%? and 53=null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Format</em>' attribute.
	 * @see net.certware.planning.mspdi.DurationFormatType3
	 * @see #isSetDurationFormat()
	 * @see #unsetDurationFormat()
	 * @see #setDurationFormat(DurationFormatType3)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_DurationFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DurationFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationFormatType3 getDurationFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getDurationFormat <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Format</em>' attribute.
	 * @see net.certware.planning.mspdi.DurationFormatType3
	 * @see #isSetDurationFormat()
	 * @see #unsetDurationFormat()
	 * @see #getDurationFormat()
	 * @generated
	 */
	void setDurationFormat(DurationFormatType3 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getDurationFormat <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurationFormat()
	 * @see #getDurationFormat()
	 * @see #setDurationFormat(DurationFormatType3)
	 * @generated
	 */
	void unsetDurationFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.BaselineType2#getDurationFormat <em>Duration Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration Format</em>' attribute is set.
	 * @see #unsetDurationFormat()
	 * @see #getDurationFormat()
	 * @see #setDurationFormat(DurationFormatType3)
	 * @generated
	 */
	boolean isSetDurationFormat();

	/**
	 * Returns the value of the '<em><b>Estimated Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the baseline duration of the task was estimated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Duration</em>' attribute.
	 * @see #isSetEstimatedDuration()
	 * @see #unsetEstimatedDuration()
	 * @see #setEstimatedDuration(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_EstimatedDuration()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='EstimatedDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEstimatedDuration();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#isEstimatedDuration <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Duration</em>' attribute.
	 * @see #isSetEstimatedDuration()
	 * @see #unsetEstimatedDuration()
	 * @see #isEstimatedDuration()
	 * @generated
	 */
	void setEstimatedDuration(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.BaselineType2#isEstimatedDuration <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedDuration()
	 * @see #isEstimatedDuration()
	 * @see #setEstimatedDuration(boolean)
	 * @generated
	 */
	void unsetEstimatedDuration();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.BaselineType2#isEstimatedDuration <em>Estimated Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Duration</em>' attribute is set.
	 * @see #unsetEstimatedDuration()
	 * @see #isEstimatedDuration()
	 * @see #setEstimatedDuration(boolean)
	 * @generated
	 */
	boolean isSetEstimatedDuration();

	/**
	 * Returns the value of the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled work of the task when the baseline was saved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work</em>' attribute.
	 * @see #setWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_Work()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Work' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getWork <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' attribute.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The projected cost of the task when the baseline was saved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_Cost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='Cost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The budgeted cost of work scheduled for the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCWS</em>' attribute.
	 * @see #isSetBCWS()
	 * @see #unsetBCWS()
	 * @see #setBCWS(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_BCWS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWS' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWS();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getBCWS <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCWS</em>' attribute.
	 * @see #isSetBCWS()
	 * @see #unsetBCWS()
	 * @see #getBCWS()
	 * @generated
	 */
	void setBCWS(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getBCWS <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWS()
	 * @see #getBCWS()
	 * @see #setBCWS(float)
	 * @generated
	 */
	void unsetBCWS();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.BaselineType2#getBCWS <em>BCWS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BCWS</em>' attribute is set.
	 * @see #unsetBCWS()
	 * @see #getBCWS()
	 * @see #setBCWS(float)
	 * @generated
	 */
	boolean isSetBCWS();

	/**
	 * Returns the value of the '<em><b>BCWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The budgeted cost of work performed on the task to-date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCWP</em>' attribute.
	 * @see #isSetBCWP()
	 * @see #unsetBCWP()
	 * @see #setBCWP(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_BCWP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWP' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWP();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getBCWP <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCWP</em>' attribute.
	 * @see #isSetBCWP()
	 * @see #unsetBCWP()
	 * @see #getBCWP()
	 * @generated
	 */
	void setBCWP(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getBCWP <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWP()
	 * @see #getBCWP()
	 * @see #setBCWP(float)
	 * @generated
	 */
	void unsetBCWP();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.BaselineType2#getBCWP <em>BCWP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BCWP</em>' attribute is set.
	 * @see #unsetBCWP()
	 * @see #getBCWP()
	 * @see #setBCWP(float)
	 * @generated
	 */
	boolean isSetBCWP();

	/**
	 * Returns the value of the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed cost of the task when the baseline was saved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Cost</em>' attribute.
	 * @see #isSetFixedCost()
	 * @see #unsetFixedCost()
	 * @see #setFixedCost(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getBaselineType2_FixedCost()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='FixedCost' namespace='##targetNamespace'"
	 * @generated
	 */
	float getFixedCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getFixedCost <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Cost</em>' attribute.
	 * @see #isSetFixedCost()
	 * @see #unsetFixedCost()
	 * @see #getFixedCost()
	 * @generated
	 */
	void setFixedCost(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.BaselineType2#getFixedCost <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixedCost()
	 * @see #getFixedCost()
	 * @see #setFixedCost(float)
	 * @generated
	 */
	void unsetFixedCost();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.BaselineType2#getFixedCost <em>Fixed Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed Cost</em>' attribute is set.
	 * @see #unsetFixedCost()
	 * @see #getFixedCost()
	 * @see #setFixedCost(float)
	 * @generated
	 */
	boolean isSetFixedCost();

} // BaselineType2
