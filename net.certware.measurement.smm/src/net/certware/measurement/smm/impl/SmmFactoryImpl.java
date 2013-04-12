/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import java.sql.Timestamp;

import java.util.Date;

import net.certware.measurement.smm.*;

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
public class SmmFactoryImpl extends EFactoryImpl implements SmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmmFactory init() {
		try {
			SmmFactory theSmmFactory = (SmmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/smm"); //$NON-NLS-1$ 
			if (theSmmFactory != null) {
				return theSmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmFactoryImpl() {
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
			case SmmPackage.SMM_MODEL: return createSmmModel();
			case SmmPackage.CATEGORY_RELATIONSHIP: return createCategoryRelationship();
			case SmmPackage.CATEGORY: return createCategory();
			case SmmPackage.OBSERVATION: return createObservation();
			case SmmPackage.MEASURE_RELATIONSHIP: return createMeasureRelationship();
			case SmmPackage.DIMENSIONAL_MEASURE: return createDimensionalMeasure();
			case SmmPackage.RANKING: return createRanking();
			case SmmPackage.RANKING_INTERVAL: return createRankingInterval();
			case SmmPackage.CHARACTERISTIC: return createCharacteristic();
			case SmmPackage.SCOPE: return createScope();
			case SmmPackage.BINARY_MEASURE: return createBinaryMeasure();
			case SmmPackage.DIRECT_MEASURE: return createDirectMeasure();
			case SmmPackage.COLLECTIVE_MEASURE: return createCollectiveMeasure();
			case SmmPackage.NAMED_MEASURE: return createNamedMeasure();
			case SmmPackage.RESCALED_MEASURE: return createRescaledMeasure();
			case SmmPackage.RATIO_MEASURE: return createRatioMeasure();
			case SmmPackage.COUNTING: return createCounting();
			case SmmPackage.GRADE: return createGrade();
			case SmmPackage.DIRECT_MEASUREMENT: return createDirectMeasurement();
			case SmmPackage.COUNT: return createCount();
			case SmmPackage.COLLECTIVE_MEASUREMENT: return createCollectiveMeasurement();
			case SmmPackage.AGGREGATED_MEASUREMENT: return createAggregatedMeasurement();
			case SmmPackage.NAMED_MEASUREMENT: return createNamedMeasurement();
			case SmmPackage.RE_SCALED_MEASUREMENT: return createReScaledMeasurement();
			case SmmPackage.ATTRIBUTE: return createAttribute();
			case SmmPackage.ANNOTATION: return createAnnotation();
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
			case SmmPackage.ACCUMULATOR:
				return createAccumulatorFromString(eDataType, initialValue);
			case SmmPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case SmmPackage.TIMESTAMP:
				return createTimestampFromString(eDataType, initialValue);
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
			case SmmPackage.ACCUMULATOR:
				return convertAccumulatorToString(eDataType, instanceValue);
			case SmmPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case SmmPackage.TIMESTAMP:
				return convertTimestampToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmModel createSmmModel() {
		SmmModelImpl smmModel = new SmmModelImpl();
		return smmModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryRelationship createCategoryRelationship() {
		CategoryRelationshipImpl categoryRelationship = new CategoryRelationshipImpl();
		return categoryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureRelationship createMeasureRelationship() {
		MeasureRelationshipImpl measureRelationship = new MeasureRelationshipImpl();
		return measureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasure createDimensionalMeasure() {
		DimensionalMeasureImpl dimensionalMeasure = new DimensionalMeasureImpl();
		return dimensionalMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ranking createRanking() {
		RankingImpl ranking = new RankingImpl();
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingInterval createRankingInterval() {
		RankingIntervalImpl rankingInterval = new RankingIntervalImpl();
		return rankingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic createCharacteristic() {
		CharacteristicImpl characteristic = new CharacteristicImpl();
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryMeasure createBinaryMeasure() {
		BinaryMeasureImpl binaryMeasure = new BinaryMeasureImpl();
		return binaryMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectMeasure createDirectMeasure() {
		DirectMeasureImpl directMeasure = new DirectMeasureImpl();
		return directMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasure createCollectiveMeasure() {
		CollectiveMeasureImpl collectiveMeasure = new CollectiveMeasureImpl();
		return collectiveMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMeasure createNamedMeasure() {
		NamedMeasureImpl namedMeasure = new NamedMeasureImpl();
		return namedMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaledMeasure createRescaledMeasure() {
		RescaledMeasureImpl rescaledMeasure = new RescaledMeasureImpl();
		return rescaledMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RatioMeasure createRatioMeasure() {
		RatioMeasureImpl ratioMeasure = new RatioMeasureImpl();
		return ratioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counting createCounting() {
		CountingImpl counting = new CountingImpl();
		return counting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectMeasurement createDirectMeasurement() {
		DirectMeasurementImpl directMeasurement = new DirectMeasurementImpl();
		return directMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasurement createCollectiveMeasurement() {
		CollectiveMeasurementImpl collectiveMeasurement = new CollectiveMeasurementImpl();
		return collectiveMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedMeasurement createAggregatedMeasurement() {
		AggregatedMeasurementImpl aggregatedMeasurement = new AggregatedMeasurementImpl();
		return aggregatedMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMeasurement createNamedMeasurement() {
		NamedMeasurementImpl namedMeasurement = new NamedMeasurementImpl();
		return namedMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReScaledMeasurement createReScaledMeasurement() {
		ReScaledMeasurementImpl reScaledMeasurement = new ReScaledMeasurementImpl();
		return reScaledMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator createAccumulatorFromString(EDataType eDataType, String initialValue) {
		Accumulator result = Accumulator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccumulatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp createTimestampFromString(EDataType eDataType, String initialValue) {
		return (Timestamp)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmPackage getSmmPackage() {
		return (SmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmmPackage getPackage() {
		return SmmPackage.eINSTANCE;
	}

} //SmmFactoryImpl
