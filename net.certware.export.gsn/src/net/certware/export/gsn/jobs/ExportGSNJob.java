/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.export.gsn.jobs;

import java.util.Collection;

import javax.xml.bind.JAXBException;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Evidence;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.util.GsnSwitch;
import net.certware.core.ui.log.CertWareLog;
import net.certware.export.jobs.AbstractExportJob;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.wml.P;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Exports GSN model elements to a document file.
 * Designed as well to be super class of exporting jobs for models extending GSN notation.
 * @author mrb
 * @since 1.0
 */
public class ExportGSNJob extends AbstractExportJob {

	/**
	 * Default constructor, default name.
	 */
	public ExportGSNJob() {
		super();
	}

	/**
	 * Create the export job with a name.
	 * @param name job name
	 */
	public ExportGSNJob(String name) {
		super(name);
	}

	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export
	 */
	public ExportGSNJob(String name, EObject node) {
		super(name,node);
	}

	/** 
	 * Create the export job with a collection of nodes.
	 * @param name job name
	 * @param nodes selected node collection to export
	 */
	public ExportGSNJob(String name, Collection nodes ) {
		super(name,nodes);
	}

	/**
	 * Create the export job with the selected resource.
	 * @param name job name
	 * @param resource resource to export
	 */
	public ExportGSNJob(String name, Resource resource ) {
		super(name,resource);
	}

	@Override
	protected void doSwitch(EObject eObject) {
		visitor.doSwitch(eObject);
	}
	
	
	/**
	 * Visitor to pass to the model's tree iterator.
	 * Overrides the case methods of the generated switch class.
	 */
	public GsnSwitch<Boolean> visitor = new GsnSwitch<Boolean>() {
		@SuppressWarnings("unused")
		private boolean writeTagsHeader;
		private boolean writeAssertedEvidenceHeader;

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @param me the target of the switch.
		 * @param prefix model element type prefix
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseModelElement(String prefix, ModelElement me) {
			// prefix, identifier, description, and content
			// tagged values visited in a different case
			P modelElementParagraph = factory.createP();
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(ArmPackage.MODEL_ELEMENT),prefix));
			modelElementParagraph.getParagraphContent().add( addRunOfText(" "));
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(ArmPackage.MODEL_ELEMENT__IDENTIFIER),me.getIdentifier()));
			modelElementParagraph.getParagraphContent().add( addRunOfText("\nDescription: "));
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(ArmPackage.MODEL_ELEMENT__DESCRIPTION),me.getDescription()));
			modelElementParagraph.getParagraphContent().add( addRunOfText("\nContent: "));
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(ArmPackage.MODEL_ELEMENT__CONTENT),me.getContent()));
			mainDocumentPart.addObject(modelElementParagraph);

			// tags header, if any
			writeTagsHeader = me.getIsTagged().isEmpty() == false;

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @param assertedEvidence the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedEvidence(AssertedEvidence assertedEvidence) {
			if ( writeAssertedEvidenceHeader ) {
				addStyledText(styleMap.get(ArmPackage.ASSERTED_EVIDENCE), "Asserted Evidence");
				writeAssertedEvidenceHeader = false;
			}

			caseAssertedRelationship(assertedEvidence);

			return Boolean.TRUE;
		}


		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param claim the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseClaim(Claim claim) {
			caseModelElement("Claim", claim);
			return Boolean.TRUE;
		}


		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @param informationElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseInformationElement(InformationElement informationElement) {
			caseArgumentElement(informationElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseGoal(Goal goal) {
			caseModelElement("Goal",goal);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseStrategy(Strategy strategy) {
			caseModelElement("Strategy",strategy);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseSolution(Solution solution) {
			caseModelElement("Solution",solution);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssumption(Assumption assumption) {
			caseModelElement("Assumption",assumption);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseContext(Context context) {
			caseModelElement("Context",context);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseJustification(Justification justification) {
			caseModelElement("Justification",justification);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
		 * @param object the target of the switch.
		 * @return always returns TRUE
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseEvidence(Evidence evidence) {
			caseModelElement("Evidence",evidence);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @param object the target of the switch.
		 * @return always returns null
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public Boolean defaultCase(EObject object) {
			return Boolean.TRUE;
		}
	};

	/**
	 * Returns the visitor for the GSN model traversal.
	 * @return visitor suitable for GSN switch 
	 */
	public GsnSwitch<Boolean> getVisitor() {
		return visitor;
	}

	/**
	 * Setup a style for each model element type.
	 * Calls super class to override with plugin contributions.
	 */
	public void loadStyleMap() {

		// each model element can have its own style
		// for convenience we use the model element literals as keys
		styleMap.put(GsnPackage.ASSUMPTION, new StyleEntry(true,"Assumption"));
		styleMap.put(GsnPackage.ASSUMPTION__CONTENT, new StyleEntry(false,"AssumptionContent"));
		styleMap.put(GsnPackage.ASSUMPTION__DESCRIPTION, new StyleEntry(false,"AssumptionDescription"));
		styleMap.put(GsnPackage.ASSUMPTION__IDENTIFIER,new StyleEntry(false,"AssumptionIdentifier"));
		styleMap.put(GsnPackage.ASSUMPTION__IS_TAGGED, new StyleEntry(false,"AssumptionIsTagged"));

		styleMap.put(GsnPackage.CONTEXT, new StyleEntry(true,"Context"));
		styleMap.put(GsnPackage.CONTEXT__CONTENT,new StyleEntry(false,"ContextContent"));
		styleMap.put(GsnPackage.CONTEXT__DESCRIPTION,new StyleEntry(false,"ContextDescription"));
		styleMap.put(GsnPackage.CONTEXT__IDENTIFIER,new StyleEntry(false,"ContextIdentifier"));
		styleMap.put(GsnPackage.CONTEXT__IS_TAGGED,new StyleEntry(false,"ContextIsTagged"));
		
		styleMap.put(GsnPackage.EVIDENCE,new StyleEntry(true,"Evidence"));
		styleMap.put(GsnPackage.EVIDENCE__CONTENT,new StyleEntry(false,"EvidenceContent"));
		styleMap.put(GsnPackage.EVIDENCE__DESCRIPTION,new StyleEntry(false,"EvidenceDescription"));
		styleMap.put(GsnPackage.EVIDENCE__IDENTIFIER,new StyleEntry(false,"EvidenceIdentifier"));
		styleMap.put(GsnPackage.EVIDENCE__IS_TAGGED,new StyleEntry(false,"EvidenceIsTagged"));
		styleMap.put(GsnPackage.EVIDENCE__SOURCE,new StyleEntry(false,"EvidenceSource"));
		styleMap.put(GsnPackage.EVIDENCE__TARGET,new StyleEntry(false,"EvidenceTarget"));

		styleMap.put(GsnPackage.GOAL,new StyleEntry(true,"Goal"));
		styleMap.put(GsnPackage.GOAL__ASSUMED,new StyleEntry(false,"GoalAssumed"));
		styleMap.put(GsnPackage.GOAL__ASSUMPTIONS,new StyleEntry(false,"GoalAssumptions"));
		styleMap.put(GsnPackage.GOAL__CONTENT,new StyleEntry(false,"GoalContent"));
		styleMap.put(GsnPackage.GOAL__DESCRIPTION,new StyleEntry(false,"GoalDescription"));
		styleMap.put(GsnPackage.GOAL__GOAL_CONTEXTS,new StyleEntry(false,"GoalGoalContexts"));
		styleMap.put(GsnPackage.GOAL__GOAL_SOLUTIONS,new StyleEntry(false,"GoalGoalSolutions"));
		styleMap.put(GsnPackage.GOAL__IDENTIFIER,new StyleEntry(false,"GoalIdentifier"));
		styleMap.put(GsnPackage.GOAL__IS_TAGGED,new StyleEntry(false,"GoalIsTagged"));
		styleMap.put(GsnPackage.GOAL__STRATEGIES,new StyleEntry(false,"GoalStrategies"));
		styleMap.put(GsnPackage.GOAL__SUB_GOALS,new StyleEntry(false,"GoalSubGoals"));
		styleMap.put(GsnPackage.GOAL__TO_BE_SUPPORTED,new StyleEntry(false,"GoalToBeSupported"));

		styleMap.put(GsnPackage.JUSTIFICATION,new StyleEntry(true,"Justification"));
		styleMap.put(GsnPackage.JUSTIFICATION__CONTENT,new StyleEntry(false,"JustificationContent"));
		styleMap.put(GsnPackage.JUSTIFICATION__DESCRIPTION,new StyleEntry(false,"JustificationDescription"));
		styleMap.put(GsnPackage.JUSTIFICATION__IDENTIFIER,new StyleEntry(false,"JustificationIdentifier"));
		styleMap.put(GsnPackage.JUSTIFICATION__IS_TAGGED,new StyleEntry(false,"JustificationIsTagged"));

		styleMap.put(GsnPackage.SOLUTION,new StyleEntry(true,"Solution"));
		styleMap.put(GsnPackage.SOLUTION__CONTENT,new StyleEntry(false,"SolutionContent"));
		styleMap.put(GsnPackage.SOLUTION__DESCRIPTION,new StyleEntry(false,"SolutionDescription"));
		styleMap.put(GsnPackage.SOLUTION__IDENTIFIER,new StyleEntry(false,"SolutionIdentifier"));
		styleMap.put(GsnPackage.SOLUTION__IS_TAGGED,new StyleEntry(false,"SolutionIsTagged"));
		styleMap.put(GsnPackage.SOLUTION__SOLUTION_CONTEXTS,new StyleEntry(false,"SolutionSolutionContexts"));
		styleMap.put(GsnPackage.SOLUTION__SOLUTION_EVIDENCE,new StyleEntry(false,"SolutionSolutionEvidence"));
		styleMap.put(GsnPackage.SOLUTION__SOURCE,new StyleEntry(false,"SolutionSource"));
		styleMap.put(GsnPackage.SOLUTION__TARGET,new StyleEntry(false,"SolutionTarget"));

		// TODO override above strings with default styles; let the extension point take care of custom names
		
		// override with plugin contributions
		loadContributedStyles();
	}
	/**
	 * Produces the export content.
	 * Calls setup and test methods, then checks return value for tear-down.
	 * @param monitor progress monitor
	 * @return IStatus OK on success, CANCEL if export canceled by user
	 */
	public IStatus produce(IProgressMonitor monitor) {
		IStatus rv = Status.OK_STATUS;

		// setup, produce, and tear-down the document
		try {
			loadStyleMap();
			setupDocument(monitor);
			rv = exportSelection(monitor);
			if ( rv.equals(Status.OK_STATUS )) {
				tearDownDocument(monitor,true);
			}
		} catch (JAXBException e) {
			CertWareLog.logError("Exporting word document", e);
		} catch (Docx4JException e) {
			CertWareLog.logError("Exporting word document", e);
		}

		cleanupJob(monitor,rv);
		return rv;
	}

}
