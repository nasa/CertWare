/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.jobs;

import java.util.Collection;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import net.certware.argument.arm.Annotation;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArgumentReasoning;
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

import org.docx4j.XmlUtils;
import org.docx4j.convert.out.flatOpcXml.FlatOpcXmlCreator;
import org.docx4j.jaxb.NamespacePrefixMapperUtils;
import org.docx4j.model.table.TblFactory;
import org.docx4j.openpackaging.contenttype.ContentType;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.WordprocessingML.AlternativeFormatInputPart;
import org.docx4j.relationships.Relationship;
import org.docx4j.wml.BooleanDefaultTrue;
import org.docx4j.wml.CTAltChunk;
import org.docx4j.wml.ObjectFactory;
import org.docx4j.wml.P;
import org.docx4j.wml.PPr;
import org.docx4j.wml.ParaRPr;
import org.docx4j.wml.R;
import org.docx4j.wml.RPr;
import org.docx4j.wml.Tbl;
import org.docx4j.wml.Text;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Exports ARM model elements to a document file.
 * @author mrb
 * @since 1.0
 */
public class ExportARMJob extends AbstractExportJob {

	/** the word mark-up language package for the document */
	protected WordprocessingMLPackage wordMLPackage; 
	
	/**
	 * Create the export job with a name.
	 * @param name
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

	public ExportARMJob(String name, Collection nodes ) {
		super(name,nodes);
	}
	
	public ExportARMJob(String name, Resource resource ) {
		super(name,resource);
	}
	
	/**
	 * Visitor to pass to the model's tree iterator.
	 * Overrides the case methods of the generated switch class.
	 */
	public ArmSwitch<Boolean> visitor = new ArmSwitch<Boolean>() {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseModelElement(ModelElement modelElement) {
			System.err.println("visiting model element " + modelElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseTaggedValue(TaggedValue taggedValue) {
			System.err.println("visiting tagged value " + taggedValue);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseArgument(Argument argument) {
			System.err.println("visiting case argument " + argument);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseArgumentElement(ArgumentElement argumentElement) {
			System.err.println("visiting argument element " + argumentElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseArgumentLink(ArgumentLink argumentLink) {
			System.err.println("visiting argument link " + argumentLink);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAssertedRelationship(AssertedRelationship assertedRelationship) {
			System.err.println("visiting asserted relationship " + assertedRelationship);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAnnotation(Annotation annotation) {
			System.err.println("visiting case annotation " + annotation);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAssertedInference(AssertedInference assertedInference) {
			System.err.println("visiting asserted inference " + assertedInference);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAssertedEvidence(AssertedEvidence assertedEvidence) {
			System.err.println("visiting asserted evidence " + assertedEvidence);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAssertedContext(AssertedContext assertedContext) {
			System.err.println("visiting asserted context " + assertedContext);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAssertedCounterEvidence(AssertedCounterEvidence assertedCounterEvidence) {
			System.err.println("visiting asserted counter evidence " + assertedCounterEvidence);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAssertedChallenge(AssertedChallenge assertedChallenge) {
			System.err.println("visiting asserted challenge " + assertedChallenge);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseReasoningElement(ReasoningElement reasoningElement) {
			System.err.println("visiting reasoning element "+ reasoningElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseClaim(Claim claim) {
			System.err.println("visiting claim " + claim);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseEvidenceAssertion(EvidenceAssertion evidenceAssertion) {
			System.err.println("visiting evidence assertion " + evidenceAssertion);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseInformationElement(InformationElement informationElement) {
			System.err.println("visiting information element " + informationElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseArgumentReasoning(ArgumentReasoning argumentReasoning) {
			System.err.println("visiting argument reasoning " + argumentReasoning);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Citation Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Citation Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseCitationElement(CitationElement citationElement) {
			System.err.println("visiting citation element " + citationElement);
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch, but this is the last case anyway.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Boolean defaultCase(EObject object) {
			System.err.println("ARM visiting unknown object " + object);
			return Boolean.FALSE;
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
	 * @param monitor progress monitor
	 */
	public IStatus produce(IProgressMonitor monitor) {
		IStatus rv = Status.OK_STATUS;
		
		// setup, produce, and tear-down the document
		try {
			setupDocument(monitor);
			rv = test(monitor);
			if ( rv == Status.OK_STATUS ) {
				// String pathName = System.getProperty("user.dir") + "/ad.docx";
				tearDownDocument(monitor,getFileName(),true);
			}
		} catch (JAXBException e) {
			CertWareLog.logError("Exporting word document", e);
		} catch (Docx4JException e) {
			CertWareLog.logError("Exporting word document", e);
		}
		
		cleanupJob(monitor,rv);
		return rv;
	}

	/**
	 * Perform standard setup for the processor and document.
	 * @param monitor progress monitor
	 * @throws InvalidFormatException for creating package
	 */
	protected void setupDocument(IProgressMonitor monitor) throws InvalidFormatException {
		monitor.subTask("Creating package");
		wordMLPackage = WordprocessingMLPackage.createPackage();
		wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Title", "CertWare Export"); // TODO preference for title
	}

	/**
	 * Perform standard tear-down of the processor and document.
	 * @param monitor progress monitor
	 * @throws Docx4JException for word package problems
	 * @throws JAXBException for marshalling problems
	 */
	protected void tearDownDocument(IProgressMonitor monitor, String pathName, boolean save) throws Docx4JException, JAXBException {

		monitor.subTask("Cleaning up");
		
		// Now save it
		if (save) {
			wordMLPackage.save(new java.io.File(pathName) );
			CertWareLog.logInfo("Exported to" + ' ' + pathName);
		} else {
		   	// create a org.docx4j.wml.Package object
			FlatOpcXmlCreator worker = new FlatOpcXmlCreator(wordMLPackage);
			org.docx4j.xmlPackage.Package pkg = worker.get();
	    	
	    	// marshal it
			JAXBContext jc = org.docx4j.jaxb.Context.jcXmlPackage;
			Marshaller marshaller=jc.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			NamespacePrefixMapperUtils.setProperty(marshaller, NamespacePrefixMapperUtils.getPrefixMapper());			
			System.out.println( "\n\n OUTPUT " );
			System.out.println( "====== \n\n " );	
			marshaller.marshal(pkg, System.out);				
		}
	}
	
	/**
	 * Testing word ML output instructions.
	 * Assumes ML package has been initialized via setupDocument().
	 * @return always returns OK_STATUS
	 * @throws JAXBException
	 * @throws Docx4JException
	 */
	protected IStatus test(IProgressMonitor monitor) throws JAXBException, Docx4JException {
		ObjectFactory factory = new ObjectFactory();

		wordMLPackage.getMainDocumentPart().addParagraphOfText("from docx4j!");

		if ( getResource() != null ) {
			monitor.subTask("Producing resource content");
			// iterates over all nodes in the resource
			for ( Iterator<EObject> iter = EcoreUtil.getAllContents(getResource(), true); iter.hasNext(); ) {
				EObject eObject = (EObject)iter.next();
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		} else if ( getNodeCollection() != null ) {
			monitor.subTask("Producing node collection content");
			// iterates over the given collection
			for ( Iterator<EObject> iter = EcoreUtil.getAllContents(getNodeCollection(), true); iter.hasNext(); ) {
				EObject eObject = (EObject)iter.next();
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		} else {
			monitor.subTask("Producing node content");
			// iterates over a node and its children
			for ( Iterator<EObject> iter = EcoreUtil.getAllContents(getNode(), true); iter.hasNext(); ) {
				EObject eObject = (EObject)iter.next();
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		}
		
		// TODO testing manual markup
		// To get bold text, you must set the run's rPr@w:b,
	    // so you can't use the createParagraphOfText convenience method
		// org.docx4j.wml.P p = wordMLPackage.getMainDocumentPart().createParagraphOfText("text");
		
		P p = factory.createP();
		R run = factory.createR();
		Text  t = factory.createText();
		t.setValue("text");
		run.getRunContent().add(t);		
		p.getParagraphContent().add(run);
		
		
		RPr rpr = factory.createRPr();		
		BooleanDefaultTrue b = new BooleanDefaultTrue();
	    b.setVal(true);	    
	    rpr.setB(b);
		run.setRPr(rpr);
		
		// Optionally, set pPr/rPr@w:b		
	    PPr ppr = factory.createPPr();	    
	    p.setPPr( ppr );
	    ParaRPr paraRpr = factory.createParaRPr();
	    ppr.setRPr(paraRpr);	    
	    rpr.setB(b);
	    
	            
	    wordMLPackage.getMainDocumentPart().addObject(p);
	    
	    
	    // Here is an easier way:
	    String str = "<w:p xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" ><w:r><w:rPr><w:b /></w:rPr><w:t>Bold, just at w:r level</w:t></w:r></w:p>";
	    
	    wordMLPackage.getMainDocumentPart().addObject( XmlUtils.unmarshalString(str) );
	    
	    // Let's add a table
	    int writableWidthTwips = wordMLPackage.getDocumentModel().getSections().get(0).getPageDimensions().getWritableWidthTwips();
	    int cols = 3;
	    int cellWidthTwips = new Double( Math.floor( (writableWidthTwips/cols )) ).intValue();
	    
	    Tbl tbl = TblFactory.createTable(3, 3, cellWidthTwips);
	    wordMLPackage.getMainDocumentPart().addObject(tbl);
	    
		
	    // Add an altChunk
	    // .. the part
	    String html = "<html><head><title>Import me</title></head><body><p>Hello World!</p></body></html>";
	    AlternativeFormatInputPart afiPart = new AlternativeFormatInputPart(new PartName("/hw.html") ); 
	    afiPart.setBinaryData(html.getBytes());
	    afiPart.setContentType(new ContentType("text/html"));
	    Relationship altChunkRel = wordMLPackage.getMainDocumentPart().addTargetPart(afiPart);
	    // .. the bit in document body
	    CTAltChunk ac = org.docx4j.jaxb.Context.getWmlObjectFactory().createCTAltChunk();
	    ac.setId(altChunkRel.getId() );
	    wordMLPackage.getMainDocumentPart().addObject(ac);

	    // .. content type
	    wordMLPackage.getContentTypeManager().addDefaultContentType("html", "text/html");
	    
		//injectDocPropsCustomPart(wordMLPackage);
		
		return Status.OK_STATUS;
	}
}
