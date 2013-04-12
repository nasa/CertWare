/*******************************************************************************
 * Copyright (c) 2009 Paul VanderLei, Simon Archer, Jeff McAffer and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Modified for CertWare by Matt Barry
 *******************************************************************************/
package net.certware.core;

import java.util.HashMap;
import java.util.Map;

import net.certware.internal.core.bundle.Activator;

import org.osgi.framework.BundleContext;

/**
 * Property manager convenience class, based on Eclipse Toast model.
 * @author Eclipse Toast
 * @since 1.0
 */
public class PropertyManager {
	
	/** property manager instance */
	private static final PropertyManager INSTANCE = new PropertyManager();

	/**
	 * Gets a boolean property.
	 * @param property property key
	 * @return boolean property value
	 */
	public static boolean getBooleanProperty(String property) {
		return PropertyManager.INSTANCE.instanceGetBooleanProperty(property);
	}

	/**
	 * Gets a boolean property with default value.
	 * @param property property key
	 * @param defaultValue default value if property not found
	 * @return boolean property value
	 */
	public static boolean getBooleanProperty(String property, boolean defaultValue) {
		return PropertyManager.INSTANCE.instanceGetBooleanProperty(property, defaultValue);
	}

	/**
	 * Gets a string property.
	 * @param property property key
	 * @return string property value
	 */
	public static String getProperty(String property) {
		return PropertyManager.INSTANCE.instanceGetProperty(property);
	}

	/**
	 * Gets a string property with default value.
	 * @param property property key
	 * @param defaultValue default value if property not found
	 * @return string property value
	 */
	public static String getProperty(String property, String defaultValue) {
		return PropertyManager.INSTANCE.instanceGetProperty(property, defaultValue);
	}

	/** property cache */
	private Map cache;

	/**
	 * Property manager private constructor.
	 * Creates the initial cache.
	 */
	private PropertyManager() {
		super();
		cache = new HashMap(11);
	}

	private boolean instanceGetBooleanProperty(String property) {
		boolean value = instanceGetBooleanProperty(property, false);
		return value;
	}

	private boolean instanceGetBooleanProperty(String property,	boolean defaultValue) {
		String defaultValueString = String.valueOf(defaultValue);
		String value = instanceGetProperty(property, defaultValueString);
		Boolean wrapper = Boolean.valueOf(value);
		boolean state = wrapper.booleanValue();
		return state;
	}

	private String instanceGetProperty(String property) {
		String value = instanceGetProperty(property, null);
		return value;
	}

	private String instanceGetProperty(String property, String defaultValue) {
		if (property == null) {
			throw new IllegalArgumentException("property must not be null");
		}
		String value;
		synchronized (cache) {
			value = (String) cache.get(property);
			if (value == null) {
				BundleContext context = Activator.getContext();
				if (context == null)
					value = System.getProperty(property);
				else
					value = context.getProperty(property);
				if (value == null)
					value = defaultValue;
				LogUtility.logDebug("Property: -D" + property + '=' + value);
				if (value != null) {
					cache.put(property, value);
				}
			}
		}
		return value;
	}
}
