package net.certware.planning.cpn.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.navigator.IDescriptionProvider;


/**
 * Label provider for navigator contribution.
 * Provides summary data about the model resource.
 * @author mrb
 * @since 1.0
 */
public class LabelProvider implements ILabelProvider, IDescriptionProvider {

	Image planImage = null;
	Image importImage = null;

	/**
	 * Constructor creates the image references.
	 */
	public LabelProvider() {
		planImage = getImage("icons/obj16/plan.gif");
		importImage = getImage("icons/obj16/import.gif");
	}

	/**
	 * Fetch an image from the plugin given its path.
	 * @param path image path
	 * @return image or null
	 */
	private Image getImage(String path) {
	    ImageDescriptor id = null;
	    id = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, path);
	    if ( id != null ) 
	      return id.createImage();
	    return null;
	}
	
	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
		if ( planImage != null ) planImage.dispose();
		if ( importImage != null ) importImage.dispose();
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public String getDescription(Object anElement) {
	    if ( anElement instanceof TreeData ) {
	        TreeData td = (TreeData)anElement;
	        
	        return "Node count:" + ' ' + getText(td);
	      }
	      return null;
	}

	@Override
	public Image getImage(Object element) {
		if ( element instanceof TreeData ) {

			TreeData td = (TreeData)element;
			if ( td.getType() == TreeData.COUNT_TYPE_PLAN )
				return planImage;
			if ( td.getType() == TreeData.COUNT_TYPE_IMPORT )
				return importImage;
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if ( element instanceof TreeData ) {
			TreeData td = (TreeData)element;
			if ( td.getCount() < 0 )
				return td.getDescription();
			return td.getDescription() + ' ' + td.getCount();
		}
		return null;
	}

}
