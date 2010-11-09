package net.certware.example;

import org.eclipse.core.runtime.IConfigurationElement;

public class ExampleDocument extends Example {
	String id;
	
	public ExampleDocument(IConfigurationElement ce) {
		super(ce);
		if ( ce != null ) {
			id = ce.getAttribute(EXAMPLE_ATTR_IDD);
		}
	}
}
