/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.Argumentation.components;

// Start of user code for imports
import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.ArgumentReasoning;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.AssertedChallenge;
import net.certware.sacm.SACM.Argumentation.AssertedInference;

import net.certware.sacm.SACM.Argumentation.parts.ArgumentReasoningPropertiesEditionPart;
import net.certware.sacm.SACM.Argumentation.parts.ArgumentationViewsRepository;

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
 * 
 * 
 */
public class ArgumentReasoningPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for structure ReferencesTable
	 */
	private ReferencesTableSettings structureSettings;
	
	/**
	 * Settings for describedInference ReferencesTable
	 */
	private ReferencesTableSettings describedInferenceSettings;
	
	/**
	 * Settings for describedChallenge ReferencesTable
	 */
	private ReferencesTableSettings describedChallengeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArgumentReasoningPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject argumentReasoning, String editing_mode) {
		super(editingContext, argumentReasoning, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ArgumentationViewsRepository.class;
		partKey = ArgumentationViewsRepository.ArgumentReasoning.class;
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
			
			final ArgumentReasoning argumentReasoning = (ArgumentReasoning)elt;
			final ArgumentReasoningPropertiesEditionPart basePart = (ArgumentReasoningPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.taggedValue)) {
				taggedValueSettings = new ReferencesTableSettings(argumentReasoning, SACMPackage.eINSTANCE.getModelElement_TaggedValue());
				basePart.initTaggedValue(taggedValueSettings);
			}
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.annotation)) {
				annotationSettings = new ReferencesTableSettings(argumentReasoning, SACMPackage.eINSTANCE.getModelElement_Annotation());
				basePart.initAnnotation(annotationSettings);
			}
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, argumentReasoning.getId()));
			
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, argumentReasoning.getDescription()));
			
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, argumentReasoning.getContent()));
			
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure)) {
				structureSettings = new ReferencesTableSettings(argumentReasoning, ArgumentationPackage.eINSTANCE.getArgumentReasoning_Structure());
				basePart.initStructure(structureSettings);
			}
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference)) {
				describedInferenceSettings = new ReferencesTableSettings(argumentReasoning, ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedInference());
				basePart.initDescribedInference(describedInferenceSettings);
			}
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge)) {
				describedChallengeSettings = new ReferencesTableSettings(argumentReasoning, ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedChallenge());
				basePart.initDescribedChallenge(describedChallengeSettings);
			}
			// init filters
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.taggedValue)) {
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
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.annotation)) {
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
			
			
			
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure)) {
				basePart.addFilterToStructure(new EObjectFilter(ArgumentationPackage.Literals.ARGUMENTATION));
				// Start of user code for additional businessfilters for structure
				// End of user code
			}
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference)) {
				basePart.addFilterToDescribedInference(new EObjectFilter(ArgumentationPackage.Literals.ASSERTED_INFERENCE));
				// Start of user code for additional businessfilters for describedInference
				// End of user code
			}
			if (isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge)) {
				basePart.addFilterToDescribedChallenge(new EObjectFilter(ArgumentationPackage.Literals.ASSERTED_CHALLENGE));
				// Start of user code for additional businessfilters for describedChallenge
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
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.taggedValue) {
			return SACMPackage.eINSTANCE.getModelElement_TaggedValue();
		}
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.annotation) {
			return SACMPackage.eINSTANCE.getModelElement_Annotation();
		}
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.id) {
			return SACMPackage.eINSTANCE.getModelElement_Id();
		}
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.description) {
			return ArgumentationPackage.eINSTANCE.getArgumentationElement_Description();
		}
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.content) {
			return ArgumentationPackage.eINSTANCE.getArgumentationElement_Content();
		}
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.structure) {
			return ArgumentationPackage.eINSTANCE.getArgumentReasoning_Structure();
		}
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference) {
			return ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedInference();
		}
		if (editorKey == ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge) {
			return ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedChallenge();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ArgumentReasoning argumentReasoning = (ArgumentReasoning)semanticObject;
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.taggedValue == event.getAffectedEditor()) {
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
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.annotation == event.getAffectedEditor()) {
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
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.id == event.getAffectedEditor()) {
			argumentReasoning.setId((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.description == event.getAffectedEditor()) {
			argumentReasoning.setDescription((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.content == event.getAffectedEditor()) {
			argumentReasoning.setContent((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.structure == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Argumentation) {
					structureSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				structureSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				structureSettings.move(event.getNewIndex(), (Argumentation) event.getNewValue());
			}
		}
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof AssertedInference) {
					describedInferenceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				describedInferenceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				describedInferenceSettings.move(event.getNewIndex(), (AssertedInference) event.getNewValue());
			}
		}
		if (ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof AssertedChallenge) {
					describedChallengeSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				describedChallengeSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				describedChallengeSettings.move(event.getNewIndex(), (AssertedChallenge) event.getNewValue());
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
			ArgumentReasoningPropertiesEditionPart basePart = (ArgumentReasoningPropertiesEditionPart)editingPart;
			if (SACMPackage.eINSTANCE.getModelElement_TaggedValue().equals(msg.getFeature()) && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.taggedValue))
				basePart.updateTaggedValue();
			if (SACMPackage.eINSTANCE.getModelElement_Annotation().equals(msg.getFeature()) && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.annotation))
				basePart.updateAnnotation();
			if (SACMPackage.eINSTANCE.getModelElement_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (ArgumentationPackage.eINSTANCE.getArgumentationElement_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArgumentationPackage.eINSTANCE.getArgumentationElement_Content().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArgumentationPackage.eINSTANCE.getArgumentReasoning_Structure().equals(msg.getFeature())  && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.structure))
				basePart.updateStructure();
			if (ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedInference().equals(msg.getFeature())  && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedInference))
				basePart.updateDescribedInference();
			if (ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedChallenge().equals(msg.getFeature())  && isAccessible(ArgumentationViewsRepository.ArgumentReasoning.Properties.describedChallenge))
				basePart.updateDescribedChallenge();
			
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
			ArgumentationPackage.eINSTANCE.getArgumentReasoning_Structure(),
			ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedInference(),
			ArgumentationPackage.eINSTANCE.getArgumentReasoning_DescribedChallenge()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ArgumentationViewsRepository.ArgumentReasoning.Properties.id || key == ArgumentationViewsRepository.ArgumentReasoning.Properties.description || key == ArgumentationViewsRepository.ArgumentReasoning.Properties.content;
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
				if (ArgumentationViewsRepository.ArgumentReasoning.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), newValue);
				}
				if (ArgumentationViewsRepository.ArgumentReasoning.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArgumentationPackage.eINSTANCE.getArgumentationElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArgumentationPackage.eINSTANCE.getArgumentationElement_Description().getEAttributeType(), newValue);
				}
				if (ArgumentationViewsRepository.ArgumentReasoning.Properties.content == event.getAffectedEditor()) {
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
