/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.certware.argument.euz.EuzPackage;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentJustificationsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentSolutionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentArgumentStrategiesEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentSubArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContextAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaCriteriaContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyArgumentsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyAssumptionsEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyCriteriaEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyStrategyJustificationsEditPart;
import net.certware.argument.euz.diagram.part.EuzDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class EuzElementTypes {

	/**
	 * @generated
	 */
	private EuzElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ArgumentDiagram_1000 = getElementType("net.certware.argument.euz.diagram.ArgumentDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Argument_2001 = getElementType("net.certware.argument.euz.diagram.Argument_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Solution_2002 = getElementType("net.certware.argument.euz.diagram.Solution_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Evidence_2003 = getElementType("net.certware.argument.euz.diagram.Evidence_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Strategy_2004 = getElementType("net.certware.argument.euz.diagram.Strategy_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assumption_2005 = getElementType("net.certware.argument.euz.diagram.Assumption_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Justification_2006 = getElementType("net.certware.argument.euz.diagram.Justification_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Context_2007 = getElementType("net.certware.argument.euz.diagram.Context_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Criteria_2008 = getElementType("net.certware.argument.euz.diagram.Criteria_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentStrategies_4001 = getElementType("net.certware.argument.euz.diagram.ArgumentArgumentStrategies_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentAssumptions_4002 = getElementType("net.certware.argument.euz.diagram.ArgumentArgumentAssumptions_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentContexts_4003 = getElementType("net.certware.argument.euz.diagram.ArgumentArgumentContexts_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentSolutions_4004 = getElementType("net.certware.argument.euz.diagram.ArgumentArgumentSolutions_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentCriteria_4005 = getElementType("net.certware.argument.euz.diagram.ArgumentArgumentCriteria_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentArgumentJustifications_4006 = getElementType("net.certware.argument.euz.diagram.ArgumentArgumentJustifications_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentSubArguments_4017 = getElementType("net.certware.argument.euz.diagram.ArgumentSubArguments_4017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ContextContextAssumptions_4007 = getElementType("net.certware.argument.euz.diagram.ContextContextAssumptions_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CriteriaCriteriaContexts_4008 = getElementType("net.certware.argument.euz.diagram.CriteriaCriteriaContexts_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CriteriaCriteriaAssumptions_4009 = getElementType("net.certware.argument.euz.diagram.CriteriaCriteriaAssumptions_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyStrategyArguments_4010 = getElementType("net.certware.argument.euz.diagram.StrategyStrategyArguments_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyStrategyJustifications_4011 = getElementType("net.certware.argument.euz.diagram.StrategyStrategyJustifications_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyStrategyCriteria_4012 = getElementType("net.certware.argument.euz.diagram.StrategyStrategyCriteria_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyStrategyAssumptions_4013 = getElementType("net.certware.argument.euz.diagram.StrategyStrategyAssumptions_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolutionSolutionContexts_4014 = getElementType("net.certware.argument.euz.diagram.SolutionSolutionContexts_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolutionSolutionEvidence_4015 = getElementType("net.certware.argument.euz.diagram.SolutionSolutionEvidence_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolutionSolutionCriteria_4016 = getElementType("net.certware.argument.euz.diagram.SolutionSolutionCriteria_4016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return EuzDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ArgumentDiagram_1000,
					EuzPackage.eINSTANCE.getArgumentDiagram());

			elements.put(Argument_2001, EuzPackage.eINSTANCE.getArgument());

			elements.put(Solution_2002, EuzPackage.eINSTANCE.getSolution());

			elements.put(Evidence_2003, EuzPackage.eINSTANCE.getEvidence());

			elements.put(Strategy_2004, EuzPackage.eINSTANCE.getStrategy());

			elements.put(Assumption_2005, EuzPackage.eINSTANCE.getAssumption());

			elements.put(Justification_2006,
					EuzPackage.eINSTANCE.getJustification());

			elements.put(Context_2007, EuzPackage.eINSTANCE.getContext());

			elements.put(Criteria_2008, EuzPackage.eINSTANCE.getCriteria());

			elements.put(ArgumentArgumentStrategies_4001,
					EuzPackage.eINSTANCE.getArgument_ArgumentStrategies());

			elements.put(ArgumentArgumentAssumptions_4002,
					EuzPackage.eINSTANCE.getArgument_ArgumentAssumptions());

			elements.put(ArgumentArgumentContexts_4003,
					EuzPackage.eINSTANCE.getArgument_ArgumentContexts());

			elements.put(ArgumentArgumentSolutions_4004,
					EuzPackage.eINSTANCE.getArgument_ArgumentSolutions());

			elements.put(ArgumentArgumentCriteria_4005,
					EuzPackage.eINSTANCE.getArgument_ArgumentCriteria());

			elements.put(ArgumentArgumentJustifications_4006,
					EuzPackage.eINSTANCE.getArgument_ArgumentJustifications());

			elements.put(ArgumentSubArguments_4017,
					EuzPackage.eINSTANCE.getArgument_SubArguments());

			elements.put(ContextContextAssumptions_4007,
					EuzPackage.eINSTANCE.getContext_ContextAssumptions());

			elements.put(CriteriaCriteriaContexts_4008,
					EuzPackage.eINSTANCE.getCriteria_CriteriaContexts());

			elements.put(CriteriaCriteriaAssumptions_4009,
					EuzPackage.eINSTANCE.getCriteria_CriteriaAssumptions());

			elements.put(StrategyStrategyArguments_4010,
					EuzPackage.eINSTANCE.getStrategy_StrategyArguments());

			elements.put(StrategyStrategyJustifications_4011,
					EuzPackage.eINSTANCE.getStrategy_StrategyJustifications());

			elements.put(StrategyStrategyCriteria_4012,
					EuzPackage.eINSTANCE.getStrategy_StrategyCriteria());

			elements.put(StrategyStrategyAssumptions_4013,
					EuzPackage.eINSTANCE.getStrategy_StrategyAssumptions());

			elements.put(SolutionSolutionContexts_4014,
					EuzPackage.eINSTANCE.getSolution_SolutionContexts());

			elements.put(SolutionSolutionEvidence_4015,
					EuzPackage.eINSTANCE.getSolution_SolutionEvidence());

			elements.put(SolutionSolutionCriteria_4016,
					EuzPackage.eINSTANCE.getSolution_SolutionCriteria());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ArgumentDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Argument_2001);
			KNOWN_ELEMENT_TYPES.add(Solution_2002);
			KNOWN_ELEMENT_TYPES.add(Evidence_2003);
			KNOWN_ELEMENT_TYPES.add(Strategy_2004);
			KNOWN_ELEMENT_TYPES.add(Assumption_2005);
			KNOWN_ELEMENT_TYPES.add(Justification_2006);
			KNOWN_ELEMENT_TYPES.add(Context_2007);
			KNOWN_ELEMENT_TYPES.add(Criteria_2008);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentStrategies_4001);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentAssumptions_4002);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentContexts_4003);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentSolutions_4004);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentCriteria_4005);
			KNOWN_ELEMENT_TYPES.add(ArgumentArgumentJustifications_4006);
			KNOWN_ELEMENT_TYPES.add(ArgumentSubArguments_4017);
			KNOWN_ELEMENT_TYPES.add(ContextContextAssumptions_4007);
			KNOWN_ELEMENT_TYPES.add(CriteriaCriteriaContexts_4008);
			KNOWN_ELEMENT_TYPES.add(CriteriaCriteriaAssumptions_4009);
			KNOWN_ELEMENT_TYPES.add(StrategyStrategyArguments_4010);
			KNOWN_ELEMENT_TYPES.add(StrategyStrategyJustifications_4011);
			KNOWN_ELEMENT_TYPES.add(StrategyStrategyCriteria_4012);
			KNOWN_ELEMENT_TYPES.add(StrategyStrategyAssumptions_4013);
			KNOWN_ELEMENT_TYPES.add(SolutionSolutionContexts_4014);
			KNOWN_ELEMENT_TYPES.add(SolutionSolutionEvidence_4015);
			KNOWN_ELEMENT_TYPES.add(SolutionSolutionCriteria_4016);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return ArgumentDiagram_1000;
		case ArgumentEditPart.VISUAL_ID:
			return Argument_2001;
		case SolutionEditPart.VISUAL_ID:
			return Solution_2002;
		case EvidenceEditPart.VISUAL_ID:
			return Evidence_2003;
		case StrategyEditPart.VISUAL_ID:
			return Strategy_2004;
		case AssumptionEditPart.VISUAL_ID:
			return Assumption_2005;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2006;
		case ContextEditPart.VISUAL_ID:
			return Context_2007;
		case CriteriaEditPart.VISUAL_ID:
			return Criteria_2008;
		case ArgumentArgumentStrategiesEditPart.VISUAL_ID:
			return ArgumentArgumentStrategies_4001;
		case ArgumentArgumentAssumptionsEditPart.VISUAL_ID:
			return ArgumentArgumentAssumptions_4002;
		case ArgumentArgumentContextsEditPart.VISUAL_ID:
			return ArgumentArgumentContexts_4003;
		case ArgumentArgumentSolutionsEditPart.VISUAL_ID:
			return ArgumentArgumentSolutions_4004;
		case ArgumentArgumentCriteriaEditPart.VISUAL_ID:
			return ArgumentArgumentCriteria_4005;
		case ArgumentArgumentJustificationsEditPart.VISUAL_ID:
			return ArgumentArgumentJustifications_4006;
		case ArgumentSubArgumentsEditPart.VISUAL_ID:
			return ArgumentSubArguments_4017;
		case ContextContextAssumptionsEditPart.VISUAL_ID:
			return ContextContextAssumptions_4007;
		case CriteriaCriteriaContextsEditPart.VISUAL_ID:
			return CriteriaCriteriaContexts_4008;
		case CriteriaCriteriaAssumptionsEditPart.VISUAL_ID:
			return CriteriaCriteriaAssumptions_4009;
		case StrategyStrategyArgumentsEditPart.VISUAL_ID:
			return StrategyStrategyArguments_4010;
		case StrategyStrategyJustificationsEditPart.VISUAL_ID:
			return StrategyStrategyJustifications_4011;
		case StrategyStrategyCriteriaEditPart.VISUAL_ID:
			return StrategyStrategyCriteria_4012;
		case StrategyStrategyAssumptionsEditPart.VISUAL_ID:
			return StrategyStrategyAssumptions_4013;
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return SolutionSolutionContexts_4014;
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return SolutionSolutionEvidence_4015;
		case SolutionSolutionCriteriaEditPart.VISUAL_ID:
			return SolutionSolutionCriteria_4016;
		}
		return null;
	}

}
