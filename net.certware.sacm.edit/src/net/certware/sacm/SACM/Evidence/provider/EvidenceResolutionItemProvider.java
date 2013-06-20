/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.provider;


import java.util.Collection;
import java.util.List;

import net.certware.sacm.SACM.Evidence.EvidenceFactory;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.EvidenceResolution;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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
 * This is the item provider adapter for a {@link net.certware.sacm.SACM.Evidence.EvidenceResolution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvidenceResolutionItemProvider
	extends EvidenceEvaluationItemProvider
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
	public EvidenceResolutionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT);
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
		String label = ((EvidenceResolution)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_EvidenceResolution_type") : //$NON-NLS-1$
			getString("_UI_EvidenceResolution_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EvidenceResolution.class)) {
			case EvidencePackage.EVIDENCE_RESOLUTION__SUBJECT:
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
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createConsistency()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createCompleteness()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createExhibit()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createConfidence()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createApprovedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createCreatedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsBasedOn()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsA()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsCharacterizedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createEndTime()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createCompositeObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createStartTime()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createRelevance()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createSignificance()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createAccuracy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createHasRoleIn()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsScopedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createAtTime()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createOriginality()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createReporting()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createReliability()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createSupports()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsGeneratedAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createSupport()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createConflicts()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createRefutes()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createNegates()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createUnknownObject()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createResolves()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createEvidenceRequest()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createProjectObjective()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createDependsOn()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createSatisfies()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createReferencedClaim()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createWeakens()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createAmplifies()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createChallenges()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createStrength()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsAcquiredAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsTransferredTo()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createOwnedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsPartOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsRevokedAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createProvidesContext()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createMeansThat()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createCareOf()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createAtLocation()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsCreatedAt()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createRequiresContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createHasElectronicSource()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsExpressedInLanguage()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createUsingProcess()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createHasSecurityClassification()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsReleaseableTo()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createEvidenceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createHasVersion()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createHasMedia()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createExtendedEvidenceAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createExtendedDocumentProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createRecord()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createObjectifiedAssertion()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createIsModifiedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createPerformedBy()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createContainerConsistency()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createContainerCompleteness()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createCompliesTo()));

		newChildDescriptors.add
			(createChildParameter
				(EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT,
				 EvidenceFactory.eINSTANCE.createExtendedProjectProperty()));
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
			childFeature == EvidencePackage.Literals.EVIDENCE_ELEMENT__TIMING ||
			childFeature == EvidencePackage.Literals.EVIDENCE_RESOLUTION__SUBJECT ||
			childFeature == EvidencePackage.Literals.EVIDENCE_ELEMENT__CUSTODY ||
			childFeature == EvidencePackage.Literals.EVIDENCE_ELEMENT__PROVENANCE ||
			childFeature == EvidencePackage.Literals.EVIDENCE_ELEMENT__EVENT ||
			childFeature == EvidencePackage.Literals.EVIDENCE_EVALUATION__ATTRIBUTE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
