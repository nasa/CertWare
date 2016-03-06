/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.evidence.evidence.provider;


import java.util.Collection;
import java.util.List;

import net.certware.evidence.evidence.EvidenceFactory;
import net.certware.evidence.evidence.EvidencePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.evidence.evidence.Package} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageItemProvider
	extends AdministrativeElementItemProvider
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
	public PackageItemProvider(AdapterFactory adapterFactory) {
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

			addConsistencyPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addCriteriaPropertyDescriptor(object);
			addCompletenessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Consistency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsistencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_consistency_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_consistency_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 EvidencePackage.Literals.PACKAGE__CONSISTENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Package_version_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_version_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 EvidencePackage.Literals.PACKAGE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Criteria feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriteriaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_criteria_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_criteria_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 EvidencePackage.Literals.PACKAGE__CRITERIA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completeness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletenessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Package_completeness_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Package_completeness_feature", "_UI_Package_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 EvidencePackage.Literals.PACKAGE__COMPLETENESS,
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
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__METHOD);
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__ORIGINATOR);
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__REQUEST);
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__OBJECTIVE);
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__ACTIVITY);
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__ITEM);
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__REQUIRES_PACKAGE);
			childrenFeatures.add(EvidencePackage.Literals.PACKAGE__EVALUATION);
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
	 * This returns Package.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Package")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((net.certware.evidence.evidence.Package)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Package_type") : //$NON-NLS-1$
			getString("_UI_Package_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(net.certware.evidence.evidence.Package.class)) {
			case EvidencePackage.PACKAGE__CONSISTENCY:
			case EvidencePackage.PACKAGE__VERSION:
			case EvidencePackage.PACKAGE__CRITERIA:
			case EvidencePackage.PACKAGE__COMPLETENESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EvidencePackage.PACKAGE__METHOD:
			case EvidencePackage.PACKAGE__ORIGINATOR:
			case EvidencePackage.PACKAGE__REQUEST:
			case EvidencePackage.PACKAGE__OBJECTIVE:
			case EvidencePackage.PACKAGE__ACTIVITY:
			case EvidencePackage.PACKAGE__ITEM:
			case EvidencePackage.PACKAGE__REQUIRES_PACKAGE:
			case EvidencePackage.PACKAGE__EVALUATION:
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
				(EvidencePackage.Literals.PACKAGE__METHOD,
				 EvidenceFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__METHOD,
				 EvidenceFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__METHOD,
				 EvidenceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ORIGINATOR,
				 EvidenceFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ORIGINATOR,
				 EvidenceFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__REQUEST,
				 EvidenceFactory.eINSTANCE.createEvidenceRequest()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__OBJECTIVE,
				 EvidenceFactory.eINSTANCE.createProjectObjective()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ACTIVITY,
				 EvidenceFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createExhibit()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createCompositeSubject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createUnknownSubject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createDomainClaim()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__ITEM,
				 EvidenceFactory.eINSTANCE.createEvidenceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__REQUIRES_PACKAGE,
				 EvidenceFactory.eINSTANCE.createRequiresPackage()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createIsA()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createIsCharacterizedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createIsScopedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createSupports()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createConflicts()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createRefutes()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createNegates()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createResolves()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createWeakens()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createAmplifies()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createChallenges()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createProvidesContext()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createMeansThat()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.PACKAGE__EVALUATION,
				 EvidenceFactory.eINSTANCE.createSupercedes()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EvidencePackage.Literals.PACKAGE__METHOD ||
			childFeature == EvidencePackage.Literals.PACKAGE__ITEM ||
			childFeature == EvidencePackage.Literals.PACKAGE__ORIGINATOR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
