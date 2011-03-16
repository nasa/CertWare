package net.certware.planning.cpn.navigator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * CertWareUIPlugin for navigator plugin.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin implements BundleActivator {

	private static BundleContext context;
	public static String PLUGIN_ID = "net.certware.planning.cpn.navigator"; //$NON-NLS-1$

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
