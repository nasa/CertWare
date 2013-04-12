
package net.certware.measurement.spm.view.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.spm.view.SpmViewMasterDetails;

/**
 * Opens the SPM details view.
 * @author mrb
 * @since 1.1.0
 */
public class OpenView implements IObjectActionDelegate
{
  static private final String SPM_VIEW_ID = "net.certware.measurement.spm.view.detailsview"; //$NON-NLS-1$
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
        IViewPart viewPart = latestPart.getSite().getPage().showView(SPM_VIEW_ID);
        
        if ( latestSelection != null ) {
          
          Object obj = latestSelection.getFirstElement();
          
          if ( obj instanceof IFile ) {
            IFile ifile = (IFile)latestSelection.getFirstElement();
            SpmViewMasterDetails spmView = (SpmViewMasterDetails)viewPart;
            spmView.setSelectedFile(ifile);
          }
        }
      } catch (PartInitException e) {
        CertWareLog.logError("Opening SPM details view", e);
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
