/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.util;

import java.util.List;

import net.certware.planning.mspdi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.planning.mspdi.MspdiPackage
 * @generated
 */
public class MspdiSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MspdiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MspdiSwitch() {
		if (modelPackage == null) {
			modelPackage = MspdiPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MspdiPackage.ASSIGNMENTS_TYPE: {
				AssignmentsType assignmentsType = (AssignmentsType)theEObject;
				T result = caseAssignmentsType(assignmentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.ASSIGNMENT_TYPE: {
				AssignmentType assignmentType = (AssignmentType)theEObject;
				T result = caseAssignmentType(assignmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE: {
				AvailabilityPeriodsType availabilityPeriodsType = (AvailabilityPeriodsType)theEObject;
				T result = caseAvailabilityPeriodsType(availabilityPeriodsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.AVAILABILITY_PERIOD_TYPE: {
				AvailabilityPeriodType availabilityPeriodType = (AvailabilityPeriodType)theEObject;
				T result = caseAvailabilityPeriodType(availabilityPeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.BASELINE_TYPE: {
				BaselineType baselineType = (BaselineType)theEObject;
				T result = caseBaselineType(baselineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.BASELINE_TYPE1: {
				BaselineType1 baselineType1 = (BaselineType1)theEObject;
				T result = caseBaselineType1(baselineType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.BASELINE_TYPE2: {
				BaselineType2 baselineType2 = (BaselineType2)theEObject;
				T result = caseBaselineType2(baselineType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.CALENDARS_TYPE: {
				CalendarsType calendarsType = (CalendarsType)theEObject;
				T result = caseCalendarsType(calendarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.CALENDAR_TYPE: {
				CalendarType calendarType = (CalendarType)theEObject;
				T result = caseCalendarType(calendarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.EXCEPTIONS_TYPE: {
				ExceptionsType exceptionsType = (ExceptionsType)theEObject;
				T result = caseExceptionsType(exceptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.EXTENDED_ATTRIBUTES_TYPE: {
				ExtendedAttributesType extendedAttributesType = (ExtendedAttributesType)theEObject;
				T result = caseExtendedAttributesType(extendedAttributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE: {
				ExtendedAttributeType extendedAttributeType = (ExtendedAttributeType)theEObject;
				T result = caseExtendedAttributeType(extendedAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE1: {
				ExtendedAttributeType1 extendedAttributeType1 = (ExtendedAttributeType1)theEObject;
				T result = caseExtendedAttributeType1(extendedAttributeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE2: {
				ExtendedAttributeType2 extendedAttributeType2 = (ExtendedAttributeType2)theEObject;
				T result = caseExtendedAttributeType2(extendedAttributeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3: {
				ExtendedAttributeType3 extendedAttributeType3 = (ExtendedAttributeType3)theEObject;
				T result = caseExtendedAttributeType3(extendedAttributeType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.MASKS_TYPE: {
				MasksType masksType = (MasksType)theEObject;
				T result = caseMasksType(masksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.MASK_TYPE: {
				MaskType maskType = (MaskType)theEObject;
				T result = caseMaskType(maskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.OUTLINE_CODES_TYPE: {
				OutlineCodesType outlineCodesType = (OutlineCodesType)theEObject;
				T result = caseOutlineCodesType(outlineCodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.OUTLINE_CODE_TYPE: {
				OutlineCodeType outlineCodeType = (OutlineCodeType)theEObject;
				T result = caseOutlineCodeType(outlineCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.OUTLINE_CODE_TYPE1: {
				OutlineCodeType1 outlineCodeType1 = (OutlineCodeType1)theEObject;
				T result = caseOutlineCodeType1(outlineCodeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.OUTLINE_CODE_TYPE2: {
				OutlineCodeType2 outlineCodeType2 = (OutlineCodeType2)theEObject;
				T result = caseOutlineCodeType2(outlineCodeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.PREDECESSOR_LINK_TYPE: {
				PredecessorLinkType predecessorLinkType = (PredecessorLinkType)theEObject;
				T result = casePredecessorLinkType(predecessorLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.PROJECT_TYPE: {
				ProjectType projectType = (ProjectType)theEObject;
				T result = caseProjectType(projectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.RATES_TYPE: {
				RatesType ratesType = (RatesType)theEObject;
				T result = caseRatesType(ratesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.RATE_TYPE: {
				RateType rateType = (RateType)theEObject;
				T result = caseRateType(rateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.RESOURCES_TYPE: {
				ResourcesType resourcesType = (ResourcesType)theEObject;
				T result = caseResourcesType(resourcesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.TASKS_TYPE: {
				TasksType tasksType = (TasksType)theEObject;
				T result = caseTasksType(tasksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T result = caseTaskType(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.TIME_PERIOD_TYPE: {
				TimePeriodType timePeriodType = (TimePeriodType)theEObject;
				T result = caseTimePeriodType(timePeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.TIME_PERIOD_TYPE1: {
				TimePeriodType1 timePeriodType1 = (TimePeriodType1)theEObject;
				T result = caseTimePeriodType1(timePeriodType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.TIME_PERIOD_TYPE2: {
				TimePeriodType2 timePeriodType2 = (TimePeriodType2)theEObject;
				T result = caseTimePeriodType2(timePeriodType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.TIMEPHASED_DATA_TYPE: {
				TimephasedDataType timephasedDataType = (TimephasedDataType)theEObject;
				T result = caseTimephasedDataType(timephasedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.VALUE_LIST_TYPE: {
				ValueListType valueListType = (ValueListType)theEObject;
				T result = caseValueListType(valueListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.VALUES_TYPE: {
				ValuesType valuesType = (ValuesType)theEObject;
				T result = caseValuesType(valuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.VALUE_TYPE1: {
				ValueType1 valueType1 = (ValueType1)theEObject;
				T result = caseValueType1(valueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WBS_MASKS_TYPE: {
				WBSMasksType wbsMasksType = (WBSMasksType)theEObject;
				T result = caseWBSMasksType(wbsMasksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WBS_MASK_TYPE: {
				WBSMaskType wbsMaskType = (WBSMaskType)theEObject;
				T result = caseWBSMaskType(wbsMaskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WEEK_DAYS_TYPE: {
				WeekDaysType weekDaysType = (WeekDaysType)theEObject;
				T result = caseWeekDaysType(weekDaysType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WEEK_DAY_TYPE: {
				WeekDayType weekDayType = (WeekDayType)theEObject;
				T result = caseWeekDayType(weekDayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WEEK_DAY_TYPE1: {
				WeekDayType1 weekDayType1 = (WeekDayType1)theEObject;
				T result = caseWeekDayType1(weekDayType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WORKING_TIMES_TYPE: {
				WorkingTimesType workingTimesType = (WorkingTimesType)theEObject;
				T result = caseWorkingTimesType(workingTimesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WORKING_TIMES_TYPE1: {
				WorkingTimesType1 workingTimesType1 = (WorkingTimesType1)theEObject;
				T result = caseWorkingTimesType1(workingTimesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WORKING_TIME_TYPE: {
				WorkingTimeType workingTimeType = (WorkingTimeType)theEObject;
				T result = caseWorkingTimeType(workingTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WORKING_TIME_TYPE1: {
				WorkingTimeType1 workingTimeType1 = (WorkingTimeType1)theEObject;
				T result = caseWorkingTimeType1(workingTimeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WORK_WEEKS_TYPE: {
				WorkWeeksType workWeeksType = (WorkWeeksType)theEObject;
				T result = caseWorkWeeksType(workWeeksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MspdiPackage.WORK_WEEK_TYPE: {
				WorkWeekType workWeekType = (WorkWeekType)theEObject;
				T result = caseWorkWeekType(workWeekType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentsType(AssignmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentType(AssignmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability Periods Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability Periods Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailabilityPeriodsType(AvailabilityPeriodsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Availability Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availability Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailabilityPeriodType(AvailabilityPeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaselineType(BaselineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaselineType1(BaselineType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaselineType2(BaselineType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarsType(CalendarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarType(CalendarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exceptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exceptions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionsType(ExceptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionType(ExceptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Attributes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Attributes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedAttributesType(ExtendedAttributesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedAttributeType(ExtendedAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Attribute Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Attribute Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedAttributeType1(ExtendedAttributeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Attribute Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Attribute Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedAttributeType2(ExtendedAttributeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Attribute Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Attribute Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedAttributeType3(ExtendedAttributeType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Masks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Masks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasksType(MasksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskType(MaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outline Codes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outline Codes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutlineCodesType(OutlineCodesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outline Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outline Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutlineCodeType(OutlineCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outline Code Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outline Code Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutlineCodeType1(OutlineCodeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outline Code Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outline Code Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutlineCodeType2(OutlineCodeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predecessor Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predecessor Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredecessorLinkType(PredecessorLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectType(ProjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatesType(RatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateType(RateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcesType(ResourcesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTasksType(TasksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePeriodType(TimePeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Period Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Period Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePeriodType1(TimePeriodType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Period Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Period Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePeriodType2(TimePeriodType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timephased Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timephased Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimephasedDataType(TimephasedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueListType(ValueListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuesType(ValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType1(ValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WBS Masks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WBS Masks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWBSMasksType(WBSMasksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WBS Mask Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WBS Mask Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWBSMaskType(WBSMaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Week Days Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Week Days Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekDaysType(WeekDaysType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Week Day Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Week Day Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekDayType(WeekDayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Week Day Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Week Day Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekDayType1(WeekDayType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Working Times Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Working Times Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingTimesType(WorkingTimesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Working Times Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Working Times Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingTimesType1(WorkingTimesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Working Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Working Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingTimeType(WorkingTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Working Time Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Working Time Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingTimeType1(WorkingTimeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Weeks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Weeks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkWeeksType(WorkWeeksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Week Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Week Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkWeekType(WorkWeekType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MspdiSwitch
