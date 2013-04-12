package net.certware.evidence.hugin.view.testers;

import net.certware.evidence.hugin.view.ViewTree;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/**
 * Property tester for view content dirty.
 * @author mrb
 * @since 1.2.1
 */
public class DirtyTester extends PropertyTester
{

  /**
   * Constructor empty.
   */
  public DirtyTester() {
  }

  /**
   * Tests whether the model is dirty.
   * Use <code>isDirty</code> appended as property to extension name space for test.
   * @param receiver unused
   * @param property test string "isDirty" or "isNotDirty"
   * @param args unused
   * @param expectedValue unused
   * @return boolean true if view active condition matches test property 
   * @see org.eclipse.core.expressions.IPropertyTester#test(Object, String, Object[], Object)  
   */
  public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
  {
    boolean dirty = false;
    IWorkbenchPart wp; 
    
    try {
      // some can be null during launch
      wp = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
      if ( ! (wp instanceof ViewTree) )
        return false;
    } catch( Exception e ) { // $codepro.audit.disable logExceptions
      return false;
    }
    
    try {
      ViewTree viewList = (ViewTree)wp;
      dirty = viewList.isDirty();
    } catch( Exception e ) {
      System.err.println(String.format("%s %s", "view list dirty tester", e.getMessage())); //$NON-NLS-1$
    }
    
    if ( "isDirty".equals(property) ) //$NON-NLS-1$
      return dirty;
    
    if ( "isNotDirty".equals(property)) //$NON-NLS-1$
      return !dirty;

    return false;
  }

}
