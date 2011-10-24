/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */
package net.certware.argument.cae.parts;

/**
 * 
 * 
 */
public class CaeViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Claim view descriptor
	 * 
	 */
	public static class Claim {
		
		public static String identifier = "cae::Claim::identifier";
		
		
		public static String description = "cae::Claim::description";
		
		
		public static String content = "cae::Claim::content";
		
		
		public static String isTagged = "cae::Claim::isTagged";
		
		
		public static String assumed = "cae::Claim::assumed";
		
		
		public static String toBeSupported = "cae::Claim::toBeSupported";
		
		
		public static String strategy = "cae::Claim::strategy";
		
		
		public static String assumption = "cae::Claim::assumption";
		
		
		public static String context = "cae::Claim::context";
		
		
		public static String solution = "cae::Claim::solution";
		
	
	}

	/**
	 * Argument view descriptor
	 * 
	 */
	public static class Argument {
		
		public static String identifier = "cae::Argument::identifier";
		
		
		public static String description = "cae::Argument::description";
		
		
		public static String content = "cae::Argument::content";
		
		
		public static String isTagged = "cae::Argument::isTagged";
		
		
		public static String justification = "cae::Argument::justification";
		
		
		public static String evidence = "cae::Argument::evidence";
		
		
		public static String claims = "cae::Argument::claims";
		
	
	}

	/**
	 * Evidence view descriptor
	 * 
	 */
	public static class Evidence {
		
		public static String identifier = "cae::Evidence::identifier";
		
		
		public static String description = "cae::Evidence::description";
		
		
		public static String content = "cae::Evidence::content";
		
		
		public static String isTagged = "cae::Evidence::isTagged";
		
		
		public static String target = "cae::Evidence::target";
		
		
		public static String source = "cae::Evidence::source";
		
		
		public static String context = "cae::Evidence::context";
		
		
		public static String evidence = "cae::Evidence::evidence";
		
	
	}

	/**
	 * Assumption view descriptor
	 * 
	 */
	public static class Assumption {
		
		public static String identifier = "cae::Assumption::identifier";
		
		
		public static String description = "cae::Assumption::description";
		
		
		public static String content = "cae::Assumption::content";
		
		
		public static String isTagged = "cae::Assumption::isTagged";
		
	
	}

	/**
	 * Context view descriptor
	 * 
	 */
	public static class Context {
		
		public static String identifier = "cae::Context::identifier";
		
		
		public static String description = "cae::Context::description";
		
		
		public static String content = "cae::Context::content";
		
		
		public static String isTagged = "cae::Context::isTagged";
		
	
	}

	/**
	 * Justification view descriptor
	 * 
	 */
	public static class Justification {
		
		public static String identifier = "cae::Justification::identifier";
		
		
		public static String description = "cae::Justification::description";
		
		
		public static String content = "cae::Justification::content";
		
		
		public static String isTagged = "cae::Justification::isTagged";
		
	
	}

}
