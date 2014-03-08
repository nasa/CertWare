// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.components;

// Start of user code for imports
import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.SACMPackage;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Evidence.EvidenceContainer;
import net.certware.sacm.SACM.parts.AssuranceCasePropertiesEditionPart;
import net.certware.sacm.SACM.parts.SACMViewsRepository;

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
public class AssuranceCaseBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for argument ReferencesTable
	 */
	protected ReferencesTableSettings argumentSettings;
	
	/**
	 * Settings for evidence ReferencesTable
	 */
	protected ReferencesTableSettings evidenceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AssuranceCaseBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assuranceCase, String editing_mode) {
		super(editingContext, assuranceCase, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SACMViewsRepository.class;
		partKey = SACMViewsRepository.AssuranceCase.class;
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
			
			final AssuranceCase assuranceCase = (AssuranceCase)elt;
			final AssuranceCasePropertiesEditionPart basePart = (AssuranceCasePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SACMViewsRepository.AssuranceCase.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, assuranceCase.getId()));
			
			if (isAccessible(SACMViewsRepository.AssuranceCase.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, assuranceCase.getName()));
			
			if (isAccessible(SACMViewsRepository.AssuranceCase.Properties.gid))
				basePart.setGid(EEFConverterUtil.convertToString(SACMPackage.Literals.STRING, assuranceCase.getGid()));
			
			if (isAccessible(SACMViewsRepository.AssuranceCase.Properties.argument)) {
				argumentSettings = new ReferencesTableSettings(assuranceCase, SACMPackage.eINSTANCE.getAssuranceCase_Argument());
				basePart.initArgument(argumentSettings);
			}
			if (isAccessible(SACMViewsRepository.AssuranceCase.Properties.evidence)) {
				evidenceSettings = new ReferencesTableSettings(assuranceCase, SACMPackage.eINSTANCE.getAssuranceCase_Evidence());
				basePart.initEvidence(evidenceSettings);
			}
			// init filters
			
			
			
			if (isAccessible(SACMViewsRepository.AssuranceCase.Properties.argument)) {
				basePart.addFilterToArgument(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Argumentation); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for argument
				// End of user code
			}
			if (isAccessible(SACMViewsRepository.AssuranceCase.Properties.evidence)) {
				basePart.addFilterToEvidence(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EvidenceContainer); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for evidence
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
		if (editorKey == SACMViewsRepository.AssuranceCase.Properties.id) {
			return SACMPackage.eINSTANCE.getModelElement_Id();
		}
		if (editorKey == SACMViewsRepository.AssuranceCase.Properties.name) {
			return SACMPackage.eINSTANCE.getAssuranceCase_Name();
		}
		if (editorKey == SACMViewsRepository.AssuranceCase.Properties.gid) {
			return SACMPackage.eINSTANCE.getAssuranceCase_Gid();
		}
		if (editorKey == SACMViewsRepository.AssuranceCase.Properties.argument) {
			return SACMPackage.eINSTANCE.getAssuranceCase_Argument();
		}
		if (editorKey == SACMViewsRepository.AssuranceCase.Properties.evidence) {
			return SACMPackage.eINSTANCE.getAssuranceCase_Evidence();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AssuranceCase assuranceCase = (AssuranceCase)semanticObject;
		if (SACMViewsRepository.AssuranceCase.Properties.id == event.getAffectedEditor()) {
			assuranceCase.setId((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (SACMViewsRepository.AssuranceCase.Properties.name == event.getAffectedEditor()) {
			assuranceCase.setName((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (SACMViewsRepository.AssuranceCase.Properties.gid == event.getAffectedEditor()) {
			assuranceCase.setGid((java.lang.String)EEFConverterUtil.createFromString(SACMPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (SACMViewsRepository.AssuranceCase.Properties.argument == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, argumentSettings, editingContext.getAdapterFactory());
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
				argumentSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				argumentSettings.move(event.getNewIndex(), (Argumentation) event.getNewValue());
			}
		}
		if (SACMViewsRepository.AssuranceCase.Properties.evidence == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, evidenceSettings, editingContext.getAdapterFactory());
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
				evidenceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				evidenceSettings.move(event.getNewIndex(), (EvidenceContainer) event.getNewValue());
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
			AssuranceCasePropertiesEditionPart basePart = (AssuranceCasePropertiesEditionPart)editingPart;
			if (SACMPackage.eINSTANCE.getModelElement_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SACMViewsRepository.AssuranceCase.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (SACMPackage.eINSTANCE.getAssuranceCase_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SACMViewsRepository.AssuranceCase.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SACMPackage.eINSTANCE.getAssuranceCase_Gid().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SACMViewsRepository.AssuranceCase.Properties.gid)) {
				if (msg.getNewValue() != null) {
					basePart.setGid(EcoreUtil.convertToString(SACMPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setGid("");
				}
			}
			if (SACMPackage.eINSTANCE.getAssuranceCase_Argument().equals(msg.getFeature()) && isAccessible(SACMViewsRepository.AssuranceCase.Properties.argument))
				basePart.updateArgument();
			if (SACMPackage.eINSTANCE.getAssuranceCase_Evidence().equals(msg.getFeature()) && isAccessible(SACMViewsRepository.AssuranceCase.Properties.evidence))
				basePart.updateEvidence();
			
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
			SACMPackage.eINSTANCE.getAssuranceCase_Name(),
			SACMPackage.eINSTANCE.getAssuranceCase_Gid(),
			SACMPackage.eINSTANCE.getAssuranceCase_Argument(),
			SACMPackage.eINSTANCE.getAssuranceCase_Evidence()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SACMViewsRepository.AssuranceCase.Properties.id || key == SACMViewsRepository.AssuranceCase.Properties.name || key == SACMViewsRepository.AssuranceCase.Properties.gid;
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
				if (SACMViewsRepository.AssuranceCase.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SACMPackage.eINSTANCE.getModelElement_Id().getEAttributeType(), newValue);
				}
				if (SACMViewsRepository.AssuranceCase.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SACMPackage.eINSTANCE.getAssuranceCase_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SACMPackage.eINSTANCE.getAssuranceCase_Name().getEAttributeType(), newValue);
				}
				if (SACMViewsRepository.AssuranceCase.Properties.gid == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SACMPackage.eINSTANCE.getAssuranceCase_Gid().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SACMPackage.eINSTANCE.getAssuranceCase_Gid().getEAttributeType(), newValue);
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
