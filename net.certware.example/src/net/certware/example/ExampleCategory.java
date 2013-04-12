package net.certware.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Example category class.
 * Used to collect examples by category type.
 * @author mrb
 * @since 1.0
 */
public class ExampleCategory {

	/** category name */
	String categoryName;
	/** examples in the category */
	private List<Example> examples = new ArrayList<Example>();

	/**
	 * Constructor saves the category name.
	 * @param name category name
	 */
	public ExampleCategory(String name) {
		categoryName = name;
	}
	
	/**
	 * Adds an example to the examples list.
	 * @param e example to add
	 */
	public void add(Example e) {
		examples.add(e);
	}
	
	/**
	 * Removes an example from the examples list.
	 * @param e example to remove
	 */
	public void remove(Example e) {
		examples.remove(e);
	}
	
	/**
	 * Returns the examples list.
	 * @return examples list
	 */
	public List<Example> getExamples() {
		return examples;
	}
	
	/**
	 * Returns the examples list as an array.
	 * @return examples array
	 */
	public Object[] getExamplesArray() {
		return examples.toArray();
	}
	
	/**
	 * Returns the category name.
	 * @return category name
	 */
	public String getName() {
		return categoryName;
	}
}
