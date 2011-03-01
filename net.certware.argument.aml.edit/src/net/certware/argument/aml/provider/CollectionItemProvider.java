/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.AmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link net.certware.argument.aml.Collection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionItemProvider
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
	public CollectionItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLabel1PropertyDescriptor(object);
			addObjectTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collection_label_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Collection_label_feature", "_UI_Collection_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.COLLECTION__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collection_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Collection_id_feature", "_UI_Collection_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.COLLECTION__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabel1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collection_label1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Collection_label1_feature", "_UI_Collection_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.COLLECTION__LABEL1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Object Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Collection_objectType_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Collection_objectType_feature", "_UI_Collection_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.COLLECTION__OBJECT_TYPE,
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
			childrenFeatures.add(AmlPackage.Literals.COLLECTION__META_DATA);
			childrenFeatures.add(AmlPackage.Literals.COLLECTION__CREATING_TOOL);
			childrenFeatures.add(AmlPackage.Literals.COLLECTION__ANNOTATION);
			childrenFeatures.add(AmlPackage.Literals.COLLECTION__QUESTION);
			childrenFeatures.add(AmlPackage.Literals.COLLECTION__ARGUMENT_TEMPLATE);
			childrenFeatures.add(AmlPackage.Literals.COLLECTION__GROUP);
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
	 * This returns Collection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Collection")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((net.certware.argument.aml.Collection)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Collection_type") : //$NON-NLS-1$
			getString("_UI_Collection_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(net.certware.argument.aml.Collection.class)) {
			case AmlPackage.COLLECTION__LABEL:
			case AmlPackage.COLLECTION__ID:
			case AmlPackage.COLLECTION__LABEL1:
			case AmlPackage.COLLECTION__OBJECT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmlPackage.COLLECTION__META_DATA:
			case AmlPackage.COLLECTION__CREATING_TOOL:
			case AmlPackage.COLLECTION__ANNOTATION:
			case AmlPackage.COLLECTION__QUESTION:
			case AmlPackage.COLLECTION__ARGUMENT_TEMPLATE:
			case AmlPackage.COLLECTION__GROUP:
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
				(AmlPackage.Literals.COLLECTION__META_DATA,
				 AmlFactory.eINSTANCE.createMetaData()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.COLLECTION__CREATING_TOOL,
				 AmlFactory.eINSTANCE.createCreatingTool()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.COLLECTION__ANNOTATION,
				 AmlFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.COLLECTION__QUESTION,
				 AmlFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.COLLECTION__ARGUMENT_TEMPLATE,
				 AmlFactory.eINSTANCE.createArgumentTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.COLLECTION__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.COLLECTION__LABEL,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.COLLECTION__GROUP,
				 FeatureMapUtil.createEntry
					(AmlPackage.Literals.COLLECTION__COLLECTION_ITEM,
					 AmlFactory.eINSTANCE.createCollectionItem())));
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
