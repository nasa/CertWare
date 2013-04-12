/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export;

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * @author mrb
 * @since 1.0.3
 */
public class ExportStyleResource extends ExportContribution implements IExportContribution {

	/** model element ID */
	String xmlFile;
	/** document paragraph or run style ID */
	String theme;

	/**
	 * Create the contribution for a style ID and extract the contribution.
	 * @param ce extension point contribution configuration element
	 */
	public ExportStyleResource(IConfigurationElement ce) {
		super(ce);
		
		if ( ce != null ) {
			// extract fields
			xmlFile = safeAssignment(ce,EXPORT_RESOURCE_FILE);
			theme = safeAssignment(ce,EXPORT_RESOURCE_THEME);
		}
	}
	
	public String getXmlFile() {
		return xmlFile;
	}
	
	public String getTheme() {
		return theme;
	}
}
