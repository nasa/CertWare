/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.components;

// Start of user code for imports
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.parts.GoalPropertiesEditionPart;
import net.certware.argument.gsn.parts.GsnViewsRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
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
public class GoalPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for subGoals ReferencesTable
	 */
	protected ReferencesTableSettings subGoalsSettings;
	
	/**
	 * Settings for strategies ReferencesTable
	 */
	protected ReferencesTableSettings strategiesSettings;
	
	/**
	 * Settings for goalContexts ReferencesTable
	 */
	protected ReferencesTableSettings goalContextsSettings;
	
	/**
	 * Settings for assumptions ReferencesTable
	 */
	protected ReferencesTableSettings assumptionsSettings;
	
	/**
	 * Settings for goalSolutions ReferencesTable
	 */
	protected ReferencesTableSettings goalSolutionsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public GoalPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject goal, String editing_mode) {
		super(editingContext, goal, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = GsnViewsRepository.class;
		partKey = GsnViewsRepository.Goal.class;
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
			final Goal goal = (Goal)elt;
			final GoalPropertiesEditionPart basePart = (GoalPropertiesEditionPart)editingPart;
			// init values
			if (goal.getIdentifier() != null && isAccessible(GsnViewsRepository.Goal.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), goal.getIdentifier()));
			
			if (goal.getDescription() != null && isAccessible(GsnViewsRepository.Goal.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), goal.getDescription()));
			
			if (goal.getContent() != null && isAccessible(GsnViewsRepository.Goal.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), goal.getContent()));
			
			if (isAccessible(GsnViewsRepository.Goal.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(goal, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(GsnViewsRepository.Goal.Properties.assumed)) {
				basePart.setAssumed(goal.isAssumed());
			}
			if (isAccessible(GsnViewsRepository.Goal.Properties.toBeSupported)) {
				basePart.setToBeSupported(goal.isToBeSupported());
			}
			if (isAccessible(GsnViewsRepository.Goal.Properties.subGoals)) {
				subGoalsSettings = new ReferencesTableSettings(goal, GsnPackage.eINSTANCE.getGoal_SubGoals());
				basePart.initSubGoals(subGoalsSettings);
			}
			if (isAccessible(GsnViewsRepository.Goal.Properties.strategies)) {
				strategiesSettings = new ReferencesTableSettings(goal, GsnPackage.eINSTANCE.getGoal_Strategies());
				basePart.initStrategies(strategiesSettings);
			}
			if (isAccessible(GsnViewsRepository.Goal.Properties.goalContexts)) {
				goalContextsSettings = new ReferencesTableSettings(goal, GsnPackage.eINSTANCE.getGoal_GoalContexts());
				basePart.initGoalContexts(goalContextsSettings);
			}
			if (isAccessible(GsnViewsRepository.Goal.Properties.assumptions)) {
				assumptionsSettings = new ReferencesTableSettings(goal, GsnPackage.eINSTANCE.getGoal_Assumptions());
				basePart.initAssumptions(assumptionsSettings);
			}
			if (isAccessible(GsnViewsRepository.Goal.Properties.goalSolutions)) {
				goalSolutionsSettings = new ReferencesTableSettings(goal, GsnPackage.eINSTANCE.getGoal_GoalSolutions());
				basePart.initGoalSolutions(goalSolutionsSettings);
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
			
			
			
			basePart.addFilterToSubGoals(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Goal); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for subGoals
			
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
			
			basePart.addFilterToGoalContexts(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Context); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for goalContexts
			
			// End of user code
			
			basePart.addFilterToAssumptions(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Assumption); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for assumptions
			
			// End of user code
			
			basePart.addFilterToGoalSolutions(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Solution); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for goalSolutions
			
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
		if (editorKey == GsnViewsRepository.Goal.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.assumed) {
			return ArmPackage.eINSTANCE.getClaim_Assumed();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.toBeSupported) {
			return ArmPackage.eINSTANCE.getClaim_ToBeSupported();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.subGoals) {
			return GsnPackage.eINSTANCE.getGoal_SubGoals();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.strategies) {
			return GsnPackage.eINSTANCE.getGoal_Strategies();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.goalContexts) {
			return GsnPackage.eINSTANCE.getGoal_GoalContexts();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.assumptions) {
			return GsnPackage.eINSTANCE.getGoal_Assumptions();
		}
		if (editorKey == GsnViewsRepository.Goal.Properties.goalSolutions) {
			return GsnPackage.eINSTANCE.getGoal_GoalSolutions();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Goal goal = (Goal)semanticObject;
		if (GsnViewsRepository.Goal.Properties.identifier == event.getAffectedEditor()) {
			goal.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (GsnViewsRepository.Goal.Properties.description == event.getAffectedEditor()) {
			goal.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (GsnViewsRepository.Goal.Properties.content == event.getAffectedEditor()) {
			goal.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (GsnViewsRepository.Goal.Properties.isTagged == event.getAffectedEditor()) {
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
		if (GsnViewsRepository.Goal.Properties.assumed == event.getAffectedEditor()) {
			goal.setAssumed((Boolean)event.getNewValue());
		}
		if (GsnViewsRepository.Goal.Properties.toBeSupported == event.getAffectedEditor()) {
			goal.setToBeSupported((Boolean)event.getNewValue());
		}
		if (GsnViewsRepository.Goal.Properties.subGoals == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, subGoalsSettings, editingContext.getAdapterFactory());
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
				subGoalsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subGoalsSettings.move(event.getNewIndex(), (Goal) event.getNewValue());
			}
		}
		if (GsnViewsRepository.Goal.Properties.strategies == event.getAffectedEditor()) {
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
		if (GsnViewsRepository.Goal.Properties.goalContexts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, goalContextsSettings, editingContext.getAdapterFactory());
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
				goalContextsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				goalContextsSettings.move(event.getNewIndex(), (Context) event.getNewValue());
			}
		}
		if (GsnViewsRepository.Goal.Properties.assumptions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, assumptionsSettings, editingContext.getAdapterFactory());
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
				assumptionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				assumptionsSettings.move(event.getNewIndex(), (Assumption) event.getNewValue());
			}
		}
		if (GsnViewsRepository.Goal.Properties.goalSolutions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, goalSolutionsSettings, editingContext.getAdapterFactory());
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
				goalSolutionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				goalSolutionsSettings.move(event.getNewIndex(), (Solution) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			GoalPropertiesEditionPart basePart = (GoalPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(GsnViewsRepository.Goal.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(GsnViewsRepository.Goal.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(GsnViewsRepository.Goal.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(GsnViewsRepository.Goal.Properties.isTagged))
				basePart.updateIsTagged();
			if (ArmPackage.eINSTANCE.getClaim_Assumed().equals(msg.getFeature()) && basePart != null && isAccessible(GsnViewsRepository.Goal.Properties.assumed))
				basePart.setAssumed((Boolean)msg.getNewValue());
			
			if (ArmPackage.eINSTANCE.getClaim_ToBeSupported().equals(msg.getFeature()) && basePart != null && isAccessible(GsnViewsRepository.Goal.Properties.toBeSupported))
				basePart.setToBeSupported((Boolean)msg.getNewValue());
			
			if (GsnPackage.eINSTANCE.getGoal_SubGoals().equals(msg.getFeature()) && isAccessible(GsnViewsRepository.Goal.Properties.subGoals))
				basePart.updateSubGoals();
			if (GsnPackage.eINSTANCE.getGoal_Strategies().equals(msg.getFeature()) && isAccessible(GsnViewsRepository.Goal.Properties.strategies))
				basePart.updateStrategies();
			if (GsnPackage.eINSTANCE.getGoal_GoalContexts().equals(msg.getFeature()) && isAccessible(GsnViewsRepository.Goal.Properties.goalContexts))
				basePart.updateGoalContexts();
			if (GsnPackage.eINSTANCE.getGoal_Assumptions().equals(msg.getFeature()) && isAccessible(GsnViewsRepository.Goal.Properties.assumptions))
				basePart.updateAssumptions();
			if (GsnPackage.eINSTANCE.getGoal_GoalSolutions().equals(msg.getFeature()) && isAccessible(GsnViewsRepository.Goal.Properties.goalSolutions))
				basePart.updateGoalSolutions();
			
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
				if (GsnViewsRepository.Goal.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.Properties.content == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.Properties.assumed == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.Properties.toBeSupported == event.getAffectedEditor()) {
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
