
package net.certware.measurement.sco.view.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.sco.view.ScoViewMasterDetails;

/**
 * Opens the SCO master-details view.
 * @author mrb
 * @since 1.1.0
 */
public class OpenView implements IObjectActionDelegate
{
  static private final String SCO_VIEW_ID = "net.certware.measurement.sco.view.masterdetailsview"; //$NON-NLS-1$
  IWorkbenchPart latestPart = null;
  private IStructuredSelection latestSelection = null;

  /* (non-Javadoc)
   * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
   */
  public void setActivePart(IAction action, IWorkbenchPart targetPart)
  {
    latestPart = targetPart;
  }

  /**
   * Opens the analysis setup summary view.
   */
  public void run(IAction action)
  {
    if ( latestPart != null ) {
      try {
        IViewPart viewPart = latestPart.getSite().getPage().showView(SCO_VIEW_ID);
        
        if ( latestSelection != null ) {
          
          Object obj = latestSelection.getFirstElement();
          
          if ( obj instanceof IFile ) {
            IFile ifile = (IFile)latestSelection.getFirstElement();
            ScoViewMasterDetails scoView = (ScoViewMasterDetails)viewPart;
            scoView.setSelectedFile(ifile);
          }
        }
      } catch (PartInitException e) {
        CertWareLog.logError("Opening SCO master-details view", e);
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
