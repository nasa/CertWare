/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence.provider;


import java.util.Collection;
import java.util.List;

import net.certware.evidence.evidence.CompositeSubject;
import net.certware.evidence.evidence.EvidenceFactory;
import net.certware.evidence.evidence.EvidencePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.evidence.evidence.CompositeSubject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeSubjectItemProvider
	extends DomainObjectItemProvider
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
	public CompositeSubjectItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT);
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
	 * This returns CompositeSubject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeSubject")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompositeSubject)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeSubject_type") : //$NON-NLS-1$
			getString("_UI_CompositeSubject_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(CompositeSubject.class)) {
			case EvidencePackage.COMPOSITE_SUBJECT__ELEMENT:
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
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createCompositeSubject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createUnknownSubject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.COMPOSITE_SUBJECT__ELEMENT,
				 EvidenceFactory.eINSTANCE.createService()));
	}

}
