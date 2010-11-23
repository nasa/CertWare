/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts;

/**
 * 
 * 
 */
public class GsnViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Goal view descriptor
	 * 
	 */
	public static class Goal {
		
		public static String identifier = "gsn::Goal::identifier";
		
		
		public static String description = "gsn::Goal::description";
		
		
		public static String content = "gsn::Goal::content";
		
		
		public static String isTagged = "gsn::Goal::isTagged";
		
		
		public static String assumed = "gsn::Goal::assumed";
		
		
		public static String toBeSupported = "gsn::Goal::toBeSupported";
		
		
		public static String subGoals = "gsn::Goal::subGoals";
		
		
		public static String strategies = "gsn::Goal::strategies";
		
		
		public static String goalContexts = "gsn::Goal::goalContexts";
		
		
		public static String assumptions = "gsn::Goal::assumptions";
		
		
		public static String goalSolutions = "gsn::Goal::goalSolutions";
		
	
	}

	/**
	 * Strategy view descriptor
	 * 
	 */
	public static class Strategy {
		
		public static String identifier = "gsn::Strategy::identifier";
		
		
		public static String description = "gsn::Strategy::description";
		
		
		public static String content = "gsn::Strategy::content";
		
		
		public static String isTagged = "gsn::Strategy::isTagged";
		
		
		public static String goals = "gsn::Strategy::goals";
		
		
		public static String justifications = "gsn::Strategy::justifications";
		
		
		public static String strategyContexts = "gsn::Strategy::strategyContexts";
		
		
		public static String strategySolutions = "gsn::Strategy::strategySolutions";
		
	
	}

	/**
	 * Justification view descriptor
	 * 
	 */
	public static class Justification {
		
		public static String identifier = "gsn::Justification::identifier";
		
		
		public static String description = "gsn::Justification::description";
		
		
		public static String content = "gsn::Justification::content";
		
		
		public static String isTagged = "gsn::Justification::isTagged";
		
	
	}

	/**
	 * Context view descriptor
	 * 
	 */
	public static class Context {
		
		public static String identifier = "gsn::Context::identifier";
		
		
		public static String description = "gsn::Context::description";
		
		
		public static String content = "gsn::Context::content";
		
		
		public static String isTagged = "gsn::Context::isTagged";
		
	
	}

	/**
	 * Assumption view descriptor
	 * 
	 */
	public static class Assumption {
		
		public static String identifier = "gsn::Assumption::identifier";
		
		
		public static String description = "gsn::Assumption::description";
		
		
		public static String content = "gsn::Assumption::content";
		
		
		public static String isTagged = "gsn::Assumption::isTagged";
		
	
	}

	/**
	 * Solution view descriptor
	 * 
	 */
	public static class Solution {
		
		public static String identifier = "gsn::Solution::identifier";
		
		
		public static String description = "gsn::Solution::description";
		
		
		public static String content = "gsn::Solution::content";
		
		
		public static String isTagged = "gsn::Solution::isTagged";
		
		
		public static String target = "gsn::Solution::target";
		
		
		public static String source = "gsn::Solution::source";
		
		
		public static String solutionEvidence = "gsn::Solution::solutionEvidence";
		
		
		public static String solutionContexts = "gsn::Solution::solutionContexts";
		
	
	}

	/**
	 * Evidence view descriptor
	 * 
	 */
	public static class Evidence {
		
		public static String identifier = "gsn::Evidence::identifier";
		
		
		public static String description = "gsn::Evidence::description";
		
		
		public static String content = "gsn::Evidence::content";
		
		
		public static String isTagged = "gsn::Evidence::isTagged";
		
		
		public static String target = "gsn::Evidence::target";
		
		
		public static String source = "gsn::Evidence::source";
		
	
	}

}
