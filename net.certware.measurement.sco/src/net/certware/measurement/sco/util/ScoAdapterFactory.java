/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.util;

import net.certware.measurement.sco.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.measurement.sco.ScoPackage
 * @generated
 */
public class ScoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScoSwitch<Adapter> modelSwitch =
		new ScoSwitch<Adapter>() {
			@Override
			public Adapter caseChangeOrderCount(ChangeOrderCount object) {
				return createChangeOrderCountAdapter();
			}
			@Override
			public Adapter caseTotalChangeOrders(TotalChangeOrders object) {
				return createTotalChangeOrdersAdapter();
			}
			@Override
			public Adapter caseCriticalDefectChangeOrders(CriticalDefectChangeOrders object) {
				return createCriticalDefectChangeOrdersAdapter();
			}
			@Override
			public Adapter caseNormalDefectChangeOrders(NormalDefectChangeOrders object) {
				return createNormalDefectChangeOrdersAdapter();
			}
			@Override
			public Adapter caseImprovementChangeOrders(ImprovementChangeOrders object) {
				return createImprovementChangeOrdersAdapter();
			}
			@Override
			public Adapter caseNewFeatureChangeOrders(NewFeatureChangeOrders object) {
				return createNewFeatureChangeOrdersAdapter();
			}
			@Override
			public Adapter caseArtifactIdentifier(ArtifactIdentifier object) {
				return createArtifactIdentifierAdapter();
			}
			@Override
			public Adapter caseArtifactCommit(ArtifactCommit object) {
				return createArtifactCommitAdapter();
			}
			@Override
			public Adapter caseCommitHistory(CommitHistory object) {
				return createCommitHistoryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.ChangeOrderCount <em>Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.ChangeOrderCount
	 * @generated
	 */
	public Adapter createChangeOrderCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.TotalChangeOrders <em>Total Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.TotalChangeOrders
	 * @generated
	 */
	public Adapter createTotalChangeOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.CriticalDefectChangeOrders <em>Critical Defect Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.CriticalDefectChangeOrders
	 * @generated
	 */
	public Adapter createCriticalDefectChangeOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.NormalDefectChangeOrders <em>Normal Defect Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.NormalDefectChangeOrders
	 * @generated
	 */
	public Adapter createNormalDefectChangeOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.ImprovementChangeOrders <em>Improvement Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.ImprovementChangeOrders
	 * @generated
	 */
	public Adapter createImprovementChangeOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.NewFeatureChangeOrders <em>New Feature Change Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.NewFeatureChangeOrders
	 * @generated
	 */
	public Adapter createNewFeatureChangeOrdersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.ArtifactIdentifier <em>Artifact Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.ArtifactIdentifier
	 * @generated
	 */
	public Adapter createArtifactIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.ArtifactCommit <em>Artifact Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.ArtifactCommit
	 * @generated
	 */
	public Adapter createArtifactCommitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.sco.CommitHistory <em>Commit History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.sco.CommitHistory
	 * @generated
	 */
	public Adapter createCommitHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScoAdapterFactory
