/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import net.certware.measurement.sco.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScoFactoryImpl extends EFactoryImpl implements ScoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScoFactory init() {
		try {
			ScoFactory theScoFactory = (ScoFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/sco"); //$NON-NLS-1$ 
			if (theScoFactory != null) {
				return theScoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ScoPackage.TOTAL_CHANGE_ORDERS: return createTotalChangeOrders();
			case ScoPackage.CRITICAL_DEFECT_CHANGE_ORDERS: return createCriticalDefectChangeOrders();
			case ScoPackage.NORMAL_DEFECT_CHANGE_ORDERS: return createNormalDefectChangeOrders();
			case ScoPackage.IMPROVEMENT_CHANGE_ORDERS: return createImprovementChangeOrders();
			case ScoPackage.NEW_FEATURE_CHANGE_ORDERS: return createNewFeatureChangeOrders();
			case ScoPackage.ARTIFACT_IDENTIFIER: return createArtifactIdentifier();
			case ScoPackage.ARTIFACT_COMMIT: return createArtifactCommit();
			case ScoPackage.COMMIT_HISTORY: return createCommitHistory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ScoPackage.CHANGE_ORDER_TYPE:
				return createChangeOrderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ScoPackage.CHANGE_ORDER_TYPE:
				return convertChangeOrderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalChangeOrders createTotalChangeOrders() {
		TotalChangeOrdersImpl totalChangeOrders = new TotalChangeOrdersImpl();
		return totalChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalDefectChangeOrders createCriticalDefectChangeOrders() {
		CriticalDefectChangeOrdersImpl criticalDefectChangeOrders = new CriticalDefectChangeOrdersImpl();
		return criticalDefectChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDefectChangeOrders createNormalDefectChangeOrders() {
		NormalDefectChangeOrdersImpl normalDefectChangeOrders = new NormalDefectChangeOrdersImpl();
		return normalDefectChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImprovementChangeOrders createImprovementChangeOrders() {
		ImprovementChangeOrdersImpl improvementChangeOrders = new ImprovementChangeOrdersImpl();
		return improvementChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFeatureChangeOrders createNewFeatureChangeOrders() {
		NewFeatureChangeOrdersImpl newFeatureChangeOrders = new NewFeatureChangeOrdersImpl();
		return newFeatureChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactIdentifier createArtifactIdentifier() {
		ArtifactIdentifierImpl artifactIdentifier = new ArtifactIdentifierImpl();
		return artifactIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactCommit createArtifactCommit() {
		ArtifactCommitImpl artifactCommit = new ArtifactCommitImpl();
		return artifactCommit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitHistory createCommitHistory() {
		CommitHistoryImpl commitHistory = new CommitHistoryImpl();
		return commitHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOrderType createChangeOrderType(String literal) {
		ChangeOrderType result = ChangeOrderType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + ScoPackage.Literals.CHANGE_ORDER_TYPE.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOrderType createChangeOrderTypeFromString(EDataType eDataType, String initialValue) {
		return createChangeOrderType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeOrderType(ChangeOrderType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoPackage getScoPackage() {
		return (ScoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScoPackage getPackage() {
		return ScoPackage.eINSTANCE;
	}

} //ScoFactoryImpl
