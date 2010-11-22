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

/**
 * Methods for static delays.
 * @author mrb
 * @since 1.0
 */
public class Delay {
	/**
	 * Delay by performing sleep on thread.
	 * @param milliseconds duration in milliseconds
	 */
	public static void milliseconds(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) { // ignored
		}
	}

	/**
	 * Delay by performing sleep on thread.
	 * Calls milliseconds() method.
	 * @param seconds duration in seconds
	 */
	public static void seconds(int seconds) {
		Delay.milliseconds(1000 * seconds);
	}
}
