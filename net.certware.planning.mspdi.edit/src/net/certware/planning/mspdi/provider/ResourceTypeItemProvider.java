/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.provider;


import java.util.Collection;
import java.util.List;

import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.ResourceType;

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
 * This is the item provider adapter for a {@link net.certware.planning.mspdi.ResourceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceTypeItemProvider
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
	public ResourceTypeItemProvider(AdapterFactory adapterFactory) {
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
			addInitialsPropertyDescriptor(object);
			addPhoneticsPropertyDescriptor(object);
			addNTAccountPropertyDescriptor(object);
			addMaterialLabelPropertyDescriptor(object);
			addCodePropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addWorkGroupPropertyDescriptor(object);
			addEmailAddressPropertyDescriptor(object);
			addHyperlinkPropertyDescriptor(object);
			addHyperlinkAddressPropertyDescriptor(object);
			addHyperlinkSubAddressPropertyDescriptor(object);
			addMaxUnitsPropertyDescriptor(object);
			addPeakUnitsPropertyDescriptor(object);
			addOverAllocatedPropertyDescriptor(object);
			addAvailableFromPropertyDescriptor(object);
			addAvailableToPropertyDescriptor(object);
			addStartPropertyDescriptor(object);
			addFinishPropertyDescriptor(object);
			addCanLevelPropertyDescriptor(object);
			addAccrueAtPropertyDescriptor(object);
			addWorkPropertyDescriptor(object);
			addRegularWorkPropertyDescriptor(object);
			addOvertimeWorkPropertyDescriptor(object);
			addActualWorkPropertyDescriptor(object);
			addRemainingWorkPropertyDescriptor(object);
			addActualOvertimeWorkPropertyDescriptor(object);
			addRemainingOvertimeWorkPropertyDescriptor(object);
			addPercentWorkCompletePropertyDescriptor(object);
			addStandardRatePropertyDescriptor(object);
			addStandardRateFormatPropertyDescriptor(object);
			addCostPropertyDescriptor(object);
			addOvertimeRatePropertyDescriptor(object);
			addOvertimeRateFormatPropertyDescriptor(object);
			addOvertimeCostPropertyDescriptor(object);
			addCostPerUsePropertyDescriptor(object);
			addActualCostPropertyDescriptor(object);
			addActualOvertimeCostPropertyDescriptor(object);
			addRemainingCostPropertyDescriptor(object);
			addRemainingOvertimeCostPropertyDescriptor(object);
			addWorkVariancePropertyDescriptor(object);
			addCostVariancePropertyDescriptor(object);
			addSVPropertyDescriptor(object);
			addCVPropertyDescriptor(object);
			addACWPPropertyDescriptor(object);
			addCalendarUIDPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addBCWSPropertyDescriptor(object);
			addBCWPPropertyDescriptor(object);
			addIsGenericPropertyDescriptor(object);
			addIsInactivePropertyDescriptor(object);
			addIsEnterprisePropertyDescriptor(object);
			addBookingTypePropertyDescriptor(object);
			addActualWorkProtectedPropertyDescriptor(object);
			addActualOvertimeWorkProtectedPropertyDescriptor(object);
			addActiveDirectoryGUIDPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
			addIsCostResourcePropertyDescriptor(object);
			addAssnOwnerPropertyDescriptor(object);
			addAssnOwnerGuidPropertyDescriptor(object);
			addIsBudgetPropertyDescriptor(object);
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
				 getString("_UI_ResourceType_uID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_uID_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__UID,
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
				 getString("_UI_ResourceType_iD_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_iD_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ID,
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
				 getString("_UI_ResourceType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_name_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__NAME,
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
				 getString("_UI_ResourceType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_type_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__TYPE,
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
				 getString("_UI_ResourceType_isNull_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_isNull_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__IS_NULL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initials feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_initials_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_initials_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__INITIALS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phonetics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhoneticsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_phonetics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_phonetics_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__PHONETICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NT Account feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNTAccountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_nTAccount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_nTAccount_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__NT_ACCOUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Material Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaterialLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_materialLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_materialLabel_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__MATERIAL_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_code_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_code_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_group_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_workGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_workGroup_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__WORK_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_emailAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_emailAddress_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__EMAIL_ADDRESS,
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
				 getString("_UI_ResourceType_hyperlink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_hyperlink_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__HYPERLINK,
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
				 getString("_UI_ResourceType_hyperlinkAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_hyperlinkAddress_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__HYPERLINK_ADDRESS,
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
				 getString("_UI_ResourceType_hyperlinkSubAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_hyperlinkSubAddress_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_maxUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_maxUnits_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__MAX_UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_peakUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_peakUnits_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__PEAK_UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_overAllocated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_overAllocated_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__OVER_ALLOCATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Available From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_availableFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_availableFrom_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__AVAILABLE_FROM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Available To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_availableTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_availableTo_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__AVAILABLE_TO,
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
				 getString("_UI_ResourceType_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_start_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__START,
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
				 getString("_UI_ResourceType_finish_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_finish_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__FINISH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_canLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_canLevel_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__CAN_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accrue At feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccrueAtPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_accrueAt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_accrueAt_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACCRUE_AT,
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
				 getString("_UI_ResourceType_work_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_work_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__WORK,
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
				 getString("_UI_ResourceType_regularWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_regularWork_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__REGULAR_WORK,
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
				 getString("_UI_ResourceType_overtimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_overtimeWork_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__OVERTIME_WORK,
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
				 getString("_UI_ResourceType_actualWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_actualWork_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACTUAL_WORK,
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
				 getString("_UI_ResourceType_remainingWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_remainingWork_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__REMAINING_WORK,
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
				 getString("_UI_ResourceType_actualOvertimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_actualOvertimeWork_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK,
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
				 getString("_UI_ResourceType_remainingOvertimeWork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_remainingOvertimeWork_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__REMAINING_OVERTIME_WORK,
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
				 getString("_UI_ResourceType_percentWorkComplete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_percentWorkComplete_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__PERCENT_WORK_COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_standardRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_standardRate_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__STANDARD_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standard Rate Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandardRateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_standardRateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_standardRateFormat_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__STANDARD_RATE_FORMAT,
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
				 getString("_UI_ResourceType_cost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_cost_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overtime Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOvertimeRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_overtimeRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_overtimeRate_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__OVERTIME_RATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overtime Rate Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOvertimeRateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_overtimeRateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_overtimeRateFormat_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__OVERTIME_RATE_FORMAT,
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
				 getString("_UI_ResourceType_overtimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_overtimeCost_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__OVERTIME_COST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cost Per Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCostPerUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_costPerUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_costPerUse_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__COST_PER_USE,
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
				 getString("_UI_ResourceType_actualCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_actualCost_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACTUAL_COST,
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
				 getString("_UI_ResourceType_actualOvertimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_actualOvertimeCost_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACTUAL_OVERTIME_COST,
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
				 getString("_UI_ResourceType_remainingCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_remainingCost_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__REMAINING_COST,
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
				 getString("_UI_ResourceType_remainingOvertimeCost_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_remainingOvertimeCost_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__REMAINING_OVERTIME_COST,
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
				 getString("_UI_ResourceType_workVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_workVariance_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__WORK_VARIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_costVariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_costVariance_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__COST_VARIANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_sV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_sV_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__SV,
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
				 getString("_UI_ResourceType_cV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_cV_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__CV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_aCWP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_aCWP_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACWP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_calendarUID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_calendarUID_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__CALENDAR_UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_notes_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__NOTES,
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
				 getString("_UI_ResourceType_bCWS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_bCWS_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__BCWS,
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
				 getString("_UI_ResourceType_bCWP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_bCWP_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__BCWP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Generic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsGenericPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_isGeneric_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_isGeneric_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__IS_GENERIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Inactive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsInactivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_isInactive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_isInactive_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__IS_INACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Enterprise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEnterprisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_isEnterprise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_isEnterprise_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__IS_ENTERPRISE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_bookingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_bookingType_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__BOOKING_TYPE,
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
				 getString("_UI_ResourceType_actualWorkProtected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_actualWorkProtected_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACTUAL_WORK_PROTECTED,
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
				 getString("_UI_ResourceType_actualOvertimeWorkProtected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_actualOvertimeWorkProtected_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active Directory GUID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActiveDirectoryGUIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_activeDirectoryGUID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_activeDirectoryGUID_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID,
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
				 getString("_UI_ResourceType_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_creationDate_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__CREATION_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Cost Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCostResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_isCostResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_isCostResource_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__IS_COST_RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_ResourceType_assnOwner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_assnOwner_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ASSN_OWNER,
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
				 getString("_UI_ResourceType_assnOwnerGuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_assnOwnerGuid_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__ASSN_OWNER_GUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Budget feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBudgetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceType_isBudget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceType_isBudget_feature", "_UI_ResourceType_type"),
				 MspdiPackage.Literals.RESOURCE_TYPE__IS_BUDGET,
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
			childrenFeatures.add(MspdiPackage.Literals.RESOURCE_TYPE__EXTENDED_ATTRIBUTE);
			childrenFeatures.add(MspdiPackage.Literals.RESOURCE_TYPE__BASELINE);
			childrenFeatures.add(MspdiPackage.Literals.RESOURCE_TYPE__OUTLINE_CODE);
			childrenFeatures.add(MspdiPackage.Literals.RESOURCE_TYPE__AVAILABILITY_PERIODS);
			childrenFeatures.add(MspdiPackage.Literals.RESOURCE_TYPE__RATES);
			childrenFeatures.add(MspdiPackage.Literals.RESOURCE_TYPE__TIMEPHASED_DATA);
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
	 * This returns ResourceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceType_type") :
			getString("_UI_ResourceType_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceType.class)) {
			case MspdiPackage.RESOURCE_TYPE__UID:
			case MspdiPackage.RESOURCE_TYPE__ID:
			case MspdiPackage.RESOURCE_TYPE__NAME:
			case MspdiPackage.RESOURCE_TYPE__TYPE:
			case MspdiPackage.RESOURCE_TYPE__IS_NULL:
			case MspdiPackage.RESOURCE_TYPE__INITIALS:
			case MspdiPackage.RESOURCE_TYPE__PHONETICS:
			case MspdiPackage.RESOURCE_TYPE__NT_ACCOUNT:
			case MspdiPackage.RESOURCE_TYPE__MATERIAL_LABEL:
			case MspdiPackage.RESOURCE_TYPE__CODE:
			case MspdiPackage.RESOURCE_TYPE__GROUP:
			case MspdiPackage.RESOURCE_TYPE__WORK_GROUP:
			case MspdiPackage.RESOURCE_TYPE__EMAIL_ADDRESS:
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK:
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_ADDRESS:
			case MspdiPackage.RESOURCE_TYPE__HYPERLINK_SUB_ADDRESS:
			case MspdiPackage.RESOURCE_TYPE__MAX_UNITS:
			case MspdiPackage.RESOURCE_TYPE__PEAK_UNITS:
			case MspdiPackage.RESOURCE_TYPE__OVER_ALLOCATED:
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_FROM:
			case MspdiPackage.RESOURCE_TYPE__AVAILABLE_TO:
			case MspdiPackage.RESOURCE_TYPE__START:
			case MspdiPackage.RESOURCE_TYPE__FINISH:
			case MspdiPackage.RESOURCE_TYPE__CAN_LEVEL:
			case MspdiPackage.RESOURCE_TYPE__ACCRUE_AT:
			case MspdiPackage.RESOURCE_TYPE__WORK:
			case MspdiPackage.RESOURCE_TYPE__REGULAR_WORK:
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_WORK:
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK:
			case MspdiPackage.RESOURCE_TYPE__REMAINING_WORK:
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK:
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_WORK:
			case MspdiPackage.RESOURCE_TYPE__PERCENT_WORK_COMPLETE:
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE:
			case MspdiPackage.RESOURCE_TYPE__STANDARD_RATE_FORMAT:
			case MspdiPackage.RESOURCE_TYPE__COST:
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE:
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_RATE_FORMAT:
			case MspdiPackage.RESOURCE_TYPE__OVERTIME_COST:
			case MspdiPackage.RESOURCE_TYPE__COST_PER_USE:
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_COST:
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_COST:
			case MspdiPackage.RESOURCE_TYPE__REMAINING_COST:
			case MspdiPackage.RESOURCE_TYPE__REMAINING_OVERTIME_COST:
			case MspdiPackage.RESOURCE_TYPE__WORK_VARIANCE:
			case MspdiPackage.RESOURCE_TYPE__COST_VARIANCE:
			case MspdiPackage.RESOURCE_TYPE__SV:
			case MspdiPackage.RESOURCE_TYPE__CV:
			case MspdiPackage.RESOURCE_TYPE__ACWP:
			case MspdiPackage.RESOURCE_TYPE__CALENDAR_UID:
			case MspdiPackage.RESOURCE_TYPE__NOTES:
			case MspdiPackage.RESOURCE_TYPE__BCWS:
			case MspdiPackage.RESOURCE_TYPE__BCWP:
			case MspdiPackage.RESOURCE_TYPE__IS_GENERIC:
			case MspdiPackage.RESOURCE_TYPE__IS_INACTIVE:
			case MspdiPackage.RESOURCE_TYPE__IS_ENTERPRISE:
			case MspdiPackage.RESOURCE_TYPE__BOOKING_TYPE:
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_WORK_PROTECTED:
			case MspdiPackage.RESOURCE_TYPE__ACTUAL_OVERTIME_WORK_PROTECTED:
			case MspdiPackage.RESOURCE_TYPE__ACTIVE_DIRECTORY_GUID:
			case MspdiPackage.RESOURCE_TYPE__CREATION_DATE:
			case MspdiPackage.RESOURCE_TYPE__IS_COST_RESOURCE:
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER:
			case MspdiPackage.RESOURCE_TYPE__ASSN_OWNER_GUID:
			case MspdiPackage.RESOURCE_TYPE__IS_BUDGET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MspdiPackage.RESOURCE_TYPE__EXTENDED_ATTRIBUTE:
			case MspdiPackage.RESOURCE_TYPE__BASELINE:
			case MspdiPackage.RESOURCE_TYPE__OUTLINE_CODE:
			case MspdiPackage.RESOURCE_TYPE__AVAILABILITY_PERIODS:
			case MspdiPackage.RESOURCE_TYPE__RATES:
			case MspdiPackage.RESOURCE_TYPE__TIMEPHASED_DATA:
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
				(MspdiPackage.Literals.RESOURCE_TYPE__EXTENDED_ATTRIBUTE,
				 MspdiFactory.eINSTANCE.createExtendedAttributeType1()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.RESOURCE_TYPE__BASELINE,
				 MspdiFactory.eINSTANCE.createBaselineType1()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.RESOURCE_TYPE__OUTLINE_CODE,
				 MspdiFactory.eINSTANCE.createOutlineCodeType1()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.RESOURCE_TYPE__AVAILABILITY_PERIODS,
				 MspdiFactory.eINSTANCE.createAvailabilityPeriodsType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.RESOURCE_TYPE__RATES,
				 MspdiFactory.eINSTANCE.createRatesType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.RESOURCE_TYPE__TIMEPHASED_DATA,
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
