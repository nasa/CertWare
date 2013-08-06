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
	/** annotations image key */
	public static final String NODE_ANNOTATIONS = "annotations"; //$NON-NLS-1$
	/** assurance case image key */
	public static final String NODE_ASSURANCE_CASES = "assurance.cases"; //$NON-NLS-1$
	/** date-times image key */
	public static final String NODE_DATE_TIMES = "date.times"; //$NON-NLS-1$
	/** model elements image key */
	public static final String NODE_MODEL_ELEMENTS = "model.elements"; //$NON-NLS-1$
	/** SACM elements image key */
	public static final String NODE_SACM_ELEMENTS = "sacm.elements"; //$NON-NLS-1$
	/** tagged values image key */
	public static final String NODE_TAGGED_VALUES = "tagged.values"; //$NON-NLS-1$
	/** utility elements image key */
	public static final String NODE_UTILITY_ELEMENTS = "utility.elements"; //$NON-NLS-1$

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
        initializeImage(registry,bundle,Messages.ImageKey0,NODE_ANNOTATIONS);
        initializeImage(registry,bundle,Messages.ImageKey1,NODE_ASSURANCE_CASES);
        initializeImage(registry,bundle,Messages.ImageKey2,NODE_DATE_TIMES);
        initializeImage(registry,bundle,Messages.ImageKey3,NODE_MODEL_ELEMENTS);
        initializeImage(registry,bundle,Messages.ImageKey4,NODE_SACM_ELEMENTS);
        initializeImage(registry,bundle,Messages.ImageKey5,NODE_TAGGED_VALUES);
        initializeImage(registry,bundle,Messages.ImageKey6,NODE_UTILITY_ELEMENTS);
     }

}
