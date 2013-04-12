/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.util;

import net.certware.planning.mspdi.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.planning.mspdi.MspdiPackage
 * @generated
 */
public class MspdiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MspdiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MspdiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MspdiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MspdiSwitch<Adapter> modelSwitch =
		new MspdiSwitch<Adapter>() {
			@Override
			public Adapter caseAssignmentsType(AssignmentsType object) {
				return createAssignmentsTypeAdapter();
			}
			@Override
			public Adapter caseAssignmentType(AssignmentType object) {
				return createAssignmentTypeAdapter();
			}
			@Override
			public Adapter caseAvailabilityPeriodsType(AvailabilityPeriodsType object) {
				return createAvailabilityPeriodsTypeAdapter();
			}
			@Override
			public Adapter caseAvailabilityPeriodType(AvailabilityPeriodType object) {
				return createAvailabilityPeriodTypeAdapter();
			}
			@Override
			public Adapter caseBaselineType(BaselineType object) {
				return createBaselineTypeAdapter();
			}
			@Override
			public Adapter caseBaselineType1(BaselineType1 object) {
				return createBaselineType1Adapter();
			}
			@Override
			public Adapter caseBaselineType2(BaselineType2 object) {
				return createBaselineType2Adapter();
			}
			@Override
			public Adapter caseCalendarsType(CalendarsType object) {
				return createCalendarsTypeAdapter();
			}
			@Override
			public Adapter caseCalendarType(CalendarType object) {
				return createCalendarTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExceptionsType(ExceptionsType object) {
				return createExceptionsTypeAdapter();
			}
			@Override
			public Adapter caseExceptionType(ExceptionType object) {
				return createExceptionTypeAdapter();
			}
			@Override
			public Adapter caseExtendedAttributesType(ExtendedAttributesType object) {
				return createExtendedAttributesTypeAdapter();
			}
			@Override
			public Adapter caseExtendedAttributeType(ExtendedAttributeType object) {
				return createExtendedAttributeTypeAdapter();
			}
			@Override
			public Adapter caseExtendedAttributeType1(ExtendedAttributeType1 object) {
				return createExtendedAttributeType1Adapter();
			}
			@Override
			public Adapter caseExtendedAttributeType2(ExtendedAttributeType2 object) {
				return createExtendedAttributeType2Adapter();
			}
			@Override
			public Adapter caseExtendedAttributeType3(ExtendedAttributeType3 object) {
				return createExtendedAttributeType3Adapter();
			}
			@Override
			public Adapter caseMasksType(MasksType object) {
				return createMasksTypeAdapter();
			}
			@Override
			public Adapter caseMaskType(MaskType object) {
				return createMaskTypeAdapter();
			}
			@Override
			public Adapter caseOutlineCodesType(OutlineCodesType object) {
				return createOutlineCodesTypeAdapter();
			}
			@Override
			public Adapter caseOutlineCodeType(OutlineCodeType object) {
				return createOutlineCodeTypeAdapter();
			}
			@Override
			public Adapter caseOutlineCodeType1(OutlineCodeType1 object) {
				return createOutlineCodeType1Adapter();
			}
			@Override
			public Adapter caseOutlineCodeType2(OutlineCodeType2 object) {
				return createOutlineCodeType2Adapter();
			}
			@Override
			public Adapter casePredecessorLinkType(PredecessorLinkType object) {
				return createPredecessorLinkTypeAdapter();
			}
			@Override
			public Adapter caseProjectType(ProjectType object) {
				return createProjectTypeAdapter();
			}
			@Override
			public Adapter caseRatesType(RatesType object) {
				return createRatesTypeAdapter();
			}
			@Override
			public Adapter caseRateType(RateType object) {
				return createRateTypeAdapter();
			}
			@Override
			public Adapter caseResourcesType(ResourcesType object) {
				return createResourcesTypeAdapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseTasksType(TasksType object) {
				return createTasksTypeAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodType(TimePeriodType object) {
				return createTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodType1(TimePeriodType1 object) {
				return createTimePeriodType1Adapter();
			}
			@Override
			public Adapter caseTimePeriodType2(TimePeriodType2 object) {
				return createTimePeriodType2Adapter();
			}
			@Override
			public Adapter caseTimephasedDataType(TimephasedDataType object) {
				return createTimephasedDataTypeAdapter();
			}
			@Override
			public Adapter caseValueListType(ValueListType object) {
				return createValueListTypeAdapter();
			}
			@Override
			public Adapter caseValuesType(ValuesType object) {
				return createValuesTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseValueType1(ValueType1 object) {
				return createValueType1Adapter();
			}
			@Override
			public Adapter caseWBSMasksType(WBSMasksType object) {
				return createWBSMasksTypeAdapter();
			}
			@Override
			public Adapter caseWBSMaskType(WBSMaskType object) {
				return createWBSMaskTypeAdapter();
			}
			@Override
			public Adapter caseWeekDaysType(WeekDaysType object) {
				return createWeekDaysTypeAdapter();
			}
			@Override
			public Adapter caseWeekDayType(WeekDayType object) {
				return createWeekDayTypeAdapter();
			}
			@Override
			public Adapter caseWeekDayType1(WeekDayType1 object) {
				return createWeekDayType1Adapter();
			}
			@Override
			public Adapter caseWorkingTimesType(WorkingTimesType object) {
				return createWorkingTimesTypeAdapter();
			}
			@Override
			public Adapter caseWorkingTimesType1(WorkingTimesType1 object) {
				return createWorkingTimesType1Adapter();
			}
			@Override
			public Adapter caseWorkingTimeType(WorkingTimeType object) {
				return createWorkingTimeTypeAdapter();
			}
			@Override
			public Adapter caseWorkingTimeType1(WorkingTimeType1 object) {
				return createWorkingTimeType1Adapter();
			}
			@Override
			public Adapter caseWorkWeeksType(WorkWeeksType object) {
				return createWorkWeeksTypeAdapter();
			}
			@Override
			public Adapter caseWorkWeekType(WorkWeekType object) {
				return createWorkWeekTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.AssignmentsType <em>Assignments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.AssignmentsType
	 * @generated
	 */
	public Adapter createAssignmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.AssignmentType <em>Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.AssignmentType
	 * @generated
	 */
	public Adapter createAssignmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.AvailabilityPeriodsType <em>Availability Periods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodsType
	 * @generated
	 */
	public Adapter createAvailabilityPeriodsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.AvailabilityPeriodType <em>Availability Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.AvailabilityPeriodType
	 * @generated
	 */
	public Adapter createAvailabilityPeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.BaselineType <em>Baseline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.BaselineType
	 * @generated
	 */
	public Adapter createBaselineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.BaselineType1 <em>Baseline Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.BaselineType1
	 * @generated
	 */
	public Adapter createBaselineType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.BaselineType2 <em>Baseline Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.BaselineType2
	 * @generated
	 */
	public Adapter createBaselineType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.CalendarsType <em>Calendars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.CalendarsType
	 * @generated
	 */
	public Adapter createCalendarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.CalendarType <em>Calendar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.CalendarType
	 * @generated
	 */
	public Adapter createCalendarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ExceptionsType <em>Exceptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ExceptionsType
	 * @generated
	 */
	public Adapter createExceptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ExceptionType
	 * @generated
	 */
	public Adapter createExceptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ExtendedAttributesType <em>Extended Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ExtendedAttributesType
	 * @generated
	 */
	public Adapter createExtendedAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ExtendedAttributeType <em>Extended Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType
	 * @generated
	 */
	public Adapter createExtendedAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ExtendedAttributeType1 <em>Extended Attribute Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType1
	 * @generated
	 */
	public Adapter createExtendedAttributeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ExtendedAttributeType2 <em>Extended Attribute Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType2
	 * @generated
	 */
	public Adapter createExtendedAttributeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ExtendedAttributeType3 <em>Extended Attribute Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ExtendedAttributeType3
	 * @generated
	 */
	public Adapter createExtendedAttributeType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.MasksType <em>Masks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.MasksType
	 * @generated
	 */
	public Adapter createMasksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.MaskType
	 * @generated
	 */
	public Adapter createMaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.OutlineCodesType <em>Outline Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.OutlineCodesType
	 * @generated
	 */
	public Adapter createOutlineCodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.OutlineCodeType <em>Outline Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.OutlineCodeType
	 * @generated
	 */
	public Adapter createOutlineCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.OutlineCodeType1 <em>Outline Code Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.OutlineCodeType1
	 * @generated
	 */
	public Adapter createOutlineCodeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.OutlineCodeType2 <em>Outline Code Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.OutlineCodeType2
	 * @generated
	 */
	public Adapter createOutlineCodeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.PredecessorLinkType <em>Predecessor Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.PredecessorLinkType
	 * @generated
	 */
	public Adapter createPredecessorLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ProjectType
	 * @generated
	 */
	public Adapter createProjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.RatesType <em>Rates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.RatesType
	 * @generated
	 */
	public Adapter createRatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.RateType <em>Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.RateType
	 * @generated
	 */
	public Adapter createRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ResourcesType <em>Resources Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ResourcesType
	 * @generated
	 */
	public Adapter createResourcesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.TasksType <em>Tasks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.TasksType
	 * @generated
	 */
	public Adapter createTasksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.TimePeriodType
	 * @generated
	 */
	public Adapter createTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.TimePeriodType1 <em>Time Period Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.TimePeriodType1
	 * @generated
	 */
	public Adapter createTimePeriodType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.TimePeriodType2 <em>Time Period Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.TimePeriodType2
	 * @generated
	 */
	public Adapter createTimePeriodType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.TimephasedDataType <em>Timephased Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.TimephasedDataType
	 * @generated
	 */
	public Adapter createTimephasedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ValueListType <em>Value List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ValueListType
	 * @generated
	 */
	public Adapter createValueListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ValuesType <em>Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ValuesType
	 * @generated
	 */
	public Adapter createValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.ValueType1
	 * @generated
	 */
	public Adapter createValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WBSMasksType <em>WBS Masks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WBSMasksType
	 * @generated
	 */
	public Adapter createWBSMasksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WBSMaskType <em>WBS Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WBSMaskType
	 * @generated
	 */
	public Adapter createWBSMaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WeekDaysType <em>Week Days Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WeekDaysType
	 * @generated
	 */
	public Adapter createWeekDaysTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WeekDayType <em>Week Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WeekDayType
	 * @generated
	 */
	public Adapter createWeekDayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WeekDayType1 <em>Week Day Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WeekDayType1
	 * @generated
	 */
	public Adapter createWeekDayType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WorkingTimesType <em>Working Times Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WorkingTimesType
	 * @generated
	 */
	public Adapter createWorkingTimesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WorkingTimesType1 <em>Working Times Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WorkingTimesType1
	 * @generated
	 */
	public Adapter createWorkingTimesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WorkingTimeType <em>Working Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WorkingTimeType
	 * @generated
	 */
	public Adapter createWorkingTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WorkingTimeType1 <em>Working Time Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WorkingTimeType1
	 * @generated
	 */
	public Adapter createWorkingTimeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WorkWeeksType <em>Work Weeks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WorkWeeksType
	 * @generated
	 */
	public Adapter createWorkWeeksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.planning.mspdi.WorkWeekType <em>Work Week Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.planning.mspdi.WorkWeekType
	 * @generated
	 */
	public Adapter createWorkWeekTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MspdiAdapterFactory
