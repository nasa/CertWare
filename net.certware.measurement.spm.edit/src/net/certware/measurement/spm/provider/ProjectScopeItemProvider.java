/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.provider;


import java.util.Collection;
import java.util.List;

import net.certware.measurement.smm.SmmPackage;
import net.certware.measurement.smm.provider.ScopeItemProvider;
import net.certware.measurement.spm.ProjectScope;
import net.certware.measurement.spm.SpmFactory;

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
 * This is the item provider adapter for a {@link net.certware.measurement.spm.ProjectScope} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectScopeItemProvider
	extends ScopeItemProvider
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
	public ProjectScopeItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ProjectScope.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProjectScope")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProjectScope)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProjectScope_type") : //$NON-NLS-1$
			getString("_UI_ProjectScope_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createCaseDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createChangeOrderDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createTimeDimensionalMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createAdditiveMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createCriticalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createNormalDefectChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createImprovementChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createNewFeatureChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createTrendMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createScrapRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createModularityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createReworkRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createAdaptabilityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createMaturityRatioMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createMaintainabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createBrokenCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createFixedCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createTotalCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createBaselineCaseSizeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createUsageTimeMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createRepairEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createDevelopmentEffortMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createTotalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createCriticalAndNormalChangeOrderCount()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createReworkStabilityMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createReworkBacklogMeasure()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createModularityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createAdaptabilityTrend()));

		newChildDescriptors.add
			(createChildParameter
				(SmmPackage.Literals.SCOPE__MEASURES,
				 SpmFactory.eINSTANCE.createMaturityTrend()));
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
