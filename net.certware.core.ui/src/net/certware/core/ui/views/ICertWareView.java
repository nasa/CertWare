package net.certware.core.ui.views;

import org.eclipse.core.resources.IFile;

public interface ICertWareView
{

  /**
   * Set the selected file in the viewer.
   * @param file to use for source, as found in workspace
   * @return true if changed
   */
  public boolean setSelectedFile(IFile file);
  
  /**
   * Get the state of whether the view is linked with the editor.
   * Usually true if the user sets the link state.
   * @return true if view and editor linked
   */
  public boolean getLinkingEditor();
  
  /**
   * Sets the state of whether the view is linked with the editor.
   */
  public void setLinkingEditor(boolean sle);
  
  /**
   * Returns the default file extension used for this view's content files.
   * @return the default extension, usually the first extension found in generator model extensions
   */
  public String getDefaultExtension();
  
}
