/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.provider;


import java.util.Collection;
import java.util.List;

import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationFactory;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link net.certware.sacm.SACM.Argumentation.Argumentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationItemProvider
	extends ArgumentationElementItemProvider
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
	public ArgumentationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENTATION);
			childrenFeatures.add(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT);
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
	 * This returns Argumentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Argumentation")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Argumentation)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Argumentation_type") : //$NON-NLS-1$
			getString("_UI_Argumentation_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Argumentation.class)) {
			case ArgumentationPackage.ARGUMENTATION__ARGUMENTATION:
			case ArgumentationPackage.ARGUMENTATION__ARGUMENT_ELEMENT:
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
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENTATION,
				 ArgumentationFactory.eINSTANCE.createArgumentation()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createCitationElement()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createInformationElement()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createArgumentReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createClaim()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createAssertedInference()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createAssertedEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createAssertedContext()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createAssertedChallenge()));

		newChildDescriptors.add
			(createChildParameter
				(ArgumentationPackage.Literals.ARGUMENTATION__ARGUMENT_ELEMENT,
				 ArgumentationFactory.eINSTANCE.createAssertedCounterEvidence()));
	}

}
