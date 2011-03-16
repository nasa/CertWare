package net.certware.history.egit;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;

/**
 * CertWareUIPlugin for the history provider.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin implements BundleActivator {

	/** singleton reference */
	static private Activator plugin = null;
	
	public Activator() {
		super();
		plugin = this;
	}
	
	/**
	 * Returns the reference to the plugin.
	 * @return plugin reference
	 */
	public static Activator getDefault() {
		return plugin;
	}


}
