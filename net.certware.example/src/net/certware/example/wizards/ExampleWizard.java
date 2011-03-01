package net.certware.example.wizards;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Enumeration;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.log.CertWareLog;
import net.certware.example.Activator;
import net.certware.example.Example;
import net.certware.example.ExampleContributions;
import net.certware.example.ExampleResource;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
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
 * A wizard to present a list of examples to the user for selection and copying to a workspace container.
 * @author mrb
 * @since 1.0
 */
public class ExampleWizard extends Wizard implements INewWizard {
	/** dialog height key */
	private static final String EXAMPLE_WIZARD_HEIGHT = "EXAMPLE_WIZARD_HEIGHT";
	/** dialog width key */
	private static final String EXAMPLE_WIZARD_WIDTH = "EXAMPLE_WIZARD_WIDTH";
	/** dialog title */
	private static final String TITLE = "CertWare Examples";
	/** wizard page */
	private ExampleWizardPage page;
	/** form toolkit */
	private FormToolkit toolkit;
	/** example contributions to host plugin */
	private ExampleContributions ec;
	/** target workspace container, a project or folder */
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
		setDefaultPageImageDescriptor(CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.CERTWARE_WIZARD_BANNER));
		setDialogSettings( Activator.getDefault().getDialogSettings() );
		setHelpAvailable(true);
		toolkit = new FormToolkit(Display.getCurrent());
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		
		// overriding this method so as to resize the dialog when the container exists
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
				CertWareLog.logWarning("Dialog settings not found for example wizard");
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
		
		// find the selected example
		final Example example = page.getSelectedExample(); 

		// create a runnable to copy resources
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(example, targetContainer, monitor);
				} catch (Exception e) {
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
			String message = "Exception in wizard finish:" + ' ' + realException.getMessage();
			MessageDialog.openError(getShell(), TITLE, message);
			return false;
		}

		return true;
	}
	
	/**
	 * Finds the contribution in the bundle then copies it to the target container in the workspace.
	 * @throws IOException for file access problems
	 * @throw CoreException for resource problems
	 */
	private void doFinish(Example example, IContainer target, IProgressMonitor monitor) throws CoreException, IOException {

		monitor.beginTask(MessageFormat.format("Copying resources from example {0}", 
				example.getName()),
				example.getRelatedResources().size() );
		Activator examplePlugin = Activator.getDefault();

		// for each resource found in the contributing example's resource list
		for ( ExampleResource exampleResource : example.getRelatedResources() ) {
			
			monitor.subTask(exampleResource.getDescription());
			
			String structure = exampleResource.getStructure();
			String subStructure = structure;
			int lio = subStructure.lastIndexOf( IPath.SEPARATOR );
			if ( lio > 0 )
				subStructure = subStructure.substring(lio+1);

			// find all entries in the bundle
			// finding more specific matches seems not to work in the expected way
			// scan all returned values and choose the last match
			Enumeration<URL> e = examplePlugin.getBundle().findEntries("/","*", true);
			URL matchedEntry = null;
			while( e.hasMoreElements() ) {
				URL entry = e.nextElement();
				//if ( entry.getFile().contains( structure ) ) { // contribution sequence dependent
				//matchedEntry = entry;
				//}
				
				if ( entry.getFile().endsWith( structure ) ) {
					matchedEntry = entry;
				}
			}

			// if not found for some reason, skip
			if ( matchedEntry == null ) {
        	  String message = MessageFormat.format("Example file {0} not found in contribution", 
        			  structure);
        	  CertWareLog.logWarning(message);
        	  continue;
			}

			// found entry
			// trim any folder segments from the entry for the target
	        String urlFile = matchedEntry.getFile();
	        lio = urlFile.lastIndexOf(IPath.SEPARATOR);
	        if ( lio > 0 )
	          urlFile = urlFile.substring(lio+1);
	        
	        IPath targetPath = new Path(target.getFullPath().toString() + IPath.SEPARATOR + urlFile);
	        IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFile(targetPath);

	        // open the bundle URL and pass it as input stream to workspace file
	        // the resource copies the URL reference to the workspace
	        if ( targetFile.exists() == false ) {
	          try {
	            InputStream is = matchedEntry.openStream();
	            targetFile.create(is, true, monitor);
	            is.close();
	            String message = MessageFormat.format("Copied example resource {0} to {1}",
	            		subStructure,
	            		target.getName()
	            		);
	            CertWareLog.logInfo(message);
	          } catch( IOException ioe ) {
	        	  String message = MessageFormat.format("Copying file from {0} to {1}", 
	        			  urlFile, 
	        			  targetFile.toString());
	        	  CertWareLog.logError(message,ioe);
	        	  throw ioe;
	          } catch( CoreException ce) {
	        	  String message = MessageFormat.format("Copying file from {0} to {1}", 
	        			  urlFile, 
	        			  targetFile.toString());
	        	  CertWareLog.logError(message,ce);
	        	  throw ce;
	          }
	        } // does not exist
	        else {
	        	// already exists, do not overwrite
	        	String message = MessageFormat.format(
	        			"Example resource {0} already exists; overwrite not performed", 
	        			targetFile.toString());
	        	CertWareLog.logWarning(message);
	        }
	        
			monitor.worked(1);
		}
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

		if ( selection == null || (selection.getFirstElement() instanceof IContainer) == false) {
			String message = "Wizard must have a container selection for examples";
			CertWareLog.logWarning(message);
			MessageDialog.openWarning(getShell(), TITLE, message);
			return;
		}
		
		// target container destination for copying resources
		targetContainer = (IContainer)selection.getFirstElement();
		if ( targetContainer.isAccessible() == false ) {
			String message = MessageFormat.format("Wizard found target container is not accessible: {0}",
					targetContainer.getName());
			CertWareLog.logWarning(message);
			MessageDialog.openWarning(getShell(), TITLE, message);
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