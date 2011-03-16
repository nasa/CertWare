package net.certware.verification.checklist.view.filters;

import net.certware.verification.checklist.view.table.ChecklistModel;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


/**
 * Provides a viewer filter for checklist result choice values.
 * @author mrb
 * @since 1.2.1
 */
public class ResultFilter extends ViewerFilter {

	/** choice code from result choice enumeration */
	int choice;
	
	public ResultFilter(int choice) {
		super();
		this.choice = choice;
	}

	/**
	 * Applies the filter on the selection.
	 * Matches the model's result field value to the choice value from the constructor.
	 * @return false if selected line model matches choice, true otherwise
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement,	Object element) {
	    ChecklistModel p = (ChecklistModel) element;
	    if ( p == null ) 
	      return true;
	    
	    if ( p.getResult().getValue() == choice )
	      return false;
	    
	    return true;
	}
	
}
