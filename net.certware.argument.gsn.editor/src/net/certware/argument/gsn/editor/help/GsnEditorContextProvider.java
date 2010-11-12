/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsn.editor.help;

import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.presentation.GsnEditor;
import net.certware.argument.gsn.util.GsnSwitch;
import net.certware.core.ui.help.IHelpContext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;

/**
 * Help context provider for the GSN editor.
 * Provides tree selection context changes not otherwise provided by the controls.
 * Presumes wiring support from the <code>net.certware.argument.gsn.help</code> plugin.
 * @author mrb
 * @since 1.0
 */
public class GsnEditorContextProvider implements IContextProvider {

	private GsnEditor editor;
	
	public GsnEditorContextProvider(GsnEditor editor) {
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
        return HelpSystem.getContext(IHelpContext.GSN_EDITOR_DEFAULT);
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
        return "\"goal\" + \"structuring\" + \"notation\"";
	}

	
	/**
	 * Context ID switch for identifying model class by object.
	 */
	public GsnSwitch<String> contextSwitch = new GsnSwitch<String> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseGoal(Goal object) {
			return IHelpContext.GSN_EDITOR_GOAL;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseStrategy(Strategy object) {
			return IHelpContext.GSN_EDITOR_STRATEGY;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseSolution(Solution object) {
			return IHelpContext.GSN_EDITOR_SOLUTION;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssumption(Assumption object) {
			return IHelpContext.GSN_EDITOR_ASSUMPTION;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseContext(Context object) {
			return IHelpContext.GSN_EDITOR_CONTEXT;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseJustification(Justification object) {
			return IHelpContext.GSN_EDITOR_JUSTIFICATION;
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
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param object the target of the switch.
		 * @return the context ID
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseClaim(Claim object) {
			return IHelpContext.ARM_EDITOR_CLAIM_ELEMENT;
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
			return IHelpContext.GSN_EDITOR_DEFAULT;
		}

	};

	/**
	 * Search expression switch for identifying model class by object.
	 */
	public GsnSwitch<String> searchSwitch = new GsnSwitch<String> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseGoal(Goal object) {
			return "goal";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseStrategy(Strategy object) {
			return "strategy";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseSolution(Solution object) {
			return "solution";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssumption(Assumption object) {
			return "assumption";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseContext(Context object) {
			return "context";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseJustification(Justification object) {
			return "justification";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseModelElement(ModelElement object) {
			return "\"model\" + \"element\"";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentElement(ArgumentElement object) {
			return "\"argument\" + \"element\"";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseReasoningElement(ReasoningElement object) {
			return "\"reasoning\" + \"element\"";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseClaim(Claim object) {
			return "claim";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseArgumentLink(ArgumentLink object) {
			return "\"argument\" + \"link\"";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedRelationship(AssertedRelationship object) {
			return "\"asserted\" + \"relationship\"";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseAssertedEvidence(AssertedEvidence object) {
			return "\"asserted\" + \"evidence\"";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public String caseInformationElement(InformationElement object) {
			return "\"information\" + \"element\"";
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @param object the target of the switch.
		 * @return the search expression
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public String defaultCase(EObject object) {
			return "\"goal\" + \"structuring\" + \"notation\"";
		}

	};
}
