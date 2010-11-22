/*******************************************************************************
 * Copyright (c) 2009 Paul VanderLei, Simon Archer, Jeff McAffer and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Modified for CertWare by Matt Barry.
 *******************************************************************************/
package net.certware.internal.core;

import net.certware.core.spi.IStatusIdFinder;

import org.osgi.framework.Bundle;
import org.osgi.service.packageadmin.PackageAdmin;

/**
 * Status ID finder service.
 * @author Eclipse Toast
 * @since 1.0
 */
public class StatusIdFinder implements IStatusIdFinder {
	/** package administration */
	private PackageAdmin packageAdmin;

	protected void bind(PackageAdmin admin) {
		packageAdmin = admin;
	}

	public String getStatusId(Object object) {
		if (packageAdmin == null)
			return "net.certware.core.default";
		Bundle bundle = packageAdmin.getBundle(object.getClass());
		if (bundle == null)
			return "net.certware.core.default";
		return bundle.getSymbolicName();
	}

	protected void unbind(PackageAdmin admin) {
		packageAdmin = null;
	}
}
