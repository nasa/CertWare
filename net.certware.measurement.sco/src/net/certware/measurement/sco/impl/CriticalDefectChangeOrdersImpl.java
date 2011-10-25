/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import net.certware.measurement.sco.ChangeOrderType;
import net.certware.measurement.sco.CriticalDefectChangeOrders;
import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Critical Defect Change Orders</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CriticalDefectChangeOrdersImpl extends ChangeOrderCountImpl implements CriticalDefectChangeOrders {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CriticalDefectChangeOrdersImpl() {
		super();
		this.type = ChangeOrderType.CRITICAL;
		this.name = "Critical Change Orders";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScoPackage.Literals.CRITICAL_DEFECT_CHANGE_ORDERS;
	}

} //CriticalDefectChangeOrdersImpl
