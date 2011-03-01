/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.provider;


import java.util.Collection;
import java.util.List;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.DocumentRoot;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.certware.argument.aml.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
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
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

			addActorPropertyDescriptor(object);
			addBodyPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addDepartmentPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addEventPropertyDescriptor(object);
			addFirstNamePropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addLastNamePropertyDescriptor(object);
			addMiddleNamePropertyDescriptor(object);
			addNickNamePropertyDescriptor(object);
			addOrganizationPropertyDescriptor(object);
			addPerspectivePropertyDescriptor(object);
			addRationalePropertyDescriptor(object);
			addRegionPropertyDescriptor(object);
			addSecurityMarkingPropertyDescriptor(object);
			addSubjectPropertyDescriptor(object);
			addSymbolPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addUrlPropertyDescriptor(object);
			addDescription1PropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addIdRefPropertyDescriptor(object);
			addLabel1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_actor_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_actor_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__ACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_body_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_body_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__BODY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_date_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_date_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Department feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepartmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_department_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_department_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__DEPARTMENT,
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
				 getString("_UI_DocumentRoot_description_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_description_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_email_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_email_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_event_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_event_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__EVENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_firstName_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_firstName_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__FIRST_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_label_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_label_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_lastName_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_lastName_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__LAST_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Middle Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiddleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_middleName_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_middleName_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__MIDDLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nick Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNickNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_nickName_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_nickName_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__NICK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_organization_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_organization_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__ORGANIZATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perspective feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerspectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_perspective_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_perspective_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__PERSPECTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rationale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRationalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_rationale_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_rationale_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__RATIONALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_region_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_region_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__REGION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Marking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityMarkingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_securityMarking_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_securityMarking_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__SECURITY_MARKING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_subject_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_subject_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__SUBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Symbol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSymbolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_symbol_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_symbol_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__SYMBOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_title_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_title_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_url_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_url_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescription1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_description1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_description1_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__DESCRIPTION1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_id_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_idRef_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_idRef_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__ID_REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabel1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_label1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_label1_feature", "_UI_DocumentRoot_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 AmlPackage.Literals.DOCUMENT_ROOT__LABEL1,
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
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__AGGREGATION_RULE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__AML_DOCUMENT);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__ANNOTATION);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__ANSWER);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__ARCHIVE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT_TEMPLATE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__BELIEF);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__CHOICE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION_ITEM);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__COVERAGE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__CREATING_TOOL);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__CREATOR);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__DEPENDENT);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__DISCOVERY_METHOD);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__END);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE_EXHIBIT);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__EXHIBIT);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__FLAG);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__FORMAT);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__IDENTIFIER);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__IMAGE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__INTERVAL);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__LANGUAGE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__LIST);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__MEMO);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__META_DATA);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__METHOD);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__NATION_STATE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__PARAMETER);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__PERIOD);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__PERSON);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__READER);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__RELATION);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__RELEVANCE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__RELIABILITY);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__RIGHTS);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__SOURCE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__START);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__TEMPLATE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__TYPE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__VALUE);
			childrenFeatures.add(AmlPackage.Literals.DOCUMENT_ROOT__WITNESS);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getFirstName();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") : //$NON-NLS-1$
			getString("_UI_DocumentRoot_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case AmlPackage.DOCUMENT_ROOT__ACTOR:
			case AmlPackage.DOCUMENT_ROOT__BODY:
			case AmlPackage.DOCUMENT_ROOT__DATE:
			case AmlPackage.DOCUMENT_ROOT__DEPARTMENT:
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION:
			case AmlPackage.DOCUMENT_ROOT__EMAIL:
			case AmlPackage.DOCUMENT_ROOT__EVENT:
			case AmlPackage.DOCUMENT_ROOT__FIRST_NAME:
			case AmlPackage.DOCUMENT_ROOT__LABEL:
			case AmlPackage.DOCUMENT_ROOT__LAST_NAME:
			case AmlPackage.DOCUMENT_ROOT__MIDDLE_NAME:
			case AmlPackage.DOCUMENT_ROOT__NICK_NAME:
			case AmlPackage.DOCUMENT_ROOT__ORGANIZATION:
			case AmlPackage.DOCUMENT_ROOT__PERSPECTIVE:
			case AmlPackage.DOCUMENT_ROOT__RATIONALE:
			case AmlPackage.DOCUMENT_ROOT__REGION:
			case AmlPackage.DOCUMENT_ROOT__SECURITY_MARKING:
			case AmlPackage.DOCUMENT_ROOT__SUBJECT:
			case AmlPackage.DOCUMENT_ROOT__SYMBOL:
			case AmlPackage.DOCUMENT_ROOT__TITLE:
			case AmlPackage.DOCUMENT_ROOT__URL:
			case AmlPackage.DOCUMENT_ROOT__DESCRIPTION1:
			case AmlPackage.DOCUMENT_ROOT__ID:
			case AmlPackage.DOCUMENT_ROOT__ID_REF:
			case AmlPackage.DOCUMENT_ROOT__LABEL1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmlPackage.DOCUMENT_ROOT__AGGREGATION_RULE:
			case AmlPackage.DOCUMENT_ROOT__AML_DOCUMENT:
			case AmlPackage.DOCUMENT_ROOT__ANNOTATION:
			case AmlPackage.DOCUMENT_ROOT__ANSWER:
			case AmlPackage.DOCUMENT_ROOT__ARCHIVE:
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT:
			case AmlPackage.DOCUMENT_ROOT__ARGUMENT_TEMPLATE:
			case AmlPackage.DOCUMENT_ROOT__BELIEF:
			case AmlPackage.DOCUMENT_ROOT__CHOICE:
			case AmlPackage.DOCUMENT_ROOT__COLLECTION:
			case AmlPackage.DOCUMENT_ROOT__COLLECTION_ITEM:
			case AmlPackage.DOCUMENT_ROOT__CONTRIBUTOR:
			case AmlPackage.DOCUMENT_ROOT__COVERAGE:
			case AmlPackage.DOCUMENT_ROOT__CREATING_TOOL:
			case AmlPackage.DOCUMENT_ROOT__CREATOR:
			case AmlPackage.DOCUMENT_ROOT__DEPENDENT:
			case AmlPackage.DOCUMENT_ROOT__DISCOVERY_METHOD:
			case AmlPackage.DOCUMENT_ROOT__END:
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE:
			case AmlPackage.DOCUMENT_ROOT__EVIDENCE_EXHIBIT:
			case AmlPackage.DOCUMENT_ROOT__EXHIBIT:
			case AmlPackage.DOCUMENT_ROOT__FLAG:
			case AmlPackage.DOCUMENT_ROOT__FORMAT:
			case AmlPackage.DOCUMENT_ROOT__IDENTIFIER:
			case AmlPackage.DOCUMENT_ROOT__IMAGE:
			case AmlPackage.DOCUMENT_ROOT__INTERVAL:
			case AmlPackage.DOCUMENT_ROOT__LANGUAGE:
			case AmlPackage.DOCUMENT_ROOT__LIST:
			case AmlPackage.DOCUMENT_ROOT__MEMO:
			case AmlPackage.DOCUMENT_ROOT__META_DATA:
			case AmlPackage.DOCUMENT_ROOT__METHOD:
			case AmlPackage.DOCUMENT_ROOT__NATION_STATE:
			case AmlPackage.DOCUMENT_ROOT__PARAMETER:
			case AmlPackage.DOCUMENT_ROOT__PERIOD:
			case AmlPackage.DOCUMENT_ROOT__PERSON:
			case AmlPackage.DOCUMENT_ROOT__PUBLISHER:
			case AmlPackage.DOCUMENT_ROOT__QUESTION:
			case AmlPackage.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS:
			case AmlPackage.DOCUMENT_ROOT__READER:
			case AmlPackage.DOCUMENT_ROOT__RELATION:
			case AmlPackage.DOCUMENT_ROOT__RELEVANCE:
			case AmlPackage.DOCUMENT_ROOT__RELIABILITY:
			case AmlPackage.DOCUMENT_ROOT__RIGHTS:
			case AmlPackage.DOCUMENT_ROOT__SOURCE:
			case AmlPackage.DOCUMENT_ROOT__START:
			case AmlPackage.DOCUMENT_ROOT__TEMPLATE:
			case AmlPackage.DOCUMENT_ROOT__TYPE:
			case AmlPackage.DOCUMENT_ROOT__VALUE:
			case AmlPackage.DOCUMENT_ROOT__WITNESS:
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
				(AmlPackage.Literals.DOCUMENT_ROOT__AGGREGATION_RULE,
				 AmlFactory.eINSTANCE.createAggregationRule()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__AML_DOCUMENT,
				 AmlFactory.eINSTANCE.createAmlDocument()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__ANNOTATION,
				 AmlFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__ANSWER,
				 AmlFactory.eINSTANCE.createAnswer()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__ARCHIVE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT,
				 AmlFactory.eINSTANCE.createArgument()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__ARGUMENT_TEMPLATE,
				 AmlFactory.eINSTANCE.createArgumentTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__BELIEF,
				 AmlFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__CHOICE,
				 AmlFactory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION,
				 AmlFactory.eINSTANCE.createCollection()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__COLLECTION_ITEM,
				 AmlFactory.eINSTANCE.createCollectionItem()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__COVERAGE,
				 AmlFactory.eINSTANCE.createCoverage()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__CREATING_TOOL,
				 AmlFactory.eINSTANCE.createCreatingTool()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__CREATOR,
				 AmlFactory.eINSTANCE.createCreator()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__DEPENDENT,
				 AmlFactory.eINSTANCE.createDependent()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__DISCOVERY_METHOD,
				 AmlFactory.eINSTANCE.createDiscoveryMethod()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__END,
				 AmlFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE,
				 AmlFactory.eINSTANCE.createEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__EVIDENCE_EXHIBIT,
				 AmlFactory.eINSTANCE.createEvidenceExhibit()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__EXHIBIT,
				 AmlFactory.eINSTANCE.createExhibit()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__FLAG,
				 AmlFactory.eINSTANCE.createFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__FORMAT,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__IDENTIFIER,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__IMAGE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__INTERVAL,
				 AmlFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__LANGUAGE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__LIST,
				 AmlFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__MEMO,
				 AmlFactory.eINSTANCE.createMemo()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__META_DATA,
				 AmlFactory.eINSTANCE.createMetaData()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__METHOD,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__NATION_STATE,
				 AmlFactory.eINSTANCE.createNationState()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__PARAMETER,
				 AmlFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__PERIOD,
				 AmlFactory.eINSTANCE.createPeriod()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__PERSON,
				 AmlFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__PUBLISHER,
				 AmlFactory.eINSTANCE.createPublisher()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION,
				 AmlFactory.eINSTANCE.createQuestion()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__QUESTION_RELATIONSHIPS,
				 AmlFactory.eINSTANCE.createQuestionRelationships()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__READER,
				 AmlFactory.eINSTANCE.createReader()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__RELATION,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__RELEVANCE,
				 AmlFactory.eINSTANCE.createRelevance()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__RELIABILITY,
				 AmlFactory.eINSTANCE.createReliability()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__RIGHTS,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__SOURCE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__START,
				 AmlFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__TEMPLATE,
				 AmlFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__TYPE,
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__VALUE,
				 AmlFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(AmlPackage.Literals.DOCUMENT_ROOT__WITNESS,
				 AmlFactory.eINSTANCE.createWitness()));
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
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__ARCHIVE ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__CONTRIBUTOR ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__FORMAT ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__IDENTIFIER ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__IMAGE ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__LANGUAGE ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__METHOD ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__RELATION ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__RIGHTS ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__SOURCE ||
			childFeature == AmlPackage.Literals.DOCUMENT_ROOT__TYPE;

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
		return AmlEditPlugin.INSTANCE;
	}

}
