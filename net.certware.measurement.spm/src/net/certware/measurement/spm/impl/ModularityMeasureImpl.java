/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.impl;

import net.certware.measurement.smm.impl.RatioMeasureImpl;

import net.certware.measurement.spm.ModularityMeasure;
import net.certware.measurement.spm.SpmPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modularity Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ModularityMeasureImpl extends RatioMeasureImpl implements ModularityMeasure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModularityMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpmPackage.Literals.MODULARITY_MEASURE;
	}

} //ModularityMeasureImpl
