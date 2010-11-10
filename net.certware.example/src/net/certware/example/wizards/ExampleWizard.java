package net.certware.example.wizards;

import java.lang.reflect.InvocationTargetException;

import net.certware.core.ui.log.CertWareLog;
import net.certware.example.Activator;
import net.certware.example.ExampleContributions;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 */
public class ExampleWizard extends Wizard implements INewWizard {
	private static final String EXAMPLE_WIZARD_HEIGHT = "EXAMPLE_WIZARD_HEIGHT";
	private static final String EXAMPLE_WIZARD_WIDTH = "EXAMPLE_WIZARD_WIDTH";
	private static final String TITLE = "CertWare Examples";
	private ExampleWizardPage page;
	private FormToolkit toolkit;
	private ExampleContributions ec;
	private IContainer targetContainer;
	
	/**
	 * Provides an example selection wizard.
	 * Uses the examples populated by extension point contributions.
	 * Copies the selected example's resources into the selected workspace container.
	 */
	public ExampleWizard() {
		super();
		setWindowTitle(TITLE);
		setNeedsProgressMonitor(true);
		setDialogSettings( Activator.getDefault().getDialogSettings() );
		setHelpAvailable(true);
		toolkit = new FormToolkit(Display.getCurrent());
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		
		// overriding this method so as to resize the dialog after the container exists
		setDialogSize();
	}

	/**
	 * Sets the parent dialog size according to previous resized dimensions.
	 */
	private void setDialogSize() {
		IWizardContainer wc = this.getContainer();
		if ( wc != null ) {
			IDialogSettings ds = getDialogSettings();
			try {
				int w = ds.getInt(EXAMPLE_WIZARD_WIDTH);
				int h = ds.getInt(EXAMPLE_WIZARD_HEIGHT);
				wc.getShell().setSize(w, h);
			} catch( Exception e ) {
				// ignored, usually missing keys on first use
			}
			return;
		}
	}
	
	/**
	 * Adding the scrolled block page to the wizard.
	 */
	public void addPages() {
		page = new ExampleWizardPage(ec,toolkit);
		addPage(page);
		
		setDialogSize();
	}

	/**
	 * Saves the dialog dimensions in the plugin's dialog store.
	 * Calls the super class dispose to handle the pages.
	 */
	public void dispose() {
		Point p = getShell().getSize();
		IDialogSettings ds = getDialogSettings();
		ds.put(EXAMPLE_WIZARD_WIDTH,p.x);
		ds.put(EXAMPLE_WIZARD_HEIGHT,p.y);
		super.dispose();
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		// TODO find the page selection, then extract its resources from the selected bundle
		
		final String fileName = "mytest.wiz";
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}

		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */
	private void doFinish(String fileName,IProgressMonitor monitor) throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		/*
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		*/
		
	}

	@SuppressWarnings("unused")
	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, "net.certware.example", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

		if ( selection == null || (selection.getFirstElement() instanceof IContainer) == false) {
			CertWareLog.logWarning("Wizard must have a container selection for examples");
			return;
		}
		
		// target container destination for copying resources
		targetContainer = (IContainer)selection.getFirstElement();
		if ( targetContainer.exists() == false ) {
			CertWareLog.logWarning("Wizard found target container does not exist");
			return;
		}
		
		// load the example contributions attached to the plugin
		ec = new ExampleContributions();
		ec.initialize();
	}
	
	
	@Override
	public boolean canFinish() {
		return page.isPageComplete();
	}
}