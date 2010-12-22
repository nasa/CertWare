package net.certware.argument.sfp.review.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.core.ui.dialog.ExceptionDetailsDialog;
import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;


/**
 * A wizard to review a semi-formal proof.
 * Prompts analyst with step-by-step review of proof fragments, setting validation values.
 * @author mrb
 * @since 1.0.3
 */
public class ReviewWizard extends Wizard {

	/** dialog height key */
	private static final String REVIEW_WIZARD_HEIGHT = "REVIEW_WIZARD_HEIGHT";
	/** dialog width key */
	private static final String REVIEW_WIZARD_WIDTH = "REVIEW_WIZARD_WIDTH";
	/** dialog title */
	private static final String TITLE = "CertWare Semi-Formal Proof Review";
	/** wizard page */
	private ReviewValidatePage pageValidate;
	/** proof to review and update; will be read and written as resource */
	private Proof proof;
	/** form toolkit */
	private FormToolkit toolkit;
	/** setup page */
	private ReviewSetupPage pageSetup;
	/** page image path */
	private String PAGE_IMAGE = "icons/wizban/pattern_wiz.gif";


	/**
	 * Provides an example selection wizard.
	 * Uses the examples populated by extension point contributions.
	 * Copies the selected example's resources into the selected workspace container.
	 */
	public ReviewWizard() {
		super();
		setWindowTitle(TITLE);
		setNeedsProgressMonitor(false);
		setDialogSettings( Activator.getDefault().getDialogSettings() );
		setDefaultPageImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,PAGE_IMAGE));
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
				int w = ds.getInt(REVIEW_WIZARD_WIDTH);
				int h = ds.getInt(REVIEW_WIZARD_HEIGHT);
				wc.getShell().setSize(w, h);
			} catch( Exception e ) {
				CertWareLog.logWarning("Dialog settings not found for review wizard");
			}
			return;
		}
	}

	/**
	 * Adds the pages to the wizard and sets the dialog size.
	 */
	public void addPages() {
		pageSetup = new ReviewSetupPage(proof,toolkit);
		pageValidate = new ReviewValidatePage(proof,toolkit,pageSetup);

		addPage(pageSetup);
		addPage(pageValidate);

		setDialogSize();
	}

	/**
	 * Saves the dialog dimensions in the plugin's dialog store.
	 * Calls the super class dispose to handle the pages.
	 */
	public void dispose() {
		Point p = getShell().getSize();
		IDialogSettings ds = getDialogSettings();
		ds.put(REVIEW_WIZARD_WIDTH,p.x);
		ds.put(REVIEW_WIZARD_HEIGHT,p.y);
		super.dispose();
	}

	/**
	 * Respond to the finish button.
	 */
	@Override
	public boolean performFinish() {

		if ( proof == null )
			return false; // refuse, no model

		// use the original resource to save back into source
		final Resource resource = proof.eResource();
		System.err.println("testing: resource is modified: " + resource.isModified());
		final String message = MessageFormat.format("{0} {1}", "Saving proof file", resource.getURI());

		// test if resource is unloaded
		// this should not happen if finish button state is working properly
		if ( resource.isLoaded() == false ) {
			MessageDialog.openWarning(this.getShell(), TITLE, "Resource is not loaded");
			return false;
		}
		
	    try {
	    	// write back to resource
	        getContainer().run(false, true, new IRunnableWithProgress() {
	          public void run(IProgressMonitor monitor)
	            	throws InvocationTargetException, InterruptedException {
	            monitor.beginTask("Saving proof file", 100);

	            // compare memory copy with file copy to determine whether dirty
	            monitor.worked(20);
				Map options = new HashMap();
				options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Boolean.TRUE);
				options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED_FILE_BUFFER, Boolean.TRUE);
				
				monitor.worked(40);
				try { 
					resource.save(options);
				} catch( IOException e ) {
					CertWareLog.logError(message, e);
					monitor.setCanceled(true);
				}
	            
	            monitor.done();
	          }
	        });
	      } catch (Exception e) {
				CertWareLog.logError(message, e);
				ExceptionDetailsDialog dialog = 
					new ExceptionDetailsDialog(getContainer().getShell(), 
							TITLE, 
							PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK),
							message, 
							e, 
							Activator.getDefault());
				dialog.open();
				return false;
	      }

	    CertWareLog.logInfo( MessageFormat.format("{0} {1}",
	    		"Saved proof file", 
	    		proof.getTitle() ));

		return true; // accepted
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

		if ( selection == null || (selection.getFirstElement() instanceof IFile) == false) {
			String message = "Wizard must have a proof file selection for review";
			CertWareLog.logWarning(message);
			MessageDialog.openWarning(getShell(), TITLE, message);
			return;
		}

		IFile ifile = (IFile)selection.getFirstElement();
		if ( ifile.isAccessible() ) {
		      ResourceSet resourceSet = new ResourceSetImpl();
		      Resource resource = resourceSet.getResource( 
		    		  URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
		      proof = (Proof)resource.getContents().get(0);
		      if ( proof == null ) {
					String message = MessageFormat.format("Wizard found selected file is empty: {0}",ifile.getName());
					CertWareLog.logWarning(message);
					MessageDialog.openWarning(getShell(), TITLE, message);
					return;		    	  
		      }
		} else {
			String message = MessageFormat.format("Wizard found selected file is not accessible: {0}",ifile.getName());
			CertWareLog.logWarning(message);
			MessageDialog.openWarning(getShell(), TITLE, message);
			return;
		}
	}


	@Override
	public boolean canFinish() {
		return pageValidate.isPageComplete();
	}
}
