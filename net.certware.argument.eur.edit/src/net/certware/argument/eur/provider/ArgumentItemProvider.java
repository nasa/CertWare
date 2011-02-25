/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.arm.provider.ClaimItemProvider;

import net.certware.argument.eur.Argument;
import net.certware.argument.eur.EurFactory;
import net.certware.argument.eur.EurPackage;

import net.certware.argument.eur.edit.provider.EurEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.eur.Argument} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentItemProvider
	extends ClaimItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {
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
			childrenFeatures.add(EurPackage.Literals.ARGUMENT__STRATEGY);
			childrenFeatures.add(EurPackage.Literals.ARGUMENT__ASSUMPTION);
			childrenFeatures.add(EurPackage.Literals.ARGUMENT__CONTEXT);
			childrenFeatures.add(EurPackage.Literals.ARGUMENT__SOLUTION);
			childrenFeatures.add(EurPackage.Literals.ARGUMENT__ARGUMENT);
			childrenFeatures.add(EurPackage.Literals.ARGUMENT__CRITERIA);
			childrenFeatures.add(EurPackage.Literals.ARGUMENT__JUSTIFICATION);
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
	 * This returns Argument.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Argument"));
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
			getString("_UI_Argument_type") :
			getString("_UI_Argument_type") + " " + label;
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
			case EurPackage.ARGUMENT__STRATEGY:
			case EurPackage.ARGUMENT__ASSUMPTION:
			case EurPackage.ARGUMENT__CONTEXT:
			case EurPackage.ARGUMENT__SOLUTION:
			case EurPackage.ARGUMENT__ARGUMENT:
			case EurPackage.ARGUMENT__CRITERIA:
			case EurPackage.ARGUMENT__JUSTIFICATION:
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
				(EurPackage.Literals.ARGUMENT__STRATEGY,
				 EurFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.ARGUMENT__ASSUMPTION,
				 EurFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.ARGUMENT__CONTEXT,
				 EurFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.ARGUMENT__SOLUTION,
				 EurFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.ARGUMENT__ARGUMENT,
				 EurFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.ARGUMENT__CRITERIA,
				 EurFactory.eINSTANCE.createCriteria()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.ARGUMENT__JUSTIFICATION,
				 EurFactory.eINSTANCE.createJustification()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EurEditPlugin.INSTANCE;
	}

}
