package net.certware.verification.checklist.view.jobs;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.log.CertWareLog;
import net.certware.export.excel.WriteExcel;
import net.certware.verification.checklist.Category;
import net.certware.verification.checklist.Checklist;
import net.certware.verification.checklist.Choices;
import net.certware.verification.checklist.Item;

import org.apache.poi.ss.util.CellRangeAddress;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;

/**
 * A job to checklist data to an Excel workbook.
 * Commits the workbook to a file system file when complete.
 * @author mrb
 * @since 1.2.1
 */
public class ExportChecklistJob extends Job
{
    /** 
     * Bail-out message 
     */
    private final static String CANCEL_MSG = "Canceled export before completion";
    /** an excel workbook to write to */
    private final WriteExcel excel;
    /** checklist model */
    private final Checklist checklist;
    
    protected static final int COLUMN_CATEGORY = 0;
    protected static final int COLUMN_ID = 1;
    protected static final int COLUMN_DESC = 2;
    protected static final int COLUMN_REF = 3;
    protected static final int COLUMN_COMMENT = 4;
    protected static final int COLUMN_RESULT = 5;
    
    /**
     * Constructor saves the workbook and value tool data.
     * Excel workbook should already have destination file name set.
     * @param jobName export job name for reporting
     * @param excel Excel processing utility
     * @param bor results file to export
     */
    public ExportChecklistJob(String jobName, WriteExcel excel, Checklist c) {
        super(jobName);
        this.excel = excel;
        this.checklist = c;
    }

    /**
     * Job family membership.
     * @param family family ID, test against core CodeHawk ID    
    
     * @return true if ID matches, otherwise returns value from superclass  */
    public boolean belongsTo(final Object family) {
      if (family.equals(CertWareUI.PLUGIN_ID)) {
       return true;
      }
      return super.belongsTo(family);
     }

    /**
     * Production method for translating results to Excel.
     * @param monitor progress monitor    
     * @return CANCEL or OK  
     */
    public IStatus produce(IProgressMonitor monitor) {
      try {
    	  if ( checklist == null ) {
    		  cancel();
    		  CertWareLog.logWarning("Checklist not defined during export");
    		  return Status.CANCEL_STATUS;
    	  }
    	  
        // create the workbook
        String sheetName = "CertWare Checklist";

        excel.setupWorkbook(sheetName);

        // row title and model description
        excel.writeCellHeader(0, sheetName);
        excel.addMerge(new CellRangeAddress(0, 0, 0, 2));
        excel.incrementAndCreateRow(2);

        // header
        excel.writeCellHeader(0, "Checklist"); 
        excel.writeCellString(1, checklist.getName());
        excel.incrementAndCreateRow(1);
        excel.writeCellHeader(0, "Version"); 
        excel.writeCellString(1, checklist.getVersion());
        excel.incrementAndCreateRow(1);
        excel.writeCellHeader(0, "Comment"); 
        excel.writeCellString(1, checklist.getComment());
        excel.incrementAndCreateRow(2);

        // categories
        EList<Category> categories = checklist.getCategories();
        if ( categories.isEmpty() ) { 
          cancel();
          CertWareLog.logWarning("Checklist categories empty during export.");
          return Status.CANCEL_STATUS;
        }

        excel.writeCellHeader(COLUMN_CATEGORY, "Category");
        excel.writeCellHeader(COLUMN_ID, "ID");
        excel.writeCellHeader(COLUMN_DESC, "Description");
        excel.writeCellHeader(COLUMN_REF, "Reference");
        excel.writeCellHeader(COLUMN_COMMENT,"Comment");
        excel.writeCellHeader(COLUMN_RESULT,"Result");
        
        excel.incrementAndCreateRow(1);

        // for each category, process its items
        for ( Category category : categories ) {

        	// check for cancel
          if ( monitor.isCanceled() ) {
            cancel();
            CertWareLog.logInfo(CANCEL_MSG);
            return Status.CANCEL_STATUS;
          }

          // extract record field values
          // unnecessary but clean
          excel.writeCellString(COLUMN_CATEGORY,category.getName());
          
          // for each item in the category
          for ( Item item : category.getItems()) {
        	  
            excel.writeCellString(COLUMN_ID, item.getIdentifier() );
            excel.writeCellString(COLUMN_DESC, item.getDescription() );
            excel.writeCellString(COLUMN_REF, item.getReference() );
            excel.writeCellString(COLUMN_COMMENT, item.getComment() );

            Choices result = item.getResult();
            String value = "Not applicable";
            if ( result.getValue() == Choices.YES_VALUE )
            	value = "Yes";
            else if ( result.getValue() == Choices.NO_VALUE )
            	value = "No";
            else if ( result.getValue() == Choices.UNKNOWN_VALUE )
            	value = "Unknown";
            excel.writeCellString(COLUMN_RESULT,value);
            
            excel.incrementAndCreateRow(1);
          } // item
          
          // skip line between categories
          excel.incrementAndCreateRow(1);
          monitor.worked(1);
        } // category

        excel.writeToFile(null);
        
      } catch( Exception e ) {
        CertWareLog.logError(String.format("%s %s","Export to",excel.getDestinationFile()), e);
      }

      String doneMessage = String.format("%s %s %s","Export of data to", excel.getDestinationFile(), "complete.");
      CertWareLog.logInfo( doneMessage );
      return Status.OK_STATUS;
    }
    
    
    /**
     * Runs the generator job, reporting to the given progress monitor.
     * @param monitor progress monitor
     * @return CANCEL or OK status 
     */
    protected IStatus run(IProgressMonitor monitor) {

    	int count = 1;
    	if ( checklist != null )
    		count = checklist.getCategories().size();
    	
        monitor.beginTask("Exporting", count);
        IStatus rv = produce(monitor);
        
        if ( rv == Status.OK_STATUS )
          monitor.done();
        
        return rv;
    }

}
