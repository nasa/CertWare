
package net.certware.argument.gsn.xdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GsnDslStandaloneSetup extends GsnDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GsnDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

