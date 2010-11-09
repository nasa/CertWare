package net.certware.example;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Plugin activator for examples and wizard.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin implements BundleActivator, IExampleContribution {

	/** plugin id */
	public static final String PLUGIN_ID = "net.certware.example"; //$NON-NLS-1$
	/** bundle context */
	private static BundleContext context;
	/** default plugin reference */
	static Activator defaultID = null;
	
	public Activator() {
		super();
		defaultID = this;
	}
	
	static BundleContext getContext() {
		return context;
	}

	public static Activator getDefault() {
		return defaultID;
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
