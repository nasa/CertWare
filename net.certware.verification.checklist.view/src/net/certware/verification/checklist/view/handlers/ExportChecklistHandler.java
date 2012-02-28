package net.certware.verification.checklist.view.handlers;

import net.certware.verification.checklist.Checklist;
import net.certware.verification.checklist.view.ViewList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command handler for exporting the view content.
 * Creates a workbook, retrieves view content, and sends off to a job for production. 
 * @author mrb
 * @since 1.2.1
 */
public class ExportChecklistHandler extends AbstractHandler
{
  /** job name */
  protected static final String JOB_NAME = "Export checklist to Excel";
  
  /**
   * Handles the export command request.  
   * Presumes the command came from the value tool summary view.
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
    final ViewList view = (ViewList)HandlerUtil.getActivePartChecked(event);
    Checklist checklist = view.getSelectedChecklist();
    if ( checklist == null ) 
      return null;

    /*
    final WriteExcel excel = new WriteExcel();

    // prompt for destination file
    excel.fetchDestinationFile(shell);
    if ( excel.getDestinationFile() == null )
      return null;

    // perform execution in a job 
    ExportChecklistJob job = new ExportChecklistJob(JOB_NAME, excel, checklist );
    job.setUser(true);
    job.setPriority(Job.SHORT);
    job.schedule();
    
    return null;
    */
    
    throw new ExecutionException("Excel export not installed");
  }  
}


