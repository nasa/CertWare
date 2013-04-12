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
import net.certware.argument.eur.parts.ArgumentPropertiesEditionPart;
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
public class ArgumentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for strategy ReferencesTable
	 */
	protected ReferencesTableSettings strategySettings;
	
	/**
	 * Settings for assumption ReferencesTable
	 */
	private	ReferencesTableSettings assumptionSettings;
	
	/**
	 * Settings for context ReferencesTable
	 */
	private	ReferencesTableSettings contextSettings;
	
	/**
	 * Settings for solution ReferencesTable
	 */
	protected ReferencesTableSettings solutionSettings;
	
	/**
	 * Settings for argument ReferencesTable
	 */
	protected ReferencesTableSettings argumentSettings;
	
	/**
	 * Settings for criteria ReferencesTable
	 */
	private	ReferencesTableSettings criteriaSettings;
	
	/**
	 * Settings for justification ReferencesTable
	 */
	protected ReferencesTableSettings justificationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArgumentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject argument, String editing_mode) {
		super(editingContext, argument, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EurViewsRepository.class;
		partKey = EurViewsRepository.Argument.class;
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
			final Argument argument = (Argument)elt;
			final ArgumentPropertiesEditionPart basePart = (ArgumentPropertiesEditionPart)editingPart;
			// init values
			if (argument.getIdentifier() != null && isAccessible(EurViewsRepository.Argument.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argument.getIdentifier()));
			
			if (argument.getDescription() != null && isAccessible(EurViewsRepository.Argument.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argument.getDescription()));
			
			if (argument.getContent() != null && isAccessible(EurViewsRepository.Argument.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argument.getContent()));
			
			if (isAccessible(EurViewsRepository.Argument.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(argument, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.assumed)) {
				basePart.setAssumed(argument.isAssumed());
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.toBeSupported)) {
				basePart.setToBeSupported(argument.isToBeSupported());
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.strategy)) {
				strategySettings = new ReferencesTableSettings(argument, EurPackage.eINSTANCE.getArgument_Strategy());
				basePart.initStrategy(strategySettings);
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.assumption)) {
				assumptionSettings = new ReferencesTableSettings(argument, EurPackage.eINSTANCE.getArgument_Assumption());
				basePart.initAssumption(assumptionSettings);
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.context)) {
				contextSettings = new ReferencesTableSettings(argument, EurPackage.eINSTANCE.getArgument_Context());
				basePart.initContext(contextSettings);
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.solution)) {
				solutionSettings = new ReferencesTableSettings(argument, EurPackage.eINSTANCE.getArgument_Solution());
				basePart.initSolution(solutionSettings);
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.argument_)) {
				argumentSettings = new ReferencesTableSettings(argument, EurPackage.eINSTANCE.getArgument_Argument());
				basePart.initArgument(argumentSettings);
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.criteria)) {
				criteriaSettings = new ReferencesTableSettings(argument, EurPackage.eINSTANCE.getArgument_Criteria());
				basePart.initCriteria(criteriaSettings);
			}
			if (isAccessible(EurViewsRepository.Argument.Properties.justification)) {
				justificationSettings = new ReferencesTableSettings(argument, EurPackage.eINSTANCE.getArgument_Justification());
				basePart.initJustification(justificationSettings);
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
			
			
			
			basePart.addFilterToStrategy(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Strategy); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for strategy
			
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
			
			basePart.addFilterToSolution(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Solution); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for solution
			
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
		if (editorKey == EurViewsRepository.Argument.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.assumed) {
			return ArmPackage.eINSTANCE.getClaim_Assumed();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.toBeSupported) {
			return ArmPackage.eINSTANCE.getClaim_ToBeSupported();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.strategy) {
			return EurPackage.eINSTANCE.getArgument_Strategy();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.assumption) {
			return EurPackage.eINSTANCE.getArgument_Assumption();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.context) {
			return EurPackage.eINSTANCE.getArgument_Context();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.solution) {
			return EurPackage.eINSTANCE.getArgument_Solution();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.argument_) {
			return EurPackage.eINSTANCE.getArgument_Argument();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.criteria) {
			return EurPackage.eINSTANCE.getArgument_Criteria();
		}
		if (editorKey == EurViewsRepository.Argument.Properties.justification) {
			return EurPackage.eINSTANCE.getArgument_Justification();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Argument argument = (Argument)semanticObject;
		if (EurViewsRepository.Argument.Properties.identifier == event.getAffectedEditor()) {
			argument.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Argument.Properties.description == event.getAffectedEditor()) {
			argument.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Argument.Properties.content == event.getAffectedEditor()) {
			argument.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (EurViewsRepository.Argument.Properties.isTagged == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Argument.Properties.assumed == event.getAffectedEditor()) {
			argument.setAssumed((Boolean)event.getNewValue());
		}
		if (EurViewsRepository.Argument.Properties.toBeSupported == event.getAffectedEditor()) {
			argument.setToBeSupported((Boolean)event.getNewValue());
		}
		if (EurViewsRepository.Argument.Properties.strategy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, strategySettings, editingContext.getAdapterFactory());
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
				strategySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				strategySettings.move(event.getNewIndex(), (Strategy) event.getNewValue());
			}
		}
		if (EurViewsRepository.Argument.Properties.assumption == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Argument.Properties.context == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Argument.Properties.solution == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, solutionSettings, editingContext.getAdapterFactory());
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
				solutionSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				solutionSettings.move(event.getNewIndex(), (Solution) event.getNewValue());
			}
		}
		if (EurViewsRepository.Argument.Properties.argument_ == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Argument.Properties.criteria == event.getAffectedEditor()) {
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
		if (EurViewsRepository.Argument.Properties.justification == event.getAffectedEditor()) {
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
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ArgumentPropertiesEditionPart basePart = (ArgumentPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Argument.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Argument.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Argument.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Argument.Properties.isTagged))
				basePart.updateIsTagged();
			if (ArmPackage.eINSTANCE.getClaim_Assumed().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Argument.Properties.assumed))
				basePart.setAssumed((Boolean)msg.getNewValue());
			
			if (ArmPackage.eINSTANCE.getClaim_ToBeSupported().equals(msg.getFeature()) && basePart != null && isAccessible(EurViewsRepository.Argument.Properties.toBeSupported))
				basePart.setToBeSupported((Boolean)msg.getNewValue());
			
			if (EurPackage.eINSTANCE.getArgument_Strategy().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Argument.Properties.strategy))
				basePart.updateStrategy();
			if (EurPackage.eINSTANCE.getArgument_Assumption().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Argument.Properties.assumption))
				basePart.updateAssumption();
			if (EurPackage.eINSTANCE.getArgument_Context().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Argument.Properties.context))
				basePart.updateContext();
			if (EurPackage.eINSTANCE.getArgument_Solution().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Argument.Properties.solution))
				basePart.updateSolution();
			if (EurPackage.eINSTANCE.getArgument_Argument().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Argument.Properties.argument_))
				basePart.updateArgument();
			if (EurPackage.eINSTANCE.getArgument_Criteria().equals(msg.getFeature())  && isAccessible(EurViewsRepository.Argument.Properties.criteria))
				basePart.updateCriteria();
			if (EurPackage.eINSTANCE.getArgument_Justification().equals(msg.getFeature()) && isAccessible(EurViewsRepository.Argument.Properties.justification))
				basePart.updateJustification();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == EurViewsRepository.Argument.Properties.strategy)
			return "Strategies for fulfilling the argument"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.Properties.assumption)
			return "Assertion relied upon by the element"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.Properties.context)
			return "Inputs or background information"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.Properties.solution)
			return "Evidence for satisfaction of goals"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.Properties.argument_)
			return "A requirement or target to be met or shown to be true"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.Properties.criteria)
			return "Means by which satisfaction of element can be assessed or checked"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.Properties.justification)
			return "Rationale for the argument"; //$NON-NLS-1$
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
				if (EurViewsRepository.Argument.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.Properties.content == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.Properties.assumed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.Properties.toBeSupported == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_ToBeSupported().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getClaim_ToBeSupported().getEAttributeType(), newValue);
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
