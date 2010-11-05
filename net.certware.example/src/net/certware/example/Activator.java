package net.certware.example;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		runPatternExtension();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

	private static final String PATTERN_ID = "net.certware.example";
	
	// TODO testing only
	private void runPatternExtension() throws CoreException {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(PATTERN_ID);
		System.out.println("running pattern examples");
		
		for (IConfigurationElement e : config) {
			System.out.println("Evaluating extension " + e);
			
			for ( String a : e.getAttributeNames() ) {
				System.out.println("Attribute: " + a);
			}
			
			for ( IConfigurationElement child : e.getChildren() ) {
				System.out.println("child: " + child);
			}
			
			/*
			final Object o = e.createExecutableExtension("class");
			if (o instanceof IGreeter) {
				ISafeRunnable runnable = new ISafeRunnable() {
					@Override
					public void handleException(Throwable exception) {
						System.out.println("Exception in client");
					}

					@Override
					public void run() throws Exception {
						((IGreeter) o).greet();
					}
				};
				SafeRunner.run(runnable);
			}
			*/
		}
	}

}
