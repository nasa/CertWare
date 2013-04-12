/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.planning.mspdi.BaselineType2;
import net.certware.planning.mspdi.CommitmentTypeType;
import net.certware.planning.mspdi.ConstraintTypeType;
import net.certware.planning.mspdi.DurationFormatType4;
import net.certware.planning.mspdi.EarnedValueMethodType;
import net.certware.planning.mspdi.ExtendedAttributeType2;
import net.certware.planning.mspdi.FixedCostAccrualType;
import net.certware.planning.mspdi.LevelingDelayFormatType1;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.OutlineCodeType;
import net.certware.planning.mspdi.PredecessorLinkType;
import net.certware.planning.mspdi.TaskType;
import net.certware.planning.mspdi.TimephasedDataType;
import net.certware.planning.mspdi.TypeType3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getCreateDate <em>Create Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getWBS <em>WBS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getWBSLevel <em>WBS Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getOutlineNumber <em>Outline Number</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getDurationFormat <em>Duration Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getResume <em>Resume</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isResumeValid <em>Resume Valid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isEffortDriven <em>Effort Driven</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isRecurring <em>Recurring</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isOverAllocated <em>Over Allocated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isEstimated <em>Estimated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isMilestone <em>Milestone</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isCritical <em>Critical</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isIsSubproject <em>Is Subproject</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isIsSubprojectReadOnly <em>Is Subproject Read Only</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getSubprojectName <em>Subproject Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isExternalTask <em>External Task</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getExternalTaskProject <em>External Task Project</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getStartVariance <em>Start Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getFinishVariance <em>Finish Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getWorkVariance <em>Work Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getFreeSlack <em>Free Slack</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getTotalSlack <em>Total Slack</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getFixedCost <em>Fixed Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getFixedCostAccrual <em>Fixed Cost Accrual</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getPercentWorkComplete <em>Percent Work Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getOvertimeCost <em>Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getOvertimeWork <em>Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualOvertimeCost <em>Actual Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualWork <em>Actual Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualOvertimeWork <em>Actual Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getRegularWork <em>Regular Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getRemainingDuration <em>Remaining Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getRemainingWork <em>Remaining Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getACWP <em>ACWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getCV <em>CV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getCalendarUID <em>Calendar UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getConstraintDate <em>Constraint Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isLevelAssignments <em>Level Assignments</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isLevelingCanSplit <em>Leveling Can Split</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getLevelingDelay <em>Leveling Delay</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getLevelingDelayFormat <em>Leveling Delay Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getPreLeveledStart <em>Pre Leveled Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getPreLeveledFinish <em>Pre Leveled Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getHyperlinkAddress <em>Hyperlink Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isIgnoreResourceCalendar <em>Ignore Resource Calendar</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isHideBar <em>Hide Bar</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isRollup <em>Rollup</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getPhysicalPercentComplete <em>Physical Percent Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getEarnedValueMethod <em>Earned Value Method</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getPredecessorLink <em>Predecessor Link</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualWorkProtected <em>Actual Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getOutlineCode <em>Outline Code</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#isIsPublished <em>Is Published</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getStatusManager <em>Status Manager</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getCommitmentStart <em>Commitment Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getCommitmentFinish <em>Commitment Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getCommitmentType <em>Commitment Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.TaskTypeImpl#getTimephasedData <em>Timephased Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskTypeImpl extends EObjectImpl implements TaskType {
	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger uID = UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType3 TYPE_EDEFAULT = TypeType3._0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType3 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected boolean isNull = IS_NULL_EDEFAULT;

	/**
	 * This is true if the Is Null attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isNullESet;

	/**
	 * The default value of the '{@link #getCreateDate() <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateDate() <em>Create Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createDate = CREATE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected String contact = CONTACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWBS() <em>WBS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWBS()
	 * @generated
	 * @ordered
	 */
	protected static final String WBS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWBS() <em>WBS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWBS()
	 * @generated
	 * @ordered
	 */
	protected String wBS = WBS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWBSLevel() <em>WBS Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWBSLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String WBS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWBSLevel() <em>WBS Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWBSLevel()
	 * @generated
	 * @ordered
	 */
	protected String wBSLevel = WBS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutlineNumber() <em>Outline Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTLINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlineNumber() <em>Outline Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineNumber()
	 * @generated
	 * @ordered
	 */
	protected String outlineNumber = OUTLINE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OUTLINE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger outlineLevel = OUTLINE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinish() <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finish = FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DurationFormatType4 DURATION_FORMAT_EDEFAULT = DurationFormatType4._3;

	/**
	 * The cached value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected DurationFormatType4 durationFormat = DURATION_FORMAT_EDEFAULT;

	/**
	 * This is true if the Duration Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationFormatESet;

	/**
	 * The default value of the '{@link #getWork() <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Duration work = WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar STOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar stop = STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getResume() <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResume()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RESUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResume() <em>Resume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResume()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar resume = RESUME_EDEFAULT;

	/**
	 * The default value of the '{@link #isResumeValid() <em>Resume Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResumeValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESUME_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResumeValid() <em>Resume Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResumeValid()
	 * @generated
	 * @ordered
	 */
	protected boolean resumeValid = RESUME_VALID_EDEFAULT;

	/**
	 * This is true if the Resume Valid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resumeValidESet;

	/**
	 * The default value of the '{@link #isEffortDriven() <em>Effort Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEffortDriven()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EFFORT_DRIVEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEffortDriven() <em>Effort Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEffortDriven()
	 * @generated
	 * @ordered
	 */
	protected boolean effortDriven = EFFORT_DRIVEN_EDEFAULT;

	/**
	 * This is true if the Effort Driven attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effortDrivenESet;

	/**
	 * The default value of the '{@link #isRecurring() <em>Recurring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecurring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECURRING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecurring() <em>Recurring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecurring()
	 * @generated
	 * @ordered
	 */
	protected boolean recurring = RECURRING_EDEFAULT;

	/**
	 * This is true if the Recurring attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recurringESet;

	/**
	 * The default value of the '{@link #isOverAllocated() <em>Over Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverAllocated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVER_ALLOCATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverAllocated() <em>Over Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverAllocated()
	 * @generated
	 * @ordered
	 */
	protected boolean overAllocated = OVER_ALLOCATED_EDEFAULT;

	/**
	 * This is true if the Over Allocated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overAllocatedESet;

	/**
	 * The default value of the '{@link #isEstimated() <em>Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESTIMATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstimated() <em>Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimated()
	 * @generated
	 * @ordered
	 */
	protected boolean estimated = ESTIMATED_EDEFAULT;

	/**
	 * This is true if the Estimated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedESet;

	/**
	 * The default value of the '{@link #isMilestone() <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMilestone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MILESTONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMilestone() <em>Milestone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMilestone()
	 * @generated
	 * @ordered
	 */
	protected boolean milestone = MILESTONE_EDEFAULT;

	/**
	 * This is true if the Milestone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean milestoneESet;

	/**
	 * The default value of the '{@link #isSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSummary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUMMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSummary()
	 * @generated
	 * @ordered
	 */
	protected boolean summary = SUMMARY_EDEFAULT;

	/**
	 * This is true if the Summary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean summaryESet;

	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;

	/**
	 * This is true if the Critical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean criticalESet;

	/**
	 * The default value of the '{@link #isIsSubproject() <em>Is Subproject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubproject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBPROJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubproject() <em>Is Subproject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubproject()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubproject = IS_SUBPROJECT_EDEFAULT;

	/**
	 * This is true if the Is Subproject attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSubprojectESet;

	/**
	 * The default value of the '{@link #isIsSubprojectReadOnly() <em>Is Subproject Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubprojectReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBPROJECT_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubprojectReadOnly() <em>Is Subproject Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubprojectReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubprojectReadOnly = IS_SUBPROJECT_READ_ONLY_EDEFAULT;

	/**
	 * This is true if the Is Subproject Read Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSubprojectReadOnlyESet;

	/**
	 * The default value of the '{@link #getSubprojectName() <em>Subproject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprojectName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBPROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubprojectName() <em>Subproject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprojectName()
	 * @generated
	 * @ordered
	 */
	protected String subprojectName = SUBPROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternalTask() <em>External Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalTask() <em>External Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalTask()
	 * @generated
	 * @ordered
	 */
	protected boolean externalTask = EXTERNAL_TASK_EDEFAULT;

	/**
	 * This is true if the External Task attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalTaskESet;

	/**
	 * The default value of the '{@link #getExternalTaskProject() <em>External Task Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTaskProject()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_TASK_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalTaskProject() <em>External Task Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTaskProject()
	 * @generated
	 * @ordered
	 */
	protected String externalTaskProject = EXTERNAL_TASK_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarlyStart() <em>Early Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EARLY_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarlyStart() <em>Early Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar earlyStart = EARLY_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarlyFinish() <em>Early Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EARLY_FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarlyFinish() <em>Early Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar earlyFinish = EARLY_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLateStart() <em>Late Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LATE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLateStart() <em>Late Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lateStart = LATE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getLateFinish() <em>Late Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LATE_FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLateFinish() <em>Late Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lateFinish = LATE_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartVariance() <em>Start Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVariance()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartVariance() <em>Start Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVariance()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startVariance = START_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinishVariance() <em>Finish Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishVariance()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FINISH_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishVariance() <em>Finish Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishVariance()
	 * @generated
	 * @ordered
	 */
	protected BigInteger finishVariance = FINISH_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkVariance() <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkVariance()
	 * @generated
	 * @ordered
	 */
	protected static final float WORK_VARIANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorkVariance() <em>Work Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkVariance()
	 * @generated
	 * @ordered
	 */
	protected float workVariance = WORK_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Work Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workVarianceESet;

	/**
	 * The default value of the '{@link #getFreeSlack() <em>Free Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeSlack()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FREE_SLACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreeSlack() <em>Free Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeSlack()
	 * @generated
	 * @ordered
	 */
	protected BigInteger freeSlack = FREE_SLACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalSlack() <em>Total Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSlack()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TOTAL_SLACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalSlack() <em>Total Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSlack()
	 * @generated
	 * @ordered
	 */
	protected BigInteger totalSlack = TOTAL_SLACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedCost() <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedCost() <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCost()
	 * @generated
	 * @ordered
	 */
	protected float fixedCost = FIXED_COST_EDEFAULT;

	/**
	 * This is true if the Fixed Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedCostESet;

	/**
	 * The default value of the '{@link #getFixedCostAccrual() <em>Fixed Cost Accrual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCostAccrual()
	 * @generated
	 * @ordered
	 */
	protected static final FixedCostAccrualType FIXED_COST_ACCRUAL_EDEFAULT = FixedCostAccrualType._1;

	/**
	 * The cached value of the '{@link #getFixedCostAccrual() <em>Fixed Cost Accrual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCostAccrual()
	 * @generated
	 * @ordered
	 */
	protected FixedCostAccrualType fixedCostAccrual = FIXED_COST_ACCRUAL_EDEFAULT;

	/**
	 * This is true if the Fixed Cost Accrual attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedCostAccrualESet;

	/**
	 * The default value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PERCENT_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected BigInteger percentComplete = PERCENT_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentWorkComplete() <em>Percent Work Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentWorkComplete()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PERCENT_WORK_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentWorkComplete() <em>Percent Work Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentWorkComplete()
	 * @generated
	 * @ordered
	 */
	protected BigInteger percentWorkComplete = PERCENT_WORK_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvertimeCost() <em>Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OVERTIME_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvertimeCost() <em>Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal overtimeCost = OVERTIME_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvertimeWork() <em>Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration OVERTIME_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvertimeWork() <em>Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected Duration overtimeWork = OVERTIME_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualStart() <em>Actual Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTUAL_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualStart() <em>Actual Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar actualStart = ACTUAL_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualFinish() <em>Actual Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACTUAL_FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualFinish() <em>Actual Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar actualFinish = ACTUAL_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualDuration() <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualDuration() <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration actualDuration = ACTUAL_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualCost = ACTUAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualOvertimeCost() <em>Actual Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_OVERTIME_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualOvertimeCost() <em>Actual Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualOvertimeCost = ACTUAL_OVERTIME_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualWork() <em>Actual Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualWork() <em>Actual Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWork()
	 * @generated
	 * @ordered
	 */
	protected Duration actualWork = ACTUAL_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualOvertimeWork() <em>Actual Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_OVERTIME_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualOvertimeWork() <em>Actual Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected Duration actualOvertimeWork = ACTUAL_OVERTIME_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegularWork() <em>Regular Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REGULAR_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegularWork() <em>Regular Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularWork()
	 * @generated
	 * @ordered
	 */
	protected Duration regularWork = REGULAR_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingDuration() <em>Remaining Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REMAINING_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingDuration() <em>Remaining Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration remainingDuration = REMAINING_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingCost() <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REMAINING_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingCost() <em>Remaining Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal remainingCost = REMAINING_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingWork() <em>Remaining Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REMAINING_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingWork() <em>Remaining Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingWork()
	 * @generated
	 * @ordered
	 */
	protected Duration remainingWork = REMAINING_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingOvertimeCost() <em>Remaining Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REMAINING_OVERTIME_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingOvertimeCost() <em>Remaining Overtime Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal remainingOvertimeCost = REMAINING_OVERTIME_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingOvertimeWork() <em>Remaining Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration REMAINING_OVERTIME_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingOvertimeWork() <em>Remaining Overtime Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingOvertimeWork()
	 * @generated
	 * @ordered
	 */
	protected Duration remainingOvertimeWork = REMAINING_OVERTIME_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getACWP() <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACWP()
	 * @generated
	 * @ordered
	 */
	protected static final float ACWP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getACWP() <em>ACWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACWP()
	 * @generated
	 * @ordered
	 */
	protected float aCWP = ACWP_EDEFAULT;

	/**
	 * This is true if the ACWP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aCWPESet;

	/**
	 * The default value of the '{@link #getCV() <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCV()
	 * @generated
	 * @ordered
	 */
	protected static final float CV_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCV() <em>CV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCV()
	 * @generated
	 * @ordered
	 */
	protected float cV = CV_EDEFAULT;

	/**
	 * This is true if the CV attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cVESet;

	/**
	 * The default value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintTypeType CONSTRAINT_TYPE_EDEFAULT = ConstraintTypeType._0;

	/**
	 * The cached value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintType()
	 * @generated
	 * @ordered
	 */
	protected ConstraintTypeType constraintType = CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * This is true if the Constraint Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constraintTypeESet;

	/**
	 * The default value of the '{@link #getCalendarUID() <em>Calendar UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CALENDAR_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendarUID() <em>Calendar UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger calendarUID = CALENDAR_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintDate() <em>Constraint Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CONSTRAINT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintDate() <em>Constraint Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar constraintDate = CONSTRAINT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLevelAssignments() <em>Level Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLevelAssignments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEVEL_ASSIGNMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLevelAssignments() <em>Level Assignments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLevelAssignments()
	 * @generated
	 * @ordered
	 */
	protected boolean levelAssignments = LEVEL_ASSIGNMENTS_EDEFAULT;

	/**
	 * This is true if the Level Assignments attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelAssignmentsESet;

	/**
	 * The default value of the '{@link #isLevelingCanSplit() <em>Leveling Can Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLevelingCanSplit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEVELING_CAN_SPLIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLevelingCanSplit() <em>Leveling Can Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLevelingCanSplit()
	 * @generated
	 * @ordered
	 */
	protected boolean levelingCanSplit = LEVELING_CAN_SPLIT_EDEFAULT;

	/**
	 * This is true if the Leveling Can Split attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelingCanSplitESet;

	/**
	 * The default value of the '{@link #getLevelingDelay() <em>Leveling Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LEVELING_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelingDelay() <em>Leveling Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger levelingDelay = LEVELING_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelingDelayFormat() <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelayFormat()
	 * @generated
	 * @ordered
	 */
	protected static final LevelingDelayFormatType1 LEVELING_DELAY_FORMAT_EDEFAULT = LevelingDelayFormatType1._3;

	/**
	 * The cached value of the '{@link #getLevelingDelayFormat() <em>Leveling Delay Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelingDelayFormat()
	 * @generated
	 * @ordered
	 */
	protected LevelingDelayFormatType1 levelingDelayFormat = LEVELING_DELAY_FORMAT_EDEFAULT;

	/**
	 * This is true if the Leveling Delay Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelingDelayFormatESet;

	/**
	 * The default value of the '{@link #getPreLeveledStart() <em>Pre Leveled Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreLeveledStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PRE_LEVELED_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreLeveledStart() <em>Pre Leveled Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreLeveledStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar preLeveledStart = PRE_LEVELED_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreLeveledFinish() <em>Pre Leveled Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreLeveledFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PRE_LEVELED_FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreLeveledFinish() <em>Pre Leveled Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreLeveledFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar preLeveledFinish = PRE_LEVELED_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyperlink() <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlink()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyperlink() <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlink()
	 * @generated
	 * @ordered
	 */
	protected String hyperlink = HYPERLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyperlinkAddress() <em>Hyperlink Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyperlinkAddress() <em>Hyperlink Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkAddress()
	 * @generated
	 * @ordered
	 */
	protected String hyperlinkAddress = HYPERLINK_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyperlinkSubAddress() <em>Hyperlink Sub Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkSubAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_SUB_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyperlinkSubAddress() <em>Hyperlink Sub Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlinkSubAddress()
	 * @generated
	 * @ordered
	 */
	protected String hyperlinkSubAddress = HYPERLINK_SUB_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnoreResourceCalendar() <em>Ignore Resource Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreResourceCalendar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_RESOURCE_CALENDAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreResourceCalendar() <em>Ignore Resource Calendar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreResourceCalendar()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreResourceCalendar = IGNORE_RESOURCE_CALENDAR_EDEFAULT;

	/**
	 * This is true if the Ignore Resource Calendar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreResourceCalendarESet;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideBar() <em>Hide Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideBar() <em>Hide Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideBar()
	 * @generated
	 * @ordered
	 */
	protected boolean hideBar = HIDE_BAR_EDEFAULT;

	/**
	 * This is true if the Hide Bar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hideBarESet;

	/**
	 * The default value of the '{@link #isRollup() <em>Rollup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRollup()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROLLUP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRollup() <em>Rollup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRollup()
	 * @generated
	 * @ordered
	 */
	protected boolean rollup = ROLLUP_EDEFAULT;

	/**
	 * This is true if the Rollup attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rollupESet;

	/**
	 * The default value of the '{@link #getBCWS() <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWS()
	 * @generated
	 * @ordered
	 */
	protected static final float BCWS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBCWS() <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWS()
	 * @generated
	 * @ordered
	 */
	protected float bCWS = BCWS_EDEFAULT;

	/**
	 * This is true if the BCWS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bCWSESet;

	/**
	 * The default value of the '{@link #getBCWP() <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWP()
	 * @generated
	 * @ordered
	 */
	protected static final float BCWP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBCWP() <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWP()
	 * @generated
	 * @ordered
	 */
	protected float bCWP = BCWP_EDEFAULT;

	/**
	 * This is true if the BCWP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bCWPESet;

	/**
	 * The default value of the '{@link #getPhysicalPercentComplete() <em>Physical Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PHYSICAL_PERCENT_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalPercentComplete() <em>Physical Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected BigInteger physicalPercentComplete = PHYSICAL_PERCENT_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarnedValueMethod() <em>Earned Value Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarnedValueMethod()
	 * @generated
	 * @ordered
	 */
	protected static final EarnedValueMethodType EARNED_VALUE_METHOD_EDEFAULT = EarnedValueMethodType._0;

	/**
	 * The cached value of the '{@link #getEarnedValueMethod() <em>Earned Value Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarnedValueMethod()
	 * @generated
	 * @ordered
	 */
	protected EarnedValueMethodType earnedValueMethod = EARNED_VALUE_METHOD_EDEFAULT;

	/**
	 * This is true if the Earned Value Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean earnedValueMethodESet;

	/**
	 * The cached value of the '{@link #getPredecessorLink() <em>Predecessor Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorLink()
	 * @generated
	 * @ordered
	 */
	protected EList<PredecessorLinkType> predecessorLink;

	/**
	 * The default value of the '{@link #getActualWorkProtected() <em>Actual Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_WORK_PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualWorkProtected() <em>Actual Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected Duration actualWorkProtected = ACTUAL_WORK_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualOvertimeWorkProtected() <em>Actual Overtime Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualOvertimeWorkProtected() <em>Actual Overtime Work Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualOvertimeWorkProtected()
	 * @generated
	 * @ordered
	 */
	protected Duration actualOvertimeWorkProtected = ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedAttribute() <em>Extended Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedAttributeType2> extendedAttribute;

	/**
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected EList<BaselineType2> baseline;

	/**
	 * The cached value of the '{@link #getOutlineCode() <em>Outline Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineCode()
	 * @generated
	 * @ordered
	 */
	protected EList<OutlineCodeType> outlineCode;

	/**
	 * The default value of the '{@link #isIsPublished() <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLISHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublished() <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublished()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublished = IS_PUBLISHED_EDEFAULT;

	/**
	 * This is true if the Is Published attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPublishedESet;

	/**
	 * The default value of the '{@link #getStatusManager() <em>Status Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusManager()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusManager() <em>Status Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusManager()
	 * @generated
	 * @ordered
	 */
	protected String statusManager = STATUS_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommitmentStart() <em>Commitment Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitmentStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar COMMITMENT_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommitmentStart() <em>Commitment Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitmentStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar commitmentStart = COMMITMENT_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommitmentFinish() <em>Commitment Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitmentFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar COMMITMENT_FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommitmentFinish() <em>Commitment Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitmentFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar commitmentFinish = COMMITMENT_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommitmentType() <em>Commitment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitmentType()
	 * @generated
	 * @ordered
	 */
	protected static final CommitmentTypeType COMMITMENT_TYPE_EDEFAULT = CommitmentTypeType._0;

	/**
	 * The cached value of the '{@link #getCommitmentType() <em>Commitment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitmentType()
	 * @generated
	 * @ordered
	 */
	protected CommitmentTypeType commitmentType = COMMITMENT_TYPE_EDEFAULT;

	/**
	 * This is true if the Commitment Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commitmentTypeESet;

	/**
	 * The cached value of the '{@link #getTimephasedData() <em>Timephased Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimephasedData()
	 * @generated
	 * @ordered
	 */
	protected EList<TimephasedDataType> timephasedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.TASK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUID(BigInteger newUID) {
		BigInteger oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(BigInteger newID) {
		BigInteger oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType3 newType) {
		TypeType3 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType3 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNull() {
		return isNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNull(boolean newIsNull) {
		boolean oldIsNull = isNull;
		isNull = newIsNull;
		boolean oldIsNullESet = isNullESet;
		isNullESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__IS_NULL, oldIsNull, isNull, !oldIsNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsNull() {
		boolean oldIsNull = isNull;
		boolean oldIsNullESet = isNullESet;
		isNull = IS_NULL_EDEFAULT;
		isNullESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__IS_NULL, oldIsNull, IS_NULL_EDEFAULT, oldIsNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsNull() {
		return isNullESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreateDate() {
		return createDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateDate(XMLGregorianCalendar newCreateDate) {
		XMLGregorianCalendar oldCreateDate = createDate;
		createDate = newCreateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__CREATE_DATE, oldCreateDate, createDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(String newContact) {
		String oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__CONTACT, oldContact, contact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWBS() {
		return wBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWBS(String newWBS) {
		String oldWBS = wBS;
		wBS = newWBS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__WBS, oldWBS, wBS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWBSLevel() {
		return wBSLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWBSLevel(String newWBSLevel) {
		String oldWBSLevel = wBSLevel;
		wBSLevel = newWBSLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__WBS_LEVEL, oldWBSLevel, wBSLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutlineNumber() {
		return outlineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineNumber(String newOutlineNumber) {
		String oldOutlineNumber = outlineNumber;
		outlineNumber = newOutlineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__OUTLINE_NUMBER, oldOutlineNumber, outlineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOutlineLevel() {
		return outlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineLevel(BigInteger newOutlineLevel) {
		BigInteger oldOutlineLevel = outlineLevel;
		outlineLevel = newOutlineLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__OUTLINE_LEVEL, oldOutlineLevel, outlineLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(BigInteger newPriority) {
		BigInteger oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(XMLGregorianCalendar newStart) {
		XMLGregorianCalendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(XMLGregorianCalendar newFinish) {
		XMLGregorianCalendar oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType4 getDurationFormat() {
		return durationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationFormat(DurationFormatType4 newDurationFormat) {
		DurationFormatType4 oldDurationFormat = durationFormat;
		durationFormat = newDurationFormat == null ? DURATION_FORMAT_EDEFAULT : newDurationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__DURATION_FORMAT, oldDurationFormat, durationFormat, !oldDurationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurationFormat() {
		DurationFormatType4 oldDurationFormat = durationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormat = DURATION_FORMAT_EDEFAULT;
		durationFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__DURATION_FORMAT, oldDurationFormat, DURATION_FORMAT_EDEFAULT, oldDurationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDurationFormat() {
		return durationFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(Duration newWork) {
		Duration oldWork = work;
		work = newWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__WORK, oldWork, work));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(XMLGregorianCalendar newStop) {
		XMLGregorianCalendar oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__STOP, oldStop, stop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getResume() {
		return resume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResume(XMLGregorianCalendar newResume) {
		XMLGregorianCalendar oldResume = resume;
		resume = newResume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__RESUME, oldResume, resume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResumeValid() {
		return resumeValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResumeValid(boolean newResumeValid) {
		boolean oldResumeValid = resumeValid;
		resumeValid = newResumeValid;
		boolean oldResumeValidESet = resumeValidESet;
		resumeValidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__RESUME_VALID, oldResumeValid, resumeValid, !oldResumeValidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResumeValid() {
		boolean oldResumeValid = resumeValid;
		boolean oldResumeValidESet = resumeValidESet;
		resumeValid = RESUME_VALID_EDEFAULT;
		resumeValidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__RESUME_VALID, oldResumeValid, RESUME_VALID_EDEFAULT, oldResumeValidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResumeValid() {
		return resumeValidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEffortDriven() {
		return effortDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffortDriven(boolean newEffortDriven) {
		boolean oldEffortDriven = effortDriven;
		effortDriven = newEffortDriven;
		boolean oldEffortDrivenESet = effortDrivenESet;
		effortDrivenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__EFFORT_DRIVEN, oldEffortDriven, effortDriven, !oldEffortDrivenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffortDriven() {
		boolean oldEffortDriven = effortDriven;
		boolean oldEffortDrivenESet = effortDrivenESet;
		effortDriven = EFFORT_DRIVEN_EDEFAULT;
		effortDrivenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__EFFORT_DRIVEN, oldEffortDriven, EFFORT_DRIVEN_EDEFAULT, oldEffortDrivenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffortDriven() {
		return effortDrivenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecurring() {
		return recurring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurring(boolean newRecurring) {
		boolean oldRecurring = recurring;
		recurring = newRecurring;
		boolean oldRecurringESet = recurringESet;
		recurringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__RECURRING, oldRecurring, recurring, !oldRecurringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecurring() {
		boolean oldRecurring = recurring;
		boolean oldRecurringESet = recurringESet;
		recurring = RECURRING_EDEFAULT;
		recurringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__RECURRING, oldRecurring, RECURRING_EDEFAULT, oldRecurringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecurring() {
		return recurringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverAllocated() {
		return overAllocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverAllocated(boolean newOverAllocated) {
		boolean oldOverAllocated = overAllocated;
		overAllocated = newOverAllocated;
		boolean oldOverAllocatedESet = overAllocatedESet;
		overAllocatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__OVER_ALLOCATED, oldOverAllocated, overAllocated, !oldOverAllocatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverAllocated() {
		boolean oldOverAllocated = overAllocated;
		boolean oldOverAllocatedESet = overAllocatedESet;
		overAllocated = OVER_ALLOCATED_EDEFAULT;
		overAllocatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__OVER_ALLOCATED, oldOverAllocated, OVER_ALLOCATED_EDEFAULT, oldOverAllocatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverAllocated() {
		return overAllocatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstimated() {
		return estimated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimated(boolean newEstimated) {
		boolean oldEstimated = estimated;
		estimated = newEstimated;
		boolean oldEstimatedESet = estimatedESet;
		estimatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ESTIMATED, oldEstimated, estimated, !oldEstimatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstimated() {
		boolean oldEstimated = estimated;
		boolean oldEstimatedESet = estimatedESet;
		estimated = ESTIMATED_EDEFAULT;
		estimatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__ESTIMATED, oldEstimated, ESTIMATED_EDEFAULT, oldEstimatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstimated() {
		return estimatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMilestone() {
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMilestone(boolean newMilestone) {
		boolean oldMilestone = milestone;
		milestone = newMilestone;
		boolean oldMilestoneESet = milestoneESet;
		milestoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__MILESTONE, oldMilestone, milestone, !oldMilestoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMilestone() {
		boolean oldMilestone = milestone;
		boolean oldMilestoneESet = milestoneESet;
		milestone = MILESTONE_EDEFAULT;
		milestoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__MILESTONE, oldMilestone, MILESTONE_EDEFAULT, oldMilestoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMilestone() {
		return milestoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(boolean newSummary) {
		boolean oldSummary = summary;
		summary = newSummary;
		boolean oldSummaryESet = summaryESet;
		summaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__SUMMARY, oldSummary, summary, !oldSummaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSummary() {
		boolean oldSummary = summary;
		boolean oldSummaryESet = summaryESet;
		summary = SUMMARY_EDEFAULT;
		summaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__SUMMARY, oldSummary, SUMMARY_EDEFAULT, oldSummaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSummary() {
		return summaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		boolean oldCritical = critical;
		critical = newCritical;
		boolean oldCriticalESet = criticalESet;
		criticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__CRITICAL, oldCritical, critical, !oldCriticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCritical() {
		boolean oldCritical = critical;
		boolean oldCriticalESet = criticalESet;
		critical = CRITICAL_EDEFAULT;
		criticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__CRITICAL, oldCritical, CRITICAL_EDEFAULT, oldCriticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCritical() {
		return criticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubproject() {
		return isSubproject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubproject(boolean newIsSubproject) {
		boolean oldIsSubproject = isSubproject;
		isSubproject = newIsSubproject;
		boolean oldIsSubprojectESet = isSubprojectESet;
		isSubprojectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__IS_SUBPROJECT, oldIsSubproject, isSubproject, !oldIsSubprojectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSubproject() {
		boolean oldIsSubproject = isSubproject;
		boolean oldIsSubprojectESet = isSubprojectESet;
		isSubproject = IS_SUBPROJECT_EDEFAULT;
		isSubprojectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__IS_SUBPROJECT, oldIsSubproject, IS_SUBPROJECT_EDEFAULT, oldIsSubprojectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSubproject() {
		return isSubprojectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubprojectReadOnly() {
		return isSubprojectReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubprojectReadOnly(boolean newIsSubprojectReadOnly) {
		boolean oldIsSubprojectReadOnly = isSubprojectReadOnly;
		isSubprojectReadOnly = newIsSubprojectReadOnly;
		boolean oldIsSubprojectReadOnlyESet = isSubprojectReadOnlyESet;
		isSubprojectReadOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__IS_SUBPROJECT_READ_ONLY, oldIsSubprojectReadOnly, isSubprojectReadOnly, !oldIsSubprojectReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSubprojectReadOnly() {
		boolean oldIsSubprojectReadOnly = isSubprojectReadOnly;
		boolean oldIsSubprojectReadOnlyESet = isSubprojectReadOnlyESet;
		isSubprojectReadOnly = IS_SUBPROJECT_READ_ONLY_EDEFAULT;
		isSubprojectReadOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__IS_SUBPROJECT_READ_ONLY, oldIsSubprojectReadOnly, IS_SUBPROJECT_READ_ONLY_EDEFAULT, oldIsSubprojectReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSubprojectReadOnly() {
		return isSubprojectReadOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubprojectName() {
		return subprojectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubprojectName(String newSubprojectName) {
		String oldSubprojectName = subprojectName;
		subprojectName = newSubprojectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__SUBPROJECT_NAME, oldSubprojectName, subprojectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternalTask() {
		return externalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalTask(boolean newExternalTask) {
		boolean oldExternalTask = externalTask;
		externalTask = newExternalTask;
		boolean oldExternalTaskESet = externalTaskESet;
		externalTaskESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__EXTERNAL_TASK, oldExternalTask, externalTask, !oldExternalTaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExternalTask() {
		boolean oldExternalTask = externalTask;
		boolean oldExternalTaskESet = externalTaskESet;
		externalTask = EXTERNAL_TASK_EDEFAULT;
		externalTaskESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__EXTERNAL_TASK, oldExternalTask, EXTERNAL_TASK_EDEFAULT, oldExternalTaskESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExternalTask() {
		return externalTaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalTaskProject() {
		return externalTaskProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalTaskProject(String newExternalTaskProject) {
		String oldExternalTaskProject = externalTaskProject;
		externalTaskProject = newExternalTaskProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__EXTERNAL_TASK_PROJECT, oldExternalTaskProject, externalTaskProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEarlyStart() {
		return earlyStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyStart(XMLGregorianCalendar newEarlyStart) {
		XMLGregorianCalendar oldEarlyStart = earlyStart;
		earlyStart = newEarlyStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__EARLY_START, oldEarlyStart, earlyStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEarlyFinish() {
		return earlyFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyFinish(XMLGregorianCalendar newEarlyFinish) {
		XMLGregorianCalendar oldEarlyFinish = earlyFinish;
		earlyFinish = newEarlyFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__EARLY_FINISH, oldEarlyFinish, earlyFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLateStart() {
		return lateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateStart(XMLGregorianCalendar newLateStart) {
		XMLGregorianCalendar oldLateStart = lateStart;
		lateStart = newLateStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__LATE_START, oldLateStart, lateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLateFinish() {
		return lateFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateFinish(XMLGregorianCalendar newLateFinish) {
		XMLGregorianCalendar oldLateFinish = lateFinish;
		lateFinish = newLateFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__LATE_FINISH, oldLateFinish, lateFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartVariance() {
		return startVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartVariance(BigInteger newStartVariance) {
		BigInteger oldStartVariance = startVariance;
		startVariance = newStartVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__START_VARIANCE, oldStartVariance, startVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFinishVariance() {
		return finishVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishVariance(BigInteger newFinishVariance) {
		BigInteger oldFinishVariance = finishVariance;
		finishVariance = newFinishVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__FINISH_VARIANCE, oldFinishVariance, finishVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorkVariance() {
		return workVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkVariance(float newWorkVariance) {
		float oldWorkVariance = workVariance;
		workVariance = newWorkVariance;
		boolean oldWorkVarianceESet = workVarianceESet;
		workVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__WORK_VARIANCE, oldWorkVariance, workVariance, !oldWorkVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkVariance() {
		float oldWorkVariance = workVariance;
		boolean oldWorkVarianceESet = workVarianceESet;
		workVariance = WORK_VARIANCE_EDEFAULT;
		workVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__WORK_VARIANCE, oldWorkVariance, WORK_VARIANCE_EDEFAULT, oldWorkVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkVariance() {
		return workVarianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFreeSlack() {
		return freeSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeSlack(BigInteger newFreeSlack) {
		BigInteger oldFreeSlack = freeSlack;
		freeSlack = newFreeSlack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__FREE_SLACK, oldFreeSlack, freeSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTotalSlack() {
		return totalSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalSlack(BigInteger newTotalSlack) {
		BigInteger oldTotalSlack = totalSlack;
		totalSlack = newTotalSlack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__TOTAL_SLACK, oldTotalSlack, totalSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFixedCost() {
		return fixedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedCost(float newFixedCost) {
		float oldFixedCost = fixedCost;
		fixedCost = newFixedCost;
		boolean oldFixedCostESet = fixedCostESet;
		fixedCostESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__FIXED_COST, oldFixedCost, fixedCost, !oldFixedCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixedCost() {
		float oldFixedCost = fixedCost;
		boolean oldFixedCostESet = fixedCostESet;
		fixedCost = FIXED_COST_EDEFAULT;
		fixedCostESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__FIXED_COST, oldFixedCost, FIXED_COST_EDEFAULT, oldFixedCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixedCost() {
		return fixedCostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCostAccrualType getFixedCostAccrual() {
		return fixedCostAccrual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedCostAccrual(FixedCostAccrualType newFixedCostAccrual) {
		FixedCostAccrualType oldFixedCostAccrual = fixedCostAccrual;
		fixedCostAccrual = newFixedCostAccrual == null ? FIXED_COST_ACCRUAL_EDEFAULT : newFixedCostAccrual;
		boolean oldFixedCostAccrualESet = fixedCostAccrualESet;
		fixedCostAccrualESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__FIXED_COST_ACCRUAL, oldFixedCostAccrual, fixedCostAccrual, !oldFixedCostAccrualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixedCostAccrual() {
		FixedCostAccrualType oldFixedCostAccrual = fixedCostAccrual;
		boolean oldFixedCostAccrualESet = fixedCostAccrualESet;
		fixedCostAccrual = FIXED_COST_ACCRUAL_EDEFAULT;
		fixedCostAccrualESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__FIXED_COST_ACCRUAL, oldFixedCostAccrual, FIXED_COST_ACCRUAL_EDEFAULT, oldFixedCostAccrualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixedCostAccrual() {
		return fixedCostAccrualESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPercentComplete() {
		return percentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentComplete(BigInteger newPercentComplete) {
		BigInteger oldPercentComplete = percentComplete;
		percentComplete = newPercentComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__PERCENT_COMPLETE, oldPercentComplete, percentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPercentWorkComplete() {
		return percentWorkComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentWorkComplete(BigInteger newPercentWorkComplete) {
		BigInteger oldPercentWorkComplete = percentWorkComplete;
		percentWorkComplete = newPercentWorkComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__PERCENT_WORK_COMPLETE, oldPercentWorkComplete, percentWorkComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(BigDecimal newCost) {
		BigDecimal oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOvertimeCost() {
		return overtimeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeCost(BigDecimal newOvertimeCost) {
		BigDecimal oldOvertimeCost = overtimeCost;
		overtimeCost = newOvertimeCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__OVERTIME_COST, oldOvertimeCost, overtimeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getOvertimeWork() {
		return overtimeWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeWork(Duration newOvertimeWork) {
		Duration oldOvertimeWork = overtimeWork;
		overtimeWork = newOvertimeWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__OVERTIME_WORK, oldOvertimeWork, overtimeWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getActualStart() {
		return actualStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualStart(XMLGregorianCalendar newActualStart) {
		XMLGregorianCalendar oldActualStart = actualStart;
		actualStart = newActualStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_START, oldActualStart, actualStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getActualFinish() {
		return actualFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualFinish(XMLGregorianCalendar newActualFinish) {
		XMLGregorianCalendar oldActualFinish = actualFinish;
		actualFinish = newActualFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_FINISH, oldActualFinish, actualFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualDuration() {
		return actualDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualDuration(Duration newActualDuration) {
		Duration oldActualDuration = actualDuration;
		actualDuration = newActualDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_DURATION, oldActualDuration, actualDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getActualCost() {
		return actualCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualCost(BigDecimal newActualCost) {
		BigDecimal oldActualCost = actualCost;
		actualCost = newActualCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_COST, oldActualCost, actualCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getActualOvertimeCost() {
		return actualOvertimeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualOvertimeCost(BigDecimal newActualOvertimeCost) {
		BigDecimal oldActualOvertimeCost = actualOvertimeCost;
		actualOvertimeCost = newActualOvertimeCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_COST, oldActualOvertimeCost, actualOvertimeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualWork() {
		return actualWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualWork(Duration newActualWork) {
		Duration oldActualWork = actualWork;
		actualWork = newActualWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_WORK, oldActualWork, actualWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualOvertimeWork() {
		return actualOvertimeWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualOvertimeWork(Duration newActualOvertimeWork) {
		Duration oldActualOvertimeWork = actualOvertimeWork;
		actualOvertimeWork = newActualOvertimeWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK, oldActualOvertimeWork, actualOvertimeWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRegularWork() {
		return regularWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularWork(Duration newRegularWork) {
		Duration oldRegularWork = regularWork;
		regularWork = newRegularWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__REGULAR_WORK, oldRegularWork, regularWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRemainingDuration() {
		return remainingDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingDuration(Duration newRemainingDuration) {
		Duration oldRemainingDuration = remainingDuration;
		remainingDuration = newRemainingDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__REMAINING_DURATION, oldRemainingDuration, remainingDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRemainingCost() {
		return remainingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingCost(BigDecimal newRemainingCost) {
		BigDecimal oldRemainingCost = remainingCost;
		remainingCost = newRemainingCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__REMAINING_COST, oldRemainingCost, remainingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRemainingWork() {
		return remainingWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingWork(Duration newRemainingWork) {
		Duration oldRemainingWork = remainingWork;
		remainingWork = newRemainingWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__REMAINING_WORK, oldRemainingWork, remainingWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getRemainingOvertimeCost() {
		return remainingOvertimeCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingOvertimeCost(BigDecimal newRemainingOvertimeCost) {
		BigDecimal oldRemainingOvertimeCost = remainingOvertimeCost;
		remainingOvertimeCost = newRemainingOvertimeCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_COST, oldRemainingOvertimeCost, remainingOvertimeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRemainingOvertimeWork() {
		return remainingOvertimeWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingOvertimeWork(Duration newRemainingOvertimeWork) {
		Duration oldRemainingOvertimeWork = remainingOvertimeWork;
		remainingOvertimeWork = newRemainingOvertimeWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_WORK, oldRemainingOvertimeWork, remainingOvertimeWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getACWP() {
		return aCWP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACWP(float newACWP) {
		float oldACWP = aCWP;
		aCWP = newACWP;
		boolean oldACWPESet = aCWPESet;
		aCWPESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACWP, oldACWP, aCWP, !oldACWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetACWP() {
		float oldACWP = aCWP;
		boolean oldACWPESet = aCWPESet;
		aCWP = ACWP_EDEFAULT;
		aCWPESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__ACWP, oldACWP, ACWP_EDEFAULT, oldACWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetACWP() {
		return aCWPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCV() {
		return cV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCV(float newCV) {
		float oldCV = cV;
		cV = newCV;
		boolean oldCVESet = cVESet;
		cVESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__CV, oldCV, cV, !oldCVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCV() {
		float oldCV = cV;
		boolean oldCVESet = cVESet;
		cV = CV_EDEFAULT;
		cVESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__CV, oldCV, CV_EDEFAULT, oldCVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCV() {
		return cVESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTypeType getConstraintType() {
		return constraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintType(ConstraintTypeType newConstraintType) {
		ConstraintTypeType oldConstraintType = constraintType;
		constraintType = newConstraintType == null ? CONSTRAINT_TYPE_EDEFAULT : newConstraintType;
		boolean oldConstraintTypeESet = constraintTypeESet;
		constraintTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__CONSTRAINT_TYPE, oldConstraintType, constraintType, !oldConstraintTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraintType() {
		ConstraintTypeType oldConstraintType = constraintType;
		boolean oldConstraintTypeESet = constraintTypeESet;
		constraintType = CONSTRAINT_TYPE_EDEFAULT;
		constraintTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__CONSTRAINT_TYPE, oldConstraintType, CONSTRAINT_TYPE_EDEFAULT, oldConstraintTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintType() {
		return constraintTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCalendarUID() {
		return calendarUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarUID(BigInteger newCalendarUID) {
		BigInteger oldCalendarUID = calendarUID;
		calendarUID = newCalendarUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__CALENDAR_UID, oldCalendarUID, calendarUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getConstraintDate() {
		return constraintDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintDate(XMLGregorianCalendar newConstraintDate) {
		XMLGregorianCalendar oldConstraintDate = constraintDate;
		constraintDate = newConstraintDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__CONSTRAINT_DATE, oldConstraintDate, constraintDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(XMLGregorianCalendar newDeadline) {
		XMLGregorianCalendar oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLevelAssignments() {
		return levelAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelAssignments(boolean newLevelAssignments) {
		boolean oldLevelAssignments = levelAssignments;
		levelAssignments = newLevelAssignments;
		boolean oldLevelAssignmentsESet = levelAssignmentsESet;
		levelAssignmentsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__LEVEL_ASSIGNMENTS, oldLevelAssignments, levelAssignments, !oldLevelAssignmentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevelAssignments() {
		boolean oldLevelAssignments = levelAssignments;
		boolean oldLevelAssignmentsESet = levelAssignmentsESet;
		levelAssignments = LEVEL_ASSIGNMENTS_EDEFAULT;
		levelAssignmentsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__LEVEL_ASSIGNMENTS, oldLevelAssignments, LEVEL_ASSIGNMENTS_EDEFAULT, oldLevelAssignmentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLevelAssignments() {
		return levelAssignmentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLevelingCanSplit() {
		return levelingCanSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelingCanSplit(boolean newLevelingCanSplit) {
		boolean oldLevelingCanSplit = levelingCanSplit;
		levelingCanSplit = newLevelingCanSplit;
		boolean oldLevelingCanSplitESet = levelingCanSplitESet;
		levelingCanSplitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__LEVELING_CAN_SPLIT, oldLevelingCanSplit, levelingCanSplit, !oldLevelingCanSplitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevelingCanSplit() {
		boolean oldLevelingCanSplit = levelingCanSplit;
		boolean oldLevelingCanSplitESet = levelingCanSplitESet;
		levelingCanSplit = LEVELING_CAN_SPLIT_EDEFAULT;
		levelingCanSplitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__LEVELING_CAN_SPLIT, oldLevelingCanSplit, LEVELING_CAN_SPLIT_EDEFAULT, oldLevelingCanSplitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLevelingCanSplit() {
		return levelingCanSplitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLevelingDelay() {
		return levelingDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelingDelay(BigInteger newLevelingDelay) {
		BigInteger oldLevelingDelay = levelingDelay;
		levelingDelay = newLevelingDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__LEVELING_DELAY, oldLevelingDelay, levelingDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelingDelayFormatType1 getLevelingDelayFormat() {
		return levelingDelayFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelingDelayFormat(LevelingDelayFormatType1 newLevelingDelayFormat) {
		LevelingDelayFormatType1 oldLevelingDelayFormat = levelingDelayFormat;
		levelingDelayFormat = newLevelingDelayFormat == null ? LEVELING_DELAY_FORMAT_EDEFAULT : newLevelingDelayFormat;
		boolean oldLevelingDelayFormatESet = levelingDelayFormatESet;
		levelingDelayFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__LEVELING_DELAY_FORMAT, oldLevelingDelayFormat, levelingDelayFormat, !oldLevelingDelayFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevelingDelayFormat() {
		LevelingDelayFormatType1 oldLevelingDelayFormat = levelingDelayFormat;
		boolean oldLevelingDelayFormatESet = levelingDelayFormatESet;
		levelingDelayFormat = LEVELING_DELAY_FORMAT_EDEFAULT;
		levelingDelayFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__LEVELING_DELAY_FORMAT, oldLevelingDelayFormat, LEVELING_DELAY_FORMAT_EDEFAULT, oldLevelingDelayFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLevelingDelayFormat() {
		return levelingDelayFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPreLeveledStart() {
		return preLeveledStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreLeveledStart(XMLGregorianCalendar newPreLeveledStart) {
		XMLGregorianCalendar oldPreLeveledStart = preLeveledStart;
		preLeveledStart = newPreLeveledStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__PRE_LEVELED_START, oldPreLeveledStart, preLeveledStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPreLeveledFinish() {
		return preLeveledFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreLeveledFinish(XMLGregorianCalendar newPreLeveledFinish) {
		XMLGregorianCalendar oldPreLeveledFinish = preLeveledFinish;
		preLeveledFinish = newPreLeveledFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__PRE_LEVELED_FINISH, oldPreLeveledFinish, preLeveledFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlink() {
		return hyperlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlink(String newHyperlink) {
		String oldHyperlink = hyperlink;
		hyperlink = newHyperlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__HYPERLINK, oldHyperlink, hyperlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlinkAddress() {
		return hyperlinkAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlinkAddress(String newHyperlinkAddress) {
		String oldHyperlinkAddress = hyperlinkAddress;
		hyperlinkAddress = newHyperlinkAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__HYPERLINK_ADDRESS, oldHyperlinkAddress, hyperlinkAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlinkSubAddress() {
		return hyperlinkSubAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlinkSubAddress(String newHyperlinkSubAddress) {
		String oldHyperlinkSubAddress = hyperlinkSubAddress;
		hyperlinkSubAddress = newHyperlinkSubAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__HYPERLINK_SUB_ADDRESS, oldHyperlinkSubAddress, hyperlinkSubAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreResourceCalendar() {
		return ignoreResourceCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreResourceCalendar(boolean newIgnoreResourceCalendar) {
		boolean oldIgnoreResourceCalendar = ignoreResourceCalendar;
		ignoreResourceCalendar = newIgnoreResourceCalendar;
		boolean oldIgnoreResourceCalendarESet = ignoreResourceCalendarESet;
		ignoreResourceCalendarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__IGNORE_RESOURCE_CALENDAR, oldIgnoreResourceCalendar, ignoreResourceCalendar, !oldIgnoreResourceCalendarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreResourceCalendar() {
		boolean oldIgnoreResourceCalendar = ignoreResourceCalendar;
		boolean oldIgnoreResourceCalendarESet = ignoreResourceCalendarESet;
		ignoreResourceCalendar = IGNORE_RESOURCE_CALENDAR_EDEFAULT;
		ignoreResourceCalendarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__IGNORE_RESOURCE_CALENDAR, oldIgnoreResourceCalendar, IGNORE_RESOURCE_CALENDAR_EDEFAULT, oldIgnoreResourceCalendarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreResourceCalendar() {
		return ignoreResourceCalendarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideBar() {
		return hideBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideBar(boolean newHideBar) {
		boolean oldHideBar = hideBar;
		hideBar = newHideBar;
		boolean oldHideBarESet = hideBarESet;
		hideBarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__HIDE_BAR, oldHideBar, hideBar, !oldHideBarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHideBar() {
		boolean oldHideBar = hideBar;
		boolean oldHideBarESet = hideBarESet;
		hideBar = HIDE_BAR_EDEFAULT;
		hideBarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__HIDE_BAR, oldHideBar, HIDE_BAR_EDEFAULT, oldHideBarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHideBar() {
		return hideBarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRollup() {
		return rollup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollup(boolean newRollup) {
		boolean oldRollup = rollup;
		rollup = newRollup;
		boolean oldRollupESet = rollupESet;
		rollupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ROLLUP, oldRollup, rollup, !oldRollupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRollup() {
		boolean oldRollup = rollup;
		boolean oldRollupESet = rollupESet;
		rollup = ROLLUP_EDEFAULT;
		rollupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__ROLLUP, oldRollup, ROLLUP_EDEFAULT, oldRollupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRollup() {
		return rollupESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBCWS() {
		return bCWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCWS(float newBCWS) {
		float oldBCWS = bCWS;
		bCWS = newBCWS;
		boolean oldBCWSESet = bCWSESet;
		bCWSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__BCWS, oldBCWS, bCWS, !oldBCWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBCWS() {
		float oldBCWS = bCWS;
		boolean oldBCWSESet = bCWSESet;
		bCWS = BCWS_EDEFAULT;
		bCWSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__BCWS, oldBCWS, BCWS_EDEFAULT, oldBCWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBCWS() {
		return bCWSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBCWP() {
		return bCWP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCWP(float newBCWP) {
		float oldBCWP = bCWP;
		bCWP = newBCWP;
		boolean oldBCWPESet = bCWPESet;
		bCWPESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__BCWP, oldBCWP, bCWP, !oldBCWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBCWP() {
		float oldBCWP = bCWP;
		boolean oldBCWPESet = bCWPESet;
		bCWP = BCWP_EDEFAULT;
		bCWPESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__BCWP, oldBCWP, BCWP_EDEFAULT, oldBCWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBCWP() {
		return bCWPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPhysicalPercentComplete() {
		return physicalPercentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalPercentComplete(BigInteger newPhysicalPercentComplete) {
		BigInteger oldPhysicalPercentComplete = physicalPercentComplete;
		physicalPercentComplete = newPhysicalPercentComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__PHYSICAL_PERCENT_COMPLETE, oldPhysicalPercentComplete, physicalPercentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarnedValueMethodType getEarnedValueMethod() {
		return earnedValueMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarnedValueMethod(EarnedValueMethodType newEarnedValueMethod) {
		EarnedValueMethodType oldEarnedValueMethod = earnedValueMethod;
		earnedValueMethod = newEarnedValueMethod == null ? EARNED_VALUE_METHOD_EDEFAULT : newEarnedValueMethod;
		boolean oldEarnedValueMethodESet = earnedValueMethodESet;
		earnedValueMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__EARNED_VALUE_METHOD, oldEarnedValueMethod, earnedValueMethod, !oldEarnedValueMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEarnedValueMethod() {
		EarnedValueMethodType oldEarnedValueMethod = earnedValueMethod;
		boolean oldEarnedValueMethodESet = earnedValueMethodESet;
		earnedValueMethod = EARNED_VALUE_METHOD_EDEFAULT;
		earnedValueMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__EARNED_VALUE_METHOD, oldEarnedValueMethod, EARNED_VALUE_METHOD_EDEFAULT, oldEarnedValueMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEarnedValueMethod() {
		return earnedValueMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PredecessorLinkType> getPredecessorLink() {
		if (predecessorLink == null) {
			predecessorLink = new EObjectContainmentEList<PredecessorLinkType>(PredecessorLinkType.class, this, MspdiPackage.TASK_TYPE__PREDECESSOR_LINK);
		}
		return predecessorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualWorkProtected() {
		return actualWorkProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualWorkProtected(Duration newActualWorkProtected) {
		Duration oldActualWorkProtected = actualWorkProtected;
		actualWorkProtected = newActualWorkProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_WORK_PROTECTED, oldActualWorkProtected, actualWorkProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getActualOvertimeWorkProtected() {
		return actualOvertimeWorkProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualOvertimeWorkProtected(Duration newActualOvertimeWorkProtected) {
		Duration oldActualOvertimeWorkProtected = actualOvertimeWorkProtected;
		actualOvertimeWorkProtected = newActualOvertimeWorkProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED, oldActualOvertimeWorkProtected, actualOvertimeWorkProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedAttributeType2> getExtendedAttribute() {
		if (extendedAttribute == null) {
			extendedAttribute = new EObjectContainmentEList<ExtendedAttributeType2>(ExtendedAttributeType2.class, this, MspdiPackage.TASK_TYPE__EXTENDED_ATTRIBUTE);
		}
		return extendedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaselineType2> getBaseline() {
		if (baseline == null) {
			baseline = new EObjectContainmentEList<BaselineType2>(BaselineType2.class, this, MspdiPackage.TASK_TYPE__BASELINE);
		}
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutlineCodeType> getOutlineCode() {
		if (outlineCode == null) {
			outlineCode = new EObjectContainmentEList<OutlineCodeType>(OutlineCodeType.class, this, MspdiPackage.TASK_TYPE__OUTLINE_CODE);
		}
		return outlineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPublished() {
		return isPublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublished(boolean newIsPublished) {
		boolean oldIsPublished = isPublished;
		isPublished = newIsPublished;
		boolean oldIsPublishedESet = isPublishedESet;
		isPublishedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__IS_PUBLISHED, oldIsPublished, isPublished, !oldIsPublishedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPublished() {
		boolean oldIsPublished = isPublished;
		boolean oldIsPublishedESet = isPublishedESet;
		isPublished = IS_PUBLISHED_EDEFAULT;
		isPublishedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__IS_PUBLISHED, oldIsPublished, IS_PUBLISHED_EDEFAULT, oldIsPublishedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPublished() {
		return isPublishedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatusManager() {
		return statusManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusManager(String newStatusManager) {
		String oldStatusManager = statusManager;
		statusManager = newStatusManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__STATUS_MANAGER, oldStatusManager, statusManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCommitmentStart() {
		return commitmentStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitmentStart(XMLGregorianCalendar newCommitmentStart) {
		XMLGregorianCalendar oldCommitmentStart = commitmentStart;
		commitmentStart = newCommitmentStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__COMMITMENT_START, oldCommitmentStart, commitmentStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCommitmentFinish() {
		return commitmentFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitmentFinish(XMLGregorianCalendar newCommitmentFinish) {
		XMLGregorianCalendar oldCommitmentFinish = commitmentFinish;
		commitmentFinish = newCommitmentFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__COMMITMENT_FINISH, oldCommitmentFinish, commitmentFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentTypeType getCommitmentType() {
		return commitmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitmentType(CommitmentTypeType newCommitmentType) {
		CommitmentTypeType oldCommitmentType = commitmentType;
		commitmentType = newCommitmentType == null ? COMMITMENT_TYPE_EDEFAULT : newCommitmentType;
		boolean oldCommitmentTypeESet = commitmentTypeESet;
		commitmentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.TASK_TYPE__COMMITMENT_TYPE, oldCommitmentType, commitmentType, !oldCommitmentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommitmentType() {
		CommitmentTypeType oldCommitmentType = commitmentType;
		boolean oldCommitmentTypeESet = commitmentTypeESet;
		commitmentType = COMMITMENT_TYPE_EDEFAULT;
		commitmentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.TASK_TYPE__COMMITMENT_TYPE, oldCommitmentType, COMMITMENT_TYPE_EDEFAULT, oldCommitmentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommitmentType() {
		return commitmentTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimephasedDataType> getTimephasedData() {
		if (timephasedData == null) {
			timephasedData = new EObjectContainmentEList<TimephasedDataType>(TimephasedDataType.class, this, MspdiPackage.TASK_TYPE__TIMEPHASED_DATA);
		}
		return timephasedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.TASK_TYPE__PREDECESSOR_LINK:
				return ((InternalEList<?>)getPredecessorLink()).basicRemove(otherEnd, msgs);
			case MspdiPackage.TASK_TYPE__EXTENDED_ATTRIBUTE:
				return ((InternalEList<?>)getExtendedAttribute()).basicRemove(otherEnd, msgs);
			case MspdiPackage.TASK_TYPE__BASELINE:
				return ((InternalEList<?>)getBaseline()).basicRemove(otherEnd, msgs);
			case MspdiPackage.TASK_TYPE__OUTLINE_CODE:
				return ((InternalEList<?>)getOutlineCode()).basicRemove(otherEnd, msgs);
			case MspdiPackage.TASK_TYPE__TIMEPHASED_DATA:
				return ((InternalEList<?>)getTimephasedData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.TASK_TYPE__UID:
				return getUID();
			case MspdiPackage.TASK_TYPE__ID:
				return getID();
			case MspdiPackage.TASK_TYPE__NAME:
				return getName();
			case MspdiPackage.TASK_TYPE__TYPE:
				return getType();
			case MspdiPackage.TASK_TYPE__IS_NULL:
				return isIsNull();
			case MspdiPackage.TASK_TYPE__CREATE_DATE:
				return getCreateDate();
			case MspdiPackage.TASK_TYPE__CONTACT:
				return getContact();
			case MspdiPackage.TASK_TYPE__WBS:
				return getWBS();
			case MspdiPackage.TASK_TYPE__WBS_LEVEL:
				return getWBSLevel();
			case MspdiPackage.TASK_TYPE__OUTLINE_NUMBER:
				return getOutlineNumber();
			case MspdiPackage.TASK_TYPE__OUTLINE_LEVEL:
				return getOutlineLevel();
			case MspdiPackage.TASK_TYPE__PRIORITY:
				return getPriority();
			case MspdiPackage.TASK_TYPE__START:
				return getStart();
			case MspdiPackage.TASK_TYPE__FINISH:
				return getFinish();
			case MspdiPackage.TASK_TYPE__DURATION:
				return getDuration();
			case MspdiPackage.TASK_TYPE__DURATION_FORMAT:
				return getDurationFormat();
			case MspdiPackage.TASK_TYPE__WORK:
				return getWork();
			case MspdiPackage.TASK_TYPE__STOP:
				return getStop();
			case MspdiPackage.TASK_TYPE__RESUME:
				return getResume();
			case MspdiPackage.TASK_TYPE__RESUME_VALID:
				return isResumeValid();
			case MspdiPackage.TASK_TYPE__EFFORT_DRIVEN:
				return isEffortDriven();
			case MspdiPackage.TASK_TYPE__RECURRING:
				return isRecurring();
			case MspdiPackage.TASK_TYPE__OVER_ALLOCATED:
				return isOverAllocated();
			case MspdiPackage.TASK_TYPE__ESTIMATED:
				return isEstimated();
			case MspdiPackage.TASK_TYPE__MILESTONE:
				return isMilestone();
			case MspdiPackage.TASK_TYPE__SUMMARY:
				return isSummary();
			case MspdiPackage.TASK_TYPE__CRITICAL:
				return isCritical();
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT:
				return isIsSubproject();
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT_READ_ONLY:
				return isIsSubprojectReadOnly();
			case MspdiPackage.TASK_TYPE__SUBPROJECT_NAME:
				return getSubprojectName();
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK:
				return isExternalTask();
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK_PROJECT:
				return getExternalTaskProject();
			case MspdiPackage.TASK_TYPE__EARLY_START:
				return getEarlyStart();
			case MspdiPackage.TASK_TYPE__EARLY_FINISH:
				return getEarlyFinish();
			case MspdiPackage.TASK_TYPE__LATE_START:
				return getLateStart();
			case MspdiPackage.TASK_TYPE__LATE_FINISH:
				return getLateFinish();
			case MspdiPackage.TASK_TYPE__START_VARIANCE:
				return getStartVariance();
			case MspdiPackage.TASK_TYPE__FINISH_VARIANCE:
				return getFinishVariance();
			case MspdiPackage.TASK_TYPE__WORK_VARIANCE:
				return getWorkVariance();
			case MspdiPackage.TASK_TYPE__FREE_SLACK:
				return getFreeSlack();
			case MspdiPackage.TASK_TYPE__TOTAL_SLACK:
				return getTotalSlack();
			case MspdiPackage.TASK_TYPE__FIXED_COST:
				return getFixedCost();
			case MspdiPackage.TASK_TYPE__FIXED_COST_ACCRUAL:
				return getFixedCostAccrual();
			case MspdiPackage.TASK_TYPE__PERCENT_COMPLETE:
				return getPercentComplete();
			case MspdiPackage.TASK_TYPE__PERCENT_WORK_COMPLETE:
				return getPercentWorkComplete();
			case MspdiPackage.TASK_TYPE__COST:
				return getCost();
			case MspdiPackage.TASK_TYPE__OVERTIME_COST:
				return getOvertimeCost();
			case MspdiPackage.TASK_TYPE__OVERTIME_WORK:
				return getOvertimeWork();
			case MspdiPackage.TASK_TYPE__ACTUAL_START:
				return getActualStart();
			case MspdiPackage.TASK_TYPE__ACTUAL_FINISH:
				return getActualFinish();
			case MspdiPackage.TASK_TYPE__ACTUAL_DURATION:
				return getActualDuration();
			case MspdiPackage.TASK_TYPE__ACTUAL_COST:
				return getActualCost();
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_COST:
				return getActualOvertimeCost();
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK:
				return getActualWork();
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK:
				return getActualOvertimeWork();
			case MspdiPackage.TASK_TYPE__REGULAR_WORK:
				return getRegularWork();
			case MspdiPackage.TASK_TYPE__REMAINING_DURATION:
				return getRemainingDuration();
			case MspdiPackage.TASK_TYPE__REMAINING_COST:
				return getRemainingCost();
			case MspdiPackage.TASK_TYPE__REMAINING_WORK:
				return getRemainingWork();
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_COST:
				return getRemainingOvertimeCost();
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_WORK:
				return getRemainingOvertimeWork();
			case MspdiPackage.TASK_TYPE__ACWP:
				return getACWP();
			case MspdiPackage.TASK_TYPE__CV:
				return getCV();
			case MspdiPackage.TASK_TYPE__CONSTRAINT_TYPE:
				return getConstraintType();
			case MspdiPackage.TASK_TYPE__CALENDAR_UID:
				return getCalendarUID();
			case MspdiPackage.TASK_TYPE__CONSTRAINT_DATE:
				return getConstraintDate();
			case MspdiPackage.TASK_TYPE__DEADLINE:
				return getDeadline();
			case MspdiPackage.TASK_TYPE__LEVEL_ASSIGNMENTS:
				return isLevelAssignments();
			case MspdiPackage.TASK_TYPE__LEVELING_CAN_SPLIT:
				return isLevelingCanSplit();
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY:
				return getLevelingDelay();
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY_FORMAT:
				return getLevelingDelayFormat();
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_START:
				return getPreLeveledStart();
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_FINISH:
				return getPreLeveledFinish();
			case MspdiPackage.TASK_TYPE__HYPERLINK:
				return getHyperlink();
			case MspdiPackage.TASK_TYPE__HYPERLINK_ADDRESS:
				return getHyperlinkAddress();
			case MspdiPackage.TASK_TYPE__HYPERLINK_SUB_ADDRESS:
				return getHyperlinkSubAddress();
			case MspdiPackage.TASK_TYPE__IGNORE_RESOURCE_CALENDAR:
				return isIgnoreResourceCalendar();
			case MspdiPackage.TASK_TYPE__NOTES:
				return getNotes();
			case MspdiPackage.TASK_TYPE__HIDE_BAR:
				return isHideBar();
			case MspdiPackage.TASK_TYPE__ROLLUP:
				return isRollup();
			case MspdiPackage.TASK_TYPE__BCWS:
				return getBCWS();
			case MspdiPackage.TASK_TYPE__BCWP:
				return getBCWP();
			case MspdiPackage.TASK_TYPE__PHYSICAL_PERCENT_COMPLETE:
				return getPhysicalPercentComplete();
			case MspdiPackage.TASK_TYPE__EARNED_VALUE_METHOD:
				return getEarnedValueMethod();
			case MspdiPackage.TASK_TYPE__PREDECESSOR_LINK:
				return getPredecessorLink();
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK_PROTECTED:
				return getActualWorkProtected();
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				return getActualOvertimeWorkProtected();
			case MspdiPackage.TASK_TYPE__EXTENDED_ATTRIBUTE:
				return getExtendedAttribute();
			case MspdiPackage.TASK_TYPE__BASELINE:
				return getBaseline();
			case MspdiPackage.TASK_TYPE__OUTLINE_CODE:
				return getOutlineCode();
			case MspdiPackage.TASK_TYPE__IS_PUBLISHED:
				return isIsPublished();
			case MspdiPackage.TASK_TYPE__STATUS_MANAGER:
				return getStatusManager();
			case MspdiPackage.TASK_TYPE__COMMITMENT_START:
				return getCommitmentStart();
			case MspdiPackage.TASK_TYPE__COMMITMENT_FINISH:
				return getCommitmentFinish();
			case MspdiPackage.TASK_TYPE__COMMITMENT_TYPE:
				return getCommitmentType();
			case MspdiPackage.TASK_TYPE__TIMEPHASED_DATA:
				return getTimephasedData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MspdiPackage.TASK_TYPE__UID:
				setUID((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ID:
				setID((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__NAME:
				setName((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__TYPE:
				setType((TypeType3)newValue);
				return;
			case MspdiPackage.TASK_TYPE__IS_NULL:
				setIsNull((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__CREATE_DATE:
				setCreateDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__CONTACT:
				setContact((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__WBS:
				setWBS((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__WBS_LEVEL:
				setWBSLevel((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__OUTLINE_NUMBER:
				setOutlineNumber((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__OUTLINE_LEVEL:
				setOutlineLevel((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__PRIORITY:
				setPriority((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__FINISH:
				setFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__DURATION:
				setDuration((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__DURATION_FORMAT:
				setDurationFormat((DurationFormatType4)newValue);
				return;
			case MspdiPackage.TASK_TYPE__WORK:
				setWork((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__STOP:
				setStop((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__RESUME:
				setResume((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__RESUME_VALID:
				setResumeValid((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__EFFORT_DRIVEN:
				setEffortDriven((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__RECURRING:
				setRecurring((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__OVER_ALLOCATED:
				setOverAllocated((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ESTIMATED:
				setEstimated((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__MILESTONE:
				setMilestone((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__SUMMARY:
				setSummary((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT:
				setIsSubproject((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT_READ_ONLY:
				setIsSubprojectReadOnly((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__SUBPROJECT_NAME:
				setSubprojectName((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK:
				setExternalTask((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK_PROJECT:
				setExternalTaskProject((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__EARLY_START:
				setEarlyStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__EARLY_FINISH:
				setEarlyFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__LATE_START:
				setLateStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__LATE_FINISH:
				setLateFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__START_VARIANCE:
				setStartVariance((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__FINISH_VARIANCE:
				setFinishVariance((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__WORK_VARIANCE:
				setWorkVariance((Float)newValue);
				return;
			case MspdiPackage.TASK_TYPE__FREE_SLACK:
				setFreeSlack((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__TOTAL_SLACK:
				setTotalSlack((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__FIXED_COST:
				setFixedCost((Float)newValue);
				return;
			case MspdiPackage.TASK_TYPE__FIXED_COST_ACCRUAL:
				setFixedCostAccrual((FixedCostAccrualType)newValue);
				return;
			case MspdiPackage.TASK_TYPE__PERCENT_COMPLETE:
				setPercentComplete((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__PERCENT_WORK_COMPLETE:
				setPercentWorkComplete((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__COST:
				setCost((BigDecimal)newValue);
				return;
			case MspdiPackage.TASK_TYPE__OVERTIME_COST:
				setOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.TASK_TYPE__OVERTIME_WORK:
				setOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_START:
				setActualStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_FINISH:
				setActualFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_DURATION:
				setActualDuration((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_COST:
				setActualCost((BigDecimal)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_COST:
				setActualOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK:
				setActualWork((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK:
				setActualOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__REGULAR_WORK:
				setRegularWork((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_DURATION:
				setRemainingDuration((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_COST:
				setRemainingCost((BigDecimal)newValue);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_WORK:
				setRemainingWork((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_COST:
				setRemainingOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_WORK:
				setRemainingOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACWP:
				setACWP((Float)newValue);
				return;
			case MspdiPackage.TASK_TYPE__CV:
				setCV((Float)newValue);
				return;
			case MspdiPackage.TASK_TYPE__CONSTRAINT_TYPE:
				setConstraintType((ConstraintTypeType)newValue);
				return;
			case MspdiPackage.TASK_TYPE__CALENDAR_UID:
				setCalendarUID((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__CONSTRAINT_DATE:
				setConstraintDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__DEADLINE:
				setDeadline((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__LEVEL_ASSIGNMENTS:
				setLevelAssignments((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__LEVELING_CAN_SPLIT:
				setLevelingCanSplit((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY:
				setLevelingDelay((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY_FORMAT:
				setLevelingDelayFormat((LevelingDelayFormatType1)newValue);
				return;
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_START:
				setPreLeveledStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_FINISH:
				setPreLeveledFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__HYPERLINK:
				setHyperlink((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__HYPERLINK_ADDRESS:
				setHyperlinkAddress((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__HYPERLINK_SUB_ADDRESS:
				setHyperlinkSubAddress((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__IGNORE_RESOURCE_CALENDAR:
				setIgnoreResourceCalendar((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__NOTES:
				setNotes((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__HIDE_BAR:
				setHideBar((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ROLLUP:
				setRollup((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__BCWS:
				setBCWS((Float)newValue);
				return;
			case MspdiPackage.TASK_TYPE__BCWP:
				setBCWP((Float)newValue);
				return;
			case MspdiPackage.TASK_TYPE__PHYSICAL_PERCENT_COMPLETE:
				setPhysicalPercentComplete((BigInteger)newValue);
				return;
			case MspdiPackage.TASK_TYPE__EARNED_VALUE_METHOD:
				setEarnedValueMethod((EarnedValueMethodType)newValue);
				return;
			case MspdiPackage.TASK_TYPE__PREDECESSOR_LINK:
				getPredecessorLink().clear();
				getPredecessorLink().addAll((Collection<? extends PredecessorLinkType>)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK_PROTECTED:
				setActualWorkProtected((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				setActualOvertimeWorkProtected((Duration)newValue);
				return;
			case MspdiPackage.TASK_TYPE__EXTENDED_ATTRIBUTE:
				getExtendedAttribute().clear();
				getExtendedAttribute().addAll((Collection<? extends ExtendedAttributeType2>)newValue);
				return;
			case MspdiPackage.TASK_TYPE__BASELINE:
				getBaseline().clear();
				getBaseline().addAll((Collection<? extends BaselineType2>)newValue);
				return;
			case MspdiPackage.TASK_TYPE__OUTLINE_CODE:
				getOutlineCode().clear();
				getOutlineCode().addAll((Collection<? extends OutlineCodeType>)newValue);
				return;
			case MspdiPackage.TASK_TYPE__IS_PUBLISHED:
				setIsPublished((Boolean)newValue);
				return;
			case MspdiPackage.TASK_TYPE__STATUS_MANAGER:
				setStatusManager((String)newValue);
				return;
			case MspdiPackage.TASK_TYPE__COMMITMENT_START:
				setCommitmentStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__COMMITMENT_FINISH:
				setCommitmentFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.TASK_TYPE__COMMITMENT_TYPE:
				setCommitmentType((CommitmentTypeType)newValue);
				return;
			case MspdiPackage.TASK_TYPE__TIMEPHASED_DATA:
				getTimephasedData().clear();
				getTimephasedData().addAll((Collection<? extends TimephasedDataType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MspdiPackage.TASK_TYPE__UID:
				setUID(UID_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__TYPE:
				unsetType();
				return;
			case MspdiPackage.TASK_TYPE__IS_NULL:
				unsetIsNull();
				return;
			case MspdiPackage.TASK_TYPE__CREATE_DATE:
				setCreateDate(CREATE_DATE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__WBS:
				setWBS(WBS_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__WBS_LEVEL:
				setWBSLevel(WBS_LEVEL_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__OUTLINE_NUMBER:
				setOutlineNumber(OUTLINE_NUMBER_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__OUTLINE_LEVEL:
				setOutlineLevel(OUTLINE_LEVEL_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__START:
				setStart(START_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__FINISH:
				setFinish(FINISH_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__DURATION_FORMAT:
				unsetDurationFormat();
				return;
			case MspdiPackage.TASK_TYPE__WORK:
				setWork(WORK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__STOP:
				setStop(STOP_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__RESUME:
				setResume(RESUME_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__RESUME_VALID:
				unsetResumeValid();
				return;
			case MspdiPackage.TASK_TYPE__EFFORT_DRIVEN:
				unsetEffortDriven();
				return;
			case MspdiPackage.TASK_TYPE__RECURRING:
				unsetRecurring();
				return;
			case MspdiPackage.TASK_TYPE__OVER_ALLOCATED:
				unsetOverAllocated();
				return;
			case MspdiPackage.TASK_TYPE__ESTIMATED:
				unsetEstimated();
				return;
			case MspdiPackage.TASK_TYPE__MILESTONE:
				unsetMilestone();
				return;
			case MspdiPackage.TASK_TYPE__SUMMARY:
				unsetSummary();
				return;
			case MspdiPackage.TASK_TYPE__CRITICAL:
				unsetCritical();
				return;
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT:
				unsetIsSubproject();
				return;
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT_READ_ONLY:
				unsetIsSubprojectReadOnly();
				return;
			case MspdiPackage.TASK_TYPE__SUBPROJECT_NAME:
				setSubprojectName(SUBPROJECT_NAME_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK:
				unsetExternalTask();
				return;
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK_PROJECT:
				setExternalTaskProject(EXTERNAL_TASK_PROJECT_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__EARLY_START:
				setEarlyStart(EARLY_START_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__EARLY_FINISH:
				setEarlyFinish(EARLY_FINISH_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__LATE_START:
				setLateStart(LATE_START_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__LATE_FINISH:
				setLateFinish(LATE_FINISH_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__START_VARIANCE:
				setStartVariance(START_VARIANCE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__FINISH_VARIANCE:
				setFinishVariance(FINISH_VARIANCE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__WORK_VARIANCE:
				unsetWorkVariance();
				return;
			case MspdiPackage.TASK_TYPE__FREE_SLACK:
				setFreeSlack(FREE_SLACK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__TOTAL_SLACK:
				setTotalSlack(TOTAL_SLACK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__FIXED_COST:
				unsetFixedCost();
				return;
			case MspdiPackage.TASK_TYPE__FIXED_COST_ACCRUAL:
				unsetFixedCostAccrual();
				return;
			case MspdiPackage.TASK_TYPE__PERCENT_COMPLETE:
				setPercentComplete(PERCENT_COMPLETE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__PERCENT_WORK_COMPLETE:
				setPercentWorkComplete(PERCENT_WORK_COMPLETE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__COST:
				setCost(COST_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__OVERTIME_COST:
				setOvertimeCost(OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__OVERTIME_WORK:
				setOvertimeWork(OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_START:
				setActualStart(ACTUAL_START_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_FINISH:
				setActualFinish(ACTUAL_FINISH_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_DURATION:
				setActualDuration(ACTUAL_DURATION_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_COST:
				setActualCost(ACTUAL_COST_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_COST:
				setActualOvertimeCost(ACTUAL_OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK:
				setActualWork(ACTUAL_WORK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK:
				setActualOvertimeWork(ACTUAL_OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__REGULAR_WORK:
				setRegularWork(REGULAR_WORK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_DURATION:
				setRemainingDuration(REMAINING_DURATION_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_COST:
				setRemainingCost(REMAINING_COST_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_WORK:
				setRemainingWork(REMAINING_WORK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_COST:
				setRemainingOvertimeCost(REMAINING_OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_WORK:
				setRemainingOvertimeWork(REMAINING_OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACWP:
				unsetACWP();
				return;
			case MspdiPackage.TASK_TYPE__CV:
				unsetCV();
				return;
			case MspdiPackage.TASK_TYPE__CONSTRAINT_TYPE:
				unsetConstraintType();
				return;
			case MspdiPackage.TASK_TYPE__CALENDAR_UID:
				setCalendarUID(CALENDAR_UID_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__CONSTRAINT_DATE:
				setConstraintDate(CONSTRAINT_DATE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__LEVEL_ASSIGNMENTS:
				unsetLevelAssignments();
				return;
			case MspdiPackage.TASK_TYPE__LEVELING_CAN_SPLIT:
				unsetLevelingCanSplit();
				return;
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY:
				setLevelingDelay(LEVELING_DELAY_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY_FORMAT:
				unsetLevelingDelayFormat();
				return;
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_START:
				setPreLeveledStart(PRE_LEVELED_START_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_FINISH:
				setPreLeveledFinish(PRE_LEVELED_FINISH_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__HYPERLINK:
				setHyperlink(HYPERLINK_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__HYPERLINK_ADDRESS:
				setHyperlinkAddress(HYPERLINK_ADDRESS_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__HYPERLINK_SUB_ADDRESS:
				setHyperlinkSubAddress(HYPERLINK_SUB_ADDRESS_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__IGNORE_RESOURCE_CALENDAR:
				unsetIgnoreResourceCalendar();
				return;
			case MspdiPackage.TASK_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__HIDE_BAR:
				unsetHideBar();
				return;
			case MspdiPackage.TASK_TYPE__ROLLUP:
				unsetRollup();
				return;
			case MspdiPackage.TASK_TYPE__BCWS:
				unsetBCWS();
				return;
			case MspdiPackage.TASK_TYPE__BCWP:
				unsetBCWP();
				return;
			case MspdiPackage.TASK_TYPE__PHYSICAL_PERCENT_COMPLETE:
				setPhysicalPercentComplete(PHYSICAL_PERCENT_COMPLETE_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__EARNED_VALUE_METHOD:
				unsetEarnedValueMethod();
				return;
			case MspdiPackage.TASK_TYPE__PREDECESSOR_LINK:
				getPredecessorLink().clear();
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK_PROTECTED:
				setActualWorkProtected(ACTUAL_WORK_PROTECTED_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				setActualOvertimeWorkProtected(ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__EXTENDED_ATTRIBUTE:
				getExtendedAttribute().clear();
				return;
			case MspdiPackage.TASK_TYPE__BASELINE:
				getBaseline().clear();
				return;
			case MspdiPackage.TASK_TYPE__OUTLINE_CODE:
				getOutlineCode().clear();
				return;
			case MspdiPackage.TASK_TYPE__IS_PUBLISHED:
				unsetIsPublished();
				return;
			case MspdiPackage.TASK_TYPE__STATUS_MANAGER:
				setStatusManager(STATUS_MANAGER_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__COMMITMENT_START:
				setCommitmentStart(COMMITMENT_START_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__COMMITMENT_FINISH:
				setCommitmentFinish(COMMITMENT_FINISH_EDEFAULT);
				return;
			case MspdiPackage.TASK_TYPE__COMMITMENT_TYPE:
				unsetCommitmentType();
				return;
			case MspdiPackage.TASK_TYPE__TIMEPHASED_DATA:
				getTimephasedData().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MspdiPackage.TASK_TYPE__UID:
				return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
			case MspdiPackage.TASK_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MspdiPackage.TASK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MspdiPackage.TASK_TYPE__TYPE:
				return isSetType();
			case MspdiPackage.TASK_TYPE__IS_NULL:
				return isSetIsNull();
			case MspdiPackage.TASK_TYPE__CREATE_DATE:
				return CREATE_DATE_EDEFAULT == null ? createDate != null : !CREATE_DATE_EDEFAULT.equals(createDate);
			case MspdiPackage.TASK_TYPE__CONTACT:
				return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
			case MspdiPackage.TASK_TYPE__WBS:
				return WBS_EDEFAULT == null ? wBS != null : !WBS_EDEFAULT.equals(wBS);
			case MspdiPackage.TASK_TYPE__WBS_LEVEL:
				return WBS_LEVEL_EDEFAULT == null ? wBSLevel != null : !WBS_LEVEL_EDEFAULT.equals(wBSLevel);
			case MspdiPackage.TASK_TYPE__OUTLINE_NUMBER:
				return OUTLINE_NUMBER_EDEFAULT == null ? outlineNumber != null : !OUTLINE_NUMBER_EDEFAULT.equals(outlineNumber);
			case MspdiPackage.TASK_TYPE__OUTLINE_LEVEL:
				return OUTLINE_LEVEL_EDEFAULT == null ? outlineLevel != null : !OUTLINE_LEVEL_EDEFAULT.equals(outlineLevel);
			case MspdiPackage.TASK_TYPE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case MspdiPackage.TASK_TYPE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case MspdiPackage.TASK_TYPE__FINISH:
				return FINISH_EDEFAULT == null ? finish != null : !FINISH_EDEFAULT.equals(finish);
			case MspdiPackage.TASK_TYPE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case MspdiPackage.TASK_TYPE__DURATION_FORMAT:
				return isSetDurationFormat();
			case MspdiPackage.TASK_TYPE__WORK:
				return WORK_EDEFAULT == null ? work != null : !WORK_EDEFAULT.equals(work);
			case MspdiPackage.TASK_TYPE__STOP:
				return STOP_EDEFAULT == null ? stop != null : !STOP_EDEFAULT.equals(stop);
			case MspdiPackage.TASK_TYPE__RESUME:
				return RESUME_EDEFAULT == null ? resume != null : !RESUME_EDEFAULT.equals(resume);
			case MspdiPackage.TASK_TYPE__RESUME_VALID:
				return isSetResumeValid();
			case MspdiPackage.TASK_TYPE__EFFORT_DRIVEN:
				return isSetEffortDriven();
			case MspdiPackage.TASK_TYPE__RECURRING:
				return isSetRecurring();
			case MspdiPackage.TASK_TYPE__OVER_ALLOCATED:
				return isSetOverAllocated();
			case MspdiPackage.TASK_TYPE__ESTIMATED:
				return isSetEstimated();
			case MspdiPackage.TASK_TYPE__MILESTONE:
				return isSetMilestone();
			case MspdiPackage.TASK_TYPE__SUMMARY:
				return isSetSummary();
			case MspdiPackage.TASK_TYPE__CRITICAL:
				return isSetCritical();
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT:
				return isSetIsSubproject();
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT_READ_ONLY:
				return isSetIsSubprojectReadOnly();
			case MspdiPackage.TASK_TYPE__SUBPROJECT_NAME:
				return SUBPROJECT_NAME_EDEFAULT == null ? subprojectName != null : !SUBPROJECT_NAME_EDEFAULT.equals(subprojectName);
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK:
				return isSetExternalTask();
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK_PROJECT:
				return EXTERNAL_TASK_PROJECT_EDEFAULT == null ? externalTaskProject != null : !EXTERNAL_TASK_PROJECT_EDEFAULT.equals(externalTaskProject);
			case MspdiPackage.TASK_TYPE__EARLY_START:
				return EARLY_START_EDEFAULT == null ? earlyStart != null : !EARLY_START_EDEFAULT.equals(earlyStart);
			case MspdiPackage.TASK_TYPE__EARLY_FINISH:
				return EARLY_FINISH_EDEFAULT == null ? earlyFinish != null : !EARLY_FINISH_EDEFAULT.equals(earlyFinish);
			case MspdiPackage.TASK_TYPE__LATE_START:
				return LATE_START_EDEFAULT == null ? lateStart != null : !LATE_START_EDEFAULT.equals(lateStart);
			case MspdiPackage.TASK_TYPE__LATE_FINISH:
				return LATE_FINISH_EDEFAULT == null ? lateFinish != null : !LATE_FINISH_EDEFAULT.equals(lateFinish);
			case MspdiPackage.TASK_TYPE__START_VARIANCE:
				return START_VARIANCE_EDEFAULT == null ? startVariance != null : !START_VARIANCE_EDEFAULT.equals(startVariance);
			case MspdiPackage.TASK_TYPE__FINISH_VARIANCE:
				return FINISH_VARIANCE_EDEFAULT == null ? finishVariance != null : !FINISH_VARIANCE_EDEFAULT.equals(finishVariance);
			case MspdiPackage.TASK_TYPE__WORK_VARIANCE:
				return isSetWorkVariance();
			case MspdiPackage.TASK_TYPE__FREE_SLACK:
				return FREE_SLACK_EDEFAULT == null ? freeSlack != null : !FREE_SLACK_EDEFAULT.equals(freeSlack);
			case MspdiPackage.TASK_TYPE__TOTAL_SLACK:
				return TOTAL_SLACK_EDEFAULT == null ? totalSlack != null : !TOTAL_SLACK_EDEFAULT.equals(totalSlack);
			case MspdiPackage.TASK_TYPE__FIXED_COST:
				return isSetFixedCost();
			case MspdiPackage.TASK_TYPE__FIXED_COST_ACCRUAL:
				return isSetFixedCostAccrual();
			case MspdiPackage.TASK_TYPE__PERCENT_COMPLETE:
				return PERCENT_COMPLETE_EDEFAULT == null ? percentComplete != null : !PERCENT_COMPLETE_EDEFAULT.equals(percentComplete);
			case MspdiPackage.TASK_TYPE__PERCENT_WORK_COMPLETE:
				return PERCENT_WORK_COMPLETE_EDEFAULT == null ? percentWorkComplete != null : !PERCENT_WORK_COMPLETE_EDEFAULT.equals(percentWorkComplete);
			case MspdiPackage.TASK_TYPE__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case MspdiPackage.TASK_TYPE__OVERTIME_COST:
				return OVERTIME_COST_EDEFAULT == null ? overtimeCost != null : !OVERTIME_COST_EDEFAULT.equals(overtimeCost);
			case MspdiPackage.TASK_TYPE__OVERTIME_WORK:
				return OVERTIME_WORK_EDEFAULT == null ? overtimeWork != null : !OVERTIME_WORK_EDEFAULT.equals(overtimeWork);
			case MspdiPackage.TASK_TYPE__ACTUAL_START:
				return ACTUAL_START_EDEFAULT == null ? actualStart != null : !ACTUAL_START_EDEFAULT.equals(actualStart);
			case MspdiPackage.TASK_TYPE__ACTUAL_FINISH:
				return ACTUAL_FINISH_EDEFAULT == null ? actualFinish != null : !ACTUAL_FINISH_EDEFAULT.equals(actualFinish);
			case MspdiPackage.TASK_TYPE__ACTUAL_DURATION:
				return ACTUAL_DURATION_EDEFAULT == null ? actualDuration != null : !ACTUAL_DURATION_EDEFAULT.equals(actualDuration);
			case MspdiPackage.TASK_TYPE__ACTUAL_COST:
				return ACTUAL_COST_EDEFAULT == null ? actualCost != null : !ACTUAL_COST_EDEFAULT.equals(actualCost);
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_COST:
				return ACTUAL_OVERTIME_COST_EDEFAULT == null ? actualOvertimeCost != null : !ACTUAL_OVERTIME_COST_EDEFAULT.equals(actualOvertimeCost);
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK:
				return ACTUAL_WORK_EDEFAULT == null ? actualWork != null : !ACTUAL_WORK_EDEFAULT.equals(actualWork);
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK:
				return ACTUAL_OVERTIME_WORK_EDEFAULT == null ? actualOvertimeWork != null : !ACTUAL_OVERTIME_WORK_EDEFAULT.equals(actualOvertimeWork);
			case MspdiPackage.TASK_TYPE__REGULAR_WORK:
				return REGULAR_WORK_EDEFAULT == null ? regularWork != null : !REGULAR_WORK_EDEFAULT.equals(regularWork);
			case MspdiPackage.TASK_TYPE__REMAINING_DURATION:
				return REMAINING_DURATION_EDEFAULT == null ? remainingDuration != null : !REMAINING_DURATION_EDEFAULT.equals(remainingDuration);
			case MspdiPackage.TASK_TYPE__REMAINING_COST:
				return REMAINING_COST_EDEFAULT == null ? remainingCost != null : !REMAINING_COST_EDEFAULT.equals(remainingCost);
			case MspdiPackage.TASK_TYPE__REMAINING_WORK:
				return REMAINING_WORK_EDEFAULT == null ? remainingWork != null : !REMAINING_WORK_EDEFAULT.equals(remainingWork);
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_COST:
				return REMAINING_OVERTIME_COST_EDEFAULT == null ? remainingOvertimeCost != null : !REMAINING_OVERTIME_COST_EDEFAULT.equals(remainingOvertimeCost);
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_WORK:
				return REMAINING_OVERTIME_WORK_EDEFAULT == null ? remainingOvertimeWork != null : !REMAINING_OVERTIME_WORK_EDEFAULT.equals(remainingOvertimeWork);
			case MspdiPackage.TASK_TYPE__ACWP:
				return isSetACWP();
			case MspdiPackage.TASK_TYPE__CV:
				return isSetCV();
			case MspdiPackage.TASK_TYPE__CONSTRAINT_TYPE:
				return isSetConstraintType();
			case MspdiPackage.TASK_TYPE__CALENDAR_UID:
				return CALENDAR_UID_EDEFAULT == null ? calendarUID != null : !CALENDAR_UID_EDEFAULT.equals(calendarUID);
			case MspdiPackage.TASK_TYPE__CONSTRAINT_DATE:
				return CONSTRAINT_DATE_EDEFAULT == null ? constraintDate != null : !CONSTRAINT_DATE_EDEFAULT.equals(constraintDate);
			case MspdiPackage.TASK_TYPE__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case MspdiPackage.TASK_TYPE__LEVEL_ASSIGNMENTS:
				return isSetLevelAssignments();
			case MspdiPackage.TASK_TYPE__LEVELING_CAN_SPLIT:
				return isSetLevelingCanSplit();
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY:
				return LEVELING_DELAY_EDEFAULT == null ? levelingDelay != null : !LEVELING_DELAY_EDEFAULT.equals(levelingDelay);
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY_FORMAT:
				return isSetLevelingDelayFormat();
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_START:
				return PRE_LEVELED_START_EDEFAULT == null ? preLeveledStart != null : !PRE_LEVELED_START_EDEFAULT.equals(preLeveledStart);
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_FINISH:
				return PRE_LEVELED_FINISH_EDEFAULT == null ? preLeveledFinish != null : !PRE_LEVELED_FINISH_EDEFAULT.equals(preLeveledFinish);
			case MspdiPackage.TASK_TYPE__HYPERLINK:
				return HYPERLINK_EDEFAULT == null ? hyperlink != null : !HYPERLINK_EDEFAULT.equals(hyperlink);
			case MspdiPackage.TASK_TYPE__HYPERLINK_ADDRESS:
				return HYPERLINK_ADDRESS_EDEFAULT == null ? hyperlinkAddress != null : !HYPERLINK_ADDRESS_EDEFAULT.equals(hyperlinkAddress);
			case MspdiPackage.TASK_TYPE__HYPERLINK_SUB_ADDRESS:
				return HYPERLINK_SUB_ADDRESS_EDEFAULT == null ? hyperlinkSubAddress != null : !HYPERLINK_SUB_ADDRESS_EDEFAULT.equals(hyperlinkSubAddress);
			case MspdiPackage.TASK_TYPE__IGNORE_RESOURCE_CALENDAR:
				return isSetIgnoreResourceCalendar();
			case MspdiPackage.TASK_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case MspdiPackage.TASK_TYPE__HIDE_BAR:
				return isSetHideBar();
			case MspdiPackage.TASK_TYPE__ROLLUP:
				return isSetRollup();
			case MspdiPackage.TASK_TYPE__BCWS:
				return isSetBCWS();
			case MspdiPackage.TASK_TYPE__BCWP:
				return isSetBCWP();
			case MspdiPackage.TASK_TYPE__PHYSICAL_PERCENT_COMPLETE:
				return PHYSICAL_PERCENT_COMPLETE_EDEFAULT == null ? physicalPercentComplete != null : !PHYSICAL_PERCENT_COMPLETE_EDEFAULT.equals(physicalPercentComplete);
			case MspdiPackage.TASK_TYPE__EARNED_VALUE_METHOD:
				return isSetEarnedValueMethod();
			case MspdiPackage.TASK_TYPE__PREDECESSOR_LINK:
				return predecessorLink != null && !predecessorLink.isEmpty();
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK_PROTECTED:
				return ACTUAL_WORK_PROTECTED_EDEFAULT == null ? actualWorkProtected != null : !ACTUAL_WORK_PROTECTED_EDEFAULT.equals(actualWorkProtected);
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				return ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT == null ? actualOvertimeWorkProtected != null : !ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT.equals(actualOvertimeWorkProtected);
			case MspdiPackage.TASK_TYPE__EXTENDED_ATTRIBUTE:
				return extendedAttribute != null && !extendedAttribute.isEmpty();
			case MspdiPackage.TASK_TYPE__BASELINE:
				return baseline != null && !baseline.isEmpty();
			case MspdiPackage.TASK_TYPE__OUTLINE_CODE:
				return outlineCode != null && !outlineCode.isEmpty();
			case MspdiPackage.TASK_TYPE__IS_PUBLISHED:
				return isSetIsPublished();
			case MspdiPackage.TASK_TYPE__STATUS_MANAGER:
				return STATUS_MANAGER_EDEFAULT == null ? statusManager != null : !STATUS_MANAGER_EDEFAULT.equals(statusManager);
			case MspdiPackage.TASK_TYPE__COMMITMENT_START:
				return COMMITMENT_START_EDEFAULT == null ? commitmentStart != null : !COMMITMENT_START_EDEFAULT.equals(commitmentStart);
			case MspdiPackage.TASK_TYPE__COMMITMENT_FINISH:
				return COMMITMENT_FINISH_EDEFAULT == null ? commitmentFinish != null : !COMMITMENT_FINISH_EDEFAULT.equals(commitmentFinish);
			case MspdiPackage.TASK_TYPE__COMMITMENT_TYPE:
				return isSetCommitmentType();
			case MspdiPackage.TASK_TYPE__TIMEPHASED_DATA:
				return timephasedData != null && !timephasedData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(", iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", isNull: ");
		if (isNullESet) result.append(isNull); else result.append("<unset>");
		result.append(", createDate: ");
		result.append(createDate);
		result.append(", contact: ");
		result.append(contact);
		result.append(", wBS: ");
		result.append(wBS);
		result.append(", wBSLevel: ");
		result.append(wBSLevel);
		result.append(", outlineNumber: ");
		result.append(outlineNumber);
		result.append(", outlineLevel: ");
		result.append(outlineLevel);
		result.append(", priority: ");
		result.append(priority);
		result.append(", start: ");
		result.append(start);
		result.append(", finish: ");
		result.append(finish);
		result.append(", duration: ");
		result.append(duration);
		result.append(", durationFormat: ");
		if (durationFormatESet) result.append(durationFormat); else result.append("<unset>");
		result.append(", work: ");
		result.append(work);
		result.append(", stop: ");
		result.append(stop);
		result.append(", resume: ");
		result.append(resume);
		result.append(", resumeValid: ");
		if (resumeValidESet) result.append(resumeValid); else result.append("<unset>");
		result.append(", effortDriven: ");
		if (effortDrivenESet) result.append(effortDriven); else result.append("<unset>");
		result.append(", recurring: ");
		if (recurringESet) result.append(recurring); else result.append("<unset>");
		result.append(", overAllocated: ");
		if (overAllocatedESet) result.append(overAllocated); else result.append("<unset>");
		result.append(", estimated: ");
		if (estimatedESet) result.append(estimated); else result.append("<unset>");
		result.append(", milestone: ");
		if (milestoneESet) result.append(milestone); else result.append("<unset>");
		result.append(", summary: ");
		if (summaryESet) result.append(summary); else result.append("<unset>");
		result.append(", critical: ");
		if (criticalESet) result.append(critical); else result.append("<unset>");
		result.append(", isSubproject: ");
		if (isSubprojectESet) result.append(isSubproject); else result.append("<unset>");
		result.append(", isSubprojectReadOnly: ");
		if (isSubprojectReadOnlyESet) result.append(isSubprojectReadOnly); else result.append("<unset>");
		result.append(", subprojectName: ");
		result.append(subprojectName);
		result.append(", externalTask: ");
		if (externalTaskESet) result.append(externalTask); else result.append("<unset>");
		result.append(", externalTaskProject: ");
		result.append(externalTaskProject);
		result.append(", earlyStart: ");
		result.append(earlyStart);
		result.append(", earlyFinish: ");
		result.append(earlyFinish);
		result.append(", lateStart: ");
		result.append(lateStart);
		result.append(", lateFinish: ");
		result.append(lateFinish);
		result.append(", startVariance: ");
		result.append(startVariance);
		result.append(", finishVariance: ");
		result.append(finishVariance);
		result.append(", workVariance: ");
		if (workVarianceESet) result.append(workVariance); else result.append("<unset>");
		result.append(", freeSlack: ");
		result.append(freeSlack);
		result.append(", totalSlack: ");
		result.append(totalSlack);
		result.append(", fixedCost: ");
		if (fixedCostESet) result.append(fixedCost); else result.append("<unset>");
		result.append(", fixedCostAccrual: ");
		if (fixedCostAccrualESet) result.append(fixedCostAccrual); else result.append("<unset>");
		result.append(", percentComplete: ");
		result.append(percentComplete);
		result.append(", percentWorkComplete: ");
		result.append(percentWorkComplete);
		result.append(", cost: ");
		result.append(cost);
		result.append(", overtimeCost: ");
		result.append(overtimeCost);
		result.append(", overtimeWork: ");
		result.append(overtimeWork);
		result.append(", actualStart: ");
		result.append(actualStart);
		result.append(", actualFinish: ");
		result.append(actualFinish);
		result.append(", actualDuration: ");
		result.append(actualDuration);
		result.append(", actualCost: ");
		result.append(actualCost);
		result.append(", actualOvertimeCost: ");
		result.append(actualOvertimeCost);
		result.append(", actualWork: ");
		result.append(actualWork);
		result.append(", actualOvertimeWork: ");
		result.append(actualOvertimeWork);
		result.append(", regularWork: ");
		result.append(regularWork);
		result.append(", remainingDuration: ");
		result.append(remainingDuration);
		result.append(", remainingCost: ");
		result.append(remainingCost);
		result.append(", remainingWork: ");
		result.append(remainingWork);
		result.append(", remainingOvertimeCost: ");
		result.append(remainingOvertimeCost);
		result.append(", remainingOvertimeWork: ");
		result.append(remainingOvertimeWork);
		result.append(", aCWP: ");
		if (aCWPESet) result.append(aCWP); else result.append("<unset>");
		result.append(", cV: ");
		if (cVESet) result.append(cV); else result.append("<unset>");
		result.append(", constraintType: ");
		if (constraintTypeESet) result.append(constraintType); else result.append("<unset>");
		result.append(", calendarUID: ");
		result.append(calendarUID);
		result.append(", constraintDate: ");
		result.append(constraintDate);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", levelAssignments: ");
		if (levelAssignmentsESet) result.append(levelAssignments); else result.append("<unset>");
		result.append(", levelingCanSplit: ");
		if (levelingCanSplitESet) result.append(levelingCanSplit); else result.append("<unset>");
		result.append(", levelingDelay: ");
		result.append(levelingDelay);
		result.append(", levelingDelayFormat: ");
		if (levelingDelayFormatESet) result.append(levelingDelayFormat); else result.append("<unset>");
		result.append(", preLeveledStart: ");
		result.append(preLeveledStart);
		result.append(", preLeveledFinish: ");
		result.append(preLeveledFinish);
		result.append(", hyperlink: ");
		result.append(hyperlink);
		result.append(", hyperlinkAddress: ");
		result.append(hyperlinkAddress);
		result.append(", hyperlinkSubAddress: ");
		result.append(hyperlinkSubAddress);
		result.append(", ignoreResourceCalendar: ");
		if (ignoreResourceCalendarESet) result.append(ignoreResourceCalendar); else result.append("<unset>");
		result.append(", notes: ");
		result.append(notes);
		result.append(", hideBar: ");
		if (hideBarESet) result.append(hideBar); else result.append("<unset>");
		result.append(", rollup: ");
		if (rollupESet) result.append(rollup); else result.append("<unset>");
		result.append(", bCWS: ");
		if (bCWSESet) result.append(bCWS); else result.append("<unset>");
		result.append(", bCWP: ");
		if (bCWPESet) result.append(bCWP); else result.append("<unset>");
		result.append(", physicalPercentComplete: ");
		result.append(physicalPercentComplete);
		result.append(", earnedValueMethod: ");
		if (earnedValueMethodESet) result.append(earnedValueMethod); else result.append("<unset>");
		result.append(", actualWorkProtected: ");
		result.append(actualWorkProtected);
		result.append(", actualOvertimeWorkProtected: ");
		result.append(actualOvertimeWorkProtected);
		result.append(", isPublished: ");
		if (isPublishedESet) result.append(isPublished); else result.append("<unset>");
		result.append(", statusManager: ");
		result.append(statusManager);
		result.append(", commitmentStart: ");
		result.append(commitmentStart);
		result.append(", commitmentFinish: ");
		result.append(commitmentFinish);
		result.append(", commitmentType: ");
		if (commitmentTypeESet) result.append(commitmentType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TaskTypeImpl
