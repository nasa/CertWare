package net.certware.evidence.hugin.view.table;

import edu.ucla.belief.io.hugin.HuginNode;


/**
 * A model for table list content.
 * @author mrb
 * @since 1.2.1
 */
public class NetworkModel {
	/** id */
	public String id;
	/** description */
	public String description;
	/** item reference */
	public HuginNode item;
	/** value type */
	public int valueType;
	/** total columns */
	public static final int COLUMN_COUNT = 3;
	
	/**
	 * Network model item constructor.
	 * @param item item to preserve for model changes
	 */
	public NetworkModel(HuginNode item) {
		setId(item.getID());
		setDescription(item.getLabel());
		setValueType(item.getValueType());
		setItem(item);
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Sets the reference to the model item.
	 * @param item
	 */
	public void setItem(HuginNode item) {
		this.item = item;
	}
	
	/**
	 * Gets the reference to the model item.
	 * @return item
	 */
	public HuginNode getNode() {
		return item;
	}
	
	/**
	 * Gets the node value type.
	 * @return value type
	 */
	public int getValueType() {
		return valueType;
	}

	/**
	 * Sets the value type.
	 * @param v value type
	 */
	public void setValueType(int v) {
		this.valueType = v;
	}
}
