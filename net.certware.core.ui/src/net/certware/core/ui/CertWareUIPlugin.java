package net.certware.core.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;

/**
 * Convenience plugin superclass for UI parts.
 * @author mrb
 * @since 1.2.1
 */
public class CertWareUIPlugin extends AbstractUIPlugin implements BundleActivator {

	/** singleton reference */
	static private CertWareUIPlugin plugin = null;
	/** form colors reference */
	private FormColors formColors;
	/** form toolkit reference */
	private FormToolkit formToolkit;

	/**
	 * CertWareUIPlugin saves the plugin reference.
	 */
	public CertWareUIPlugin() {
		super();
		plugin = this;
	}
	
	/**
	 * Returns the reference to the plugin.
	 * @return plugin reference
	 */
	public static CertWareUIPlugin getDefault() {
		return plugin;
	}
	
    /**
     * Returns the shared instance of the form colors.
     * Creates the resource on first access. 
     * @param display color source display
     * @return shared colors  
     */
    public FormColors getFormColors(Display display) {
      if (formColors == null) {
        formColors = new FormColors(display);
        formColors.markShared();
      }
      return formColors;
    }

    /**
     * Returns the shared instance of the form toolkit.
     * Also creates the form colors if necessary.
     * @param display color source display    
     * @return shared toolkit 
     */
    public FormToolkit getFormToolkit(Display display) {
      if ( formToolkit == null ) {
        formToolkit = new FormToolkit(getFormColors(display));
      }
      return formToolkit;
    }

}
