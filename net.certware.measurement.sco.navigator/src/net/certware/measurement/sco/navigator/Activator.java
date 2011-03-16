package net.certware.measurement.sco.navigator;

import java.net.URL;

import net.certware.measurement.sco.navigator.Activator;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * CertWareUIPlugin for navigator plugin.
 * @author mrb
 * @since 1.0
 */
public class Activator extends AbstractUIPlugin implements BundleActivator {

	public static String PLUGIN_ID = "net.certware.measurement.sco.navigator"; //$NON-NLS-1$
	
	public static final String NODE_ARTIFACTS = "artifacts.image"; //$NON-NLS-1$
	public static final String NODE_BASELINE = "baseline.image"; //$NON-NLS-1$
	public static final String NODE_CURRENT = "current.image"; //$NON-NLS-1$
	public static final String NODE_CRITICAL = "critical.image"; //$NON-NLS-1$
	public static final String NODE_NORMAL = "normal.image"; //$NON-NLS-1$
	public static final String NODE_IMPROVEMENT = "improvement.image"; //$NON-NLS-1$
	public static final String NODE_NEW_FEATURE = "feature.image"; //$NON-NLS-1$
	public static final String NODE_TOTAL = "total.image"; //$NON-NLS-1$


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
        initializeImage(registry,bundle,"icons/obj16/artifacts.gif",NODE_ARTIFACTS);
        initializeImage(registry,bundle,"icons/obj16/baselined_lines.gif",NODE_BASELINE);
        initializeImage(registry,bundle,"icons/obj16/current_lines.gif",NODE_CURRENT);
        initializeImage(registry,bundle,"icons/obj16/critical_changes.gif",NODE_CRITICAL);
        initializeImage(registry,bundle,"icons/obj16/normal_changes.gif",NODE_NORMAL);
        initializeImage(registry,bundle,"icons/obj16/improvement_changes.gif",NODE_IMPROVEMENT);
        initializeImage(registry,bundle,"icons/obj16/new_changes.gif",NODE_NEW_FEATURE);
        initializeImage(registry,bundle,"icons/obj16/total_changes.gif",NODE_TOTAL);
     }

}
