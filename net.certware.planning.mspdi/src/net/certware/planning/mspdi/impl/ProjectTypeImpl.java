/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.planning.mspdi.AssignmentsType;
import net.certware.planning.mspdi.BaselineForEarnedValueType;
import net.certware.planning.mspdi.CalendarsType;
import net.certware.planning.mspdi.CurrencySymbolPositionType;
import net.certware.planning.mspdi.DefaultFixedCostAccrualType;
import net.certware.planning.mspdi.DefaultTaskEVMethodType;
import net.certware.planning.mspdi.DefaultTaskTypeType;
import net.certware.planning.mspdi.DurationFormatType5;
import net.certware.planning.mspdi.EarnedValueMethodType1;
import net.certware.planning.mspdi.ExtendedAttributesType;
import net.certware.planning.mspdi.FYStartDateType;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.NewTaskStartDateType;
import net.certware.planning.mspdi.OutlineCodesType;
import net.certware.planning.mspdi.ProjectType;
import net.certware.planning.mspdi.ResourcesType;
import net.certware.planning.mspdi.TasksType;
import net.certware.planning.mspdi.WBSMasksType;
import net.certware.planning.mspdi.WeekStartDayType;
import net.certware.planning.mspdi.WorkFormatType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getSaveVersion <em>Save Version</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getLastSaved <em>Last Saved</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isScheduleFromStart <em>Schedule From Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getFinishDate <em>Finish Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getFYStartDate <em>FY Start Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCriticalSlackLimit <em>Critical Slack Limit</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCurrencyDigits <em>Currency Digits</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCurrencySymbol <em>Currency Symbol</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCurrencyCode <em>Currency Code</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCurrencySymbolPosition <em>Currency Symbol Position</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCalendarUID <em>Calendar UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDefaultStartTime <em>Default Start Time</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDefaultFinishTime <em>Default Finish Time</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getMinutesPerDay <em>Minutes Per Day</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getMinutesPerWeek <em>Minutes Per Week</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDaysPerMonth <em>Days Per Month</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDefaultTaskType <em>Default Task Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDefaultFixedCostAccrual <em>Default Fixed Cost Accrual</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDefaultStandardRate <em>Default Standard Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDefaultOvertimeRate <em>Default Overtime Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDurationFormat <em>Duration Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getWorkFormat <em>Work Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isEditableActualCosts <em>Editable Actual Costs</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isHonorConstraints <em>Honor Constraints</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getEarnedValueMethod <em>Earned Value Method</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isInsertedProjectsLikeSummary <em>Inserted Projects Like Summary</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isMultipleCriticalPaths <em>Multiple Critical Paths</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isNewTasksEffortDriven <em>New Tasks Effort Driven</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isNewTasksEstimated <em>New Tasks Estimated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isSplitsInProgressTasks <em>Splits In Progress Tasks</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isSpreadActualCost <em>Spread Actual Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isSpreadPercentComplete <em>Spread Percent Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isTaskUpdatesResource <em>Task Updates Resource</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isFiscalYearStart <em>Fiscal Year Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getWeekStartDay <em>Week Start Day</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isMoveCompletedEndsBack <em>Move Completed Ends Back</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isMoveRemainingStartsBack <em>Move Remaining Starts Back</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isMoveRemainingStartsForward <em>Move Remaining Starts Forward</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isMoveCompletedEndsForward <em>Move Completed Ends Forward</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getBaselineForEarnedValue <em>Baseline For Earned Value</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isAutoAddNewResourcesAndTasks <em>Auto Add New Resources And Tasks</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCurrentDate <em>Current Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isMicrosoftProjectServerURL <em>Microsoft Project Server URL</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isAutolink <em>Autolink</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getNewTaskStartDate <em>New Task Start Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getDefaultTaskEVMethod <em>Default Task EV Method</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isProjectExternallyEdited <em>Project Externally Edited</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getExtendedCreationDate <em>Extended Creation Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isActualsInSync <em>Actuals In Sync</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isRemoveFileProperties <em>Remove File Properties</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#isAdminProject <em>Admin Project</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getOutlineCodes <em>Outline Codes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getWBSMasks <em>WBS Masks</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getExtendedAttributes <em>Extended Attributes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getCalendars <em>Calendars</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ProjectTypeImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectTypeImpl extends EObjectImpl implements ProjectType {
	/**
	 * The default value of the '{@link #getSaveVersion() <em>Save Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveVersion()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SAVE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaveVersion() <em>Save Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveVersion()
	 * @generated
	 * @ordered
	 */
	protected BigInteger saveVersion = SAVE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected String manager = MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected BigInteger revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSaved() <em>Last Saved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaved()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_SAVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSaved() <em>Last Saved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSaved()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastSaved = LAST_SAVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isScheduleFromStart() <em>Schedule From Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduleFromStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCHEDULE_FROM_START_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isScheduleFromStart() <em>Schedule From Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScheduleFromStart()
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleFromStart = SCHEDULE_FROM_START_EDEFAULT;

	/**
	 * This is true if the Schedule From Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleFromStartESet;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinishDate() <em>Finish Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FINISH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishDate() <em>Finish Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finishDate = FINISH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFYStartDate() <em>FY Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFYStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final FYStartDateType FY_START_DATE_EDEFAULT = FYStartDateType._1;

	/**
	 * The cached value of the '{@link #getFYStartDate() <em>FY Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFYStartDate()
	 * @generated
	 * @ordered
	 */
	protected FYStartDateType fYStartDate = FY_START_DATE_EDEFAULT;

	/**
	 * This is true if the FY Start Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fYStartDateESet;

	/**
	 * The default value of the '{@link #getCriticalSlackLimit() <em>Critical Slack Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalSlackLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CRITICAL_SLACK_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriticalSlackLimit() <em>Critical Slack Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalSlackLimit()
	 * @generated
	 * @ordered
	 */
	protected BigInteger criticalSlackLimit = CRITICAL_SLACK_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyDigits() <em>Currency Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyDigits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CURRENCY_DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyDigits() <em>Currency Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyDigits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger currencyDigits = CURRENCY_DIGITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencySymbol() <em>Currency Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencySymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencySymbol() <em>Currency Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencySymbol()
	 * @generated
	 * @ordered
	 */
	protected String currencySymbol = CURRENCY_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyCode() <em>Currency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyCode()
	 * @generated
	 * @ordered
	 */
	protected String currencyCode = CURRENCY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencySymbolPosition() <em>Currency Symbol Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencySymbolPosition()
	 * @generated
	 * @ordered
	 */
	protected static final CurrencySymbolPositionType CURRENCY_SYMBOL_POSITION_EDEFAULT = CurrencySymbolPositionType._0;

	/**
	 * The cached value of the '{@link #getCurrencySymbolPosition() <em>Currency Symbol Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencySymbolPosition()
	 * @generated
	 * @ordered
	 */
	protected CurrencySymbolPositionType currencySymbolPosition = CURRENCY_SYMBOL_POSITION_EDEFAULT;

	/**
	 * This is true if the Currency Symbol Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currencySymbolPositionESet;

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
	 * The default value of the '{@link #getDefaultStartTime() <em>Default Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEFAULT_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultStartTime() <em>Default Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStartTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar defaultStartTime = DEFAULT_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFinishTime() <em>Default Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFinishTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEFAULT_FINISH_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultFinishTime() <em>Default Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFinishTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar defaultFinishTime = DEFAULT_FINISH_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutesPerDay() <em>Minutes Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesPerDay()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINUTES_PER_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinutesPerDay() <em>Minutes Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesPerDay()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minutesPerDay = MINUTES_PER_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutesPerWeek() <em>Minutes Per Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesPerWeek()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINUTES_PER_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinutesPerWeek() <em>Minutes Per Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutesPerWeek()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minutesPerWeek = MINUTES_PER_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaysPerMonth() <em>Days Per Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysPerMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAYS_PER_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaysPerMonth() <em>Days Per Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysPerMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger daysPerMonth = DAYS_PER_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTaskType() <em>Default Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTaskType()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultTaskTypeType DEFAULT_TASK_TYPE_EDEFAULT = DefaultTaskTypeType._1;

	/**
	 * The cached value of the '{@link #getDefaultTaskType() <em>Default Task Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTaskType()
	 * @generated
	 * @ordered
	 */
	protected DefaultTaskTypeType defaultTaskType = DEFAULT_TASK_TYPE_EDEFAULT;

	/**
	 * This is true if the Default Task Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultTaskTypeESet;

	/**
	 * The default value of the '{@link #getDefaultFixedCostAccrual() <em>Default Fixed Cost Accrual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFixedCostAccrual()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultFixedCostAccrualType DEFAULT_FIXED_COST_ACCRUAL_EDEFAULT = DefaultFixedCostAccrualType._1;

	/**
	 * The cached value of the '{@link #getDefaultFixedCostAccrual() <em>Default Fixed Cost Accrual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFixedCostAccrual()
	 * @generated
	 * @ordered
	 */
	protected DefaultFixedCostAccrualType defaultFixedCostAccrual = DEFAULT_FIXED_COST_ACCRUAL_EDEFAULT;

	/**
	 * This is true if the Default Fixed Cost Accrual attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultFixedCostAccrualESet;

	/**
	 * The default value of the '{@link #getDefaultStandardRate() <em>Default Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStandardRate()
	 * @generated
	 * @ordered
	 */
	protected static final float DEFAULT_STANDARD_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDefaultStandardRate() <em>Default Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStandardRate()
	 * @generated
	 * @ordered
	 */
	protected float defaultStandardRate = DEFAULT_STANDARD_RATE_EDEFAULT;

	/**
	 * This is true if the Default Standard Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultStandardRateESet;

	/**
	 * The default value of the '{@link #getDefaultOvertimeRate() <em>Default Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOvertimeRate()
	 * @generated
	 * @ordered
	 */
	protected static final float DEFAULT_OVERTIME_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDefaultOvertimeRate() <em>Default Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOvertimeRate()
	 * @generated
	 * @ordered
	 */
	protected float defaultOvertimeRate = DEFAULT_OVERTIME_RATE_EDEFAULT;

	/**
	 * This is true if the Default Overtime Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultOvertimeRateESet;

	/**
	 * The default value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DurationFormatType5 DURATION_FORMAT_EDEFAULT = DurationFormatType5._3;

	/**
	 * The cached value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected DurationFormatType5 durationFormat = DURATION_FORMAT_EDEFAULT;

	/**
	 * This is true if the Duration Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationFormatESet;

	/**
	 * The default value of the '{@link #getWorkFormat() <em>Work Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFormat()
	 * @generated
	 * @ordered
	 */
	protected static final WorkFormatType WORK_FORMAT_EDEFAULT = WorkFormatType._1;

	/**
	 * The cached value of the '{@link #getWorkFormat() <em>Work Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFormat()
	 * @generated
	 * @ordered
	 */
	protected WorkFormatType workFormat = WORK_FORMAT_EDEFAULT;

	/**
	 * This is true if the Work Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workFormatESet;

	/**
	 * The default value of the '{@link #isEditableActualCosts() <em>Editable Actual Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditableActualCosts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_ACTUAL_COSTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditableActualCosts() <em>Editable Actual Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditableActualCosts()
	 * @generated
	 * @ordered
	 */
	protected boolean editableActualCosts = EDITABLE_ACTUAL_COSTS_EDEFAULT;

	/**
	 * This is true if the Editable Actual Costs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean editableActualCostsESet;

	/**
	 * The default value of the '{@link #isHonorConstraints() <em>Honor Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonorConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HONOR_CONSTRAINTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHonorConstraints() <em>Honor Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonorConstraints()
	 * @generated
	 * @ordered
	 */
	protected boolean honorConstraints = HONOR_CONSTRAINTS_EDEFAULT;

	/**
	 * This is true if the Honor Constraints attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean honorConstraintsESet;

	/**
	 * The default value of the '{@link #getEarnedValueMethod() <em>Earned Value Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarnedValueMethod()
	 * @generated
	 * @ordered
	 */
	protected static final EarnedValueMethodType1 EARNED_VALUE_METHOD_EDEFAULT = EarnedValueMethodType1._0;

	/**
	 * The cached value of the '{@link #getEarnedValueMethod() <em>Earned Value Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarnedValueMethod()
	 * @generated
	 * @ordered
	 */
	protected EarnedValueMethodType1 earnedValueMethod = EARNED_VALUE_METHOD_EDEFAULT;

	/**
	 * This is true if the Earned Value Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean earnedValueMethodESet;

	/**
	 * The default value of the '{@link #isInsertedProjectsLikeSummary() <em>Inserted Projects Like Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsertedProjectsLikeSummary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSERTED_PROJECTS_LIKE_SUMMARY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInsertedProjectsLikeSummary() <em>Inserted Projects Like Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsertedProjectsLikeSummary()
	 * @generated
	 * @ordered
	 */
	protected boolean insertedProjectsLikeSummary = INSERTED_PROJECTS_LIKE_SUMMARY_EDEFAULT;

	/**
	 * This is true if the Inserted Projects Like Summary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insertedProjectsLikeSummaryESet;

	/**
	 * The default value of the '{@link #isMultipleCriticalPaths() <em>Multiple Critical Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleCriticalPaths()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_CRITICAL_PATHS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleCriticalPaths() <em>Multiple Critical Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleCriticalPaths()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleCriticalPaths = MULTIPLE_CRITICAL_PATHS_EDEFAULT;

	/**
	 * This is true if the Multiple Critical Paths attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleCriticalPathsESet;

	/**
	 * The default value of the '{@link #isNewTasksEffortDriven() <em>New Tasks Effort Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewTasksEffortDriven()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_TASKS_EFFORT_DRIVEN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNewTasksEffortDriven() <em>New Tasks Effort Driven</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewTasksEffortDriven()
	 * @generated
	 * @ordered
	 */
	protected boolean newTasksEffortDriven = NEW_TASKS_EFFORT_DRIVEN_EDEFAULT;

	/**
	 * This is true if the New Tasks Effort Driven attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean newTasksEffortDrivenESet;

	/**
	 * The default value of the '{@link #isNewTasksEstimated() <em>New Tasks Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewTasksEstimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_TASKS_ESTIMATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNewTasksEstimated() <em>New Tasks Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewTasksEstimated()
	 * @generated
	 * @ordered
	 */
	protected boolean newTasksEstimated = NEW_TASKS_ESTIMATED_EDEFAULT;

	/**
	 * This is true if the New Tasks Estimated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean newTasksEstimatedESet;

	/**
	 * The default value of the '{@link #isSplitsInProgressTasks() <em>Splits In Progress Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitsInProgressTasks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPLITS_IN_PROGRESS_TASKS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSplitsInProgressTasks() <em>Splits In Progress Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitsInProgressTasks()
	 * @generated
	 * @ordered
	 */
	protected boolean splitsInProgressTasks = SPLITS_IN_PROGRESS_TASKS_EDEFAULT;

	/**
	 * This is true if the Splits In Progress Tasks attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean splitsInProgressTasksESet;

	/**
	 * The default value of the '{@link #isSpreadActualCost() <em>Spread Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpreadActualCost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPREAD_ACTUAL_COST_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSpreadActualCost() <em>Spread Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpreadActualCost()
	 * @generated
	 * @ordered
	 */
	protected boolean spreadActualCost = SPREAD_ACTUAL_COST_EDEFAULT;

	/**
	 * This is true if the Spread Actual Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spreadActualCostESet;

	/**
	 * The default value of the '{@link #isSpreadPercentComplete() <em>Spread Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpreadPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPREAD_PERCENT_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpreadPercentComplete() <em>Spread Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpreadPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean spreadPercentComplete = SPREAD_PERCENT_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Spread Percent Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spreadPercentCompleteESet;

	/**
	 * The default value of the '{@link #isTaskUpdatesResource() <em>Task Updates Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaskUpdatesResource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TASK_UPDATES_RESOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTaskUpdatesResource() <em>Task Updates Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaskUpdatesResource()
	 * @generated
	 * @ordered
	 */
	protected boolean taskUpdatesResource = TASK_UPDATES_RESOURCE_EDEFAULT;

	/**
	 * This is true if the Task Updates Resource attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taskUpdatesResourceESet;

	/**
	 * The default value of the '{@link #isFiscalYearStart() <em>Fiscal Year Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiscalYearStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FISCAL_YEAR_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFiscalYearStart() <em>Fiscal Year Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFiscalYearStart()
	 * @generated
	 * @ordered
	 */
	protected boolean fiscalYearStart = FISCAL_YEAR_START_EDEFAULT;

	/**
	 * This is true if the Fiscal Year Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fiscalYearStartESet;

	/**
	 * The default value of the '{@link #getWeekStartDay() <em>Week Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekStartDay()
	 * @generated
	 * @ordered
	 */
	protected static final WeekStartDayType WEEK_START_DAY_EDEFAULT = WeekStartDayType._0;

	/**
	 * The cached value of the '{@link #getWeekStartDay() <em>Week Start Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekStartDay()
	 * @generated
	 * @ordered
	 */
	protected WeekStartDayType weekStartDay = WEEK_START_DAY_EDEFAULT;

	/**
	 * This is true if the Week Start Day attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weekStartDayESet;

	/**
	 * The default value of the '{@link #isMoveCompletedEndsBack() <em>Move Completed Ends Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveCompletedEndsBack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVE_COMPLETED_ENDS_BACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoveCompletedEndsBack() <em>Move Completed Ends Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveCompletedEndsBack()
	 * @generated
	 * @ordered
	 */
	protected boolean moveCompletedEndsBack = MOVE_COMPLETED_ENDS_BACK_EDEFAULT;

	/**
	 * This is true if the Move Completed Ends Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moveCompletedEndsBackESet;

	/**
	 * The default value of the '{@link #isMoveRemainingStartsBack() <em>Move Remaining Starts Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveRemainingStartsBack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVE_REMAINING_STARTS_BACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoveRemainingStartsBack() <em>Move Remaining Starts Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveRemainingStartsBack()
	 * @generated
	 * @ordered
	 */
	protected boolean moveRemainingStartsBack = MOVE_REMAINING_STARTS_BACK_EDEFAULT;

	/**
	 * This is true if the Move Remaining Starts Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moveRemainingStartsBackESet;

	/**
	 * The default value of the '{@link #isMoveRemainingStartsForward() <em>Move Remaining Starts Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveRemainingStartsForward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVE_REMAINING_STARTS_FORWARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoveRemainingStartsForward() <em>Move Remaining Starts Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveRemainingStartsForward()
	 * @generated
	 * @ordered
	 */
	protected boolean moveRemainingStartsForward = MOVE_REMAINING_STARTS_FORWARD_EDEFAULT;

	/**
	 * This is true if the Move Remaining Starts Forward attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moveRemainingStartsForwardESet;

	/**
	 * The default value of the '{@link #isMoveCompletedEndsForward() <em>Move Completed Ends Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveCompletedEndsForward()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVE_COMPLETED_ENDS_FORWARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoveCompletedEndsForward() <em>Move Completed Ends Forward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveCompletedEndsForward()
	 * @generated
	 * @ordered
	 */
	protected boolean moveCompletedEndsForward = MOVE_COMPLETED_ENDS_FORWARD_EDEFAULT;

	/**
	 * This is true if the Move Completed Ends Forward attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moveCompletedEndsForwardESet;

	/**
	 * The default value of the '{@link #getBaselineForEarnedValue() <em>Baseline For Earned Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineForEarnedValue()
	 * @generated
	 * @ordered
	 */
	protected static final BaselineForEarnedValueType BASELINE_FOR_EARNED_VALUE_EDEFAULT = BaselineForEarnedValueType._0;

	/**
	 * The cached value of the '{@link #getBaselineForEarnedValue() <em>Baseline For Earned Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineForEarnedValue()
	 * @generated
	 * @ordered
	 */
	protected BaselineForEarnedValueType baselineForEarnedValue = BASELINE_FOR_EARNED_VALUE_EDEFAULT;

	/**
	 * This is true if the Baseline For Earned Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baselineForEarnedValueESet;

	/**
	 * The default value of the '{@link #isAutoAddNewResourcesAndTasks() <em>Auto Add New Resources And Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoAddNewResourcesAndTasks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_ADD_NEW_RESOURCES_AND_TASKS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoAddNewResourcesAndTasks() <em>Auto Add New Resources And Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoAddNewResourcesAndTasks()
	 * @generated
	 * @ordered
	 */
	protected boolean autoAddNewResourcesAndTasks = AUTO_ADD_NEW_RESOURCES_AND_TASKS_EDEFAULT;

	/**
	 * This is true if the Auto Add New Resources And Tasks attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoAddNewResourcesAndTasksESet;

	/**
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar statusDate = STATUS_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CURRENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar currentDate = CURRENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMicrosoftProjectServerURL() <em>Microsoft Project Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMicrosoftProjectServerURL()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MICROSOFT_PROJECT_SERVER_URL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMicrosoftProjectServerURL() <em>Microsoft Project Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMicrosoftProjectServerURL()
	 * @generated
	 * @ordered
	 */
	protected boolean microsoftProjectServerURL = MICROSOFT_PROJECT_SERVER_URL_EDEFAULT;

	/**
	 * This is true if the Microsoft Project Server URL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean microsoftProjectServerURLESet;

	/**
	 * The default value of the '{@link #isAutolink() <em>Autolink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutolink()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOLINK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutolink() <em>Autolink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutolink()
	 * @generated
	 * @ordered
	 */
	protected boolean autolink = AUTOLINK_EDEFAULT;

	/**
	 * This is true if the Autolink attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autolinkESet;

	/**
	 * The default value of the '{@link #getNewTaskStartDate() <em>New Task Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTaskStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final NewTaskStartDateType NEW_TASK_START_DATE_EDEFAULT = NewTaskStartDateType._0;

	/**
	 * The cached value of the '{@link #getNewTaskStartDate() <em>New Task Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTaskStartDate()
	 * @generated
	 * @ordered
	 */
	protected NewTaskStartDateType newTaskStartDate = NEW_TASK_START_DATE_EDEFAULT;

	/**
	 * This is true if the New Task Start Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean newTaskStartDateESet;

	/**
	 * The default value of the '{@link #getDefaultTaskEVMethod() <em>Default Task EV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTaskEVMethod()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultTaskEVMethodType DEFAULT_TASK_EV_METHOD_EDEFAULT = DefaultTaskEVMethodType._0;

	/**
	 * The cached value of the '{@link #getDefaultTaskEVMethod() <em>Default Task EV Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTaskEVMethod()
	 * @generated
	 * @ordered
	 */
	protected DefaultTaskEVMethodType defaultTaskEVMethod = DEFAULT_TASK_EV_METHOD_EDEFAULT;

	/**
	 * This is true if the Default Task EV Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultTaskEVMethodESet;

	/**
	 * The default value of the '{@link #isProjectExternallyEdited() <em>Project Externally Edited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProjectExternallyEdited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROJECT_EXTERNALLY_EDITED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProjectExternallyEdited() <em>Project Externally Edited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProjectExternallyEdited()
	 * @generated
	 * @ordered
	 */
	protected boolean projectExternallyEdited = PROJECT_EXTERNALLY_EDITED_EDEFAULT;

	/**
	 * This is true if the Project Externally Edited attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean projectExternallyEditedESet;

	/**
	 * The default value of the '{@link #getExtendedCreationDate() <em>Extended Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXTENDED_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedCreationDate() <em>Extended Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar extendedCreationDate = EXTENDED_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isActualsInSync() <em>Actuals In Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActualsInSync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTUALS_IN_SYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActualsInSync() <em>Actuals In Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActualsInSync()
	 * @generated
	 * @ordered
	 */
	protected boolean actualsInSync = ACTUALS_IN_SYNC_EDEFAULT;

	/**
	 * This is true if the Actuals In Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualsInSyncESet;

	/**
	 * The default value of the '{@link #isRemoveFileProperties() <em>Remove File Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveFileProperties()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOVE_FILE_PROPERTIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoveFileProperties() <em>Remove File Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoveFileProperties()
	 * @generated
	 * @ordered
	 */
	protected boolean removeFileProperties = REMOVE_FILE_PROPERTIES_EDEFAULT;

	/**
	 * This is true if the Remove File Properties attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean removeFilePropertiesESet;

	/**
	 * The default value of the '{@link #isAdminProject() <em>Admin Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminProject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADMIN_PROJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdminProject() <em>Admin Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminProject()
	 * @generated
	 * @ordered
	 */
	protected boolean adminProject = ADMIN_PROJECT_EDEFAULT;

	/**
	 * This is true if the Admin Project attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adminProjectESet;

	/**
	 * The cached value of the '{@link #getOutlineCodes() <em>Outline Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineCodes()
	 * @generated
	 * @ordered
	 */
	protected OutlineCodesType outlineCodes;

	/**
	 * The cached value of the '{@link #getWBSMasks() <em>WBS Masks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWBSMasks()
	 * @generated
	 * @ordered
	 */
	protected WBSMasksType wBSMasks;

	/**
	 * The cached value of the '{@link #getExtendedAttributes() <em>Extended Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAttributes()
	 * @generated
	 * @ordered
	 */
	protected ExtendedAttributesType extendedAttributes;

	/**
	 * The cached value of the '{@link #getCalendars() <em>Calendars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendars()
	 * @generated
	 * @ordered
	 */
	protected CalendarsType calendars;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected TasksType tasks;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected ResourcesType resources;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected AssignmentsType assignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.PROJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSaveVersion() {
		return saveVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveVersion(BigInteger newSaveVersion) {
		BigInteger oldSaveVersion = saveVersion;
		saveVersion = newSaveVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__SAVE_VERSION, oldSaveVersion, saveVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__UID, oldUID, uID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(String newManager) {
		String oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(BigInteger newRevision) {
		BigInteger oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastSaved() {
		return lastSaved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSaved(XMLGregorianCalendar newLastSaved) {
		XMLGregorianCalendar oldLastSaved = lastSaved;
		lastSaved = newLastSaved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__LAST_SAVED, oldLastSaved, lastSaved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScheduleFromStart() {
		return scheduleFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleFromStart(boolean newScheduleFromStart) {
		boolean oldScheduleFromStart = scheduleFromStart;
		scheduleFromStart = newScheduleFromStart;
		boolean oldScheduleFromStartESet = scheduleFromStartESet;
		scheduleFromStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__SCHEDULE_FROM_START, oldScheduleFromStart, scheduleFromStart, !oldScheduleFromStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduleFromStart() {
		boolean oldScheduleFromStart = scheduleFromStart;
		boolean oldScheduleFromStartESet = scheduleFromStartESet;
		scheduleFromStart = SCHEDULE_FROM_START_EDEFAULT;
		scheduleFromStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__SCHEDULE_FROM_START, oldScheduleFromStart, SCHEDULE_FROM_START_EDEFAULT, oldScheduleFromStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduleFromStart() {
		return scheduleFromStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinishDate() {
		return finishDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishDate(XMLGregorianCalendar newFinishDate) {
		XMLGregorianCalendar oldFinishDate = finishDate;
		finishDate = newFinishDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__FINISH_DATE, oldFinishDate, finishDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FYStartDateType getFYStartDate() {
		return fYStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFYStartDate(FYStartDateType newFYStartDate) {
		FYStartDateType oldFYStartDate = fYStartDate;
		fYStartDate = newFYStartDate == null ? FY_START_DATE_EDEFAULT : newFYStartDate;
		boolean oldFYStartDateESet = fYStartDateESet;
		fYStartDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__FY_START_DATE, oldFYStartDate, fYStartDate, !oldFYStartDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFYStartDate() {
		FYStartDateType oldFYStartDate = fYStartDate;
		boolean oldFYStartDateESet = fYStartDateESet;
		fYStartDate = FY_START_DATE_EDEFAULT;
		fYStartDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__FY_START_DATE, oldFYStartDate, FY_START_DATE_EDEFAULT, oldFYStartDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFYStartDate() {
		return fYStartDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCriticalSlackLimit() {
		return criticalSlackLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalSlackLimit(BigInteger newCriticalSlackLimit) {
		BigInteger oldCriticalSlackLimit = criticalSlackLimit;
		criticalSlackLimit = newCriticalSlackLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CRITICAL_SLACK_LIMIT, oldCriticalSlackLimit, criticalSlackLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCurrencyDigits() {
		return currencyDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyDigits(BigInteger newCurrencyDigits) {
		BigInteger oldCurrencyDigits = currencyDigits;
		currencyDigits = newCurrencyDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CURRENCY_DIGITS, oldCurrencyDigits, currencyDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencySymbol() {
		return currencySymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencySymbol(String newCurrencySymbol) {
		String oldCurrencySymbol = currencySymbol;
		currencySymbol = newCurrencySymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL, oldCurrencySymbol, currencySymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyCode(String newCurrencyCode) {
		String oldCurrencyCode = currencyCode;
		currencyCode = newCurrencyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CURRENCY_CODE, oldCurrencyCode, currencyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySymbolPositionType getCurrencySymbolPosition() {
		return currencySymbolPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencySymbolPosition(CurrencySymbolPositionType newCurrencySymbolPosition) {
		CurrencySymbolPositionType oldCurrencySymbolPosition = currencySymbolPosition;
		currencySymbolPosition = newCurrencySymbolPosition == null ? CURRENCY_SYMBOL_POSITION_EDEFAULT : newCurrencySymbolPosition;
		boolean oldCurrencySymbolPositionESet = currencySymbolPositionESet;
		currencySymbolPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION, oldCurrencySymbolPosition, currencySymbolPosition, !oldCurrencySymbolPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrencySymbolPosition() {
		CurrencySymbolPositionType oldCurrencySymbolPosition = currencySymbolPosition;
		boolean oldCurrencySymbolPositionESet = currencySymbolPositionESet;
		currencySymbolPosition = CURRENCY_SYMBOL_POSITION_EDEFAULT;
		currencySymbolPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION, oldCurrencySymbolPosition, CURRENCY_SYMBOL_POSITION_EDEFAULT, oldCurrencySymbolPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrencySymbolPosition() {
		return currencySymbolPositionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CALENDAR_UID, oldCalendarUID, calendarUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDefaultStartTime() {
		return defaultStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultStartTime(XMLGregorianCalendar newDefaultStartTime) {
		XMLGregorianCalendar oldDefaultStartTime = defaultStartTime;
		defaultStartTime = newDefaultStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DEFAULT_START_TIME, oldDefaultStartTime, defaultStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDefaultFinishTime() {
		return defaultFinishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFinishTime(XMLGregorianCalendar newDefaultFinishTime) {
		XMLGregorianCalendar oldDefaultFinishTime = defaultFinishTime;
		defaultFinishTime = newDefaultFinishTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DEFAULT_FINISH_TIME, oldDefaultFinishTime, defaultFinishTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinutesPerDay() {
		return minutesPerDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutesPerDay(BigInteger newMinutesPerDay) {
		BigInteger oldMinutesPerDay = minutesPerDay;
		minutesPerDay = newMinutesPerDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MINUTES_PER_DAY, oldMinutesPerDay, minutesPerDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinutesPerWeek() {
		return minutesPerWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutesPerWeek(BigInteger newMinutesPerWeek) {
		BigInteger oldMinutesPerWeek = minutesPerWeek;
		minutesPerWeek = newMinutesPerWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MINUTES_PER_WEEK, oldMinutesPerWeek, minutesPerWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDaysPerMonth() {
		return daysPerMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysPerMonth(BigInteger newDaysPerMonth) {
		BigInteger oldDaysPerMonth = daysPerMonth;
		daysPerMonth = newDaysPerMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DAYS_PER_MONTH, oldDaysPerMonth, daysPerMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultTaskTypeType getDefaultTaskType() {
		return defaultTaskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTaskType(DefaultTaskTypeType newDefaultTaskType) {
		DefaultTaskTypeType oldDefaultTaskType = defaultTaskType;
		defaultTaskType = newDefaultTaskType == null ? DEFAULT_TASK_TYPE_EDEFAULT : newDefaultTaskType;
		boolean oldDefaultTaskTypeESet = defaultTaskTypeESet;
		defaultTaskTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_TYPE, oldDefaultTaskType, defaultTaskType, !oldDefaultTaskTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultTaskType() {
		DefaultTaskTypeType oldDefaultTaskType = defaultTaskType;
		boolean oldDefaultTaskTypeESet = defaultTaskTypeESet;
		defaultTaskType = DEFAULT_TASK_TYPE_EDEFAULT;
		defaultTaskTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_TYPE, oldDefaultTaskType, DEFAULT_TASK_TYPE_EDEFAULT, oldDefaultTaskTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultTaskType() {
		return defaultTaskTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultFixedCostAccrualType getDefaultFixedCostAccrual() {
		return defaultFixedCostAccrual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFixedCostAccrual(DefaultFixedCostAccrualType newDefaultFixedCostAccrual) {
		DefaultFixedCostAccrualType oldDefaultFixedCostAccrual = defaultFixedCostAccrual;
		defaultFixedCostAccrual = newDefaultFixedCostAccrual == null ? DEFAULT_FIXED_COST_ACCRUAL_EDEFAULT : newDefaultFixedCostAccrual;
		boolean oldDefaultFixedCostAccrualESet = defaultFixedCostAccrualESet;
		defaultFixedCostAccrualESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL, oldDefaultFixedCostAccrual, defaultFixedCostAccrual, !oldDefaultFixedCostAccrualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultFixedCostAccrual() {
		DefaultFixedCostAccrualType oldDefaultFixedCostAccrual = defaultFixedCostAccrual;
		boolean oldDefaultFixedCostAccrualESet = defaultFixedCostAccrualESet;
		defaultFixedCostAccrual = DEFAULT_FIXED_COST_ACCRUAL_EDEFAULT;
		defaultFixedCostAccrualESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL, oldDefaultFixedCostAccrual, DEFAULT_FIXED_COST_ACCRUAL_EDEFAULT, oldDefaultFixedCostAccrualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultFixedCostAccrual() {
		return defaultFixedCostAccrualESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDefaultStandardRate() {
		return defaultStandardRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultStandardRate(float newDefaultStandardRate) {
		float oldDefaultStandardRate = defaultStandardRate;
		defaultStandardRate = newDefaultStandardRate;
		boolean oldDefaultStandardRateESet = defaultStandardRateESet;
		defaultStandardRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DEFAULT_STANDARD_RATE, oldDefaultStandardRate, defaultStandardRate, !oldDefaultStandardRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultStandardRate() {
		float oldDefaultStandardRate = defaultStandardRate;
		boolean oldDefaultStandardRateESet = defaultStandardRateESet;
		defaultStandardRate = DEFAULT_STANDARD_RATE_EDEFAULT;
		defaultStandardRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__DEFAULT_STANDARD_RATE, oldDefaultStandardRate, DEFAULT_STANDARD_RATE_EDEFAULT, oldDefaultStandardRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultStandardRate() {
		return defaultStandardRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDefaultOvertimeRate() {
		return defaultOvertimeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOvertimeRate(float newDefaultOvertimeRate) {
		float oldDefaultOvertimeRate = defaultOvertimeRate;
		defaultOvertimeRate = newDefaultOvertimeRate;
		boolean oldDefaultOvertimeRateESet = defaultOvertimeRateESet;
		defaultOvertimeRateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DEFAULT_OVERTIME_RATE, oldDefaultOvertimeRate, defaultOvertimeRate, !oldDefaultOvertimeRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultOvertimeRate() {
		float oldDefaultOvertimeRate = defaultOvertimeRate;
		boolean oldDefaultOvertimeRateESet = defaultOvertimeRateESet;
		defaultOvertimeRate = DEFAULT_OVERTIME_RATE_EDEFAULT;
		defaultOvertimeRateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__DEFAULT_OVERTIME_RATE, oldDefaultOvertimeRate, DEFAULT_OVERTIME_RATE_EDEFAULT, oldDefaultOvertimeRateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultOvertimeRate() {
		return defaultOvertimeRateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType5 getDurationFormat() {
		return durationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationFormat(DurationFormatType5 newDurationFormat) {
		DurationFormatType5 oldDurationFormat = durationFormat;
		durationFormat = newDurationFormat == null ? DURATION_FORMAT_EDEFAULT : newDurationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DURATION_FORMAT, oldDurationFormat, durationFormat, !oldDurationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurationFormat() {
		DurationFormatType5 oldDurationFormat = durationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormat = DURATION_FORMAT_EDEFAULT;
		durationFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__DURATION_FORMAT, oldDurationFormat, DURATION_FORMAT_EDEFAULT, oldDurationFormatESet));
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
	public WorkFormatType getWorkFormat() {
		return workFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkFormat(WorkFormatType newWorkFormat) {
		WorkFormatType oldWorkFormat = workFormat;
		workFormat = newWorkFormat == null ? WORK_FORMAT_EDEFAULT : newWorkFormat;
		boolean oldWorkFormatESet = workFormatESet;
		workFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__WORK_FORMAT, oldWorkFormat, workFormat, !oldWorkFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkFormat() {
		WorkFormatType oldWorkFormat = workFormat;
		boolean oldWorkFormatESet = workFormatESet;
		workFormat = WORK_FORMAT_EDEFAULT;
		workFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__WORK_FORMAT, oldWorkFormat, WORK_FORMAT_EDEFAULT, oldWorkFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkFormat() {
		return workFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditableActualCosts() {
		return editableActualCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditableActualCosts(boolean newEditableActualCosts) {
		boolean oldEditableActualCosts = editableActualCosts;
		editableActualCosts = newEditableActualCosts;
		boolean oldEditableActualCostsESet = editableActualCostsESet;
		editableActualCostsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS, oldEditableActualCosts, editableActualCosts, !oldEditableActualCostsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEditableActualCosts() {
		boolean oldEditableActualCosts = editableActualCosts;
		boolean oldEditableActualCostsESet = editableActualCostsESet;
		editableActualCosts = EDITABLE_ACTUAL_COSTS_EDEFAULT;
		editableActualCostsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS, oldEditableActualCosts, EDITABLE_ACTUAL_COSTS_EDEFAULT, oldEditableActualCostsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEditableActualCosts() {
		return editableActualCostsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHonorConstraints() {
		return honorConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHonorConstraints(boolean newHonorConstraints) {
		boolean oldHonorConstraints = honorConstraints;
		honorConstraints = newHonorConstraints;
		boolean oldHonorConstraintsESet = honorConstraintsESet;
		honorConstraintsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__HONOR_CONSTRAINTS, oldHonorConstraints, honorConstraints, !oldHonorConstraintsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHonorConstraints() {
		boolean oldHonorConstraints = honorConstraints;
		boolean oldHonorConstraintsESet = honorConstraintsESet;
		honorConstraints = HONOR_CONSTRAINTS_EDEFAULT;
		honorConstraintsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__HONOR_CONSTRAINTS, oldHonorConstraints, HONOR_CONSTRAINTS_EDEFAULT, oldHonorConstraintsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHonorConstraints() {
		return honorConstraintsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarnedValueMethodType1 getEarnedValueMethod() {
		return earnedValueMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarnedValueMethod(EarnedValueMethodType1 newEarnedValueMethod) {
		EarnedValueMethodType1 oldEarnedValueMethod = earnedValueMethod;
		earnedValueMethod = newEarnedValueMethod == null ? EARNED_VALUE_METHOD_EDEFAULT : newEarnedValueMethod;
		boolean oldEarnedValueMethodESet = earnedValueMethodESet;
		earnedValueMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__EARNED_VALUE_METHOD, oldEarnedValueMethod, earnedValueMethod, !oldEarnedValueMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEarnedValueMethod() {
		EarnedValueMethodType1 oldEarnedValueMethod = earnedValueMethod;
		boolean oldEarnedValueMethodESet = earnedValueMethodESet;
		earnedValueMethod = EARNED_VALUE_METHOD_EDEFAULT;
		earnedValueMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__EARNED_VALUE_METHOD, oldEarnedValueMethod, EARNED_VALUE_METHOD_EDEFAULT, oldEarnedValueMethodESet));
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
	public boolean isInsertedProjectsLikeSummary() {
		return insertedProjectsLikeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertedProjectsLikeSummary(boolean newInsertedProjectsLikeSummary) {
		boolean oldInsertedProjectsLikeSummary = insertedProjectsLikeSummary;
		insertedProjectsLikeSummary = newInsertedProjectsLikeSummary;
		boolean oldInsertedProjectsLikeSummaryESet = insertedProjectsLikeSummaryESet;
		insertedProjectsLikeSummaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY, oldInsertedProjectsLikeSummary, insertedProjectsLikeSummary, !oldInsertedProjectsLikeSummaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInsertedProjectsLikeSummary() {
		boolean oldInsertedProjectsLikeSummary = insertedProjectsLikeSummary;
		boolean oldInsertedProjectsLikeSummaryESet = insertedProjectsLikeSummaryESet;
		insertedProjectsLikeSummary = INSERTED_PROJECTS_LIKE_SUMMARY_EDEFAULT;
		insertedProjectsLikeSummaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY, oldInsertedProjectsLikeSummary, INSERTED_PROJECTS_LIKE_SUMMARY_EDEFAULT, oldInsertedProjectsLikeSummaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInsertedProjectsLikeSummary() {
		return insertedProjectsLikeSummaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleCriticalPaths() {
		return multipleCriticalPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleCriticalPaths(boolean newMultipleCriticalPaths) {
		boolean oldMultipleCriticalPaths = multipleCriticalPaths;
		multipleCriticalPaths = newMultipleCriticalPaths;
		boolean oldMultipleCriticalPathsESet = multipleCriticalPathsESet;
		multipleCriticalPathsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS, oldMultipleCriticalPaths, multipleCriticalPaths, !oldMultipleCriticalPathsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultipleCriticalPaths() {
		boolean oldMultipleCriticalPaths = multipleCriticalPaths;
		boolean oldMultipleCriticalPathsESet = multipleCriticalPathsESet;
		multipleCriticalPaths = MULTIPLE_CRITICAL_PATHS_EDEFAULT;
		multipleCriticalPathsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS, oldMultipleCriticalPaths, MULTIPLE_CRITICAL_PATHS_EDEFAULT, oldMultipleCriticalPathsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultipleCriticalPaths() {
		return multipleCriticalPathsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNewTasksEffortDriven() {
		return newTasksEffortDriven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTasksEffortDriven(boolean newNewTasksEffortDriven) {
		boolean oldNewTasksEffortDriven = newTasksEffortDriven;
		newTasksEffortDriven = newNewTasksEffortDriven;
		boolean oldNewTasksEffortDrivenESet = newTasksEffortDrivenESet;
		newTasksEffortDrivenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN, oldNewTasksEffortDriven, newTasksEffortDriven, !oldNewTasksEffortDrivenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNewTasksEffortDriven() {
		boolean oldNewTasksEffortDriven = newTasksEffortDriven;
		boolean oldNewTasksEffortDrivenESet = newTasksEffortDrivenESet;
		newTasksEffortDriven = NEW_TASKS_EFFORT_DRIVEN_EDEFAULT;
		newTasksEffortDrivenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN, oldNewTasksEffortDriven, NEW_TASKS_EFFORT_DRIVEN_EDEFAULT, oldNewTasksEffortDrivenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNewTasksEffortDriven() {
		return newTasksEffortDrivenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNewTasksEstimated() {
		return newTasksEstimated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTasksEstimated(boolean newNewTasksEstimated) {
		boolean oldNewTasksEstimated = newTasksEstimated;
		newTasksEstimated = newNewTasksEstimated;
		boolean oldNewTasksEstimatedESet = newTasksEstimatedESet;
		newTasksEstimatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__NEW_TASKS_ESTIMATED, oldNewTasksEstimated, newTasksEstimated, !oldNewTasksEstimatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNewTasksEstimated() {
		boolean oldNewTasksEstimated = newTasksEstimated;
		boolean oldNewTasksEstimatedESet = newTasksEstimatedESet;
		newTasksEstimated = NEW_TASKS_ESTIMATED_EDEFAULT;
		newTasksEstimatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__NEW_TASKS_ESTIMATED, oldNewTasksEstimated, NEW_TASKS_ESTIMATED_EDEFAULT, oldNewTasksEstimatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNewTasksEstimated() {
		return newTasksEstimatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSplitsInProgressTasks() {
		return splitsInProgressTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitsInProgressTasks(boolean newSplitsInProgressTasks) {
		boolean oldSplitsInProgressTasks = splitsInProgressTasks;
		splitsInProgressTasks = newSplitsInProgressTasks;
		boolean oldSplitsInProgressTasksESet = splitsInProgressTasksESet;
		splitsInProgressTasksESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS, oldSplitsInProgressTasks, splitsInProgressTasks, !oldSplitsInProgressTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSplitsInProgressTasks() {
		boolean oldSplitsInProgressTasks = splitsInProgressTasks;
		boolean oldSplitsInProgressTasksESet = splitsInProgressTasksESet;
		splitsInProgressTasks = SPLITS_IN_PROGRESS_TASKS_EDEFAULT;
		splitsInProgressTasksESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS, oldSplitsInProgressTasks, SPLITS_IN_PROGRESS_TASKS_EDEFAULT, oldSplitsInProgressTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSplitsInProgressTasks() {
		return splitsInProgressTasksESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpreadActualCost() {
		return spreadActualCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadActualCost(boolean newSpreadActualCost) {
		boolean oldSpreadActualCost = spreadActualCost;
		spreadActualCost = newSpreadActualCost;
		boolean oldSpreadActualCostESet = spreadActualCostESet;
		spreadActualCostESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__SPREAD_ACTUAL_COST, oldSpreadActualCost, spreadActualCost, !oldSpreadActualCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpreadActualCost() {
		boolean oldSpreadActualCost = spreadActualCost;
		boolean oldSpreadActualCostESet = spreadActualCostESet;
		spreadActualCost = SPREAD_ACTUAL_COST_EDEFAULT;
		spreadActualCostESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__SPREAD_ACTUAL_COST, oldSpreadActualCost, SPREAD_ACTUAL_COST_EDEFAULT, oldSpreadActualCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpreadActualCost() {
		return spreadActualCostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpreadPercentComplete() {
		return spreadPercentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadPercentComplete(boolean newSpreadPercentComplete) {
		boolean oldSpreadPercentComplete = spreadPercentComplete;
		spreadPercentComplete = newSpreadPercentComplete;
		boolean oldSpreadPercentCompleteESet = spreadPercentCompleteESet;
		spreadPercentCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE, oldSpreadPercentComplete, spreadPercentComplete, !oldSpreadPercentCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpreadPercentComplete() {
		boolean oldSpreadPercentComplete = spreadPercentComplete;
		boolean oldSpreadPercentCompleteESet = spreadPercentCompleteESet;
		spreadPercentComplete = SPREAD_PERCENT_COMPLETE_EDEFAULT;
		spreadPercentCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE, oldSpreadPercentComplete, SPREAD_PERCENT_COMPLETE_EDEFAULT, oldSpreadPercentCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpreadPercentComplete() {
		return spreadPercentCompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTaskUpdatesResource() {
		return taskUpdatesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskUpdatesResource(boolean newTaskUpdatesResource) {
		boolean oldTaskUpdatesResource = taskUpdatesResource;
		taskUpdatesResource = newTaskUpdatesResource;
		boolean oldTaskUpdatesResourceESet = taskUpdatesResourceESet;
		taskUpdatesResourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__TASK_UPDATES_RESOURCE, oldTaskUpdatesResource, taskUpdatesResource, !oldTaskUpdatesResourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaskUpdatesResource() {
		boolean oldTaskUpdatesResource = taskUpdatesResource;
		boolean oldTaskUpdatesResourceESet = taskUpdatesResourceESet;
		taskUpdatesResource = TASK_UPDATES_RESOURCE_EDEFAULT;
		taskUpdatesResourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__TASK_UPDATES_RESOURCE, oldTaskUpdatesResource, TASK_UPDATES_RESOURCE_EDEFAULT, oldTaskUpdatesResourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTaskUpdatesResource() {
		return taskUpdatesResourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFiscalYearStart() {
		return fiscalYearStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalYearStart(boolean newFiscalYearStart) {
		boolean oldFiscalYearStart = fiscalYearStart;
		fiscalYearStart = newFiscalYearStart;
		boolean oldFiscalYearStartESet = fiscalYearStartESet;
		fiscalYearStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__FISCAL_YEAR_START, oldFiscalYearStart, fiscalYearStart, !oldFiscalYearStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiscalYearStart() {
		boolean oldFiscalYearStart = fiscalYearStart;
		boolean oldFiscalYearStartESet = fiscalYearStartESet;
		fiscalYearStart = FISCAL_YEAR_START_EDEFAULT;
		fiscalYearStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__FISCAL_YEAR_START, oldFiscalYearStart, FISCAL_YEAR_START_EDEFAULT, oldFiscalYearStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFiscalYearStart() {
		return fiscalYearStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekStartDayType getWeekStartDay() {
		return weekStartDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekStartDay(WeekStartDayType newWeekStartDay) {
		WeekStartDayType oldWeekStartDay = weekStartDay;
		weekStartDay = newWeekStartDay == null ? WEEK_START_DAY_EDEFAULT : newWeekStartDay;
		boolean oldWeekStartDayESet = weekStartDayESet;
		weekStartDayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__WEEK_START_DAY, oldWeekStartDay, weekStartDay, !oldWeekStartDayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWeekStartDay() {
		WeekStartDayType oldWeekStartDay = weekStartDay;
		boolean oldWeekStartDayESet = weekStartDayESet;
		weekStartDay = WEEK_START_DAY_EDEFAULT;
		weekStartDayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__WEEK_START_DAY, oldWeekStartDay, WEEK_START_DAY_EDEFAULT, oldWeekStartDayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWeekStartDay() {
		return weekStartDayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoveCompletedEndsBack() {
		return moveCompletedEndsBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveCompletedEndsBack(boolean newMoveCompletedEndsBack) {
		boolean oldMoveCompletedEndsBack = moveCompletedEndsBack;
		moveCompletedEndsBack = newMoveCompletedEndsBack;
		boolean oldMoveCompletedEndsBackESet = moveCompletedEndsBackESet;
		moveCompletedEndsBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK, oldMoveCompletedEndsBack, moveCompletedEndsBack, !oldMoveCompletedEndsBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoveCompletedEndsBack() {
		boolean oldMoveCompletedEndsBack = moveCompletedEndsBack;
		boolean oldMoveCompletedEndsBackESet = moveCompletedEndsBackESet;
		moveCompletedEndsBack = MOVE_COMPLETED_ENDS_BACK_EDEFAULT;
		moveCompletedEndsBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK, oldMoveCompletedEndsBack, MOVE_COMPLETED_ENDS_BACK_EDEFAULT, oldMoveCompletedEndsBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoveCompletedEndsBack() {
		return moveCompletedEndsBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoveRemainingStartsBack() {
		return moveRemainingStartsBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveRemainingStartsBack(boolean newMoveRemainingStartsBack) {
		boolean oldMoveRemainingStartsBack = moveRemainingStartsBack;
		moveRemainingStartsBack = newMoveRemainingStartsBack;
		boolean oldMoveRemainingStartsBackESet = moveRemainingStartsBackESet;
		moveRemainingStartsBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK, oldMoveRemainingStartsBack, moveRemainingStartsBack, !oldMoveRemainingStartsBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoveRemainingStartsBack() {
		boolean oldMoveRemainingStartsBack = moveRemainingStartsBack;
		boolean oldMoveRemainingStartsBackESet = moveRemainingStartsBackESet;
		moveRemainingStartsBack = MOVE_REMAINING_STARTS_BACK_EDEFAULT;
		moveRemainingStartsBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK, oldMoveRemainingStartsBack, MOVE_REMAINING_STARTS_BACK_EDEFAULT, oldMoveRemainingStartsBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoveRemainingStartsBack() {
		return moveRemainingStartsBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoveRemainingStartsForward() {
		return moveRemainingStartsForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveRemainingStartsForward(boolean newMoveRemainingStartsForward) {
		boolean oldMoveRemainingStartsForward = moveRemainingStartsForward;
		moveRemainingStartsForward = newMoveRemainingStartsForward;
		boolean oldMoveRemainingStartsForwardESet = moveRemainingStartsForwardESet;
		moveRemainingStartsForwardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD, oldMoveRemainingStartsForward, moveRemainingStartsForward, !oldMoveRemainingStartsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoveRemainingStartsForward() {
		boolean oldMoveRemainingStartsForward = moveRemainingStartsForward;
		boolean oldMoveRemainingStartsForwardESet = moveRemainingStartsForwardESet;
		moveRemainingStartsForward = MOVE_REMAINING_STARTS_FORWARD_EDEFAULT;
		moveRemainingStartsForwardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD, oldMoveRemainingStartsForward, MOVE_REMAINING_STARTS_FORWARD_EDEFAULT, oldMoveRemainingStartsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoveRemainingStartsForward() {
		return moveRemainingStartsForwardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoveCompletedEndsForward() {
		return moveCompletedEndsForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveCompletedEndsForward(boolean newMoveCompletedEndsForward) {
		boolean oldMoveCompletedEndsForward = moveCompletedEndsForward;
		moveCompletedEndsForward = newMoveCompletedEndsForward;
		boolean oldMoveCompletedEndsForwardESet = moveCompletedEndsForwardESet;
		moveCompletedEndsForwardESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD, oldMoveCompletedEndsForward, moveCompletedEndsForward, !oldMoveCompletedEndsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoveCompletedEndsForward() {
		boolean oldMoveCompletedEndsForward = moveCompletedEndsForward;
		boolean oldMoveCompletedEndsForwardESet = moveCompletedEndsForwardESet;
		moveCompletedEndsForward = MOVE_COMPLETED_ENDS_FORWARD_EDEFAULT;
		moveCompletedEndsForwardESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD, oldMoveCompletedEndsForward, MOVE_COMPLETED_ENDS_FORWARD_EDEFAULT, oldMoveCompletedEndsForwardESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoveCompletedEndsForward() {
		return moveCompletedEndsForwardESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineForEarnedValueType getBaselineForEarnedValue() {
		return baselineForEarnedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaselineForEarnedValue(BaselineForEarnedValueType newBaselineForEarnedValue) {
		BaselineForEarnedValueType oldBaselineForEarnedValue = baselineForEarnedValue;
		baselineForEarnedValue = newBaselineForEarnedValue == null ? BASELINE_FOR_EARNED_VALUE_EDEFAULT : newBaselineForEarnedValue;
		boolean oldBaselineForEarnedValueESet = baselineForEarnedValueESet;
		baselineForEarnedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE, oldBaselineForEarnedValue, baselineForEarnedValue, !oldBaselineForEarnedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaselineForEarnedValue() {
		BaselineForEarnedValueType oldBaselineForEarnedValue = baselineForEarnedValue;
		boolean oldBaselineForEarnedValueESet = baselineForEarnedValueESet;
		baselineForEarnedValue = BASELINE_FOR_EARNED_VALUE_EDEFAULT;
		baselineForEarnedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE, oldBaselineForEarnedValue, BASELINE_FOR_EARNED_VALUE_EDEFAULT, oldBaselineForEarnedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaselineForEarnedValue() {
		return baselineForEarnedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoAddNewResourcesAndTasks() {
		return autoAddNewResourcesAndTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoAddNewResourcesAndTasks(boolean newAutoAddNewResourcesAndTasks) {
		boolean oldAutoAddNewResourcesAndTasks = autoAddNewResourcesAndTasks;
		autoAddNewResourcesAndTasks = newAutoAddNewResourcesAndTasks;
		boolean oldAutoAddNewResourcesAndTasksESet = autoAddNewResourcesAndTasksESet;
		autoAddNewResourcesAndTasksESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS, oldAutoAddNewResourcesAndTasks, autoAddNewResourcesAndTasks, !oldAutoAddNewResourcesAndTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoAddNewResourcesAndTasks() {
		boolean oldAutoAddNewResourcesAndTasks = autoAddNewResourcesAndTasks;
		boolean oldAutoAddNewResourcesAndTasksESet = autoAddNewResourcesAndTasksESet;
		autoAddNewResourcesAndTasks = AUTO_ADD_NEW_RESOURCES_AND_TASKS_EDEFAULT;
		autoAddNewResourcesAndTasksESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS, oldAutoAddNewResourcesAndTasks, AUTO_ADD_NEW_RESOURCES_AND_TASKS_EDEFAULT, oldAutoAddNewResourcesAndTasksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoAddNewResourcesAndTasks() {
		return autoAddNewResourcesAndTasksESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDate(XMLGregorianCalendar newStatusDate) {
		XMLGregorianCalendar oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__STATUS_DATE, oldStatusDate, statusDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCurrentDate() {
		return currentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDate(XMLGregorianCalendar newCurrentDate) {
		XMLGregorianCalendar oldCurrentDate = currentDate;
		currentDate = newCurrentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CURRENT_DATE, oldCurrentDate, currentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMicrosoftProjectServerURL() {
		return microsoftProjectServerURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicrosoftProjectServerURL(boolean newMicrosoftProjectServerURL) {
		boolean oldMicrosoftProjectServerURL = microsoftProjectServerURL;
		microsoftProjectServerURL = newMicrosoftProjectServerURL;
		boolean oldMicrosoftProjectServerURLESet = microsoftProjectServerURLESet;
		microsoftProjectServerURLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL, oldMicrosoftProjectServerURL, microsoftProjectServerURL, !oldMicrosoftProjectServerURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMicrosoftProjectServerURL() {
		boolean oldMicrosoftProjectServerURL = microsoftProjectServerURL;
		boolean oldMicrosoftProjectServerURLESet = microsoftProjectServerURLESet;
		microsoftProjectServerURL = MICROSOFT_PROJECT_SERVER_URL_EDEFAULT;
		microsoftProjectServerURLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL, oldMicrosoftProjectServerURL, MICROSOFT_PROJECT_SERVER_URL_EDEFAULT, oldMicrosoftProjectServerURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMicrosoftProjectServerURL() {
		return microsoftProjectServerURLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutolink() {
		return autolink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutolink(boolean newAutolink) {
		boolean oldAutolink = autolink;
		autolink = newAutolink;
		boolean oldAutolinkESet = autolinkESet;
		autolinkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__AUTOLINK, oldAutolink, autolink, !oldAutolinkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutolink() {
		boolean oldAutolink = autolink;
		boolean oldAutolinkESet = autolinkESet;
		autolink = AUTOLINK_EDEFAULT;
		autolinkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__AUTOLINK, oldAutolink, AUTOLINK_EDEFAULT, oldAutolinkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutolink() {
		return autolinkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewTaskStartDateType getNewTaskStartDate() {
		return newTaskStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTaskStartDate(NewTaskStartDateType newNewTaskStartDate) {
		NewTaskStartDateType oldNewTaskStartDate = newTaskStartDate;
		newTaskStartDate = newNewTaskStartDate == null ? NEW_TASK_START_DATE_EDEFAULT : newNewTaskStartDate;
		boolean oldNewTaskStartDateESet = newTaskStartDateESet;
		newTaskStartDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__NEW_TASK_START_DATE, oldNewTaskStartDate, newTaskStartDate, !oldNewTaskStartDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNewTaskStartDate() {
		NewTaskStartDateType oldNewTaskStartDate = newTaskStartDate;
		boolean oldNewTaskStartDateESet = newTaskStartDateESet;
		newTaskStartDate = NEW_TASK_START_DATE_EDEFAULT;
		newTaskStartDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__NEW_TASK_START_DATE, oldNewTaskStartDate, NEW_TASK_START_DATE_EDEFAULT, oldNewTaskStartDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNewTaskStartDate() {
		return newTaskStartDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultTaskEVMethodType getDefaultTaskEVMethod() {
		return defaultTaskEVMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTaskEVMethod(DefaultTaskEVMethodType newDefaultTaskEVMethod) {
		DefaultTaskEVMethodType oldDefaultTaskEVMethod = defaultTaskEVMethod;
		defaultTaskEVMethod = newDefaultTaskEVMethod == null ? DEFAULT_TASK_EV_METHOD_EDEFAULT : newDefaultTaskEVMethod;
		boolean oldDefaultTaskEVMethodESet = defaultTaskEVMethodESet;
		defaultTaskEVMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD, oldDefaultTaskEVMethod, defaultTaskEVMethod, !oldDefaultTaskEVMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultTaskEVMethod() {
		DefaultTaskEVMethodType oldDefaultTaskEVMethod = defaultTaskEVMethod;
		boolean oldDefaultTaskEVMethodESet = defaultTaskEVMethodESet;
		defaultTaskEVMethod = DEFAULT_TASK_EV_METHOD_EDEFAULT;
		defaultTaskEVMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD, oldDefaultTaskEVMethod, DEFAULT_TASK_EV_METHOD_EDEFAULT, oldDefaultTaskEVMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultTaskEVMethod() {
		return defaultTaskEVMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProjectExternallyEdited() {
		return projectExternallyEdited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectExternallyEdited(boolean newProjectExternallyEdited) {
		boolean oldProjectExternallyEdited = projectExternallyEdited;
		projectExternallyEdited = newProjectExternallyEdited;
		boolean oldProjectExternallyEditedESet = projectExternallyEditedESet;
		projectExternallyEditedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED, oldProjectExternallyEdited, projectExternallyEdited, !oldProjectExternallyEditedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProjectExternallyEdited() {
		boolean oldProjectExternallyEdited = projectExternallyEdited;
		boolean oldProjectExternallyEditedESet = projectExternallyEditedESet;
		projectExternallyEdited = PROJECT_EXTERNALLY_EDITED_EDEFAULT;
		projectExternallyEditedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED, oldProjectExternallyEdited, PROJECT_EXTERNALLY_EDITED_EDEFAULT, oldProjectExternallyEditedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProjectExternallyEdited() {
		return projectExternallyEditedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getExtendedCreationDate() {
		return extendedCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedCreationDate(XMLGregorianCalendar newExtendedCreationDate) {
		XMLGregorianCalendar oldExtendedCreationDate = extendedCreationDate;
		extendedCreationDate = newExtendedCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__EXTENDED_CREATION_DATE, oldExtendedCreationDate, extendedCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActualsInSync() {
		return actualsInSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualsInSync(boolean newActualsInSync) {
		boolean oldActualsInSync = actualsInSync;
		actualsInSync = newActualsInSync;
		boolean oldActualsInSyncESet = actualsInSyncESet;
		actualsInSyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__ACTUALS_IN_SYNC, oldActualsInSync, actualsInSync, !oldActualsInSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualsInSync() {
		boolean oldActualsInSync = actualsInSync;
		boolean oldActualsInSyncESet = actualsInSyncESet;
		actualsInSync = ACTUALS_IN_SYNC_EDEFAULT;
		actualsInSyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__ACTUALS_IN_SYNC, oldActualsInSync, ACTUALS_IN_SYNC_EDEFAULT, oldActualsInSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualsInSync() {
		return actualsInSyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoveFileProperties() {
		return removeFileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveFileProperties(boolean newRemoveFileProperties) {
		boolean oldRemoveFileProperties = removeFileProperties;
		removeFileProperties = newRemoveFileProperties;
		boolean oldRemoveFilePropertiesESet = removeFilePropertiesESet;
		removeFilePropertiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__REMOVE_FILE_PROPERTIES, oldRemoveFileProperties, removeFileProperties, !oldRemoveFilePropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemoveFileProperties() {
		boolean oldRemoveFileProperties = removeFileProperties;
		boolean oldRemoveFilePropertiesESet = removeFilePropertiesESet;
		removeFileProperties = REMOVE_FILE_PROPERTIES_EDEFAULT;
		removeFilePropertiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__REMOVE_FILE_PROPERTIES, oldRemoveFileProperties, REMOVE_FILE_PROPERTIES_EDEFAULT, oldRemoveFilePropertiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemoveFileProperties() {
		return removeFilePropertiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdminProject() {
		return adminProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminProject(boolean newAdminProject) {
		boolean oldAdminProject = adminProject;
		adminProject = newAdminProject;
		boolean oldAdminProjectESet = adminProjectESet;
		adminProjectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__ADMIN_PROJECT, oldAdminProject, adminProject, !oldAdminProjectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdminProject() {
		boolean oldAdminProject = adminProject;
		boolean oldAdminProjectESet = adminProjectESet;
		adminProject = ADMIN_PROJECT_EDEFAULT;
		adminProjectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.PROJECT_TYPE__ADMIN_PROJECT, oldAdminProject, ADMIN_PROJECT_EDEFAULT, oldAdminProjectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdminProject() {
		return adminProjectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineCodesType getOutlineCodes() {
		return outlineCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutlineCodes(OutlineCodesType newOutlineCodes, NotificationChain msgs) {
		OutlineCodesType oldOutlineCodes = outlineCodes;
		outlineCodes = newOutlineCodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__OUTLINE_CODES, oldOutlineCodes, newOutlineCodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineCodes(OutlineCodesType newOutlineCodes) {
		if (newOutlineCodes != outlineCodes) {
			NotificationChain msgs = null;
			if (outlineCodes != null)
				msgs = ((InternalEObject)outlineCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__OUTLINE_CODES, null, msgs);
			if (newOutlineCodes != null)
				msgs = ((InternalEObject)newOutlineCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__OUTLINE_CODES, null, msgs);
			msgs = basicSetOutlineCodes(newOutlineCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__OUTLINE_CODES, newOutlineCodes, newOutlineCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WBSMasksType getWBSMasks() {
		return wBSMasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWBSMasks(WBSMasksType newWBSMasks, NotificationChain msgs) {
		WBSMasksType oldWBSMasks = wBSMasks;
		wBSMasks = newWBSMasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__WBS_MASKS, oldWBSMasks, newWBSMasks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWBSMasks(WBSMasksType newWBSMasks) {
		if (newWBSMasks != wBSMasks) {
			NotificationChain msgs = null;
			if (wBSMasks != null)
				msgs = ((InternalEObject)wBSMasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__WBS_MASKS, null, msgs);
			if (newWBSMasks != null)
				msgs = ((InternalEObject)newWBSMasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__WBS_MASKS, null, msgs);
			msgs = basicSetWBSMasks(newWBSMasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__WBS_MASKS, newWBSMasks, newWBSMasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributesType getExtendedAttributes() {
		return extendedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedAttributes(ExtendedAttributesType newExtendedAttributes, NotificationChain msgs) {
		ExtendedAttributesType oldExtendedAttributes = extendedAttributes;
		extendedAttributes = newExtendedAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES, oldExtendedAttributes, newExtendedAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedAttributes(ExtendedAttributesType newExtendedAttributes) {
		if (newExtendedAttributes != extendedAttributes) {
			NotificationChain msgs = null;
			if (extendedAttributes != null)
				msgs = ((InternalEObject)extendedAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES, null, msgs);
			if (newExtendedAttributes != null)
				msgs = ((InternalEObject)newExtendedAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES, null, msgs);
			msgs = basicSetExtendedAttributes(newExtendedAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES, newExtendedAttributes, newExtendedAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarsType getCalendars() {
		return calendars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalendars(CalendarsType newCalendars, NotificationChain msgs) {
		CalendarsType oldCalendars = calendars;
		calendars = newCalendars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CALENDARS, oldCalendars, newCalendars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendars(CalendarsType newCalendars) {
		if (newCalendars != calendars) {
			NotificationChain msgs = null;
			if (calendars != null)
				msgs = ((InternalEObject)calendars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__CALENDARS, null, msgs);
			if (newCalendars != null)
				msgs = ((InternalEObject)newCalendars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__CALENDARS, null, msgs);
			msgs = basicSetCalendars(newCalendars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__CALENDARS, newCalendars, newCalendars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksType getTasks() {
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasks(TasksType newTasks, NotificationChain msgs) {
		TasksType oldTasks = tasks;
		tasks = newTasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__TASKS, oldTasks, newTasks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasks(TasksType newTasks) {
		if (newTasks != tasks) {
			NotificationChain msgs = null;
			if (tasks != null)
				msgs = ((InternalEObject)tasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__TASKS, null, msgs);
			if (newTasks != null)
				msgs = ((InternalEObject)newTasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__TASKS, null, msgs);
			msgs = basicSetTasks(newTasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__TASKS, newTasks, newTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesType getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(ResourcesType newResources, NotificationChain msgs) {
		ResourcesType oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(ResourcesType newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentsType getAssignments() {
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignments(AssignmentsType newAssignments, NotificationChain msgs) {
		AssignmentsType oldAssignments = assignments;
		assignments = newAssignments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__ASSIGNMENTS, oldAssignments, newAssignments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignments(AssignmentsType newAssignments) {
		if (newAssignments != assignments) {
			NotificationChain msgs = null;
			if (assignments != null)
				msgs = ((InternalEObject)assignments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__ASSIGNMENTS, null, msgs);
			if (newAssignments != null)
				msgs = ((InternalEObject)newAssignments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.PROJECT_TYPE__ASSIGNMENTS, null, msgs);
			msgs = basicSetAssignments(newAssignments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.PROJECT_TYPE__ASSIGNMENTS, newAssignments, newAssignments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.PROJECT_TYPE__OUTLINE_CODES:
				return basicSetOutlineCodes(null, msgs);
			case MspdiPackage.PROJECT_TYPE__WBS_MASKS:
				return basicSetWBSMasks(null, msgs);
			case MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES:
				return basicSetExtendedAttributes(null, msgs);
			case MspdiPackage.PROJECT_TYPE__CALENDARS:
				return basicSetCalendars(null, msgs);
			case MspdiPackage.PROJECT_TYPE__TASKS:
				return basicSetTasks(null, msgs);
			case MspdiPackage.PROJECT_TYPE__RESOURCES:
				return basicSetResources(null, msgs);
			case MspdiPackage.PROJECT_TYPE__ASSIGNMENTS:
				return basicSetAssignments(null, msgs);
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
			case MspdiPackage.PROJECT_TYPE__SAVE_VERSION:
				return getSaveVersion();
			case MspdiPackage.PROJECT_TYPE__UID:
				return getUID();
			case MspdiPackage.PROJECT_TYPE__NAME:
				return getName();
			case MspdiPackage.PROJECT_TYPE__TITLE:
				return getTitle();
			case MspdiPackage.PROJECT_TYPE__SUBJECT:
				return getSubject();
			case MspdiPackage.PROJECT_TYPE__CATEGORY:
				return getCategory();
			case MspdiPackage.PROJECT_TYPE__COMPANY:
				return getCompany();
			case MspdiPackage.PROJECT_TYPE__MANAGER:
				return getManager();
			case MspdiPackage.PROJECT_TYPE__AUTHOR:
				return getAuthor();
			case MspdiPackage.PROJECT_TYPE__CREATION_DATE:
				return getCreationDate();
			case MspdiPackage.PROJECT_TYPE__REVISION:
				return getRevision();
			case MspdiPackage.PROJECT_TYPE__LAST_SAVED:
				return getLastSaved();
			case MspdiPackage.PROJECT_TYPE__SCHEDULE_FROM_START:
				return isScheduleFromStart();
			case MspdiPackage.PROJECT_TYPE__START_DATE:
				return getStartDate();
			case MspdiPackage.PROJECT_TYPE__FINISH_DATE:
				return getFinishDate();
			case MspdiPackage.PROJECT_TYPE__FY_START_DATE:
				return getFYStartDate();
			case MspdiPackage.PROJECT_TYPE__CRITICAL_SLACK_LIMIT:
				return getCriticalSlackLimit();
			case MspdiPackage.PROJECT_TYPE__CURRENCY_DIGITS:
				return getCurrencyDigits();
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL:
				return getCurrencySymbol();
			case MspdiPackage.PROJECT_TYPE__CURRENCY_CODE:
				return getCurrencyCode();
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION:
				return getCurrencySymbolPosition();
			case MspdiPackage.PROJECT_TYPE__CALENDAR_UID:
				return getCalendarUID();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_START_TIME:
				return getDefaultStartTime();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FINISH_TIME:
				return getDefaultFinishTime();
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_DAY:
				return getMinutesPerDay();
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_WEEK:
				return getMinutesPerWeek();
			case MspdiPackage.PROJECT_TYPE__DAYS_PER_MONTH:
				return getDaysPerMonth();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_TYPE:
				return getDefaultTaskType();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL:
				return getDefaultFixedCostAccrual();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_STANDARD_RATE:
				return getDefaultStandardRate();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_OVERTIME_RATE:
				return getDefaultOvertimeRate();
			case MspdiPackage.PROJECT_TYPE__DURATION_FORMAT:
				return getDurationFormat();
			case MspdiPackage.PROJECT_TYPE__WORK_FORMAT:
				return getWorkFormat();
			case MspdiPackage.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS:
				return isEditableActualCosts();
			case MspdiPackage.PROJECT_TYPE__HONOR_CONSTRAINTS:
				return isHonorConstraints();
			case MspdiPackage.PROJECT_TYPE__EARNED_VALUE_METHOD:
				return getEarnedValueMethod();
			case MspdiPackage.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY:
				return isInsertedProjectsLikeSummary();
			case MspdiPackage.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS:
				return isMultipleCriticalPaths();
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN:
				return isNewTasksEffortDriven();
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_ESTIMATED:
				return isNewTasksEstimated();
			case MspdiPackage.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS:
				return isSplitsInProgressTasks();
			case MspdiPackage.PROJECT_TYPE__SPREAD_ACTUAL_COST:
				return isSpreadActualCost();
			case MspdiPackage.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE:
				return isSpreadPercentComplete();
			case MspdiPackage.PROJECT_TYPE__TASK_UPDATES_RESOURCE:
				return isTaskUpdatesResource();
			case MspdiPackage.PROJECT_TYPE__FISCAL_YEAR_START:
				return isFiscalYearStart();
			case MspdiPackage.PROJECT_TYPE__WEEK_START_DAY:
				return getWeekStartDay();
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK:
				return isMoveCompletedEndsBack();
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK:
				return isMoveRemainingStartsBack();
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD:
				return isMoveRemainingStartsForward();
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD:
				return isMoveCompletedEndsForward();
			case MspdiPackage.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE:
				return getBaselineForEarnedValue();
			case MspdiPackage.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS:
				return isAutoAddNewResourcesAndTasks();
			case MspdiPackage.PROJECT_TYPE__STATUS_DATE:
				return getStatusDate();
			case MspdiPackage.PROJECT_TYPE__CURRENT_DATE:
				return getCurrentDate();
			case MspdiPackage.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL:
				return isMicrosoftProjectServerURL();
			case MspdiPackage.PROJECT_TYPE__AUTOLINK:
				return isAutolink();
			case MspdiPackage.PROJECT_TYPE__NEW_TASK_START_DATE:
				return getNewTaskStartDate();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD:
				return getDefaultTaskEVMethod();
			case MspdiPackage.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED:
				return isProjectExternallyEdited();
			case MspdiPackage.PROJECT_TYPE__EXTENDED_CREATION_DATE:
				return getExtendedCreationDate();
			case MspdiPackage.PROJECT_TYPE__ACTUALS_IN_SYNC:
				return isActualsInSync();
			case MspdiPackage.PROJECT_TYPE__REMOVE_FILE_PROPERTIES:
				return isRemoveFileProperties();
			case MspdiPackage.PROJECT_TYPE__ADMIN_PROJECT:
				return isAdminProject();
			case MspdiPackage.PROJECT_TYPE__OUTLINE_CODES:
				return getOutlineCodes();
			case MspdiPackage.PROJECT_TYPE__WBS_MASKS:
				return getWBSMasks();
			case MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES:
				return getExtendedAttributes();
			case MspdiPackage.PROJECT_TYPE__CALENDARS:
				return getCalendars();
			case MspdiPackage.PROJECT_TYPE__TASKS:
				return getTasks();
			case MspdiPackage.PROJECT_TYPE__RESOURCES:
				return getResources();
			case MspdiPackage.PROJECT_TYPE__ASSIGNMENTS:
				return getAssignments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MspdiPackage.PROJECT_TYPE__SAVE_VERSION:
				setSaveVersion((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__UID:
				setUID((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__NAME:
				setName((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__SUBJECT:
				setSubject((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CATEGORY:
				setCategory((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__COMPANY:
				setCompany((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MANAGER:
				setManager((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__REVISION:
				setRevision((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__LAST_SAVED:
				setLastSaved((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__SCHEDULE_FROM_START:
				setScheduleFromStart((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__FINISH_DATE:
				setFinishDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__FY_START_DATE:
				setFYStartDate((FYStartDateType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CRITICAL_SLACK_LIMIT:
				setCriticalSlackLimit((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_DIGITS:
				setCurrencyDigits((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL:
				setCurrencySymbol((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_CODE:
				setCurrencyCode((String)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION:
				setCurrencySymbolPosition((CurrencySymbolPositionType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CALENDAR_UID:
				setCalendarUID((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_START_TIME:
				setDefaultStartTime((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FINISH_TIME:
				setDefaultFinishTime((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_DAY:
				setMinutesPerDay((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_WEEK:
				setMinutesPerWeek((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DAYS_PER_MONTH:
				setDaysPerMonth((BigInteger)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_TYPE:
				setDefaultTaskType((DefaultTaskTypeType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL:
				setDefaultFixedCostAccrual((DefaultFixedCostAccrualType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_STANDARD_RATE:
				setDefaultStandardRate((Float)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_OVERTIME_RATE:
				setDefaultOvertimeRate((Float)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DURATION_FORMAT:
				setDurationFormat((DurationFormatType5)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__WORK_FORMAT:
				setWorkFormat((WorkFormatType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS:
				setEditableActualCosts((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__HONOR_CONSTRAINTS:
				setHonorConstraints((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__EARNED_VALUE_METHOD:
				setEarnedValueMethod((EarnedValueMethodType1)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY:
				setInsertedProjectsLikeSummary((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS:
				setMultipleCriticalPaths((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN:
				setNewTasksEffortDriven((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_ESTIMATED:
				setNewTasksEstimated((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS:
				setSplitsInProgressTasks((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__SPREAD_ACTUAL_COST:
				setSpreadActualCost((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE:
				setSpreadPercentComplete((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__TASK_UPDATES_RESOURCE:
				setTaskUpdatesResource((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__FISCAL_YEAR_START:
				setFiscalYearStart((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__WEEK_START_DAY:
				setWeekStartDay((WeekStartDayType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK:
				setMoveCompletedEndsBack((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK:
				setMoveRemainingStartsBack((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD:
				setMoveRemainingStartsForward((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD:
				setMoveCompletedEndsForward((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE:
				setBaselineForEarnedValue((BaselineForEarnedValueType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS:
				setAutoAddNewResourcesAndTasks((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__STATUS_DATE:
				setStatusDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENT_DATE:
				setCurrentDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL:
				setMicrosoftProjectServerURL((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__AUTOLINK:
				setAutolink((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__NEW_TASK_START_DATE:
				setNewTaskStartDate((NewTaskStartDateType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD:
				setDefaultTaskEVMethod((DefaultTaskEVMethodType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED:
				setProjectExternallyEdited((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__EXTENDED_CREATION_DATE:
				setExtendedCreationDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__ACTUALS_IN_SYNC:
				setActualsInSync((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__REMOVE_FILE_PROPERTIES:
				setRemoveFileProperties((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__ADMIN_PROJECT:
				setAdminProject((Boolean)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__OUTLINE_CODES:
				setOutlineCodes((OutlineCodesType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__WBS_MASKS:
				setWBSMasks((WBSMasksType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributesType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__CALENDARS:
				setCalendars((CalendarsType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__TASKS:
				setTasks((TasksType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__RESOURCES:
				setResources((ResourcesType)newValue);
				return;
			case MspdiPackage.PROJECT_TYPE__ASSIGNMENTS:
				setAssignments((AssignmentsType)newValue);
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
			case MspdiPackage.PROJECT_TYPE__SAVE_VERSION:
				setSaveVersion(SAVE_VERSION_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__UID:
				setUID(UID_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__MANAGER:
				setManager(MANAGER_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__LAST_SAVED:
				setLastSaved(LAST_SAVED_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__SCHEDULE_FROM_START:
				unsetScheduleFromStart();
				return;
			case MspdiPackage.PROJECT_TYPE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__FINISH_DATE:
				setFinishDate(FINISH_DATE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__FY_START_DATE:
				unsetFYStartDate();
				return;
			case MspdiPackage.PROJECT_TYPE__CRITICAL_SLACK_LIMIT:
				setCriticalSlackLimit(CRITICAL_SLACK_LIMIT_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_DIGITS:
				setCurrencyDigits(CURRENCY_DIGITS_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL:
				setCurrencySymbol(CURRENCY_SYMBOL_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_CODE:
				setCurrencyCode(CURRENCY_CODE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION:
				unsetCurrencySymbolPosition();
				return;
			case MspdiPackage.PROJECT_TYPE__CALENDAR_UID:
				setCalendarUID(CALENDAR_UID_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_START_TIME:
				setDefaultStartTime(DEFAULT_START_TIME_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FINISH_TIME:
				setDefaultFinishTime(DEFAULT_FINISH_TIME_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_DAY:
				setMinutesPerDay(MINUTES_PER_DAY_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_WEEK:
				setMinutesPerWeek(MINUTES_PER_WEEK_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__DAYS_PER_MONTH:
				setDaysPerMonth(DAYS_PER_MONTH_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_TYPE:
				unsetDefaultTaskType();
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL:
				unsetDefaultFixedCostAccrual();
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_STANDARD_RATE:
				unsetDefaultStandardRate();
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_OVERTIME_RATE:
				unsetDefaultOvertimeRate();
				return;
			case MspdiPackage.PROJECT_TYPE__DURATION_FORMAT:
				unsetDurationFormat();
				return;
			case MspdiPackage.PROJECT_TYPE__WORK_FORMAT:
				unsetWorkFormat();
				return;
			case MspdiPackage.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS:
				unsetEditableActualCosts();
				return;
			case MspdiPackage.PROJECT_TYPE__HONOR_CONSTRAINTS:
				unsetHonorConstraints();
				return;
			case MspdiPackage.PROJECT_TYPE__EARNED_VALUE_METHOD:
				unsetEarnedValueMethod();
				return;
			case MspdiPackage.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY:
				unsetInsertedProjectsLikeSummary();
				return;
			case MspdiPackage.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS:
				unsetMultipleCriticalPaths();
				return;
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN:
				unsetNewTasksEffortDriven();
				return;
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_ESTIMATED:
				unsetNewTasksEstimated();
				return;
			case MspdiPackage.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS:
				unsetSplitsInProgressTasks();
				return;
			case MspdiPackage.PROJECT_TYPE__SPREAD_ACTUAL_COST:
				unsetSpreadActualCost();
				return;
			case MspdiPackage.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE:
				unsetSpreadPercentComplete();
				return;
			case MspdiPackage.PROJECT_TYPE__TASK_UPDATES_RESOURCE:
				unsetTaskUpdatesResource();
				return;
			case MspdiPackage.PROJECT_TYPE__FISCAL_YEAR_START:
				unsetFiscalYearStart();
				return;
			case MspdiPackage.PROJECT_TYPE__WEEK_START_DAY:
				unsetWeekStartDay();
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK:
				unsetMoveCompletedEndsBack();
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK:
				unsetMoveRemainingStartsBack();
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD:
				unsetMoveRemainingStartsForward();
				return;
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD:
				unsetMoveCompletedEndsForward();
				return;
			case MspdiPackage.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE:
				unsetBaselineForEarnedValue();
				return;
			case MspdiPackage.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS:
				unsetAutoAddNewResourcesAndTasks();
				return;
			case MspdiPackage.PROJECT_TYPE__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__CURRENT_DATE:
				setCurrentDate(CURRENT_DATE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL:
				unsetMicrosoftProjectServerURL();
				return;
			case MspdiPackage.PROJECT_TYPE__AUTOLINK:
				unsetAutolink();
				return;
			case MspdiPackage.PROJECT_TYPE__NEW_TASK_START_DATE:
				unsetNewTaskStartDate();
				return;
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD:
				unsetDefaultTaskEVMethod();
				return;
			case MspdiPackage.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED:
				unsetProjectExternallyEdited();
				return;
			case MspdiPackage.PROJECT_TYPE__EXTENDED_CREATION_DATE:
				setExtendedCreationDate(EXTENDED_CREATION_DATE_EDEFAULT);
				return;
			case MspdiPackage.PROJECT_TYPE__ACTUALS_IN_SYNC:
				unsetActualsInSync();
				return;
			case MspdiPackage.PROJECT_TYPE__REMOVE_FILE_PROPERTIES:
				unsetRemoveFileProperties();
				return;
			case MspdiPackage.PROJECT_TYPE__ADMIN_PROJECT:
				unsetAdminProject();
				return;
			case MspdiPackage.PROJECT_TYPE__OUTLINE_CODES:
				setOutlineCodes((OutlineCodesType)null);
				return;
			case MspdiPackage.PROJECT_TYPE__WBS_MASKS:
				setWBSMasks((WBSMasksType)null);
				return;
			case MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES:
				setExtendedAttributes((ExtendedAttributesType)null);
				return;
			case MspdiPackage.PROJECT_TYPE__CALENDARS:
				setCalendars((CalendarsType)null);
				return;
			case MspdiPackage.PROJECT_TYPE__TASKS:
				setTasks((TasksType)null);
				return;
			case MspdiPackage.PROJECT_TYPE__RESOURCES:
				setResources((ResourcesType)null);
				return;
			case MspdiPackage.PROJECT_TYPE__ASSIGNMENTS:
				setAssignments((AssignmentsType)null);
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
			case MspdiPackage.PROJECT_TYPE__SAVE_VERSION:
				return SAVE_VERSION_EDEFAULT == null ? saveVersion != null : !SAVE_VERSION_EDEFAULT.equals(saveVersion);
			case MspdiPackage.PROJECT_TYPE__UID:
				return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
			case MspdiPackage.PROJECT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MspdiPackage.PROJECT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case MspdiPackage.PROJECT_TYPE__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case MspdiPackage.PROJECT_TYPE__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case MspdiPackage.PROJECT_TYPE__COMPANY:
				return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
			case MspdiPackage.PROJECT_TYPE__MANAGER:
				return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
			case MspdiPackage.PROJECT_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case MspdiPackage.PROJECT_TYPE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case MspdiPackage.PROJECT_TYPE__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case MspdiPackage.PROJECT_TYPE__LAST_SAVED:
				return LAST_SAVED_EDEFAULT == null ? lastSaved != null : !LAST_SAVED_EDEFAULT.equals(lastSaved);
			case MspdiPackage.PROJECT_TYPE__SCHEDULE_FROM_START:
				return isSetScheduleFromStart();
			case MspdiPackage.PROJECT_TYPE__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case MspdiPackage.PROJECT_TYPE__FINISH_DATE:
				return FINISH_DATE_EDEFAULT == null ? finishDate != null : !FINISH_DATE_EDEFAULT.equals(finishDate);
			case MspdiPackage.PROJECT_TYPE__FY_START_DATE:
				return isSetFYStartDate();
			case MspdiPackage.PROJECT_TYPE__CRITICAL_SLACK_LIMIT:
				return CRITICAL_SLACK_LIMIT_EDEFAULT == null ? criticalSlackLimit != null : !CRITICAL_SLACK_LIMIT_EDEFAULT.equals(criticalSlackLimit);
			case MspdiPackage.PROJECT_TYPE__CURRENCY_DIGITS:
				return CURRENCY_DIGITS_EDEFAULT == null ? currencyDigits != null : !CURRENCY_DIGITS_EDEFAULT.equals(currencyDigits);
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL:
				return CURRENCY_SYMBOL_EDEFAULT == null ? currencySymbol != null : !CURRENCY_SYMBOL_EDEFAULT.equals(currencySymbol);
			case MspdiPackage.PROJECT_TYPE__CURRENCY_CODE:
				return CURRENCY_CODE_EDEFAULT == null ? currencyCode != null : !CURRENCY_CODE_EDEFAULT.equals(currencyCode);
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION:
				return isSetCurrencySymbolPosition();
			case MspdiPackage.PROJECT_TYPE__CALENDAR_UID:
				return CALENDAR_UID_EDEFAULT == null ? calendarUID != null : !CALENDAR_UID_EDEFAULT.equals(calendarUID);
			case MspdiPackage.PROJECT_TYPE__DEFAULT_START_TIME:
				return DEFAULT_START_TIME_EDEFAULT == null ? defaultStartTime != null : !DEFAULT_START_TIME_EDEFAULT.equals(defaultStartTime);
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FINISH_TIME:
				return DEFAULT_FINISH_TIME_EDEFAULT == null ? defaultFinishTime != null : !DEFAULT_FINISH_TIME_EDEFAULT.equals(defaultFinishTime);
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_DAY:
				return MINUTES_PER_DAY_EDEFAULT == null ? minutesPerDay != null : !MINUTES_PER_DAY_EDEFAULT.equals(minutesPerDay);
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_WEEK:
				return MINUTES_PER_WEEK_EDEFAULT == null ? minutesPerWeek != null : !MINUTES_PER_WEEK_EDEFAULT.equals(minutesPerWeek);
			case MspdiPackage.PROJECT_TYPE__DAYS_PER_MONTH:
				return DAYS_PER_MONTH_EDEFAULT == null ? daysPerMonth != null : !DAYS_PER_MONTH_EDEFAULT.equals(daysPerMonth);
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_TYPE:
				return isSetDefaultTaskType();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL:
				return isSetDefaultFixedCostAccrual();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_STANDARD_RATE:
				return isSetDefaultStandardRate();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_OVERTIME_RATE:
				return isSetDefaultOvertimeRate();
			case MspdiPackage.PROJECT_TYPE__DURATION_FORMAT:
				return isSetDurationFormat();
			case MspdiPackage.PROJECT_TYPE__WORK_FORMAT:
				return isSetWorkFormat();
			case MspdiPackage.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS:
				return isSetEditableActualCosts();
			case MspdiPackage.PROJECT_TYPE__HONOR_CONSTRAINTS:
				return isSetHonorConstraints();
			case MspdiPackage.PROJECT_TYPE__EARNED_VALUE_METHOD:
				return isSetEarnedValueMethod();
			case MspdiPackage.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY:
				return isSetInsertedProjectsLikeSummary();
			case MspdiPackage.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS:
				return isSetMultipleCriticalPaths();
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN:
				return isSetNewTasksEffortDriven();
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_ESTIMATED:
				return isSetNewTasksEstimated();
			case MspdiPackage.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS:
				return isSetSplitsInProgressTasks();
			case MspdiPackage.PROJECT_TYPE__SPREAD_ACTUAL_COST:
				return isSetSpreadActualCost();
			case MspdiPackage.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE:
				return isSetSpreadPercentComplete();
			case MspdiPackage.PROJECT_TYPE__TASK_UPDATES_RESOURCE:
				return isSetTaskUpdatesResource();
			case MspdiPackage.PROJECT_TYPE__FISCAL_YEAR_START:
				return isSetFiscalYearStart();
			case MspdiPackage.PROJECT_TYPE__WEEK_START_DAY:
				return isSetWeekStartDay();
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK:
				return isSetMoveCompletedEndsBack();
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK:
				return isSetMoveRemainingStartsBack();
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD:
				return isSetMoveRemainingStartsForward();
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD:
				return isSetMoveCompletedEndsForward();
			case MspdiPackage.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE:
				return isSetBaselineForEarnedValue();
			case MspdiPackage.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS:
				return isSetAutoAddNewResourcesAndTasks();
			case MspdiPackage.PROJECT_TYPE__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case MspdiPackage.PROJECT_TYPE__CURRENT_DATE:
				return CURRENT_DATE_EDEFAULT == null ? currentDate != null : !CURRENT_DATE_EDEFAULT.equals(currentDate);
			case MspdiPackage.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL:
				return isSetMicrosoftProjectServerURL();
			case MspdiPackage.PROJECT_TYPE__AUTOLINK:
				return isSetAutolink();
			case MspdiPackage.PROJECT_TYPE__NEW_TASK_START_DATE:
				return isSetNewTaskStartDate();
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD:
				return isSetDefaultTaskEVMethod();
			case MspdiPackage.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED:
				return isSetProjectExternallyEdited();
			case MspdiPackage.PROJECT_TYPE__EXTENDED_CREATION_DATE:
				return EXTENDED_CREATION_DATE_EDEFAULT == null ? extendedCreationDate != null : !EXTENDED_CREATION_DATE_EDEFAULT.equals(extendedCreationDate);
			case MspdiPackage.PROJECT_TYPE__ACTUALS_IN_SYNC:
				return isSetActualsInSync();
			case MspdiPackage.PROJECT_TYPE__REMOVE_FILE_PROPERTIES:
				return isSetRemoveFileProperties();
			case MspdiPackage.PROJECT_TYPE__ADMIN_PROJECT:
				return isSetAdminProject();
			case MspdiPackage.PROJECT_TYPE__OUTLINE_CODES:
				return outlineCodes != null;
			case MspdiPackage.PROJECT_TYPE__WBS_MASKS:
				return wBSMasks != null;
			case MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES:
				return extendedAttributes != null;
			case MspdiPackage.PROJECT_TYPE__CALENDARS:
				return calendars != null;
			case MspdiPackage.PROJECT_TYPE__TASKS:
				return tasks != null;
			case MspdiPackage.PROJECT_TYPE__RESOURCES:
				return resources != null;
			case MspdiPackage.PROJECT_TYPE__ASSIGNMENTS:
				return assignments != null;
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
		result.append(" (saveVersion: ");
		result.append(saveVersion);
		result.append(", uID: ");
		result.append(uID);
		result.append(", name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", subject: ");
		result.append(subject);
		result.append(", category: ");
		result.append(category);
		result.append(", company: ");
		result.append(company);
		result.append(", manager: ");
		result.append(manager);
		result.append(", author: ");
		result.append(author);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", revision: ");
		result.append(revision);
		result.append(", lastSaved: ");
		result.append(lastSaved);
		result.append(", scheduleFromStart: ");
		if (scheduleFromStartESet) result.append(scheduleFromStart); else result.append("<unset>");
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", finishDate: ");
		result.append(finishDate);
		result.append(", fYStartDate: ");
		if (fYStartDateESet) result.append(fYStartDate); else result.append("<unset>");
		result.append(", criticalSlackLimit: ");
		result.append(criticalSlackLimit);
		result.append(", currencyDigits: ");
		result.append(currencyDigits);
		result.append(", currencySymbol: ");
		result.append(currencySymbol);
		result.append(", currencyCode: ");
		result.append(currencyCode);
		result.append(", currencySymbolPosition: ");
		if (currencySymbolPositionESet) result.append(currencySymbolPosition); else result.append("<unset>");
		result.append(", calendarUID: ");
		result.append(calendarUID);
		result.append(", defaultStartTime: ");
		result.append(defaultStartTime);
		result.append(", defaultFinishTime: ");
		result.append(defaultFinishTime);
		result.append(", minutesPerDay: ");
		result.append(minutesPerDay);
		result.append(", minutesPerWeek: ");
		result.append(minutesPerWeek);
		result.append(", daysPerMonth: ");
		result.append(daysPerMonth);
		result.append(", defaultTaskType: ");
		if (defaultTaskTypeESet) result.append(defaultTaskType); else result.append("<unset>");
		result.append(", defaultFixedCostAccrual: ");
		if (defaultFixedCostAccrualESet) result.append(defaultFixedCostAccrual); else result.append("<unset>");
		result.append(", defaultStandardRate: ");
		if (defaultStandardRateESet) result.append(defaultStandardRate); else result.append("<unset>");
		result.append(", defaultOvertimeRate: ");
		if (defaultOvertimeRateESet) result.append(defaultOvertimeRate); else result.append("<unset>");
		result.append(", durationFormat: ");
		if (durationFormatESet) result.append(durationFormat); else result.append("<unset>");
		result.append(", workFormat: ");
		if (workFormatESet) result.append(workFormat); else result.append("<unset>");
		result.append(", editableActualCosts: ");
		if (editableActualCostsESet) result.append(editableActualCosts); else result.append("<unset>");
		result.append(", honorConstraints: ");
		if (honorConstraintsESet) result.append(honorConstraints); else result.append("<unset>");
		result.append(", earnedValueMethod: ");
		if (earnedValueMethodESet) result.append(earnedValueMethod); else result.append("<unset>");
		result.append(", insertedProjectsLikeSummary: ");
		if (insertedProjectsLikeSummaryESet) result.append(insertedProjectsLikeSummary); else result.append("<unset>");
		result.append(", multipleCriticalPaths: ");
		if (multipleCriticalPathsESet) result.append(multipleCriticalPaths); else result.append("<unset>");
		result.append(", newTasksEffortDriven: ");
		if (newTasksEffortDrivenESet) result.append(newTasksEffortDriven); else result.append("<unset>");
		result.append(", newTasksEstimated: ");
		if (newTasksEstimatedESet) result.append(newTasksEstimated); else result.append("<unset>");
		result.append(", splitsInProgressTasks: ");
		if (splitsInProgressTasksESet) result.append(splitsInProgressTasks); else result.append("<unset>");
		result.append(", spreadActualCost: ");
		if (spreadActualCostESet) result.append(spreadActualCost); else result.append("<unset>");
		result.append(", spreadPercentComplete: ");
		if (spreadPercentCompleteESet) result.append(spreadPercentComplete); else result.append("<unset>");
		result.append(", taskUpdatesResource: ");
		if (taskUpdatesResourceESet) result.append(taskUpdatesResource); else result.append("<unset>");
		result.append(", fiscalYearStart: ");
		if (fiscalYearStartESet) result.append(fiscalYearStart); else result.append("<unset>");
		result.append(", weekStartDay: ");
		if (weekStartDayESet) result.append(weekStartDay); else result.append("<unset>");
		result.append(", moveCompletedEndsBack: ");
		if (moveCompletedEndsBackESet) result.append(moveCompletedEndsBack); else result.append("<unset>");
		result.append(", moveRemainingStartsBack: ");
		if (moveRemainingStartsBackESet) result.append(moveRemainingStartsBack); else result.append("<unset>");
		result.append(", moveRemainingStartsForward: ");
		if (moveRemainingStartsForwardESet) result.append(moveRemainingStartsForward); else result.append("<unset>");
		result.append(", moveCompletedEndsForward: ");
		if (moveCompletedEndsForwardESet) result.append(moveCompletedEndsForward); else result.append("<unset>");
		result.append(", baselineForEarnedValue: ");
		if (baselineForEarnedValueESet) result.append(baselineForEarnedValue); else result.append("<unset>");
		result.append(", autoAddNewResourcesAndTasks: ");
		if (autoAddNewResourcesAndTasksESet) result.append(autoAddNewResourcesAndTasks); else result.append("<unset>");
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(", currentDate: ");
		result.append(currentDate);
		result.append(", microsoftProjectServerURL: ");
		if (microsoftProjectServerURLESet) result.append(microsoftProjectServerURL); else result.append("<unset>");
		result.append(", autolink: ");
		if (autolinkESet) result.append(autolink); else result.append("<unset>");
		result.append(", newTaskStartDate: ");
		if (newTaskStartDateESet) result.append(newTaskStartDate); else result.append("<unset>");
		result.append(", defaultTaskEVMethod: ");
		if (defaultTaskEVMethodESet) result.append(defaultTaskEVMethod); else result.append("<unset>");
		result.append(", projectExternallyEdited: ");
		if (projectExternallyEditedESet) result.append(projectExternallyEdited); else result.append("<unset>");
		result.append(", extendedCreationDate: ");
		result.append(extendedCreationDate);
		result.append(", actualsInSync: ");
		if (actualsInSyncESet) result.append(actualsInSync); else result.append("<unset>");
		result.append(", removeFileProperties: ");
		if (removeFilePropertiesESet) result.append(removeFileProperties); else result.append("<unset>");
		result.append(", adminProject: ");
		if (adminProjectESet) result.append(adminProject); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProjectTypeImpl
