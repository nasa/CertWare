/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import net.certware.planning.mspdi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MspdiFactoryImpl extends EFactoryImpl implements MspdiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MspdiFactory init() {
		try {
			MspdiFactory theMspdiFactory = (MspdiFactory)EPackage.Registry.INSTANCE.getEFactory("http://schemas.microsoft.com/project"); 
			if (theMspdiFactory != null) {
				return theMspdiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MspdiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MspdiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MspdiPackage.ASSIGNMENTS_TYPE: return createAssignmentsType();
			case MspdiPackage.ASSIGNMENT_TYPE: return createAssignmentType();
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE: return createAvailabilityPeriodsType();
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE: return createAvailabilityPeriodType();
			case MspdiPackage.BASELINE_TYPE: return createBaselineType();
			case MspdiPackage.BASELINE_TYPE1: return createBaselineType1();
			case MspdiPackage.BASELINE_TYPE2: return createBaselineType2();
			case MspdiPackage.CALENDARS_TYPE: return createCalendarsType();
			case MspdiPackage.CALENDAR_TYPE: return createCalendarType();
			case MspdiPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MspdiPackage.EXCEPTIONS_TYPE: return createExceptionsType();
			case MspdiPackage.EXCEPTION_TYPE: return createExceptionType();
			case MspdiPackage.EXTENDED_ATTRIBUTES_TYPE: return createExtendedAttributesType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE: return createExtendedAttributeType();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE1: return createExtendedAttributeType1();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE2: return createExtendedAttributeType2();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3: return createExtendedAttributeType3();
			case MspdiPackage.MASKS_TYPE: return createMasksType();
			case MspdiPackage.MASK_TYPE: return createMaskType();
			case MspdiPackage.OUTLINE_CODES_TYPE: return createOutlineCodesType();
			case MspdiPackage.OUTLINE_CODE_TYPE: return createOutlineCodeType();
			case MspdiPackage.OUTLINE_CODE_TYPE1: return createOutlineCodeType1();
			case MspdiPackage.OUTLINE_CODE_TYPE2: return createOutlineCodeType2();
			case MspdiPackage.PREDECESSOR_LINK_TYPE: return createPredecessorLinkType();
			case MspdiPackage.PROJECT_TYPE: return createProjectType();
			case MspdiPackage.RATES_TYPE: return createRatesType();
			case MspdiPackage.RATE_TYPE: return createRateType();
			case MspdiPackage.RESOURCES_TYPE: return createResourcesType();
			case MspdiPackage.RESOURCE_TYPE: return createResourceType();
			case MspdiPackage.TASKS_TYPE: return createTasksType();
			case MspdiPackage.TASK_TYPE: return createTaskType();
			case MspdiPackage.TIME_PERIOD_TYPE: return createTimePeriodType();
			case MspdiPackage.TIME_PERIOD_TYPE1: return createTimePeriodType1();
			case MspdiPackage.TIME_PERIOD_TYPE2: return createTimePeriodType2();
			case MspdiPackage.TIMEPHASED_DATA_TYPE: return createTimephasedDataType();
			case MspdiPackage.VALUE_LIST_TYPE: return createValueListType();
			case MspdiPackage.VALUES_TYPE: return createValuesType();
			case MspdiPackage.VALUE_TYPE: return createValueType();
			case MspdiPackage.VALUE_TYPE1: return createValueType1();
			case MspdiPackage.WBS_MASKS_TYPE: return createWBSMasksType();
			case MspdiPackage.WBS_MASK_TYPE: return createWBSMaskType();
			case MspdiPackage.WEEK_DAYS_TYPE: return createWeekDaysType();
			case MspdiPackage.WEEK_DAY_TYPE: return createWeekDayType();
			case MspdiPackage.WEEK_DAY_TYPE1: return createWeekDayType1();
			case MspdiPackage.WORKING_TIMES_TYPE: return createWorkingTimesType();
			case MspdiPackage.WORKING_TIMES_TYPE1: return createWorkingTimesType1();
			case MspdiPackage.WORKING_TIME_TYPE: return createWorkingTimeType();
			case MspdiPackage.WORKING_TIME_TYPE1: return createWorkingTimeType1();
			case MspdiPackage.WORK_WEEKS_TYPE: return createWorkWeeksType();
			case MspdiPackage.WORK_WEEK_TYPE: return createWorkWeekType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MspdiPackage.ACCRUE_AT_TYPE:
				return createAccrueAtTypeFromString(eDataType, initialValue);
			case MspdiPackage.BASELINE_FOR_EARNED_VALUE_TYPE:
				return createBaselineForEarnedValueTypeFromString(eDataType, initialValue);
			case MspdiPackage.BOOKING_TYPE_TYPE:
				return createBookingTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.BOOKING_TYPE_TYPE1:
				return createBookingTypeType1FromString(eDataType, initialValue);
			case MspdiPackage.CALCULATION_TYPE_TYPE:
				return createCalculationTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.CF_TYPE_TYPE:
				return createCFTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.COMMITMENT_TYPE_TYPE:
				return createCommitmentTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.CONSTRAINT_TYPE_TYPE:
				return createConstraintTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.COST_RATE_TABLE_TYPE:
				return createCostRateTableTypeFromString(eDataType, initialValue);
			case MspdiPackage.CURRENCY_SYMBOL_POSITION_TYPE:
				return createCurrencySymbolPositionTypeFromString(eDataType, initialValue);
			case MspdiPackage.DAY_TYPE_TYPE:
				return createDayTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.DAY_TYPE_TYPE1:
				return createDayTypeType1FromString(eDataType, initialValue);
			case MspdiPackage.DEFAULT_FIXED_COST_ACCRUAL_TYPE:
				return createDefaultFixedCostAccrualTypeFromString(eDataType, initialValue);
			case MspdiPackage.DEFAULT_TASK_EV_METHOD_TYPE:
				return createDefaultTaskEVMethodTypeFromString(eDataType, initialValue);
			case MspdiPackage.DEFAULT_TASK_TYPE_TYPE:
				return createDefaultTaskTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE:
				return createDurationFormatTypeFromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE1:
				return createDurationFormatType1FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE2:
				return createDurationFormatType2FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE3:
				return createDurationFormatType3FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE4:
				return createDurationFormatType4FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE5:
				return createDurationFormatType5FromString(eDataType, initialValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE:
				return createEarnedValueMethodTypeFromString(eDataType, initialValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE1:
				return createEarnedValueMethodType1FromString(eDataType, initialValue);
			case MspdiPackage.ELEM_TYPE_TYPE:
				return createElemTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.FIXED_COST_ACCRUAL_TYPE:
				return createFixedCostAccrualTypeFromString(eDataType, initialValue);
			case MspdiPackage.FY_START_DATE_TYPE:
				return createFYStartDateTypeFromString(eDataType, initialValue);
			case MspdiPackage.LAG_FORMAT_TYPE:
				return createLagFormatTypeFromString(eDataType, initialValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE:
				return createLevelingDelayFormatTypeFromString(eDataType, initialValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE1:
				return createLevelingDelayFormatType1FromString(eDataType, initialValue);
			case MspdiPackage.MONTH_ITEM_TYPE:
				return createMonthItemTypeFromString(eDataType, initialValue);
			case MspdiPackage.MONTH_POSITION_TYPE:
				return createMonthPositionTypeFromString(eDataType, initialValue);
			case MspdiPackage.MONTH_TYPE:
				return createMonthTypeFromString(eDataType, initialValue);
			case MspdiPackage.NEW_TASK_START_DATE_TYPE:
				return createNewTaskStartDateTypeFromString(eDataType, initialValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE:
				return createOvertimeRateFormatTypeFromString(eDataType, initialValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE1:
				return createOvertimeRateFormatType1FromString(eDataType, initialValue);
			case MspdiPackage.RATE_TABLE_TYPE:
				return createRateTableTypeFromString(eDataType, initialValue);
			case MspdiPackage.ROLLUP_TYPE_TYPE:
				return createRollupTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE:
				return createStandardRateFormatTypeFromString(eDataType, initialValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE1:
				return createStandardRateFormatType1FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE2:
				return createTypeType2FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE3:
				return createTypeType3FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE4:
				return createTypeType4FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE5:
				return createTypeType5FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE6:
				return createTypeType6FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE7:
				return createTypeType7FromString(eDataType, initialValue);
			case MspdiPackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case MspdiPackage.VALUELIST_SORT_ORDER_TYPE:
				return createValuelistSortOrderTypeFromString(eDataType, initialValue);
			case MspdiPackage.WEEK_START_DAY_TYPE:
				return createWeekStartDayTypeFromString(eDataType, initialValue);
			case MspdiPackage.WORK_CONTOUR_TYPE:
				return createWorkContourTypeFromString(eDataType, initialValue);
			case MspdiPackage.WORK_FORMAT_TYPE:
				return createWorkFormatTypeFromString(eDataType, initialValue);
			case MspdiPackage.WORK_GROUP_TYPE:
				return createWorkGroupTypeFromString(eDataType, initialValue);
			case MspdiPackage.ACCRUE_AT_TYPE_OBJECT:
				return createAccrueAtTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.ACTIVE_DIRECTORY_GUID_TYPE:
				return createActiveDirectoryGUIDTypeFromString(eDataType, initialValue);
			case MspdiPackage.ALIAS_TYPE:
				return createAliasTypeFromString(eDataType, initialValue);
			case MspdiPackage.AUTHOR_TYPE:
				return createAuthorTypeFromString(eDataType, initialValue);
			case MspdiPackage.BASELINE_FOR_EARNED_VALUE_TYPE_OBJECT:
				return createBaselineForEarnedValueTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.BOOKING_TYPE_TYPE_OBJECT:
				return createBookingTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.BOOKING_TYPE_TYPE_OBJECT1:
				return createBookingTypeTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.CALCULATION_TYPE_TYPE_OBJECT:
				return createCalculationTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.CATEGORY_TYPE:
				return createCategoryTypeFromString(eDataType, initialValue);
			case MspdiPackage.CF_TYPE_TYPE_OBJECT:
				return createCFTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.CODE_TYPE:
				return createCodeTypeFromString(eDataType, initialValue);
			case MspdiPackage.COMMITMENT_TYPE_TYPE_OBJECT:
				return createCommitmentTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.COMPANY_TYPE:
				return createCompanyTypeFromString(eDataType, initialValue);
			case MspdiPackage.CONSTRAINT_TYPE_TYPE_OBJECT:
				return createConstraintTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.CONTACT_TYPE:
				return createContactTypeFromString(eDataType, initialValue);
			case MspdiPackage.COST_RATE_TABLE_TYPE_OBJECT:
				return createCostRateTableTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.CURRENCY_CODE_TYPE:
				return createCurrencyCodeTypeFromString(eDataType, initialValue);
			case MspdiPackage.CURRENCY_SYMBOL_POSITION_TYPE_OBJECT:
				return createCurrencySymbolPositionTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.CURRENCY_SYMBOL_TYPE:
				return createCurrencySymbolTypeFromString(eDataType, initialValue);
			case MspdiPackage.DAY_TYPE_TYPE_OBJECT:
				return createDayTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.DAY_TYPE_TYPE_OBJECT1:
				return createDayTypeTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.DEFAULT_FIXED_COST_ACCRUAL_TYPE_OBJECT:
				return createDefaultFixedCostAccrualTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.DEFAULT_TASK_EV_METHOD_TYPE_OBJECT:
				return createDefaultTaskEVMethodTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.DEFAULT_TASK_TYPE_TYPE_OBJECT:
				return createDefaultTaskTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT:
				return createDurationFormatTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT1:
				return createDurationFormatTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT2:
				return createDurationFormatTypeObject2FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT3:
				return createDurationFormatTypeObject3FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT4:
				return createDurationFormatTypeObject4FromString(eDataType, initialValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT5:
				return createDurationFormatTypeObject5FromString(eDataType, initialValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE_OBJECT:
				return createEarnedValueMethodTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE_OBJECT1:
				return createEarnedValueMethodTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.ELEM_TYPE_TYPE_OBJECT:
				return createElemTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.EMAIL_ADDRESS_TYPE:
				return createEmailAddressTypeFromString(eDataType, initialValue);
			case MspdiPackage.EXTERNAL_TASK_PROJECT_TYPE:
				return createExternalTaskProjectTypeFromString(eDataType, initialValue);
			case MspdiPackage.FIXED_COST_ACCRUAL_TYPE_OBJECT:
				return createFixedCostAccrualTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.FY_START_DATE_TYPE_OBJECT:
				return createFYStartDateTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.GROUP_TYPE:
				return createGroupTypeFromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE:
				return createHyperlinkAddressTypeFromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE1:
				return createHyperlinkAddressType1FromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE2:
				return createHyperlinkAddressType2FromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE:
				return createHyperlinkSubAddressTypeFromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE1:
				return createHyperlinkSubAddressType1FromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE2:
				return createHyperlinkSubAddressType2FromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_TYPE:
				return createHyperlinkTypeFromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_TYPE1:
				return createHyperlinkType1FromString(eDataType, initialValue);
			case MspdiPackage.HYPERLINK_TYPE2:
				return createHyperlinkType2FromString(eDataType, initialValue);
			case MspdiPackage.INITIALS_TYPE:
				return createInitialsTypeFromString(eDataType, initialValue);
			case MspdiPackage.LAG_FORMAT_TYPE_OBJECT:
				return createLagFormatTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE_OBJECT:
				return createLevelingDelayFormatTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE_OBJECT1:
				return createLevelingDelayFormatTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.MANAGER_TYPE:
				return createManagerTypeFromString(eDataType, initialValue);
			case MspdiPackage.MATERIAL_LABEL_TYPE:
				return createMaterialLabelTypeFromString(eDataType, initialValue);
			case MspdiPackage.MONTH_ITEM_TYPE_OBJECT:
				return createMonthItemTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.MONTH_POSITION_TYPE_OBJECT:
				return createMonthPositionTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.MONTH_TYPE_OBJECT:
				return createMonthTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
			case MspdiPackage.NAME_TYPE1:
				return createNameType1FromString(eDataType, initialValue);
			case MspdiPackage.NAME_TYPE2:
				return createNameType2FromString(eDataType, initialValue);
			case MspdiPackage.NAME_TYPE3:
				return createNameType3FromString(eDataType, initialValue);
			case MspdiPackage.NAME_TYPE4:
				return createNameType4FromString(eDataType, initialValue);
			case MspdiPackage.NAME_TYPE5:
				return createNameType5FromString(eDataType, initialValue);
			case MspdiPackage.NEW_TASK_START_DATE_TYPE_OBJECT:
				return createNewTaskStartDateTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.NT_ACCOUNT_TYPE:
				return createNTAccountTypeFromString(eDataType, initialValue);
			case MspdiPackage.OUTLINE_NUMBER_TYPE:
				return createOutlineNumberTypeFromString(eDataType, initialValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE_OBJECT:
				return createOvertimeRateFormatTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE_OBJECT1:
				return createOvertimeRateFormatTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.PHONETIC_ALIAS_TYPE:
				return createPhoneticAliasTypeFromString(eDataType, initialValue);
			case MspdiPackage.PHONETICS_TYPE:
				return createPhoneticsTypeFromString(eDataType, initialValue);
			case MspdiPackage.PREFIX_TYPE:
				return createPrefixTypeFromString(eDataType, initialValue);
			case MspdiPackage.RATE_TABLE_TYPE_OBJECT:
				return createRateTableTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.ROLLUP_TYPE_TYPE_OBJECT:
				return createRollupTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE_OBJECT:
				return createStandardRateFormatTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE_OBJECT1:
				return createStandardRateFormatTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.SUBJECT_TYPE:
				return createSubjectTypeFromString(eDataType, initialValue);
			case MspdiPackage.SUBPROJECT_NAME_TYPE:
				return createSubprojectNameTypeFromString(eDataType, initialValue);
			case MspdiPackage.TITLE_TYPE:
				return createTitleTypeFromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT2:
				return createTypeTypeObject2FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT3:
				return createTypeTypeObject3FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT4:
				return createTypeTypeObject4FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT5:
				return createTypeTypeObject5FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT6:
				return createTypeTypeObject6FromString(eDataType, initialValue);
			case MspdiPackage.TYPE_TYPE_OBJECT7:
				return createTypeTypeObject7FromString(eDataType, initialValue);
			case MspdiPackage.UID_TYPE:
				return createUIDTypeFromString(eDataType, initialValue);
			case MspdiPackage.UNIT_TYPE_OBJECT:
				return createUnitTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.VALUELIST_SORT_ORDER_TYPE_OBJECT:
				return createValuelistSortOrderTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.WEEK_START_DAY_TYPE_OBJECT:
				return createWeekStartDayTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.WORK_CONTOUR_TYPE_OBJECT:
				return createWorkContourTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.WORK_FORMAT_TYPE_OBJECT:
				return createWorkFormatTypeObjectFromString(eDataType, initialValue);
			case MspdiPackage.WORK_GROUP_TYPE_OBJECT:
				return createWorkGroupTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MspdiPackage.ACCRUE_AT_TYPE:
				return convertAccrueAtTypeToString(eDataType, instanceValue);
			case MspdiPackage.BASELINE_FOR_EARNED_VALUE_TYPE:
				return convertBaselineForEarnedValueTypeToString(eDataType, instanceValue);
			case MspdiPackage.BOOKING_TYPE_TYPE:
				return convertBookingTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.BOOKING_TYPE_TYPE1:
				return convertBookingTypeType1ToString(eDataType, instanceValue);
			case MspdiPackage.CALCULATION_TYPE_TYPE:
				return convertCalculationTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.CF_TYPE_TYPE:
				return convertCFTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.COMMITMENT_TYPE_TYPE:
				return convertCommitmentTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.CONSTRAINT_TYPE_TYPE:
				return convertConstraintTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.COST_RATE_TABLE_TYPE:
				return convertCostRateTableTypeToString(eDataType, instanceValue);
			case MspdiPackage.CURRENCY_SYMBOL_POSITION_TYPE:
				return convertCurrencySymbolPositionTypeToString(eDataType, instanceValue);
			case MspdiPackage.DAY_TYPE_TYPE:
				return convertDayTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.DAY_TYPE_TYPE1:
				return convertDayTypeType1ToString(eDataType, instanceValue);
			case MspdiPackage.DEFAULT_FIXED_COST_ACCRUAL_TYPE:
				return convertDefaultFixedCostAccrualTypeToString(eDataType, instanceValue);
			case MspdiPackage.DEFAULT_TASK_EV_METHOD_TYPE:
				return convertDefaultTaskEVMethodTypeToString(eDataType, instanceValue);
			case MspdiPackage.DEFAULT_TASK_TYPE_TYPE:
				return convertDefaultTaskTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE:
				return convertDurationFormatTypeToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE1:
				return convertDurationFormatType1ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE2:
				return convertDurationFormatType2ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE3:
				return convertDurationFormatType3ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE4:
				return convertDurationFormatType4ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE5:
				return convertDurationFormatType5ToString(eDataType, instanceValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE:
				return convertEarnedValueMethodTypeToString(eDataType, instanceValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE1:
				return convertEarnedValueMethodType1ToString(eDataType, instanceValue);
			case MspdiPackage.ELEM_TYPE_TYPE:
				return convertElemTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.FIXED_COST_ACCRUAL_TYPE:
				return convertFixedCostAccrualTypeToString(eDataType, instanceValue);
			case MspdiPackage.FY_START_DATE_TYPE:
				return convertFYStartDateTypeToString(eDataType, instanceValue);
			case MspdiPackage.LAG_FORMAT_TYPE:
				return convertLagFormatTypeToString(eDataType, instanceValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE:
				return convertLevelingDelayFormatTypeToString(eDataType, instanceValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE1:
				return convertLevelingDelayFormatType1ToString(eDataType, instanceValue);
			case MspdiPackage.MONTH_ITEM_TYPE:
				return convertMonthItemTypeToString(eDataType, instanceValue);
			case MspdiPackage.MONTH_POSITION_TYPE:
				return convertMonthPositionTypeToString(eDataType, instanceValue);
			case MspdiPackage.MONTH_TYPE:
				return convertMonthTypeToString(eDataType, instanceValue);
			case MspdiPackage.NEW_TASK_START_DATE_TYPE:
				return convertNewTaskStartDateTypeToString(eDataType, instanceValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE:
				return convertOvertimeRateFormatTypeToString(eDataType, instanceValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE1:
				return convertOvertimeRateFormatType1ToString(eDataType, instanceValue);
			case MspdiPackage.RATE_TABLE_TYPE:
				return convertRateTableTypeToString(eDataType, instanceValue);
			case MspdiPackage.ROLLUP_TYPE_TYPE:
				return convertRollupTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE:
				return convertStandardRateFormatTypeToString(eDataType, instanceValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE1:
				return convertStandardRateFormatType1ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE2:
				return convertTypeType2ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE3:
				return convertTypeType3ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE4:
				return convertTypeType4ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE5:
				return convertTypeType5ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE6:
				return convertTypeType6ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE7:
				return convertTypeType7ToString(eDataType, instanceValue);
			case MspdiPackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case MspdiPackage.VALUELIST_SORT_ORDER_TYPE:
				return convertValuelistSortOrderTypeToString(eDataType, instanceValue);
			case MspdiPackage.WEEK_START_DAY_TYPE:
				return convertWeekStartDayTypeToString(eDataType, instanceValue);
			case MspdiPackage.WORK_CONTOUR_TYPE:
				return convertWorkContourTypeToString(eDataType, instanceValue);
			case MspdiPackage.WORK_FORMAT_TYPE:
				return convertWorkFormatTypeToString(eDataType, instanceValue);
			case MspdiPackage.WORK_GROUP_TYPE:
				return convertWorkGroupTypeToString(eDataType, instanceValue);
			case MspdiPackage.ACCRUE_AT_TYPE_OBJECT:
				return convertAccrueAtTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.ACTIVE_DIRECTORY_GUID_TYPE:
				return convertActiveDirectoryGUIDTypeToString(eDataType, instanceValue);
			case MspdiPackage.ALIAS_TYPE:
				return convertAliasTypeToString(eDataType, instanceValue);
			case MspdiPackage.AUTHOR_TYPE:
				return convertAuthorTypeToString(eDataType, instanceValue);
			case MspdiPackage.BASELINE_FOR_EARNED_VALUE_TYPE_OBJECT:
				return convertBaselineForEarnedValueTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.BOOKING_TYPE_TYPE_OBJECT:
				return convertBookingTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.BOOKING_TYPE_TYPE_OBJECT1:
				return convertBookingTypeTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.CALCULATION_TYPE_TYPE_OBJECT:
				return convertCalculationTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.CATEGORY_TYPE:
				return convertCategoryTypeToString(eDataType, instanceValue);
			case MspdiPackage.CF_TYPE_TYPE_OBJECT:
				return convertCFTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.CODE_TYPE:
				return convertCodeTypeToString(eDataType, instanceValue);
			case MspdiPackage.COMMITMENT_TYPE_TYPE_OBJECT:
				return convertCommitmentTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.COMPANY_TYPE:
				return convertCompanyTypeToString(eDataType, instanceValue);
			case MspdiPackage.CONSTRAINT_TYPE_TYPE_OBJECT:
				return convertConstraintTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.CONTACT_TYPE:
				return convertContactTypeToString(eDataType, instanceValue);
			case MspdiPackage.COST_RATE_TABLE_TYPE_OBJECT:
				return convertCostRateTableTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.CURRENCY_CODE_TYPE:
				return convertCurrencyCodeTypeToString(eDataType, instanceValue);
			case MspdiPackage.CURRENCY_SYMBOL_POSITION_TYPE_OBJECT:
				return convertCurrencySymbolPositionTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.CURRENCY_SYMBOL_TYPE:
				return convertCurrencySymbolTypeToString(eDataType, instanceValue);
			case MspdiPackage.DAY_TYPE_TYPE_OBJECT:
				return convertDayTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.DAY_TYPE_TYPE_OBJECT1:
				return convertDayTypeTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.DEFAULT_FIXED_COST_ACCRUAL_TYPE_OBJECT:
				return convertDefaultFixedCostAccrualTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.DEFAULT_TASK_EV_METHOD_TYPE_OBJECT:
				return convertDefaultTaskEVMethodTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.DEFAULT_TASK_TYPE_TYPE_OBJECT:
				return convertDefaultTaskTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT:
				return convertDurationFormatTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT1:
				return convertDurationFormatTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT2:
				return convertDurationFormatTypeObject2ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT3:
				return convertDurationFormatTypeObject3ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT4:
				return convertDurationFormatTypeObject4ToString(eDataType, instanceValue);
			case MspdiPackage.DURATION_FORMAT_TYPE_OBJECT5:
				return convertDurationFormatTypeObject5ToString(eDataType, instanceValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE_OBJECT:
				return convertEarnedValueMethodTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.EARNED_VALUE_METHOD_TYPE_OBJECT1:
				return convertEarnedValueMethodTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.ELEM_TYPE_TYPE_OBJECT:
				return convertElemTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.EMAIL_ADDRESS_TYPE:
				return convertEmailAddressTypeToString(eDataType, instanceValue);
			case MspdiPackage.EXTERNAL_TASK_PROJECT_TYPE:
				return convertExternalTaskProjectTypeToString(eDataType, instanceValue);
			case MspdiPackage.FIXED_COST_ACCRUAL_TYPE_OBJECT:
				return convertFixedCostAccrualTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.FY_START_DATE_TYPE_OBJECT:
				return convertFYStartDateTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.GROUP_TYPE:
				return convertGroupTypeToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE:
				return convertHyperlinkAddressTypeToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE1:
				return convertHyperlinkAddressType1ToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_ADDRESS_TYPE2:
				return convertHyperlinkAddressType2ToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE:
				return convertHyperlinkSubAddressTypeToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE1:
				return convertHyperlinkSubAddressType1ToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_SUB_ADDRESS_TYPE2:
				return convertHyperlinkSubAddressType2ToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_TYPE:
				return convertHyperlinkTypeToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_TYPE1:
				return convertHyperlinkType1ToString(eDataType, instanceValue);
			case MspdiPackage.HYPERLINK_TYPE2:
				return convertHyperlinkType2ToString(eDataType, instanceValue);
			case MspdiPackage.INITIALS_TYPE:
				return convertInitialsTypeToString(eDataType, instanceValue);
			case MspdiPackage.LAG_FORMAT_TYPE_OBJECT:
				return convertLagFormatTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE_OBJECT:
				return convertLevelingDelayFormatTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.LEVELING_DELAY_FORMAT_TYPE_OBJECT1:
				return convertLevelingDelayFormatTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.MANAGER_TYPE:
				return convertManagerTypeToString(eDataType, instanceValue);
			case MspdiPackage.MATERIAL_LABEL_TYPE:
				return convertMaterialLabelTypeToString(eDataType, instanceValue);
			case MspdiPackage.MONTH_ITEM_TYPE_OBJECT:
				return convertMonthItemTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.MONTH_POSITION_TYPE_OBJECT:
				return convertMonthPositionTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.MONTH_TYPE_OBJECT:
				return convertMonthTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
			case MspdiPackage.NAME_TYPE1:
				return convertNameType1ToString(eDataType, instanceValue);
			case MspdiPackage.NAME_TYPE2:
				return convertNameType2ToString(eDataType, instanceValue);
			case MspdiPackage.NAME_TYPE3:
				return convertNameType3ToString(eDataType, instanceValue);
			case MspdiPackage.NAME_TYPE4:
				return convertNameType4ToString(eDataType, instanceValue);
			case MspdiPackage.NAME_TYPE5:
				return convertNameType5ToString(eDataType, instanceValue);
			case MspdiPackage.NEW_TASK_START_DATE_TYPE_OBJECT:
				return convertNewTaskStartDateTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.NT_ACCOUNT_TYPE:
				return convertNTAccountTypeToString(eDataType, instanceValue);
			case MspdiPackage.OUTLINE_NUMBER_TYPE:
				return convertOutlineNumberTypeToString(eDataType, instanceValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE_OBJECT:
				return convertOvertimeRateFormatTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.OVERTIME_RATE_FORMAT_TYPE_OBJECT1:
				return convertOvertimeRateFormatTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.PHONETIC_ALIAS_TYPE:
				return convertPhoneticAliasTypeToString(eDataType, instanceValue);
			case MspdiPackage.PHONETICS_TYPE:
				return convertPhoneticsTypeToString(eDataType, instanceValue);
			case MspdiPackage.PREFIX_TYPE:
				return convertPrefixTypeToString(eDataType, instanceValue);
			case MspdiPackage.RATE_TABLE_TYPE_OBJECT:
				return convertRateTableTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.ROLLUP_TYPE_TYPE_OBJECT:
				return convertRollupTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE_OBJECT:
				return convertStandardRateFormatTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.STANDARD_RATE_FORMAT_TYPE_OBJECT1:
				return convertStandardRateFormatTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.SUBJECT_TYPE:
				return convertSubjectTypeToString(eDataType, instanceValue);
			case MspdiPackage.SUBPROJECT_NAME_TYPE:
				return convertSubprojectNameTypeToString(eDataType, instanceValue);
			case MspdiPackage.TITLE_TYPE:
				return convertTitleTypeToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT2:
				return convertTypeTypeObject2ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT3:
				return convertTypeTypeObject3ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT4:
				return convertTypeTypeObject4ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT5:
				return convertTypeTypeObject5ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT6:
				return convertTypeTypeObject6ToString(eDataType, instanceValue);
			case MspdiPackage.TYPE_TYPE_OBJECT7:
				return convertTypeTypeObject7ToString(eDataType, instanceValue);
			case MspdiPackage.UID_TYPE:
				return convertUIDTypeToString(eDataType, instanceValue);
			case MspdiPackage.UNIT_TYPE_OBJECT:
				return convertUnitTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.VALUELIST_SORT_ORDER_TYPE_OBJECT:
				return convertValuelistSortOrderTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.WEEK_START_DAY_TYPE_OBJECT:
				return convertWeekStartDayTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.WORK_CONTOUR_TYPE_OBJECT:
				return convertWorkContourTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.WORK_FORMAT_TYPE_OBJECT:
				return convertWorkFormatTypeObjectToString(eDataType, instanceValue);
			case MspdiPackage.WORK_GROUP_TYPE_OBJECT:
				return convertWorkGroupTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentsType createAssignmentsType() {
		AssignmentsTypeImpl assignmentsType = new AssignmentsTypeImpl();
		return assignmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentType createAssignmentType() {
		AssignmentTypeImpl assignmentType = new AssignmentTypeImpl();
		return assignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityPeriodsType createAvailabilityPeriodsType() {
		AvailabilityPeriodsTypeImpl availabilityPeriodsType = new AvailabilityPeriodsTypeImpl();
		return availabilityPeriodsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailabilityPeriodType createAvailabilityPeriodType() {
		AvailabilityPeriodTypeImpl availabilityPeriodType = new AvailabilityPeriodTypeImpl();
		return availabilityPeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineType createBaselineType() {
		BaselineTypeImpl baselineType = new BaselineTypeImpl();
		return baselineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineType1 createBaselineType1() {
		BaselineType1Impl baselineType1 = new BaselineType1Impl();
		return baselineType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineType2 createBaselineType2() {
		BaselineType2Impl baselineType2 = new BaselineType2Impl();
		return baselineType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarsType createCalendarsType() {
		CalendarsTypeImpl calendarsType = new CalendarsTypeImpl();
		return calendarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarType createCalendarType() {
		CalendarTypeImpl calendarType = new CalendarTypeImpl();
		return calendarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsType createExceptionsType() {
		ExceptionsTypeImpl exceptionsType = new ExceptionsTypeImpl();
		return exceptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributesType createExtendedAttributesType() {
		ExtendedAttributesTypeImpl extendedAttributesType = new ExtendedAttributesTypeImpl();
		return extendedAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributeType createExtendedAttributeType() {
		ExtendedAttributeTypeImpl extendedAttributeType = new ExtendedAttributeTypeImpl();
		return extendedAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributeType1 createExtendedAttributeType1() {
		ExtendedAttributeType1Impl extendedAttributeType1 = new ExtendedAttributeType1Impl();
		return extendedAttributeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributeType2 createExtendedAttributeType2() {
		ExtendedAttributeType2Impl extendedAttributeType2 = new ExtendedAttributeType2Impl();
		return extendedAttributeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAttributeType3 createExtendedAttributeType3() {
		ExtendedAttributeType3Impl extendedAttributeType3 = new ExtendedAttributeType3Impl();
		return extendedAttributeType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasksType createMasksType() {
		MasksTypeImpl masksType = new MasksTypeImpl();
		return masksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType createMaskType() {
		MaskTypeImpl maskType = new MaskTypeImpl();
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineCodesType createOutlineCodesType() {
		OutlineCodesTypeImpl outlineCodesType = new OutlineCodesTypeImpl();
		return outlineCodesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineCodeType createOutlineCodeType() {
		OutlineCodeTypeImpl outlineCodeType = new OutlineCodeTypeImpl();
		return outlineCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineCodeType1 createOutlineCodeType1() {
		OutlineCodeType1Impl outlineCodeType1 = new OutlineCodeType1Impl();
		return outlineCodeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineCodeType2 createOutlineCodeType2() {
		OutlineCodeType2Impl outlineCodeType2 = new OutlineCodeType2Impl();
		return outlineCodeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredecessorLinkType createPredecessorLinkType() {
		PredecessorLinkTypeImpl predecessorLinkType = new PredecessorLinkTypeImpl();
		return predecessorLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectType createProjectType() {
		ProjectTypeImpl projectType = new ProjectTypeImpl();
		return projectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatesType createRatesType() {
		RatesTypeImpl ratesType = new RatesTypeImpl();
		return ratesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateType createRateType() {
		RateTypeImpl rateType = new RateTypeImpl();
		return rateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesType createResourcesType() {
		ResourcesTypeImpl resourcesType = new ResourcesTypeImpl();
		return resourcesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksType createTasksType() {
		TasksTypeImpl tasksType = new TasksTypeImpl();
		return tasksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType createTimePeriodType() {
		TimePeriodTypeImpl timePeriodType = new TimePeriodTypeImpl();
		return timePeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType1 createTimePeriodType1() {
		TimePeriodType1Impl timePeriodType1 = new TimePeriodType1Impl();
		return timePeriodType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType2 createTimePeriodType2() {
		TimePeriodType2Impl timePeriodType2 = new TimePeriodType2Impl();
		return timePeriodType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimephasedDataType createTimephasedDataType() {
		TimephasedDataTypeImpl timephasedDataType = new TimephasedDataTypeImpl();
		return timephasedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueListType createValueListType() {
		ValueListTypeImpl valueListType = new ValueListTypeImpl();
		return valueListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesType createValuesType() {
		ValuesTypeImpl valuesType = new ValuesTypeImpl();
		return valuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType1 createValueType1() {
		ValueType1Impl valueType1 = new ValueType1Impl();
		return valueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WBSMasksType createWBSMasksType() {
		WBSMasksTypeImpl wbsMasksType = new WBSMasksTypeImpl();
		return wbsMasksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WBSMaskType createWBSMaskType() {
		WBSMaskTypeImpl wbsMaskType = new WBSMaskTypeImpl();
		return wbsMaskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDaysType createWeekDaysType() {
		WeekDaysTypeImpl weekDaysType = new WeekDaysTypeImpl();
		return weekDaysType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDayType createWeekDayType() {
		WeekDayTypeImpl weekDayType = new WeekDayTypeImpl();
		return weekDayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDayType1 createWeekDayType1() {
		WeekDayType1Impl weekDayType1 = new WeekDayType1Impl();
		return weekDayType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingTimesType createWorkingTimesType() {
		WorkingTimesTypeImpl workingTimesType = new WorkingTimesTypeImpl();
		return workingTimesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingTimesType1 createWorkingTimesType1() {
		WorkingTimesType1Impl workingTimesType1 = new WorkingTimesType1Impl();
		return workingTimesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingTimeType createWorkingTimeType() {
		WorkingTimeTypeImpl workingTimeType = new WorkingTimeTypeImpl();
		return workingTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingTimeType1 createWorkingTimeType1() {
		WorkingTimeType1Impl workingTimeType1 = new WorkingTimeType1Impl();
		return workingTimeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkWeeksType createWorkWeeksType() {
		WorkWeeksTypeImpl workWeeksType = new WorkWeeksTypeImpl();
		return workWeeksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkWeekType createWorkWeekType() {
		WorkWeekTypeImpl workWeekType = new WorkWeekTypeImpl();
		return workWeekType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccrueAtType createAccrueAtTypeFromString(EDataType eDataType, String initialValue) {
		AccrueAtType result = AccrueAtType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccrueAtTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineForEarnedValueType createBaselineForEarnedValueTypeFromString(EDataType eDataType, String initialValue) {
		BaselineForEarnedValueType result = BaselineForEarnedValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaselineForEarnedValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingTypeType createBookingTypeTypeFromString(EDataType eDataType, String initialValue) {
		BookingTypeType result = BookingTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookingTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingTypeType1 createBookingTypeType1FromString(EDataType eDataType, String initialValue) {
		BookingTypeType1 result = BookingTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookingTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationTypeType createCalculationTypeTypeFromString(EDataType eDataType, String initialValue) {
		CalculationTypeType result = CalculationTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFTypeType createCFTypeTypeFromString(EDataType eDataType, String initialValue) {
		CFTypeType result = CFTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCFTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentTypeType createCommitmentTypeTypeFromString(EDataType eDataType, String initialValue) {
		CommitmentTypeType result = CommitmentTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommitmentTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTypeType createConstraintTypeTypeFromString(EDataType eDataType, String initialValue) {
		ConstraintTypeType result = ConstraintTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostRateTableType createCostRateTableTypeFromString(EDataType eDataType, String initialValue) {
		CostRateTableType result = CostRateTableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCostRateTableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySymbolPositionType createCurrencySymbolPositionTypeFromString(EDataType eDataType, String initialValue) {
		CurrencySymbolPositionType result = CurrencySymbolPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencySymbolPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayTypeType createDayTypeTypeFromString(EDataType eDataType, String initialValue) {
		DayTypeType result = DayTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayTypeType1 createDayTypeType1FromString(EDataType eDataType, String initialValue) {
		DayTypeType1 result = DayTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultFixedCostAccrualType createDefaultFixedCostAccrualTypeFromString(EDataType eDataType, String initialValue) {
		DefaultFixedCostAccrualType result = DefaultFixedCostAccrualType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultFixedCostAccrualTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultTaskEVMethodType createDefaultTaskEVMethodTypeFromString(EDataType eDataType, String initialValue) {
		DefaultTaskEVMethodType result = DefaultTaskEVMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultTaskEVMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultTaskTypeType createDefaultTaskTypeTypeFromString(EDataType eDataType, String initialValue) {
		DefaultTaskTypeType result = DefaultTaskTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultTaskTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType createDurationFormatTypeFromString(EDataType eDataType, String initialValue) {
		DurationFormatType result = DurationFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType1 createDurationFormatType1FromString(EDataType eDataType, String initialValue) {
		DurationFormatType1 result = DurationFormatType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType2 createDurationFormatType2FromString(EDataType eDataType, String initialValue) {
		DurationFormatType2 result = DurationFormatType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType3 createDurationFormatType3FromString(EDataType eDataType, String initialValue) {
		DurationFormatType3 result = DurationFormatType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType4 createDurationFormatType4FromString(EDataType eDataType, String initialValue) {
		DurationFormatType4 result = DurationFormatType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType5 createDurationFormatType5FromString(EDataType eDataType, String initialValue) {
		DurationFormatType5 result = DurationFormatType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarnedValueMethodType createEarnedValueMethodTypeFromString(EDataType eDataType, String initialValue) {
		EarnedValueMethodType result = EarnedValueMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarnedValueMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarnedValueMethodType1 createEarnedValueMethodType1FromString(EDataType eDataType, String initialValue) {
		EarnedValueMethodType1 result = EarnedValueMethodType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarnedValueMethodType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemTypeType createElemTypeTypeFromString(EDataType eDataType, String initialValue) {
		ElemTypeType result = ElemTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElemTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCostAccrualType createFixedCostAccrualTypeFromString(EDataType eDataType, String initialValue) {
		FixedCostAccrualType result = FixedCostAccrualType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedCostAccrualTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FYStartDateType createFYStartDateTypeFromString(EDataType eDataType, String initialValue) {
		FYStartDateType result = FYStartDateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFYStartDateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LagFormatType createLagFormatTypeFromString(EDataType eDataType, String initialValue) {
		LagFormatType result = LagFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLagFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelingDelayFormatType createLevelingDelayFormatTypeFromString(EDataType eDataType, String initialValue) {
		LevelingDelayFormatType result = LevelingDelayFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelingDelayFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelingDelayFormatType1 createLevelingDelayFormatType1FromString(EDataType eDataType, String initialValue) {
		LevelingDelayFormatType1 result = LevelingDelayFormatType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelingDelayFormatType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthItemType createMonthItemTypeFromString(EDataType eDataType, String initialValue) {
		MonthItemType result = MonthItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthPositionType createMonthPositionTypeFromString(EDataType eDataType, String initialValue) {
		MonthPositionType result = MonthPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthType createMonthTypeFromString(EDataType eDataType, String initialValue) {
		MonthType result = MonthType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewTaskStartDateType createNewTaskStartDateTypeFromString(EDataType eDataType, String initialValue) {
		NewTaskStartDateType result = NewTaskStartDateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewTaskStartDateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OvertimeRateFormatType createOvertimeRateFormatTypeFromString(EDataType eDataType, String initialValue) {
		OvertimeRateFormatType result = OvertimeRateFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOvertimeRateFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OvertimeRateFormatType1 createOvertimeRateFormatType1FromString(EDataType eDataType, String initialValue) {
		OvertimeRateFormatType1 result = OvertimeRateFormatType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOvertimeRateFormatType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateTableType createRateTableTypeFromString(EDataType eDataType, String initialValue) {
		RateTableType result = RateTableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRateTableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollupTypeType createRollupTypeTypeFromString(EDataType eDataType, String initialValue) {
		RollupTypeType result = RollupTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRollupTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRateFormatType createStandardRateFormatTypeFromString(EDataType eDataType, String initialValue) {
		StandardRateFormatType result = StandardRateFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardRateFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRateFormatType1 createStandardRateFormatType1FromString(EDataType eDataType, String initialValue) {
		StandardRateFormatType1 result = StandardRateFormatType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardRateFormatType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeType2FromString(EDataType eDataType, String initialValue) {
		TypeType2 result = TypeType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeType3FromString(EDataType eDataType, String initialValue) {
		TypeType3 result = TypeType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeType4FromString(EDataType eDataType, String initialValue) {
		TypeType4 result = TypeType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType5 createTypeType5FromString(EDataType eDataType, String initialValue) {
		TypeType5 result = TypeType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType6 createTypeType6FromString(EDataType eDataType, String initialValue) {
		TypeType6 result = TypeType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 createTypeType7FromString(EDataType eDataType, String initialValue) {
		TypeType7 result = TypeType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuelistSortOrderType createValuelistSortOrderTypeFromString(EDataType eDataType, String initialValue) {
		ValuelistSortOrderType result = ValuelistSortOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuelistSortOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekStartDayType createWeekStartDayTypeFromString(EDataType eDataType, String initialValue) {
		WeekStartDayType result = WeekStartDayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekStartDayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkContourType createWorkContourTypeFromString(EDataType eDataType, String initialValue) {
		WorkContourType result = WorkContourType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkContourTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFormatType createWorkFormatTypeFromString(EDataType eDataType, String initialValue) {
		WorkFormatType result = WorkFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkGroupType createWorkGroupTypeFromString(EDataType eDataType, String initialValue) {
		WorkGroupType result = WorkGroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccrueAtType createAccrueAtTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccrueAtTypeFromString(MspdiPackage.Literals.ACCRUE_AT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccrueAtTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccrueAtTypeToString(MspdiPackage.Literals.ACCRUE_AT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createActiveDirectoryGUIDTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActiveDirectoryGUIDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAliasTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAliasTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAuthorTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineForEarnedValueType createBaselineForEarnedValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBaselineForEarnedValueTypeFromString(MspdiPackage.Literals.BASELINE_FOR_EARNED_VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaselineForEarnedValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBaselineForEarnedValueTypeToString(MspdiPackage.Literals.BASELINE_FOR_EARNED_VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingTypeType createBookingTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBookingTypeTypeFromString(MspdiPackage.Literals.BOOKING_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookingTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBookingTypeTypeToString(MspdiPackage.Literals.BOOKING_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingTypeType1 createBookingTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createBookingTypeType1FromString(MspdiPackage.Literals.BOOKING_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBookingTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertBookingTypeType1ToString(MspdiPackage.Literals.BOOKING_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationTypeType createCalculationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCalculationTypeTypeFromString(MspdiPackage.Literals.CALCULATION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalculationTypeTypeToString(MspdiPackage.Literals.CALCULATION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCategoryTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFTypeType createCFTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCFTypeTypeFromString(MspdiPackage.Literals.CF_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCFTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCFTypeTypeToString(MspdiPackage.Literals.CF_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentTypeType createCommitmentTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCommitmentTypeTypeFromString(MspdiPackage.Literals.COMMITMENT_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommitmentTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCommitmentTypeTypeToString(MspdiPackage.Literals.COMMITMENT_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCompanyTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompanyTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTypeType createConstraintTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintTypeTypeFromString(MspdiPackage.Literals.CONSTRAINT_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintTypeTypeToString(MspdiPackage.Literals.CONSTRAINT_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContactTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostRateTableType createCostRateTableTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCostRateTableTypeFromString(MspdiPackage.Literals.COST_RATE_TABLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCostRateTableTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCostRateTableTypeToString(MspdiPackage.Literals.COST_RATE_TABLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCurrencyCodeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySymbolPositionType createCurrencySymbolPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCurrencySymbolPositionTypeFromString(MspdiPackage.Literals.CURRENCY_SYMBOL_POSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencySymbolPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCurrencySymbolPositionTypeToString(MspdiPackage.Literals.CURRENCY_SYMBOL_POSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCurrencySymbolTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencySymbolTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayTypeType createDayTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDayTypeTypeFromString(MspdiPackage.Literals.DAY_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDayTypeTypeToString(MspdiPackage.Literals.DAY_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayTypeType1 createDayTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDayTypeType1FromString(MspdiPackage.Literals.DAY_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDayTypeType1ToString(MspdiPackage.Literals.DAY_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultFixedCostAccrualType createDefaultFixedCostAccrualTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultFixedCostAccrualTypeFromString(MspdiPackage.Literals.DEFAULT_FIXED_COST_ACCRUAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultFixedCostAccrualTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultFixedCostAccrualTypeToString(MspdiPackage.Literals.DEFAULT_FIXED_COST_ACCRUAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultTaskEVMethodType createDefaultTaskEVMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultTaskEVMethodTypeFromString(MspdiPackage.Literals.DEFAULT_TASK_EV_METHOD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultTaskEVMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultTaskEVMethodTypeToString(MspdiPackage.Literals.DEFAULT_TASK_EV_METHOD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultTaskTypeType createDefaultTaskTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultTaskTypeTypeFromString(MspdiPackage.Literals.DEFAULT_TASK_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultTaskTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultTaskTypeTypeToString(MspdiPackage.Literals.DEFAULT_TASK_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType4 createDurationFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDurationFormatType4FromString(MspdiPackage.Literals.DURATION_FORMAT_TYPE4, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDurationFormatType4ToString(MspdiPackage.Literals.DURATION_FORMAT_TYPE4, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType1 createDurationFormatTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDurationFormatType1FromString(MspdiPackage.Literals.DURATION_FORMAT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDurationFormatType1ToString(MspdiPackage.Literals.DURATION_FORMAT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType2 createDurationFormatTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createDurationFormatType2FromString(MspdiPackage.Literals.DURATION_FORMAT_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertDurationFormatType2ToString(MspdiPackage.Literals.DURATION_FORMAT_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType3 createDurationFormatTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createDurationFormatType3FromString(MspdiPackage.Literals.DURATION_FORMAT_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertDurationFormatType3ToString(MspdiPackage.Literals.DURATION_FORMAT_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType createDurationFormatTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createDurationFormatTypeFromString(MspdiPackage.Literals.DURATION_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertDurationFormatTypeToString(MspdiPackage.Literals.DURATION_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType5 createDurationFormatTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createDurationFormatType5FromString(MspdiPackage.Literals.DURATION_FORMAT_TYPE5, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationFormatTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertDurationFormatType5ToString(MspdiPackage.Literals.DURATION_FORMAT_TYPE5, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarnedValueMethodType createEarnedValueMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEarnedValueMethodTypeFromString(MspdiPackage.Literals.EARNED_VALUE_METHOD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarnedValueMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEarnedValueMethodTypeToString(MspdiPackage.Literals.EARNED_VALUE_METHOD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarnedValueMethodType1 createEarnedValueMethodTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createEarnedValueMethodType1FromString(MspdiPackage.Literals.EARNED_VALUE_METHOD_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEarnedValueMethodTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertEarnedValueMethodType1ToString(MspdiPackage.Literals.EARNED_VALUE_METHOD_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemTypeType createElemTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createElemTypeTypeFromString(MspdiPackage.Literals.ELEM_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElemTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertElemTypeTypeToString(MspdiPackage.Literals.ELEM_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEmailAddressTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmailAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExternalTaskProjectTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalTaskProjectTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCostAccrualType createFixedCostAccrualTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFixedCostAccrualTypeFromString(MspdiPackage.Literals.FIXED_COST_ACCRUAL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedCostAccrualTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFixedCostAccrualTypeToString(MspdiPackage.Literals.FIXED_COST_ACCRUAL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FYStartDateType createFYStartDateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFYStartDateTypeFromString(MspdiPackage.Literals.FY_START_DATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFYStartDateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFYStartDateTypeToString(MspdiPackage.Literals.FY_START_DATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createGroupTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkAddressTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkAddressType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkAddressType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkAddressType2FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkAddressType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkSubAddressTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkSubAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkSubAddressType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkSubAddressType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkSubAddressType2FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkSubAddressType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHyperlinkType2FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHyperlinkType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInitialsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LagFormatType createLagFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLagFormatTypeFromString(MspdiPackage.Literals.LAG_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLagFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLagFormatTypeToString(MspdiPackage.Literals.LAG_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelingDelayFormatType createLevelingDelayFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLevelingDelayFormatTypeFromString(MspdiPackage.Literals.LEVELING_DELAY_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelingDelayFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLevelingDelayFormatTypeToString(MspdiPackage.Literals.LEVELING_DELAY_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelingDelayFormatType1 createLevelingDelayFormatTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLevelingDelayFormatType1FromString(MspdiPackage.Literals.LEVELING_DELAY_FORMAT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelingDelayFormatTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLevelingDelayFormatType1ToString(MspdiPackage.Literals.LEVELING_DELAY_FORMAT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createManagerTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManagerTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMaterialLabelTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaterialLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthItemType createMonthItemTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMonthItemTypeFromString(MspdiPackage.Literals.MONTH_ITEM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthItemTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMonthItemTypeToString(MspdiPackage.Literals.MONTH_ITEM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthPositionType createMonthPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMonthPositionTypeFromString(MspdiPackage.Literals.MONTH_POSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMonthPositionTypeToString(MspdiPackage.Literals.MONTH_POSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthType createMonthTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMonthTypeFromString(MspdiPackage.Literals.MONTH_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMonthTypeToString(MspdiPackage.Literals.MONTH_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameType2FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameType3FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameType3ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameType4FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameType4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameType5FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameType5ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewTaskStartDateType createNewTaskStartDateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNewTaskStartDateTypeFromString(MspdiPackage.Literals.NEW_TASK_START_DATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewTaskStartDateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNewTaskStartDateTypeToString(MspdiPackage.Literals.NEW_TASK_START_DATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNTAccountTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNTAccountTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOutlineNumberTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutlineNumberTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OvertimeRateFormatType createOvertimeRateFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOvertimeRateFormatTypeFromString(MspdiPackage.Literals.OVERTIME_RATE_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOvertimeRateFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOvertimeRateFormatTypeToString(MspdiPackage.Literals.OVERTIME_RATE_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OvertimeRateFormatType1 createOvertimeRateFormatTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createOvertimeRateFormatType1FromString(MspdiPackage.Literals.OVERTIME_RATE_FORMAT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOvertimeRateFormatTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertOvertimeRateFormatType1ToString(MspdiPackage.Literals.OVERTIME_RATE_FORMAT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPhoneticAliasTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhoneticAliasTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPhoneticsTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhoneticsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPrefixTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrefixTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateTableType createRateTableTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRateTableTypeFromString(MspdiPackage.Literals.RATE_TABLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRateTableTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRateTableTypeToString(MspdiPackage.Literals.RATE_TABLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollupTypeType createRollupTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRollupTypeTypeFromString(MspdiPackage.Literals.ROLLUP_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRollupTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRollupTypeTypeToString(MspdiPackage.Literals.ROLLUP_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRateFormatType createStandardRateFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStandardRateFormatTypeFromString(MspdiPackage.Literals.STANDARD_RATE_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardRateFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStandardRateFormatTypeToString(MspdiPackage.Literals.STANDARD_RATE_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRateFormatType1 createStandardRateFormatTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createStandardRateFormatType1FromString(MspdiPackage.Literals.STANDARD_RATE_FORMAT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardRateFormatTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertStandardRateFormatType1ToString(MspdiPackage.Literals.STANDARD_RATE_FORMAT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSubjectTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubjectTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSubprojectNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubprojectNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTitleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeType3FromString(MspdiPackage.Literals.TYPE_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType3ToString(MspdiPackage.Literals.TYPE_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType5 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType5FromString(MspdiPackage.Literals.TYPE_TYPE5, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType5ToString(MspdiPackage.Literals.TYPE_TYPE5, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(MspdiPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(MspdiPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(MspdiPackage.Literals.TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(MspdiPackage.Literals.TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createTypeType2FromString(MspdiPackage.Literals.TYPE_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType2ToString(MspdiPackage.Literals.TYPE_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createTypeType4FromString(MspdiPackage.Literals.TYPE_TYPE4, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType4ToString(MspdiPackage.Literals.TYPE_TYPE4, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType6 createTypeTypeObject6FromString(EDataType eDataType, String initialValue) {
		return createTypeType6FromString(MspdiPackage.Literals.TYPE_TYPE6, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject6ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType6ToString(MspdiPackage.Literals.TYPE_TYPE6, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 createTypeTypeObject7FromString(EDataType eDataType, String initialValue) {
		return createTypeType7FromString(MspdiPackage.Literals.TYPE_TYPE7, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject7ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType7ToString(MspdiPackage.Literals.TYPE_TYPE7, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUIDTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUIDTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitTypeFromString(MspdiPackage.Literals.UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitTypeToString(MspdiPackage.Literals.UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuelistSortOrderType createValuelistSortOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValuelistSortOrderTypeFromString(MspdiPackage.Literals.VALUELIST_SORT_ORDER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuelistSortOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValuelistSortOrderTypeToString(MspdiPackage.Literals.VALUELIST_SORT_ORDER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekStartDayType createWeekStartDayTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWeekStartDayTypeFromString(MspdiPackage.Literals.WEEK_START_DAY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekStartDayTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWeekStartDayTypeToString(MspdiPackage.Literals.WEEK_START_DAY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkContourType createWorkContourTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWorkContourTypeFromString(MspdiPackage.Literals.WORK_CONTOUR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkContourTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWorkContourTypeToString(MspdiPackage.Literals.WORK_CONTOUR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFormatType createWorkFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWorkFormatTypeFromString(MspdiPackage.Literals.WORK_FORMAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWorkFormatTypeToString(MspdiPackage.Literals.WORK_FORMAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkGroupType createWorkGroupTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWorkGroupTypeFromString(MspdiPackage.Literals.WORK_GROUP_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkGroupTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWorkGroupTypeToString(MspdiPackage.Literals.WORK_GROUP_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MspdiPackage getMspdiPackage() {
		return (MspdiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MspdiPackage getPackage() {
		return MspdiPackage.eINSTANCE;
	}

} //MspdiFactoryImpl
