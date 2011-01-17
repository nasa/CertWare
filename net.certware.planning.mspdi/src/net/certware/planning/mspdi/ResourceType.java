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
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getID <em>ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getInitials <em>Initials</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getPhonetics <em>Phonetics</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getNTAccount <em>NT Account</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getMaterialLabel <em>Material Label</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getCode <em>Code</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getWorkGroup <em>Work Group</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getHyperlinkAddress <em>Hyperlink Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getMaxUnits <em>Max Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getPeakUnits <em>Peak Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isOverAllocated <em>Over Allocated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getAvailableFrom <em>Available From</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getAvailableTo <em>Available To</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isCanLevel <em>Can Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getAccrueAt <em>Accrue At</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getRegularWork <em>Regular Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getOvertimeWork <em>Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getActualWork <em>Actual Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getRemainingWork <em>Remaining Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeWork <em>Actual Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getPercentWorkComplete <em>Percent Work Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getStandardRate <em>Standard Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getStandardRateFormat <em>Standard Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getOvertimeRate <em>Overtime Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getOvertimeRateFormat <em>Overtime Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getOvertimeCost <em>Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getCostPerUse <em>Cost Per Use</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeCost <em>Actual Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getWorkVariance <em>Work Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getCostVariance <em>Cost Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getSV <em>SV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getCV <em>CV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getACWP <em>ACWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getCalendarUID <em>Calendar UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getNotes <em>Notes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isIsGeneric <em>Is Generic</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isIsInactive <em>Is Inactive</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isIsEnterprise <em>Is Enterprise</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getBookingType <em>Booking Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getActualWorkProtected <em>Actual Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getActiveDirectoryGUID <em>Active Directory GUID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getOutlineCode <em>Outline Code</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isIsCostResource <em>Is Cost Resource</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getAssnOwner <em>Assn Owner</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getAssnOwnerGuid <em>Assn Owner Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#isIsBudget <em>Is Budget</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getAvailabilityPeriods <em>Availability Periods</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getRates <em>Rates</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.ResourceType#getTimephasedData <em>Timephased Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType()
 * @model extendedMetaData="name='Resource_._type' kind='elementOnly'"
 * @generated
 */
public interface ResourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_UID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='UID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position identifier of the resource within the list of resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Name()
	 * @model dataType="net.certware.planning.mspdi.NameType4"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.TypeType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of resource. Values are: 0=Material, 1=Work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType2)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType2 getType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType2 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource is null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Null</em>' attribute.
	 * @see #isSetIsNull()
	 * @see #unsetIsNull()
	 * @see #setIsNull(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_IsNull()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsNull' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsNull();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsNull <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Null</em>' attribute.
	 * @see #isSetIsNull()
	 * @see #unsetIsNull()
	 * @see #isIsNull()
	 * @generated
	 */
	void setIsNull(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsNull <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNull()
	 * @see #isIsNull()
	 * @see #setIsNull(boolean)
	 * @generated
	 */
	void unsetIsNull();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsNull <em>Is Null</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Null</em>' attribute is set.
	 * @see #unsetIsNull()
	 * @see #isIsNull()
	 * @see #setIsNull(boolean)
	 * @generated
	 */
	boolean isSetIsNull();

	/**
	 * Returns the value of the '<em><b>Initials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initials of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initials</em>' attribute.
	 * @see #setInitials(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Initials()
	 * @model dataType="net.certware.planning.mspdi.InitialsType"
	 *        extendedMetaData="kind='element' name='Initials' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInitials();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getInitials <em>Initials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initials</em>' attribute.
	 * @see #getInitials()
	 * @generated
	 */
	void setInitials(String value);

	/**
	 * Returns the value of the '<em><b>Phonetics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The phonetic spelling of the resource name.  For use with Japanese only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phonetics</em>' attribute.
	 * @see #setPhonetics(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Phonetics()
	 * @model dataType="net.certware.planning.mspdi.PhoneticsType"
	 *        extendedMetaData="kind='element' name='Phonetics' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhonetics();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getPhonetics <em>Phonetics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phonetics</em>' attribute.
	 * @see #getPhonetics()
	 * @generated
	 */
	void setPhonetics(String value);

	/**
	 * Returns the value of the '<em><b>NT Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NT account associated with the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NT Account</em>' attribute.
	 * @see #setNTAccount(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_NTAccount()
	 * @model dataType="net.certware.planning.mspdi.NTAccountType"
	 *        extendedMetaData="kind='element' name='NTAccount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNTAccount();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getNTAccount <em>NT Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NT Account</em>' attribute.
	 * @see #getNTAccount()
	 * @generated
	 */
	void setNTAccount(String value);

	/**
	 * Returns the value of the '<em><b>Material Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit of measure for the material resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material Label</em>' attribute.
	 * @see #setMaterialLabel(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_MaterialLabel()
	 * @model dataType="net.certware.planning.mspdi.MaterialLabelType"
	 *        extendedMetaData="kind='element' name='MaterialLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaterialLabel();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getMaterialLabel <em>Material Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Label</em>' attribute.
	 * @see #getMaterialLabel()
	 * @generated
	 */
	void setMaterialLabel(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code or other information about the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Code()
	 * @model dataType="net.certware.planning.mspdi.CodeType"
	 *        extendedMetaData="kind='element' name='Code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The group to which the resource belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Group()
	 * @model dataType="net.certware.planning.mspdi.GroupType"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Work Group</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.WorkGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of workgroup to which the resource belongs. Values are: 0=Default, 1=None, 2=Email, 3=Web.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Group</em>' attribute.
	 * @see net.certware.planning.mspdi.WorkGroupType
	 * @see #isSetWorkGroup()
	 * @see #unsetWorkGroup()
	 * @see #setWorkGroup(WorkGroupType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_WorkGroup()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='WorkGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	WorkGroupType getWorkGroup();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getWorkGroup <em>Work Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Group</em>' attribute.
	 * @see net.certware.planning.mspdi.WorkGroupType
	 * @see #isSetWorkGroup()
	 * @see #unsetWorkGroup()
	 * @see #getWorkGroup()
	 * @generated
	 */
	void setWorkGroup(WorkGroupType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getWorkGroup <em>Work Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkGroup()
	 * @see #getWorkGroup()
	 * @see #setWorkGroup(WorkGroupType)
	 * @generated
	 */
	void unsetWorkGroup();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getWorkGroup <em>Work Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Group</em>' attribute is set.
	 * @see #unsetWorkGroup()
	 * @see #getWorkGroup()
	 * @see #setWorkGroup(WorkGroupType)
	 * @generated
	 */
	boolean isSetWorkGroup();

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The email address of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_EmailAddress()
	 * @model dataType="net.certware.planning.mspdi.EmailAddressType"
	 *        extendedMetaData="kind='element' name='EmailAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the hyperlink associated with the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink</em>' attribute.
	 * @see #setHyperlink(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Hyperlink()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkType1"
	 *        extendedMetaData="kind='element' name='Hyperlink' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlink();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getHyperlink <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink</em>' attribute.
	 * @see #getHyperlink()
	 * @generated
	 */
	void setHyperlink(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hyperlink associated with the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink Address</em>' attribute.
	 * @see #setHyperlinkAddress(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_HyperlinkAddress()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkAddressType"
	 *        extendedMetaData="kind='element' name='HyperlinkAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlinkAddress();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getHyperlinkAddress <em>Hyperlink Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Address</em>' attribute.
	 * @see #getHyperlinkAddress()
	 * @generated
	 */
	void setHyperlinkAddress(String value);

	/**
	 * Returns the value of the '<em><b>Hyperlink Sub Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document bookmark of the hyperlink associated with the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink Sub Address</em>' attribute.
	 * @see #setHyperlinkSubAddress(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_HyperlinkSubAddress()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkSubAddressType"
	 *        extendedMetaData="kind='element' name='HyperlinkSubAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlinkSubAddress();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Sub Address</em>' attribute.
	 * @see #getHyperlinkSubAddress()
	 * @generated
	 */
	void setHyperlinkSubAddress(String value);

	/**
	 * Returns the value of the '<em><b>Max Units</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of units that the resource is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Units</em>' attribute.
	 * @see #isSetMaxUnits()
	 * @see #unsetMaxUnits()
	 * @see #setMaxUnits(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_MaxUnits()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='MaxUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMaxUnits();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getMaxUnits <em>Max Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Units</em>' attribute.
	 * @see #isSetMaxUnits()
	 * @see #unsetMaxUnits()
	 * @see #getMaxUnits()
	 * @generated
	 */
	void setMaxUnits(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getMaxUnits <em>Max Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxUnits()
	 * @see #getMaxUnits()
	 * @see #setMaxUnits(float)
	 * @generated
	 */
	void unsetMaxUnits();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getMaxUnits <em>Max Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Units</em>' attribute is set.
	 * @see #unsetMaxUnits()
	 * @see #getMaxUnits()
	 * @see #setMaxUnits(float)
	 * @generated
	 */
	boolean isSetMaxUnits();

	/**
	 * Returns the value of the '<em><b>Peak Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The largest number of units assigned to the resource at any time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peak Units</em>' attribute.
	 * @see #isSetPeakUnits()
	 * @see #unsetPeakUnits()
	 * @see #setPeakUnits(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_PeakUnits()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='PeakUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	float getPeakUnits();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getPeakUnits <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Units</em>' attribute.
	 * @see #isSetPeakUnits()
	 * @see #unsetPeakUnits()
	 * @see #getPeakUnits()
	 * @generated
	 */
	void setPeakUnits(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getPeakUnits <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeakUnits()
	 * @see #getPeakUnits()
	 * @see #setPeakUnits(float)
	 * @generated
	 */
	void unsetPeakUnits();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getPeakUnits <em>Peak Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Peak Units</em>' attribute is set.
	 * @see #unsetPeakUnits()
	 * @see #getPeakUnits()
	 * @see #setPeakUnits(float)
	 * @generated
	 */
	boolean isSetPeakUnits();

	/**
	 * Returns the value of the '<em><b>Over Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource is overallocated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Over Allocated</em>' attribute.
	 * @see #isSetOverAllocated()
	 * @see #unsetOverAllocated()
	 * @see #setOverAllocated(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_OverAllocated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='OverAllocated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOverAllocated();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isOverAllocated <em>Over Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Allocated</em>' attribute.
	 * @see #isSetOverAllocated()
	 * @see #unsetOverAllocated()
	 * @see #isOverAllocated()
	 * @generated
	 */
	void setOverAllocated(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isOverAllocated <em>Over Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverAllocated()
	 * @see #isOverAllocated()
	 * @see #setOverAllocated(boolean)
	 * @generated
	 */
	void unsetOverAllocated();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isOverAllocated <em>Over Allocated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Over Allocated</em>' attribute is set.
	 * @see #unsetOverAllocated()
	 * @see #isOverAllocated()
	 * @see #setOverAllocated(boolean)
	 * @generated
	 */
	boolean isSetOverAllocated();

	/**
	 * Returns the value of the '<em><b>Available From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first date that the resource is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available From</em>' attribute.
	 * @see #setAvailableFrom(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_AvailableFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AvailableFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAvailableFrom();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getAvailableFrom <em>Available From</em>}' attribute.
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
	 * The last date the resource is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available To</em>' attribute.
	 * @see #setAvailableTo(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_AvailableTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AvailableTo' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAvailableTo();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getAvailableTo <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To</em>' attribute.
	 * @see #getAvailableTo()
	 * @generated
	 */
	void setAvailableTo(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled start date of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getStart <em>Start</em>}' attribute.
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
	 * The scheduled finish date of the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' attribute.
	 * @see #setFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Finish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Finish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getFinish <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' attribute.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Can Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource can be leveled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Level</em>' attribute.
	 * @see #isSetCanLevel()
	 * @see #unsetCanLevel()
	 * @see #setCanLevel(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_CanLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='CanLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCanLevel();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isCanLevel <em>Can Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Level</em>' attribute.
	 * @see #isSetCanLevel()
	 * @see #unsetCanLevel()
	 * @see #isCanLevel()
	 * @generated
	 */
	void setCanLevel(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isCanLevel <em>Can Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCanLevel()
	 * @see #isCanLevel()
	 * @see #setCanLevel(boolean)
	 * @generated
	 */
	void unsetCanLevel();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isCanLevel <em>Can Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Can Level</em>' attribute is set.
	 * @see #unsetCanLevel()
	 * @see #isCanLevel()
	 * @see #setCanLevel(boolean)
	 * @generated
	 */
	boolean isSetCanLevel();

	/**
	 * Returns the value of the '<em><b>Accrue At</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.AccrueAtType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How cost is accrued against the resource. Values are: 1=Start, 2=End, 3=Prorated, $New4=Invalid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accrue At</em>' attribute.
	 * @see net.certware.planning.mspdi.AccrueAtType
	 * @see #isSetAccrueAt()
	 * @see #unsetAccrueAt()
	 * @see #setAccrueAt(AccrueAtType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_AccrueAt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AccrueAt' namespace='##targetNamespace'"
	 * @generated
	 */
	AccrueAtType getAccrueAt();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getAccrueAt <em>Accrue At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accrue At</em>' attribute.
	 * @see net.certware.planning.mspdi.AccrueAtType
	 * @see #isSetAccrueAt()
	 * @see #unsetAccrueAt()
	 * @see #getAccrueAt()
	 * @generated
	 */
	void setAccrueAt(AccrueAtType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getAccrueAt <em>Accrue At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccrueAt()
	 * @see #getAccrueAt()
	 * @see #setAccrueAt(AccrueAtType)
	 * @generated
	 */
	void unsetAccrueAt();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getAccrueAt <em>Accrue At</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accrue At</em>' attribute is set.
	 * @see #unsetAccrueAt()
	 * @see #getAccrueAt()
	 * @see #setAccrueAt(AccrueAtType)
	 * @generated
	 */
	boolean isSetAccrueAt();

	/**
	 * Returns the value of the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total work assigned to the resource across all assigned tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work</em>' attribute.
	 * @see #setWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Work()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Work' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getWork <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' attribute.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Regular Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of non-overtime work assigned to the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regular Work</em>' attribute.
	 * @see #setRegularWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_RegularWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RegularWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRegularWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getRegularWork <em>Regular Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Work</em>' attribute.
	 * @see #getRegularWork()
	 * @generated
	 */
	void setRegularWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of overtime work assigned to the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Work</em>' attribute.
	 * @see #setOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_OvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='OvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getOvertimeWork <em>Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Work</em>' attribute.
	 * @see #getOvertimeWork()
	 * @generated
	 */
	void setOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of actual work performed by the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Work</em>' attribute.
	 * @see #setActualWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ActualWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getActualWork <em>Actual Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Work</em>' attribute.
	 * @see #getActualWork()
	 * @generated
	 */
	void setActualWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of remaining work required to complete all assigned tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Work</em>' attribute.
	 * @see #setRemainingWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_RemainingWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RemainingWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRemainingWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getRemainingWork <em>Remaining Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Work</em>' attribute.
	 * @see #getRemainingWork()
	 * @generated
	 */
	void setRemainingWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of actual overtime work performed by the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Work</em>' attribute.
	 * @see #setActualOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ActualOvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualOvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeWork <em>Actual Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Work</em>' attribute.
	 * @see #getActualOvertimeWork()
	 * @generated
	 */
	void setActualOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of remaining overtime work required to complete all tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Overtime Work</em>' attribute.
	 * @see #setRemainingOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_RemainingOvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RemainingOvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRemainingOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Overtime Work</em>' attribute.
	 * @see #getRemainingOvertimeWork()
	 * @generated
	 */
	void setRemainingOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Percent Work Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of work completed across all tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Work Complete</em>' attribute.
	 * @see #setPercentWorkComplete(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_PercentWorkComplete()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='PercentWorkComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPercentWorkComplete();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getPercentWorkComplete <em>Percent Work Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Work Complete</em>' attribute.
	 * @see #getPercentWorkComplete()
	 * @generated
	 */
	void setPercentWorkComplete(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Standard Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The standard rate of the resource. This value is as of the current date if a rate table exists for the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Rate</em>' attribute.
	 * @see #setStandardRate(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_StandardRate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='StandardRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getStandardRate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getStandardRate <em>Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Rate</em>' attribute.
	 * @see #getStandardRate()
	 * @generated
	 */
	void setStandardRate(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Standard Rate Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.StandardRateFormatType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units used by Microsoft Project to display the standard rate.  1=m, 2=h, 3=d, 4=w, 5=mo, 7=y, 8=material resource rate (or blank symbol specified).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.StandardRateFormatType1
	 * @see #isSetStandardRateFormat()
	 * @see #unsetStandardRateFormat()
	 * @see #setStandardRateFormat(StandardRateFormatType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_StandardRateFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StandardRateFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardRateFormatType1 getStandardRateFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getStandardRateFormat <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.StandardRateFormatType1
	 * @see #isSetStandardRateFormat()
	 * @see #unsetStandardRateFormat()
	 * @see #getStandardRateFormat()
	 * @generated
	 */
	void setStandardRateFormat(StandardRateFormatType1 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getStandardRateFormat <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandardRateFormat()
	 * @see #getStandardRateFormat()
	 * @see #setStandardRateFormat(StandardRateFormatType1)
	 * @generated
	 */
	void unsetStandardRateFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getStandardRateFormat <em>Standard Rate Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standard Rate Format</em>' attribute is set.
	 * @see #unsetStandardRateFormat()
	 * @see #getStandardRateFormat()
	 * @see #setStandardRateFormat(StandardRateFormatType1)
	 * @generated
	 */
	boolean isSetStandardRateFormat();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total project cost for the resource across all assigned tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Cost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='Cost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Overtime Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The overtime rate of the resource. This value is as of the current date if a rate table exists for the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Rate</em>' attribute.
	 * @see #setOvertimeRate(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_OvertimeRate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='OvertimeRate' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOvertimeRate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getOvertimeRate <em>Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Rate</em>' attribute.
	 * @see #getOvertimeRate()
	 * @generated
	 */
	void setOvertimeRate(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Overtime Rate Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.OvertimeRateFormatType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units used by Microsoft Project to display the overtime rate.  1=m, 2=h, 3=d, 4=w, 5=mo, 7=y.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
	 * @see #isSetOvertimeRateFormat()
	 * @see #unsetOvertimeRateFormat()
	 * @see #setOvertimeRateFormat(OvertimeRateFormatType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_OvertimeRateFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='OvertimeRateFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	OvertimeRateFormatType1 getOvertimeRateFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getOvertimeRateFormat <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Rate Format</em>' attribute.
	 * @see net.certware.planning.mspdi.OvertimeRateFormatType1
	 * @see #isSetOvertimeRateFormat()
	 * @see #unsetOvertimeRateFormat()
	 * @see #getOvertimeRateFormat()
	 * @generated
	 */
	void setOvertimeRateFormat(OvertimeRateFormatType1 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getOvertimeRateFormat <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOvertimeRateFormat()
	 * @see #getOvertimeRateFormat()
	 * @see #setOvertimeRateFormat(OvertimeRateFormatType1)
	 * @generated
	 */
	void unsetOvertimeRateFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getOvertimeRateFormat <em>Overtime Rate Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overtime Rate Format</em>' attribute is set.
	 * @see #unsetOvertimeRateFormat()
	 * @see #getOvertimeRateFormat()
	 * @see #setOvertimeRateFormat(OvertimeRateFormatType1)
	 * @generated
	 */
	boolean isSetOvertimeRateFormat();

	/**
	 * Returns the value of the '<em><b>Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total overtime cost for the resource including actual and remaining overtime costs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Cost</em>' attribute.
	 * @see #setOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_OvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='OvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getOvertimeCost <em>Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Cost</em>' attribute.
	 * @see #getOvertimeCost()
	 * @generated
	 */
	void setOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cost Per Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost per use of the resource. This value is as of the current date if a rate table exists for the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Per Use</em>' attribute.
	 * @see #setCostPerUse(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_CostPerUse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='CostPerUse' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCostPerUse();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCostPerUse <em>Cost Per Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Use</em>' attribute.
	 * @see #getCostPerUse()
	 * @generated
	 */
	void setCostPerUse(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost incurred by the resource across all assigned tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #setActualCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ActualCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ActualCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getActualCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Cost</em>' attribute.
	 * @see #getActualCost()
	 * @generated
	 */
	void setActualCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual overtime cost incurred by the resource across all assigned tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Cost</em>' attribute.
	 * @see #setActualOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ActualOvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ActualOvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getActualOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeCost <em>Actual Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Cost</em>' attribute.
	 * @see #getActualOvertimeCost()
	 * @generated
	 */
	void setActualOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining projected cost of the resource to complete all assigned tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Cost</em>' attribute.
	 * @see #setRemainingCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_RemainingCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='RemainingCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getRemainingCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getRemainingCost <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Cost</em>' attribute.
	 * @see #getRemainingCost()
	 * @generated
	 */
	void setRemainingCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Remaining Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining projected overtime cost of the resource to complete all assigned tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Overtime Cost</em>' attribute.
	 * @see #setRemainingOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_RemainingOvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='RemainingOvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getRemainingOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Overtime Cost</em>' attribute.
	 * @see #getRemainingOvertimeCost()
	 * @generated
	 */
	void setRemainingOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Work Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The difference between the baseline work and the work as minutes x 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Variance</em>' attribute.
	 * @see #isSetWorkVariance()
	 * @see #unsetWorkVariance()
	 * @see #setWorkVariance(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_WorkVariance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='WorkVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWorkVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getWorkVariance <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Variance</em>' attribute.
	 * @see #isSetWorkVariance()
	 * @see #unsetWorkVariance()
	 * @see #getWorkVariance()
	 * @generated
	 */
	void setWorkVariance(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getWorkVariance <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkVariance()
	 * @see #getWorkVariance()
	 * @see #setWorkVariance(float)
	 * @generated
	 */
	void unsetWorkVariance();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getWorkVariance <em>Work Variance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Variance</em>' attribute is set.
	 * @see #unsetWorkVariance()
	 * @see #getWorkVariance()
	 * @see #setWorkVariance(float)
	 * @generated
	 */
	boolean isSetWorkVariance();

	/**
	 * Returns the value of the '<em><b>Cost Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The difference between the baseline cost and the cost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Variance</em>' attribute.
	 * @see #isSetCostVariance()
	 * @see #unsetCostVariance()
	 * @see #setCostVariance(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_CostVariance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='CostVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	float getCostVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCostVariance <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Variance</em>' attribute.
	 * @see #isSetCostVariance()
	 * @see #unsetCostVariance()
	 * @see #getCostVariance()
	 * @generated
	 */
	void setCostVariance(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCostVariance <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostVariance()
	 * @see #getCostVariance()
	 * @see #setCostVariance(float)
	 * @generated
	 */
	void unsetCostVariance();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getCostVariance <em>Cost Variance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Variance</em>' attribute is set.
	 * @see #unsetCostVariance()
	 * @see #getCostVariance()
	 * @see #setCostVariance(float)
	 * @generated
	 */
	boolean isSetCostVariance();

	/**
	 * Returns the value of the '<em><b>SV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earned value schedule variance, through the project status date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV</em>' attribute.
	 * @see #isSetSV()
	 * @see #unsetSV()
	 * @see #setSV(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_SV()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='SV' namespace='##targetNamespace'"
	 * @generated
	 */
	float getSV();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV</em>' attribute.
	 * @see #isSetSV()
	 * @see #unsetSV()
	 * @see #getSV()
	 * @generated
	 */
	void setSV(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getSV <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSV()
	 * @see #getSV()
	 * @see #setSV(float)
	 * @generated
	 */
	void unsetSV();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getSV <em>SV</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SV</em>' attribute is set.
	 * @see #unsetSV()
	 * @see #getSV()
	 * @see #setSV(float)
	 * @generated
	 */
	boolean isSetSV();

	/**
	 * Returns the value of the '<em><b>CV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earned value cost variance, through the project status date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CV</em>' attribute.
	 * @see #isSetCV()
	 * @see #unsetCV()
	 * @see #setCV(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_CV()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='CV' namespace='##targetNamespace'"
	 * @generated
	 */
	float getCV();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCV <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CV</em>' attribute.
	 * @see #isSetCV()
	 * @see #unsetCV()
	 * @see #getCV()
	 * @generated
	 */
	void setCV(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCV <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCV()
	 * @see #getCV()
	 * @see #setCV(float)
	 * @generated
	 */
	void unsetCV();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getCV <em>CV</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CV</em>' attribute is set.
	 * @see #unsetCV()
	 * @see #getCV()
	 * @see #setCV(float)
	 * @generated
	 */
	boolean isSetCV();

	/**
	 * Returns the value of the '<em><b>ACWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost of the work performed by the resource for the project to-date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ACWP</em>' attribute.
	 * @see #isSetACWP()
	 * @see #unsetACWP()
	 * @see #setACWP(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ACWP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='ACWP' namespace='##targetNamespace'"
	 * @generated
	 */
	float getACWP();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getACWP <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACWP</em>' attribute.
	 * @see #isSetACWP()
	 * @see #unsetACWP()
	 * @see #getACWP()
	 * @generated
	 */
	void setACWP(float value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getACWP <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetACWP()
	 * @see #getACWP()
	 * @see #setACWP(float)
	 * @generated
	 */
	void unsetACWP();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getACWP <em>ACWP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ACWP</em>' attribute is set.
	 * @see #unsetACWP()
	 * @see #getACWP()
	 * @see #setACWP(float)
	 * @generated
	 */
	boolean isSetACWP();

	/**
	 * Returns the value of the '<em><b>Calendar UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource calendar.Refers to a valid UID in the Calendars element of the Microsoft Project XML Schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calendar UID</em>' attribute.
	 * @see #setCalendarUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_CalendarUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='CalendarUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCalendarUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCalendarUID <em>Calendar UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar UID</em>' attribute.
	 * @see #getCalendarUID()
	 * @generated
	 */
	void setCalendarUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text notes associated with the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>BCWS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The budget cost of work scheduled for the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCWS</em>' attribute.
	 * @see #isSetBCWS()
	 * @see #unsetBCWS()
	 * @see #setBCWS(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_BCWS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWS' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWS();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getBCWS <em>BCWS</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getBCWS <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWS()
	 * @see #getBCWS()
	 * @see #setBCWS(float)
	 * @generated
	 */
	void unsetBCWS();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getBCWS <em>BCWS</em>}' attribute is set.
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
	 * The budgeted cost of of the work performed by the resource for the project to-date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCWP</em>' attribute.
	 * @see #isSetBCWP()
	 * @see #unsetBCWP()
	 * @see #setBCWP(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_BCWP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWP' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWP();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getBCWP <em>BCWP</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getBCWP <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWP()
	 * @see #getBCWP()
	 * @see #setBCWP(float)
	 * @generated
	 */
	void unsetBCWP();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getBCWP <em>BCWP</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Generic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource is generic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Generic</em>' attribute.
	 * @see #isSetIsGeneric()
	 * @see #unsetIsGeneric()
	 * @see #setIsGeneric(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_IsGeneric()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsGeneric' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsGeneric();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsGeneric <em>Is Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Generic</em>' attribute.
	 * @see #isSetIsGeneric()
	 * @see #unsetIsGeneric()
	 * @see #isIsGeneric()
	 * @generated
	 */
	void setIsGeneric(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsGeneric <em>Is Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsGeneric()
	 * @see #isIsGeneric()
	 * @see #setIsGeneric(boolean)
	 * @generated
	 */
	void unsetIsGeneric();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsGeneric <em>Is Generic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Generic</em>' attribute is set.
	 * @see #unsetIsGeneric()
	 * @see #isIsGeneric()
	 * @see #setIsGeneric(boolean)
	 * @generated
	 */
	boolean isSetIsGeneric();

	/**
	 * Returns the value of the '<em><b>Is Inactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource is set to inactive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Inactive</em>' attribute.
	 * @see #isSetIsInactive()
	 * @see #unsetIsInactive()
	 * @see #setIsInactive(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_IsInactive()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsInactive' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsInactive();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsInactive <em>Is Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inactive</em>' attribute.
	 * @see #isSetIsInactive()
	 * @see #unsetIsInactive()
	 * @see #isIsInactive()
	 * @generated
	 */
	void setIsInactive(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsInactive <em>Is Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInactive()
	 * @see #isIsInactive()
	 * @see #setIsInactive(boolean)
	 * @generated
	 */
	void unsetIsInactive();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsInactive <em>Is Inactive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Inactive</em>' attribute is set.
	 * @see #unsetIsInactive()
	 * @see #isIsInactive()
	 * @see #setIsInactive(boolean)
	 * @generated
	 */
	boolean isSetIsInactive();

	/**
	 * Returns the value of the '<em><b>Is Enterprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource is an Enterprise resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Enterprise</em>' attribute.
	 * @see #isSetIsEnterprise()
	 * @see #unsetIsEnterprise()
	 * @see #setIsEnterprise(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_IsEnterprise()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsEnterprise' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsEnterprise();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsEnterprise <em>Is Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enterprise</em>' attribute.
	 * @see #isSetIsEnterprise()
	 * @see #unsetIsEnterprise()
	 * @see #isIsEnterprise()
	 * @generated
	 */
	void setIsEnterprise(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsEnterprise <em>Is Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsEnterprise()
	 * @see #isIsEnterprise()
	 * @see #setIsEnterprise(boolean)
	 * @generated
	 */
	void unsetIsEnterprise();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsEnterprise <em>Is Enterprise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Enterprise</em>' attribute is set.
	 * @see #unsetIsEnterprise()
	 * @see #isIsEnterprise()
	 * @see #setIsEnterprise(boolean)
	 * @generated
	 */
	boolean isSetIsEnterprise();

	/**
	 * Returns the value of the '<em><b>Booking Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.BookingTypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The booking type of the resource. 1=Commited, 2=Proposed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Booking Type</em>' attribute.
	 * @see net.certware.planning.mspdi.BookingTypeType1
	 * @see #isSetBookingType()
	 * @see #unsetBookingType()
	 * @see #setBookingType(BookingTypeType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_BookingType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='BookingType' namespace='##targetNamespace'"
	 * @generated
	 */
	BookingTypeType1 getBookingType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getBookingType <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Type</em>' attribute.
	 * @see net.certware.planning.mspdi.BookingTypeType1
	 * @see #isSetBookingType()
	 * @see #unsetBookingType()
	 * @see #getBookingType()
	 * @generated
	 */
	void setBookingType(BookingTypeType1 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#getBookingType <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBookingType()
	 * @see #getBookingType()
	 * @see #setBookingType(BookingTypeType1)
	 * @generated
	 */
	void unsetBookingType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#getBookingType <em>Booking Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Booking Type</em>' attribute is set.
	 * @see #unsetBookingType()
	 * @see #getBookingType()
	 * @see #setBookingType(BookingTypeType1)
	 * @generated
	 */
	boolean isSetBookingType();

	/**
	 * Returns the value of the '<em><b>Actual Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration through which actual work is protected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Work Protected</em>' attribute.
	 * @see #setActualWorkProtected(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ActualWorkProtected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualWorkProtected' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualWorkProtected();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getActualWorkProtected <em>Actual Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Work Protected</em>' attribute.
	 * @see #getActualWorkProtected()
	 * @generated
	 */
	void setActualWorkProtected(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Overtime Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration through which actual overtime work is protected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Work Protected</em>' attribute.
	 * @see #setActualOvertimeWorkProtected(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ActualOvertimeWorkProtected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualOvertimeWorkProtected' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualOvertimeWorkProtected();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Work Protected</em>' attribute.
	 * @see #getActualOvertimeWorkProtected()
	 * @generated
	 */
	void setActualOvertimeWorkProtected(Duration value);

	/**
	 * Returns the value of the '<em><b>Active Directory GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Active Directory GUID for the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Directory GUID</em>' attribute.
	 * @see #setActiveDirectoryGUID(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ActiveDirectoryGUID()
	 * @model dataType="net.certware.planning.mspdi.ActiveDirectoryGUIDType"
	 *        extendedMetaData="kind='element' name='ActiveDirectoryGUID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getActiveDirectoryGUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getActiveDirectoryGUID <em>Active Directory GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Directory GUID</em>' attribute.
	 * @see #getActiveDirectoryGUID()
	 * @generated
	 */
	void setActiveDirectoryGUID(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.ExtendedAttributeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of an extended attribute.  Two pieces of data are necessary - a pointer back to the extended attribute table which is specified either by the unique ID or the Field ID, and the value which is specified either with the value, or a pointer back to the value list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attribute</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_ExtendedAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtendedAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtendedAttributeType1> getExtendedAttribute();

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.BaselineType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The baseline values for the resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baseline</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Baseline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Baseline' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BaselineType1> getBaseline();

	/**
	 * Returns the value of the '<em><b>Outline Code</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.OutlineCodeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of an outline code.  Two pieces of data are necessary - a pointer to the outline code table that is specified by the FieldID, and the value that is specified either by the ValueID or ValueGUID pointer to the value list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outline Code</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_OutlineCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OutlineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutlineCodeType1> getOutlineCode();

	/**
	 * Returns the value of the '<em><b>Is Cost Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource is a cost resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Cost Resource</em>' attribute.
	 * @see #isSetIsCostResource()
	 * @see #unsetIsCostResource()
	 * @see #setIsCostResource(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_IsCostResource()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsCostResource' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsCostResource();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsCostResource <em>Is Cost Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cost Resource</em>' attribute.
	 * @see #isSetIsCostResource()
	 * @see #unsetIsCostResource()
	 * @see #isIsCostResource()
	 * @generated
	 */
	void setIsCostResource(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsCostResource <em>Is Cost Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCostResource()
	 * @see #isIsCostResource()
	 * @see #setIsCostResource(boolean)
	 * @generated
	 */
	void unsetIsCostResource();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsCostResource <em>Is Cost Resource</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Cost Resource</em>' attribute is set.
	 * @see #unsetIsCostResource()
	 * @see #isIsCostResource()
	 * @see #setIsCostResource(boolean)
	 * @generated
	 */
	boolean isSetIsCostResource();

	/**
	 * Returns the value of the '<em><b>Assn Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the assignment owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assn Owner</em>' attribute.
	 * @see #setAssnOwner(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_AssnOwner()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AssnOwner' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssnOwner();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getAssnOwner <em>Assn Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assn Owner</em>' attribute.
	 * @see #getAssnOwner()
	 * @generated
	 */
	void setAssnOwner(String value);

	/**
	 * Returns the value of the '<em><b>Assn Owner Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GUID of the assignment owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assn Owner Guid</em>' attribute.
	 * @see #setAssnOwnerGuid(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_AssnOwnerGuid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AssnOwnerGuid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssnOwnerGuid();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getAssnOwnerGuid <em>Assn Owner Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assn Owner Guid</em>' attribute.
	 * @see #getAssnOwnerGuid()
	 * @generated
	 */
	void setAssnOwnerGuid(String value);

	/**
	 * Returns the value of the '<em><b>Is Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the resource is a budget resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Budget</em>' attribute.
	 * @see #isSetIsBudget()
	 * @see #unsetIsBudget()
	 * @see #setIsBudget(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_IsBudget()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsBudget' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsBudget();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsBudget <em>Is Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Budget</em>' attribute.
	 * @see #isSetIsBudget()
	 * @see #unsetIsBudget()
	 * @see #isIsBudget()
	 * @generated
	 */
	void setIsBudget(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsBudget <em>Is Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBudget()
	 * @see #isIsBudget()
	 * @see #setIsBudget(boolean)
	 * @generated
	 */
	void unsetIsBudget();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.ResourceType#isIsBudget <em>Is Budget</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Budget</em>' attribute is set.
	 * @see #unsetIsBudget()
	 * @see #isIsBudget()
	 * @see #setIsBudget(boolean)
	 * @generated
	 */
	boolean isSetIsBudget();

	/**
	 * Returns the value of the '<em><b>Availability Periods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of periods during which the resource is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Periods</em>' containment reference.
	 * @see #setAvailabilityPeriods(AvailabilityPeriodsType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_AvailabilityPeriods()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AvailabilityPeriods' namespace='##targetNamespace'"
	 * @generated
	 */
	AvailabilityPeriodsType getAvailabilityPeriods();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getAvailabilityPeriods <em>Availability Periods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Periods</em>' containment reference.
	 * @see #getAvailabilityPeriods()
	 * @generated
	 */
	void setAvailabilityPeriods(AvailabilityPeriodsType value);

	/**
	 * Returns the value of the '<em><b>Rates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of periods and the rates associated with each one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rates</em>' containment reference.
	 * @see #setRates(RatesType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_Rates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rates' namespace='##targetNamespace'"
	 * @generated
	 */
	RatesType getRates();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.ResourceType#getRates <em>Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rates</em>' containment reference.
	 * @see #getRates()
	 * @generated
	 */
	void setRates(RatesType value);

	/**
	 * Returns the value of the '<em><b>Timephased Data</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.TimephasedDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time phased data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timephased Data</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getResourceType_TimephasedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimephasedData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimephasedDataType> getTimephasedData();

} // ResourceType
