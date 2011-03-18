/**
 * 
 */
package net.certware.verification.checklist.view.handlers;

import net.certware.core.ui.log.CertWareLog;
import net.certware.verification.checklist.view.ViewList;
import net.certware.verification.checklist.view.util.ReadModelFile;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * Handler for the save view model to file command.
 * @author mrb
 * @since 1.2.1
 */
public class SaveHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ViewList vl = (ViewList)HandlerUtil.getActivePartChecked(event);
		if ( vl != null ) {
			ReadModelFile.writeChecklist(vl.getSelectedFile(), vl.getSelectedChecklist() );
			vl.setDirty(false);
		} else {
			CertWareLog.logWarning("Could not find checklist view to handle command");
		}
		return null;
	}

}
