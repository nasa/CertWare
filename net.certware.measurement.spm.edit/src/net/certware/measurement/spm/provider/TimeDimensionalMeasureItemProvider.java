/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.smm.SmmPackage;
import net.certware.measurement.smm.provider.DimensionalMeasureItemProvider;
import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.TimeDimensionalMeasure;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link net.certware.measurement.spm.TimeDimensionalMeasure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeDimensionalMeasureItemProvider
	extends DimensionalMeasureItemProvider
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
	public TimeDimensionalMeasureItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns TimeDimensionalMeasure.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimeDimensionalMeasure")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimeDimensionalMeasure)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TimeDimensionalMeasure_type") : //$NON-NLS-1$
			getString("_UI_TimeDimensionalMeasure_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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
				(SmmPackage.Literals.SMM_ELEMENT__MODEL,
				 SpmFactory.eINSTANCE.createProjectModel()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SMM_ELEMENT__MODEL,
				 SpmFactory.eINSTANCE.createProjectCommit()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__CATEGORY,
				 SpmFactory.eINSTANCE.createEndProductQualityCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__CATEGORY,
				 SpmFactory.eINSTANCE.createInProgressQualityCategory()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createCaseDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createChangeOrderDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createTimeDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createAdditiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createCriticalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createNormalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createImprovementChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createNewFeatureChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createTrendMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createScrapRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createModularityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createReworkRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createAdaptabilityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createMaturityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createMaintainabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createBrokenCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createFixedCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createTotalCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createBaselineCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createUsageTimeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createRepairEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createDevelopmentEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createTotalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createCriticalAndNormalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createReworkStabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createReworkBacklogMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createModularityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createAdaptabilityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_FROM,
				 SpmFactory.eINSTANCE.createMaturityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createCaseDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createChangeOrderDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createTimeDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createAdditiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createCriticalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createNormalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createImprovementChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createNewFeatureChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createTrendMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createScrapRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createModularityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createReworkRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createAdaptabilityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createMaturityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createMaintainabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createBrokenCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createFixedCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createTotalCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createBaselineCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createUsageTimeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createRepairEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createDevelopmentEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createTotalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createCriticalAndNormalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createReworkStabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createReworkBacklogMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createModularityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createAdaptabilityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__EQUIVALENT_TO,
				 SpmFactory.eINSTANCE.createMaturityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createCaseDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createChangeOrderDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createTimeDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createAdditiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createCriticalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createNormalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createImprovementChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createNewFeatureChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createTrendMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createScrapRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createModularityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createReworkRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createAdaptabilityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createMaturityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createMaintainabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createBrokenCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createFixedCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createTotalCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createBaselineCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createUsageTimeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createRepairEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createDevelopmentEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createTotalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createCriticalAndNormalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createReworkStabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createReworkBacklogMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createModularityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createAdaptabilityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__REFINEMENT,
				 SpmFactory.eINSTANCE.createMaturityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__TRAIT,
				 SpmFactory.eINSTANCE.createEndProductQuality()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__TRAIT,
				 SpmFactory.eINSTANCE.createMaintainability()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__TRAIT,
				 SpmFactory.eINSTANCE.createInProgressIndicator()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__TRAIT,
				 SpmFactory.eINSTANCE.createProjectSize()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__SCOPE,
				 SpmFactory.eINSTANCE.createCaseScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__SCOPE,
				 SpmFactory.eINSTANCE.createProjectScope()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.MEASURE__SCOPE,
				 SpmFactory.eINSTANCE.createChangeScope()));
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpmEditPlugin.INSTANCE;
	}

}
