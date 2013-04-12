package net.certware.verification.checklist.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.IDescriptionProvider;

/**
 * Label provider for navigator contribution.
 * Provides summary data about the model resource.
 * @author mrb
 * @since 1.0
 */
public class LabelProvider implements ILabelProvider, IDescriptionProvider {

	/** image for checklist item count */
	Image itemImage = null;
	/** image for yes choice count */
	Image yesResultImage = null;
	/** image for no choice count */
	Image noResultImage = null;
	/** image for N/A choice count */
	Image naResultImage = null;
	/** image for unknown choice count */
	Image unknownResultImage = null;

	/**
	 * Constructor creates images.
	 */
	public LabelProvider() {

		// platform images
		itemImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);
		//noResultImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		//naResultImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_WARN_TSK);

		// bundle images
	    ImageDescriptor id = Activator.getImageDescriptor("icons/obj16/result_yes.gif");
	    if ( id != null ) {
	      yesResultImage = id.createImage();
	    }
	    
	    id = Activator.getImageDescriptor("icons/obj16/result_no.gif");
	    if ( id != null ) {
	      noResultImage = id.createImage();
	    }

	    id = Activator.getImageDescriptor("icons/obj16/result_na.gif");
	    if ( id != null ) {
	      naResultImage = id.createImage();
	    }

	    id = Activator.getImageDescriptor("icons/obj16/result_unknown.gif");
	    if ( id != null ) {
	      unknownResultImage = id.createImage();
	    }
	}

	/**
	 * Add a label provider listener.  Not used.
	 * @param listener unused
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	/**
	 * Dispose of image resources if necessary.
	 */
	@Override
	public void dispose() {
		
		if ( yesResultImage != null) {
			yesResultImage.dispose();
		}
		
		if ( noResultImage != null ) {
			noResultImage.dispose();
		}

		if ( naResultImage != null ) {
			naResultImage.dispose();
		}

		if ( unknownResultImage != null ) {
			unknownResultImage.dispose();
		}
	}

	/**
	 * Whether the element has the label property.
	 * Not used.
	 * @return always returns false
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	/**
	 * Remove a label provider listener.
	 * Not used.
	 */
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

	/**
	 * Returns the image associated with the tree data element type.
	 * @param element tree data element
	 * @return one of the class images or null
	 */
	@Override
	public Image getImage(Object element) {
		if ( element instanceof TreeData ) {

			TreeData td = (TreeData)element;
			if ( td.getType() == TreeData.COUNT_TYPE_ITEM )
				return itemImage;
			if ( td.getType() == TreeData.COUNT_TYPE_NA_RESULT )
				return naResultImage;
			if ( td.getType() == TreeData.COUNT_TYPE_NO_RESULT )
				return noResultImage;
			if ( td.getType() == TreeData.COUNT_TYPE_YES_RESULT )
				return yesResultImage;
			if ( td.getType() == TreeData.COUNT_TYPE_UNKNOWN_RESULT )
				return unknownResultImage;
		}
		return null;
	}

	/**
	 * Returns a text string based on the tree data element count.
	 * @param element tree data element
	 * @return tree data item description, or description with count if positive, or null if not tree data.
	 */
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
