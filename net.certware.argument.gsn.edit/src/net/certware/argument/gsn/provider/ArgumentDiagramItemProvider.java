/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.gsn.ArgumentDiagram;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.edit.provider.GsnEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.gsn.ArgumentDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentDiagramItemProvider
	extends ItemProviderAdapter
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
				 GsnPackage.Literals.ARGUMENT_DIAGRAM__VERSION,
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
			childrenFeatures.add(GsnPackage.Literals.ARGUMENT_DIAGRAM__GOALS);
			childrenFeatures.add(GsnPackage.Literals.ARGUMENT_DIAGRAM__STRATEGIES);
			childrenFeatures.add(GsnPackage.Literals.ARGUMENT_DIAGRAM__ASSUMPTIONS);
			childrenFeatures.add(GsnPackage.Literals.ARGUMENT_DIAGRAM__SOLUTIONS);
			childrenFeatures.add(GsnPackage.Literals.ARGUMENT_DIAGRAM__CONTEXTS);
			childrenFeatures.add(GsnPackage.Literals.ARGUMENT_DIAGRAM__JUSTIFICATIONS);
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
			case GsnPackage.ARGUMENT_DIAGRAM__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GsnPackage.ARGUMENT_DIAGRAM__GOALS:
			case GsnPackage.ARGUMENT_DIAGRAM__STRATEGIES:
			case GsnPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
			case GsnPackage.ARGUMENT_DIAGRAM__SOLUTIONS:
			case GsnPackage.ARGUMENT_DIAGRAM__CONTEXTS:
			case GsnPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
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
				(GsnPackage.Literals.ARGUMENT_DIAGRAM__GOALS,
				 GsnFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.ARGUMENT_DIAGRAM__STRATEGIES,
				 GsnFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.ARGUMENT_DIAGRAM__ASSUMPTIONS,
				 GsnFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.ARGUMENT_DIAGRAM__SOLUTIONS,
				 GsnFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.ARGUMENT_DIAGRAM__CONTEXTS,
				 GsnFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.ARGUMENT_DIAGRAM__JUSTIFICATIONS,
				 GsnFactory.eINSTANCE.createJustification()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GsnEditPlugin.INSTANCE;
	}

}
