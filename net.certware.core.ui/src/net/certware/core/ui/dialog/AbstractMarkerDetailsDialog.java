/**
 * 
 */
package net.certware.core.ui.dialog;

import net.certware.core.ui.CertWareUI;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.help.IWorkbenchHelpSystem;


/**
 * Abstract marker details dialog.  Intended for details on a marker resolution.
 * @author mrb
 * @since 1.0
 */
public abstract class AbstractMarkerDetailsDialog extends TrayDialog
{
  /** form toolkit for generating widget */
  protected FormToolkit formToolkit = null;
  /** form toolkit colors */
  protected FormColors formColors = null;
  /** composite for dialog area */
  protected Composite composite;
  /** marker content to display */
  protected IMarker marker;
  /** dialog settings keys */
  static final String DETAILS_DIALOG_SETTINGS = "MARKER_DETAILS_DIALOG_SETTINGS";

  /**
   * Constructor creates the toolkit and colors, and sets shell style.
   * @param shell dialog parent shell
   * @param marker marker content to display
   */
  public AbstractMarkerDetailsDialog(Shell shell, IMarker marker)
  {
    super(shell);
    formColors = this.getFormColors(shell.getDisplay());
    formToolkit = this.getFormToolkit(shell.getDisplay());
    this.marker = marker;
    setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE );
  }

  /**
   * Provide for storing the dialog location, size, and section states.
   */
  protected IDialogSettings getDialogBoundsSettings() {
    IDialogSettings settings = CertWareUI.getDefault().getDialogSettings();
    IDialogSettings section = settings.getSection(DETAILS_DIALOG_SETTINGS);

    if (section == null) {
      section = settings.addNewSection(DETAILS_DIALOG_SETTINGS);
    }
    return section;
  }

  /**
   * Creates the OK button for the button bar.
   */
  protected void createButtonsForButtonBar(Composite parent) {
    createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
  }
  
  /**
   * Set the context IDs for help system.  
   * Wait to call until site has been established.
   */
  protected void setHelpContextIDs(Control control, String id) {
    IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
    helpSystem.setHelp(control, id);
  }
  
  /**
   * Create the dialog area.
   * This is a scrolled form with several sections.
   * @param parent dialog parent for the form
   */
  protected abstract Control createDialogArea(Composite parent);
  
  /**
   * Close the dialog, dispose of colors and toolkit.
   */
  public boolean close() {
    if ( formColors != null ) {
      formColors.dispose();
    }
    if ( formToolkit != null ) {
      formToolkit.dispose();
    }
    return super.close();
}

  /**
   * Returns the shared instance of the form colors.
   * Creates the resource on first access. 
   * @param display
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
   * @param display
   * @return shared toolkit
   */
  public FormToolkit getFormToolkit(Display display) {
    if ( formToolkit == null ) {
      formToolkit = new FormToolkit(getFormColors(display));
    }
    return formToolkit;
  }

}


