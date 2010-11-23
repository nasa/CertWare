package net.certware.argument.gsz.diagram.providers;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.GoalIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.SolutionIdentifierEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyContentEditPart;
import net.certware.argument.gsz.diagram.edit.parts.StrategyIdentifierEditPart;
import net.certware.argument.gsz.diagram.parsers.MessageFormatParser;
import net.certware.argument.gsz.diagram.part.GszVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GszParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser goalIdentifier_5001Parser;

	/**
	 * @generated
	 */
	private IParser getGoalIdentifier_5001Parser() {
		if (goalIdentifier_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Goal {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Goal {0}"); //$NON-NLS-1$
			parser.setEditPattern("Goal {0}"); //$NON-NLS-1$
			goalIdentifier_5001Parser = parser;
		}
		return goalIdentifier_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalContent_5002Parser;

	/**
	 * @generated
	 */
	private IParser getGoalContent_5002Parser() {
		if (goalContent_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalContent_5002Parser = parser;
		}
		return goalContent_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionIdentifier_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionIdentifier_5004Parser() {
		if (solutionIdentifier_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Solution {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Solution {0}"); //$NON-NLS-1$
			parser.setEditPattern("Solution {0}"); //$NON-NLS-1$
			solutionIdentifier_5004Parser = parser;
		}
		return solutionIdentifier_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionContent_5010Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionContent_5010Parser() {
		if (solutionContent_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			solutionContent_5010Parser = parser;
		}
		return solutionContent_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser evidenceIdentifier_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEvidenceIdentifier_5005Parser() {
		if (evidenceIdentifier_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Evidence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Evidence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Evidence {0}"); //$NON-NLS-1$
			evidenceIdentifier_5005Parser = parser;
		}
		return evidenceIdentifier_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser evidenceContent_5011Parser;

	/**
	 * @generated
	 */
	private IParser getEvidenceContent_5011Parser() {
		if (evidenceContent_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evidenceContent_5011Parser = parser;
		}
		return evidenceContent_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser strategyIdentifier_5016Parser;

	/**
	 * @generated
	 */
	private IParser getStrategyIdentifier_5016Parser() {
		if (strategyIdentifier_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Strategy {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Strategy {0}"); //$NON-NLS-1$
			parser.setEditPattern("Strategy {0}"); //$NON-NLS-1$
			strategyIdentifier_5016Parser = parser;
		}
		return strategyIdentifier_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser strategyContent_5017Parser;

	/**
	 * @generated
	 */
	private IParser getStrategyContent_5017Parser() {
		if (strategyContent_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strategyContent_5017Parser = parser;
		}
		return strategyContent_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationIdentifier_5007Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationIdentifier_5007Parser() {
		if (justificationIdentifier_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Justification {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Justification {0}"); //$NON-NLS-1$
			parser.setEditPattern("Justification {0}"); //$NON-NLS-1$
			justificationIdentifier_5007Parser = parser;
		}
		return justificationIdentifier_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationContent_5013Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationContent_5013Parser() {
		if (justificationContent_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationContent_5013Parser = parser;
		}
		return justificationContent_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextIdentifier_5008Parser;

	/**
	 * @generated
	 */
	private IParser getContextIdentifier_5008Parser() {
		if (contextIdentifier_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Context {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Context {0}"); //$NON-NLS-1$
			parser.setEditPattern("Context {0}"); //$NON-NLS-1$
			contextIdentifier_5008Parser = parser;
		}
		return contextIdentifier_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextContent_5014Parser;

	/**
	 * @generated
	 */
	private IParser getContextContent_5014Parser() {
		if (contextContent_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextContent_5014Parser = parser;
		}
		return contextContent_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionIdentifier_5009Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionIdentifier_5009Parser() {
		if (assumptionIdentifier_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Assumption {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assumption {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assumption {0}"); //$NON-NLS-1$
			assumptionIdentifier_5009Parser = parser;
		}
		return assumptionIdentifier_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionContent_5015Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionContent_5015Parser() {
		if (assumptionContent_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionContent_5015Parser = parser;
		}
		return assumptionContent_5015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GoalIdentifierEditPart.VISUAL_ID:
			return getGoalIdentifier_5001Parser();
		case GoalContentEditPart.VISUAL_ID:
			return getGoalContent_5002Parser();
		case SolutionIdentifierEditPart.VISUAL_ID:
			return getSolutionIdentifier_5004Parser();
		case SolutionContentEditPart.VISUAL_ID:
			return getSolutionContent_5010Parser();
		case EvidenceIdentifierEditPart.VISUAL_ID:
			return getEvidenceIdentifier_5005Parser();
		case EvidenceContentEditPart.VISUAL_ID:
			return getEvidenceContent_5011Parser();
		case StrategyIdentifierEditPart.VISUAL_ID:
			return getStrategyIdentifier_5016Parser();
		case StrategyContentEditPart.VISUAL_ID:
			return getStrategyContent_5017Parser();
		case JustificationIdentifierEditPart.VISUAL_ID:
			return getJustificationIdentifier_5007Parser();
		case JustificationContentEditPart.VISUAL_ID:
			return getJustificationContent_5013Parser();
		case ContextIdentifierEditPart.VISUAL_ID:
			return getContextIdentifier_5008Parser();
		case ContextContentEditPart.VISUAL_ID:
			return getContextContent_5014Parser();
		case AssumptionIdentifierEditPart.VISUAL_ID:
			return getAssumptionIdentifier_5009Parser();
		case AssumptionContentEditPart.VISUAL_ID:
			return getAssumptionContent_5015Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GszVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GszVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GszElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
