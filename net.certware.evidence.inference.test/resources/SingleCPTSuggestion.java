package edu.ucla.belief.sensitivity;

import edu.ucla.belief.*;
import edu.ucla.util.*;
import java.util.*;

public class SingleCPTSuggestion extends SensitivityTable implements
SensitivitySuggestion {

	protected double dist;

	public SingleCPTSuggestion(CPTShell shell, Interval[] intervals,
			boolean[] excludeArray, double dist) {
		super(shell, intervals, excludeArray);
		this.dist = dist;
	}

	public void adoptChange() {
		Table cpt = shell.getCPT();
		double[] thetas = cpt.dataclone();
		for (int i = 0; i < intervals.length; i++)
			cpt.setCP(i, thetas[i] +
					intervals[i].getLowerBound());
	}

	public Comparable getObject() {
		return shell.getVariable();
	}

	public Object getCurrentValue() {
		return shell;
	}

	public Object getSuggestedValue() {
		return intervals;
	}

	public double getAbsoluteChange() {
		return 0.0;
	}

	public double getLogOddsChange() {
		return dist;
	}

	public FiniteVariable getVariable(){
		return shell.getVariable();
	}
}
