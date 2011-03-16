package net.certware.core.ui.splash;

import net.certware.core.ui.CertWareUI;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.splash.EclipseSplashHandler;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("restriction")
public class OverlaySplashHandler extends EclipseSplashHandler {

	/** path to splash overlay */
	private static final String BETA_PNG = "icons/splash/badge_beta.jpg";
	/** border from corner */
	private static final int BORDER = 10;
	/** image reference to dispose */
	private Image image;
 
	public OverlaySplashHandler() {
		super();
	}
 
	@Override
	public void init(Shell splash) {
		super.init(splash);
 
		ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(CertWareUI.PLUGIN_ID, BETA_PNG);
		if (descriptor != null)
			image = descriptor.createImage();
		if (image !=null) {
			final int xposition = splash.getSize().x - image.getImageData().width - BORDER;
			final int yposition = BORDER;
			getContent().addPaintListener (new PaintListener () {
				public void paintControl (PaintEvent e) {
					e.gc.drawImage (image, xposition, yposition);
				}
			});
		}
	}
 
	@Override
	public void dispose() {
		super.dispose();
		if (image != null)
			image.dispose();
	}
 
}