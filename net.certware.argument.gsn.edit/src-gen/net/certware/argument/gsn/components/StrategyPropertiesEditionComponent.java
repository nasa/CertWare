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
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.parts.StrategyPropertiesEditionPart;

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
public class StrategyPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Strategy strategy;

	/**
	 * The Base part
	 * 
	 */
	protected StrategyPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public StrategyPropertiesEditionComponent(EObject strategy, String editing_mode) {
		if (strategy instanceof Strategy) {
			this.strategy = (Strategy)strategy;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.strategy.eAdapters().add(semanticAdapter);
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
					StrategyPropertiesEditionComponent.this.dispose();
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
			basePart.updateIsTagged(strategy);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getStrategy_Goals())) {
			basePart.updateGoals(strategy);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getStrategy_Justifications())) {
			basePart.updateJustifications(strategy);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getStrategy_StrategyContexts())) {
			basePart.updateStrategyContexts(strategy);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == GsnPackage.eINSTANCE.getStrategy_StrategySolutions())) {
			basePart.updateStrategySolutions(strategy);
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
			return GsnViewsRepository.Strategy.class;
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
		if (strategy != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(GsnViewsRepository.class);
				if (provider != null) {
					basePart = (StrategyPropertiesEditionPart)provider.getPropertiesEditionPart(GsnViewsRepository.Strategy.class, kind, this);
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
		if (key == GsnViewsRepository.Strategy.class)
			this.basePart = (StrategyPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == GsnViewsRepository.Strategy.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final Strategy strategy = (Strategy)elt;
			// init values
			if (strategy.getIdentifier() != null)
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), strategy.getIdentifier()));

			if (strategy.getDescription() != null)
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), strategy.getDescription()));

			if (strategy.getContent() != null)
				basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), strategy.getContent()));
			basePart.initIsTagged(strategy, null, ArmPackage.eINSTANCE.getModelElement_IsTagged());
			basePart.initGoals(strategy, null, GsnPackage.eINSTANCE.getStrategy_Goals());
			basePart.initJustifications(strategy, null, GsnPackage.eINSTANCE.getStrategy_Justifications());
			basePart.initStrategyContexts(strategy, null, GsnPackage.eINSTANCE.getStrategy_StrategyContexts());
			basePart.initStrategySolutions(strategy, null, GsnPackage.eINSTANCE.getStrategy_StrategySolutions());
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

			basePart.addFilterToStrategyContexts(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Context); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for strategyContexts
			
			// End of user code

			basePart.addFilterToStrategySolutions(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Solution); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for strategySolutions
			
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
		if ((strategy != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier())));
			cc.append(SetCommand.create(editingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription())));
			cc.append(SetCommand.create(editingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_Content(), EcoreUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent())));
			List isTaggedToAddFromIsTagged = basePart.getIsTaggedToAdd();
			for (Iterator iter = isTaggedToAddFromIsTagged.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_IsTagged(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, strategy, ArmPackage.eINSTANCE.getTaggedValue(), moveElement.getElement(), moveElement.getIndex()));
			}
			List goalsToAddFromGoals = basePart.getGoalsToAdd();
			for (Iterator iter = goalsToAddFromGoals.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_Goals(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getGoal(), moveElement.getElement(), moveElement.getIndex()));
			}
			List justificationsToAddFromJustifications = basePart.getJustificationsToAdd();
			for (Iterator iter = justificationsToAddFromJustifications.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_Justifications(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getJustification(), moveElement.getElement(), moveElement.getIndex()));
			}
			List strategyContextsToAddFromStrategyContexts = basePart.getStrategyContextsToAdd();
			for (Iterator iter = strategyContextsToAddFromStrategyContexts.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_StrategyContexts(), iter.next()));
			Map strategyContextsToRefreshFromStrategyContexts = basePart.getStrategyContextsToEdit();
			for (Iterator iter = strategyContextsToRefreshFromStrategyContexts.keySet().iterator(); iter.hasNext();) {
				Context nextElement = (Context) iter.next();
				Context strategyContexts = (Context) strategyContextsToRefreshFromStrategyContexts.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, strategyContexts.eGet(feature)));
					}
				}
			}
			List strategyContextsToRemoveFromStrategyContexts = basePart.getStrategyContextsToRemove();
			for (Iterator iter = strategyContextsToRemoveFromStrategyContexts.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List strategyContextsToMoveFromStrategyContexts = basePart.getStrategyContextsToMove();
			for (Iterator iter = strategyContextsToMoveFromStrategyContexts.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getContext(), moveElement.getElement(), moveElement.getIndex()));
			}
			List strategySolutionsToAddFromStrategySolutions = basePart.getStrategySolutionsToAdd();
			for (Iterator iter = strategySolutionsToAddFromStrategySolutions.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_StrategySolutions(), iter.next()));
			Map strategySolutionsToRefreshFromStrategySolutions = basePart.getStrategySolutionsToEdit();
			for (Iterator iter = strategySolutionsToRefreshFromStrategySolutions.keySet().iterator(); iter.hasNext();) {
				Solution nextElement = (Solution) iter.next();
				Solution strategySolutions = (Solution) strategySolutionsToRefreshFromStrategySolutions.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, strategySolutions.eGet(feature)));
					}
				}
			}
			List strategySolutionsToRemoveFromStrategySolutions = basePart.getStrategySolutionsToRemove();
			for (Iterator iter = strategySolutionsToRemoveFromStrategySolutions.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List strategySolutionsToMoveFromStrategySolutions = basePart.getStrategySolutionsToMove();
			for (Iterator iter = strategySolutionsToMoveFromStrategySolutions.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, strategy, GsnPackage.eINSTANCE.getSolution(), moveElement.getElement(), moveElement.getIndex()));
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
		if (source instanceof Strategy) {
			Strategy strategyToUpdate = (Strategy)source;
			strategyToUpdate.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier()));

			strategyToUpdate.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription()));

			strategyToUpdate.setContent((java.lang.String)EcoreUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent()));
			strategyToUpdate.getIsTagged().addAll(basePart.getIsTaggedToAdd());
			strategyToUpdate.getGoals().addAll(basePart.getGoalsToAdd());
			strategyToUpdate.getJustifications().addAll(basePart.getJustificationsToAdd());
			strategyToUpdate.getStrategyContexts().addAll(basePart.getStrategyContextsToAdd());
			strategyToUpdate.getStrategySolutions().addAll(basePart.getStrategySolutionsToAdd());

			return strategyToUpdate;
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
			if (GsnViewsRepository.Strategy.identifier == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (GsnViewsRepository.Strategy.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (GsnViewsRepository.Strategy.content == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_Content(), EcoreUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (GsnViewsRepository.Strategy.isTagged == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					TaggedValue oldValue = (TaggedValue)event.getOldValue();
					TaggedValue newValue = (TaggedValue)event.getNewValue();
					// TODO: Complete the strategy update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, strategy, ArmPackage.eINSTANCE.getModelElement_IsTagged(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, strategy, ArmPackage.eINSTANCE.getTaggedValue(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Strategy.goals == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Goal oldValue = (Goal)event.getOldValue();
					Goal newValue = (Goal)event.getNewValue();
					// TODO: Complete the strategy update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_Goals(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getGoal(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Strategy.justifications == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Justification oldValue = (Justification)event.getOldValue();
					Justification newValue = (Justification)event.getNewValue();
					// TODO: Complete the strategy update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_Justifications(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getJustification(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Strategy.strategyContexts == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Context oldValue = (Context)event.getOldValue();
					Context newValue = (Context)event.getNewValue();
					// TODO: Complete the strategy update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_StrategyContexts(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getContext(), event.getNewValue(), event.getNewIndex()));
			}
			if (GsnViewsRepository.Strategy.strategySolutions == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Solution oldValue = (Solution)event.getOldValue();
					Solution newValue = (Solution)event.getNewValue();
					// TODO: Complete the strategy update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getStrategy_StrategySolutions(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, strategy, GsnPackage.eINSTANCE.getSolution(), event.getNewValue(), event.getNewIndex()));
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
				if (GsnViewsRepository.Strategy.identifier == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Strategy.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (GsnViewsRepository.Strategy.content == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newStringValue);
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

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 * 
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(strategy);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(strategy);
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
			strategy.eAdapters().remove(semanticAdapter);
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
