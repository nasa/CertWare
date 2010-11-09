package net.certware.example;

import java.util.ArrayList;
import java.util.List;

public class ExampleCategory {

	String categoryName;
	private List<Example> examples = new ArrayList<Example>();
	
	public ExampleCategory(String name) {
		categoryName = name;
	}
	
	public void add(Example e) {
		examples.add(e);
	}
	
	public void remove(Example e) {
		examples.remove(e);
	}
	
	public List<Example> getExamples() {
		return examples;
	}
	
	public Object[] getExamplesArray() {
		return examples.toArray();
	}
	
	public String getName() {
		return categoryName;
	}
}
