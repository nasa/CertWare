package net.certware.verification.checklist.navigator;

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

	Image itemImage = null;
	Image yesResultImage = null;
	Image noResultImage = null;
	Image naResultImage = null;

	public LabelProvider() {

		itemImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);
		noResultImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		naResultImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_WARN_TSK);
		yesResultImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);

		/*
	    ImageDescriptor id = null;
	    id = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/obj16/safe.gif");
	    if ( id != null ) 
	      safeImage = id.createImage();
		 */
	}

	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {
		/*
	    if ( safeImage != null )
	        safeImage.dispose();
		 */
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
			if ( td.getType() == TreeData.COUNT_TYPE_ITEM )
				return itemImage;
			if ( td.getType() == TreeData.COUNT_TYPE_NA_RESULT )
				return naResultImage;
			if ( td.getType() == TreeData.COUNT_TYPE_NO_RESULT )
				return noResultImage;
			if ( td.getType() == TreeData.COUNT_TYPE_YES_RESULT )
				return yesResultImage;
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
