package net.certware.evidence.hugin.view.actions;

import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.ViewList;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;


/**
 * Opens the checklist view.
 * @author mrb
 * @since 1.2.1
 */
public class OpenView implements IObjectActionDelegate
{
  static private final String PROJECT_VIEW_ID = "net.certware.evidence.hugin.view.list"; //$NON-NLS-1$
  
  /**
   * Latest selected part.
   */
  IWorkbenchPart latestPart = null;
  /**
   * Latest selection.
   */
  private IStructuredSelection latestSelection = null;

  /* (non-Javadoc)
   * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
   */
  public void setActivePart(IAction action, IWorkbenchPart targetPart)
  {
    latestPart = targetPart;
  }

  /**
   * Opens the view.
   * @param action unused
   * @see org.eclipse.ui.IActionDelegate#run(IAction)  
   */
  public void run(IAction action)
  {
    if ( latestPart != null ) {
      try {
        IViewPart viewPart = latestPart.getSite().getPage().showView(PROJECT_VIEW_ID);
        
        if ( latestSelection != null ) {
          
          Object obj = latestSelection.getFirstElement();
          
          if ( obj instanceof IFile ) {
            IFile ifile = (IFile)latestSelection.getFirstElement();
            ViewList view = (ViewList)viewPart;
            view.setSelectedFile(ifile);
          }
        }
      } catch (PartInitException e) {
        CertWareLog.logError("Opening network view", e);
      }
    }
  }

  /* (non-Javadoc)
   * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
   */
  public void selectionChanged(IAction action, ISelection selection)
  {
    latestSelection = null;
    if ( selection instanceof IStructuredSelection)
      latestSelection = (IStructuredSelection)selection;
  }

}
