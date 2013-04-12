package net.certware.argument.sfp.review.wizard;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.core.ui.help.IHelpContext;



/**
 * A details page for the pattern examples.
 * @author mrb
 * @since 1.0
 */
public class StatementDetailPage extends ReviewDetailPage
{

	/**
	 * Detail page for proofs.
	 * @param proof proof object
	 * @param viewer tree viewer to refresh
	 * @param validate validate page
	 * @param setup setup page
	 */
	public StatementDetailPage(Proof proof,TreeViewer viewer,ReviewValidatePage validate, ReviewSetupPage setup) {
		super(proof,viewer,validate, setup);
	}

	@Override
	void setHelpContext(Control c) {
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(c, IHelpContext.REVIEW_WIZARD_STATEMENT);
	}

}
