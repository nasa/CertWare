package net.certware.argument.sfp.review.wizard;
import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.util.ProofUtil;
import net.certware.core.ui.help.IHelpContext;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.viewers.TreeSelection;

/**
 * Help context provider for review wizard.
 * @author mrb
 * @since 1.0.3
 */
public class ReviewContextProvider extends org.eclipse.help.AbstractContextProvider implements IContextProvider
{
	/** plugins array for interface */
	private String[] plugins = { Activator.PLUGIN_ID };
	
	/**
	 * Constructor defers to superclass.
	 */
	public ReviewContextProvider() {
		super();
	}

	/**
	 * Returns a help context based on target.
	 * @param target focus, expecting a tree selection
	 * @return help context ID
	 */
	public IContext getContext(Object target)
	{
		System.err.println("help get context target is " + target); // TODO selection tracking
		
		if (target instanceof TreeSelection) {
			Object element = ((TreeSelection)target).getFirstElement();
			if (element instanceof Proof) {
				return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_PROOF);
			}
			if (element instanceof Statement) {
				Statement s = (Statement)element;
				if ( ProofUtil.statementIsHypothesis(s)) {
					return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_HYPOTHESIS);
				}
				return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_STATEMENT);
			}
		}

		return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_PAGE);
	}

	/**
	 * Gets the context change mask.
	 * @return always returns NONE
	 */
	public int getContextChangeMask()
	{
		// dynamic context change reporting
		// return IContextProvider.NONE; // TODO testing
		return IContextProvider.SELECTION;
	}

	/**
	 * Returns a search expression string based on the target focus.
	 * @param target focus
	 * @return search string or null of target not recognized
	 */
	public String getSearchExpression(Object target)
	{
		System.err.println("search target is " + target); // TODO selection tracking
		
		if ( target instanceof Proof ) {
			return "\"proof\"";
		}

		if ( target instanceof Statement ) {
			return "\"hypothesis\" + ' ' + \"statement\"";
		}

		if ( target instanceof Justification ) {
			return "\"proof\" + ' ' + \"statement\" + ' ' + \"justification\"";
		}

		return "statement";
	}

	@Override
	public IContext getContext(String id, String locale) {

		if ( IHelpContext.REVIEW_WIZARD_HYPOTHESIS.equals(id))
			return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_HYPOTHESIS,locale);
		if ( IHelpContext.REVIEW_WIZARD_STATEMENT.equals(id))
			return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_STATEMENT,locale);
		if ( IHelpContext.REVIEW_WIZARD_PROOF.equals(id))
			return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_PROOF,locale);
		if ( IHelpContext.REVIEW_WIZARD_SETUP_PAGE.equals(id))
			return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_SETUP_PAGE,locale);
		
		return HelpSystem.getContext(IHelpContext.REVIEW_WIZARD_PAGE,locale);
	}

	@Override
	public String[] getPlugins() {
		// plugins list simply for this host plugin
		// fragments can supply their own
		return plugins;
	}

}


