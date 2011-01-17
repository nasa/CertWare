/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.provider;


import java.util.Collection;
import java.util.List;

import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.ProjectType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.planning.mspdi.ProjectType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSaveVersionPropertyDescriptor(object);
			addUIDPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addSubjectPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addCompanyPropertyDescriptor(object);
			addManagerPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addRevisionPropertyDescriptor(object);
			addLastSavedPropertyDescriptor(object);
			addScheduleFromStartPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
			addFinishDatePropertyDescriptor(object);
			addFYStartDatePropertyDescriptor(object);
			addCriticalSlackLimitPropertyDescriptor(object);
			addCurrencyDigitsPropertyDescriptor(object);
			addCurrencySymbolPropertyDescriptor(object);
			addCurrencyCodePropertyDescriptor(object);
			addCurrencySymbolPositionPropertyDescriptor(object);
			addCalendarUIDPropertyDescriptor(object);
			addDefaultStartTimePropertyDescriptor(object);
			addDefaultFinishTimePropertyDescriptor(object);
			addMinutesPerDayPropertyDescriptor(object);
			addMinutesPerWeekPropertyDescriptor(object);
			addDaysPerMonthPropertyDescriptor(object);
			addDefaultTaskTypePropertyDescriptor(object);
			addDefaultFixedCostAccrualPropertyDescriptor(object);
			addDefaultStandardRatePropertyDescriptor(object);
			addDefaultOvertimeRatePropertyDescriptor(object);
			addDurationFormatPropertyDescriptor(object);
			addWorkFormatPropertyDescriptor(object);
			addEditableActualCostsPropertyDescriptor(object);
			addHonorConstraintsPropertyDescriptor(object);
			addEarnedValueMethodPropertyDescriptor(object);
			addInsertedProjectsLikeSummaryPropertyDescriptor(object);
			addMultipleCriticalPathsPropertyDescriptor(object);
			addNewTasksEffortDrivenPropertyDescriptor(object);
			addNewTasksEstimatedPropertyDescriptor(object);
			addSplitsInProgressTasksPropertyDescriptor(object);
			addSpreadActualCostPropertyDescriptor(object);
			addSpreadPercentCompletePropertyDescriptor(object);
			addTaskUpdatesResourcePropertyDescriptor(object);
			addFiscalYearStartPropertyDescriptor(object);
			addWeekStartDayPropertyDescriptor(object);
			addMoveCompletedEndsBackPropertyDescriptor(object);
			addMoveRemainingStartsBackPropertyDescriptor(object);
			addMoveRemainingStartsForwardPropertyDescriptor(object);
			addMoveCompletedEndsForwardPropertyDescriptor(object);
			addBaselineForEarnedValuePropertyDescriptor(object);
			addAutoAddNewResourcesAndTasksPropertyDescriptor(object);
			addStatusDatePropertyDescriptor(object);
			addCurrentDatePropertyDescriptor(object);
			addMicrosoftProjectServerURLPropertyDescriptor(object);
			addAutolinkPropertyDescriptor(object);
			addNewTaskStartDatePropertyDescriptor(object);
			addDefaultTaskEVMethodPropertyDescriptor(object);
			addProjectExternallyEditedPropertyDescriptor(object);
			addExtendedCreationDatePropertyDescriptor(object);
			addActualsInSyncPropertyDescriptor(object);
			addRemoveFilePropertiesPropertyDescriptor(object);
			addAdminProjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Save Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSaveVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_saveVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_saveVersion_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__SAVE_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_uID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_uID_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_name_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_title_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_subject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_subject_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__SUBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_category_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Company feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompanyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_company_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_company_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__COMPANY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_manager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_manager_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MANAGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_author_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_creationDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_revision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_revision_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__REVISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Saved feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastSavedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_lastSaved_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_lastSaved_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__LAST_SAVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule From Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleFromStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_scheduleFromStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_scheduleFromStart_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__SCHEDULE_FROM_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_startDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_startDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_finishDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_finishDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__FINISH_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the FY Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFYStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_fYStartDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_fYStartDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__FY_START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Critical Slack Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriticalSlackLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_criticalSlackLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_criticalSlackLimit_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CRITICAL_SLACK_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Currency Digits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrencyDigitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_currencyDigits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_currencyDigits_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CURRENCY_DIGITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Currency Symbol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrencySymbolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_currencySymbol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_currencySymbol_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CURRENCY_SYMBOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Currency Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrencyCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_currencyCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_currencyCode_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CURRENCY_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Currency Symbol Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrencySymbolPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_currencySymbolPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_currencySymbolPosition_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calendar UID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalendarUIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_calendarUID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_calendarUID_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CALENDAR_UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Start Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStartTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_defaultStartTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_defaultStartTime_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DEFAULT_START_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Finish Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFinishTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_defaultFinishTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_defaultFinishTime_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DEFAULT_FINISH_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minutes Per Day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinutesPerDayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_minutesPerDay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_minutesPerDay_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MINUTES_PER_DAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minutes Per Week feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinutesPerWeekPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_minutesPerWeek_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_minutesPerWeek_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MINUTES_PER_WEEK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Days Per Month feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDaysPerMonthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_daysPerMonth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_daysPerMonth_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DAYS_PER_MONTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Task Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTaskTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_defaultTaskType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_defaultTaskType_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DEFAULT_TASK_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Fixed Cost Accrual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultFixedCostAccrualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_defaultFixedCostAccrual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_defaultFixedCostAccrual_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Standard Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultStandardRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_defaultStandardRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_defaultStandardRate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DEFAULT_STANDARD_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Overtime Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultOvertimeRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_defaultOvertimeRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_defaultOvertimeRate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DEFAULT_OVERTIME_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_durationFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_durationFormat_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DURATION_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_workFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_workFormat_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__WORK_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Editable Actual Costs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditableActualCostsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_editableActualCosts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_editableActualCosts_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Honor Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHonorConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_honorConstraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_honorConstraints_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__HONOR_CONSTRAINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Earned Value Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEarnedValueMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_earnedValueMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_earnedValueMethod_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__EARNED_VALUE_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inserted Projects Like Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertedProjectsLikeSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_insertedProjectsLikeSummary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_insertedProjectsLikeSummary_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiple Critical Paths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultipleCriticalPathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_multipleCriticalPaths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_multipleCriticalPaths_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Tasks Effort Driven feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewTasksEffortDrivenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_newTasksEffortDriven_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_newTasksEffortDriven_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Tasks Estimated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewTasksEstimatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_newTasksEstimated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_newTasksEstimated_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__NEW_TASKS_ESTIMATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Splits In Progress Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSplitsInProgressTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_splitsInProgressTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_splitsInProgressTasks_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spread Actual Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpreadActualCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_spreadActualCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_spreadActualCost_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__SPREAD_ACTUAL_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spread Percent Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpreadPercentCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_spreadPercentComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_spreadPercentComplete_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Task Updates Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskUpdatesResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_taskUpdatesResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_taskUpdatesResource_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__TASK_UPDATES_RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fiscal Year Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiscalYearStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_fiscalYearStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_fiscalYearStart_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__FISCAL_YEAR_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Week Start Day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeekStartDayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_weekStartDay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_weekStartDay_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__WEEK_START_DAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move Completed Ends Back feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoveCompletedEndsBackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_moveCompletedEndsBack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_moveCompletedEndsBack_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move Remaining Starts Back feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoveRemainingStartsBackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_moveRemainingStartsBack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_moveRemainingStartsBack_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move Remaining Starts Forward feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoveRemainingStartsForwardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_moveRemainingStartsForward_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_moveRemainingStartsForward_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Move Completed Ends Forward feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMoveCompletedEndsForwardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_moveCompletedEndsForward_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_moveCompletedEndsForward_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Baseline For Earned Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaselineForEarnedValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_baselineForEarnedValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_baselineForEarnedValue_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Add New Resources And Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoAddNewResourcesAndTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_autoAddNewResourcesAndTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_autoAddNewResourcesAndTasks_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_statusDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_statusDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__STATUS_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_currentDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_currentDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__CURRENT_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Microsoft Project Server URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicrosoftProjectServerURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_microsoftProjectServerURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_microsoftProjectServerURL_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autolink feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutolinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_autolink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_autolink_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__AUTOLINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Task Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewTaskStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_newTaskStartDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_newTaskStartDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__NEW_TASK_START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Task EV Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTaskEVMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_defaultTaskEVMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_defaultTaskEVMethod_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Externally Edited feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectExternallyEditedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_projectExternallyEdited_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_projectExternallyEdited_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extended Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_extendedCreationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_extendedCreationDate_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__EXTENDED_CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actuals In Sync feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualsInSyncPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_actualsInSync_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_actualsInSync_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__ACTUALS_IN_SYNC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remove File Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoveFilePropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_removeFileProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_removeFileProperties_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__REMOVE_FILE_PROPERTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Admin Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdminProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProjectType_adminProject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProjectType_adminProject_feature", "_UI_ProjectType_type"),
				 MspdiPackage.Literals.PROJECT_TYPE__ADMIN_PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MspdiPackage.Literals.PROJECT_TYPE__OUTLINE_CODES);
			childrenFeatures.add(MspdiPackage.Literals.PROJECT_TYPE__WBS_MASKS);
			childrenFeatures.add(MspdiPackage.Literals.PROJECT_TYPE__EXTENDED_ATTRIBUTES);
			childrenFeatures.add(MspdiPackage.Literals.PROJECT_TYPE__CALENDARS);
			childrenFeatures.add(MspdiPackage.Literals.PROJECT_TYPE__TASKS);
			childrenFeatures.add(MspdiPackage.Literals.PROJECT_TYPE__RESOURCES);
			childrenFeatures.add(MspdiPackage.Literals.PROJECT_TYPE__ASSIGNMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProjectType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProjectType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProjectType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProjectType_type") :
			getString("_UI_ProjectType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ProjectType.class)) {
			case MspdiPackage.PROJECT_TYPE__SAVE_VERSION:
			case MspdiPackage.PROJECT_TYPE__UID:
			case MspdiPackage.PROJECT_TYPE__NAME:
			case MspdiPackage.PROJECT_TYPE__TITLE:
			case MspdiPackage.PROJECT_TYPE__SUBJECT:
			case MspdiPackage.PROJECT_TYPE__CATEGORY:
			case MspdiPackage.PROJECT_TYPE__COMPANY:
			case MspdiPackage.PROJECT_TYPE__MANAGER:
			case MspdiPackage.PROJECT_TYPE__AUTHOR:
			case MspdiPackage.PROJECT_TYPE__CREATION_DATE:
			case MspdiPackage.PROJECT_TYPE__REVISION:
			case MspdiPackage.PROJECT_TYPE__LAST_SAVED:
			case MspdiPackage.PROJECT_TYPE__SCHEDULE_FROM_START:
			case MspdiPackage.PROJECT_TYPE__START_DATE:
			case MspdiPackage.PROJECT_TYPE__FINISH_DATE:
			case MspdiPackage.PROJECT_TYPE__FY_START_DATE:
			case MspdiPackage.PROJECT_TYPE__CRITICAL_SLACK_LIMIT:
			case MspdiPackage.PROJECT_TYPE__CURRENCY_DIGITS:
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL:
			case MspdiPackage.PROJECT_TYPE__CURRENCY_CODE:
			case MspdiPackage.PROJECT_TYPE__CURRENCY_SYMBOL_POSITION:
			case MspdiPackage.PROJECT_TYPE__CALENDAR_UID:
			case MspdiPackage.PROJECT_TYPE__DEFAULT_START_TIME:
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FINISH_TIME:
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_DAY:
			case MspdiPackage.PROJECT_TYPE__MINUTES_PER_WEEK:
			case MspdiPackage.PROJECT_TYPE__DAYS_PER_MONTH:
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_TYPE:
			case MspdiPackage.PROJECT_TYPE__DEFAULT_FIXED_COST_ACCRUAL:
			case MspdiPackage.PROJECT_TYPE__DEFAULT_STANDARD_RATE:
			case MspdiPackage.PROJECT_TYPE__DEFAULT_OVERTIME_RATE:
			case MspdiPackage.PROJECT_TYPE__DURATION_FORMAT:
			case MspdiPackage.PROJECT_TYPE__WORK_FORMAT:
			case MspdiPackage.PROJECT_TYPE__EDITABLE_ACTUAL_COSTS:
			case MspdiPackage.PROJECT_TYPE__HONOR_CONSTRAINTS:
			case MspdiPackage.PROJECT_TYPE__EARNED_VALUE_METHOD:
			case MspdiPackage.PROJECT_TYPE__INSERTED_PROJECTS_LIKE_SUMMARY:
			case MspdiPackage.PROJECT_TYPE__MULTIPLE_CRITICAL_PATHS:
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_EFFORT_DRIVEN:
			case MspdiPackage.PROJECT_TYPE__NEW_TASKS_ESTIMATED:
			case MspdiPackage.PROJECT_TYPE__SPLITS_IN_PROGRESS_TASKS:
			case MspdiPackage.PROJECT_TYPE__SPREAD_ACTUAL_COST:
			case MspdiPackage.PROJECT_TYPE__SPREAD_PERCENT_COMPLETE:
			case MspdiPackage.PROJECT_TYPE__TASK_UPDATES_RESOURCE:
			case MspdiPackage.PROJECT_TYPE__FISCAL_YEAR_START:
			case MspdiPackage.PROJECT_TYPE__WEEK_START_DAY:
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_BACK:
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_BACK:
			case MspdiPackage.PROJECT_TYPE__MOVE_REMAINING_STARTS_FORWARD:
			case MspdiPackage.PROJECT_TYPE__MOVE_COMPLETED_ENDS_FORWARD:
			case MspdiPackage.PROJECT_TYPE__BASELINE_FOR_EARNED_VALUE:
			case MspdiPackage.PROJECT_TYPE__AUTO_ADD_NEW_RESOURCES_AND_TASKS:
			case MspdiPackage.PROJECT_TYPE__STATUS_DATE:
			case MspdiPackage.PROJECT_TYPE__CURRENT_DATE:
			case MspdiPackage.PROJECT_TYPE__MICROSOFT_PROJECT_SERVER_URL:
			case MspdiPackage.PROJECT_TYPE__AUTOLINK:
			case MspdiPackage.PROJECT_TYPE__NEW_TASK_START_DATE:
			case MspdiPackage.PROJECT_TYPE__DEFAULT_TASK_EV_METHOD:
			case MspdiPackage.PROJECT_TYPE__PROJECT_EXTERNALLY_EDITED:
			case MspdiPackage.PROJECT_TYPE__EXTENDED_CREATION_DATE:
			case MspdiPackage.PROJECT_TYPE__ACTUALS_IN_SYNC:
			case MspdiPackage.PROJECT_TYPE__REMOVE_FILE_PROPERTIES:
			case MspdiPackage.PROJECT_TYPE__ADMIN_PROJECT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MspdiPackage.PROJECT_TYPE__OUTLINE_CODES:
			case MspdiPackage.PROJECT_TYPE__WBS_MASKS:
			case MspdiPackage.PROJECT_TYPE__EXTENDED_ATTRIBUTES:
			case MspdiPackage.PROJECT_TYPE__CALENDARS:
			case MspdiPackage.PROJECT_TYPE__TASKS:
			case MspdiPackage.PROJECT_TYPE__RESOURCES:
			case MspdiPackage.PROJECT_TYPE__ASSIGNMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.PROJECT_TYPE__OUTLINE_CODES,
				 MspdiFactory.eINSTANCE.createOutlineCodesType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.PROJECT_TYPE__WBS_MASKS,
				 MspdiFactory.eINSTANCE.createWBSMasksType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.PROJECT_TYPE__EXTENDED_ATTRIBUTES,
				 MspdiFactory.eINSTANCE.createExtendedAttributesType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.PROJECT_TYPE__CALENDARS,
				 MspdiFactory.eINSTANCE.createCalendarsType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.PROJECT_TYPE__TASKS,
				 MspdiFactory.eINSTANCE.createTasksType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.PROJECT_TYPE__RESOURCES,
				 MspdiFactory.eINSTANCE.createResourcesType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.PROJECT_TYPE__ASSIGNMENTS,
				 MspdiFactory.eINSTANCE.createAssignmentsType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MspdiEditPlugin.INSTANCE;
	}

}
