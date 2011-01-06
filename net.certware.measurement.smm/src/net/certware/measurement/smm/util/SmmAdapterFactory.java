/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.util;

import net.certware.measurement.smm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.measurement.smm.SmmPackage
 * @generated
 */
public class SmmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SmmPackage.eINSTANCE;
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
	protected SmmSwitch<Adapter> modelSwitch =
		new SmmSwitch<Adapter>() {
			@Override
			public Adapter caseSmmElement(SmmElement object) {
				return createSmmElementAdapter();
			}
			@Override
			public Adapter caseSmmModel(SmmModel object) {
				return createSmmModelAdapter();
			}
			@Override
			public Adapter caseSmmRelationship(SmmRelationship object) {
				return createSmmRelationshipAdapter();
			}
			@Override
			public Adapter caseCategoryRelationship(CategoryRelationship object) {
				return createCategoryRelationshipAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseMeasureRelationship(MeasureRelationship object) {
				return createMeasureRelationshipAdapter();
			}
			@Override
			public Adapter caseDimensionalMeasure(DimensionalMeasure object) {
				return createDimensionalMeasureAdapter();
			}
			@Override
			public Adapter caseRanking(Ranking object) {
				return createRankingAdapter();
			}
			@Override
			public Adapter caseRankingInterval(RankingInterval object) {
				return createRankingIntervalAdapter();
			}
			@Override
			public Adapter caseCharacteristic(Characteristic object) {
				return createCharacteristicAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseBinaryMeasure(BinaryMeasure object) {
				return createBinaryMeasureAdapter();
			}
			@Override
			public Adapter caseDirectMeasure(DirectMeasure object) {
				return createDirectMeasureAdapter();
			}
			@Override
			public Adapter caseCollectiveMeasure(CollectiveMeasure object) {
				return createCollectiveMeasureAdapter();
			}
			@Override
			public Adapter caseNamedMeasure(NamedMeasure object) {
				return createNamedMeasureAdapter();
			}
			@Override
			public Adapter caseRescaledMeasure(RescaledMeasure object) {
				return createRescaledMeasureAdapter();
			}
			@Override
			public Adapter caseRatioMeasure(RatioMeasure object) {
				return createRatioMeasureAdapter();
			}
			@Override
			public Adapter caseCounting(Counting object) {
				return createCountingAdapter();
			}
			@Override
			public Adapter caseDimensionalMeasurement(DimensionalMeasurement object) {
				return createDimensionalMeasurementAdapter();
			}
			@Override
			public Adapter caseGrade(Grade object) {
				return createGradeAdapter();
			}
			@Override
			public Adapter caseMeasurementRelationship(MeasurementRelationship object) {
				return createMeasurementRelationshipAdapter();
			}
			@Override
			public Adapter caseDirectMeasurement(DirectMeasurement object) {
				return createDirectMeasurementAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseCollectiveMeasurement(CollectiveMeasurement object) {
				return createCollectiveMeasurementAdapter();
			}
			@Override
			public Adapter caseAggregatedMeasurement(AggregatedMeasurement object) {
				return createAggregatedMeasurementAdapter();
			}
			@Override
			public Adapter caseNamedMeasurement(NamedMeasurement object) {
				return createNamedMeasurementAdapter();
			}
			@Override
			public Adapter caseReScaledMeasurement(ReScaledMeasurement object) {
				return createReScaledMeasurementAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.SmmElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.SmmElement
	 * @generated
	 */
	public Adapter createSmmElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.SmmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.SmmModel
	 * @generated
	 */
	public Adapter createSmmModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.SmmRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.SmmRelationship
	 * @generated
	 */
	public Adapter createSmmRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.CategoryRelationship <em>Category Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.CategoryRelationship
	 * @generated
	 */
	public Adapter createCategoryRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.MeasureRelationship <em>Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.MeasureRelationship
	 * @generated
	 */
	public Adapter createMeasureRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.DimensionalMeasure <em>Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.DimensionalMeasure
	 * @generated
	 */
	public Adapter createDimensionalMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Ranking
	 * @generated
	 */
	public Adapter createRankingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.RankingInterval <em>Ranking Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.RankingInterval
	 * @generated
	 */
	public Adapter createRankingIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.BinaryMeasure <em>Binary Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.BinaryMeasure
	 * @generated
	 */
	public Adapter createBinaryMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.DirectMeasure <em>Direct Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.DirectMeasure
	 * @generated
	 */
	public Adapter createDirectMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.CollectiveMeasure <em>Collective Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.CollectiveMeasure
	 * @generated
	 */
	public Adapter createCollectiveMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.NamedMeasure <em>Named Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.NamedMeasure
	 * @generated
	 */
	public Adapter createNamedMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.RescaledMeasure <em>Rescaled Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.RescaledMeasure
	 * @generated
	 */
	public Adapter createRescaledMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.RatioMeasure <em>Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.RatioMeasure
	 * @generated
	 */
	public Adapter createRatioMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Counting <em>Counting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Counting
	 * @generated
	 */
	public Adapter createCountingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.DimensionalMeasurement
	 * @generated
	 */
	public Adapter createDimensionalMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Grade
	 * @generated
	 */
	public Adapter createGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.MeasurementRelationship <em>Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.MeasurementRelationship
	 * @generated
	 */
	public Adapter createMeasurementRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.DirectMeasurement <em>Direct Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.DirectMeasurement
	 * @generated
	 */
	public Adapter createDirectMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.CollectiveMeasurement <em>Collective Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.CollectiveMeasurement
	 * @generated
	 */
	public Adapter createCollectiveMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.AggregatedMeasurement <em>Aggregated Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.AggregatedMeasurement
	 * @generated
	 */
	public Adapter createAggregatedMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.NamedMeasurement <em>Named Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.NamedMeasurement
	 * @generated
	 */
	public Adapter createNamedMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.ReScaledMeasurement <em>Re Scaled Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.ReScaledMeasurement
	 * @generated
	 */
	public Adapter createReScaledMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
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

} //SmmAdapterFactory
