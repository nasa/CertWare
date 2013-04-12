package net.certware.example;

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * Example document type.
 * @author mrb
 * @since 1.0
 */
public class ExampleDocument extends Example {
	
	/**
	 * Constructor gets the document example ID.
	 * @param ce configuration element from plugin
	 */
	public ExampleDocument(IConfigurationElement ce) {
		super(ce);
		if ( ce != null ) {
			id = ce.getAttribute(EXAMPLE_ATTR_IDD);
		}
	}
}
