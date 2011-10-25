/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import net.certware.measurement.sco.ChangeOrderType;
import net.certware.measurement.sco.NewFeatureChangeOrders;
import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Feature Change Orders</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NewFeatureChangeOrdersImpl extends ChangeOrderCountImpl implements NewFeatureChangeOrders {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NewFeatureChangeOrdersImpl() {
		super();
		this.type = ChangeOrderType.NEW_FEATURES;
		this.name = "New Feature Change Orders";		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScoPackage.Literals.NEW_FEATURE_CHANGE_ORDERS;
	}

} //NewFeatureChangeOrdersImpl
