package net.certware.example;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * Plugin activator for examples and wizard.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin implements IExampleContribution {

	/** plugin id */
	public static final String PLUGIN_ID = "net.certware.example"; //$NON-NLS-1$
	/** category image key */
	public static final String EXAMPLE_CATEGORY_IMAGE = "example.category";
	/** pattern image key */
	public static final String EXAMPLE_PATTERN_IMAGE = "example.pattern";
	/** document image key */
	public static final String EXAMPLE_DOCUMENT_IMAGE = "example.document";
	/** checklist image key */
	public static final String EXAMPLE_CHECKLIST_IMAGE = "example.checklist";
	/** horizontal image key */
	public static final String EXAMPLE_HORIZONTAL_IMAGE = "example.horizontal";
	/** vertical image key */
	public static final String EXAMPLE_VERTICAL_IMAGE = "example.vertical";
	/** singleton reference */
	static private Activator plugin;
	
	/**
	 * Start the bundle.
	 * @param context bundle context
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * Stop the bundle.
	 * @param context bundle context
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the reference to the plugin.
	 * @return plugin reference
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
        initializeImage(registry,bundle,"icons/obj16/category.gif",EXAMPLE_CATEGORY_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/pattern.gif",EXAMPLE_PATTERN_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/document.gif",EXAMPLE_DOCUMENT_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/checklist.gif",EXAMPLE_CHECKLIST_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_horizontal.gif",EXAMPLE_HORIZONTAL_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_vertical.gif",EXAMPLE_VERTICAL_IMAGE);
     }
}
