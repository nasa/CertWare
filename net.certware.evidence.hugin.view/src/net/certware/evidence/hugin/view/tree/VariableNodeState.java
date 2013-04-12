package net.certware.evidence.hugin.view.tree;

import net.certware.evidence.hugin.view.tree.VariableNode;


/**
 * A leaf in the tree display, representing a state in a network variable.
 * Used to keep track of selections.
 * Selections are always empty when table is initially loaded.
 * Selections are not kept in the model directly, but certain wizards 
 * may change associated parameters that are then saved.
 */
public class VariableNodeState {
	/** state name for instance */
	protected String stateName;
	/** whether the cell is selected */
	protected boolean selected = false;
	/** variable node container for sibling reference */
	protected VariableNode container;
	/** marginal probability */
	protected double marginal;
	
	/**
	 * Constructor sets name and selected state to false.
	 * @param name state name
	 */
	public VariableNodeState(String name, VariableNode parent) {
		setStateName(name);
		setSelected(false);
		container = parent;
	}

	/** 
	 * Clears selection state of siblings.
	 */
	public void clearSiblings() {
		for ( VariableNodeState vns : container.states ) {
			if ( vns == this ) {
				continue;
			}
			vns.setSelected(false);
		}
	}
	
	/**
	 * Sets the item selected state.
	 * @param s new selection state
	 */
	public void setSelected(boolean s) {
		selected = s;
	}

	/**
	 * Whether the item is selected.
	 * @return selection state
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * Sets the state name, typically from the variable's state list.
	 * @param s state name
	 */
	public void setStateName(String s) {
		stateName = s;
	}

	/**
	 * Returns the state name.
	 * @return state name
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @return the container
	 */
	public VariableNode getContainer() {
		return container;
	}

	/**
	 * @param container the container to set
	 */
	public void setContainer(VariableNode container) {
		this.container = container;
	}
	
	/**
	 * Returns the latest marginal probability value.
	 * @return marginal probability
	 */
	public double getMarginal() {
		return marginal;
	}

	/**
	 * Set the marginal probability.
	 * @param d marginal probability
	 */
	public void setMarginal(double d) {
		marginal = d;
	}
}