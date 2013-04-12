/**
 * CertWare core UI log utility
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.core.ui.log;

import net.certware.core.ui.CertWareUI;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;


/**
 * Wraps the <code>ILog</code> interface for plug-in logging and
 * convenience methods.
 * @author mrb
 */
public class CertWareLog {

	/** see the editor plugin XML file for the id */
	//private static final String PLUGIN_REF_ID = "net.certware.core.ui";
	public static final String PLUGIN_REF_ID = "CertWare";

	/**
	 * Writes an information message to the plug-in log, severity INFO and code OK.
	 * @param message information message
	 */
	public static void logInfo(String message) {
		log(IStatus.INFO, IStatus.OK, message, null);
	}
	
	/**
	 * Writes an unexpected exception message with exception details to the plug-in log.
	 * Severity ERROR and code OK.
	 * @param exception the unexpected exception
	 */
	public static void logError(Throwable exception) {
		logError("Unexpected exception", exception);
	}
	
	/**
	 * Writes a known message with exception details to the plug-in log.
	 * Severity ERROR and code OK. 
	 * @param message associated message
	 * @param exception the expected exception
	 */
	public static void logError(String message, Throwable exception) {
		log(IStatus.ERROR, IStatus.OK, message, exception);
	}
	
	/**
	 * Writes a warning message to the plug-in log.
	 * Severity WARNING and code OK. 
	 * @param message warning message
	 */
	public static void logWarning(String message) {
		log(IStatus.WARNING, IStatus.OK, message, null);
	}

	/**
	 * Writes a cancel message to the plug-in log.
	 * Severity CANCEL and code OK.
	 * @param message cancel message
	 */
	public static void logCancel(String message) {
		log(IStatus.CANCEL, IStatus.OK, message, null);
	}
	
	/**
	 * Writes a configured message to the plug-in log.
	 * @param severity severity code from <code>IStatus</code>
	 * @param code plug-in code or <code>IStatus.OK</code>
	 * @param message message text, localized
	 * @param exception exception or null if not applicable
	 */
	public static void log(int severity, int code, String message, Throwable exception) {
		log(createStatus(severity,code,message,exception));
	}

	/**
	 * Creates and configures a new status object.
	 * @param severity severity code from <code>IStatus</code>
	 * @param code plug-in code or <code>IStatus.OK</code>
	 * @param message message text, localized
	 * @param exception exception or null if not applicable
	 * @return new status object, including plug-in reference ID
	 */
	public static IStatus createStatus(int severity, int code, String message, Throwable exception ) {
		return new Status(severity, PLUGIN_REF_ID, code, message, exception);
	}
	
	/**
	 * Generates a log entry with given status directly to the plug-in's log.
	 * @param status 
	 */
	public static void log(final IStatus status) {

		try {
		Display d = CertWareUI.getDefault().getWorkbench().getDisplay();
    	d.syncExec(
  			  new Runnable() {
  			    public void run(){
  					CertWareUI.getDefault().getLog().log(status);
  			    }
  			  });
		} catch( Exception e ) {
			System.err.println("CertWare log sync:" + ' ' + e.getMessage());
		}
		
	} // log method
}
