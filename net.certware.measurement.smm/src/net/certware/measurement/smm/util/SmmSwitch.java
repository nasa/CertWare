/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.util;

import java.util.List;

import net.certware.measurement.smm.*;

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
 * @see net.certware.measurement.smm.SmmPackage
 * @generated
 */
public class SmmSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmSwitch() {
		if (modelPackage == null) {
			modelPackage = SmmPackage.eINSTANCE;
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
			case SmmPackage.SMM_ELEMENT: {
				SmmElement smmElement = (SmmElement)theEObject;
				T result = caseSmmElement(smmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.SMM_MODEL: {
				SmmModel smmModel = (SmmModel)theEObject;
				T result = caseSmmModel(smmModel);
				if (result == null) result = caseSmmElement(smmModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.SMM_RELATIONSHIP: {
				SmmRelationship smmRelationship = (SmmRelationship)theEObject;
				T result = caseSmmRelationship(smmRelationship);
				if (result == null) result = caseSmmElement(smmRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.CATEGORY_RELATIONSHIP: {
				CategoryRelationship categoryRelationship = (CategoryRelationship)theEObject;
				T result = caseCategoryRelationship(categoryRelationship);
				if (result == null) result = caseSmmRelationship(categoryRelationship);
				if (result == null) result = caseSmmElement(categoryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseSmmElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = caseSmmElement(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = caseSmmElement(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = caseSmmElement(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.MEASURE_RELATIONSHIP: {
				MeasureRelationship measureRelationship = (MeasureRelationship)theEObject;
				T result = caseMeasureRelationship(measureRelationship);
				if (result == null) result = caseSmmRelationship(measureRelationship);
				if (result == null) result = caseSmmElement(measureRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.DIMENSIONAL_MEASURE: {
				DimensionalMeasure dimensionalMeasure = (DimensionalMeasure)theEObject;
				T result = caseDimensionalMeasure(dimensionalMeasure);
				if (result == null) result = caseMeasure(dimensionalMeasure);
				if (result == null) result = caseSmmElement(dimensionalMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.RANKING: {
				Ranking ranking = (Ranking)theEObject;
				T result = caseRanking(ranking);
				if (result == null) result = caseMeasure(ranking);
				if (result == null) result = caseSmmElement(ranking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.RANKING_INTERVAL: {
				RankingInterval rankingInterval = (RankingInterval)theEObject;
				T result = caseRankingInterval(rankingInterval);
				if (result == null) result = caseSmmElement(rankingInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.CHARACTERISTIC: {
				Characteristic characteristic = (Characteristic)theEObject;
				T result = caseCharacteristic(characteristic);
				if (result == null) result = caseSmmElement(characteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = caseSmmElement(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.BINARY_MEASURE: {
				BinaryMeasure binaryMeasure = (BinaryMeasure)theEObject;
				T result = caseBinaryMeasure(binaryMeasure);
				if (result == null) result = caseDimensionalMeasure(binaryMeasure);
				if (result == null) result = caseMeasure(binaryMeasure);
				if (result == null) result = caseSmmElement(binaryMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.DIRECT_MEASURE: {
				DirectMeasure directMeasure = (DirectMeasure)theEObject;
				T result = caseDirectMeasure(directMeasure);
				if (result == null) result = caseDimensionalMeasure(directMeasure);
				if (result == null) result = caseMeasure(directMeasure);
				if (result == null) result = caseSmmElement(directMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.COLLECTIVE_MEASURE: {
				CollectiveMeasure collectiveMeasure = (CollectiveMeasure)theEObject;
				T result = caseCollectiveMeasure(collectiveMeasure);
				if (result == null) result = caseDimensionalMeasure(collectiveMeasure);
				if (result == null) result = caseMeasure(collectiveMeasure);
				if (result == null) result = caseSmmElement(collectiveMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.NAMED_MEASURE: {
				NamedMeasure namedMeasure = (NamedMeasure)theEObject;
				T result = caseNamedMeasure(namedMeasure);
				if (result == null) result = caseDimensionalMeasure(namedMeasure);
				if (result == null) result = caseMeasure(namedMeasure);
				if (result == null) result = caseSmmElement(namedMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.RESCALED_MEASURE: {
				RescaledMeasure rescaledMeasure = (RescaledMeasure)theEObject;
				T result = caseRescaledMeasure(rescaledMeasure);
				if (result == null) result = caseDimensionalMeasure(rescaledMeasure);
				if (result == null) result = caseMeasure(rescaledMeasure);
				if (result == null) result = caseSmmElement(rescaledMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.RATIO_MEASURE: {
				RatioMeasure ratioMeasure = (RatioMeasure)theEObject;
				T result = caseRatioMeasure(ratioMeasure);
				if (result == null) result = caseBinaryMeasure(ratioMeasure);
				if (result == null) result = caseDimensionalMeasure(ratioMeasure);
				if (result == null) result = caseMeasure(ratioMeasure);
				if (result == null) result = caseSmmElement(ratioMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.COUNTING: {
				Counting counting = (Counting)theEObject;
				T result = caseCounting(counting);
				if (result == null) result = caseDirectMeasure(counting);
				if (result == null) result = caseDimensionalMeasure(counting);
				if (result == null) result = caseMeasure(counting);
				if (result == null) result = caseSmmElement(counting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.DIMENSIONAL_MEASUREMENT: {
				DimensionalMeasurement dimensionalMeasurement = (DimensionalMeasurement)theEObject;
				T result = caseDimensionalMeasurement(dimensionalMeasurement);
				if (result == null) result = caseMeasurement(dimensionalMeasurement);
				if (result == null) result = caseSmmElement(dimensionalMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.GRADE: {
				Grade grade = (Grade)theEObject;
				T result = caseGrade(grade);
				if (result == null) result = caseMeasurement(grade);
				if (result == null) result = caseSmmElement(grade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.MEASUREMENT_RELATIONSHIP: {
				MeasurementRelationship measurementRelationship = (MeasurementRelationship)theEObject;
				T result = caseMeasurementRelationship(measurementRelationship);
				if (result == null) result = caseSmmRelationship(measurementRelationship);
				if (result == null) result = caseSmmElement(measurementRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.DIRECT_MEASUREMENT: {
				DirectMeasurement directMeasurement = (DirectMeasurement)theEObject;
				T result = caseDirectMeasurement(directMeasurement);
				if (result == null) result = caseDimensionalMeasurement(directMeasurement);
				if (result == null) result = caseMeasurement(directMeasurement);
				if (result == null) result = caseSmmElement(directMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = caseDirectMeasurement(count);
				if (result == null) result = caseDimensionalMeasurement(count);
				if (result == null) result = caseMeasurement(count);
				if (result == null) result = caseSmmElement(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.COLLECTIVE_MEASUREMENT: {
				CollectiveMeasurement collectiveMeasurement = (CollectiveMeasurement)theEObject;
				T result = caseCollectiveMeasurement(collectiveMeasurement);
				if (result == null) result = caseDimensionalMeasurement(collectiveMeasurement);
				if (result == null) result = caseMeasurement(collectiveMeasurement);
				if (result == null) result = caseSmmElement(collectiveMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.AGGREGATED_MEASUREMENT: {
				AggregatedMeasurement aggregatedMeasurement = (AggregatedMeasurement)theEObject;
				T result = caseAggregatedMeasurement(aggregatedMeasurement);
				if (result == null) result = caseDimensionalMeasurement(aggregatedMeasurement);
				if (result == null) result = caseMeasurement(aggregatedMeasurement);
				if (result == null) result = caseSmmElement(aggregatedMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.NAMED_MEASUREMENT: {
				NamedMeasurement namedMeasurement = (NamedMeasurement)theEObject;
				T result = caseNamedMeasurement(namedMeasurement);
				if (result == null) result = caseDimensionalMeasurement(namedMeasurement);
				if (result == null) result = caseMeasurement(namedMeasurement);
				if (result == null) result = caseSmmElement(namedMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.RE_SCALED_MEASUREMENT: {
				ReScaledMeasurement reScaledMeasurement = (ReScaledMeasurement)theEObject;
				T result = caseReScaledMeasurement(reScaledMeasurement);
				if (result == null) result = caseDimensionalMeasurement(reScaledMeasurement);
				if (result == null) result = caseMeasurement(reScaledMeasurement);
				if (result == null) result = caseSmmElement(reScaledMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseSmmElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SmmPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseSmmElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmmElement(SmmElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmmModel(SmmModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmmRelationship(SmmRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryRelationship(CategoryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureRelationship(MeasureRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensional Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionalMeasure(DimensionalMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRanking(Ranking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranking Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranking Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRankingInterval(RankingInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristic(Characteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryMeasure(BinaryMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectMeasure(DirectMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collective Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collective Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectiveMeasure(CollectiveMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedMeasure(NamedMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rescaled Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rescaled Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRescaledMeasure(RescaledMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatioMeasure(RatioMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounting(Counting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionalMeasurement(DimensionalMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrade(Grade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementRelationship(MeasurementRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectMeasurement(DirectMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collective Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collective Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectiveMeasurement(CollectiveMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedMeasurement(AggregatedMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedMeasurement(NamedMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Re Scaled Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Re Scaled Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReScaledMeasurement(ReScaledMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
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

} //SmmSwitch
