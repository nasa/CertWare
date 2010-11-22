package net.certware.argument.gsz.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalAssumptionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalGoalSolutionsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalStrategiesEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalSubGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionSolutionEvidenceEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyGoalsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyJustificationsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategyContextsEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyStrategySolutionsEditPart;
import net.certware.argument.gsz.diagram.part.GszDiagramEditorPlugin;

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
public class GszElementTypes {

	/**
	 * @generated
	 */
	private GszElementTypes() {
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
	public static final IElementType ArgumentDiagram_1000 = getElementType("net.certware.argument.gsz.diagram.ArgumentDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Goal_2001 = getElementType("net.certware.argument.gsz.diagram.Goal_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Solution_2002 = getElementType("net.certware.argument.gsz.diagram.Solution_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Evidence_2003 = getElementType("net.certware.argument.gsz.diagram.Evidence_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Strategy_2004 = getElementType("net.certware.argument.gsz.diagram.Strategy_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Justification_2005 = getElementType("net.certware.argument.gsz.diagram.Justification_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Context_2006 = getElementType("net.certware.argument.gsz.diagram.Context_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assumption_2007 = getElementType("net.certware.argument.gsz.diagram.Assumption_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalSubGoals_4001 = getElementType("net.certware.argument.gsz.diagram.GoalSubGoals_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalStrategies_4002 = getElementType("net.certware.argument.gsz.diagram.GoalStrategies_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalGoalContexts_4003 = getElementType("net.certware.argument.gsz.diagram.GoalGoalContexts_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalAssumptions_4004 = getElementType("net.certware.argument.gsz.diagram.GoalAssumptions_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GoalGoalSolutions_4005 = getElementType("net.certware.argument.gsz.diagram.GoalGoalSolutions_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyGoals_4006 = getElementType("net.certware.argument.gsz.diagram.StrategyGoals_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyJustifications_4007 = getElementType("net.certware.argument.gsz.diagram.StrategyJustifications_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyStrategyContexts_4008 = getElementType("net.certware.argument.gsz.diagram.StrategyStrategyContexts_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StrategyStrategySolutions_4009 = getElementType("net.certware.argument.gsz.diagram.StrategyStrategySolutions_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolutionSolutionEvidence_4010 = getElementType("net.certware.argument.gsz.diagram.SolutionSolutionEvidence_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolutionSolutionContexts_4011 = getElementType("net.certware.argument.gsz.diagram.SolutionSolutionContexts_4011"); //$NON-NLS-1$

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
				return GszDiagramEditorPlugin.getInstance()
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
					GszPackage.eINSTANCE.getArgumentDiagram());

			elements.put(Goal_2001, GszPackage.eINSTANCE.getGoal());

			elements.put(Solution_2002, GszPackage.eINSTANCE.getSolution());

			elements.put(Evidence_2003, GszPackage.eINSTANCE.getEvidence());

			elements.put(Strategy_2004, GszPackage.eINSTANCE.getStrategy());

			elements.put(Justification_2005,
					GszPackage.eINSTANCE.getJustification());

			elements.put(Context_2006, GszPackage.eINSTANCE.getContext());

			elements.put(Assumption_2007, GszPackage.eINSTANCE.getAssumption());

			elements.put(GoalSubGoals_4001,
					GszPackage.eINSTANCE.getGoal_SubGoals());

			elements.put(GoalStrategies_4002,
					GszPackage.eINSTANCE.getGoal_Strategies());

			elements.put(GoalGoalContexts_4003,
					GszPackage.eINSTANCE.getGoal_GoalContexts());

			elements.put(GoalAssumptions_4004,
					GszPackage.eINSTANCE.getGoal_Assumptions());

			elements.put(GoalGoalSolutions_4005,
					GszPackage.eINSTANCE.getGoal_GoalSolutions());

			elements.put(StrategyGoals_4006,
					GszPackage.eINSTANCE.getStrategy_Goals());

			elements.put(StrategyJustifications_4007,
					GszPackage.eINSTANCE.getStrategy_Justifications());

			elements.put(StrategyStrategyContexts_4008,
					GszPackage.eINSTANCE.getStrategy_StrategyContexts());

			elements.put(StrategyStrategySolutions_4009,
					GszPackage.eINSTANCE.getStrategy_StrategySolutions());

			elements.put(SolutionSolutionEvidence_4010,
					GszPackage.eINSTANCE.getSolution_SolutionEvidence());

			elements.put(SolutionSolutionContexts_4011,
					GszPackage.eINSTANCE.getSolution_SolutionContexts());
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
			KNOWN_ELEMENT_TYPES.add(Goal_2001);
			KNOWN_ELEMENT_TYPES.add(Solution_2002);
			KNOWN_ELEMENT_TYPES.add(Evidence_2003);
			KNOWN_ELEMENT_TYPES.add(Strategy_2004);
			KNOWN_ELEMENT_TYPES.add(Justification_2005);
			KNOWN_ELEMENT_TYPES.add(Context_2006);
			KNOWN_ELEMENT_TYPES.add(Assumption_2007);
			KNOWN_ELEMENT_TYPES.add(GoalSubGoals_4001);
			KNOWN_ELEMENT_TYPES.add(GoalStrategies_4002);
			KNOWN_ELEMENT_TYPES.add(GoalGoalContexts_4003);
			KNOWN_ELEMENT_TYPES.add(GoalAssumptions_4004);
			KNOWN_ELEMENT_TYPES.add(GoalGoalSolutions_4005);
			KNOWN_ELEMENT_TYPES.add(StrategyGoals_4006);
			KNOWN_ELEMENT_TYPES.add(StrategyJustifications_4007);
			KNOWN_ELEMENT_TYPES.add(StrategyStrategyContexts_4008);
			KNOWN_ELEMENT_TYPES.add(StrategyStrategySolutions_4009);
			KNOWN_ELEMENT_TYPES.add(SolutionSolutionEvidence_4010);
			KNOWN_ELEMENT_TYPES.add(SolutionSolutionContexts_4011);
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
		case GoalEditPart.VISUAL_ID:
			return Goal_2001;
		case SolutionEditPart.VISUAL_ID:
			return Solution_2002;
		case EvidenceEditPart.VISUAL_ID:
			return Evidence_2003;
		case StrategyEditPart.VISUAL_ID:
			return Strategy_2004;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2005;
		case ContextEditPart.VISUAL_ID:
			return Context_2006;
		case AssumptionEditPart.VISUAL_ID:
			return Assumption_2007;
		case GoalSubGoalsEditPart.VISUAL_ID:
			return GoalSubGoals_4001;
		case GoalStrategiesEditPart.VISUAL_ID:
			return GoalStrategies_4002;
		case GoalGoalContextsEditPart.VISUAL_ID:
			return GoalGoalContexts_4003;
		case GoalAssumptionsEditPart.VISUAL_ID:
			return GoalAssumptions_4004;
		case GoalGoalSolutionsEditPart.VISUAL_ID:
			return GoalGoalSolutions_4005;
		case StrategyGoalsEditPart.VISUAL_ID:
			return StrategyGoals_4006;
		case StrategyJustificationsEditPart.VISUAL_ID:
			return StrategyJustifications_4007;
		case StrategyStrategyContextsEditPart.VISUAL_ID:
			return StrategyStrategyContexts_4008;
		case StrategyStrategySolutionsEditPart.VISUAL_ID:
			return StrategyStrategySolutions_4009;
		case SolutionSolutionEvidenceEditPart.VISUAL_ID:
			return SolutionSolutionEvidence_4010;
		case SolutionSolutionContextsEditPart.VISUAL_ID:
			return SolutionSolutionContexts_4011;
		}
		return null;
	}

}
