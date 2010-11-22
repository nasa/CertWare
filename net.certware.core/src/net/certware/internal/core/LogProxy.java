/*******************************************************************************
 * Copyright (c) 2009 Paul VanderLei, Simon Archer, Jeff McAffer and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Toast is an Equinox/OSGi system developed for the book Eclipse, Equinox and
 * OSGi - Creating Highly Modular Java Applications See http://equinoxosgi.org
 * 
 * Contributors: Paul VanderLei, Simon Archer and Jeff McAffer - initial API and
 * implementation
 *******************************************************************************/
package net.certware.internal.core;

import java.util.Calendar;
import java.util.Date;

import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

/**
 * Log proxy implementing the basic log service.
 * @author Eclipse Toast
 * @since 1.0
 */
public class LogProxy extends Object implements LogService {
	private static final char DATE_DELIMETER = '-';
	private static final int DEFAULT_BUFFER_SIZE = 5 * 1024; // 5K
	private static final char TIME_DELIMETER = ':';
	private static final char WHITESPACE = ' ';
	private static final char ZERO_PADDING = '0';
	private static final Calendar CALENDAR = Calendar.getInstance();

	private static Calendar getCalendar() {
		Date now = new Date();
		LogProxy.CALENDAR.setTime(now);
		return LogProxy.CALENDAR;
	}

	private StringBuffer buffer;
	private LogService consoleLog;
	private volatile LogService log;
	private volatile int logLevel;

	/**
	 * Constructor that builds a <code>LogProxy</code> that does not have a
	 * contained <code>LogService</code>. Requests will be delegated to an
	 * instance of <code>ConsoleLog</code>, which is created via lazy
	 * initialization.
	 */
	public LogProxy() {
		super();
	}

	/**
	 * Constructor that builds a <code>LogProxy</code> with a contained
	 * <code>LogService</code> to which requests will be delegated.
	 * 
	 * @param log
	 *            A log service.
	 */
	public LogProxy(LogService log) {
		super();
		setLog(log);
	}

	/**
	 * Append the current date to the buffer. This code must be executed while
	 * synchronized on the buffer. The date will be written out in the following
	 * format: yyyy-mm-dd.
	 * 
	 * @param calendar
	 *            A Calendar.
	 */
	private void appendDate(Calendar calendar) {
		StringBuffer buffer = getBuffer();

		// Year
		int year = calendar.get(Calendar.YEAR);
		buffer.append(year);

		// Month
		buffer.append(LogProxy.DATE_DELIMETER);
		int month = calendar.get(Calendar.MONTH) + 1;

		if (month < 10) {
			buffer.append(LogProxy.ZERO_PADDING);
		}

		buffer.append(month);

		// Day
		buffer.append(LogProxy.DATE_DELIMETER);
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		if (day < 10) {
			buffer.append(LogProxy.ZERO_PADDING);
		}

		buffer.append(day);
	}

	/**
	 * Append the current time to the buffer. This code must be executed while
	 * synchronized on the buffer. The date will be written out in the following
	 * format: "hh:mm:ss.xxx". Note that "xxx" signifies milliseconds.
	 * 
	 * @param calendar
	 *            A Calendar.
	 */
	private void appendTime(Calendar calendar) {
		StringBuffer buffer = getBuffer();

		// Hours
		int hour = calendar.get(Calendar.HOUR_OF_DAY);

		if (hour < 10) {
			buffer.append(LogProxy.ZERO_PADDING);
		}

		buffer.append(hour);

		// Minutes
		buffer.append(LogProxy.TIME_DELIMETER);
		int minute = calendar.get(Calendar.MINUTE);

		if (minute < 10) {
			buffer.append(LogProxy.ZERO_PADDING);
		}

		buffer.append(minute);

		// Seconds
		buffer.append(LogProxy.TIME_DELIMETER);
		int second = calendar.get(Calendar.SECOND);

		if (second < 10) {
			buffer.append(LogProxy.ZERO_PADDING);
		}

		buffer.append(second);

		// Milliseconds
		buffer.append('.');
		int millisecond = calendar.get(Calendar.MILLISECOND);

		if (millisecond < 100) {
			buffer.append(LogProxy.ZERO_PADDING);
		}

		if (millisecond < 10) {
			buffer.append(LogProxy.ZERO_PADDING);
		}

		buffer.append(millisecond);
	}

	private void checkLevel(int level) {
		if (level >= LogService.LOG_ERROR && level <= LogService.LOG_DEBUG)
			return; // Early return.
		String message = "The log level " + level + " is unknown";
		throw new IllegalArgumentException(message);
	}

	private String formatMessage(String message) {
		String formattedMessage;
		StringBuffer buffer = getBuffer();

		// It is very important to synchronize on the buffer to ensure that only
		// one thread uses the buffer at a time. A buffer is used to improve
		// performance and reduce garbage generation.
		synchronized (buffer) {
			// Since the buffer is reused, it must be emptied before each use.
			int count = buffer.length();
			buffer.delete(0, count);

			Calendar calendar = LogProxy.getCalendar();
			appendDate(calendar);
			buffer.append(LogProxy.WHITESPACE);
			appendTime(calendar);
			buffer.append(LogProxy.WHITESPACE);
			buffer.append('-');
			buffer.append(LogProxy.WHITESPACE);
			buffer.append(message);
			formattedMessage = buffer.toString();
		}

		return formattedMessage;
	}

	private StringBuffer getBuffer() {
		synchronized (this) {
			if (buffer == null) {
				setBuffer(new StringBuffer(LogProxy.DEFAULT_BUFFER_SIZE));
			}
			return buffer;
		}
	}

	private LogService getConsoleLog() {
		synchronized (this) {
			if (consoleLog == null) {
				setConsoleLog(new ConsoleLog());
			}
			return consoleLog;
		}
	}

	/**
	 * Gets the log.
	 * @return log
	 */
	public LogService getLog() {
		return log;
	}

	/**
	 * Gets the log level.
	 * @return log level
	 */
	public int getLogLevel() {
		return logLevel;
	}

	private boolean isLogging(int level) {
		int threshold = getLogLevel();
		boolean logging = threshold >= level;
		return logging;
	}

	/**
	 * @see org.osgi.service.log.LogService#log(int, java.lang.String)
	 */
	public void log(int level, String message) {
		log(null, level, message, null);
	}

	/**
	 * @see org.osgi.service.log.LogService#log(int, java.lang.String,
	 *      java.lang.Throwable)
	 */
	public void log(int level, String message, Throwable throwable) {
		log(null, level, message, throwable);
	}

	/**
	 * @see org.osgi.service.log.LogService#log(org.osgi.framework.ServiceReference,
	 *      int, java.lang.String)
	 */
	public void log(ServiceReference reference, int level, String message) {
		log(reference, level, message, null);
	}

	/**
	 * @see org.osgi.service.log.LogService#log(org.osgi.framework.ServiceReference,
	 *      int, java.lang.String, java.lang.Throwable)
	 */
	public void log(ServiceReference reference, int level, String message,
			Throwable throwable) {
		boolean logging = isLogging(level);
		if (logging == false)
			return;

		LogService log = getLog();

		if (log == null) {
			log = getConsoleLog();
		}

		String formattedMessage = formatMessage(message);
		log.log(reference, level, formattedMessage, throwable);
	}

	private void setBuffer(StringBuffer buffer) {
		this.buffer = buffer;
	}

	private void setConsoleLog(LogService consoleLog) {
		this.consoleLog = consoleLog;
	}

	/**
	 * Sets the log service.
	 * @param log log service
	 */
	public void setLog(LogService log) {
		if (equals(log) == true)
			return; // Early return.
		if (this.log != null && log != null)
			return; // Early return.
		this.log = log;
	}

	/**
	 * Sets the log level.
	 * @param logLevel log level, checked
	 */
	public void setLogLevel(int logLevel) {
		checkLevel(logLevel);
		this.logLevel = logLevel;
	}
}
