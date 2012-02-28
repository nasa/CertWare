/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.components;

// Start of user code for imports
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.parts.CriteriaPropertiesEditionPart;
import net.certware.argument.eur.parts.EurViewsRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
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
public class CriteriaPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for context ReferencesTable
	 */
	private	ReferencesTableSettings contextSettings;
	
	/**
	 * Settings for assumption ReferencesTable
	 */
	private	ReferencesTableSettings assumptionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CriteriaPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject criteria, String editing_mode) {
		super(editingContext, criteria, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EurViewsRepository.class;
		partKey = EurViewsRepository.Criteria.class;
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
			final Criteria criteria = (Criteria)elt;
			final CriteriaPropertiesEditionPart basePart = (CriteriaPropertiesEditionPart)editingPart;
			// init values
			if (criteria.getIdentifier() != null && isAccessible(EurViewsRepository.Criteria.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), criteria.getIdentifier()));
			
			if (criteria.getDescription() != null && isAccessible(EurViewsRepository.Criteria.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), criteria.getDescription()));
			
			if (criteria.getContent() != null && isAccessible(EurViewsRepository.Criteria.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), criteria.getContent()));
			
			if (isAccessible(EurViewsRepository.Criteria.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(criteria, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(EurViewsRepository.Criteria.Properties.context)) {
				contextSettings = new ReferencesTableSettings(criteria, EurPackage.eINSTANCE.getCriteria_Context());
				basePart.initContext(contextSettings);
			}
			if (isAccessible(EurViewsRepository.Criteria.Properties.assumption)) {
				assumptionSettings = new ReferencesTableSettings(criteria, EurPackage.eINSTANCE.getCriteria_Assumption());
				basePart.initAssumption(assumptionSettings);
			}
			// init filters
			
			
			
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
			
			basePart.addFilterToContext(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInContextTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToContext(new EObjectFilter(EurPackage.eINSTANCE.getContext()));
			// Start of user code for additional businessfilters for context
			
			// End of user code
			
			basePart.addFilterToAssumption(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInAssumptionTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToAssumption(new EObjectFilter(EurPackage.eINSTANCE.getAssumption()));
			// Start of user code for additional businessfilters for assumption
			
			// End of user code
			
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
		if (editorKey == EurViewsRepository.Criteria.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == EurViewsRepository.Criteria.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == EurViewsRepository.Criteria.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == EurViewsRepository.Criteria.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == EurViewsRepository.Criteria.Properties.context) {
			return EurPackage.eINSTANCE.getCriteria_Context();
		}
		if (editorKey == EurViewsRepository.Criteria.Properties.assumption) {
			return EurPackage.eINSTANCE.getCriteria_Assumption();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Criteria criteria = (Criteria)semanticObject;
		if (EurViewsRepository.Criteria.Properties.identifier == event.getAffectedEditor()) {
			criteria.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Criteria.Properties.description == event.getAffectedEditor()) {
			criteria.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Criteria.Properties.content == event.getAffectedEditor()) {
			criteria.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Criteria.Properties.isTagged == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Criteria.Properties.context == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Context) {
					contextSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				contextSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				contextSettings.move(event.getNewIndex(), (Context) event.getNewValue());
			}
		}
		if (EurViewsRepository.Criteria.Properties.assumption == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Assumption) {
					assumptionSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				assumptionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				assumptionSettings.move(event.getNewIndex(), (Assumption) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CriteriaPropertiesEditionPart basePart = (CriteriaPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Criteria.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Criteria.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Criteria.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Criteria.Properties.isTagged))
				basePart.updateIsTagged();
			if (EurPackage.eINSTANCE.getCriteria_Context().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Criteria.Properties.context))
				basePart.updateContext();
			if (EurPackage.eINSTANCE.getCriteria_Assumption().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Criteria.Properties.assumption))
				basePart.updateAssumption();
			
		}
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
				if (EurViewsRepository.Criteria.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Criteria.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Criteria.Properties.content == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), (String)newValue);
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
