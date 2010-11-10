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
	static private Activator plugin;
	

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static Activator getDefault() {
		return plugin;
	}

}
