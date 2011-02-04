/**
 * CertWare Project
 */
package net.certware.core.ui.decorators;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.preferences.PreferenceConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

/**
 * A label decorator for CertWare resources.
 * Adds the preference suffix and foreground color to the resource appearance
 * in the explorer. 
 * @author mrb
 * @since 1.1.0
 */
public class ResourceLabelDecorator implements ILightweightLabelDecorator, ICertWareConstants
{
	/** the property change listener for preference changes */
	protected IPropertyChangeListener preferenceListener;
	/** the foreground color, set as a preference */
	protected Color foregroundColor = null;
	/** the label suffix, set as a preference */
	protected String labelSuffix = null;
	/** image descriptor for the overlay */
	protected ImageDescriptor overlay = null;

	/**
	 * Constructor pulls preferences and sets preference listener.
	 */
	public ResourceLabelDecorator() {
		setPreferredColor();
		setPreferredSuffix();
		addPreferenceListener();
		overlay = CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.OVERLAY_IMAGE);
	}

	/**
	 * Decorates file names ending with any file extension given in the model wizard.
	 * Adds an image and label suffix.
	 * @param element object to decorate, expecting an IFile
	 * @param decoration decoration for the resource  
	 */
	public void decorate(Object element, IDecoration decoration)
	{
		if ( null != element && element instanceof IFile ) {
			IFile f = (IFile)element;

			if ( ICertWareConstants.FILE_EXTENSIONS.contains(f.getFileExtension())) {
				decoration.addOverlay( overlay );
				if ( null != labelSuffix ) decoration.addSuffix( labelSuffix );
				if ( null != foregroundColor ) decoration.setForegroundColor( foregroundColor );
			}
		} 
	}

	public void addListener(ILabelProviderListener listener)
	{
		// no op
	}

	/**
	 * Disposes of resources.
	 * Disposes of the foreground color if set.
	 */
	public void dispose()
	{
		if ( null != foregroundColor ) {
			foregroundColor.dispose();
		}
	}

	/**
	 * Always returns true.
	 */
	public boolean isLabelProperty(Object element, String property)
	{
		return true;
	}

	/**
	 * Unused.
	 */
	public void removeListener(ILabelProviderListener listener)
	{
	}

	/**
	 * Removes our listener from preference store changes.
	 */
	protected void removePreferenceListener() {
		CertWareUI.getDefault().getPreferenceStore().removePropertyChangeListener(preferenceListener);
	}

	/**
	 * Responds to changes in the preferences when the plug-in is installed.
	 * Note that the workspace is not refreshed here so user action will cause changes to show.
	 */
	protected void addPreferenceListener() {

		preferenceListener = new IPropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent event)
			{
				if ( event.getProperty().equals(PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND )) {
					setPreferredColor();
					return;
				}
				if ( event.getProperty().equals(PreferenceConstants.P_LABEL_DECORATOR_SUFFIX )) {
					setPreferredSuffix();
					return;
				}
			}
		};

		CertWareUI.getDefault().getPreferenceStore().addPropertyChangeListener(preferenceListener);
	}

	/**
	 * Sets the preferred foreground color.  
	 * Disposes of prior color.
	 */
	public void setPreferredColor() {
		if ( null != foregroundColor ) foregroundColor.dispose();
		IPreferenceStore ps = CertWareUI.getDefault().getPreferenceStore();
		RGB rgb = PreferenceConverter.getColor(ps, PreferenceConstants.P_LABEL_DECORATOR_FOREGROUND);
		foregroundColor = new Color(null,rgb.red,rgb.green,rgb.blue);
	}

	/**
	 * Sets the label suffix.
	 */
	public void setPreferredSuffix() {
		IPreferenceStore ps = CertWareUI.getDefault().getPreferenceStore();
		labelSuffix = ps.getString(PreferenceConstants.P_LABEL_DECORATOR_SUFFIX); 
	}

}
