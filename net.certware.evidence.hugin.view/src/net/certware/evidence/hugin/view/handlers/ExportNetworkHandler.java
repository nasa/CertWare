package net.certware.evidence.hugin.view.handlers;

import net.certware.evidence.hugin.view.ViewTree;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.ucla.belief.BeliefNetwork;

/**
 * Command handler for exporting the view content.
 * Creates a workbook, retrieves view content, and sends off to a job for production. 
 * @author mrb
 * @since 1.2.1
 */
public class ExportNetworkHandler extends AbstractHandler
{
  /** job name */
  protected static final String JOB_NAME = "Export list to Excel";
  
  /**
   * Handles the export command request.  
   * Presumes the command came from the network view.
   * @param event used to find shell
   * @return always returns null  
   * @throws ExecutionException if export job fails  
   * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
   */
  @SuppressWarnings("unused")
public Object execute(ExecutionEvent event) throws ExecutionException
  {
    // get context information
    Shell shell = HandlerUtil.getActiveShellChecked(event);
    final ViewTree view = (ViewTree)HandlerUtil.getActivePartChecked(event);
    BeliefNetwork network = view.getSelectedNetwork();
    if ( network == null ) 
      return null;

    /*
     * // recover this when POI-based export added to base; POI disallowed by NASA for redistribution
    final WriteExcel excel = new WriteExcel(); 
    

    // prompt for destination file
    excel.fetchDestinationFile(shell);
    if ( excel.getDestinationFile() == null )
      return null;

    // perform execution in a job 
    ExportNetworkJob job = new ExportNetworkJob(JOB_NAME, excel, network );
    job.setUser(true);
    job.setPriority(Job.SHORT);
    job.schedule();
    
    return null;
    */
    
    throw new ExecutionException("Excel export not installed");
  }  
}


