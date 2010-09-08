/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.jobs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import net.certware.core.ui.log.CertWareLog;

import org.docx4j.XmlUtils;
import org.docx4j.convert.out.flatOpcXml.FlatOpcXmlCreator;
import org.docx4j.jaxb.Context;
import org.docx4j.jaxb.NamespacePrefixMapperUtils;
import org.docx4j.model.table.TblFactory;
import org.docx4j.openpackaging.contenttype.ContentType;
import org.docx4j.openpackaging.exceptions.Docx4JException;
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

/**
 * Exports a selected GSN model element to a document file.
 * @author mrb
 * @since 1.0
 */
public class ExportGSNJob extends AbstractExportJob {

	/**
	 * Create the export job with a name.
	 * @param name
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
		this(name);
		this.node = node;
	}
	
	/**
	 * Produces the export content.
	 * @param monitor progress monitor
	 */
	public IStatus produce(IProgressMonitor monitor) {
		IStatus rv = Status.OK_STATUS;
		setSteps(4); // TODO set accurate count
		
		if ( node == null ) {
			CertWareLog.logWarning("Node selection unavailable for export; export canceled");
			monitor.setCanceled(true);
			return Status.CANCEL_STATUS;
		}
		
		// TODO produce code
		System.err.println("producing node" + ' ' + node.toString());
		
		// test
		try {
			rv = test();
		} catch (JAXBException e) {
			CertWareLog.logError("Exporting word document", e);
		} catch (Docx4JException e) {
			CertWareLog.logError("Exporting word document", e);
		}
		
		cleanupJob(monitor,rv);
		return rv;
	}
	
	private IStatus test() throws JAXBException, Docx4JException {
		boolean save = true;
		ObjectFactory factory = new ObjectFactory();
		
		System.out.println( "Creating package..");
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
		
		wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Title", "Hello world");
		wordMLPackage.getMainDocumentPart().addParagraphOfText("from docx4j!");
		
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
	    CTAltChunk ac = Context.getWmlObjectFactory().createCTAltChunk();
	    ac.setId(altChunkRel.getId() );
	    wordMLPackage.getMainDocumentPart().addObject(ac);

	    // .. content type
	    wordMLPackage.getContentTypeManager().addDefaultContentType("html", "text/html");
	    
		//injectDocPropsCustomPart(wordMLPackage);
		
		String pathName = System.getProperty("user.dir") + "/ad.docx";
	    System.err.println("Ready to write to" + ' ' + pathName);
	    
		// Now save it
		if (save) {
			System.out.println("Saved to" + ' ' + pathName);
			wordMLPackage.save(new java.io.File(pathName) );
		} else {
		   	// Create a org.docx4j.wml.Package object
			FlatOpcXmlCreator worker = new FlatOpcXmlCreator(wordMLPackage);
			org.docx4j.xmlPackage.Package pkg = worker.get();
	    	
	    	// Now marshal it
			JAXBContext jc = Context.jcXmlPackage;
			Marshaller marshaller=jc.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			NamespacePrefixMapperUtils.setProperty(marshaller, NamespacePrefixMapperUtils.getPrefixMapper());			
			System.out.println( "\n\n OUTPUT " );
			System.out.println( "====== \n\n " );	
			marshaller.marshal(pkg, System.out);				
		}
		
		System.out.println("Done.");

		return Status.OK_STATUS;
	}
}
