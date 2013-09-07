/**
 * CertWare Project
 */
package net.certware.core.ui.dialog;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.Dictionary;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Provides a dialog presenting the option to view exception details.
 * @author mrb
 */
public class ExceptionDetailsDialog extends AbstractDetailsDialog {

	/** the exception details, with Throwable and IStatus special treatment */
	private final Object details;
	/** the hosting plugin, used for additional context information */
	private final Plugin plugin;

	/**
	 * Constructor when given the parent shell.
	 * @param parentShell parent shell
	 * @param title dialog title
	 * @param image dialog image, from display
	 * @param message dialog message body
	 * @param details exception details object for details pane
	 * @param plugin plug-in host for context information
	 */
	public ExceptionDetailsDialog(Shell parentShell, 
			String title, Image image, String message, Object details, Plugin plugin)
	{
		this(new SameShellProvider(parentShell), title, image, message, details, plugin);
	}
	
	/**
	 * Constructor when given the parent shell provider.
	 * @param parentShell parent shell
	 * @param title dialog title
	 * @param image dialog image, from display
	 * @param message dialog message body
	 * @param details exception details object for details pane
	 * @param plugin plug-in host for context information
	 */
	public ExceptionDetailsDialog(IShellProvider parentShell, 
			String title, Image image, String message, Object details, Plugin plugin)
	{
		super(parentShell, 
				getTitle(title, details), getImage(image, details), getMessage(message,details));
		
		this.details = details;
		this.plugin = plugin;
	}
	
	/**
	 * Returns the title for the dialog.  If the title is given, return it.
	 * If the details are <code>Throwable</code>, return the class name of the
	 * last invocation target exception. Otherwise, returns "Exception". 
	 * @param title dialog title
	 * @param details exception details
	 * @return title, exception class name, or "Exception"
	 */
	public static String getTitle(String title, Object details) {
		if ( title != null )
			return title;
		
		if ( details instanceof Throwable ) {
			Throwable e = (Throwable)details;
			while (e instanceof InvocationTargetException)
				e = ((InvocationTargetException)e).getTargetException();
			String name = e.getClass().getName();
			return name.substring(name.lastIndexOf('.')+1);
		}
		return "Exception";
	}

	/**
	 * Returns the image for the dialog.  
	 * If the image is given, return it. 
	 * If the details is an <code>IStatus</code> return the corresponding
	 * image from the display defaults.  
	 * Otherwise, return the display default error icon.
	 * @param image dialog icon image
	 * @param details exception details
	 * @return one of the <code>SWT</code> icon images.
	 */
	public static Image getImage(Image image, Object details) {
		if ( image != null )
			return image;
		
		Display display = Display.getCurrent();
		if ( display == null ) 
			return null;
		if ( details instanceof IStatus ) {
			switch(((IStatus)details).getSeverity()) {
			case IStatus.ERROR : return display.getSystemImage(SWT.ICON_ERROR);
			case IStatus.WARNING : return display.getSystemImage(SWT.ICON_WARNING);
			case IStatus.INFO : return display.getSystemImage(SWT.ICON_INFORMATION);
			case IStatus.OK : return null;
			}
		}
		return display.getSystemImage(SWT.ICON_ERROR);
	}

	/**
	 * Returns the dialog message.  
	 * If the details are <code>Throwable</code> then return the message
	 * associated with the last invocation target exception.  
	 * If the details are <code>IStatus</code> then return the associated message.
	 * If the message is given, return it.
	 * Otherwise, return "An exception occurred.".  
	 * @param message dialog message or null
	 * @param details exception details object or null
	 * @return exception message, status message, message, or "An exception occurred."
	 */
	public static String getMessage(String message, Object details) {
		if ( details instanceof Throwable ) {
			Throwable e = (Throwable)details;
			while ( e instanceof InvocationTargetException )
				e = ((InvocationTargetException)e).getTargetException();
			if ( message == null )
				return e.toString();
			return MessageFormat.format(message, new Object[] { e.toString() } );
		} // throwable

		if ( details instanceof IStatus ) {
			String statusMessage = ((IStatus)details).getMessage();
			if ( message == null )
				return statusMessage;
			return MessageFormat.format(message, new Object[] { statusMessage } );
		} // status
		
		if ( message != null )
			return message;
		
		return "An exception occurred.";
	}

	/**
	 * Appends an exception to the message stack trace.
	 * Handles <code>CoreException</code> and <code>InvocationTargetException</code>
	 * throwables, ignoring others.  
	 * @param writer the writer containing the trace
	 * @param ex the dialog exception details
	 */
	public static void appendException(PrintWriter writer, Throwable ex) {
		if ( ex instanceof CoreException ) {
			appendStatus(writer, ((CoreException)ex).getStatus(), 0);
			writer.println();
		}
		
		appendStackTrace(writer, ex);
		if ( ex instanceof InvocationTargetException )
			appendException(writer, ((InvocationTargetException) ex).getTargetException());
	}
	
	/**
	 * Appends an exception to the message stack trace.
	 * Handles <code>IStatus</code> objects.  
	 * @param writer the writer containing the trace
	 * @param status the exception details
	 * @param nesting the nesting level for status messages, each yielding two space indent
	 */
	public static void appendStatus(PrintWriter writer, IStatus status, int nesting) {
		for ( int i = 0; i < nesting; i++ ) 
			writer.print("  "); // $NON-NLS-1$
		writer.println(status.getMessage());
		IStatus[] children = status.getChildren();
		for ( int i = 0; i < children.length; i++ )
			appendStatus(writer,children[i],nesting+1);
	}

	/**
	 * Prints the exception stack trace to the writer.
	 * @param writer the writer destination for the stack trace
	 * @param ex an exception containing the stack
	 */
	public static void appendStackTrace(PrintWriter writer, Throwable ex) {
		ex.printStackTrace(writer);
	}

	/**
	 * Creates the details panel and content for a dialog parent.
	 * Meant to be used in response to a details button request.
	 * @param parent part of the details dialog
	 * @return the new panel
	 */
	protected Control createDetailsArea(Composite parent) {
		
		// create details panel
		Composite panel = new Composite(parent,SWT.NONE);
		panel.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		panel.setLayout(layout);
		
		// create details content
		createProductInfoArea(panel);
		createDetailsViewer(panel);
		
		return panel;
	}

	/**
	 * Creates the product information area of the details area.
	 * Includes information about the plug-in identified in the constructor.
	 * Two-column grid layout.  
	 * @param parent details panel
	 * @return the new composite
	 */
	protected Composite createProductInfoArea(Composite parent) {
		// if no plugins specified, nothing to display 
		if ( plugin == null )
			return null;
		
		Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayoutData(new GridData());
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		composite.setLayout(layout);
		
		Dictionary <String,String>bundleHeaders = plugin.getBundle().getHeaders();
		String pluginId = plugin.getBundle().getSymbolicName();
		String pluginVendor = bundleHeaders.get("Bundle-Vendor");
		String pluginName = bundleHeaders.get("Bundle-Name");
		String pluginVersion = bundleHeaders.get("Bundle-Version");
		
		new Label(composite, SWT.NONE).setText("Provider:");
		new Label(composite, SWT.NONE).setText(pluginVendor);
		new Label(composite, SWT.NONE).setText("Plug-in Name:");
		new Label(composite, SWT.NONE).setText(pluginName);
		new Label(composite, SWT.NONE).setText("Plug-in ID:");
		new Label(composite, SWT.NONE).setText(pluginId);
		new Label(composite, SWT.NONE).setText("Version:");
		new Label(composite, SWT.NONE).setText(pluginVersion);
		
		return composite;
	}
	
	/**
	 * Creates the details trace area of the details panel.
	 * Provided as text area, read-only, scrolling.
	 * @param parent details panel
	 * @return new text widget
	 */
	protected Control createDetailsViewer(Composite parent) {
		if ( details == null ) return null;
		
		Text text = new Text(parent, SWT.MULTI | SWT.READ_ONLY | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		text.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		// create the content
		StringWriter writer = new StringWriter(1000);
		if ( details instanceof Throwable )
			appendException(new PrintWriter(writer), (Throwable)details);
		else if (details instanceof IStatus )
			appendStatus(new PrintWriter(writer), (IStatus)details, 0);
		text.setText(writer.toString());
		
		return text;
	}
}
