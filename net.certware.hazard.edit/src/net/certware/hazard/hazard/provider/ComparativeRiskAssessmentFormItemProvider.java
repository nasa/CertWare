/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.provider;


import java.util.Collection;
import java.util.List;

import net.certware.hazard.hazard.ComparativeRiskAssessmentForm;
import net.certware.hazard.hazard.HazardFactory;
import net.certware.hazard.hazard.HazardPackage;

import net.certware.hazard.provider.HazardEditPlugin;

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

/**
 * This is the item provider adapter for a {@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparativeRiskAssessmentFormItemProvider
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
	public ComparativeRiskAssessmentFormItemProvider(AdapterFactory adapterFactory) {
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

			addSecTrackingNumberPropertyDescriptor(object);
			addCraTitlePropertyDescriptor(object);
			addSystemPropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addBaselinePropertyDescriptor(object);
			addProposedChangePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addAssessmentSummaryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sec Tracking Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecTrackingNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_secTrackingNumber_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_secTrackingNumber_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cra Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCraTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_craTitle_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_craTitle_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_system_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_system_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_summary_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_summary_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Baseline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaselinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_baseline_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_baseline_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Proposed Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProposedChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_proposedChange_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_proposedChange_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_description_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_description_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assessment Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssessmentSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComparativeRiskAssessmentForm_assessmentSummary_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_ComparativeRiskAssessmentForm_assessmentSummary_feature", "_UI_ComparativeRiskAssessmentForm_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY,
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
			childrenFeatures.add(HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES);
			childrenFeatures.add(HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT);
			childrenFeatures.add(HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST);
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
	 * This returns ComparativeRiskAssessmentForm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComparativeRiskAssessmentForm")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComparativeRiskAssessmentForm)object).getSecTrackingNumber();
		return label == null || label.length() == 0 ?
			getString("_UI_ComparativeRiskAssessmentForm_type") : //$NON-NLS-1$
			getString("_UI_ComparativeRiskAssessmentForm_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(ComparativeRiskAssessmentForm.class)) {
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SEC_TRACKING_NUMBER:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__CRA_TITLE:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SYSTEM:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__SUMMARY:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__BASELINE:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__PROPOSED_CHANGE:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__DESCRIPTION:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__ASSESSMENT_SUMMARY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT:
			case HazardPackage.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST:
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
				(HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__REFERENCES,
				 HazardFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__RISK_ASSESSMENT,
				 HazardFactory.eINSTANCE.createRiskAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(HazardPackage.Literals.COMPARATIVE_RISK_ASSESSMENT_FORM__HAZARD_LIST,
				 HazardFactory.eINSTANCE.createHazardList()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HazardEditPlugin.INSTANCE;
	}

}
