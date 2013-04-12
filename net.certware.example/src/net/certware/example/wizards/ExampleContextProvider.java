package net.certware.example.wizards;
import net.certware.core.ui.help.IHelpContext;
import net.certware.example.Activator;
import net.certware.example.ExampleCategory;
import net.certware.example.ExampleChecklist;
import net.certware.example.ExampleDocument;
import net.certware.example.ExamplePattern;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.viewers.TreeSelection;

/**
 * Help context provider for examples.
 * @author mrb
 * @since 1.0
 */
public class ExampleContextProvider extends org.eclipse.help.AbstractContextProvider implements IContextProvider
{
	/** plugins array for interface */
	private String[] plugins = { Activator.PLUGIN_ID };
	
	/**
	 * Constructor defers to superclass.
	 */
	public ExampleContextProvider() {
		super();
	}

	/**
	 * Returns a help context based on target.
	 * @param target focus, expecting a tree selection
	 * @return help context ID
	 */
	public IContext getContext(Object target)
	{
		if (target instanceof TreeSelection) {
			Object element = ((TreeSelection)target).getFirstElement();
			if (element instanceof ExampleDocument) {
				return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_DOCUMENT);
			}
			if (element instanceof ExamplePattern) {
				return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_PATTERN);
			}
			if (element instanceof ExampleChecklist) {
				return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_CHECKLIST);
			}
		}

		return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_PAGE);
	}

	/**
	 * Gets the context change mask.
	 * @return always returns NONE
	 */
	public int getContextChangeMask()
	{
		// dynamic context change reporting
		return IContextProvider.NONE;
		// return IContextProvider.SELECTION;
	}

	/**
	 * Returns a search expression string based on the target focus.
	 * @param target focus
	 * @return search string or null of target not recognized
	 */
	public String getSearchExpression(Object target)
	{
		if ( target instanceof ExampleCategory ) {
			return "\"category\" + ' ' + \"example\"";
		}

		if ( target instanceof ExamplePattern ) {
			return "\"pattern\" + ' ' + \"example\"";
		}

		if ( target instanceof ExampleDocument ) {
			return "\"document\" + ' ' + \"example\"";
		}

		if ( target instanceof ExampleChecklist ) {
			return "\"checklist\" + ' ' + \"example\"";
		}

		return "example";

	}

	@Override
	public IContext getContext(String id, String locale) {

		if ( IHelpContext.EXAMPLE_WIZARD_CHECKLIST.equals(id))
			return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_CHECKLIST,locale);
		if ( IHelpContext.EXAMPLE_WIZARD_DOCUMENT.equals(id))
			return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_DOCUMENT,locale);
		if ( IHelpContext.EXAMPLE_WIZARD_PATTERN.equals(id))
			return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_PATTERN,locale);
		
		return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_PAGE,locale);
	}

	@Override
	public String[] getPlugins() {
		// plugins list simply for this host plugin
		// fragments can supply their own
		return plugins;
	}

}


