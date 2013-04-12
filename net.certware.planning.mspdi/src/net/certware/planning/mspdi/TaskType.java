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
 * A representation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getID <em>ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getCreateDate <em>Create Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getContact <em>Contact</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getWBS <em>WBS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getWBSLevel <em>WBS Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getOutlineNumber <em>Outline Number</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getPriority <em>Priority</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getDurationFormat <em>Duration Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getStop <em>Stop</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getResume <em>Resume</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isResumeValid <em>Resume Valid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isEffortDriven <em>Effort Driven</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isRecurring <em>Recurring</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isOverAllocated <em>Over Allocated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isEstimated <em>Estimated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isMilestone <em>Milestone</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isCritical <em>Critical</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isIsSubproject <em>Is Subproject</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isIsSubprojectReadOnly <em>Is Subproject Read Only</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getSubprojectName <em>Subproject Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isExternalTask <em>External Task</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getExternalTaskProject <em>External Task Project</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getStartVariance <em>Start Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getFinishVariance <em>Finish Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getWorkVariance <em>Work Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getFreeSlack <em>Free Slack</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getTotalSlack <em>Total Slack</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getFixedCost <em>Fixed Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getFixedCostAccrual <em>Fixed Cost Accrual</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getPercentWorkComplete <em>Percent Work Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getOvertimeCost <em>Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getOvertimeWork <em>Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualOvertimeCost <em>Actual Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualWork <em>Actual Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualOvertimeWork <em>Actual Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getRegularWork <em>Regular Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getRemainingDuration <em>Remaining Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getRemainingWork <em>Remaining Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getACWP <em>ACWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getCV <em>CV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getCalendarUID <em>Calendar UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getConstraintDate <em>Constraint Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isLevelAssignments <em>Level Assignments</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isLevelingCanSplit <em>Leveling Can Split</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getLevelingDelay <em>Leveling Delay</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getLevelingDelayFormat <em>Leveling Delay Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getPreLeveledStart <em>Pre Leveled Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getPreLeveledFinish <em>Pre Leveled Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getHyperlinkAddress <em>Hyperlink Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isIgnoreResourceCalendar <em>Ignore Resource Calendar</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getNotes <em>Notes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isHideBar <em>Hide Bar</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isRollup <em>Rollup</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getPhysicalPercentComplete <em>Physical Percent Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getEarnedValueMethod <em>Earned Value Method</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getPredecessorLink <em>Predecessor Link</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualWorkProtected <em>Actual Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getOutlineCode <em>Outline Code</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#isIsPublished <em>Is Published</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getStatusManager <em>Status Manager</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getCommitmentStart <em>Commitment Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getCommitmentFinish <em>Commitment Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getCommitmentType <em>Commitment Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.TaskType#getTimephasedData <em>Timephased Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType()
 * @model extendedMetaData="name='Task_._type' kind='elementOnly'"
 * @generated
 */
public interface TaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique ID of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_UID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='UID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getUID <em>UID</em>}' attribute.
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
	 * The position identifier of the task within the list of tasks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getID <em>ID</em>}' attribute.
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
	 * The name of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Name()
	 * @model dataType="net.certware.planning.mspdi.NameType"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.TypeType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of task. Values are: 0=Fixed Units, 1=Fixed Duration, 2=Fixed Work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType3)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType3 getType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.planning.mspdi.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType3 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Null</em>' attribute.
	 * @see #isSetIsNull()
	 * @see #unsetIsNull()
	 * @see #setIsNull(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_IsNull()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsNull' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsNull();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsNull <em>Is Null</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsNull <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNull()
	 * @see #isIsNull()
	 * @see #setIsNull(boolean)
	 * @generated
	 */
	void unsetIsNull();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isIsNull <em>Is Null</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Create Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the task was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Date</em>' attribute.
	 * @see #setCreateDate(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_CreateDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreateDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreateDate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getCreateDate <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Date</em>' attribute.
	 * @see #getCreateDate()
	 * @generated
	 */
	void setCreateDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contact person for the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Contact()
	 * @model dataType="net.certware.planning.mspdi.ContactType"
	 *        extendedMetaData="kind='element' name='Contact' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(String value);

	/**
	 * Returns the value of the '<em><b>WBS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The work breakdown structure code of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WBS</em>' attribute.
	 * @see #setWBS(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_WBS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='WBS' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWBS();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getWBS <em>WBS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WBS</em>' attribute.
	 * @see #getWBS()
	 * @generated
	 */
	void setWBS(String value);

	/**
	 * Returns the value of the '<em><b>WBS Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rightmost WBS level of the task. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WBS Level</em>' attribute.
	 * @see #setWBSLevel(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_WBSLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='WBSLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWBSLevel();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getWBSLevel <em>WBS Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WBS Level</em>' attribute.
	 * @see #getWBSLevel()
	 * @generated
	 */
	void setWBSLevel(String value);

	/**
	 * Returns the value of the '<em><b>Outline Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outline number of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outline Number</em>' attribute.
	 * @see #setOutlineNumber(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_OutlineNumber()
	 * @model dataType="net.certware.planning.mspdi.OutlineNumberType"
	 *        extendedMetaData="kind='element' name='OutlineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutlineNumber();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getOutlineNumber <em>Outline Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Number</em>' attribute.
	 * @see #getOutlineNumber()
	 * @generated
	 */
	void setOutlineNumber(String value);

	/**
	 * Returns the value of the '<em><b>Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The outline level of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outline Level</em>' attribute.
	 * @see #setOutlineLevel(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_OutlineLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='OutlineLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOutlineLevel();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getOutlineLevel <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Level</em>' attribute.
	 * @see #getOutlineLevel()
	 * @generated
	 */
	void setOutlineLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The priority of the task from 0 to 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Priority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Priority' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPriority();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scheduled start date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Start()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getStart <em>Start</em>}' attribute.
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
	 * The scheduled finish date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' attribute.
	 * @see #setFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Finish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Finish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getFinish <em>Finish</em>}' attribute.
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
	 * The planned duration of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Duration Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.DurationFormatType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format for expressing the Duration of the Task.  Values are: 3=m, 4=em, 5=h, 6=eh, 7=d, 8=ed, 9=w, 10=ew, 11=mo, 12=emo, 19=%, 20=e%, 21=null, 35=m?, 36=em?, 37=h?, 38=eh?, 39=d?, 40=ed?, 41=w?, 42=ew?, 43=mo?, 44=emo?, 51=%?, 52=e%? and 53=null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration Format</em>' attribute.
	 * @see net.certware.planning.mspdi.DurationFormatType4
	 * @see #isSetDurationFormat()
	 * @see #unsetDurationFormat()
	 * @see #setDurationFormat(DurationFormatType4)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_DurationFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DurationFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationFormatType4 getDurationFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getDurationFormat <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Format</em>' attribute.
	 * @see net.certware.planning.mspdi.DurationFormatType4
	 * @see #isSetDurationFormat()
	 * @see #unsetDurationFormat()
	 * @see #getDurationFormat()
	 * @generated
	 */
	void setDurationFormat(DurationFormatType4 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getDurationFormat <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurationFormat()
	 * @see #getDurationFormat()
	 * @see #setDurationFormat(DurationFormatType4)
	 * @generated
	 */
	void unsetDurationFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getDurationFormat <em>Duration Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration Format</em>' attribute is set.
	 * @see #unsetDurationFormat()
	 * @see #getDurationFormat()
	 * @see #setDurationFormat(DurationFormatType4)
	 * @generated
	 */
	boolean isSetDurationFormat();

	/**
	 * Returns the value of the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of scheduled work for the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work</em>' attribute.
	 * @see #setWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Work()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Work' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getWork <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' attribute.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the task was stopped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop</em>' attribute.
	 * @see #setStop(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Stop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Stop' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStop();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getStop <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' attribute.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Resume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date that the task resumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resume</em>' attribute.
	 * @see #setResume(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Resume()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Resume' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getResume();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getResume <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume</em>' attribute.
	 * @see #getResume()
	 * @generated
	 */
	void setResume(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Resume Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task can be resumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resume Valid</em>' attribute.
	 * @see #isSetResumeValid()
	 * @see #unsetResumeValid()
	 * @see #setResumeValid(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ResumeValid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ResumeValid' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isResumeValid();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isResumeValid <em>Resume Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Valid</em>' attribute.
	 * @see #isSetResumeValid()
	 * @see #unsetResumeValid()
	 * @see #isResumeValid()
	 * @generated
	 */
	void setResumeValid(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isResumeValid <em>Resume Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResumeValid()
	 * @see #isResumeValid()
	 * @see #setResumeValid(boolean)
	 * @generated
	 */
	void unsetResumeValid();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isResumeValid <em>Resume Valid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resume Valid</em>' attribute is set.
	 * @see #unsetResumeValid()
	 * @see #isResumeValid()
	 * @see #setResumeValid(boolean)
	 * @generated
	 */
	boolean isSetResumeValid();

	/**
	 * Returns the value of the '<em><b>Effort Driven</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is effort-driven.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effort Driven</em>' attribute.
	 * @see #isSetEffortDriven()
	 * @see #unsetEffortDriven()
	 * @see #setEffortDriven(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_EffortDriven()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='EffortDriven' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEffortDriven();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isEffortDriven <em>Effort Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effort Driven</em>' attribute.
	 * @see #isSetEffortDriven()
	 * @see #unsetEffortDriven()
	 * @see #isEffortDriven()
	 * @generated
	 */
	void setEffortDriven(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isEffortDriven <em>Effort Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffortDriven()
	 * @see #isEffortDriven()
	 * @see #setEffortDriven(boolean)
	 * @generated
	 */
	void unsetEffortDriven();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isEffortDriven <em>Effort Driven</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effort Driven</em>' attribute is set.
	 * @see #unsetEffortDriven()
	 * @see #isEffortDriven()
	 * @see #setEffortDriven(boolean)
	 * @generated
	 */
	boolean isSetEffortDriven();

	/**
	 * Returns the value of the '<em><b>Recurring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is a recurring task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recurring</em>' attribute.
	 * @see #isSetRecurring()
	 * @see #unsetRecurring()
	 * @see #setRecurring(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Recurring()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Recurring' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRecurring();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isRecurring <em>Recurring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurring</em>' attribute.
	 * @see #isSetRecurring()
	 * @see #unsetRecurring()
	 * @see #isRecurring()
	 * @generated
	 */
	void setRecurring(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isRecurring <em>Recurring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecurring()
	 * @see #isRecurring()
	 * @see #setRecurring(boolean)
	 * @generated
	 */
	void unsetRecurring();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isRecurring <em>Recurring</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recurring</em>' attribute is set.
	 * @see #unsetRecurring()
	 * @see #isRecurring()
	 * @see #setRecurring(boolean)
	 * @generated
	 */
	boolean isSetRecurring();

	/**
	 * Returns the value of the '<em><b>Over Allocated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is overallocated. This element is informational only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Over Allocated</em>' attribute.
	 * @see #isSetOverAllocated()
	 * @see #unsetOverAllocated()
	 * @see #setOverAllocated(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_OverAllocated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='OverAllocated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOverAllocated();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isOverAllocated <em>Over Allocated</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isOverAllocated <em>Over Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverAllocated()
	 * @see #isOverAllocated()
	 * @see #setOverAllocated(boolean)
	 * @generated
	 */
	void unsetOverAllocated();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isOverAllocated <em>Over Allocated</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is estimated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated</em>' attribute.
	 * @see #isSetEstimated()
	 * @see #unsetEstimated()
	 * @see #setEstimated(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Estimated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Estimated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEstimated();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isEstimated <em>Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated</em>' attribute.
	 * @see #isSetEstimated()
	 * @see #unsetEstimated()
	 * @see #isEstimated()
	 * @generated
	 */
	void setEstimated(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isEstimated <em>Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimated()
	 * @see #isEstimated()
	 * @see #setEstimated(boolean)
	 * @generated
	 */
	void unsetEstimated();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isEstimated <em>Estimated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated</em>' attribute is set.
	 * @see #unsetEstimated()
	 * @see #isEstimated()
	 * @see #setEstimated(boolean)
	 * @generated
	 */
	boolean isSetEstimated();

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is a milestone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milestone</em>' attribute.
	 * @see #isSetMilestone()
	 * @see #unsetMilestone()
	 * @see #setMilestone(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Milestone()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Milestone' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isMilestone();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isMilestone <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone</em>' attribute.
	 * @see #isSetMilestone()
	 * @see #unsetMilestone()
	 * @see #isMilestone()
	 * @generated
	 */
	void setMilestone(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isMilestone <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMilestone()
	 * @see #isMilestone()
	 * @see #setMilestone(boolean)
	 * @generated
	 */
	void unsetMilestone();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isMilestone <em>Milestone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Milestone</em>' attribute is set.
	 * @see #unsetMilestone()
	 * @see #isMilestone()
	 * @see #setMilestone(boolean)
	 * @generated
	 */
	boolean isSetMilestone();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is a summary task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #isSetSummary()
	 * @see #unsetSummary()
	 * @see #setSummary(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Summary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Summary' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSummary();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #isSetSummary()
	 * @see #unsetSummary()
	 * @see #isSummary()
	 * @generated
	 */
	void setSummary(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSummary()
	 * @see #isSummary()
	 * @see #setSummary(boolean)
	 * @generated
	 */
	void unsetSummary();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isSummary <em>Summary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Summary</em>' attribute is set.
	 * @see #unsetSummary()
	 * @see #isSummary()
	 * @see #setSummary(boolean)
	 * @generated
	 */
	boolean isSetSummary();

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is in the critical chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #isSetCritical()
	 * @see #unsetCritical()
	 * @see #setCritical(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Critical()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Critical' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCritical();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isSetCritical()
	 * @see #unsetCritical()
	 * @see #isCritical()
	 * @generated
	 */
	void setCritical(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCritical()
	 * @see #isCritical()
	 * @see #setCritical(boolean)
	 * @generated
	 */
	void unsetCritical();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isCritical <em>Critical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Critical</em>' attribute is set.
	 * @see #unsetCritical()
	 * @see #isCritical()
	 * @see #setCritical(boolean)
	 * @generated
	 */
	boolean isSetCritical();

	/**
	 * Returns the value of the '<em><b>Is Subproject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is an inserted project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Subproject</em>' attribute.
	 * @see #isSetIsSubproject()
	 * @see #unsetIsSubproject()
	 * @see #setIsSubproject(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_IsSubproject()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsSubproject' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsSubproject();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsSubproject <em>Is Subproject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subproject</em>' attribute.
	 * @see #isSetIsSubproject()
	 * @see #unsetIsSubproject()
	 * @see #isIsSubproject()
	 * @generated
	 */
	void setIsSubproject(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsSubproject <em>Is Subproject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSubproject()
	 * @see #isIsSubproject()
	 * @see #setIsSubproject(boolean)
	 * @generated
	 */
	void unsetIsSubproject();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isIsSubproject <em>Is Subproject</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Subproject</em>' attribute is set.
	 * @see #unsetIsSubproject()
	 * @see #isIsSubproject()
	 * @see #setIsSubproject(boolean)
	 * @generated
	 */
	boolean isSetIsSubproject();

	/**
	 * Returns the value of the '<em><b>Is Subproject Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the inserted project is read-only.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Subproject Read Only</em>' attribute.
	 * @see #isSetIsSubprojectReadOnly()
	 * @see #unsetIsSubprojectReadOnly()
	 * @see #setIsSubprojectReadOnly(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_IsSubprojectReadOnly()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsSubprojectReadOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsSubprojectReadOnly();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsSubprojectReadOnly <em>Is Subproject Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Subproject Read Only</em>' attribute.
	 * @see #isSetIsSubprojectReadOnly()
	 * @see #unsetIsSubprojectReadOnly()
	 * @see #isIsSubprojectReadOnly()
	 * @generated
	 */
	void setIsSubprojectReadOnly(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsSubprojectReadOnly <em>Is Subproject Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSubprojectReadOnly()
	 * @see #isIsSubprojectReadOnly()
	 * @see #setIsSubprojectReadOnly(boolean)
	 * @generated
	 */
	void unsetIsSubprojectReadOnly();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isIsSubprojectReadOnly <em>Is Subproject Read Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Subproject Read Only</em>' attribute is set.
	 * @see #unsetIsSubprojectReadOnly()
	 * @see #isIsSubprojectReadOnly()
	 * @see #setIsSubprojectReadOnly(boolean)
	 * @generated
	 */
	boolean isSetIsSubprojectReadOnly();

	/**
	 * Returns the value of the '<em><b>Subproject Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source location of the inserted project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subproject Name</em>' attribute.
	 * @see #setSubprojectName(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_SubprojectName()
	 * @model dataType="net.certware.planning.mspdi.SubprojectNameType"
	 *        extendedMetaData="kind='element' name='SubprojectName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubprojectName();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getSubprojectName <em>Subproject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subproject Name</em>' attribute.
	 * @see #getSubprojectName()
	 * @generated
	 */
	void setSubprojectName(String value);

	/**
	 * Returns the value of the '<em><b>External Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is external.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Task</em>' attribute.
	 * @see #isSetExternalTask()
	 * @see #unsetExternalTask()
	 * @see #setExternalTask(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ExternalTask()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ExternalTask' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExternalTask();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isExternalTask <em>External Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Task</em>' attribute.
	 * @see #isSetExternalTask()
	 * @see #unsetExternalTask()
	 * @see #isExternalTask()
	 * @generated
	 */
	void setExternalTask(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isExternalTask <em>External Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternalTask()
	 * @see #isExternalTask()
	 * @see #setExternalTask(boolean)
	 * @generated
	 */
	void unsetExternalTask();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isExternalTask <em>External Task</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External Task</em>' attribute is set.
	 * @see #unsetExternalTask()
	 * @see #isExternalTask()
	 * @see #setExternalTask(boolean)
	 * @generated
	 */
	boolean isSetExternalTask();

	/**
	 * Returns the value of the '<em><b>External Task Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source location and task identifier of the external task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Task Project</em>' attribute.
	 * @see #setExternalTaskProject(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ExternalTaskProject()
	 * @model dataType="net.certware.planning.mspdi.ExternalTaskProjectType"
	 *        extendedMetaData="kind='element' name='ExternalTaskProject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalTaskProject();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getExternalTaskProject <em>External Task Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Task Project</em>' attribute.
	 * @see #getExternalTaskProject()
	 * @generated
	 */
	void setExternalTaskProject(String value);

	/**
	 * Returns the value of the '<em><b>Early Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The early start date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Early Start</em>' attribute.
	 * @see #setEarlyStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_EarlyStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EarlyStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEarlyStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getEarlyStart <em>Early Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Start</em>' attribute.
	 * @see #getEarlyStart()
	 * @generated
	 */
	void setEarlyStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Early Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The early finish date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Early Finish</em>' attribute.
	 * @see #setEarlyFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_EarlyFinish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EarlyFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEarlyFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getEarlyFinish <em>Early Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Finish</em>' attribute.
	 * @see #getEarlyFinish()
	 * @generated
	 */
	void setEarlyFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Late Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The late start date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Late Start</em>' attribute.
	 * @see #setLateStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_LateStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LateStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLateStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getLateStart <em>Late Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Start</em>' attribute.
	 * @see #getLateStart()
	 * @generated
	 */
	void setLateStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Late Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The late finish date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Late Finish</em>' attribute.
	 * @see #setLateFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_LateFinish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LateFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLateFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getLateFinish <em>Late Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Finish</em>' attribute.
	 * @see #getLateFinish()
	 * @generated
	 */
	void setLateFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Start Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variance of the task start date from the baseline start date as minutes x 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Variance</em>' attribute.
	 * @see #setStartVariance(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_StartVariance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='StartVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getStartVariance <em>Start Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Variance</em>' attribute.
	 * @see #getStartVariance()
	 * @generated
	 */
	void setStartVariance(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Finish Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variance of the task finish date from the baseline finish date as minutes x 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish Variance</em>' attribute.
	 * @see #setFinishVariance(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_FinishVariance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='FinishVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFinishVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getFinishVariance <em>Finish Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Variance</em>' attribute.
	 * @see #getFinishVariance()
	 * @generated
	 */
	void setFinishVariance(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Work Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variance of task work from the baseline task work as minutes x 1000.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Variance</em>' attribute.
	 * @see #isSetWorkVariance()
	 * @see #unsetWorkVariance()
	 * @see #setWorkVariance(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_WorkVariance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='WorkVariance' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWorkVariance();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getWorkVariance <em>Work Variance</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getWorkVariance <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkVariance()
	 * @see #getWorkVariance()
	 * @see #setWorkVariance(float)
	 * @generated
	 */
	void unsetWorkVariance();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getWorkVariance <em>Work Variance</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Free Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of free slack.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Slack</em>' attribute.
	 * @see #setFreeSlack(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_FreeSlack()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='FreeSlack' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getFreeSlack();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getFreeSlack <em>Free Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Slack</em>' attribute.
	 * @see #getFreeSlack()
	 * @generated
	 */
	void setFreeSlack(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Total Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of total slack.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Slack</em>' attribute.
	 * @see #setTotalSlack(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_TotalSlack()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='TotalSlack' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTotalSlack();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getTotalSlack <em>Total Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Slack</em>' attribute.
	 * @see #getTotalSlack()
	 * @generated
	 */
	void setTotalSlack(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed cost of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Cost</em>' attribute.
	 * @see #isSetFixedCost()
	 * @see #unsetFixedCost()
	 * @see #setFixedCost(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_FixedCost()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='FixedCost' namespace='##targetNamespace'"
	 * @generated
	 */
	float getFixedCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getFixedCost <em>Fixed Cost</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getFixedCost <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixedCost()
	 * @see #getFixedCost()
	 * @see #setFixedCost(float)
	 * @generated
	 */
	void unsetFixedCost();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getFixedCost <em>Fixed Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed Cost</em>' attribute is set.
	 * @see #unsetFixedCost()
	 * @see #getFixedCost()
	 * @see #setFixedCost(float)
	 * @generated
	 */
	boolean isSetFixedCost();

	/**
	 * Returns the value of the '<em><b>Fixed Cost Accrual</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.FixedCostAccrualType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the fixed cost is accrued against the task. Values are: 1=Start, 2=Prorated and 3=End.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Cost Accrual</em>' attribute.
	 * @see net.certware.planning.mspdi.FixedCostAccrualType
	 * @see #isSetFixedCostAccrual()
	 * @see #unsetFixedCostAccrual()
	 * @see #setFixedCostAccrual(FixedCostAccrualType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_FixedCostAccrual()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FixedCostAccrual' namespace='##targetNamespace'"
	 * @generated
	 */
	FixedCostAccrualType getFixedCostAccrual();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getFixedCostAccrual <em>Fixed Cost Accrual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Cost Accrual</em>' attribute.
	 * @see net.certware.planning.mspdi.FixedCostAccrualType
	 * @see #isSetFixedCostAccrual()
	 * @see #unsetFixedCostAccrual()
	 * @see #getFixedCostAccrual()
	 * @generated
	 */
	void setFixedCostAccrual(FixedCostAccrualType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getFixedCostAccrual <em>Fixed Cost Accrual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixedCostAccrual()
	 * @see #getFixedCostAccrual()
	 * @see #setFixedCostAccrual(FixedCostAccrualType)
	 * @generated
	 */
	void unsetFixedCostAccrual();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getFixedCostAccrual <em>Fixed Cost Accrual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed Cost Accrual</em>' attribute is set.
	 * @see #unsetFixedCostAccrual()
	 * @see #getFixedCostAccrual()
	 * @see #setFixedCostAccrual(FixedCostAccrualType)
	 * @generated
	 */
	boolean isSetFixedCostAccrual();

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of the task duration completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_PercentComplete()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='PercentComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPercentComplete();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Percent Work Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of the task work completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Work Complete</em>' attribute.
	 * @see #setPercentWorkComplete(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_PercentWorkComplete()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='PercentWorkComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPercentWorkComplete();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getPercentWorkComplete <em>Percent Work Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Work Complete</em>' attribute.
	 * @see #getPercentWorkComplete()
	 * @generated
	 */
	void setPercentWorkComplete(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The projected or scheduled cost of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Cost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='Cost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sum of the actual and remaining overtime cost of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Cost</em>' attribute.
	 * @see #setOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_OvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='OvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getOvertimeCost <em>Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Cost</em>' attribute.
	 * @see #getOvertimeCost()
	 * @generated
	 */
	void setOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of overtime work scheduled for the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overtime Work</em>' attribute.
	 * @see #setOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_OvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='OvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getOvertimeWork <em>Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overtime Work</em>' attribute.
	 * @see #getOvertimeWork()
	 * @generated
	 */
	void setOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual start date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Start</em>' attribute.
	 * @see #setActualStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ActualStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActualStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualStart <em>Actual Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start</em>' attribute.
	 * @see #getActualStart()
	 * @generated
	 */
	void setActualStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Actual Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual finish date of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Finish</em>' attribute.
	 * @see #setActualFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualFinish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ActualFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getActualFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualFinish <em>Actual Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Finish</em>' attribute.
	 * @see #getActualFinish()
	 * @generated
	 */
	void setActualFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Actual Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual duration of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Duration</em>' attribute.
	 * @see #setActualDuration(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualDuration();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualDuration <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Duration</em>' attribute.
	 * @see #getActualDuration()
	 * @generated
	 */
	void setActualDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #setActualCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ActualCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getActualCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualCost <em>Actual Cost</em>}' attribute.
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
	 * The actual overtime cost of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Cost</em>' attribute.
	 * @see #setActualOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualOvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='ActualOvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getActualOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualOvertimeCost <em>Actual Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Cost</em>' attribute.
	 * @see #getActualOvertimeCost()
	 * @generated
	 */
	void setActualOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual work for the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Work</em>' attribute.
	 * @see #setActualWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualWork <em>Actual Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Work</em>' attribute.
	 * @see #getActualWork()
	 * @generated
	 */
	void setActualWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Actual Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual overtime work for the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Overtime Work</em>' attribute.
	 * @see #setActualOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualOvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualOvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualOvertimeWork <em>Actual Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Work</em>' attribute.
	 * @see #getActualOvertimeWork()
	 * @generated
	 */
	void setActualOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Regular Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of non-overtime work scheduled for the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Regular Work</em>' attribute.
	 * @see #setRegularWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_RegularWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RegularWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRegularWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getRegularWork <em>Regular Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Work</em>' attribute.
	 * @see #getRegularWork()
	 * @generated
	 */
	void setRegularWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time required to complete the unfinished portion of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Duration</em>' attribute.
	 * @see #setRemainingDuration(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_RemainingDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RemainingDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRemainingDuration();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getRemainingDuration <em>Remaining Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Duration</em>' attribute.
	 * @see #getRemainingDuration()
	 * @generated
	 */
	void setRemainingDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining projected cost of completing the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Cost</em>' attribute.
	 * @see #setRemainingCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_RemainingCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='RemainingCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getRemainingCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getRemainingCost <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Cost</em>' attribute.
	 * @see #getRemainingCost()
	 * @generated
	 */
	void setRemainingCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Remaining Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining work scheduled to complete the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Work</em>' attribute.
	 * @see #setRemainingWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_RemainingWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RemainingWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRemainingWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getRemainingWork <em>Remaining Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Work</em>' attribute.
	 * @see #getRemainingWork()
	 * @generated
	 */
	void setRemainingWork(Duration value);

	/**
	 * Returns the value of the '<em><b>Remaining Overtime Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining overtime cost projected to finish the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Overtime Cost</em>' attribute.
	 * @see #setRemainingOvertimeCost(BigDecimal)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_RemainingOvertimeCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='RemainingOvertimeCost' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getRemainingOvertimeCost();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Overtime Cost</em>' attribute.
	 * @see #getRemainingOvertimeCost()
	 * @generated
	 */
	void setRemainingOvertimeCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Remaining Overtime Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining overtime work scheduled to finish the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Overtime Work</em>' attribute.
	 * @see #setRemainingOvertimeWork(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_RemainingOvertimeWork()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RemainingOvertimeWork' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRemainingOvertimeWork();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Overtime Work</em>' attribute.
	 * @see #getRemainingOvertimeWork()
	 * @generated
	 */
	void setRemainingOvertimeWork(Duration value);

	/**
	 * Returns the value of the '<em><b>ACWP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual cost of work performed on the task to-date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ACWP</em>' attribute.
	 * @see #isSetACWP()
	 * @see #unsetACWP()
	 * @see #setACWP(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ACWP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='ACWP' namespace='##targetNamespace'"
	 * @generated
	 */
	float getACWP();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getACWP <em>ACWP</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getACWP <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetACWP()
	 * @see #getACWP()
	 * @see #setACWP(float)
	 * @generated
	 */
	void unsetACWP();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getACWP <em>ACWP</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>CV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earned value cost variance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CV</em>' attribute.
	 * @see #isSetCV()
	 * @see #unsetCV()
	 * @see #setCV(float)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_CV()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='CV' namespace='##targetNamespace'"
	 * @generated
	 */
	float getCV();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getCV <em>CV</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getCV <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCV()
	 * @see #getCV()
	 * @see #setCV(float)
	 * @generated
	 */
	void unsetCV();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getCV <em>CV</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.ConstraintTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint on the start or finish date of the task. Values are: 0=As Soon As Possible, 1=As Late As Possible, 2=Must Start On, 3=Must Finish On, 4=Start No Earlier Than, 5=Start No Later Than, 6=Finish No Earlier Than and 7=Finish No Later Than.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Type</em>' attribute.
	 * @see net.certware.planning.mspdi.ConstraintTypeType
	 * @see #isSetConstraintType()
	 * @see #unsetConstraintType()
	 * @see #setConstraintType(ConstraintTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ConstraintType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConstraintType' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintTypeType getConstraintType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' attribute.
	 * @see net.certware.planning.mspdi.ConstraintTypeType
	 * @see #isSetConstraintType()
	 * @see #unsetConstraintType()
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(ConstraintTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstraintType()
	 * @see #getConstraintType()
	 * @see #setConstraintType(ConstraintTypeType)
	 * @generated
	 */
	void unsetConstraintType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getConstraintType <em>Constraint Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constraint Type</em>' attribute is set.
	 * @see #unsetConstraintType()
	 * @see #getConstraintType()
	 * @see #setConstraintType(ConstraintTypeType)
	 * @generated
	 */
	boolean isSetConstraintType();

	/**
	 * Returns the value of the '<em><b>Calendar UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The task calendar.Refers to a valid UID in the Calendars element of the Microsoft Project XML Schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calendar UID</em>' attribute.
	 * @see #setCalendarUID(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_CalendarUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='CalendarUID' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCalendarUID();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getCalendarUID <em>Calendar UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar UID</em>' attribute.
	 * @see #getCalendarUID()
	 * @generated
	 */
	void setCalendarUID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Constraint Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date argument for the task constraint type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Date</em>' attribute.
	 * @see #setConstraintDate(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ConstraintDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ConstraintDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getConstraintDate();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getConstraintDate <em>Constraint Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Date</em>' attribute.
	 * @see #getConstraintDate()
	 * @generated
	 */
	void setConstraintDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deadline for the task to be completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Deadline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='Deadline' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDeadline();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Level Assignments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether leveling can adjust assignments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level Assignments</em>' attribute.
	 * @see #isSetLevelAssignments()
	 * @see #unsetLevelAssignments()
	 * @see #setLevelAssignments(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_LevelAssignments()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='LevelAssignments' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLevelAssignments();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isLevelAssignments <em>Level Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Assignments</em>' attribute.
	 * @see #isSetLevelAssignments()
	 * @see #unsetLevelAssignments()
	 * @see #isLevelAssignments()
	 * @generated
	 */
	void setLevelAssignments(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isLevelAssignments <em>Level Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevelAssignments()
	 * @see #isLevelAssignments()
	 * @see #setLevelAssignments(boolean)
	 * @generated
	 */
	void unsetLevelAssignments();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isLevelAssignments <em>Level Assignments</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level Assignments</em>' attribute is set.
	 * @see #unsetLevelAssignments()
	 * @see #isLevelAssignments()
	 * @see #setLevelAssignments(boolean)
	 * @generated
	 */
	boolean isSetLevelAssignments();

	/**
	 * Returns the value of the '<em><b>Leveling Can Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether leveling can split the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leveling Can Split</em>' attribute.
	 * @see #isSetLevelingCanSplit()
	 * @see #unsetLevelingCanSplit()
	 * @see #setLevelingCanSplit(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_LevelingCanSplit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='LevelingCanSplit' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLevelingCanSplit();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isLevelingCanSplit <em>Leveling Can Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leveling Can Split</em>' attribute.
	 * @see #isSetLevelingCanSplit()
	 * @see #unsetLevelingCanSplit()
	 * @see #isLevelingCanSplit()
	 * @generated
	 */
	void setLevelingCanSplit(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isLevelingCanSplit <em>Leveling Can Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevelingCanSplit()
	 * @see #isLevelingCanSplit()
	 * @see #setLevelingCanSplit(boolean)
	 * @generated
	 */
	void unsetLevelingCanSplit();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isLevelingCanSplit <em>Leveling Can Split</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leveling Can Split</em>' attribute is set.
	 * @see #unsetLevelingCanSplit()
	 * @see #isLevelingCanSplit()
	 * @see #setLevelingCanSplit(boolean)
	 * @generated
	 */
	boolean isSetLevelingCanSplit();

	/**
	 * Returns the value of the '<em><b>Leveling Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delay caused by leveling the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leveling Delay</em>' attribute.
	 * @see #setLevelingDelay(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_LevelingDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='LevelingDelay' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLevelingDelay();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getLevelingDelay <em>Leveling Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leveling Delay</em>' attribute.
	 * @see #getLevelingDelay()
	 * @generated
	 */
	void setLevelingDelay(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Leveling Delay Format</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.LevelingDelayFormatType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The format for expressing the duration of the delay.  Values are: 3=m, 4=em, 5=h, 6=eh, 7=d, 8=ed, 9=w, 10=ew, 11=mo, 12=emo, 19=%, 20=e%, 21=null, 35=m?, 36=em?, 37=h?, 38=eh?, 39=d?, 40=ed?, 41=w?, 42=ew?, 43=mo?, 44=emo?, 51=%?, 52=e%? and 53=null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leveling Delay Format</em>' attribute.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
	 * @see #isSetLevelingDelayFormat()
	 * @see #unsetLevelingDelayFormat()
	 * @see #setLevelingDelayFormat(LevelingDelayFormatType1)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_LevelingDelayFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='LevelingDelayFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	LevelingDelayFormatType1 getLevelingDelayFormat();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getLevelingDelayFormat <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leveling Delay Format</em>' attribute.
	 * @see net.certware.planning.mspdi.LevelingDelayFormatType1
	 * @see #isSetLevelingDelayFormat()
	 * @see #unsetLevelingDelayFormat()
	 * @see #getLevelingDelayFormat()
	 * @generated
	 */
	void setLevelingDelayFormat(LevelingDelayFormatType1 value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getLevelingDelayFormat <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevelingDelayFormat()
	 * @see #getLevelingDelayFormat()
	 * @see #setLevelingDelayFormat(LevelingDelayFormatType1)
	 * @generated
	 */
	void unsetLevelingDelayFormat();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getLevelingDelayFormat <em>Leveling Delay Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leveling Delay Format</em>' attribute is set.
	 * @see #unsetLevelingDelayFormat()
	 * @see #getLevelingDelayFormat()
	 * @see #setLevelingDelayFormat(LevelingDelayFormatType1)
	 * @generated
	 */
	boolean isSetLevelingDelayFormat();

	/**
	 * Returns the value of the '<em><b>Pre Leveled Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start date of the task before it was leveled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Leveled Start</em>' attribute.
	 * @see #setPreLeveledStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_PreLeveledStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='PreLeveledStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPreLeveledStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getPreLeveledStart <em>Pre Leveled Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Leveled Start</em>' attribute.
	 * @see #getPreLeveledStart()
	 * @generated
	 */
	void setPreLeveledStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Pre Leveled Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The finish date of the task before it was leveled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Leveled Finish</em>' attribute.
	 * @see #setPreLeveledFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_PreLeveledFinish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='PreLeveledFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getPreLeveledFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getPreLeveledFinish <em>Pre Leveled Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Leveled Finish</em>' attribute.
	 * @see #getPreLeveledFinish()
	 * @generated
	 */
	void setPreLeveledFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The title of the hyperlink associated with the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink</em>' attribute.
	 * @see #setHyperlink(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Hyperlink()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkType2"
	 *        extendedMetaData="kind='element' name='Hyperlink' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlink();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getHyperlink <em>Hyperlink</em>}' attribute.
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
	 * The hyperlink associated with the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink Address</em>' attribute.
	 * @see #setHyperlinkAddress(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_HyperlinkAddress()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkAddressType2"
	 *        extendedMetaData="kind='element' name='HyperlinkAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlinkAddress();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getHyperlinkAddress <em>Hyperlink Address</em>}' attribute.
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
	 * The document bookmark of the hyperlink associated with the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyperlink Sub Address</em>' attribute.
	 * @see #setHyperlinkSubAddress(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_HyperlinkSubAddress()
	 * @model dataType="net.certware.planning.mspdi.HyperlinkSubAddressType2"
	 *        extendedMetaData="kind='element' name='HyperlinkSubAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHyperlinkSubAddress();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink Sub Address</em>' attribute.
	 * @see #getHyperlinkSubAddress()
	 * @generated
	 */
	void setHyperlinkSubAddress(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Resource Calendar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task ignores the resource calendar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Resource Calendar</em>' attribute.
	 * @see #isSetIgnoreResourceCalendar()
	 * @see #unsetIgnoreResourceCalendar()
	 * @see #setIgnoreResourceCalendar(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_IgnoreResourceCalendar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IgnoreResourceCalendar' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIgnoreResourceCalendar();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isIgnoreResourceCalendar <em>Ignore Resource Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Resource Calendar</em>' attribute.
	 * @see #isSetIgnoreResourceCalendar()
	 * @see #unsetIgnoreResourceCalendar()
	 * @see #isIgnoreResourceCalendar()
	 * @generated
	 */
	void setIgnoreResourceCalendar(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isIgnoreResourceCalendar <em>Ignore Resource Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreResourceCalendar()
	 * @see #isIgnoreResourceCalendar()
	 * @see #setIgnoreResourceCalendar(boolean)
	 * @generated
	 */
	void unsetIgnoreResourceCalendar();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isIgnoreResourceCalendar <em>Ignore Resource Calendar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Resource Calendar</em>' attribute is set.
	 * @see #unsetIgnoreResourceCalendar()
	 * @see #isIgnoreResourceCalendar()
	 * @see #setIgnoreResourceCalendar(boolean)
	 * @generated
	 */
	boolean isSetIgnoreResourceCalendar();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text notes associated with the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Hide Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the GANTT bar of the task is hidden when displayed in Microsoft Project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hide Bar</em>' attribute.
	 * @see #isSetHideBar()
	 * @see #unsetHideBar()
	 * @see #setHideBar(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_HideBar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='HideBar' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHideBar();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isHideBar <em>Hide Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Bar</em>' attribute.
	 * @see #isSetHideBar()
	 * @see #unsetHideBar()
	 * @see #isHideBar()
	 * @generated
	 */
	void setHideBar(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isHideBar <em>Hide Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHideBar()
	 * @see #isHideBar()
	 * @see #setHideBar(boolean)
	 * @generated
	 */
	void unsetHideBar();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isHideBar <em>Hide Bar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hide Bar</em>' attribute is set.
	 * @see #unsetHideBar()
	 * @see #isHideBar()
	 * @see #setHideBar(boolean)
	 * @generated
	 */
	boolean isSetHideBar();

	/**
	 * Returns the value of the '<em><b>Rollup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is rolled up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rollup</em>' attribute.
	 * @see #isSetRollup()
	 * @see #unsetRollup()
	 * @see #setRollup(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Rollup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Rollup' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRollup();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isRollup <em>Rollup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rollup</em>' attribute.
	 * @see #isSetRollup()
	 * @see #unsetRollup()
	 * @see #isRollup()
	 * @generated
	 */
	void setRollup(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isRollup <em>Rollup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRollup()
	 * @see #isRollup()
	 * @see #setRollup(boolean)
	 * @generated
	 */
	void unsetRollup();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isRollup <em>Rollup</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rollup</em>' attribute is set.
	 * @see #unsetRollup()
	 * @see #isRollup()
	 * @see #setRollup(boolean)
	 * @generated
	 */
	boolean isSetRollup();

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
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_BCWS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWS' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWS();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getBCWS <em>BCWS</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getBCWS <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWS()
	 * @see #getBCWS()
	 * @see #setBCWS(float)
	 * @generated
	 */
	void unsetBCWS();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getBCWS <em>BCWS</em>}' attribute is set.
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
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_BCWP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='BCWP' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBCWP();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getBCWP <em>BCWP</em>}' attribute.
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
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getBCWP <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBCWP()
	 * @see #getBCWP()
	 * @see #setBCWP(float)
	 * @generated
	 */
	void unsetBCWP();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getBCWP <em>BCWP</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Physical Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage complete value entered by the Project Manager.  This can be used as an alternative for calculating BCWP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Percent Complete</em>' attribute.
	 * @see #setPhysicalPercentComplete(BigInteger)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_PhysicalPercentComplete()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='PhysicalPercentComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPhysicalPercentComplete();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getPhysicalPercentComplete <em>Physical Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Percent Complete</em>' attribute.
	 * @see #getPhysicalPercentComplete()
	 * @generated
	 */
	void setPhysicalPercentComplete(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Earned Value Method</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.EarnedValueMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method for calculating earned value. Values are: 0=Percent Complete, 1=Physical Percent Complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earned Value Method</em>' attribute.
	 * @see net.certware.planning.mspdi.EarnedValueMethodType
	 * @see #isSetEarnedValueMethod()
	 * @see #unsetEarnedValueMethod()
	 * @see #setEarnedValueMethod(EarnedValueMethodType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_EarnedValueMethod()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EarnedValueMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	EarnedValueMethodType getEarnedValueMethod();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getEarnedValueMethod <em>Earned Value Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earned Value Method</em>' attribute.
	 * @see net.certware.planning.mspdi.EarnedValueMethodType
	 * @see #isSetEarnedValueMethod()
	 * @see #unsetEarnedValueMethod()
	 * @see #getEarnedValueMethod()
	 * @generated
	 */
	void setEarnedValueMethod(EarnedValueMethodType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getEarnedValueMethod <em>Earned Value Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEarnedValueMethod()
	 * @see #getEarnedValueMethod()
	 * @see #setEarnedValueMethod(EarnedValueMethodType)
	 * @generated
	 */
	void unsetEarnedValueMethod();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getEarnedValueMethod <em>Earned Value Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Earned Value Method</em>' attribute is set.
	 * @see #unsetEarnedValueMethod()
	 * @see #getEarnedValueMethod()
	 * @see #setEarnedValueMethod(EarnedValueMethodType)
	 * @generated
	 */
	boolean isSetEarnedValueMethod();

	/**
	 * Returns the value of the '<em><b>Predecessor Link</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.PredecessorLinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the predecessor task of the task that contains it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor Link</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_PredecessorLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PredecessorLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PredecessorLinkType> getPredecessorLink();

	/**
	 * Returns the value of the '<em><b>Actual Work Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration through which actual work is protected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Work Protected</em>' attribute.
	 * @see #setActualWorkProtected(Duration)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualWorkProtected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualWorkProtected' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualWorkProtected();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualWorkProtected <em>Actual Work Protected</em>}' attribute.
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
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ActualOvertimeWorkProtected()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ActualOvertimeWorkProtected' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getActualOvertimeWorkProtected();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Overtime Work Protected</em>' attribute.
	 * @see #getActualOvertimeWorkProtected()
	 * @generated
	 */
	void setActualOvertimeWorkProtected(Duration value);

	/**
	 * Returns the value of the '<em><b>Extended Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.ExtendedAttributeType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of an extended attribute.  Two pieces of data are necessary - a pointer back to the extended attribute table which is specified either by the unique ID or the Field ID, and the value which is specified either with the value, or a pointer back to the value list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Attribute</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_ExtendedAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtendedAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExtendedAttributeType2> getExtendedAttribute();

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.BaselineType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of baseline values of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baseline</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_Baseline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Baseline' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BaselineType2> getBaseline();

	/**
	 * Returns the value of the '<em><b>Outline Code</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.OutlineCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of an outline code.  Two pieces of data are necessary - a pointer to the outline code table that is specified by the FieldID, and the value that is specified either by the ValueID or ValueGUID pointer to the value list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outline Code</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_OutlineCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OutlineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutlineCodeType> getOutlineCode();

	/**
	 * Returns the value of the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task is published.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Published</em>' attribute.
	 * @see #isSetIsPublished()
	 * @see #unsetIsPublished()
	 * @see #setIsPublished(boolean)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_IsPublished()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsPublished' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsPublished();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsPublished <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Published</em>' attribute.
	 * @see #isSetIsPublished()
	 * @see #unsetIsPublished()
	 * @see #isIsPublished()
	 * @generated
	 */
	void setIsPublished(boolean value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#isIsPublished <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPublished()
	 * @see #isIsPublished()
	 * @see #setIsPublished(boolean)
	 * @generated
	 */
	void unsetIsPublished();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#isIsPublished <em>Is Published</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Published</em>' attribute is set.
	 * @see #unsetIsPublished()
	 * @see #isIsPublished()
	 * @see #setIsPublished(boolean)
	 * @generated
	 */
	boolean isSetIsPublished();

	/**
	 * Returns the value of the '<em><b>Status Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the task status manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Manager</em>' attribute.
	 * @see #setStatusManager(String)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_StatusManager()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='StatusManager' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatusManager();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getStatusManager <em>Status Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Manager</em>' attribute.
	 * @see #getStatusManager()
	 * @generated
	 */
	void setStatusManager(String value);

	/**
	 * Returns the value of the '<em><b>Commitment Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start date of the deliverable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commitment Start</em>' attribute.
	 * @see #setCommitmentStart(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_CommitmentStart()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CommitmentStart' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCommitmentStart();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getCommitmentStart <em>Commitment Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commitment Start</em>' attribute.
	 * @see #getCommitmentStart()
	 * @generated
	 */
	void setCommitmentStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Commitment Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The finish date of the deliverable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commitment Finish</em>' attribute.
	 * @see #setCommitmentFinish(XMLGregorianCalendar)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_CommitmentFinish()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CommitmentFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCommitmentFinish();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getCommitmentFinish <em>Commitment Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commitment Finish</em>' attribute.
	 * @see #getCommitmentFinish()
	 * @generated
	 */
	void setCommitmentFinish(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Commitment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.planning.mspdi.CommitmentTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the task has an associated deliverable or a dependency on an associated deliverable. Values are: 0=The task has no deliverable or dependency on a deliverable, 1=The task has an associated deliverable, 2=The task has a dependency on an associated deliverable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commitment Type</em>' attribute.
	 * @see net.certware.planning.mspdi.CommitmentTypeType
	 * @see #isSetCommitmentType()
	 * @see #unsetCommitmentType()
	 * @see #setCommitmentType(CommitmentTypeType)
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_CommitmentType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CommitmentType' namespace='##targetNamespace'"
	 * @generated
	 */
	CommitmentTypeType getCommitmentType();

	/**
	 * Sets the value of the '{@link net.certware.planning.mspdi.TaskType#getCommitmentType <em>Commitment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commitment Type</em>' attribute.
	 * @see net.certware.planning.mspdi.CommitmentTypeType
	 * @see #isSetCommitmentType()
	 * @see #unsetCommitmentType()
	 * @see #getCommitmentType()
	 * @generated
	 */
	void setCommitmentType(CommitmentTypeType value);

	/**
	 * Unsets the value of the '{@link net.certware.planning.mspdi.TaskType#getCommitmentType <em>Commitment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommitmentType()
	 * @see #getCommitmentType()
	 * @see #setCommitmentType(CommitmentTypeType)
	 * @generated
	 */
	void unsetCommitmentType();

	/**
	 * Returns whether the value of the '{@link net.certware.planning.mspdi.TaskType#getCommitmentType <em>Commitment Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Commitment Type</em>' attribute is set.
	 * @see #unsetCommitmentType()
	 * @see #getCommitmentType()
	 * @see #setCommitmentType(CommitmentTypeType)
	 * @generated
	 */
	boolean isSetCommitmentType();

	/**
	 * Returns the value of the '<em><b>Timephased Data</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.planning.mspdi.TimephasedDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time phased data block associated with the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timephased Data</em>' containment reference list.
	 * @see net.certware.planning.mspdi.MspdiPackage#getTaskType_TimephasedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimephasedData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimephasedDataType> getTimephasedData();

} // TaskType
