package net.certware.argument.arm.navigator;

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

	/** error image */
	Image errorImage = null;
	/** open image */
	Image openImage = null;
	/** closed image */
	Image closedImage = null;

	/**
	 * Constructor gets images from shared images collection.
	 */
	public LabelProvider() {

		errorImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		openImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_WARN_TSK);
		closedImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);

		/*
	    ImageDescriptor id = null;
	    id = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/obj16/safe.gif");
	    if ( id != null ) 
	      safeImage = id.createImage();
		 */
	}

	/**
	 * Add a label provider listener.
	 * @param listener unused
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	/**
	 * Dispose of resources.
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		/*
	    if ( safeImage != null )
	        safeImage.dispose();
		 */
	}

	/**
	 * Whether the element is a label property. 
	 * @param element unused
	 * @param property unused
	 * @return always returns false
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(Object, String)
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	/**
	 * Remove a label provider listener.
	 * @param listener unused
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	/**
	 * Gets an element description for TreeData objects.
	 * @param anElement object for description, only applicable for TreeData
	 * @return node count string for tree data, otherwise null
	 * @see org.eclipse.ui.navigator.IDescriptionProvider#getDescription(Object)
	 */
	@Override
	public String getDescription(Object anElement) {
	    if ( anElement instanceof TreeData ) {
	        TreeData td = (TreeData)anElement;
	        return "Node count:" + ' ' + getText(td);
	      }
	      return null;
	}

	/**
	 * Gets the image associated with and object.
	 * @param element object for test, only applicable for TreeData
	 * @return image based on type, or null
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(Object)
	 */
	@Override
	public Image getImage(Object element) {
		if ( element instanceof TreeData ) {

			TreeData td = (TreeData)element;
			if ( td.getType() == TreeData.COUNT_TYPE_CLOSED )
				return closedImage;
			if ( td.getType() == TreeData.COUNT_TYPE_OPEN )
				return openImage;
			if ( td.getType() == TreeData.COUNT_TYPE_ERROR )
				return errorImage;
		}
		return null;
	}

	/**
	 * Gets the text description of an element.
	 * @param element object for test, only applicable for TreeData
	 * @return element description and count, otherwise null
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(Object)
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
