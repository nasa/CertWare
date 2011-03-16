package net.certware.verification.checklist.view.table;

import java.util.HashSet;
import java.util.Set;

import net.certware.verification.checklist.Category;
import net.certware.verification.checklist.Checklist;
import net.certware.verification.checklist.Item;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;


/**
 * List of lines for viewer model.
 * @author mrb 
 */
public class ChecklistModelList
{

  /** the list of line entries for the table content */
  protected EList<ChecklistModel> itemList = new BasicEList<ChecklistModel>();
  /** the set of listeners */
  protected Set<ChecklistTableViewer> changeListeners = new HashSet<ChecklistTableViewer>();

  /**
   * Returns the item list.
   * @return the item list  
   */
  public EList<ChecklistModel> getItemList() {
    return itemList;
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
    		ChecklistModel cm = new ChecklistModel();
    		cm.setCategory(category.getName());
    		cm.setId(item.getIdentifier());
    		cm.setDescription(item.getDescription());
    		cm.setReference(item.getReference());
    		cm.setComment(item.getComment());
    		cm.setResult(item.getResult());
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
  public void removeChangeListener(ChecklistTableViewer viewer) {
      changeListeners.remove(viewer);
  }

  /**
   * Adds change listeners.
   * @param viewer
   */
  public void addChangeListener(ChecklistTableViewer viewer) {
      changeListeners.add(viewer);
  }
}
