/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.components;

// Start of user code for imports
import net.certware.verification.checklist.ChecklistPackage;
import net.certware.verification.checklist.Choices;
import net.certware.verification.checklist.Item;
import net.certware.verification.checklist.parts.ChecklistViewsRepository;
import net.certware.verification.checklist.parts.ItemPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
	

// End of user code

/**
 * 
 * 
 */
public class ItemPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ItemPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject item, String editing_mode) {
		super(editingContext, item, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ChecklistViewsRepository.class;
		partKey = ChecklistViewsRepository.Item.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Item item = (Item)elt;
			final ItemPropertiesEditionPart basePart = (ItemPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ChecklistViewsRepository.Item.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, item.getIdentifier()));
			
			if (isAccessible(ChecklistViewsRepository.Item.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, item.getDescription()));
			
			if (isAccessible(ChecklistViewsRepository.Item.Properties.reference))
				basePart.setReference(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, item.getReference()));
			
			if (isAccessible(ChecklistViewsRepository.Item.Properties.result)) {
				basePart.initResult(EEFUtils.choiceOfValues(item, ChecklistPackage.eINSTANCE.getItem_Result()), item.getResult());
			}
			if (isAccessible(ChecklistViewsRepository.Item.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, item.getComment()));
			
			// init filters
			
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ChecklistViewsRepository.Item.Properties.identifier) {
			return ChecklistPackage.eINSTANCE.getItem_Identifier();
		}
		if (editorKey == ChecklistViewsRepository.Item.Properties.description) {
			return ChecklistPackage.eINSTANCE.getItem_Description();
		}
		if (editorKey == ChecklistViewsRepository.Item.Properties.reference) {
			return ChecklistPackage.eINSTANCE.getItem_Reference();
		}
		if (editorKey == ChecklistViewsRepository.Item.Properties.result) {
			return ChecklistPackage.eINSTANCE.getItem_Result();
		}
		if (editorKey == ChecklistViewsRepository.Item.Properties.comment) {
			return ChecklistPackage.eINSTANCE.getItem_Comment();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Item item = (Item)semanticObject;
		if (ChecklistViewsRepository.Item.Properties.identifier == event.getAffectedEditor()) {
			item.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ChecklistViewsRepository.Item.Properties.description == event.getAffectedEditor()) {
			item.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ChecklistViewsRepository.Item.Properties.reference == event.getAffectedEditor()) {
			item.setReference((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ChecklistViewsRepository.Item.Properties.result == event.getAffectedEditor()) {
			item.setResult((Choices)event.getNewValue());
		}
		if (ChecklistViewsRepository.Item.Properties.comment == event.getAffectedEditor()) {
			item.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ItemPropertiesEditionPart basePart = (ItemPropertiesEditionPart)editingPart;
			if (ChecklistPackage.eINSTANCE.getItem_Identifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ChecklistViewsRepository.Item.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ChecklistPackage.eINSTANCE.getItem_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ChecklistViewsRepository.Item.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ChecklistPackage.eINSTANCE.getItem_Reference().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ChecklistViewsRepository.Item.Properties.reference)) {
				if (msg.getNewValue() != null) {
					basePart.setReference(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setReference("");
				}
			}
			if (ChecklistPackage.eINSTANCE.getItem_Result().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(ChecklistViewsRepository.Item.Properties.result))
				basePart.setResult((Choices)msg.getNewValue());
			
			if (ChecklistPackage.eINSTANCE.getItem_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ChecklistViewsRepository.Item.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			ChecklistPackage.eINSTANCE.getItem_Identifier(),
			ChecklistPackage.eINSTANCE.getItem_Description(),
			ChecklistPackage.eINSTANCE.getItem_Reference(),
			ChecklistPackage.eINSTANCE.getItem_Result(),
			ChecklistPackage.eINSTANCE.getItem_Comment()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ChecklistViewsRepository.Item.Properties.result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ChecklistViewsRepository.Item.Properties.identifier)
			return "Item unique identifier for traceability"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.Properties.description)
			return "Item description for verification task"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.Properties.reference)
			return "Case location reference for verification"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.Properties.result)
			return "Whether the case fulfills with the verification item"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Item.Properties.comment)
			return "Comments regarding the verification result"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ChecklistViewsRepository.Item.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Identifier().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Description().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.Properties.reference == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Reference().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Reference().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.Properties.result == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Result().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Result().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Item.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getItem_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getItem_Comment().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

<<<<<<< HEAD

	
=======
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> refs/heads/master

}
