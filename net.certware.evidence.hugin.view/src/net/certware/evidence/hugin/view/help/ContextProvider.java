package net.certware.evidence.hugin.view.help;

import net.certware.core.ui.help.IHelpContext;
import net.certware.core.ui.views.ICertWareView;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;

/**
 * Help context provider.
 * @author mrb
 * @since 1.2.1
 */
public class ContextProvider implements IContextProvider
{
  /** referenced view */
  protected ICertWareView view = null;
  
  /**
   * Constructor saves a reference to the view.
   * @param viewTree reference view
   */
  public ContextProvider(ICertWareView v) {
    this.view = v;
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
    return HelpSystem.getContext(IHelpContext.NET_VIEW);
  }

  /**
   * Returns the context changed mask.  
   * @return always returns NONE  
   * @see org.eclipse.help.IContextProvider#getContextChangeMask()
   */
  public int getContextChangeMask()
  {
    // dynamic context change reporting
    return IContextProvider.NONE;
    // return IContextProvider.SELECTION;
  }

  /**
   * Returns a dynamic search string suggestion.
   * @param target unused
   * @return always returns "belief" and "network"
   * @see org.eclipse.help.IContextProvider#getSearchExpression(Object) 
   */
  public String getSearchExpression(Object target)
  {
    /*
    if ( view != null ) {
      IViewSite viewSite = view.getViewSite();
      if ( viewSite != null ) {
        ISelectionProvider provider = viewSite.getSelectionProvider();
        if ( provider != null ) {
          ISelection selection = view.getViewSite().getSelectionProvider().getSelection();
          if (selection instanceof IStructuredSelection) {
            Object element = ((IStructuredSelection)selection).getFirstElement();
            if (element instanceof LineValueModel) {
            }
          }
        }
      }
    }
  return null;
    */
    return "\"belief\" + \"network\"";

  }
  
}
