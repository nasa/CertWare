/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.provider;


import java.util.Collection;
import java.util.List;

import net.certware.sacm.SACM.Evidence.EvidenceElement;
import net.certware.sacm.SACM.Evidence.EvidenceFactory;
import net.certware.sacm.SACM.Evidence.EvidencePackage;

import net.certware.sacm.SACM.provider.ModelElementItemProvider;

import net.certware.sacm.provider.SACMEditPlugin;

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
 * This is the item provider adapter for a {@link net.certware.sacm.SACM.Evidence.EvidenceElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvidenceElementItemProvider
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
	public EvidenceElementItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_ELEMENT__TIMING);
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_ELEMENT__CUSTODY);
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_ELEMENT__PROVENANCE);
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EvidenceElement)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_EvidenceElement_type") : //$NON-NLS-1$
			getString("_UI_EvidenceElement_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EvidenceElement.class)) {
			case EvidencePackage.EVIDENCE_ELEMENT__TIMING:
			case EvidencePackage.EVIDENCE_ELEMENT__CUSTODY:
			case EvidencePackage.EVIDENCE_ELEMENT__PROVENANCE:
			case EvidencePackage.EVIDENCE_ELEMENT__EVENT:
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
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__TIMING,
				 EvidenceFactory.eINSTANCE.createEndTime()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__TIMING,
				 EvidenceFactory.eINSTANCE.createStartTime()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__TIMING,
				 EvidenceFactory.eINSTANCE.createAtTime()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__CUSTODY,
				 EvidenceFactory.eINSTANCE.createCareOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__CUSTODY,
				 EvidenceFactory.eINSTANCE.createAtLocation()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__CUSTODY,
				 EvidenceFactory.eINSTANCE.createUsingProcess()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__PROVENANCE,
				 EvidenceFactory.eINSTANCE.createApprovedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__PROVENANCE,
				 EvidenceFactory.eINSTANCE.createCreatedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__PROVENANCE,
				 EvidenceFactory.eINSTANCE.createOwnedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__PROVENANCE,
				 EvidenceFactory.eINSTANCE.createPerformedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT,
				 EvidenceFactory.eINSTANCE.createIsGeneratedAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT,
				 EvidenceFactory.eINSTANCE.createIsAcquiredAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT,
				 EvidenceFactory.eINSTANCE.createIsTransferredTo()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT,
				 EvidenceFactory.eINSTANCE.createIsRevokedAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT,
				 EvidenceFactory.eINSTANCE.createIsCreatedAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT,
				 EvidenceFactory.eINSTANCE.createIsModifiedBy()));
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
