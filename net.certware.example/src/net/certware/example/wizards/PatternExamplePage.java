package net.certware.example.wizards;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

import net.certware.core.ui.help.IHelpContext;
import net.certware.example.ExampleContributions;



/**
 * A details page for the pattern examples.
 * @author mrb
 * @since 1.0
 */
public class PatternExamplePage extends ExamplePage
{

	/**
	 * Example page for patterns
	 * @param ec example contributions
	 */
	public PatternExamplePage(ExampleContributions ec) {
		super(ec);
	}

	@Override
	void setHelpContext(Control c) {
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(c, IHelpContext.EXAMPLE_WIZARD_PATTERN);
	}

}
