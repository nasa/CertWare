package net.certware.argument.eur.navigator;

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

	Image errorImage = null;
	Image openImage = null;
	Image closedImage = null;

	public LabelProvider() {

		errorImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		openImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_WARN_TSK);
		closedImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);

		/*
	    ImageDescriptor id = null;
	    id = CertWareUIPlugin.imageDescriptorFromPlugin(CertWareUIPlugin.PLUGIN_ID, "icons/obj16/safe.gif");
	    if ( id != null ) 
	      safeImage = id.createImage();
		 */
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

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
			if ( td.getType() == TreeData.COUNT_TYPE_CLOSED )
				return closedImage;
			if ( td.getType() == TreeData.COUNT_TYPE_OPEN )
				return openImage;
			if ( td.getType() == TreeData.COUNT_TYPE_ERROR )
				return errorImage;
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
