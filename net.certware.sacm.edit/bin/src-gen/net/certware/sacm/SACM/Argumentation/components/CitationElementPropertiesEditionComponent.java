// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.ArgumentElement;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.CitationElement;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;
import net.certware.sacm.SACM.Argumentation.parts.CitationElementPropertiesEditionPart;

import net.certware.sacm.SACM.SACMPackage;
import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

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
 * @author Kestrel Technology LLC
 * 
 */
public class CitationElementPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for taggedValue ReferencesTable
	 */
	protected ReferencesTableSettings taggedValueSettings;
	
	/**
	 * Settings for annotation ReferencesTable
	 */
	protected ReferencesTableSettings annotationSettings;
	
	/**
	 * Settings for argumentElementReference ReferencesTable
	 */
	private ReferencesTableSettings argumentElementReferenceSettings;
	
	/**
	 * Settings for argumentationReference ReferencesTable
	 */
	private ReferencesTableSettings argumentationReferenceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CitationElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject citationElement, String editing_mode) {
		super(editingContext, citationElement, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ArgumentationViewsRepository.class;
		partKey = ArgumentationViewsRepository.CitationElement.class;
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
			
			final CitationElement citationElement = (CitationElement)elt;
			final CitationElementPropertiesEditionPart basePart = (CitationElementPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.taggedValue)) {
				taggedValueSettings = new ReferencesTableSettings(citationElement, SACMPackage.eINSTANCE.getModelElement_TaggedValue());
				basePart.initTaggedValue(taggedValueSettings);
			}
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.annotation)) {
				annotationSettings = new ReferencesTableSettings(citationElement, SACMPackage.eINSTANCE.getModelElement_Annotation());
				basePart.initAnnotation(annotationSettings);
			}
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, citationElement.getId()));
			
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, citationElement.getDescription()));
			
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, citationElement.getContent()));
			
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference)) {
				argumentElementReferenceSettings = new ReferencesTableSettings(citationElement, ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentElementReference());
				basePart.initArgumentElementReference(argumentElementReferenceSettings);
			}
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference)) {
				argumentationReferenceSettings = new ReferencesTableSettings(citationElement, ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentationReference());
				basePart.initArgumentationReference(argumentationReferenceSettings);
			}
			// init filters
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.taggedValue)) {
				basePart.addFilterToTaggedValue(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TaggedValue); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for taggedValue
				// End of user code
			}
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.annotation)) {
				basePart.addFilterToAnnotation(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Annotation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for annotation
				// End of user code
			}
			
			
			
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference)) {
				basePart.addFilterToArgumentElementReference(new EObjectFilter(ArgumentationPackage.Literals.ARGUMENT_ELEMENT));
				// Start of user code for additional businessfilters for argumentElementReference
				// End of user code
			}
			if (isAccessible(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference)) {
				basePart.addFilterToArgumentationReference(new EObjectFilter(ArgumentationPackage.Literals.ARGUMENTATION));
				// Start of user code for additional businessfilters for argumentationReference
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
		if (editorKey == ArgumentationViewsRepository.CitationElement.Properties.taggedValue) {
			return SACMPackage.eINSTANCE.getModelElement_TaggedValue();
		}
		if (editorKey == ArgumentationViewsRepository.CitationElement.Properties.annotation) {
			return SACMPackage.eINSTANCE.getModelElement_Annotation();
		}
		if (editorKey == ArgumentationViewsRepository.CitationElement.Properties.id) {
			return SACMPackage.eINSTANCE.getModelElement_Id();
		}
		if (editorKey == ArgumentationViewsRepository.CitationElement.Properties.description) {
			return ArgumentationPackage.eINSTANCE.getArgumentationElement_Description();
		}
		if (editorKey == ArgumentationViewsRepository.CitationElement.Properties.content) {
			return ArgumentationPackage.eINSTANCE.getArgumentationElement_Content();
		}
		if (editorKey == ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference) {
			return ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentElementReference();
		}
		if (editorKey == ArgumentationViewsRepository.CitationElement.Properties.argumentationReference) {
			return ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentationReference();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CitationElement citationElement = (CitationElement)semanticObject;
		if (ArgumentationViewsRepository.CitationElement.Properties.taggedValue == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, taggedValueSettings, editingContext.getAdapterFactory());
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
				taggedValueSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				taggedValueSettings.move(event.getNewIndex(), (TaggedValue) event.getNewValue());
			}
		}
		if (ArgumentationViewsRepository.CitationElement.Properties.annotation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, annotationSettings, editingContext.getAdapterFactory());
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
				annotationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				annotationSettings.move(event.getNewIndex(), (Annotation) event.getNewValue());
			}
		}
		if (ArgumentationViewsRepository.CitationElement.Properties.id == event.getAffectedEditor()) {
			citationElement.setId((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (ArgumentationViewsRepository.CitationElement.Properties.description == event.getAffectedEditor()) {
			citationElement.setDescription((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (ArgumentationViewsRepository.CitationElement.Properties.content == event.getAffectedEditor()) {
			citationElement.setContent((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ArgumentElement) {
					argumentElementReferenceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				argumentElementReferenceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				argumentElementReferenceSettings.move(event.getNewIndex(), (ArgumentElement) event.getNewValue());
			}
		}
		if (ArgumentationViewsRepository.CitationElement.Properties.argumentationReference == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Argumentation) {
					argumentationReferenceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				argumentationReferenceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				argumentationReferenceSettings.move(event.getNewIndex(), (Argumentation) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CitationElementPropertiesEditionPart basePart = (CitationElementPropertiesEditionPart)editingPart;
			if (SACMPackage.eINSTANCE.getModelElement_TaggedValue().equals(msg.getFeature()) && isAccessible(ArgumentationViewsRepository.CitationElement.Properties.taggedValue))
				basePart.updateTaggedValue();
			if (SACMPackage.eINSTANCE.getModelElement_Annotation().equals(msg.getFeature()) && isAccessible(ArgumentationViewsRepository.CitationElement.Properties.annotation))
				basePart.updateAnnotation();
			if (SACMPackage.eINSTANCE.getModelElement_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArgumentationViewsRepository.CitationElement.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (ArgumentationPackage.eINSTANCE.getArgumentationElement_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArgumentationViewsRepository.CitationElement.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArgumentationPackage.eINSTANCE.getArgumentationElement_Content().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArgumentationViewsRepository.CitationElement.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentElementReference().equals(msg.getFeature())  && isAccessible(ArgumentationViewsRepository.CitationElement.Properties.argumentElementReference))
				basePart.updateArgumentElementReference();
			if (ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentationReference().equals(msg.getFeature())  && isAccessible(ArgumentationViewsRepository.CitationElement.Properties.argumentationReference))
				basePart.updateArgumentationReference();
			
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
			SACMPackage.eINSTANCE.getModelElement_TaggedValue(),
			SACMPackage.eINSTANCE.getModelElement_Annotation(),
			SACMPackage.eINSTANCE.getModelElement_Id(),
			ArgumentationPackage.eINSTANCE.getArgumentationElement_Description(),
			ArgumentationPackage.eINSTANCE.getArgumentationElement_Content(),
			ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentElementReference(),
			ArgumentationPackage.eINSTANCE.getCitationElement_ArgumentationReference()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ArgumentationViewsRepository.CitationElement.Properties.id || key == ArgumentationViewsRepository.CitationElement.Properties.description || key == ArgumentationViewsRepository.CitationElement.Properties.content;
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
				if (ArgumentationViewsRepository.CitationElement.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), newValue);
				}
				if (ArgumentationViewsRepository.CitationElement.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArgumentationPackage.eINSTANCE.getArgumentationElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArgumentationPackage.eINSTANCE.getArgumentationElement_Description().getEAttributeType(), newValue);
				}
				if (ArgumentationViewsRepository.CitationElement.Properties.content == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArgumentationPackage.eINSTANCE.getArgumentationElement_Content().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArgumentationPackage.eINSTANCE.getArgumentationElement_Content().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

}
