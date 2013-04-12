package net.certware.evidence.hugin.view.jobs;

import java.text.NumberFormat;
import java.util.List;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.InferenceEngine;
import edu.ucla.belief.Table;
import edu.ucla.belief.inference.map.InitializationMethod;
import edu.ucla.belief.inference.map.SearchMethod;

/**
 * An abstract job template for inference engine calculations.
 * @author mrb
 * @since 1.2.1
 */
public abstract class AbstractCalculationJob extends Job
{
	/** bail-out message */
	protected final static String CANCEL_MSG = "Canceled calculation before completion";
	/** network model */
	protected final BeliefNetwork initialNetwork;
	/** view for reporting and model access */
	protected ViewTree view;
	/** tree viewer nodes for selection access */
	protected List<VariableNode> nodes;
	/** maximum fraction formatting digits */
	protected static final int MAX_DIGITS = 8;
	/** minimum fraction formatting digits */
	protected static final int MIN_DIGITS = 3;


	/**
	 * Constructor saves the network and view references.
	 * @param jobName export job name for reporting
	 * @param view view part reference
	 */
	public AbstractCalculationJob(String jobName, ViewTree view) {
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
	public abstract IStatus produce(IProgressMonitor monitor);


	/**
	 * Runs the generator job, reporting to the given progress monitor.
	 * @param monitor progress monitor
	 * @return CANCEL or OK status 
	 */
	protected abstract IStatus run(IProgressMonitor monitor);

	/**
	 * Set the search display value.
	 * @param search method used in computation 
	 */
	public String getSearch(final SearchMethod sm) {
		return sm == SearchMethod.HILL ? "Hill Climbing" : "Taboo" ;
	}

	/**
	 * Set the search initialization display value.
	 * @param search initialization used in computation 
	 */
	public String getInitialization(final InitializationMethod im) {
		String s = "Random";
		if ( im == InitializationMethod.MPE ) {
			s = "MPE";
		} else if ( im == InitializationMethod.SEQ ) {
			s = "Sequential";
		} else if ( im == InitializationMethod.ML ) {
			s = "Maximum Likelihood";
		}
		return s;
	}

	/**
	 * Set the steps display value.
	 * @param i steps preference value used
	 */
	public String getSteps(final int i) {
		String rv = "";
		try {
			final NumberFormat nf = NumberFormat.getIntegerInstance();
			nf.setGroupingUsed(true);
			rv = nf.format(i);
		} catch( Exception e ) {
			String message = String.format("%s %s","Formatting steps setting",e.toString());
			view.setWarningMessage(message);
			CertWareLog.logWarning(message);
		}
		return rv;
	}

	/**
	 * Set the search time result value.  Provides both profiled (CPU) and elapsed times.
	 * @param profiled profiled time in milliseconds
	 * @param elapsed elapsed time in milliseconds
	 */
	public String getSearchTime(final double profiled, final double elapsed) {
		final NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setGroupingUsed(true);
		nf.setMaximumFractionDigits(MAX_DIGITS);
		nf.setMinimumFractionDigits(MIN_DIGITS);
		String rv = "";
		try {
			String profiledTime = String.format("%s %s",nf.format(profiled),"ms");
			String elapsedTime = String.format("%s %s",nf.format(elapsed),"ms");
			rv = String.format("%s CPU, %s elapsed",profiledTime,elapsedTime);
		} catch( Exception e ) {
			String message = String.format("%s %s","Formatting search time result",e.toString());
			view.setWarningMessage(message);
			CertWareLog.logWarning(message);
		}
		return rv;
	}

	/**
	 * Set the exact calculation time result value. 
	 * @param elapsed elapsed time in milliseconds
	 */
	public String getSearchTime(final long elapsed) {
		String rv = "";
		try {
			final NumberFormat nf = NumberFormat.getIntegerInstance();
			nf.setGroupingUsed(true);
			String elapsedTime = String.format("%s %s",nf.format(elapsed),"ms");
			rv = String.format("%s elapsed",elapsedTime);
		} catch( Exception e ) {
			String message = String.format("%s %s","Formatting search time result",e.toString());
			view.setWarningMessage(message);
			CertWareLog.logWarning(message);
		}
		return rv;
	}

	/**
	 * Set the initialization time result value.  Provides both profiled (CPU) and elapsed times.
	 * @param profiled profiled time in milliseconds
	 * @param elapsed elapsed time in milliseconds
	 */
	public String getInitializationTime(final double profiled, final double elapsed) {
		String rv = "";
		final NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setGroupingUsed(true);
		nf.setMaximumFractionDigits(MAX_DIGITS);
		nf.setMinimumFractionDigits(MIN_DIGITS);
		try {
			String profiledTime = String.format("%s %s",nf.format(profiled),"ms");
			String elapsedTime = String.format("%s %s",nf.format(elapsed),"ms");
			rv = String.format("%s CPU, %s elapsed",profiledTime,elapsedTime);

		} catch( Exception e ) {
			String message = String.format("%s %s","Formatting initialization time result",e.toString());
			view.setWarningMessage(message);
			CertWareLog.logWarning(message);
		}
		return rv;
	}

	/**
	 * Set the probability p(map,e) or p(mpe,e) result value.
	 * @param d new value
	 */
	public String getProbability(final double d) {
		final NumberFormat nf = NumberFormat.getNumberInstance();
		String rv = "";
		try {
			nf.setGroupingUsed(true);
			nf.setMaximumFractionDigits(MAX_DIGITS);
			nf.setMinimumFractionDigits(MIN_DIGITS);
			rv = nf.format(d);
		} catch( Exception e ) {
			String message = String.format("%s %s","Formatting p(map,e) result",e.toString());
			view.setWarningMessage(message);
			CertWareLog.logWarning(message);
		} 
		return rv;
	}

	/**
	 * Set the evidence p(map|e) result value.
	 * @param d new value
	 */
	public String getEvidence(final double d) {
		final NumberFormat nf = NumberFormat.getNumberInstance();
		String rv = "";
		try {
			nf.setGroupingUsed(true);
			nf.setMaximumFractionDigits(MAX_DIGITS);
			nf.setMinimumFractionDigits(MIN_DIGITS);
			rv = nf.format(d);
		} catch( Exception e ) {
			String message = String.format("%s %s","Formatting p(map|e) result",e.toString());
			view.setWarningMessage(message);
			CertWareLog.logWarning(message);
		}
		return rv;
	}

	/**
	 * Sets marginal probability items to zero and refreshes the tree.
	 */
	public void clearMarginals() {
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				for ( VariableNode vn : nodes ) {
					for ( VariableNodeState vns : vn.states ) {
						vns.setMarginal(0.0);
						view.getTreeViewer().refresh(vns);
					}
				}
			}
		});
	}

	/**
	 * Sets the marginal values in the model by copying them from the inference engine.
	 * @param engine inference engine source after calculations complete
	 */
	public void setMarginals(final InferenceEngine engine) {
		if ( engine == null ) {
			System.err.println("inference engine null for marginals calculation");
			return;
		}
		Display.getDefault().asyncExec(new Runnable(){
			public void run() {
				try { 
					for ( VariableNode vn : nodes ) {
						int index = 0;
						Table table = engine.conditional( vn.getNode() );
						if ( table == null ) {
							System.err.println("table null for variable " + vn.getNode() );
							continue;
						}
						for ( VariableNodeState vns : vn.states ) {
							double m = table.getCP(index);
							vns.setMarginal(m);
							view.getTreeViewer().refresh(vns);
							index++;
						}
					}
				} catch( NullPointerException npe) {
					CertWareLog.logWarning("Computation of marginal probabilities not available");
				}
			}
		});

	}

}
