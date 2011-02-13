package net.certware.history.tasks.actions;

import java.util.Collection;
import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.ITaskContainer;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * An action to dump the task category of the selected projects to the console.
 * TESTING
 * @author mrb
 * @since 1.1.0
 */
public class DumpTaskCategory implements IObjectActionDelegate {

	/** dialog title */
	private static final String TITLE = "Task Category Computation"; 
	/** current selection */
	private ISelection currentSelection;
	/** active part for shell reference */
	private IWorkbenchPart activePart;

	/**
	 * Constructor simply calls super.
	 */
	public DumpTaskCategory() {
		super();
	}

	@Override
	public void run(IAction action) {
		// process the selection; call for each task container in the selection 
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			process((ITaskContainer)iterator.next());
		}
	}

	/**
	 * Process the selected category, which we presume is an {@ITaskContainer} from an object
	 * contribution on that interface.  These containers appear in the task list view as folders.
	 * @param selectedCategory
	 */
	protected void process(ITaskContainer selectedContainer) {
		
		System.out.println("processing task container " + selectedContainer);
		
		// use the children in the selected container
		int uncompletedHours = 0;
		int completedHours = 0;

		Collection<ITask> tasks = selectedContainer.getChildren();

		if ( tasks == null || tasks.size() < 1 ) {
			MessageDialog.openWarning(activePart.getSite().getShell(), TITLE, "No tasks found in task list.");
			return;
		}
		
		// process the task collection
		// these items have no children or sub-tasks
		for (ITask it : tasks ) {
			System.out.println("task: " + it.toString());
			System.out.println("priority " + it.getPriority());
			System.out.println("kind " + it.getTaskKind());
			System.out.println("key " + it.getTaskKey());
			System.out.println("creation date " + it.getCreationDate());
			System.out.println("completion date " + it.getCompletionDate());
			// System.err.println("estimated time hours " + at.getEstimatedTimeHours());
			System.out.println("completed? " + it.isCompleted());
			int estimatedHours = 0;
			
			if ( it.getCompletionDate() != null && it.getCreationDate() != null ) { 
				long duration = it.getCompletionDate().getTime() - it.getCreationDate().getTime();
				estimatedHours = (int) (duration / 3); // integer division good enough here
			}

			// primitive accumulators
			if ( it.isCompleted() ) {
				completedHours += estimatedHours;
			} else {
				uncompletedHours += estimatedHours;
			}

		}
		
		// report to log
		CertWareLog.logInfo(String.format("%s %s","Processed task category",selectedContainer.toString()));
		
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
