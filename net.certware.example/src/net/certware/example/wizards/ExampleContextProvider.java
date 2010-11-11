package net.certware.example.wizards;
import net.certware.core.ui.help.IHelpContext;
import net.certware.example.ExampleCategory;
import net.certware.example.ExampleChecklist;
import net.certware.example.ExampleDocument;
import net.certware.example.ExamplePattern;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;

/**
 * Help context provider for examples.
 * @author mrb
 * @since 1.0
 */
public class ExampleContextProvider implements IContextProvider
{
	/**
	 * Constructor empty.
	 */
	public ExampleContextProvider() {
	}

	/**
	 * Returns a help context based on target.
	 * @param target focus
	 * @return help context
	 */
	public IContext getContext(Object target)
	{
		//TODO add contexts for example items

		/*
    if (target instanceof TreeSelection) {
        Object element = ((TreeSelection)selection).getFirstElement();
        if (element instanceof Book) {
            return HelpSystem.getContext("library.libraryBookId");
        }
    }
		 */

		return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_PAGE);
	}

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

		return null;

	}

}


