/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.components;

// Start of user code for imports
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Solution;
import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.parts.SolutionPropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * 
 * 
 */
public class SolutionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for target ReferencesTable
	 */
	private	ReferencesTableSettings targetSettings;
	
	/**
	 * Settings for source ReferencesTable
	 */
	private	ReferencesTableSettings sourceSettings;
	
	/**
	 * Settings for context ReferencesTable
	 */
	private	ReferencesTableSettings contextSettings;
	
	/**
	 * Settings for evidence EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings evidenceSettings;
	
	/**
	 * Settings for criteria ReferencesTable
	 */
	private	ReferencesTableSettings criteriaSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SolutionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject solution, String editing_mode) {
		super(editingContext, solution, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EurViewsRepository.class;
		partKey = EurViewsRepository.Solution.class;
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
			final Solution solution = (Solution)elt;
			final SolutionPropertiesEditionPart basePart = (SolutionPropertiesEditionPart)editingPart;
			// init values
			if (solution.getIdentifier() != null && isAccessible(EurViewsRepository.Solution.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), solution.getIdentifier()));
			
			if (solution.getDescription() != null && isAccessible(EurViewsRepository.Solution.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), solution.getDescription()));
			
			if (solution.getContent() != null && isAccessible(EurViewsRepository.Solution.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), solution.getContent()));
			
			if (isAccessible(EurViewsRepository.Solution.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(solution, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(EurViewsRepository.Solution.Properties.target)) {
				targetSettings = new ReferencesTableSettings(solution, ArmPackage.eINSTANCE.getArgumentLink_Target());
				basePart.initTarget(targetSettings);
			}
			if (isAccessible(EurViewsRepository.Solution.Properties.source)) {
				sourceSettings = new ReferencesTableSettings(solution, ArmPackage.eINSTANCE.getArgumentLink_Source());
				basePart.initSource(sourceSettings);
			}
			if (isAccessible(EurViewsRepository.Solution.Properties.context)) {
				contextSettings = new ReferencesTableSettings(solution, EurPackage.eINSTANCE.getSolution_Context());
				basePart.initContext(contextSettings);
			}
			if (isAccessible(EurViewsRepository.Solution.Properties.evidence)) {
				// init part
				evidenceSettings = new EObjectFlatComboSettings(solution, EurPackage.eINSTANCE.getSolution_Evidence());
				basePart.initEvidence(evidenceSettings);
				// set the button mode
				basePart.setEvidenceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(EurViewsRepository.Solution.Properties.criteria)) {
				criteriaSettings = new ReferencesTableSettings(solution, EurPackage.eINSTANCE.getSolution_Criteria());
				basePart.initCriteria(criteriaSettings);
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
			
			basePart.addFilterToTarget(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInTargetTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToTarget(new EObjectFilter(ArmPackage.eINSTANCE.getModelElement()));
			// Start of user code for additional businessfilters for target
			
			// End of user code
			
			basePart.addFilterToSource(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSourceTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSource(new EObjectFilter(ArmPackage.eINSTANCE.getModelElement()));
			// Start of user code for additional businessfilters for source
			
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
			
			basePart.addFilterToEvidence(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof InformationElement);
				}
			
			});
			// Start of user code for additional businessfilters for evidence
			
			// End of user code
			
			basePart.addFilterToCriteria(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInCriteriaTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToCriteria(new EObjectFilter(EurPackage.eINSTANCE.getCriteria()));
			// Start of user code for additional businessfilters for criteria
			
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
		if (editorKey == EurViewsRepository.Solution.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.target) {
			return ArmPackage.eINSTANCE.getArgumentLink_Target();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.source) {
			return ArmPackage.eINSTANCE.getArgumentLink_Source();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.context) {
			return EurPackage.eINSTANCE.getSolution_Context();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.evidence) {
			return EurPackage.eINSTANCE.getSolution_Evidence();
		}
		if (editorKey == EurViewsRepository.Solution.Properties.criteria) {
			return EurPackage.eINSTANCE.getSolution_Criteria();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Solution solution = (Solution)semanticObject;
		if (EurViewsRepository.Solution.Properties.identifier == event.getAffectedEditor()) {
			solution.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Solution.Properties.description == event.getAffectedEditor()) {
			solution.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Solution.Properties.content == event.getAffectedEditor()) {
			solution.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Solution.Properties.isTagged == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Solution.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ModelElement) {
					targetSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				targetSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				targetSettings.move(event.getNewIndex(), (ModelElement) event.getNewValue());
			}
		}
		if (EurViewsRepository.Solution.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ModelElement) {
					sourceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sourceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sourceSettings.move(event.getNewIndex(), (ModelElement) event.getNewValue());
			}
		}
		if (EurViewsRepository.Solution.Properties.context == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Solution.Properties.evidence == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				evidenceSettings.setToReference((InformationElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				InformationElement eObject = ArmFactory.eINSTANCE.createInformationElement();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				evidenceSettings.setToReference(eObject);
			}
		}
		if (EurViewsRepository.Solution.Properties.criteria == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Criteria) {
					criteriaSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				criteriaSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				criteriaSettings.move(event.getNewIndex(), (Criteria) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			SolutionPropertiesEditionPart basePart = (SolutionPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Solution.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Solution.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Solution.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Solution.Properties.isTagged))
				basePart.updateIsTagged();
			if (ArmPackage.eINSTANCE.getArgumentLink_Target().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Solution.Properties.target))
				basePart.updateTarget();
			if (ArmPackage.eINSTANCE.getArgumentLink_Source().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Solution.Properties.source))
				basePart.updateSource();
			if (EurPackage.eINSTANCE.getSolution_Context().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Solution.Properties.context))
				basePart.updateContext();
			if (EurPackage.eINSTANCE.getSolution_Evidence().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Solution.Properties.evidence))
				basePart.setEvidence((EObject)msg.getNewValue());
			if (EurPackage.eINSTANCE.getSolution_Criteria().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Solution.Properties.criteria))
				basePart.updateCriteria();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EurViewsRepository.Solution.Properties.evidence;
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
				if (EurViewsRepository.Solution.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Solution.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Solution.Properties.content == event.getAffectedEditor()) {
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
