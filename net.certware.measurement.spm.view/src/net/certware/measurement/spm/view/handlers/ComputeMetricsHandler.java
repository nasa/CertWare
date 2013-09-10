package net.certware.measurement.spm.view.handlers;

import java.util.Date;

import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.smm.Accumulator;
import net.certware.measurement.smm.AggregatedMeasurement;
import net.certware.measurement.smm.Annotation;
import net.certware.measurement.smm.BinaryMeasure;
import net.certware.measurement.smm.CollectiveMeasure;
import net.certware.measurement.smm.DimensionalMeasure;
import net.certware.measurement.smm.DimensionalMeasurement;
import net.certware.measurement.smm.DirectMeasurement;
import net.certware.measurement.smm.Measurement;
import net.certware.measurement.smm.Observation;
import net.certware.measurement.smm.SmmFactory;
import net.certware.measurement.spm.AdaptabilityRatioMeasure;
import net.certware.measurement.spm.AdaptabilityTrend;
import net.certware.measurement.spm.BaselineCaseSizeMeasure;
import net.certware.measurement.spm.BrokenCaseSizeMeasure;
import net.certware.measurement.spm.CriticalAndNormalChangeOrderCount;
import net.certware.measurement.spm.CriticalDefectChangeOrderCount;
import net.certware.measurement.spm.DevelopmentEffortMeasure;
import net.certware.measurement.spm.EndProductQuality;
import net.certware.measurement.spm.FixedCaseSizeMeasure;
import net.certware.measurement.spm.ImprovementChangeOrderCount;
import net.certware.measurement.spm.InProgressIndicator;
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
import net.certware.measurement.spm.RepairEffortMeasure;
import net.certware.measurement.spm.ReworkBacklogMeasure;
import net.certware.measurement.spm.ReworkRatioMeasure;
import net.certware.measurement.spm.ReworkStabilityMeasure;
import net.certware.measurement.spm.ScrapRatioMeasure;
import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.TimeDimensionalMeasure;
import net.certware.measurement.spm.TotalCaseSizeMeasure;
import net.certware.measurement.spm.TotalChangeOrderCount;
import net.certware.measurement.spm.TrendMeasure;
import net.certware.measurement.spm.UsageTimeMeasure;
import net.certware.measurement.spm.view.Activator;
import net.certware.measurement.spm.view.preferences.PreferenceConstants;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Computes change order metrics.
 * @author mrb
 * @since 2.0.0
 */
public class ComputeMetricsHandler extends AbstractHandler {

	/** part selected in command context */
	IWorkbenchPart latestPart = null;
	/** measure library tag */
	public static final String LIBRARY_TAG = "CertWare";
	/** functor value for divide */
	public static final String FUNCTOR_DIVIDE = "divide"; //$NON-NLS-1$
	/** functor value for subtract */
	public static final String FUNCTOR_SUBTRACT = "subtract"; //$NON-NLS-1$
	/** functor value for add */
	public static final String FUNCTOR_ADD = "add"; //$NON-NLS-1$
	/** functor value for multiply */
	public static final String FUNCTOR_MULTIPLY = "multiply"; //$NON-NLS-1$
	/** observation tool value tag */
	public static final String OBSERVATION_TOOL = "CertWare";
	/** observation observer tag */
	public static final String OBSERVATION_OBSERVER = "Computed";
	/** measurement error value */
	public static final String MEASUREMENT_ERROR = "Computed";
	
	/**
	 * Handles the compute metrics command request.  
	 * Presumes the command came from a popup menu selection of model or commit.
	 * @param event used to find context
	 * @return always returns null  
	 * @throws ExecutionException if open fails  
	 * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			// fetch workbench context
			latestPart = HandlerUtil.getActivePartChecked(event);
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			ISelectionService service = window.getSelectionService();
			IStructuredSelection iss = (IStructuredSelection)service.getSelection();

			Object first = iss.getFirstElement();
			
			// project commit
			if ( first instanceof ProjectCommit ) {
				ProjectCommit pc = (ProjectCommit)first;
				if ( computeMetrics(pc) == true ) {
					return null;
				}
			}
			
			// project model selection, do for each commit
			if ( first instanceof ProjectModel ) {
				// check raw statistics and compute metrics
				ProjectModel pm = (ProjectModel)first;
				for ( ProjectCommit pc : pm.getCommits() ) {
						if ( computeMetrics(pc) == true ) {
							// nothing logged per commit
						}
				}
				return null;
			}
			
		} catch (ExecutionException e) {
			CertWareLog.logError("Opening SCO view", e);
		}

		return null;
	}

	/**
	 * Compute the metrics given a project commit.
	 * Check whether the raw statistics are present.
	 * Updates the model elements in the given commit.
	 * @param pm project model to check
	 * @return true if all necessary statistics are present and have measurements
	 */
	public boolean computeMetrics(ProjectCommit pc) {
		CriticalDefectChangeOrderCount cdcoc = null;
		NormalDefectChangeOrderCount ndcoc = null;
		ImprovementChangeOrderCount icoc = null;
		NewFeatureChangeOrderCount nfcoc = null;
		TotalChangeOrderCount tcoc = null;
		CriticalAndNormalChangeOrderCount cncoc = null;
		BrokenCaseSizeMeasure brokenSize = null;
		FixedCaseSizeMeasure fixedSize = null;
		TotalCaseSizeMeasure totalSize = null;
		BaselineCaseSizeMeasure baselineSize = null;
		UsageTimeMeasure usageTime = null;
		DevelopmentEffortMeasure developmentEffort = null;
		RepairEffortMeasure repairEffort = null;
		ModularityTrend modularityTrend = null;
		AdaptabilityTrend adaptabilityTrend = null;
		AdaptabilityRatioMeasure adaptabilityRatio = null;
		ModularityMeasure modularity = null;
		ReworkBacklogMeasure reworkBacklog = null;
		ReworkRatioMeasure reworkRatio = null;
		ReworkStabilityMeasure reworkStability = null;
		MaintainabilityMeasure maintainability = null;
		MaturityTrend maturityTrend = null;
		MaturityRatioMeasure maturityRatio = null;
		ScrapRatioMeasure scrapRatio = null;
		EndProductQuality endProductQuality = null;
		InProgressIndicator inProgressIndicator = null;
		ProjectScope projectScope = null;

		// preferences
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean clearMeasurements = store.getBoolean(PreferenceConstants.P_CLEAR_MEASUREMENTS);
		
		// gather individual statistics by iterating over all commit elements
		TreeIterator<?> ti = pc.eAllContents();
		while( ti.hasNext() ) {
			EObject eo = (EObject)ti.next();

			// scopes
			if ( eo instanceof ProjectScope ) {
				projectScope = (ProjectScope)eo;
				continue;
			}
			
			// statistics
			if ( eo instanceof CriticalDefectChangeOrderCount ) {
				cdcoc = (CriticalDefectChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof NormalDefectChangeOrderCount ) {
				ndcoc = (NormalDefectChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof ImprovementChangeOrderCount ) {
				icoc = (ImprovementChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof NewFeatureChangeOrderCount ) {
				nfcoc = (NewFeatureChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof TotalChangeOrderCount ) {
				tcoc = (TotalChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof CriticalAndNormalChangeOrderCount ) {
				cncoc = (CriticalAndNormalChangeOrderCount)eo;
				continue;
			}
			if ( eo instanceof BrokenCaseSizeMeasure ) {
				brokenSize = (BrokenCaseSizeMeasure)eo;
				continue;
			}
			if ( eo instanceof FixedCaseSizeMeasure ) {
				fixedSize = (FixedCaseSizeMeasure)eo;
				continue;
			}
			if ( eo instanceof TotalCaseSizeMeasure ) {
				totalSize = (TotalCaseSizeMeasure)eo;
				continue;
			}
			if ( eo instanceof BaselineCaseSizeMeasure ) {
				baselineSize = (BaselineCaseSizeMeasure)eo;
				continue;
			}
			if ( eo instanceof UsageTimeMeasure ) {
				usageTime = (UsageTimeMeasure)eo;
				continue;
			}
			if ( eo instanceof DevelopmentEffortMeasure ) {
				developmentEffort = (DevelopmentEffortMeasure)eo;
				continue;
			}
			if ( eo instanceof RepairEffortMeasure ) {
				repairEffort = (RepairEffortMeasure)eo;
				continue;
			}

			// computed metrics
			if ( eo instanceof ScrapRatioMeasure ) {
				scrapRatio = (ScrapRatioMeasure)eo;
				continue;
			}
			if ( eo instanceof MaturityRatioMeasure ) {
				maturityRatio = (MaturityRatioMeasure)eo;
				continue;
			}
			if ( eo instanceof MaturityTrend ) {
				maturityTrend = (MaturityTrend)eo;
				continue;
			}
			if ( eo instanceof MaintainabilityMeasure ) {
				maintainability = (MaintainabilityMeasure)eo;
				continue;
			}
			if ( eo instanceof ReworkStabilityMeasure ) {
				reworkStability = (ReworkStabilityMeasure)eo;
				continue;
			}
			if ( eo instanceof ReworkRatioMeasure ) {
				reworkRatio = (ReworkRatioMeasure)eo;
				continue;
			}
			if ( eo instanceof ReworkBacklogMeasure ) {
				reworkBacklog = (ReworkBacklogMeasure)eo;
				continue;
			}
			if ( eo instanceof ModularityMeasure ) {
				modularity = (ModularityMeasure)eo;
				continue;
			}
			if ( eo instanceof AdaptabilityRatioMeasure) {
				adaptabilityRatio = (AdaptabilityRatioMeasure)eo;
				continue;
			}
			if ( eo instanceof AdaptabilityTrend) {
				adaptabilityTrend = (AdaptabilityTrend)eo;
				continue;
			}
			if ( eo instanceof ModularityTrend) {
				modularityTrend = (ModularityTrend)eo;
				continue;
			}

			// categories
			if ( eo instanceof EndProductQuality) {
				endProductQuality = (EndProductQuality)eo;
				continue;
			}
			if ( eo instanceof InProgressIndicator) {
				inProgressIndicator = (InProgressIndicator)eo;
			}

		} // for commit

		// check input statistics
		// creates a list of missing items, if any
		StringBuffer sb = new StringBuffer();
		
		if ( projectScope == null ) {
			// try to find in parent model
			projectScope = findProjectScopeFromCommit(pc);
			if ( projectScope == null ) {
				sb.append("Project scope").append('\n');
			}
		}
		if ( cdcoc == null ) {
			sb.append("Critical defect change order count").append('\n');
		}
		if ( ndcoc == null ) {
			sb.append("Normal defect change order count").append('\n');
		}
		if ( icoc == null ) {
			sb.append("Improvement change order count").append('\n');
		}
		if ( nfcoc == null ) {
			sb.append("New feature change order count").append('\n');
		}
		if ( tcoc == null ) {
			sb.append("Total change order count").append('\n');
		}
		if ( cncoc == null ) {
			sb.append("Critical and normal change order count").append('\n');
		}
		if ( brokenSize == null ) {
			sb.append("Broken case size").append('\n');
		}
		if ( fixedSize == null ) {
			sb.append("Fixed case size").append('\n');
		}
		if ( totalSize == null ) {
			sb.append("Total case size").append('\n');
		}
		if ( baselineSize == null ) {
			sb.append("Baselined case size").append('\n');
		}
		if ( usageTime == null ) {
			sb.append("Usage time").append('\n');
		}
		if ( developmentEffort == null ) {
			sb.append("Development effort").append('\n');
		}
		if ( repairEffort == null ) {
			sb.append("Repair effort").append('\n');
		}

		// if any statistic missing, report and return
		if ( sb.length() > 0 ) {
			sb.insert(0, "The following statistics are missing:\n");
			reportIncomplete(sb.toString());
			return false;
		}
		
		// check whether categories are already present
		// if not, create them and add to the project commit
		if ( endProductQuality == null ) {
			endProductQuality = SpmFactory.eINSTANCE.createEndProductQuality();
			endProductQuality.setName("End Product Quality");
			pc.getModelElement().add(endProductQuality);
			CertWareLog.logInfo("Added end product quality characteristic to project commit");
		}
		if ( inProgressIndicator == null ) {
			inProgressIndicator = SpmFactory.eINSTANCE.createInProgressIndicator();
			inProgressIndicator.setName("In-Progress Indicator");
			pc.getModelElement().add(inProgressIndicator);
			CertWareLog.logInfo("Added in-progress indicator characteristic to project commit");
		}
		
		// check whether metrics are already present
		// in-progress quality
		if ( modularityTrend == null ) {
			modularityTrend = SpmFactory.eINSTANCE.createModularityTrend();
			modularityTrend.setName("Modularity Trend");
			modularityTrend.setBaseMeasure(modularity);
			modularityTrend.setLibrary(LIBRARY_TAG);
			modularityTrend.setScope(projectScope);
			modularityTrend.setTrait(inProgressIndicator);
			modularityTrend.setAccumulator(Accumulator.AVERAGE);
			modularityTrend.setUnit("SLOC/order-hr");
			modularityTrend.setTrait(inProgressIndicator);
			CertWareLog.logInfo("Added modularity trend measure to project commit");
		}
		if ( adaptabilityTrend == null ) {
			adaptabilityTrend = SpmFactory.eINSTANCE.createAdaptabilityTrend();
			adaptabilityTrend.setName("Adaptability Trend");
			adaptabilityTrend.setBaseMeasure(adaptabilityRatio);
			adaptabilityTrend.setLibrary(LIBRARY_TAG);
			adaptabilityTrend.setScope(projectScope);
			adaptabilityTrend.setAccumulator(Accumulator.AVERAGE);
			adaptabilityTrend.setUnit("hr/SLOC-hr");
			adaptabilityTrend.setTrait(inProgressIndicator);
			CertWareLog.logInfo("Added adaptability trend measure to project commit");
		}
		if ( maturityTrend == null ) {
			maturityTrend = SpmFactory.eINSTANCE.createMaturityTrend();
			maturityTrend.setName("Maturity Trend");
			maturityTrend.setBaseMeasure(maturityRatio);
			maturityTrend.setLibrary(LIBRARY_TAG);
			maturityTrend.setScope(projectScope);
			maturityTrend.setAccumulator(Accumulator.AVERAGE);
			maturityTrend.setUnit("hr/SLOC-hr");
			maturityTrend.setTrait(inProgressIndicator);
			CertWareLog.logInfo("Added maturity trend measure to project commit");
		}
		if ( reworkStability == null ) {
			reworkStability = SpmFactory.eINSTANCE.createReworkStabilityMeasure();
			reworkStability.setName("Rework Stability");
			reworkStability.setLibrary(LIBRARY_TAG);
			reworkStability.setFunctor("subtract");
			reworkStability.setBaseMeasure1(brokenSize);
			reworkStability.setBaseMeasure2(fixedSize);
			reworkStability.setUnit("SLOC");
			reworkStability.setScope(projectScope);
			reworkStability.setTrait(inProgressIndicator);
			CertWareLog.logInfo("Added rework stability measure to project commit");
		}
		if ( reworkBacklog == null ) {
			reworkBacklog = SpmFactory.eINSTANCE.createReworkBacklogMeasure();
			reworkBacklog.setName("Rework Backlog");
			reworkBacklog.setLibrary(LIBRARY_TAG);
			reworkBacklog.setBaseMeasure1(reworkStability);
			reworkBacklog.setBaseMeasure2(baselineSize);
			reworkBacklog.setFunctor(FUNCTOR_DIVIDE);
			reworkBacklog.setUnit("");
			reworkBacklog.setScope(projectScope);
			reworkBacklog.setTrait(inProgressIndicator);
			CertWareLog.logInfo("Added rework backlog measure to project commit");
		}

		// end-product quality
		if ( scrapRatio == null ) {
			scrapRatio = SpmFactory.eINSTANCE.createScrapRatioMeasure();
			scrapRatio.setName("Scrap Ratio");
			scrapRatio.setLibrary(LIBRARY_TAG);
			scrapRatio.setBaseMeasure1(brokenSize);
			scrapRatio.setBaseMeasure2(totalSize);
			scrapRatio.setFunctor(FUNCTOR_DIVIDE);
			scrapRatio.setUnit("");
			scrapRatio.setScope(projectScope);
			scrapRatio.setTrait(endProductQuality);
			CertWareLog.logInfo("Added scrap ratio measure to project commit");
		}
		if ( adaptabilityRatio == null ) {
			adaptabilityRatio = SpmFactory.eINSTANCE.createAdaptabilityRatioMeasure();
			adaptabilityRatio.setName("Adaptability");
			adaptabilityRatio.setLibrary(LIBRARY_TAG);
			adaptabilityRatio.setBaseMeasure1(repairEffort);
			adaptabilityRatio.setBaseMeasure2(tcoc);
			adaptabilityRatio.setFunctor(FUNCTOR_DIVIDE);
			adaptabilityRatio.setUnit("hr/SLOC");
			adaptabilityRatio.setScope(projectScope);
			adaptabilityRatio.setTrait(endProductQuality);
			CertWareLog.logInfo("Added adaptability ratio measure to project commit");
		}
		if ( modularity == null ) {
			modularity = SpmFactory.eINSTANCE.createModularityMeasure();
			modularity.setName("Modularity");
			modularity.setLibrary(LIBRARY_TAG);
			modularity.setBaseMeasure1(brokenSize);
			modularity.setBaseMeasure2(tcoc);
			modularity.setFunctor(FUNCTOR_DIVIDE);
			modularity.setUnit("");
			modularity.setScope(projectScope);
			modularity.setTrait(endProductQuality);
			CertWareLog.logInfo("Added modularity measure to project commit");
		}
		if ( reworkRatio == null ) {
			reworkRatio = SpmFactory.eINSTANCE.createReworkRatioMeasure();
			reworkRatio.setName("Rework Ratio");
			reworkRatio.setLibrary(LIBRARY_TAG);
			reworkRatio.setBaseMeasure1(repairEffort);
			reworkRatio.setBaseMeasure2(developmentEffort);
			reworkRatio.setFunctor(FUNCTOR_DIVIDE);
			reworkRatio.setUnit("");
			reworkRatio.setScope(projectScope);
			reworkRatio.setTrait(endProductQuality);
			CertWareLog.logInfo("Added rework ratio measure to project commit");
		}
		if ( maintainability == null ) {
			maintainability = SpmFactory.eINSTANCE.createMaintainabilityMeasure();
			maintainability.setName("Maintainability");
			maintainability.setLibrary(LIBRARY_TAG);
			maintainability.setBaseMeasure1(scrapRatio);
			maintainability.setBaseMeasure2(reworkRatio);
			maintainability.setFunctor(FUNCTOR_DIVIDE);
			maintainability.setUnit("");
			maintainability.setScope(projectScope);
			maintainability.setTrait(endProductQuality);
			CertWareLog.logInfo("Added maintainability measure to project commit");
		}
		if ( maturityRatio == null ) {
			maturityRatio = SpmFactory.eINSTANCE.createMaturityRatioMeasure();
			maturityRatio.setName("Maturity Ratio");
			maturityRatio.setLibrary(LIBRARY_TAG);
			maturityRatio.setBaseMeasure1(usageTime);
			maturityRatio.setBaseMeasure2(cncoc);
			maturityRatio.setFunctor(FUNCTOR_DIVIDE);
			maturityRatio.setUnit("hr/order");
			maturityRatio.setScope(projectScope);
			maturityRatio.setTrait(endProductQuality);
			CertWareLog.logInfo("Added maturity ratio measure to project commit");
		}

		// at this point we have all statistics, and the categories and metrics are in the commit
		// compute metrics, putting the measurement values into the front of the measurement list
		computeMetric( modularityTrend, clearMeasurements );
		computeMetric( adaptabilityTrend, clearMeasurements );
		computeMetric( maturityTrend, clearMeasurements );
		
		computeMetric( reworkStability, clearMeasurements );
		computeMetric( reworkBacklog, clearMeasurements );
		
		computeMetric( scrapRatio, clearMeasurements );
		computeMetric( adaptabilityRatio, clearMeasurements);
		computeMetric( modularity, clearMeasurements );
		computeMetric( reworkRatio, clearMeasurements );
		computeMetric( maintainability, clearMeasurements );
		computeMetric( maturityRatio, clearMeasurements );

		String name = getName(pc);
		CertWareLog.logInfo(String.format("%s %s","Computed core metrics for commit",name));
		return true;
	}

	/**
	 * Finds the project scope element in the project model container.
	 * @param pc project commit, presumed to be contained by a project model element
	 * @return project scope element or null if not found searching the project model
	 */
	private ProjectScope findProjectScopeFromCommit(ProjectCommit pc) {
		ProjectModel pm = (ProjectModel)pc.eContainer();
		TreeIterator<?> ti = pm.eAllContents();
		while( ti.hasNext() ) {
			EObject eo = (EObject)ti.next();
			if ( eo instanceof ProjectScope ) {
				return (ProjectScope)eo;
			}
		}
		return null;
	}

	/**
	 * Gets a list of the annotations attached to a project commit element.
	 * Builds the list with each annotation separated by a comma character.
	 * @param pc project commit
	 * @return string delimited by commas
	 */
	private String getName(ProjectCommit pc) {
		EList<Annotation> annotations = pc.getAnnotation();
		StringBuffer sb = new StringBuffer();
		boolean subsequentPass = false;
		for ( Annotation a : annotations ) { 
			if ( subsequentPass ) {
				sb.append( ',' );
			}
			sb.append( a.getText() );
			subsequentPass = true;
		}
		return sb.toString();
	}
	/**
	 * Computes the averages of the items in the measurement list.
	 * @param items list of measurement items, assumed to be {@code DimensionalMeasurement} types.
	 * @return average, or {@code POSITIVE_INFINITY} if count of dimensional measurement is zero.
	 */
	protected double computeAverage(EList<Measurement> items) {
		double sum = 0.0;
		int n = 0;
		
		for ( Measurement measurement : items ) {
			if ( measurement instanceof DimensionalMeasurement ) {
				DimensionalMeasurement dm = (DimensionalMeasurement)measurement;
				sum += dm.getValue();
				n++;
			}
		}

		if ( n == 0 )
			return Double.POSITIVE_INFINITY;

		return sum / n; 
	}

	/**
	 * Computes the maximum of the items in the measurement list.
	 * @param items list of measurement items, assumed to be {@code DimensionalMeasurement} types.
	 * @return average, or {@code NaN} if count of dimensional measurement is zero.
	 */
	protected double computeMaximum(EList<Measurement> items) {
		double max = Double.NaN;
		
		for ( Measurement measurement : items ) {
			if ( measurement instanceof DimensionalMeasurement ) {
				DimensionalMeasurement dm = (DimensionalMeasurement)measurement;
				if ( max == Double.NaN ) {
					max = dm.getValue();
				} else {
					max = Math.max(max, dm.getValue());
				}
			}
		}

		return max; 
	}

	/**
	 * Computes the minimum of the items in the measurement list.
	 * @param items list of measurement items, assumed to be {@code DimensionalMeasurement} types.
	 * @return average, or {@code NaN} if count of dimensional measurement is zero.
	 */
	protected double computeMinimum(EList<Measurement> items) {
		double min = Double.NaN;
		
		for ( Measurement measurement : items ) {
			if ( measurement instanceof DimensionalMeasurement ) {
				DimensionalMeasurement dm = (DimensionalMeasurement)measurement;
				if ( min == Double.NaN ) {
					min = dm.getValue();
				} else {
					min = Math.min(min, dm.getValue());
				}
			}
		}

		return min; 
	}

	/**
	 * Creates an observation record to be attached to a computed metric measurement.
	 * @return observation with tool, observer, and when-observed fields set
	 */
	public Observation computeObservation() {
		Observation obs = SmmFactory.eINSTANCE.createObservation();
		obs.setObserver(OBSERVATION_OBSERVER);
		obs.setTool(OBSERVATION_TOOL);
		obs.setWhenObserved(new Date());
		return obs;
	}
	
	/**
	 * Computes a trend measure's results given its base measurement and values.
	 * Assumes the single base measure is a dimensional measure with measurements available.
	 * Uses the measurement at index zero from the base measure.
	 * Inserts the result as a measurement at index zero for the given trend measure.
	 * Creates an observation to attach to the measurement with the current time stamp.
	 * @param tm trend measure, the aggregation type is unused here (e.g. average not performed)
	 * @param clear whether to clear the measurement results list before inserting new result at front
	 * @return true if computation completed without encountering nulls
	 */
	public boolean computeMetric( TrendMeasure tm, boolean clear ) {
		
		// check that the measure and measurement is not null
		DimensionalMeasure dm = tm.getBaseMeasure();
		
		if ( dm == null ) {
			return false;
		}

		if ( dm.getMeasurement() == null ) {
			return false;
		}
		
		double answer = Double.NaN;

		// compute answer based on accumulator
		if ( tm.getAccumulator() == Accumulator.AVERAGE ) {
			answer = computeAverage( dm.getMeasurement() );
		} else if ( tm.getAccumulator() == Accumulator.MAXIMUM ) {
			answer = computeMaximum( dm.getMeasurement() );
		} else if ( tm.getAccumulator() == Accumulator.MINIMUM ) {
			answer = computeMinimum( dm.getMeasurement() );
		}
		
		// create an observation reflecting calculated value
		Observation obs = computeObservation();
		
		// create a new measurement with this answer and observation
		AggregatedMeasurement result = SmmFactory.eINSTANCE.createAggregatedMeasurement();
		result.setValue(answer);
		result.setObservation(obs);
		result.setError(MEASUREMENT_ERROR);

		// whether to clear earlier measurements from the results measurement list
		if ( clear ) {
			dm.getMeasurement().clear();
		}
		
		// insert the measurement at the front of the measurement list
		dm.getMeasurement().add(0, result);
		
		return true;
	}
	/**
	 * Computes a binary measure's results given its base measurements and values.
	 * Assumes both base measures are dimensional measures with measurements available.
	 * Uses the measurement at index zero from each base measure.
	 * Inserts the result as a measurement at index zero for the given binary measure.
	 * Creates an observation to attach to the measurement with the current time stamp.
	 * @param bm binary measure, using functor value to identify math operation
	 * @param clear whether to clear the measurement results list before inserting new result at front
	 * @return true if computation completed without encountering nulls or divides-by-zero
	 */
	public boolean computeMetric( BinaryMeasure bm, boolean clear ) {
		
		// check that the measures and measurements are not null
		DimensionalMeasure m1 = bm.getBaseMeasure1();
		DimensionalMeasure m2 = bm.getBaseMeasure2();
		
		if ( m1 == null || m2 == null ) { 
			return false;
		}
		
		if ( m1.getMeasurement() == null || m2.getMeasurement() == null ) {
			return false;
		}
		
		DimensionalMeasurement s1 = (DimensionalMeasurement) m1.getMeasurement().get(0);
		DimensionalMeasurement s2 = (DimensionalMeasurement) m2.getMeasurement().get(0);
		
		if ( s1 == null || s2 == null ) {
			return false;
		}

		// compute answer based on functor value
		double answer = 0.0;
		if ( bm.getFunctor() == null ) {
			CertWareLog.logWarning(String.format("%s %s","Missing functor in binary measure",bm.getName()));
			return false;
		}
		if ( bm.getFunctor().equalsIgnoreCase(FUNCTOR_ADD) ) {
			answer = s1.getValue() + s2.getValue();
		} else if ( bm.getFunctor().equalsIgnoreCase(FUNCTOR_DIVIDE) ) {
			if ( s2.getValue() == 0.0 )
				return false;
			answer = s1.getValue() / s2.getValue();
		} else if ( bm.getFunctor().equalsIgnoreCase(FUNCTOR_MULTIPLY)) {
			answer = s1.getValue() * s2.getValue();
		} else if ( bm.getFunctor().equalsIgnoreCase(FUNCTOR_SUBTRACT)) {
			answer = s1.getValue() - s2.getValue();
		}
		
		// create an observation reflecting calculated value
		Observation obs = computeObservation();
		
		// create a new measurement with this answer and observation
		AggregatedMeasurement result = SmmFactory.eINSTANCE.createAggregatedMeasurement();
		result.setValue(answer);
		result.setObservation(obs);
		result.setError(MEASUREMENT_ERROR);

		// whether to clear earlier measurements from the results measurement list
		if ( clear ) {
			bm.getMeasurement().clear();
		}
		
		// insert the measurement at the front of the measurement list
		bm.getMeasurement().add(0, result);
		
		return true;
	}

	/**
	 * Sets a statistic value by creating a new measurement to attach to the measure.
	 * Presumes statistic is a collective measure, attaching a direct measurement.
	 * @param statistic statistic measure
	 * @param value statistic value
	 * @param clear whether to clear the measurement list
	 * @return false if statistic is null, true otherwise
	 */
	public boolean setStatistic(CollectiveMeasure statistic, double value, boolean clear) {
		if ( statistic == null )
			return false;
		
		DirectMeasurement dm = SmmFactory.eINSTANCE.createDirectMeasurement();
		dm.setValue(value);
		dm.setObservation( computeObservation() );
		dm.setError(MEASUREMENT_ERROR);
		
		if ( clear ) {
			statistic.getMeasurement().clear();
		}
		
		// insert the measurement at the front
		statistic.getMeasurement().add(0, dm);

		return true;
	}

	/**
	 * Sets a statistic value by creating a new measurement to attach to the measure.
	 * Presumes statistic is a time-dimensional measure, attaching a direct measurement.
	 * @param statistic statistic measure
	 * @param value statistic value
	 * @param clear whether to clear the measurement list
	 * @return false if statistic is null, true otherwise
	 */
	public boolean setStatistic(TimeDimensionalMeasure statistic, double value, boolean clear) {
		if ( statistic == null )
			return false;
		
		DirectMeasurement dm = SmmFactory.eINSTANCE.createDirectMeasurement();
		dm.setValue(value);
		dm.setObservation( computeObservation() );
		dm.setError(MEASUREMENT_ERROR);
		
		if ( clear ) {
			statistic.getMeasurement().clear();
		}
		
		// insert the measurement at the front
		statistic.getMeasurement().add(0, dm);

		return true;
	}

	/**
	 * Reports a warning that a prerequisite statistic is missing.
	 * @param message message to display to log and message dialog
	 */
	private void reportIncomplete(String message) {
		CertWareLog.logWarning(message);
		if ( latestPart != null && latestPart.getSite() != null ) {
			MessageDialog.openWarning(latestPart.getSite().getShell(), "Statistics Incomplete", message);
		}
	}
}
