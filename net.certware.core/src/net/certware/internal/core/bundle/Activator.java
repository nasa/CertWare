package net.certware.internal.core.bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	/** bundle context */
	private static BundleContext context;
	
	public static BundleContext getContext() {
		return context;
	}
	
	public Activator() {
	}
	
	/**
	 * Starts the bundle.  Saves the bundle context reference.
	 * @param bundleContext bundle context
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
	}

	/**
	 * Stops the bundle.  
	 * @param bundleContext bundle context
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		Activator.context = null;
	}

}
