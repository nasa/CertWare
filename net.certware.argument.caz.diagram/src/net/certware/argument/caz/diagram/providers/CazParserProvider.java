package net.certware.argument.caz.diagram.providers;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.caz.diagram.edit.parts.ArgumentContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ArgumentIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.AssumptionIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ClaimIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.ContextIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.EvidenceIdentifierEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationContentEditPart;
import net.certware.argument.caz.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.caz.diagram.parsers.MessageFormatParser;
import net.certware.argument.caz.diagram.part.CazVisualIDRegistry;

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
public class CazParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser claimIdentifier_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClaimIdentifier_5001Parser() {
		if (claimIdentifier_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Claim {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Claim {0}"); //$NON-NLS-1$
			parser.setEditPattern("Claim {0}"); //$NON-NLS-1$
			claimIdentifier_5001Parser = parser;
		}
		return claimIdentifier_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser claimContent_5002Parser;

	/**
	 * @generated
	 */
	private IParser getClaimContent_5002Parser() {
		if (claimContent_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			claimContent_5002Parser = parser;
		}
		return claimContent_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser evidenceIdentifier_5003Parser;

	/**
	 * @generated
	 */
	private IParser getEvidenceIdentifier_5003Parser() {
		if (evidenceIdentifier_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Evidence {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Evidence {0}"); //$NON-NLS-1$
			parser.setEditPattern("Evidence {0}"); //$NON-NLS-1$
			evidenceIdentifier_5003Parser = parser;
		}
		return evidenceIdentifier_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser evidenceContent_5004Parser;

	/**
	 * @generated
	 */
	private IParser getEvidenceContent_5004Parser() {
		if (evidenceContent_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			evidenceContent_5004Parser = parser;
		}
		return evidenceContent_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentIdentifier_5005Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentIdentifier_5005Parser() {
		if (argumentIdentifier_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Argument {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Argument {0}"); //$NON-NLS-1$
			parser.setEditPattern("Argument {0}"); //$NON-NLS-1$
			argumentIdentifier_5005Parser = parser;
		}
		return argumentIdentifier_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser argumentContent_5006Parser;

	/**
	 * @generated
	 */
	private IParser getArgumentContent_5006Parser() {
		if (argumentContent_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			argumentContent_5006Parser = parser;
		}
		return argumentContent_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionIdentifier_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionIdentifier_5007Parser() {
		if (assumptionIdentifier_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Assumption {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assumption {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assumption {0}"); //$NON-NLS-1$
			assumptionIdentifier_5007Parser = parser;
		}
		return assumptionIdentifier_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser assumptionContent_5008Parser;

	/**
	 * @generated
	 */
	private IParser getAssumptionContent_5008Parser() {
		if (assumptionContent_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			assumptionContent_5008Parser = parser;
		}
		return assumptionContent_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationIdentifier_5009Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationIdentifier_5009Parser() {
		if (justificationIdentifier_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Justification {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Justification {0}"); //$NON-NLS-1$
			parser.setEditPattern("Justification {0}"); //$NON-NLS-1$
			justificationIdentifier_5009Parser = parser;
		}
		return justificationIdentifier_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationContent_5010Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationContent_5010Parser() {
		if (justificationContent_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationContent_5010Parser = parser;
		}
		return justificationContent_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextIdentifier_5011Parser;

	/**
	 * @generated
	 */
	private IParser getContextIdentifier_5011Parser() {
		if (contextIdentifier_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Context {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Context {0}"); //$NON-NLS-1$
			parser.setEditPattern("Context {0}"); //$NON-NLS-1$
			contextIdentifier_5011Parser = parser;
		}
		return contextIdentifier_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextContent_5012Parser;

	/**
	 * @generated
	 */
	private IParser getContextContent_5012Parser() {
		if (contextContent_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Content() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextContent_5012Parser = parser;
		}
		return contextContent_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ClaimIdentifierEditPart.VISUAL_ID:
			return getClaimIdentifier_5001Parser();
		case ClaimContentEditPart.VISUAL_ID:
			return getClaimContent_5002Parser();
		case EvidenceIdentifierEditPart.VISUAL_ID:
			return getEvidenceIdentifier_5003Parser();
		case EvidenceContentEditPart.VISUAL_ID:
			return getEvidenceContent_5004Parser();
		case ArgumentIdentifierEditPart.VISUAL_ID:
			return getArgumentIdentifier_5005Parser();
		case ArgumentContentEditPart.VISUAL_ID:
			return getArgumentContent_5006Parser();
		case AssumptionIdentifierEditPart.VISUAL_ID:
			return getAssumptionIdentifier_5007Parser();
		case AssumptionContentEditPart.VISUAL_ID:
			return getAssumptionContent_5008Parser();
		case JustificationIdentifierEditPart.VISUAL_ID:
			return getJustificationIdentifier_5009Parser();
		case JustificationContentEditPart.VISUAL_ID:
			return getJustificationContent_5010Parser();
		case ContextIdentifierEditPart.VISUAL_ID:
			return getContextIdentifier_5011Parser();
		case ContextContentEditPart.VISUAL_ID:
			return getContextContent_5012Parser();
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
			return getParser(CazVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CazVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CazElementTypes.getElement(hint) == null) {
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
