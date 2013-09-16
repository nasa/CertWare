/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.provider;


import java.util.Collection;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.Claim;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.sacm.SACM.Argumentation.Claim} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaimItemProvider
	extends AssertionItemProvider
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
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimItemProvider(AdapterFactory adapterFactory) {
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

			addAssumedPropertyDescriptor(object);
			addToBeSupportedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Assumed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Claim_assumed_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Claim_assumed_feature", "_UI_Claim_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ArgumentationPackage.Literals.CLAIM__ASSUMED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Be Supported feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToBeSupportedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Claim_toBeSupported_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Claim_toBeSupported_feature", "_UI_Claim_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ArgumentationPackage.Literals.CLAIM__TO_BE_SUPPORTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Claim.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Claim")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Claim)object).getId();
		String content = ((Claim)object).getContent();
		return label == null || label.length() == 0 ?
			getString("_UI_Claim_type") : //$NON-NLS-1$
			getString("_UI_Claim_type") + " " + label + ": " + content; //$NON-NLS-1$ //$NON-NLS-2$ // NLS 3 okay
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

		switch (notification.getFeatureID(Claim.class)) {
			case ArgumentationPackage.CLAIM__ASSUMED:
			case ArgumentationPackage.CLAIM__TO_BE_SUPPORTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
