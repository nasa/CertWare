// $codepro.audit.disable typeJavadoc
/**
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.export;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Activates the bundle.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin {
	/** bundle context */
	private BundleContext context; 
	/** plugin ID for image acquisition */
	private static final String PLUGIN_ID = "net.certware.export"; //$NON-NLS-1$

	/**
	 * Return the bundle context from start call.
	 * @return bundle context 
	 */
	BundleContext getContext() {
		return context;
	}

	/**
	 * Start the component.
	 * @param bundleContext bundle context
	
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext) */
	public void start(BundleContext bundleContext) {
		context = bundleContext;
	}

	/**
	 * Stop the component.
	 * @param bundleContext unused
	
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext) */
	public void stop(BundleContext bundleContext) {
		context = null;
	}
	
   /**
     * Returns an image descriptor for the image file at the given
     * plug-in relative path.
     * @param path the image descriptor path
     * @return the image descriptor 
     */
    public static ImageDescriptor getImageDescriptor(String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }
}
