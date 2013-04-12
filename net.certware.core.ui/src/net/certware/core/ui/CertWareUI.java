/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.core.ui;

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
public class CertWareUI extends AbstractUIPlugin implements BundleActivator {

	/** plugin id */
	public static final String PLUGIN_ID = "net.certware.core.ui"; //$NON-NLS-1$
	/** plugin instance */
	static private CertWareUI plugin;

	/** job image key */
	public static final String JOB_IMAGE = "job.image"; //$NON-NLS-1$
	/** nature overlay image key */
	public static final String OVERLAY_IMAGE = "overlay.image"; //$NON-NLS-1$
	/** preferences image key */
	public static final String PREFERENCES_IMAGE = "preferences.image"; //$NON-NLS-1$
	/** overall project image */
	public static final String CERTWARE_IMAGE = "certware.image"; //$NON-NLS-1$
	/** add image */
	public static final String CERTWARE_ADD_IMAGE = "certware.add.image"; //$NON-NLS-1$
	/** open image */
	public static final String CERTWARE_OPEN_IMAGE = "certware.open.image"; //$NON-NLS-1$
	/** run image */
	public static final String CERTWARE_RUN_IMAGE = "certware.run.image"; //$NON-NLS-1$
	/** script image */
	public static final String CERTWARE_SCRIPT_IMAGE = "certware.script.image"; //$NON-NLS-1$
	/** wizard banner */
	public static final String CERTWARE_WIZARD_BANNER = "certware.wizban"; //$NON-NLS-1$
	/** export image */
	public static final String CERTWARE_EXPORT_IMAGE = "certware.export"; //$NON-NLS-1$
	
	/**
	 * Returns the shared instance
	 * @return the shared instance
	 */
	public static CertWareUI getDefault() {
		return plugin;
	}

	/**
	 * Constructor saves the singleton reference.
	 * Loads the job family icon.
	 */
	public CertWareUI() {
		super();
		plugin = this;
		
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
        initializeImage(registry,bundle,"icons/ovr7/certware-ovr.gif",OVERLAY_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/certware.gif",JOB_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/certware.gif",PREFERENCES_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/certware.gif",CERTWARE_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/certware-add.gif",CERTWARE_ADD_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/certware-open.gif",CERTWARE_OPEN_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/certware-run.gif",CERTWARE_RUN_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/certware-script.gif",CERTWARE_SCRIPT_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/export_wiz.gif",CERTWARE_EXPORT_IMAGE);
        initializeImage(registry,bundle,"icons/wizban/certware-wizban.png",CERTWARE_WIZARD_BANNER);
        
		// register an icon for the job family
		// jobs should reference this plugin ID when registering as belongs-to family
		getWorkbench().getProgressService().registerIconForFamily( 
				getImageRegistry().getDescriptor(JOB_IMAGE), PLUGIN_ID);
     }

}
