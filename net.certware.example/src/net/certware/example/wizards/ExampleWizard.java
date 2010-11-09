package net.certware.example.wizards;

import java.lang.reflect.InvocationTargetException;

import net.certware.core.ui.log.CertWareLog;
import net.certware.example.ExampleContributions;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.internal.Workbench;

/**
 */
public class ExampleWizard extends Wizard implements INewWizard {
	private static final String TITLE = "CertWare Examples";
	private ExampleWizardPage page;
	private IStructuredSelection selection;
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
		toolkit = new FormToolkit(Display.getCurrent());
	}
	

	/**
	 * Adding the scrolled block page to the wizard.
	 */
	public void addPages() {
		page = new ExampleWizardPage(ec,toolkit);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {

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
	

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "net.certware.example", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		System.err.println("example wizard selection is " + selection );

		// TODO fix the selection
		
		/*
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
		*/
		
		// load the example contributions attached to the plugin
		ec = new ExampleContributions();
		ec.initialize();
		
		this.selection = selection;
	}
	
	
	@Override
	public boolean canFinish() {
		return page.isPageComplete();
	}
}