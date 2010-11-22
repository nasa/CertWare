/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsz.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.gsz.ArgumentDiagram;
import net.certware.argument.gsz.GszFactory;
import net.certware.argument.gsz.GszPackage;

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
 * This is the item provider adapter for a {@link net.certware.argument.gsz.ArgumentDiagram} object.
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

			addGoalsPropertyDescriptor(object);
			addStrategiesPropertyDescriptor(object);
			addJustificationsPropertyDescriptor(object);
			addContextsPropertyDescriptor(object);
			addAssumptionsPropertyDescriptor(object);
			addSolutionsPropertyDescriptor(object);
			addEvidencePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Goals feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_goals_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_goals_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GszPackage.Literals.ARGUMENT_DIAGRAM__GOALS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_strategies_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_strategies_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GszPackage.Literals.ARGUMENT_DIAGRAM__STRATEGIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Justifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJustificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_justifications_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_justifications_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GszPackage.Literals.ARGUMENT_DIAGRAM__JUSTIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contexts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_contexts_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_contexts_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GszPackage.Literals.ARGUMENT_DIAGRAM__CONTEXTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assumptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssumptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_assumptions_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_assumptions_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GszPackage.Literals.ARGUMENT_DIAGRAM__ASSUMPTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solutions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolutionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_solutions_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_solutions_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GszPackage.Literals.ARGUMENT_DIAGRAM__SOLUTIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evidence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvidencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArgumentDiagram_evidence_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ArgumentDiagram_evidence_feature", "_UI_ArgumentDiagram_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 GszPackage.Literals.ARGUMENT_DIAGRAM__EVIDENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 GszPackage.Literals.ARGUMENT_DIAGRAM__VERSION,
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
			childrenFeatures.add(GszPackage.Literals.ARGUMENT_DIAGRAM__GOALS);
			childrenFeatures.add(GszPackage.Literals.ARGUMENT_DIAGRAM__STRATEGIES);
			childrenFeatures.add(GszPackage.Literals.ARGUMENT_DIAGRAM__JUSTIFICATIONS);
			childrenFeatures.add(GszPackage.Literals.ARGUMENT_DIAGRAM__CONTEXTS);
			childrenFeatures.add(GszPackage.Literals.ARGUMENT_DIAGRAM__ASSUMPTIONS);
			childrenFeatures.add(GszPackage.Literals.ARGUMENT_DIAGRAM__SOLUTIONS);
			childrenFeatures.add(GszPackage.Literals.ARGUMENT_DIAGRAM__EVIDENCE);
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
			case GszPackage.ARGUMENT_DIAGRAM__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GszPackage.ARGUMENT_DIAGRAM__GOALS:
			case GszPackage.ARGUMENT_DIAGRAM__STRATEGIES:
			case GszPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
			case GszPackage.ARGUMENT_DIAGRAM__CONTEXTS:
			case GszPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
			case GszPackage.ARGUMENT_DIAGRAM__SOLUTIONS:
			case GszPackage.ARGUMENT_DIAGRAM__EVIDENCE:
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
				(GszPackage.Literals.ARGUMENT_DIAGRAM__GOALS,
				 GszFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(GszPackage.Literals.ARGUMENT_DIAGRAM__STRATEGIES,
				 GszFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(GszPackage.Literals.ARGUMENT_DIAGRAM__JUSTIFICATIONS,
				 GszFactory.eINSTANCE.createJustification()));

		newChildDescriptors.add
			(createChildParameter
				(GszPackage.Literals.ARGUMENT_DIAGRAM__CONTEXTS,
				 GszFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(GszPackage.Literals.ARGUMENT_DIAGRAM__ASSUMPTIONS,
				 GszFactory.eINSTANCE.createAssumption()));

		newChildDescriptors.add
			(createChildParameter
				(GszPackage.Literals.ARGUMENT_DIAGRAM__SOLUTIONS,
				 GszFactory.eINSTANCE.createSolution()));

		newChildDescriptors.add
			(createChildParameter
				(GszPackage.Literals.ARGUMENT_DIAGRAM__EVIDENCE,
				 GszFactory.eINSTANCE.createEvidence()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GszEditPlugin.INSTANCE;
	}

}
