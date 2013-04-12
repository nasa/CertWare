package net.certware.verification.checklist.view.testers;

import net.certware.verification.checklist.view.ViewList;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/**
 * Property tester for view content load.
 * @author mrb
 * @since 1.2.1
 */
public class LoadedTester extends PropertyTester
{

  /**
   * Constructor empty.
   */
  public LoadedTester() {
  }

  /**
   * Tests whether the view has been loaded with model content.
   * Use <code>isLoaded</code> appended as property to extension name space for test.
   * @param receiver unused
   * @param property test string "isLoaded" or "isNotLoaded"
   * @param args unused
   * @param expectedValue unused
   * @return boolean true if view active condition matches test property 
   * @see org.eclipse.core.expressions.IPropertyTester#test(Object, String, Object[], Object)  
   */
  public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
  {
    boolean loaded = false;
    IWorkbenchPart wp; 
    
    try {
      // some can be null during launch
      wp = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
      if ( ! (wp instanceof ViewList) )
        return false;
    } catch( Exception e ) { // $codepro.audit.disable logExceptions
      return false;
    }
    
    try {
      ViewList viewList = (ViewList)wp;
      loaded = viewList.getSelectedChecklist() != null;
    } catch( Exception e ) {
      System.err.println(String.format("%s %s", "View list loaded tester",e.getMessage())); //$NON-NLS-1$
    }
    
    if ( "isLoaded".equals(property) ) //$NON-NLS-1$
      return loaded;
    
    if ( "isNotLoaded".equals(property)) //$NON-NLS-1$
      return !loaded;

    return false;
  }

}
