package net.certware.history.tasks.handlers;

import java.util.Collection;
import java.util.Iterator;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.ITaskContainer;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Dump task command handler.
 * @author mrb
 * @since 2.0.0
 */
public class DumpTaskCategoryHandler extends AbstractHandler {

	/** dialog title */
	private static final String TITLE = "Task Category Computation"; 
	IWorkbenchPart activePart = null;
	
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
				process((ITaskContainer)iterator.next());
			}
		} catch (ExecutionException e) {
			CertWareLog.logError("Dump task category", e);
		}

		return null;
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
}
