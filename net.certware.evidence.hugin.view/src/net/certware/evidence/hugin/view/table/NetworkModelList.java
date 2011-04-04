package net.certware.evidence.hugin.view.table;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.TableViewer;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.io.hugin.HuginNode;


/**
 * List of lines for viewer model.
 * @author mrb 
 */
public class NetworkModelList
{

	/** the list of line entries for the table content */
	protected EList<NetworkModel> itemList = new BasicEList<NetworkModel>();
	/** the set of listeners */
	protected Set<TableViewer> changeListeners = new HashSet<TableViewer>();

	/**
	 * Returns the item list.
	 * @return the item list  
	 */
	public EList<NetworkModel> getItemList() {
		return itemList;
	}

	/**
	 * Returns item list as array.
	 * @return items as array
	 */
	public Object[] getItems() {
		if ( itemList == null )
			return new NetworkModel[1];
		return itemList.toArray();
	}
	
	
	/**
	 * Loads the table content from a network file.
	 * @param network network selected
	 * @return true if initialized, false for null references  
	 */
	public boolean initialize(BeliefNetwork network) {

		if ( network == null || network.isEmpty() )
			return false;

		itemList.clear();

		List<HuginNode> vertices = network.topologicalOrder();
		for ( HuginNode vertex : vertices ) {
				NetworkModel cm = new NetworkModel(vertex);
				itemList.add(cm);
			}

		return true;
	}

	/**
	 * Item changed responder.  Unused.
	 * @param me network model element
	 */
	public void itemChanged(NetworkModel me) {
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
