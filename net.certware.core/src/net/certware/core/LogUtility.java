/*******************************************************************************
 * Copyright (c) 2009 Paul VanderLei, Simon Archer, Jeff McAffer and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Modified for CertWare by Matt Barry.
 *******************************************************************************/
package net.certware.core;

import net.certware.core.spi.IStatusIdFinder;
import net.certware.internal.core.LogProxy;

import org.osgi.service.log.LogService;

/**
 * Log utility class, following example from Eclipse Toast.
 * @author Eclipse Toast
 */
public final class LogUtility extends Object {
	private static final String LOG_LEVEL_PROPERTY = "certware.logLevel";
	private static final String TRACE_PROPERTY = "certware.trace";
	private static final String LOG_LEVEL_ERROR_VALUE = "ERROR";
	private static final String LOG_LEVEL_WARNING_VALUE = "WARNING";
	private static final String LOG_LEVEL_INFO_VALUE = "INFO";
	private static final String LOG_LEVEL_DEBUG_VALUE = "DEBUG";
	private static final String DEFAULT_LOG_LEVEL = LogUtility.LOG_LEVEL_DEBUG_VALUE;
	private static final String DEFAULT_TRACE = Boolean.FALSE.toString();
	private static final String INITIAL_LOG_LEVEL = System.getProperty(LogUtility.LOG_LEVEL_PROPERTY, LogUtility.DEFAULT_LOG_LEVEL);
	private static boolean TRACING = Boolean.valueOf(System.getProperty(LogUtility.TRACE_PROPERTY,
													LogUtility.DEFAULT_TRACE)).booleanValue();
	private static final int DEFAULT_BUFFER_SIZE = 1024;
	private static final LogUtility INSTANCE = new LogUtility();

	private static int getInitialLogLevelValue() {
		if (LogUtility.INITIAL_LOG_LEVEL
				.equalsIgnoreCase(LogUtility.LOG_LEVEL_ERROR_VALUE))
			return LogService.LOG_ERROR;
		if (LogUtility.INITIAL_LOG_LEVEL
				.equalsIgnoreCase(LogUtility.LOG_LEVEL_WARNING_VALUE))
			return LogService.LOG_WARNING;
		if (LogUtility.INITIAL_LOG_LEVEL
				.equalsIgnoreCase(LogUtility.LOG_LEVEL_INFO_VALUE))
			return LogService.LOG_INFO;
		if (LogUtility.INITIAL_LOG_LEVEL
				.equalsIgnoreCase(LogUtility.LOG_LEVEL_DEBUG_VALUE))
			return LogService.LOG_DEBUG;
		return LogService.LOG_DEBUG; // Just in case LOG_LEVEL is invalid.
	}

	/**
	 * Public getter for the <code>LogUtility</code> singleton instance.
	 * 
	 * @return The <code>LogUtility</code> singleton instance.
	 */
	public static LogUtility getInstance() {
		return LogUtility.INSTANCE;
	}

	/**
	 * Get the current logging level.
	 * 
	 * @return One of the <code>org.osgi.service.log.LogService</code>
	 *         constants.
	 */
	public static int getLoggingLevel() {
		LogUtility instance = LogUtility.getInstance();
		int level = instance.getLogLevel();
		return level;
	}

	/**
	 * Finds the log status ID from the log utility.
	 * @param object status ID
	 * @return log status ID
	 */
	public static String getStatusId(Object object) {
		LogUtility instance = LogUtility.getInstance();
		return instance.findStatusId(object);
	}

	/**
	 * Query the current log level.
	 * 
	 * @param level
	 *            The level to compare against.
	 * @return True if the log level is equal or greater than the specified
	 *         level, otherwise false.
	 */
	private static boolean isLogging(int level) {
		LogUtility instance = LogUtility.getInstance();
		int threshold = instance.getLogLevel();
		boolean logging = threshold >= level;
		return logging;
	}

	/**
	 * Query whether debug messages are being logged.
	 * 
	 * @return True if debug message are being logged, otherwise false.
	 */
	public static boolean isLoggingDebug() {
		return LogUtility.isLogging(LogService.LOG_DEBUG);
	}

	/**
	 * Query whether error messages are being logged.
	 * 
	 * @return True if error message are being logged, otherwise false.
	 */
	public static boolean isLoggingError() {
		return LogUtility.isLogging(LogService.LOG_ERROR);
	}

	/**
	 * Query whether info messages are being logged.
	 * 
	 * @return True if info message are being logged, otherwise false.
	 */
	public static boolean isLoggingInfo() {
		return LogUtility.isLogging(LogService.LOG_INFO);
	}

	/**
	 * Query whether debug messages are being logged.
	 * 
	 * @return True if debug message are being logged, otherwise false.
	 */
	public static boolean isLoggingWarning() {
		return LogUtility.isLogging(LogService.LOG_WARNING);
	}

	/**
	 * Query the tracing field. Answers <code>true</code> when tracing in on,
	 * and <code>false</code> when tracing is off.
	 * 
	 * @return True if tracing is enabled, otherwise false.
	 */
	public static boolean isTracing() {
		return LogUtility.TRACING;
	}

	private static void log(int level, Object id, String message,
			Throwable throwable) {
		boolean logging = LogUtility.isLogging(level);
		if (logging == false)
			return;
		LogUtility instance = LogUtility.getInstance();
		LogService log = instance.getLog();
		String formattedMessage = instance.formatMessage(id, message);
		log.log(level, formattedMessage, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_DEBUG</code> message.
	 * 
	 * @param id
	 *            An object that uniquely identifies the source of the message
	 *            to logged.
	 * @param message
	 *            The message to log.
	 */
	public static void logDebug(Object id, String message) {
		LogUtility.logDebug(id, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_DEBUG</code> level message.
	 * 
	 * @param id
	 *            An object that identifies who is logging the message.
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logDebug(Object id, String message, Throwable throwable) {
		LogUtility.log(LogService.LOG_DEBUG, id, message, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_DEBUG</code> message.
	 * 
	 * @param message
	 *            The message to log.
	 */
	public static void logDebug(String message) {
		LogUtility.logDebug(null, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_DEBUG</code> level message.
	 * 
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logDebug(String message, Throwable throwable) {
		LogUtility.logDebug(null, message, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_ERROR</code> message.
	 * 
	 * @param id
	 *            An object that uniquely identifies the source of the message
	 *            to logged.
	 * @param message
	 *            The message to log.
	 */
	public static void logError(Object id, String message) {
		LogUtility.logError(id, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_ERROR</code> level message.
	 * 
	 * @param id
	 *            An object that identifies who is logging the message.
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logError(Object id, String message, Throwable throwable) {
		LogUtility.log(LogService.LOG_ERROR, id, message, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_ERROR</code> message.
	 * 
	 * @param message
	 *            The message to log.
	 */
	public static void logError(String message) {
		LogUtility.logError(null, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_ERROR</code> level message.
	 * 
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logError(String message, Throwable throwable) {
		LogUtility.logError(null, message, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_INFO</code> message.
	 * 
	 * @param id
	 *            An object that uniquely identifies the source of the message
	 *            to logged.
	 * @param message
	 *            The message to log.
	 */
	public static void logInfo(Object id, String message) {
		LogUtility.logInfo(id, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_INFO</code> level message.
	 * 
	 * @param id
	 *            An object that identifies who is logging the message.
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logInfo(Object id, String message, Throwable throwable) {
		LogUtility.log(LogService.LOG_INFO, id, message, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_INFO</code> message.
	 * 
	 * @param message
	 *            The message to log.
	 */
	public static void logInfo(String message) {
		LogUtility.logInfo(null, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_INFO</code> level message.
	 * 
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logInfo(String message, Throwable throwable) {
		LogUtility.logInfo(null, message, throwable);
	}

	/**
	 * Log a <code>LogService.DEBUG_INFO</code> level trace message.
	 * 
	 * @param id
	 *            An object that identifies who is logging the message.
	 * @param message
	 *            The message that will be logged.
	 */
	public static void logTrace(Object id, String message) {
		LogUtility.logTrace(id, message, null);
	}

	/**
	 * Log a <code>LogService.DEBUG_INFO</code> level trace message.
	 * 
	 * @param id
	 *            An object that identifies who is logging the message.
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logTrace(Object id, String message, Throwable throwable) {
		boolean tracing = LogUtility.isTracing();
		if (tracing == false)
			return; // Early return.
		LogUtility.log(LogService.LOG_DEBUG, id, message, throwable);
	}

	/**
	 * Log a <code>LogService.DEBUG_INFO</code> level trace message.
	 * 
	 * @param message
	 *            The message that will be logged.
	 */
	public static void logTrace(String message) {
		LogUtility.logTrace(null, message, null);
	}

	/**
	 * Log a <code>LogService.DEBUG_INFO</code> level trace message.
	 * 
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logTrace(String message, Throwable throwable) {
		LogUtility.logTrace(null, message, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_INFO</code> message.
	 * 
	 * @param id
	 *            An object that uniquely identifies the source of the message
	 *            to logged.
	 * @param message
	 *            The message to log.
	 */
	public static void logWarning(Object id, String message) {
		LogUtility.logWarning(id, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_WARNING</code> level message.
	 * 
	 * @param id
	 *            An object that identifies who is logging the message.
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logWarning(Object id, String message, Throwable throwable) {
		LogUtility.log(LogService.LOG_WARNING, id, message, throwable);
	}

	/**
	 * Log a <code>LogService.LOG_WARNING</code> message.
	 * 
	 * @param message
	 *            The message to log.
	 */
	public static void logWarning(String message) {
		LogUtility.logWarning(null, message, null);
	}

	/**
	 * Log a <code>LogService.LOG_WARNING</code> level message.
	 * 
	 * @param message
	 *            The message that will be logged.
	 * @param throwable
	 *            An accompanying Throwable.
	 */
	public static void logWarning(String message, Throwable throwable) {
		LogUtility.logWarning(null, message, throwable);
	}

	/**
	 * Set the current logging level.
	 * 
	 * @param level
	 *            One of the <code>org.osgi.service.log.LogService</code>
	 *            constants.
	 */
	public static void setLoggingLevel(int level) {
		LogUtility instance = LogUtility.getInstance();
		instance.setLogLevel(level);
	}

	/**
	 * Set the tracing field to <code>true</code> or <code>false</code>.
	 * 
	 * @param tracing
	 *            The value of <code>true</code> turns tracing on, and a value
	 *            of <code>false</code> turns tracing off.
	 */
	public static void setTracing(boolean tracing) {
		LogUtility.TRACING = tracing;
	}
 
	/** log buffer */
	private StringBuffer buffer;
	/** log proxy */
	private LogProxy proxy;
	/** log status ID finder */
	private IStatusIdFinder idFinder = null;

	/**
	 * Creates the log utility, sets the proxy, sets the log level to default, and
	 * sets the default buffer size. 
	 */
	public LogUtility() {
		super();
		setProxy(new LogProxy());
		setLogLevel(LogUtility.getInitialLogLevelValue());
		setBuffer(new StringBuffer(LogUtility.DEFAULT_BUFFER_SIZE));
	}

	/**
	 * Binds the log ID to this instance.
	 * @param log log service ID
	 */
	public void bind(LogService log) {
		getInstance().setLog(log);
	}

	private String findStatusId(Object object) {
		return idFinder.getStatusId(object);
	}

	private String formatId(Object object) {
		if (object instanceof String) { // $codepro.audit.disable
			// disallowInstanceof
			String name = (String) object;
			name = name.trim();
			return name; // Early return.
		} else if (object instanceof Class) { // $codepro.audit.disable
			// disallowInstanceof
			Class clazz = (Class) object;
			String name = clazz.getName();
			name = getClassName(name);
			return name; // Early return.
		}
		String name = object.toString();
		name = name.trim();
		Class clazz = object.getClass();
		String className = clazz.getName();
		boolean match = name.startsWith(className);
		if (match == true) {
			name = getClassName(className);
		}
		return name;
	}

	private String formatMessage(Object id, String message) {
		String formattedMessage = message;
		if (id != null) {
			String formattedId = formatId(id);
			StringBuffer buffer = getBuffer();
			// It is very important to synchronize on the buffer to ensure that
			// only one thread uses the buffer at a time. A buffer is used to
			// improve performance and reduce garbage generation.
			synchronized (buffer) {
				// Since the buffer reused, it must be emptied before it can be
				// used to format another message.
				int count = buffer.length();
				buffer.delete(0, count);
				int formattedIdLength = formattedId.length();
				if (formattedIdLength != 0) {
					buffer.append(formattedId);
					buffer.append(": ");
				}
				buffer.append(message);
				formattedMessage = buffer.toString();
			}
		}
		return formattedMessage;
	}

	private StringBuffer getBuffer() {
		return buffer;
	}

	private String getClassName(String fullyQualifiedClassName) {
		int index = fullyQualifiedClassName.lastIndexOf('.');
		String name = fullyQualifiedClassName.substring(index + 1);
		return name;
	}

	/**
	 * Get the <code>org.osgi.service.log.LogService</code>.
	 * 
	 * @return The log service.
	 */
	public LogService getLog() {
		LogService log = getProxy();
		return log;
	}

	private int getLogLevel() {
		LogProxy proxy = getProxy();
		int logLevel = proxy.getLogLevel();
		return logLevel;
	}

	private LogProxy getProxy() {
		return proxy;
	}

	private void setBuffer(StringBuffer buffer) {
		this.buffer = buffer;
	}

	/**
	 * Set the <code>org.osgi.service.log.LogService</code>.
	 * 
	 * @param log
	 *            A log service.
	 */
	public void setLog(LogService log) {
		LogProxy proxy = getProxy();
		proxy.setLog(log);
	}

	private void setLogLevel(int logLevel) {
		LogProxy proxy = getProxy();
		proxy.setLogLevel(logLevel);
	}

	private void setProxy(LogProxy proxy) {
		this.proxy = proxy;
	}

	/**
	 * Sets the status ID finder value.
	 * @param value finder value
	 */
	public void setStatusIdFinder(IStatusIdFinder value) {
		idFinder = value;
	}

	/**
	 * Unbinds the log service by log ID.
	 * @param log log ID to remove
	 */
	public void unbind(LogService log) {
		LogUtility utility = getInstance();
		LogService service = ((LogProxy) utility.getLog()).getLog();
		if (service.equals(log))
			utility.setLog(null);
	}

}