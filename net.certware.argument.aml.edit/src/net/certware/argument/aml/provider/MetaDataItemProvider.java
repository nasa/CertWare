/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.MetaData;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.aml.MetaData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaDataItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemColorProvider,
		IItemFontProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaDataItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addSecurityMarkingPropertyDescriptor(object);
			addSubjectPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MetaData_title_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MetaData_title_feature", "_UI_MetaData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.META_DATA__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Marking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityMarkingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetaData_securityMarking_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MetaData_securityMarking_feature", "_UI_MetaData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.META_DATA__SECURITY_MARKING,
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
				 getString("_UI_MetaData_subject_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MetaData_subject_feature", "_UI_MetaData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.META_DATA__SUBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetaData_description_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MetaData_description_feature", "_UI_MetaData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.META_DATA__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetaData_date_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_MetaData_date_feature", "_UI_MetaData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.META_DATA__DATE,
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
			childrenFeatures.add(AmlPackage.Literals.META_DATA__GROUP);
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
	 * This returns MetaData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MetaData")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MetaData_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(MetaData.class)) {
			case AmlPackage.META_DATA__TITLE:
			case AmlPackage.META_DATA__SECURITY_MARKING:
			case AmlPackage.META_DATA__SUBJECT:
			case AmlPackage.META_DATA__DESCRIPTION:
			case AmlPackage.META_DATA__DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmlPackage.META_DATA__GROUP:
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
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__TITLE,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__SECURITY_MARKING,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__CREATOR,
					 AmlFactory.eINSTANCE.createCreator())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__READER,
					 AmlFactory.eINSTANCE.createReader())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__SUBJECT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__DESCRIPTION,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__PUBLISHER,
					 AmlFactory.eINSTANCE.createPublisher())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__CONTRIBUTOR,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__DATE,
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__TYPE,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__FORMAT,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__IDENTIFIER,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__SOURCE,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__LANGUAGE,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__RELATION,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__COVERAGE,
					 AmlFactory.eINSTANCE.createCoverage())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__RIGHTS,
					 XMLTypeFactory.eINSTANCE.createAnyType())));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.META_DATA__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.META_DATA__IMAGE,
					 XMLTypeFactory.eINSTANCE.createAnyType())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == AmlPackage.Literals.META_DATA__CONTRIBUTOR ||
			childFeature == AmlPackage.Literals.META_DATA__TYPE ||
			childFeature == AmlPackage.Literals.META_DATA__FORMAT ||
			childFeature == AmlPackage.Literals.META_DATA__IDENTIFIER ||
			childFeature == AmlPackage.Literals.META_DATA__SOURCE ||
			childFeature == AmlPackage.Literals.META_DATA__LANGUAGE ||
			childFeature == AmlPackage.Literals.META_DATA__RELATION ||
			childFeature == AmlPackage.Literals.META_DATA__RIGHTS ||
			childFeature == AmlPackage.Literals.META_DATA__IMAGE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
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
		return AmlEditPlugin.INSTANCE;
	}

}
