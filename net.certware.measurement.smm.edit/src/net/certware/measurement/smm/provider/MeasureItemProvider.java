/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.smm.Measure;
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
 * This is the item provider adapter for a {@link net.certware.measurement.smm.Measure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureItemProvider
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
	public MeasureItemProvider(AdapterFactory adapterFactory) {
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

			addCategoryPropertyDescriptor(object);
			addLibraryPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addEquivalentFromPropertyDescriptor(object);
			addEquivalentToPropertyDescriptor(object);
			addRefinementPropertyDescriptor(object);
			addMeasurementPropertyDescriptor(object);
			addOutMeasurePropertyDescriptor(object);
			addInMeasurePropertyDescriptor(object);
			addTraitPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_category_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_category_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Library feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLibraryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_library_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_library_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__LIBRARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Measure_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_name_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Equivalent From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquivalentFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_equivalentFrom_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_equivalentFrom_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Equivalent To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquivalentToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_equivalentTo_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_equivalentTo_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refinement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_refinement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_refinement_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__REFINEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measurement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasurementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_measurement_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_measurement_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__MEASUREMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Out Measure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutMeasurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_outMeasure_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_outMeasure_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__OUT_MEASURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Measure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInMeasurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_inMeasure_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_inMeasure_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__IN_MEASURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trait feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_trait_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_trait_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__TRAIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Measure_scope_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Measure_scope_feature", "_UI_Measure_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 SmmPackage.Literals.MEASURE__SCOPE,
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
			childrenFeatures.add(SmmPackage.Literals.MEASURE__CATEGORY);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__EQUIVALENT_TO);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__REFINEMENT);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__MEASUREMENT);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__OUT_MEASURE);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__IN_MEASURE);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__TRAIT);
			childrenFeatures.add(SmmPackage.Literals.MEASURE__SCOPE);
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
		String label = ((Measure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Measure_type") : //$NON-NLS-1$
			getString("_UI_Measure_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(Measure.class)) {
			case SmmPackage.MEASURE__LIBRARY:
			case SmmPackage.MEASURE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SmmPackage.MEASURE__CATEGORY:
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
			case SmmPackage.MEASURE__EQUIVALENT_TO:
			case SmmPackage.MEASURE__REFINEMENT:
			case SmmPackage.MEASURE__MEASUREMENT:
			case SmmPackage.MEASURE__OUT_MEASURE:
			case SmmPackage.MEASURE__IN_MEASURE:
			case SmmPackage.MEASURE__TRAIT:
			case SmmPackage.MEASURE__SCOPE:
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
				(SmmPackage.Literals.MEASURE__CATEGORY,
				 SmmFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createRanking()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createBinaryMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createDirectMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createCollectiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createNamedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createRescaledMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SmmFactory.eINSTANCE.createCounting()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createRanking()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createBinaryMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createDirectMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createCollectiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createNamedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createRescaledMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SmmFactory.eINSTANCE.createCounting()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createRanking()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createBinaryMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createDirectMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createCollectiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createNamedMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createRescaledMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SmmFactory.eINSTANCE.createCounting()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASUREMENT,
				 SmmFactory.eINSTANCE.createGrade()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASUREMENT,
				 SmmFactory.eINSTANCE.createDirectMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASUREMENT,
				 SmmFactory.eINSTANCE.createCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASUREMENT,
				 SmmFactory.eINSTANCE.createCollectiveMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASUREMENT,
				 SmmFactory.eINSTANCE.createAggregatedMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASUREMENT,
				 SmmFactory.eINSTANCE.createNamedMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__MEASUREMENT,
				 SmmFactory.eINSTANCE.createReScaledMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__OUT_MEASURE,
				 SmmFactory.eINSTANCE.createMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__IN_MEASURE,
				 SmmFactory.eINSTANCE.createMeasureRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__TRAIT,
				 SmmFactory.eINSTANCE.createCharacteristic()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__SCOPE,
				 SmmFactory.eINSTANCE.createScope()));
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
