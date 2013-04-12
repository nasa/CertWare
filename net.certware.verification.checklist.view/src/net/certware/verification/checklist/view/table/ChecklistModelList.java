package net.certware.verification.checklist.view.table;

import java.util.HashSet;
import java.util.Set;

import net.certware.verification.checklist.Category;
import net.certware.verification.checklist.Checklist;
import net.certware.verification.checklist.Item;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.TableViewer;


/**
 * List of lines for viewer model.
 * @author mrb 
 */
public class ChecklistModelList
{

	/** the list of line entries for the table content */
	protected EList<ChecklistModel> itemList = new BasicEList<ChecklistModel>();
	/** the set of listeners */
	protected Set<TableViewer> changeListeners = new HashSet<TableViewer>();

	/**
	 * Returns the item list.
	 * @return the item list  
	 */
	public EList<ChecklistModel> getItemList() {
		return itemList;
	}

	/**
	 * Returns item list as array.
	 * @return items as array
	 */
	public Object[] getItems() {
		if ( itemList == null )
			return new ChecklistModel[1];
		return itemList.toArray();
	}
	
	
	/**
	 * Loads the table content from a buffer overflow data file.
	 * @param checklist checklist selected
	 * @return true if initialized, false for null references  
	 */
	public boolean initialize(Checklist checklist) {

		if ( checklist == null || checklist.getCategories().isEmpty() )
			return false;

		itemList.clear();

		for ( Category category : checklist.getCategories() ) {
			for ( Item item : category.getItems() ) {
				ChecklistModel cm = new ChecklistModel(category.getName(),item);
				itemList.add(cm);
			}
		}

		return true;
	}

	/**
	 * Item changed responder.  Unused.
	 * @param cm checklist model element
	 */
	public void itemChanged(ChecklistModel cm) {
	}

	/**
	 * Removes change listeners.
	 * @param viewer
	 */
	public void removeChangeListener(TableViewer viewer) {
		changeListeners.remove(viewer);
	}

	/**
	 * Adds change listeners.
	 * @param viewer
	 */
	public void addChangeListener(TableViewer viewer) {
		changeListeners.add(viewer);
	}
}
