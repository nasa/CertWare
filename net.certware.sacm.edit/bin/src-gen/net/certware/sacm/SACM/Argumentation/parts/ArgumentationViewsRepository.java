// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.Argumentation.parts;

/**
 * @author Kestrel Technology LLC
 * 
 */
public class ArgumentationViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Argumentation view descriptor
	 * 
	 */
	public static class Argumentation_ {
		public static class Properties {
	
			
			public static String id = "Argumentation::Argumentation_::properties::id";
			
			
			public static String description = "Argumentation::Argumentation_::properties::description";
			
			
			public static String content = "Argumentation::Argumentation_::properties::content";
			
			
			public static String argumentation__ = "Argumentation::Argumentation_::properties::argumentation__";
			
			
			public static String argumentElement = "Argumentation::Argumentation_::properties::argumentElement";
			
	
		}
	
	}

	/**
	 * CitationElement view descriptor
	 * 
	 */
	public static class CitationElement {
		public static class Properties {
	
			
			public static String id = "Argumentation::CitationElement::properties::id";
			
			
			public static String description = "Argumentation::CitationElement::properties::description";
			
			
			public static String content = "Argumentation::CitationElement::properties::content";
			
			
			public static String argumentElementReference = "Argumentation::CitationElement::properties::argumentElementReference";
			
			
			public static String argumentationReference = "Argumentation::CitationElement::properties::argumentationReference";
			
	
		}
	
	}

	/**
	 * InformationElement view descriptor
	 * 
	 */
	public static class InformationElement {
		public static class Properties {
	
			
			public static String id = "Argumentation::InformationElement::properties::id";
			
			
			public static String description = "Argumentation::InformationElement::properties::description";
			
			
			public static String content = "Argumentation::InformationElement::properties::content";
			
			
			public static String evidence = "Argumentation::InformationElement::properties::evidence";
			
			
			public static String url = "Argumentation::InformationElement::properties::url";
			
	
		}
	
	}

	/**
	 * ArgumentReasoning view descriptor
	 * 
	 */
	public static class ArgumentReasoning {
		public static class Properties {
	
			
			public static String id = "Argumentation::ArgumentReasoning::properties::id";
			
			
			public static String description = "Argumentation::ArgumentReasoning::properties::description";
			
			
			public static String content = "Argumentation::ArgumentReasoning::properties::content";
			
			
			public static String structure = "Argumentation::ArgumentReasoning::properties::structure";
			
			
			public static String describedInference = "Argumentation::ArgumentReasoning::properties::describedInference";
			
			
			public static String describedChallenge = "Argumentation::ArgumentReasoning::properties::describedChallenge";
			
	
		}
	
	}

	/**
	 * Claim view descriptor
	 * 
	 */
	public static class Claim {
		public static class Properties {
	
			
			public static String id = "Argumentation::Claim::properties::id";
			
			
			public static String description = "Argumentation::Claim::properties::description";
			
			
			public static String content = "Argumentation::Claim::properties::content";
			
			
			public static String assumed = "Argumentation::Claim::properties::assumed";
			
			
			public static String toBeSupported = "Argumentation::Claim::properties::toBeSupported";
			
	
		}
	
	}

	/**
	 * AssertedInference view descriptor
	 * 
	 */
	public static class AssertedInference {
		public static class Properties {
	
			
			public static String id = "Argumentation::AssertedInference::properties::id";
			
			
			public static String description = "Argumentation::AssertedInference::properties::description";
			
			
			public static String content = "Argumentation::AssertedInference::properties::content";
			
			
			public static String source = "Argumentation::AssertedInference::properties::source";
			
			
			public static String target = "Argumentation::AssertedInference::properties::target";
			
	
		}
	
	}

	/**
	 * AssertedEvidence view descriptor
	 * 
	 */
	public static class AssertedEvidence {
		public static class Properties {
	
			
			public static String id = "Argumentation::AssertedEvidence::properties::id";
			
			
			public static String description = "Argumentation::AssertedEvidence::properties::description";
			
			
			public static String content = "Argumentation::AssertedEvidence::properties::content";
			
			
			public static String source = "Argumentation::AssertedEvidence::properties::source";
			
			
			public static String target = "Argumentation::AssertedEvidence::properties::target";
			
	
		}
	
	}

	/**
	 * AssertedContext view descriptor
	 * 
	 */
	public static class AssertedContext {
		public static class Properties {
	
			
			public static String id = "Argumentation::AssertedContext::properties::id";
			
			
			public static String description = "Argumentation::AssertedContext::properties::description";
			
			
			public static String content = "Argumentation::AssertedContext::properties::content";
			
			
			public static String source = "Argumentation::AssertedContext::properties::source";
			
			
			public static String target = "Argumentation::AssertedContext::properties::target";
			
	
		}
	
	}

	/**
	 * AssertedChallenge view descriptor
	 * 
	 */
	public static class AssertedChallenge {
		public static class Properties {
	
			
			public static String id = "Argumentation::AssertedChallenge::properties::id";
			
			
			public static String description = "Argumentation::AssertedChallenge::properties::description";
			
			
			public static String content = "Argumentation::AssertedChallenge::properties::content";
			
			
			public static String source = "Argumentation::AssertedChallenge::properties::source";
			
			
			public static String target = "Argumentation::AssertedChallenge::properties::target";
			
	
		}
	
	}

	/**
	 * AssertedCounterEvidence view descriptor
	 * 
	 */
	public static class AssertedCounterEvidence {
		public static class Properties {
	
			
			public static String id = "Argumentation::AssertedCounterEvidence::properties::id";
			
			
			public static String description = "Argumentation::AssertedCounterEvidence::properties::description";
			
			
			public static String content = "Argumentation::AssertedCounterEvidence::properties::content";
			
			
			public static String source = "Argumentation::AssertedCounterEvidence::properties::source";
			
			
			public static String target = "Argumentation::AssertedCounterEvidence::properties::target";
			
	
		}
	
	}

	/**
	 * Notes view descriptor
	 * 
	 */
	public static class Notes {
		public static class Properties {
	
			
			public static String taggedValue = "Argumentation::Notes::properties::taggedValue";
			
			
			public static String annotation = "Argumentation::Notes::properties::annotation";
			
	
		}
	
	}

}
