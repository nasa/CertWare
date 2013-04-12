package net.certware.evidence.hugin.view.help;

import java.util.ArrayList;
import java.util.List;

import net.certware.evidence.hugin.view.ViewTree;

import org.eclipse.core.runtime.Assert;
import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContext2;
import org.eclipse.help.IContextProvider;
import org.eclipse.help.IHelpResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.IViewSite;

/**
 * Help context provider.
 * @author mrb
 * @since 1.2.1
 */
public class ContextProvider implements IContextProvider
{
	/** inference engine reference URL */
	protected final static String SAMIAM_URL = "http://reasoning.cs.ucla.edu/samiam/"; 
	/** referenced view */
	protected ViewTree view = null;
	/** context id string */
	protected String contextId = null;
	/** structured selection */
	protected IStructuredSelection iss = null;

	/**
	 * Constructor saves a reference to the view and selection.
	 * Assumes each time {@code getAdapter()} is called the current selection is passed here.
	 * @param v reference view
	 * @param id help context id string
	 * @param iss structured selection
	 */
	public ContextProvider(ViewTree v, String id, IStructuredSelection iss) {
		this.view = v;
		this.contextId = id;
		this.iss = iss;
	}

	/**
	 * Returns the help context ID.
	 * @param target unused
	 * @return context ID retrieved from HelpSystem  
	 * @see org.eclipse.help.IContextProvider#getContext(Object) 
	 */
	public IContext getContext(Object target)
	{
		// ISelection selection = view.getViewSite().getSelectionProvider().getSelection();

		/*
    	if (selection instanceof TreeSelection) {
        Object element = ((TreeSelection)selection).getFirstElement();
        if (element instanceof Book) {
            return HelpSystem.getContext("library.libraryBookId");
        }
    	}
		 */
		// return HelpSystem.getContext(IHelpContext.HUGIN_ANALYSIS_VIEW);
		// return HelpSystem.getContext(contextId);

		IContext context = HelpSystem.getContext(contextId);
		if (!iss.isEmpty()) {
			context = new SelectionContext(context, iss);
		}
		return context;
	}

	/**
	 * Returns the context changed mask.  
	 * @return always returns {@code SELECTION}  
	 * @see org.eclipse.help.IContextProvider#getContextChangeMask()
	 */
	public int getContextChangeMask()
	{
		// dynamic context change reporting
		return IContextProvider.SELECTION;
	}

	/**
	 * Returns a dynamic search string suggestion.
	 * @param target unused
	 * @return string based on selection, or {@code hugin}
	 * @see org.eclipse.help.IContextProvider#getSearchExpression(Object) 
	 */
	public String getSearchExpression(Object target)
	{

		if ( view != null ) {
			IViewSite viewSite = view.getViewSite();
			if ( viewSite != null ) {
				ISelectionProvider provider = viewSite.getSelectionProvider();
				if ( provider != null ) {
					ISelection selection = view.getViewSite().getSelectionProvider().getSelection();
					if (selection instanceof IStructuredSelection) {
						// Object element = ((IStructuredSelection)selection).getFirstElement();
						// TODO... selection-sensitive expressions
					}
				}
			}
		}

		return "\"hugin\"";
	}

	public class SelectionContext implements IContext2 {
		private IHelpResource[] helpResources;
		private String helpText;
		private String helpTitle;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		public SelectionContext(IContext context, IStructuredSelection selection) {
			Assert.isNotNull(selection);
			if (context instanceof IContext2) {
				helpTitle = ((IContext2) context).getTitle();
			}

			List<IHelpResource> helpResourceList = new ArrayList();
			String label = null;
			StringBuffer location = new StringBuffer(SAMIAM_URL);

			if ( selection.getFirstElement() instanceof Button ) {
				// these are handled in the plugin extension definition for menu items
				// Button button = (Button)selection.getFirstElement();
				// label = button.getText();
				// location.append("...");
			}

			helpResourceList.add(new SelectionHelpResource(label, location.toString()));

			// add static help topics
			if (context != null) {
				IHelpResource[] resources = context.getRelatedTopics();
				if (resources != null) {
					for (int j = 0; j < resources.length; j++) {
						helpResourceList.add(resources[j]);
					}
				}
			}

			// create array and return
			this.helpResources = helpResourceList.toArray(new IHelpResource[helpResourceList.size()]);
			if (context != null) {
				helpText = context.getText();
			}
			if (helpText == null) {
				helpText = "";
			}
		}

		public String getCategory(IHelpResource topic) {
			if (topic instanceof SelectionHelpResource) {
				return "Web Site";
			}
			return null;
		}

		public String getStyledText() {
			return helpText;
		}

		public String getTitle() {
			return helpTitle;
		}

		public IHelpResource[] getRelatedTopics() {
			return helpResources;
		}

		public String getText() {
			return helpText;
		}
	}

	/**
	 * Help resource.
	 */
	public class SelectionHelpResource implements IHelpResource {
		private String label;
		private String url;

		public SelectionHelpResource(String label, String url) {
			this.label = label;
			this.url = url;
		}

		public String getHref() {
			return this.url;
		}

		public String getLabel() {
			return this.label;
		}
	}


}
