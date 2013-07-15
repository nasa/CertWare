package net.certware.sacm.navigator;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements BundleActivator {

	/** plug-in ID */
	public static final String PLUGIN_ID = "net.certware.sacm.navigator"; //$NON-NLS-1$

	/** TODO names for images */
	public static final String NODE_ARTIFACTS = "artifacts.image"; //$NON-NLS-1$


	/** singleton reference */
	private static Activator plugin = null;
	
	/**
	 * The constructor
	 */
	public Activator() {
		super();
		plugin = this;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	/**
	 * Load and install an image in the registry.
	 * @param registry plugin registry from activation
	 * @param bundle plugin bundle containing images
	 * @param fileName image file name relative to bundle
	 * @param id key for image retrieval
	 */
	private void initializeImage(ImageRegistry registry, Bundle bundle, String fileName, String id) {
        IPath path = new Path(fileName);
        URL url = FileLocator.find(bundle,path,null);
        ImageDescriptor desc = ImageDescriptor.createFromURL(url);
        registry.put(id, desc);
	}
	
	/**
	 * Image registry loading.
	 */
	@Override
    protected void initializeImageRegistry(ImageRegistry registry) {
        Bundle bundle = Platform.getBundle(PLUGIN_ID);
        initializeImage(registry,bundle,"icons/obj16/artifacts.gif",NODE_ARTIFACTS);
     }

}
