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
public class ExportStyleString extends ExportContribution implements IExportContribution {

	/** XML format string */
	String xmlString;
	/** whether the style is for a paragraph */
	String styleIsParagraph;

	/**
	 * Create the contribution for a style ID and extract the contribution.
	 * @param ce extension point contribution configuration element
	 */
	public ExportStyleString(IConfigurationElement ce) {
		super(ce);

		if ( ce != null ) {

			// extension contributor
			contributor = ce.getContributor();

			// 	extract fields
			xmlString = safeAssignment(ce, EXPORT_CONTRIBUTION_STYLE_STRING);
			styleIsParagraph = safeAssignment(ce, EXPORT_CONTRIBUTION_IS_PARAGRAPH);
		}
	}

	public String getXmlString() {
		return xmlString;
	}

	public String getStyleIsParagraph() {
		return styleIsParagraph; // expecting Boolean value owing to schema
	}

	public Boolean isParagraph() {
		return Boolean.valueOf(styleIsParagraph);
	}

}
