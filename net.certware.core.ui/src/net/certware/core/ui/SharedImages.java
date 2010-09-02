package net.certware.core.ui;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class SharedImages
{
  /**
   * Returns a platform shared image for the given type
   * @param type message provider type
   * @return SWT graphics object from platform UI plugin
   */
  public static org.eclipse.swt.graphics.Image getMessageImage(int type) {
    switch (type) {
      case IMessageProvider.ERROR:
        return PlatformUI.getWorkbench().getSharedImages().getImage(
          ISharedImages.IMG_OBJS_ERROR_TSK);
      case IMessageProvider.WARNING:
        return PlatformUI.getWorkbench().getSharedImages().getImage(
          ISharedImages.IMG_OBJS_WARN_TSK);
      case IMessageProvider.INFORMATION:
        return PlatformUI.getWorkbench().getSharedImages().getImage(
          ISharedImages.IMG_OBJS_INFO_TSK);
    }
    return null;
  }

}
