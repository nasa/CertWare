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
	final String EXPORT_ELEMENT_STYLEID_MAPPING = "styleIdMapping"; //$NON-NLS-1$
	/** extension point element key for style resources */
	final String EXPORT_ELEMENT_STYLE_RESOURCE = "styleResource"; //$NON-NLS-1$
	/** extension point element key for style contributions */
	final String EXPORT_ELEMENT_STYLE_CONTRIBUTION = "styleContribution"; //$NON-NLS-1$
	/** extension point element key for export operation class */
	final String EXPORT_ELEMENT_OPERATION = "exportOperation"; //$NON-NLS-1$
	
	final String EXPORT_STYLEID_MODEL_ELEMENT_ID = "modelElementID"; //$NON-NLS-1$
	final String EXPORT_STYLEID_STYLE_STRING = "styleString"; //$NON-NLS-1$
	final String EXPORT_STYLEID_IS_PARAGRAPH = "isParagraphStyle"; //$NON-NLS-1$
	
	final String EXPORT_RESOURCE_FILE = "styleFile"; //$NON-NLS-1$
	final String EXPORT_RESOURCE_THEME = "styleTheme"; //$NON-NLS-1$
	
	final String EXPORT_CONTRIBUTION_STYLE_STRING = "styleString"; //$NON-NLS-1$
	final String EXPORT_CONTRIBUTION_IS_PARAGRAPH = "isParagraphStyle"; //$NON-NLS-1$
	
	final String EXPORT_OPERATION_FILE_EXTENSION = "fileExtension"; //$NON-NLS-1$
	final String EXPORT_OPERATION_CLASS = "class"; //$NON-NLS-1$
}
