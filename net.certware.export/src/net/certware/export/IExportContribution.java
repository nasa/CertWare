/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export;

/**
 * CertWare export contributions extension point.
 * @author mrb
 * @since 1.0.3
 */
public interface IExportContribution {
	/** extension point name space */
	final String EXPORT_EXTENSION = "net.certware.export"; //$NON-NLS-1$
	
	/** extension point element key style ID mappings */
	final String EXPORT_ELEMENT_STYLEID_MAPPING = "styleid_mapping"; //$NON-NLS-1$
	/** extension point element key for style resources */
	final String EXPORT_ELEMENT_STYLE_RESOURCE = "style_resource"; //$NON-NLS-1$
	/** extension point element key for style contributions */
	final String EXPORT_ELEMENT_STYLE_CONTRIBUTION = "style_contribution"; //$NON-NLS-1$
	
	final String EXPORT_STYLEID_MODEL_ELEMENT_ID = "model_element_id"; //$NON-NLS-1$
	final String EXPORT_STYLEID_STYLE_ID = "style_id"; //$NON-NLS-1$
	
	final String EXPORT_RESOURCE_XML_FILE = "xml_file"; //$NON-NLS-1$
	final String EXPORT_RESOURCE_DESCRIPTION = "description"; //$NON-NLS-1$
	
	final String EXPORT_STYLE_XML_STRING = "xml_string"; //$NON-NLS-1$
}
