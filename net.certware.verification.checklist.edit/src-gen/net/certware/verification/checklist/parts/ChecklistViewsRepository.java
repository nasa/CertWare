/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.parts;

/**
 * 
 * 
 */
public class ChecklistViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Category view descriptor
	 * 
	 */
	public static class Category {
		public static class Properties {
	
			
			public static String name = "checklist::Category::properties::name";
			
			
			public static String items = "checklist::Category::properties::items";
			
			
			public static String comment = "checklist::Category::properties::comment";
			
	
		}
	
	}

	/**
	 * Item view descriptor
	 * 
	 */
	public static class Item {
		public static class Properties {
	
			
			public static String identifier = "checklist::Item::properties::identifier";
			
			
			public static String description = "checklist::Item::properties::description";
			
			
			public static String reference = "checklist::Item::properties::reference";
			
			
			public static String result = "checklist::Item::properties::result";
			
			
			public static String comment = "checklist::Item::properties::comment";
			
	
		}
	
	}

	/**
	 * Checklist view descriptor
	 * 
	 */
	public static class Checklist_ {
		public static class Properties {
	
			
			public static String name = "checklist::Checklist_::properties::name";
			
			
			public static String version = "checklist::Checklist_::properties::version";
			
			
			public static String categories = "checklist::Checklist_::properties::categories";
			
			
			public static String comment = "checklist::Checklist_::properties::comment";
			
	
		}
	
	}

}
