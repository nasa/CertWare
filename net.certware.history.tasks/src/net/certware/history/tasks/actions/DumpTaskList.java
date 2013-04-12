package net.certware.history.tasks.actions;

import java.util.Collection;
import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mylyn.internal.tasks.core.AbstractTask;
import org.eclipse.mylyn.internal.tasks.core.TaskList;
import org.eclipse.mylyn.internal.tasks.ui.TasksUiPlugin;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An action to dump the task list of the selected projects to the console.
 * TESTING
 * @author mrb
 * @since 1.1.0
 */
@SuppressWarnings("restriction")
public class DumpTaskList implements IObjectActionDelegate {

	/** dialog title */
	private static final String TITLE = "Task List Computation"; 
	/** current selection */
	private ISelection currentSelection;
	/** active part for shell reference */
	private IWorkbenchPart activePart;

	/**
	 * Constructor simply calls super.
	 */
	public DumpTaskList() {
		super();
	}

	@Override
	public void run(IAction action) {
		// process the selection; call for each project in the selection 
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			process((IProject)iterator.next());
		}
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
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

}
