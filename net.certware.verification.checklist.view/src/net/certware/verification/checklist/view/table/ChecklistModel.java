package net.certware.verification.checklist.view.table;

import net.certware.verification.checklist.Choices;
import net.certware.verification.checklist.Item;

/**
 * A model for table list content.
 * @author mrb
 * @since 1.2.1
 */
public class ChecklistModel {
	/** category */
	public String category;
	/** id */
	public String id;
	/** description */
	public String description;
	/** reference */
	public String reference;
	/** comment */
	public String comment;
	/** result */
	public Choices result;
	/** item reference */
	private Item item;
	/** total columns */
	public static final int COLUMN_COUNT = 6;
	
	/**
	 * Checklist model constructor.
	 * @param category category name
	 * @param item item to preserve for model changes
	 */
	public ChecklistModel(String category, Item item) {
		setCategory(category);
		setId(item.getIdentifier());
		setDescription(item.getDescription());
		setReference(item.getReference());
		setComment(item.getComment());
		setResult(item.getResult());
		setItem(item);
	}
	
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	/**
	 * @return the result
	 */
	public Choices getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(Choices result) {
		this.result = result;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/**
	 * Sets the reference to the model item.
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	
	/**
	 * Gets the reference to the model item.
	 * @return item
	 */
	public Item getItem() {
		return item;
	}
	
	
}
