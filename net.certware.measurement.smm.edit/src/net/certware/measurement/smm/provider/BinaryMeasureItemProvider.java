/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.smm.BinaryMeasure;
import net.certware.measurement.smm.SmmFactory;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.measurement.smm.BinaryMeasure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryMeasureItemProvider
	extends DimensionalMeasureItemProvider
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
	public BinaryMeasureItemProvider(AdapterFactory adapterFactory) {
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

			addFunctorPropertyDescriptor(object);
			addBaseMeasure1PropertyDescriptor(object);
			addBaseMeasure2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Functor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryMeasure_functor_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryMeasure_functor_feature", "_UI_BinaryMeasure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.BINARY_MEASURE__FUNCTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Measure1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseMeasure1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryMeasure_baseMeasure1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryMeasure_baseMeasure1_feature", "_UI_BinaryMeasure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Measure2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseMeasure2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryMeasure_baseMeasure2_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryMeasure_baseMeasure2_feature", "_UI_BinaryMeasure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
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
			childrenFeatures.add(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1);
			childrenFeatures.add(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2);
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
	 * This returns BinaryMeasure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryMeasure")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BinaryMeasure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryMeasure_type") : //$NON-NLS-1$
			getString("_UI_BinaryMeasure_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(BinaryMeasure.class)) {
			case SmmPackage.BINARY_MEASURE__FUNCTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE1:
			case SmmPackage.BINARY_MEASURE__BASE_MEASURE2:
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
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createBinaryMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createDirectMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createCollectiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createNamedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createRescaledMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1,
				 SmmFactory.eINSTANCE.createCounting()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createBinaryMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createDirectMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createCollectiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createNamedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createRescaledMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2,
				 SmmFactory.eINSTANCE.createCounting()));
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
			childFeature == SmmPackage.Literals.MEASURE__EQUIVALENT_FROM ||
			childFeature == SmmPackage.Literals.MEASURE__EQUIVALENT_TO ||
			childFeature == SmmPackage.Literals.MEASURE__REFINEMENT ||
			childFeature == SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE1 ||
			childFeature == SmmPackage.Literals.BINARY_MEASURE__BASE_MEASURE2 ||
			childFeature == SmmPackage.Literals.MEASURE__OUT_MEASURE ||
			childFeature == SmmPackage.Literals.MEASURE__IN_MEASURE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
