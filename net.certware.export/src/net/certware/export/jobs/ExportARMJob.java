/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.export.jobs;

import java.io.File;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import net.certware.argument.arm.Annotation;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.AssertedChallenge;
import net.certware.argument.arm.AssertedContext;
import net.certware.argument.arm.AssertedCounterEvidence;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.CitationElement;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.EvidenceAssertion;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.util.ArmSwitch;
import net.certware.core.ui.log.CertWareLog;

import org.docx4j.convert.out.flatOpcXml.FlatOpcXmlCreator;
import org.docx4j.jaxb.NamespacePrefixMapperUtils;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.ObjectFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Exports ARM model elements to a document file.
 * Designed as well to be super class of exporting jobs for models extending ARM notation.
 * @author mrb
 * @since 1.0
 */
public class ExportARMJob extends AbstractExportJob {

	/** the word mark-up language package for the document */
	protected WordprocessingMLPackage wordMLPackage;
	/** the main document part from an incoming document file */
	protected MainDocumentPart mainDocumentPart = null;
	/** style map populated by extension point */
	protected Map<EModelElement,String> styleMap = new HashMap<EModelElement,String>();
	/** document object creation factory, created at run-time */
	protected ObjectFactory factory;

	/**
	 * Default constructor, default name.
	 */
	public ExportARMJob() {
		super();
	}
	
	/**
	 * Create the export job with a name.
	 * @param name job name
	 */
	public ExportARMJob(String name) {
		super(name);
	}

	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export
	 */
	public ExportARMJob(String name, EObject node) {
		super(name,node);
	}

	/** 
	 * Create the export job with a collection of nodes.
	 * @param name job name
	 * @param nodes selected node collection to export
	 */
	public ExportARMJob(String name, Collection nodes ) {
		super(name,nodes);
	}
	
	/**
	 * Create the export job with the selected resource.
	 * @param name job name
	 * @param resource resource to export
	 */
	public ExportARMJob(String name, Resource resource ) {
		super(name,resource);
	}

	
	/**
	 * Loads the document style map.
	 * Expect one style per argument model node type.
	 * Uses package literals as keys.
	 */
	public void loadStyleMap() {
		// TODO populate from extension point contributions? Override built-ins.
		// TODO sub classes ensure call to this super class for ARM-derived types

		// each model element can have its own style
		// for convenience we use the model element literals as keys 
		styleMap.put(ArmPackage.Literals.ANNOTATION, "Annotation");
		styleMap.put(ArmPackage.Literals.ARGUMENT, "Argument");
		styleMap.put(ArmPackage.Literals.ARGUMENT_ELEMENT,"ArgumentElement");
		styleMap.put(ArmPackage.Literals.ARGUMENT_LINK, "ArgumentLink");
		styleMap.put(ArmPackage.Literals.ARGUMENT_LINK__SOURCE, "ArgumentLinkSource");
		styleMap.put(ArmPackage.Literals.ARGUMENT_LINK__TARGET, "ArgumentLinkTarget");
		styleMap.put(ArmPackage.Literals.ARGUMENT_REASONING__DESCRIBES, "ArgumentReasoningDescribes");
		styleMap.put(ArmPackage.Literals.ARGUMENT_REASONING__HAS_STRUCTURE, "ArgumentReasoningHasStructure");
		styleMap.put(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT,"ArgumentContainsArgument");
		styleMap.put(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT,"ArgumentContainsArgumentElement");
		styleMap.put(ArmPackage.Literals.ARGUMENT__CONTAINS_ARGUMENT_LINK,"ArgumentContainsArgumentLink");
		styleMap.put(ArmPackage.Literals.ARGUMENT_REASONING, "ArgumentReasoning");
		styleMap.put(ArmPackage.Literals.ASSERTED_CHALLENGE, "AssertedChallenge");
		styleMap.put(ArmPackage.Literals.ASSERTED_CONTEXT, "AssertedContext");
		styleMap.put(ArmPackage.Literals.ASSERTED_COUNTER_EVIDENCE, "AssertedCounterEvidence");
		styleMap.put(ArmPackage.Literals.ASSERTED_EVIDENCE, "AssertedEvidence");
		styleMap.put(ArmPackage.Literals.ASSERTED_INFERENCE, "AssertedInference");
		styleMap.put(ArmPackage.Literals.ASSERTED_RELATIONSHIP, "AssertedRelationship");
		styleMap.put(ArmPackage.Literals.CITATION_ELEMENT, "CitationElement");
		styleMap.put(ArmPackage.Literals.CITATION_ELEMENT__REFERS_TO_ARGUMENT, "CitationElementRefersToArgument");
		styleMap.put(ArmPackage.Literals.CITATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT, "CitationElementRefersToArgumentElement");
		styleMap.put(ArmPackage.Literals.CLAIM, "Claim");
		styleMap.put(ArmPackage.Literals.CLAIM__ASSUMED, "ClaimAssumed");
		styleMap.put(ArmPackage.Literals.CLAIM__TO_BE_SUPPORTED, "ClaimToBeSupported");
		styleMap.put(ArmPackage.Literals.EVIDENCE_ASSERTION, "EvidenceAssertion");
		styleMap.put(ArmPackage.Literals.INFORMATION_ELEMENT, "InformationElement");
		styleMap.put(ArmPackage.Literals.MODEL_ELEMENT, "ModelElement");
		styleMap.put(ArmPackage.Literals.MODEL_ELEMENT__CONTENT, "ModelElementContent");
		styleMap.put(ArmPackage.Literals.MODEL_ELEMENT__DESCRIPTION, "ModelElementDescription");
		styleMap.put(ArmPackage.Literals.MODEL_ELEMENT__IDENTIFIER, "ModelElementIdentifier");
		styleMap.put(ArmPackage.Literals.MODEL_ELEMENT__IS_TAGGED, "ModelElementIsTagged");
		styleMap.put(ArmPackage.Literals.REASONING_ELEMENT, "ReasoningElement");
		styleMap.put(ArmPackage.Literals.TAGGED_VALUE, "TaggedValue");
		styleMap.put(ArmPackage.Literals.TAGGED_VALUE__KEY, "TaggedValueKey");
		styleMap.put(ArmPackage.Literals.TAGGED_VALUE__VALUE, "TaggedValueValue");
	}
	
	/**
	 * Visitor to pass to the model's tree iterator.
	 * Overrides the case methods of the generated switch class.
	 */
	public ArmSwitch<Boolean> visitor = new ArmSwitch<Boolean>() {
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
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseModelElement(ModelElement me) {
			// identifier, description, and content
			// tagged values visited in a different case
			mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__IDENTIFIER), me.getIdentifier());
			mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__DESCRIPTION), me.getDescription());
			mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__CONTENT), me.getContent());

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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.TAGGED_VALUE), "Tags");
				writeTagsHeader = false;
			}
			String ks = String.format("Key %s", taggedValue.getKey());
			String vs = String.format("Value %s", taggedValue.getValue());
			mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.TAGGED_VALUE__KEY), ks);
			mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.TAGGED_VALUE__VALUE), vs);

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
			caseModelElement(argument);
			//mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__IDENTIFIER), argument.getIdentifier());
			//mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__DESCRIPTION), argument.getDescription());
			//mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__CONTENT), argument.getContent());

			// headers, if any
			writeArgumentElementHeader = argument.getContainsArgumentElement().isEmpty() == false;
			writeArgumentLinkHeader = argument.getContainsArgumentLink().isEmpty() == false;
			//writeTagsHeader = argument.getIsTagged().isEmpty() == false;

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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ARGUMENT_ELEMENT), "Argument Elements");
				writeArgumentElementHeader = false;
			}

			caseModelElement(argumentElement);
			//mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__IDENTIFIER), argumentElement.getIdentifier());
			//mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__DESCRIPTION), argumentElement.getDescription());
			//mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.MODEL_ELEMENT__CONTENT), argumentElement.getContent());
			//writeTagsHeader = argumentElement.getIsTagged().isEmpty() == false;

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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ARGUMENT_ELEMENT), "Argument Links");
				writeArgumentLinkHeader = false;
			}

			caseModelElement(argumentLink);
			
			if ( argumentLink.getSource().isEmpty() == false ) {
				// TODO list elements are model elements, identify how to traverse with correct header
				writeSourceHeader = true;
			}
			if ( argumentLink.getTarget().isEmpty() == false ) {
				// TODO list elements are model elements, identify how to traverse with correct header
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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ASSERTED_RELATIONSHIP), "Asserted Relationship");
				writeAssertedRelationshipHeader = false;
			}

			caseModelElement(assertedRelationship);
			
			if ( assertedRelationship.getSource().isEmpty() == false ) {
				// TODO list elements are model elements, identify how to traverse with correct header
				writeSourceHeader = true;
			}
			if ( assertedRelationship.getTarget().isEmpty() == false ) {
				// TODO list elements are model elements, identify how to traverse with correct header
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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ASSERTED_INFERENCE), "Asserted Inference");
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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ASSERTED_EVIDENCE), "Asserted Evidence");
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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ASSERTED_CONTEXT), "Asserted Context");
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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ASSERTED_COUNTER_EVIDENCE), "Asserted Counter-Evidence");
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
				mainDocumentPart.addStyledParagraphOfText(styleMap.get(ArmPackage.Literals.ASSERTED_CHALLENGE), "Asserted Challenge");
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
		public Boolean caseReasoningElement(ReasoningElement reasoningElement) {
			caseModelElement(reasoningElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param claim the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseClaim(Claim claim) {
			caseModelElement(claim);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
		 * @param evidenceAssertion the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseEvidenceAssertion(EvidenceAssertion evidenceAssertion) {
			caseClaim(evidenceAssertion);
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
		 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
		 * @param argumentReasoning the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentReasoning(ArgumentReasoning argumentReasoning) {
			caseReasoningElement(argumentReasoning);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Citation Element</em>'.
		 * @param citationElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseCitationElement(CitationElement citationElement) {
			caseArgumentElement(citationElement);
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
	public ArmSwitch<Boolean> getVisitor() {
		return visitor;
	}
	
	/**
	 * Produces the export content.
	 * Calls setup and test methods, then checks return value for tear-down.
	 * @param monitor progress monitor
	 * @return IStatus 
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
			CertWareLog.logError(Messages.ExportARMJob_0, e);
		} catch (Docx4JException e) {
			CertWareLog.logError(Messages.ExportARMJob_1, e);
		}
		
		cleanupJob(monitor,rv);
		return rv;
	}

	/**
	 * Write a paragraph for the title of the document.
	 * @param monitor progress monitor (unused)
	 */
	protected void writeTitle(IProgressMonitor monitor) {
		String titleMessage = Messages.ExportARMJob_4 + ' ' + Calendar.getInstance().getTime();
		mainDocumentPart.createStyledParagraphOfText(Messages.ExportARMJob_3, titleMessage);
	}
	
	/**
	 * Perform standard setup for the processor and document.
	 * Creates the work processing document package.
	 * @param monitor progress monitor
	 * @throws InvalidFormatException for creating package 
	 */
	protected void setupDocument(IProgressMonitor monitor) throws InvalidFormatException {
		monitor.subTask(Messages.ExportARMJob_2);
		if ( mainDocumentPart == null )  { // incoming document not provided
			wordMLPackage = WordprocessingMLPackage.createPackage();
			mainDocumentPart = wordMLPackage.getMainDocumentPart();
		}
		writeTitle(monitor);
	}

	/**
	 * Open a template document for writing into.
	 * @param monitor progress monitor
	 * @param file selected template file to populate
	 * @throws Docx4JException exceptions on loading file
	 */
	protected void openDocument(IProgressMonitor monitor, IFile file) throws Docx4JException {
		wordMLPackage = WordprocessingMLPackage.load(file.getFullPath().toFile());
		mainDocumentPart = wordMLPackage.getMainDocumentPart();
	}
	
	/**
	 * Perform standard tear-down of the processor and document.
	 * @param monitor progress monitor
	 * @param save whether to save marshaled document
	 * @throws Docx4JException for word package problems 
     * @throws JAXBException for marshalling problems 
	 */
	protected void tearDownDocument(IProgressMonitor monitor, boolean save) throws Docx4JException, JAXBException {

		monitor.subTask(Messages.ExportARMJob_5);
		
		// save it to the file system according to destination file selection, or dump to standard output
		if ( save ) {
			// save it to the file
			wordMLPackage.save( new File(getDestinationFileName()) );
			CertWareLog.logInfo(MessageFormat.format(Messages.ExportARMJob_6, Messages.ExportARMJob_7, getDestinationFileName()));
		} else {
	    	// marshal it to the console
			final FlatOpcXmlCreator worker = new FlatOpcXmlCreator(wordMLPackage);
			final org.docx4j.xmlPackage.Package pkg = worker.get();
			JAXBContext jc = org.docx4j.jaxb.Context.jcXmlPackage;
			Marshaller marshaller=jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			NamespacePrefixMapperUtils.setProperty(marshaller, NamespacePrefixMapperUtils.getPrefixMapper());			
			System.out.println( "\n\n OUTPUT " ); // $codepro.audit.disable debuggingCode //$NON-NLS-1$, platformSpecificLineSeparator
			System.out.println( "====== \n\n " );	 // $codepro.audit.disable debuggingCode //$NON-NLS-1$, platformSpecificLineSeparator
			marshaller.marshal(pkg, System.out);				
		}
	}
	
	/**
	 * Output instructions depending upon selection type.
	 * Assumes ML package has been initialized via setupDocument().
	 * Processes the selection(s) using the model's visitor switch.
	 * @param monitor progress monitor
	 * @return {@code OK_STATUS} on success or {@code CANCEL_STATUS} on monitor canceled 
     * @throws JAXBException 
     * @throws Docx4JException 
	 */
	protected IStatus exportSelection(IProgressMonitor monitor) throws JAXBException, Docx4JException {
		factory = new ObjectFactory();

		if ( null != getResource() ) {
			monitor.subTask(Messages.ExportARMJob_11);
			// iterates over all nodes in the resource using a visitor pattern
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getResource(), true); iter.hasNext(); ) {
				EObject eObject = iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		} else if ( null != getNodeCollection() ) {
			monitor.subTask(Messages.ExportARMJob_12);
			// iterates over the given collection in order using a visitor pattern
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getNodeCollection(), true); iter.hasNext(); ) {
				EObject eObject = iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		} else {
			monitor.subTask(Messages.ExportARMJob_13);
			// iterates over a node and its children
			// do the node itself, then its contents
			visitor.doSwitch(getNode());
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getNode(), true); iter.hasNext(); ) {
				EObject eObject = iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		}
		
		/*
		// TODO testing manual mark-up
		final P p = factory.createP(); // $codepro.audit.disable questionableName
		final R run = factory.createR();
		final Text  t = factory.createText(); // $codepro.audit.disable questionableName
		t.setValue(Messages.ExportARMJob_14);
		run.getRunContent().add(t);		
		p.getParagraphContent().add(run);
		
		
		final RPr rpr = factory.createRPr();		
		final BooleanDefaultTrue b = new BooleanDefaultTrue();
	    b.setVal(true);	    
	    rpr.setB(b);
		run.setRPr(rpr);
		
		// Optionally, set pPr/rPr@w:b		
	    final PPr ppr = factory.createPPr();	    
	    p.setPPr( ppr );
	    final ParaRPr paraRpr = factory.createParaRPr();
	    ppr.setRPr(paraRpr);	    
	    rpr.setB(b);
	    
	            
	    wordMLPackage.getMainDocumentPart().addObject(p);
	    */
	    
	    // Here is an easier way:
	    /*
	    final String str = "<w:p xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" ><w:r><w:rPr><w:b /></w:rPr><w:t>Bold, just at w:r level</w:t></w:r></w:p>"; //$NON-NLS-1$
	    wordMLPackage.getMainDocumentPart().addObject( XmlUtils.unmarshalString(str) );
	    */
	    
	    // add a table
	    /*
	    final int columns = 3;
	    final int rows = 1;
	    final int writableWidthTwips = wordMLPackage.getDocumentModel().getSections().get(0).getPageDimensions().getWritableWidthTwips();
	    final int cellWidthTwips = (int)Math.floor( writableWidthTwips / columns);
	    
	    final Tbl tbl = TblFactory.createTable(rows, columns, cellWidthTwips); // $codepro.audit.disable numericLiterals

	    wordMLPackage.getMainDocumentPart().addObject(tbl);
	    */

		
		return Status.OK_STATUS;
	}
	
	/*
	 *      
	 *      ObjectFactory of = new ObjectFactory();

      List rows = tbl.getEGContentRowContent();
      Tr row = (Tr) rows.get(0);
      List cells = row.getEGContentCellContent();
      Tc tc = (Tc) cells.get(0);

      tc.getEGBlockLevelElts().add( wordMLPackage.getMainDocumentPart().createParagraphOfText("some text that goes in the cell") );
      */

    /*
    // Add an altChunk
    // .. the part
    final String html = "<html><head><title>Import me</title></head><body><p>Hello World!</p></body></html>"; //$NON-NLS-1$
    final AlternativeFormatInputPart afiPart = new AlternativeFormatInputPart(new PartName("/hw.html") );  //$NON-NLS-1$
    afiPart.setBinaryData(html.getBytes());
    afiPart.setContentType(new ContentType("text/html")); //$NON-NLS-1$
    final Relationship altChunkRel = wordMLPackage.getMainDocumentPart().addTargetPart(afiPart);
    // .. the bit in document body
    final CTAltChunk ac = org.docx4j.jaxb.Context.getWmlObjectFactory().createCTAltChunk();
    ac.setId(altChunkRel.getId() );
    wordMLPackage.getMainDocumentPart().addObject(ac);
    // .. content type
    wordMLPackage.getContentTypeManager().addDefaultContentType("html", "text/html"); //$NON-NLS-1$ //$NON-NLS-2$
    */
}
