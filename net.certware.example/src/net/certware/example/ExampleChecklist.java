package net.certware.example;

import org.eclipse.core.runtime.IConfigurationElement;

public class ExampleChecklist extends Example {

	String id;
	
	public ExampleChecklist(IConfigurationElement ce) {
		super(ce);
		if ( ce != null ) {
			id = ce.getAttribute(EXAMPLE_ATTR_IDC);
		}
	}
}
