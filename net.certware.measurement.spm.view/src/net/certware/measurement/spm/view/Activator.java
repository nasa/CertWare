package net.certware.measurement.spm.view;

import java.net.URL;

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
 * CertWareUIPlugin for SPM view plugin.
 * Loads the image registry with keys exposed as public and static here.
 * @author mrb
 * @since 1.1
 */
public class Activator extends AbstractUIPlugin implements BundleActivator {

	public static String PLUGIN_ID = "net.certware.measurement.spm.view"; //$NON-NLS-1$
	
	public static final String COMPUTE_IMAGE = "compute.image";
	public static final String FORM_IMAGE = "form.image";
	public static final String HORIZONTAL_IMAGE = "horizontal.image";
	public static final String VERTICAL_IMAGE = "vertical.image";
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
	public static final String NODE_CRITICAL_CHANGE_ORDERS = "critical.image";
	public static final String NODE_NORMAL_CHANGE_ORDERS = "normal.image";
	public static final String NODE_IMPROVEMENT_CHANGE_ORDERS = "improvement.image";
	public static final String NODE_NEW_CHANGE_ORDERS = "neworders.image";
	public static final String NODE_TOTAL_CHANGE_ORDERS = "totalorders.image";
	public static final String NODE_TOTAL_SIZE = "totalsize.image";
	public static final String NODE_BROKEN_SIZE = "brokensize.image";
	public static final String NODE_FIXED_SIZE = "fixedsize.image";
	public static final String COMMIT_IMAGE = "commit.image";
	public static final String NODE_BASELINED_LINES = "baselined.image";
	public static final String NODE_USAGE_TIME = "usage.image";
	public static final String NODE_REPAIR_EFFORT = "repair.image";
	public static final String NODE_DEVELOPMENT_EFFORT = "development.image";

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
	 * Loads the images by key into the given registry.
	 * @param registry image registry to load
	 */
	@Override
    protected void initializeImageRegistry(ImageRegistry registry) {
        Bundle bundle = Platform.getBundle(PLUGIN_ID);
        initializeImage(registry,bundle,"icons/obj16/ratio.gif",COMPUTE_IMAGE);
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
        initializeImage(registry,bundle,"icons/obj16/spider.png",FORM_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_horizontal.gif",HORIZONTAL_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_vertical.gif",VERTICAL_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/commit.gif",COMMIT_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/critical_changes.gif",NODE_CRITICAL_CHANGE_ORDERS);
        initializeImage(registry,bundle,"icons/obj16/normal_changes.gif",NODE_NORMAL_CHANGE_ORDERS);
        initializeImage(registry,bundle,"icons/obj16/improvement_changes.gif",NODE_IMPROVEMENT_CHANGE_ORDERS);
        initializeImage(registry,bundle,"icons/obj16/new_changes.gif",NODE_NEW_CHANGE_ORDERS);
        initializeImage(registry,bundle,"icons/obj16/sigma.gif",NODE_TOTAL_CHANGE_ORDERS);
        initializeImage(registry,bundle,"icons/obj16/artifacts.gif",NODE_TOTAL_SIZE);
        initializeImage(registry,bundle,"icons/obj16/artifacts.gif",NODE_BROKEN_SIZE);
        initializeImage(registry,bundle,"icons/obj16/artifacts.gif",NODE_FIXED_SIZE);
        initializeImage(registry,bundle,"icons/obj16/baselined_lines.gif",NODE_BASELINED_LINES);
        initializeImage(registry,bundle,"icons/obj16/usage.gif",NODE_USAGE_TIME);
        initializeImage(registry,bundle,"icons/obj16/development.gif",NODE_DEVELOPMENT_EFFORT);
        initializeImage(registry,bundle,"icons/obj16/repair.gif",NODE_REPAIR_EFFORT);
     }

}
