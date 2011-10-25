/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.impl;

import net.certware.measurement.smm.Accumulator;
import net.certware.measurement.smm.impl.CollectiveMeasureImpl;
import net.certware.measurement.spm.SpmPackage;
import net.certware.measurement.spm.TrendMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trend Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TrendMeasureImpl extends CollectiveMeasureImpl implements TrendMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * Sets accumulator to AVERAGE, but it is actually used as a sequence.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TrendMeasureImpl() {
		super();
		this.setAccumulator(Accumulator.AVERAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmPackage.Literals.TREND_MEASURE;
	}

} //TrendMeasureImpl
