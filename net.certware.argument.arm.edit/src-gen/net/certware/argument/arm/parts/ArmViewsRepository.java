/*
 * Copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */
package net.certware.argument.arm.parts;

/**
 * @author
 * 
 */
public class ArmViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * TaggedValue view descriptor
	 * 
	 */
	public static class TaggedValue {
		
		public static String key = "arm::TaggedValue::key";
		
		
		public static String value = "arm::TaggedValue::value";
		
	
	}

	/**
	 * Argument view descriptor
	 * 
	 */
	public static class Argument {
		
		public static String identifier = "arm::Argument::identifier";
		
		
		public static String description = "arm::Argument::description";
		
		
		public static String content = "arm::Argument::content";
		
		
		public static String isTagged = "arm::Argument::isTagged";
		
		
		public static String containsArgumentElement = "arm::Argument::containsArgumentElement";
		
		
		public static String containsArgumentLink = "arm::Argument::containsArgumentLink";
		
		
		public static String containsArgument = "arm::Argument::containsArgument";
		
	
	}

	/**
	 * Annotation view descriptor
	 * 
	 */
	public static class Annotation {
		
		public static String identifier = "arm::Annotation::identifier";
		
		
		public static String description = "arm::Annotation::description";
		
		
		public static String content = "arm::Annotation::content";
		
		
		public static String isTagged = "arm::Annotation::isTagged";
		
		
		public static String target = "arm::Annotation::target";
		
		
		public static String source = "arm::Annotation::source";
		
	
	}

	/**
	 * AssertedInference view descriptor
	 * 
	 */
	public static class AssertedInference {
		
		public static String identifier = "arm::AssertedInference::identifier";
		
		
		public static String description = "arm::AssertedInference::description";
		
		
		public static String content = "arm::AssertedInference::content";
		
		
		public static String isTagged = "arm::AssertedInference::isTagged";
		
		
		public static String target = "arm::AssertedInference::target";
		
		
		public static String source = "arm::AssertedInference::source";
		
	
	}

	/**
	 * AssertedEvidence view descriptor
	 * 
	 */
	public static class AssertedEvidence {
		
		public static String identifier = "arm::AssertedEvidence::identifier";
		
		
		public static String description = "arm::AssertedEvidence::description";
		
		
		public static String content = "arm::AssertedEvidence::content";
		
		
		public static String isTagged = "arm::AssertedEvidence::isTagged";
		
		
		public static String target = "arm::AssertedEvidence::target";
		
		
		public static String source = "arm::AssertedEvidence::source";
		
	
	}

	/**
	 * AssertedContext view descriptor
	 * 
	 */
	public static class AssertedContext {
		
		public static String identifier = "arm::AssertedContext::identifier";
		
		
		public static String description = "arm::AssertedContext::description";
		
		
		public static String content = "arm::AssertedContext::content";
		
		
		public static String isTagged = "arm::AssertedContext::isTagged";
		
		
		public static String target = "arm::AssertedContext::target";
		
		
		public static String source = "arm::AssertedContext::source";
		
	
	}

	/**
	 * AssertedCounterEvidence view descriptor
	 * 
	 */
	public static class AssertedCounterEvidence {
		
		public static String identifier = "arm::AssertedCounterEvidence::identifier";
		
		
		public static String description = "arm::AssertedCounterEvidence::description";
		
		
		public static String content = "arm::AssertedCounterEvidence::content";
		
		
		public static String isTagged = "arm::AssertedCounterEvidence::isTagged";
		
		
		public static String target = "arm::AssertedCounterEvidence::target";
		
		
		public static String source = "arm::AssertedCounterEvidence::source";
		
	
	}

	/**
	 * AssertedChallenge view descriptor
	 * 
	 */
	public static class AssertedChallenge {
		
		public static String identifier = "arm::AssertedChallenge::identifier";
		
		
		public static String description = "arm::AssertedChallenge::description";
		
		
		public static String content = "arm::AssertedChallenge::content";
		
		
		public static String isTagged = "arm::AssertedChallenge::isTagged";
		
		
		public static String target = "arm::AssertedChallenge::target";
		
		
		public static String source = "arm::AssertedChallenge::source";
		
	
	}

	/**
	 * Claim view descriptor
	 * 
	 */
	public static class Claim {
		
		public static String identifier = "arm::Claim::identifier";
		
		
		public static String description = "arm::Claim::description";
		
		
		public static String content = "arm::Claim::content";
		
		
		public static String isTagged = "arm::Claim::isTagged";
		
		
		public static String assumed = "arm::Claim::assumed";
		
		
		public static String toBeSupported = "arm::Claim::toBeSupported";
		
	
	}

	/**
	 * EvidenceAssertion view descriptor
	 * 
	 */
	public static class EvidenceAssertion {
		
		public static String identifier = "arm::EvidenceAssertion::identifier";
		
		
		public static String description = "arm::EvidenceAssertion::description";
		
		
		public static String content = "arm::EvidenceAssertion::content";
		
		
		public static String isTagged = "arm::EvidenceAssertion::isTagged";
		
		
		public static String assumed = "arm::EvidenceAssertion::assumed";
		
		
		public static String toBeSupported = "arm::EvidenceAssertion::toBeSupported";
		
	
	}

	/**
	 * InformationElement view descriptor
	 * 
	 */
	public static class InformationElement {
		
		public static String identifier = "arm::InformationElement::identifier";
		
		
		public static String description = "arm::InformationElement::description";
		
		
		public static String content = "arm::InformationElement::content";
		
		
		public static String isTagged = "arm::InformationElement::isTagged";
		
	
	}

	/**
	 * ArgumentReasoning view descriptor
	 * 
	 */
	public static class ArgumentReasoning {
		
		public static String identifier = "arm::ArgumentReasoning::identifier";
		
		
		public static String description = "arm::ArgumentReasoning::description";
		
		
		public static String content = "arm::ArgumentReasoning::content";
		
		
		public static String isTagged = "arm::ArgumentReasoning::isTagged";
		
		
		public static String describes = "arm::ArgumentReasoning::describes";
		
		
		public static String hasStructure = "arm::ArgumentReasoning::hasStructure";
		
	
	}

	/**
	 * CitationElement view descriptor
	 * 
	 */
	public static class CitationElement {
		
		public static String identifier = "arm::CitationElement::identifier";
		
		
		public static String description = "arm::CitationElement::description";
		
		
		public static String content = "arm::CitationElement::content";
		
		
		public static String isTagged = "arm::CitationElement::isTagged";
		
		
		public static String refersToArgumentElement = "arm::CitationElement::refersToArgumentElement";
		
		
		public static String refersToArgument = "arm::CitationElement::refersToArgument";
		
	
	}

}
