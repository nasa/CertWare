package net.certware.example;

public class ExampleResource {
	String description;
	String structure;
	
	public ExampleResource(String d, String s) {
		description = d;
		structure = s;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getStructure() {
		return structure;
	}
}
