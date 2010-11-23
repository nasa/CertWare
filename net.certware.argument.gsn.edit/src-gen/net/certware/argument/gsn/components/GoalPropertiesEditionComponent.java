/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
	

// End of user code

/**
 * 
 * 
 */
public class GoalPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Goal goal;

	/**
	 * The Base part
	 * 
	 */
	protected GoalPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public GoalPropertiesEditionComponent(EObject goal, String editing_mode) {
		if (goal instanceof Goal) {
			this.goal = (Goal)goal;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.goal.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 * 
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 * 
			 */
			public void notifyChanged(final Notification msg) {
				if (basePart == null)
					GoalPropertiesEditionComponent.this.dispose();
				else {
					Runnable updateRunnable = new Runnable() {
						public void run() {
							runUpdateRunnable(msg);
						}
					};
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().syncExec(updateRunnable);
					} else {
						updateRunnable.run();
					}
				}
			}

		};
	}

	/**
	 * Used to update the views
	 * 
	 */
	protected void runUpdateRunnable(final Notification msg) {
		if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setIdentifier("");
			}
		}
		if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setDescription("");
			}
		}
		if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
			} else {
				basePart.setContent("");
			}
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == ArmPackage.eINSTANCE.getModelElement_IsTagged())) {
			basePart.updateIsTagged(goal);
		}
		if (ArmPackage.eINSTANCE.getClaim_Assumed().equals(msg.getFeature()) && basePart != null)
			basePart.setAssumed((Boolean)msg.getNewValue());

		if (ArmPackage.eINSTANCE.getClaim_ToBeSupported().equals(msg.getFeature()) && basePart != null)
			basePart.setToBeSupported((Boolean)msg.getNewValue());

		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getGoal_SubGoals())) {
			basePart.updateSubGoals(goal);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getGoal_Strategies())) {
			basePart.updateStrategies(goal);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getGoal_GoalContexts())) {
			basePart.updateGoalContexts(goal);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getGoal_Assumptions())) {
			basePart.updateAssumptions(goal);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getGoal_GoalSolutions())) {
			basePart.updateGoalSolutions(goal);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return GsnViewsRepository.Goal.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 * 
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *  (java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (goal != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(GsnViewsRepository.class);
				if (provider != null) {
					basePart = (GoalPropertiesEditionPart)provider.getPropertiesEditionPart(GsnViewsRepository.Goal.class, kind, this);
					addListener((IPropertiesEditionListener)basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == GsnViewsRepository.Goal.class)
			this.basePart = (GoalPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (basePart != null && key == GsnViewsRepository.Goal.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final Goal goal = (Goal)elt;
			// init values
			if (goal.getIdentifier() != null)
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), goal.getIdentifier()));

			if (goal.getDescription() != null)
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), goal.getDescription()));

			if (goal.getContent() != null)
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), goal.getContent()));

			basePart.initIsTagged(goal, null, ArmPackage.eINSTANCE.getModelElement_IsTagged());
			basePart.setAssumed(goal.isAssumed());

			basePart.setToBeSupported(goal.isToBeSupported());

			basePart.initSubGoals(goal, null, GsnPackage.eINSTANCE.getGoal_SubGoals());
			basePart.initStrategies(goal, null, GsnPackage.eINSTANCE.getGoal_Strategies());
			basePart.initGoalContexts(goal, null, GsnPackage.eINSTANCE.getGoal_GoalContexts());
			basePart.initAssumptions(goal, null, GsnPackage.eINSTANCE.getGoal_Assumptions());
			basePart.initGoalSolutions(goal, null, GsnPackage.eINSTANCE.getGoal_GoalSolutions());
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

		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}














	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 * 
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if ((goal != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, goal, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier())));
			cc.append(SetCommand.create(editingDomain, goal, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription())));
			cc.append(SetCommand.create(editingDomain, goal, ArmPackage.eINSTANCE.getModelElement_Content(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent())));
			List isTaggedToAddFromIsTagged = basePart.getIsTaggedToAdd();
			for (Iterator iter = isTaggedToAddFromIsTagged.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, goal, ArmPackage.eINSTANCE.getModelElement_IsTagged(), iter.next()));
			Map isTaggedToRefreshFromIsTagged = basePart.getIsTaggedToEdit();
			for (Iterator iter = isTaggedToRefreshFromIsTagged.keySet().iterator(); iter.hasNext();) {
				TaggedValue nextElement = (TaggedValue) iter.next();
				TaggedValue isTagged = (TaggedValue) isTaggedToRefreshFromIsTagged.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, isTagged.eGet(feature)));
					}
				}
			}
			List isTaggedToRemoveFromIsTagged = basePart.getIsTaggedToRemove();
			for (Iterator iter = isTaggedToRemoveFromIsTagged.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List isTaggedToMoveFromIsTagged = basePart.getIsTaggedToMove();
			for (Iterator iter = isTaggedToMoveFromIsTagged.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, goal, ArmPackage.eINSTANCE.getTaggedValue(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, goal, ArmPackage.eINSTANCE.getClaim_Assumed(), basePart.getAssumed()));

			cc.append(SetCommand.create(editingDomain, goal, ArmPackage.eINSTANCE.getClaim_ToBeSupported(), basePart.getToBeSupported()));

			List subGoalsToAddFromSubGoals = basePart.getSubGoalsToAdd();
			for (Iterator iter = subGoalsToAddFromSubGoals.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getGoal_SubGoals(), iter.next()));
			Map subGoalsToRefreshFromSubGoals = basePart.getSubGoalsToEdit();
			for (Iterator iter = subGoalsToRefreshFromSubGoals.keySet().iterator(); iter.hasNext();) {
				Goal nextElement = (Goal) iter.next();
				Goal subGoals = (Goal) subGoalsToRefreshFromSubGoals.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, subGoals.eGet(feature)));
					}
				}
			}
			List subGoalsToRemoveFromSubGoals = basePart.getSubGoalsToRemove();
			for (Iterator iter = subGoalsToRemoveFromSubGoals.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List subGoalsToMoveFromSubGoals = basePart.getSubGoalsToMove();
			for (Iterator iter = subGoalsToMoveFromSubGoals.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getGoal(), moveElement.getElement(), moveElement.getIndex()));
			}
			List strategiesToAddFromStrategies = basePart.getStrategiesToAdd();
			for (Iterator iter = strategiesToAddFromStrategies.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getGoal_Strategies(), iter.next()));
			Map strategiesToRefreshFromStrategies = basePart.getStrategiesToEdit();
			for (Iterator iter = strategiesToRefreshFromStrategies.keySet().iterator(); iter.hasNext();) {
				Strategy nextElement = (Strategy) iter.next();
				Strategy strategies = (Strategy) strategiesToRefreshFromStrategies.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, strategies.eGet(feature)));
					}
				}
			}
			List strategiesToRemoveFromStrategies = basePart.getStrategiesToRemove();
			for (Iterator iter = strategiesToRemoveFromStrategies.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List strategiesToMoveFromStrategies = basePart.getStrategiesToMove();
			for (Iterator iter = strategiesToMoveFromStrategies.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getStrategy(), moveElement.getElement(), moveElement.getIndex()));
			}
			List goalContextsToAddFromGoalContexts = basePart.getGoalContextsToAdd();
			for (Iterator iter = goalContextsToAddFromGoalContexts.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getGoal_GoalContexts(), iter.next()));
			Map goalContextsToRefreshFromGoalContexts = basePart.getGoalContextsToEdit();
			for (Iterator iter = goalContextsToRefreshFromGoalContexts.keySet().iterator(); iter.hasNext();) {
				Context nextElement = (Context) iter.next();
				Context goalContexts = (Context) goalContextsToRefreshFromGoalContexts.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, goalContexts.eGet(feature)));
					}
				}
			}
			List goalContextsToRemoveFromGoalContexts = basePart.getGoalContextsToRemove();
			for (Iterator iter = goalContextsToRemoveFromGoalContexts.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List goalContextsToMoveFromGoalContexts = basePart.getGoalContextsToMove();
			for (Iterator iter = goalContextsToMoveFromGoalContexts.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getContext(), moveElement.getElement(), moveElement.getIndex()));
			}
			List assumptionsToAddFromAssumptions = basePart.getAssumptionsToAdd();
			for (Iterator iter = assumptionsToAddFromAssumptions.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getGoal_Assumptions(), iter.next()));
			Map assumptionsToRefreshFromAssumptions = basePart.getAssumptionsToEdit();
			for (Iterator iter = assumptionsToRefreshFromAssumptions.keySet().iterator(); iter.hasNext();) {
				Assumption nextElement = (Assumption) iter.next();
				Assumption assumptions = (Assumption) assumptionsToRefreshFromAssumptions.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, assumptions.eGet(feature)));
					}
				}
			}
			List assumptionsToRemoveFromAssumptions = basePart.getAssumptionsToRemove();
			for (Iterator iter = assumptionsToRemoveFromAssumptions.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List assumptionsToMoveFromAssumptions = basePart.getAssumptionsToMove();
			for (Iterator iter = assumptionsToMoveFromAssumptions.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getAssumption(), moveElement.getElement(), moveElement.getIndex()));
			}
			List goalSolutionsToAddFromGoalSolutions = basePart.getGoalSolutionsToAdd();
			for (Iterator iter = goalSolutionsToAddFromGoalSolutions.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getGoal_GoalSolutions(), iter.next()));
			Map goalSolutionsToRefreshFromGoalSolutions = basePart.getGoalSolutionsToEdit();
			for (Iterator iter = goalSolutionsToRefreshFromGoalSolutions.keySet().iterator(); iter.hasNext();) {
				Solution nextElement = (Solution) iter.next();
				Solution goalSolutions = (Solution) goalSolutionsToRefreshFromGoalSolutions.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, goalSolutions.eGet(feature)));
					}
				}
			}
			List goalSolutionsToRemoveFromGoalSolutions = basePart.getGoalSolutionsToRemove();
			for (Iterator iter = goalSolutionsToRemoveFromGoalSolutions.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List goalSolutionsToMoveFromGoalSolutions = basePart.getGoalSolutionsToMove();
			for (Iterator iter = goalSolutionsToMoveFromGoalSolutions.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, goal, GsnPackage.eINSTANCE.getSolution(), moveElement.getElement(), moveElement.getIndex()));
			}

		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 * 
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof Goal) {
			Goal goalToUpdate = (Goal)source;
			goalToUpdate.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier()));

			goalToUpdate.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription()));

			goalToUpdate.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent()));

			goalToUpdate.getIsTagged().addAll(basePart.getIsTaggedToAdd());
			goalToUpdate.setAssumed(new Boolean(basePart.getAssumed()).booleanValue());

			goalToUpdate.setToBeSupported(new Boolean(basePart.getToBeSupported()).booleanValue());

			goalToUpdate.getSubGoals().addAll(basePart.getSubGoalsToAdd());
			goalToUpdate.getStrategies().addAll(basePart.getStrategiesToAdd());
			goalToUpdate.getGoalContexts().addAll(basePart.getGoalContextsToAdd());
			goalToUpdate.getAssumptions().addAll(basePart.getAssumptionsToAdd());
			goalToUpdate.getGoalSolutions().addAll(basePart.getGoalSolutionsToAdd());

			return goalToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode) && valueDiagnostic.getSeverity() == Diagnostic.OK) {
				CompoundCommand command = new CompoundCommand();
			if (GsnViewsRepository.Goal.identifier == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, goal, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (GsnViewsRepository.Goal.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, goal, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (GsnViewsRepository.Goal.content == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, goal, ArmPackage.eINSTANCE.getModelElement_Content(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (GsnViewsRepository.Goal.isTagged == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					TaggedValue oldValue = (TaggedValue)event.getOldValue();
					TaggedValue newValue = (TaggedValue)event.getNewValue();
					// TODO: Complete the goal update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, goal, ArmPackage.eINSTANCE.getModelElement_IsTagged(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, goal, ArmPackage.eINSTANCE.getTaggedValue(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Goal.assumed == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, goal, ArmPackage.eINSTANCE.getClaim_Assumed(), event.getNewValue()));

			if (GsnViewsRepository.Goal.toBeSupported == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, goal, ArmPackage.eINSTANCE.getClaim_ToBeSupported(), event.getNewValue()));

			if (GsnViewsRepository.Goal.subGoals == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Goal oldValue = (Goal)event.getOldValue();
					Goal newValue = (Goal)event.getNewValue();
					// TODO: Complete the goal update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getGoal_SubGoals(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getGoal(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Goal.strategies == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Strategy oldValue = (Strategy)event.getOldValue();
					Strategy newValue = (Strategy)event.getNewValue();
					// TODO: Complete the goal update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getGoal_Strategies(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getStrategy(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Goal.goalContexts == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Context oldValue = (Context)event.getOldValue();
					Context newValue = (Context)event.getNewValue();
					// TODO: Complete the goal update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getGoal_GoalContexts(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getContext(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Goal.assumptions == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Assumption oldValue = (Assumption)event.getOldValue();
					Assumption newValue = (Assumption)event.getNewValue();
					// TODO: Complete the goal update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getGoal_Assumptions(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getAssumption(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Goal.goalSolutions == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Solution oldValue = (Solution)event.getOldValue();
					Solution newValue = (Solution)event.getNewValue();
					// TODO: Complete the goal update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getGoal_GoalSolutions(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, goal, GsnPackage.eINSTANCE.getSolution(), event.getNewValue(), event.getNewIndex()));
			}

				if (!command.isEmpty() && !command.canExecute()) {
					EEFRuntimePlugin.getDefault().logError("Cannot perform model change command.", null);
				} else {
					liveEditingDomain.getCommandStack().execute(command);
				}
			}
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, valueDiagnostic));
			else {
				Diagnostic validate = validate();
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, validate));
			}
			super.firePropertiesChanged(event);
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
			String newStringValue = event.getNewValue().toString();
			try {
				if (GsnViewsRepository.Goal.identifier == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.content == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.assumed == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Goal.toBeSupported == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_ToBeSupported().getEAttributeType(), newStringValue);
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

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 * 
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(goal);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(goal);
		// Start of user code for custom validation check
		
		// End of user code
		return validate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 * 
	 */
	public void dispose() {
		if (semanticAdapter != null)
			goal.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 * 
	 */
	public String getTabText(String p_key) {
		return basePart.getTitle();
	}
}
