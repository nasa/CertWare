/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.certware.argument.euz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.euz.diagram.part.EuzDiagramEditorPlugin;
import net.certware.argument.euz.diagram.part.Messages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class EuzModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ArgumentDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(8);
			types.add(EuzElementTypes.Argument_2001);
			types.add(EuzElementTypes.Solution_2002);
			types.add(EuzElementTypes.Evidence_2003);
			types.add(EuzElementTypes.Strategy_2004);
			types.add(EuzElementTypes.Assumption_2005);
			types.add(EuzElementTypes.Justification_2006);
			types.add(EuzElementTypes.Context_2007);
			types.add(EuzElementTypes.Criteria_2008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ArgumentEditPart) {
			return ((ArgumentEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SolutionEditPart) {
			return ((SolutionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ContextEditPart) {
			return ((ContextEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CriteriaEditPart) {
			return ((CriteriaEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ArgumentEditPart) {
			return ((ArgumentEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SolutionEditPart) {
			return ((SolutionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EvidenceEditPart) {
			return ((EvidenceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			return ((AssumptionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JustificationEditPart) {
			return ((JustificationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ContextEditPart) {
			return ((ContextEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CriteriaEditPart) {
			return ((CriteriaEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ArgumentEditPart) {
			return ((ArgumentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SolutionEditPart) {
			return ((SolutionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ContextEditPart) {
			return ((ContextEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CriteriaEditPart) {
			return ((CriteriaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ArgumentEditPart) {
			return ((ArgumentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SolutionEditPart) {
			return ((SolutionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EvidenceEditPart) {
			return ((EvidenceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AssumptionEditPart) {
			return ((AssumptionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			return ((JustificationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ContextEditPart) {
			return ((ContextEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CriteriaEditPart) {
			return ((CriteriaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ArgumentEditPart) {
			return ((ArgumentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SolutionEditPart) {
			return ((SolutionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StrategyEditPart) {
			return ((StrategyEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ContextEditPart) {
			return ((ContextEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CriteriaEditPart) {
			return ((CriteriaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				EuzDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.EuzModelingAssistantProviderMessage);
		dialog.setTitle(Messages.EuzModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
