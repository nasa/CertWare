/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.components;

// Start of user code for imports
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.eur.Argument;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Justification;
import net.certware.argument.eur.Solution;
import net.certware.argument.eur.Strategy;
import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.parts.StrategyPropertiesEditionPart;

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
public class StrategyPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for argument ReferencesTable
	 */
	protected ReferencesTableSettings argumentSettings;
	
	/**
	 * Settings for justification ReferencesTable
	 */
	protected ReferencesTableSettings justificationSettings;
	
	/**
	 * Settings for solution ReferencesTable
	 */
	private	ReferencesTableSettings solutionSettings;
	
	/**
	 * Settings for criteria ReferencesTable
	 */
	private	ReferencesTableSettings criteriaSettings;
	
	/**
	 * Settings for assumption ReferencesTable
	 */
	protected ReferencesTableSettings assumptionSettings;
	
	/**
	 * Settings for contexts ReferencesTable
	 */
	protected ReferencesTableSettings contextsSettings;
	
	/**
	 * Settings for strategies ReferencesTable
	 */
	protected ReferencesTableSettings strategiesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public StrategyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject strategy, String editing_mode) {
		super(editingContext, strategy, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EurViewsRepository.class;
		partKey = EurViewsRepository.Strategy.class;
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
			final Strategy strategy = (Strategy)elt;
			final StrategyPropertiesEditionPart basePart = (StrategyPropertiesEditionPart)editingPart;
			// init values
			if (strategy.getIdentifier() != null && isAccessible(EurViewsRepository.Strategy.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), strategy.getIdentifier()));
			
			if (strategy.getDescription() != null && isAccessible(EurViewsRepository.Strategy.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), strategy.getDescription()));
			
			if (strategy.getContent() != null && isAccessible(EurViewsRepository.Strategy.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), strategy.getContent()));
			
			if (isAccessible(EurViewsRepository.Strategy.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(strategy, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(EurViewsRepository.Strategy.Properties.argument)) {
				argumentSettings = new ReferencesTableSettings(strategy, EurPackage.eINSTANCE.getStrategy_Argument());
				basePart.initArgument(argumentSettings);
			}
			if (isAccessible(EurViewsRepository.Strategy.Properties.justification)) {
				justificationSettings = new ReferencesTableSettings(strategy, EurPackage.eINSTANCE.getStrategy_Justification());
				basePart.initJustification(justificationSettings);
			}
			if (isAccessible(EurViewsRepository.Strategy.Properties.solution)) {
				solutionSettings = new ReferencesTableSettings(strategy, EurPackage.eINSTANCE.getStrategy_Solution());
				basePart.initSolution(solutionSettings);
			}
			if (isAccessible(EurViewsRepository.Strategy.Properties.criteria)) {
				criteriaSettings = new ReferencesTableSettings(strategy, EurPackage.eINSTANCE.getStrategy_Criteria());
				basePart.initCriteria(criteriaSettings);
			}
			if (isAccessible(EurViewsRepository.Strategy.Properties.assumption)) {
				assumptionSettings = new ReferencesTableSettings(strategy, EurPackage.eINSTANCE.getStrategy_Assumption());
				basePart.initAssumption(assumptionSettings);
			}
			if (isAccessible(EurViewsRepository.Strategy.Properties.contexts)) {
				contextsSettings = new ReferencesTableSettings(strategy, EurPackage.eINSTANCE.getStrategy_Contexts());
				basePart.initContexts(contextsSettings);
			}
			if (isAccessible(EurViewsRepository.Strategy.Properties.strategies)) {
				strategiesSettings = new ReferencesTableSettings(strategy, EurPackage.eINSTANCE.getStrategy_Strategies());
				basePart.initStrategies(strategiesSettings);
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
			
			basePart.addFilterToArgument(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Argument); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for argument
			
			// End of user code
			
			basePart.addFilterToJustification(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Justification); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for justification
			
			// End of user code
			
			basePart.addFilterToSolution(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSolutionTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSolution(new EObjectFilter(EurPackage.eINSTANCE.getSolution()));
			// Start of user code for additional businessfilters for solution
			
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
			
			basePart.addFilterToAssumption(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Assumption); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for assumption
			
			// End of user code
			
			basePart.addFilterToContexts(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Context); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for contexts
			// End of user code
			
			basePart.addFilterToStrategies(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Strategy); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for strategies
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
		if (editorKey == EurViewsRepository.Strategy.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.argument) {
			return EurPackage.eINSTANCE.getStrategy_Argument();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.justification) {
			return EurPackage.eINSTANCE.getStrategy_Justification();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.solution) {
			return EurPackage.eINSTANCE.getStrategy_Solution();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.criteria) {
			return EurPackage.eINSTANCE.getStrategy_Criteria();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.assumption) {
			return EurPackage.eINSTANCE.getStrategy_Assumption();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.contexts) {
			return EurPackage.eINSTANCE.getStrategy_Contexts();
		}
		if (editorKey == EurViewsRepository.Strategy.Properties.strategies) {
			return EurPackage.eINSTANCE.getStrategy_Strategies();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Strategy strategy = (Strategy)semanticObject;
		if (EurViewsRepository.Strategy.Properties.identifier == event.getAffectedEditor()) {
			strategy.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Strategy.Properties.description == event.getAffectedEditor()) {
			strategy.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Strategy.Properties.content == event.getAffectedEditor()) {
			strategy.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Strategy.Properties.isTagged == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Strategy.Properties.argument == event.getAffectedEditor()) {
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
				argumentSettings.move(event.getNewIndex(), (Argument) event.getNewValue());
			}
		}
		if (EurViewsRepository.Strategy.Properties.justification == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, justificationSettings, editingContext.getAdapterFactory());
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
				justificationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				justificationSettings.move(event.getNewIndex(), (Justification) event.getNewValue());
			}
		}
		if (EurViewsRepository.Strategy.Properties.solution == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Solution) {
					solutionSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				solutionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				solutionSettings.move(event.getNewIndex(), (Solution) event.getNewValue());
			}
		}
		if (EurViewsRepository.Strategy.Properties.criteria == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Strategy.Properties.assumption == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, assumptionSettings, editingContext.getAdapterFactory());
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
				assumptionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				assumptionSettings.move(event.getNewIndex(), (Assumption) event.getNewValue());
			}
		}
		if (EurViewsRepository.Strategy.Properties.contexts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, contextsSettings, editingContext.getAdapterFactory());
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
				contextsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				contextsSettings.move(event.getNewIndex(), (Context) event.getNewValue());
			}
		}
		if (EurViewsRepository.Strategy.Properties.strategies == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, strategiesSettings, editingContext.getAdapterFactory());
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
				strategiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				strategiesSettings.move(event.getNewIndex(), (Strategy) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			StrategyPropertiesEditionPart basePart = (StrategyPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Strategy.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Strategy.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Strategy.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Strategy.Properties.isTagged))
				basePart.updateIsTagged();
			if (EurPackage.eINSTANCE.getStrategy_Argument().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Strategy.Properties.argument))
				basePart.updateArgument();
			if (EurPackage.eINSTANCE.getStrategy_Justification().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Strategy.Properties.justification))
				basePart.updateJustification();
			if (EurPackage.eINSTANCE.getStrategy_Solution().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Strategy.Properties.solution))
				basePart.updateSolution();
			if (EurPackage.eINSTANCE.getStrategy_Criteria().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Strategy.Properties.criteria))
				basePart.updateCriteria();
			if (EurPackage.eINSTANCE.getStrategy_Assumption().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Strategy.Properties.assumption))
				basePart.updateAssumption();
			if (EurPackage.eINSTANCE.getStrategy_Contexts().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Strategy.Properties.contexts))
				basePart.updateContexts();
			if (EurPackage.eINSTANCE.getStrategy_Strategies().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Strategy.Properties.strategies))
				basePart.updateStrategies();
			
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
				if (EurViewsRepository.Strategy.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Strategy.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Strategy.Properties.content == event.getAffectedEditor()) {
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
