package net.certware.export.wizards;

import net.certware.export.Activator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

/**
 * An export wizard to translate case XML files in the workspace into Doc files in the file system.
 * @author mrb
 */
public class ExportSummaryWizard extends Wizard implements IExportWizard
{
	protected static final String BANNER = "icons/wizban/docx.png";
  /** export job name */
  protected static final String JOB_NAME = "Export Summary";
  protected static final String PAGE_NAME = "Export CertWare Case to Word Document";
  protected ExportSummaryPage rep;
  

  public boolean performFinish()
  {
    return rep.finish();
  }


  public void init(IWorkbench workbench, IStructuredSelection selection)
  {
    rep = new ExportSummaryPage(PAGE_NAME, selection);
    rep.setDescription("Select a destination folder.  CertWare will export the case content to a Word document.");
    rep.setImageDescriptor(Activator.getImageDescriptor(BANNER));
    addPage(rep);
    
    setWindowTitle(JOB_NAME);
  }

}
