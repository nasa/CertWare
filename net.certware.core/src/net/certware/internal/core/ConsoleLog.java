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

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

/**
 * Console log implementing the basic log service.
 * @author Eclipse Toast
 * @since 1.0
 */
class ConsoleLog extends Object implements LogService {
	private static final String LOG_LEVEL_DEBUG_VALUE = "DEBUG";
	private static final String LOG_LEVEL_ERROR_VALUE = "ERROR";
	private static final String LOG_LEVEL_INFO_VALUE = "INFO";
	private static final String LOG_LEVEL_UNKNOWN_VALUE = "<unknown>";
	private static final String LOG_LEVEL_WARNING_VALUE = "WARNING";

	private static final int DEFAULT_BUFFER_SIZE = 1024;
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	private StringBuffer buffer;

	ConsoleLog() {
		super();
		setBuffer(new StringBuffer(ConsoleLog.DEFAULT_BUFFER_SIZE));
	}

	private String formatLogMessage(ServiceReference reference, int level,
			String message) {
		StringBuffer buffer = getBuffer();
		int count = buffer.length();
		buffer.delete(0, count); // Reset the buffer.
		String prefix = getPrefix(level);
		buffer.append(prefix);
		buffer.append(' ');
		buffer.append(message);
		printServiceReferenceOn(buffer, reference);
		buffer.append(ConsoleLog.LINE_SEPARATOR);
		String logMessage = buffer.toString();
		return logMessage;
	}

	private StringBuffer getBuffer() {
		return buffer;
	}

	private String getLevelText(int level) {
		String text;

		switch (level) {
		case LogService.LOG_ERROR:
			text = ConsoleLog.LOG_LEVEL_ERROR_VALUE;
			break;
		case LogService.LOG_WARNING:
			text = ConsoleLog.LOG_LEVEL_WARNING_VALUE;
			break;
		case LogService.LOG_INFO:
			text = ConsoleLog.LOG_LEVEL_INFO_VALUE;
			break;
		case LogService.LOG_DEBUG:
			text = ConsoleLog.LOG_LEVEL_DEBUG_VALUE;
			break;
		default:
			text = ConsoleLog.LOG_LEVEL_UNKNOWN_VALUE;
			break;
		}

		return text;
	}

	private OutputStream getOutputStream(int level) {
		OutputStream stream;

		if (level == LogService.LOG_INFO || level == LogService.LOG_DEBUG) {
			stream = System.out;
		} else {
			stream = System.err;
		}

		return stream;
	}

	private String getPrefix(int level) {
		String levelText = getLevelText(level);

		StringBuffer buffer = new StringBuffer(10);
		buffer.append('[');
		buffer.append(levelText);
		buffer.append(']');

		String prefix = buffer.toString();
		return prefix;
	}

	private List getServiceNames(ServiceReference reference) {
		String[] names = (String[]) reference
				.getProperty(Constants.OBJECTCLASS);
		List list = new ArrayList(names.length);

		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			list.add(name);
		}

		return list;
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
		OutputStream stream = getOutputStream(level);

		synchronized (this) {
			String logMessage = formatLogMessage(reference, level, message);
			byte[] bytes = logMessage.getBytes();

			try {
				stream.write(bytes);
				stream.flush();

				if (throwable != null) {
					PrintStream printStream = new PrintStream(stream);
					throwable.printStackTrace(printStream);
					printStream.flush();
				}
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}

	private void printServiceReferenceOn(StringBuffer buffer,
			ServiceReference reference) {
		if (reference == null)
			return; // Early return.
		Bundle bundle = reference.getBundle();

		if (bundle != null) {
			String symbolicName = bundle.getSymbolicName();
			long id = bundle.getBundleId();
			buffer.append("bundle");
			buffer.append('=');
			buffer.append(symbolicName);
			buffer.append(' ');
			buffer.append('[');
			buffer.append(id);
			buffer.append(']');
			buffer.append(',');
			buffer.append(' ');
		}

		buffer.append("services");
		buffer.append('=');
		buffer.append('[');

		List names = getServiceNames(reference);
		Iterator iterator = names.iterator();

		while (iterator.hasNext() == true) {
			Object name = iterator.next();
			buffer.append(name);

			if (iterator.hasNext() == true) {
				buffer.append(',');
				buffer.append(' ');
			}
		}

		buffer.append(']');
	}

	private void setBuffer(StringBuffer buffer) {
		this.buffer = buffer;
	}
}