/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.certware.measurement.sco.ScoFactory
 * @model kind="package"
 * @generated
 */
public interface ScoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sco"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/sco"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sco"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScoPackage eINSTANCE = net.certware.measurement.sco.impl.ScoPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl <em>Change Order Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.ChangeOrderCountImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getChangeOrderCount()
	 * @generated
	 */
	int CHANGE_ORDER_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_COUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_COUNT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_COUNT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Broken Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_COUNT__BROKEN_LINES = 3;

	/**
	 * The feature id for the '<em><b>Fixed Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_COUNT__FIXED_LINES = 4;

	/**
	 * The feature id for the '<em><b>Repair Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_COUNT__REPAIR_EFFORT = 5;

	/**
	 * The number of structural features of the '<em>Change Order Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_COUNT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.TotalChangeOrdersImpl <em>Total Change Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.TotalChangeOrdersImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getTotalChangeOrders()
	 * @generated
	 */
	int TOTAL_CHANGE_ORDERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDERS__NAME = CHANGE_ORDER_COUNT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDERS__VALUE = CHANGE_ORDER_COUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDERS__TYPE = CHANGE_ORDER_COUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Broken Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDERS__BROKEN_LINES = CHANGE_ORDER_COUNT__BROKEN_LINES;

	/**
	 * The feature id for the '<em><b>Fixed Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDERS__FIXED_LINES = CHANGE_ORDER_COUNT__FIXED_LINES;

	/**
	 * The feature id for the '<em><b>Repair Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDERS__REPAIR_EFFORT = CHANGE_ORDER_COUNT__REPAIR_EFFORT;

	/**
	 * The number of structural features of the '<em>Total Change Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDERS_FEATURE_COUNT = CHANGE_ORDER_COUNT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.CriticalDefectChangeOrdersImpl <em>Critical Defect Change Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.CriticalDefectChangeOrdersImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getCriticalDefectChangeOrders()
	 * @generated
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS__NAME = CHANGE_ORDER_COUNT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS__VALUE = CHANGE_ORDER_COUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS__TYPE = CHANGE_ORDER_COUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Broken Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS__BROKEN_LINES = CHANGE_ORDER_COUNT__BROKEN_LINES;

	/**
	 * The feature id for the '<em><b>Fixed Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS__FIXED_LINES = CHANGE_ORDER_COUNT__FIXED_LINES;

	/**
	 * The feature id for the '<em><b>Repair Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS__REPAIR_EFFORT = CHANGE_ORDER_COUNT__REPAIR_EFFORT;

	/**
	 * The number of structural features of the '<em>Critical Defect Change Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDERS_FEATURE_COUNT = CHANGE_ORDER_COUNT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.NormalDefectChangeOrdersImpl <em>Normal Defect Change Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.NormalDefectChangeOrdersImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getNormalDefectChangeOrders()
	 * @generated
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS__NAME = CHANGE_ORDER_COUNT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS__VALUE = CHANGE_ORDER_COUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS__TYPE = CHANGE_ORDER_COUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Broken Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS__BROKEN_LINES = CHANGE_ORDER_COUNT__BROKEN_LINES;

	/**
	 * The feature id for the '<em><b>Fixed Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS__FIXED_LINES = CHANGE_ORDER_COUNT__FIXED_LINES;

	/**
	 * The feature id for the '<em><b>Repair Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS__REPAIR_EFFORT = CHANGE_ORDER_COUNT__REPAIR_EFFORT;

	/**
	 * The number of structural features of the '<em>Normal Defect Change Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDERS_FEATURE_COUNT = CHANGE_ORDER_COUNT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.ImprovementChangeOrdersImpl <em>Improvement Change Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.ImprovementChangeOrdersImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getImprovementChangeOrders()
	 * @generated
	 */
	int IMPROVEMENT_CHANGE_ORDERS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDERS__NAME = CHANGE_ORDER_COUNT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDERS__VALUE = CHANGE_ORDER_COUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDERS__TYPE = CHANGE_ORDER_COUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Broken Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDERS__BROKEN_LINES = CHANGE_ORDER_COUNT__BROKEN_LINES;

	/**
	 * The feature id for the '<em><b>Fixed Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDERS__FIXED_LINES = CHANGE_ORDER_COUNT__FIXED_LINES;

	/**
	 * The feature id for the '<em><b>Repair Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDERS__REPAIR_EFFORT = CHANGE_ORDER_COUNT__REPAIR_EFFORT;

	/**
	 * The number of structural features of the '<em>Improvement Change Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDERS_FEATURE_COUNT = CHANGE_ORDER_COUNT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.NewFeatureChangeOrdersImpl <em>New Feature Change Orders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.NewFeatureChangeOrdersImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getNewFeatureChangeOrders()
	 * @generated
	 */
	int NEW_FEATURE_CHANGE_ORDERS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDERS__NAME = CHANGE_ORDER_COUNT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDERS__VALUE = CHANGE_ORDER_COUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDERS__TYPE = CHANGE_ORDER_COUNT__TYPE;

	/**
	 * The feature id for the '<em><b>Broken Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDERS__BROKEN_LINES = CHANGE_ORDER_COUNT__BROKEN_LINES;

	/**
	 * The feature id for the '<em><b>Fixed Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDERS__FIXED_LINES = CHANGE_ORDER_COUNT__FIXED_LINES;

	/**
	 * The feature id for the '<em><b>Repair Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDERS__REPAIR_EFFORT = CHANGE_ORDER_COUNT__REPAIR_EFFORT;

	/**
	 * The number of structural features of the '<em>New Feature Change Orders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDERS_FEATURE_COUNT = CHANGE_ORDER_COUNT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl <em>Artifact Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.ArtifactIdentifierImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getArtifactIdentifier()
	 * @generated
	 */
	int ARTIFACT_IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__RESOURCE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Baselined Line Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Current Line Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Critical Defect Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Normal Defect Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS = 4;

	/**
	 * The feature id for the '<em><b>Improvement Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS = 5;

	/**
	 * The feature id for the '<em><b>New Feature Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS = 6;

	/**
	 * The feature id for the '<em><b>Total Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS = 7;

	/**
	 * The number of structural features of the '<em>Artifact Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_IDENTIFIER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.ArtifactCommitImpl <em>Artifact Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.ArtifactCommitImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getArtifactCommit()
	 * @generated
	 */
	int ARTIFACT_COMMIT = 7;

	/**
	 * The feature id for the '<em><b>Artifact Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Commit Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_COMMIT__COMMIT_IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Usage Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_COMMIT__USAGE_TIME = 2;

	/**
	 * The number of structural features of the '<em>Artifact Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_COMMIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.impl.CommitHistoryImpl <em>Commit History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.impl.CommitHistoryImpl
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getCommitHistory()
	 * @generated
	 */
	int COMMIT_HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Commit Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_HISTORY__COMMIT_RECORD = 0;

	/**
	 * The number of structural features of the '<em>Commit History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_HISTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.sco.ChangeOrderType <em>Change Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.ChangeOrderType
	 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getChangeOrderType()
	 * @generated
	 */
	int CHANGE_ORDER_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.ChangeOrderCount <em>Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Order Count</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderCount
	 * @generated
	 */
	EClass getChangeOrderCount();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ChangeOrderCount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderCount#getName()
	 * @see #getChangeOrderCount()
	 * @generated
	 */
	EAttribute getChangeOrderCount_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ChangeOrderCount#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderCount#getValue()
	 * @see #getChangeOrderCount()
	 * @generated
	 */
	EAttribute getChangeOrderCount_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ChangeOrderCount#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderCount#getType()
	 * @see #getChangeOrderCount()
	 * @generated
	 */
	EAttribute getChangeOrderCount_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ChangeOrderCount#getBrokenLines <em>Broken Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Broken Lines</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderCount#getBrokenLines()
	 * @see #getChangeOrderCount()
	 * @generated
	 */
	EAttribute getChangeOrderCount_BrokenLines();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ChangeOrderCount#getFixedLines <em>Fixed Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Lines</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderCount#getFixedLines()
	 * @see #getChangeOrderCount()
	 * @generated
	 */
	EAttribute getChangeOrderCount_FixedLines();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ChangeOrderCount#getRepairEffort <em>Repair Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repair Effort</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderCount#getRepairEffort()
	 * @see #getChangeOrderCount()
	 * @generated
	 */
	EAttribute getChangeOrderCount_RepairEffort();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.TotalChangeOrders <em>Total Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Change Orders</em>'.
	 * @see net.certware.measurement.sco.TotalChangeOrders
	 * @generated
	 */
	EClass getTotalChangeOrders();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.CriticalDefectChangeOrders <em>Critical Defect Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critical Defect Change Orders</em>'.
	 * @see net.certware.measurement.sco.CriticalDefectChangeOrders
	 * @generated
	 */
	EClass getCriticalDefectChangeOrders();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.NormalDefectChangeOrders <em>Normal Defect Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Defect Change Orders</em>'.
	 * @see net.certware.measurement.sco.NormalDefectChangeOrders
	 * @generated
	 */
	EClass getNormalDefectChangeOrders();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.ImprovementChangeOrders <em>Improvement Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Improvement Change Orders</em>'.
	 * @see net.certware.measurement.sco.ImprovementChangeOrders
	 * @generated
	 */
	EClass getImprovementChangeOrders();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.NewFeatureChangeOrders <em>New Feature Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Feature Change Orders</em>'.
	 * @see net.certware.measurement.sco.NewFeatureChangeOrders
	 * @generated
	 */
	EClass getNewFeatureChangeOrders();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.ArtifactIdentifier <em>Artifact Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Identifier</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier
	 * @generated
	 */
	EClass getArtifactIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ArtifactIdentifier#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getResourceName()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EAttribute getArtifactIdentifier_ResourceName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ArtifactIdentifier#getBaselinedLineCount <em>Baselined Line Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baselined Line Count</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getBaselinedLineCount()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EAttribute getArtifactIdentifier_BaselinedLineCount();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ArtifactIdentifier#getCurrentLineCount <em>Current Line Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Line Count</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getCurrentLineCount()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EAttribute getArtifactIdentifier_CurrentLineCount();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.measurement.sco.ArtifactIdentifier#getCriticalDefectChangeOrders <em>Critical Defect Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Critical Defect Change Orders</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getCriticalDefectChangeOrders()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EReference getArtifactIdentifier_CriticalDefectChangeOrders();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.measurement.sco.ArtifactIdentifier#getNormalDefectChangeOrders <em>Normal Defect Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Normal Defect Change Orders</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getNormalDefectChangeOrders()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EReference getArtifactIdentifier_NormalDefectChangeOrders();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.measurement.sco.ArtifactIdentifier#getImprovementChangeOrders <em>Improvement Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Improvement Change Orders</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getImprovementChangeOrders()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EReference getArtifactIdentifier_ImprovementChangeOrders();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.measurement.sco.ArtifactIdentifier#getNewFeatureChangeOrders <em>New Feature Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Feature Change Orders</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getNewFeatureChangeOrders()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EReference getArtifactIdentifier_NewFeatureChangeOrders();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.measurement.sco.ArtifactIdentifier#getTotalChangeOrders <em>Total Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Change Orders</em>'.
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getTotalChangeOrders()
	 * @see #getArtifactIdentifier()
	 * @generated
	 */
	EReference getArtifactIdentifier_TotalChangeOrders();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.ArtifactCommit <em>Artifact Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Commit</em>'.
	 * @see net.certware.measurement.sco.ArtifactCommit
	 * @generated
	 */
	EClass getArtifactCommit();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.sco.ArtifactCommit#getArtifactIdentifiers <em>Artifact Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Identifiers</em>'.
	 * @see net.certware.measurement.sco.ArtifactCommit#getArtifactIdentifiers()
	 * @see #getArtifactCommit()
	 * @generated
	 */
	EReference getArtifactCommit_ArtifactIdentifiers();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ArtifactCommit#getCommitIdentifier <em>Commit Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Identifier</em>'.
	 * @see net.certware.measurement.sco.ArtifactCommit#getCommitIdentifier()
	 * @see #getArtifactCommit()
	 * @generated
	 */
	EAttribute getArtifactCommit_CommitIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.sco.ArtifactCommit#getUsageTime <em>Usage Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Time</em>'.
	 * @see net.certware.measurement.sco.ArtifactCommit#getUsageTime()
	 * @see #getArtifactCommit()
	 * @generated
	 */
	EAttribute getArtifactCommit_UsageTime();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.sco.CommitHistory <em>Commit History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit History</em>'.
	 * @see net.certware.measurement.sco.CommitHistory
	 * @generated
	 */
	EClass getCommitHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.sco.CommitHistory#getCommitRecord <em>Commit Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commit Record</em>'.
	 * @see net.certware.measurement.sco.CommitHistory#getCommitRecord()
	 * @see #getCommitHistory()
	 * @generated
	 */
	EReference getCommitHistory_CommitRecord();

	/**
	 * Returns the meta object for enum '{@link net.certware.measurement.sco.ChangeOrderType <em>Change Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Order Type</em>'.
	 * @see net.certware.measurement.sco.ChangeOrderType
	 * @generated
	 */
	EEnum getChangeOrderType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScoFactory getScoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl <em>Change Order Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.ChangeOrderCountImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getChangeOrderCount()
		 * @generated
		 */
		EClass CHANGE_ORDER_COUNT = eINSTANCE.getChangeOrderCount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_COUNT__NAME = eINSTANCE.getChangeOrderCount_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_COUNT__VALUE = eINSTANCE.getChangeOrderCount_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_COUNT__TYPE = eINSTANCE.getChangeOrderCount_Type();

		/**
		 * The meta object literal for the '<em><b>Broken Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_COUNT__BROKEN_LINES = eINSTANCE.getChangeOrderCount_BrokenLines();

		/**
		 * The meta object literal for the '<em><b>Fixed Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_COUNT__FIXED_LINES = eINSTANCE.getChangeOrderCount_FixedLines();

		/**
		 * The meta object literal for the '<em><b>Repair Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ORDER_COUNT__REPAIR_EFFORT = eINSTANCE.getChangeOrderCount_RepairEffort();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.TotalChangeOrdersImpl <em>Total Change Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.TotalChangeOrdersImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getTotalChangeOrders()
		 * @generated
		 */
		EClass TOTAL_CHANGE_ORDERS = eINSTANCE.getTotalChangeOrders();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.CriticalDefectChangeOrdersImpl <em>Critical Defect Change Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.CriticalDefectChangeOrdersImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getCriticalDefectChangeOrders()
		 * @generated
		 */
		EClass CRITICAL_DEFECT_CHANGE_ORDERS = eINSTANCE.getCriticalDefectChangeOrders();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.NormalDefectChangeOrdersImpl <em>Normal Defect Change Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.NormalDefectChangeOrdersImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getNormalDefectChangeOrders()
		 * @generated
		 */
		EClass NORMAL_DEFECT_CHANGE_ORDERS = eINSTANCE.getNormalDefectChangeOrders();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.ImprovementChangeOrdersImpl <em>Improvement Change Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.ImprovementChangeOrdersImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getImprovementChangeOrders()
		 * @generated
		 */
		EClass IMPROVEMENT_CHANGE_ORDERS = eINSTANCE.getImprovementChangeOrders();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.NewFeatureChangeOrdersImpl <em>New Feature Change Orders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.NewFeatureChangeOrdersImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getNewFeatureChangeOrders()
		 * @generated
		 */
		EClass NEW_FEATURE_CHANGE_ORDERS = eINSTANCE.getNewFeatureChangeOrders();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl <em>Artifact Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.ArtifactIdentifierImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getArtifactIdentifier()
		 * @generated
		 */
		EClass ARTIFACT_IDENTIFIER = eINSTANCE.getArtifactIdentifier();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_IDENTIFIER__RESOURCE_NAME = eINSTANCE.getArtifactIdentifier_ResourceName();

		/**
		 * The meta object literal for the '<em><b>Baselined Line Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT = eINSTANCE.getArtifactIdentifier_BaselinedLineCount();

		/**
		 * The meta object literal for the '<em><b>Current Line Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT = eINSTANCE.getArtifactIdentifier_CurrentLineCount();

		/**
		 * The meta object literal for the '<em><b>Critical Defect Change Orders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS = eINSTANCE.getArtifactIdentifier_CriticalDefectChangeOrders();

		/**
		 * The meta object literal for the '<em><b>Normal Defect Change Orders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS = eINSTANCE.getArtifactIdentifier_NormalDefectChangeOrders();

		/**
		 * The meta object literal for the '<em><b>Improvement Change Orders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS = eINSTANCE.getArtifactIdentifier_ImprovementChangeOrders();

		/**
		 * The meta object literal for the '<em><b>New Feature Change Orders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS = eINSTANCE.getArtifactIdentifier_NewFeatureChangeOrders();

		/**
		 * The meta object literal for the '<em><b>Total Change Orders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS = eINSTANCE.getArtifactIdentifier_TotalChangeOrders();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.ArtifactCommitImpl <em>Artifact Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.ArtifactCommitImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getArtifactCommit()
		 * @generated
		 */
		EClass ARTIFACT_COMMIT = eINSTANCE.getArtifactCommit();

		/**
		 * The meta object literal for the '<em><b>Artifact Identifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS = eINSTANCE.getArtifactCommit_ArtifactIdentifiers();

		/**
		 * The meta object literal for the '<em><b>Commit Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_COMMIT__COMMIT_IDENTIFIER = eINSTANCE.getArtifactCommit_CommitIdentifier();

		/**
		 * The meta object literal for the '<em><b>Usage Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_COMMIT__USAGE_TIME = eINSTANCE.getArtifactCommit_UsageTime();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.impl.CommitHistoryImpl <em>Commit History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.impl.CommitHistoryImpl
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getCommitHistory()
		 * @generated
		 */
		EClass COMMIT_HISTORY = eINSTANCE.getCommitHistory();

		/**
		 * The meta object literal for the '<em><b>Commit Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT_HISTORY__COMMIT_RECORD = eINSTANCE.getCommitHistory_CommitRecord();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.sco.ChangeOrderType <em>Change Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.sco.ChangeOrderType
		 * @see net.certware.measurement.sco.impl.ScoPackageImpl#getChangeOrderType()
		 * @generated
		 */
		EEnum CHANGE_ORDER_TYPE = eINSTANCE.getChangeOrderType();

	}

} //ScoPackage
