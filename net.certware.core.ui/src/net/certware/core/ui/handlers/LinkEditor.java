package net.certware.core.ui.handlers;

import net.certware.core.ui.ICertWareLinkableView;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.State;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command handler to link a view and editor using a state command.
 * @author mrb
 * @since 1.1.0
 */
public class LinkEditor extends AbstractHandler {

	protected static final String LINK_COMMAND_ID = "net.certware.core.ui.linkEditor"; //$NON-NLS-1$
	protected static final String TOGGLE_COMMAND_ID = "org.eclipse.ui.commands.toggleState"; //$NON-NLS-1$

	/**
	 * Gets the command state from the workbench command service.
	 * @return true if state value enabled, false otherwise
	 */
	public static boolean getState() {
		ICommandService commandService =  
			(ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
		if ( commandService != null ) {
			Command toggleCommand = commandService.getCommand(LINK_COMMAND_ID);
			if ( toggleCommand != null ) {
				State s = toggleCommand.getState(TOGGLE_COMMAND_ID);
				if ( s != null )
					return ((Boolean)(s.getValue())).booleanValue();
			}
		}
		return false;
	}

	/**
	 * Handles the command to link or unlink the view and editor.
	 * Expects that the command event arrives from a view implementing <code>ICodeHawkToolView</code>.
	 * Sets the linking state in the view.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		IWorkbenchPart part = HandlerUtil.getActivePart(event);
		ICertWareLinkableView view = (ICertWareLinkableView)part;

		Command command = event.getCommand();
		boolean oldValue = HandlerUtil.toggleCommandState(command);

		view.setLinkingEditor( !oldValue );
		return null;
	}


}
