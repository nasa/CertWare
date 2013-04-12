/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * @author mrb
 * @since 1.0.3
 */
public class ExportStyleIdMapping extends ExportContribution implements IExportContribution {

	/** model element ID */
	String modelElementId;
	/** document paragraph or run style ID */
	String styleId;
	/** whether the style is for paragraphs */
	String styleIsParagraph;

	/**
	 * Create the contribution for a style ID and extract the contribution.
	 * @param ce extension point contribution configuration element
	 */
	public ExportStyleIdMapping(IConfigurationElement ce) {
		super(ce);
		
		if ( ce != null ) {
			// extract fields
			modelElementId = safeAssignment(ce,EXPORT_STYLEID_MODEL_ELEMENT_ID);
			styleId = safeAssignment(ce,EXPORT_STYLEID_STYLE_STRING);
			styleIsParagraph = safeAssignment(ce,EXPORT_STYLEID_IS_PARAGRAPH);
		}

	}
	
	public String getStyleId() {
		return styleId;
	}

	public String getStyleIsParagraph() {
		return styleIsParagraph;
	}
	
	public Boolean isParagraph() {
		return Boolean.valueOf(styleIsParagraph);
	}
	
	public int getModelElementId() {
		int id = 0;
		try {
			id = Integer.parseInt(modelElementId);
		} catch( NumberFormatException nfe ) {
			CertWareLog.logError("Export contribution model element ID",nfe);
		}
		return id;
	}
}
