/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.impl;

import net.certware.measurement.smm.impl.RatioMeasureImpl;
import net.certware.measurement.spm.ReworkBacklogMeasure;
import net.certware.measurement.spm.SpmPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rework Backlog Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReworkBacklogMeasureImpl extends RatioMeasureImpl implements ReworkBacklogMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkBacklogMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmPackage.Literals.REWORK_BACKLOG_MEASURE;
	}

} //ReworkBacklogMeasureImpl
