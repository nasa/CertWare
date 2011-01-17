/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timephased Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of the time phased data block.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.TimephasedDataType#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TimephasedDataType#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TimephasedDataType#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TimephasedDataType#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TimephasedDataType#getUnit <em>Unit</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TimephasedDataType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getTimephasedDataType()
 * @model extendedMetaData="name='TimephasedDataType' kind='elementOnly'"
 * @generated
 */
public interface TimephasedDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.TypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The type of task timephased data. Values are:
	 *             1=Assignment Remaining Work
	 *             2=Assignment Actual Work
	 *             3=Assignment Actual Overtime Work
	 *             4=Assignment Baseline Work
	 *             5=Assignment Baseline Cost
	 *             6=Assignment Actual Cost
	 *             7=Resource Baseline Work
	 *             8=Resource Baseline Cost
	 *             9=Task Baseline Work
	 *             10=Task Baseline Cost
	 *             11=Task Percent Complete
	 *             16=Assignment Baseline 1 Work
	 *             17=Assignment Baseline 1 Cost
	 *             18=Task Baseline 1 Work
	 *             19=Task Baseline 1 Cost
	 *             20=Resource Baseline 1 Work
	 *             21=Resource Baseline 1 Cost
	 *             22=Assignment Baseline 2 Work
	 *             23=Assignment Baseline 2 Cost
	 *             24=Task Baseline 2 Work
	 *             25=Task Baseline 2 Cost
	 *             26=Resource Baseline 2 Work
	 *             27=Resource Baseline 2 Cost
	 *             28=Assignment Baseline 3 Work
	 *             29=Assignment Baseline 3 Cost
	 *             30=Task Baseline 3 Work
	 *             31=Task Baseline 3 Cost
	 *             32=Resource Baseline 3 Work
	 *             33=Resource Baseline 3 Cost
	 *             34=Assignment Baseline 4 Work
	 *             35=Assignment Baseline 4 Cost
	 *             36=Task Baseline 4 Work
	 *             37=Task Baseline 4 Cost
	 *             38=Resource Baseline 4 Work
	 *             39=Resource Baseline 4 Cost
	 *             40=Assignment Baseline 5 Work
	 *             41=Assignment Baseline 5 Cost
	 *             42=Task Baseline 5 Work
	 *             43=Task Baseline 5 Cost
	 *             44=Resource Baseline 5 Work
	 *             45=Resource Baseline 5 Cost
	 *             46=Assignment Baseline 6 Work
	 *             47=Assignment Baseline 6 Cost
	 *             48=Task Baseline 6 Work
	 *             49=Task Baseline 6 Cost
	 *             50=Resource Baseline 6 Work
	 *             51=Resource Baseline 6 Cost
	 *             52=Assignment Baseline 7 Work
	 *             53=Assignment Baseline 7 Cost
	 *             54=Task Baseline 7 Work
	 *             55=Task Baseline 7 Cost
	 *             56=Resource Baseline 7 Work
	 *             57=Resource Baseline 7 Cost
	 *             58=Assignment Baseline 8 Work
	 *             59=Assignment Baseline 8 Cost
	 *             60=Task Baseline 8 Work
	 *             61=Task Baseline 8 Cost
	 *             62=Resource Baseline 8 Work
	 *             63=Resource Baseline 8 Cost
	 *             64=Assignment Baseline 9 Work
	 *             65=Assignment Baseline 9 Cost
	 *             66=Task Baseline 9 Work
	 *             67=Task Baseline 9 Cost
	 *             68=Resource Baseline 9 Work
	 *             69=Resource Baseline 9 Cost
	 *             70=Assignment Baseline 10 Work
	 *             71=Assignment Baseline 10 Cost
	 *             72=Task Baseline 10 Work
	 *             73=Task Baseline 10 Cost
	 *             74=Resource Baseline 10 Work
	 *             75=Resource Baseline 10 Cost
	 *             76=Physical Percent Complete
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimephasedDataType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType1 getType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType1
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType1 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType1)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the timephased data record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimephasedDataType_UID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='UID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start date of the timephased data period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimephasedDataType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getStart <em>Start</em>}' attribute.
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
	 * The finish date of the timephased data period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' attribute.
	 * @see #setFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimephasedDataType_Finish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Finish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getFinish <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' attribute.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time unit of the timephased data period. Values are: 0=m, 1=h, 2=d, 3=w, 5=mo, 8=y.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see net.certware.planning.mspdi.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(UnitType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimephasedDataType_Unit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see net.certware.planning.mspdi.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	boolean isSetUnit();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value per unit of time for the timephased data period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTimephasedDataType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TimephasedDataType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TimephasedDataType
