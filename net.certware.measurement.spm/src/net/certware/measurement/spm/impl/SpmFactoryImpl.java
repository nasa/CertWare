/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.impl;

import net.certware.measurement.smm.Annotation;
import net.certware.measurement.smm.Characteristic;
import net.certware.measurement.smm.DimensionalMeasure;
import net.certware.measurement.smm.Scope;
import net.certware.measurement.smm.SmmElement;
import net.certware.measurement.smm.SmmFactory;
import net.certware.measurement.smm.SmmModel;
import net.certware.measurement.spm.AdaptabilityRatioMeasure;
import net.certware.measurement.spm.AdaptabilityTrend;
import net.certware.measurement.spm.AdditiveMeasure;
import net.certware.measurement.spm.BaselineCaseSizeMeasure;
import net.certware.measurement.spm.BrokenCaseSizeMeasure;
import net.certware.measurement.spm.CaseDimensionalMeasure;
import net.certware.measurement.spm.CaseScope;
import net.certware.measurement.spm.ChangeOrderDimensionalMeasure;
import net.certware.measurement.spm.ChangeScope;
import net.certware.measurement.spm.CommitRelationship;
import net.certware.measurement.spm.CriticalAndNormalChangeOrderCount;
import net.certware.measurement.spm.CriticalDefectChangeOrderCount;
import net.certware.measurement.spm.DevelopmentEffortMeasure;
import net.certware.measurement.spm.EndProductQuality;
import net.certware.measurement.spm.EndProductQualityCategory;
import net.certware.measurement.spm.FixedCaseSizeMeasure;
import net.certware.measurement.spm.ImprovementChangeOrderCount;
import net.certware.measurement.spm.InProgressIndicator;
import net.certware.measurement.spm.InProgressQualityCategory;
import net.certware.measurement.spm.Maintainability;
import net.certware.measurement.spm.MaintainabilityMeasure;
import net.certware.measurement.spm.MaturityRatioMeasure;
import net.certware.measurement.spm.MaturityTrend;
import net.certware.measurement.spm.ModularityMeasure;
import net.certware.measurement.spm.ModularityTrend;
import net.certware.measurement.spm.NewFeatureChangeOrderCount;
import net.certware.measurement.spm.NormalDefectChangeOrderCount;
import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.ProjectModel;
import net.certware.measurement.spm.ProjectScope;
import net.certware.measurement.spm.ProjectSize;
import net.certware.measurement.spm.RepairEffortMeasure;
import net.certware.measurement.spm.ReworkBacklogMeasure;
import net.certware.measurement.spm.ReworkRatioMeasure;
import net.certware.measurement.spm.ReworkStabilityMeasure;
import net.certware.measurement.spm.ScrapRatioMeasure;
import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.SpmPackage;
import net.certware.measurement.spm.TimeDimensionalMeasure;
import net.certware.measurement.spm.TotalCaseSizeMeasure;
import net.certware.measurement.spm.TotalChangeOrderCount;
import net.certware.measurement.spm.TrendMeasure;
import net.certware.measurement.spm.UsageTimeMeasure;

import org.eclipse.emf.ecore.EClass;
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
public class SpmFactoryImpl extends EFactoryImpl implements SpmFactory {
	
	/** unit trend value */
	public static final String UNIT_TREND = "instance";
	/** dimensionless ratio value */ 
	public static final String UNIT_DIMENSIONLESS = "dimensionless";
	/** functor divide value */
	public static final String FUNCTOR_DIVIDE = "divide";
	/** functor add value */
	public static final String FUNCTOR_ADD = "add";
	/** functor subtract value */
	public static final String FUNCTOR_SUBTRACT = "subtract";
	/** library value, assigned for all CertWare elements */
	public static final String LIBRARY_CERTWARE = "CertWare Library";
	/** unit lines per change value */
	public static final String UNIT_LINES_PER_CHANGE = "lines per change";
	/** unit hours per change value */
	public static final String UNIT_HOURS_PER_CHANGE = "hours per change";
	/** unit count value */
	public static final String UNIT_COUNT = "count";
	/** unit count per hour value */
	public static final String UNIT_COUNT_PER_HOUR = "count per hour";
	/** unit hours value */
	public static final String UNIT_HOURS = "hours";
	

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpmFactory init() {
		try {
			SpmFactory theSpmFactory = (SpmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/spm"); //$NON-NLS-1$ 
			if (theSpmFactory != null) {
				return theSpmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmFactoryImpl() {
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
			case SpmPackage.PROJECT_MODEL: return createProjectModel();
			case SpmPackage.PROJECT_COMMIT: return createProjectCommit();
			case SpmPackage.COMMIT_RELATIONSHIP: return createCommitRelationship();
			case SpmPackage.END_PRODUCT_QUALITY_CATEGORY: return createEndProductQualityCategory();
			case SpmPackage.IN_PROGRESS_QUALITY_CATEGORY: return createInProgressQualityCategory();
			case SpmPackage.END_PRODUCT_QUALITY: return createEndProductQuality();
			case SpmPackage.MAINTAINABILITY: return createMaintainability();
			case SpmPackage.IN_PROGRESS_INDICATOR: return createInProgressIndicator();
			case SpmPackage.PROJECT_SIZE: return createProjectSize();
			case SpmPackage.CASE_DIMENSIONAL_MEASURE: return createCaseDimensionalMeasure();
			case SpmPackage.CHANGE_ORDER_DIMENSIONAL_MEASURE: return createChangeOrderDimensionalMeasure();
			case SpmPackage.TIME_DIMENSIONAL_MEASURE: return createTimeDimensionalMeasure();
			case SpmPackage.ADDITIVE_MEASURE: return createAdditiveMeasure();
			case SpmPackage.CASE_SCOPE: return createCaseScope();
			case SpmPackage.PROJECT_SCOPE: return createProjectScope();
			case SpmPackage.CHANGE_SCOPE: return createChangeScope();
			case SpmPackage.CRITICAL_DEFECT_CHANGE_ORDER_COUNT: return createCriticalDefectChangeOrderCount();
			case SpmPackage.NORMAL_DEFECT_CHANGE_ORDER_COUNT: return createNormalDefectChangeOrderCount();
			case SpmPackage.IMPROVEMENT_CHANGE_ORDER_COUNT: return createImprovementChangeOrderCount();
			case SpmPackage.NEW_FEATURE_CHANGE_ORDER_COUNT: return createNewFeatureChangeOrderCount();
			case SpmPackage.TREND_MEASURE: return createTrendMeasure();
			case SpmPackage.SCRAP_RATIO_MEASURE: return createScrapRatioMeasure();
			case SpmPackage.MODULARITY_MEASURE: return createModularityMeasure();
			case SpmPackage.REWORK_RATIO_MEASURE: return createReworkRatioMeasure();
			case SpmPackage.ADAPTABILITY_RATIO_MEASURE: return createAdaptabilityRatioMeasure();
			case SpmPackage.MATURITY_RATIO_MEASURE: return createMaturityRatioMeasure();
			case SpmPackage.MAINTAINABILITY_MEASURE: return createMaintainabilityMeasure();
			case SpmPackage.BROKEN_CASE_SIZE_MEASURE: return createBrokenCaseSizeMeasure();
			case SpmPackage.FIXED_CASE_SIZE_MEASURE: return createFixedCaseSizeMeasure();
			case SpmPackage.TOTAL_CASE_SIZE_MEASURE: return createTotalCaseSizeMeasure();
			case SpmPackage.BASELINE_CASE_SIZE_MEASURE: return createBaselineCaseSizeMeasure();
			case SpmPackage.USAGE_TIME_MEASURE: return createUsageTimeMeasure();
			case SpmPackage.REPAIR_EFFORT_MEASURE: return createRepairEffortMeasure();
			case SpmPackage.DEVELOPMENT_EFFORT_MEASURE: return createDevelopmentEffortMeasure();
			case SpmPackage.TOTAL_CHANGE_ORDER_COUNT: return createTotalChangeOrderCount();
			case SpmPackage.CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT: return createCriticalAndNormalChangeOrderCount();
			case SpmPackage.REWORK_STABILITY_MEASURE: return createReworkStabilityMeasure();
			case SpmPackage.REWORK_BACKLOG_MEASURE: return createReworkBacklogMeasure();
			case SpmPackage.MODULARITY_TREND: return createModularityTrend();
			case SpmPackage.ADAPTABILITY_TREND: return createAdaptabilityTrend();
			case SpmPackage.MATURITY_TREND: return createMaturityTrend();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectModel createProjectModel() {
		ProjectModelImpl projectModel = new ProjectModelImpl();
		return projectModel;
	}

	/**
	 * Create a project model.
	 * @param parent parent model, or null
	 * @return project model, populated for CertWare project metrics
	 */
	@SuppressWarnings("unused")
	public ProjectModel createProjectModel(SmmModel parent) {
		
		// create the project's model; parent is unused in this factory, can be null
		ProjectModel model = createProjectModel();
		model.setModel(parent);

		// create the measure categories
		EndProductQualityCategory endProductCategory = createEndProductQualityCategory(model);
		InProgressQualityCategory inProgressCategory = createInProgressQualityCategory(model);
		
		// create the scopes
		ProjectScope projectScope = createProjectScope(model);
		CaseScope caseScope = createCaseScope(model);
		ChangeScope changeScope = createChangeScope(model);
		
		// create the characteristics
		ProjectSize projectSize = createProjectSize(model,null);
		Maintainability maintainability = createMaintainability(model,null);
		InProgressIndicator inProgressIndicator = createInProgressIndicator(model,null);
		EndProductQuality endProductQuality = createEndProductQuality(model,null);

		// create base measures
		ChangeOrderDimensionalMeasure changeOrderDimensionalMeasure = createChangeOrderDimensionalMeasure(model,projectScope,projectSize);
		CaseDimensionalMeasure caseDimensionalMeasure = createCaseDimensionalMeasure(model,caseScope,projectSize);

		return model;
	}

	/**
	 * Finds an object of a given class in the model's model element list.
	 * @param model model to search using its model element list
	 * @param eclass class to find by instance match
	 * @return first element found by match, or null
	 */
	@SuppressWarnings("rawtypes")
	public SmmElement getModelElement(SmmModel model, Class eclass) {
		SmmElement rv = null;
		for ( SmmElement e : model.getModelElement() ) {
			if ( e.getClass().isInstance(eclass))
				return e;
		}
		return rv;
	}

	/**
	 * Creates an annotation and adds it to the model's model element list. 
	 * @param model containing model
	 * @param name annotation text
	 * @param owner annotation owner element
	 * @return annotation
	 */
	public Annotation createAnnotation(SmmModel model, String name, SmmElement owner) {
		Annotation annotation = SmmFactory.eINSTANCE.createAnnotation();
		annotation.setModel(model);
		annotation.setOwner(owner);
		annotation.setText(name);
		model.getModelElement().add(annotation);
		return annotation;
	}
	
	/**
	 * Adds a new commit model to the project model.
	 * Uses the given name as an annotation on the model for identification.
	 * Creates commit-specific statistics and measures, but does not add observations or measurements.
	 * @param projectModel parent project model
	 * @param commitName commit name for annotation
	 * @return commit model
	 */
	public ProjectCommit addCommit(ProjectModel projectModel, String commitName) {
		
		ProjectCommit commit = createProjectCommit(projectModel);

		// annotation for commit name
		Annotation annotation = createAnnotation(commit,commitName,commit);
		commit.getAnnotation().add(annotation);

		// add the commit to the model
		// model.getModelElement().add(projectCommit); // done by the create commit method
		
		// get the scopes
		CaseScope caseScope = (CaseScope)getModelElement(projectModel,CaseScope.class);
		ProjectScope projectScope = (ProjectScope)getModelElement(projectModel,ProjectScope.class);
		
		// get the categories and base measures
		EndProductQualityCategory epqc = (EndProductQualityCategory)getModelElement(projectModel,EndProductQualityCategory.class);
		InProgressQualityCategory ipqc = (InProgressQualityCategory)getModelElement(projectModel,InProgressQualityCategory.class);
		ChangeOrderDimensionalMeasure codm = (ChangeOrderDimensionalMeasure)getModelElement(projectModel,ChangeOrderDimensionalMeasure.class);
		CaseDimensionalMeasure cd = (CaseDimensionalMeasure)getModelElement(projectModel,CaseDimensionalMeasure.class);
		
		// get the traits
		EndProductQuality endProductQuality = (EndProductQuality)getModelElement(projectModel,EndProductQuality.class);
		InProgressIndicator inProgressIndicator = (InProgressIndicator)getModelElement(projectModel,InProgressIndicator.class);
		ProjectSize projectSize = (ProjectSize)getModelElement(projectModel,ProjectSize.class);
		
		// create commit-specific measures and statistics
		NormalDefectChangeOrderCount normal = createNormalDefectChangeOrderCount(commit,codm,projectScope,projectSize);
		CriticalDefectChangeOrderCount defects = createCriticalDefectChangeOrderCount(commit,codm,projectScope,projectSize);
		CriticalAndNormalChangeOrderCount cncoc = createCriticalAndNormalChangeOrderCount(commit,normal,defects,projectScope,projectSize);
		BrokenCaseSizeMeasure bcsm = createBrokenCaseSizeMeasure(commit,cd,caseScope,projectSize);
		FixedCaseSizeMeasure fcsm = createFixedCaseSizeMeasure(commit,cd,caseScope,projectSize);
		TotalCaseSizeMeasure tcsm = createTotalCaseSizeMeasure(commit,cd,caseScope,projectSize);
		BaselineCaseSizeMeasure baseline = createBaselineCaseSizeMeasure(commit,cd,caseScope,projectSize);
		RepairEffortMeasure rem = createRepairEffortMeasure(commit,projectScope,inProgressIndicator);
		DevelopmentEffortMeasure dem = createDevelopmentEffortMeasure(commit,projectScope,inProgressIndicator);
		TotalChangeOrderCount tcoc = createTotalChangeOrderCount(commit,codm,projectScope,projectSize);
		UsageTimeMeasure ut = createUsageTimeMeasure(commit,projectScope,inProgressIndicator);
		
		// create the product quality measures
		ScrapRatioMeasure scrapRatio = createScrapRatioMeasure(commit,bcsm,tcsm,caseScope,endProductQuality);
		ReworkRatioMeasure reworkRatio = createReworkRatioMeasure(commit,rem,dem,projectScope,endProductQuality);
		ModularityMeasure modularity = createModularityMeasure(commit,bcsm,tcoc,projectScope,endProductQuality);
		AdaptabilityRatioMeasure adaptability = createAdaptabilityRatioMeasure(commit,rem,tcoc,projectScope,endProductQuality);
		MaturityRatioMeasure maturity = createMaturityRatioMeasure(commit,ut,cncoc,projectScope,endProductQuality);
		MaintainabilityMeasure maintainability = createMaintainabilityMeasure(commit,scrapRatio,reworkRatio,projectScope,endProductQuality);
		
		// create the in-progress indicators
		ReworkStabilityMeasure reworkStability = createReworkStabilityMeasure(commit,bcsm,fcsm,projectScope,inProgressIndicator);
		ReworkBacklogMeasure reworkBacklog = createReworkBacklogMeasure(commit,reworkStability,baseline,projectScope,inProgressIndicator);
		ModularityTrend modularityTrend = createModularityTrend(commit,modularity,projectScope,inProgressIndicator);
		AdaptabilityTrend adaptabilityTrend = createAdaptabilityTrend(commit,adaptability,projectScope,inProgressIndicator);
		MaturityTrend maturityTrend = createMaturityTrend(commit,maturity,projectScope,inProgressIndicator);
		
		// add the measures to the metric categories
		epqc.getCategoryMeasure().add(scrapRatio);
		epqc.getCategoryMeasure().add(reworkRatio);
		epqc.getCategoryMeasure().add(modularity);
		epqc.getCategoryMeasure().add(adaptability);
		epqc.getCategoryMeasure().add(maturity);
		epqc.getCategoryMeasure().add(maintainability);
		
		ipqc.getCategoryMeasure().add(reworkStability);
		ipqc.getCategoryMeasure().add(reworkBacklog);
		ipqc.getCategoryMeasure().add(modularityTrend);
		ipqc.getCategoryMeasure().add(adaptabilityTrend);
		ipqc.getCategoryMeasure().add(maturityTrend);
		
		return commit;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectCommit createProjectCommit() {
		ProjectCommitImpl projectCommit = new ProjectCommitImpl();
		return projectCommit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitRelationship createCommitRelationship() {
		CommitRelationshipImpl commitRelationship = new CommitRelationshipImpl();
		return commitRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductQualityCategory createEndProductQualityCategory() {
		EndProductQualityCategoryImpl endProductQualityCategory = new EndProductQualityCategoryImpl();
		return endProductQualityCategory;
	}

	/**
	 * Creates the end product quality category.
	 * Assigns name.  Adds category to the model element list.
	 * @param model project model
	 * @return category
	 */
	public EndProductQualityCategory createEndProductQualityCategory(ProjectModel model) {
		EndProductQualityCategory category = createEndProductQualityCategory();
		category.setModel(model);
		category.setName("End Product Quality Metrics");
		model.getModelElement().add(category);
		return category;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InProgressQualityCategory createInProgressQualityCategory() {
		InProgressQualityCategoryImpl inProgressQualityCategory = new InProgressQualityCategoryImpl();
		return inProgressQualityCategory;
	}

	/**
	 * Creates the in-progress indicators metrics category.
	 * Assigns name.  Adds category to the model element list.
	 * @param model project model
	 * @return category
	 */
	public InProgressQualityCategory createInProgressQualityCategory(ProjectModel model) {
		InProgressQualityCategory category = createInProgressQualityCategory();
		category.setModel(model);
		category.setName("In-Progress Indicators");
		model.getModelElement().add(category);
		return category;
	}
	

	/**
	 * Creates the structure for a project commit record in the parent project model.
	 * Adds commit to the parent model's model element list.
	 * Does not add measures, categories, annotations, etc.
	 * @param projectModel project model
	 * @return project commit record 
	 */
	public ProjectCommit createProjectCommit(ProjectModel projectModel) {
		ProjectCommit projectCommit = createProjectCommit();
		projectCommit.setModel(projectModel);
		projectModel.getModelElement().add(projectCommit);
		return projectCommit;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductQuality createEndProductQuality() {
		EndProductQualityImpl endProductQuality = new EndProductQualityImpl();
		return endProductQuality;
	}
	
	/**
	 * Create a new product quality characteristic node.
	 * @param model measurement model
	 * @param parent characteristic parent or null
	 * @return product quality characteristic
	 */
	public EndProductQuality createEndProductQuality(ProjectModel model, Characteristic parent) {
		EndProductQuality endProductQuality = createEndProductQuality();
		endProductQuality.setName("End-Product Quality");
		endProductQuality.setModel(model);
		endProductQuality.setParent(parent);
		model.getModelElement().add(endProductQuality);
		return endProductQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maintainability createMaintainability() {
		MaintainabilityImpl maintainability = new MaintainabilityImpl();
		return maintainability;
	}

	/**
	 * Create a new maintainability characteristic node.
	 * @param model measurement model
	 * @param parent parent characteristic or null
	 * @return maintainability characteristic
	 */
	public Maintainability createMaintainability(ProjectModel model,Characteristic parent) {
		Maintainability maintainability = createMaintainability();
		maintainability.setModel(model);
		maintainability.setName("Maintainability");
		maintainability.setParent(parent);
		model.getModelElement().add(maintainability);
		return maintainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InProgressIndicator createInProgressIndicator() {
		InProgressIndicatorImpl inProgressIndicator = new InProgressIndicatorImpl();
		return inProgressIndicator;
	}

	/**
	 * Create a new in-progress indicator characteristic.
	 * @param model measurement model
	 * @param parent parent characteristic or null
	 * @return in-progress indicator characteristic
	 */
	public InProgressIndicator createInProgressIndicator(ProjectModel model, Characteristic parent) {
		InProgressIndicator inProgressIndicator = createInProgressIndicator();
		inProgressIndicator.setModel(model);
		inProgressIndicator.setName("In-Progress Indicator");
		inProgressIndicator.setParent(parent);
		model.getModelElement().add(inProgressIndicator);
		return inProgressIndicator;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSize createProjectSize() {
		ProjectSizeImpl projectSize = new ProjectSizeImpl();
		return projectSize;
	}

	/**
	 * Create a project size indicator characteristic.
	 * @param model measurement model
	 * @param parent parent characteristic or null
	 * @return project size characteristic
	 */
	public ProjectSize createProjectSize(ProjectModel model, Characteristic parent) {
		ProjectSize projectSize = createProjectSize();
		projectSize.setModel(model);
		projectSize.setName("Project Size");
		projectSize.setParent(parent);
		model.getModelElement().add(projectSize);
		return projectSize;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseDimensionalMeasure createCaseDimensionalMeasure() {
		CaseDimensionalMeasureImpl caseDimensionalMeasure = new CaseDimensionalMeasureImpl();
		return caseDimensionalMeasure;
	}

	/**
	 * Create a case dimensional measure.
	 * @param projectModel measurement model
	 * @param scope measure scope
	 * @param trait measure trait
	 * @return case dimensional measure
	 */
	public CaseDimensionalMeasure createCaseDimensionalMeasure(ProjectModel projectModel, CaseScope scope, Characteristic trait) {
		CaseDimensionalMeasure caseDimensionalMeasure = createCaseDimensionalMeasure();
		caseDimensionalMeasure.setModel(projectModel);
		caseDimensionalMeasure.setLibrary(LIBRARY_CERTWARE);
		caseDimensionalMeasure.setName("Case Dimensional Measure");
		caseDimensionalMeasure.setUnit("line count");
		caseDimensionalMeasure.setScope(scope);
		caseDimensionalMeasure.setTrait(trait);
		projectModel.getModelElement().add(caseDimensionalMeasure);
		return caseDimensionalMeasure;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOrderDimensionalMeasure createChangeOrderDimensionalMeasure() {
		ChangeOrderDimensionalMeasureImpl changeOrderDimensionalMeasure = new ChangeOrderDimensionalMeasureImpl();
		return changeOrderDimensionalMeasure;
	}

	/**
	 * Create a change order dimensional measure.
	 * @param model measurement model
	 * @param scope measure scope
	 * @param trait measure trait
	 * @return change order dimensional measure
	 */
	public ChangeOrderDimensionalMeasure createChangeOrderDimensionalMeasure(ProjectModel model, ProjectScope scope, ProjectSize trait) {
		ChangeOrderDimensionalMeasure changeOrderDimensionalMeasure = createChangeOrderDimensionalMeasure();
		changeOrderDimensionalMeasure.setModel(model);
		changeOrderDimensionalMeasure.setLibrary(LIBRARY_CERTWARE);
		changeOrderDimensionalMeasure.setName("Change Order Dimensional Measure");
		changeOrderDimensionalMeasure.setUnit("order count");
		changeOrderDimensionalMeasure.setScope(scope);
		changeOrderDimensionalMeasure.setTrait(trait);
		model.getModelElement().add(changeOrderDimensionalMeasure);
		return changeOrderDimensionalMeasure;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDimensionalMeasure createTimeDimensionalMeasure() {
		TimeDimensionalMeasureImpl timeDimensionalMeasure = new TimeDimensionalMeasureImpl();
		return timeDimensionalMeasure;
	}

	/**
	 * Create a time dimensional measure (hours).
	 * @param projectModel measurement model
	 * @param scope measure scope
	 * @param trait measure trait
	 * @return time dimensional measure
	 */
	public TimeDimensionalMeasure createTimeDimensionalMeasure(ProjectCommit projectModel, Scope scope, Characteristic trait) {
		TimeDimensionalMeasure timeDimensionalMeasure = createTimeDimensionalMeasure();
		timeDimensionalMeasure.setModel(projectModel);
		timeDimensionalMeasure.setLibrary(LIBRARY_CERTWARE);
		timeDimensionalMeasure.setName("Time Dimensional Measure");
		timeDimensionalMeasure.setUnit("hours");
		timeDimensionalMeasure.setScope(scope);
		timeDimensionalMeasure.setTrait(trait);
		projectModel.getModelElement().add(timeDimensionalMeasure);
		return timeDimensionalMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AdditiveMeasure createAdditiveMeasure() {
		AdditiveMeasureImpl additiveMeasure = new AdditiveMeasureImpl();
		return additiveMeasure;
	}

	/**
	 * Create an additive measure.
	 * @param smmModel measurement model
	 * @param baseMeasure base measure
	 * @param scope measure scope
	 * @param trait measure trait
	 * @param unit unit of measure
	 * @return additive measure
	 */
	public AdditiveMeasure createAdditiveMeasure(SmmModel smmModel, DimensionalMeasure baseMeasure, Scope scope, Characteristic trait, String unit) {
		AdditiveMeasure additiveMeasure = createAdditiveMeasure();
		additiveMeasure.setBaseMeasure(baseMeasure);
		additiveMeasure.setLibrary(LIBRARY_CERTWARE);
		additiveMeasure.setModel(smmModel);
		additiveMeasure.setName("Additive Measure");
		additiveMeasure.setScope(scope);
		additiveMeasure.setTrait(trait);
		additiveMeasure.setUnit(unit);
		smmModel.getModelElement().add(additiveMeasure); // assumes sub-classes do not call this method
		return additiveMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseScope createCaseScope() {
		CaseScopeImpl caseScope = new CaseScopeImpl();
		return caseScope;
	}

	/**
	 * Create a case scope.
	 * Uses {@code Argument} for class, {@code Case Scope} for name, and {@code isArgument} for recognizer. 
	 * @param model measurement model
	 * @return case scope
	 */
	public CaseScope createCaseScope(ProjectModel model) {
		CaseScope caseScope = createCaseScope();
		caseScope.setClass("Argument");
		caseScope.setEnumerated(false);
		caseScope.setModel(model);
		caseScope.setName("Case Scope");
		caseScope.setRecognizer("isArgument");
		model.getModelElement().add(caseScope);
		return caseScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectScope createProjectScope() {
		ProjectScopeImpl projectScope = new ProjectScopeImpl();
		return projectScope;
	}

	/**
	 * Create a project scope.
	 * Uses {@code IProject} for class, {@code Project Scope} for name, and {@code isProject} for recognizer. 
	 * @param model measurement model
	 * @return project scope
	 */
	public ProjectScope createProjectScope(ProjectModel model) {
		ProjectScope projectScope = createProjectScope();
		projectScope.setClass("IProject");
		projectScope.setEnumerated(false);
		projectScope.setModel(model);
		projectScope.setName("Project Scope");
		projectScope.setRecognizer("isProject");
		model.getModelElement().add(projectScope);
		return projectScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeScope createChangeScope() {
		ChangeScopeImpl changeScope = new ChangeScopeImpl();
		return changeScope;
	}

	/**
	 * Create a change order scope.
	 * Uses {@code ITask} for class, {@code Change Scope} for name, and {@code isTask} for recognizer. 
	 * @param model measurement model
	 * @return change scope
	 */
	public ChangeScope createChangeScope(ProjectModel model) {
		ChangeScope changeScope = createChangeScope();
		changeScope.setClass("ITask");
		changeScope.setEnumerated(false);
		changeScope.setModel(model);
		changeScope.setName("Change Scope");
		changeScope.setRecognizer("isTask");
		model.getModelElement().add(changeScope);
		return changeScope;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalDefectChangeOrderCount createCriticalDefectChangeOrderCount() {
		CriticalDefectChangeOrderCountImpl criticalDefectChangeOrderCount = new CriticalDefectChangeOrderCountImpl();
		return criticalDefectChangeOrderCount;
	}

	/**
	 * Create a critical defect change order count element.
	 * @param projectCommit commit model
	 * @param baseMeasure change order base measure
	 * @param scope project scope
	 * @param trait project size characteristic
	 * @return change order count
	 */
	public CriticalDefectChangeOrderCount createCriticalDefectChangeOrderCount(ProjectCommit projectCommit, ChangeOrderDimensionalMeasure baseMeasure, ProjectScope scope, ProjectSize trait) {
		CriticalDefectChangeOrderCount criticalDefectChangeOrderCount = createCriticalDefectChangeOrderCount();
		criticalDefectChangeOrderCount.setBaseMeasure(baseMeasure);
		criticalDefectChangeOrderCount.setLibrary(LIBRARY_CERTWARE);
		criticalDefectChangeOrderCount.setModel(projectCommit);
		criticalDefectChangeOrderCount.setName("Critical Defect Change Order Count");
		criticalDefectChangeOrderCount.setScope(scope);
		criticalDefectChangeOrderCount.setTrait(trait);
		criticalDefectChangeOrderCount.setUnit(UNIT_COUNT);
		projectCommit.getModelElement().add(criticalDefectChangeOrderCount);
		return criticalDefectChangeOrderCount;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDefectChangeOrderCount createNormalDefectChangeOrderCount() {
		NormalDefectChangeOrderCountImpl normalDefectChangeOrderCount = new NormalDefectChangeOrderCountImpl();
		return normalDefectChangeOrderCount;
	}

	/**
	 * Create a normal defect change order count element.
	 * @param commitModel commit model
	 * @param baseMeasure change order base measure
	 * @param scope project scope
	 * @param trait project size characteristic
	 * @return change order count
	 */
	public NormalDefectChangeOrderCount createNormalDefectChangeOrderCount(ProjectCommit commitModel, ChangeOrderDimensionalMeasure baseMeasure, ProjectScope scope, ProjectSize trait) {
		NormalDefectChangeOrderCount normalDefectChangeOrderCount = createNormalDefectChangeOrderCount();
		normalDefectChangeOrderCount.setBaseMeasure(baseMeasure);
		normalDefectChangeOrderCount.setLibrary(LIBRARY_CERTWARE);
		normalDefectChangeOrderCount.setModel(commitModel);
		normalDefectChangeOrderCount.setName("Normal Defect Change Order Count");
		normalDefectChangeOrderCount.setScope(scope);
		normalDefectChangeOrderCount.setTrait(trait);
		normalDefectChangeOrderCount.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(normalDefectChangeOrderCount);
		return normalDefectChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImprovementChangeOrderCount createImprovementChangeOrderCount() {
		ImprovementChangeOrderCountImpl improvementChangeOrderCount = new ImprovementChangeOrderCountImpl();
		return improvementChangeOrderCount;
	}

	/**
	 * Create a improvement change order count element.
	 * @param commitModel project model
	 * @param baseMeasure change order base measure
	 * @param scope project scope
	 * @param trait project size characteristic
	 * @return change order count
	 */
	public ImprovementChangeOrderCount createImprovementChangeOrderCount(ProjectCommit commitModel, ChangeOrderDimensionalMeasure baseMeasure, ProjectScope scope, ProjectSize trait) {
		ImprovementChangeOrderCount improvementChangeOrderCount = createImprovementChangeOrderCount();
		improvementChangeOrderCount.setBaseMeasure(baseMeasure);
		improvementChangeOrderCount.setLibrary(LIBRARY_CERTWARE);
		improvementChangeOrderCount.setModel(commitModel);
		improvementChangeOrderCount.setName("Improvement Change Order Count");
		improvementChangeOrderCount.setScope(scope);
		improvementChangeOrderCount.setTrait(trait);
		improvementChangeOrderCount.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(improvementChangeOrderCount);
		return improvementChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFeatureChangeOrderCount createNewFeatureChangeOrderCount() {
		NewFeatureChangeOrderCountImpl newFeatureChangeOrderCount = new NewFeatureChangeOrderCountImpl();
		return newFeatureChangeOrderCount;
	}

	/**
	 * Create a new feature change order count element.
	 * @param commitModel commit model
	 * @param baseMeasure change order base measure
	 * @param scope project scope
	 * @param trait project size characteristic
	 * @return change order count
	 */
	public NewFeatureChangeOrderCount createNewFeatureChangeOrderCount(ProjectCommit commitModel, ChangeOrderDimensionalMeasure baseMeasure, ProjectScope scope, ProjectSize trait) {
		NewFeatureChangeOrderCount newFeatureChangeOrderCount = createNewFeatureChangeOrderCount();
		newFeatureChangeOrderCount.setBaseMeasure(baseMeasure);
		newFeatureChangeOrderCount.setLibrary(LIBRARY_CERTWARE);
		newFeatureChangeOrderCount.setModel(commitModel);
		newFeatureChangeOrderCount.setName("New Feature Change Order Count");
		newFeatureChangeOrderCount.setScope(scope);
		newFeatureChangeOrderCount.setTrait(trait);
		newFeatureChangeOrderCount.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(newFeatureChangeOrderCount);
		return newFeatureChangeOrderCount;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrendMeasure createTrendMeasure() {
		TrendMeasureImpl trendMeasure = new TrendMeasureImpl();
		return trendMeasure;
	}

	/**
	 * Create a trend measure.
	 * Sets {@code unit} to 'instance';
	 * @param smmModel measurement model
	 * @param baseMeasure base measure reference
	 * @param scope measure scope
	 * @param trait measure trait
	 * @return trend measure
	 */
	public TrendMeasure createTrendMeasure(SmmModel smmModel, DimensionalMeasure baseMeasure, Scope scope, Characteristic trait) {
		TrendMeasure trendMeasure = createTrendMeasure();
		trendMeasure.setBaseMeasure(baseMeasure);
		trendMeasure.setLibrary(LIBRARY_CERTWARE);
		trendMeasure.setModel(smmModel);
		trendMeasure.setName("Trend Measure");
		trendMeasure.setScope(scope);
		trendMeasure.setTrait(trait);
		trendMeasure.setUnit(UNIT_TREND);
		smmModel.getModelElement().add(trendMeasure);
		return trendMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrapRatioMeasure createScrapRatioMeasure() {
		ScrapRatioMeasureImpl scrapRatioMeasure = new ScrapRatioMeasureImpl();
		return scrapRatioMeasure;
	}

	/**
	 * Create a scrap ratio measure.
	 * @param commitModel commit model
	 * @param b1 broken case size measure (numerator)
	 * @param b2 total case size measure (denominator)
	 * @param scope case scope
	 * @param trait end product quality characteristic
	 * @return scrap ratio measure
	 */
	public ScrapRatioMeasure createScrapRatioMeasure(ProjectCommit commitModel, BrokenCaseSizeMeasure b1, TotalCaseSizeMeasure b2, CaseScope scope, EndProductQuality trait) {
		ScrapRatioMeasure scrapRatioMeasure = createScrapRatioMeasure();
		scrapRatioMeasure.setBaseMeasure1(b1);
		scrapRatioMeasure.setBaseMeasure2(b2);
		scrapRatioMeasure.setFunctor(FUNCTOR_DIVIDE);
		scrapRatioMeasure.setLibrary(LIBRARY_CERTWARE);
		scrapRatioMeasure.setModel(commitModel);
		scrapRatioMeasure.setName("Scrap Ratio Measure");
		scrapRatioMeasure.setScope(scope);
		scrapRatioMeasure.setTrait(trait);
		scrapRatioMeasure.setUnit(UNIT_DIMENSIONLESS);
		commitModel.getModelElement().add(scrapRatioMeasure);
		return scrapRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularityMeasure createModularityMeasure() {
		ModularityMeasureImpl modularityMeasure = new ModularityMeasureImpl();
		return modularityMeasure;
	}

	/**
	 * Create a modularity measure.
	 * @param commitModel commit model
	 * @param b1 broken case size measure (numerator)
	 * @param b2 total change order count (denominator)
	 * @param scope project scope
	 * @param trait end product quality characteristic
	 * @return modularity ratio measure
	 */
	public ModularityMeasure createModularityMeasure(ProjectCommit commitModel, BrokenCaseSizeMeasure b1, TotalChangeOrderCount b2, ProjectScope scope, EndProductQuality trait) {
		ModularityMeasure modularityMeasure = createModularityMeasure();
		modularityMeasure.setBaseMeasure1(b1);
		modularityMeasure.setBaseMeasure2(b2);
		modularityMeasure.setFunctor(FUNCTOR_DIVIDE);
		modularityMeasure.setLibrary(LIBRARY_CERTWARE);
		modularityMeasure.setModel(commitModel);
		modularityMeasure.setName("Modularity Measure");
		modularityMeasure.setScope(scope);
		modularityMeasure.setTrait(trait);
		modularityMeasure.setUnit(UNIT_LINES_PER_CHANGE);
		commitModel.getModelElement().add(modularityMeasure);
		return modularityMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkRatioMeasure createReworkRatioMeasure() {
		ReworkRatioMeasureImpl reworkRatioMeasure = new ReworkRatioMeasureImpl();
		return reworkRatioMeasure;
	}

	/**
	 * Create a rework measure.
	 * @param commitModel project model
	 * @param b1 repair effort measure (numerator)
	 * @param b2 development effort measure (denominator)
	 * @param scope project scope
	 * @param trait end product quality characteristic
	 * @return rework ratio measure
	 */
	public ReworkRatioMeasure createReworkRatioMeasure(ProjectCommit commitModel, RepairEffortMeasure b1, DevelopmentEffortMeasure b2, ProjectScope scope, EndProductQuality trait) {
		ReworkRatioMeasure reworkRatioMeasure = createReworkRatioMeasure();
		reworkRatioMeasure.setBaseMeasure1(b1);
		reworkRatioMeasure.setBaseMeasure2(b2);
		reworkRatioMeasure.setFunctor(FUNCTOR_DIVIDE);
		reworkRatioMeasure.setLibrary(LIBRARY_CERTWARE);
		reworkRatioMeasure.setModel(commitModel);
		reworkRatioMeasure.setName("Rework Measure");
		reworkRatioMeasure.setScope(scope);
		reworkRatioMeasure.setTrait(trait);
		reworkRatioMeasure.setUnit(UNIT_DIMENSIONLESS);
		commitModel.getModelElement().add(reworkRatioMeasure);
		return reworkRatioMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptabilityRatioMeasure createAdaptabilityRatioMeasure() {
		AdaptabilityRatioMeasureImpl adaptabilityRatioMeasure = new AdaptabilityRatioMeasureImpl();
		return adaptabilityRatioMeasure;
	}

	/**
	 * Create an adaptability measure.
	 * @param commitModel commit model
	 * @param b1 repair effort measure (numerator)
	 * @param b2 total change order count (denominator)
	 * @param scope project scope
	 * @param trait end product quality characteristic
	 * @return adaptability ratio measure
	 */
	public AdaptabilityRatioMeasure createAdaptabilityRatioMeasure(ProjectCommit commitModel, RepairEffortMeasure b1, TotalChangeOrderCount b2, ProjectScope scope, EndProductQuality trait) {
		AdaptabilityRatioMeasure adaptabilityRatioMeasure = createAdaptabilityRatioMeasure();
		adaptabilityRatioMeasure.setBaseMeasure1(b1);
		adaptabilityRatioMeasure.setBaseMeasure2(b2);
		adaptabilityRatioMeasure.setFunctor(FUNCTOR_DIVIDE);
		adaptabilityRatioMeasure.setLibrary(LIBRARY_CERTWARE);
		adaptabilityRatioMeasure.setModel(commitModel);
		adaptabilityRatioMeasure.setName("Adaptability Measure");
		adaptabilityRatioMeasure.setScope(scope);
		adaptabilityRatioMeasure.setTrait(trait);
		adaptabilityRatioMeasure.setUnit(UNIT_HOURS_PER_CHANGE);
		commitModel.getModelElement().add(adaptabilityRatioMeasure);
		return adaptabilityRatioMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityRatioMeasure createMaturityRatioMeasure() {
		MaturityRatioMeasureImpl maturityRatioMeasure = new MaturityRatioMeasureImpl();
		return maturityRatioMeasure;
	}

	/**
	 * Create a maturity measure.
	 * @param commitModel commit model
	 * @param b1 usage time (numerator)
	 * @param b2 critical and normal change order count (denominator)
	 * @param scope project scope
	 * @param trait end product quality characteristic
	 * @return maturity ratio measure
	 */
	public MaturityRatioMeasure createMaturityRatioMeasure(ProjectCommit commitModel, UsageTimeMeasure b1, CriticalAndNormalChangeOrderCount b2, ProjectScope scope, EndProductQuality trait) {
		MaturityRatioMeasure maturityRatioMeasure = createMaturityRatioMeasure();
		maturityRatioMeasure.setBaseMeasure1(b1);
		maturityRatioMeasure.setBaseMeasure2(b2);
		maturityRatioMeasure.setFunctor(FUNCTOR_DIVIDE);
		maturityRatioMeasure.setLibrary(LIBRARY_CERTWARE);
		maturityRatioMeasure.setModel(commitModel);
		maturityRatioMeasure.setName("Maturity Measure");
		maturityRatioMeasure.setScope(scope);
		maturityRatioMeasure.setTrait(trait);
		maturityRatioMeasure.setUnit(UNIT_HOURS_PER_CHANGE);
		commitModel.getModelElement().add(maturityRatioMeasure);
		return maturityRatioMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainabilityMeasure createMaintainabilityMeasure() {
		MaintainabilityMeasureImpl maintainabilityMeasure = new MaintainabilityMeasureImpl();
		return maintainabilityMeasure;
	}

	/**
	 * Create a maintainability measure.
	 * @param commitModel commit model
	 * @param b1 scrap ratio (numerator)
	 * @param b2 rework ratio (denominator)
	 * @param scope project scope
	 * @param trait end product quality characteristic
	 * @return maintainability measure
	 */
	public MaintainabilityMeasure createMaintainabilityMeasure(ProjectCommit commitModel, ScrapRatioMeasure b1, ReworkRatioMeasure b2, ProjectScope scope, EndProductQuality trait) {
		MaintainabilityMeasure maintainabilityMeasure = createMaintainabilityMeasure();
		maintainabilityMeasure.setBaseMeasure1(b1);
		maintainabilityMeasure.setBaseMeasure2(b2);
		maintainabilityMeasure.setFunctor(FUNCTOR_DIVIDE);
		maintainabilityMeasure.setLibrary(LIBRARY_CERTWARE);
		maintainabilityMeasure.setModel(commitModel);
		maintainabilityMeasure.setName("Maintainability Measure");
		maintainabilityMeasure.setScope(scope);
		maintainabilityMeasure.setTrait(trait);
		maintainabilityMeasure.setUnit(UNIT_DIMENSIONLESS);
		commitModel.getModelElement().add(maintainabilityMeasure);
		return maintainabilityMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokenCaseSizeMeasure createBrokenCaseSizeMeasure() {
		BrokenCaseSizeMeasureImpl brokenCaseSizeMeasure = new BrokenCaseSizeMeasureImpl();
		return brokenCaseSizeMeasure;
	}

	/**
	 * Create a broken case size measure.
	 * @param commitModel commit model
	 * @param baseMeasure case measure reference
	 * @param scope case scope
	 * @param trait project size characteristic
	 * @return broken case size measure
	 */
	public BrokenCaseSizeMeasure createBrokenCaseSizeMeasure(ProjectCommit commitModel, CaseDimensionalMeasure baseMeasure, CaseScope scope, ProjectSize trait) {
		BrokenCaseSizeMeasure brokenCaseSizeMeasure = createBrokenCaseSizeMeasure();
		brokenCaseSizeMeasure.setBaseMeasure(baseMeasure);
		brokenCaseSizeMeasure.setLibrary(LIBRARY_CERTWARE);
		brokenCaseSizeMeasure.setModel(commitModel);
		brokenCaseSizeMeasure.setName("Broken Case Size");
		brokenCaseSizeMeasure.setScope(scope);
		brokenCaseSizeMeasure.setTrait(trait);
		brokenCaseSizeMeasure.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(brokenCaseSizeMeasure);
		return brokenCaseSizeMeasure;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCaseSizeMeasure createFixedCaseSizeMeasure() {
		FixedCaseSizeMeasureImpl fixedCaseSizeMeasure = new FixedCaseSizeMeasureImpl();
		return fixedCaseSizeMeasure;
	}

	/**
	 * Create a fixed case size measure.
	 * @param commitModel commit model
	 * @param baseMeasure case measure reference
	 * @param scope case scope
	 * @param trait project size characteristic
	 * @return fixed case size measure
	 */
	public FixedCaseSizeMeasure createFixedCaseSizeMeasure(ProjectCommit commitModel, CaseDimensionalMeasure baseMeasure, CaseScope scope, ProjectSize trait) {
		FixedCaseSizeMeasure fixedCaseSizeMeasure = createFixedCaseSizeMeasure();
		fixedCaseSizeMeasure.setBaseMeasure(baseMeasure);
		fixedCaseSizeMeasure.setLibrary(LIBRARY_CERTWARE);
		fixedCaseSizeMeasure.setModel(commitModel);
		fixedCaseSizeMeasure.setName("Fixed Case Size");
		fixedCaseSizeMeasure.setScope(scope);
		fixedCaseSizeMeasure.setTrait(trait);
		fixedCaseSizeMeasure.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(fixedCaseSizeMeasure);
		return fixedCaseSizeMeasure;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalCaseSizeMeasure createTotalCaseSizeMeasure() {
		TotalCaseSizeMeasureImpl totalCaseSizeMeasure = new TotalCaseSizeMeasureImpl();
		return totalCaseSizeMeasure;
	}

	/**
	 * Create a total case size measure.
	 * @param commitModel commit model
	 * @param baseMeasure case measure reference
	 * @param scope case scope
	 * @param trait project size characteristic
	 * @return total case size measure
	 */
	public TotalCaseSizeMeasure createTotalCaseSizeMeasure(ProjectCommit commitModel, CaseDimensionalMeasure baseMeasure, CaseScope scope, ProjectSize trait) {
		TotalCaseSizeMeasure totalCaseSizeMeasure = createTotalCaseSizeMeasure();
		totalCaseSizeMeasure.setBaseMeasure(baseMeasure);
		totalCaseSizeMeasure.setLibrary(LIBRARY_CERTWARE);
		totalCaseSizeMeasure.setModel(commitModel);
		totalCaseSizeMeasure.setName("Total Case Size");
		totalCaseSizeMeasure.setScope(scope);
		totalCaseSizeMeasure.setTrait(trait);
		totalCaseSizeMeasure.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(totalCaseSizeMeasure);
		return totalCaseSizeMeasure;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineCaseSizeMeasure createBaselineCaseSizeMeasure() {
		BaselineCaseSizeMeasureImpl baselineCaseSizeMeasure = new BaselineCaseSizeMeasureImpl();
		return baselineCaseSizeMeasure;
	}

	/**
	 * Create a baseline case size measure.
	 * @param commitModel commit model
	 * @param baseMeasure case measure reference
	 * @param scope case scope
	 * @param trait project size characteristic
	 * @return baseline case size measure
	 */
	public BaselineCaseSizeMeasure createBaselineCaseSizeMeasure(ProjectCommit commitModel, CaseDimensionalMeasure baseMeasure, CaseScope scope, ProjectSize trait) {
		BaselineCaseSizeMeasure baselineCaseSizeMeasure = createBaselineCaseSizeMeasure();
		baselineCaseSizeMeasure.setBaseMeasure(baseMeasure);
		baselineCaseSizeMeasure.setLibrary(LIBRARY_CERTWARE);
		baselineCaseSizeMeasure.setModel(commitModel);
		baselineCaseSizeMeasure.setName("Baseline Case Size");
		baselineCaseSizeMeasure.setScope(scope);
		baselineCaseSizeMeasure.setTrait(trait);
		baselineCaseSizeMeasure.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(baselineCaseSizeMeasure);
		return baselineCaseSizeMeasure;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTimeMeasure createUsageTimeMeasure() {
		UsageTimeMeasureImpl usageTimeMeasure = new UsageTimeMeasureImpl();
		return usageTimeMeasure;
	}

	/**
	 * Create a usage time measure.
	 * @param commitModel commit model
	 * @param scope project scope
	 * @param trait in-progress characteristic
	 * @return usage time measure
	 */
	public UsageTimeMeasure createUsageTimeMeasure(ProjectCommit commitModel, ProjectScope scope, InProgressIndicator trait) {
		UsageTimeMeasure usageTimeMeasure = createUsageTimeMeasure();
		usageTimeMeasure.setLibrary(LIBRARY_CERTWARE);
		usageTimeMeasure.setModel(commitModel);
		usageTimeMeasure.setName("Usage Time");
		usageTimeMeasure.setScope(scope);
		usageTimeMeasure.setTrait(trait);
		usageTimeMeasure.setUnit(UNIT_HOURS);
		commitModel.getModelElement().add(usageTimeMeasure);
		return usageTimeMeasure;		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepairEffortMeasure createRepairEffortMeasure() {
		RepairEffortMeasureImpl repairEffortMeasure = new RepairEffortMeasureImpl();
		return repairEffortMeasure;
	}

	/**
	 * Create a repair effort measure.
	 * @param commitModel commit model
	 * @param scope project scope
	 * @param trait in-progress characteristic
	 * @return usage time measure
	 */
	public RepairEffortMeasure createRepairEffortMeasure(ProjectCommit commitModel, ProjectScope scope, InProgressIndicator trait) {
		RepairEffortMeasure repairEffortMeasure = createRepairEffortMeasure();
		repairEffortMeasure.setLibrary(LIBRARY_CERTWARE);
		repairEffortMeasure.setModel(commitModel);
		repairEffortMeasure.setName("Repair Effort");
		repairEffortMeasure.setScope(scope);
		repairEffortMeasure.setTrait(trait);
		repairEffortMeasure.setUnit(UNIT_HOURS);
		commitModel.getModelElement().add(repairEffortMeasure);
		return repairEffortMeasure;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEffortMeasure createDevelopmentEffortMeasure() {
		DevelopmentEffortMeasureImpl developmentEffortMeasure = new DevelopmentEffortMeasureImpl();
		return developmentEffortMeasure;
	}

	/**
	 * Create a development effort measure.
	 * @param commitModel commit model
	 * @param scope project scope
	 * @param trait in-progress characteristic
	 * @return usage time measure
	 */
	public DevelopmentEffortMeasure createDevelopmentEffortMeasure(ProjectCommit commitModel, ProjectScope scope, InProgressIndicator trait) {
		DevelopmentEffortMeasure developmentEffortMeasure = createDevelopmentEffortMeasure();
		developmentEffortMeasure.setLibrary(LIBRARY_CERTWARE);
		developmentEffortMeasure.setModel(commitModel);
		developmentEffortMeasure.setName("Development Effort");
		developmentEffortMeasure.setScope(scope);
		developmentEffortMeasure.setTrait(trait);
		developmentEffortMeasure.setUnit(UNIT_HOURS);
		commitModel.getModelElement().add(developmentEffortMeasure);
		return developmentEffortMeasure;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalChangeOrderCount createTotalChangeOrderCount() {
		TotalChangeOrderCountImpl totalChangeOrderCount = new TotalChangeOrderCountImpl();
		return totalChangeOrderCount;
	}

	/**
	 * Create a total change order count element.
	 * @param commitModel commit model
	 * @param baseMeasure change order base
	 * @param scope project scope
	 * @param trait project size characteristic
	 * @return total change order count
	 */
	public TotalChangeOrderCount createTotalChangeOrderCount(ProjectCommit commitModel, ChangeOrderDimensionalMeasure baseMeasure, ProjectScope scope, ProjectSize trait) {
		TotalChangeOrderCount totalChangeOrderCount = createTotalChangeOrderCount();
		totalChangeOrderCount.setBaseMeasure(baseMeasure);
		totalChangeOrderCount.setLibrary(LIBRARY_CERTWARE);
		totalChangeOrderCount.setModel(commitModel);
		totalChangeOrderCount.setName("Total Change Order Count");
		totalChangeOrderCount.setScope(scope);
		totalChangeOrderCount.setTrait(trait);
		totalChangeOrderCount.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(totalChangeOrderCount);
		return totalChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalAndNormalChangeOrderCount createCriticalAndNormalChangeOrderCount() {
		CriticalAndNormalChangeOrderCountImpl criticalAndNormalChangeOrderCount = new CriticalAndNormalChangeOrderCountImpl();
		return criticalAndNormalChangeOrderCount;
	}

	/**
	 * Create a total change order count element.
	 * @param commitModel commit model
	 * @param normalCount normal defect measure
	 * @param criticalCount critical defect measure
	 * @param scope project scope
	 * @param trait project size characteristic
	 * @return total change order count
	 */
	public CriticalAndNormalChangeOrderCount createCriticalAndNormalChangeOrderCount(ProjectCommit commitModel, NormalDefectChangeOrderCount normalCount, CriticalDefectChangeOrderCount criticalCount, ProjectScope scope, ProjectSize trait) {
		CriticalAndNormalChangeOrderCount criticalAndNormalChangeOrderCount = createCriticalAndNormalChangeOrderCount();
		criticalAndNormalChangeOrderCount.setBaseMeasure1(criticalCount);
		criticalAndNormalChangeOrderCount.setBaseMeasure2(normalCount);
		criticalAndNormalChangeOrderCount.setFunctor(FUNCTOR_ADD);
		criticalAndNormalChangeOrderCount.setLibrary(LIBRARY_CERTWARE);
		criticalAndNormalChangeOrderCount.setModel(commitModel);
		criticalAndNormalChangeOrderCount.setName("Critical And Normal Change Order Count");
		criticalAndNormalChangeOrderCount.setScope(scope);
		criticalAndNormalChangeOrderCount.setTrait(trait);
		criticalAndNormalChangeOrderCount.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(criticalAndNormalChangeOrderCount);
		return criticalAndNormalChangeOrderCount;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkStabilityMeasure createReworkStabilityMeasure() {
		ReworkStabilityMeasureImpl reworkStabilityMeasure = new ReworkStabilityMeasureImpl();
		return reworkStabilityMeasure;
	}

	/**
	 * Create a rework stability measure.
	 * @param commitModel commit model
	 * @param brokenCount broken case size
	 * @param fixedCount fixed case size
	 * @param scope project scope
	 * @param trait progress characteristic
	 * @return rework stability measure
	 */
	public ReworkStabilityMeasure createReworkStabilityMeasure(ProjectCommit commitModel, BrokenCaseSizeMeasure brokenCount, FixedCaseSizeMeasure fixedCount, ProjectScope scope, InProgressIndicator trait) {
		ReworkStabilityMeasure reworkStabilityMeasure = createReworkStabilityMeasure();
		reworkStabilityMeasure.setBaseMeasure1(brokenCount);
		reworkStabilityMeasure.setBaseMeasure2(fixedCount);
		reworkStabilityMeasure.setFunctor(FUNCTOR_SUBTRACT);
		reworkStabilityMeasure.setLibrary(LIBRARY_CERTWARE);
		reworkStabilityMeasure.setModel(commitModel);
		reworkStabilityMeasure.setName("Rework Stability");
		reworkStabilityMeasure.setScope(scope);
		reworkStabilityMeasure.setTrait(trait);
		reworkStabilityMeasure.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(reworkStabilityMeasure);
		return reworkStabilityMeasure;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkBacklogMeasure createReworkBacklogMeasure() {
		ReworkBacklogMeasureImpl reworkBacklogMeasure = new ReworkBacklogMeasureImpl();
		return reworkBacklogMeasure;
	}

	/**
	 * Create a total change order count element.
	 * @param commitModel commit model
	 * @param reworkStability rework stability measure
	 * @param baselineSize total baseline size count
	 * @param scope project scope
	 * @param inProgressIndicator progress characteristic
	 * @return total change order count
	 */
	public ReworkBacklogMeasure createReworkBacklogMeasure(ProjectCommit commitModel, ReworkStabilityMeasure reworkStability, BaselineCaseSizeMeasure baselineSize, ProjectScope scope, InProgressIndicator inProgressIndicator) {
		ReworkBacklogMeasure reworkBacklogMeasure = createReworkBacklogMeasure();
		reworkBacklogMeasure.setBaseMeasure1(reworkStability);
		reworkBacklogMeasure.setBaseMeasure2(baselineSize);
		reworkBacklogMeasure.setFunctor(FUNCTOR_DIVIDE);
		reworkBacklogMeasure.setLibrary(LIBRARY_CERTWARE);
		reworkBacklogMeasure.setModel(commitModel);
		reworkBacklogMeasure.setName("Rework Stability");
		reworkBacklogMeasure.setScope(scope);
		reworkBacklogMeasure.setTrait(inProgressIndicator);
		reworkBacklogMeasure.setUnit(UNIT_COUNT);
		commitModel.getModelElement().add(reworkBacklogMeasure);
		return reworkBacklogMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularityTrend createModularityTrend() {
		ModularityTrendImpl modularityTrend = new ModularityTrendImpl();
		return modularityTrend;
	}

	/**
	 * Modularity trend measure.
	 * @param commitModel commit model
	 * @param baseMeasure modularity measure (static)
	 * @param scope project scope
	 * @param trait in-progress indicator characteristic
	 * @return modularity trend measure
	 */
	public ModularityTrend createModularityTrend(ProjectCommit commitModel, ModularityMeasure baseMeasure, ProjectScope scope, InProgressIndicator trait) {
		ModularityTrend modularityTrend = createModularityTrend();
		modularityTrend.setBaseMeasure(baseMeasure);
		modularityTrend.setLibrary(LIBRARY_CERTWARE);
		modularityTrend.setModel(commitModel);
		modularityTrend.setName("Modularity Trend");
		modularityTrend.setScope(scope);
		modularityTrend.setTrait(trait);
		modularityTrend.setUnit(UNIT_LINES_PER_CHANGE);
		commitModel.getModelElement().add(modularityTrend);
		return modularityTrend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptabilityTrend createAdaptabilityTrend() {
		AdaptabilityTrendImpl adaptabilityTrend = new AdaptabilityTrendImpl();
		return adaptabilityTrend;
	}

	/**
	 * Adaptability trend measure.
	 * @param commitModel commit model
	 * @param baseMeasure adaptability measure (static)
	 * @param scope project scope
	 * @param trait in-progress indicator characteristic
	 * @return adaptability trend measure
	 */
	public AdaptabilityTrend createAdaptabilityTrend(ProjectCommit commitModel, AdaptabilityRatioMeasure baseMeasure, ProjectScope scope, InProgressIndicator trait) {
		AdaptabilityTrend adaptabilityTrend = createAdaptabilityTrend();
		adaptabilityTrend.setBaseMeasure(baseMeasure);
		adaptabilityTrend.setLibrary(LIBRARY_CERTWARE);
		adaptabilityTrend.setModel(commitModel);
		adaptabilityTrend.setName("Adaptability Trend");
		adaptabilityTrend.setScope(scope);
		adaptabilityTrend.setTrait(trait);
		adaptabilityTrend.setUnit(UNIT_HOURS_PER_CHANGE);
		commitModel.getModelElement().add(adaptabilityTrend);
		return adaptabilityTrend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityTrend createMaturityTrend() {
		MaturityTrendImpl maturityTrend = new MaturityTrendImpl();
		return maturityTrend;
	}

	/**
	 * Maturity trend measure.
	 * @param commitModel commit model
	 * @param baseMeasure maturity measure (static)
	 * @param scope project scope
	 * @param trait in-progress indicator characteristic
	 * @return maturity trend measure
	 */
	public MaturityTrend createMaturityTrend(ProjectCommit commitModel, MaturityRatioMeasure baseMeasure, ProjectScope scope, InProgressIndicator trait) {
		MaturityTrend maturityTrend = createMaturityTrend();
		maturityTrend.setBaseMeasure(baseMeasure);
		maturityTrend.setLibrary(LIBRARY_CERTWARE);
		maturityTrend.setModel(commitModel);
		maturityTrend.setName("Maturity Trend");
		maturityTrend.setScope(scope);
		maturityTrend.setTrait(trait);
		maturityTrend.setUnit(UNIT_HOURS_PER_CHANGE);
		commitModel.getModelElement().add(maturityTrend);
		return maturityTrend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmPackage getSpmPackage() {
		return (SpmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpmPackage getPackage() {
		return SpmPackage.eINSTANCE;
	}

} //SpmFactoryImpl
