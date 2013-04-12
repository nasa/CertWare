package net.certware.example;

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * Example checklist type.
 * @author mrb
 * @since 1.0
 */
public class ExampleChecklist extends Example {
	
	/**
	 * Constructor gets the checklist example ID.
	 * @param ce configuration element from plugin
	 */
	public ExampleChecklist(IConfigurationElement ce) {
		super(ce);
		if ( ce != null ) {
			id = ce.getAttribute(EXAMPLE_ATTR_IDC);
		}
		
	}
}
