package net.certware.history;


import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * Activator for the history plugin.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin {

	/** plugin id */
	public static final String PLUGIN_ID = "net.certware.history"; //$NON-NLS-1$
	/** plugin instance */
	static private Activator plugin;
	/** bundle context reference */
	private BundleContext context;
	


	/**
	 * Returns the bundle context captured at start-up.
	 * @return bundle context
	 */
	BundleContext getContext() {
		return context;
	}
	
	/**
	 * Starts the bundle and registers an icon for the job family.
	 */
	public void start(BundleContext bundleContext) throws Exception {
		context = bundleContext;

		super.start(bundleContext);
		plugin = this;
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		context = null;
	}

	/**
	 * Returns the shared instance
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
