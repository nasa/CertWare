package net.certware.example.wizards;
import net.certware.core.ui.help.IHelpContext;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;


public class ExampleContextProvider implements IContextProvider
{
  
  public ExampleContextProvider() {
  }
  
  
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
    return HelpSystem.getContext(IHelpContext.EXAMPLE_WIZARD_PAGE);
  }

  public int getContextChangeMask()
  {
    // dynamic context change reporting
    return IContextProvider.NONE;
    // return IContextProvider.SELECTION;
  }

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
              LineValueModel lvm = (LineValueModel)element;
              String decision = lvm.getDecisionValue();
              return "\"buffer\"" + ' ' + decision; 
            }
          }
          return "\"buffer\" + \"overflow\"";

        }
      }
    }
  return null;
    */

    return "\"example\" + \"document\" + \"checklist\" + \"pattern\"";

  }
  
}


