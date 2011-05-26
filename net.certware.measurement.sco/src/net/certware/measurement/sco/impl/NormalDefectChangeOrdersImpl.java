/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.sco.impl;

import net.certware.measurement.sco.ChangeOrderType;
import net.certware.measurement.sco.NormalDefectChangeOrders;
import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Defect Change Orders</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NormalDefectChangeOrdersImpl extends ChangeOrderCountImpl implements NormalDefectChangeOrders {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NormalDefectChangeOrdersImpl() {
		super();
		this.type = ChangeOrderType.NORMAL;
		this.name = "Normal Defect Change Orders";			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScoPackage.Literals.NORMAL_DEFECT_CHANGE_ORDERS;
	}

} //NormalDefectChangeOrdersImpl
