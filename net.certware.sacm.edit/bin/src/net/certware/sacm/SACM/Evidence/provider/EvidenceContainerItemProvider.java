/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.provider;


import java.util.Collection;
import java.util.List;

import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceFactory;
import net.certware.sacm.SACM.Evidence.EvidencePackage;

import net.certware.sacm.SACM.provider.ModelElementItemProvider;

import net.certware.sacm.provider.SACMEditPlugin;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.sacm.SACM.Evidence.EvidenceContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvidenceContainerItemProvider
	extends ModelElementItemProvider
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
	public EvidenceContainerItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addGidPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvidenceContainer_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EvidenceContainer_name_feature", "_UI_EvidenceContainer_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 EvidencePackage.Literals.EVIDENCE_CONTAINER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EvidenceContainer_gid_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EvidenceContainer_gid_feature", "_UI_EvidenceContainer_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 EvidencePackage.Literals.EVIDENCE_CONTAINER__GID,
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
				 getString("_UI_EvidenceContainer_version_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_EvidenceContainer_version_feature", "_UI_EvidenceContainer_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 EvidencePackage.Literals.EVIDENCE_CONTAINER__VERSION,
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
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION);
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM);
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY);
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT);
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
	 * This returns EvidenceContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EvidenceContainer")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EvidenceContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EvidenceContainer_type") : //$NON-NLS-1$
			getString("_UI_EvidenceContainer_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EvidenceContainer.class)) {
			case EvidencePackage.EVIDENCE_CONTAINER__NAME:
			case EvidencePackage.EVIDENCE_CONTAINER__GID:
			case EvidencePackage.EVIDENCE_CONTAINER__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EvidencePackage.EVIDENCE_CONTAINER__EVALUATION:
			case EvidencePackage.EVIDENCE_CONTAINER__ITEM:
			case EvidencePackage.EVIDENCE_CONTAINER__PROPERTY:
			case EvidencePackage.EVIDENCE_CONTAINER__ELEMENT:
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
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createIsA()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createIsCharacterizedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createIsScopedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createSupports()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createConflicts()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createRefutes()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createNegates()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createResolves()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createWeakens()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createAmplifies()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createChallenges()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createProvidesContext()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__EVALUATION,
				 EvidenceFactory.eINSTANCE.createMeansThat()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createExhibit()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createCompositeObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createUnknownObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createReferencedClaim()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createEvidenceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ITEM,
				 EvidenceFactory.eINSTANCE.createObjectifiedAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createHasRoleIn()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createDependsOn()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createSatisfies()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createRequiresContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createContainerConsistency()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createContainerCompleteness()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createCompliesTo()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__PROPERTY,
				 EvidenceFactory.eINSTANCE.createExtendedProjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createEvidenceRequest()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createProjectObjective()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_CONTAINER__ELEMENT,
				 EvidenceFactory.eINSTANCE.createService()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SACMEditPlugin.INSTANCE;
	}

}
