package net.certware.evidence.hugin.view.jobs;

import il2.inf.map.MapSearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.Activator;
import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;
import net.certware.evidence.hugin.view.preferences.PreferenceConstants;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.IPreferenceStore;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.Prune;
import edu.ucla.belief.StateNotFoundException;
import edu.ucla.belief.VariableImpl;
import edu.ucla.belief.inference.JEngineGenerator;
import edu.ucla.belief.inference.JoinTreeInferenceEngineImpl;
import edu.ucla.belief.inference.JoinTreeSettings;
import edu.ucla.belief.inference.map.ExactMap;
import edu.ucla.belief.inference.map.InitializationMethod;
import edu.ucla.belief.inference.map.MapRunner;
import edu.ucla.belief.inference.map.SearchMethod;
import edu.ucla.util.AbstractStringifier;

/**
 * A job to perform the MAP estimate calculation.
 * @author mrb
 * @since 1.2.1
 */
public class MapCalculationJob extends Job
{
	/** bail-out message */
	private final static String CANCEL_MSG = "Canceled MAP estimate before completion";
	/** network model */
	private final BeliefNetwork initialNetwork;
	/** view for reporting and model access */
	private ViewTree view;
	/** tree viewer nodes for selection access */
	private List<VariableNode> nodes;

	/**
	 * Constructor saves the network and view references.
	 * @param jobName export job name for reporting
	 * @param view view part reference
	 */
	public MapCalculationJob(String jobName, ViewTree view) {
		super(jobName);
		assert(view !=  null);
		this.view = view;
		this.initialNetwork = view.getSelectedNetwork();
		this.nodes = view.getVariableNodes();
	}

	/**
	 * Job family membership.
	 * @param family family ID, test against core CertWare ID    
	 * @return true if ID matches, otherwise returns value from superclass  
	 */
	public boolean belongsTo(final Object family) {
		if (family.equals(CertWareUI.PLUGIN_ID)) {
			return true;
		}
		return super.belongsTo(family);
	}

	/**
	 * Production method for computations.
	 * @param monitor progress monitor    
	 * @return CANCEL or OK  
	 */
	public IStatus produce(IProgressMonitor monitor) {
		/** network name for messages */
		String networkName = "undefined"; //$NON-NLS-1$
		/** whether the exact calculation method is selected in preferences */
		boolean exactCalculation = false;

		try {
			if ( initialNetwork == null ) {
				cancel();
				CertWareLog.logWarning("Network not defined for calculation");
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			if ( nodes.isEmpty() ) {
				cancel();
				CertWareLog.logWarning("No variable selections available for MAP calculation");
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			// network name from loaded file
			networkName = view.getSelectedFile().getName();

			// initialize MAP variables from selections
			Set setMAPVariables = new HashSet();
			for ( VariableNode v : nodes ) {
				if ( v.isSelected() ) {
					setMAPVariables.add( v.getNode() ); 
				}
			}

			// initialize evidence from selections
			Map evidence = new HashMap();
			for ( VariableNode vn : nodes ) {
				for ( VariableNodeState vns : vn.states ) {
					if ( vns.isSelected() ) {
						FiniteVariable fv = vn.getNode();
						evidence.put( fv, fv.instance(vns.getStateName()) );
					}
				}
			}

			// instantiation formatter
			VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );

			// fetch preferences
			IPreferenceStore ps = Activator.getDefault().getPreferenceStore();
			String method = ps.getString(PreferenceConstants.P_MAP_COMPUTATION_METHOD);
			if ( method.equals(PreferenceConstants.P_MAP_COMPUTATION_METHOD_EXACT)) {
				exactCalculation = true;
			}
			
			monitor.worked(1);
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			// perform exact or approximate calculation
			if ( exactCalculation ) {
			    // time limit, zero is unlimited
			    int timeoutsecs = ps.getInt(PreferenceConstants.P_MAP_TIMEOUT);
			    timeoutsecs = Math.max(timeoutsecs, 0);

			    // width barrier, zero is unlimited
			    int widthbarrier = ps.getInt(PreferenceConstants.P_MAP_WIDTH_BARRIER);
			    widthbarrier = Math.max(widthbarrier, 0);

			    // non-sloppy version of engine
			    MapSearch.MapInfo mapinfo = ExactMap.computeMap( initialNetwork, setMAPVariables, evidence, timeoutsecs, widthbarrier );
			    MapSearch.MapResult exactmapresult = (MapSearch.MapResult) mapinfo.results.iterator().next();
			    Map instantiation = exactmapresult.getConvertedInstatiation();

			    VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );

				monitor.worked(3);
				if ( monitor.isCanceled() ) {
					CertWareLog.logWarning(CANCEL_MSG);
					return Status.CANCEL_STATUS;
				}

				// update results in view
				// job runs in a different thread, so ensure updates done in UI thread
				view.setProbabilityLabel("p(MAP,e)");
				view.setProbability( exactmapresult.score ); // p(map,e)
				view.setEvidenceLabel("p(MAP|e)");
				view.setEvidence( mapinfo.finished ? "Result is exact" : "Computation did not finish" ); // p(map|e)
				view.setSearchTime( exactmapresult.foundTime );
				view.setInitializationTime("N/A");
				view.setInstantiation(instantiation.toString());
				view.setSearch("N/A");
				view.setInitialization("N/A");
				view.setSteps("N/A");
				view.layout();

			} // exact
			else 
			{ // approximate
				int steps = ps.getInt(PreferenceConstants.P_MAP_SEARCH_STEPS);
				steps = Math.max(1, steps);

				// prune first
				BeliefNetwork networkUnpruned = initialNetwork;
				Set variablesUnpruned = setMAPVariables;
				Map evidenceUnpruned = evidence;

				Map oldToNew = new HashMap( networkUnpruned.size() );
				Map newToOld = new HashMap( networkUnpruned.size() );
				Set queryVarsPruned = new HashSet( variablesUnpruned.size() );
				Map evidencePruned = new HashMap( evidenceUnpruned.size() );
				BeliefNetwork networkPruned = 
					Prune.prune( networkUnpruned, variablesUnpruned, evidenceUnpruned, oldToNew, newToOld, queryVarsPruned, evidencePruned );

				BeliefNetwork beliefNetwork = networkPruned;
				setMAPVariables = queryVarsPruned;
				evidence = evidencePruned;

				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					CertWareLog.logWarning(CANCEL_MSG);
					return Status.CANCEL_STATUS;
				}

				// create the inference engine
				JEngineGenerator generator = new JEngineGenerator();
				JoinTreeInferenceEngineImpl engine = 
					generator.makeJoinTreeInferenceEngineImpl( 
							beliefNetwork, 
							new JoinTreeSettings() );

				// set evidence
				try {
					beliefNetwork.getEvidenceController().setObservations( evidencePruned );
				} catch( StateNotFoundException e ) {
					CertWareLog.logError(String.format("%s %s","Calculating MAP",networkName), e);
					view.setWarningMessage(CANCEL_MSG);		    	
					return Status.CANCEL_STATUS;
				};

				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					CertWareLog.logWarning(CANCEL_MSG);
					view.setWarningMessage(CANCEL_MSG);
					return Status.CANCEL_STATUS;
				}

				// engine settings
				SearchMethod searchmethod = PreferenceConstants.getSearchMethod(ps.getString(PreferenceConstants.P_MAP_SEARCH_METHOD));
				InitializationMethod initializationmethod = PreferenceConstants.getInitializationMethod(ps.getString(PreferenceConstants.P_MAP_INITIALIZATION_METHOD));

				// create MAP runner and invoke
				MapRunner maprunner = new MapRunner();
				MapRunner.MapResult mapresult = 
					maprunner.approximateMap( beliefNetwork, engine, setMAPVariables, evidence, searchmethod, initializationmethod, steps );
				Map instantiation = mapresult.instantiation;

				monitor.worked(1);
				if ( monitor.isCanceled() ) {
					CertWareLog.logWarning(CANCEL_MSG);
					view.setWarningMessage(CANCEL_MSG);
					return Status.CANCEL_STATUS;
				}

				// update results in view
				// job runs in a different thread, so ensure updates done in UI thread
				view.setProbabilityLabel("p(MAP,e)");
				view.setProbability( mapresult.score ); // p(map,e)
				view.setEvidenceLabel("p(MAP|e)");
				view.setEvidence( mapresult.score / engine.probability() ); // p(map|e), exceptions caught
				view.setSearchTime( mapresult.searchDurationMillisProfiled, mapresult.searchDurationMillisElapsed);
				view.setInitializationTime( mapresult.initDurationMillisProfiled, mapresult.initDurationMillisElapsed);
				view.setInstantiation(instantiation.toString());
				view.setSearch( searchmethod );
				view.setInitialization(initializationmethod);
				view.setSteps(steps);
				view.layout();

				// clean up
				engine.die();
			} // approximate

		} catch( Exception e ) {
			CertWareLog.logError(String.format("%s %s","MAP calculation for",networkName), e);
			return Status.CANCEL_STATUS;
		}

		String doneMessage = String.format("%s %s %s","MAP calculation for", networkName, "complete.");
		CertWareLog.logInfo( doneMessage );
		return Status.OK_STATUS;
	}


	/**
	 * Runs the generator job, reporting to the given progress monitor.
	 * @param monitor progress monitor
	 * @return CANCEL or OK status 
	 */
	protected IStatus run(IProgressMonitor monitor) {

		int count = 5;
		monitor.beginTask("Computing MAP", count);
		IStatus rv = produce(monitor);

		if ( rv == Status.OK_STATUS ) {
			view.setInfoMessage("Completed MAP calculation");
			monitor.done();
		}

		return rv;
	}

}
