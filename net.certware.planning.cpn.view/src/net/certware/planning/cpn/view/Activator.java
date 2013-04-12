package net.certware.planning.cpn.view;

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

public class Activator extends AbstractUIPlugin implements BundleActivator {

	public static String PLUGIN_ID = "net.certware.planning.cpn.view"; //$NON-NLS-1$
	
	public static final String CPN_IMAGE = "cpn.image"; //$NON-NLS-1$ 
	public static final String VERTICAL_IMAGE = "vertical.image"; //$NON-NLS-1$
	public static final String HORIZONTAL_IMAGE = "horizontal.image"; //$NON-NLS-1$
	public static final String FIND_IMAGE = "find.image"; //$NON-NLS-1$
	public static final String IMPORT_IMAGE = "import.image"; //$NON-NLS-1$
	public static final String ISOLATION_IMAGE = "isolation.image"; //$NON-NLS-1$
	public static final String OUTLINE_IMAGE = "outline.image"; //$NON-NLS-1$
	public static final String PLAN_IMAGE = "plan.image"; //$NON-NLS-1$
	public static final String VALID_IMAGE = "valid.image"; //$NON-NLS-1$
	public static final String VALIDATE_IMAGE = "validate.image"; //$NON-NLS-1$
	
	/** singleton reference */
	static private Activator plugin = null;
	
	public Activator() {
		super();
		plugin = this;
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
        initializeImage(registry,bundle,"icons/obj16/cpn.gif",CPN_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/find.gif",FIND_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/import.gif",IMPORT_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/isolation.gif",ISOLATION_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/outline.gif",OUTLINE_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/plan.gif",PLAN_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_horizontal.gif",HORIZONTAL_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_vertical.gif",VERTICAL_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/valid.png",VALID_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/validate.gif",VALIDATE_IMAGE);
     }

}
