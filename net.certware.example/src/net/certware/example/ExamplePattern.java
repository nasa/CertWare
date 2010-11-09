package net.certware.example;

import org.eclipse.core.runtime.IConfigurationElement;

public class ExamplePattern extends Example {

	String id;
	
	public ExamplePattern(IConfigurationElement ce) {
		super(ce);
		if ( ce != null ) {
			id = ce.getAttribute(EXAMPLE_ATTR_IDP);
		}
	}
}
