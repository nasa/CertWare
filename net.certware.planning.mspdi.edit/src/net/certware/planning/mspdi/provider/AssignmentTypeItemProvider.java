/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.provider;


import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

import net.certware.planning.mspdi.AssignmentType;
import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.MspdiPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
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
 * This is the item provider adapter for a {@link net.certware.planning.mspdi.AssignmentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentTypeItemProvider
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
	public AssignmentTypeItemProvider(AdapterFactory adapterFactory) {
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
			addTaskUIDPropertyDescriptor(object);
			addResourceUIDPropertyDescriptor(object);
			addPercentWorkCompletePropertyDescriptor(object);
			addActualCostPropertyDescriptor(object);
			addActualFinishPropertyDescriptor(object);
			addActualOvertimeCostPropertyDescriptor(object);
			addActualOvertimeWorkPropertyDescriptor(object);
			addActualStartPropertyDescriptor(object);
			addActualWorkPropertyDescriptor(object);
			addACWPPropertyDescriptor(object);
			addConfirmedPropertyDescriptor(object);
			addCostPropertyDescriptor(object);
			addCostRateTablePropertyDescriptor(object);
			addCostVariancePropertyDescriptor(object);
			addCVPropertyDescriptor(object);
			addDelayPropertyDescriptor(object);
			addFinishPropertyDescriptor(object);
			addFinishVariancePropertyDescriptor(object);
			addHyperlinkPropertyDescriptor(object);
			addHyperlinkAddressPropertyDescriptor(object);
			addHyperlinkSubAddressPropertyDescriptor(object);
			addWorkVariancePropertyDescriptor(object);
			addHasFixedRateUnitsPropertyDescriptor(object);
			addFixedMaterialPropertyDescriptor(object);
			addLevelingDelayPropertyDescriptor(object);
			addLevelingDelayFormatPropertyDescriptor(object);
			addLinkedFieldsPropertyDescriptor(object);
			addMilestonePropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addOverallocatedPropertyDescriptor(object);
			addOvertimeCostPropertyDescriptor(object);
			addOvertimeWorkPropertyDescriptor(object);
			addPeakUnitsPropertyDescriptor(object);
			addRegularWorkPropertyDescriptor(object);
			addRemainingCostPropertyDescriptor(object);
			addRemainingOvertimeCostPropertyDescriptor(object);
			addRemainingOvertimeWorkPropertyDescriptor(object);
			addRemainingWorkPropertyDescriptor(object);
			addResponsePendingPropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addStopPropertyDescriptor(object);
			addResumePropertyDescriptor(object);
			addStartVariancePropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addSVPropertyDescriptor(object);
			addUnitsPropertyDescriptor(object);
			addUpdateNeededPropertyDescriptor(object);
			addVACPropertyDescriptor(object);
			addWorkPropertyDescriptor(object);
			addWorkContourPropertyDescriptor(object);
			addBCWSPropertyDescriptor(object);
			addBCWPPropertyDescriptor(object);
			addBookingTypePropertyDescriptor(object);
			addActualWorkProtectedPropertyDescriptor(object);
			addActualOvertimeWorkProtectedPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addAssnOwnerPropertyDescriptor(object);
			addAssnOwnerGuidPropertyDescriptor(object);
			addBudgetCostPropertyDescriptor(object);
			addBudgetWorkPropertyDescriptor(object);
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
				 getString("_UI_AssignmentType_uID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_uID_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Task UID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTaskUIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_taskUID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_taskUID_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__TASK_UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource UID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceUIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_resourceUID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_resourceUID_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__RESOURCE_UID,
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
				 getString("_UI_AssignmentType_percentWorkComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_percentWorkComplete_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE,
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
				 getString("_UI_AssignmentType_actualCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualCost_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_COST,
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
				 getString("_UI_AssignmentType_actualFinish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualFinish_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_FINISH,
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
				 getString("_UI_AssignmentType_actualOvertimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualOvertimeCost_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST,
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
				 getString("_UI_AssignmentType_actualOvertimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualOvertimeWork_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK,
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
				 getString("_UI_AssignmentType_actualStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualStart_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_START,
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
				 getString("_UI_AssignmentType_actualWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualWork_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_WORK,
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
				 getString("_UI_AssignmentType_aCWP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_aCWP_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACWP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Confirmed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfirmedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_confirmed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_confirmed_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__CONFIRMED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_AssignmentType_cost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_cost_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cost Rate Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostRateTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_costRateTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_costRateTable_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__COST_RATE_TABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cost Variance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostVariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_costVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_costVariance_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__COST_VARIANCE,
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
				 getString("_UI_AssignmentType_cV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_cV_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__CV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_delay_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__DELAY,
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
				 getString("_UI_AssignmentType_finish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_finish_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__FINISH,
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
				 getString("_UI_AssignmentType_finishVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_finishVariance_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__FINISH_VARIANCE,
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
				 getString("_UI_AssignmentType_hyperlink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_hyperlink_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__HYPERLINK,
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
				 getString("_UI_AssignmentType_hyperlinkAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_hyperlinkAddress_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__HYPERLINK_ADDRESS,
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
				 getString("_UI_AssignmentType_hyperlinkSubAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_hyperlinkSubAddress_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS,
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
				 getString("_UI_AssignmentType_workVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_workVariance_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__WORK_VARIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Fixed Rate Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFixedRateUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_hasFixedRateUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_hasFixedRateUnits_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fixed Material feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedMaterialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_fixedMaterial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_fixedMaterial_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__FIXED_MATERIAL,
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
				 getString("_UI_AssignmentType_levelingDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_levelingDelay_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__LEVELING_DELAY,
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
				 getString("_UI_AssignmentType_levelingDelayFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_levelingDelayFormat_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_linkedFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_linkedFields_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__LINKED_FIELDS,
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
				 getString("_UI_AssignmentType_milestone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_milestone_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__MILESTONE,
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
				 getString("_UI_AssignmentType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_notes_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__NOTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overallocated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverallocatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_overallocated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_overallocated_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__OVERALLOCATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_AssignmentType_overtimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_overtimeCost_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__OVERTIME_COST,
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
				 getString("_UI_AssignmentType_overtimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_overtimeWork_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__OVERTIME_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peak Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeakUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_peakUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_peakUnits_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__PEAK_UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_AssignmentType_regularWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_regularWork_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__REGULAR_WORK,
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
				 getString("_UI_AssignmentType_remainingCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_remainingCost_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__REMAINING_COST,
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
				 getString("_UI_AssignmentType_remainingOvertimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_remainingOvertimeCost_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST,
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
				 getString("_UI_AssignmentType_remainingOvertimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_remainingOvertimeWork_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK,
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
				 getString("_UI_AssignmentType_remainingWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_remainingWork_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__REMAINING_WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Pending feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsePendingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_responsePending_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_responsePending_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__RESPONSE_PENDING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_AssignmentType_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_start_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__START,
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
				 getString("_UI_AssignmentType_stop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_stop_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__STOP,
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
				 getString("_UI_AssignmentType_resume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_resume_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__RESUME,
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
				 getString("_UI_AssignmentType_startVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_startVariance_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__START_VARIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_AssignmentType_summary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_summary_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_sV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_sV_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__SV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_units_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_units_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Needed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateNeededPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_updateNeeded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_updateNeeded_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__UPDATE_NEEDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VAC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVACPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_vAC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_vAC_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__VAC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_AssignmentType_work_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_work_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__WORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work Contour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkContourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_workContour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_workContour_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__WORK_CONTOUR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_AssignmentType_bCWS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_bCWS_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__BCWS,
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
				 getString("_UI_AssignmentType_bCWP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_bCWP_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__BCWP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Booking Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBookingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_bookingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_bookingType_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__BOOKING_TYPE,
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
				 getString("_UI_AssignmentType_actualWorkProtected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualWorkProtected_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED,
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
				 getString("_UI_AssignmentType_actualOvertimeWorkProtected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_actualOvertimeWorkProtected_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED,
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
				 getString("_UI_AssignmentType_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_creationDate_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assn Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssnOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_assnOwner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_assnOwner_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ASSN_OWNER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assn Owner Guid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssnOwnerGuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_assnOwnerGuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_assnOwnerGuid_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__ASSN_OWNER_GUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Budget Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBudgetCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_budgetCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_budgetCost_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__BUDGET_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Budget Work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBudgetWorkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AssignmentType_budgetWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AssignmentType_budgetWork_feature", "_UI_AssignmentType_type"),
				 MspdiPackage.Literals.ASSIGNMENT_TYPE__BUDGET_WORK,
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
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__BASELINE);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404000);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404001);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404002);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404003);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404004);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404005);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404006);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404007);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404008);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404009);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404010);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404011);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404012);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404013);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404014);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404015);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404016);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404017);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404018);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404019);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404020);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404021);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404022);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404023);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404024);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404025);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404026);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404027);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404028);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404029);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404030);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404031);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404032);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404033);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404034);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404035);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404036);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404037);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404038);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404039);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404040);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404041);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404042);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404043);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404044);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404045);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404046);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404047);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404048);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404049);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404050);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404051);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404052);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404053);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404054);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404055);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404056);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404057);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404058);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404059);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404060);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404061);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404062);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404063);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404064);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404065);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404066);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404067);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404068);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404069);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404070);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404071);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404072);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404073);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404074);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404075);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404076);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404077);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404078);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404079);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404080);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404081);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404082);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404083);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404084);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404085);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404086);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404087);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404088);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404089);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404090);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404091);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404092);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404093);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404094);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404095);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404096);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404097);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404098);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404099);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409A);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409B);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409C);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409D);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409E);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409F);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A0);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A1);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A2);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A3);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A4);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A5);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A6);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A7);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A8);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A9);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AA);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AB);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AC);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AD);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AE);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AF);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B0);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B1);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B2);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B3);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B4);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B5);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B6);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B7);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B8);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B9);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BA);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BB);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BC);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BD);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BE);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BF);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C0);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C1);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C2);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C3);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C4);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C5);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C6);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C7);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C8);
			childrenFeatures.add(MspdiPackage.Literals.ASSIGNMENT_TYPE__TIMEPHASED_DATA);
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
	 * This returns AssignmentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssignmentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((AssignmentType)object).getUID();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AssignmentType_type") :
			getString("_UI_AssignmentType_type") + " " + label;
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

		switch (notification.getFeatureID(AssignmentType.class)) {
			case MspdiPackage.ASSIGNMENT_TYPE__UID:
			case MspdiPackage.ASSIGNMENT_TYPE__TASK_UID:
			case MspdiPackage.ASSIGNMENT_TYPE__RESOURCE_UID:
			case MspdiPackage.ASSIGNMENT_TYPE__PERCENT_WORK_COMPLETE:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_COST:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_FINISH:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_COST:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_START:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK:
			case MspdiPackage.ASSIGNMENT_TYPE__ACWP:
			case MspdiPackage.ASSIGNMENT_TYPE__CONFIRMED:
			case MspdiPackage.ASSIGNMENT_TYPE__COST:
			case MspdiPackage.ASSIGNMENT_TYPE__COST_RATE_TABLE:
			case MspdiPackage.ASSIGNMENT_TYPE__COST_VARIANCE:
			case MspdiPackage.ASSIGNMENT_TYPE__CV:
			case MspdiPackage.ASSIGNMENT_TYPE__DELAY:
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH:
			case MspdiPackage.ASSIGNMENT_TYPE__FINISH_VARIANCE:
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK:
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_ADDRESS:
			case MspdiPackage.ASSIGNMENT_TYPE__HYPERLINK_SUB_ADDRESS:
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_VARIANCE:
			case MspdiPackage.ASSIGNMENT_TYPE__HAS_FIXED_RATE_UNITS:
			case MspdiPackage.ASSIGNMENT_TYPE__FIXED_MATERIAL:
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY:
			case MspdiPackage.ASSIGNMENT_TYPE__LEVELING_DELAY_FORMAT:
			case MspdiPackage.ASSIGNMENT_TYPE__LINKED_FIELDS:
			case MspdiPackage.ASSIGNMENT_TYPE__MILESTONE:
			case MspdiPackage.ASSIGNMENT_TYPE__NOTES:
			case MspdiPackage.ASSIGNMENT_TYPE__OVERALLOCATED:
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_COST:
			case MspdiPackage.ASSIGNMENT_TYPE__OVERTIME_WORK:
			case MspdiPackage.ASSIGNMENT_TYPE__PEAK_UNITS:
			case MspdiPackage.ASSIGNMENT_TYPE__REGULAR_WORK:
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_COST:
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_COST:
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_OVERTIME_WORK:
			case MspdiPackage.ASSIGNMENT_TYPE__REMAINING_WORK:
			case MspdiPackage.ASSIGNMENT_TYPE__RESPONSE_PENDING:
			case MspdiPackage.ASSIGNMENT_TYPE__START:
			case MspdiPackage.ASSIGNMENT_TYPE__STOP:
			case MspdiPackage.ASSIGNMENT_TYPE__RESUME:
			case MspdiPackage.ASSIGNMENT_TYPE__START_VARIANCE:
			case MspdiPackage.ASSIGNMENT_TYPE__SUMMARY:
			case MspdiPackage.ASSIGNMENT_TYPE__SV:
			case MspdiPackage.ASSIGNMENT_TYPE__UNITS:
			case MspdiPackage.ASSIGNMENT_TYPE__UPDATE_NEEDED:
			case MspdiPackage.ASSIGNMENT_TYPE__VAC:
			case MspdiPackage.ASSIGNMENT_TYPE__WORK:
			case MspdiPackage.ASSIGNMENT_TYPE__WORK_CONTOUR:
			case MspdiPackage.ASSIGNMENT_TYPE__BCWS:
			case MspdiPackage.ASSIGNMENT_TYPE__BCWP:
			case MspdiPackage.ASSIGNMENT_TYPE__BOOKING_TYPE:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_WORK_PROTECTED:
			case MspdiPackage.ASSIGNMENT_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
			case MspdiPackage.ASSIGNMENT_TYPE__CREATION_DATE:
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER:
			case MspdiPackage.ASSIGNMENT_TYPE__ASSN_OWNER_GUID:
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_COST:
			case MspdiPackage.ASSIGNMENT_TYPE__BUDGET_WORK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MspdiPackage.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE:
			case MspdiPackage.ASSIGNMENT_TYPE__BASELINE:
			case MspdiPackage.ASSIGNMENT_TYPE__F404000:
			case MspdiPackage.ASSIGNMENT_TYPE__F404001:
			case MspdiPackage.ASSIGNMENT_TYPE__F404002:
			case MspdiPackage.ASSIGNMENT_TYPE__F404003:
			case MspdiPackage.ASSIGNMENT_TYPE__F404004:
			case MspdiPackage.ASSIGNMENT_TYPE__F404005:
			case MspdiPackage.ASSIGNMENT_TYPE__F404006:
			case MspdiPackage.ASSIGNMENT_TYPE__F404007:
			case MspdiPackage.ASSIGNMENT_TYPE__F404008:
			case MspdiPackage.ASSIGNMENT_TYPE__F404009:
			case MspdiPackage.ASSIGNMENT_TYPE__F40400A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40400B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40400C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40400D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40400E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40400F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404010:
			case MspdiPackage.ASSIGNMENT_TYPE__F404011:
			case MspdiPackage.ASSIGNMENT_TYPE__F404012:
			case MspdiPackage.ASSIGNMENT_TYPE__F404013:
			case MspdiPackage.ASSIGNMENT_TYPE__F404014:
			case MspdiPackage.ASSIGNMENT_TYPE__F404015:
			case MspdiPackage.ASSIGNMENT_TYPE__F404016:
			case MspdiPackage.ASSIGNMENT_TYPE__F404017:
			case MspdiPackage.ASSIGNMENT_TYPE__F404018:
			case MspdiPackage.ASSIGNMENT_TYPE__F404019:
			case MspdiPackage.ASSIGNMENT_TYPE__F40401A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40401B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40401C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40401D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40401E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40401F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404020:
			case MspdiPackage.ASSIGNMENT_TYPE__F404021:
			case MspdiPackage.ASSIGNMENT_TYPE__F404022:
			case MspdiPackage.ASSIGNMENT_TYPE__F404023:
			case MspdiPackage.ASSIGNMENT_TYPE__F404024:
			case MspdiPackage.ASSIGNMENT_TYPE__F404025:
			case MspdiPackage.ASSIGNMENT_TYPE__F404026:
			case MspdiPackage.ASSIGNMENT_TYPE__F404027:
			case MspdiPackage.ASSIGNMENT_TYPE__F404028:
			case MspdiPackage.ASSIGNMENT_TYPE__F404029:
			case MspdiPackage.ASSIGNMENT_TYPE__F40402A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40402B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40402C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40402D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40402E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40402F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404030:
			case MspdiPackage.ASSIGNMENT_TYPE__F404031:
			case MspdiPackage.ASSIGNMENT_TYPE__F404032:
			case MspdiPackage.ASSIGNMENT_TYPE__F404033:
			case MspdiPackage.ASSIGNMENT_TYPE__F404034:
			case MspdiPackage.ASSIGNMENT_TYPE__F404035:
			case MspdiPackage.ASSIGNMENT_TYPE__F404036:
			case MspdiPackage.ASSIGNMENT_TYPE__F404037:
			case MspdiPackage.ASSIGNMENT_TYPE__F404038:
			case MspdiPackage.ASSIGNMENT_TYPE__F404039:
			case MspdiPackage.ASSIGNMENT_TYPE__F40403A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40403B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40403C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40403D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40403E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40403F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404040:
			case MspdiPackage.ASSIGNMENT_TYPE__F404041:
			case MspdiPackage.ASSIGNMENT_TYPE__F404042:
			case MspdiPackage.ASSIGNMENT_TYPE__F404043:
			case MspdiPackage.ASSIGNMENT_TYPE__F404044:
			case MspdiPackage.ASSIGNMENT_TYPE__F404045:
			case MspdiPackage.ASSIGNMENT_TYPE__F404046:
			case MspdiPackage.ASSIGNMENT_TYPE__F404047:
			case MspdiPackage.ASSIGNMENT_TYPE__F404048:
			case MspdiPackage.ASSIGNMENT_TYPE__F404049:
			case MspdiPackage.ASSIGNMENT_TYPE__F40404A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40404B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40404C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40404D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40404E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40404F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404050:
			case MspdiPackage.ASSIGNMENT_TYPE__F404051:
			case MspdiPackage.ASSIGNMENT_TYPE__F404052:
			case MspdiPackage.ASSIGNMENT_TYPE__F404053:
			case MspdiPackage.ASSIGNMENT_TYPE__F404054:
			case MspdiPackage.ASSIGNMENT_TYPE__F404055:
			case MspdiPackage.ASSIGNMENT_TYPE__F404056:
			case MspdiPackage.ASSIGNMENT_TYPE__F404057:
			case MspdiPackage.ASSIGNMENT_TYPE__F404058:
			case MspdiPackage.ASSIGNMENT_TYPE__F404059:
			case MspdiPackage.ASSIGNMENT_TYPE__F40405A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40405B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40405C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40405D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40405E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40405F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404060:
			case MspdiPackage.ASSIGNMENT_TYPE__F404061:
			case MspdiPackage.ASSIGNMENT_TYPE__F404062:
			case MspdiPackage.ASSIGNMENT_TYPE__F404063:
			case MspdiPackage.ASSIGNMENT_TYPE__F404064:
			case MspdiPackage.ASSIGNMENT_TYPE__F404065:
			case MspdiPackage.ASSIGNMENT_TYPE__F404066:
			case MspdiPackage.ASSIGNMENT_TYPE__F404067:
			case MspdiPackage.ASSIGNMENT_TYPE__F404068:
			case MspdiPackage.ASSIGNMENT_TYPE__F404069:
			case MspdiPackage.ASSIGNMENT_TYPE__F40406A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40406B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40406C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40406D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40406E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40406F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404070:
			case MspdiPackage.ASSIGNMENT_TYPE__F404071:
			case MspdiPackage.ASSIGNMENT_TYPE__F404072:
			case MspdiPackage.ASSIGNMENT_TYPE__F404073:
			case MspdiPackage.ASSIGNMENT_TYPE__F404074:
			case MspdiPackage.ASSIGNMENT_TYPE__F404075:
			case MspdiPackage.ASSIGNMENT_TYPE__F404076:
			case MspdiPackage.ASSIGNMENT_TYPE__F404077:
			case MspdiPackage.ASSIGNMENT_TYPE__F404078:
			case MspdiPackage.ASSIGNMENT_TYPE__F404079:
			case MspdiPackage.ASSIGNMENT_TYPE__F40407A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40407B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40407C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40407D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40407E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40407F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404080:
			case MspdiPackage.ASSIGNMENT_TYPE__F404081:
			case MspdiPackage.ASSIGNMENT_TYPE__F404082:
			case MspdiPackage.ASSIGNMENT_TYPE__F404083:
			case MspdiPackage.ASSIGNMENT_TYPE__F404084:
			case MspdiPackage.ASSIGNMENT_TYPE__F404085:
			case MspdiPackage.ASSIGNMENT_TYPE__F404086:
			case MspdiPackage.ASSIGNMENT_TYPE__F404087:
			case MspdiPackage.ASSIGNMENT_TYPE__F404088:
			case MspdiPackage.ASSIGNMENT_TYPE__F404089:
			case MspdiPackage.ASSIGNMENT_TYPE__F40408A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40408B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40408C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40408D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40408E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40408F:
			case MspdiPackage.ASSIGNMENT_TYPE__F404090:
			case MspdiPackage.ASSIGNMENT_TYPE__F404091:
			case MspdiPackage.ASSIGNMENT_TYPE__F404092:
			case MspdiPackage.ASSIGNMENT_TYPE__F404093:
			case MspdiPackage.ASSIGNMENT_TYPE__F404094:
			case MspdiPackage.ASSIGNMENT_TYPE__F404095:
			case MspdiPackage.ASSIGNMENT_TYPE__F404096:
			case MspdiPackage.ASSIGNMENT_TYPE__F404097:
			case MspdiPackage.ASSIGNMENT_TYPE__F404098:
			case MspdiPackage.ASSIGNMENT_TYPE__F404099:
			case MspdiPackage.ASSIGNMENT_TYPE__F40409A:
			case MspdiPackage.ASSIGNMENT_TYPE__F40409B:
			case MspdiPackage.ASSIGNMENT_TYPE__F40409C:
			case MspdiPackage.ASSIGNMENT_TYPE__F40409D:
			case MspdiPackage.ASSIGNMENT_TYPE__F40409E:
			case MspdiPackage.ASSIGNMENT_TYPE__F40409F:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A0:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A1:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A2:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A3:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A4:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A5:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A6:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A7:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A8:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040A9:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AA:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AB:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AC:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AD:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AE:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040AF:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B0:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B1:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B2:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B3:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B4:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B5:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B6:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B7:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B8:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040B9:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BA:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BB:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BC:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BD:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BE:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040BF:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C0:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C1:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C2:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C3:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C4:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C5:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C6:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C7:
			case MspdiPackage.ASSIGNMENT_TYPE__F4040C8:
			case MspdiPackage.ASSIGNMENT_TYPE__TIMEPHASED_DATA:
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
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__EXTENDED_ATTRIBUTE,
				 MspdiFactory.eINSTANCE.createExtendedAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__BASELINE,
				 MspdiFactory.eINSTANCE.createBaselineType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404000,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404000,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404001,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404001,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404002,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404002,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404003,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404003,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404004,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404004,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404005,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404005,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404006,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404006,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404007,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404007,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404008,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404008,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404009,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404009,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404010,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404010,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404011,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404011,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404012,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404012,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404013,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404013,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404014,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404014,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404015,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404015,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404016,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404016,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404017,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404017,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404018,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404018,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404019,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404019,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404020,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404020,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404021,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404021,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404022,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404022,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404023,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404023,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404024,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404024,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404025,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404025,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404026,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404026,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404027,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404027,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404028,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404028,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404029,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404029,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404030,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404030,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404031,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404031,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404032,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404032,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404033,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404033,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404034,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404034,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404035,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404035,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404036,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404036,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404037,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404037,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404038,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404038,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404039,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404039,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404040,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404040,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404041,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404041,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404042,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404042,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404043,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404043,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404044,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404044,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404045,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404045,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404046,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404046,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404047,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404047,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404048,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404048,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404049,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404049,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404050,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404050,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404051,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404051,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404052,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404052,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404053,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404053,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404054,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404054,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404055,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404055,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404056,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404056,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404057,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404057,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404058,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404058,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404059,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404059,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404060,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404060,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404061,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404061,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404062,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404062,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404063,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404063,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404064,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404064,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404065,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404065,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404066,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404066,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404067,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404067,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404068,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404068,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404069,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404069,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404070,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404070,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404071,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404071,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404072,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404072,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404073,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404073,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404074,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404074,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404075,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404075,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404076,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404076,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404077,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404077,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404078,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404078,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404079,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404079,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404080,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404080,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404081,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404081,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404082,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404082,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404083,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404083,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404084,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404084,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404085,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404085,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404086,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404086,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404087,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404087,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404088,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404088,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404089,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404089,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404090,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404090,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404091,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404091,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404092,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404092,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404093,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404093,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404094,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404094,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404095,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404095,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404096,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404096,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404097,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404097,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404098,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404098,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404099,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F404099,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409A,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409A,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409B,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409B,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409C,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409C,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409D,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409D,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409E,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409E,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409F,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409F,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A0,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A0,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A1,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A1,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A2,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A2,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A3,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A3,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A4,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A4,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A5,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A5,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A6,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A6,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A7,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A7,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A8,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A8,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A9,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A9,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AA,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AA,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AB,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AB,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AC,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AC,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AD,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AD,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AE,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AF,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AF,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B0,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B0,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B1,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B1,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B2,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B2,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B3,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B3,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B4,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B4,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B5,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B5,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B6,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B6,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B7,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B7,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B8,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B8,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B9,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B9,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BA,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BA,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BB,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BB,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BC,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BC,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BD,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BD,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BE,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BF,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BF,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C0,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C0,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C1,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C1,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C2,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C2,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C3,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C3,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C4,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C4,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C5,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C5,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C6,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C6,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C7,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C7,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C8,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C8,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.ASSIGNMENT_TYPE__TIMEPHASED_DATA,
				 MspdiFactory.eINSTANCE.createTimephasedDataType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404000 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404001 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404002 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404003 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404004 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404005 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404006 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404007 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404008 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404009 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40400F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404010 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404011 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404012 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404013 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404014 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404015 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404016 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404017 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404018 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404019 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40401F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404020 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404021 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404022 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404023 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404024 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404025 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404026 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404027 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404028 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404029 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40402F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404030 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404031 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404032 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404033 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404034 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404035 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404036 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404037 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404038 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404039 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40403F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404040 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404041 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404042 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404043 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404044 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404045 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404046 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404047 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404048 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404049 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40404F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404050 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404051 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404052 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404053 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404054 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404055 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404056 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404057 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404058 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404059 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40405F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404060 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404061 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404062 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404063 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404064 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404065 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404066 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404067 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404068 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404069 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40406F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404070 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404071 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404072 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404073 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404074 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404075 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404076 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404077 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404078 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404079 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40407F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404080 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404081 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404082 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404083 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404084 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404085 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404086 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404087 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404088 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404089 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40408F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404090 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404091 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404092 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404093 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404094 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404095 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404096 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404097 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404098 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F404099 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409A ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409B ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409C ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409D ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409E ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F40409F ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A0 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A1 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A2 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A3 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A4 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A5 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A6 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A7 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A8 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040A9 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AA ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AB ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AC ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AD ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AE ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040AF ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B0 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B1 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B2 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B3 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B4 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B5 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B6 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B7 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B8 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040B9 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BA ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BB ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BC ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BD ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BE ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040BF ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C0 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C1 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C2 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C3 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C4 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C5 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C6 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C7 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__F4040C8 ||
			childFeature == MspdiPackage.Literals.ASSIGNMENT_TYPE__TIMEPHASED_DATA;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
