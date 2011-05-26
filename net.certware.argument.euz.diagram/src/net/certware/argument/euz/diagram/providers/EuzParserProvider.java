/*
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.euz.diagram.providers;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.euz.diagram.edit.parts.ArgumentContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ArgumentIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.CriteriaIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.SolutionIdentifierEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyContentEditPart;
import net.certware.argument.euz.diagram.edit.parts.StrategyIdentifierEditPart;
import net.certware.argument.euz.diagram.parsers.MessageFormatParser;
import net.certware.argument.euz.diagram.part.EuzVisualIDRegistry;

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
public class EuzParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser argumentIdentifier_5001Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentIdentifier_5001Parser() {
		if (argumentIdentifier_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Argument {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Argument {0}"); //$NON-NLS-1$
			parser.setEditPattern("Argument {0}"); //$NON-NLS-1$
			argumentIdentifier_5001Parser = parser;
		}
		return argumentIdentifier_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentContent_5002Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentContent_5002Parser() {
		if (argumentContent_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentContent_5002Parser = parser;
		}
		return argumentContent_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionIdentifier_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionIdentifier_5003Parser() {
		if (solutionIdentifier_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Solution {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Solution {0}"); //$NON-NLS-1$
			parser.setEditPattern("Solution {0}"); //$NON-NLS-1$
			solutionIdentifier_5003Parser = parser;
		}
		return solutionIdentifier_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser solutionContent_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSolutionContent_5004Parser() {
		if (solutionContent_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			solutionContent_5004Parser = parser;
		}
		return solutionContent_5004Parser;
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
	private IParser evidenceContent_5006Parser;

	/**
	 * @generated
	 */
	private IParser getEvidenceContent_5006Parser() {
		if (evidenceContent_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evidenceContent_5006Parser = parser;
		}
		return evidenceContent_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser strategyIdentifier_5007Parser;

	/**
	 * @generated
	 */
	private IParser getStrategyIdentifier_5007Parser() {
		if (strategyIdentifier_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Strategy {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Strategy {0}"); //$NON-NLS-1$
			parser.setEditPattern("Strategy {0}"); //$NON-NLS-1$
			strategyIdentifier_5007Parser = parser;
		}
		return strategyIdentifier_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser strategyContent_5008Parser;

	/**
	 * @generated
	 */
	private IParser getStrategyContent_5008Parser() {
		if (strategyContent_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			strategyContent_5008Parser = parser;
		}
		return strategyContent_5008Parser;
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
	private IParser assumptionContent_5010Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionContent_5010Parser() {
		if (assumptionContent_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionContent_5010Parser = parser;
		}
		return assumptionContent_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationIdentifier_5011Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationIdentifier_5011Parser() {
		if (justificationIdentifier_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Justification {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Justification {0}"); //$NON-NLS-1$
			parser.setEditPattern("Justification {0}"); //$NON-NLS-1$
			justificationIdentifier_5011Parser = parser;
		}
		return justificationIdentifier_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationContent_5012Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationContent_5012Parser() {
		if (justificationContent_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationContent_5012Parser = parser;
		}
		return justificationContent_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextIdentifier_5013Parser;

	/**
	 * @generated
	 */
	private IParser getContextIdentifier_5013Parser() {
		if (contextIdentifier_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Context {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Context {0}"); //$NON-NLS-1$
			parser.setEditPattern("Context {0}"); //$NON-NLS-1$
			contextIdentifier_5013Parser = parser;
		}
		return contextIdentifier_5013Parser;
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
	private IParser criteriaIdentifier_5015Parser;

	/**
	 * @generated
	 */
	private IParser getCriteriaIdentifier_5015Parser() {
		if (criteriaIdentifier_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Criteria {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Criteria {0}"); //$NON-NLS-1$
			parser.setEditPattern("Criteria {0}"); //$NON-NLS-1$
			criteriaIdentifier_5015Parser = parser;
		}
		return criteriaIdentifier_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser criteriaContent_5016Parser;

	/**
	 * @generated
	 */
	private IParser getCriteriaContent_5016Parser() {
		if (criteriaContent_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			criteriaContent_5016Parser = parser;
		}
		return criteriaContent_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArgumentIdentifierEditPart.VISUAL_ID:
			return getArgumentIdentifier_5001Parser();
		case ArgumentContentEditPart.VISUAL_ID:
			return getArgumentContent_5002Parser();
		case SolutionIdentifierEditPart.VISUAL_ID:
			return getSolutionIdentifier_5003Parser();
		case SolutionContentEditPart.VISUAL_ID:
			return getSolutionContent_5004Parser();
		case EvidenceIdentifierEditPart.VISUAL_ID:
			return getEvidenceIdentifier_5005Parser();
		case EvidenceContentEditPart.VISUAL_ID:
			return getEvidenceContent_5006Parser();
		case StrategyIdentifierEditPart.VISUAL_ID:
			return getStrategyIdentifier_5007Parser();
		case StrategyContentEditPart.VISUAL_ID:
			return getStrategyContent_5008Parser();
		case AssumptionIdentifierEditPart.VISUAL_ID:
			return getAssumptionIdentifier_5009Parser();
		case AssumptionContentEditPart.VISUAL_ID:
			return getAssumptionContent_5010Parser();
		case JustificationIdentifierEditPart.VISUAL_ID:
			return getJustificationIdentifier_5011Parser();
		case JustificationContentEditPart.VISUAL_ID:
			return getJustificationContent_5012Parser();
		case ContextIdentifierEditPart.VISUAL_ID:
			return getContextIdentifier_5013Parser();
		case ContextContentEditPart.VISUAL_ID:
			return getContextContent_5014Parser();
		case CriteriaIdentifierEditPart.VISUAL_ID:
			return getCriteriaIdentifier_5015Parser();
		case CriteriaContentEditPart.VISUAL_ID:
			return getCriteriaContent_5016Parser();
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
			return getParser(EuzVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(EuzVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (EuzElementTypes.getElement(hint) == null) {
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
