package net.certware.history.egit.actions;

import java.util.Collection;
import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mylyn.internal.tasks.core.AbstractTask;
import org.eclipse.mylyn.internal.tasks.core.TaskList;
import org.eclipse.mylyn.internal.tasks.ui.TasksUiPlugin;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An action to dump the history of the selected projects to the console.
 * Presumes the history is provided by a Git team provider.
 * @author mrb
 * @since 1.0.3
 */
@SuppressWarnings("restriction")
public class DumpProjectAction implements IObjectActionDelegate {

	/** current selection */
	private ISelection currentSelection;

	/**
	 * Constructor simply calls super.
	 */
	public DumpProjectAction() {
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
			CertWareLog.logWarning(String.format("%s:%s","Skipped history processing for closed project",
					selectedProject.getName()));
			return;
		}
		
		// create a dump history processor and pass it the project
		try {
			DumpHistory dumpHistory = new DumpHistory();
			dumpHistory.processHistory(selectedProject);
		} catch (Exception exception) {
			CertWareLog.logError(String.format("%s:%s","Processing project history",
					selectedProject.getName()),
					exception);
		}
		
		// TODO tests of task access
		// TasksUi.getRepositoryModel().getTask(arg0);
		// TasksUi.getTaskDataManager();
		//Set<ITask> dueTasks = TasksUi.getTaskActivityManager().getAllDueTasks();
		
		// IRepositoryQuery q = TasksUi.getRepositoryModel().createRepositoryQuery(TasksUiUtil.getSelectedRepository());
		
		TaskList taskList = TasksUiPlugin.getTaskList();
		Collection<AbstractTask> tasks = taskList.getAllTasks();
		for (AbstractTask at : tasks ) {
			System.err.println("task: " + at.toString());
			System.err.println("priority " + at.getPriority());
			System.err.println("kind " + at.getTaskKind());
			System.err.println("key " + at.getTaskKey());
			System.err.println("creation date " + at.getCreationDate());
			System.err.println("completion date " + at.getCompletionDate());
			System.err.println("estimated time hours " + at.getEstimatedTimeHours());
			System.err.println("completed? " + at.isCompleted());

			Collection<ITask> children = at.getChildren();
			for ( ITask c : children ) {
				System.err.println("child: " + at.toString());
				System.err.println("child priority " + c.getPriority());
				System.err.println("child kind " + c.getTaskKind());
				System.err.println("child key " + c.getTaskKey());
			}
		}

	}
	
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
