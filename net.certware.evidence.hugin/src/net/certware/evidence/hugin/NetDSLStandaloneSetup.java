
package net.certware.evidence.hugin;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class NetDSLStandaloneSetup extends NetDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new NetDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

