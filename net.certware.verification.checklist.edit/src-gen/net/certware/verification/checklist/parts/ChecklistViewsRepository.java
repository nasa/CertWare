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
		
		public static String name = "checklist::Category::name";
		
		
		public static String items = "checklist::Category::items";
		
		
		public static String comment = "checklist::Category::comment";
		
	
	}

	/**
	 * Item view descriptor
	 * 
	 */
	public static class Item {
		
		public static String identifier = "checklist::Item::identifier";
		
		
		public static String description = "checklist::Item::description";
		
		
		public static String reference = "checklist::Item::reference";
		
		
		public static String result = "checklist::Item::result";
		
		
		public static String comment = "checklist::Item::comment";
		
	
	}

	/**
	 * Checklist view descriptor
	 * 
	 */
	public static class Checklist {
		
		public static String name = "checklist::Checklist::name";
		
		
		public static String version = "checklist::Checklist::version";
		
		
		public static String categories = "checklist::Checklist::categories";
		
		
		public static String comment = "checklist::Checklist::comment";
		
	
	}

}
