package net.certware.evidence.hugin.view.handlers;

import java.util.List;

import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.jobs.MapCalculationJob;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.ucla.belief.BeliefNetwork;

/**
 * Command handler for running MAP estimate on selected network and variables.
 * @author mrb
 * @since 1.2.1
 */
public class MapCalculationHandler extends AbstractHandler
{
  /** job name */
  protected static final String JOB_NAME = "Compute MAP estimate";
  
  /**
   * Handles the MAP command request.  
   * Presumes the command came from the network view.
   * @param event used to find shell
   * @return always returns null  
   * @throws ExecutionException if export job fails  
   * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
   */
  public Object execute(ExecutionEvent event) throws ExecutionException
  {
    // get context information and model selections
    final ViewTree view = (ViewTree)HandlerUtil.getActivePartChecked(event);

    BeliefNetwork network = view.getSelectedNetwork();
    if ( network == null ) {
    	CertWareLog.logWarning("No network selected for MAP calculation");
        return null;
    }
    
    if ( view.hasVariableSelections() == false ) {
    	CertWareLog.logWarning("No variable selections for MAP calculation");
        return null;
    }

    if ( view.hasVariableStateSelections() == false ) {
    	CertWareLog.logWarning("No variable state selections for MAP calculation evidence");
        return null;
    }
    
    List<VariableNode> nodes = view.getVariableNodes();
    if ( nodes == null ) {
    	// should not reach this point owing to selection checks
    	CertWareLog.logWarning("No variable nodes for MAP calculation");
        return null;
    }


    // perform execution in a job
    MapCalculationJob job = new MapCalculationJob(JOB_NAME, view);

    job.addJobChangeListener(new IJobChangeListener(){

		@Override
		public void aboutToRun(IJobChangeEvent event) {
			view.showBusy(true);
		}

		@Override
		public void awake(IJobChangeEvent event) {
		}

		@Override
		public void done(IJobChangeEvent event) {
			view.showBusy(false);
		}

		@Override
		public void running(IJobChangeEvent event) {
		}

		@Override
		public void scheduled(IJobChangeEvent event) {
		}

		@Override
		public void sleeping(IJobChangeEvent event) {
		}});
  
    job.setUser(true);
    job.setPriority(Job.LONG);
    job.schedule();

    return null;
  }
  
  
}


