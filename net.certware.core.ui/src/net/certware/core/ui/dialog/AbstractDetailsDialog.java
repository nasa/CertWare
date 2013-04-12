package net.certware.core.ui.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Provides a details dialog class meant to be sub-classed for specific detail content.
 * Dialog provides a details button and grow-able details area. 
 * @author mrb
 */
public abstract class AbstractDetailsDialog extends Dialog {

	/** dialog title */
	private final String title;
	/** dialog message */
	private final String message;
	/** dialog icon image */
	private final Image image;
	/** dialog details request button */
	private Button detailsButton;
	/** dialog details area control */
	private Control detailsArea;
	/** dialog cached window size for snap-back */
	private Point cachedWindowSize;
	
	/**
	 * Constructor given the parent shell.
	 * Creates an application model, resizable dialog.
	 * @param parentShell parent shell
	 * @param title dialog title
	 * @param image dialog icon image
	 * @param message dialog message body
	 */
	public AbstractDetailsDialog(Shell parentShell, String title, Image image, String message ) {
		this(new SameShellProvider(parentShell), title, image, message);
	}

	/**
	 * Constructor given the shell provider.
	 * Creates an application model, resizable dialog.
	 * @param parentShell parent shell provider
	 * @param title dialog title
	 * @param image dialog image 
	 * @param message dialog message body
	 */
	public AbstractDetailsDialog(IShellProvider parentShell,
			String title, Image image, String message)
	{
		super(parentShell);
		
		this.title = title;
		this.image = image;
		this.message = message;
		
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE | SWT.APPLICATION_MODAL);
	}

	/** 
	 * Configures the shell and sets the title.
	 * @param shell shell to configure
	 */
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		if ( title != null )
			shell.setText(title);
	}
	
	/**
	 * Creates the dialog area, including image and message.
	 */
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite)super.createDialogArea(parent);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		if ( image != null ) {
			((GridLayout)composite.getLayout()).numColumns = 2;
			Label label = new Label(composite,0);
			image.setBackground(label.getBackground());
			label.setImage(image);
			label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER | GridData.VERTICAL_ALIGN_BEGINNING));
		}
		
		Label label = new Label(composite, SWT.WRAP);
		if ( message != null )
			label.setText(message);
		GridData data = new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_CENTER);
		data.widthHint = convertHorizontalDLUsToPixels(
				IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
		label.setLayoutData(data);
		label.setFont(parent.getFont());
		
		return composite;
	}
	
    /**
     * Creates the OK and Details buttons for the button bar.
     */
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
        detailsButton = createButton(parent, IDialogConstants.DETAILS_ID, IDialogConstants.SHOW_DETAILS_LABEL,false);
    }
	
	/**
	 * Captures the button press to trigger toggling the details area.
	 * If not the details button, forwards the button press to the superclass.
	 */
	protected void buttonPressed(int id) {
		if ( id == IDialogConstants.DETAILS_ID )
			toggleDetailsArea();
		else
			super.buttonPressed(id);
	}

	/**
	 * Toggles the details area display.
	 * Shows or hides the details area, including changing the details button label. 	
	 * Resizes the dialog window, saving original size.
	 */
	protected void toggleDetailsArea() {
		Point oldWindowSize = getShell().getSize();
		Point newWindowSize = cachedWindowSize;
		cachedWindowSize = oldWindowSize;
		
		// show the details area
		if ( detailsArea == null ) {
			detailsArea = createDetailsArea((Composite)getContents());
			detailsButton.setText(IDialogConstants.HIDE_DETAILS_LABEL);
		} else { 
			// hide the details area
			detailsArea.dispose();
			detailsArea = null;
			detailsButton.setText(IDialogConstants.SHOW_DETAILS_LABEL);
		}
		
		// compute the new window size
		Point oldSize = getContents().getSize();
		Point newSize = getContents().computeSize(SWT.DEFAULT, SWT.DEFAULT);
		if ( newWindowSize == null ) 
			newWindowSize = new Point(oldWindowSize.x, oldWindowSize.y + (newSize.y - oldSize.y));
		
		// crop new window size to screen
		Point windowLoc = getShell().getLocation();
		org.eclipse.swt.graphics.Rectangle screenArea = getContents().getDisplay().getClientArea();
		if ( newWindowSize.y > screenArea.height - (windowLoc.y - screenArea.y))
			newWindowSize.y = screenArea.height - (windowLoc.y - screenArea.y);
		
		getShell().setSize(newWindowSize);
		((Composite)getContents()).layout();
	}

	/**
	 * Method for sub-classes to provide to deliver details.
	 * @param parent dialog details area
	 * @return details panel
	 */
	protected abstract Control createDetailsArea(Composite parent);
}
