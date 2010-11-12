/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.arm.provider.ClaimItemProvider;

import net.certware.argument.gsn.Goal;
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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.gsn.Goal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GoalItemProvider
	extends ClaimItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemColorProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Kestrel Technology LLC"; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalItemProvider(AdapterFactory adapterFactory) {
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

			addStrategyPropertyDescriptor(object);
			addAssumptionPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addSolutionPropertyDescriptor(object);
			addSubgoalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Goal_strategy_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_strategy_feature", "_UI_Goal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GsnPackage.Literals.GOAL__STRATEGY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assumption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Goal_assumption_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_assumption_feature", "_UI_Goal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GsnPackage.Literals.GOAL__ASSUMPTION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Goal_context_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_context_feature", "_UI_Goal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GsnPackage.Literals.GOAL__CONTEXT,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
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
				 getString("_UI_Goal_solution_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_solution_feature", "_UI_Goal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GsnPackage.Literals.GOAL__SOLUTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subgoal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubgoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Goal_subgoal_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Goal_subgoal_feature", "_UI_Goal_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GsnPackage.Literals.GOAL__SUBGOAL,
				 true,
				 false,
				 false,
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
			childrenFeatures.add(GsnPackage.Literals.GOAL__STRATEGY);
			childrenFeatures.add(GsnPackage.Literals.GOAL__ASSUMPTION);
			childrenFeatures.add(GsnPackage.Literals.GOAL__CONTEXT);
			childrenFeatures.add(GsnPackage.Literals.GOAL__SOLUTION);
			childrenFeatures.add(GsnPackage.Literals.GOAL__SUBGOAL);
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
	 * This returns Goal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Goal")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Goal)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_Goal_type") : //$NON-NLS-1$
			getString("_UI_Goal_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Goal.class)) {
			case GsnPackage.GOAL__STRATEGY:
			case GsnPackage.GOAL__ASSUMPTION:
			case GsnPackage.GOAL__CONTEXT:
			case GsnPackage.GOAL__SOLUTION:
			case GsnPackage.GOAL__SUBGOAL:
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
				(GsnPackage.Literals.GOAL__STRATEGY,
				 GsnFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.GOAL__ASSUMPTION,
				 GsnFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.GOAL__CONTEXT,
				 GsnFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.GOAL__SOLUTION,
				 GsnFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(GsnPackage.Literals.GOAL__SUBGOAL,
				 GsnFactory.eINSTANCE.createGoal()));
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
