/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.smm.SmmFactory;
import net.certware.measurement.smm.SmmModel;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.measurement.smm.SmmModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmModelItemProvider
	extends SmmElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmModelItemProvider(AdapterFactory adapterFactory) {
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

			addModelElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SmmModel_modelElement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_SmmModel_modelElement_feature", "_UI_SmmModel_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
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
			childrenFeatures.add(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT);
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
	 * This returns SmmModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SmmModel")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SmmModel_type"); //$NON-NLS-1$
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

		switch (notification.getFeatureID(SmmModel.class)) {
			case SmmPackage.SMM_MODEL__MODEL_ELEMENT:
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
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createSmmModel()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createCategoryRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createObservation()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createRanking()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createRankingInterval()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createCharacteristic()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createBinaryMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createDirectMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createCollectiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createNamedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createRescaledMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createCounting()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createGrade()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createDirectMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createCollectiveMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createAggregatedMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createNamedMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createReScaledMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT,
				 SmmFactory.eINSTANCE.createAnnotation()));
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
			childFeature == SmmPackage.Literals.SMM_ELEMENT__MODEL ||
			childFeature == SmmPackage.Literals.SMM_MODEL__MODEL_ELEMENT ||
			childFeature == SmmPackage.Literals.SMM_ELEMENT__ATTRIBUTE ||
			childFeature == SmmPackage.Literals.SMM_ELEMENT__ANNOTATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
