package net.certware.example;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Plugin activator for examples and wizard.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin implements IExampleContribution {

	/** plugin id */
	public static final String PLUGIN_ID = "net.certware.example"; //$NON-NLS-1$
	/** singleton reference */
	static private Activator plugin;
	
	/**
	 * Start the bundle.
	 * @param context bundle context
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * Stop the bundle.
	 * @param context bundle context
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the reference to the plugin.
	 * @return plugin reference
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
