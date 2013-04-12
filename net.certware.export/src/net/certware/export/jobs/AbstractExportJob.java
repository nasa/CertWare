/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.jobs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.export.ExportContributions;

import org.docx4j.XmlUtils;
import org.docx4j.convert.out.flatOpcXml.FlatOpcXmlCreator;
import org.docx4j.convert.out.pdf.PdfConversion;
import org.docx4j.convert.out.pdf.viaXSLFO.Conversion;
import org.docx4j.fonts.IdentityPlusMapper;
import org.docx4j.jaxb.NamespacePrefixMapperUtils;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart;
import org.docx4j.wml.ObjectFactory;
import org.docx4j.wml.R;
import org.docx4j.wml.RPr;
import org.docx4j.wml.Style;
import org.docx4j.wml.Text;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Exports a selected argument model element to a document file.
 * @author mrb
 * @since 1.0
 */
public abstract class AbstractExportJob extends Job {

	// protected static String STYLE_MODEL_ELEMENT_CONTENT = "<w:style xmlns:w=\"http://schemas.openxmlformats.org/wordprocessingml/2006/main\" w:type=\"character\" w:customStyle=\"1\" w:styleId=\"ModelElementContent\"><w:name w:val=\"Model Element Content\" /><w:basedOn w:val=\"DefaultParagraphFont\" /><w:link w:val=\"Heading3\" /><w:uiPriority w:val=\"9\" /><w:rPr><w:rFonts w:asciiTheme=\"majorHAnsi\" w:hAnsiTheme=\"majorHAnsi\" w:cstheme=\"majorBidi\" /><w:b /><w:bCs /><w:color w:val=\"4F81BD\" w:themeColor=\"accent1\" /></w:rPr></w:style>";
	/** for exporting a single node and its descendants */  
	protected EObject node = null;
	/** for exporting a selection of nodes only */
	protected Collection<EObject> nodeCollection = null;
	/** for exporting an entire resource */
	protected Resource resource = null;
	/** number of production steps for progress monitor */
	protected int steps = 1;
	/** previously-selected destination file name */
	protected String previousFileName = Messages.AbstractExportJob_0;
	/** the word mark-up language package for the document */
	protected WordprocessingMLPackage wordMLPackage;
	/** the main document part from an incoming document file */
	protected MainDocumentPart mainDocumentPart = null;
	/** the style definition part from the main document incoming file */
	protected StyleDefinitionsPart stylesPart = null;
	/** style map populated by extension point */
	protected Map<Integer,StyleEntry> styleMap = new HashMap<Integer,StyleEntry>();
	/** document object creation factory, created at run-time */
	protected ObjectFactory factory;
	/** style entry including paragraph indicator */
	protected class StyleEntry {
		/**
		 * Records a document style entry.
		 * @param isParagraph true if style is for paragraphs, false otherwise
		 * @param style string identifier
		 */
		public StyleEntry(boolean isParagraph, String style) {
			this.isParagraph = isParagraph;
			this.style = style;
		}
		boolean isParagraph = false; // true for paragraph, false for run
		String style = ""; // style string identifier
	}

	/**
	 * Default constructor uses default job name.
	 */
	protected AbstractExportJob() {
		super(Messages.AbstractExportJob_1);
	}

	/**
	 * Create the export job with a name.
	 * @param name
	 */
	protected AbstractExportJob(String name) {
		super(name);
	}

	/**
	 * Create the export job with a given model element node.
	 * @param name job name
	 * @param node model element to export including its descendants
	 */
	protected AbstractExportJob(String name, EObject node) {
		this(name);
		this.node = node;
		nodeCollection = null;
		resource = null;
	}

	/**
	 * Create the export job with a given collection of model nodes.
	 * @param name job name
	 * @param nodes collection of nodes to export
	 */
	protected AbstractExportJob(String name, Collection<EObject> nodes) {
		this(name);
		node = null;
		nodeCollection = nodes;
		resource = null;
	}

	/**
	 * Create the export job with a given model resource.
	 * @param name job name
	 * @param resource model resource
	 */
	protected AbstractExportJob(String name, Resource resource) {
		this(name);
		node = null;
		nodeCollection = null;
		this.resource = resource;
	}

	/**
	 * Sets the number of steps for progress monitoring. 
	 * @param count step count
	 */
	public void setSteps(int count) {
		steps = count;
	}

	/**
	 * Gets the number of steps for progress monitoring.
	 * @return total progress monitoring steps 
	 */
	public int getSteps() {
		return steps;
	}

	/**
	 * Prompts the user for a destination file name.
	 * @param shell shell for dialog
	 * @return filename or null if canceled 
	 */
	public String promptFileName(Shell shell) {
		String fileName = previousFileName;
		final FileDialog fsd = new FileDialog(shell,SWT.SAVE);
		fsd.setOverwrite(true);
		fsd.setFileName(fileName);
		fsd.setFilterExtensions(new String[] {Messages.AbstractExportJob_2});
		fsd.setText(Messages.AbstractExportJob_3);
		fileName = fsd.open();
		if ( null != fileName ) {
			previousFileName = fileName;
		}
		return fileName;
	}

	/**
	 * Do the work of exporting while in the run method.
	 * @param monitor progress monitor
	 * @return status indication, passed on to run method return 
	 */
	abstract public IStatus produce(IProgressMonitor monitor);


	/**
	 * Runs the job, starting the progress monitor and performing done after the
	 * produce() method returns.
	 * @param monitor progress monitor
	 * @return same status value from produce() method 
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor) 
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// set some indicator of progress count
		// increment the work accomplished in the produce() method
		if ( null != resource ) {
			setSteps( resource.getContents().size() );
		}
		else if ( null != nodeCollection ) {
			setSteps( nodeCollection.size() );
		}
		else {
			setSteps( node.eContents().size() );
		}

		// begin the task and produce the content
		monitor.beginTask( getName(), getSteps() );
		final IStatus rv = produce(monitor);
		if ( ! monitor.isCanceled() ) {
			monitor.done();
		}
		return rv;
	}

	/**
	 * Returns the chosen destination file name.
	 * @return returns the file name 
	 */
	public String getDestinationFileName() {
		return previousFileName;

	}

	/**
	 * Sets the node for export.  
	 * Typically used if a selection is not available when creating the job.
	 * If null, implementation should export the entire resource.
	 * @param node GSN model element
	 */
	public void setNode(EObject node) {
		this.node = node;
	}

	/**
	 * Returns the model element intended for export.
	 * @return node for export 
	 */
	public EObject getNode() {
		return node;
	}

	/**
	 * Get the node collection selected for export.
	 * @return the nodeCollection 
	 */
	public Collection<EObject> getNodeCollection() {
		return nodeCollection;
	}

	/**
	 * Sets the node collection for export.
	 * @param nodeCollection the nodeCollection to set
	 */
	public void setNodeCollection(Collection<EObject> nodeCollection) {
		this.nodeCollection = nodeCollection;
	}

	/**
	 * Gets the resource selected for export.
	 * @return the resource 
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * Sets the resource for export.
	 * @param resource the resource to set for export
	 */
	public void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * Performs standard clean-up after job.
	 * Writes log message according to completion status.
	 * Performs the done method on the progress monitor.
	 * @param monitor progress monitor
	 * @param rv job completion status
	 */
	public void cleanupJob(IProgressMonitor monitor, IStatus rv) {
		monitor.done();
		if ( rv.isOK() ) {
			CertWareLog.logInfo(MessageFormat.format(Messages.AbstractExportJob_4, getName(), Messages.AbstractExportJob_5));
		} else {
			CertWareLog.logInfo(MessageFormat.format(Messages.AbstractExportJob_6, getName(), Messages.AbstractExportJob_7));
		}
	}

	/**
	 * Loads the generic document style map.
	 * Assigns a generic style name for each argument model node identifier.
	 * Uses model package identifiers as keys.
	 */
	public void loadContributedStyles() {
		ExportContributions ec = new ExportContributions();
		ec.initialize();

		// TODO read plugin contributions into the style map

		//System.err.println("contributed ids: " + ec.getStyleIdMappings().size());
		//System.err.println("contributed res: " + ec.getStyleResources().size());
		//System.err.println("contributed sty: " + ec.getStyleStrings().size());
	}

	/**
	 * Assign or reassign a model element's style.
	 * @param key model element ID from package definition
	 * @param isParagraph true if style is for a paragraph, false for run
	 * @param styleId style ID, such as {@code Heading1Char} or {@code TaggedValue}.
	 */
	protected void assignStyleId(int key, boolean isParagraph, String styleId) {
		if ( styleMap.containsKey(styleId)) {
			styleMap.remove(styleId);
		}
		styleMap.put(key, new StyleEntry(isParagraph,styleId));
	}

	/**
	 * Assign or reassign a model element's style.
	 * @param key model element ID from package definition
	 * @param isParagraph true if style is for paragraph, false otherwise
	 * @param xml XML string describing style, including {@code xmlns} tags where needed
	 */
	protected void assignStyle(int key, boolean isParagraph, String xml) {
		Style style = addStyle(xml);
		if ( style != null ) {
			assignStyleId(key,isParagraph,style.getStyleId());
		} else {
			System.err.println("Unmarshalled null style for " + xml);
		}
	}

	/**
	 * Add a new XML-described format to the styles list for the main document styles part.
	 * @param format XML-syntax format
	 * @return style or null
	 */
	protected Style addStyle(String format) {
		try {
			Style newStyle;
			newStyle = (Style)XmlUtils.unmarshalString(format);
			stylesPart.getJaxbElement().getStyle().add(newStyle);
			return newStyle;
		} catch (JAXBException e) {
			CertWareLog.logError(String.format("%s: %s", "Adding XML style",format),e);
		}
		return null;
	}

	/**
	 * 
	 * @param styleEntry style entry from style map
	 * @param text text string to write into paragraph or run according to style
	 * @return object of type {@code org.docx4j.wml.P} for paragraph or {@code org.docx4j.wml.R} for run.
	 */
	protected Object addStyledText(StyleEntry styleEntry, String text) {
		if ( styleEntry.isParagraph ) {
			return mainDocumentPart.addStyledParagraphOfText(styleEntry.style, text);
		} else {
			return addStyledRunOfText(styleEntry,text);
		}
	}

	/**
	 * Creates a new run with text of the given style. 
	 * Presumes the style is a run style rather than a paragraph style.
	 * @param style style name to apply from document style part or defaults
	 * @param styleEntry style entry
	 * @return the new run, ready to add to the paragraph content list
	 */
	protected R addStyledRunOfText(StyleEntry styleEntry, String text ) {

		R run = addRunOfText(text);

		// apply style if available
		//System.err.println("style entry " + styleEntry.style + "is paragraph " + styleEntry.isParagraph);
		//System.err.println("resolver " + mainDocumentPart.getPropertyResolver().activateStyle( styleEntry.style ));

		if (mainDocumentPart.getPropertyResolver().activateStyle(styleEntry.style)) {
			Style style = mainDocumentPart.getPropertyResolver().getStyle(styleEntry.style);
			RPr runProperties = style.getRPr();
			run.setRPr(runProperties);
		} 

		// otherwise create run without style
		// create the text and add it to the run
		/*
		Text tid = factory.createText();
		tid.setValue(text);
		run.getRunContent().add(tid);
		 */

		return run;
	}

	/**
	 * Creates a new run with text of default style.
	 * @param text text to insert in run
	 * @return the new run, ready to add to the paragraph content list
	 */
	protected R addRunOfText(String text) {
		// create and style the run properties
		R run = factory.createR();
		Text tid = factory.createText();
		tid.setValue(text);
		run.getRunContent().add(tid);

		// return the run
		return run;
	}

	/**
	 * Write a paragraph for the title of the document.
	 * @param monitor progress monitor (unused)
	 */
	protected void writeTitle(IProgressMonitor monitor) {
		mainDocumentPart.addStyledParagraphOfText("Heading1", "CertWare Export");
		mainDocumentPart.addStyledParagraphOfText("Normal", Calendar.getInstance().getTime().toString());
	}

	/**
	 * Perform standard setup for the processor and document.
	 * Creates the work processing document package.
	 * @param monitor progress monitor
	 * @throws InvalidFormatException for creating package 
	 */
	protected void setupDocument(IProgressMonitor monitor) throws InvalidFormatException {
		monitor.subTask("Creating package");
		if ( mainDocumentPart == null )  { // incoming document not provided
			wordMLPackage = WordprocessingMLPackage.createPackage();
			mainDocumentPart = wordMLPackage.getMainDocumentPart();
			stylesPart = mainDocumentPart.getStyleDefinitionsPart();
		}

		writeTitle(monitor);
	}

	/**
	 * Open a template document for writing into.
	 * @param monitor progress monitor
	 * @param file selected template file to populate
	 * @throws Docx4JException exceptions on loading file
	 */
	protected void openDocument(IProgressMonitor monitor, IFile file)
	throws Docx4JException {
		wordMLPackage = WordprocessingMLPackage.load(file.getFullPath().toFile());
		mainDocumentPart = wordMLPackage.getMainDocumentPart();
		stylesPart = mainDocumentPart.getStyleDefinitionsPart();
	}

	/**
	 * Perform standard tear-down of the processor and document.
	 * @param monitor progress monitor
	 * @param save whether to save marshaled document
	 * @throws Docx4JException for word package problems 
	 * @throws JAXBException for marshalling problems 
	 */
	protected void tearDownDocument(IProgressMonitor monitor, boolean save)
	throws Docx4JException, JAXBException {

		monitor.subTask("Cleaning up");

		// save it to the file system according to destination file selection, or dump to standard output
		if ( save ) {
			// save it to the file
			// TODO when run from export extension there is no user-provided file name
			if ( getDestinationFileName().endsWith(ICertWareConstants.WORD_EXTENSION)) {
				wordMLPackage.save( new File(getDestinationFileName()) );
				CertWareLog.logInfo(MessageFormat.format("{0} {1}", "Exported to", getDestinationFileName()));
			} else 
				if (getDestinationFileName().endsWith(ICertWareConstants.PDF_EXTENSION)) {
					try {
						wordMLPackage.setFontMapper( new IdentityPlusMapper() );
						// PdfConversion c = new Conversion(wordMLPackage);
						PdfConversion c = new Conversion(wordMLPackage);
						OutputStream os = new FileOutputStream( new File(getDestinationFileName()));
						c.output(os);
					} catch (Exception e) {
						CertWareLog.logError(String.format("%s %s","Writing PDF conversion to",getDestinationFileName()),e);
						return;
					}
					CertWareLog.logInfo(MessageFormat.format("{0} {1}", "Exported to", getDestinationFileName()));
				} else {
					CertWareLog.logWarning(String.format("%s %s","Unknown destination file type for",getDestinationFileName()));
				}
		} else {
			// marshal it to the console
			final FlatOpcXmlCreator worker = new FlatOpcXmlCreator(wordMLPackage);
			final org.docx4j.xmlPackage.Package pkg = worker.get();
			JAXBContext jc = org.docx4j.jaxb.Context.jcXmlPackage;
			Marshaller marshaller=jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			NamespacePrefixMapperUtils.setProperty(marshaller, NamespacePrefixMapperUtils.getPrefixMapper());			
			marshaller.marshal(pkg, System.out);				
		}
	}

	/**
	 * The switch method specific to the visitor of the model structure.
	 * @param eObject object to visit.
	 */
	abstract protected void doSwitch(EObject eObject);

	/**
	 * Output instructions depending upon selection type.
	 * Assumes ML package has been initialized via setupDocument().
	 * Processes the selection(s) using the model's visitor switch.
	 * @param monitor progress monitor
	 * @return {@code OK_STATUS} on success or {@code CANCEL_STATUS} on monitor canceled 
	 * @throws JAXBException 
	 * @throws Docx4JException 
	 */
	protected IStatus exportSelection(IProgressMonitor monitor) throws JAXBException,
	Docx4JException {
		factory = new ObjectFactory();

		if ( null != getResource() ) {
			monitor.subTask("Producing resource content");
			// iterates over all nodes in the resource using a visitor pattern
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getResource(), true); iter.hasNext(); ) {
				EObject eObject = iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		} else if ( null != getNodeCollection() ) {
			monitor.subTask("Producing node collection content");
			// iterates over the given collection in order using a visitor pattern
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getNodeCollection(), true); iter.hasNext(); ) {
				EObject eObject = iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		} else {
			monitor.subTask("Producing node content");
			// iterates over a node and its children
			// do the node itself, then its contents
			doSwitch(getNode());
			for ( final Iterator<EObject> iter = EcoreUtil.getAllContents(getNode(), true); iter.hasNext(); ) {
				EObject eObject = iter.next(); // $codepro.audit.disable variableDeclaredInLoop
				doSwitch(eObject);
				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					return Status.CANCEL_STATUS;
				}
			}
		}

		return Status.OK_STATUS;
	}

}
