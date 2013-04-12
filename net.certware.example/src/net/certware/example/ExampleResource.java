package net.certware.example;

/**
 * An example resource list element.
 * @author mrb
 * @since 1.0
 */
public class ExampleResource {
	/** resource description */
	String description;
	/** resource structure, a reference to a fragment resource */
	String structure;

	/**
	 * Constructor saves the properties.
	 * @param d description
	 * @param s structure
	 */
	public ExampleResource(String d, String s) {
		description = d;
		structure = s;
	}
	
	/**
	 * Returns the resource description.
	 * @return resource description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Returns the resource structure.
	 * @return resource structure
	 */
	public String getStructure() {
		return structure;
	}
}
