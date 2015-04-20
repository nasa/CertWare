/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.components;

// Start of user code for imports
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;

import net.certware.argument.cae.Assumption;

import net.certware.argument.cae.parts.AssumptionPropertiesEditionPart;
import net.certware.argument.cae.parts.CaeViewsRepository;

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
 * 
 * 
 */
public class AssumptionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AssumptionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assumption, String editing_mode) {
		super(editingContext, assumption, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CaeViewsRepository.class;
		partKey = CaeViewsRepository.Assumption.class;
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
			
			final Assumption assumption = (Assumption)elt;
			final AssumptionPropertiesEditionPart basePart = (AssumptionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CaeViewsRepository.Assumption.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.Literals.STRING, assumption.getIdentifier()));
			
			if (isAccessible(CaeViewsRepository.Assumption.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.Literals.STRING, assumption.getDescription()));
			
			if (isAccessible(CaeViewsRepository.Assumption.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.Literals.STRING, assumption.getContent()));
			
			if (isAccessible(CaeViewsRepository.Assumption.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(assumption, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			// init filters
			
			
			
			if (isAccessible(CaeViewsRepository.Assumption.Properties.isTagged)) {
				basePart.addFilterToIsTagged(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TaggedValue); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for isTagged
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
		if (editorKey == CaeViewsRepository.Assumption.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == CaeViewsRepository.Assumption.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == CaeViewsRepository.Assumption.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == CaeViewsRepository.Assumption.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Assumption assumption = (Assumption)semanticObject;
		if (CaeViewsRepository.Assumption.Properties.identifier == event.getAffectedEditor()) {
			assumption.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (CaeViewsRepository.Assumption.Properties.description == event.getAffectedEditor()) {
			assumption.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (CaeViewsRepository.Assumption.Properties.content == event.getAffectedEditor()) {
			assumption.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.Literals.STRING, (String)event.getNewValue()));
		}
		if (CaeViewsRepository.Assumption.Properties.isTagged == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, isTaggedSettings, editingContext.getAdapterFactory());
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
				isTaggedSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isTaggedSettings.move(event.getNewIndex(), (TaggedValue) event.getNewValue());
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
			AssumptionPropertiesEditionPart basePart = (AssumptionPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CaeViewsRepository.Assumption.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CaeViewsRepository.Assumption.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(CaeViewsRepository.Assumption.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.Literals.STRING, msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(CaeViewsRepository.Assumption.Properties.isTagged))
				basePart.updateIsTagged();
			
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
			ArmPackage.eINSTANCE.getModelElement_Identifier(),
			ArmPackage.eINSTANCE.getModelElement_Description(),
			ArmPackage.eINSTANCE.getModelElement_Content(),
			ArmPackage.eINSTANCE.getModelElement_IsTagged()		);
		return new NotificationFilter[] {filter,};
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
				if (CaeViewsRepository.Assumption.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (CaeViewsRepository.Assumption.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (CaeViewsRepository.Assumption.Properties.content == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
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
