/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;

/**
 * @author mrb
 * @since 1.0.3
 */
public class ExportContribution {

	/** contributor of the example, usually a plugin or fragment ID */
	protected IContributor contributor;
	/** configuration element of the contribution */
	protected IConfigurationElement ce;

	/**
	 * @param ce contribution element
	 */
	public ExportContribution(IConfigurationElement ce) {
		this.ce = ce;
	}

	/**
	 * Ensures the string assignment does not return null.
	 * @param ce configuration element
	 * @param key attribute key
	 * @return string from attribute or empty string
	 */
	protected String safeAssignment(IConfigurationElement ce, String key) {
		String s = ce.getAttribute(key);
		if ( s == null ) s = "";
		return s;
	}

}
