package net.certware.evidence.hugin.view.jobs;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;

import edu.ucla.belief.CPTParameter;
import edu.ucla.belief.CPTShell;
import edu.ucla.belief.EliminationHeuristic;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.InferenceEngine;
import edu.ucla.belief.PartialDerivativeEngine;
import edu.ucla.belief.VariableImpl;
import edu.ucla.belief.inference.RCEngineGenerator;
import edu.ucla.belief.inference.RCSettings;
import edu.ucla.belief.io.PropertySuperintendent;
import edu.ucla.belief.sensitivity.SensitivityEngine;
import edu.ucla.belief.sensitivity.SensitivityReport;
import edu.ucla.belief.sensitivity.SingleCPTSuggestion;
import edu.ucla.belief.sensitivity.SingleParamSuggestion;
import edu.ucla.util.AbstractStringifier;
import edu.ucla.util.ProbabilityInterval;

/**
 * A job to perform the variable sensitivity calculation.
 * @author mrb
 * @since 1.2.1
 */
public class SensitivityCalculationJob extends AbstractCalculationJob
{
	/** user memory proportion for engine */
	static final double MEMORY_PROPORTION = 1.0;
	/** comparison operator, for fetch from view */
	String comparisonOperator = SensitivityEngine.OPERATOR_GTE;
	/** comparison constant, for fetch from view */
	double comparisonConstant = 0.0;
	
	/**
	 * Constructor saves network and view references.
	 * @param jobName export job name for reporting
	 * @param view view part for reference
	 */
	public SensitivityCalculationJob(String jobName, ViewTree view) {
		super(jobName,view);
	}

	/**
	 * Production method for computations.
	 * @param monitor progress monitor    
	 * @return CANCEL or OK  
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public IStatus produce(IProgressMonitor monitor) {
		/** network name for messages */
		String networkName = "undefined"; //$NON-NLS-1$

		try {
			if ( initialNetwork == null ) {
				cancel();
				CertWareLog.logWarning("Network not defined for calculation");
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			if ( nodes.isEmpty() ) {
				cancel();
				CertWareLog.logWarning("No variable selections available for sensitivity calculation");
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}
			
			// analysis settings
			// SensitivityEngine.OPERATOR_EQUALS (=), SensitivityEngine.OPERATOR_GTE (>=), SensitivityEngine.OPERATOR_LTE (<=)
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					comparisonOperator = view.getSensitivityOperator();
					comparisonConstant = view.getSensitivityThreshold();
				}
			});
			
			// set the elimination heuristic used, one of: MIN_FILL or MIN_SIZE
			// do not create an InferenceEngine optimized for only probability of evidence
			// set the fraction of full memory to use
			// create the cache allocation (very important)
			RCSettings settings = RCEngineGenerator.getSettings( (PropertySuperintendent)initialNetwork );
			settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL ); // TODO fetch from view interface or preferences
			settings.setPrEOnly( false );
			settings.setUserMemoryProportion( MEMORY_PROPORTION );
			settings.validateAllocation( initialNetwork );
			
			// network name from loaded file
			networkName = view.getSelectedFile().getName();
			
			// use the first selected variable value as reference
			// TODO bail out if more than one selected?  
			VariableNode firstNode = nodes.get(0);
			FiniteVariable firstVariable = firstNode.getNode();
			Object referenceValue = null;
			for ( VariableNodeState vns : firstNode.states ) {
				if ( vns.isSelected() ) {
					referenceValue = firstVariable.instance( vns.getStateName() );
				}
			}

			// initialize evidence from selections
			HashMap evidence = new HashMap();
			for ( VariableNode vn : nodes ) {
				for ( VariableNodeState vns : vn.states ) {
					if ( vns.isSelected() ) {
						FiniteVariable fv = vn.getNode();
						Object ev = fv.instance( vns.getStateName() );
						// skip this value if it is the reference value
						// if we include the reference value as evidence, sensitivity is always satisfied
						if ( ev != referenceValue ) {
							evidence.put( fv, fv.instance(vns.getStateName()) );
						}
					}
				}
			}

			// TODO remove
			System.err.println("using evidence " + evidence);
			System.err.println("using variable " + firstVariable + " value " + referenceValue );
			System.err.println("using operator " + comparisonOperator + " constant " + comparisonConstant);
			
			// instantiation formatter
			VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );
			monitor.worked(1);
			
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}
			
			// create the dynamator(edu.ucla.belief.inference.SynchronizedInferenceEngine$SynchronizedPartialDerivativeEngine)
			// create the inference engine
			RCEngineGenerator dynamator = new RCEngineGenerator();
			InferenceEngine engine = dynamator.manufactureInferenceEngine( initialNetwork );

			// set evidence
			initialNetwork.getEvidenceController().setObservations( evidence );

			monitor.worked(1);
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			// create the sensitivity engine
			SensitivityEngine sensitivityengine = new SensitivityEngine( 
							initialNetwork, 
							engine, 
							(PartialDerivativeEngine)engine, 
							new PrintWriter( System.out ) );

			monitor.worked(1);
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			// get the results
			SensitivityReport report = sensitivityengine.getResults( 
							/* varY */ firstVariable, 
							/* valueY */ referenceValue, 
							/* varZ */ (FiniteVariable)null, 
							/* valueZ */ (Object)null, 
							/* arithmetic operator */ (Object)null, 
							/* comparison operator */ comparisonOperator, 
							/* epsilon */ comparisonConstant, 
							/* flagSingleParameter */ true, 
							/* flagSingleCPT */ true );

			// update results in view
			LinkedHashMap<String,String> rows = new LinkedHashMap<String,String>();
			
			// whether already satisfied
			if ( report == null ) {
				rows.put("Sensitivity result:", "Constraint already satisfied");
			} else {
				List singleParameterSuggestions = report.generateSingleParamSuggestions();
				Map mapFiniteVariablesToSingleCPTSuggestions = report.getSingleCPTMap();

				// whether constraint cannot be satisfied
				if( singleParameterSuggestions.isEmpty() && mapFiniteVariablesToSingleCPTSuggestions.isEmpty() ) {
					rows.put("Sensitivity result:", "Constraint is unsatisfiable");
				} else {
					// constraint satisfaction suggestions
					for ( int suggestion = 0; suggestion < singleParameterSuggestions.size(); suggestion++ ) {
						SingleParamSuggestion sps = (SingleParamSuggestion)singleParameterSuggestions.toArray()[suggestion];
						rows.put("Suggestion #", Integer.toString(suggestion+1));
						rows.put("Variable", sps.getCPTParameter().toString() );
						rows.put("Current Value",Double.toString((Double)sps.getCurrentValue()));
						rows.put("Suggested Value",Double.toString((Double)sps.getSuggestedParameterValue()));
						rows.put("Log Odds Change", Double.toString(sps.getLogOddsChange()));
						addBlankRow(rows);
					}
					
					// single CPT multiple parameters
					rows.put("Single CPT Suggestions", "Multiple Parameter");
					for( Iterator iterator = mapFiniteVariablesToSingleCPTSuggestions.keySet().iterator(); iterator.hasNext(); ) {
						FiniteVariable target = (FiniteVariable)iterator.next();
						SingleCPTSuggestion singleSuggestion = (SingleCPTSuggestion) mapFiniteVariablesToSingleCPTSuggestions.get( target );
						addSuggestion(rows,target,singleSuggestion);
						addBlankRow(rows);
					}

					// single CPT single parameter
					rows.put("Single CPT Suggestions", "Single Parameter");
					int suggestionCount = mapFiniteVariablesToSingleCPTSuggestions.size();
					for ( int suggestion = 0; suggestion < suggestionCount; suggestion++ ) {
						SingleCPTSuggestion singleSuggestion = (SingleCPTSuggestion) mapFiniteVariablesToSingleCPTSuggestions.get(mapFiniteVariablesToSingleCPTSuggestions.keySet().toArray()[suggestion]);
						ProbabilityInterval[] c1intervals = singleSuggestion.probabilityIntervals();
						FiniteVariable fv = singleSuggestion.getVariable();
						CPTShell shell = fv.getCPTShell();
						int x = 0;
						for ( CPTParameter ptp : shell.getCPTParameters() ) {
							rows.put(""+ptp.getJointInstance().getInstance(), 
									String.format("%f %s", ptp.getValue(), c1intervals[x++].toString()));
						}
						addSuggestion(rows,fv,singleSuggestion);
						addBlankRow(rows);
					}
				}
			}
			
			view.addResult(rows);
			engine.die();
			monitor.worked(1); 

		} catch( Exception e ) {
			CertWareLog.logError(String.format("%s %s","Sensitivity calculation for",networkName), e);
			return Status.CANCEL_STATUS;
		} catch (Throwable e) {
			CertWareLog.logError(String.format("%s %s","Sensitivity calculation for",networkName), e);
			return Status.CANCEL_STATUS;
		}

		String doneMessage = String.format("%s %s %s","Sensitivity calculation for", networkName, "complete.");
		CertWareLog.logInfo( doneMessage );
		return Status.OK_STATUS;
	}


	/**
	 * Runs the generator job, reporting to the given progress monitor.
	 * @param monitor progress monitor
	 * @return CANCEL or OK status 
	 */
	protected IStatus run(IProgressMonitor monitor) {

		int count = 4;
		monitor.beginTask("Computing sensitivity", count);
		IStatus rv = produce(monitor);

		if ( rv == Status.OK_STATUS ) {
			view.setInfoMessage("Completed sensitivity calculation");
			monitor.done();
		}

		return rv;
	}

	/**
	 * Adds a blank row consisting of two empty strings.
	 * @param rows row map for results output
	 */
	@SuppressWarnings({ })
	private void addBlankRow(HashMap<String,String> rows) {
		rows.put("", ""); // blank line //$NON-NLS-1$,$NON-NLS-2$
	}

	/**
	 * Adds standard lines for a sensitivity suggestion.
	 * @param rows row map for results output
	 * @param fv finite variable from network
	 * @param suggestion single CPT suggestion
	 */
	private void addSuggestion(HashMap<String,String> rows, FiniteVariable fv, SingleCPTSuggestion suggestion) {
		rows.put(String.format("Suggestion for %s's CPT",fv.getID()),
				String.format("Log Odds Change %f",suggestion.getLogOddsChange()));
		rows.put(suggestion.toString(), ""); //$NON-NLS-1$
	}

}
