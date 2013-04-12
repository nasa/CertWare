
package net.certware.argument.sfp;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SemiFormalProofStandaloneSetup extends SemiFormalProofStandaloneSetupGenerated{

	public static void doSetup() {
		new SemiFormalProofStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

