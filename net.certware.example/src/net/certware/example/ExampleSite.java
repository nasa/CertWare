package net.certware.example;

/**
 * An example site list element.
 * @since 1.1
 */
public class ExampleSite {
	/** site description */
	String description;
	/** site location */
	String location;

	/**
	 * Constructor saves the properties.
	 * @param d description
	 * @param u URL
	 */
	public ExampleSite(String d, String u) {
		description = d;
		location = u;
	}
	
	/**
	 * Returns the site description.
	 * @return site description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Returns the site location.
	 * @return site location
	 */
	public String getLocation() {
		return location;
	}
}
