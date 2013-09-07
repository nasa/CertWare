/**
 * CertWare Project
 * Copyright (c) 2010-2013 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.export.sacm.jobs;

import java.util.Collection;

import javax.xml.bind.JAXBException;

import net.certware.core.ui.log.CertWareLog;
import net.certware.export.jobs.AbstractExportJob;
import net.certware.sacm.SACM.Annotation;
import net.certware.sacm.SACM.ModelElement;
import net.certware.sacm.SACM.SACMPackage;
import net.certware.sacm.SACM.TaggedValue;
import net.certware.sacm.SACM.Argumentation.ArgumentElement;
import net.certware.sacm.SACM.Argumentation.ArgumentReasoning;
import net.certware.sacm.SACM.Argumentation.AssertedChallenge;
import net.certware.sacm.SACM.Argumentation.AssertedContext;
import net.certware.sacm.SACM.Argumentation.AssertedCounterEvidence;
import net.certware.sacm.SACM.Argumentation.AssertedEvidence;
import net.certware.sacm.SACM.Argumentation.AssertedInference;
import net.certware.sacm.SACM.Argumentation.AssertedRelationship;
import net.certware.sacm.SACM.Argumentation.CitationElement;
import net.certware.sacm.SACM.Argumentation.Claim;
import net.certware.sacm.SACM.Argumentation.InformationElement;
import net.certware.sacm.SACM.Argumentation.ReasoningElement;
import net.certware.sacm.SACM.Evidence.EvidenceAssertion;
import net.certware.sacm.SACM.util.SACMSwitch;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.wml.P;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Exports ARM model elements to a document file.
 * Designed as well to be super class of exporting jobs for models extending ARM notation.
 * @author mrb
 * @since 1.0
 */
public class ExportSACMJob extends AbstractExportJob {

	/**
	 * Default constructor, default name.
	 */
	public ExportSACMJob() {
		super();
	}

	/**
	 * Create the export job with a name.
	 * @param name job name
	 */
	public ExportSACMJob(String name) {
		super(name);
	}

	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export
	 */
	public ExportSACMJob(String name, EObject node) {
		super(name,node);
	}

	/** 
	 * Create the export job with a collection of nodes.
	 * @param name job name
	 * @param nodes selected node collection to export
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ExportSACMJob(String name, Collection nodes ) {
		super(name,nodes);
	}

	/**
	 * Create the export job with the selected resource.
	 * @param name job name
	 * @param resource resource to export
	 */
	public ExportSACMJob(String name, Resource resource ) {
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
	public SACMSwitch<Boolean> visitor = new SACMSwitch<Boolean>() {
		private boolean writeTagsHeader;
		private boolean writeArgumentElementHeader;
		private boolean writeArgumentLinkHeader;
		private boolean writeAssertedRelationshipHeader;
		@SuppressWarnings("unused")
		private boolean writeSourceHeader;
		@SuppressWarnings("unused")
		private boolean writeTargetHeader;
		private boolean writeAssertedInferenceHeader;
		private boolean writeAssertedEvidenceHeader;
		private boolean writeAssertedContextHeader;
		private boolean writeAssertedCounterEvidenceHeader;
		private boolean writeAssertedChallengeHeader;

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

			// prefix, identifier, description, and content
			// tagged values visited in a different case
			//Br b = factory.createBr();
			//b.setType(STBrType.TEXT_WRAPPING);
			P modelElementParagraph = factory.createP();
			String id = me.getIdentifier();
			String heading = prefix + ' ' + me.getIdentifier();
			if ( id.startsWith(prefix) )
				heading = me.getIdentifier();
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.MODEL_ELEMENT),heading));
			//modelElementParagraph.getParagraphContent().add( factory.createRTab() );
			//modelElementParagraph.getParagraphContent().add( factory.createRTab() );
			//modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.MODEL_ELEMENT__IDENTIFIER),me.getIdentifier()));
			// modelElementParagraph.getParagraphContent().add( factory.createRCr());
			modelElementParagraph.getParagraphContent().add( factory.createBr());
			modelElementParagraph.getParagraphContent().add( addRunOfText("Description: "));
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.MODEL_ELEMENT__DESCRIPTION),me.getDescription()));
			modelElementParagraph.getParagraphContent().add( factory.createBr());
			modelElementParagraph.getParagraphContent().add( addRunOfText("Content: "));
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.MODEL_ELEMENT__CONTENT),me.getContent()));
			mainDocumentPart.addObject(modelElementParagraph);

			// tags header, if any
			writeTagsHeader = me.getIsTagged().isEmpty() == false;

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * @param taggedValue the target of the switch.
		 * @return always returns null
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseTaggedValue(TaggedValue taggedValue) {
			if ( writeTagsHeader ) {
				addStyledText(styleMap.get(SACMPackage.TAGGED_VALUE),"Tags");
				writeTagsHeader = false;
			}
			
			P tagLine = factory.createP();
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE),"Key:"));
			tagLine.getParagraphContent().add( addRunOfText(" "));
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE__KEY),taggedValue.getKey()));
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE),"Value:"));
			tagLine.getParagraphContent().add( addRunOfText(" "));
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE__VALUE),taggedValue.getValue()));
			mainDocumentPart.addObject(tagLine);

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @param argument the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgument(Argument argument) {
			// identifier, description, and content
			caseModelElement("Argument",argument);

			// headers, if any
			writeArgumentElementHeader = argument.getContainsArgumentElement().isEmpty() == false;
			writeArgumentLinkHeader = argument.getContainsArgumentLink().isEmpty() == false;

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @param argumentElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentElement(ArgumentElement argumentElement) {
			if ( writeArgumentElementHeader ) {
				addStyledText(styleMap.get(SACMPackage.ARGUMENT_ELEMENT),"Argument Elements");
				writeArgumentElementHeader = false;
			}

			caseModelElement("Argument Element",argumentElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @param argumentLink the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentLink(ArgumentLink argumentLink) {
			if ( writeArgumentLinkHeader ) {
				addStyledText(styleMap.get(SACMPackage.ARGUMENT_ELEMENT), "Argument Links");
				writeArgumentLinkHeader = false;
			}

			caseModelElement("Argument Link", argumentLink);

			if ( argumentLink.getSource().isEmpty() == false ) {
				writeSourceHeader = true;
			}
			if ( argumentLink.getTarget().isEmpty() == false ) {
				writeTargetHeader = true;
			}

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @param assertedRelationship the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedRelationship(AssertedRelationship assertedRelationship) {
			if ( writeAssertedRelationshipHeader ) {
				addStyledText(styleMap.get(SACMPackage.ASSERTED_RELATIONSHIP), "Asserted Relationship");
				writeAssertedRelationshipHeader = false;
			}

			caseModelElement("Asserted Relationship", assertedRelationship);

			if ( assertedRelationship.getSource().isEmpty() == false ) {
				writeSourceHeader = true;
			}
			if ( assertedRelationship.getTarget().isEmpty() == false ) {
				writeTargetHeader = true;
			}
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * @param annotation the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAnnotation(Annotation annotation) {
			caseArgumentLink(annotation);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
		 * @param assertedInference the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedInference(AssertedInference assertedInference) {
			if ( writeAssertedInferenceHeader ) {
				addStyledText(styleMap.get(SACMPackage.ASSERTED_INFERENCE), "Asserted Inference");
				writeAssertedInferenceHeader = false;
			}

			caseAssertedRelationship(assertedInference);

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
				addStyledText(styleMap.get(SACMPackage.ASSERTED_EVIDENCE), "Asserted Evidence");
				writeAssertedEvidenceHeader = false;
			}

			caseAssertedRelationship(assertedEvidence);

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
		 * @param assertedContext the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedContext(AssertedContext assertedContext) {
			if ( writeAssertedContextHeader ) {
				addStyledText(styleMap.get(SACMPackage.ASSERTED_CONTEXT), "Asserted Context");
				writeAssertedContextHeader = false;
			}

			caseAssertedRelationship(assertedContext);

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
		 * @param assertedCounterEvidence the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedCounterEvidence(AssertedCounterEvidence assertedCounterEvidence) {
			if ( writeAssertedCounterEvidenceHeader ) {
				addStyledText(styleMap.get(SACMPackage.ASSERTED_COUNTER_EVIDENCE), "Asserted Counter-Evidence");
				writeAssertedCounterEvidenceHeader = false;
			}
			caseAssertedRelationship(assertedCounterEvidence);

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
		 * @param assertedChallenge the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedChallenge(AssertedChallenge assertedChallenge) {
			if ( writeAssertedChallengeHeader ) {
				addStyledText(styleMap.get(SACMPackage.ASSERTED_CHALLENGE), "Asserted Challenge");
				writeAssertedChallengeHeader = false;
			}

			caseAssertedRelationship(assertedChallenge);

			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @param reasoningElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		@SuppressWarnings("unused")
		public Boolean caseReasoningElement(ReasoningElement reasoningElement) {
			caseModelElement("Reasoning Element", reasoningElement);
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
	 * Returns the visitor for the ARM model traversal.
	 * @return visitor suitable for ARM switch 
	 */
	public SACMSwitch<Boolean> getVisitor() {
		return visitor;
	}

	/**
	 * Setup a style for each model element type.
	 * Calls super class to override with plugin contributions.
	 */
	public void loadStyleMap() {

		// each model element can have its own style
		// for convenience we use the model element literals as keys 
		styleMap.put(SACMPackage.ANNOTATION, new StyleEntry(false, "Annotation"));
		styleMap.put(SACMPackage.ARGUMENT, new StyleEntry(true,"Argument"));
		styleMap.put(SACMPackage.ARGUMENT_ELEMENT,new StyleEntry(false,"ArgumentElement"));
		styleMap.put(SACMPackage.ARGUMENT_LINK, new StyleEntry(false,"ArgumentLink"));
		styleMap.put(SACMPackage.ARGUMENT_LINK__SOURCE, new StyleEntry(false,"ArgumentLinkSource"));
		styleMap.put(SACMPackage.ARGUMENT_LINK__TARGET, new StyleEntry(false,"ArgumentLinkTarget"));
		styleMap.put(SACMPackage.ARGUMENT_REASONING__DESCRIBES, new StyleEntry(false,"ArgumentReasoningDescribes"));
		styleMap.put(SACMPackage.ARGUMENT_REASONING__HAS_STRUCTURE, new StyleEntry(false,"ArgumentReasoningHasStructure"));
		styleMap.put(SACMPackage.ARGUMENT__CONTAINS_ARGUMENT,new StyleEntry(false,"ArgumentContainsArgument"));
		styleMap.put(SACMPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT, new StyleEntry(false,"ArgumentContainsArgumentElement"));
		styleMap.put(SACMPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK,new StyleEntry(false,"ArgumentContainsArgumentLink"));
		styleMap.put(SACMPackage.ARGUMENT_REASONING, new StyleEntry(false,"ArgumentReasoning"));
		styleMap.put(SACMPackage.ASSERTED_CHALLENGE, new StyleEntry(false,"AssertedChallenge"));
		styleMap.put(SACMPackage.ASSERTED_CONTEXT, new StyleEntry(false,"AssertedContext"));
		styleMap.put(SACMPackage.ASSERTED_COUNTER_EVIDENCE, new StyleEntry(false,"AssertedCounterEvidence"));
		styleMap.put(SACMPackage.ASSERTED_EVIDENCE, new StyleEntry(false,"AssertedEvidence"));
		styleMap.put(SACMPackage.ASSERTED_INFERENCE, new StyleEntry(false,"AssertedInference"));
		styleMap.put(SACMPackage.ASSERTED_RELATIONSHIP, new StyleEntry(false,"AssertedRelationship"));
		styleMap.put(SACMPackage.CITATION_ELEMENT, new StyleEntry(false,"CitationElement"));
		styleMap.put(SACMPackage.CITATION_ELEMENT__REFERS_TO_ARGUMENT, new StyleEntry(false,"CitationElementRefersToArgument"));
		styleMap.put(SACMPackage.CITATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT, new StyleEntry(false,"CitationElementRefersToArgumentElement"));
		styleMap.put(SACMPackage.CLAIM, new StyleEntry(false,"Claim"));
		styleMap.put(SACMPackage.CLAIM__ASSUMED, new StyleEntry(false,"ClaimAssumed"));
		styleMap.put(SACMPackage.CLAIM__TO_BE_SUPPORTED, new StyleEntry(false,"ClaimToBeSupported"));
		styleMap.put(SACMPackage.EVIDENCE_ASSERTION, new StyleEntry(false,"EvidenceAssertion"));
		styleMap.put(SACMPackage.INFORMATION_ELEMENT, new StyleEntry(false,"InformationElement"));
		styleMap.put(SACMPackage.MODEL_ELEMENT, new StyleEntry(false,"ModelElement")); 
		styleMap.put(SACMPackage.MODEL_ELEMENT__CONTENT, new StyleEntry(false,"ModelElementContent"));
		styleMap.put(SACMPackage.MODEL_ELEMENT__DESCRIPTION, new StyleEntry(false,"ModelElementDescription"));
		styleMap.put(SACMPackage.MODEL_ELEMENT__IDENTIFIER, new StyleEntry(false,"ModelElementIdentifier"));
		styleMap.put(SACMPackage.MODEL_ELEMENT__IS_TAGGED, new StyleEntry(false,"ModelElementIsTagged"));
		styleMap.put(SACMPackage.REASONING_ELEMENT, new StyleEntry(false,"ReasoningElement"));
		styleMap.put(SACMPackage.TAGGED_VALUE,new StyleEntry(false, "TaggedValue"));
		styleMap.put(SACMPackage.TAGGED_VALUE__KEY, new StyleEntry(false,"TaggedValueKey"));
		styleMap.put(SACMPackage.TAGGED_VALUE__VALUE, new StyleEntry(false,"TaggedValueValue"));

		assignStyleId(SACMPackage.MODEL_ELEMENT__CONTENT,true,"Heading2Char"); // TODO testing
		assignStyleId(SACMPackage.ARGUMENT_ELEMENT__CONTENT,false,"Heading3Char"); // TODO testing

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
			if ( rv == Status.OK_STATUS ) {
				tearDownDocument(monitor,true);
			}
		} catch (JAXBException e) {
			CertWareLog.logError("Exporting SACM document", e);
		} catch (Docx4JException e) {
			CertWareLog.logError("Exporting SACM document", e);
		}

		cleanupJob(monitor,rv);
		return rv;
	}

}
