package edu.ucla.belief.sensitivity;

import edu.ucla.belief.*;
import edu.ucla.util.*;
import java.util.*;

public class SensitivityTable {
	protected CPTShell shell;
	protected Interval[] intervals;
	protected boolean[] excludeArray;

	public SensitivityTable(CPTShell shell, Interval[] intervals,
			boolean[] excludeArray) {
		this.shell = shell;
		this.intervals = intervals;
		this.excludeArray = (boolean[])excludeArray.clone();
	}

	public double getProb(int index) {
		if (shell instanceof NoisyOrShell)
			return ((NoisyOrShell)shell).weightsClone()[index];
		return shell.getCPT().getCP(index);
	}

	public CPTShell getCPTShell() {
		return shell;
	}

	public int size() {
		return intervals.length;
	}

	public Interval interval(int index) {
		return intervals[index];
	}

	public ProbabilityInterval[] probabilityIntervals() {
		ProbabilityInterval[] probIntervals = new
		ProbabilityInterval[intervals.length];
		for (int i = 0; i < intervals.length; i++)
			probIntervals[i] = probabilityInterval(i);
		return probIntervals;
	}

	public ProbabilityInterval probabilityInterval(int index)
	{
		Interval forIndex = intervals[index];
		if( forIndex == null )
		{
			return new ProbabilityInterval( 0.0, 1.0 );
		}
		else return new ProbabilityInterval( forIndex, getProb(index) );
	}

	public ProbabilityInterval[] correspondingChanges(int index)
	{
		if (shell instanceof NoisyOrShell) {
			ProbabilityInterval[] changes = new 
			ProbabilityInterval[2];
			if (index % 2 == 0) {
				changes[0] = probabilityInterval(index);
				changes[1] = probabilityInterval(index+1);
			}
			else {
				changes[0] = probabilityInterval(index-1);
				changes[1] = probabilityInterval(index);
			}
			return changes;
		}

		ProbabilityInterval interval = probabilityInterval(index);
		Interval forIndex = intervals[index];
		if( interval.isEmpty() || forIndex == null)
			return new ProbabilityInterval[0];

		Table cpt = shell.getCPT();
		List vars = cpt.variables();
		int varSize = ((FiniteVariable)vars.get(vars.size() - 1)).size();

		double sum = 0.0;
		int start = index / varSize * varSize;
		for (int i = start; i < start + varSize; i++)
			if (!excludeArray[i])
				sum += cpt.getCP(i);
		ProbabilityInterval[] changes = new
		ProbabilityInterval[varSize];
		for (int i = start; i < start + varSize; i++) {
			if (i == index) {
				changes[i - start] = interval;
				continue;
			}
			if (excludeArray[i]) {
				changes[i - start] = new
				ProbabilityInterval(cpt.getCP(i),
						cpt.getCP(i));
				continue;
			}
			double ratio, lb, ub;
			if (cpt.getCP(i) == 0.0 && cpt.getCP(index) == sum)
				ratio = 1 / varSize - 1;
			else
				ratio = cpt.getCP(i) / (cpt.getCP(index) - sum);

			if (ratio == 0.0 || ratio == -0.0)
				changes[i - start] = new
				ProbabilityInterval(0.0, 0.0);
			else {
				lb = ratio * forIndex.getUpperBound() +
				cpt.getCP(i);
				ub = ratio * forIndex.getLowerBound() +
				cpt.getCP(i);
				changes[i - start] = new
				ProbabilityInterval(lb, ub);
			}
		}
		return changes;
	}

	public void intersect(SensitivityTable table) {
		if (table == null)
			for (int i = 0; i < intervals.length; i++)
				intervals[i] = new Interval(1.0, 0.0);
		for (int i = 0; i < intervals.length; i++)
			intervals[i].intersect(table.intervals[i]);
	}

	/** Copied from Table.java */
	private static String stringHeader(List vars) {
		StringBuffer str = new StringBuffer(50);
		for( Iterator it = vars.iterator(); it.hasNext(); ) {
			str.append( ((FiniteVariable)it.next()).getID());
			str.append('\t');
		}
		str.append("Current value");
		str.append('\t');
		str.append("Suggested value");
		return str.toString();
	}

	/** Copied and slightly modified from Table.java */
	private static String stringInstance( List vars, int[] inds, 
			double theta, Interval interval ) {
		StringBuffer str = new StringBuffer(50);
		int counter = 0;
		for( Iterator it = vars.iterator(); it.hasNext(); ) {
			str.append(((FiniteVariable)it.next()).
					instance(inds[counter++]));
			str.append('\t');
		}
		str.append(theta);
		str.append('\t');
		str.append(interval);
		return str.toString();
	}

	/** Copied and slightly modified from Table.java */
	public String toString() {
		List vars = shell.variables();
		TableIndex.Iterator iter = shell.index().iterator();
		StringBuffer s = new StringBuffer(100);
		s.append(stringHeader(vars) + "\n");
		while (iter.hasNext()) {
			int index = iter.next();
			int[] inds = iter.current();
			s.append(stringInstance(vars, inds, 
					getProb(index),
					probabilityInterval(index)) + "\n");
		}
		return s.toString();
	}
}

