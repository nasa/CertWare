package net.certware.measurement.spm.navigator;

import java.net.URL;

import net.certware.measurement.spm.navigator.Activator;

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
 * @since 1.1
 */
public class Activator extends AbstractUIPlugin implements BundleActivator {

	public static String PLUGIN_ID = "net.certware.measurement.spm.navigator"; //$NON-NLS-1$
	
	public static final String NODE_SCRAP_RATIO = "scrap.ratio";
	public static final String NODE_REWORK_RATIO = "rework.ratio";
	public static final String NODE_MODULARITY = "modularity";
	public static final String NODE_ADAPTABILITY = "adaptability";
	public static final String NODE_MATURITY = "maturity";
	public static final String NODE_MAINTAINABILITY = "maintainability";
	public static final String NODE_REWORK_STABILITY = "rework.stability";
	public static final String NODE_REWORK_BACKLOG = "rework.backlog";
	public static final String NODE_MODULARITY_TREND = "modularity.trend";
	public static final String NODE_ADAPTABILITY_TREND = "adaptability.trend";
	public static final String NODE_MATURITY_TREND = "maturity.trend";


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
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_SCRAP_RATIO);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_REWORK_RATIO);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_MODULARITY);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_ADAPTABILITY);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_MATURITY);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_MAINTAINABILITY);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_REWORK_STABILITY);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",NODE_REWORK_BACKLOG);
        initializeImage(registry,bundle,"icons/obj16/trend.gif",NODE_MODULARITY_TREND);
        initializeImage(registry,bundle,"icons/obj16/trend.gif",NODE_ADAPTABILITY_TREND);
        initializeImage(registry,bundle,"icons/obj16/trend.gif",NODE_MATURITY_TREND);
     }

}
