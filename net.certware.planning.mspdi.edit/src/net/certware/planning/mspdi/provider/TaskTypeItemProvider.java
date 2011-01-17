/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.provider;


import java.util.Collection;
import java.util.List;

import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.TaskType;

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
 * This is the item provider adapter for a {@link net.certware.planning.mspdi.TaskType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskTypeItemProvider
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
	public TaskTypeItemProvider(AdapterFactory adapterFactory) {
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

			addUIDPropertyDescriptor(object);
			addIDPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addIsNullPropertyDescriptor(object);
			addCreateDatePropertyDescriptor(object);
			addContactPropertyDescriptor(object);
			addWBSPropertyDescriptor(object);
			addWBSLevelPropertyDescriptor(object);
			addOutlineNumberPropertyDescriptor(object);
			addOutlineLevelPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addFinishPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addDurationFormatPropertyDescriptor(object);
			addWorkPropertyDescriptor(object);
			addStopPropertyDescriptor(object);
			addResumePropertyDescriptor(object);
			addResumeValidPropertyDescriptor(object);
			addEffortDrivenPropertyDescriptor(object);
			addRecurringPropertyDescriptor(object);
			addOverAllocatedPropertyDescriptor(object);
			addEstimatedPropertyDescriptor(object);
			addMilestonePropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addCriticalPropertyDescriptor(object);
			addIsSubprojectPropertyDescriptor(object);
			addIsSubprojectReadOnlyPropertyDescriptor(object);
			addSubprojectNamePropertyDescriptor(object);
			addExternalTaskPropertyDescriptor(object);
			addExternalTaskProjectPropertyDescriptor(object);
			addEarlyStartPropertyDescriptor(object);
			addEarlyFinishPropertyDescriptor(object);
			addLateStartPropertyDescriptor(object);
			addLateFinishPropertyDescriptor(object);
			addStartVariancePropertyDescriptor(object);
			addFinishVariancePropertyDescriptor(object);
			addWorkVariancePropertyDescriptor(object);
			addFreeSlackPropertyDescriptor(object);
			addTotalSlackPropertyDescriptor(object);
			addFixedCostPropertyDescriptor(object);
			addFixedCostAccrualPropertyDescriptor(object);
			addPercentCompletePropertyDescriptor(object);
			addPercentWorkCompletePropertyDescriptor(object);
			addCostPropertyDescriptor(object);
			addOvertimeCostPropertyDescriptor(object);
			addOvertimeWorkPropertyDescriptor(object);
			addActualStartPropertyDescriptor(object);
			addActualFinishPropertyDescriptor(object);
			addActualDurationPropertyDescriptor(object);
			addActualCostPropertyDescriptor(object);
			addActualOvertimeCostPropertyDescriptor(object);
			addActualWorkPropertyDescriptor(object);
			addActualOvertimeWorkPropertyDescriptor(object);
			addRegularWorkPropertyDescriptor(object);
			addRemainingDurationPropertyDescriptor(object);
			addRemainingCostPropertyDescriptor(object);
			addRemainingWorkPropertyDescriptor(object);
			addRemainingOvertimeCostPropertyDescriptor(object);
			addRemainingOvertimeWorkPropertyDescriptor(object);
			addACWPPropertyDescriptor(object);
			addCVPropertyDescriptor(object);
			addConstraintTypePropertyDescriptor(object);
			addCalendarUIDPropertyDescriptor(object);
			addConstraintDatePropertyDescriptor(object);
			addDeadlinePropertyDescriptor(object);
			addLevelAssignmentsPropertyDescriptor(object);
			addLevelingCanSplitPropertyDescriptor(object);
			addLevelingDelayPropertyDescriptor(object);
			addLevelingDelayFormatPropertyDescriptor(object);
			addPreLeveledStartPropertyDescriptor(object);
			addPreLeveledFinishPropertyDescriptor(object);
			addHyperlinkPropertyDescriptor(object);
			addHyperlinkAddressPropertyDescriptor(object);
			addHyperlinkSubAddressPropertyDescriptor(object);
			addIgnoreResourceCalendarPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addHideBarPropertyDescriptor(object);
			addRollupPropertyDescriptor(object);
			addBCWSPropertyDescriptor(object);
			addBCWPPropertyDescriptor(object);
			addPhysicalPercentCompletePropertyDescriptor(object);
			addEarnedValueMethodPropertyDescriptor(object);
			addActualWorkProtectedPropertyDescriptor(object);
			addActualOvertimeWorkProtectedPropertyDescriptor(object);
			addIsPublishedPropertyDescriptor(object);
			addStatusManagerPropertyDescriptor(object);
			addCommitmentStartPropertyDescriptor(object);
			addCommitmentFinishPropertyDescriptor(object);
			addCommitmentTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_TaskType_uID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_uID_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_iD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_iD_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ID,
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
				 getString("_UI_TaskType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_name_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_type_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Null feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsNullPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_isNull_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_isNull_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__IS_NULL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_createDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_createDate_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__CREATE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_contact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_contact_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__CONTACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the WBS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWBSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_wBS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_wBS_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__WBS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the WBS Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWBSLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_wBSLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_wBSLevel_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__WBS_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outline Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutlineNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_outlineNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_outlineNumber_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__OUTLINE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outline Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutlineLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_outlineLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_outlineLevel_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__OUTLINE_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_priority_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_start_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_finish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_finish_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__FINISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_duration_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_TaskType_durationFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_durationFormat_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__DURATION_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_work_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_work_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_stop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_stop_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__STOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_resume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_resume_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__RESUME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resume Valid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResumeValidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_resumeValid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_resumeValid_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__RESUME_VALID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effort Driven feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffortDrivenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_effortDriven_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_effortDriven_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__EFFORT_DRIVEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recurring feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecurringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_recurring_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_recurring_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__RECURRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Over Allocated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverAllocatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_overAllocated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_overAllocated_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__OVER_ALLOCATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estimated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstimatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_estimated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_estimated_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ESTIMATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Milestone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMilestonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_milestone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_milestone_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__MILESTONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_summary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_summary_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Critical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_critical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_critical_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__CRITICAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Subproject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubprojectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_isSubproject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_isSubproject_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__IS_SUBPROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Subproject Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSubprojectReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_isSubprojectReadOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_isSubprojectReadOnly_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__IS_SUBPROJECT_READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subproject Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubprojectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_subprojectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_subprojectName_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__SUBPROJECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_externalTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_externalTask_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__EXTERNAL_TASK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Task Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalTaskProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_externalTaskProject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_externalTaskProject_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__EXTERNAL_TASK_PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Early Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEarlyStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_earlyStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_earlyStart_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__EARLY_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Early Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEarlyFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_earlyFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_earlyFinish_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__EARLY_FINISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Late Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLateStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_lateStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_lateStart_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__LATE_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Late Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLateFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_lateFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_lateFinish_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__LATE_FINISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Variance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_startVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_startVariance_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__START_VARIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finish Variance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_finishVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_finishVariance_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__FINISH_VARIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work Variance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_workVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_workVariance_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__WORK_VARIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Free Slack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreeSlackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_freeSlack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_freeSlack_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__FREE_SLACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Slack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalSlackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_totalSlack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_totalSlack_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__TOTAL_SLACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fixed Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_fixedCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_fixedCost_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__FIXED_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fixed Cost Accrual feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedCostAccrualPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_fixedCostAccrual_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_fixedCostAccrual_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__FIXED_COST_ACCRUAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Percent Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercentCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_percentComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_percentComplete_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__PERCENT_COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Percent Work Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercentWorkCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_percentWorkComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_percentWorkComplete_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__PERCENT_WORK_COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_cost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_cost_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overtime Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOvertimeCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_overtimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_overtimeCost_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__OVERTIME_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overtime Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOvertimeWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_overtimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_overtimeWork_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__OVERTIME_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualStart_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualFinish_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_FINISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualDuration_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualCost_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Overtime Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualOvertimeCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualOvertimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualOvertimeCost_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_OVERTIME_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualWork_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Overtime Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualOvertimeWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualOvertimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualOvertimeWork_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_OVERTIME_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regular Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegularWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_regularWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_regularWork_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__REGULAR_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_remainingDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_remainingDuration_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__REMAINING_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_remainingCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_remainingCost_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__REMAINING_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_remainingWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_remainingWork_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__REMAINING_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Overtime Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingOvertimeCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_remainingOvertimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_remainingOvertimeCost_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__REMAINING_OVERTIME_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remaining Overtime Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemainingOvertimeWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_remainingOvertimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_remainingOvertimeWork_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__REMAINING_OVERTIME_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ACWP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addACWPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_aCWP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_aCWP_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACWP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_cV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_cV_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__CV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_constraintType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_constraintType_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__CONSTRAINT_TYPE,
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
				 getString("_UI_TaskType_calendarUID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_calendarUID_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__CALENDAR_UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_constraintDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_constraintDate_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__CONSTRAINT_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_deadline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_deadline_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__DEADLINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Level Assignments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelAssignmentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_levelAssignments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_levelAssignments_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__LEVEL_ASSIGNMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leveling Can Split feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelingCanSplitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_levelingCanSplit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_levelingCanSplit_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__LEVELING_CAN_SPLIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leveling Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelingDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_levelingDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_levelingDelay_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__LEVELING_DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leveling Delay Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLevelingDelayFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_levelingDelayFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_levelingDelayFormat_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__LEVELING_DELAY_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Leveled Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreLeveledStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_preLeveledStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_preLeveledStart_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__PRE_LEVELED_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre Leveled Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreLeveledFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_preLeveledFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_preLeveledFinish_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__PRE_LEVELED_FINISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hyperlink feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHyperlinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_hyperlink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_hyperlink_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__HYPERLINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hyperlink Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHyperlinkAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_hyperlinkAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_hyperlinkAddress_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__HYPERLINK_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hyperlink Sub Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHyperlinkSubAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_hyperlinkSubAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_hyperlinkSubAddress_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__HYPERLINK_SUB_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ignore Resource Calendar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreResourceCalendarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_ignoreResourceCalendar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_ignoreResourceCalendar_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__IGNORE_RESOURCE_CALENDAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_notes_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__NOTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hide Bar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHideBarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_hideBar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_hideBar_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__HIDE_BAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rollup feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRollupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_rollup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_rollup_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ROLLUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the BCWS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBCWSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_bCWS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_bCWS_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__BCWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the BCWP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBCWPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_bCWP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_bCWP_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__BCWP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physical Percent Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicalPercentCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_physicalPercentComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_physicalPercentComplete_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__PHYSICAL_PERCENT_COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_TaskType_earnedValueMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_earnedValueMethod_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__EARNED_VALUE_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Work Protected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualWorkProtectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualWorkProtected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualWorkProtected_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_WORK_PROTECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Overtime Work Protected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualOvertimeWorkProtectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_actualOvertimeWorkProtected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_actualOvertimeWorkProtected_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Published feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPublishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_isPublished_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_isPublished_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__IS_PUBLISHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_statusManager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_statusManager_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__STATUS_MANAGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commitment Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommitmentStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_commitmentStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_commitmentStart_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__COMMITMENT_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commitment Finish feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommitmentFinishPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_commitmentFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_commitmentFinish_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__COMMITMENT_FINISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commitment Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommitmentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_commitmentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_commitmentType_feature", "_UI_TaskType_type"),
				 MspdiPackage.Literals.TASK_TYPE__COMMITMENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(MspdiPackage.Literals.TASK_TYPE__PREDECESSOR_LINK);
			childrenFeatures.add(MspdiPackage.Literals.TASK_TYPE__EXTENDED_ATTRIBUTE);
			childrenFeatures.add(MspdiPackage.Literals.TASK_TYPE__BASELINE);
			childrenFeatures.add(MspdiPackage.Literals.TASK_TYPE__OUTLINE_CODE);
			childrenFeatures.add(MspdiPackage.Literals.TASK_TYPE__TIMEPHASED_DATA);
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
	 * This returns TaskType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskType_type") :
			getString("_UI_TaskType_type") + " " + label;
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

		switch (notification.getFeatureID(TaskType.class)) {
			case MspdiPackage.TASK_TYPE__UID:
			case MspdiPackage.TASK_TYPE__ID:
			case MspdiPackage.TASK_TYPE__NAME:
			case MspdiPackage.TASK_TYPE__TYPE:
			case MspdiPackage.TASK_TYPE__IS_NULL:
			case MspdiPackage.TASK_TYPE__CREATE_DATE:
			case MspdiPackage.TASK_TYPE__CONTACT:
			case MspdiPackage.TASK_TYPE__WBS:
			case MspdiPackage.TASK_TYPE__WBS_LEVEL:
			case MspdiPackage.TASK_TYPE__OUTLINE_NUMBER:
			case MspdiPackage.TASK_TYPE__OUTLINE_LEVEL:
			case MspdiPackage.TASK_TYPE__PRIORITY:
			case MspdiPackage.TASK_TYPE__START:
			case MspdiPackage.TASK_TYPE__FINISH:
			case MspdiPackage.TASK_TYPE__DURATION:
			case MspdiPackage.TASK_TYPE__DURATION_FORMAT:
			case MspdiPackage.TASK_TYPE__WORK:
			case MspdiPackage.TASK_TYPE__STOP:
			case MspdiPackage.TASK_TYPE__RESUME:
			case MspdiPackage.TASK_TYPE__RESUME_VALID:
			case MspdiPackage.TASK_TYPE__EFFORT_DRIVEN:
			case MspdiPackage.TASK_TYPE__RECURRING:
			case MspdiPackage.TASK_TYPE__OVER_ALLOCATED:
			case MspdiPackage.TASK_TYPE__ESTIMATED:
			case MspdiPackage.TASK_TYPE__MILESTONE:
			case MspdiPackage.TASK_TYPE__SUMMARY:
			case MspdiPackage.TASK_TYPE__CRITICAL:
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT:
			case MspdiPackage.TASK_TYPE__IS_SUBPROJECT_READ_ONLY:
			case MspdiPackage.TASK_TYPE__SUBPROJECT_NAME:
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK:
			case MspdiPackage.TASK_TYPE__EXTERNAL_TASK_PROJECT:
			case MspdiPackage.TASK_TYPE__EARLY_START:
			case MspdiPackage.TASK_TYPE__EARLY_FINISH:
			case MspdiPackage.TASK_TYPE__LATE_START:
			case MspdiPackage.TASK_TYPE__LATE_FINISH:
			case MspdiPackage.TASK_TYPE__START_VARIANCE:
			case MspdiPackage.TASK_TYPE__FINISH_VARIANCE:
			case MspdiPackage.TASK_TYPE__WORK_VARIANCE:
			case MspdiPackage.TASK_TYPE__FREE_SLACK:
			case MspdiPackage.TASK_TYPE__TOTAL_SLACK:
			case MspdiPackage.TASK_TYPE__FIXED_COST:
			case MspdiPackage.TASK_TYPE__FIXED_COST_ACCRUAL:
			case MspdiPackage.TASK_TYPE__PERCENT_COMPLETE:
			case MspdiPackage.TASK_TYPE__PERCENT_WORK_COMPLETE:
			case MspdiPackage.TASK_TYPE__COST:
			case MspdiPackage.TASK_TYPE__OVERTIME_COST:
			case MspdiPackage.TASK_TYPE__OVERTIME_WORK:
			case MspdiPackage.TASK_TYPE__ACTUAL_START:
			case MspdiPackage.TASK_TYPE__ACTUAL_FINISH:
			case MspdiPackage.TASK_TYPE__ACTUAL_DURATION:
			case MspdiPackage.TASK_TYPE__ACTUAL_COST:
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_COST:
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK:
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK:
			case MspdiPackage.TASK_TYPE__REGULAR_WORK:
			case MspdiPackage.TASK_TYPE__REMAINING_DURATION:
			case MspdiPackage.TASK_TYPE__REMAINING_COST:
			case MspdiPackage.TASK_TYPE__REMAINING_WORK:
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_COST:
			case MspdiPackage.TASK_TYPE__REMAINING_OVERTIME_WORK:
			case MspdiPackage.TASK_TYPE__ACWP:
			case MspdiPackage.TASK_TYPE__CV:
			case MspdiPackage.TASK_TYPE__CONSTRAINT_TYPE:
			case MspdiPackage.TASK_TYPE__CALENDAR_UID:
			case MspdiPackage.TASK_TYPE__CONSTRAINT_DATE:
			case MspdiPackage.TASK_TYPE__DEADLINE:
			case MspdiPackage.TASK_TYPE__LEVEL_ASSIGNMENTS:
			case MspdiPackage.TASK_TYPE__LEVELING_CAN_SPLIT:
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY:
			case MspdiPackage.TASK_TYPE__LEVELING_DELAY_FORMAT:
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_START:
			case MspdiPackage.TASK_TYPE__PRE_LEVELED_FINISH:
			case MspdiPackage.TASK_TYPE__HYPERLINK:
			case MspdiPackage.TASK_TYPE__HYPERLINK_ADDRESS:
			case MspdiPackage.TASK_TYPE__HYPERLINK_SUB_ADDRESS:
			case MspdiPackage.TASK_TYPE__IGNORE_RESOURCE_CALENDAR:
			case MspdiPackage.TASK_TYPE__NOTES:
			case MspdiPackage.TASK_TYPE__HIDE_BAR:
			case MspdiPackage.TASK_TYPE__ROLLUP:
			case MspdiPackage.TASK_TYPE__BCWS:
			case MspdiPackage.TASK_TYPE__BCWP:
			case MspdiPackage.TASK_TYPE__PHYSICAL_PERCENT_COMPLETE:
			case MspdiPackage.TASK_TYPE__EARNED_VALUE_METHOD:
			case MspdiPackage.TASK_TYPE__ACTUAL_WORK_PROTECTED:
			case MspdiPackage.TASK_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
			case MspdiPackage.TASK_TYPE__IS_PUBLISHED:
			case MspdiPackage.TASK_TYPE__STATUS_MANAGER:
			case MspdiPackage.TASK_TYPE__COMMITMENT_START:
			case MspdiPackage.TASK_TYPE__COMMITMENT_FINISH:
			case MspdiPackage.TASK_TYPE__COMMITMENT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MspdiPackage.TASK_TYPE__PREDECESSOR_LINK:
			case MspdiPackage.TASK_TYPE__EXTENDED_ATTRIBUTE:
			case MspdiPackage.TASK_TYPE__BASELINE:
			case MspdiPackage.TASK_TYPE__OUTLINE_CODE:
			case MspdiPackage.TASK_TYPE__TIMEPHASED_DATA:
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
				(MspdiPackage.Literals.TASK_TYPE__PREDECESSOR_LINK,
				 MspdiFactory.eINSTANCE.createPredecessorLinkType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.TASK_TYPE__EXTENDED_ATTRIBUTE,
				 MspdiFactory.eINSTANCE.createExtendedAttributeType2()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.TASK_TYPE__BASELINE,
				 MspdiFactory.eINSTANCE.createBaselineType2()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.TASK_TYPE__OUTLINE_CODE,
				 MspdiFactory.eINSTANCE.createOutlineCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.TASK_TYPE__TIMEPHASED_DATA,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));
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
