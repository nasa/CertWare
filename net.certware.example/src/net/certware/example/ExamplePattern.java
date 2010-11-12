package net.certware.example;

import org.eclipse.core.runtime.IConfigurationElement;

/**
 * Pattern example type.
 * @author mrb
 * @since 1.0
 */
public class ExamplePattern extends Example {

	/**
	 * Constructor gets the pattern example ID.
	 * @param ce configuration element from plugin
	 */
	public ExamplePattern(IConfigurationElement ce) {
		super(ce);
		if ( ce != null ) {
			id = ce.getAttribute(EXAMPLE_ATTR_IDP);
		}
	}
}
