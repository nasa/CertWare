/*
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.diagram.providers;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.gsn.diagram.edit.parts.GoalAssumedEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalIdentifierEditPart;
import net.certware.argument.gsn.diagram.edit.parts.GoalToBeSupportedEditPart;
import net.certware.argument.gsn.diagram.edit.parts.JustificationIdentifierEditPart;
import net.certware.argument.gsn.diagram.parsers.MessageFormatParser;
import net.certware.argument.gsn.diagram.part.GsnVisualIDRegistry;

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
public class GsnParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser goalIdentifier_5011Parser;

	/**
	 * @generated
	 */
	private IParser getGoalIdentifier_5011Parser() {
		if (goalIdentifier_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Goal {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Goal {0}"); //$NON-NLS-1$
			parser.setEditPattern("Goal {0}"); //$NON-NLS-1$
			goalIdentifier_5011Parser = parser;
		}
		return goalIdentifier_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalAssumed_5012Parser;

	/**
	 * @generated
	 */
	private IParser getGoalAssumed_5012Parser() {
		if (goalAssumed_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getClaim_Assumed() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalAssumed_5012Parser = parser;
		}
		return goalAssumed_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalToBeSupported_5013Parser;

	/**
	 * @generated
	 */
	private IParser getGoalToBeSupported_5013Parser() {
		if (goalToBeSupported_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getClaim_ToBeSupported() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalToBeSupported_5013Parser = parser;
		}
		return goalToBeSupported_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser justificationIdentifier_5010Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationIdentifier_5010Parser() {
		if (justificationIdentifier_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ArmPackage.eINSTANCE
					.getModelElement_Identifier() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationIdentifier_5010Parser = parser;
		}
		return justificationIdentifier_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GoalIdentifierEditPart.VISUAL_ID:
			return getGoalIdentifier_5011Parser();
		case GoalAssumedEditPart.VISUAL_ID:
			return getGoalAssumed_5012Parser();
		case GoalToBeSupportedEditPart.VISUAL_ID:
			return getGoalToBeSupported_5013Parser();
		case JustificationIdentifierEditPart.VISUAL_ID:
			return getJustificationIdentifier_5010Parser();
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
			return getParser(GsnVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GsnVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GsnElementTypes.getElement(hint) == null) {
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
