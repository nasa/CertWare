// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Evidence.components;

// Start of user code for imports
import net.certware.sacm.SACM.SACMPackage;
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.Evidence.EvidenceEvaluation;
import net.certware.sacm.SACM.Evidence.EvidenceItem;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.ProjectElement;
import net.certware.sacm.SACM.Evidence.ProjectProperty;
import net.certware.sacm.SACM.Evidence.parts.EvidenceContainerPropertiesEditionPart;
import net.certware.sacm.SACM.Evidence.parts.EvidenceViewsRepository;

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
public class EvidenceContainerBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for evaluation ReferencesTable
	 */
	protected ReferencesTableSettings evaluationSettings;
	
	/**
	 * Settings for item ReferencesTable
	 */
	protected ReferencesTableSettings itemSettings;
	
	/**
	 * Settings for property ReferencesTable
	 */
	protected ReferencesTableSettings propertySettings;
	
	/**
	 * Settings for element ReferencesTable
	 */
	protected ReferencesTableSettings elementSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EvidenceContainerBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject evidenceContainer, String editing_mode) {
		super(editingContext, evidenceContainer, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EvidenceViewsRepository.class;
		partKey = EvidenceViewsRepository.EvidenceContainer.class;
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
			
			final EvidenceContainer evidenceContainer = (EvidenceContainer)elt;
			final EvidenceContainerPropertiesEditionPart basePart = (EvidenceContainerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, evidenceContainer.getId()));
			
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, evidenceContainer.getName()));
			
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation)) {
				evaluationSettings = new ReferencesTableSettings(evidenceContainer, EvidencePackage.eINSTANCE.getEvidenceContainer_Evaluation());
				basePart.initEvaluation(evaluationSettings);
			}
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.item)) {
				itemSettings = new ReferencesTableSettings(evidenceContainer, EvidencePackage.eINSTANCE.getEvidenceContainer_Item());
				basePart.initItem(itemSettings);
			}
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.gid))
				basePart.setGid(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, evidenceContainer.getGid()));
			
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.property)) {
				propertySettings = new ReferencesTableSettings(evidenceContainer, EvidencePackage.eINSTANCE.getEvidenceContainer_Property());
				basePart.initProperty(propertySettings);
			}
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, evidenceContainer.getVersion()));
			
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.element)) {
				elementSettings = new ReferencesTableSettings(evidenceContainer, EvidencePackage.eINSTANCE.getEvidenceContainer_Element());
				basePart.initElement(elementSettings);
			}
			// init filters
			
			
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation)) {
				basePart.addFilterToEvaluation(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EvidenceEvaluation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for evaluation
				// End of user code
			}
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.item)) {
				basePart.addFilterToItem(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EvidenceItem); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for item
				// End of user code
			}
			
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.property)) {
				basePart.addFilterToProperty(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ProjectProperty); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for property
				// End of user code
			}
			
			if (isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.element)) {
				basePart.addFilterToElement(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ProjectElement); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for element
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
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.id) {
			return SACMPackage.eINSTANCE.getModelElement_Id();
		}
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.name) {
			return EvidencePackage.eINSTANCE.getEvidenceContainer_Name();
		}
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.evaluation) {
			return EvidencePackage.eINSTANCE.getEvidenceContainer_Evaluation();
		}
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.item) {
			return EvidencePackage.eINSTANCE.getEvidenceContainer_Item();
		}
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.gid) {
			return EvidencePackage.eINSTANCE.getEvidenceContainer_Gid();
		}
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.property) {
			return EvidencePackage.eINSTANCE.getEvidenceContainer_Property();
		}
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.version) {
			return EvidencePackage.eINSTANCE.getEvidenceContainer_Version();
		}
		if (editorKey == EvidenceViewsRepository.EvidenceContainer.Properties.element) {
			return EvidencePackage.eINSTANCE.getEvidenceContainer_Element();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EvidenceContainer evidenceContainer = (EvidenceContainer)semanticObject;
		if (EvidenceViewsRepository.EvidenceContainer.Properties.id == event.getAffectedEditor()) {
			evidenceContainer.setId((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (EvidenceViewsRepository.EvidenceContainer.Properties.name == event.getAffectedEditor()) {
			evidenceContainer.setName((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (EvidenceViewsRepository.EvidenceContainer.Properties.evaluation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, evaluationSettings, editingContext.getAdapterFactory());
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
				evaluationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				evaluationSettings.move(event.getNewIndex(), (EvidenceEvaluation) event.getNewValue());
			}
		}
		if (EvidenceViewsRepository.EvidenceContainer.Properties.item == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, itemSettings, editingContext.getAdapterFactory());
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
				itemSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				itemSettings.move(event.getNewIndex(), (EvidenceItem) event.getNewValue());
			}
		}
		if (EvidenceViewsRepository.EvidenceContainer.Properties.gid == event.getAffectedEditor()) {
			evidenceContainer.setGid((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (EvidenceViewsRepository.EvidenceContainer.Properties.property == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, propertySettings, editingContext.getAdapterFactory());
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
				propertySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				propertySettings.move(event.getNewIndex(), (ProjectProperty) event.getNewValue());
			}
		}
		if (EvidenceViewsRepository.EvidenceContainer.Properties.version == event.getAffectedEditor()) {
			evidenceContainer.setVersion((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (EvidenceViewsRepository.EvidenceContainer.Properties.element == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, elementSettings, editingContext.getAdapterFactory());
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
				elementSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				elementSettings.move(event.getNewIndex(), (ProjectElement) event.getNewValue());
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
			EvidenceContainerPropertiesEditionPart basePart = (EvidenceContainerPropertiesEditionPart)editingPart;
			if (SACMPackage.eINSTANCE.getModelElement_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (EvidencePackage.eINSTANCE.getEvidenceContainer_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EvidencePackage.eINSTANCE.getEvidenceContainer_Evaluation().equals(msg.getFeature()) && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.evaluation))
				basePart.updateEvaluation();
			if (EvidencePackage.eINSTANCE.getEvidenceContainer_Item().equals(msg.getFeature()) && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.item))
				basePart.updateItem();
			if (EvidencePackage.eINSTANCE.getEvidenceContainer_Gid().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.gid)) {
				if (msg.getNewValue() != null) {
					basePart.setGid(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setGid("");
				}
			}
			if (EvidencePackage.eINSTANCE.getEvidenceContainer_Property().equals(msg.getFeature()) && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.property))
				basePart.updateProperty();
			if (EvidencePackage.eINSTANCE.getEvidenceContainer_Version().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setVersion("");
				}
			}
			if (EvidencePackage.eINSTANCE.getEvidenceContainer_Element().equals(msg.getFeature()) && isAccessible(EvidenceViewsRepository.EvidenceContainer.Properties.element))
				basePart.updateElement();
			
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
			SACMPackage.eINSTANCE.getModelElement_Id(),
			EvidencePackage.eINSTANCE.getEvidenceContainer_Name(),
			EvidencePackage.eINSTANCE.getEvidenceContainer_Evaluation(),
			EvidencePackage.eINSTANCE.getEvidenceContainer_Item(),
			EvidencePackage.eINSTANCE.getEvidenceContainer_Gid(),
			EvidencePackage.eINSTANCE.getEvidenceContainer_Property(),
			EvidencePackage.eINSTANCE.getEvidenceContainer_Version(),
			EvidencePackage.eINSTANCE.getEvidenceContainer_Element()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EvidenceViewsRepository.EvidenceContainer.Properties.id || key == EvidenceViewsRepository.EvidenceContainer.Properties.name || key == EvidenceViewsRepository.EvidenceContainer.Properties.gid || key == EvidenceViewsRepository.EvidenceContainer.Properties.version;
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
				if (EvidenceViewsRepository.EvidenceContainer.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), newValue);
				}
				if (EvidenceViewsRepository.EvidenceContainer.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EvidencePackage.eINSTANCE.getEvidenceContainer_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EvidencePackage.eINSTANCE.getEvidenceContainer_Name().getEAttributeType(), newValue);
				}
				if (EvidenceViewsRepository.EvidenceContainer.Properties.gid == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EvidencePackage.eINSTANCE.getEvidenceContainer_Gid().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EvidencePackage.eINSTANCE.getEvidenceContainer_Gid().getEAttributeType(), newValue);
				}
				if (EvidenceViewsRepository.EvidenceContainer.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EvidencePackage.eINSTANCE.getEvidenceContainer_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EvidencePackage.eINSTANCE.getEvidenceContainer_Version().getEAttributeType(), newValue);
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
