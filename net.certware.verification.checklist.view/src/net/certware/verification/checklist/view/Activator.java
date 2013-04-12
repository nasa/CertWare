package net.certware.verification.checklist.view;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.osgi.framework.Bundle;

import net.certware.core.ui.CertWareUIPlugin;

/**
 * CertWareUIPlugin to launch the plugin.
 * @author mrb
 * @since 1.2.1
 */
public class Activator extends CertWareUIPlugin {

	/** plugin ID */
	public static final String PLUGIN_ID = "net.certware.verification.checklist.view"; //$NON-NLS-1$
	/** image key for checklist */
	public static final String CHECKLIST_IMAGE = "checklist.image"; //$NON-NLS-1$
	public static final String ASCENDING_IMAGE = "ascending.image"; //$NON-NLS-1$
	public static final String DESCENDING_IMAGE = "descending.image"; //$NON-NLS-1$
	public static final String FILTER_IMAGE = "filter.image"; //$NON-NLS-1$
	
	/**
	 * CertWareUIPlugin saves the plugin reference.
	 */
	public Activator() {
		super();
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
        initializeImage(registry,bundle,"icons/view16/checklist.png",CHECKLIST_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/ascending.gif",ASCENDING_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/descending.gif",DESCENDING_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/filter_top_level.gif",FILTER_IMAGE);
     }
}
