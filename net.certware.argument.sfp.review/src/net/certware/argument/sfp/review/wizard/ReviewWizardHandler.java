package net.certware.argument.sfp.review.wizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handles the command to launch the review wizard.
 * @author mrb
 * @since 1.0.3
 */
public class ReviewWizardHandler extends AbstractHandler {

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if ( selection instanceof IStructuredSelection ) {
			IStructuredSelection iss = (IStructuredSelection)selection;
			Object first = iss.getFirstElement();
			if ( first instanceof IFile ) {
				ReviewWizard wizard = new ReviewWizard();
				wizard.init(HandlerUtil.getActiveWorkbenchWindowChecked(event).getWorkbench(), iss);
				WizardDialog dialog = new WizardDialog(HandlerUtil.getActiveShellChecked(event), wizard);
				dialog.create();
				dialog.open();
			} else {
				System.err.println("selected something else: " + first);
			}
		}
		return null;
	}

}
