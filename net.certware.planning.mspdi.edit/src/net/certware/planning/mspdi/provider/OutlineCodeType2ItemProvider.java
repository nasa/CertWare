/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.provider;


import java.util.Collection;
import java.util.List;

import net.certware.planning.mspdi.MspdiFactory;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.OutlineCodeType2;

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
 * This is the item provider adapter for a {@link net.certware.planning.mspdi.OutlineCodeType2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutlineCodeType2ItemProvider
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
	public OutlineCodeType2ItemProvider(AdapterFactory adapterFactory) {
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

			addGuidPropertyDescriptor(object);
			addFieldIDPropertyDescriptor(object);
			addFieldNamePropertyDescriptor(object);
			addAliasPropertyDescriptor(object);
			addPhoneticAliasPropertyDescriptor(object);
			addEnterprisePropertyDescriptor(object);
			addEnterpriseOutlineCodeAliasPropertyDescriptor(object);
			addResourceSubstitutionEnabledPropertyDescriptor(object);
			addLeafOnlyPropertyDescriptor(object);
			addAllLevelsRequiredPropertyDescriptor(object);
			addOnlyTableValuesAllowedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_OutlineCodeType2_guid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_guid_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__GUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_OutlineCodeType2_fieldID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_fieldID_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__FIELD_ID,
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
				 getString("_UI_OutlineCodeType2_fieldName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_fieldName_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__FIELD_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_OutlineCodeType2_alias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_alias_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__ALIAS,
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
				 getString("_UI_OutlineCodeType2_phoneticAlias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_phoneticAlias_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__PHONETIC_ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enterprise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnterprisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutlineCodeType2_enterprise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_enterprise_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__ENTERPRISE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enterprise Outline Code Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnterpriseOutlineCodeAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutlineCodeType2_enterpriseOutlineCodeAlias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_enterpriseOutlineCodeAlias_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Substitution Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceSubstitutionEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutlineCodeType2_resourceSubstitutionEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_resourceSubstitutionEnabled_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leaf Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeafOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutlineCodeType2_leafOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_leafOnly_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__LEAF_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Levels Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllLevelsRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutlineCodeType2_allLevelsRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_allLevelsRequired_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Only Table Values Allowed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnlyTableValuesAllowedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutlineCodeType2_onlyTableValuesAllowed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutlineCodeType2_onlyTableValuesAllowed_feature", "_UI_OutlineCodeType2_type"),
				 MspdiPackage.Literals.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED,
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
			childrenFeatures.add(MspdiPackage.Literals.OUTLINE_CODE_TYPE2__VALUES);
			childrenFeatures.add(MspdiPackage.Literals.OUTLINE_CODE_TYPE2__MASKS);
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
	 * This returns OutlineCodeType2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OutlineCodeType2"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OutlineCodeType2)object).getFieldName();
		return label == null || label.length() == 0 ?
			getString("_UI_OutlineCodeType2_type") :
			getString("_UI_OutlineCodeType2_type") + " " + label;
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

		switch (notification.getFeatureID(OutlineCodeType2.class)) {
			case MspdiPackage.OUTLINE_CODE_TYPE2__GUID:
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_ID:
			case MspdiPackage.OUTLINE_CODE_TYPE2__FIELD_NAME:
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALIAS:
			case MspdiPackage.OUTLINE_CODE_TYPE2__PHONETIC_ALIAS:
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE:
			case MspdiPackage.OUTLINE_CODE_TYPE2__ENTERPRISE_OUTLINE_CODE_ALIAS:
			case MspdiPackage.OUTLINE_CODE_TYPE2__RESOURCE_SUBSTITUTION_ENABLED:
			case MspdiPackage.OUTLINE_CODE_TYPE2__LEAF_ONLY:
			case MspdiPackage.OUTLINE_CODE_TYPE2__ALL_LEVELS_REQUIRED:
			case MspdiPackage.OUTLINE_CODE_TYPE2__ONLY_TABLE_VALUES_ALLOWED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MspdiPackage.OUTLINE_CODE_TYPE2__VALUES:
			case MspdiPackage.OUTLINE_CODE_TYPE2__MASKS:
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
				(MspdiPackage.Literals.OUTLINE_CODE_TYPE2__VALUES,
				 MspdiFactory.eINSTANCE.createValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(MspdiPackage.Literals.OUTLINE_CODE_TYPE2__MASKS,
				 MspdiFactory.eINSTANCE.createMasksType()));
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
