/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.arm.editor.help;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.arm.presentation.ArmEditor;
import net.certware.argument.arm.util.ArmSwitch;
import net.certware.core.ui.help.IHelpContext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;

/**
 * Help context provider for the ARM editor.
 * Provides tree selection context changes not otherwise provided by the controls.
 * Presumes wiring support from the <code>net.certware.argument.arm.help</code> plugin.
 * @author mrb
 * @since 1.0
 */
public class ArmEditorContextProvider implements IContextProvider {

	/** the editor to which this provider is attached */
	private ArmEditor editor;
	
	/**
	 * Constructor saves a reference to the editor.
	 * @param editor editor served for context
	 */
	public ArmEditorContextProvider(ArmEditor editor) {
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
        return Messages.ArmEditorContextProvider_0;
	}

	
	/**
	 * Context ID switch for identifying model class by object.
	 */
	public ArmSwitch<String> contextSwitch = new ArmSwitch<String> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseClaim(Claim object) {
			return IHelpContext.ARM_EDITOR_CLAIM_ELEMENT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgument(Argument object) {
			return IHelpContext.ARM_EDITOR_ARGUMENT_ELEMENT;
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
	public ArmSwitch<String> searchSwitch = new ArmSwitch<String> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgument(Argument object) {
			return Messages.ArmEditorContextProvider_1;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseModelElement(ModelElement object) {
			return Messages.ArmEditorContextProvider_2;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentElement(ArgumentElement object) {
			return Messages.ArmEditorContextProvider_3;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseReasoningElement(ReasoningElement object) {
			return Messages.ArmEditorContextProvider_4;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseClaim(Claim object) {
			return Messages.ArmEditorContextProvider_5;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentLink(ArgumentLink object) {
			return Messages.ArmEditorContextProvider_6;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedRelationship(AssertedRelationship object) {
			return Messages.ArmEditorContextProvider_7;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedEvidence(AssertedEvidence object) {
			return Messages.ArmEditorContextProvider_8;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseInformationElement(InformationElement object) {
			return Messages.ArmEditorContextProvider_9;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public String defaultCase(EObject object) {
			return Messages.ArmEditorContextProvider_10;
		}

	};
}
