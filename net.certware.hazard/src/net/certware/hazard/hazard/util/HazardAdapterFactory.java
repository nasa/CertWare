/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard.util;

import net.certware.hazard.hazard.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.hazard.hazard.HazardPackage
 * @generated
 */
public class HazardAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HazardPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HazardPackage.eINSTANCE;
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
	protected HazardSwitch<Adapter> modelSwitch =
		new HazardSwitch<Adapter>() {
			@Override
			public Adapter caseComparativeRiskAssessmentForm(ComparativeRiskAssessmentForm object) {
				return createComparativeRiskAssessmentFormAdapter();
			}
			@Override
			public Adapter caseHazardList(HazardList object) {
				return createHazardListAdapter();
			}
			@Override
			public Adapter caseHazard(Hazard object) {
				return createHazardAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseRiskAssessment(RiskAssessment object) {
				return createRiskAssessmentAdapter();
			}
			@Override
			public Adapter caseRiskAssessmentCode(RiskAssessmentCode object) {
				return createRiskAssessmentCodeAdapter();
			}
			@Override
			public Adapter caseHazardClassificationRationale(HazardClassificationRationale object) {
				return createHazardClassificationRationaleAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm <em>Comparative Risk Assessment Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.hazard.hazard.ComparativeRiskAssessmentForm
	 * @generated
	 */
	public Adapter createComparativeRiskAssessmentFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.hazard.hazard.HazardList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.hazard.hazard.HazardList
	 * @generated
	 */
	public Adapter createHazardListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.hazard.hazard.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.hazard.hazard.Hazard
	 * @generated
	 */
	public Adapter createHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.hazard.hazard.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.hazard.hazard.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.hazard.hazard.RiskAssessment <em>Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.hazard.hazard.RiskAssessment
	 * @generated
	 */
	public Adapter createRiskAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.hazard.hazard.RiskAssessmentCode <em>Risk Assessment Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.hazard.hazard.RiskAssessmentCode
	 * @generated
	 */
	public Adapter createRiskAssessmentCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.hazard.hazard.HazardClassificationRationale <em>Classification Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.hazard.hazard.HazardClassificationRationale
	 * @generated
	 */
	public Adapter createHazardClassificationRationaleAdapter() {
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

} //HazardAdapterFactory
