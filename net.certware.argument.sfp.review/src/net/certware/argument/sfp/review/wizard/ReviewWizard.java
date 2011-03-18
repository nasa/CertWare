package net.certware.argument.sfp.review.wizard;

import java.io.IOException;
import java.text.MessageFormat;

import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.dialog.ExceptionDetailsDialog;
import net.certware.core.ui.help.IHelpContext;
import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
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
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;


/**
 * A wizard to review a semi-formal proof.
 * Prompts analyst with step-by-step review of proof fragments, setting validation values.
 * @author mrb
 * @since 1.0.3
 */
public class ReviewWizard extends Wizard implements IHelpContext {

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
	/** selected resource to act upon */
	private Resource resource;


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
		setDefaultPageImageDescriptor(CertWareUI.getDefault().getImageRegistry().getDescriptor(CertWareUI.CERTWARE_WIZARD_BANNER));
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

		// set size and help system on shell
		setDialogSize();
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getShell(),IHelpContext.REVIEW_WIZARD_SETUP_PAGE);
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
		if ( pageSetup != null ) 
			pageSetup.dispose();
		if ( pageValidate != null )
			pageValidate.dispose();
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
		final String message = MessageFormat.format("{0} {1}", 
				"Saving proof file", 
				( resource.getURI().isPlatformResource() 
    					? resource.getURI().lastSegment() 
    							: resource.getURI() )) ;

		// test if resource is unloaded
		// this should not happen if finish button state is working properly
		if ( resource.isLoaded() == false ) {
			MessageDialog.openWarning(this.getShell(), TITLE, "Resource is not loaded");
			return false;
		}
		
		// run in workspace modify
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor monitor) {
		            monitor.beginTask("Exception saving proof file", 100);

		            // compare memory copy with file copy to determine whether dirty
		            monitor.worked(20);
					Builder builder = SaveOptions.newBuilder();
					builder.noValidation();
					
					monitor.worked(40);
					try { 
						resource.save( builder.getOptions().toOptionsMap() ); 
					} catch( IOException e ) {
						CertWareLog.logError(message, e);
						monitor.setCanceled(true);
					}
		            
		            monitor.done();
				}
		};

    	// write back to resource
	    try {
	        getContainer().run(false, false, operation);
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
				return false; // rejected
	      }

	    CertWareLog.logInfo( MessageFormat.format("{0} {1}",
	    			"Saved proof file", 
	    			( resource.getURI().isPlatformResource() 
	    					? resource.getURI().lastSegment() 
	    							: resource.getURI() )) );

		return true; // accepted
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IFile ifile) {

		if ( ifile == null ) {
			CertWareLog.logWarning("Review wizard launched without file reference");
			return;
		}
		
		if ( ifile.isAccessible() ) {
		      ResourceSet resourceSet = new ResourceSetImpl();
		      resource = resourceSet.getResource( 
		    		  URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
		      proof = (Proof)resource.getContents().get(0);
		      if ( proof == null ) {
					String message = MessageFormat.format(
							"Wizard found selected file is empty: {0}",
							ifile.getName());
					CertWareLog.logWarning(message);
					MessageDialog.openWarning(getShell(), TITLE, message);
					return;		    	  
		      }
		} else {
			String message = MessageFormat.format(
					"Wizard found selected file is not accessible: {0}",
					ifile.getName());
			CertWareLog.logWarning(message);
			if ( getShell() != null )
				MessageDialog.openWarning(getShell(), TITLE, message);
			return;
		}
	}

	/**
	 * Whether the wizard can finish.
	 * @return the page completion state of the validation page
	 */
	@Override
	public boolean canFinish() {
		return pageValidate.isPageComplete();
	}
}
