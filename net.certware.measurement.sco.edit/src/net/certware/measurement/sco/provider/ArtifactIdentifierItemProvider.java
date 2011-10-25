/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ScoFactory;
import net.certware.measurement.sco.ScoPackage;

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
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.PlatformUI;

/**
 * This is the item provider adapter for a {@link net.certware.measurement.sco.ArtifactIdentifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactIdentifierItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider,
		ITableItemColorProvider,
		IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactIdentifierItemProvider(AdapterFactory adapterFactory) {
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

			addResourceNamePropertyDescriptor(object);
			addBaselinedLineCountPropertyDescriptor(object);
			addCurrentLineCountPropertyDescriptor(object);
			addCriticalDefectChangeOrdersPropertyDescriptor(object);
			addNormalDefectChangeOrdersPropertyDescriptor(object);
			addImprovementChangeOrdersPropertyDescriptor(object);
			addNewFeatureChangeOrdersPropertyDescriptor(object);
			addTotalChangeOrdersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_resourceName_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_resourceName_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__RESOURCE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_BasicPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Baselined Line Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaselinedLineCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_baselinedLineCount_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_baselinedLineCount_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_LinesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Line Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentLineCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_currentLineCount_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_currentLineCount_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_LinesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Critical Defect Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriticalDefectChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_criticalDefectChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_criticalDefectChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Normal Defect Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNormalDefectChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_normalDefectChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_normalDefectChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Improvement Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImprovementChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_improvementChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_improvementChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the New Feature Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewFeatureChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_newFeatureChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_newFeatureChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Change Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalChangeOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArtifactIdentifier_totalChangeOrders_feature"), //$NON-NLS-1$
				 getString("_UI_ArtifactIdentifier_totalChangeOrders_description"), //$NON-NLS-1$
				 ScoPackage.Literals.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ChangesPropertyCategory"), //$NON-NLS-1$
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
			childrenFeatures.add(ScoPackage.Literals.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS);
			childrenFeatures.add(ScoPackage.Literals.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS);
			childrenFeatures.add(ScoPackage.Literals.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS);
			childrenFeatures.add(ScoPackage.Literals.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS);
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
	 * This returns ArtifactIdentifier.gif.
	 * <!-- begin-user-doc -->
	 * Tries to use the platform image from the editor registry.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		String name = ((ArtifactIdentifier)object).getResourceName();
		if ( name != null && PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getEditorRegistry() != null ) {
			ImageDescriptor id = PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(name);
			if ( id != null ) {
				return overlayImage(object, id.createImage());
			}
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/artifacts")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * Returns only the resource name if available.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((ArtifactIdentifier)object).getResourceName();
		return label == null || label.length() == 0 ?
			getString("_UI_ArtifactIdentifier_type") : //$NON-NLS-1$
			// gettString("_UI_ArtifactIdentifier_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
				label; 
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

		switch (notification.getFeatureID(ArtifactIdentifier.class)) {
			case ScoPackage.ARTIFACT_IDENTIFIER__RESOURCE_NAME:
			case ScoPackage.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT:
			case ScoPackage.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT:
			case ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS:
			case ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS:
			case ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS:
			case ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS:
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
				(ScoPackage.Literals.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS,
				 ScoFactory.eINSTANCE.createCriticalDefectChangeOrders()));

		newChildDescriptors.add
			(createChildParameter
				(ScoPackage.Literals.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS,
				 ScoFactory.eINSTANCE.createNormalDefectChangeOrders()));

		newChildDescriptors.add
			(createChildParameter
				(ScoPackage.Literals.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS,
				 ScoFactory.eINSTANCE.createImprovementChangeOrders()));

		newChildDescriptors.add
			(createChildParameter
				(ScoPackage.Literals.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS,
				 ScoFactory.eINSTANCE.createNewFeatureChangeOrders()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScoEditPlugin.INSTANCE;
	}

}
