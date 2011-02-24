/**
 * Copyright (c) United States Government as represented by the National Aeronautics and Space Administration.
 * All rights reserved.
 */
package net.certware.argument.eur.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.eur.Argument;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Justification;
import net.certware.argument.eur.Solution;
import net.certware.argument.eur.Strategy;
import net.certware.argument.eur.parts.ArgumentPropertiesEditionPart;
import net.certware.argument.eur.parts.EurViewsRepository;

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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
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
 * @author mrb
 * 
 */
public class ArgumentPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Argument argument;

	/**
	 * The Base part
	 * 
	 */
	protected ArgumentPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public ArgumentPropertiesEditionComponent(EObject argument, String editing_mode) {
		if (argument instanceof Argument) {
			this.argument = (Argument)argument;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.argument.eAdapters().add(semanticAdapter);
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
					ArgumentPropertiesEditionComponent.this.dispose();
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
			basePart.updateIsTagged(argument);
		}
		if (ArmPackage.eINSTANCE.getClaim_Assumed().equals(msg.getFeature()) && basePart != null)
			basePart.setAssumed((Boolean)msg.getNewValue());

		if (ArmPackage.eINSTANCE.getClaim_ToBeSupported().equals(msg.getFeature()) && basePart != null)
			basePart.setToBeSupported((Boolean)msg.getNewValue());

		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == EurPackage.eINSTANCE.getArgument_Strategy())) {
			basePart.updateStrategy(argument);
		}
		if (EurPackage.eINSTANCE.getArgument_Assumption().equals(msg.getFeature()))
			basePart.updateAssumption(argument);
		if (EurPackage.eINSTANCE.getArgument_Context().equals(msg.getFeature()))
			basePart.updateContext(argument);
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == EurPackage.eINSTANCE.getArgument_Solution())) {
			basePart.updateSolution(argument);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == EurPackage.eINSTANCE.getArgument_Argument())) {
			basePart.updateArgument(argument);
		}
		if (EurPackage.eINSTANCE.getArgument_Criteria().equals(msg.getFeature()))
			basePart.updateCriteria(argument);
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == EurPackage.eINSTANCE.getArgument_Justification())) {
			basePart.updateJustification(argument);
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
			return EurViewsRepository.Argument.class;
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
		if (argument != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(EurViewsRepository.class);
				if (provider != null) {
					basePart = (ArgumentPropertiesEditionPart)provider.getPropertiesEditionPart(EurViewsRepository.Argument.class, kind, this);
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
		if (key == EurViewsRepository.Argument.class)
			this.basePart = (ArgumentPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == EurViewsRepository.Argument.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final Argument argument = (Argument)elt;
			// init values
			if (argument.getIdentifier() != null)
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argument.getIdentifier()));

			if (argument.getDescription() != null)
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), argument.getDescription()));

			if (argument.getContent() != null)
				basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), argument.getContent()));
			basePart.initIsTagged(argument, null, ArmPackage.eINSTANCE.getModelElement_IsTagged());
			basePart.setAssumed(argument.isAssumed());

			basePart.setToBeSupported(argument.isToBeSupported());

			basePart.initStrategy(argument, null, EurPackage.eINSTANCE.getArgument_Strategy());
			basePart.initAssumption(argument, null, EurPackage.eINSTANCE.getArgument_Assumption());
			basePart.initContext(argument, null, EurPackage.eINSTANCE.getArgument_Context());
			basePart.initSolution(argument, null, EurPackage.eINSTANCE.getArgument_Solution());
			basePart.initArgument(argument, null, EurPackage.eINSTANCE.getArgument_Argument());
			basePart.initCriteria(argument, null, EurPackage.eINSTANCE.getArgument_Criteria());
			basePart.initJustification(argument, null, EurPackage.eINSTANCE.getArgument_Justification());
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
		if ((argument != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, argument, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier())));
			cc.append(SetCommand.create(editingDomain, argument, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription())));
			cc.append(SetCommand.create(editingDomain, argument, ArmPackage.eINSTANCE.getModelElement_Content(), EcoreUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent())));
			List isTaggedToAddFromIsTagged = basePart.getIsTaggedToAdd();
			for (Iterator iter = isTaggedToAddFromIsTagged.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, ArmPackage.eINSTANCE.getModelElement_IsTagged(), iter.next()));
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
				cc.append(MoveCommand.create(editingDomain, argument, ArmPackage.eINSTANCE.getTaggedValue(), moveElement.getElement(), moveElement.getIndex()));
			}
			cc.append(SetCommand.create(editingDomain, argument, ArmPackage.eINSTANCE.getClaim_Assumed(), basePart.getAssumed()));

			cc.append(SetCommand.create(editingDomain, argument, ArmPackage.eINSTANCE.getClaim_ToBeSupported(), basePart.getToBeSupported()));

			List strategyToAddFromStrategy = basePart.getStrategyToAdd();
			for (Iterator iter = strategyToAddFromStrategy.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Strategy(), iter.next()));
			Map strategyToRefreshFromStrategy = basePart.getStrategyToEdit();
			for (Iterator iter = strategyToRefreshFromStrategy.keySet().iterator(); iter.hasNext();) {
				Strategy nextElement = (Strategy) iter.next();
				Strategy strategy = (Strategy) strategyToRefreshFromStrategy.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, strategy.eGet(feature)));
					}
				}
			}
			List strategyToRemoveFromStrategy = basePart.getStrategyToRemove();
			for (Iterator iter = strategyToRemoveFromStrategy.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List strategyToMoveFromStrategy = basePart.getStrategyToMove();
			for (Iterator iter = strategyToMoveFromStrategy.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getStrategy(), moveElement.getElement(), moveElement.getIndex()));
			}
			List assumptionToAddFromAssumption = basePart.getAssumptionToAdd();
			for (Iterator iter = assumptionToAddFromAssumption.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Assumption(), iter.next()));
			List assumptionToRemoveFromAssumption = basePart.getAssumptionToRemove();
			for (Iterator iter = assumptionToRemoveFromAssumption.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Assumption(), iter.next()));
			//List assumptionToMoveFromAssumption = basePart.getAssumptionToMove();
			//for (Iterator iter = assumptionToMoveFromAssumption.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getAssumption(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List contextToAddFromContext = basePart.getContextToAdd();
			for (Iterator iter = contextToAddFromContext.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Context(), iter.next()));
			List contextToRemoveFromContext = basePart.getContextToRemove();
			for (Iterator iter = contextToRemoveFromContext.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Context(), iter.next()));
			//List contextToMoveFromContext = basePart.getContextToMove();
			//for (Iterator iter = contextToMoveFromContext.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getContext(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List solutionToAddFromSolution = basePart.getSolutionToAdd();
			for (Iterator iter = solutionToAddFromSolution.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Solution(), iter.next()));
			Map solutionToRefreshFromSolution = basePart.getSolutionToEdit();
			for (Iterator iter = solutionToRefreshFromSolution.keySet().iterator(); iter.hasNext();) {
				Solution nextElement = (Solution) iter.next();
				Solution solution = (Solution) solutionToRefreshFromSolution.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, solution.eGet(feature)));
					}
				}
			}
			List solutionToRemoveFromSolution = basePart.getSolutionToRemove();
			for (Iterator iter = solutionToRemoveFromSolution.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List solutionToMoveFromSolution = basePart.getSolutionToMove();
			for (Iterator iter = solutionToMoveFromSolution.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getSolution(), moveElement.getElement(), moveElement.getIndex()));
			}
			List argumentToAddFromArgument = basePart.getArgumentToAdd();
			for (Iterator iter = argumentToAddFromArgument.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Argument(), iter.next()));
			Map argumentToRefreshFromArgument = basePart.getArgumentToEdit();
			for (Iterator iter = argumentToRefreshFromArgument.keySet().iterator(); iter.hasNext();) {
				Argument nextElement = (Argument) iter.next();
				Argument argument = (Argument) argumentToRefreshFromArgument.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, argument.eGet(feature)));
					}
				}
			}
			List argumentToRemoveFromArgument = basePart.getArgumentToRemove();
			for (Iterator iter = argumentToRemoveFromArgument.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List argumentToMoveFromArgument = basePart.getArgumentToMove();
			for (Iterator iter = argumentToMoveFromArgument.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument(), moveElement.getElement(), moveElement.getIndex()));
			}
			List criteriaToAddFromCriteria = basePart.getCriteriaToAdd();
			for (Iterator iter = criteriaToAddFromCriteria.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Criteria(), iter.next()));
			List criteriaToRemoveFromCriteria = basePart.getCriteriaToRemove();
			for (Iterator iter = criteriaToRemoveFromCriteria.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Criteria(), iter.next()));
			//List criteriaToMoveFromCriteria = basePart.getCriteriaToMove();
			//for (Iterator iter = criteriaToMoveFromCriteria.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getCriteria(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List justificationToAddFromJustification = basePart.getJustificationToAdd();
			for (Iterator iter = justificationToAddFromJustification.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getArgument_Justification(), iter.next()));
			Map justificationToRefreshFromJustification = basePart.getJustificationToEdit();
			for (Iterator iter = justificationToRefreshFromJustification.keySet().iterator(); iter.hasNext();) {
				Justification nextElement = (Justification) iter.next();
				Justification justification = (Justification) justificationToRefreshFromJustification.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, justification.eGet(feature)));
					}
				}
			}
			List justificationToRemoveFromJustification = basePart.getJustificationToRemove();
			for (Iterator iter = justificationToRemoveFromJustification.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List justificationToMoveFromJustification = basePart.getJustificationToMove();
			for (Iterator iter = justificationToMoveFromJustification.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, argument, EurPackage.eINSTANCE.getJustification(), moveElement.getElement(), moveElement.getIndex()));
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
		if (source instanceof Argument) {
			Argument argumentToUpdate = (Argument)source;
			argumentToUpdate.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getIdentifier()));

			argumentToUpdate.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getDescription()));

			argumentToUpdate.setContent((java.lang.String)EcoreUtil.createFromString(ArmPackage.eINSTANCE.getString(), basePart.getContent()));
			argumentToUpdate.getIsTagged().addAll(basePart.getIsTaggedToAdd());
			argumentToUpdate.setAssumed(new Boolean(basePart.getAssumed()).booleanValue());

			argumentToUpdate.setToBeSupported(new Boolean(basePart.getToBeSupported()).booleanValue());

			argumentToUpdate.getStrategy().addAll(basePart.getStrategyToAdd());
			argumentToUpdate.getAssumption().addAll(basePart.getAssumptionToAdd());
			argumentToUpdate.getContext().addAll(basePart.getContextToAdd());
			argumentToUpdate.getSolution().addAll(basePart.getSolutionToAdd());
			argumentToUpdate.getArgument().addAll(basePart.getArgumentToAdd());
			argumentToUpdate.getCriteria().addAll(basePart.getCriteriaToAdd());
			argumentToUpdate.getJustification().addAll(basePart.getJustificationToAdd());

			return argumentToUpdate;
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
			if (EurViewsRepository.Argument.identifier == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, argument, ArmPackage.eINSTANCE.getModelElement_Identifier(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (EurViewsRepository.Argument.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, argument, ArmPackage.eINSTANCE.getModelElement_Description(), EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (EurViewsRepository.Argument.content == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, argument, ArmPackage.eINSTANCE.getModelElement_Content(), EcoreUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue())));
			}
			if (EurViewsRepository.Argument.isTagged == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					TaggedValue oldValue = (TaggedValue)event.getOldValue();
					TaggedValue newValue = (TaggedValue)event.getNewValue();
					// TODO: Complete the argument update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, ArmPackage.eINSTANCE.getModelElement_IsTagged(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, ArmPackage.eINSTANCE.getTaggedValue(), event.getNewValue(), event.getNewIndex()));
			}
			if (EurViewsRepository.Argument.assumed == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, argument, ArmPackage.eINSTANCE.getClaim_Assumed(), event.getNewValue()));

			if (EurViewsRepository.Argument.toBeSupported == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, argument, ArmPackage.eINSTANCE.getClaim_ToBeSupported(), event.getNewValue()));

			if (EurViewsRepository.Argument.strategy == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Strategy oldValue = (Strategy)event.getOldValue();
					Strategy newValue = (Strategy)event.getNewValue();
					// TODO: Complete the argument update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Strategy(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getStrategy(), event.getNewValue(), event.getNewIndex()));
			}
			if (EurViewsRepository.Argument.assumption == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Assumption(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Assumption(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Assumption(), event.getNewValue(), event.getNewIndex()));
			}
			if (EurViewsRepository.Argument.context == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Context(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Context(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Context(), event.getNewValue(), event.getNewIndex()));
			}
			if (EurViewsRepository.Argument.solution == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Solution oldValue = (Solution)event.getOldValue();
					Solution newValue = (Solution)event.getNewValue();
					// TODO: Complete the argument update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Solution(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getSolution(), event.getNewValue(), event.getNewIndex()));
			}
			if (EurViewsRepository.Argument.argument == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Argument oldValue = (Argument)event.getOldValue();
					Argument newValue = (Argument)event.getNewValue();
					// TODO: Complete the argument update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Argument(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument(), event.getNewValue(), event.getNewIndex()));
			}
			if (EurViewsRepository.Argument.criteria == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Criteria(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Criteria(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Criteria(), event.getNewValue(), event.getNewIndex()));
			}
			if (EurViewsRepository.Argument.justification == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Justification oldValue = (Justification)event.getOldValue();
					Justification newValue = (Justification)event.getNewValue();
					// TODO: Complete the argument update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getArgument_Justification(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, argument, EurPackage.eINSTANCE.getJustification(), event.getNewValue(), event.getNewIndex()));
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
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 * 
	 */
	public String getHelpContent(String key, int kind) {
		if (key == EurViewsRepository.Argument.strategy)
			return "Strategies for fulfilling the argument"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.assumption)
			return "Assertion relied upon by the element"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.context)
			return "Inputs or background information"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.solution)
			return "Evidence for satisfaction of goals"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.argument)
			return "A requirement or target to be met or shown to be true"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.criteria)
			return "Means by which satisfaction of element can be assessed or checked"; //$NON-NLS-1$
		if (key == EurViewsRepository.Argument.justification)
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
			String newStringValue = event.getNewValue().toString();
			try {
				if (EurViewsRepository.Argument.identifier == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.content == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.assumed == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getClaim_Assumed().getEAttributeType(), newValue);
				}
				if (EurViewsRepository.Argument.toBeSupported == event.getAffectedEditor()) {
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
			EObject copy = EcoreUtil.copy(argument);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(argument);
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
			argument.eAdapters().remove(semanticAdapter);
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
