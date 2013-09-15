/**
 * CertWare Project
 * Copyright (c) 2010-2013 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.export.sacm.jobs;

import java.util.Collection;
import java.util.Iterator;

import javax.xml.bind.JAXBException;

import net.certware.core.ui.log.CertWareLog;
import net.certware.export.jobs.AbstractExportJob;
import net.certware.sacm.SACM.Annotation;
import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.Datetime;
import net.certware.sacm.SACM.ModelElement;
import net.certware.sacm.SACM.SACMElement;
import net.certware.sacm.SACM.SACMPackage;
import net.certware.sacm.SACM.TaggedValue;
import net.certware.sacm.SACM.UtilityElement;
import net.certware.sacm.SACM.util.SACMSwitch;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.wml.P;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Exports SACM model elements to a document file.
 * Designed as well to be super class of exporting jobs for models extending SACM notation.
 * @author mrb
 * @since 2.0
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
	
	// TODO in work
	public SACMSwitch<Boolean> visitor = new SACMSwitch<Boolean>() {
		private boolean writeTagsHeader = false;
		
		public Boolean caseAnnotation(Annotation a) {
			return null;
		}
		
		public Boolean caseAssuranceCase(AssuranceCase ac) {
			return null;
		}
		
		public Boolean caseDatetime(Datetime d) {
			return null;
		}
		
		public Boolean 	caseModelElement(ModelElement me) {
			// prefix, identifier, description, and content
			// tagged values visited in a different case

			// prefix, identifier, description, and content
			// tagged values visited in a different case
			//Br b = factory.createBr();
			//b.setType(STBrType.TEXT_WRAPPING);
			P modelElementParagraph = factory.createP();
			String id = me.getId();
			String heading = id;
			// String heading = prefix + ' ' + id;
			//if ( id.startsWith(prefix) )
			modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.MODEL_ELEMENT),heading));
			//modelElementParagraph.getParagraphContent().add( factory.createRTab() );
			//modelElementParagraph.getParagraphContent().add( factory.createRTab() );
			//modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.MODEL_ELEMENT__IDENTIFIER),me.getIdentifier()));
			// modelElementParagraph.getParagraphContent().add( factory.createRCr());
			modelElementParagraph.getParagraphContent().add( factory.createBr());
			modelElementParagraph.getParagraphContent().add( addRunOfText("Annotations: "));
			Iterator<Annotation> i = me.getAnnotation().iterator();
			while( i.hasNext() ) {
				Annotation a = i.next();
				modelElementParagraph.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.MODEL_ELEMENT__ANNOTATION),a.getContent()));
			}
			modelElementParagraph.getParagraphContent().add( factory.createBr());
			modelElementParagraph.getParagraphContent().add( addRunOfText("Tags: "));
			Iterator<TaggedValue> t = me.getTaggedValue().iterator();
			while( t.hasNext() ) {
				TaggedValue v = t.next();
				caseTaggedValue(v);
			}

			mainDocumentPart.addObject(modelElementParagraph);

			return Boolean.TRUE;
		}

		public Boolean 	caseSACMElement(SACMElement se) {
			// TODO
			return null;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * @param taggedValue the target of the switch.
		 * @return always returns TRUE
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean 	caseTaggedValue(TaggedValue tv) {
			if ( writeTagsHeader ) {
				addStyledText(styleMap.get(SACMPackage.TAGGED_VALUE),"Tags");
				writeTagsHeader = false;
			}
			
			P tagLine = factory.createP();
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE),"Key:"));
			tagLine.getParagraphContent().add( addRunOfText(" "));
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE__KEY),tv.getKey()));
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE),"Value:"));
			tagLine.getParagraphContent().add( addRunOfText(" "));
			tagLine.getParagraphContent().add( addStyledRunOfText(styleMap.get(SACMPackage.TAGGED_VALUE__VALUE),tv.getValue()));
			mainDocumentPart.addObject(tagLine);
			
			return Boolean.TRUE;
		}

		public Boolean 	caseUtilityElement(UtilityElement ue) {
			return null;
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
	 * Returns the visitor for the SACM model traversal.
	 * @return visitor suitable for SACM switch 
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
		styleMap.put(SACMPackage.ANNOTATION__CONTENT, new StyleEntry(false,"AnnotationContent"));
		styleMap.put(SACMPackage.ANNOTATION_FEATURE_COUNT, new StyleEntry(false,"AnnotationFeatureCount"));
		styleMap.put(SACMPackage.ASSURANCE_CASE, new StyleEntry(true,"AssuranceCase"));
		styleMap.put(SACMPackage.ASSURANCE_CASE__ANNOTATION, new StyleEntry(false,"AssuranceCaseAnnotation"));
		styleMap.put(SACMPackage.ASSURANCE_CASE__ARGUMENT, new StyleEntry(true,"AssuranceCaseArgument"));
		styleMap.put(SACMPackage.ASSURANCE_CASE__EVIDENCE, new StyleEntry(true,"AssuranceCaseEvidence"));
		styleMap.put(SACMPackage.ASSURANCE_CASE__GID, new StyleEntry(false,"AssuranceCaseGid"));
		styleMap.put(SACMPackage.ASSURANCE_CASE__ID, new StyleEntry(false,"AssuranceCaseId"));
		styleMap.put(SACMPackage.ASSURANCE_CASE__NAME, new StyleEntry(false,"AssuranceCaseName"));
		styleMap.put(SACMPackage.ASSURANCE_CASE__TAGGED_VALUE, new StyleEntry(false,"AssuranceCaseTaggedValue"));
		styleMap.put(SACMPackage.ASSURANCE_CASE_FEATURE_COUNT, new StyleEntry(false,"AssuranceCaseFeatureCount"));
		styleMap.put(SACMPackage.BOOLEAN, new StyleEntry(false,"Boolean"));
		styleMap.put(SACMPackage.DATETIME, new StyleEntry(false,"DateTime"));
		styleMap.put(SACMPackage.DATETIME__DATETIME, new StyleEntry(false,"DateTimeDateTime"));
		styleMap.put(SACMPackage.DATETIME_FEATURE_COUNT, new StyleEntry(false,"DateTimeFeatureCount"));
		styleMap.put(SACMPackage.INTEGER, new StyleEntry(false,"Integer"));
		styleMap.put(SACMPackage.MODEL_ELEMENT, new StyleEntry(false,"ModelElement"));
		styleMap.put(SACMPackage.MODEL_ELEMENT__ANNOTATION, new StyleEntry(false,"ModelElementAnnotation"));
		styleMap.put(SACMPackage.MODEL_ELEMENT__ID, new StyleEntry(false,"ModelElementId"));
		styleMap.put(SACMPackage.MODEL_ELEMENT__TAGGED_VALUE, new StyleEntry(false,"ModelElementTaggedValue"));
		styleMap.put(SACMPackage.MODEL_ELEMENT_FEATURE_COUNT, new StyleEntry(false,"ModelElementFeatureCount"));
		styleMap.put(SACMPackage.SACM_ELEMENT, new StyleEntry(false,"SacmElement"));
		styleMap.put(SACMPackage.SACM_ELEMENT_FEATURE_COUNT, new StyleEntry(false,"SacmElementFeatureCount"));
		styleMap.put(SACMPackage.STRING, new StyleEntry(false,"String"));
		styleMap.put(SACMPackage.TAGGED_VALUE,new StyleEntry(false, "TaggedValue"));
		styleMap.put(SACMPackage.TAGGED_VALUE__KEY, new StyleEntry(false,"TaggedValueKey"));
		styleMap.put(SACMPackage.TAGGED_VALUE__VALUE, new StyleEntry(false,"TaggedValueValue"));
		styleMap.put(SACMPackage.TAGGED_VALUE_FEATURE_COUNT, new StyleEntry(false,"TaggedValueFeatureCount"));
		styleMap.put(SACMPackage.UTILITY_ELEMENT, new StyleEntry(false,"UtilityElement"));
		styleMap.put(SACMPackage.UTILITY_ELEMENT_FEATURE_COUNT, new StyleEntry(false,"UtilityElementFeatureCount"));

		// assignStyleId(SACMPackage.MODEL_ELEMENT__CONTENT,true,"Heading2Char"); // TODO testing
		// assignStyleId(SACMPackage.ARGUMENT_ELEMENT__CONTENT,false,"Heading3Char"); // TODO testing

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
