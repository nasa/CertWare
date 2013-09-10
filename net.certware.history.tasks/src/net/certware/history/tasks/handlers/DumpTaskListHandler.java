package net.certware.history.tasks.handlers;

import java.util.Collection;
import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mylyn.internal.tasks.core.AbstractTask;
import org.eclipse.mylyn.internal.tasks.core.TaskList;
import org.eclipse.mylyn.internal.tasks.ui.TasksUiPlugin;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Dump task command handler.
 * @author mrb
 * @since 2.0.0
 */
@SuppressWarnings("restriction")
public class DumpTaskListHandler extends AbstractHandler {

	/** dialog title */
	private static final String TITLE = "Task List Computation"; 
	protected IWorkbenchPart activePart = null;
	
	/**
	 * Handles the dump task category command request.  
	 * Presumes the command came from a popup menu selection of model object.
	 * @param event used to find file
	 * @return always returns null  
	 * @throws ExecutionException if open fails  
	 * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			// fetch workbench context
			activePart = HandlerUtil.getActivePartChecked(event);
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			ISelectionService service = window.getSelectionService();
			IStructuredSelection iss = (IStructuredSelection)service.getSelection();
			
			for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
				process((IProject)iterator.next());
			}

		} catch (ExecutionException e) {
			CertWareLog.logError("Dump task category", e);
		}

		return null;
	}

	/**
	 * Process the selected project.
	 * @param selectedProject
	 */
	protected void process(IProject selectedProject) {
		if ( selectedProject.isOpen() == false ) {
			CertWareLog.logWarning(String.format("%s:%s","Skipped task list processing for closed project",
					selectedProject.getName()));
			return;
		}
		
		// TODO tests of task access
		// TasksUi.getRepositoryModel().getTask(arg0);
		// TasksUi.getTaskDataManager();
		// Set<ITask> dueTasks = TasksUi.getTaskActivityManager().getAllDueTasks();
		// IRepositoryQuery q = TasksUi.getRepositoryModel().createRepositoryQuery(TasksUiUtil.getSelectedRepository());

		// there is no project-related identification in the task list
		// we use the selected project as a container for a generated file
		TaskList taskList = TasksUiPlugin.getTaskList();
		Collection<AbstractTask> tasks = taskList.getAllTasks();
		int uncompletedHours = 0;
		int completedHours = 0;
		
		if ( tasks == null || tasks.size() < 1 ) {
			MessageDialog.openWarning(activePart.getSite().getShell(), TITLE, "No tasks found in task list.");
			return;
		}
		
		// process the task collection
		for (AbstractTask at : tasks ) {
			System.err.println("task: " + at.toString());
			System.err.println("priority " + at.getPriority());
			System.err.println("kind " + at.getTaskKind());
			System.err.println("key " + at.getTaskKey());
			System.err.println("creation date " + at.getCreationDate());
			System.err.println("completion date " + at.getCompletionDate());
			System.err.println("estimated time hours " + at.getEstimatedTimeHours());
			System.err.println("completed? " + at.isCompleted());

			// primitive accumulators
			if ( at.isCompleted() ) {
				completedHours += at.getEstimatedTimeHours();
			} else {
				uncompletedHours += at.getEstimatedTimeHours();
			}

			Collection<ITask> children = at.getChildren();
			for ( ITask c : children ) {
				System.err.println("child: " + at.toString());
				System.err.println("child summary " + c.getSummary());
				System.err.println("child priority " + c.getPriority());
				System.err.println("child kind " + c.getTaskKind());
				System.err.println("child key " + c.getTaskKey());
				System.err.println("child creation date " + c.getCreationDate());
				System.err.println("child completion date " + c.getCompletionDate());
				System.err.println("child completed? " + c.isCompleted());
			}
		}
		
		// report to log
		CertWareLog.logInfo(String.format("%s %s","Processed task list within project",selectedProject.getName()));
		
		// report to dialog
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%s %d","Task count:",tasks.size())).append('\n');
		sb.append(String.format("%s %d hrs", "Total completed hours:", completedHours)).append('\n');
		sb.append(String.format("%s %d hrs", "Total uncompleted hours:", uncompletedHours )).append('\n');
		MessageDialog.openInformation(activePart.getSite().getShell(),TITLE,sb.toString());
	}
}
