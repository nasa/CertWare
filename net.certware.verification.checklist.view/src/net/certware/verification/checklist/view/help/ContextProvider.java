package net.certware.verification.checklist.view.help;

import net.certware.core.ui.help.IHelpContext;
import net.certware.verification.checklist.view.ViewList;

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
  protected ViewList view = null;
  
  /**
   * Constructor saves a reference to the view.
   * @param view reference view
   */
  public ContextProvider(ViewList view) {
    this.view = view;
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
    return HelpSystem.getContext(IHelpContext.VCL_VIEW);
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
   * @return always returns "verification" and "checklist"  
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

    return "\"verification\" + \"checklist\"";

  }
  
}
