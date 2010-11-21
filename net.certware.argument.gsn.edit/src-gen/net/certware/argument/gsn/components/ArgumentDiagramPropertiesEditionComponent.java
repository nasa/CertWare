/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.gsn.ArgumentDiagram;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart;
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
import org.eclipse.emf.ecore.EcorePackage;
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
public class ArgumentDiagramPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private ArgumentDiagram argumentDiagram;

	/**
	 * The Base part
	 * 
	 */
	protected ArgumentDiagramPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public ArgumentDiagramPropertiesEditionComponent(EObject argumentDiagram, String editing_mode) {
		if (argumentDiagram instanceof ArgumentDiagram) {
			this.argumentDiagram = (ArgumentDiagram)argumentDiagram;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.argumentDiagram.eAdapters().add(semanticAdapter);
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
					ArgumentDiagramPropertiesEditionComponent.this.dispose();
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
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getArgumentDiagram_Goals())) {
			basePart.updateGoals(argumentDiagram);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getArgumentDiagram_Strategies())) {
			basePart.updateStrategies(argumentDiagram);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getArgumentDiagram_Assumptions())) {
			basePart.updateAssumptions(argumentDiagram);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getArgumentDiagram_Solutions())) {
			basePart.updateSolutions(argumentDiagram);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getArgumentDiagram_Contexts())) {
			basePart.updateContexts(argumentDiagram);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getArgumentDiagram_Justifications())) {
			basePart.updateJustifications(argumentDiagram);
		}
		if (GsnPackage.eINSTANCE.getArgumentDiagram_Version().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setVersion(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setVersion("");
			}
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
			return GsnViewsRepository.ArgumentDiagram.class;
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
		if (argumentDiagram != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(GsnViewsRepository.class);
				if (provider != null) {
					basePart = (ArgumentDiagramPropertiesEditionPart)provider.getPropertiesEditionPart(GsnViewsRepository.ArgumentDiagram.class, kind, this);
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
		if (key == GsnViewsRepository.ArgumentDiagram.class)
			this.basePart = (ArgumentDiagramPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == GsnViewsRepository.ArgumentDiagram.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final ArgumentDiagram argumentDiagram = (ArgumentDiagram)elt;
			// init values
			basePart.initGoals(argumentDiagram, null, GsnPackage.eINSTANCE.getArgumentDiagram_Goals());
			basePart.initStrategies(argumentDiagram, null, GsnPackage.eINSTANCE.getArgumentDiagram_Strategies());
			basePart.initAssumptions(argumentDiagram, null, GsnPackage.eINSTANCE.getArgumentDiagram_Assumptions());
			basePart.initSolutions(argumentDiagram, null, GsnPackage.eINSTANCE.getArgumentDiagram_Solutions());
			basePart.initContexts(argumentDiagram, null, GsnPackage.eINSTANCE.getArgumentDiagram_Contexts());
			basePart.initJustifications(argumentDiagram, null, GsnPackage.eINSTANCE.getArgumentDiagram_Justifications());
			if (argumentDiagram.getVersion() != null)
				basePart.setVersion(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), argumentDiagram.getVersion()));

			// init filters
			basePart.addFilterToGoals(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Goal); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for goals
			
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

			basePart.addFilterToSolutions(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Solution); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for solutions
			
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

			basePart.addFilterToJustifications(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Justification); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for justifications
			
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
		if ((argumentDiagram != null) && (basePart != null)) { 
			List goalsToAddFromGoals = basePart.getGoalsToAdd();
			for (Iterator iter = goalsToAddFromGoals.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Goals(), iter.next()));
			Map goalsToRefreshFromGoals = basePart.getGoalsToEdit();
			for (Iterator iter = goalsToRefreshFromGoals.keySet().iterator(); iter.hasNext();) {
				Goal nextElement = (Goal) iter.next();
				Goal goals = (Goal) goalsToRefreshFromGoals.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, goals.eGet(feature)));
					}
				}
			}
			List goalsToRemoveFromGoals = basePart.getGoalsToRemove();
			for (Iterator iter = goalsToRemoveFromGoals.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List goalsToMoveFromGoals = basePart.getGoalsToMove();
			for (Iterator iter = goalsToMoveFromGoals.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getGoal(), moveElement.getElement(), moveElement.getIndex()));
			}
			List strategiesToAddFromStrategies = basePart.getStrategiesToAdd();
			for (Iterator iter = strategiesToAddFromStrategies.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Strategies(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getStrategy(), moveElement.getElement(), moveElement.getIndex()));
			}
			List assumptionsToAddFromAssumptions = basePart.getAssumptionsToAdd();
			for (Iterator iter = assumptionsToAddFromAssumptions.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Assumptions(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getAssumption(), moveElement.getElement(), moveElement.getIndex()));
			}
			List solutionsToAddFromSolutions = basePart.getSolutionsToAdd();
			for (Iterator iter = solutionsToAddFromSolutions.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Solutions(), iter.next()));
			Map solutionsToRefreshFromSolutions = basePart.getSolutionsToEdit();
			for (Iterator iter = solutionsToRefreshFromSolutions.keySet().iterator(); iter.hasNext();) {
				Solution nextElement = (Solution) iter.next();
				Solution solutions = (Solution) solutionsToRefreshFromSolutions.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, solutions.eGet(feature)));
					}
				}
			}
			List solutionsToRemoveFromSolutions = basePart.getSolutionsToRemove();
			for (Iterator iter = solutionsToRemoveFromSolutions.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List solutionsToMoveFromSolutions = basePart.getSolutionsToMove();
			for (Iterator iter = solutionsToMoveFromSolutions.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getSolution(), moveElement.getElement(), moveElement.getIndex()));
			}
			List contextsToAddFromContexts = basePart.getContextsToAdd();
			for (Iterator iter = contextsToAddFromContexts.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Contexts(), iter.next()));
			Map contextsToRefreshFromContexts = basePart.getContextsToEdit();
			for (Iterator iter = contextsToRefreshFromContexts.keySet().iterator(); iter.hasNext();) {
				Context nextElement = (Context) iter.next();
				Context contexts = (Context) contextsToRefreshFromContexts.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, contexts.eGet(feature)));
					}
				}
			}
			List contextsToRemoveFromContexts = basePart.getContextsToRemove();
			for (Iterator iter = contextsToRemoveFromContexts.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List contextsToMoveFromContexts = basePart.getContextsToMove();
			for (Iterator iter = contextsToMoveFromContexts.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getContext(), moveElement.getElement(), moveElement.getIndex()));
			}
			List justificationsToAddFromJustifications = basePart.getJustificationsToAdd();
			for (Iterator iter = justificationsToAddFromJustifications.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Justifications(), iter.next()));
			Map justificationsToRefreshFromJustifications = basePart.getJustificationsToEdit();
			for (Iterator iter = justificationsToRefreshFromJustifications.keySet().iterator(); iter.hasNext();) {
				Justification nextElement = (Justification) iter.next();
				Justification justifications = (Justification) justificationsToRefreshFromJustifications.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, justifications.eGet(feature)));
					}
				}
			}
			List justificationsToRemoveFromJustifications = basePart.getJustificationsToRemove();
			for (Iterator iter = justificationsToRemoveFromJustifications.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List justificationsToMoveFromJustifications = basePart.getJustificationsToMove();
			for (Iterator iter = justificationsToMoveFromJustifications.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getJustification(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Version(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getVersion())));

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
		if (source instanceof ArgumentDiagram) {
			ArgumentDiagram argumentDiagramToUpdate = (ArgumentDiagram)source;
			argumentDiagramToUpdate.getGoals().addAll(basePart.getGoalsToAdd());
			argumentDiagramToUpdate.getStrategies().addAll(basePart.getStrategiesToAdd());
			argumentDiagramToUpdate.getAssumptions().addAll(basePart.getAssumptionsToAdd());
			argumentDiagramToUpdate.getSolutions().addAll(basePart.getSolutionsToAdd());
			argumentDiagramToUpdate.getContexts().addAll(basePart.getContextsToAdd());
			argumentDiagramToUpdate.getJustifications().addAll(basePart.getJustificationsToAdd());
			argumentDiagramToUpdate.setVersion((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getVersion()));


			return argumentDiagramToUpdate;
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
			if (GsnViewsRepository.ArgumentDiagram.goals == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Goal oldValue = (Goal)event.getOldValue();
					Goal newValue = (Goal)event.getNewValue();
					// TODO: Complete the argumentDiagram update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Goals(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getGoal(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.ArgumentDiagram.strategies == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Strategy oldValue = (Strategy)event.getOldValue();
					Strategy newValue = (Strategy)event.getNewValue();
					// TODO: Complete the argumentDiagram update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Strategies(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getStrategy(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.ArgumentDiagram.assumptions == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Assumption oldValue = (Assumption)event.getOldValue();
					Assumption newValue = (Assumption)event.getNewValue();
					// TODO: Complete the argumentDiagram update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Assumptions(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getAssumption(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.ArgumentDiagram.solutions == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Solution oldValue = (Solution)event.getOldValue();
					Solution newValue = (Solution)event.getNewValue();
					// TODO: Complete the argumentDiagram update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Solutions(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getSolution(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.ArgumentDiagram.contexts == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Context oldValue = (Context)event.getOldValue();
					Context newValue = (Context)event.getNewValue();
					// TODO: Complete the argumentDiagram update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Contexts(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getContext(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.ArgumentDiagram.justifications == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Justification oldValue = (Justification)event.getOldValue();
					Justification newValue = (Justification)event.getNewValue();
					// TODO: Complete the argumentDiagram update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Justifications(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getJustification(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.ArgumentDiagram.version == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, argumentDiagram, GsnPackage.eINSTANCE.getArgumentDiagram_Version(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
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
				if (GsnViewsRepository.ArgumentDiagram.version == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(GsnPackage.eINSTANCE.getArgumentDiagram_Version().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(GsnPackage.eINSTANCE.getArgumentDiagram_Version().getEAttributeType(), newValue);
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
			EObject copy = EcoreUtil.copy(argumentDiagram);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(argumentDiagram);
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
			argumentDiagram.eAdapters().remove(semanticAdapter);
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
