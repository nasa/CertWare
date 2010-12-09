
package net.certware.argument.gsn;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GsnDslStandaloneSetup extends GsnDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GsnDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

