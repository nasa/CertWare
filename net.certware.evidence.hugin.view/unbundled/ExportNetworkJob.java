package net.certware.evidence.hugin.view.jobs;

import java.util.List;

import net.certware.core.ui.CertWareUI;
import net.certware.core.ui.log.CertWareLog;
import net.certware.export.excel.WriteExcel;

import org.apache.poi.ss.util.CellRangeAddress;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.io.hugin.HuginNode;

/**
 * A job to write network data to an Excel workbook.
 * Commits the workbook to a file system file when complete.
 * @author mrb
 * @since 1.2.1
 */
public class ExportNetworkJob extends Job
{
	/** bail-out message */
	private final static String CANCEL_MSG = "Canceled export before completion";
	/** an excel workbook to write to */
	private final WriteExcel excel;
	/** network model */
	private final BeliefNetwork network;
	/** variable ID column */
	protected static final int COLUMN_ID = 0;
	/** variable label column */
	protected static final int COLUMN_LABEL = 1;
	/** variable type column */
	protected static final int COLUMN_VALUE_TYPE = 2;

	/**
	 * Constructor saves the workbook and network model data.
	 * Excel workbook should already have destination file name set.
	 * @param jobName export job name for reporting
	 * @param excel Excel processing utility
	 * @param bn belief network to export
	 */
	public ExportNetworkJob(String jobName, WriteExcel excel, BeliefNetwork bn) {
		super(jobName);
		this.excel = excel;
		this.network = bn;
	}

	/**
	 * Job family membership.
	 * @param family family ID, test against core CodeHawk ID    
	 * @return true if ID matches, otherwise returns value from superclass  
	 */
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
			if ( network == null ) {
				cancel();
				CertWareLog.logWarning("Network not defined during export");
				return Status.CANCEL_STATUS;
			}

			// create the workbook
			String sheetName = "Hugin Belief Network";

			excel.setupWorkbook(sheetName);

			// row title and model description
			excel.writeCellHeader(0, sheetName);
			excel.addMerge(new CellRangeAddress(0, 0, 0, 2));
			excel.incrementAndCreateRow(2);

			// header // TODO any header to show?
			excel.writeCellHeader(0, "Checklist"); 
			//excel.writeCellString(1, network.getName());
			excel.incrementAndCreateRow(1);
			excel.writeCellHeader(0, "Version"); 
			//excel.writeCellString(1, network.getVersion());
			excel.incrementAndCreateRow(1);
			excel.writeCellHeader(0, "Comment"); 
			//excel.writeCellString(1, network.getComment());
			excel.incrementAndCreateRow(2);

			// data columns
			excel.writeCellHeader(COLUMN_ID, "ID");
			excel.writeCellHeader(COLUMN_LABEL, "Label");
			excel.writeCellHeader(COLUMN_VALUE_TYPE,"Value Type");
			excel.incrementAndCreateRow(1);

			// for each category, process its items
			List<HuginNode> items = network.topologicalOrder();
			for ( HuginNode item : items ) {

				// check for cancel
				if ( monitor.isCanceled() ) {
					cancel();
					CertWareLog.logInfo(CANCEL_MSG);
					return Status.CANCEL_STATUS;
				}

				excel.writeCellString(COLUMN_ID, item.getID() );
				excel.writeCellString(COLUMN_LABEL, item.getLabel() );
				excel.writeCellString(COLUMN_VALUE_TYPE, getText(item));
				// excel.writeCellInt(COLUMN_VALUE_TYPE, item.getValueType() );

				excel.incrementAndCreateRow(1);

				monitor.worked(1);
			}

			excel.writeToFile(null);

		} catch( Exception e ) {
			CertWareLog.logError(String.format("%s %s","Export to",excel.getDestinationFile()), e);
		}

		String doneMessage = String.format("%s %s %s","Export of data to", excel.getDestinationFile(), "complete.");
		CertWareLog.logInfo( doneMessage );
		return Status.OK_STATUS;
	}

	/**
	 * Translate the item's type code to text.
	 * @param element expecting a VariableNode
	 * @return text version, or code value as string
	 */
	private String getText(HuginNode hn) {
		int type = hn.getValueType();
		switch( type ) {
			case HuginNode.DISCRETE: return "Discrete";
			case HuginNode.CONTINUOUS: return "Continuous";
			case HuginNode.DECISION: return "Decision";
			case HuginNode.UTILITY: return "Utility";
			default: return Integer.toString(type);
		}
	}

	/**
	 * Runs the generator job, reporting to the given progress monitor.
	 * @param monitor progress monitor
	 * @return CANCEL or OK status 
	 */
	protected IStatus run(IProgressMonitor monitor) {

		int count = 1;
		if ( network != null )
			count = network.topologicalOrder().size();

		monitor.beginTask("Exporting", count);
		IStatus rv = produce(monitor);

		if ( rv == Status.OK_STATUS )
			monitor.done();

		return rv;
	}

}
