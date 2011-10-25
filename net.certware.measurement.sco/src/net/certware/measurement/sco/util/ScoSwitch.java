/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.util;

import java.util.List;

import net.certware.measurement.sco.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.measurement.sco.ScoPackage
 * @generated
 */
public class ScoSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoSwitch() {
		if (modelPackage == null) {
			modelPackage = ScoPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ScoPackage.CHANGE_ORDER_COUNT: {
				ChangeOrderCount changeOrderCount = (ChangeOrderCount)theEObject;
				T result = caseChangeOrderCount(changeOrderCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.TOTAL_CHANGE_ORDERS: {
				TotalChangeOrders totalChangeOrders = (TotalChangeOrders)theEObject;
				T result = caseTotalChangeOrders(totalChangeOrders);
				if (result == null) result = caseChangeOrderCount(totalChangeOrders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.CRITICAL_DEFECT_CHANGE_ORDERS: {
				CriticalDefectChangeOrders criticalDefectChangeOrders = (CriticalDefectChangeOrders)theEObject;
				T result = caseCriticalDefectChangeOrders(criticalDefectChangeOrders);
				if (result == null) result = caseChangeOrderCount(criticalDefectChangeOrders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.NORMAL_DEFECT_CHANGE_ORDERS: {
				NormalDefectChangeOrders normalDefectChangeOrders = (NormalDefectChangeOrders)theEObject;
				T result = caseNormalDefectChangeOrders(normalDefectChangeOrders);
				if (result == null) result = caseChangeOrderCount(normalDefectChangeOrders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.IMPROVEMENT_CHANGE_ORDERS: {
				ImprovementChangeOrders improvementChangeOrders = (ImprovementChangeOrders)theEObject;
				T result = caseImprovementChangeOrders(improvementChangeOrders);
				if (result == null) result = caseChangeOrderCount(improvementChangeOrders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.NEW_FEATURE_CHANGE_ORDERS: {
				NewFeatureChangeOrders newFeatureChangeOrders = (NewFeatureChangeOrders)theEObject;
				T result = caseNewFeatureChangeOrders(newFeatureChangeOrders);
				if (result == null) result = caseChangeOrderCount(newFeatureChangeOrders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.ARTIFACT_IDENTIFIER: {
				ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier)theEObject;
				T result = caseArtifactIdentifier(artifactIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.ARTIFACT_COMMIT: {
				ArtifactCommit artifactCommit = (ArtifactCommit)theEObject;
				T result = caseArtifactCommit(artifactCommit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScoPackage.COMMIT_HISTORY: {
				CommitHistory commitHistory = (CommitHistory)theEObject;
				T result = caseCommitHistory(commitHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Order Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeOrderCount(ChangeOrderCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Change Orders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalChangeOrders(TotalChangeOrders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Critical Defect Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Critical Defect Change Orders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriticalDefectChangeOrders(CriticalDefectChangeOrders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Defect Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Defect Change Orders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalDefectChangeOrders(NormalDefectChangeOrders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Improvement Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Improvement Change Orders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImprovementChangeOrders(ImprovementChangeOrders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Feature Change Orders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Feature Change Orders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewFeatureChangeOrders(NewFeatureChangeOrders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactIdentifier(ArtifactIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Commit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Commit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactCommit(ArtifactCommit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commit History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commit History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitHistory(CommitHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ScoSwitch
