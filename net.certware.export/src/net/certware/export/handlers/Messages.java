/**
 * CertWare Project
 * NASA Langley Research Center
 * Kestrel Technology LLC
 */
package net.certware.export.handlers;

import org.eclipse.osgi.util.NLS;

/**
 * @author mrb
 */
public class Messages extends NLS {
	/**
	 * Field BUNDLE_NAME.
	 * (value is ""net.certware.export.handlers.messages"")
	 */
	private static final String BUNDLE_NAME = "net.certware.export.handlers.messages"; //$NON-NLS-1$
	/**
	 * Field ExportARMHandler_0.
	 */
	public static String ExportARMHandler_0;
	/**
	 * Field ExportARMHandler_1.
	 */
	public static String ExportARMHandler_1;
	/**
	 * Field ExportGSNHandler_0.
	 */
	public static String ExportGSNHandler_0;
	/**
	 * Field ExportGSNHandler_1.
	 */
	public static String ExportGSNHandler_1;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	/**
	 * Constructor for Messages.
	 */
	private Messages() {
	}
}
