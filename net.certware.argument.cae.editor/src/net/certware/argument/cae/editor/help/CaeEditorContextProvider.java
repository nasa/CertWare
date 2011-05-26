/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.cae.editor.help;

import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.cae.Argument;
import net.certware.argument.cae.Assumption;
import net.certware.argument.cae.Claim;
import net.certware.argument.cae.Context;
import net.certware.argument.cae.Evidence;
import net.certware.argument.cae.Justification;
import net.certware.argument.cae.presentation.CaeEditor;
import net.certware.argument.cae.util.CaeSwitch;
import net.certware.core.ui.help.IHelpContext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;

/**
 * Help context provider for the CAE editor.
 * Provides tree selection context changes not otherwise provided by the controls.
 * Presumes wiring support from the <code>net.certware.argument.cae.help</code> plugin.
 * @author mrb
 * @since 1.0
 */
public class CaeEditorContextProvider implements IContextProvider {

	/** the editor to which this provider is attached */
	private CaeEditor editor;
	
	/**
	 * Constructor saves a reference to the editor.
	 * @param editor editor served for context
	 */
	public CaeEditorContextProvider(CaeEditor editor) {
		super();
		this.editor = editor;
	}
	
	/**
	 * Context changes for editor selections.
	 */
	@Override
	public int getContextChangeMask() {
		return IContextProvider.SELECTION;
	}

	/**
	 * Returns the help system context given the tree selection.
	 * @param target unused
	 * @return help system context given the model element selection context ID
	 */
	@Override
	public IContext getContext(Object target) {
		ISelection selection = editor.getSelection();
		if (selection instanceof TreeSelection) {
			Object element = ((TreeSelection)selection).getFirstElement();
			if ( element instanceof EObject ) {
				EObject eo = (EObject)element;
				return HelpSystem.getContext( contextSwitch.doSwitch(eo) );
			}
		}
        return HelpSystem.getContext(IHelpContext.CAE_EDITOR_DEFAULT);
	}

	/**
	 * Returns a search expression given the tree selection.
	 * @param target unused
	 * @return string for help system search
	 */
	@Override
	public String getSearchExpression(Object target) {
		ISelection selection = editor.getSelection();
		if (selection instanceof TreeSelection) {
			Object element = ((TreeSelection)selection).getFirstElement();
			if ( element instanceof EObject ) {
				EObject eo = (EObject)element;
				return searchSwitch.doSwitch(eo);
			}
		}
        return Messages.CaeEditorContextProvider_0;
	}

	
	/**
	 * Context ID switch for identifying model class by object.
	 */
	public CaeSwitch<String> contextSwitch = new CaeSwitch<String> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseClaim(Claim object) {
			return IHelpContext.CAE_EDITOR_CLAIM;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgument(Argument object) {
			return IHelpContext.CAE_EDITOR_ARGUMENT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseEvidence(Evidence object) {
			return IHelpContext.CAE_EDITOR_EVIDENCE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssumption(Assumption object) {
			return IHelpContext.CAE_EDITOR_ASSUMPTION;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseContext(Context object) {
			return IHelpContext.CAE_EDITOR_CONTEXT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseJustification(Justification object) {
			return IHelpContext.CAE_EDITOR_JUSTIFICATION;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseModelElement(ModelElement object) {
			return IHelpContext.ARM_EDITOR_MODEL_ELEMENT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentElement(ArgumentElement object) {
			return IHelpContext.ARM_EDITOR_ARGUMENT_ELEMENT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseReasoningElement(ReasoningElement object) {
			return IHelpContext.ARM_EDITOR_REASONING_ELEMENT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentLink(ArgumentLink object) {
			return IHelpContext.ARM_EDITOR_ARGUMENT_LINK;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedRelationship(AssertedRelationship object) {
			return IHelpContext.ARM_EDITOR_ASSERTED_RELATIONSHIP;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedEvidence(AssertedEvidence object) {
			return IHelpContext.ARM_EDITOR_ASSERTED_EVIDENCE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseInformationElement(InformationElement object) {
			return IHelpContext.ARM_EDITOR_INFORMATION_ELEMENT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public String defaultCase(EObject object) {
			return IHelpContext.CAE_EDITOR_DEFAULT;
		}

	};

	/**
	 * Search expression switch for identifying model class by object.
	 */
	public CaeSwitch<String> searchSwitch = new CaeSwitch<String> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgument(Argument object) {
			return Messages.CaeEditorContextProvider_1;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssumption(Assumption object) {
			return Messages.CaeEditorContextProvider_2;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseContext(Context object) {
			return Messages.CaeEditorContextProvider_3;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseJustification(Justification object) {
			return Messages.CaeEditorContextProvider_4;
		}
		
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseModelElement(ModelElement object) {
			return Messages.CaeEditorContextProvider_5;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentElement(ArgumentElement object) {
			return Messages.CaeEditorContextProvider_6;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseReasoningElement(ReasoningElement object) {
			return Messages.CaeEditorContextProvider_7;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseClaim(Claim object) {
			return Messages.CaeEditorContextProvider_8;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentLink(ArgumentLink object) {
			return Messages.CaeEditorContextProvider_9;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedRelationship(AssertedRelationship object) {
			return Messages.CaeEditorContextProvider_10;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedEvidence(AssertedEvidence object) {
			return Messages.CaeEditorContextProvider_11;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseInformationElement(InformationElement object) {
			return Messages.CaeEditorContextProvider_12;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public String defaultCase(EObject object) {
			return Messages.CaeEditorContextProvider_13;
		}

	};
}
