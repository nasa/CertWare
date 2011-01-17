/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.util;

import java.util.Map;

import net.certware.planning.mspdi.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.certware.planning.mspdi.MspdiPackage
 * @generated
 */
public class MspdiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MspdiValidator INSTANCE = new MspdiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.certware.planning.mspdi";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MspdiValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MspdiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MspdiPackage.ASSIGNMENTS_TYPE:
				return validateAssignmentsType((AssignmentsType)value, diagnostics, context);
			case MspdiPackage.ASSIGNMENT_TYPE:
				return validateAssignmentType((AssignmentType)value, diagnostics, context);
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE:
				return validateAvailabilityPeriodsType((AvailabilityPeriodsType)value, diagnostics, context);
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE:
				return validateAvailabilityPeriodType((AvailabilityPeriodType)value, diagnostics, context);
			case MspdiPackage.BASELINE_TYPE:
				return validateBaselineType((BaselineType)value, diagnostics, context);
			case MspdiPackage.BASELINE_TYPE1:
				return validateBaselineType1((BaselineType1)value, diagnostics, context);
			case MspdiPackage.BASELINE_TYPE2:
				return validateBaselineType2((BaselineType2)value, diagnostics, context);
			case MspdiPackage.CALENDARS_TYPE:
				return validateCalendarsType((CalendarsType)value, diagnostics, context);
			case MspdiPackage.CALENDAR_TYPE:
				return validateCalendarType((CalendarType)value, diagnostics, context);
			case MspdiPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case MspdiPackage.EXCEPTIONS_TYPE:
				return validateExceptionsType((ExceptionsType)value, diagnostics, context);
			case MspdiPackage.EXCEPTION_TYPE:
				return validateExceptionType((ExceptionType)value, diagnostics, context);
			case MspdiPackage.EXTENDED_ATTRIBUTES_TYPE:
				return validateExtendedAttributesType((ExtendedAttributesType)value, diagnostics, context);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE:
				return validateExtendedAttributeType((ExtendedAttributeType)value, diagnostics, context);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE1:
				return validateExtendedAttributeType1((ExtendedAttributeType1)value, diagnostics, context);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE2:
				return validateExtendedAttributeType2((ExtendedAttributeType2)value, diagnostics, context);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3:
				return validateExtendedAttributeType3((ExtendedAttributeType3)value, diagnostics, context);
			case MspdiPackage.MASKS_TYPE:
				return validateMasksType((MasksType)value, diagnostics, context);
			case MspdiPackage.MASK_TYPE:
				return validateMaskType((MaskType)value, diagnostics, context);
			case MspdiPackage.OUTLINE_CODES_TYPE:
				return validateOutlineCodesType((OutlineCodesType)value, diagnostics, context);
			case MspdiPackage.OUTLINE_CODE_TYPE:
				return validateOutlineCodeType((OutlineCodeType)value, diagnostics, context);
			case MspdiPackage.OUTLINE_CODE_TYPE1:
				return validateOutlineCodeType1((OutlineCodeType1)value, diagnostics, context);
			case MspdiPackage.OUTLINE_CODE_TYPE2:
				return validateOutlineCodeType2((OutlineCodeType2)value, diagnostics, context);
			case MspdiPackage.PREDECESSOR_LINK_TYPE:
				return validatePredecessorLinkType((PredecessorLinkType)value, diagnostics, context);
			case MspdiPackage.PROJECT_TYPE:
				return validateProjectType((ProjectType)value, diagnostics, context);
			case MspdiPackage.RATES_TYPE:
				return validateRatesType((RatesType)value, diagnostics, context);
			case MspdiPackage.RATE_TYPE:
				return validateRateType((RateType)value, diagnostics, context);
			case MspdiPackage.RESOURCES_TYPE:
				return validateResourcesType((ResourcesType)value, diagnostics, context);
			case MspdiPackage.RESOURCE_TYPE:
				return validateResourceType((ResourceType)value, diagnostics, context);
			case MspdiPackage.TASKS_TYPE:
				return validateTasksType((TasksType)value, diagnostics, context);
			case MspdiPackage.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case MspdiPackage.TIME_PERIOD_TYPE:
				return validateTimePeriodType((TimePeriodType)value, diagnostics, context);
			case MspdiPackage.TIME_PERIOD_TYPE1:
				return validateTimePeriodType1((TimePeriodType1)value, diagnostics, context);
			case MspdiPackage.TIME_PERIOD_TYPE2:
				return validateTimePeriodType2((TimePeriodType2)value, diagnostics, context);
			case MspdiPackage.TIMEPHASED_DATA_TYPE:
				return validateTimephasedDataType((TimephasedDataType)value, diagnostics, context);
			case MspdiPackage.VALUE_LIST_TYPE:
				return validateValueListType((ValueListType)value, diagnostics, context);
			case MspdiPackage.VALUES_TYPE:
				return validateValuesType((ValuesType)value, diagnostics, context);
			case MspdiPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case MspdiPackage.VALUE_TYPE1:
				return validateValueType1((ValueType1)value, diagnostics, context);
			case MspdiPackage.WBS_MASKS_TYPE:
				return validateWBSMasksType((WBSMasksType)value, diagnostics, context);
			case MspdiPackage.WBS_MASK_TYPE:
				return validateWBSMaskType((WBSMaskType)value, diagnostics, context);
			case MspdiPackage.WEEK_DAYS_TYPE:
				return validateWeekDaysType((WeekDaysType)value, diagnostics, context);
			case MspdiPackage.WEEK_DAY_TYPE:
				return validateWeekDayType((WeekDayType)value, diagnostics, context);
			case MspdiPackage.WEEK_DAY_TYPE1:
				return validateWeekDayType1((WeekDayType1)value, diagnostics, context);
			case MspdiPackage.WORKING_TIMES_TYPE:
				return validateWorkingTimesType((WorkingTimesType)value, diagnostics, context);
			case MspdiPackage.WORKING_TIMES_TYPE1:
				return validateWorkingTimesType1((WorkingTimesType1)value, diagnostics, context);
			case MspdiPackage.WORKING_TIME_TYPE:
				return validateWorkingTimeType((WorkingTimeType)value, diagnostics, context);
			case MspdiPackage.WORKING_TIME_TYPE1:
				return validateWorkingTimeType1((WorkingTimeType1)value, diagnostics, context);
			case MspdiPackage.WORK_WEEKS_TYPE:
				return validateWorkWeeksType((WorkWeeksType)value, diagnostics, context);
			case MspdiPackage.WORK_WEEK_TYPE:
				return validateWorkWeekType((WorkWeekType)value, diagnostics, context);
			case MspdiPackage.ACCRUE_AT_TYPE:
				return validateAccrueAtType((AccrueAtType)value, diagnostics, context);
			case MspdiPackage.BASELINE_FOR_EARNED_VALUE_TYPE:
				return validateBaselineForEarnedValueType((BaselineForEarnedValueType)value, diagnostics, context);
			case MspdiPackage.BOOKING_TYPE_TYPE:
				return validateBookingTypeType((BookingTypeType)value, diagnostics, context);
			case MspdiPackage.BOOKING_TYPE_TYPE1:
				return validateBookingTypeType1((BookingTypeType1)value, diagnostics, context);
			case MspdiPackage.CALCULATION_TYPE_TYPE:
				return validateCalculationTypeType((CalculationTypeType)value, diagnostics, context);
			case MspdiPackage.CF_TYPE_TYPE:
				return validateCFTypeType((CFTypeType)value, diagnostics, context);
			case MspdiPackage.COMMITMENT_TYPE_TYPE:
				return validateCommitmentTypeType((CommitmentTypeType)value, diagnostics, context);
			case MspdiPackage.CONSTRAINT_TYPE_TYPE:
				return validateConstraintTypeType((ConstraintTypeType)value, diagnostics, context);
			case MspdiPackage.COST_RATE_TABLE_TYPE:
				return validateCostRateTableType((CostRateTableType)value, diagnostics, context);
			case MspdiPackage.CURRENCY_SYMBOL_POSITION_TYPE:
				return validateCurrencySymbolPositionType((CurrencySymbolPositionType)value, diagnostics, context);
			case MspdiPackage.DAY_TYPE_TYPE:
				return validateDayTypeType((DayTypeType)value, diagnostics, context);
			case MspdiPackage.DAY_TYPE_TYPE1:
				return validateDayTypeType1((DayTypeType1)value, diagnostics, context);
			case MspdiPackage.DEFAULT_FIXED_COST_ACCRUAL_TYPE:
				return validateDefaultFixedCostAccrualType((DefaultFixedCostAccrualType)value, diagnostics, context);
			case MspdiPackage.DEFAULT_TASK_EV_METHOD_TYPE:
				return validateDefaultTaskEVMethodType((DefaultTaskEVMethodType)value, diagnostics, context);
			case MspdiPackage.DEFAULT_TASK_TYPE_TYPE:
				return validateDefaultTaskTypeType((DefaultTaskTypeType)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE:
				return validateDurationFormatType((DurationFormatType)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE1:
				return validateDurationFormatType1((DurationFormatType1)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE2:
				return validateDurationFormatType2((DurationFormatType2)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE3:
				return validateDurationFormatType3((DurationFormatType3)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE4:
				return validateDurationFormatType4((DurationFormatType4)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE5:
				return validateDurationFormatType5((DurationFormatType5)value, diagnostics, context);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE:
				return validateEarnedValueMethodType((EarnedValueMethodType)value, diagnostics, context);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE1:
				return validateEarnedValueMethodType1((EarnedValueMethodType1)value, diagnostics, context);
			case MspdiPackage.ELEM_TYPE_TYPE:
				return validateElemTypeType((ElemTypeType)value, diagnostics, context);
			case MspdiPackage.FIXED_COST_ACCRUAL_TYPE:
				return validateFixedCostAccrualType((FixedCostAccrualType)value, diagnostics, context);
			case MspdiPackage.FY_START_DATE_TYPE:
				return validateFYStartDateType((FYStartDateType)value, diagnostics, context);
			case MspdiPackage.LAG_FORMAT_TYPE:
				return validateLagFormatType((LagFormatType)value, diagnostics, context);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE:
				return validateLevelingDelayFormatType((LevelingDelayFormatType)value, diagnostics, context);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE1:
				return validateLevelingDelayFormatType1((LevelingDelayFormatType1)value, diagnostics, context);
			case MspdiPackage.MONTH_ITEM_TYPE:
				return validateMonthItemType((MonthItemType)value, diagnostics, context);
			case MspdiPackage.MONTH_POSITION_TYPE:
				return validateMonthPositionType((MonthPositionType)value, diagnostics, context);
			case MspdiPackage.MONTH_TYPE:
				return validateMonthType((MonthType)value, diagnostics, context);
			case MspdiPackage.NEW_TASK_START_DATE_TYPE:
				return validateNewTaskStartDateType((NewTaskStartDateType)value, diagnostics, context);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE:
				return validateOvertimeRateFormatType((OvertimeRateFormatType)value, diagnostics, context);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE1:
				return validateOvertimeRateFormatType1((OvertimeRateFormatType1)value, diagnostics, context);
			case MspdiPackage.RATE_TABLE_TYPE:
				return validateRateTableType((RateTableType)value, diagnostics, context);
			case MspdiPackage.ROLLUP_TYPE_TYPE:
				return validateRollupTypeType((RollupTypeType)value, diagnostics, context);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE:
				return validateStandardRateFormatType((StandardRateFormatType)value, diagnostics, context);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE1:
				return validateStandardRateFormatType1((StandardRateFormatType1)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE2:
				return validateTypeType2((TypeType2)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE3:
				return validateTypeType3((TypeType3)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE4:
				return validateTypeType4((TypeType4)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE5:
				return validateTypeType5((TypeType5)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE6:
				return validateTypeType6((TypeType6)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE7:
				return validateTypeType7((TypeType7)value, diagnostics, context);
			case MspdiPackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case MspdiPackage.VALUELIST_SORT_ORDER_TYPE:
				return validateValuelistSortOrderType((ValuelistSortOrderType)value, diagnostics, context);
			case MspdiPackage.WEEK_START_DAY_TYPE:
				return validateWeekStartDayType((WeekStartDayType)value, diagnostics, context);
			case MspdiPackage.WORK_CONTOUR_TYPE:
				return validateWorkContourType((WorkContourType)value, diagnostics, context);
			case MspdiPackage.WORK_FORMAT_TYPE:
				return validateWorkFormatType((WorkFormatType)value, diagnostics, context);
			case MspdiPackage.WORK_GROUP_TYPE:
				return validateWorkGroupType((WorkGroupType)value, diagnostics, context);
			case MspdiPackage.ACCRUE_AT_TYPE_OBJECT:
				return validateAccrueAtTypeObject((AccrueAtType)value, diagnostics, context);
			case MspdiPackage.ACTIVE_DIRECTORY_GUID_TYPE:
				return validateActiveDirectoryGUIDType((String)value, diagnostics, context);
			case MspdiPackage.ALIAS_TYPE:
				return validateAliasType((String)value, diagnostics, context);
			case MspdiPackage.AUTHOR_TYPE:
				return validateAuthorType((String)value, diagnostics, context);
			case MspdiPackage.BASELINE_FOR_EARNED_VALUE_TYPE_OBJECT:
				return validateBaselineForEarnedValueTypeObject((BaselineForEarnedValueType)value, diagnostics, context);
			case MspdiPackage.BOOKING_TYPE_TYPE_OBJECT:
				return validateBookingTypeTypeObject((BookingTypeType)value, diagnostics, context);
			case MspdiPackage.BOOKING_TYPE_TYPE_OBJECT1:
				return validateBookingTypeTypeObject1((BookingTypeType1)value, diagnostics, context);
			case MspdiPackage.CALCULATION_TYPE_TYPE_OBJECT:
				return validateCalculationTypeTypeObject((CalculationTypeType)value, diagnostics, context);
			case MspdiPackage.CATEGORY_TYPE:
				return validateCategoryType((String)value, diagnostics, context);
			case MspdiPackage.CF_TYPE_TYPE_OBJECT:
				return validateCFTypeTypeObject((CFTypeType)value, diagnostics, context);
			case MspdiPackage.CODE_TYPE:
				return validateCodeType((String)value, diagnostics, context);
			case MspdiPackage.COMMITMENT_TYPE_TYPE_OBJECT:
				return validateCommitmentTypeTypeObject((CommitmentTypeType)value, diagnostics, context);
			case MspdiPackage.COMPANY_TYPE:
				return validateCompanyType((String)value, diagnostics, context);
			case MspdiPackage.CONSTRAINT_TYPE_TYPE_OBJECT:
				return validateConstraintTypeTypeObject((ConstraintTypeType)value, diagnostics, context);
			case MspdiPackage.CONTACT_TYPE:
				return validateContactType((String)value, diagnostics, context);
			case MspdiPackage.COST_RATE_TABLE_TYPE_OBJECT:
				return validateCostRateTableTypeObject((CostRateTableType)value, diagnostics, context);
			case MspdiPackage.CURRENCY_CODE_TYPE:
				return validateCurrencyCodeType((String)value, diagnostics, context);
			case MspdiPackage.CURRENCY_SYMBOL_POSITION_TYPE_OBJECT:
				return validateCurrencySymbolPositionTypeObject((CurrencySymbolPositionType)value, diagnostics, context);
			case MspdiPackage.CURRENCY_SYMBOL_TYPE:
				return validateCurrencySymbolType((String)value, diagnostics, context);
			case MspdiPackage.DAY_TYPE_TYPE_OBJECT:
				return validateDayTypeTypeObject((DayTypeType)value, diagnostics, context);
			case MspdiPackage.DAY_TYPE_TYPE_OBJECT1:
				return validateDayTypeTypeObject1((DayTypeType1)value, diagnostics, context);
			case MspdiPackage.DEFAULT_FIXED_COST_ACCRUAL_TYPE_OBJECT:
				return validateDefaultFixedCostAccrualTypeObject((DefaultFixedCostAccrualType)value, diagnostics, context);
			case MspdiPackage.DEFAULT_TASK_EV_METHOD_TYPE_OBJECT:
				return validateDefaultTaskEVMethodTypeObject((DefaultTaskEVMethodType)value, diagnostics, context);
			case MspdiPackage.DEFAULT_TASK_TYPE_TYPE_OBJECT:
				return validateDefaultTaskTypeTypeObject((DefaultTaskTypeType)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT:
				return validateDurationFormatTypeObject((DurationFormatType4)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT1:
				return validateDurationFormatTypeObject1((DurationFormatType1)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT2:
				return validateDurationFormatTypeObject2((DurationFormatType2)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT3:
				return validateDurationFormatTypeObject3((DurationFormatType3)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT4:
				return validateDurationFormatTypeObject4((DurationFormatType)value, diagnostics, context);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT5:
				return validateDurationFormatTypeObject5((DurationFormatType5)value, diagnostics, context);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE_OBJECT:
				return validateEarnedValueMethodTypeObject((EarnedValueMethodType)value, diagnostics, context);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE_OBJECT1:
				return validateEarnedValueMethodTypeObject1((EarnedValueMethodType1)value, diagnostics, context);
			case MspdiPackage.ELEM_TYPE_TYPE_OBJECT:
				return validateElemTypeTypeObject((ElemTypeType)value, diagnostics, context);
			case MspdiPackage.EMAIL_ADDRESS_TYPE:
				return validateEmailAddressType((String)value, diagnostics, context);
			case MspdiPackage.EXTERNAL_TASK_PROJECT_TYPE:
				return validateExternalTaskProjectType((String)value, diagnostics, context);
			case MspdiPackage.FIXED_COST_ACCRUAL_TYPE_OBJECT:
				return validateFixedCostAccrualTypeObject((FixedCostAccrualType)value, diagnostics, context);
			case MspdiPackage.FY_START_DATE_TYPE_OBJECT:
				return validateFYStartDateTypeObject((FYStartDateType)value, diagnostics, context);
			case MspdiPackage.GROUP_TYPE:
				return validateGroupType((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE:
				return validateHyperlinkAddressType((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE1:
				return validateHyperlinkAddressType1((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE2:
				return validateHyperlinkAddressType2((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE:
				return validateHyperlinkSubAddressType((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE1:
				return validateHyperlinkSubAddressType1((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE2:
				return validateHyperlinkSubAddressType2((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_TYPE:
				return validateHyperlinkType((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_TYPE1:
				return validateHyperlinkType1((String)value, diagnostics, context);
			case MspdiPackage.HYPERLINK_TYPE2:
				return validateHyperlinkType2((String)value, diagnostics, context);
			case MspdiPackage.INITIALS_TYPE:
				return validateInitialsType((String)value, diagnostics, context);
			case MspdiPackage.LAG_FORMAT_TYPE_OBJECT:
				return validateLagFormatTypeObject((LagFormatType)value, diagnostics, context);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE_OBJECT:
				return validateLevelingDelayFormatTypeObject((LevelingDelayFormatType)value, diagnostics, context);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE_OBJECT1:
				return validateLevelingDelayFormatTypeObject1((LevelingDelayFormatType1)value, diagnostics, context);
			case MspdiPackage.MANAGER_TYPE:
				return validateManagerType((String)value, diagnostics, context);
			case MspdiPackage.MATERIAL_LABEL_TYPE:
				return validateMaterialLabelType((String)value, diagnostics, context);
			case MspdiPackage.MONTH_ITEM_TYPE_OBJECT:
				return validateMonthItemTypeObject((MonthItemType)value, diagnostics, context);
			case MspdiPackage.MONTH_POSITION_TYPE_OBJECT:
				return validateMonthPositionTypeObject((MonthPositionType)value, diagnostics, context);
			case MspdiPackage.MONTH_TYPE_OBJECT:
				return validateMonthTypeObject((MonthType)value, diagnostics, context);
			case MspdiPackage.NAME_TYPE:
				return validateNameType((String)value, diagnostics, context);
			case MspdiPackage.NAME_TYPE1:
				return validateNameType1((String)value, diagnostics, context);
			case MspdiPackage.NAME_TYPE2:
				return validateNameType2((String)value, diagnostics, context);
			case MspdiPackage.NAME_TYPE3:
				return validateNameType3((String)value, diagnostics, context);
			case MspdiPackage.NAME_TYPE4:
				return validateNameType4((String)value, diagnostics, context);
			case MspdiPackage.NAME_TYPE5:
				return validateNameType5((String)value, diagnostics, context);
			case MspdiPackage.NEW_TASK_START_DATE_TYPE_OBJECT:
				return validateNewTaskStartDateTypeObject((NewTaskStartDateType)value, diagnostics, context);
			case MspdiPackage.NT_ACCOUNT_TYPE:
				return validateNTAccountType((String)value, diagnostics, context);
			case MspdiPackage.OUTLINE_NUMBER_TYPE:
				return validateOutlineNumberType((String)value, diagnostics, context);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE_OBJECT:
				return validateOvertimeRateFormatTypeObject((OvertimeRateFormatType)value, diagnostics, context);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE_OBJECT1:
				return validateOvertimeRateFormatTypeObject1((OvertimeRateFormatType1)value, diagnostics, context);
			case MspdiPackage.PHONETIC_ALIAS_TYPE:
				return validatePhoneticAliasType((String)value, diagnostics, context);
			case MspdiPackage.PHONETICS_TYPE:
				return validatePhoneticsType((String)value, diagnostics, context);
			case MspdiPackage.PREFIX_TYPE:
				return validatePrefixType((String)value, diagnostics, context);
			case MspdiPackage.RATE_TABLE_TYPE_OBJECT:
				return validateRateTableTypeObject((RateTableType)value, diagnostics, context);
			case MspdiPackage.ROLLUP_TYPE_TYPE_OBJECT:
				return validateRollupTypeTypeObject((RollupTypeType)value, diagnostics, context);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE_OBJECT:
				return validateStandardRateFormatTypeObject((StandardRateFormatType)value, diagnostics, context);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE_OBJECT1:
				return validateStandardRateFormatTypeObject1((StandardRateFormatType1)value, diagnostics, context);
			case MspdiPackage.SUBJECT_TYPE:
				return validateSubjectType((String)value, diagnostics, context);
			case MspdiPackage.SUBPROJECT_NAME_TYPE:
				return validateSubprojectNameType((String)value, diagnostics, context);
			case MspdiPackage.TITLE_TYPE:
				return validateTitleType((String)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType3)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType5)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT2:
				return validateTypeTypeObject2((TypeType)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT3:
				return validateTypeTypeObject3((TypeType1)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT4:
				return validateTypeTypeObject4((TypeType2)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT5:
				return validateTypeTypeObject5((TypeType4)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT6:
				return validateTypeTypeObject6((TypeType6)value, diagnostics, context);
			case MspdiPackage.TYPE_TYPE_OBJECT7:
				return validateTypeTypeObject7((TypeType7)value, diagnostics, context);
			case MspdiPackage.UID_TYPE:
				return validateUIDType((String)value, diagnostics, context);
			case MspdiPackage.UNIT_TYPE_OBJECT:
				return validateUnitTypeObject((UnitType)value, diagnostics, context);
			case MspdiPackage.VALUELIST_SORT_ORDER_TYPE_OBJECT:
				return validateValuelistSortOrderTypeObject((ValuelistSortOrderType)value, diagnostics, context);
			case MspdiPackage.WEEK_START_DAY_TYPE_OBJECT:
				return validateWeekStartDayTypeObject((WeekStartDayType)value, diagnostics, context);
			case MspdiPackage.WORK_CONTOUR_TYPE_OBJECT:
				return validateWorkContourTypeObject((WorkContourType)value, diagnostics, context);
			case MspdiPackage.WORK_FORMAT_TYPE_OBJECT:
				return validateWorkFormatTypeObject((WorkFormatType)value, diagnostics, context);
			case MspdiPackage.WORK_GROUP_TYPE_OBJECT:
				return validateWorkGroupTypeObject((WorkGroupType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignmentsType(AssignmentsType assignmentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignmentType(AssignmentType assignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityPeriodsType(AvailabilityPeriodsType availabilityPeriodsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(availabilityPeriodsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailabilityPeriodType(AvailabilityPeriodType availabilityPeriodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(availabilityPeriodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaselineType(BaselineType baselineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baselineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaselineType1(BaselineType1 baselineType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baselineType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaselineType2(BaselineType2 baselineType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baselineType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarsType(CalendarsType calendarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarType(CalendarType calendarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(calendarType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionsType(ExceptionsType exceptionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exceptionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionType(ExceptionType exceptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exceptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedAttributesType(ExtendedAttributesType extendedAttributesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedAttributesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedAttributeType(ExtendedAttributeType extendedAttributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedAttributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedAttributeType1(ExtendedAttributeType1 extendedAttributeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedAttributeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedAttributeType2(ExtendedAttributeType2 extendedAttributeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedAttributeType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedAttributeType3(ExtendedAttributeType3 extendedAttributeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedAttributeType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasksType(MasksType masksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskType(MaskType maskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineCodesType(OutlineCodesType outlineCodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outlineCodesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineCodeType(OutlineCodeType outlineCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outlineCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineCodeType1(OutlineCodeType1 outlineCodeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outlineCodeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineCodeType2(OutlineCodeType2 outlineCodeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outlineCodeType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredecessorLinkType(PredecessorLinkType predecessorLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predecessorLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectType(ProjectType projectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatesType(RatesType ratesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateType(RateType rateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcesType(ResourcesType resourcesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourcesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceType(ResourceType resourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTasksType(TasksType tasksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tasksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePeriodType(TimePeriodType timePeriodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePeriodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePeriodType1(TimePeriodType1 timePeriodType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePeriodType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePeriodType2(TimePeriodType2 timePeriodType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePeriodType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimephasedDataType(TimephasedDataType timephasedDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timephasedDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueListType(ValueListType valueListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuesType(ValuesType valuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType1(ValueType1 valueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWBSMasksType(WBSMasksType wbsMasksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wbsMasksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWBSMaskType(WBSMaskType wbsMaskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wbsMaskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekDaysType(WeekDaysType weekDaysType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weekDaysType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekDayType(WeekDayType weekDayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weekDayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekDayType1(WeekDayType1 weekDayType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weekDayType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkingTimesType(WorkingTimesType workingTimesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workingTimesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkingTimesType1(WorkingTimesType1 workingTimesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workingTimesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkingTimeType(WorkingTimeType workingTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workingTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkingTimeType1(WorkingTimeType1 workingTimeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workingTimeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkWeeksType(WorkWeeksType workWeeksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workWeeksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkWeekType(WorkWeekType workWeekType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workWeekType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccrueAtType(AccrueAtType accrueAtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaselineForEarnedValueType(BaselineForEarnedValueType baselineForEarnedValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingTypeType(BookingTypeType bookingTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingTypeType1(BookingTypeType1 bookingTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationTypeType(CalculationTypeType calculationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCFTypeType(CFTypeType cfTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommitmentTypeType(CommitmentTypeType commitmentTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintTypeType(ConstraintTypeType constraintTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostRateTableType(CostRateTableType costRateTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencySymbolPositionType(CurrencySymbolPositionType currencySymbolPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayTypeType(DayTypeType dayTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayTypeType1(DayTypeType1 dayTypeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultFixedCostAccrualType(DefaultFixedCostAccrualType defaultFixedCostAccrualType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultTaskEVMethodType(DefaultTaskEVMethodType defaultTaskEVMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultTaskTypeType(DefaultTaskTypeType defaultTaskTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatType(DurationFormatType durationFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatType1(DurationFormatType1 durationFormatType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatType2(DurationFormatType2 durationFormatType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatType3(DurationFormatType3 durationFormatType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatType4(DurationFormatType4 durationFormatType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatType5(DurationFormatType5 durationFormatType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarnedValueMethodType(EarnedValueMethodType earnedValueMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarnedValueMethodType1(EarnedValueMethodType1 earnedValueMethodType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElemTypeType(ElemTypeType elemTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedCostAccrualType(FixedCostAccrualType fixedCostAccrualType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFYStartDateType(FYStartDateType fyStartDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLagFormatType(LagFormatType lagFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelingDelayFormatType(LevelingDelayFormatType levelingDelayFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelingDelayFormatType1(LevelingDelayFormatType1 levelingDelayFormatType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonthItemType(MonthItemType monthItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonthPositionType(MonthPositionType monthPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonthType(MonthType monthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewTaskStartDateType(NewTaskStartDateType newTaskStartDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOvertimeRateFormatType(OvertimeRateFormatType overtimeRateFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOvertimeRateFormatType1(OvertimeRateFormatType1 overtimeRateFormatType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateTableType(RateTableType rateTableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRollupTypeType(RollupTypeType rollupTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardRateFormatType(StandardRateFormatType standardRateFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardRateFormatType1(StandardRateFormatType1 standardRateFormatType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType2(TypeType2 typeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType3(TypeType3 typeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType4(TypeType4 typeType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType5(TypeType5 typeType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType6(TypeType6 typeType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType7(TypeType7 typeType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuelistSortOrderType(ValuelistSortOrderType valuelistSortOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekStartDayType(WeekStartDayType weekStartDayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkContourType(WorkContourType workContourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFormatType(WorkFormatType workFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkGroupType(WorkGroupType workGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccrueAtTypeObject(AccrueAtType accrueAtTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveDirectoryGUIDType(String activeDirectoryGUIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateActiveDirectoryGUIDType_MaxLength(activeDirectoryGUIDType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Active Directory GUID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveDirectoryGUIDType_MaxLength(String activeDirectoryGUIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = activeDirectoryGUIDType.length();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.ACTIVE_DIRECTORY_GUID_TYPE, activeDirectoryGUIDType, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasType(String aliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAliasType_MaxLength(aliasType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasType_MaxLength(String aliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = aliasType.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.ALIAS_TYPE, aliasType, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorType(String authorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAuthorType_MaxLength(authorType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Author Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorType_MaxLength(String authorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = authorType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.AUTHOR_TYPE, authorType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaselineForEarnedValueTypeObject(BaselineForEarnedValueType baselineForEarnedValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingTypeTypeObject(BookingTypeType bookingTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookingTypeTypeObject1(BookingTypeType1 bookingTypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalculationTypeTypeObject(CalculationTypeType calculationTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryType(String categoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCategoryType_MaxLength(categoryType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryType_MaxLength(String categoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = categoryType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.CATEGORY_TYPE, categoryType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCFTypeTypeObject(CFTypeType cfTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeType(String codeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodeType_MaxLength(codeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeType_MaxLength(String codeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = codeType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.CODE_TYPE, codeType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommitmentTypeTypeObject(CommitmentTypeType commitmentTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyType(String companyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCompanyType_MaxLength(companyType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Company Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompanyType_MaxLength(String companyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = companyType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.COMPANY_TYPE, companyType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintTypeTypeObject(ConstraintTypeType constraintTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactType(String contactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateContactType_MaxLength(contactType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Contact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactType_MaxLength(String contactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = contactType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.CONTACT_TYPE, contactType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCostRateTableTypeObject(CostRateTableType costRateTableTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyCodeType(String currencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCurrencyCodeType_MaxLength(currencyCodeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Currency Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyCodeType_MaxLength(String currencyCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = currencyCodeType.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.CURRENCY_CODE_TYPE, currencyCodeType, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencySymbolPositionTypeObject(CurrencySymbolPositionType currencySymbolPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencySymbolType(String currencySymbolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCurrencySymbolType_MaxLength(currencySymbolType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Currency Symbol Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencySymbolType_MaxLength(String currencySymbolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = currencySymbolType.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.CURRENCY_SYMBOL_TYPE, currencySymbolType, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayTypeTypeObject(DayTypeType dayTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayTypeTypeObject1(DayTypeType1 dayTypeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultFixedCostAccrualTypeObject(DefaultFixedCostAccrualType defaultFixedCostAccrualTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultTaskEVMethodTypeObject(DefaultTaskEVMethodType defaultTaskEVMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultTaskTypeTypeObject(DefaultTaskTypeType defaultTaskTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatTypeObject(DurationFormatType4 durationFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatTypeObject1(DurationFormatType1 durationFormatTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatTypeObject2(DurationFormatType2 durationFormatTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatTypeObject3(DurationFormatType3 durationFormatTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatTypeObject4(DurationFormatType durationFormatTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationFormatTypeObject5(DurationFormatType5 durationFormatTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarnedValueMethodTypeObject(EarnedValueMethodType earnedValueMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarnedValueMethodTypeObject1(EarnedValueMethodType1 earnedValueMethodTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElemTypeTypeObject(ElemTypeType elemTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType(String emailAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEmailAddressType_MaxLength(emailAddressType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Email Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmailAddressType_MaxLength(String emailAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = emailAddressType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.EMAIL_ADDRESS_TYPE, emailAddressType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalTaskProjectType(String externalTaskProjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExternalTaskProjectType_MaxLength(externalTaskProjectType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>External Task Project Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalTaskProjectType_MaxLength(String externalTaskProjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = externalTaskProjectType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.EXTERNAL_TASK_PROJECT_TYPE, externalTaskProjectType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedCostAccrualTypeObject(FixedCostAccrualType fixedCostAccrualTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFYStartDateTypeObject(FYStartDateType fyStartDateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(String groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGroupType_MaxLength(groupType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType_MaxLength(String groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = groupType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.GROUP_TYPE, groupType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkAddressType(String hyperlinkAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkAddressType_MaxLength(hyperlinkAddressType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkAddressType_MaxLength(String hyperlinkAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkAddressType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_ADDRESS_TYPE, hyperlinkAddressType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkAddressType1(String hyperlinkAddressType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkAddressType1_MaxLength(hyperlinkAddressType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Address Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkAddressType1_MaxLength(String hyperlinkAddressType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkAddressType1.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_ADDRESS_TYPE1, hyperlinkAddressType1, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkAddressType2(String hyperlinkAddressType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkAddressType2_MaxLength(hyperlinkAddressType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Address Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkAddressType2_MaxLength(String hyperlinkAddressType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkAddressType2.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_ADDRESS_TYPE2, hyperlinkAddressType2, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkSubAddressType(String hyperlinkSubAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkSubAddressType_MaxLength(hyperlinkSubAddressType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Sub Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkSubAddressType_MaxLength(String hyperlinkSubAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkSubAddressType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_SUB_ADDRESS_TYPE, hyperlinkSubAddressType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkSubAddressType1(String hyperlinkSubAddressType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkSubAddressType1_MaxLength(hyperlinkSubAddressType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Sub Address Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkSubAddressType1_MaxLength(String hyperlinkSubAddressType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkSubAddressType1.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_SUB_ADDRESS_TYPE1, hyperlinkSubAddressType1, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkSubAddressType2(String hyperlinkSubAddressType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkSubAddressType2_MaxLength(hyperlinkSubAddressType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Sub Address Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkSubAddressType2_MaxLength(String hyperlinkSubAddressType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkSubAddressType2.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_SUB_ADDRESS_TYPE2, hyperlinkSubAddressType2, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkType(String hyperlinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkType_MaxLength(hyperlinkType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkType_MaxLength(String hyperlinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_TYPE, hyperlinkType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkType1(String hyperlinkType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkType1_MaxLength(hyperlinkType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkType1_MaxLength(String hyperlinkType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkType1.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_TYPE1, hyperlinkType1, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkType2(String hyperlinkType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHyperlinkType2_MaxLength(hyperlinkType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hyperlink Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHyperlinkType2_MaxLength(String hyperlinkType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hyperlinkType2.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.HYPERLINK_TYPE2, hyperlinkType2, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialsType(String initialsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInitialsType_MaxLength(initialsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Initials Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialsType_MaxLength(String initialsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = initialsType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.INITIALS_TYPE, initialsType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLagFormatTypeObject(LagFormatType lagFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelingDelayFormatTypeObject(LevelingDelayFormatType levelingDelayFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelingDelayFormatTypeObject1(LevelingDelayFormatType1 levelingDelayFormatTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerType(String managerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateManagerType_MaxLength(managerType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagerType_MaxLength(String managerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = managerType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.MANAGER_TYPE, managerType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialLabelType(String materialLabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaterialLabelType_MaxLength(materialLabelType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Material Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialLabelType_MaxLength(String materialLabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = materialLabelType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.MATERIAL_LABEL_TYPE, materialLabelType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonthItemTypeObject(MonthItemType monthItemTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonthPositionTypeObject(MonthPositionType monthPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonthTypeObject(MonthType monthTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType_MaxLength(nameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_MaxLength(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.NAME_TYPE, nameType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType1(String nameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType1_MaxLength(nameType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType1_MaxLength(String nameType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType1.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.NAME_TYPE1, nameType1, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType2(String nameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType2_MaxLength(nameType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType2_MaxLength(String nameType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType2.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.NAME_TYPE2, nameType2, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType3(String nameType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType3_MaxLength(nameType3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType3_MaxLength(String nameType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType3.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.NAME_TYPE3, nameType3, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType4(String nameType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType4_MaxLength(nameType4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType4_MaxLength(String nameType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType4.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.NAME_TYPE4, nameType4, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType5(String nameType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType5_MaxLength(nameType5, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType5_MaxLength(String nameType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType5.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.NAME_TYPE5, nameType5, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewTaskStartDateTypeObject(NewTaskStartDateType newTaskStartDateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNTAccountType(String ntAccountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNTAccountType_MaxLength(ntAccountType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>NT Account Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNTAccountType_MaxLength(String ntAccountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ntAccountType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.NT_ACCOUNT_TYPE, ntAccountType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineNumberType(String outlineNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOutlineNumberType_MaxLength(outlineNumberType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Outline Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutlineNumberType_MaxLength(String outlineNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = outlineNumberType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.OUTLINE_NUMBER_TYPE, outlineNumberType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOvertimeRateFormatTypeObject(OvertimeRateFormatType overtimeRateFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOvertimeRateFormatTypeObject1(OvertimeRateFormatType1 overtimeRateFormatTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneticAliasType(String phoneticAliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePhoneticAliasType_MaxLength(phoneticAliasType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Phonetic Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneticAliasType_MaxLength(String phoneticAliasType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = phoneticAliasType.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.PHONETIC_ALIAS_TYPE, phoneticAliasType, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneticsType(String phoneticsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePhoneticsType_MaxLength(phoneticsType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Phonetics Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneticsType_MaxLength(String phoneticsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = phoneticsType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.PHONETICS_TYPE, phoneticsType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixType(String prefixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrefixType_MaxLength(prefixType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Prefix Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixType_MaxLength(String prefixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = prefixType.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.PREFIX_TYPE, prefixType, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateTableTypeObject(RateTableType rateTableTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRollupTypeTypeObject(RollupTypeType rollupTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardRateFormatTypeObject(StandardRateFormatType standardRateFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardRateFormatTypeObject1(StandardRateFormatType1 standardRateFormatTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectType(String subjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubjectType_MaxLength(subjectType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Subject Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectType_MaxLength(String subjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = subjectType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.SUBJECT_TYPE, subjectType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprojectNameType(String subprojectNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubprojectNameType_MaxLength(subprojectNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Subproject Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubprojectNameType_MaxLength(String subprojectNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = subprojectNameType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.SUBPROJECT_NAME_TYPE, subprojectNameType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(String titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTitleType_MaxLength(titleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType_MaxLength(String titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = titleType.length();
		boolean result = length <= 512;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.TITLE_TYPE, titleType, length, 512, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType3 typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType5 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject2(TypeType typeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject3(TypeType1 typeTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject4(TypeType2 typeTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject5(TypeType4 typeTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject6(TypeType6 typeTypeObject6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject7(TypeType7 typeTypeObject7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIDType(String uidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUIDType_MaxLength(uidType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>UID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIDType_MaxLength(String uidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uidType.length();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MspdiPackage.Literals.UID_TYPE, uidType, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitTypeObject(UnitType unitTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuelistSortOrderTypeObject(ValuelistSortOrderType valuelistSortOrderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekStartDayTypeObject(WeekStartDayType weekStartDayTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkContourTypeObject(WorkContourType workContourTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFormatTypeObject(WorkFormatType workFormatTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkGroupTypeObject(WorkGroupType workGroupTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MspdiValidator
