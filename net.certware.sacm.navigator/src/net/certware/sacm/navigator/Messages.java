package net.certware.sacm.navigator;

import org.eclipse.osgi.util.NLS;

/**
 * @author mrb
 * @since 1.0
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "net.certware.sacm.navigator.messages"; //$NON-NLS-1$
	
	static public String Job = null;
	static public String ResourceChanged = null;
	
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}

	public static String ContentProvider_0;

	public static String ContentProvider_1;

	public static String ContentProvider_2;

	public static String ContentProvider_3;

	public static String ContentProvider_4;

	public static String ContentProvider_5;

	public static String ContentProvider_6;

	public static String ImageKey0;

	public static String ImageKey1;

	public static String ImageKey2;

	public static String ImageKey3;

	public static String ImageKey4;

	public static String ImageKey5;

	public static String ImageKey6;
}
