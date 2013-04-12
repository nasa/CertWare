package net.certware.evidence.hugin.view.handlers;

import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command handler for selecting all variable nodes in the tree view.
 * Does not select states within those variables.
 * @author mrb
 * @since 1.2.1
 */
public class SelectNodesHandler extends AbstractHandler
{
  /**
   * Handles the select nodes command request.  
   * Presumes the command came from the network view.
   * @param event used only for checking active part
   * @return always returns null  
   * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
   */
  public Object execute(ExecutionEvent event) throws ExecutionException
  {
    // get context information
    final ViewTree view = (ViewTree)HandlerUtil.getActivePartChecked(event);
    final TreeViewer viewer = view.getTreeViewer();
    
    // select each node and state not selected, refresh tree parts
    if ( view != null ) {
    	for ( VariableNode vn : view.getVariableNodes() ) {
    		if ( vn.isSelected() == false ) {
    			vn.setSelected(true);
    			viewer.refresh(vn);
    		}
    	}
    	view.refreshViewProperties();
    }
    
    return null;
  }  
}


