/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.arm.provider.ReasoningElementItemProvider;

import net.certware.argument.eur.EurFactory;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Strategy;

import net.certware.argument.eur.edit.provider.EurEditPlugin;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.eur.Strategy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategyItemProvider
	extends ReasoningElementItemProvider
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemColorProvider, IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyItemProvider(AdapterFactory adapterFactory) {
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

			addSolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Solution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Strategy_solution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Strategy_solution_feature", "_UI_Strategy_type"),
				 EurPackage.Literals.STRATEGY__SOLUTION,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(EurPackage.Literals.STRATEGY__ARGUMENT);
			childrenFeatures.add(EurPackage.Literals.STRATEGY__JUSTIFICATION);
			childrenFeatures.add(EurPackage.Literals.STRATEGY__CRITERIA);
			childrenFeatures.add(EurPackage.Literals.STRATEGY__ASSUMPTION);
			childrenFeatures.add(EurPackage.Literals.STRATEGY__CONTEXTS);
			childrenFeatures.add(EurPackage.Literals.STRATEGY__STRATEGIES);
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
	 * This returns Strategy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Strategy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Strategy)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_Strategy_type") :
			getString("_UI_Strategy_type") + " " + label;
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

		switch (notification.getFeatureID(Strategy.class)) {
			case EurPackage.STRATEGY__ARGUMENT:
			case EurPackage.STRATEGY__JUSTIFICATION:
			case EurPackage.STRATEGY__CRITERIA:
			case EurPackage.STRATEGY__ASSUMPTION:
			case EurPackage.STRATEGY__CONTEXTS:
			case EurPackage.STRATEGY__STRATEGIES:
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
				(EurPackage.Literals.STRATEGY__ARGUMENT,
				 EurFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.STRATEGY__JUSTIFICATION,
				 EurFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.STRATEGY__CRITERIA,
				 EurFactory.eINSTANCE.createCriteria()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.STRATEGY__ASSUMPTION,
				 EurFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.STRATEGY__CONTEXTS,
				 EurFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(EurPackage.Literals.STRATEGY__STRATEGIES,
				 EurFactory.eINSTANCE.createStrategy()));
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
