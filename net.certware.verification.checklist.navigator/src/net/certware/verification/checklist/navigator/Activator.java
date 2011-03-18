package net.certware.verification.checklist.navigator;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activates the navigator bundle.
 * @author mrb
 * @since 1.0
 */
public class Activator implements BundleActivator {

	/** bundle context */
	static private BundleContext context;

	/**
	 * Returns the plugin ID using the bundle symbolic name.
	 * @return bundle symbolic name
	 */
	static public String getPluginId() {
		// File f = context.getDataFile("icons/obj16/yesResult.gif");
		return context.getBundle().getSymbolicName();
	}

	/**
	 * Get an image descriptor from the given name.
	 * @param imageName image name, including bundle-relative path
	 * @return image descriptor or the default missing image descriptor
	 */
	static public ImageDescriptor getImageDescriptor(String imageName) {
		ImageDescriptor id = ImageDescriptor.createFromURL(
		              FileLocator.find(context.getBundle(), 
		            		  new Path(imageName), null));
		return id;
	}
	
	/**
	 * Get the bundle context.
	 * @return context used to start the bundle
	 */
	BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		context = null;
	}
}
