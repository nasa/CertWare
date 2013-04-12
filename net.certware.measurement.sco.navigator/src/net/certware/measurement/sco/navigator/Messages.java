package net.certware.measurement.sco.navigator;

import org.eclipse.osgi.util.NLS;

/**
 * @author mrb
 * @since 1.0
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "net.certware.measurement.sco.navigator.messages"; //$NON-NLS-1$
	
	static public String Node_Artifact = null;
	static public String Node_Baselined = null;
	static public String Node_Current = null;
	static public String Node_Critical = null;
	static public String Node_Normal = null;
	static public String Node_Improvement = null;
	static public String Node_NewFeature = null;
	static public String Node_Total = null;
	static public String Job = null;
	static public String ResourceChanged = null;
	
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
