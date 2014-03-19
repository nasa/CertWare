/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.components;

// Start of user code for imports
import net.certware.verification.checklist.Category;
import net.certware.verification.checklist.Checklist;
import net.certware.verification.checklist.ChecklistPackage;
import net.certware.verification.checklist.parts.ChecklistPropertiesEditionPart;
import net.certware.verification.checklist.parts.ChecklistViewsRepository;

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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * 
 * 
 */
public class ChecklistPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for categories ReferencesTable
	 */
	protected ReferencesTableSettings categoriesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ChecklistPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject checklist, String editing_mode) {
		super(editingContext, checklist, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ChecklistViewsRepository.class;
		partKey = ChecklistViewsRepository.Checklist_.class;
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
			
			final Checklist checklist = (Checklist)elt;
			final ChecklistPropertiesEditionPart basePart = (ChecklistPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ChecklistViewsRepository.Checklist_.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, checklist.getName()));
			
			if (isAccessible(ChecklistViewsRepository.Checklist_.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, checklist.getVersion()));
			
			if (isAccessible(ChecklistViewsRepository.Checklist_.Properties.categories)) {
				categoriesSettings = new ReferencesTableSettings(checklist, ChecklistPackage.eINSTANCE.getChecklist_Categories());
				basePart.initCategories(categoriesSettings);
			}
			if (isAccessible(ChecklistViewsRepository.Checklist_.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, checklist.getComment()));
			
			// init filters
			
			
			if (isAccessible(ChecklistViewsRepository.Checklist_.Properties.categories)) {
				basePart.addFilterToCategories(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Category);
					}
			
				});
				// Start of user code for additional businessfilters for categories
			
			// End of user code
			}
			
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
		if (editorKey == ChecklistViewsRepository.Checklist_.Properties.name) {
			return ChecklistPackage.eINSTANCE.getChecklist_Name();
		}
		if (editorKey == ChecklistViewsRepository.Checklist_.Properties.version) {
			return ChecklistPackage.eINSTANCE.getChecklist_Version();
		}
		if (editorKey == ChecklistViewsRepository.Checklist_.Properties.categories) {
			return ChecklistPackage.eINSTANCE.getChecklist_Categories();
		}
		if (editorKey == ChecklistViewsRepository.Checklist_.Properties.comment) {
			return ChecklistPackage.eINSTANCE.getChecklist_Comment();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Checklist checklist = (Checklist)semanticObject;
		if (ChecklistViewsRepository.Checklist_.Properties.name == event.getAffectedEditor()) {
			checklist.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ChecklistViewsRepository.Checklist_.Properties.version == event.getAffectedEditor()) {
			checklist.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ChecklistViewsRepository.Checklist_.Properties.categories == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, categoriesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				categoriesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				categoriesSettings.move(event.getNewIndex(), (Category) event.getNewValue());
			}
		}
		if (ChecklistViewsRepository.Checklist_.Properties.comment == event.getAffectedEditor()) {
			checklist.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ChecklistPropertiesEditionPart basePart = (ChecklistPropertiesEditionPart)editingPart;
			if (ChecklistPackage.eINSTANCE.getChecklist_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ChecklistViewsRepository.Checklist_.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ChecklistPackage.eINSTANCE.getChecklist_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ChecklistViewsRepository.Checklist_.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (ChecklistPackage.eINSTANCE.getChecklist_Categories().equals(msg.getFeature()) && isAccessible(ChecklistViewsRepository.Checklist_.Properties.categories))
				basePart.updateCategories();
			if (ChecklistPackage.eINSTANCE.getChecklist_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ChecklistViewsRepository.Checklist_.Properties.comment)) {
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
			ChecklistPackage.eINSTANCE.getChecklist_Name(),
			ChecklistPackage.eINSTANCE.getChecklist_Version(),
			ChecklistPackage.eINSTANCE.getChecklist_Categories(),
			ChecklistPackage.eINSTANCE.getChecklist_Comment()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ChecklistViewsRepository.Checklist_.Properties.categories;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == ChecklistViewsRepository.Checklist_.Properties.name)
			return "The checklist name."; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Checklist_.Properties.version)
			return "The checklist version identifier"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Checklist_.Properties.categories)
			return "Verification categories"; //$NON-NLS-1$
		if (key == ChecklistViewsRepository.Checklist_.Properties.comment)
			return "Comments regarding this checklist"; //$NON-NLS-1$
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
				if (ChecklistViewsRepository.Checklist_.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getChecklist_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getChecklist_Name().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Checklist_.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getChecklist_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getChecklist_Version().getEAttributeType(), newValue);
				}
				if (ChecklistViewsRepository.Checklist_.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ChecklistPackage.eINSTANCE.getChecklist_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ChecklistPackage.eINSTANCE.getChecklist_Comment().getEAttributeType(), newValue);
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
