package net.certware.argument.sfp.review;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;

public class Activator extends AbstractUIPlugin  {

	public static final String REVIEW_VALID_IMAGE = "valid.image"; //$NON-NLS-1$
	public static final String REVIEW_INVALID_IMAGE = "invalid.image"; //$NON-NLS-1$
	public static final String REVIEW_UNKNOWN_IMAGE = "unknown.image"; //$NON-NLS-1$
	public static final String REVIEW_PROOF_IMAGE = "proof.image"; //$NON-NLS-1$
	public static final String REVIEW_STATEMENT_IMAGE = "statement.image"; //$NON-NLS-1$
	public static final String REVIEW_HYPOTHESIS_IMAGE = "hypothesis.image"; //$NON-NLS-1$
	public static final String REVIEW_HORIZONTAL_IMAGE = "horizontal.image"; //$NON-NLS-1$
	public static final String REVIEW_VERTICAL_IMAGE = "vertical.image"; //$NON-NLS-1$
	public static final String REVIEW_ENTAILMENT_IMAGE = "entailment.image"; //$NON-NLS-1$
	
	/** plugin id */
	public static final String PLUGIN_ID = "net.certware.argument.sfp.review"; //$NON-NLS-1$
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
        initializeImage(registry,bundle,"icons/obj16/hypothesis.gif",REVIEW_HYPOTHESIS_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/invalid.png",REVIEW_INVALID_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/proof.gif",REVIEW_PROOF_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/statement.gif",REVIEW_STATEMENT_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_horizontal.gif",REVIEW_HORIZONTAL_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/th_vertical.gif",REVIEW_VERTICAL_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/unknown.gif",REVIEW_UNKNOWN_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/valid.png",REVIEW_VALID_IMAGE);
        initializeImage(registry,bundle,"icons/obj16/entailment.gif",REVIEW_ENTAILMENT_IMAGE);
     }
}
