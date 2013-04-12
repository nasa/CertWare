/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.provider;


import java.util.Collection;
import java.util.List;

import net.certware.planning.mspdi.ExtendedAttributeType3;
import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.MspdiPackage;

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
 * This is the item provider adapter for a {@link net.certware.planning.mspdi.ExtendedAttributeType3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedAttributeType3ItemProvider
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
	public ExtendedAttributeType3ItemProvider(AdapterFactory adapterFactory) {
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

			addFieldIDPropertyDescriptor(object);
			addFieldNamePropertyDescriptor(object);
			addCFTypePropertyDescriptor(object);
			addGuidPropertyDescriptor(object);
			addElemTypePropertyDescriptor(object);
			addMaxMultiValuesPropertyDescriptor(object);
			addUserDefPropertyDescriptor(object);
			addAliasPropertyDescriptor(object);
			addSecondaryPIDPropertyDescriptor(object);
			addAutoRollDownPropertyDescriptor(object);
			addDefaultGuidPropertyDescriptor(object);
			addLtuidPropertyDescriptor(object);
			addPhoneticAliasPropertyDescriptor(object);
			addRollupTypePropertyDescriptor(object);
			addCalculationTypePropertyDescriptor(object);
			addFormulaPropertyDescriptor(object);
			addRestrictValuesPropertyDescriptor(object);
			addValuelistSortOrderPropertyDescriptor(object);
			addAppendNewValuesPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Field ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_fieldID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_fieldID_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Field Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_fieldName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_fieldName_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CF Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCFTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_cFType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_cFType_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_guid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_guid_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__GUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elem Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElemTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_elemType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_elemType_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Multi Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMultiValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_maxMultiValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_maxMultiValues_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_userDef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_userDef_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_alias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_alias_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secondary PID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondaryPIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_secondaryPID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_secondaryPID_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Roll Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoRollDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_autoRollDown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_autoRollDown_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Guid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultGuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_defaultGuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_defaultGuid_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ltuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLtuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_ltuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_ltuid_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__LTUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phonetic Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhoneticAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_phoneticAlias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_phoneticAlias_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rollup Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRollupTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_rollupType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_rollupType_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Calculation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalculationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_calculationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_calculationType_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Formula feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormulaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_formula_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_formula_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__FORMULA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restrict Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestrictValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_restrictValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_restrictValues_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valuelist Sort Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuelistSortOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_valuelistSortOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_valuelistSortOrder_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Append New Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppendNewValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_appendNewValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_appendNewValues_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExtendedAttributeType3_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExtendedAttributeType3_default_feature", "_UI_ExtendedAttributeType3_type"),
				 MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT,
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
			childrenFeatures.add(MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST);
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
	 * This returns ExtendedAttributeType3.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExtendedAttributeType3"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExtendedAttributeType3)object).getFieldName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExtendedAttributeType3_type") :
			getString("_UI_ExtendedAttributeType3_type") + " " + label;
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

		switch (notification.getFeatureID(ExtendedAttributeType3.class)) {
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_ID:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FIELD_NAME:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CF_TYPE:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__GUID:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ELEM_TYPE:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__MAX_MULTI_VALUES:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__USER_DEF:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ALIAS:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__SECONDARY_PID:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__AUTO_ROLL_DOWN:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT_GUID:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__LTUID:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__PHONETIC_ALIAS:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__ROLLUP_TYPE:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__CALCULATION_TYPE:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__FORMULA:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__RESTRICT_VALUES:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUELIST_SORT_ORDER:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__APPEND_NEW_VALUES:
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__DEFAULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST:
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
				(MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE3__VALUE_LIST,
				 MspdiFactory.eINSTANCE.createValueListType()));
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
