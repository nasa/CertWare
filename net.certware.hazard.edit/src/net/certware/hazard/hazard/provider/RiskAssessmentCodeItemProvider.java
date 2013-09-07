/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.provider;


import java.util.Collection;
import java.util.List;

import net.certware.hazard.hazard.HazardPackage;
import net.certware.hazard.hazard.RiskAssessmentCode;

import net.certware.hazard.provider.HazardEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link net.certware.hazard.hazard.RiskAssessmentCode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RiskAssessmentCodeItemProvider
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
	public RiskAssessmentCodeItemProvider(AdapterFactory adapterFactory) {
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

			addBaselinePropertyDescriptor(object);
			addOptionBPropertyDescriptor(object);
			addOptionCPropertyDescriptor(object);
			addOptionDPropertyDescriptor(object);
			addOptionEPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_RiskAssessmentCode_baseline_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RiskAssessmentCode_baseline_feature", "_UI_RiskAssessmentCode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.RISK_ASSESSMENT_CODE__BASELINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Option B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RiskAssessmentCode_optionB_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RiskAssessmentCode_optionB_feature", "_UI_RiskAssessmentCode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.RISK_ASSESSMENT_CODE__OPTION_B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Option C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RiskAssessmentCode_optionC_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RiskAssessmentCode_optionC_feature", "_UI_RiskAssessmentCode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.RISK_ASSESSMENT_CODE__OPTION_C,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Option D feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RiskAssessmentCode_optionD_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RiskAssessmentCode_optionD_feature", "_UI_RiskAssessmentCode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.RISK_ASSESSMENT_CODE__OPTION_D,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Option E feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionEPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RiskAssessmentCode_optionE_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_RiskAssessmentCode_optionE_feature", "_UI_RiskAssessmentCode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 HazardPackage.Literals.RISK_ASSESSMENT_CODE__OPTION_E,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RiskAssessmentCode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RiskAssessmentCode")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RiskAssessmentCode)object).getBaseline();
		return label == null || label.length() == 0 ?
			getString("_UI_RiskAssessmentCode_type") : //$NON-NLS-1$
			getString("_UI_RiskAssessmentCode_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(RiskAssessmentCode.class)) {
			case HazardPackage.RISK_ASSESSMENT_CODE__BASELINE:
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_B:
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_C:
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_D:
			case HazardPackage.RISK_ASSESSMENT_CODE__OPTION_E:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
