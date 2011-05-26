/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.CazFactory;
import net.certware.argument.caz.CazPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link net.certware.argument.caz.ArgumentDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentDiagramItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_version_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_version_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CazPackage.Literals.ARGUMENT_DIAGRAM__VERSION,
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
			childrenFeatures.add(CazPackage.Literals.ARGUMENT_DIAGRAM__CLAIMS);
			childrenFeatures.add(CazPackage.Literals.ARGUMENT_DIAGRAM__ARGUMENTS);
			childrenFeatures.add(CazPackage.Literals.ARGUMENT_DIAGRAM__ASSUMPTIONS);
			childrenFeatures.add(CazPackage.Literals.ARGUMENT_DIAGRAM__JUSTIFICATIONS);
			childrenFeatures.add(CazPackage.Literals.ARGUMENT_DIAGRAM__CONTEXTS);
			childrenFeatures.add(CazPackage.Literals.ARGUMENT_DIAGRAM__EVIDENCE);
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
	 * This returns ArgumentDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArgumentDiagram")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArgumentDiagram)object).getVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_ArgumentDiagram_type") : //$NON-NLS-1$
			getString("_UI_ArgumentDiagram_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ArgumentDiagram.class)) {
			case CazPackage.ARGUMENT_DIAGRAM__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CazPackage.ARGUMENT_DIAGRAM__CLAIMS:
			case CazPackage.ARGUMENT_DIAGRAM__ARGUMENTS:
			case CazPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
			case CazPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
			case CazPackage.ARGUMENT_DIAGRAM__CONTEXTS:
			case CazPackage.ARGUMENT_DIAGRAM__EVIDENCE:
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
				(CazPackage.Literals.ARGUMENT_DIAGRAM__CLAIMS,
				 CazFactory.eINSTANCE.createClaim()));

		newChildDescriptors.add
			(createChildParameter
				(CazPackage.Literals.ARGUMENT_DIAGRAM__ARGUMENTS,
				 CazFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(CazPackage.Literals.ARGUMENT_DIAGRAM__ASSUMPTIONS,
				 CazFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(CazPackage.Literals.ARGUMENT_DIAGRAM__JUSTIFICATIONS,
				 CazFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(CazPackage.Literals.ARGUMENT_DIAGRAM__CONTEXTS,
				 CazFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(CazPackage.Literals.ARGUMENT_DIAGRAM__EVIDENCE,
				 CazFactory.eINSTANCE.createEvidence()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CazEditPlugin.INSTANCE;
	}

}
