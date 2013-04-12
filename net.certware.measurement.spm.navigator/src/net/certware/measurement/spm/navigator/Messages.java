package net.certware.measurement.spm.navigator;

import org.eclipse.osgi.util.NLS;

/**
 * @author mrb
 * @since 1.1
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "net.certware.measurement.spm.navigator.messages"; //$NON-NLS-1$
	
	static public String Job = null;
	static public String ResourceChanged = null;
	
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
