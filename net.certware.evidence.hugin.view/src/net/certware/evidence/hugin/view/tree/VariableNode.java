package net.certware.evidence.hugin.view.tree;

import java.util.ArrayList;
import java.util.List;

import net.certware.evidence.hugin.view.tree.VariableNodeState;
import edu.ucla.belief.io.hugin.HuginNode;

/**
 * Tree node class for network variable nodes.
 * Merely a container for a network node and its tree selection state.
 * @author mrb
 * @since 1.2.1
 */
public class VariableNode {
	/** network node */
	public HuginNode node;
	/** whether the cell is selected */
	public boolean selected = false;
	/** children states (instances) associated with this node */
	public List<VariableNodeState> states;

	/**
	 * Construct and initialize the node.
	 * Creates the list of states from the node's instance list.
	 * @param hn hugin node
	 */
	public VariableNode(HuginNode hn) {
		setNode(hn);
		setSelected(false);
		states = new ArrayList<VariableNodeState>();
		for ( Object o : hn.instances() ) {
			states.add( new VariableNodeState((String)o, this));
		}
	}
	/**
	 * Sets the selected state.
	 * @param s new state
	 */
	public void setSelected(boolean s) {
		selected = s;
	}

	/**
	 * Whether the item is selected.
	 * @return selected state
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * Sets the network node.
	 * @param h network node
	 */
	public void setNode(HuginNode h) {
		node = h;
	}

	/**
	 * Returns the network node.
	 * @return network node
	 */
	public HuginNode getNode() {
		return node;
	}

	/**
	 * Returns an array of the states for this network variable.
	 * @return array of states for this network variable
	 */
	public Object[] getStates() {
		return states.toArray();
	}
}