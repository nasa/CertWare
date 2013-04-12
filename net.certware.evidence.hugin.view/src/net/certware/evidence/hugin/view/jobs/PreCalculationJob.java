package net.certware.evidence.hugin.view.jobs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import edu.ucla.belief.EliminationHeuristic;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.InferenceEngine;
import edu.ucla.belief.StateNotFoundException;
import edu.ucla.belief.VariableImpl;
import edu.ucla.belief.inference.JEngineGenerator;
import edu.ucla.belief.inference.JoinTreeSettings;
import edu.ucla.belief.io.PropertySuperintendent;
import edu.ucla.util.AbstractStringifier;

/**
 * A job to perform the Pr(e) calculation and marginals.
 * @author mrb
 * @since 1.2.1
 */
public class PreCalculationJob extends AbstractCalculationJob
{
	/**
	 * Constructor saves network and view references.
	 * @param jobName export job name for reporting
	 * @param view view part for reference
	 */
	public PreCalculationJob(String jobName, ViewTree view) {
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
				CertWareLog.logWarning("No variable selections available for Pr(e) calculation");
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			// network name from loaded file
			networkName = view.getSelectedFile().getName();

			// initialize variables from selections
			Set setPreVariables = new HashSet();
			for ( VariableNode v : nodes ) {
				if ( v.isSelected() ) {
					setPreVariables.add( v.getNode() ); 
				}
			}

			// initialize evidence from selections
			HashMap evidence = new HashMap();
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
			monitor.worked(1);
			
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			/*
		    // create a new set of variables and remove those whose evidence have set keys
		    Set allVarsMinusEvidence = new HashSet( initialNetwork );
		    allVarsMinusEvidence.removeAll( evidence.keySet() );

		    // initialize a MapEngine and perform the MPE computation
		    MapEngine mpe = new MapEngine( initialNetwork, allVarsMinusEvidence, evidence );
			VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );
			*/
			
		    // create the dynamator
		    JEngineGenerator dynamator = new JEngineGenerator();

		    // edit settings
		    JoinTreeSettings settings = dynamator.getSettings( (PropertySuperintendent)initialNetwork, true );

		    // define the elimination order heuristic used to create the join tree
		    settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL );

		    // create the inference engine
		    InferenceEngine engine = dynamator.manufactureInferenceEngine( initialNetwork );

		    // set the observations
		    try {
		      initialNetwork.getEvidenceController().setObservations( evidence );
		    } catch( StateNotFoundException e ) {
		    	CertWareLog.logError("Performing Pr(e) query",e);
		    	view.setErrorMessage(e.getMessage());
		    	return null;
		    };

		    // results
		    double score = engine.probability();
		    // Map instantiation = engine.getInstance();

			monitor.worked(2);
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}
			
			// reset marginals 
			// clearMarginals();
			setMarginals(engine);
			
			// update results in view
			LinkedHashMap<String,String> rows = new LinkedHashMap<String,String>();
			rows.put("Pr(e)",getProbability(score));
			view.addResult(rows);
			
			monitor.worked(1);

		} catch( Exception e ) {
			CertWareLog.logError(String.format("%s %s","Pr(e) query for",networkName), e);
			return Status.CANCEL_STATUS;
		}

		String doneMessage = String.format("%s %s %s","Pr(e) query for", networkName, "complete.");
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
		monitor.beginTask("Computing Pr(e)", count);
		IStatus rv = produce(monitor);

		if ( rv == Status.OK_STATUS ) {
			view.setInfoMessage("Completed Pr(e) calculation");
			monitor.done();
		}

		return rv;
	}

}
