// Copyright (c) 2013 United States Government as represented by the National Aeronautics and Space Administration.  All rights reserved.
package net.certware.sacm.SACM.parts;

/**
 * @author Kestrel Technology LLC
 * 
 */
public class SACMViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Annotation view descriptor
	 * 
	 */
	public static class Annotation {
		public static class Properties {
	
			
			public static String content = "SACM::Annotation::properties::content";
			
	
		}
	
	}

	/**
	 * AssuranceCase view descriptor
	 * 
	 */
	public static class AssuranceCase {
		public static class Properties {
	
			
			public static String id = "SACM::AssuranceCase::properties::id";
			
			
			public static String name = "SACM::AssuranceCase::properties::name";
			
			
			public static String gid = "SACM::AssuranceCase::properties::gid";
			
			
			public static String argument = "SACM::AssuranceCase::properties::argument";
			
			
			public static String evidence = "SACM::AssuranceCase::properties::evidence";
			
	
		}
	
	}

	/**
	 * Datetime view descriptor
	 * 
	 */
	public static class Datetime {
		public static class Properties {
	
			
			public static String datetime_ = "SACM::Datetime::properties::datetime_";
			
	
		}
	
	}

	/**
	 * TaggedValue view descriptor
	 * 
	 */
	public static class TaggedValue {
		public static class Properties {
	
			
			public static String key = "SACM::TaggedValue::properties::key";
			
			
			public static String value = "SACM::TaggedValue::properties::value";
			
	
		}
	
	}

	/**
	 * Notes view descriptor
	 * 
	 */
	public static class Notes {
		public static class Properties {
	
			
			public static String taggedValue = "SACM::Notes::properties::taggedValue";
			
			
			public static String annotation = "SACM::Notes::properties::annotation";
			
	
		}
	
	}

}
