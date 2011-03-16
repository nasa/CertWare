package net.certware.verification.checklist.view.table;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;

/**
 * A viewer sorter for the <code>Checklist</code> viewer model.
 * @author mrb
 */
public class ChecklistSorter extends ViewerSorter {

	/** which column number to sort */
	private int propertyIndex = 0;
	/** direction of sort, up is ascending */
	private int direction = SWT.UP;
	/** table viewer reference */
	private final ChecklistTableViewer tableViewer;

	/**
	 * Constructor sets first column sort ascending.
	 * @param tableViewer reference to table viewer
	 */
	public ChecklistSorter(ChecklistTableViewer tableViewer) {
		this.propertyIndex = 0;
		this.tableViewer = tableViewer;
		direction = SWT.UP;
	}

	/**
	 * Sets the sort column given the column name.
	 * The name should be from the column names in <code>LineValueTableViewer</code>
	 * Calls <code>setColumn(int)</code> with the associated column number.
	 * @param columnName column name
	 */
	public void setColumn(String columnName) {
		for ( int i = 0; i < tableViewer.columnNames.length; i++ ) {
			if ( tableViewer.columnNames[i].equalsIgnoreCase(columnName)) {
				setColumn(i);
				return;
			}
		}
	}

	/**
	 * Gets the current sort direction.
	 * Up direction is ascending, down direction is descending.

	 * @return one of <code>SWT.UP</code> or <code>SWT.DOWN</code> */
	public int getDirection() {
		return direction;
	}

	/**
	 * Sets the current sort direction.
	 * Does not re-sort.
	 * Up direction is ascending, down direction is descending.
	 * @param d direction, one of SWT.UP or SWT.DOWN
	 */
	public void setDirection(int d) {
		direction = d;
	}

	/**
	 * Sets the sort column given the column number.
	 * If the column number is already set, reverses direction.
	 * @param column column number
	 */
	public void setColumn(int column) {
		if (column == this.propertyIndex) {
			// same column as last sort; toggle the direction
			direction = direction == SWT.UP ? SWT.DOWN : SWT.UP;
		} else {
			// new sort column; do an ascending sort
			this.propertyIndex = column;
			direction = SWT.UP;
		}
	}

	/**
	 * Compares objects for sorting.
	 * Uses currently selected property column.
	 * Presumes using the <code>ChecklistModel</code> object model.
	 * @param viewer line value model viewer
	 * @param e1 object compare one, a line value model object
	 * @param e2 object compare two, a line value model object
	 * @return 1 for e1>e2, -1 for e1<e2, 0 for e1=e2  
	 */
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		ChecklistModel p1 = (ChecklistModel) e1;
		ChecklistModel p2 = (ChecklistModel) e2;
		int rc = 0;
		switch (propertyIndex) {
		case 0: // category
			rc = p1.getCategory().compareTo(p2.getCategory());
			break;
		case 1: // id
			rc = p1.getId().compareTo(p2.getId());
			break;
		case 2: // description
			rc = p1.getDescription().compareTo(p2.getDescription());
			break;
		case 3: // references
			rc = p1.getReference().compareTo(p2.getReference());
			break;
		case 4: // comment
			rc = p1.getComment().compareTo(p2.getComment());
			break;
		case 5: // choice
			int v1 = p1.getResult().getValue();
			int v2 = p2.getResult().getValue();
			if ( v1 == v2 ) rc = 0;
			else
				rc = v1 > v2 ? 1 : -1;
		default:
			rc = 0;
		}
		// if descending order, flip the direction
		if (direction == SWT.DOWN) {
			rc = -rc;
		}
		return rc;
	}
}

