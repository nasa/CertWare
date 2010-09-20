/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/** // $codepro.audit.disable typeJavadoc
 * Bundle activator.  Start and stop only.
 * @author mrb
 * @since 1.0
 */
public class Activator implements BundleActivator {

	/** bundle context */
	private static BundleContext context;

	/**
	 * Returns the bundle context.
	 * @return bundle context
	 */
	public BundleContext getContext() {
		return context;
	}

	/**
	 * Starts the bundle.  Saves the bundle context reference.
	 * @param bundleContext bundle context
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) {
		Activator.context = bundleContext;
	}

	/**
	 * Stops the bundle.  
	 * @param bundleContext bundle context
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) {
		Activator.context = null;
	}

}
