/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.measurement.sco.ScoPackage
 * @generated
 */
public interface ScoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScoFactory eINSTANCE = net.certware.measurement.sco.impl.ScoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Total Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total Change Orders</em>'.
	 * @generated
	 */
	TotalChangeOrders createTotalChangeOrders();

	/**
	 * Returns a new object of class '<em>Critical Defect Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Critical Defect Change Orders</em>'.
	 * @generated
	 */
	CriticalDefectChangeOrders createCriticalDefectChangeOrders();

	/**
	 * Returns a new object of class '<em>Normal Defect Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Defect Change Orders</em>'.
	 * @generated
	 */
	NormalDefectChangeOrders createNormalDefectChangeOrders();

	/**
	 * Returns a new object of class '<em>Improvement Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Improvement Change Orders</em>'.
	 * @generated
	 */
	ImprovementChangeOrders createImprovementChangeOrders();

	/**
	 * Returns a new object of class '<em>New Feature Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Feature Change Orders</em>'.
	 * @generated
	 */
	NewFeatureChangeOrders createNewFeatureChangeOrders();

	/**
	 * Returns a new object of class '<em>Artifact Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Identifier</em>'.
	 * @generated
	 */
	ArtifactIdentifier createArtifactIdentifier();

	/**
	 * Returns a new object of class '<em>Artifact Commit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Commit</em>'.
	 * @generated
	 */
	ArtifactCommit createArtifactCommit();

	/**
	 * Returns a new object of class '<em>Commit History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit History</em>'.
	 * @generated
	 */
	CommitHistory createCommitHistory();

	/**
	 * Returns an instance of data type '<em>Change Order Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ChangeOrderType createChangeOrderType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Change Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertChangeOrderType(ChangeOrderType instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScoPackage getScoPackage();

} //ScoFactory
