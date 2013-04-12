package net.certware.evidence.hugin.view.handlers;

import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command handler for deselecting all nodes in the tree view.
 * @author mrb
 * @since 1.2.1
 */
public class DeselectHandler extends AbstractHandler
{
  /**
   * Handles the deselect command request.  
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
    
    // deselect each node and state already selected, refresh tree parts
    if ( view != null ) {
    	for ( VariableNode vn : view.getVariableNodes() ) {
    		if ( vn.isSelected() ) {
    			vn.setSelected(false);
    			viewer.refresh(vn);
    			
    			for ( VariableNodeState vns : vn.states ) {
    				if ( vns.isSelected() ) {
    					vns.setSelected(false);
    					view.refreshViewerState(vns);
    				}
    			}
    		}
    	}
    	view.refreshViewProperties();
    }
    
    return null;
  }  
}


