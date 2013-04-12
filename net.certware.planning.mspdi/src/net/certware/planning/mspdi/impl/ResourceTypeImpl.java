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

import net.certware.planning.mspdi.AccrueAtType;
import net.certware.planning.mspdi.AvailabilityPeriodsType;
import net.certware.planning.mspdi.BaselineType1;
import net.certware.planning.mspdi.BookingTypeType1;
import net.certware.planning.mspdi.ExtendedAttributeType1;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.OutlineCodeType1;
import net.certware.planning.mspdi.OvertimeRateFormatType1;
import net.certware.planning.mspdi.RatesType;
import net.certware.planning.mspdi.ResourceType;
import net.certware.planning.mspdi.StandardRateFormatType1;
import net.certware.planning.mspdi.TimephasedDataType;
import net.certware.planning.mspdi.TypeType2;
import net.certware.planning.mspdi.WorkGroupType;

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
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getInitials <em>Initials</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getPhonetics <em>Phonetics</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getNTAccount <em>NT Account</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getMaterialLabel <em>Material Label</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getWorkGroup <em>Work Group</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getHyperlinkAddress <em>Hyperlink Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getHyperlinkSubAddress <em>Hyperlink Sub Address</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getMaxUnits <em>Max Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getPeakUnits <em>Peak Units</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isOverAllocated <em>Over Allocated</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getAvailableFrom <em>Available From</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getAvailableTo <em>Available To</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isCanLevel <em>Can Level</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getAccrueAt <em>Accrue At</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getRegularWork <em>Regular Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getOvertimeWork <em>Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getActualWork <em>Actual Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getRemainingWork <em>Remaining Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getActualOvertimeWork <em>Actual Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getRemainingOvertimeWork <em>Remaining Overtime Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getPercentWorkComplete <em>Percent Work Complete</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getStandardRate <em>Standard Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getStandardRateFormat <em>Standard Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getOvertimeRate <em>Overtime Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getOvertimeRateFormat <em>Overtime Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getOvertimeCost <em>Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getCostPerUse <em>Cost Per Use</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getActualOvertimeCost <em>Actual Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getRemainingCost <em>Remaining Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getRemainingOvertimeCost <em>Remaining Overtime Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getWorkVariance <em>Work Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getCostVariance <em>Cost Variance</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getSV <em>SV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getCV <em>CV</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getACWP <em>ACWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getCalendarUID <em>Calendar UID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isIsGeneric <em>Is Generic</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isIsInactive <em>Is Inactive</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isIsEnterprise <em>Is Enterprise</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getBookingType <em>Booking Type</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getActualWorkProtected <em>Actual Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getActualOvertimeWorkProtected <em>Actual Overtime Work Protected</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getActiveDirectoryGUID <em>Active Directory GUID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getExtendedAttribute <em>Extended Attribute</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getOutlineCode <em>Outline Code</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isIsCostResource <em>Is Cost Resource</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getAssnOwner <em>Assn Owner</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getAssnOwnerGuid <em>Assn Owner Guid</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#isIsBudget <em>Is Budget</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getAvailabilityPeriods <em>Availability Periods</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getRates <em>Rates</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ResourceTypeImpl#getTimephasedData <em>Timephased Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceTypeImpl extends EObjectImpl implements ResourceType {
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
	protected static final TypeType2 TYPE_EDEFAULT = TypeType2._0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType2 type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getInitials() <em>Initials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitials() <em>Initials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected String initials = INITIALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhonetics() <em>Phonetics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhonetics()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONETICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhonetics() <em>Phonetics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhonetics()
	 * @generated
	 * @ordered
	 */
	protected String phonetics = PHONETICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNTAccount() <em>NT Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String NT_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNTAccount() <em>NT Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTAccount()
	 * @generated
	 * @ordered
	 */
	protected String nTAccount = NT_ACCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterialLabel() <em>Material Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIAL_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaterialLabel() <em>Material Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialLabel()
	 * @generated
	 * @ordered
	 */
	protected String materialLabel = MATERIAL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkGroup() <em>Work Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkGroup()
	 * @generated
	 * @ordered
	 */
	protected static final WorkGroupType WORK_GROUP_EDEFAULT = WorkGroupType._0;

	/**
	 * The cached value of the '{@link #getWorkGroup() <em>Work Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkGroup()
	 * @generated
	 * @ordered
	 */
	protected WorkGroupType workGroup = WORK_GROUP_EDEFAULT;

	/**
	 * This is true if the Work Group attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workGroupESet;

	/**
	 * The default value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected String emailAddress = EMAIL_ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getMaxUnits() <em>Max Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnits()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_UNITS_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getMaxUnits() <em>Max Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnits()
	 * @generated
	 * @ordered
	 */
	protected float maxUnits = MAX_UNITS_EDEFAULT;

	/**
	 * This is true if the Max Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxUnitsESet;

	/**
	 * The default value of the '{@link #getPeakUnits() <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakUnits()
	 * @generated
	 * @ordered
	 */
	protected static final float PEAK_UNITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPeakUnits() <em>Peak Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakUnits()
	 * @generated
	 * @ordered
	 */
	protected float peakUnits = PEAK_UNITS_EDEFAULT;

	/**
	 * This is true if the Peak Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean peakUnitsESet;

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
	 * The default value of the '{@link #getAvailableFrom() <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFrom()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AVAILABLE_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableFrom() <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFrom()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar availableFrom = AVAILABLE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableTo() <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTo()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AVAILABLE_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableTo() <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTo()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar availableTo = AVAILABLE_TO_EDEFAULT;

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
	 * The default value of the '{@link #isCanLevel() <em>Can Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanLevel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_LEVEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanLevel() <em>Can Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanLevel()
	 * @generated
	 * @ordered
	 */
	protected boolean canLevel = CAN_LEVEL_EDEFAULT;

	/**
	 * This is true if the Can Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean canLevelESet;

	/**
	 * The default value of the '{@link #getAccrueAt() <em>Accrue At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccrueAt()
	 * @generated
	 * @ordered
	 */
	protected static final AccrueAtType ACCRUE_AT_EDEFAULT = AccrueAtType._1;

	/**
	 * The cached value of the '{@link #getAccrueAt() <em>Accrue At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccrueAt()
	 * @generated
	 * @ordered
	 */
	protected AccrueAtType accrueAt = ACCRUE_AT_EDEFAULT;

	/**
	 * This is true if the Accrue At attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accrueAtESet;

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
	 * The default value of the '{@link #getStandardRate() <em>Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STANDARD_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardRate() <em>Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRate()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal standardRate = STANDARD_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardRateFormat() <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final StandardRateFormatType1 STANDARD_RATE_FORMAT_EDEFAULT = StandardRateFormatType1._1;

	/**
	 * The cached value of the '{@link #getStandardRateFormat() <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRateFormat()
	 * @generated
	 * @ordered
	 */
	protected StandardRateFormatType1 standardRateFormat = STANDARD_RATE_FORMAT_EDEFAULT;

	/**
	 * This is true if the Standard Rate Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean standardRateFormatESet;

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
	 * The default value of the '{@link #getOvertimeRate() <em>Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OVERTIME_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvertimeRate() <em>Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRate()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal overtimeRate = OVERTIME_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvertimeRateFormat() <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final OvertimeRateFormatType1 OVERTIME_RATE_FORMAT_EDEFAULT = OvertimeRateFormatType1._1;

	/**
	 * The cached value of the '{@link #getOvertimeRateFormat() <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRateFormat()
	 * @generated
	 * @ordered
	 */
	protected OvertimeRateFormatType1 overtimeRateFormat = OVERTIME_RATE_FORMAT_EDEFAULT;

	/**
	 * This is true if the Overtime Rate Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overtimeRateFormatESet;

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
	 * The default value of the '{@link #getCostPerUse() <em>Cost Per Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUse()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COST_PER_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostPerUse() <em>Cost Per Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUse()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal costPerUse = COST_PER_USE_EDEFAULT;

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
	 * The default value of the '{@link #getCostVariance() <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostVariance()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_VARIANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostVariance() <em>Cost Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostVariance()
	 * @generated
	 * @ordered
	 */
	protected float costVariance = COST_VARIANCE_EDEFAULT;

	/**
	 * This is true if the Cost Variance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costVarianceESet;

	/**
	 * The default value of the '{@link #getSV() <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSV()
	 * @generated
	 * @ordered
	 */
	protected static final float SV_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSV() <em>SV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSV()
	 * @generated
	 * @ordered
	 */
	protected float sV = SV_EDEFAULT;

	/**
	 * This is true if the SV attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sVESet;

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
	 * The default value of the '{@link #isIsGeneric() <em>Is Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGeneric()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GENERIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGeneric() <em>Is Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGeneric()
	 * @generated
	 * @ordered
	 */
	protected boolean isGeneric = IS_GENERIC_EDEFAULT;

	/**
	 * This is true if the Is Generic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isGenericESet;

	/**
	 * The default value of the '{@link #isIsInactive() <em>Is Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInactive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInactive() <em>Is Inactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInactive()
	 * @generated
	 * @ordered
	 */
	protected boolean isInactive = IS_INACTIVE_EDEFAULT;

	/**
	 * This is true if the Is Inactive attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInactiveESet;

	/**
	 * The default value of the '{@link #isIsEnterprise() <em>Is Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnterprise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENTERPRISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnterprise() <em>Is Enterprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnterprise()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnterprise = IS_ENTERPRISE_EDEFAULT;

	/**
	 * This is true if the Is Enterprise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isEnterpriseESet;

	/**
	 * The default value of the '{@link #getBookingType() <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingType()
	 * @generated
	 * @ordered
	 */
	protected static final BookingTypeType1 BOOKING_TYPE_EDEFAULT = BookingTypeType1._0;

	/**
	 * The cached value of the '{@link #getBookingType() <em>Booking Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingType()
	 * @generated
	 * @ordered
	 */
	protected BookingTypeType1 bookingType = BOOKING_TYPE_EDEFAULT;

	/**
	 * This is true if the Booking Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bookingTypeESet;

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
	 * The default value of the '{@link #getActiveDirectoryGUID() <em>Active Directory GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveDirectoryGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_DIRECTORY_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveDirectoryGUID() <em>Active Directory GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveDirectoryGUID()
	 * @generated
	 * @ordered
	 */
	protected String activeDirectoryGUID = ACTIVE_DIRECTORY_GUID_EDEFAULT;

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
	 * The cached value of the '{@link #getExtendedAttribute() <em>Extended Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedAttributeType1> extendedAttribute;

	/**
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected EList<BaselineType1> baseline;

	/**
	 * The cached value of the '{@link #getOutlineCode() <em>Outline Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineCode()
	 * @generated
	 * @ordered
	 */
	protected EList<OutlineCodeType1> outlineCode;

	/**
	 * The default value of the '{@link #isIsCostResource() <em>Is Cost Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCostResource()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COST_RESOURCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCostResource() <em>Is Cost Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCostResource()
	 * @generated
	 * @ordered
	 */
	protected boolean isCostResource = IS_COST_RESOURCE_EDEFAULT;

	/**
	 * This is true if the Is Cost Resource attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCostResourceESet;

	/**
	 * The default value of the '{@link #getAssnOwner() <em>Assn Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSN_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssnOwner() <em>Assn Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwner()
	 * @generated
	 * @ordered
	 */
	protected String assnOwner = ASSN_OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssnOwnerGuid() <em>Assn Owner Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwnerGuid()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSN_OWNER_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssnOwnerGuid() <em>Assn Owner Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssnOwnerGuid()
	 * @generated
	 * @ordered
	 */
	protected String assnOwnerGuid = ASSN_OWNER_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBudget() <em>Is Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBudget()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BUDGET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBudget() <em>Is Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBudget()
	 * @generated
	 * @ordered
	 */
	protected boolean isBudget = IS_BUDGET_EDEFAULT;

	/**
	 * This is true if the Is Budget attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBudgetESet;

	/**
	 * The cached value of the '{@link #getAvailabilityPeriods() <em>Availability Periods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityPeriods()
	 * @generated
	 * @ordered
	 */
	protected AvailabilityPeriodsType availabilityPeriods;

	/**
	 * The cached value of the '{@link #getRates() <em>Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRates()
	 * @generated
	 * @ordered
	 */
	protected RatesType rates;

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
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.RESOURCE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__UID, oldUID, uID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType2 newType) {
		TypeType2 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType2 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__IS_NULL, oldIsNull, isNull, !oldIsNullESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__IS_NULL, oldIsNull, IS_NULL_EDEFAULT, oldIsNullESet));
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
	public String getInitials() {
		return initials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitials(String newInitials) {
		String oldInitials = initials;
		initials = newInitials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__INITIALS, oldInitials, initials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhonetics() {
		return phonetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhonetics(String newPhonetics) {
		String oldPhonetics = phonetics;
		phonetics = newPhonetics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__PHONETICS, oldPhonetics, phonetics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNTAccount() {
		return nTAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNTAccount(String newNTAccount) {
		String oldNTAccount = nTAccount;
		nTAccount = newNTAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__NT_ACCOUNT, oldNTAccount, nTAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaterialLabel() {
		return materialLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialLabel(String newMaterialLabel) {
		String oldMaterialLabel = materialLabel;
		materialLabel = newMaterialLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__MATERIAL_LABEL, oldMaterialLabel, materialLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkGroupType getWorkGroup() {
		return workGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkGroup(WorkGroupType newWorkGroup) {
		WorkGroupType oldWorkGroup = workGroup;
		workGroup = newWorkGroup == null ? WORK_GROUP_EDEFAULT : newWorkGroup;
		boolean oldWorkGroupESet = workGroupESet;
		workGroupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__WORK_GROUP, oldWorkGroup, workGroup, !oldWorkGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkGroup() {
		WorkGroupType oldWorkGroup = workGroup;
		boolean oldWorkGroupESet = workGroupESet;
		workGroup = WORK_GROUP_EDEFAULT;
		workGroupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__WORK_GROUP, oldWorkGroup, WORK_GROUP_EDEFAULT, oldWorkGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkGroup() {
		return workGroupESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailAddress(String newEmailAddress) {
		String oldEmailAddress = emailAddress;
		emailAddress = newEmailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__EMAIL_ADDRESS, oldEmailAddress, emailAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__HYPERLINK, oldHyperlink, hyperlink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__HYPERLINK_ADDRESS, oldHyperlinkAddress, hyperlinkAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS, oldHyperlinkSubAddress, hyperlinkSubAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxUnits() {
		return maxUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUnits(float newMaxUnits) {
		float oldMaxUnits = maxUnits;
		maxUnits = newMaxUnits;
		boolean oldMaxUnitsESet = maxUnitsESet;
		maxUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__MAX_UNITS, oldMaxUnits, maxUnits, !oldMaxUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxUnits() {
		float oldMaxUnits = maxUnits;
		boolean oldMaxUnitsESet = maxUnitsESet;
		maxUnits = MAX_UNITS_EDEFAULT;
		maxUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__MAX_UNITS, oldMaxUnits, MAX_UNITS_EDEFAULT, oldMaxUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxUnits() {
		return maxUnitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPeakUnits() {
		return peakUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeakUnits(float newPeakUnits) {
		float oldPeakUnits = peakUnits;
		peakUnits = newPeakUnits;
		boolean oldPeakUnitsESet = peakUnitsESet;
		peakUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__PEAK_UNITS, oldPeakUnits, peakUnits, !oldPeakUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeakUnits() {
		float oldPeakUnits = peakUnits;
		boolean oldPeakUnitsESet = peakUnitsESet;
		peakUnits = PEAK_UNITS_EDEFAULT;
		peakUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__PEAK_UNITS, oldPeakUnits, PEAK_UNITS_EDEFAULT, oldPeakUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeakUnits() {
		return peakUnitsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__OVER_ALLOCATED, oldOverAllocated, overAllocated, !oldOverAllocatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__OVER_ALLOCATED, oldOverAllocated, OVER_ALLOCATED_EDEFAULT, oldOverAllocatedESet));
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
	public XMLGregorianCalendar getAvailableFrom() {
		return availableFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableFrom(XMLGregorianCalendar newAvailableFrom) {
		XMLGregorianCalendar oldAvailableFrom = availableFrom;
		availableFrom = newAvailableFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__AVAILABLE_FROM, oldAvailableFrom, availableFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAvailableTo() {
		return availableTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableTo(XMLGregorianCalendar newAvailableTo) {
		XMLGregorianCalendar oldAvailableTo = availableTo;
		availableTo = newAvailableTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__AVAILABLE_TO, oldAvailableTo, availableTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanLevel() {
		return canLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanLevel(boolean newCanLevel) {
		boolean oldCanLevel = canLevel;
		canLevel = newCanLevel;
		boolean oldCanLevelESet = canLevelESet;
		canLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__CAN_LEVEL, oldCanLevel, canLevel, !oldCanLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCanLevel() {
		boolean oldCanLevel = canLevel;
		boolean oldCanLevelESet = canLevelESet;
		canLevel = CAN_LEVEL_EDEFAULT;
		canLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__CAN_LEVEL, oldCanLevel, CAN_LEVEL_EDEFAULT, oldCanLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCanLevel() {
		return canLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccrueAtType getAccrueAt() {
		return accrueAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccrueAt(AccrueAtType newAccrueAt) {
		AccrueAtType oldAccrueAt = accrueAt;
		accrueAt = newAccrueAt == null ? ACCRUE_AT_EDEFAULT : newAccrueAt;
		boolean oldAccrueAtESet = accrueAtESet;
		accrueAtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACCRUE_AT, oldAccrueAt, accrueAt, !oldAccrueAtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccrueAt() {
		AccrueAtType oldAccrueAt = accrueAt;
		boolean oldAccrueAtESet = accrueAtESet;
		accrueAt = ACCRUE_AT_EDEFAULT;
		accrueAtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__ACCRUE_AT, oldAccrueAt, ACCRUE_AT_EDEFAULT, oldAccrueAtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccrueAt() {
		return accrueAtESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__WORK, oldWork, work));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__REGULAR_WORK, oldRegularWork, regularWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__OVERTIME_WORK, oldOvertimeWork, overtimeWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK, oldActualWork, actualWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__REMAINING_WORK, oldRemainingWork, remainingWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK, oldActualOvertimeWork, actualOvertimeWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_WORK, oldRemainingOvertimeWork, remainingOvertimeWork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__PERCENT_WORK_COMPLETE, oldPercentWorkComplete, percentWorkComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getStandardRate() {
		return standardRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRate(BigDecimal newStandardRate) {
		BigDecimal oldStandardRate = standardRate;
		standardRate = newStandardRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__STANDARD_RATE, oldStandardRate, standardRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRateFormatType1 getStandardRateFormat() {
		return standardRateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRateFormat(StandardRateFormatType1 newStandardRateFormat) {
		StandardRateFormatType1 oldStandardRateFormat = standardRateFormat;
		standardRateFormat = newStandardRateFormat == null ? STANDARD_RATE_FORMAT_EDEFAULT : newStandardRateFormat;
		boolean oldStandardRateFormatESet = standardRateFormatESet;
		standardRateFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__STANDARD_RATE_FORMAT, oldStandardRateFormat, standardRateFormat, !oldStandardRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStandardRateFormat() {
		StandardRateFormatType1 oldStandardRateFormat = standardRateFormat;
		boolean oldStandardRateFormatESet = standardRateFormatESet;
		standardRateFormat = STANDARD_RATE_FORMAT_EDEFAULT;
		standardRateFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__STANDARD_RATE_FORMAT, oldStandardRateFormat, STANDARD_RATE_FORMAT_EDEFAULT, oldStandardRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStandardRateFormat() {
		return standardRateFormatESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOvertimeRate() {
		return overtimeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeRate(BigDecimal newOvertimeRate) {
		BigDecimal oldOvertimeRate = overtimeRate;
		overtimeRate = newOvertimeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE, oldOvertimeRate, overtimeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OvertimeRateFormatType1 getOvertimeRateFormat() {
		return overtimeRateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeRateFormat(OvertimeRateFormatType1 newOvertimeRateFormat) {
		OvertimeRateFormatType1 oldOvertimeRateFormat = overtimeRateFormat;
		overtimeRateFormat = newOvertimeRateFormat == null ? OVERTIME_RATE_FORMAT_EDEFAULT : newOvertimeRateFormat;
		boolean oldOvertimeRateFormatESet = overtimeRateFormatESet;
		overtimeRateFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE_FORMAT, oldOvertimeRateFormat, overtimeRateFormat, !oldOvertimeRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOvertimeRateFormat() {
		OvertimeRateFormatType1 oldOvertimeRateFormat = overtimeRateFormat;
		boolean oldOvertimeRateFormatESet = overtimeRateFormatESet;
		overtimeRateFormat = OVERTIME_RATE_FORMAT_EDEFAULT;
		overtimeRateFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE_FORMAT, oldOvertimeRateFormat, OVERTIME_RATE_FORMAT_EDEFAULT, oldOvertimeRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOvertimeRateFormat() {
		return overtimeRateFormatESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__OVERTIME_COST, oldOvertimeCost, overtimeCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCostPerUse() {
		return costPerUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerUse(BigDecimal newCostPerUse) {
		BigDecimal oldCostPerUse = costPerUse;
		costPerUse = newCostPerUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__COST_PER_USE, oldCostPerUse, costPerUse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACTUAL_COST, oldActualCost, actualCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_COST, oldActualOvertimeCost, actualOvertimeCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__REMAINING_COST, oldRemainingCost, remainingCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_COST, oldRemainingOvertimeCost, remainingOvertimeCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__WORK_VARIANCE, oldWorkVariance, workVariance, !oldWorkVarianceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__WORK_VARIANCE, oldWorkVariance, WORK_VARIANCE_EDEFAULT, oldWorkVarianceESet));
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
	public float getCostVariance() {
		return costVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostVariance(float newCostVariance) {
		float oldCostVariance = costVariance;
		costVariance = newCostVariance;
		boolean oldCostVarianceESet = costVarianceESet;
		costVarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__COST_VARIANCE, oldCostVariance, costVariance, !oldCostVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCostVariance() {
		float oldCostVariance = costVariance;
		boolean oldCostVarianceESet = costVarianceESet;
		costVariance = COST_VARIANCE_EDEFAULT;
		costVarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__COST_VARIANCE, oldCostVariance, COST_VARIANCE_EDEFAULT, oldCostVarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCostVariance() {
		return costVarianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSV() {
		return sV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSV(float newSV) {
		float oldSV = sV;
		sV = newSV;
		boolean oldSVESet = sVESet;
		sVESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__SV, oldSV, sV, !oldSVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSV() {
		float oldSV = sV;
		boolean oldSVESet = sVESet;
		sV = SV_EDEFAULT;
		sVESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__SV, oldSV, SV_EDEFAULT, oldSVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSV() {
		return sVESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__CV, oldCV, cV, !oldCVESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__CV, oldCV, CV_EDEFAULT, oldCVESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACWP, oldACWP, aCWP, !oldACWPESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__ACWP, oldACWP, ACWP_EDEFAULT, oldACWPESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__CALENDAR_UID, oldCalendarUID, calendarUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__NOTES, oldNotes, notes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__BCWS, oldBCWS, bCWS, !oldBCWSESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__BCWS, oldBCWS, BCWS_EDEFAULT, oldBCWSESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__BCWP, oldBCWP, bCWP, !oldBCWPESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__BCWP, oldBCWP, BCWP_EDEFAULT, oldBCWPESet));
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
	public boolean isIsGeneric() {
		return isGeneric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGeneric(boolean newIsGeneric) {
		boolean oldIsGeneric = isGeneric;
		isGeneric = newIsGeneric;
		boolean oldIsGenericESet = isGenericESet;
		isGenericESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__IS_GENERIC, oldIsGeneric, isGeneric, !oldIsGenericESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsGeneric() {
		boolean oldIsGeneric = isGeneric;
		boolean oldIsGenericESet = isGenericESet;
		isGeneric = IS_GENERIC_EDEFAULT;
		isGenericESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__IS_GENERIC, oldIsGeneric, IS_GENERIC_EDEFAULT, oldIsGenericESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsGeneric() {
		return isGenericESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInactive() {
		return isInactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInactive(boolean newIsInactive) {
		boolean oldIsInactive = isInactive;
		isInactive = newIsInactive;
		boolean oldIsInactiveESet = isInactiveESet;
		isInactiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__IS_INACTIVE, oldIsInactive, isInactive, !oldIsInactiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsInactive() {
		boolean oldIsInactive = isInactive;
		boolean oldIsInactiveESet = isInactiveESet;
		isInactive = IS_INACTIVE_EDEFAULT;
		isInactiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__IS_INACTIVE, oldIsInactive, IS_INACTIVE_EDEFAULT, oldIsInactiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsInactive() {
		return isInactiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnterprise() {
		return isEnterprise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnterprise(boolean newIsEnterprise) {
		boolean oldIsEnterprise = isEnterprise;
		isEnterprise = newIsEnterprise;
		boolean oldIsEnterpriseESet = isEnterpriseESet;
		isEnterpriseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__IS_ENTERPRISE, oldIsEnterprise, isEnterprise, !oldIsEnterpriseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsEnterprise() {
		boolean oldIsEnterprise = isEnterprise;
		boolean oldIsEnterpriseESet = isEnterpriseESet;
		isEnterprise = IS_ENTERPRISE_EDEFAULT;
		isEnterpriseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__IS_ENTERPRISE, oldIsEnterprise, IS_ENTERPRISE_EDEFAULT, oldIsEnterpriseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsEnterprise() {
		return isEnterpriseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingTypeType1 getBookingType() {
		return bookingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingType(BookingTypeType1 newBookingType) {
		BookingTypeType1 oldBookingType = bookingType;
		bookingType = newBookingType == null ? BOOKING_TYPE_EDEFAULT : newBookingType;
		boolean oldBookingTypeESet = bookingTypeESet;
		bookingTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__BOOKING_TYPE, oldBookingType, bookingType, !oldBookingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBookingType() {
		BookingTypeType1 oldBookingType = bookingType;
		boolean oldBookingTypeESet = bookingTypeESet;
		bookingType = BOOKING_TYPE_EDEFAULT;
		bookingTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__BOOKING_TYPE, oldBookingType, BOOKING_TYPE_EDEFAULT, oldBookingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBookingType() {
		return bookingTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK_PROTECTED, oldActualWorkProtected, actualWorkProtected));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED, oldActualOvertimeWorkProtected, actualOvertimeWorkProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiveDirectoryGUID() {
		return activeDirectoryGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveDirectoryGUID(String newActiveDirectoryGUID) {
		String oldActiveDirectoryGUID = activeDirectoryGUID;
		activeDirectoryGUID = newActiveDirectoryGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID, oldActiveDirectoryGUID, activeDirectoryGUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedAttributeType1> getExtendedAttribute() {
		if (extendedAttribute == null) {
			extendedAttribute = new EObjectContainmentEList<ExtendedAttributeType1>(ExtendedAttributeType1.class, this, MspdiPackage.RESOURCE_TYPE__EXTENDED_ATTRIBUTE);
		}
		return extendedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaselineType1> getBaseline() {
		if (baseline == null) {
			baseline = new EObjectContainmentEList<BaselineType1>(BaselineType1.class, this, MspdiPackage.RESOURCE_TYPE__BASELINE);
		}
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutlineCodeType1> getOutlineCode() {
		if (outlineCode == null) {
			outlineCode = new EObjectContainmentEList<OutlineCodeType1>(OutlineCodeType1.class, this, MspdiPackage.RESOURCE_TYPE__OUTLINE_CODE);
		}
		return outlineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCostResource() {
		return isCostResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCostResource(boolean newIsCostResource) {
		boolean oldIsCostResource = isCostResource;
		isCostResource = newIsCostResource;
		boolean oldIsCostResourceESet = isCostResourceESet;
		isCostResourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__IS_COST_RESOURCE, oldIsCostResource, isCostResource, !oldIsCostResourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCostResource() {
		boolean oldIsCostResource = isCostResource;
		boolean oldIsCostResourceESet = isCostResourceESet;
		isCostResource = IS_COST_RESOURCE_EDEFAULT;
		isCostResourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__IS_COST_RESOURCE, oldIsCostResource, IS_COST_RESOURCE_EDEFAULT, oldIsCostResourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCostResource() {
		return isCostResourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssnOwner() {
		return assnOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssnOwner(String newAssnOwner) {
		String oldAssnOwner = assnOwner;
		assnOwner = newAssnOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ASSN_OWNER, oldAssnOwner, assnOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssnOwnerGuid() {
		return assnOwnerGuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssnOwnerGuid(String newAssnOwnerGuid) {
		String oldAssnOwnerGuid = assnOwnerGuid;
		assnOwnerGuid = newAssnOwnerGuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__ASSN_OWNER_GUID, oldAssnOwnerGuid, assnOwnerGuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBudget() {
		return isBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBudget(boolean newIsBudget) {
		boolean oldIsBudget = isBudget;
		isBudget = newIsBudget;
		boolean oldIsBudgetESet = isBudgetESet;
		isBudgetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__IS_BUDGET, oldIsBudget, isBudget, !oldIsBudgetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsBudget() {
		boolean oldIsBudget = isBudget;
		boolean oldIsBudgetESet = isBudgetESet;
		isBudget = IS_BUDGET_EDEFAULT;
		isBudgetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RESOURCE_TYPE__IS_BUDGET, oldIsBudget, IS_BUDGET_EDEFAULT, oldIsBudgetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsBudget() {
		return isBudgetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityPeriodsType getAvailabilityPeriods() {
		return availabilityPeriods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityPeriods(AvailabilityPeriodsType newAvailabilityPeriods, NotificationChain msgs) {
		AvailabilityPeriodsType oldAvailabilityPeriods = availabilityPeriods;
		availabilityPeriods = newAvailabilityPeriods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS, oldAvailabilityPeriods, newAvailabilityPeriods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityPeriods(AvailabilityPeriodsType newAvailabilityPeriods) {
		if (newAvailabilityPeriods != availabilityPeriods) {
			NotificationChain msgs = null;
			if (availabilityPeriods != null)
				msgs = ((InternalEObject)availabilityPeriods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS, null, msgs);
			if (newAvailabilityPeriods != null)
				msgs = ((InternalEObject)newAvailabilityPeriods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS, null, msgs);
			msgs = basicSetAvailabilityPeriods(newAvailabilityPeriods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS, newAvailabilityPeriods, newAvailabilityPeriods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatesType getRates() {
		return rates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRates(RatesType newRates, NotificationChain msgs) {
		RatesType oldRates = rates;
		rates = newRates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__RATES, oldRates, newRates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRates(RatesType newRates) {
		if (newRates != rates) {
			NotificationChain msgs = null;
			if (rates != null)
				msgs = ((InternalEObject)rates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.RESOURCE_TYPE__RATES, null, msgs);
			if (newRates != null)
				msgs = ((InternalEObject)newRates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MspdiPackage.RESOURCE_TYPE__RATES, null, msgs);
			msgs = basicSetRates(newRates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RESOURCE_TYPE__RATES, newRates, newRates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimephasedDataType> getTimephasedData() {
		if (timephasedData == null) {
			timephasedData = new EObjectContainmentEList<TimephasedDataType>(TimephasedDataType.class, this, MspdiPackage.RESOURCE_TYPE__TIMEPHASED_DATA);
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
			case MspdiPackage.RESOURCE_TYPE__EXTENDED_ATTRIBUTE:
				return ((InternalEList<?>)getExtendedAttribute()).basicRemove(otherEnd, msgs);
			case MspdiPackage.RESOURCE_TYPE__BASELINE:
				return ((InternalEList<?>)getBaseline()).basicRemove(otherEnd, msgs);
			case MspdiPackage.RESOURCE_TYPE__OUTLINE_CODE:
				return ((InternalEList<?>)getOutlineCode()).basicRemove(otherEnd, msgs);
			case MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS:
				return basicSetAvailabilityPeriods(null, msgs);
			case MspdiPackage.RESOURCE_TYPE__RATES:
				return basicSetRates(null, msgs);
			case MspdiPackage.RESOURCE_TYPE__TIMEPHASED_DATA:
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
			case MspdiPackage.RESOURCE_TYPE__UID:
				return getUID();
			case MspdiPackage.RESOURCE_TYPE__ID:
				return getID();
			case MspdiPackage.RESOURCE_TYPE__NAME:
				return getName();
			case MspdiPackage.RESOURCE_TYPE__TYPE:
				return getType();
			case MspdiPackage.RESOURCE_TYPE__IS_NULL:
				return isIsNull();
			case MspdiPackage.RESOURCE_TYPE__INITIALS:
				return getInitials();
			case MspdiPackage.RESOURCE_TYPE__PHONETICS:
				return getPhonetics();
			case MspdiPackage.RESOURCE_TYPE__NT_ACCOUNT:
				return getNTAccount();
			case MspdiPackage.RESOURCE_TYPE__MATERIAL_LABEL:
				return getMaterialLabel();
			case MspdiPackage.RESOURCE_TYPE__CODE:
				return getCode();
			case MspdiPackage.RESOURCE_TYPE__GROUP:
				return getGroup();
			case MspdiPackage.RESOURCE_TYPE__WORK_GROUP:
				return getWorkGroup();
			case MspdiPackage.RESOURCE_TYPE__EMAIL_ADDRESS:
				return getEmailAddress();
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK:
				return getHyperlink();
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_ADDRESS:
				return getHyperlinkAddress();
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS:
				return getHyperlinkSubAddress();
			case MspdiPackage.RESOURCE_TYPE__MAX_UNITS:
				return getMaxUnits();
			case MspdiPackage.RESOURCE_TYPE__PEAK_UNITS:
				return getPeakUnits();
			case MspdiPackage.RESOURCE_TYPE__OVER_ALLOCATED:
				return isOverAllocated();
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_FROM:
				return getAvailableFrom();
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_TO:
				return getAvailableTo();
			case MspdiPackage.RESOURCE_TYPE__START:
				return getStart();
			case MspdiPackage.RESOURCE_TYPE__FINISH:
				return getFinish();
			case MspdiPackage.RESOURCE_TYPE__CAN_LEVEL:
				return isCanLevel();
			case MspdiPackage.RESOURCE_TYPE__ACCRUE_AT:
				return getAccrueAt();
			case MspdiPackage.RESOURCE_TYPE__WORK:
				return getWork();
			case MspdiPackage.RESOURCE_TYPE__REGULAR_WORK:
				return getRegularWork();
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_WORK:
				return getOvertimeWork();
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK:
				return getActualWork();
			case MspdiPackage.RESOURCE_TYPE__REMAINING_WORK:
				return getRemainingWork();
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK:
				return getActualOvertimeWork();
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_WORK:
				return getRemainingOvertimeWork();
			case MspdiPackage.RESOURCE_TYPE__PERCENT_WORK_COMPLETE:
				return getPercentWorkComplete();
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE:
				return getStandardRate();
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE_FORMAT:
				return getStandardRateFormat();
			case MspdiPackage.RESOURCE_TYPE__COST:
				return getCost();
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE:
				return getOvertimeRate();
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE_FORMAT:
				return getOvertimeRateFormat();
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_COST:
				return getOvertimeCost();
			case MspdiPackage.RESOURCE_TYPE__COST_PER_USE:
				return getCostPerUse();
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_COST:
				return getActualCost();
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_COST:
				return getActualOvertimeCost();
			case MspdiPackage.RESOURCE_TYPE__REMAINING_COST:
				return getRemainingCost();
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_COST:
				return getRemainingOvertimeCost();
			case MspdiPackage.RESOURCE_TYPE__WORK_VARIANCE:
				return getWorkVariance();
			case MspdiPackage.RESOURCE_TYPE__COST_VARIANCE:
				return getCostVariance();
			case MspdiPackage.RESOURCE_TYPE__SV:
				return getSV();
			case MspdiPackage.RESOURCE_TYPE__CV:
				return getCV();
			case MspdiPackage.RESOURCE_TYPE__ACWP:
				return getACWP();
			case MspdiPackage.RESOURCE_TYPE__CALENDAR_UID:
				return getCalendarUID();
			case MspdiPackage.RESOURCE_TYPE__NOTES:
				return getNotes();
			case MspdiPackage.RESOURCE_TYPE__BCWS:
				return getBCWS();
			case MspdiPackage.RESOURCE_TYPE__BCWP:
				return getBCWP();
			case MspdiPackage.RESOURCE_TYPE__IS_GENERIC:
				return isIsGeneric();
			case MspdiPackage.RESOURCE_TYPE__IS_INACTIVE:
				return isIsInactive();
			case MspdiPackage.RESOURCE_TYPE__IS_ENTERPRISE:
				return isIsEnterprise();
			case MspdiPackage.RESOURCE_TYPE__BOOKING_TYPE:
				return getBookingType();
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK_PROTECTED:
				return getActualWorkProtected();
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				return getActualOvertimeWorkProtected();
			case MspdiPackage.RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID:
				return getActiveDirectoryGUID();
			case MspdiPackage.RESOURCE_TYPE__CREATION_DATE:
				return getCreationDate();
			case MspdiPackage.RESOURCE_TYPE__EXTENDED_ATTRIBUTE:
				return getExtendedAttribute();
			case MspdiPackage.RESOURCE_TYPE__BASELINE:
				return getBaseline();
			case MspdiPackage.RESOURCE_TYPE__OUTLINE_CODE:
				return getOutlineCode();
			case MspdiPackage.RESOURCE_TYPE__IS_COST_RESOURCE:
				return isIsCostResource();
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER:
				return getAssnOwner();
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER_GUID:
				return getAssnOwnerGuid();
			case MspdiPackage.RESOURCE_TYPE__IS_BUDGET:
				return isIsBudget();
			case MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS:
				return getAvailabilityPeriods();
			case MspdiPackage.RESOURCE_TYPE__RATES:
				return getRates();
			case MspdiPackage.RESOURCE_TYPE__TIMEPHASED_DATA:
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
			case MspdiPackage.RESOURCE_TYPE__UID:
				setUID((BigInteger)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ID:
				setID((BigInteger)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__TYPE:
				setType((TypeType2)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_NULL:
				setIsNull((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__INITIALS:
				setInitials((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__PHONETICS:
				setPhonetics((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__NT_ACCOUNT:
				setNTAccount((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__MATERIAL_LABEL:
				setMaterialLabel((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__CODE:
				setCode((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__GROUP:
				setGroup((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__WORK_GROUP:
				setWorkGroup((WorkGroupType)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__EMAIL_ADDRESS:
				setEmailAddress((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK:
				setHyperlink((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_ADDRESS:
				setHyperlinkAddress((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS:
				setHyperlinkSubAddress((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__MAX_UNITS:
				setMaxUnits((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__PEAK_UNITS:
				setPeakUnits((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVER_ALLOCATED:
				setOverAllocated((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_FROM:
				setAvailableFrom((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_TO:
				setAvailableTo((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__FINISH:
				setFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__CAN_LEVEL:
				setCanLevel((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACCRUE_AT:
				setAccrueAt((AccrueAtType)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__WORK:
				setWork((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__REGULAR_WORK:
				setRegularWork((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_WORK:
				setOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK:
				setActualWork((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_WORK:
				setRemainingWork((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK:
				setActualOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_WORK:
				setRemainingOvertimeWork((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__PERCENT_WORK_COMPLETE:
				setPercentWorkComplete((BigInteger)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE:
				setStandardRate((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE_FORMAT:
				setStandardRateFormat((StandardRateFormatType1)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__COST:
				setCost((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE:
				setOvertimeRate((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE_FORMAT:
				setOvertimeRateFormat((OvertimeRateFormatType1)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_COST:
				setOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__COST_PER_USE:
				setCostPerUse((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_COST:
				setActualCost((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_COST:
				setActualOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_COST:
				setRemainingCost((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_COST:
				setRemainingOvertimeCost((BigDecimal)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__WORK_VARIANCE:
				setWorkVariance((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__COST_VARIANCE:
				setCostVariance((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__SV:
				setSV((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__CV:
				setCV((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACWP:
				setACWP((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__CALENDAR_UID:
				setCalendarUID((BigInteger)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__NOTES:
				setNotes((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__BCWS:
				setBCWS((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__BCWP:
				setBCWP((Float)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_GENERIC:
				setIsGeneric((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_INACTIVE:
				setIsInactive((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_ENTERPRISE:
				setIsEnterprise((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__BOOKING_TYPE:
				setBookingType((BookingTypeType1)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK_PROTECTED:
				setActualWorkProtected((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				setActualOvertimeWorkProtected((Duration)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID:
				setActiveDirectoryGUID((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__EXTENDED_ATTRIBUTE:
				getExtendedAttribute().clear();
				getExtendedAttribute().addAll((Collection<? extends ExtendedAttributeType1>)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__BASELINE:
				getBaseline().clear();
				getBaseline().addAll((Collection<? extends BaselineType1>)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__OUTLINE_CODE:
				getOutlineCode().clear();
				getOutlineCode().addAll((Collection<? extends OutlineCodeType1>)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_COST_RESOURCE:
				setIsCostResource((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER:
				setAssnOwner((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER_GUID:
				setAssnOwnerGuid((String)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_BUDGET:
				setIsBudget((Boolean)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS:
				setAvailabilityPeriods((AvailabilityPeriodsType)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__RATES:
				setRates((RatesType)newValue);
				return;
			case MspdiPackage.RESOURCE_TYPE__TIMEPHASED_DATA:
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
			case MspdiPackage.RESOURCE_TYPE__UID:
				setUID(UID_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__TYPE:
				unsetType();
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_NULL:
				unsetIsNull();
				return;
			case MspdiPackage.RESOURCE_TYPE__INITIALS:
				setInitials(INITIALS_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__PHONETICS:
				setPhonetics(PHONETICS_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__NT_ACCOUNT:
				setNTAccount(NT_ACCOUNT_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__MATERIAL_LABEL:
				setMaterialLabel(MATERIAL_LABEL_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__WORK_GROUP:
				unsetWorkGroup();
				return;
			case MspdiPackage.RESOURCE_TYPE__EMAIL_ADDRESS:
				setEmailAddress(EMAIL_ADDRESS_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK:
				setHyperlink(HYPERLINK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_ADDRESS:
				setHyperlinkAddress(HYPERLINK_ADDRESS_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS:
				setHyperlinkSubAddress(HYPERLINK_SUB_ADDRESS_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__MAX_UNITS:
				unsetMaxUnits();
				return;
			case MspdiPackage.RESOURCE_TYPE__PEAK_UNITS:
				unsetPeakUnits();
				return;
			case MspdiPackage.RESOURCE_TYPE__OVER_ALLOCATED:
				unsetOverAllocated();
				return;
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_FROM:
				setAvailableFrom(AVAILABLE_FROM_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_TO:
				setAvailableTo(AVAILABLE_TO_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__START:
				setStart(START_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__FINISH:
				setFinish(FINISH_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__CAN_LEVEL:
				unsetCanLevel();
				return;
			case MspdiPackage.RESOURCE_TYPE__ACCRUE_AT:
				unsetAccrueAt();
				return;
			case MspdiPackage.RESOURCE_TYPE__WORK:
				setWork(WORK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__REGULAR_WORK:
				setRegularWork(REGULAR_WORK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_WORK:
				setOvertimeWork(OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK:
				setActualWork(ACTUAL_WORK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_WORK:
				setRemainingWork(REMAINING_WORK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK:
				setActualOvertimeWork(ACTUAL_OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_WORK:
				setRemainingOvertimeWork(REMAINING_OVERTIME_WORK_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__PERCENT_WORK_COMPLETE:
				setPercentWorkComplete(PERCENT_WORK_COMPLETE_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE:
				setStandardRate(STANDARD_RATE_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE_FORMAT:
				unsetStandardRateFormat();
				return;
			case MspdiPackage.RESOURCE_TYPE__COST:
				setCost(COST_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE:
				setOvertimeRate(OVERTIME_RATE_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE_FORMAT:
				unsetOvertimeRateFormat();
				return;
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_COST:
				setOvertimeCost(OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__COST_PER_USE:
				setCostPerUse(COST_PER_USE_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_COST:
				setActualCost(ACTUAL_COST_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_COST:
				setActualOvertimeCost(ACTUAL_OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_COST:
				setRemainingCost(REMAINING_COST_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_COST:
				setRemainingOvertimeCost(REMAINING_OVERTIME_COST_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__WORK_VARIANCE:
				unsetWorkVariance();
				return;
			case MspdiPackage.RESOURCE_TYPE__COST_VARIANCE:
				unsetCostVariance();
				return;
			case MspdiPackage.RESOURCE_TYPE__SV:
				unsetSV();
				return;
			case MspdiPackage.RESOURCE_TYPE__CV:
				unsetCV();
				return;
			case MspdiPackage.RESOURCE_TYPE__ACWP:
				unsetACWP();
				return;
			case MspdiPackage.RESOURCE_TYPE__CALENDAR_UID:
				setCalendarUID(CALENDAR_UID_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__BCWS:
				unsetBCWS();
				return;
			case MspdiPackage.RESOURCE_TYPE__BCWP:
				unsetBCWP();
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_GENERIC:
				unsetIsGeneric();
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_INACTIVE:
				unsetIsInactive();
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_ENTERPRISE:
				unsetIsEnterprise();
				return;
			case MspdiPackage.RESOURCE_TYPE__BOOKING_TYPE:
				unsetBookingType();
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK_PROTECTED:
				setActualWorkProtected(ACTUAL_WORK_PROTECTED_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				setActualOvertimeWorkProtected(ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID:
				setActiveDirectoryGUID(ACTIVE_DIRECTORY_GUID_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__EXTENDED_ATTRIBUTE:
				getExtendedAttribute().clear();
				return;
			case MspdiPackage.RESOURCE_TYPE__BASELINE:
				getBaseline().clear();
				return;
			case MspdiPackage.RESOURCE_TYPE__OUTLINE_CODE:
				getOutlineCode().clear();
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_COST_RESOURCE:
				unsetIsCostResource();
				return;
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER:
				setAssnOwner(ASSN_OWNER_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER_GUID:
				setAssnOwnerGuid(ASSN_OWNER_GUID_EDEFAULT);
				return;
			case MspdiPackage.RESOURCE_TYPE__IS_BUDGET:
				unsetIsBudget();
				return;
			case MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS:
				setAvailabilityPeriods((AvailabilityPeriodsType)null);
				return;
			case MspdiPackage.RESOURCE_TYPE__RATES:
				setRates((RatesType)null);
				return;
			case MspdiPackage.RESOURCE_TYPE__TIMEPHASED_DATA:
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
			case MspdiPackage.RESOURCE_TYPE__UID:
				return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
			case MspdiPackage.RESOURCE_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case MspdiPackage.RESOURCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MspdiPackage.RESOURCE_TYPE__TYPE:
				return isSetType();
			case MspdiPackage.RESOURCE_TYPE__IS_NULL:
				return isSetIsNull();
			case MspdiPackage.RESOURCE_TYPE__INITIALS:
				return INITIALS_EDEFAULT == null ? initials != null : !INITIALS_EDEFAULT.equals(initials);
			case MspdiPackage.RESOURCE_TYPE__PHONETICS:
				return PHONETICS_EDEFAULT == null ? phonetics != null : !PHONETICS_EDEFAULT.equals(phonetics);
			case MspdiPackage.RESOURCE_TYPE__NT_ACCOUNT:
				return NT_ACCOUNT_EDEFAULT == null ? nTAccount != null : !NT_ACCOUNT_EDEFAULT.equals(nTAccount);
			case MspdiPackage.RESOURCE_TYPE__MATERIAL_LABEL:
				return MATERIAL_LABEL_EDEFAULT == null ? materialLabel != null : !MATERIAL_LABEL_EDEFAULT.equals(materialLabel);
			case MspdiPackage.RESOURCE_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case MspdiPackage.RESOURCE_TYPE__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case MspdiPackage.RESOURCE_TYPE__WORK_GROUP:
				return isSetWorkGroup();
			case MspdiPackage.RESOURCE_TYPE__EMAIL_ADDRESS:
				return EMAIL_ADDRESS_EDEFAULT == null ? emailAddress != null : !EMAIL_ADDRESS_EDEFAULT.equals(emailAddress);
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK:
				return HYPERLINK_EDEFAULT == null ? hyperlink != null : !HYPERLINK_EDEFAULT.equals(hyperlink);
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_ADDRESS:
				return HYPERLINK_ADDRESS_EDEFAULT == null ? hyperlinkAddress != null : !HYPERLINK_ADDRESS_EDEFAULT.equals(hyperlinkAddress);
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS:
				return HYPERLINK_SUB_ADDRESS_EDEFAULT == null ? hyperlinkSubAddress != null : !HYPERLINK_SUB_ADDRESS_EDEFAULT.equals(hyperlinkSubAddress);
			case MspdiPackage.RESOURCE_TYPE__MAX_UNITS:
				return isSetMaxUnits();
			case MspdiPackage.RESOURCE_TYPE__PEAK_UNITS:
				return isSetPeakUnits();
			case MspdiPackage.RESOURCE_TYPE__OVER_ALLOCATED:
				return isSetOverAllocated();
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_FROM:
				return AVAILABLE_FROM_EDEFAULT == null ? availableFrom != null : !AVAILABLE_FROM_EDEFAULT.equals(availableFrom);
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_TO:
				return AVAILABLE_TO_EDEFAULT == null ? availableTo != null : !AVAILABLE_TO_EDEFAULT.equals(availableTo);
			case MspdiPackage.RESOURCE_TYPE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case MspdiPackage.RESOURCE_TYPE__FINISH:
				return FINISH_EDEFAULT == null ? finish != null : !FINISH_EDEFAULT.equals(finish);
			case MspdiPackage.RESOURCE_TYPE__CAN_LEVEL:
				return isSetCanLevel();
			case MspdiPackage.RESOURCE_TYPE__ACCRUE_AT:
				return isSetAccrueAt();
			case MspdiPackage.RESOURCE_TYPE__WORK:
				return WORK_EDEFAULT == null ? work != null : !WORK_EDEFAULT.equals(work);
			case MspdiPackage.RESOURCE_TYPE__REGULAR_WORK:
				return REGULAR_WORK_EDEFAULT == null ? regularWork != null : !REGULAR_WORK_EDEFAULT.equals(regularWork);
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_WORK:
				return OVERTIME_WORK_EDEFAULT == null ? overtimeWork != null : !OVERTIME_WORK_EDEFAULT.equals(overtimeWork);
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK:
				return ACTUAL_WORK_EDEFAULT == null ? actualWork != null : !ACTUAL_WORK_EDEFAULT.equals(actualWork);
			case MspdiPackage.RESOURCE_TYPE__REMAINING_WORK:
				return REMAINING_WORK_EDEFAULT == null ? remainingWork != null : !REMAINING_WORK_EDEFAULT.equals(remainingWork);
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK:
				return ACTUAL_OVERTIME_WORK_EDEFAULT == null ? actualOvertimeWork != null : !ACTUAL_OVERTIME_WORK_EDEFAULT.equals(actualOvertimeWork);
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_WORK:
				return REMAINING_OVERTIME_WORK_EDEFAULT == null ? remainingOvertimeWork != null : !REMAINING_OVERTIME_WORK_EDEFAULT.equals(remainingOvertimeWork);
			case MspdiPackage.RESOURCE_TYPE__PERCENT_WORK_COMPLETE:
				return PERCENT_WORK_COMPLETE_EDEFAULT == null ? percentWorkComplete != null : !PERCENT_WORK_COMPLETE_EDEFAULT.equals(percentWorkComplete);
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE:
				return STANDARD_RATE_EDEFAULT == null ? standardRate != null : !STANDARD_RATE_EDEFAULT.equals(standardRate);
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE_FORMAT:
				return isSetStandardRateFormat();
			case MspdiPackage.RESOURCE_TYPE__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE:
				return OVERTIME_RATE_EDEFAULT == null ? overtimeRate != null : !OVERTIME_RATE_EDEFAULT.equals(overtimeRate);
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE_FORMAT:
				return isSetOvertimeRateFormat();
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_COST:
				return OVERTIME_COST_EDEFAULT == null ? overtimeCost != null : !OVERTIME_COST_EDEFAULT.equals(overtimeCost);
			case MspdiPackage.RESOURCE_TYPE__COST_PER_USE:
				return COST_PER_USE_EDEFAULT == null ? costPerUse != null : !COST_PER_USE_EDEFAULT.equals(costPerUse);
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_COST:
				return ACTUAL_COST_EDEFAULT == null ? actualCost != null : !ACTUAL_COST_EDEFAULT.equals(actualCost);
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_COST:
				return ACTUAL_OVERTIME_COST_EDEFAULT == null ? actualOvertimeCost != null : !ACTUAL_OVERTIME_COST_EDEFAULT.equals(actualOvertimeCost);
			case MspdiPackage.RESOURCE_TYPE__REMAINING_COST:
				return REMAINING_COST_EDEFAULT == null ? remainingCost != null : !REMAINING_COST_EDEFAULT.equals(remainingCost);
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_COST:
				return REMAINING_OVERTIME_COST_EDEFAULT == null ? remainingOvertimeCost != null : !REMAINING_OVERTIME_COST_EDEFAULT.equals(remainingOvertimeCost);
			case MspdiPackage.RESOURCE_TYPE__WORK_VARIANCE:
				return isSetWorkVariance();
			case MspdiPackage.RESOURCE_TYPE__COST_VARIANCE:
				return isSetCostVariance();
			case MspdiPackage.RESOURCE_TYPE__SV:
				return isSetSV();
			case MspdiPackage.RESOURCE_TYPE__CV:
				return isSetCV();
			case MspdiPackage.RESOURCE_TYPE__ACWP:
				return isSetACWP();
			case MspdiPackage.RESOURCE_TYPE__CALENDAR_UID:
				return CALENDAR_UID_EDEFAULT == null ? calendarUID != null : !CALENDAR_UID_EDEFAULT.equals(calendarUID);
			case MspdiPackage.RESOURCE_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case MspdiPackage.RESOURCE_TYPE__BCWS:
				return isSetBCWS();
			case MspdiPackage.RESOURCE_TYPE__BCWP:
				return isSetBCWP();
			case MspdiPackage.RESOURCE_TYPE__IS_GENERIC:
				return isSetIsGeneric();
			case MspdiPackage.RESOURCE_TYPE__IS_INACTIVE:
				return isSetIsInactive();
			case MspdiPackage.RESOURCE_TYPE__IS_ENTERPRISE:
				return isSetIsEnterprise();
			case MspdiPackage.RESOURCE_TYPE__BOOKING_TYPE:
				return isSetBookingType();
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK_PROTECTED:
				return ACTUAL_WORK_PROTECTED_EDEFAULT == null ? actualWorkProtected != null : !ACTUAL_WORK_PROTECTED_EDEFAULT.equals(actualWorkProtected);
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
				return ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT == null ? actualOvertimeWorkProtected != null : !ACTUAL_OVERTIME_WORK_PROTECTED_EDEFAULT.equals(actualOvertimeWorkProtected);
			case MspdiPackage.RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID:
				return ACTIVE_DIRECTORY_GUID_EDEFAULT == null ? activeDirectoryGUID != null : !ACTIVE_DIRECTORY_GUID_EDEFAULT.equals(activeDirectoryGUID);
			case MspdiPackage.RESOURCE_TYPE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case MspdiPackage.RESOURCE_TYPE__EXTENDED_ATTRIBUTE:
				return extendedAttribute != null && !extendedAttribute.isEmpty();
			case MspdiPackage.RESOURCE_TYPE__BASELINE:
				return baseline != null && !baseline.isEmpty();
			case MspdiPackage.RESOURCE_TYPE__OUTLINE_CODE:
				return outlineCode != null && !outlineCode.isEmpty();
			case MspdiPackage.RESOURCE_TYPE__IS_COST_RESOURCE:
				return isSetIsCostResource();
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER:
				return ASSN_OWNER_EDEFAULT == null ? assnOwner != null : !ASSN_OWNER_EDEFAULT.equals(assnOwner);
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER_GUID:
				return ASSN_OWNER_GUID_EDEFAULT == null ? assnOwnerGuid != null : !ASSN_OWNER_GUID_EDEFAULT.equals(assnOwnerGuid);
			case MspdiPackage.RESOURCE_TYPE__IS_BUDGET:
				return isSetIsBudget();
			case MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS:
				return availabilityPeriods != null;
			case MspdiPackage.RESOURCE_TYPE__RATES:
				return rates != null;
			case MspdiPackage.RESOURCE_TYPE__TIMEPHASED_DATA:
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
		result.append(", initials: ");
		result.append(initials);
		result.append(", phonetics: ");
		result.append(phonetics);
		result.append(", nTAccount: ");
		result.append(nTAccount);
		result.append(", materialLabel: ");
		result.append(materialLabel);
		result.append(", code: ");
		result.append(code);
		result.append(", group: ");
		result.append(group);
		result.append(", workGroup: ");
		if (workGroupESet) result.append(workGroup); else result.append("<unset>");
		result.append(", emailAddress: ");
		result.append(emailAddress);
		result.append(", hyperlink: ");
		result.append(hyperlink);
		result.append(", hyperlinkAddress: ");
		result.append(hyperlinkAddress);
		result.append(", hyperlinkSubAddress: ");
		result.append(hyperlinkSubAddress);
		result.append(", maxUnits: ");
		if (maxUnitsESet) result.append(maxUnits); else result.append("<unset>");
		result.append(", peakUnits: ");
		if (peakUnitsESet) result.append(peakUnits); else result.append("<unset>");
		result.append(", overAllocated: ");
		if (overAllocatedESet) result.append(overAllocated); else result.append("<unset>");
		result.append(", availableFrom: ");
		result.append(availableFrom);
		result.append(", availableTo: ");
		result.append(availableTo);
		result.append(", start: ");
		result.append(start);
		result.append(", finish: ");
		result.append(finish);
		result.append(", canLevel: ");
		if (canLevelESet) result.append(canLevel); else result.append("<unset>");
		result.append(", accrueAt: ");
		if (accrueAtESet) result.append(accrueAt); else result.append("<unset>");
		result.append(", work: ");
		result.append(work);
		result.append(", regularWork: ");
		result.append(regularWork);
		result.append(", overtimeWork: ");
		result.append(overtimeWork);
		result.append(", actualWork: ");
		result.append(actualWork);
		result.append(", remainingWork: ");
		result.append(remainingWork);
		result.append(", actualOvertimeWork: ");
		result.append(actualOvertimeWork);
		result.append(", remainingOvertimeWork: ");
		result.append(remainingOvertimeWork);
		result.append(", percentWorkComplete: ");
		result.append(percentWorkComplete);
		result.append(", standardRate: ");
		result.append(standardRate);
		result.append(", standardRateFormat: ");
		if (standardRateFormatESet) result.append(standardRateFormat); else result.append("<unset>");
		result.append(", cost: ");
		result.append(cost);
		result.append(", overtimeRate: ");
		result.append(overtimeRate);
		result.append(", overtimeRateFormat: ");
		if (overtimeRateFormatESet) result.append(overtimeRateFormat); else result.append("<unset>");
		result.append(", overtimeCost: ");
		result.append(overtimeCost);
		result.append(", costPerUse: ");
		result.append(costPerUse);
		result.append(", actualCost: ");
		result.append(actualCost);
		result.append(", actualOvertimeCost: ");
		result.append(actualOvertimeCost);
		result.append(", remainingCost: ");
		result.append(remainingCost);
		result.append(", remainingOvertimeCost: ");
		result.append(remainingOvertimeCost);
		result.append(", workVariance: ");
		if (workVarianceESet) result.append(workVariance); else result.append("<unset>");
		result.append(", costVariance: ");
		if (costVarianceESet) result.append(costVariance); else result.append("<unset>");
		result.append(", sV: ");
		if (sVESet) result.append(sV); else result.append("<unset>");
		result.append(", cV: ");
		if (cVESet) result.append(cV); else result.append("<unset>");
		result.append(", aCWP: ");
		if (aCWPESet) result.append(aCWP); else result.append("<unset>");
		result.append(", calendarUID: ");
		result.append(calendarUID);
		result.append(", notes: ");
		result.append(notes);
		result.append(", bCWS: ");
		if (bCWSESet) result.append(bCWS); else result.append("<unset>");
		result.append(", bCWP: ");
		if (bCWPESet) result.append(bCWP); else result.append("<unset>");
		result.append(", isGeneric: ");
		if (isGenericESet) result.append(isGeneric); else result.append("<unset>");
		result.append(", isInactive: ");
		if (isInactiveESet) result.append(isInactive); else result.append("<unset>");
		result.append(", isEnterprise: ");
		if (isEnterpriseESet) result.append(isEnterprise); else result.append("<unset>");
		result.append(", bookingType: ");
		if (bookingTypeESet) result.append(bookingType); else result.append("<unset>");
		result.append(", actualWorkProtected: ");
		result.append(actualWorkProtected);
		result.append(", actualOvertimeWorkProtected: ");
		result.append(actualOvertimeWorkProtected);
		result.append(", activeDirectoryGUID: ");
		result.append(activeDirectoryGUID);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", isCostResource: ");
		if (isCostResourceESet) result.append(isCostResource); else result.append("<unset>");
		result.append(", assnOwner: ");
		result.append(assnOwner);
		result.append(", assnOwnerGuid: ");
		result.append(assnOwnerGuid);
		result.append(", isBudget: ");
		if (isBudgetESet) result.append(isBudget); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResourceTypeImpl
