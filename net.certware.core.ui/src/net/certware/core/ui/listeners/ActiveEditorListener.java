package net.certware.core.ui.listeners;

import net.certware.core.ui.views.ICertWareView;

import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;

/**
 * Listens for active editor events.
 * Used here to identify the active editor.
 * @author mrb
 */
public class ActiveEditorListener implements IPartListener2
{
	/** the view reference */
	private ICertWareView certWareView = null;

	public ActiveEditorListener(ICertWareView tv) {
		this.certWareView = tv;
	}

	/**
	 * Method for part activated event.
	 * If the view is linked with the editor, then determine whether the editor contains a C file.
	 * If so, then find the associated view file using the root of the file name.
	 */
	@SuppressWarnings("unused")
	public void partActivated(IWorkbenchPartReference partRef)
	{
		if ( certWareView.getLinkingEditor() ) {
			// the part name turns out to be the file name
			String partName = partRef.getPartName();
			/*
      if ( partName.endsWith(C_FILE_EXTENSION)) {
        String extension = toolView.getDefaultExtension();
        String viewName = partName.substring(0, partName.lastIndexOf('.') + 1) + extension;
        IFile viewFile = FileFinder.findResourceByName(viewName, null, null);
        toolView.setSelectedFile(viewFile);
      }
			 */
		}
	}

	public void partDeactivated(IWorkbenchPartReference partRef)
	{
		// let the view content linger
	}

	public void partInputChanged(IWorkbenchPartReference partRef)
	{
		// the input might have changed, but the file name reference does not
	}

	public void partBroughtToTop(IWorkbenchPartReference partRef)
	{
	}

	public void partClosed(IWorkbenchPartReference partRef)
	{
	}

	public void partHidden(IWorkbenchPartReference partRef)
	{
	}

	public void partOpened(IWorkbenchPartReference partRef)
	{
	}

	public void partVisible(IWorkbenchPartReference partRef)
	{
	}


}
