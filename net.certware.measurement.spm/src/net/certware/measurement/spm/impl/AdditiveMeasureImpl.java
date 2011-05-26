/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.impl;

import net.certware.measurement.smm.Accumulator;
import net.certware.measurement.smm.impl.CollectiveMeasureImpl;
import net.certware.measurement.spm.AdditiveMeasure;
import net.certware.measurement.spm.SpmPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdditiveMeasureImpl extends CollectiveMeasureImpl implements AdditiveMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * Sets the SUM enumeration. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AdditiveMeasureImpl() {
		super();
		this.setAccumulator(Accumulator.SUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmPackage.Literals.ADDITIVE_MEASURE;
	}

} //AdditiveMeasureImpl
