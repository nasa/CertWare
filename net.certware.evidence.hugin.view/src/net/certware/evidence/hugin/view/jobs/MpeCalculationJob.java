package net.certware.evidence.hugin.view.jobs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.VariableImpl;
import edu.ucla.belief.inference.map.MapEngine;
import edu.ucla.util.AbstractStringifier;

/**
 * A job to perform the MPE calculation.
 * @author mrb
 * @since 1.2.1
 */
public class MpeCalculationJob extends Job
{
	/** bail-out message */
	private final static String CANCEL_MSG = "Canceled MPE calculation before completion";
	/** network model */
	private final BeliefNetwork initialNetwork;
	/** view for reporting and model access */
	private ViewTree view;
	/** tree viewer nodes for selection access */
	private List<VariableNode> nodes;

	/**
	 * Constructor saves network and view references.
	 * @param jobName export job name for reporting
	 * @param view view part for reference
	 */
	public MpeCalculationJob(String jobName, ViewTree view) {
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

		try {
			if ( initialNetwork == null ) {
				cancel();
				CertWareLog.logWarning("Network not defined for calculation");
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			if ( nodes.isEmpty() ) {
				cancel();
				CertWareLog.logWarning("No variable selections available for MPE calculation");
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			// network name from loaded file
			networkName = view.getSelectedFile().getName();

			// initialize MPE variables from selections
			Set setMPEVariables = new HashSet();
			for ( VariableNode v : nodes ) {
				if ( v.isSelected() ) {
					setMPEVariables.add( v.getNode() ); 
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
			monitor.worked(1);
			
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				view.setWarningMessage(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

		    // create a new set of variables and remove those whose evidence have set keys
		    Set allVarsMinusEvidence = new HashSet( initialNetwork );
		    allVarsMinusEvidence.removeAll( evidence.keySet() );

		    // initialize a MapEngine and perform the MPE computation
		    MapEngine mpe = new MapEngine( initialNetwork, allVarsMinusEvidence, evidence );
			VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );

		    // results
		    double score = mpe.probability();
		    Map instantiation = mpe.getInstance();

			monitor.worked(2);
			if ( monitor.isCanceled() ) {
				CertWareLog.logWarning(CANCEL_MSG);
				return Status.CANCEL_STATUS;
			}

			// update results in view
			// job runs in a different thread, so ensure updates done in UI thread
			view.setProbabilityLabel("p(MPE,e)");
			view.setProbability( score ); // p(mpe,e)
			view.setEvidenceLabel("p(MPE|e)");
			view.setEvidence( "N/A" );
			view.setSearchTime( "N/A" );
			view.setInitializationTime("N/A");
			view.setInstantiation(instantiation.toString());
			view.setSearch("N/A");
			view.setInitialization("N/A");
			view.setSteps("N/A");
			view.layout();
			
			monitor.worked(1);

		} catch( Exception e ) {
			CertWareLog.logError(String.format("%s %s","MPE calculation for",networkName), e);
			return Status.CANCEL_STATUS;
		}

		String doneMessage = String.format("%s %s %s","MPE calculation for", networkName, "complete.");
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
		monitor.beginTask("Computing MPE", count);
		IStatus rv = produce(monitor);

		if ( rv == Status.OK_STATUS ) {
			view.setInfoMessage("Completed MPE calculation");
			monitor.done();
		}

		return rv;
	}

}
