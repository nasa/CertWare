/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.core.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CertWareUI extends AbstractUIPlugin {

	/** plugin id */
	public static final String PLUGIN_ID = "net.certware.core.ui"; //$NON-NLS-1$
	/** job icon path */
	private static final String JOB_ICON = "icons/obj16/jobfamily.png";
	/** plugin instance */
	static private CertWareUI plugin;
	/** bundle context reference */
	private BundleContext context;
	
	/**
	 * The constructor
	 */
	public CertWareUI() {
	}


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
		
		// register an icon for the job family
		// jobs should reference this plugin ID when registering as belongs-to family
		getWorkbench().getProgressService().registerIconForFamily(
		      CertWareUI.imageDescriptorFromPlugin(PLUGIN_ID,JOB_ICON),PLUGIN_ID);
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
	public static CertWareUI getDefault() {
		return plugin;
	}

}
