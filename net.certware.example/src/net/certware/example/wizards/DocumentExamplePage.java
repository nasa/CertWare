package net.certware.example.wizards;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

import net.certware.core.ui.help.IHelpContext;
import net.certware.example.ExampleContributions;



/**
 * A details page for the document examples.
 * @author mrb
 * @since 1.0
 */
public class DocumentExamplePage extends ExamplePage
{

	/**
	 * Example page for documents.
	 * @param ec example contributions
	 */
	public DocumentExamplePage(ExampleContributions ec) {
		super(ec);
	}
	
	@Override
	void setHelpContext(Control c) {
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(c, IHelpContext.EXAMPLE_WIZARD_DOCUMENT);
	}


}
