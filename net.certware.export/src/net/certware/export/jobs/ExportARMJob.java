/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.export.jobs;

import java.text.MessageFormat;
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
	 * Default constructor, default name.
	 */
	public ExportARMJob() {
		super();
	}
	
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
	 * Visitor to pass to the model's tree iterator.
	 * Overrides the case methods of the generated switch class.
	 */
	public ArmSwitch<Boolean> visitor = new ArmSwitch<Boolean>() {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @param modelElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseModelElement(ModelElement modelElement) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * @param taggedValue the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseTaggedValue(TaggedValue taggedValue) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @param argument the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgument(Argument argument) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @param argumentElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentElement(ArgumentElement argumentElement) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @param argumentLink the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentLink(ArgumentLink argumentLink) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @param assertedRelationship the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedRelationship(AssertedRelationship assertedRelationship) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * @param annotation the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAnnotation(Annotation annotation) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
		 * @param assertedInference the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedInference(AssertedInference assertedInference) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @param assertedEvidence the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedEvidence(AssertedEvidence assertedEvidence) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
		 * @param assertedContext the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedContext(AssertedContext assertedContext) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
		 * @param assertedCounterEvidence the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedCounterEvidence(AssertedCounterEvidence assertedCounterEvidence) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
		 * @param assertedChallenge the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedChallenge(AssertedChallenge assertedChallenge) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @param reasoningElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseReasoningElement(ReasoningElement reasoningElement) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @param claim the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseClaim(Claim claim) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
		 * @param evidenceAssertion the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseEvidenceAssertion(EvidenceAssertion evidenceAssertion) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @param informationElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseInformationElement(InformationElement informationElement) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
		 * @param argumentReasoning the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentReasoning(ArgumentReasoning argumentReasoning) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Citation Element</em>'.
		 * @param citationElement the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseCitationElement(CitationElement citationElement) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @param object the target of the switch.
		 * @return always returns false
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public Boolean defaultCase(EObject object) {
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
	 * Calls setup and test methods, then checks return value for tear-down.
	 * @param monitor progress monitor
	 * @return IStatus 
	 */
	public IStatus produce(IProgressMonitor monitor) {
		IStatus rv = Status.OK_STATUS;
		
		// setup, produce, and tear-down the document
		try {
			setupDocument(monitor);
			rv = test(monitor);
			if ( rv.equals(Status.OK_STATUS )) {
				// String pathName = System.getProperty("user.dir") + "/ad.docx";
				tearDownDocument(monitor,getFileName(),true);
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
	 * Perform standard setup for the processor and document.
	 * @param monitor progress monitor
	 * @throws InvalidFormatException for creating package 
	 */
	protected void setupDocument(IProgressMonitor monitor) throws InvalidFormatException {
		monitor.subTask(Messages.ExportARMJob_2);
		wordMLPackage = WordprocessingMLPackage.createPackage();
		wordMLPackage.getMainDocumentPart().addStyledParagraphOfText(Messages.ExportARMJob_3, Messages.ExportARMJob_4);
	}

	/**
	 * Perform standard tear-down of the processor and document.
	 * @param monitor progress monitor
	 * @param pathName path name
	 * @param save whether to save marshaled document
	 * @throws Docx4JException for word package problems 
     * @throws JAXBException for marshalling problems 
	 */
	protected void tearDownDocument(IProgressMonitor monitor, String pathName, boolean save) throws Docx4JException, JAXBException {

		monitor.subTask(Messages.ExportARMJob_5);
		
		// Now save it
		if (save) {
			wordMLPackage.save(new java.io.File(pathName) );
			CertWareLog.logInfo(MessageFormat.format(Messages.ExportARMJob_6, Messages.ExportARMJob_7, pathName));
		} else {
		   	// create a org.docx4j.wml.Package object
			final FlatOpcXmlCreator worker = new FlatOpcXmlCreator(wordMLPackage);
			final org.docx4j.xmlPackage.Package pkg = worker.get();
	    	
	    	// marshal it
			final JAXBContext jc = org.docx4j.jaxb.Context.jcXmlPackage;
			final Marshaller marshaller=jc.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			NamespacePrefixMapperUtils.setProperty(marshaller, NamespacePrefixMapperUtils.getPrefixMapper());			
			System.out.println( "\n\n OUTPUT " ); // $codepro.audit.disable debuggingCode //$NON-NLS-1$, platformSpecificLineSeparator
			System.out.println( "====== \n\n " );	 // $codepro.audit.disable debuggingCode //$NON-NLS-1$, platformSpecificLineSeparator
			marshaller.marshal(pkg, System.out);				
		}
	}
	
	/**
	 * Testing word ML output instructions.
	 * Assumes ML package has been initialized via setupDocument().
	 * @param monitor progress monitor
	 * @return always returns OK_STATUS 
     * @throws JAXBException 
     * @throws Docx4JException 
	 */
	protected IStatus test(IProgressMonitor monitor) throws JAXBException, Docx4JException {
		final ObjectFactory factory = new ObjectFactory();

		wordMLPackage.getMainDocumentPart().addParagraphOfText("from docx4j!"); //$NON-NLS-1$

		if ( null != getResource() ) {
			monitor.subTask(Messages.ExportARMJob_11);
			// iterates over all nodes in the resource
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getResource(), true); iter.hasNext(); ) {
				EObject eObject = (EObject)iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		} else if ( null != getNodeCollection() ) {
			monitor.subTask(Messages.ExportARMJob_12);
			// iterates over the given collection
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getNodeCollection(), true); iter.hasNext(); ) {
				EObject eObject = (EObject)iter.next(); // $codepro.audit.disable variableDeclaredInLoop
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
				EObject eObject = (EObject)iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				visitor.doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		}
		
		// TODO testing manual mark-up
		// To get bold text, you must set the run's rPr@w:b,
	    // so you can't use the createParagraphOfText convenience method
		// org.docx4j.wml.P p = wordMLPackage.getMainDocumentPart().createParagraphOfText("text");
		
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
	    
	    
	    // Here is an easier way:
	    final String str = "<w:p xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" ><w:r><w:rPr><w:b /></w:rPr><w:t>Bold, just at w:r level</w:t></w:r></w:p>"; //$NON-NLS-1$
	    
	    wordMLPackage.getMainDocumentPart().addObject( XmlUtils.unmarshalString(str) );
	    
	    // Let's add a table
	    final int writableWidthTwips = wordMLPackage.getDocumentModel().getSections().get(0).getPageDimensions().getWritableWidthTwips();
	    final int cols = 3; // $codepro.audit.disable numericLiterals
	    // final int cellWidthTwips = new Double( Math.floor( (writableWidthTwips/cols )) ).intValue();
	    final int cellWidthTwips = (int)Math.floor( writableWidthTwips / cols);
	    
	    final Tbl tbl = TblFactory.createTable(3, 3, cellWidthTwips); // $codepro.audit.disable numericLiterals
	    wordMLPackage.getMainDocumentPart().addObject(tbl);
	    
		
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
	    
		//injectDocPropsCustomPart(wordMLPackage);
		
		return Status.OK_STATUS;
	}
}
