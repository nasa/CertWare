package net.certware.evidence.hugin.view.filters;

import net.certware.evidence.hugin.view.table.NetworkModel;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


/**
 * Provides a viewer filter for checklist result choice values.
 * @author mrb
 * @since 1.2.1
 */
public class ResultFilter extends ViewerFilter {

	/** choice code from result value type enumeration */
	int type;
	
	/**
	 * Result filter creates viewer filter and sets its type.
	 * The type is expected to be one of the {@code HuginNode} node type constants.
	 * @param type
	 */
	public ResultFilter(int type) {
		super();
		this.type = type;
	}

	/**
	 * Applies the filter on the selection.
	 * Matches the model's result field value to the value type from the constructor.
	 * @return false if selected line model matches choice, true otherwise
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement,	Object element) {
	    NetworkModel p = (NetworkModel) element;
	    if ( p == null ) 
	      return true;
	    
	    if ( p.getValueType() == type )
	      return false;
	    
	    return true;
	}
	
}
