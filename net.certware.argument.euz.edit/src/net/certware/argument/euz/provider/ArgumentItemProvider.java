/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.arm.provider.ClaimItemProvider;
import net.certware.argument.euz.Argument;
import net.certware.argument.euz.EuzFactory;
import net.certware.argument.euz.EuzPackage;
import net.certware.argument.euz.edit.provider.EuzEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.euz.Argument} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentItemProvider
	extends ClaimItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(EuzPackage.Literals.ARGUMENT__ARGUMENT_STRATEGIES);
			childrenFeatures.add(EuzPackage.Literals.ARGUMENT__ARGUMENT_ASSUMPTIONS);
			childrenFeatures.add(EuzPackage.Literals.ARGUMENT__ARGUMENT_CONTEXTS);
			childrenFeatures.add(EuzPackage.Literals.ARGUMENT__ARGUMENT_SOLUTIONS);
			childrenFeatures.add(EuzPackage.Literals.ARGUMENT__ARGUMENT_CRITERIA);
			childrenFeatures.add(EuzPackage.Literals.ARGUMENT__ARGUMENT_JUSTIFICATIONS);
			childrenFeatures.add(EuzPackage.Literals.ARGUMENT__SUB_ARGUMENTS);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This returns Argument.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Argument")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Argument)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_Argument_type") : //$NON-NLS-1$
			getString("_UI_Argument_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Argument.class)) {
			case EuzPackage.ARGUMENT__ARGUMENT_STRATEGIES:
			case EuzPackage.ARGUMENT__ARGUMENT_ASSUMPTIONS:
			case EuzPackage.ARGUMENT__ARGUMENT_CONTEXTS:
			case EuzPackage.ARGUMENT__ARGUMENT_SOLUTIONS:
			case EuzPackage.ARGUMENT__ARGUMENT_CRITERIA:
			case EuzPackage.ARGUMENT__ARGUMENT_JUSTIFICATIONS:
			case EuzPackage.ARGUMENT__SUB_ARGUMENTS:
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
				(EuzPackage.Literals.ARGUMENT__ARGUMENT_STRATEGIES,
				 EuzFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(EuzPackage.Literals.ARGUMENT__ARGUMENT_ASSUMPTIONS,
				 EuzFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(EuzPackage.Literals.ARGUMENT__ARGUMENT_CONTEXTS,
				 EuzFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(EuzPackage.Literals.ARGUMENT__ARGUMENT_SOLUTIONS,
				 EuzFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(EuzPackage.Literals.ARGUMENT__ARGUMENT_CRITERIA,
				 EuzFactory.eINSTANCE.createCriteria()));

		newChildDescriptors.add
			(createChildParameter
				(EuzPackage.Literals.ARGUMENT__ARGUMENT_JUSTIFICATIONS,
				 EuzFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(EuzPackage.Literals.ARGUMENT__SUB_ARGUMENTS,
				 EuzFactory.eINSTANCE.createArgument()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EuzEditPlugin.INSTANCE;
	}

}
