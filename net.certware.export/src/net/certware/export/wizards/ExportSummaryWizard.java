/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
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
	/** wizard banner name */
	protected static final String BANNER = "icons/wizban/docx.png";
	/** export job name */
	protected static final String JOB_NAME = "Export Summary";
	/** export wizard page name */
	protected static final String PAGE_NAME = "Export CertWare Case to Word Document";
	/** summary page reference */
	protected ExportSummaryPage rep;
  
	/**
	 * Perform the finish button response.
	 * @return defers return value to summary page finish method 
	 * * @see org.eclipse.jface.wizard.IWizard#performFinish() 
	 * * @see org.eclipse.jface.wizard.IWizard#performFinish() 
	 * * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
  public boolean performFinish()
  {
    return rep.finish();
  }

  /**
   * Initializes the wizard.  Creates the wizard page and adds it to the wizard.
   * @param selection selection related to export request
   * @param workbench IWorkbench
   * @see org.eclipse.ui.IWorkbenchWizard#init(IWorkbench, IStructuredSelection) 
   */
  public void init(IWorkbench workbench, IStructuredSelection selection)
  {
    rep = new ExportSummaryPage(PAGE_NAME, selection);
    rep.setDescription(Messages.ExportSummaryWizard_3);
    rep.setImageDescriptor(Activator.getImageDescriptor(BANNER));
    addPage(rep);
    
    setWindowTitle(JOB_NAME);
  }

}
