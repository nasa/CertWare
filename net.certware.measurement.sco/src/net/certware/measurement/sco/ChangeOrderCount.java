/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Order Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.ChangeOrderCount#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ChangeOrderCount#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ChangeOrderCount#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ChangeOrderCount#getBrokenLines <em>Broken Lines</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ChangeOrderCount#getFixedLines <em>Fixed Lines</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ChangeOrderCount#getRepairEffort <em>Repair Effort</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.sco.ScoPackage#getChangeOrderCount()
 * @model abstract="true"
 * @generated
 */
public interface ChangeOrderCount extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.measurement.sco.ScoPackage#getChangeOrderCount_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ChangeOrderCount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see net.certware.measurement.sco.ScoPackage#getChangeOrderCount_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ChangeOrderCount#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link net.certware.measurement.sco.ChangeOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.certware.measurement.sco.ChangeOrderType
	 * @see #setType(ChangeOrderType)
	 * @see net.certware.measurement.sco.ScoPackage#getChangeOrderCount_Type()
	 * @model default="Normal" required="true"
	 * @generated
	 */
	ChangeOrderType getType();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ChangeOrderCount#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.certware.measurement.sco.ChangeOrderType
	 * @see #getType()
	 * @generated
	 */
	void setType(ChangeOrderType value);

	/**
	 * Returns the value of the '<em><b>Broken Lines</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broken Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broken Lines</em>' attribute.
	 * @see #setBrokenLines(int)
	 * @see net.certware.measurement.sco.ScoPackage#getChangeOrderCount_BrokenLines()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getBrokenLines();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ChangeOrderCount#getBrokenLines <em>Broken Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broken Lines</em>' attribute.
	 * @see #getBrokenLines()
	 * @generated
	 */
	void setBrokenLines(int value);

	/**
	 * Returns the value of the '<em><b>Fixed Lines</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Lines</em>' attribute.
	 * @see #setFixedLines(int)
	 * @see net.certware.measurement.sco.ScoPackage#getChangeOrderCount_FixedLines()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getFixedLines();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ChangeOrderCount#getFixedLines <em>Fixed Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Lines</em>' attribute.
	 * @see #getFixedLines()
	 * @generated
	 */
	void setFixedLines(int value);

	/**
	 * Returns the value of the '<em><b>Repair Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repair Effort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair Effort</em>' attribute.
	 * @see #setRepairEffort(double)
	 * @see net.certware.measurement.sco.ScoPackage#getChangeOrderCount_RepairEffort()
	 * @model required="true"
	 * @generated
	 */
	double getRepairEffort();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ChangeOrderCount#getRepairEffort <em>Repair Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repair Effort</em>' attribute.
	 * @see #getRepairEffort()
	 * @generated
	 */
	void setRepairEffort(double value);

} // ChangeOrderCount
