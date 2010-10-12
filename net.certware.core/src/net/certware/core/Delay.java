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

public class Delay {
	public static void milliseconds(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) { // ignored
		}
	}

	public static void seconds(int seconds) {
		Delay.milliseconds(1000 * seconds);
	}
}
